package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class translator_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.translator_utilities";
    public static final String myFingerPrint = "fd79add18a143ca3c3bb322fc1fe6f116d1056a215907dbd83707c078d392ce1";
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 763L)
    public static SubLSymbol $xref_database_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 22268L)
    private static SubLSymbol $td_methods_called_transitively$;
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 22458L)
    private static SubLSymbol $td_globals_called_transitively$;
    private static final SubLSymbol $kw0$NEW;
    private static final SubLSymbol $sym1$TD_TRANSLATION_MODULES_MEMOIZED;
    private static final SubLSymbol $sym2$TD_MODULE_TRANSLATION_POSITION;
    private static final SubLSymbol $sym3$TD_MODULE_EARLIER;
    private static final SubLSymbol $sym4$TD_MODULE_P;
    private static final SubLSymbol $sym5$SYMBOLP;
    private static final SubLSymbol $kw6$DYNAMIC;
    private static final SubLSymbol $kw7$SPECIAL;
    private static final SubLSymbol $kw8$UNSPECIFIED;
    private static final SubLString $str9$Checking__A_for_dependencies___;
    private static final SubLSymbol $sym10$STRING_LESSP;
    private static final SubLSymbol $sym11$SYMBOL_NAME;
    private static final SubLSymbol $sym12$TD_MODULE_LATER;
    private static final SubLSymbol $sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED;
    private static final SubLSymbol $kw14$UNSEEN;
    private static final SubLSymbol $sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED;
    private static final SubLSymbol $kw16$OR;
    private static final SubLSymbol $kw17$NOT;
    private static final SubLSymbol $kw18$AND;
    private static final SubLSymbol $sym19$NON_FEATURE_SYMBOL_P;
    private static final SubLSymbol $sym20$TRANSFORM_NON_FEATURE_SYMBOL;
    private static final SubLString $str21$Identifying_module_level_feature_;
    private static final SubLString $str22$cdolist;
    private static final SubLSymbol $kw23$METHOD;
    private static final SubLSymbol $kw24$GLOBAL;
    private static final SubLSymbol $kw25$MODULE;
    private static final SubLSymbol $sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLString $str29$__Top_level_form_in__A__;
    private static final SubLList $list30;
    private static final SubLString $str31$__Method__A_in__A__;
    private static final SubLString $str32$__Global__A_in__A__;
    private static final SubLString $str33$_references;
    private static final SubLList $list34;
    private static final SubLString $str35$__method__A_from__A__;
    private static final SubLString $str36$__global__A_from__A__;
    private static final SubLString $str37$__which_will_have_problems_when__;
    private static final SubLString $str38$assuming__A;
    private static final SubLString $str39$no_features;
    private static final SubLString $str40$Identifying_privacy_violations;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLString $str44$_references_private;
    private static final SubLList $list45;
    private static final SubLString $str46$Identifying_early_rebinding_viola;
    private static final SubLString $str47$_rebinds;
    private static final SubLString $str48$_before_it_is_defined__;
    private static final SubLString $str49$Identifying_early_reference_viola;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLString $str52$__Top_level_form_in__A_at__S__;
    private static final SubLString $str53$_before_it_is;
    private static final SubLString $str54$_defined__;
    private static final SubLString $str55$_completely_defined_due_to__;
    private static final SubLString $str56$method__A__;
    private static final SubLString $str57$global__A__;
    private static final SubLString $str58$Identifying_early_macro_use_viola;
    private static final SubLString $str59$Identifying_undefined_references;
    private static final SubLString $str60$_references_undefined;
    private static final SubLList $list61;
    private static final SubLString $str62$__method__A__;
    private static final SubLString $str63$__global__A__;
    private static final SubLList $list64;
    private static final SubLString $str65$__Method__A_has_multiple_definiti;
    private static final SubLString $str66$__Global__A_has_multiple_definiti;
    private static final SubLList $list67;
    private static final SubLString $str68$_____A_at_position__S;
    private static final SubLSymbol $sym69$READER_MAKE_CONSTANT_SHELL;
    private static final SubLList $list70;
    private static final SubLString $str71$references____before_it_is_comple;
    private static final SubLSymbol $kw72$API_MACRO_VISIBILITY;
    private static final SubLList $list73;
    private static final SubLString $str74$__API_macro__A_expands_to_non_API;
    private static final SubLSymbol $sym75$API_PREDEFINED_MACRO_P;
    private static final SubLString $str76$Determining_build_problems;
    private static final SubLSymbol $kw77$MULTIPLE_DEFINITIONS;
    private static final SubLSymbol $kw78$UNDEFINED_REFERENCES;
    private static final SubLSymbol $kw79$PRIVACY_VIOLATIONS;
    private static final SubLSymbol $kw80$EARLY_CONSTANT_REFERENCES;
    private static final SubLSymbol $kw81$EARLY_REFERENCE_VIOLATIONS;
    private static final SubLSymbol $kw82$EARLY_REBINDING_VIOLATIONS;
    private static final SubLString $str83$__No_build_problems_;
    private static final SubLList $list84;
    private static final SubLString $str85$Unknown_build_problem_class__S;
    private static final SubLSymbol $sym86$STRINGP;
    private static final SubLSymbol $sym87$_;
    private static final SubLSymbol $sym88$CDR;
    private static final SubLSymbol $kw89$UNINITIALIZED;
    private static final SubLString $str90$CLEAR;
    private static final SubLString $str91$REMOVE;
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1131L)
    public static SubLObject td_module_p(final SubLObject module) {
        return Types.stringp(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1197L)
    public static SubLObject td_current_translation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return system_translation.current_system_translation();
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1431L)
    public static SubLObject td_translation_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.current_xref_system_modules();
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1621L)
    public static SubLObject td_translation_modules_memoized_internal() {
        return td_translation_modules();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1621L)
    public static SubLObject td_translation_modules_memoized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL == v_memoization_state) {
            return td_translation_modules_memoized_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)translator_utilities.$sym1$TD_TRANSLATION_MODULES_MEMOIZED, (SubLObject)translator_utilities.UNPROVIDED);
        if (translator_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)translator_utilities.$sym1$TD_TRANSLATION_MODULES_MEMOIZED, (SubLObject)translator_utilities.ZERO_INTEGER, (SubLObject)translator_utilities.NIL, (SubLObject)translator_utilities.EQ, (SubLObject)translator_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)translator_utilities.$sym1$TD_TRANSLATION_MODULES_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)translator_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(td_translation_modules_memoized_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)translator_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 1723L)
    public static SubLObject td_module_earlier(final SubLObject earlier_module, final SubLObject later_module) {
        final SubLObject position1 = td_module_translation_position(earlier_module);
        final SubLObject position2 = td_module_translation_position(later_module);
        if (!position1.isInteger()) {
            return (SubLObject)translator_utilities.NIL;
        }
        if (position2.isInteger()) {
            return Numbers.numL(position1, position2);
        }
        return (SubLObject)translator_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2252L)
    public static SubLObject td_module_translation_position_internal(final SubLObject module) {
        return Sequences.position(module, td_translation_modules_memoized(), Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2252L)
    public static SubLObject td_module_translation_position(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL == v_memoization_state) {
            return td_module_translation_position_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)translator_utilities.$sym2$TD_MODULE_TRANSLATION_POSITION, (SubLObject)translator_utilities.UNPROVIDED);
        if (translator_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)translator_utilities.$sym2$TD_MODULE_TRANSLATION_POSITION, (SubLObject)translator_utilities.ONE_INTEGER, (SubLObject)translator_utilities.NIL, (SubLObject)translator_utilities.EQUAL, (SubLObject)translator_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)translator_utilities.$sym2$TD_MODULE_TRANSLATION_POSITION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(td_module_translation_position_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, (SubLObject)translator_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2397L)
    public static SubLObject td_module_later(final SubLObject later_module, final SubLObject earlier_module) {
        return td_module_earlier(earlier_module, later_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2599L)
    public static SubLObject td_sort_modules_by_load_order(final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = Sort.sort(conses_high.copy_list(v_modules), Symbols.symbol_function((SubLObject)translator_utilities.$sym3$TD_MODULE_EARLIER), (SubLObject)translator_utilities.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2845L)
    public static SubLObject td_module_earlier_memoized(final SubLObject earlier_module, final SubLObject later_module) {
        return td_module_earlier(earlier_module, later_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 2979L)
    public static SubLObject td_module_later_memoized(final SubLObject later_module, final SubLObject earlier_module) {
        return td_module_earlier_memoized(earlier_module, later_module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 3119L)
    public static SubLObject td_module_features(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_module_features(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 3348L)
    public static SubLObject td_translation_features() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.current_xref_system_features();
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 3540L)
    public static SubLObject td_module_pathname(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_module_input_filename(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 4739L)
    public static SubLObject td_predefined_method_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_predefined_method_p(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 5009L)
    public static SubLObject td_predefined_global_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_predefined_global_p(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 5264L)
    public static SubLObject td_method_macro_p(final SubLObject method) {
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        return Types.macro_operator_p(method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 5376L)
    public static SubLObject td_method_defining_module(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_defining_module(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 5621L)
    public static SubLObject td_method_definition_position(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_definition_position(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 5878L)
    public static SubLObject td_method_has_multiple_definitionsP(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_has_multiple_definitionsP(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 6150L)
    public static SubLObject td_method_definition_positions(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_definition_positions(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 6407L)
    public static SubLObject td_method_formal_arglist(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        if (translator_utilities.NIL != td_method_defining_module(method)) {
            final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
                return xref_database.xref_method_formal_arglist(method);
            }
        }
        return subl_promotions.function_symbol_arglist(method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 6744L)
    public static SubLObject td_global_binding_type(final SubLObject global) {
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var;
        final SubLObject binding_type = pcase_var = form_translation.global_binding_type(global);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw6$DYNAMIC)) {
            return (SubLObject)translator_utilities.$kw7$SPECIAL;
        }
        if (pcase_var.eql((SubLObject)translator_utilities.$kw8$UNSPECIFIED)) {
            return (SubLObject)translator_utilities.NIL;
        }
        return binding_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 7055L)
    public static SubLObject td_global_defining_module(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_defining_module(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 7353L)
    public static SubLObject td_global_definition_position(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_definition_position(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 7610L)
    public static SubLObject td_global_has_multiple_definitionsP(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_has_multiple_definitionsP(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 7882L)
    public static SubLObject td_global_definition_positions(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_definition_positions(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 8139L)
    public static SubLObject td_methods_defined_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_defined_by_module(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 8409L)
    public static SubLObject td_globals_defined_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_defined_by_module(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 8667L)
    public static SubLObject td_globals_called_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_accessed_by_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 8930L)
    public static SubLObject td_globals_rebound_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_rebound_by_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 9145L)
    public static SubLObject td_methods_called_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_called_by_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 9396L)
    public static SubLObject td_method_called_by_methodP(final SubLObject client_method, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(client_method) : client_method;
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_called_by_methodP(client_method, method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 9726L)
    public static SubLObject td_modules_referenced_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_accessed_by_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 9987L)
    public static SubLObject td_globals_called_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_referenced_by_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 10243L)
    public static SubLObject td_methods_called_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_called_by_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 10494L)
    public static SubLObject td_method_called_by_globalP(final SubLObject client_method, final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(client_method) : client_method;
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_called_by_globalP(client_method, global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 10824L)
    public static SubLObject td_modules_referenced_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_accessed_by_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 11085L)
    public static SubLObject td_globals_called_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_accessed_by_module(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 11343L)
    public static SubLObject td_methods_called_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_called_by_module(module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 11598L)
    public static SubLObject td_method_called_by_moduleP(final SubLObject client_method, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(client_method) : client_method;
        assert translator_utilities.NIL != td_module_p(module) : module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_called_by_moduleP(client_method, module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 11932L)
    public static SubLObject td_module_positions_calling_global(final SubLObject module, final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_module_positions_accessing_global(module, global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 12262L)
    public static SubLObject td_module_positions_calling_method(final SubLObject module, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(module) : module;
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_module_positions_calling_method(module, method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 12589L)
    public static SubLObject td_method_unused_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_unused_p(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 12827L)
    public static SubLObject td_globals_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_that_call_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 13074L)
    public static SubLObject td_methods_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_that_call_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 13321L)
    public static SubLObject td_modules_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_that_call_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 13568L)
    public static SubLObject td_modules_referencing_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_that_access_method(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 13825L)
    public static SubLObject td_global_unused_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_never_accessed_p(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 14058L)
    public static SubLObject td_globals_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_globals_that_reference_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 14310L)
    public static SubLObject td_methods_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_methods_that_access_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 14559L)
    public static SubLObject td_modules_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_that_access_global(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 14808L)
    public static SubLObject td_modules_referencing_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_that_access_global_anywhere(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 15074L)
    public static SubLObject td_method_potentially_private_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(method) : method;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_method_potentially_private_p(method);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 15357L)
    public static SubLObject td_global_potentially_private_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != Types.symbolp(global) : global;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_global_potentially_private_p(global);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 15620L)
    public static SubLObject td_modules_referencing_module(final SubLObject server_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(server_module) : server_module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_that_access_module_anywhere(server_module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 15966L)
    public static SubLObject td_modules_referenced_by_module(final SubLObject client_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(client_module) : client_module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_modules_accessed_anywhere_by_module(client_module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 16268L)
    public static SubLObject td_justify_module_referencing_module(final SubLObject client_module, final SubLObject server_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert translator_utilities.NIL != td_module_p(client_module) : client_module;
        assert translator_utilities.NIL != td_module_p(server_module) : server_module;
        final SubLObject pcase_var = translator_utilities.$xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)translator_utilities.$kw0$NEW)) {
            return xref_database.xref_justify_module_referencing_module(client_module, server_module);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 16662L)
    public static SubLObject td_modules_implied_by_methods(final SubLObject v_methods, SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = (SubLObject)translator_utilities.NIL;
        }
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = (SubLObject)translator_utilities.NIL;
        method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject my_module = item_var = td_method_defining_module(method);
            if (translator_utilities.NIL == conses_high.member(item_var, v_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                v_modules = (SubLObject)ConsesLow.cons(item_var, v_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 17158L)
    public static SubLObject td_modules_implied_by_globals(final SubLObject globals, SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = (SubLObject)translator_utilities.NIL;
        }
        SubLObject cdolist_list_var = globals;
        SubLObject global = (SubLObject)translator_utilities.NIL;
        global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject my_module = item_var = td_global_defining_module(global);
            if (translator_utilities.NIL == conses_high.member(item_var, v_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                v_modules = (SubLObject)ConsesLow.cons(item_var, v_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 17505L)
    public static SubLObject td_modules_affected_by_arglist_change(final SubLObject changed_methods) {
        SubLObject v_methods = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = changed_methods;
        SubLObject symbol = (SubLObject)translator_utilities.NIL;
        symbol = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject these_methods = cdolist_list_var_$2 = td_methods_calling_method(symbol);
            SubLObject this_method = (SubLObject)translator_utilities.NIL;
            this_method = cdolist_list_var_$2.first();
            while (translator_utilities.NIL != cdolist_list_var_$2) {
                final SubLObject item_var = this_method;
                if (translator_utilities.NIL == conses_high.member(item_var, v_methods, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    v_methods = (SubLObject)ConsesLow.cons(item_var, v_methods);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                this_method = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        }
        SubLObject v_modules = td_modules_implied_by_methods(v_methods, (SubLObject)translator_utilities.UNPROVIDED);
        v_modules = td_sort_modules_by_load_order(v_modules);
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 18113L)
    public static SubLObject td_modules_cluster_containing_module(final SubLObject seed_module, SubLObject verboseP) {
        if (verboseP == translator_utilities.UNPROVIDED) {
            verboseP = (SubLObject)translator_utilities.NIL;
        }
        final SubLObject mark_space = set.new_set(Symbols.symbol_function((SubLObject)translator_utilities.EQUALP), (SubLObject)translator_utilities.UNPROVIDED);
        SubLObject unvisited = (SubLObject)translator_utilities.NIL;
        unvisited = (SubLObject)ConsesLow.cons(seed_module, unvisited);
        while (translator_utilities.NIL != unvisited) {
            final SubLObject current = unvisited.first();
            unvisited = unvisited.rest();
            if (translator_utilities.NIL != td_module_p(current)) {
                if (translator_utilities.NIL != verboseP) {
                    PrintLow.format((SubLObject)translator_utilities.T, (SubLObject)translator_utilities.$str9$Checking__A_for_dependencies___, current);
                }
                if (translator_utilities.NIL != set.set_memberP(current, mark_space)) {
                    continue;
                }
                set.set_add(current, mark_space);
                SubLObject cdolist_list_var;
                final SubLObject connected = cdolist_list_var = td_modules_referencing_module(current);
                SubLObject neighbor = (SubLObject)translator_utilities.NIL;
                neighbor = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    if (translator_utilities.NIL == set.set_memberP(neighbor, mark_space)) {
                        unvisited = (SubLObject)ConsesLow.cons(neighbor, unvisited);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    neighbor = cdolist_list_var.first();
                }
            }
        }
        return set.set_element_list(mark_space);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 18896L)
    public static SubLObject td_modules_properly_dependent_on_modules(final SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == translator_utilities.UNPROVIDED) {
            dependent_modules = (SubLObject)translator_utilities.NIL;
        }
        return conses_high.set_difference(td_modules_dependent_on_modules(leaf_modules, dependent_modules), leaf_modules, (SubLObject)translator_utilities.EQUAL, (SubLObject)translator_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 19282L)
    public static SubLObject td_modules_dependent_on_modules(final SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == translator_utilities.UNPROVIDED) {
            dependent_modules = (SubLObject)translator_utilities.NIL;
        }
        SubLObject cdolist_list_var = leaf_modules;
        SubLObject leaf_module = (SubLObject)translator_utilities.NIL;
        leaf_module = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            dependent_modules = td_modules_dependent_on_module(leaf_module, dependent_modules);
            cdolist_list_var = cdolist_list_var.rest();
            leaf_module = cdolist_list_var.first();
        }
        return dependent_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 19652L)
    public static SubLObject td_modules_dependent_on_module(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == translator_utilities.UNPROVIDED) {
            dependent_modules = (SubLObject)translator_utilities.NIL;
        }
        return td_modules_dependent_on_module_globals(leaf_module, td_modules_dependent_on_module_methods(leaf_module, dependent_modules));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 19972L)
    public static SubLObject td_modules_dependent_on_module_methods(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == translator_utilities.UNPROVIDED) {
            dependent_modules = (SubLObject)translator_utilities.NIL;
        }
        SubLObject cdolist_list_var = td_methods_defined_by_module(leaf_module);
        SubLObject method = (SubLObject)translator_utilities.NIL;
        method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = td_methods_calling_method(method);
            SubLObject client_method = (SubLObject)translator_utilities.NIL;
            client_method = cdolist_list_var_$3.first();
            while (translator_utilities.NIL != cdolist_list_var_$3) {
                final SubLObject item_var;
                final SubLObject module = item_var = td_method_defining_module(client_method);
                if (translator_utilities.NIL == conses_high.member(item_var, dependent_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    dependent_modules = (SubLObject)ConsesLow.cons(item_var, dependent_modules);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                client_method = cdolist_list_var_$3.first();
            }
            SubLObject cdolist_list_var_$4 = td_modules_calling_method(method);
            SubLObject module2 = (SubLObject)translator_utilities.NIL;
            module2 = cdolist_list_var_$4.first();
            while (translator_utilities.NIL != cdolist_list_var_$4) {
                final SubLObject item_var2 = module2;
                if (translator_utilities.NIL == conses_high.member(item_var2, dependent_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    dependent_modules = (SubLObject)ConsesLow.cons(item_var2, dependent_modules);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                module2 = cdolist_list_var_$4.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return dependent_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 20493L)
    public static SubLObject td_modules_dependent_on_module_globals(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == translator_utilities.UNPROVIDED) {
            dependent_modules = (SubLObject)translator_utilities.NIL;
        }
        SubLObject cdolist_list_var = td_globals_defined_by_module(leaf_module);
        SubLObject global = (SubLObject)translator_utilities.NIL;
        global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = td_methods_calling_global(global);
            SubLObject client_method = (SubLObject)translator_utilities.NIL;
            client_method = cdolist_list_var_$5.first();
            while (translator_utilities.NIL != cdolist_list_var_$5) {
                final SubLObject item_var;
                final SubLObject module = item_var = td_method_defining_module(client_method);
                if (translator_utilities.NIL == conses_high.member(item_var, dependent_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    dependent_modules = (SubLObject)ConsesLow.cons(item_var, dependent_modules);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                client_method = cdolist_list_var_$5.first();
            }
            SubLObject cdolist_list_var_$6 = td_modules_calling_global(global);
            SubLObject module2 = (SubLObject)translator_utilities.NIL;
            module2 = cdolist_list_var_$6.first();
            while (translator_utilities.NIL != cdolist_list_var_$6) {
                final SubLObject item_var2 = module2;
                if (translator_utilities.NIL == conses_high.member(item_var2, dependent_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    dependent_modules = (SubLObject)ConsesLow.cons(item_var2, dependent_modules);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                module2 = cdolist_list_var_$6.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        return dependent_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 20973L)
    public static SubLObject td_explain_how_module_depends_on_module(final SubLObject superior, final SubLObject inferior) {
        SubLObject v_methods = (SubLObject)translator_utilities.NIL;
        SubLObject globals = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(superior);
        SubLObject method = (SubLObject)translator_utilities.NIL;
        method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7 = td_methods_calling_method(method);
            SubLObject client_method = (SubLObject)translator_utilities.NIL;
            client_method = cdolist_list_var_$7.first();
            while (translator_utilities.NIL != cdolist_list_var_$7) {
                if (translator_utilities.NIL != Strings.string_equal(inferior, td_method_defining_module(client_method), (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED)) {
                    final SubLObject item_var = client_method;
                    if (translator_utilities.NIL == conses_high.member(item_var, v_methods, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                        v_methods = (SubLObject)ConsesLow.cons(item_var, v_methods);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                client_method = cdolist_list_var_$7.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(superior);
        SubLObject global = (SubLObject)translator_utilities.NIL;
        global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = td_methods_calling_global(global);
            SubLObject client_method = (SubLObject)translator_utilities.NIL;
            client_method = cdolist_list_var_$8.first();
            while (translator_utilities.NIL != cdolist_list_var_$8) {
                if (translator_utilities.NIL != Strings.string_equal(inferior, td_method_defining_module(client_method), (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED)) {
                    final SubLObject item_var = client_method;
                    if (translator_utilities.NIL == conses_high.member(item_var, globals, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                        globals = (SubLObject)ConsesLow.cons(item_var, globals);
                    }
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                client_method = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        }
        return Values.values(v_methods, globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 21626L)
    public static SubLObject td_explain_how_module_depends_on_modules(final SubLObject superiors, final SubLObject inferior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_methods = (SubLObject)translator_utilities.NIL;
        SubLObject all_globals = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = superiors;
        SubLObject superior = (SubLObject)translator_utilities.NIL;
        superior = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_methods = td_explain_how_module_depends_on_module(superior, inferior);
            final SubLObject globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (translator_utilities.NIL != v_methods) {
                if (translator_utilities.NIL == all_methods) {
                    all_methods = v_methods;
                }
                else {
                    all_methods = conses_high.union(v_methods, all_methods, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
                }
            }
            if (translator_utilities.NIL != globals) {
                if (translator_utilities.NIL == all_globals) {
                    all_globals = globals;
                }
                else {
                    all_globals = conses_high.union(globals, all_globals, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            superior = cdolist_list_var.first();
        }
        return Values.values(all_methods, all_globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 22518L)
    public static SubLObject td_method_calls_transitively(final SubLObject calling_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject called_methods = (SubLObject)translator_utilities.NIL;
        SubLObject called_globals = (SubLObject)translator_utilities.NIL;
        final SubLObject _prev_bind_0 = translator_utilities.$td_methods_called_transitively$.currentBinding(thread);
        final SubLObject _prev_bind_2 = translator_utilities.$td_globals_called_transitively$.currentBinding(thread);
        try {
            translator_utilities.$td_methods_called_transitively$.bind(set.new_set(Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED), thread);
            translator_utilities.$td_globals_called_transitively$.bind(set.new_set(Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED), thread);
            SubLObject cdolist_list_var = td_methods_called_by_method(calling_method);
            SubLObject called_method = (SubLObject)translator_utilities.NIL;
            called_method = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            }
            cdolist_list_var = td_globals_called_by_method(calling_method);
            SubLObject called_global = (SubLObject)translator_utilities.NIL;
            called_global = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            }
            called_methods = set.set_element_list(translator_utilities.$td_methods_called_transitively$.getDynamicValue(thread));
            called_globals = set.set_element_list(translator_utilities.$td_globals_called_transitively$.getDynamicValue(thread));
        }
        finally {
            translator_utilities.$td_globals_called_transitively$.rebind(_prev_bind_2, thread);
            translator_utilities.$td_methods_called_transitively$.rebind(_prev_bind_0, thread);
        }
        called_methods = Sort.sort(called_methods, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), Symbols.symbol_function((SubLObject)translator_utilities.$sym11$SYMBOL_NAME));
        called_globals = Sort.sort(called_globals, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), Symbols.symbol_function((SubLObject)translator_utilities.$sym11$SYMBOL_NAME));
        return Values.values(called_methods, called_globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 23454L)
    public static SubLObject td_global_calls_transitively(final SubLObject calling_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject called_methods = (SubLObject)translator_utilities.NIL;
        SubLObject called_globals = (SubLObject)translator_utilities.NIL;
        final SubLObject _prev_bind_0 = translator_utilities.$td_methods_called_transitively$.currentBinding(thread);
        final SubLObject _prev_bind_2 = translator_utilities.$td_globals_called_transitively$.currentBinding(thread);
        try {
            translator_utilities.$td_methods_called_transitively$.bind(set.new_set(Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED), thread);
            translator_utilities.$td_globals_called_transitively$.bind(set.new_set(Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED), thread);
            SubLObject cdolist_list_var = td_methods_called_by_global(calling_global);
            SubLObject called_method = (SubLObject)translator_utilities.NIL;
            called_method = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            }
            cdolist_list_var = td_globals_called_by_method(calling_global);
            SubLObject called_global = (SubLObject)translator_utilities.NIL;
            called_global = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            }
            called_methods = set.set_element_list(translator_utilities.$td_methods_called_transitively$.getDynamicValue(thread));
            called_globals = set.set_element_list(translator_utilities.$td_globals_called_transitively$.getDynamicValue(thread));
        }
        finally {
            translator_utilities.$td_globals_called_transitively$.rebind(_prev_bind_2, thread);
            translator_utilities.$td_methods_called_transitively$.rebind(_prev_bind_0, thread);
        }
        called_methods = Sort.sort(called_methods, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), Symbols.symbol_function((SubLObject)translator_utilities.$sym11$SYMBOL_NAME));
        called_globals = Sort.sort(called_globals, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), Symbols.symbol_function((SubLObject)translator_utilities.$sym11$SYMBOL_NAME));
        return Values.values(called_methods, called_globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 24390L)
    public static SubLObject td_note_method_called_transitively(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (translator_utilities.NIL == set.set_memberP(method, translator_utilities.$td_methods_called_transitively$.getDynamicValue(thread))) {
            set.set_add(method, translator_utilities.$td_methods_called_transitively$.getDynamicValue(thread));
            SubLObject cdolist_list_var = td_methods_called_by_method(method);
            SubLObject called_method = (SubLObject)translator_utilities.NIL;
            called_method = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            }
            cdolist_list_var = td_globals_called_by_method(method);
            SubLObject called_global = (SubLObject)translator_utilities.NIL;
            called_global = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            }
        }
        return method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 24849L)
    public static SubLObject td_note_global_called_transitively(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (translator_utilities.NIL == set.set_memberP(global, translator_utilities.$td_globals_called_transitively$.getDynamicValue(thread))) {
            set.set_add(global, translator_utilities.$td_globals_called_transitively$.getDynamicValue(thread));
            SubLObject cdolist_list_var = td_methods_called_by_global(global);
            SubLObject called_method = (SubLObject)translator_utilities.NIL;
            called_method = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            }
            cdolist_list_var = td_globals_called_by_global(global);
            SubLObject called_global = (SubLObject)translator_utilities.NIL;
            called_global = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            }
        }
        return global;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 25294L)
    public static SubLObject td_method_references_modules_transitively(final SubLObject calling_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_method_calls_transitively(calling_method);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject referenced_modules = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = (SubLObject)translator_utilities.NIL;
        called_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_method_defining_module(called_method);
            if (translator_utilities.NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (translator_utilities.NIL == conses_high.member(item_var, referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    referenced_modules = (SubLObject)ConsesLow.cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        }
        cdolist_list_var = called_globals;
        SubLObject called_global = (SubLObject)translator_utilities.NIL;
        called_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_global_defining_module(called_global);
            if (translator_utilities.NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (translator_utilities.NIL == conses_high.member(item_var, referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    referenced_modules = (SubLObject)ConsesLow.cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        }
        referenced_modules = Sort.sort(referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), (SubLObject)translator_utilities.UNPROVIDED);
        return referenced_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 26340L)
    public static SubLObject td_method_latest_transitively_referenced_module(final SubLObject calling_method) {
        final SubLObject referenced_modules = td_method_references_modules_transitively(calling_method);
        final SubLObject latest_module = list_utilities.extremal(referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.$sym12$TD_MODULE_LATER), (SubLObject)translator_utilities.UNPROVIDED);
        return latest_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 26676L)
    public static SubLObject td_method_latest_transitively_referenced_module_memoized_internal(final SubLObject referenced_method) {
        return td_method_latest_transitively_referenced_module(referenced_method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 26676L)
    public static SubLObject td_method_latest_transitively_referenced_module_memoized(final SubLObject referenced_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL == v_memoization_state) {
            return td_method_latest_transitively_referenced_module_memoized_internal(referenced_method);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)translator_utilities.$sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, (SubLObject)translator_utilities.UNPROVIDED);
        if (translator_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)translator_utilities.$sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, (SubLObject)translator_utilities.ONE_INTEGER, (SubLObject)translator_utilities.NIL, (SubLObject)translator_utilities.EQ, (SubLObject)translator_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)translator_utilities.$sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_method, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(td_method_latest_transitively_referenced_module_memoized_internal(referenced_method)));
            memoization_state.caching_state_put(caching_state, referenced_method, results, (SubLObject)translator_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 26863L)
    public static SubLObject td_justify_method_latest_transitively_referenced_module(final SubLObject calling_method, final SubLObject latest_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_method_calls_transitively(calling_method);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject justifying_methods = (SubLObject)translator_utilities.NIL;
        SubLObject justifying_globals = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = (SubLObject)translator_utilities.NIL;
        called_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (latest_module.equal(td_method_defining_module(called_method))) {
                justifying_methods = (SubLObject)ConsesLow.cons(called_method, justifying_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        }
        cdolist_list_var = called_globals;
        SubLObject called_global = (SubLObject)translator_utilities.NIL;
        called_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (latest_module.equal(td_global_defining_module(called_global))) {
                justifying_globals = (SubLObject)ConsesLow.cons(called_global, justifying_globals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(justifying_methods), Sequences.nreverse(justifying_globals));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 27734L)
    public static SubLObject td_justify_method_calls_transitively(final SubLObject client_method, final SubLObject server_method) {
        final SubLObject seen_table = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject unvisited_queue = queues.create_queue((SubLObject)translator_utilities.UNPROVIDED);
        SubLObject foundP = (SubLObject)translator_utilities.NIL;
        dictionary.dictionary_enter(seen_table, client_method, (SubLObject)translator_utilities.NIL);
        queues.enqueue(client_method, unvisited_queue);
        while (translator_utilities.NIL == queues.queue_empty_p(unvisited_queue)) {
            final SubLObject method = queues.dequeue(unvisited_queue);
            final SubLObject called_methods = td_methods_called_by_method(method);
            if (translator_utilities.NIL == foundP) {
                SubLObject csome_list_var = called_methods;
                SubLObject called_method = (SubLObject)translator_utilities.NIL;
                called_method = csome_list_var.first();
                while (translator_utilities.NIL == foundP && translator_utilities.NIL != csome_list_var) {
                    if (translator_utilities.$kw14$UNSEEN == dictionary.dictionary_lookup_without_values(seen_table, called_method, (SubLObject)translator_utilities.$kw14$UNSEEN)) {
                        dictionary.dictionary_enter(seen_table, called_method, method);
                        foundP = Equality.eq(called_method, server_method);
                        if (translator_utilities.NIL != foundP) {
                            queues.clear_queue(unvisited_queue);
                        }
                        else {
                            queues.enqueue(called_method, unvisited_queue);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    called_method = csome_list_var.first();
                }
            }
        }
        SubLObject call_path = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL != foundP) {
            SubLObject method2;
            for (method2 = (SubLObject)translator_utilities.NIL, method2 = server_method; translator_utilities.NIL != method2; method2 = dictionary.dictionary_lookup_without_values(seen_table, method2, (SubLObject)translator_utilities.UNPROVIDED)) {
                call_path = (SubLObject)ConsesLow.cons(method2, call_path);
            }
        }
        return Values.values(call_path, dictionary.dictionary_length(seen_table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 29136L)
    public static SubLObject td_global_references_modules_transitively(final SubLObject calling_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_global_calls_transitively(calling_global);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject referenced_modules = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = (SubLObject)translator_utilities.NIL;
        called_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_method_defining_module(called_method);
            if (translator_utilities.NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (translator_utilities.NIL == conses_high.member(item_var, referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    referenced_modules = (SubLObject)ConsesLow.cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        }
        cdolist_list_var = called_globals;
        SubLObject called_global = (SubLObject)translator_utilities.NIL;
        called_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_global_defining_module(called_global);
            if (translator_utilities.NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (translator_utilities.NIL == conses_high.member(item_var, referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                    referenced_modules = (SubLObject)ConsesLow.cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        }
        referenced_modules = Sort.sort(referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.$sym10$STRING_LESSP), (SubLObject)translator_utilities.UNPROVIDED);
        return referenced_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 29964L)
    public static SubLObject td_global_latest_transitively_referenced_module(final SubLObject calling_global) {
        final SubLObject referenced_modules = td_global_references_modules_transitively(calling_global);
        final SubLObject latest_module = list_utilities.extremal(referenced_modules, Symbols.symbol_function((SubLObject)translator_utilities.$sym12$TD_MODULE_LATER), (SubLObject)translator_utilities.UNPROVIDED);
        return latest_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 30300L)
    public static SubLObject td_global_latest_transitively_referenced_module_memoized_internal(final SubLObject referenced_global) {
        return td_global_latest_transitively_referenced_module(referenced_global);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 30300L)
    public static SubLObject td_global_latest_transitively_referenced_module_memoized(final SubLObject referenced_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL == v_memoization_state) {
            return td_global_latest_transitively_referenced_module_memoized_internal(referenced_global);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)translator_utilities.$sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, (SubLObject)translator_utilities.UNPROVIDED);
        if (translator_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)translator_utilities.$sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, (SubLObject)translator_utilities.ONE_INTEGER, (SubLObject)translator_utilities.NIL, (SubLObject)translator_utilities.EQ, (SubLObject)translator_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)translator_utilities.$sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_global, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(td_global_latest_transitively_referenced_module_memoized_internal(referenced_global)));
            memoization_state.caching_state_put(caching_state, referenced_global, results, (SubLObject)translator_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 30487L)
    public static SubLObject td_justify_global_latest_transitively_referenced_module(final SubLObject calling_global, final SubLObject latest_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_global_calls_transitively(calling_global);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject justifying_methods = (SubLObject)translator_utilities.NIL;
        SubLObject justifying_globals = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = (SubLObject)translator_utilities.NIL;
        called_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (latest_module.equal(td_method_defining_module(called_method))) {
                justifying_methods = (SubLObject)ConsesLow.cons(called_method, justifying_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        }
        cdolist_list_var = called_globals;
        SubLObject called_global = (SubLObject)translator_utilities.NIL;
        called_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (latest_module.equal(td_global_defining_module(called_global))) {
                justifying_globals = (SubLObject)ConsesLow.cons(called_global, justifying_globals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(justifying_methods), Sequences.nreverse(justifying_globals));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 31358L)
    public static SubLObject incongruent_features(final SubLObject defined_features, final SubLObject referenced_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defined_prop_sentence = feature_expression_transform(defined_features);
        final SubLObject referenced_prop_sentence = feature_expression_transform(referenced_features);
        final SubLObject implication = (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw16$OR, (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw17$NOT, defined_prop_sentence), referenced_prop_sentence);
        SubLObject incongruence_explanation = (SubLObject)translator_utilities.NIL;
        final SubLObject _prev_bind_0 = prop_sentence_clausifier.$prop_sentence_and$.currentBinding(thread);
        final SubLObject _prev_bind_2 = prop_sentence_clausifier.$prop_sentence_or$.currentBinding(thread);
        final SubLObject _prev_bind_3 = prop_sentence_clausifier.$prop_sentence_not$.currentBinding(thread);
        final SubLObject _prev_bind_4 = prop_sentence_clausifier.$prop_sentence_true$.currentBinding(thread);
        final SubLObject _prev_bind_5 = prop_sentence_clausifier.$prop_sentence_false$.currentBinding(thread);
        try {
            prop_sentence_clausifier.$prop_sentence_and$.bind((SubLObject)translator_utilities.$kw18$AND, thread);
            prop_sentence_clausifier.$prop_sentence_or$.bind((SubLObject)translator_utilities.$kw16$OR, thread);
            prop_sentence_clausifier.$prop_sentence_not$.bind((SubLObject)translator_utilities.$kw17$NOT, thread);
            prop_sentence_clausifier.$prop_sentence_true$.bind((SubLObject)translator_utilities.T, thread);
            prop_sentence_clausifier.$prop_sentence_false$.bind((SubLObject)translator_utilities.NIL, thread);
            incongruence_explanation = prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_dnf(prop_sentence_clausifier.prop_sentence_negate(prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_cnf(implication)))));
        }
        finally {
            prop_sentence_clausifier.$prop_sentence_false$.rebind(_prev_bind_5, thread);
            prop_sentence_clausifier.$prop_sentence_true$.rebind(_prev_bind_4, thread);
            prop_sentence_clausifier.$prop_sentence_not$.rebind(_prev_bind_3, thread);
            prop_sentence_clausifier.$prop_sentence_or$.rebind(_prev_bind_2, thread);
            prop_sentence_clausifier.$prop_sentence_and$.rebind(_prev_bind_0, thread);
        }
        return incongruence_explanation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 32565L)
    public static SubLObject feature_expression_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)translator_utilities.$sym19$NON_FEATURE_SYMBOL_P), Symbols.symbol_function((SubLObject)translator_utilities.$sym20$TRANSFORM_NON_FEATURE_SYMBOL), (SubLObject)translator_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 32716L)
    public static SubLObject non_feature_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && !v_object.isKeyword() && v_object != translator_utilities.T && v_object != translator_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 32883L)
    public static SubLObject transform_non_feature_symbol(final SubLObject symbol) {
        return Symbols.make_keyword(Symbols.symbol_name(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 32983L)
    public static SubLObject all_module_level_feature_problems(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_feature_problems = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str21$Identifying_module_level_feature_, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject feature_problems = cdolist_list_var = module_level_feature_problems(module);
                            SubLObject feature_problem = (SubLObject)translator_utilities.NIL;
                            feature_problem = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_feature_problems = (SubLObject)ConsesLow.cons(feature_problem, all_feature_problems);
                                cdolist_list_var = cdolist_list_var.rest();
                                feature_problem = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_feature_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 33779L)
    public static SubLObject module_level_feature_problems(final SubLObject defined_module) {
        final SubLObject defined_features = td_module_features(defined_module);
        SubLObject feature_problems = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12;
            final SubLObject referenced_methods = cdolist_list_var_$12 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$12.first();
            while (translator_utilities.NIL != cdolist_list_var_$12) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (translator_utilities.NIL != incongruence) {
                        feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                referenced_method = cdolist_list_var_$12.first();
            }
            SubLObject cdolist_list_var_$13;
            final SubLObject referenced_globals = cdolist_list_var_$13 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$13.first();
            while (translator_utilities.NIL != cdolist_list_var_$13) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (translator_utilities.NIL != incongruence) {
                        feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                referenced_global = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14;
            final SubLObject referenced_methods = cdolist_list_var_$14 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$14.first();
            while (translator_utilities.NIL != cdolist_list_var_$14) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (translator_utilities.NIL != incongruence) {
                        feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                referenced_method = cdolist_list_var_$14.first();
            }
            SubLObject cdolist_list_var_$15;
            final SubLObject referenced_globals = cdolist_list_var_$15 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$15.first();
            while (translator_utilities.NIL != cdolist_list_var_$15) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (translator_utilities.NIL != incongruence) {
                        feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                referenced_global = cdolist_list_var_$15.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = (SubLObject)translator_utilities.NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (translator_utilities.NIL != referenced_module2) {
                final SubLObject referenced_features2 = td_module_features(referenced_module2);
                final SubLObject incongruence2 = potential_module_level_feature_incongruence(defined_features, referenced_features2);
                if (translator_utilities.NIL != incongruence2) {
                    feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method2, referenced_module2, referenced_features2), incongruence2), feature_problems);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        }
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = (SubLObject)translator_utilities.NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (translator_utilities.NIL != referenced_module2) {
                final SubLObject referenced_features2 = td_module_features(referenced_module2);
                final SubLObject incongruence2 = potential_module_level_feature_incongruence(defined_features, referenced_features2);
                if (translator_utilities.NIL != incongruence2) {
                    feature_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module, defined_features), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global2, referenced_module2, referenced_features2), incongruence2), feature_problems);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(feature_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 38393L)
    public static SubLObject potential_module_level_feature_incongruence_internal(final SubLObject defined_features, final SubLObject referenced_features) {
        return incongruent_features(defined_features, referenced_features);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 38393L)
    public static SubLObject potential_module_level_feature_incongruence(final SubLObject defined_features, final SubLObject referenced_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)translator_utilities.NIL;
        if (translator_utilities.NIL == v_memoization_state) {
            return potential_module_level_feature_incongruence_internal(defined_features, referenced_features);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)translator_utilities.$sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, (SubLObject)translator_utilities.UNPROVIDED);
        if (translator_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)translator_utilities.$sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, (SubLObject)translator_utilities.TWO_INTEGER, (SubLObject)translator_utilities.NIL, (SubLObject)translator_utilities.EQUAL, (SubLObject)translator_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)translator_utilities.$sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(defined_features, referenced_features);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)translator_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)translator_utilities.NIL;
            collision = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (defined_features.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (translator_utilities.NIL != cached_args && translator_utilities.NIL == cached_args.rest() && referenced_features.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(potential_module_level_feature_incongruence_internal(defined_features, referenced_features)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(defined_features, referenced_features));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 38595L)
    public static SubLObject show_feature_problems(SubLObject feature_problem_specs, SubLObject stream) {
        if (feature_problem_specs == translator_utilities.UNPROVIDED) {
            feature_problem_specs = all_module_level_feature_problems((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = feature_problem_specs;
        SubLObject feature_problem_spec = (SubLObject)translator_utilities.NIL;
        feature_problem_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_feature_problem(feature_problem_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            feature_problem_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 38989L)
    public static SubLObject show_one_feature_problem(final SubLObject feature_problem_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(feature_problem_spec, feature_problem_spec, (SubLObject)translator_utilities.$list27);
        final SubLObject temp = feature_problem_spec.rest();
        SubLObject current = feature_problem_spec.first();
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, feature_problem_spec, (SubLObject)translator_utilities.$list27);
        def_type = current.first();
        final SubLObject def_args;
        current = (def_args = current.rest());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, feature_problem_spec, (SubLObject)translator_utilities.$list27);
        final SubLObject temp_$16 = current.rest();
        current = current.first();
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, feature_problem_spec, (SubLObject)translator_utilities.$list27);
        ref_type = current.first();
        final SubLObject ref_args;
        current = (ref_args = current.rest());
        current = temp_$16;
        SubLObject incongruence = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, feature_problem_spec, (SubLObject)translator_utilities.$list27);
        incongruence = current.first();
        current = current.rest();
        if (translator_utilities.NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
                SubLObject current_$18;
                final SubLObject datum_$17 = current_$18 = def_args;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                SubLObject def_features = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)translator_utilities.$list28);
                module = current_$18.first();
                current_$18 = current_$18.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)translator_utilities.$list28);
                def_features = current_$18.first();
                current_$18 = current_$18.rest();
                if (translator_utilities.NIL == current_$18) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str29$__Top_level_form_in__A__, module);
                    show_one_feature_assumption(def_features, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)translator_utilities.$list28);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$19;
                final SubLObject datum_$18 = current_$19 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                SubLObject def_features2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$19, datum_$18, (SubLObject)translator_utilities.$list30);
                def_object = current_$19.first();
                current_$19 = current_$19.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$19, datum_$18, (SubLObject)translator_utilities.$list30);
                module2 = current_$19.first();
                current_$19 = current_$19.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$19, datum_$18, (SubLObject)translator_utilities.$list30);
                def_features2 = current_$19.first();
                current_$19 = current_$19.rest();
                if (translator_utilities.NIL == current_$19) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, def_object, module2);
                    show_one_feature_assumption(def_features2, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$18, (SubLObject)translator_utilities.$list30);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$20;
                final SubLObject datum_$19 = current_$20 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                SubLObject def_features2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)translator_utilities.$list30);
                def_object = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)translator_utilities.$list30);
                module2 = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)translator_utilities.$list30);
                def_features2 = current_$20.first();
                current_$20 = current_$20.rest();
                if (translator_utilities.NIL == current_$20) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str32$__Global__A_in__A__, def_object, module2);
                    show_one_feature_assumption(def_features2, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$19, (SubLObject)translator_utilities.$list30);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str33$_references);
            pcase_var = ref_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                SubLObject ref_features = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)translator_utilities.$list34);
                ref_object = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)translator_utilities.$list34);
                module2 = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)translator_utilities.$list34);
                ref_features = current_$21.first();
                current_$21 = current_$21.rest();
                if (translator_utilities.NIL == current_$21) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str35$__method__A_from__A__, ref_object, module2);
                    show_one_feature_assumption(ref_features, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)translator_utilities.$list34);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$22;
                final SubLObject datum_$21 = current_$22 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                SubLObject ref_features = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)translator_utilities.$list34);
                ref_object = current_$22.first();
                current_$22 = current_$22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)translator_utilities.$list34);
                module2 = current_$22.first();
                current_$22 = current_$22.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)translator_utilities.$list34);
                ref_features = current_$22.first();
                current_$22 = current_$22.rest();
                if (translator_utilities.NIL == current_$22) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str36$__global__A_from__A__, ref_object, module2);
                    show_one_feature_assumption(ref_features, stream);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$21, (SubLObject)translator_utilities.$list34);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str37$__which_will_have_problems_when__, feature_explanation(incongruence));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(feature_problem_spec, (SubLObject)translator_utilities.$list27);
        }
        return feature_problem_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 40378L)
    public static SubLObject show_one_feature_assumption(final SubLObject feature_expression, final SubLObject stream) {
        return PrintLow.format(stream, (SubLObject)translator_utilities.$str38$assuming__A, feature_explanation(feature_expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 40531L)
    public static SubLObject feature_explanation(final SubLObject feature_expression) {
        return (SubLObject)((translator_utilities.T == feature_expression) ? translator_utilities.$str39$no_features : feature_expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 40714L)
    public static SubLObject all_privacy_violations(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_privacy_violations = (SubLObject)translator_utilities.NIL;
        final SubLObject list_var = v_modules;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str40$Identifying_privacy_violations, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                module = csome_list_var.first();
                while (translator_utilities.NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject privacy_violations = cdolist_list_var = module_privacy_violations(module);
                    SubLObject privacy_violation = (SubLObject)translator_utilities.NIL;
                    privacy_violation = cdolist_list_var.first();
                    while (translator_utilities.NIL != cdolist_list_var) {
                        all_privacy_violations = (SubLObject)ConsesLow.cons(privacy_violation, all_privacy_violations);
                        cdolist_list_var = cdolist_list_var.rest();
                        privacy_violation = cdolist_list_var.first();
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    module = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_privacy_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 41352L)
    public static SubLObject module_privacy_violations(final SubLObject defined_module) {
        SubLObject privacy_violations = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$28;
            final SubLObject referenced_methods = cdolist_list_var_$28 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$28.first();
            while (translator_utilities.NIL != cdolist_list_var_$28) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (translator_utilities.NIL != referenced_module && !defined_module.equal(referenced_module) && translator_utilities.NIL != form_translation.private_method_p(referenced_method)) {
                    privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                referenced_method = cdolist_list_var_$28.first();
            }
            SubLObject cdolist_list_var_$29;
            final SubLObject referenced_globals = cdolist_list_var_$29 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$29.first();
            while (translator_utilities.NIL != cdolist_list_var_$29) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (translator_utilities.NIL != referenced_module && !defined_module.equal(referenced_module) && translator_utilities.NIL != form_translation.private_global_p(referenced_global)) {
                    privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                referenced_global = cdolist_list_var_$29.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30;
            final SubLObject referenced_methods = cdolist_list_var_$30 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$30.first();
            while (translator_utilities.NIL != cdolist_list_var_$30) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (translator_utilities.NIL != referenced_module && !defined_module.equal(referenced_module) && translator_utilities.NIL != form_translation.private_method_p(referenced_method)) {
                    privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                referenced_method = cdolist_list_var_$30.first();
            }
            SubLObject cdolist_list_var_$31;
            final SubLObject referenced_globals = cdolist_list_var_$31 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$31.first();
            while (translator_utilities.NIL != cdolist_list_var_$31) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (translator_utilities.NIL != referenced_module && !defined_module.equal(referenced_module) && translator_utilities.NIL != form_translation.private_global_p(referenced_global)) {
                    privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                referenced_global = cdolist_list_var_$31.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = (SubLObject)translator_utilities.NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (translator_utilities.NIL != referenced_module2 && !defined_module.equal(referenced_module2) && translator_utilities.NIL != form_translation.private_method_p(referenced_method2)) {
                privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method2, referenced_module2)), privacy_violations);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        }
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = (SubLObject)translator_utilities.NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (translator_utilities.NIL != referenced_module2 && !defined_module.equal(referenced_module2) && translator_utilities.NIL != form_translation.private_global_p(referenced_global2)) {
                privacy_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global2, referenced_module2)), privacy_violations);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(privacy_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 44911L)
    public static SubLObject show_privacy_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == translator_utilities.UNPROVIDED) {
            violation_specs = all_privacy_violations((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = (SubLObject)translator_utilities.NIL;
        violation_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_privacy_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 45270L)
    public static SubLObject show_one_privacy_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(violation_spec, violation_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        def_type = current.first();
        final SubLObject def_args;
        current = (def_args = current.rest());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp_$32 = current.rest();
        current = current.first();
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = (ref_args = current.rest());
        current = temp_$32;
        if (translator_utilities.NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
                SubLObject current_$34;
                final SubLObject datum_$33 = current_$34 = def_args;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$34, datum_$33, (SubLObject)translator_utilities.$list42);
                module = current_$34.first();
                current_$34 = current_$34.rest();
                if (translator_utilities.NIL == current_$34) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str29$__Top_level_form_in__A__, module);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$33, (SubLObject)translator_utilities.$list42);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$35;
                final SubLObject datum_$34 = current_$35 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$35, datum_$34, (SubLObject)translator_utilities.$list43);
                def_object = current_$35.first();
                current_$35 = current_$35.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$35, datum_$34, (SubLObject)translator_utilities.$list43);
                module2 = current_$35.first();
                current_$35 = current_$35.rest();
                if (translator_utilities.NIL == current_$35) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, def_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$34, (SubLObject)translator_utilities.$list43);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$36;
                final SubLObject datum_$35 = current_$36 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)translator_utilities.$list43);
                def_object = current_$36.first();
                current_$36 = current_$36.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$36, datum_$35, (SubLObject)translator_utilities.$list43);
                module2 = current_$36.first();
                current_$36 = current_$36.rest();
                if (translator_utilities.NIL == current_$36) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str32$__Global__A_in__A__, def_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$35, (SubLObject)translator_utilities.$list43);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str44$_references_private);
            pcase_var = ref_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$37;
                final SubLObject datum_$36 = current_$37 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$37, datum_$36, (SubLObject)translator_utilities.$list45);
                ref_object = current_$37.first();
                current_$37 = current_$37.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$37, datum_$36, (SubLObject)translator_utilities.$list45);
                module2 = current_$37.first();
                current_$37 = current_$37.rest();
                if (translator_utilities.NIL == current_$37) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str35$__method__A_from__A__, ref_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$36, (SubLObject)translator_utilities.$list45);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$38;
                final SubLObject datum_$37 = current_$38 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)translator_utilities.$list45);
                ref_object = current_$38.first();
                current_$38 = current_$38.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$38, datum_$37, (SubLObject)translator_utilities.$list45);
                module2 = current_$38.first();
                current_$38 = current_$38.rest();
                if (translator_utilities.NIL == current_$38) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str36$__global__A_from__A__, ref_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$37, (SubLObject)translator_utilities.$list45);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(violation_spec, (SubLObject)translator_utilities.$list41);
        }
        return violation_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 46214L)
    public static SubLObject all_early_rebinding_violations(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_rebinding_violations = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$43 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str46$Identifying_early_rebinding_viola, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_rebinding_violations = cdolist_list_var = module_early_rebinding_violations(module);
                            SubLObject early_rebinding_violation = (SubLObject)translator_utilities.NIL;
                            early_rebinding_violation = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_early_rebinding_violations = (SubLObject)ConsesLow.cons(early_rebinding_violation, all_early_rebinding_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_rebinding_violation = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$43, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_early_rebinding_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 46973L)
    public static SubLObject module_early_rebinding_violations(final SubLObject defined_module) {
        SubLObject early_rebinding_violations = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$46;
            final SubLObject rebound_globals = cdolist_list_var_$46 = td_globals_rebound_by_method(defined_method);
            SubLObject rebound_global = (SubLObject)translator_utilities.NIL;
            rebound_global = cdolist_list_var_$46.first();
            while (translator_utilities.NIL != cdolist_list_var_$46) {
                final SubLObject referenced_module = td_global_defining_module(rebound_global);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_position = td_global_definition_position(rebound_global);
                    if (translator_utilities.NIL != td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, (SubLObject)translator_utilities.$kw24$GLOBAL, rebound_global)) {
                        early_rebinding_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, rebound_global, referenced_module)), early_rebinding_violations);
                    }
                }
                cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                rebound_global = cdolist_list_var_$46.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        return Sequences.nreverse(early_rebinding_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 48071L)
    public static SubLObject show_early_rebinding_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == translator_utilities.UNPROVIDED) {
            violation_specs = all_early_rebinding_violations((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = (SubLObject)translator_utilities.NIL;
        violation_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_early_rebinding_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 48462L)
    public static SubLObject show_one_early_rebinding_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(violation_spec, violation_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        def_type = current.first();
        final SubLObject def_args;
        current = (def_args = current.rest());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp_$47 = current.rest();
        current = current.first();
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = (ref_args = current.rest());
        current = temp_$47;
        if (translator_utilities.NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
                SubLObject current_$49;
                final SubLObject datum_$48 = current_$49 = def_args;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$49, datum_$48, (SubLObject)translator_utilities.$list42);
                module = current_$49.first();
                current_$49 = current_$49.rest();
                if (translator_utilities.NIL == current_$49) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str29$__Top_level_form_in__A__, module);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$48, (SubLObject)translator_utilities.$list42);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$50;
                final SubLObject datum_$49 = current_$50 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$50, datum_$49, (SubLObject)translator_utilities.$list43);
                def_object = current_$50.first();
                current_$50 = current_$50.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$50, datum_$49, (SubLObject)translator_utilities.$list43);
                module2 = current_$50.first();
                current_$50 = current_$50.rest();
                if (translator_utilities.NIL == current_$50) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, def_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$49, (SubLObject)translator_utilities.$list43);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str47$_rebinds);
            pcase_var = ref_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$51;
                final SubLObject datum_$50 = current_$51 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$51, datum_$50, (SubLObject)translator_utilities.$list45);
                ref_object = current_$51.first();
                current_$51 = current_$51.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$51, datum_$50, (SubLObject)translator_utilities.$list45);
                module2 = current_$51.first();
                current_$51 = current_$51.rest();
                if (translator_utilities.NIL == current_$51) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str36$__global__A_from__A__, ref_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$50, (SubLObject)translator_utilities.$list45);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str48$_before_it_is_defined__);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(violation_spec, (SubLObject)translator_utilities.$list41);
        }
        return violation_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 49183L)
    public static SubLObject all_early_reference_violations(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_reference_violations = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$54 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str49$Identifying_early_reference_viola, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_reference_violations = cdolist_list_var = module_early_reference_violations(module);
                            SubLObject early_reference_violation = (SubLObject)translator_utilities.NIL;
                            early_reference_violation = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_early_reference_violations = (SubLObject)ConsesLow.cons(early_reference_violation, all_early_reference_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_reference_violation = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_early_reference_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 49984L)
    public static SubLObject module_early_reference_violations(final SubLObject defined_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject early_reference_violations = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$57;
            final SubLObject referenced_methods = cdolist_list_var_$57 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$57.first();
            while (translator_utilities.NIL != cdolist_list_var_$57) {
                if (translator_utilities.NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (translator_utilities.NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                            early_reference_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                        }
                    }
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                referenced_method = cdolist_list_var_$57.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject defined_position = td_global_definition_position(defined_global);
            SubLObject cdolist_list_var_$58;
            final SubLObject referenced_methods = cdolist_list_var_$58 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$58.first();
            while (translator_utilities.NIL != cdolist_list_var_$58) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_position = td_method_definition_position(referenced_method);
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, (SubLObject)translator_utilities.$kw23$METHOD, referenced_method);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                        early_reference_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                    }
                }
                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                referenced_method = cdolist_list_var_$58.first();
            }
            SubLObject cdolist_list_var_$59;
            final SubLObject referenced_globals = cdolist_list_var_$59 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$59.first();
            while (translator_utilities.NIL != cdolist_list_var_$59) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (translator_utilities.NIL != referenced_module) {
                    final SubLObject referenced_position = td_global_definition_position(referenced_global);
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, (SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                        early_reference_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                    }
                }
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                referenced_global = cdolist_list_var_$59.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = (SubLObject)translator_utilities.NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (translator_utilities.NIL != referenced_module2) {
                final SubLObject referenced_position2 = td_method_definition_position(referenced_method2);
                SubLObject cdolist_list_var_$60;
                final SubLObject module_positions = cdolist_list_var_$60 = td_module_positions_calling_method(defined_module, referenced_method2);
                SubLObject module_position = (SubLObject)translator_utilities.NIL;
                module_position = cdolist_list_var_$60.first();
                while (translator_utilities.NIL != cdolist_list_var_$60) {
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, module_position, referenced_module2, referenced_position2, (SubLObject)translator_utilities.$kw23$METHOD, referenced_method2);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                        early_reference_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module, module_position), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method2, referenced_module2), justifying_methods, justifying_globals), early_reference_violations);
                    }
                    cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                    module_position = cdolist_list_var_$60.first();
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        }
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = (SubLObject)translator_utilities.NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (translator_utilities.NIL != referenced_module2) {
                final SubLObject referenced_position2 = td_global_definition_position(referenced_global2);
                SubLObject cdolist_list_var_$61;
                final SubLObject module_positions = cdolist_list_var_$61 = td_module_positions_calling_global(defined_module, referenced_global2);
                SubLObject module_position = (SubLObject)translator_utilities.NIL;
                module_position = cdolist_list_var_$61.first();
                while (translator_utilities.NIL != cdolist_list_var_$61) {
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, module_position, referenced_module2, referenced_position2, (SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global2);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                        early_reference_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module, module_position), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global2, referenced_module2), justifying_methods, justifying_globals), early_reference_violations);
                    }
                    cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                    module_position = cdolist_list_var_$61.first();
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(early_reference_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 55284L)
    public static SubLObject td_early_macro_use_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject macro_module, final SubLObject macro_position, final SubLObject referenced_macro) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifying_methods = (SubLObject)translator_utilities.NIL;
        SubLObject justifying_globals = (SubLObject)translator_utilities.NIL;
        final SubLObject latest_module_referenced_by_macro = td_method_latest_transitively_referenced_module_memoized(referenced_macro);
        if (translator_utilities.NIL != latest_module_referenced_by_macro && translator_utilities.NIL == td_module_earlier(latest_module_referenced_by_macro, referencing_module)) {
            thread.resetMultipleValues();
            final SubLObject justifying_methods_$62 = td_justify_method_latest_transitively_referenced_module(referenced_macro, latest_module_referenced_by_macro);
            final SubLObject justifying_globals_$63 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            justifying_methods = justifying_methods_$62;
            justifying_globals = justifying_globals_$63;
        }
        if ((translator_utilities.NIL != td_module_later(macro_module, referencing_module) || (referencing_module.equal(macro_module) && macro_position.numG(referencing_position))) && translator_utilities.NIL == conses_high.member(referenced_macro, justifying_methods, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
            justifying_methods = (SubLObject)ConsesLow.cons(referenced_macro, justifying_methods);
        }
        return Values.values(justifying_methods, justifying_globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 56375L)
    public static SubLObject td_early_evaluation_reference_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject referenced_module, final SubLObject referenced_position, final SubLObject reference_type, final SubLObject referenced_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifying_methods = (SubLObject)translator_utilities.NIL;
        SubLObject justifying_globals = (SubLObject)translator_utilities.NIL;
        final SubLObject latest_module_referenced_by_evaluation = (translator_utilities.$kw23$METHOD == reference_type) ? td_method_latest_transitively_referenced_module_memoized(referenced_object) : td_global_latest_transitively_referenced_module_memoized(referenced_object);
        if (translator_utilities.NIL != latest_module_referenced_by_evaluation && translator_utilities.NIL == td_module_earlier(latest_module_referenced_by_evaluation, referencing_module)) {
            thread.resetMultipleValues();
            final SubLObject candidate_methods = (translator_utilities.$kw23$METHOD == reference_type) ? td_justify_method_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation) : td_justify_global_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation);
            final SubLObject candidate_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (translator_utilities.NIL != td_module_later(latest_module_referenced_by_evaluation, referencing_module)) {
                justifying_methods = candidate_methods;
                justifying_globals = candidate_globals;
            }
            else {
                SubLObject cdolist_list_var = candidate_methods;
                SubLObject candidate_method = (SubLObject)translator_utilities.NIL;
                candidate_method = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    final SubLObject definition_position = td_method_definition_position(candidate_method);
                    if (definition_position.numG(referencing_position)) {
                        final SubLObject item_var = candidate_method;
                        if (translator_utilities.NIL == conses_high.member(item_var, justifying_methods, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                            justifying_methods = (SubLObject)ConsesLow.cons(item_var, justifying_methods);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_method = cdolist_list_var.first();
                }
                cdolist_list_var = candidate_globals;
                SubLObject candidate_global = (SubLObject)translator_utilities.NIL;
                candidate_global = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    final SubLObject definition_position = td_global_definition_position(candidate_global);
                    if (definition_position.numG(referencing_position)) {
                        final SubLObject item_var = candidate_global;
                        if (translator_utilities.NIL == conses_high.member(item_var, justifying_globals, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                            justifying_globals = (SubLObject)ConsesLow.cons(item_var, justifying_globals);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_global = cdolist_list_var.first();
                }
                justifying_methods = Sequences.nreverse(justifying_methods);
                justifying_globals = Sequences.nreverse(justifying_globals);
            }
        }
        if ((translator_utilities.NIL != td_module_later(referenced_module, referencing_module) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position))) && translator_utilities.NIL == conses_high.member(referenced_object, justifying_methods, Symbols.symbol_function((SubLObject)translator_utilities.EQL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
            justifying_methods = (SubLObject)ConsesLow.cons(referenced_object, justifying_methods);
        }
        return Values.values(justifying_methods, justifying_globals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 58985L)
    public static SubLObject td_early_global_binding_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject referenced_global) {
        final SubLObject referenced_module = td_global_defining_module(referenced_global);
        if (translator_utilities.NIL != referenced_module) {
            final SubLObject referenced_position = td_global_definition_position(referenced_global);
            return (SubLObject)SubLObjectFactory.makeBoolean(translator_utilities.NIL != td_module_later(referenced_module, referencing_module) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position)));
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 59755L)
    public static SubLObject show_early_reference_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == translator_utilities.UNPROVIDED) {
            violation_specs = all_early_reference_violations((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = (SubLObject)translator_utilities.NIL;
        violation_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_early_reference_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 60146L)
    public static SubLObject show_one_early_reference_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(violation_spec, violation_spec, (SubLObject)translator_utilities.$list50);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
        def_type = current.first();
        final SubLObject def_args;
        current = (def_args = current.rest());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
        final SubLObject temp_$64 = current.rest();
        current = current.first();
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        SubLObject ref_object = (SubLObject)translator_utilities.NIL;
        SubLObject module = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
        ref_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
        ref_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
        module = current.first();
        current = current.rest();
        if (translator_utilities.NIL == current) {
            current = temp_$64;
            SubLObject justifying_methods = (SubLObject)translator_utilities.NIL;
            SubLObject justifying_globals = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
            justifying_methods = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, violation_spec, (SubLObject)translator_utilities.$list50);
            justifying_globals = current.first();
            current = current.rest();
            if (translator_utilities.NIL == current) {
                SubLObject pcase_var = def_type;
                if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
                    SubLObject current_$66;
                    final SubLObject datum_$65 = current_$66 = def_args;
                    SubLObject module_$67 = (SubLObject)translator_utilities.NIL;
                    SubLObject position = (SubLObject)translator_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$66, datum_$65, (SubLObject)translator_utilities.$list51);
                    module_$67 = current_$66.first();
                    current_$66 = current_$66.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$66, datum_$65, (SubLObject)translator_utilities.$list51);
                    position = current_$66.first();
                    current_$66 = current_$66.rest();
                    if (translator_utilities.NIL == current_$66) {
                        PrintLow.format(stream, (SubLObject)translator_utilities.$str52$__Top_level_form_in__A_at__S__, module_$67, position);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$65, (SubLObject)translator_utilities.$list51);
                    }
                }
                else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                    SubLObject current_$67;
                    final SubLObject datum_$66 = current_$67 = def_args;
                    SubLObject def_object = (SubLObject)translator_utilities.NIL;
                    SubLObject module_$68 = (SubLObject)translator_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$67, datum_$66, (SubLObject)translator_utilities.$list43);
                    def_object = current_$67.first();
                    current_$67 = current_$67.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$67, datum_$66, (SubLObject)translator_utilities.$list43);
                    module_$68 = current_$67.first();
                    current_$67 = current_$67.rest();
                    if (translator_utilities.NIL == current_$67) {
                        PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, def_object, module_$68);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$66, (SubLObject)translator_utilities.$list43);
                    }
                }
                else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                    SubLObject current_$68;
                    final SubLObject datum_$67 = current_$68 = def_args;
                    SubLObject def_object = (SubLObject)translator_utilities.NIL;
                    SubLObject module_$69 = (SubLObject)translator_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$68, datum_$67, (SubLObject)translator_utilities.$list43);
                    def_object = current_$68.first();
                    current_$68 = current_$68.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$68, datum_$67, (SubLObject)translator_utilities.$list43);
                    module_$69 = current_$68.first();
                    current_$68 = current_$68.rest();
                    if (translator_utilities.NIL == current_$68) {
                        PrintLow.format(stream, (SubLObject)translator_utilities.$str32$__Global__A_in__A__, def_object, module_$69);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$67, (SubLObject)translator_utilities.$list43);
                    }
                }
                PrintLow.format(stream, (SubLObject)translator_utilities.$str33$_references);
                pcase_var = ref_type;
                if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str35$__method__A_from__A__, ref_object, module);
                }
                else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str36$__global__A_from__A__, ref_object, module);
                }
                PrintLow.format(stream, (SubLObject)translator_utilities.$str53$_before_it_is);
                if (translator_utilities.NIL == justifying_globals && translator_utilities.NIL != list_utilities.singletonP(justifying_methods) && ref_object.eql(justifying_methods.first())) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str54$_defined__);
                }
                else {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str55$_completely_defined_due_to__);
                    SubLObject cdolist_list_var = justifying_methods;
                    SubLObject justifying_method = (SubLObject)translator_utilities.NIL;
                    justifying_method = cdolist_list_var.first();
                    while (translator_utilities.NIL != cdolist_list_var) {
                        PrintLow.format(stream, (SubLObject)translator_utilities.$str56$method__A__, justifying_method);
                        cdolist_list_var = cdolist_list_var.rest();
                        justifying_method = cdolist_list_var.first();
                    }
                    cdolist_list_var = justifying_globals;
                    SubLObject justifying_global = (SubLObject)translator_utilities.NIL;
                    justifying_global = cdolist_list_var.first();
                    while (translator_utilities.NIL != cdolist_list_var) {
                        PrintLow.format(stream, (SubLObject)translator_utilities.$str57$global__A__, justifying_global);
                        cdolist_list_var = cdolist_list_var.rest();
                        justifying_global = cdolist_list_var.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(violation_spec, (SubLObject)translator_utilities.$list50);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(violation_spec, (SubLObject)translator_utilities.$list50);
        }
        return violation_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 61552L)
    public static SubLObject all_early_macro_use_violations(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_macro_use_violations = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$74 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str58$Identifying_early_macro_use_viola, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_macro_use_violations = cdolist_list_var = module_early_macro_use_violations(module);
                            SubLObject early_macro_use_violation = (SubLObject)translator_utilities.NIL;
                            early_macro_use_violation = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_early_macro_use_violations = (SubLObject)ConsesLow.cons(early_macro_use_violation, all_early_macro_use_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_macro_use_violation = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$74, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_early_macro_use_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 62357L)
    public static SubLObject module_early_macro_use_violations(final SubLObject defined_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject early_macro_use_violations = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$77;
            final SubLObject referenced_methods = cdolist_list_var_$77 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$77.first();
            while (translator_utilities.NIL != cdolist_list_var_$77) {
                if (translator_utilities.NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (translator_utilities.NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                            early_macro_use_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
                        }
                    }
                }
                cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                referenced_method = cdolist_list_var_$77.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject defined_position = td_global_definition_position(defined_global);
            SubLObject cdolist_list_var_$78;
            final SubLObject referenced_methods = cdolist_list_var_$78 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$78.first();
            while (translator_utilities.NIL != cdolist_list_var_$78) {
                if (translator_utilities.NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (translator_utilities.NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                            early_macro_use_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
                        }
                    }
                }
                cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                referenced_method = cdolist_list_var_$78.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = (SubLObject)translator_utilities.NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            if (translator_utilities.NIL != td_method_macro_p(referenced_method2)) {
                final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
                if (translator_utilities.NIL != referenced_module2) {
                    final SubLObject referenced_position2 = td_method_definition_position(referenced_method2);
                    SubLObject cdolist_list_var_$79;
                    final SubLObject module_positions = cdolist_list_var_$79 = td_module_positions_calling_method(defined_module, referenced_method2);
                    SubLObject module_position = (SubLObject)translator_utilities.NIL;
                    module_position = cdolist_list_var_$79.first();
                    while (translator_utilities.NIL != cdolist_list_var_$79) {
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, module_position, referenced_module2, referenced_position2, referenced_method2);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (translator_utilities.NIL != justifying_methods || translator_utilities.NIL != justifying_globals) {
                            early_macro_use_violations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module, module_position), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method2, referenced_module2), justifying_methods, justifying_globals), early_macro_use_violations);
                        }
                        cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                        module_position = cdolist_list_var_$79.first();
                    }
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(early_macro_use_violations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 65800L)
    public static SubLObject show_early_macro_use_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == translator_utilities.UNPROVIDED) {
            violation_specs = all_early_macro_use_violations((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return show_early_reference_violations(violation_specs, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 66108L)
    public static SubLObject show_one_early_macro_use_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return show_one_early_reference_violation(violation_spec, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 66281L)
    public static SubLObject all_undefined_references(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_undefined_references = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$80 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str59$Identifying_undefined_references, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject undefined_references = cdolist_list_var = module_undefined_references(module);
                            SubLObject undefined_reference = (SubLObject)translator_utilities.NIL;
                            undefined_reference = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_undefined_references = (SubLObject)ConsesLow.cons(undefined_reference, all_undefined_references);
                                cdolist_list_var = cdolist_list_var.rest();
                                undefined_reference = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$80, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_undefined_references);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 66983L)
    public static SubLObject module_undefined_references(final SubLObject defined_module) {
        SubLObject undefined_references = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$83;
            final SubLObject referenced_methods = cdolist_list_var_$83 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$83.first();
            while (translator_utilities.NIL != cdolist_list_var_$83) {
                if (translator_utilities.NIL == td_predefined_method_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (translator_utilities.NIL == referenced_module) {
                        undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method)), undefined_references);
                    }
                }
                cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                referenced_method = cdolist_list_var_$83.first();
            }
            SubLObject cdolist_list_var_$84;
            final SubLObject referenced_globals = cdolist_list_var_$84 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$84.first();
            while (translator_utilities.NIL != cdolist_list_var_$84) {
                if (translator_utilities.NIL == td_predefined_global_p(referenced_global)) {
                    final SubLObject referenced_module = td_global_defining_module(referenced_global);
                    if (translator_utilities.NIL == referenced_module) {
                        undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global)), undefined_references);
                    }
                }
                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                referenced_global = cdolist_list_var_$84.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85;
            final SubLObject referenced_methods = cdolist_list_var_$85 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = (SubLObject)translator_utilities.NIL;
            referenced_method = cdolist_list_var_$85.first();
            while (translator_utilities.NIL != cdolist_list_var_$85) {
                if (translator_utilities.NIL == td_predefined_method_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (translator_utilities.NIL == referenced_module) {
                        undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method)), undefined_references);
                    }
                }
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                referenced_method = cdolist_list_var_$85.first();
            }
            SubLObject cdolist_list_var_$86;
            final SubLObject referenced_globals = cdolist_list_var_$86 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = (SubLObject)translator_utilities.NIL;
            referenced_global = cdolist_list_var_$86.first();
            while (translator_utilities.NIL != cdolist_list_var_$86) {
                if (translator_utilities.NIL == td_predefined_global_p(referenced_global)) {
                    final SubLObject referenced_module = td_global_defining_module(referenced_global);
                    if (translator_utilities.NIL == referenced_module) {
                        undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global)), undefined_references);
                    }
                }
                cdolist_list_var_$86 = cdolist_list_var_$86.rest();
                referenced_global = cdolist_list_var_$86.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = (SubLObject)translator_utilities.NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            if (translator_utilities.NIL == td_predefined_method_p(referenced_method2)) {
                final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
                if (translator_utilities.NIL == referenced_module2) {
                    undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, referenced_method2)), undefined_references);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        }
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = (SubLObject)translator_utilities.NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (translator_utilities.NIL != cdolist_list_var2) {
            if (translator_utilities.NIL == td_predefined_global_p(referenced_global2)) {
                final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
                if (translator_utilities.NIL == referenced_module2) {
                    undefined_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module), (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, referenced_global2)), undefined_references);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        }
        return Sequences.nreverse(undefined_references);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 70194L)
    public static SubLObject show_undefined_references(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == translator_utilities.UNPROVIDED) {
            reference_specs = all_undefined_references((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = reference_specs;
        SubLObject reference_spec = (SubLObject)translator_utilities.NIL;
        reference_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_undefined_reference(reference_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            reference_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 70561L)
    public static SubLObject show_one_undefined_reference(final SubLObject reference_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        cdestructuring_bind.destructuring_bind_must_consp(reference_spec, reference_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp = reference_spec.rest();
        SubLObject current = reference_spec.first();
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, reference_spec, (SubLObject)translator_utilities.$list41);
        def_type = current.first();
        final SubLObject def_args;
        current = (def_args = current.rest());
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, reference_spec, (SubLObject)translator_utilities.$list41);
        final SubLObject temp_$87 = current.rest();
        current = current.first();
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, reference_spec, (SubLObject)translator_utilities.$list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = (ref_args = current.rest());
        current = temp_$87;
        if (translator_utilities.NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
                SubLObject current_$89;
                final SubLObject datum_$88 = current_$89 = def_args;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$89, datum_$88, (SubLObject)translator_utilities.$list42);
                module = current_$89.first();
                current_$89 = current_$89.rest();
                if (translator_utilities.NIL == current_$89) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str29$__Top_level_form_in__A__, module);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$88, (SubLObject)translator_utilities.$list42);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$90;
                final SubLObject datum_$89 = current_$90 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$90, datum_$89, (SubLObject)translator_utilities.$list43);
                def_object = current_$90.first();
                current_$90 = current_$90.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$90, datum_$89, (SubLObject)translator_utilities.$list43);
                module2 = current_$90.first();
                current_$90 = current_$90.rest();
                if (translator_utilities.NIL == current_$90) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, def_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$89, (SubLObject)translator_utilities.$list43);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$91;
                final SubLObject datum_$90 = current_$91 = def_args;
                SubLObject def_object = (SubLObject)translator_utilities.NIL;
                SubLObject module2 = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)translator_utilities.$list43);
                def_object = current_$91.first();
                current_$91 = current_$91.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$91, datum_$90, (SubLObject)translator_utilities.$list43);
                module2 = current_$91.first();
                current_$91 = current_$91.rest();
                if (translator_utilities.NIL == current_$91) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str32$__Global__A_in__A__, def_object, module2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$90, (SubLObject)translator_utilities.$list43);
                }
            }
            PrintLow.format(stream, (SubLObject)translator_utilities.$str60$_references_undefined);
            pcase_var = ref_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                SubLObject current_$92;
                final SubLObject datum_$91 = current_$92 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$92, datum_$91, (SubLObject)translator_utilities.$list61);
                ref_object = current_$92.first();
                current_$92 = current_$92.rest();
                if (translator_utilities.NIL == current_$92) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str62$__method__A__, ref_object);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$91, (SubLObject)translator_utilities.$list61);
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                SubLObject current_$93;
                final SubLObject datum_$92 = current_$93 = ref_args;
                SubLObject ref_object = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$93, datum_$92, (SubLObject)translator_utilities.$list61);
                ref_object = current_$93.first();
                current_$93 = current_$93.rest();
                if (translator_utilities.NIL == current_$93) {
                    PrintLow.format(stream, (SubLObject)translator_utilities.$str63$__global__A__, ref_object);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$92, (SubLObject)translator_utilities.$list61);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(reference_spec, (SubLObject)translator_utilities.$list41);
        }
        return reference_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 71465L)
    public static SubLObject all_multiple_definitions(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_multiple_definitions = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                module = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$98;
                    final SubLObject multiple_definitions = cdolist_list_var_$98 = module_multiple_definitions(module);
                    SubLObject multiple_definition = (SubLObject)translator_utilities.NIL;
                    multiple_definition = cdolist_list_var_$98.first();
                    while (translator_utilities.NIL != cdolist_list_var_$98) {
                        final SubLObject item_var = multiple_definition;
                        if (translator_utilities.NIL == conses_high.member(item_var, all_multiple_definitions, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                            all_multiple_definitions = (SubLObject)ConsesLow.cons(item_var, all_multiple_definitions);
                        }
                        cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                        multiple_definition = cdolist_list_var_$98.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_multiple_definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 72134L)
    public static SubLObject module_multiple_definitions(final SubLObject defined_module) {
        SubLObject multiple_definitions = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (translator_utilities.NIL != td_method_has_multiple_definitionsP(defined_method)) {
                final SubLObject position_specs = td_method_definition_positions(defined_method);
                multiple_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, position_specs), multiple_definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = (SubLObject)translator_utilities.NIL;
        defined_global = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (translator_utilities.NIL != td_global_has_multiple_definitionsP(defined_global)) {
                final SubLObject position_specs = td_global_definition_positions(defined_global);
                multiple_definitions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, position_specs), multiple_definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        }
        return Sequences.nreverse(multiple_definitions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 73106L)
    public static SubLObject show_multiple_definitions(SubLObject definition_specs, SubLObject stream) {
        if (definition_specs == translator_utilities.UNPROVIDED) {
            definition_specs = all_multiple_definitions((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = definition_specs;
        SubLObject definition_spec = (SubLObject)translator_utilities.NIL;
        definition_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_multiple_definition(definition_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            definition_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 73478L)
    public static SubLObject show_one_multiple_definition(final SubLObject definition_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject def_type = (SubLObject)translator_utilities.NIL;
        SubLObject def_object = (SubLObject)translator_utilities.NIL;
        SubLObject definition_positions = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(definition_spec, definition_spec, (SubLObject)translator_utilities.$list64);
        def_type = definition_spec.first();
        SubLObject current = definition_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, definition_spec, (SubLObject)translator_utilities.$list64);
        def_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, definition_spec, (SubLObject)translator_utilities.$list64);
        definition_positions = current.first();
        current = current.rest();
        if (translator_utilities.NIL == current) {
            final SubLObject pcase_var = def_type;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
                PrintLow.format(stream, (SubLObject)translator_utilities.$str65$__Method__A_has_multiple_definiti, def_object);
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
                PrintLow.format(stream, (SubLObject)translator_utilities.$str66$__Global__A_has_multiple_definiti, def_object);
            }
            SubLObject cdolist_list_var = definition_positions;
            SubLObject definition_position = (SubLObject)translator_utilities.NIL;
            definition_position = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                SubLObject current_$101;
                final SubLObject datum_$100 = current_$101 = definition_position;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                SubLObject file_position = (SubLObject)translator_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$101, datum_$100, (SubLObject)translator_utilities.$list67);
                module = current_$101.first();
                current_$101 = (file_position = current_$101.rest());
                PrintLow.format(stream, (SubLObject)translator_utilities.$str68$_____A_at_position__S, module, file_position);
                cdolist_list_var = cdolist_list_var.rest();
                definition_position = cdolist_list_var.first();
            }
            streams_high.terpri(stream);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(definition_spec, (SubLObject)translator_utilities.$list64);
        }
        return definition_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 74103L)
    public static SubLObject all_early_constant_references(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_constant_references = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = (SubLObject)translator_utilities.NIL;
                module = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$102;
                    final SubLObject early_constant_references = cdolist_list_var_$102 = module_early_constant_references(module);
                    SubLObject early_constant_reference = (SubLObject)translator_utilities.NIL;
                    early_constant_reference = cdolist_list_var_$102.first();
                    while (translator_utilities.NIL != cdolist_list_var_$102) {
                        final SubLObject item_var = early_constant_reference;
                        if (translator_utilities.NIL == conses_high.member(item_var, all_early_constant_references, Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), Symbols.symbol_function((SubLObject)translator_utilities.IDENTITY))) {
                            all_early_constant_references = (SubLObject)ConsesLow.cons(item_var, all_early_constant_references);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        early_constant_reference = cdolist_list_var_$102.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_early_constant_references);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 74823L)
    public static SubLObject module_early_constant_references(final SubLObject defined_module) {
        final SubLObject referenced_method = (SubLObject)translator_utilities.$sym69$READER_MAKE_CONSTANT_SHELL;
        final SubLObject referenced_module = td_method_defining_module(referenced_method);
        if (translator_utilities.NIL != td_module_earlier(defined_module, referenced_module)) {
            SubLObject early_constant_references = (SubLObject)translator_utilities.NIL;
            SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
            SubLObject defined_method = (SubLObject)translator_utilities.NIL;
            defined_method = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                if (translator_utilities.NIL != td_method_called_by_methodP(referenced_method, defined_method)) {
                    early_constant_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw23$METHOD, defined_method, defined_module), early_constant_references);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defined_method = cdolist_list_var.first();
            }
            cdolist_list_var = td_globals_defined_by_module(defined_module);
            SubLObject defined_global = (SubLObject)translator_utilities.NIL;
            defined_global = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                if (translator_utilities.NIL != td_method_called_by_globalP(referenced_method, defined_global)) {
                    early_constant_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw24$GLOBAL, defined_global, defined_module), early_constant_references);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defined_global = cdolist_list_var.first();
            }
            if (translator_utilities.NIL != td_method_called_by_moduleP(referenced_method, defined_module)) {
                early_constant_references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw25$MODULE, defined_module), early_constant_references);
            }
            return Sequences.nreverse(early_constant_references);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 76075L)
    public static SubLObject show_early_constant_references(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == translator_utilities.UNPROVIDED) {
            reference_specs = all_early_constant_references((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = reference_specs;
        SubLObject reference_spec = (SubLObject)translator_utilities.NIL;
        reference_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            show_one_early_constant_reference(reference_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            reference_spec = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 76462L)
    public static SubLObject show_one_early_constant_reference(final SubLObject reference_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject ref_type = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(reference_spec, reference_spec, (SubLObject)translator_utilities.$list70);
        ref_type = reference_spec.first();
        final SubLObject ref_args;
        final SubLObject current = ref_args = reference_spec.rest();
        final SubLObject pcase_var = ref_type;
        if (pcase_var.eql((SubLObject)translator_utilities.$kw25$MODULE)) {
            SubLObject current_$105;
            final SubLObject datum_$104 = current_$105 = ref_args;
            SubLObject module = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$105, datum_$104, (SubLObject)translator_utilities.$list42);
            module = current_$105.first();
            current_$105 = current_$105.rest();
            if (translator_utilities.NIL == current_$105) {
                PrintLow.format(stream, (SubLObject)translator_utilities.$str29$__Top_level_form_in__A__, module);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$104, (SubLObject)translator_utilities.$list42);
            }
        }
        else if (pcase_var.eql((SubLObject)translator_utilities.$kw23$METHOD)) {
            SubLObject current_$106;
            final SubLObject datum_$105 = current_$106 = ref_args;
            SubLObject ref_object = (SubLObject)translator_utilities.NIL;
            SubLObject module2 = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$106, datum_$105, (SubLObject)translator_utilities.$list45);
            ref_object = current_$106.first();
            current_$106 = current_$106.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$106, datum_$105, (SubLObject)translator_utilities.$list45);
            module2 = current_$106.first();
            current_$106 = current_$106.rest();
            if (translator_utilities.NIL == current_$106) {
                PrintLow.format(stream, (SubLObject)translator_utilities.$str31$__Method__A_in__A__, ref_object, module2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$105, (SubLObject)translator_utilities.$list45);
            }
        }
        else if (pcase_var.eql((SubLObject)translator_utilities.$kw24$GLOBAL)) {
            SubLObject current_$107;
            final SubLObject datum_$106 = current_$107 = ref_args;
            SubLObject ref_object = (SubLObject)translator_utilities.NIL;
            SubLObject module2 = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$107, datum_$106, (SubLObject)translator_utilities.$list45);
            ref_object = current_$107.first();
            current_$107 = current_$107.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$107, datum_$106, (SubLObject)translator_utilities.$list45);
            module2 = current_$107.first();
            current_$107 = current_$107.rest();
            if (translator_utilities.NIL == current_$107) {
                PrintLow.format(stream, (SubLObject)translator_utilities.$str32$__Global__A_in__A__, ref_object, module2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$106, (SubLObject)translator_utilities.$list45);
            }
        }
        PrintLow.format(stream, (SubLObject)translator_utilities.$str71$references____before_it_is_comple);
        return reference_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 77125L)
    public static SubLObject show_api_macros_with_non_api_expansions(SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject problems = (SubLObject)translator_utilities.NIL;
        SubLObject macro = (SubLObject)translator_utilities.NIL;
        SubLObject ignore = (SubLObject)translator_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(utilities_macros.$api_predefined_macro_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                macro = Hashtables.getEntryKey(cdohash_entry);
                ignore = Hashtables.getEntryValue(cdohash_entry);
                final SubLObject non_api_expansions = non_api_expansions_for_api_macro(macro);
                if (translator_utilities.NIL != non_api_expansions) {
                    problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(macro, non_api_expansions), problems);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        if (translator_utilities.NIL != problems) {
            final SubLObject build_problem_spec = (SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw72$API_MACRO_VISIBILITY, problems);
            show_one_build_problem(build_problem_spec, stream);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 77832L)
    public static SubLObject show_one_api_macro_visibility_problem(final SubLObject violation_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject macro = (SubLObject)translator_utilities.NIL;
        SubLObject non_api_expansions = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(violation_spec, violation_spec, (SubLObject)translator_utilities.$list73);
        macro = violation_spec.first();
        final SubLObject current = non_api_expansions = violation_spec.rest();
        PrintLow.format(stream, (SubLObject)translator_utilities.$str74$__API_macro__A_expands_to_non_API, macro, non_api_expansions);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 78117L)
    public static SubLObject non_api_expansions_for_api_macro(final SubLObject macro) {
        assert translator_utilities.NIL != utilities_macros.api_predefined_macro_p(macro) : macro;
        SubLObject non_api_expansions = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_macro_expansion_calls(macro);
        SubLObject method = (SubLObject)translator_utilities.NIL;
        method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (translator_utilities.NIL == utilities_macros.api_predefined_macro_p(method) && translator_utilities.NIL == utilities_macros.api_predefined_function_p(method)) {
                non_api_expansions = (SubLObject)ConsesLow.cons(method, non_api_expansions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return non_api_expansions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 78568L)
    public static SubLObject all_build_problems(SubLObject v_modules) {
        if (v_modules == translator_utilities.UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_build_problems = (SubLObject)translator_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$110 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)translator_utilities.$str76$Determining_build_problems, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)translator_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)translator_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)translator_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = (SubLObject)translator_utilities.NIL;
                        module = csome_list_var.first();
                        while (translator_utilities.NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject build_problems = cdolist_list_var = module_build_problems(module);
                            SubLObject build_problem = (SubLObject)translator_utilities.NIL;
                            build_problem = cdolist_list_var.first();
                            while (translator_utilities.NIL != cdolist_list_var) {
                                all_build_problems = (SubLObject)ConsesLow.cons(build_problem, all_build_problems);
                                cdolist_list_var = cdolist_list_var.rest();
                                build_problem = cdolist_list_var.first();
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)translator_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$110, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)translator_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        all_build_problems = Sequences.nreverse(all_build_problems);
        return all_build_problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 79300L)
    public static SubLObject module_build_problems(final SubLObject defined_module) {
        SubLObject build_problems = (SubLObject)translator_utilities.NIL;
        final SubLObject multiple_definitions = module_multiple_definitions(defined_module);
        if (translator_utilities.NIL != multiple_definitions) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw77$MULTIPLE_DEFINITIONS, multiple_definitions), build_problems);
        }
        final SubLObject undefined_references = module_undefined_references(defined_module);
        if (translator_utilities.NIL != undefined_references) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw78$UNDEFINED_REFERENCES, undefined_references), build_problems);
        }
        final SubLObject privacy_violations = module_privacy_violations(defined_module);
        if (translator_utilities.NIL != privacy_violations) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw79$PRIVACY_VIOLATIONS, privacy_violations), build_problems);
        }
        final SubLObject early_constant_references = module_early_constant_references(defined_module);
        if (translator_utilities.NIL != early_constant_references) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw80$EARLY_CONSTANT_REFERENCES, early_constant_references), build_problems);
        }
        final SubLObject early_reference_violations = module_early_reference_violations(defined_module);
        if (translator_utilities.NIL != early_reference_violations) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw81$EARLY_REFERENCE_VIOLATIONS, early_reference_violations), build_problems);
        }
        final SubLObject early_rebinding_violations = module_early_rebinding_violations(defined_module);
        if (translator_utilities.NIL != early_rebinding_violations) {
            build_problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)translator_utilities.$kw82$EARLY_REBINDING_VIOLATIONS, early_rebinding_violations), build_problems);
        }
        return Sequences.nreverse(build_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 80769L)
    public static SubLObject show_build_problems(SubLObject build_problem_specs, SubLObject stream) {
        if (build_problem_specs == translator_utilities.UNPROVIDED) {
            build_problem_specs = all_build_problems((SubLObject)translator_utilities.UNPROVIDED);
        }
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (translator_utilities.NIL == build_problem_specs) {
            PrintLow.format(stream, (SubLObject)translator_utilities.$str83$__No_build_problems_);
        }
        else {
            SubLObject cdolist_list_var = build_problem_specs;
            SubLObject build_problem_spec = (SubLObject)translator_utilities.NIL;
            build_problem_spec = cdolist_list_var.first();
            while (translator_utilities.NIL != cdolist_list_var) {
                show_one_build_problem(build_problem_spec, stream);
                cdolist_list_var = cdolist_list_var.rest();
                build_problem_spec = cdolist_list_var.first();
            }
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 81228L)
    public static SubLObject show_one_build_problem(final SubLObject build_problem_spec, SubLObject stream) {
        if (stream == translator_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject problem_class = (SubLObject)translator_utilities.NIL;
        SubLObject problems = (SubLObject)translator_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(build_problem_spec, build_problem_spec, (SubLObject)translator_utilities.$list84);
        problem_class = build_problem_spec.first();
        SubLObject current = build_problem_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, build_problem_spec, (SubLObject)translator_utilities.$list84);
        problems = current.first();
        current = current.rest();
        if (translator_utilities.NIL == current) {
            final SubLObject pcase_var = problem_class;
            if (pcase_var.eql((SubLObject)translator_utilities.$kw77$MULTIPLE_DEFINITIONS)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_multiple_definition(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw78$UNDEFINED_REFERENCES)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_undefined_reference(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw79$PRIVACY_VIOLATIONS)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_privacy_violation(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw80$EARLY_CONSTANT_REFERENCES)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_early_constant_reference(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw81$EARLY_REFERENCE_VIOLATIONS)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_early_reference_violation(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw82$EARLY_REBINDING_VIOLATIONS)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_early_rebinding_violation(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else if (pcase_var.eql((SubLObject)translator_utilities.$kw72$API_MACRO_VISIBILITY)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = (SubLObject)translator_utilities.NIL;
                problem = cdolist_list_var.first();
                while (translator_utilities.NIL != cdolist_list_var) {
                    show_one_api_macro_visibility_problem(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
            else {
                Errors.error((SubLObject)translator_utilities.$str85$Unknown_build_problem_class__S, problem_class);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(build_problem_spec, (SubLObject)translator_utilities.$list84);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 82349L)
    public static SubLObject count_build_problems(SubLObject build_problem_specs) {
        if (build_problem_specs == translator_utilities.UNPROVIDED) {
            build_problem_specs = all_build_problems((SubLObject)translator_utilities.UNPROVIDED);
        }
        SubLObject total = (SubLObject)translator_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = build_problem_specs;
        SubLObject build_problem_spec = (SubLObject)translator_utilities.NIL;
        build_problem_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = build_problem_spec;
            SubLObject problem_class = (SubLObject)translator_utilities.NIL;
            SubLObject problems = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)translator_utilities.$list84);
            problem_class = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)translator_utilities.$list84);
            problems = current.first();
            current = current.rest();
            if (translator_utilities.NIL == current) {
                total = Numbers.add(total, Sequences.length(problems));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)translator_utilities.$list84);
            }
            cdolist_list_var = cdolist_list_var.rest();
            build_problem_spec = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 82741L)
    public static SubLObject build_problem_counts_by_module(SubLObject build_problem_specs) {
        if (build_problem_specs == translator_utilities.UNPROVIDED) {
            build_problem_specs = all_build_problems((SubLObject)translator_utilities.UNPROVIDED);
        }
        final SubLObject table = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)translator_utilities.EQUAL), (SubLObject)translator_utilities.ZERO_INTEGER);
        SubLObject cdolist_list_var = build_problem_specs;
        SubLObject build_problem_spec = (SubLObject)translator_utilities.NIL;
        build_problem_spec = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = build_problem_spec;
            SubLObject problem_class = (SubLObject)translator_utilities.NIL;
            SubLObject problems = (SubLObject)translator_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)translator_utilities.$list84);
            problem_class = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)translator_utilities.$list84);
            problems = current.first();
            current = current.rest();
            if (translator_utilities.NIL == current) {
                final SubLObject problem = problems.first();
                final SubLObject module = list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)translator_utilities.$sym86$STRINGP), problem, (SubLObject)translator_utilities.UNPROVIDED);
                if (module.isString()) {
                    dictionary_utilities.dictionary_increment(table, module, Sequences.length(problems));
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)translator_utilities.$list84);
            }
            cdolist_list_var = cdolist_list_var.rest();
            build_problem_spec = cdolist_list_var.first();
        }
        SubLObject problem_counts = dictionary_utilities.dictionary_to_alist(table);
        problem_counts = Sort.sort(problem_counts, Symbols.symbol_function((SubLObject)translator_utilities.$sym87$_), Symbols.symbol_function((SubLObject)translator_utilities.$sym88$CDR));
        return problem_counts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 83361L)
    public static SubLObject td_method_co_called_methods(final SubLObject called_method) {
        SubLObject all_co_called_methods = (SubLObject)translator_utilities.$kw89$UNINITIALIZED;
        SubLObject cdolist_list_var = td_methods_calling_method(called_method);
        SubLObject calling_method = (SubLObject)translator_utilities.NIL;
        calling_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject co_called_methods = td_methods_called_by_method(calling_method);
            if (translator_utilities.$kw89$UNINITIALIZED == all_co_called_methods) {
                all_co_called_methods = conses_high.copy_list(co_called_methods);
            }
            else {
                all_co_called_methods = conses_high.nintersection(all_co_called_methods, conses_high.copy_list(co_called_methods), Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            calling_method = cdolist_list_var.first();
        }
        if (translator_utilities.$kw89$UNINITIALIZED != all_co_called_methods) {
            return Sequences.delete(called_method, all_co_called_methods, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED, (SubLObject)translator_utilities.UNPROVIDED);
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 84301L)
    public static SubLObject td_method_co_called_globals(final SubLObject called_method) {
        SubLObject all_co_called_globals = (SubLObject)translator_utilities.$kw89$UNINITIALIZED;
        SubLObject cdolist_list_var = td_methods_calling_method(called_method);
        SubLObject calling_method = (SubLObject)translator_utilities.NIL;
        calling_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            final SubLObject co_called_globals = td_globals_called_by_method(calling_method);
            if (translator_utilities.$kw89$UNINITIALIZED == all_co_called_globals) {
                all_co_called_globals = conses_high.copy_list(co_called_globals);
            }
            else {
                all_co_called_globals = conses_high.nintersection(all_co_called_globals, conses_high.copy_list(co_called_globals), Symbols.symbol_function((SubLObject)translator_utilities.EQ), (SubLObject)translator_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            calling_method = cdolist_list_var.first();
        }
        if (translator_utilities.$kw89$UNINITIALIZED != all_co_called_globals) {
            return all_co_called_globals;
        }
        return (SubLObject)translator_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 85043L)
    public static SubLObject td_macro_expansion_calls(final SubLObject macro) {
        return Values.values(td_method_co_called_methods(macro), td_method_co_called_globals(macro));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/translator-utilities.lisp", position = 85278L)
    public static SubLObject td_possible_orphan_methods_from_module(final SubLObject defined_module) {
        SubLObject unused_methods = (SubLObject)translator_utilities.NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = (SubLObject)translator_utilities.NIL;
        defined_method = cdolist_list_var.first();
        while (translator_utilities.NIL != cdolist_list_var) {
            if (translator_utilities.NIL == html_macros.html_handler_functionP(defined_method) && translator_utilities.NIL == utilities_macros.funcall_helper_functionP(defined_method) && translator_utilities.NIL == access_macros.external_function_p(defined_method) && translator_utilities.NIL == td_methods_calling_method(defined_method) && translator_utilities.NIL == string_utilities.starts_with(Symbols.symbol_name(defined_method), (SubLObject)translator_utilities.$str90$CLEAR) && translator_utilities.NIL == string_utilities.starts_with(Symbols.symbol_name(defined_method), (SubLObject)translator_utilities.$str91$REMOVE)) {
                unused_methods = (SubLObject)ConsesLow.cons(defined_method, unused_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        }
        return unused_methods;
    }
    
    public static SubLObject declare_translator_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_p", "TD-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_current_translation", "TD-CURRENT-TRANSLATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_translation_modules", "TD-TRANSLATION-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_translation_modules_memoized_internal", "TD-TRANSLATION-MODULES-MEMOIZED-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_translation_modules_memoized", "TD-TRANSLATION-MODULES-MEMOIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_earlier", "TD-MODULE-EARLIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_translation_position_internal", "TD-MODULE-TRANSLATION-POSITION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_translation_position", "TD-MODULE-TRANSLATION-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_later", "TD-MODULE-LATER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_sort_modules_by_load_order", "TD-SORT-MODULES-BY-LOAD-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_earlier_memoized", "TD-MODULE-EARLIER-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_later_memoized", "TD-MODULE-LATER-MEMOIZED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_features", "TD-MODULE-FEATURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_translation_features", "TD-TRANSLATION-FEATURES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_pathname", "TD-MODULE-PATHNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_predefined_method_p", "TD-PREDEFINED-METHOD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_predefined_global_p", "TD-PREDEFINED-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_macro_p", "TD-METHOD-MACRO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_defining_module", "TD-METHOD-DEFINING-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_definition_position", "TD-METHOD-DEFINITION-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_has_multiple_definitionsP", "TD-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_definition_positions", "TD-METHOD-DEFINITION-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_formal_arglist", "TD-METHOD-FORMAL-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_binding_type", "TD-GLOBAL-BINDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_defining_module", "TD-GLOBAL-DEFINING-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_definition_position", "TD-GLOBAL-DEFINITION-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_has_multiple_definitionsP", "TD-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_definition_positions", "TD-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_defined_by_module", "TD-METHODS-DEFINED-BY-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_defined_by_module", "TD-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_called_by_method", "TD-GLOBALS-CALLED-BY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_rebound_by_method", "TD-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_called_by_method", "TD-METHODS-CALLED-BY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_called_by_methodP", "TD-METHOD-CALLED-BY-METHOD?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referenced_by_method", "TD-MODULES-REFERENCED-BY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_called_by_global", "TD-GLOBALS-CALLED-BY-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_called_by_global", "TD-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_called_by_globalP", "TD-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referenced_by_global", "TD-MODULES-REFERENCED-BY-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_called_by_module", "TD-GLOBALS-CALLED-BY-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_called_by_module", "TD-METHODS-CALLED-BY-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_called_by_moduleP", "TD-METHOD-CALLED-BY-MODULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_positions_calling_global", "TD-MODULE-POSITIONS-CALLING-GLOBAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_module_positions_calling_method", "TD-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_unused_p", "TD-METHOD-UNUSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_calling_method", "TD-GLOBALS-CALLING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_calling_method", "TD-METHODS-CALLING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_calling_method", "TD-MODULES-CALLING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referencing_method", "TD-MODULES-REFERENCING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_unused_p", "TD-GLOBAL-UNUSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_globals_calling_global", "TD-GLOBALS-CALLING-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_methods_calling_global", "TD-METHODS-CALLING-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_calling_global", "TD-MODULES-CALLING-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referencing_global", "TD-MODULES-REFERENCING-GLOBAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_potentially_private_p", "TD-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_potentially_private_p", "TD-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referencing_module", "TD-MODULES-REFERENCING-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_referenced_by_module", "TD-MODULES-REFERENCED-BY-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_justify_module_referencing_module", "TD-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_implied_by_methods", "TD-MODULES-IMPLIED-BY-METHODS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_implied_by_globals", "TD-MODULES-IMPLIED-BY-GLOBALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_affected_by_arglist_change", "TD-MODULES-AFFECTED-BY-ARGLIST-CHANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_cluster_containing_module", "TD-MODULES-CLUSTER-CONTAINING-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_properly_dependent_on_modules", "TD-MODULES-PROPERLY-DEPENDENT-ON-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_dependent_on_modules", "TD-MODULES-DEPENDENT-ON-MODULES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_dependent_on_module", "TD-MODULES-DEPENDENT-ON-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_dependent_on_module_methods", "TD-MODULES-DEPENDENT-ON-MODULE-METHODS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_modules_dependent_on_module_globals", "TD-MODULES-DEPENDENT-ON-MODULE-GLOBALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_explain_how_module_depends_on_module", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_explain_how_module_depends_on_modules", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_calls_transitively", "TD-METHOD-CALLS-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_calls_transitively", "TD-GLOBAL-CALLS-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_note_method_called_transitively", "TD-NOTE-METHOD-CALLED-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_note_global_called_transitively", "TD-NOTE-GLOBAL-CALLED-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_references_modules_transitively", "TD-METHOD-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_latest_transitively_referenced_module", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_latest_transitively_referenced_module_memoized_internal", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_latest_transitively_referenced_module_memoized", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_justify_method_latest_transitively_referenced_module", "TD-JUSTIFY-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_justify_method_calls_transitively", "TD-JUSTIFY-METHOD-CALLS-TRANSITIVELY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_references_modules_transitively", "TD-GLOBAL-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_latest_transitively_referenced_module", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_latest_transitively_referenced_module_memoized_internal", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_global_latest_transitively_referenced_module_memoized", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_justify_global_latest_transitively_referenced_module", "TD-JUSTIFY-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "incongruent_features", "INCONGRUENT-FEATURES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "feature_expression_transform", "FEATURE-EXPRESSION-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "non_feature_symbol_p", "NON-FEATURE-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "transform_non_feature_symbol", "TRANSFORM-NON-FEATURE-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_module_level_feature_problems", "ALL-MODULE-LEVEL-FEATURE-PROBLEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_level_feature_problems", "MODULE-LEVEL-FEATURE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "potential_module_level_feature_incongruence_internal", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "potential_module_level_feature_incongruence", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_feature_problems", "SHOW-FEATURE-PROBLEMS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_feature_problem", "SHOW-ONE-FEATURE-PROBLEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_feature_assumption", "SHOW-ONE-FEATURE-ASSUMPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "feature_explanation", "FEATURE-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_privacy_violations", "ALL-PRIVACY-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_privacy_violations", "MODULE-PRIVACY-VIOLATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_privacy_violations", "SHOW-PRIVACY-VIOLATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_privacy_violation", "SHOW-ONE-PRIVACY-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_early_rebinding_violations", "ALL-EARLY-REBINDING-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_early_rebinding_violations", "MODULE-EARLY-REBINDING-VIOLATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_early_rebinding_violations", "SHOW-EARLY-REBINDING-VIOLATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_early_rebinding_violation", "SHOW-ONE-EARLY-REBINDING-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_early_reference_violations", "ALL-EARLY-REFERENCE-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_early_reference_violations", "MODULE-EARLY-REFERENCE-VIOLATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_early_macro_use_p", "TD-EARLY-MACRO-USE-P", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_early_evaluation_reference_p", "TD-EARLY-EVALUATION-REFERENCE-P", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_early_global_binding_p", "TD-EARLY-GLOBAL-BINDING-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_early_reference_violations", "SHOW-EARLY-REFERENCE-VIOLATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_early_reference_violation", "SHOW-ONE-EARLY-REFERENCE-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_early_macro_use_violations", "ALL-EARLY-MACRO-USE-VIOLATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_early_macro_use_violations", "MODULE-EARLY-MACRO-USE-VIOLATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_early_macro_use_violations", "SHOW-EARLY-MACRO-USE-VIOLATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_early_macro_use_violation", "SHOW-ONE-EARLY-MACRO-USE-VIOLATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_undefined_references", "ALL-UNDEFINED-REFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_undefined_references", "MODULE-UNDEFINED-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_undefined_references", "SHOW-UNDEFINED-REFERENCES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_undefined_reference", "SHOW-ONE-UNDEFINED-REFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_multiple_definitions", "ALL-MULTIPLE-DEFINITIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_multiple_definitions", "MODULE-MULTIPLE-DEFINITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_multiple_definitions", "SHOW-MULTIPLE-DEFINITIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_multiple_definition", "SHOW-ONE-MULTIPLE-DEFINITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_early_constant_references", "ALL-EARLY-CONSTANT-REFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_early_constant_references", "MODULE-EARLY-CONSTANT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_early_constant_references", "SHOW-EARLY-CONSTANT-REFERENCES", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_early_constant_reference", "SHOW-ONE-EARLY-CONSTANT-REFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_api_macros_with_non_api_expansions", "SHOW-API-MACROS-WITH-NON-API-EXPANSIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_api_macro_visibility_problem", "SHOW-ONE-API-MACRO-VISIBILITY-PROBLEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "non_api_expansions_for_api_macro", "NON-API-EXPANSIONS-FOR-API-MACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "all_build_problems", "ALL-BUILD-PROBLEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "module_build_problems", "MODULE-BUILD-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_build_problems", "SHOW-BUILD-PROBLEMS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "show_one_build_problem", "SHOW-ONE-BUILD-PROBLEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "count_build_problems", "COUNT-BUILD-PROBLEMS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "build_problem_counts_by_module", "BUILD-PROBLEM-COUNTS-BY-MODULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_co_called_methods", "TD-METHOD-CO-CALLED-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_method_co_called_globals", "TD-METHOD-CO-CALLED-GLOBALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_macro_expansion_calls", "TD-MACRO-EXPANSION-CALLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.translator_utilities", "td_possible_orphan_methods_from_module", "TD-POSSIBLE-ORPHAN-METHODS-FROM-MODULE", 1, 0, false);
        return (SubLObject)translator_utilities.NIL;
    }
    
    public static SubLObject init_translator_utilities_file() {
        translator_utilities.$xref_database_mode$ = SubLFiles.defvar("*XREF-DATABASE-MODE*", (SubLObject)translator_utilities.$kw0$NEW);
        translator_utilities.$td_methods_called_transitively$ = SubLFiles.defparameter("*TD-METHODS-CALLED-TRANSITIVELY*", (SubLObject)translator_utilities.NIL);
        translator_utilities.$td_globals_called_transitively$ = SubLFiles.defparameter("*TD-GLOBALS-CALLED-TRANSITIVELY*", (SubLObject)translator_utilities.NIL);
        return (SubLObject)translator_utilities.NIL;
    }
    
    public static SubLObject setup_translator_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)translator_utilities.$sym1$TD_TRANSLATION_MODULES_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)translator_utilities.$sym2$TD_MODULE_TRANSLATION_POSITION);
        memoization_state.note_memoized_function((SubLObject)translator_utilities.$sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)translator_utilities.$sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)translator_utilities.$sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE);
        return (SubLObject)translator_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_translator_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_translator_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_translator_utilities_file();
    }
    
    static {
        me = (SubLFile)new translator_utilities();
        translator_utilities.$xref_database_mode$ = null;
        translator_utilities.$td_methods_called_transitively$ = null;
        translator_utilities.$td_globals_called_transitively$ = null;
        $kw0$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym1$TD_TRANSLATION_MODULES_MEMOIZED = SubLObjectFactory.makeSymbol("TD-TRANSLATION-MODULES-MEMOIZED");
        $sym2$TD_MODULE_TRANSLATION_POSITION = SubLObjectFactory.makeSymbol("TD-MODULE-TRANSLATION-POSITION");
        $sym3$TD_MODULE_EARLIER = SubLObjectFactory.makeSymbol("TD-MODULE-EARLIER");
        $sym4$TD_MODULE_P = SubLObjectFactory.makeSymbol("TD-MODULE-P");
        $sym5$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $kw6$DYNAMIC = SubLObjectFactory.makeKeyword("DYNAMIC");
        $kw7$SPECIAL = SubLObjectFactory.makeKeyword("SPECIAL");
        $kw8$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $str9$Checking__A_for_dependencies___ = SubLObjectFactory.makeString("Checking ~A for dependencies.~%");
        $sym10$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym11$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym12$TD_MODULE_LATER = SubLObjectFactory.makeSymbol("TD-MODULE-LATER");
        $sym13$TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED = SubLObjectFactory.makeSymbol("TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED");
        $kw14$UNSEEN = SubLObjectFactory.makeKeyword("UNSEEN");
        $sym15$TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED = SubLObjectFactory.makeSymbol("TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED");
        $kw16$OR = SubLObjectFactory.makeKeyword("OR");
        $kw17$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw18$AND = SubLObjectFactory.makeKeyword("AND");
        $sym19$NON_FEATURE_SYMBOL_P = SubLObjectFactory.makeSymbol("NON-FEATURE-SYMBOL-P");
        $sym20$TRANSFORM_NON_FEATURE_SYMBOL = SubLObjectFactory.makeSymbol("TRANSFORM-NON-FEATURE-SYMBOL");
        $str21$Identifying_module_level_feature_ = SubLObjectFactory.makeString("Identifying module-level feature problems");
        $str22$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw23$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw24$GLOBAL = SubLObjectFactory.makeKeyword("GLOBAL");
        $kw25$MODULE = SubLObjectFactory.makeKeyword("MODULE");
        $sym26$POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE = SubLObjectFactory.makeSymbol("POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REF-ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("INCONGRUENCE"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-FEATURES"));
        $str29$__Top_level_form_in__A__ = SubLObjectFactory.makeString("~%Top-level form in ~A~%");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-FEATURES"));
        $str31$__Method__A_in__A__ = SubLObjectFactory.makeString("~%Method ~A in ~A~%");
        $str32$__Global__A_in__A__ = SubLObjectFactory.makeString("~%Global ~A in ~A~%");
        $str33$_references = SubLObjectFactory.makeString(" references");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("REF-FEATURES"));
        $str35$__method__A_from__A__ = SubLObjectFactory.makeString("~%method ~A from ~A~%");
        $str36$__global__A_from__A__ = SubLObjectFactory.makeString("~%global ~A from ~A~%");
        $str37$__which_will_have_problems_when__ = SubLObjectFactory.makeString("~%which will have problems when :~%  ~A~%");
        $str38$assuming__A = SubLObjectFactory.makeString("assuming ~A");
        $str39$no_features = SubLObjectFactory.makeString("no features");
        $str40$Identifying_privacy_violations = SubLObjectFactory.makeString("Identifying privacy violations");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REF-ARGS")));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $str44$_references_private = SubLObjectFactory.makeString(" references private");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $str46$Identifying_early_rebinding_viola = SubLObjectFactory.makeString("Identifying early rebinding violations");
        $str47$_rebinds = SubLObjectFactory.makeString(" rebinds");
        $str48$_before_it_is_defined__ = SubLObjectFactory.makeString(" before it is defined~%");
        $str49$Identifying_early_reference_viola = SubLObjectFactory.makeString("Identifying early reference violations");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("REF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE")), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFYING-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFYING-GLOBALS"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"));
        $str52$__Top_level_form_in__A_at__S__ = SubLObjectFactory.makeString("~%Top-level form in ~A at ~S~%");
        $str53$_before_it_is = SubLObjectFactory.makeString(" before it is");
        $str54$_defined__ = SubLObjectFactory.makeString(" defined~%");
        $str55$_completely_defined_due_to__ = SubLObjectFactory.makeString(" completely defined due to~%");
        $str56$method__A__ = SubLObjectFactory.makeString("method ~A~%");
        $str57$global__A__ = SubLObjectFactory.makeString("global ~A~%");
        $str58$Identifying_early_macro_use_viola = SubLObjectFactory.makeString("Identifying early macro use violations");
        $str59$Identifying_undefined_references = SubLObjectFactory.makeString("Identifying undefined references");
        $str60$_references_undefined = SubLObjectFactory.makeString(" references undefined");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-OBJECT"));
        $str62$__method__A__ = SubLObjectFactory.makeString("~%method ~A~%");
        $str63$__global__A__ = SubLObjectFactory.makeString("~%global ~A~%");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DEF-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINITION-POSITIONS"));
        $str65$__Method__A_has_multiple_definiti = SubLObjectFactory.makeString("~%Method ~A has multiple definitions in");
        $str66$__Global__A_has_multiple_definiti = SubLObjectFactory.makeString("~%Global ~A has multiple definitions in");
        $list67 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-POSITION"));
        $str68$_____A_at_position__S = SubLObjectFactory.makeString("~%  ~A at position ~S");
        $sym69$READER_MAKE_CONSTANT_SHELL = SubLObjectFactory.makeSymbol("READER-MAKE-CONSTANT-SHELL");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REF-ARGS"));
        $str71$references____before_it_is_comple = SubLObjectFactory.makeString("references #$ before it is completely defined~%");
        $kw72$API_MACRO_VISIBILITY = SubLObjectFactory.makeKeyword("API-MACRO-VISIBILITY");
        $list73 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MACRO"), (SubLObject)SubLObjectFactory.makeSymbol("NON-API-EXPANSIONS"));
        $str74$__API_macro__A_expands_to_non_API = SubLObjectFactory.makeString("~&API macro ~A expands to non-API methods~% ~S~%");
        $sym75$API_PREDEFINED_MACRO_P = SubLObjectFactory.makeSymbol("API-PREDEFINED-MACRO-P");
        $str76$Determining_build_problems = SubLObjectFactory.makeString("Determining build problems");
        $kw77$MULTIPLE_DEFINITIONS = SubLObjectFactory.makeKeyword("MULTIPLE-DEFINITIONS");
        $kw78$UNDEFINED_REFERENCES = SubLObjectFactory.makeKeyword("UNDEFINED-REFERENCES");
        $kw79$PRIVACY_VIOLATIONS = SubLObjectFactory.makeKeyword("PRIVACY-VIOLATIONS");
        $kw80$EARLY_CONSTANT_REFERENCES = SubLObjectFactory.makeKeyword("EARLY-CONSTANT-REFERENCES");
        $kw81$EARLY_REFERENCE_VIOLATIONS = SubLObjectFactory.makeKeyword("EARLY-REFERENCE-VIOLATIONS");
        $kw82$EARLY_REBINDING_VIOLATIONS = SubLObjectFactory.makeKeyword("EARLY-REBINDING-VIOLATIONS");
        $str83$__No_build_problems_ = SubLObjectFactory.makeString("~%No build problems!");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEMS"));
        $str85$Unknown_build_problem_class__S = SubLObjectFactory.makeString("Unknown build problem class ~S");
        $sym86$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym87$_ = SubLObjectFactory.makeSymbol(">");
        $sym88$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw89$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str90$CLEAR = SubLObjectFactory.makeString("CLEAR");
        $str91$REMOVE = SubLObjectFactory.makeString("REMOVE");
    }
}

/*

	Total time: 1010 ms
	
*/