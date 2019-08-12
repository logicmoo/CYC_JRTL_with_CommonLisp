/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class translator_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject td_module_cvsweb_url(SubLObject module) {
        SubLTrampolineFile.checkType(module, TD_MODULE_P);
        {
            SubLObject pathname = com.cyc.cycjava.cycl.translator_utilities.td_module_pathname(module);
            return format(NIL, $str_alt7$http___localhost_cgi_bin_cvsweb_c, pathname);
        }
    }

    public static final SubLFile me = new translator_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.translator_utilities";


    // defvar
    @LispMethod(comment = "Temporary control variable -- eventually should stay :new on all platforms\r\nonce the old translator is excised.\ndefvar\nTemporary control variable -- eventually should stay :new on all platforms\nonce the old translator is excised.")
    // Definitions
    /**
     * Temporary control variable -- eventually should stay :new on all platforms
     * once the old translator is excised.
     */
    public static final SubLSymbol $xref_database_mode$ = makeSymbol("*XREF-DATABASE-MODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $td_methods_called_transitively$ = makeSymbol("*TD-METHODS-CALLED-TRANSITIVELY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $td_globals_called_transitively$ = makeSymbol("*TD-GLOBALS-CALLED-TRANSITIVELY*");

    private static final SubLSymbol TD_TRANSLATION_MODULES_MEMOIZED = makeSymbol("TD-TRANSLATION-MODULES-MEMOIZED");

    private static final SubLSymbol TD_MODULE_TRANSLATION_POSITION = makeSymbol("TD-MODULE-TRANSLATION-POSITION");

    private static final SubLSymbol TD_MODULE_EARLIER = makeSymbol("TD-MODULE-EARLIER");

    private static final SubLSymbol TD_MODULE_P = makeSymbol("TD-MODULE-P");

    private static final SubLString $str9$Checking__A_for_dependencies___ = makeString("Checking ~A for dependencies.~%");

    private static final SubLSymbol TD_MODULE_LATER = makeSymbol("TD-MODULE-LATER");

    private static final SubLSymbol TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED = makeSymbol("TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED");

    private static final SubLSymbol TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED = makeSymbol("TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED");

    private static final SubLSymbol NON_FEATURE_SYMBOL_P = makeSymbol("NON-FEATURE-SYMBOL-P");

    private static final SubLSymbol TRANSFORM_NON_FEATURE_SYMBOL = makeSymbol("TRANSFORM-NON-FEATURE-SYMBOL");

    private static final SubLString $str21$Identifying_module_level_feature_ = makeString("Identifying module-level feature problems");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE = makeSymbol("POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE");

    private static final SubLList $list27 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS")), makeSymbol("INCONGRUENCE"));

    private static final SubLList $list28 = list(makeSymbol("MODULE"), makeSymbol("DEF-FEATURES"));

    private static final SubLString $str29$__Top_level_form_in__A__ = makeString("~%Top-level form in ~A~%");

    static private final SubLList $list30 = list(makeSymbol("DEF-OBJECT"), makeSymbol("MODULE"), makeSymbol("DEF-FEATURES"));

    private static final SubLString $str31$__Method__A_in__A__ = makeString("~%Method ~A in ~A~%");

    private static final SubLString $str32$__Global__A_in__A__ = makeString("~%Global ~A in ~A~%");

    private static final SubLString $$$_references = makeString(" references");

    private static final SubLList $list34 = list(makeSymbol("REF-OBJECT"), makeSymbol("MODULE"), makeSymbol("REF-FEATURES"));

    private static final SubLString $str35$__method__A_from__A__ = makeString("~%method ~A from ~A~%");

    private static final SubLString $str36$__global__A_from__A__ = makeString("~%global ~A from ~A~%");

    private static final SubLString $str37$__which_will_have_problems_when__ = makeString("~%which will have problems when :~%  ~A~%");

    private static final SubLString $str38$assuming__A = makeString("assuming ~A");

    private static final SubLString $$$no_features = makeString("no features");

    private static final SubLString $$$Identifying_privacy_violations = makeString("Identifying privacy violations");

    private static final SubLList $list41 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS")));

    private static final SubLList $list42 = list(makeSymbol("MODULE"));

    static private final SubLList $list43 = list(makeSymbol("DEF-OBJECT"), makeSymbol("MODULE"));

    private static final SubLString $$$_references_private = makeString(" references private");

    static private final SubLList $list45 = list(makeSymbol("REF-OBJECT"), makeSymbol("MODULE"));

    private static final SubLString $str46$Identifying_early_rebinding_viola = makeString("Identifying early rebinding violations");

    private static final SubLString $$$_rebinds = makeString(" rebinds");

    private static final SubLString $str48$_before_it_is_defined__ = makeString(" before it is defined~%");

    private static final SubLString $str49$Identifying_early_reference_viola = makeString("Identifying early reference violations");

    private static final SubLList $list50 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("REF-OBJECT"), makeSymbol("MODULE")), makeSymbol("JUSTIFYING-METHODS"), makeSymbol("JUSTIFYING-GLOBALS"));

    private static final SubLList $list51 = list(makeSymbol("MODULE"), makeSymbol("POSITION"));

    private static final SubLString $str52$__Top_level_form_in__A_at__S__ = makeString("~%Top-level form in ~A at ~S~%");

    private static final SubLString $$$_before_it_is = makeString(" before it is");

    private static final SubLString $str54$_defined__ = makeString(" defined~%");

    private static final SubLString $str55$_completely_defined_due_to__ = makeString(" completely defined due to~%");

    private static final SubLString $str56$method__A__ = makeString("method ~A~%");

    private static final SubLString $str57$global__A__ = makeString("global ~A~%");

    private static final SubLString $str58$Identifying_early_macro_use_viola = makeString("Identifying early macro use violations");

    private static final SubLString $$$Identifying_undefined_references = makeString("Identifying undefined references");

    private static final SubLString $$$_references_undefined = makeString(" references undefined");

    private static final SubLList $list61 = list(makeSymbol("REF-OBJECT"));

    private static final SubLString $str62$__method__A__ = makeString("~%method ~A~%");

    private static final SubLString $str63$__global__A__ = makeString("~%global ~A~%");

    private static final SubLList $list64 = list(makeSymbol("DEF-TYPE"), makeSymbol("DEF-OBJECT"), makeSymbol("DEFINITION-POSITIONS"));

    private static final SubLString $str65$__Method__A_has_multiple_definiti = makeString("~%Method ~A has multiple definitions in");

    private static final SubLString $str66$__Global__A_has_multiple_definiti = makeString("~%Global ~A has multiple definitions in");

    private static final SubLList $list67 = cons(makeSymbol("MODULE"), makeSymbol("FILE-POSITION"));

    private static final SubLString $str68$_____A_at_position__S = makeString("~%  ~A at position ~S");

    private static final SubLSymbol READER_MAKE_CONSTANT_SHELL = makeSymbol("READER-MAKE-CONSTANT-SHELL");

    private static final SubLList $list70 = list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS"));

    private static final SubLString $str71$references____before_it_is_comple = makeString("references #$ before it is completely defined~%");

    private static final SubLSymbol $API_MACRO_VISIBILITY = makeKeyword("API-MACRO-VISIBILITY");

    private static final SubLList $list73 = cons(makeSymbol("MACRO"), makeSymbol("NON-API-EXPANSIONS"));

    private static final SubLString $str74$__API_macro__A_expands_to_non_API = makeString("~&API macro ~A expands to non-API methods~% ~S~%");

    private static final SubLSymbol API_PREDEFINED_MACRO_P = makeSymbol("API-PREDEFINED-MACRO-P");

    private static final SubLString $$$Determining_build_problems = makeString("Determining build problems");

    private static final SubLSymbol $EARLY_CONSTANT_REFERENCES = makeKeyword("EARLY-CONSTANT-REFERENCES");

    private static final SubLSymbol $EARLY_REFERENCE_VIOLATIONS = makeKeyword("EARLY-REFERENCE-VIOLATIONS");

    private static final SubLSymbol $EARLY_REBINDING_VIOLATIONS = makeKeyword("EARLY-REBINDING-VIOLATIONS");

    private static final SubLString $str83$__No_build_problems_ = makeString("~%No build problems!");

    private static final SubLList $list84 = list(makeSymbol("PROBLEM-CLASS"), makeSymbol("PROBLEMS"));

    private static final SubLString $str85$Unknown_build_problem_class__S = makeString("Unknown build problem class ~S");

    private static final SubLSymbol $sym87$_ = makeSymbol(">");

    private static final SubLString $$$CLEAR = makeString("CLEAR");

    private static final SubLString $$$REMOVE = makeString("REMOVE");

    public static final SubLObject td_module_p_alt(SubLObject module) {
        return stringp(module);
    }

    public static SubLObject td_module_p(final SubLObject module) {
        return stringp(module);
    }

    public static final SubLObject td_current_translation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return system_translation.current_system_translation();
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_current_translation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return system_translation.current_system_translation();
        }
        return NIL;
    }

    public static final SubLObject td_translation_modules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.current_xref_system_modules();
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_translation_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.current_xref_system_modules();
        }
        return NIL;
    }

    public static final SubLObject td_translation_modules_memoized_internal_alt() {
        return com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
    }

    public static SubLObject td_translation_modules_memoized_internal() {
        return td_translation_modules();
    }

    public static final SubLObject td_translation_modules_memoized_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.translator_utilities.td_translation_modules_memoized_internal();
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_TRANSLATION_MODULES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_TRANSLATION_MODULES_MEMOIZED, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TD_TRANSLATION_MODULES_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.translator_utilities.td_translation_modules_memoized_internal()));
                        memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject td_translation_modules_memoized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return td_translation_modules_memoized_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_TRANSLATION_MODULES_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_TRANSLATION_MODULES_MEMOIZED, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TD_TRANSLATION_MODULES_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(td_translation_modules_memoized_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return T iff EARLIER-MODULE is strictly earlier than LATER-MODULE in the sysdcl.
     */
    @LispMethod(comment = "Return T iff EARLIER-MODULE is strictly earlier than LATER-MODULE in the sysdcl.")
    public static final SubLObject td_module_earlier_alt(SubLObject earlier_module, SubLObject later_module) {
        {
            SubLObject position1 = com.cyc.cycjava.cycl.translator_utilities.td_module_translation_position(earlier_module);
            SubLObject position2 = com.cyc.cycjava.cycl.translator_utilities.td_module_translation_position(later_module);
            if (position1.isInteger()) {
                if (position2.isInteger()) {
                    return numL(position1, position2);
                } else {
                    return T;
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T iff EARLIER-MODULE is strictly earlier than LATER-MODULE in the sysdcl.
     */
    @LispMethod(comment = "Return T iff EARLIER-MODULE is strictly earlier than LATER-MODULE in the sysdcl.")
    public static SubLObject td_module_earlier(final SubLObject earlier_module, final SubLObject later_module) {
        final SubLObject position1 = td_module_translation_position(earlier_module);
        final SubLObject position2 = td_module_translation_position(later_module);
        if (!position1.isInteger()) {
            return NIL;
        }
        if (position2.isInteger()) {
            return numL(position1, position2);
        }
        return T;
    }

    public static final SubLObject td_module_translation_position_internal_alt(SubLObject module) {
        return position(module, com.cyc.cycjava.cycl.translator_utilities.td_translation_modules_memoized(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject td_module_translation_position_internal(final SubLObject module) {
        return position(module, td_translation_modules_memoized(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject td_module_translation_position_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.translator_utilities.td_module_translation_position_internal(module);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_MODULE_TRANSLATION_POSITION, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_MODULE_TRANSLATION_POSITION, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TD_MODULE_TRANSLATION_POSITION, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, module, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.translator_utilities.td_module_translation_position_internal(module)));
                        memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject td_module_translation_position(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return td_module_translation_position_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_MODULE_TRANSLATION_POSITION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_MODULE_TRANSLATION_POSITION, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TD_MODULE_TRANSLATION_POSITION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(td_module_translation_position_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return T iff LATER-MODULE is strictly later than EARLIER-MODULE in the sysdcl.
     */
    @LispMethod(comment = "Return T iff LATER-MODULE is strictly later than EARLIER-MODULE in the sysdcl.")
    public static final SubLObject td_module_later_alt(SubLObject later_module, SubLObject earlier_module) {
        return com.cyc.cycjava.cycl.translator_utilities.td_module_earlier(earlier_module, later_module);
    }

    /**
     * Return T iff LATER-MODULE is strictly later than EARLIER-MODULE in the sysdcl.
     */
    @LispMethod(comment = "Return T iff LATER-MODULE is strictly later than EARLIER-MODULE in the sysdcl.")
    public static SubLObject td_module_later(final SubLObject later_module, final SubLObject earlier_module) {
        return td_module_earlier(earlier_module, later_module);
    }

    /**
     * Return a copy of MODULES sorted in sysdcl order.
     */
    @LispMethod(comment = "Return a copy of MODULES sorted in sysdcl order.")
    public static final SubLObject td_sort_modules_by_load_order_alt(SubLObject v_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                result = Sort.sort(copy_list(v_modules), symbol_function(TD_MODULE_EARLIER), UNPROVIDED);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return a copy of MODULES sorted in sysdcl order.
     */
    @LispMethod(comment = "Return a copy of MODULES sorted in sysdcl order.")
    public static SubLObject td_sort_modules_by_load_order(final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = Sort.sort(copy_list(v_modules), symbol_function(TD_MODULE_EARLIER), UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject td_module_earlier_memoized_alt(SubLObject earlier_module, SubLObject later_module) {
        return com.cyc.cycjava.cycl.translator_utilities.td_module_earlier(earlier_module, later_module);
    }

    public static SubLObject td_module_earlier_memoized(final SubLObject earlier_module, final SubLObject later_module) {
        return td_module_earlier(earlier_module, later_module);
    }

    public static final SubLObject td_module_later_memoized_alt(SubLObject later_module, SubLObject earlier_module) {
        return com.cyc.cycjava.cycl.translator_utilities.td_module_earlier_memoized(earlier_module, later_module);
    }

    public static SubLObject td_module_later_memoized(final SubLObject later_module, final SubLObject earlier_module) {
        return td_module_earlier_memoized(earlier_module, later_module);
    }

    public static final SubLObject td_module_features_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_module_features(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_module_features(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_module_features(module);
        }
        return NIL;
    }

    public static final SubLObject td_translation_features_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.current_xref_system_features();
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_translation_features() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.current_xref_system_features();
        }
        return NIL;
    }

    public static final SubLObject td_module_pathname_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_module_input_filename(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_module_pathname(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_module_input_filename(module);
        }
        return NIL;
    }

    public static final SubLObject td_predefined_method_p_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_predefined_method_p(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_predefined_method_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_predefined_method_p(method);
        }
        return NIL;
    }

    public static final SubLObject td_predefined_global_p_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_predefined_global_p(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_predefined_global_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_predefined_global_p(global);
        }
        return NIL;
    }

    public static final SubLObject td_method_macro_p_alt(SubLObject method) {
        SubLTrampolineFile.checkType(method, SYMBOLP);
        return macro_operator_p(method);
    }

    public static SubLObject td_method_macro_p(final SubLObject method) {
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        return macro_operator_p(method);
    }

    public static final SubLObject td_method_defining_module_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_defining_module(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_defining_module(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_defining_module(method);
        }
        return NIL;
    }

    public static final SubLObject td_method_definition_position_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_definition_position(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_definition_position(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_definition_position(method);
        }
        return NIL;
    }

    public static final SubLObject td_method_has_multiple_definitionsP_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_has_multiple_definitionsP(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_has_multiple_definitionsP(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_has_multiple_definitionsP(method);
        }
        return NIL;
    }

    public static final SubLObject td_method_definition_positions_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_definition_positions(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_definition_positions(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_definition_positions(method);
        }
        return NIL;
    }

    public static final SubLObject td_method_formal_arglist_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(method)) {
                {
                    SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                    if (pcase_var.eql($NEW)) {
                        return xref_database.xref_method_formal_arglist(method);
                    }
                }
            }
            return subl_promotions.function_symbol_arglist(method);
        }
    }

    public static SubLObject td_method_formal_arglist(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        if (NIL != td_method_defining_module(method)) {
            final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
            if (pcase_var.eql($NEW)) {
                return xref_database.xref_method_formal_arglist(method);
            }
        }
        return subl_promotions.function_symbol_arglist(method);
    }

    public static final SubLObject td_global_binding_type_alt(SubLObject global) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject binding_type = form_translation.global_binding_type(global);
            SubLObject pcase_var = binding_type;
            if (pcase_var.eql($DYNAMIC)) {
                return $SPECIAL;
            } else {
                if (pcase_var.eql($UNSPECIFIED)) {
                    return NIL;
                } else {
                    return binding_type;
                }
            }
        }
    }

    public static SubLObject td_global_binding_type(final SubLObject global) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var;
        final SubLObject binding_type = pcase_var = form_translation.global_binding_type(global);
        if (pcase_var.eql($DYNAMIC)) {
            return $SPECIAL;
        }
        if (pcase_var.eql($UNSPECIFIED)) {
            return NIL;
        }
        return binding_type;
    }

    public static final SubLObject td_global_defining_module_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_defining_module(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_defining_module(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_defining_module(global);
        }
        return NIL;
    }

    public static final SubLObject td_global_definition_position_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_definition_position(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_definition_position(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_definition_position(global);
        }
        return NIL;
    }

    public static final SubLObject td_global_has_multiple_definitionsP_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_has_multiple_definitionsP(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_has_multiple_definitionsP(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_has_multiple_definitionsP(global);
        }
        return NIL;
    }

    public static final SubLObject td_global_definition_positions_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_definition_positions(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_definition_positions(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_definition_positions(global);
        }
        return NIL;
    }

    public static final SubLObject td_methods_defined_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_defined_by_module(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_defined_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_defined_by_module(module);
        }
        return NIL;
    }

    public static final SubLObject td_globals_defined_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_defined_by_module(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_defined_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_defined_by_module(module);
        }
        return NIL;
    }

    public static final SubLObject td_globals_called_by_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_accessed_by_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_called_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_accessed_by_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_globals_rebound_by_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_rebound_by_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_rebound_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_rebound_by_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_methods_called_by_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_called_by_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_called_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_called_by_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_method_called_by_methodP_alt(SubLObject client_method, SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(client_method, SYMBOLP);
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_called_by_methodP(client_method, method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_called_by_methodP(final SubLObject client_method, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(client_method) : "! symbolp(client_method) " + ("Types.symbolp(client_method) " + "CommonSymbols.NIL != Types.symbolp(client_method) ") + client_method;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_called_by_methodP(client_method, method);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referenced_by_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_accessed_by_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referenced_by_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_accessed_by_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_globals_called_by_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_referenced_by_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_called_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_referenced_by_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_methods_called_by_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_called_by_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_called_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_called_by_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_method_called_by_globalP_alt(SubLObject client_method, SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(client_method, SYMBOLP);
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_called_by_globalP(client_method, global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_called_by_globalP(final SubLObject client_method, final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(client_method) : "! symbolp(client_method) " + ("Types.symbolp(client_method) " + "CommonSymbols.NIL != Types.symbolp(client_method) ") + client_method;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_called_by_globalP(client_method, global);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referenced_by_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_accessed_by_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referenced_by_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_accessed_by_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_globals_called_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_accessed_by_module(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_called_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_accessed_by_module(module);
        }
        return NIL;
    }

    public static final SubLObject td_methods_called_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_called_by_module(module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_called_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_called_by_module(module);
        }
        return NIL;
    }

    public static final SubLObject td_method_called_by_moduleP_alt(SubLObject client_method, SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(client_method, SYMBOLP);
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_called_by_moduleP(client_method, module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_called_by_moduleP(final SubLObject client_method, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(client_method) : "! symbolp(client_method) " + ("Types.symbolp(client_method) " + "CommonSymbols.NIL != Types.symbolp(client_method) ") + client_method;
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_called_by_moduleP(client_method, module);
        }
        return NIL;
    }

    public static final SubLObject td_module_positions_calling_global_alt(SubLObject module, SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_module_positions_accessing_global(module, global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_module_positions_calling_global(final SubLObject module, final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_module_positions_accessing_global(module, global);
        }
        return NIL;
    }

    public static final SubLObject td_module_positions_calling_method_alt(SubLObject module, SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, TD_MODULE_P);
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_module_positions_calling_method(module, method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_module_positions_calling_method(final SubLObject module, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(module) : "! translator_utilities.td_module_p(module) " + ("translator_utilities.td_module_p(module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(module) ") + module;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_module_positions_calling_method(module, method);
        }
        return NIL;
    }

    public static final SubLObject td_method_unused_p_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_unused_p(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_unused_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_unused_p(method);
        }
        return NIL;
    }

    public static final SubLObject td_globals_calling_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_that_call_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_that_call_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_methods_calling_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_that_call_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_that_call_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_modules_calling_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_that_call_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_calling_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_that_call_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referencing_method_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_that_access_method(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referencing_method(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_that_access_method(method);
        }
        return NIL;
    }

    public static final SubLObject td_global_unused_p_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_never_accessed_p(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_unused_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_never_accessed_p(global);
        }
        return NIL;
    }

    public static final SubLObject td_globals_calling_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_globals_that_reference_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_globals_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_globals_that_reference_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_methods_calling_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_methods_that_access_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_methods_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_methods_that_access_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_modules_calling_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_that_access_global(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_calling_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_that_access_global(global);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referencing_global_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_that_access_global_anywhere(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referencing_global(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_that_access_global_anywhere(global);
        }
        return NIL;
    }

    public static final SubLObject td_method_potentially_private_p_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(method, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_method_potentially_private_p(method);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_method_potentially_private_p(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_method_potentially_private_p(method);
        }
        return NIL;
    }

    public static final SubLObject td_global_potentially_private_p_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(global, SYMBOLP);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_global_potentially_private_p(global);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_global_potentially_private_p(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_global_potentially_private_p(global);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referencing_module_alt(SubLObject server_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(server_module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_that_access_module_anywhere(server_module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referencing_module(final SubLObject server_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(server_module) : "! translator_utilities.td_module_p(server_module) " + ("translator_utilities.td_module_p(server_module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(server_module) ") + server_module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_that_access_module_anywhere(server_module);
        }
        return NIL;
    }

    public static final SubLObject td_modules_referenced_by_module_alt(SubLObject client_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(client_module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_modules_accessed_anywhere_by_module(client_module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_modules_referenced_by_module(final SubLObject client_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(client_module) : "! translator_utilities.td_module_p(client_module) " + ("translator_utilities.td_module_p(client_module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(client_module) ") + client_module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_modules_accessed_anywhere_by_module(client_module);
        }
        return NIL;
    }

    public static final SubLObject td_justify_module_referencing_module_alt(SubLObject client_module, SubLObject server_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(client_module, TD_MODULE_P);
            SubLTrampolineFile.checkType(server_module, TD_MODULE_P);
            {
                SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
                if (pcase_var.eql($NEW)) {
                    return xref_database.xref_justify_module_referencing_module(client_module, server_module);
                }
            }
            return NIL;
        }
    }

    public static SubLObject td_justify_module_referencing_module(final SubLObject client_module, final SubLObject server_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != td_module_p(client_module) : "! translator_utilities.td_module_p(client_module) " + ("translator_utilities.td_module_p(client_module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(client_module) ") + client_module;
        assert NIL != td_module_p(server_module) : "! translator_utilities.td_module_p(server_module) " + ("translator_utilities.td_module_p(server_module) " + "CommonSymbols.NIL != translator_utilities.td_module_p(server_module) ") + server_module;
        final SubLObject pcase_var = $xref_database_mode$.getDynamicValue(thread);
        if (pcase_var.eql($NEW)) {
            return xref_database.xref_justify_module_referencing_module(client_module, server_module);
        }
        return NIL;
    }

    /**
     * Given a set of methods, compute the set of modules that this implies
     * and return it; extend the passed in set if provided.
     */
    @LispMethod(comment = "Given a set of methods, compute the set of modules that this implies\r\nand return it; extend the passed in set if provided.\nGiven a set of methods, compute the set of modules that this implies\nand return it; extend the passed in set if provided.")
    public static final SubLObject td_modules_implied_by_methods_alt(SubLObject v_methods, SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        {
            SubLObject cdolist_list_var = v_methods;
            SubLObject method = NIL;
            for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                {
                    SubLObject my_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(method);
                    SubLObject item_var = my_module;
                    if (NIL == member(item_var, v_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                        v_modules = cons(item_var, v_modules);
                    }
                }
            }
        }
        return v_modules;
    }

    @LispMethod(comment = "Given a set of methods, compute the set of modules that this implies\r\nand return it; extend the passed in set if provided.\nGiven a set of methods, compute the set of modules that this implies\nand return it; extend the passed in set if provided.")
    public static SubLObject td_modules_implied_by_methods(final SubLObject v_methods, SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject my_module = item_var = td_method_defining_module(method);
            if (NIL == member(item_var, v_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                v_modules = cons(item_var, v_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return v_modules;
    }

    /**
     * Given a set of globals, compute the set of modules that this implies
     * and return it; extend the passed in set if provided.
     */
    @LispMethod(comment = "Given a set of globals, compute the set of modules that this implies\r\nand return it; extend the passed in set if provided.\nGiven a set of globals, compute the set of modules that this implies\nand return it; extend the passed in set if provided.")
    public static final SubLObject td_modules_implied_by_globals_alt(SubLObject globals, SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        {
            SubLObject cdolist_list_var = globals;
            SubLObject global = NIL;
            for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                {
                    SubLObject my_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(global);
                    SubLObject item_var = my_module;
                    if (NIL == member(item_var, v_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                        v_modules = cons(item_var, v_modules);
                    }
                }
            }
        }
        return v_modules;
    }

    @LispMethod(comment = "Given a set of globals, compute the set of modules that this implies\r\nand return it; extend the passed in set if provided.\nGiven a set of globals, compute the set of modules that this implies\nand return it; extend the passed in set if provided.")
    public static SubLObject td_modules_implied_by_globals(final SubLObject globals, SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        SubLObject cdolist_list_var = globals;
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var;
            final SubLObject my_module = item_var = td_global_defining_module(global);
            if (NIL == member(item_var, v_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                v_modules = cons(item_var, v_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        return v_modules;
    }

    /**
     * Gather all of the callers of all of the methods whose arglist
     * has changed, then simplify that down to the modules affected for
     * rebuilding.
     */
    @LispMethod(comment = "Gather all of the callers of all of the methods whose arglist\r\nhas changed, then simplify that down to the modules affected for\r\nrebuilding.\nGather all of the callers of all of the methods whose arglist\nhas changed, then simplify that down to the modules affected for\nrebuilding.")
    public static final SubLObject td_modules_affected_by_arglist_change_alt(SubLObject changed_methods) {
        {
            SubLObject v_methods = NIL;
            SubLObject cdolist_list_var = changed_methods;
            SubLObject symbol = NIL;
            for (symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol = cdolist_list_var.first()) {
                {
                    SubLObject these_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(symbol);
                    SubLObject cdolist_list_var_2 = these_methods;
                    SubLObject this_method = NIL;
                    for (this_method = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , this_method = cdolist_list_var_2.first()) {
                        {
                            SubLObject item_var = this_method;
                            if (NIL == member(item_var, v_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_methods = cons(item_var, v_methods);
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.translator_utilities.td_modules_implied_by_methods(v_methods, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Gather all of the callers of all of the methods whose arglist\r\nhas changed, then simplify that down to the modules affected for\r\nrebuilding.\nGather all of the callers of all of the methods whose arglist\nhas changed, then simplify that down to the modules affected for\nrebuilding.")
    public static SubLObject td_modules_affected_by_arglist_change(final SubLObject changed_methods) {
        SubLObject v_methods = NIL;
        SubLObject cdolist_list_var = changed_methods;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject these_methods = cdolist_list_var_$2 = td_methods_calling_method(symbol);
            SubLObject this_method = NIL;
            this_method = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = this_method;
                if (NIL == member(item_var, v_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                    v_methods = cons(item_var, v_methods);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                this_method = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        SubLObject v_modules = td_modules_implied_by_methods(v_methods, UNPROVIDED);
        v_modules = td_sort_modules_by_load_order(v_modules);
        return v_modules;
    }

    public static final SubLObject td_modules_cluster_containing_module_alt(SubLObject seed_module, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            SubLObject mark_space = set.new_set(symbol_function(EQUALP), UNPROVIDED);
            SubLObject unvisited = NIL;
            unvisited = cons(seed_module, unvisited);
            while (NIL != unvisited) {
                {
                    SubLObject current = unvisited.first();
                    unvisited = unvisited.rest();
                    if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_p(current)) {
                        if (NIL != verboseP) {
                            format(T, $str_alt12$Checking__A_for_dependencies___, current);
                        }
                        if (NIL == set.set_memberP(current, mark_space)) {
                            set.set_add(current, mark_space);
                            {
                                SubLObject connected = com.cyc.cycjava.cycl.translator_utilities.td_modules_referencing_module(current);
                                SubLObject cdolist_list_var = connected;
                                SubLObject neighbor = NIL;
                                for (neighbor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neighbor = cdolist_list_var.first()) {
                                    if (NIL == set.set_memberP(neighbor, mark_space)) {
                                        unvisited = cons(neighbor, unvisited);
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            return set.set_element_list(mark_space);
        }
    }

    public static SubLObject td_modules_cluster_containing_module(final SubLObject seed_module, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLObject mark_space = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        SubLObject unvisited = NIL;
        unvisited = cons(seed_module, unvisited);
        while (NIL != unvisited) {
            final SubLObject current = unvisited.first();
            unvisited = unvisited.rest();
            if (NIL != td_module_p(current)) {
                if (NIL != verboseP) {
                    format(T, $str9$Checking__A_for_dependencies___, current);
                }
                if (NIL != set.set_memberP(current, mark_space)) {
                    continue;
                }
                set.set_add(current, mark_space);
                SubLObject cdolist_list_var;
                final SubLObject connected = cdolist_list_var = td_modules_referencing_module(current);
                SubLObject neighbor = NIL;
                neighbor = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == set.set_memberP(neighbor, mark_space)) {
                        unvisited = cons(neighbor, unvisited);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    neighbor = cdolist_list_var.first();
                } 
            }
        } 
        return set.set_element_list(mark_space);
    }

    /**
     * Given a set of modules, identify all modules that
     * (a) are dependent on these and
     * (b) are not a member of the leaf-modules.
     */
    @LispMethod(comment = "Given a set of modules, identify all modules that\r\n(a) are dependent on these and\r\n(b) are not a member of the leaf-modules.\nGiven a set of modules, identify all modules that\n(a) are dependent on these and\n(b) are not a member of the leaf-modules.")
    public static final SubLObject td_modules_properly_dependent_on_modules_alt(SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        return set_difference(com.cyc.cycjava.cycl.translator_utilities.td_modules_dependent_on_modules(leaf_modules, dependent_modules), leaf_modules, EQUAL, UNPROVIDED);
    }

    @LispMethod(comment = "Given a set of modules, identify all modules that\r\n(a) are dependent on these and\r\n(b) are not a member of the leaf-modules.\nGiven a set of modules, identify all modules that\n(a) are dependent on these and\n(b) are not a member of the leaf-modules.")
    public static SubLObject td_modules_properly_dependent_on_modules(final SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        return set_difference(td_modules_dependent_on_modules(leaf_modules, dependent_modules), leaf_modules, EQUAL, UNPROVIDED);
    }

    /**
     * Given a set of modules, identify all the modules that are dependent on these.
     */
    @LispMethod(comment = "Given a set of modules, identify all the modules that are dependent on these.")
    public static final SubLObject td_modules_dependent_on_modules_alt(SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        {
            SubLObject cdolist_list_var = leaf_modules;
            SubLObject leaf_module = NIL;
            for (leaf_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , leaf_module = cdolist_list_var.first()) {
                dependent_modules = com.cyc.cycjava.cycl.translator_utilities.td_modules_dependent_on_module(leaf_module, dependent_modules);
            }
        }
        return dependent_modules;
    }

    @LispMethod(comment = "Given a set of modules, identify all the modules that are dependent on these.")
    public static SubLObject td_modules_dependent_on_modules(final SubLObject leaf_modules, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        SubLObject cdolist_list_var = leaf_modules;
        SubLObject leaf_module = NIL;
        leaf_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dependent_modules = td_modules_dependent_on_module(leaf_module, dependent_modules);
            cdolist_list_var = cdolist_list_var.rest();
            leaf_module = cdolist_list_var.first();
        } 
        return dependent_modules;
    }

    /**
     * Given a module, return all modules that are dependent on these.
     */
    @LispMethod(comment = "Given a module, return all modules that are dependent on these.")
    public static final SubLObject td_modules_dependent_on_module_alt(SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        return com.cyc.cycjava.cycl.translator_utilities.td_modules_dependent_on_module_globals(leaf_module, com.cyc.cycjava.cycl.translator_utilities.td_modules_dependent_on_module_methods(leaf_module, dependent_modules));
    }

    @LispMethod(comment = "Given a module, return all modules that are dependent on these.")
    public static SubLObject td_modules_dependent_on_module(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        return td_modules_dependent_on_module_globals(leaf_module, td_modules_dependent_on_module_methods(leaf_module, dependent_modules));
    }

    /**
     * Methods includes both functions and macros.
     */
    @LispMethod(comment = "Methods includes both functions and macros.")
    public static final SubLObject td_modules_dependent_on_module_methods_alt(SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(leaf_module);
            SubLObject method = NIL;
            for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(method);
                    SubLObject client_method = NIL;
                    for (client_method = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , client_method = cdolist_list_var_3.first()) {
                        {
                            SubLObject module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(client_method);
                            SubLObject item_var = module;
                            if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                dependent_modules = cons(item_var, dependent_modules);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_4 = com.cyc.cycjava.cycl.translator_utilities.td_modules_calling_method(method);
                    SubLObject module = NIL;
                    for (module = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , module = cdolist_list_var_4.first()) {
                        {
                            SubLObject item_var = module;
                            if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                dependent_modules = cons(item_var, dependent_modules);
                            }
                        }
                    }
                }
            }
        }
        return dependent_modules;
    }

    @LispMethod(comment = "Methods includes both functions and macros.")
    public static SubLObject td_modules_dependent_on_module_methods(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        SubLObject cdolist_list_var = td_methods_defined_by_module(leaf_module);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = td_methods_calling_method(method);
            SubLObject client_method = NIL;
            client_method = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var;
                final SubLObject module = item_var = td_method_defining_module(client_method);
                if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    dependent_modules = cons(item_var, dependent_modules);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                client_method = cdolist_list_var_$3.first();
            } 
            SubLObject cdolist_list_var_$4 = td_modules_calling_method(method);
            SubLObject module2 = NIL;
            module2 = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject item_var2 = module2;
                if (NIL == member(item_var2, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    dependent_modules = cons(item_var2, dependent_modules);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                module2 = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return dependent_modules;
    }

    public static final SubLObject td_modules_dependent_on_module_globals_alt(SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(leaf_module);
            SubLObject global = NIL;
            for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_5 = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_global(global);
                    SubLObject client_method = NIL;
                    for (client_method = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , client_method = cdolist_list_var_5.first()) {
                        {
                            SubLObject module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(client_method);
                            SubLObject item_var = module;
                            if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                dependent_modules = cons(item_var, dependent_modules);
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var_6 = com.cyc.cycjava.cycl.translator_utilities.td_modules_calling_global(global);
                    SubLObject module = NIL;
                    for (module = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , module = cdolist_list_var_6.first()) {
                        {
                            SubLObject item_var = module;
                            if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                                dependent_modules = cons(item_var, dependent_modules);
                            }
                        }
                    }
                }
            }
        }
        return dependent_modules;
    }

    public static SubLObject td_modules_dependent_on_module_globals(final SubLObject leaf_module, SubLObject dependent_modules) {
        if (dependent_modules == UNPROVIDED) {
            dependent_modules = NIL;
        }
        SubLObject cdolist_list_var = td_globals_defined_by_module(leaf_module);
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$5 = td_methods_calling_global(global);
            SubLObject client_method = NIL;
            client_method = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                final SubLObject item_var;
                final SubLObject module = item_var = td_method_defining_module(client_method);
                if (NIL == member(item_var, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    dependent_modules = cons(item_var, dependent_modules);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                client_method = cdolist_list_var_$5.first();
            } 
            SubLObject cdolist_list_var_$6 = td_modules_calling_global(global);
            SubLObject module2 = NIL;
            module2 = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                final SubLObject item_var2 = module2;
                if (NIL == member(item_var2, dependent_modules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    dependent_modules = cons(item_var2, dependent_modules);
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                module2 = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        return dependent_modules;
    }

    public static final SubLObject td_explain_how_module_depends_on_module_alt(SubLObject superior, SubLObject inferior) {
        {
            SubLObject v_methods = NIL;
            SubLObject globals = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(superior);
                SubLObject method = NIL;
                for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_7 = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(method);
                        SubLObject client_method = NIL;
                        for (client_method = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , client_method = cdolist_list_var_7.first()) {
                            if (NIL != Strings.string_equal(inferior, com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(client_method), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject item_var = client_method;
                                    if (NIL == member(item_var, v_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        v_methods = cons(item_var, v_methods);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(superior);
                SubLObject global = NIL;
                for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_8 = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_global(global);
                        SubLObject client_method = NIL;
                        for (client_method = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , client_method = cdolist_list_var_8.first()) {
                            if (NIL != Strings.string_equal(inferior, com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(client_method), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                {
                                    SubLObject item_var = client_method;
                                    if (NIL == member(item_var, globals, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        globals = cons(item_var, globals);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(v_methods, globals);
        }
    }

    public static SubLObject td_explain_how_module_depends_on_module(final SubLObject superior, final SubLObject inferior) {
        SubLObject v_methods = NIL;
        SubLObject globals = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(superior);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7 = td_methods_calling_method(method);
            SubLObject client_method = NIL;
            client_method = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                if (NIL != Strings.string_equal(inferior, td_method_defining_module(client_method), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject item_var = client_method;
                    if (NIL == member(item_var, v_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                        v_methods = cons(item_var, v_methods);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                client_method = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        cdolist_list_var = td_globals_defined_by_module(superior);
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = td_methods_calling_global(global);
            SubLObject client_method = NIL;
            client_method = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                if (NIL != Strings.string_equal(inferior, td_method_defining_module(client_method), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject item_var = client_method;
                    if (NIL == member(item_var, globals, symbol_function(EQL), symbol_function(IDENTITY))) {
                        globals = cons(item_var, globals);
                    }
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                client_method = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        return values(v_methods, globals);
    }

    public static final SubLObject td_explain_how_module_depends_on_modules_alt(SubLObject superiors, SubLObject inferior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_methods = NIL;
                SubLObject all_globals = NIL;
                SubLObject cdolist_list_var = superiors;
                SubLObject superior = NIL;
                for (superior = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , superior = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_methods = com.cyc.cycjava.cycl.translator_utilities.td_explain_how_module_depends_on_module(superior, inferior);
                        SubLObject globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_methods) {
                            if (NIL == all_methods) {
                                all_methods = v_methods;
                            } else {
                                all_methods = union(v_methods, all_methods, UNPROVIDED, UNPROVIDED);
                            }
                        }
                        if (NIL != globals) {
                            if (NIL == all_globals) {
                                all_globals = globals;
                            } else {
                                all_globals = union(globals, all_globals, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
                return values(all_methods, all_globals);
            }
        }
    }

    public static SubLObject td_explain_how_module_depends_on_modules(final SubLObject superiors, final SubLObject inferior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_methods = NIL;
        SubLObject all_globals = NIL;
        SubLObject cdolist_list_var = superiors;
        SubLObject superior = NIL;
        superior = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_methods = td_explain_how_module_depends_on_module(superior, inferior);
            final SubLObject globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_methods) {
                if (NIL == all_methods) {
                    all_methods = v_methods;
                } else {
                    all_methods = union(v_methods, all_methods, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != globals) {
                if (NIL == all_globals) {
                    all_globals = globals;
                } else {
                    all_globals = union(globals, all_globals, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            superior = cdolist_list_var.first();
        } 
        return values(all_methods, all_globals);
    }

    /**
     * Return the complete set of methods and globals transitively called by CALLING-METHOD.
     */
    @LispMethod(comment = "Return the complete set of methods and globals transitively called by CALLING-METHOD.")
    public static final SubLObject td_method_calls_transitively_alt(SubLObject calling_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject called_methods = NIL;
                SubLObject called_globals = NIL;
                {
                    SubLObject _prev_bind_0 = $td_methods_called_transitively$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $td_globals_called_transitively$.currentBinding(thread);
                    try {
                        $td_methods_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        $td_globals_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(calling_method);
                            SubLObject called_method = NIL;
                            for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.translator_utilities.td_note_method_called_transitively(called_method);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(calling_method);
                            SubLObject called_global = NIL;
                            for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.translator_utilities.td_note_global_called_transitively(called_global);
                            }
                        }
                        called_methods = set.set_element_list($td_methods_called_transitively$.getDynamicValue(thread));
                        called_globals = set.set_element_list($td_globals_called_transitively$.getDynamicValue(thread));
                    } finally {
                        $td_globals_called_transitively$.rebind(_prev_bind_1, thread);
                        $td_methods_called_transitively$.rebind(_prev_bind_0, thread);
                    }
                }
                called_methods = Sort.sort(called_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
                called_globals = Sort.sort(called_globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
                return values(called_methods, called_globals);
            }
        }
    }

    @LispMethod(comment = "Return the complete set of methods and globals transitively called by CALLING-METHOD.")
    public static SubLObject td_method_calls_transitively(final SubLObject calling_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject called_methods = NIL;
        SubLObject called_globals = NIL;
        final SubLObject _prev_bind_0 = $td_methods_called_transitively$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $td_globals_called_transitively$.currentBinding(thread);
        try {
            $td_methods_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            $td_globals_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            SubLObject cdolist_list_var = td_methods_called_by_method(calling_method);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            cdolist_list_var = td_globals_called_by_method(calling_method);
            SubLObject called_global = NIL;
            called_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            } 
            called_methods = set.set_element_list($td_methods_called_transitively$.getDynamicValue(thread));
            called_globals = set.set_element_list($td_globals_called_transitively$.getDynamicValue(thread));
        } finally {
            $td_globals_called_transitively$.rebind(_prev_bind_2, thread);
            $td_methods_called_transitively$.rebind(_prev_bind_0, thread);
        }
        called_methods = Sort.sort(called_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        called_globals = Sort.sort(called_globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        return values(called_methods, called_globals);
    }

    /**
     * Return the complete set of methods and globals transitively called by CALLING-GLOBAL.
     */
    @LispMethod(comment = "Return the complete set of methods and globals transitively called by CALLING-GLOBAL.")
    public static final SubLObject td_global_calls_transitively_alt(SubLObject calling_global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject called_methods = NIL;
                SubLObject called_globals = NIL;
                {
                    SubLObject _prev_bind_0 = $td_methods_called_transitively$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $td_globals_called_transitively$.currentBinding(thread);
                    try {
                        $td_methods_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        $td_globals_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(calling_global);
                            SubLObject called_method = NIL;
                            for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.translator_utilities.td_note_method_called_transitively(called_method);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(calling_global);
                            SubLObject called_global = NIL;
                            for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.translator_utilities.td_note_global_called_transitively(called_global);
                            }
                        }
                        called_methods = set.set_element_list($td_methods_called_transitively$.getDynamicValue(thread));
                        called_globals = set.set_element_list($td_globals_called_transitively$.getDynamicValue(thread));
                    } finally {
                        $td_globals_called_transitively$.rebind(_prev_bind_1, thread);
                        $td_methods_called_transitively$.rebind(_prev_bind_0, thread);
                    }
                }
                called_methods = Sort.sort(called_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
                called_globals = Sort.sort(called_globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
                return values(called_methods, called_globals);
            }
        }
    }

    @LispMethod(comment = "Return the complete set of methods and globals transitively called by CALLING-GLOBAL.")
    public static SubLObject td_global_calls_transitively(final SubLObject calling_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject called_methods = NIL;
        SubLObject called_globals = NIL;
        final SubLObject _prev_bind_0 = $td_methods_called_transitively$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $td_globals_called_transitively$.currentBinding(thread);
        try {
            $td_methods_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            $td_globals_called_transitively$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            SubLObject cdolist_list_var = td_methods_called_by_global(calling_global);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            cdolist_list_var = td_globals_called_by_method(calling_global);
            SubLObject called_global = NIL;
            called_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            } 
            called_methods = set.set_element_list($td_methods_called_transitively$.getDynamicValue(thread));
            called_globals = set.set_element_list($td_globals_called_transitively$.getDynamicValue(thread));
        } finally {
            $td_globals_called_transitively$.rebind(_prev_bind_2, thread);
            $td_methods_called_transitively$.rebind(_prev_bind_0, thread);
        }
        called_methods = Sort.sort(called_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        called_globals = Sort.sort(called_globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        return values(called_methods, called_globals);
    }

    public static final SubLObject td_note_method_called_transitively_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == set.set_memberP(method, $td_methods_called_transitively$.getDynamicValue(thread))) {
                set.set_add(method, $td_methods_called_transitively$.getDynamicValue(thread));
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(method);
                    SubLObject called_method = NIL;
                    for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.translator_utilities.td_note_method_called_transitively(called_method);
                    }
                }
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(method);
                    SubLObject called_global = NIL;
                    for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.translator_utilities.td_note_global_called_transitively(called_global);
                    }
                }
            }
            return method;
        }
    }

    public static SubLObject td_note_method_called_transitively(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_memberP(method, $td_methods_called_transitively$.getDynamicValue(thread))) {
            set.set_add(method, $td_methods_called_transitively$.getDynamicValue(thread));
            SubLObject cdolist_list_var = td_methods_called_by_method(method);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            cdolist_list_var = td_globals_called_by_method(method);
            SubLObject called_global = NIL;
            called_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            } 
        }
        return method;
    }

    public static final SubLObject td_note_global_called_transitively_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == set.set_memberP(global, $td_globals_called_transitively$.getDynamicValue(thread))) {
                set.set_add(global, $td_globals_called_transitively$.getDynamicValue(thread));
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(global);
                    SubLObject called_method = NIL;
                    for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.translator_utilities.td_note_method_called_transitively(called_method);
                    }
                }
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_global(global);
                    SubLObject called_global = NIL;
                    for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.translator_utilities.td_note_global_called_transitively(called_global);
                    }
                }
            }
            return global;
        }
    }

    public static SubLObject td_note_global_called_transitively(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.set_memberP(global, $td_globals_called_transitively$.getDynamicValue(thread))) {
            set.set_add(global, $td_globals_called_transitively$.getDynamicValue(thread));
            SubLObject cdolist_list_var = td_methods_called_by_global(global);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_method_called_transitively(called_method);
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            cdolist_list_var = td_globals_called_by_global(global);
            SubLObject called_global = NIL;
            called_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                td_note_global_called_transitively(called_global);
                cdolist_list_var = cdolist_list_var.rest();
                called_global = cdolist_list_var.first();
            } 
        }
        return global;
    }

    /**
     * Return the complete set of modules transitively referenced by CALLING-METHOD.
     */
    @LispMethod(comment = "Return the complete set of modules transitively referenced by CALLING-METHOD.")
    public static final SubLObject td_method_references_modules_transitively_alt(SubLObject calling_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject called_methods = com.cyc.cycjava.cycl.translator_utilities.td_method_calls_transitively(calling_method);
                SubLObject called_globals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject referenced_modules = NIL;
                    {
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(called_method);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject item_var = referenced_module;
                                        if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            referenced_modules = cons(item_var, referenced_modules);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = called_globals;
                        SubLObject called_global = NIL;
                        for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(called_global);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject item_var = referenced_module;
                                        if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            referenced_modules = cons(item_var, referenced_modules);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    referenced_modules = Sort.sort(referenced_modules, symbol_function(STRING_LESSP), UNPROVIDED);
                    return referenced_modules;
                }
            }
        }
    }

    @LispMethod(comment = "Return the complete set of modules transitively referenced by CALLING-METHOD.")
    public static SubLObject td_method_references_modules_transitively(final SubLObject calling_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_method_calls_transitively(calling_method);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject referenced_modules = NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_method_defining_module(called_method);
            if (NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    referenced_modules = cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        cdolist_list_var = called_globals;
        SubLObject called_global = NIL;
        called_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_global_defining_module(called_global);
            if (NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    referenced_modules = cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        } 
        referenced_modules = Sort.sort(referenced_modules, symbol_function(STRING_LESSP), UNPROVIDED);
        return referenced_modules;
    }

    /**
     * Return the latest modules transitively referenced by CALLING-METHOD.
     */
    @LispMethod(comment = "Return the latest modules transitively referenced by CALLING-METHOD.")
    public static final SubLObject td_method_latest_transitively_referenced_module_alt(SubLObject calling_method) {
        {
            SubLObject referenced_modules = com.cyc.cycjava.cycl.translator_utilities.td_method_references_modules_transitively(calling_method);
            SubLObject latest_module = list_utilities.extremal(referenced_modules, symbol_function(TD_MODULE_LATER), UNPROVIDED);
            return latest_module;
        }
    }

    @LispMethod(comment = "Return the latest modules transitively referenced by CALLING-METHOD.")
    public static SubLObject td_method_latest_transitively_referenced_module(final SubLObject calling_method) {
        final SubLObject referenced_modules = td_method_references_modules_transitively(calling_method);
        final SubLObject latest_module = list_utilities.extremal(referenced_modules, symbol_function(TD_MODULE_LATER), UNPROVIDED);
        return latest_module;
    }

    public static final SubLObject td_method_latest_transitively_referenced_module_memoized_internal_alt(SubLObject referenced_method) {
        return com.cyc.cycjava.cycl.translator_utilities.td_method_latest_transitively_referenced_module(referenced_method);
    }

    public static SubLObject td_method_latest_transitively_referenced_module_memoized_internal(final SubLObject referenced_method) {
        return td_method_latest_transitively_referenced_module(referenced_method);
    }

    public static final SubLObject td_method_latest_transitively_referenced_module_memoized_alt(SubLObject referenced_method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.translator_utilities.td_method_latest_transitively_referenced_module_memoized_internal(referenced_method);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_method, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.translator_utilities.td_method_latest_transitively_referenced_module_memoized_internal(referenced_method)));
                        memoization_state.caching_state_put(caching_state, referenced_method, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject td_method_latest_transitively_referenced_module_memoized(final SubLObject referenced_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return td_method_latest_transitively_referenced_module_memoized_internal(referenced_method);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_method, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(td_method_latest_transitively_referenced_module_memoized_internal(referenced_method)));
            memoization_state.caching_state_put(caching_state, referenced_method, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return an explanation for why LATEST-MODULE is the latest transitively referenced module.
     * Returns two values : a list of methods, and a list of globals that are referenced.
     */
    @LispMethod(comment = "Return an explanation for why LATEST-MODULE is the latest transitively referenced module.\r\nReturns two values : a list of methods, and a list of globals that are referenced.\nReturn an explanation for why LATEST-MODULE is the latest transitively referenced module.\nReturns two values : a list of methods, and a list of globals that are referenced.")
    public static final SubLObject td_justify_method_latest_transitively_referenced_module_alt(SubLObject calling_method, SubLObject latest_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject called_methods = com.cyc.cycjava.cycl.translator_utilities.td_method_calls_transitively(calling_method);
                SubLObject called_globals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject justifying_methods = NIL;
                    SubLObject justifying_globals = NIL;
                    {
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            if (latest_module.equal(com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(called_method))) {
                                justifying_methods = cons(called_method, justifying_methods);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = called_globals;
                        SubLObject called_global = NIL;
                        for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                            if (latest_module.equal(com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(called_global))) {
                                justifying_globals = cons(called_global, justifying_globals);
                            }
                        }
                    }
                    return values(nreverse(justifying_methods), nreverse(justifying_globals));
                }
            }
        }
    }

    @LispMethod(comment = "Return an explanation for why LATEST-MODULE is the latest transitively referenced module.\r\nReturns two values : a list of methods, and a list of globals that are referenced.\nReturn an explanation for why LATEST-MODULE is the latest transitively referenced module.\nReturns two values : a list of methods, and a list of globals that are referenced.")
    public static SubLObject td_justify_method_latest_transitively_referenced_module(final SubLObject calling_method, final SubLObject latest_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_method_calls_transitively(calling_method);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject justifying_methods = NIL;
        SubLObject justifying_globals = NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (latest_module.equal(td_method_defining_module(called_method))) {
                justifying_methods = cons(called_method, justifying_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        cdolist_list_var = called_globals;
        SubLObject called_global = NIL;
        called_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (latest_module.equal(td_global_defining_module(called_global))) {
                justifying_globals = cons(called_global, justifying_globals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        } 
        return values(nreverse(justifying_methods), nreverse(justifying_globals));
    }

    /**
     * Return the shortest call path justifying how CLIENT-METHOD calls SERVER-METHOD.
     *
     * @return list of function-symbol-p ; the call path (CLIENT-METHOD ... SERVER-METHOD).
     */
    @LispMethod(comment = "Return the shortest call path justifying how CLIENT-METHOD calls SERVER-METHOD.\r\n\r\n@return list of function-symbol-p ; the call path (CLIENT-METHOD ... SERVER-METHOD).")
    public static final SubLObject td_justify_method_calls_transitively_alt(SubLObject client_method, SubLObject server_method) {
        {
            SubLObject seen_table = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject unvisited_queue = queues.create_queue();
            SubLObject foundP = NIL;
            dictionary.dictionary_enter(seen_table, client_method, NIL);
            queues.enqueue(client_method, unvisited_queue);
            while (NIL == queues.queue_empty_p(unvisited_queue)) {
                {
                    SubLObject method = queues.dequeue(unvisited_queue);
                    SubLObject called_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(method);
                    if (NIL == foundP) {
                        {
                            SubLObject csome_list_var = called_methods;
                            SubLObject called_method = NIL;
                            for (called_method = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , called_method = csome_list_var.first()) {
                                if ($UNSEEN == dictionary.dictionary_lookup_without_values(seen_table, called_method, $UNSEEN)) {
                                    dictionary.dictionary_enter(seen_table, called_method, method);
                                    foundP = eq(called_method, server_method);
                                    if (NIL != foundP) {
                                        queues.clear_queue(unvisited_queue);
                                    } else {
                                        queues.enqueue(called_method, unvisited_queue);
                                    }
                                }
                            }
                        }
                    }
                }
            } 
            {
                SubLObject call_path = NIL;
                if (NIL != foundP) {
                    {
                        SubLObject method = NIL;
                        for (method = server_method; NIL != method; method = dictionary.dictionary_lookup_without_values(seen_table, method, UNPROVIDED)) {
                            call_path = cons(method, call_path);
                        }
                    }
                }
                return values(call_path, dictionary.dictionary_length(seen_table));
            }
        }
    }

    /**
     * Return the shortest call path justifying how CLIENT-METHOD calls SERVER-METHOD.
     *
     * @return list of function-symbol-p ; the call path (CLIENT-METHOD ... SERVER-METHOD).
     */
    @LispMethod(comment = "Return the shortest call path justifying how CLIENT-METHOD calls SERVER-METHOD.\r\n\r\n@return list of function-symbol-p ; the call path (CLIENT-METHOD ... SERVER-METHOD).")
    public static SubLObject td_justify_method_calls_transitively(final SubLObject client_method, final SubLObject server_method) {
        final SubLObject seen_table = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        final SubLObject unvisited_queue = queues.create_queue(UNPROVIDED);
        SubLObject foundP = NIL;
        dictionary.dictionary_enter(seen_table, client_method, NIL);
        queues.enqueue(client_method, unvisited_queue);
        while (NIL == queues.queue_empty_p(unvisited_queue)) {
            final SubLObject method = queues.dequeue(unvisited_queue);
            final SubLObject called_methods = td_methods_called_by_method(method);
            if (NIL == foundP) {
                SubLObject csome_list_var = called_methods;
                SubLObject called_method = NIL;
                called_method = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if ($UNSEEN == dictionary.dictionary_lookup_without_values(seen_table, called_method, $UNSEEN)) {
                        dictionary.dictionary_enter(seen_table, called_method, method);
                        foundP = eq(called_method, server_method);
                        if (NIL != foundP) {
                            queues.clear_queue(unvisited_queue);
                        } else {
                            queues.enqueue(called_method, unvisited_queue);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    called_method = csome_list_var.first();
                } 
            }
        } 
        SubLObject call_path = NIL;
        if (NIL != foundP) {
            SubLObject method2;
            for (method2 = NIL, method2 = server_method; NIL != method2; method2 = dictionary.dictionary_lookup_without_values(seen_table, method2, UNPROVIDED)) {
                call_path = cons(method2, call_path);
            }
        }
        return values(call_path, dictionary.dictionary_length(seen_table));
    }

    /**
     * Return the complete set of modules transitively referenced by CALLING-GLOBAL.
     */
    @LispMethod(comment = "Return the complete set of modules transitively referenced by CALLING-GLOBAL.")
    public static final SubLObject td_global_references_modules_transitively_alt(SubLObject calling_global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject called_methods = com.cyc.cycjava.cycl.translator_utilities.td_global_calls_transitively(calling_global);
                SubLObject called_globals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject referenced_modules = NIL;
                    {
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(called_method);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject item_var = referenced_module;
                                        if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            referenced_modules = cons(item_var, referenced_modules);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = called_globals;
                        SubLObject called_global = NIL;
                        for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(called_global);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject item_var = referenced_module;
                                        if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            referenced_modules = cons(item_var, referenced_modules);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    referenced_modules = Sort.sort(referenced_modules, symbol_function(STRING_LESSP), UNPROVIDED);
                    return referenced_modules;
                }
            }
        }
    }

    /**
     * Return the complete set of modules transitively referenced by CALLING-GLOBAL.
     */
    @LispMethod(comment = "Return the complete set of modules transitively referenced by CALLING-GLOBAL.")
    public static SubLObject td_global_references_modules_transitively(final SubLObject calling_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_global_calls_transitively(calling_global);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject referenced_modules = NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_method_defining_module(called_method);
            if (NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    referenced_modules = cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        cdolist_list_var = called_globals;
        SubLObject called_global = NIL;
        called_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referenced_module = td_global_defining_module(called_global);
            if (NIL != referenced_module) {
                final SubLObject item_var = referenced_module;
                if (NIL == member(item_var, referenced_modules, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    referenced_modules = cons(item_var, referenced_modules);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        } 
        referenced_modules = Sort.sort(referenced_modules, symbol_function(STRING_LESSP), UNPROVIDED);
        return referenced_modules;
    }

    /**
     * Return the latest modules transitively referenced by CALLING-GLOBAL.
     */
    @LispMethod(comment = "Return the latest modules transitively referenced by CALLING-GLOBAL.")
    public static final SubLObject td_global_latest_transitively_referenced_module_alt(SubLObject calling_global) {
        {
            SubLObject referenced_modules = com.cyc.cycjava.cycl.translator_utilities.td_global_references_modules_transitively(calling_global);
            SubLObject latest_module = list_utilities.extremal(referenced_modules, symbol_function(TD_MODULE_LATER), UNPROVIDED);
            return latest_module;
        }
    }

    @LispMethod(comment = "Return the latest modules transitively referenced by CALLING-GLOBAL.")
    public static SubLObject td_global_latest_transitively_referenced_module(final SubLObject calling_global) {
        final SubLObject referenced_modules = td_global_references_modules_transitively(calling_global);
        final SubLObject latest_module = list_utilities.extremal(referenced_modules, symbol_function(TD_MODULE_LATER), UNPROVIDED);
        return latest_module;
    }/**
     * Return the latest modules transitively referenced by CALLING-GLOBAL.
     */


    public static final SubLObject td_global_latest_transitively_referenced_module_memoized_internal_alt(SubLObject referenced_global) {
        return com.cyc.cycjava.cycl.translator_utilities.td_global_latest_transitively_referenced_module(referenced_global);
    }

    public static SubLObject td_global_latest_transitively_referenced_module_memoized_internal(final SubLObject referenced_global) {
        return td_global_latest_transitively_referenced_module(referenced_global);
    }

    public static final SubLObject td_global_latest_transitively_referenced_module_memoized_alt(SubLObject referenced_global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.translator_utilities.td_global_latest_transitively_referenced_module_memoized_internal(referenced_global);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_global, $kw2$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.translator_utilities.td_global_latest_transitively_referenced_module_memoized_internal(referenced_global)));
                        memoization_state.caching_state_put(caching_state, referenced_global, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject td_global_latest_transitively_referenced_module_memoized(final SubLObject referenced_global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return td_global_latest_transitively_referenced_module_memoized_internal(referenced_global);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, referenced_global, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(td_global_latest_transitively_referenced_module_memoized_internal(referenced_global)));
            memoization_state.caching_state_put(caching_state, referenced_global, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return an explanation for why LATEST-MODULE is the latest transitively referenced module.
     * Returns two values : a list of methods, and a list of globals that are referenced.
     */
    @LispMethod(comment = "Return an explanation for why LATEST-MODULE is the latest transitively referenced module.\r\nReturns two values : a list of methods, and a list of globals that are referenced.\nReturn an explanation for why LATEST-MODULE is the latest transitively referenced module.\nReturns two values : a list of methods, and a list of globals that are referenced.")
    public static final SubLObject td_justify_global_latest_transitively_referenced_module_alt(SubLObject calling_global, SubLObject latest_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject called_methods = com.cyc.cycjava.cycl.translator_utilities.td_global_calls_transitively(calling_global);
                SubLObject called_globals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject justifying_methods = NIL;
                    SubLObject justifying_globals = NIL;
                    {
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            if (latest_module.equal(com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(called_method))) {
                                justifying_methods = cons(called_method, justifying_methods);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = called_globals;
                        SubLObject called_global = NIL;
                        for (called_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_global = cdolist_list_var.first()) {
                            if (latest_module.equal(com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(called_global))) {
                                justifying_globals = cons(called_global, justifying_globals);
                            }
                        }
                    }
                    return values(nreverse(justifying_methods), nreverse(justifying_globals));
                }
            }
        }
    }

    @LispMethod(comment = "Return an explanation for why LATEST-MODULE is the latest transitively referenced module.\r\nReturns two values : a list of methods, and a list of globals that are referenced.\nReturn an explanation for why LATEST-MODULE is the latest transitively referenced module.\nReturns two values : a list of methods, and a list of globals that are referenced.")
    public static SubLObject td_justify_global_latest_transitively_referenced_module(final SubLObject calling_global, final SubLObject latest_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject called_methods = td_global_calls_transitively(calling_global);
        final SubLObject called_globals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject justifying_methods = NIL;
        SubLObject justifying_globals = NIL;
        SubLObject cdolist_list_var = called_methods;
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (latest_module.equal(td_method_defining_module(called_method))) {
                justifying_methods = cons(called_method, justifying_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        cdolist_list_var = called_globals;
        SubLObject called_global = NIL;
        called_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (latest_module.equal(td_global_defining_module(called_global))) {
                justifying_globals = cons(called_global, justifying_globals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            called_global = cdolist_list_var.first();
        } 
        return values(nreverse(justifying_methods), nreverse(justifying_globals));
    }/**
     * Return an explanation for why LATEST-MODULE is the latest transitively referenced module.
     * Returns two values : a list of methods, and a list of globals that are referenced.
     */


    /**
     * Determine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.
     * Return a feature expression which would have problems, thus explaining the incongruence.
     * Return NIL if they are not incongruent.
     */
    @LispMethod(comment = "Determine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.\r\nReturn a feature expression which would have problems, thus explaining the incongruence.\r\nReturn NIL if they are not incongruent.\nDetermine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.\nReturn a feature expression which would have problems, thus explaining the incongruence.\nReturn NIL if they are not incongruent.")
    public static final SubLObject incongruent_features_alt(SubLObject defined_features, SubLObject referenced_features) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defined_prop_sentence = com.cyc.cycjava.cycl.translator_utilities.feature_expression_transform(defined_features);
                SubLObject referenced_prop_sentence = com.cyc.cycjava.cycl.translator_utilities.feature_expression_transform(referenced_features);
                SubLObject implication = list($OR, list($NOT, defined_prop_sentence), referenced_prop_sentence);
                SubLObject incongruence_explanation = NIL;
                {
                    SubLObject _prev_bind_0 = prop_sentence_clausifier.$prop_sentence_and$.currentBinding(thread);
                    SubLObject _prev_bind_1 = prop_sentence_clausifier.$prop_sentence_or$.currentBinding(thread);
                    SubLObject _prev_bind_2 = prop_sentence_clausifier.$prop_sentence_not$.currentBinding(thread);
                    SubLObject _prev_bind_3 = prop_sentence_clausifier.$prop_sentence_true$.currentBinding(thread);
                    SubLObject _prev_bind_4 = prop_sentence_clausifier.$prop_sentence_false$.currentBinding(thread);
                    try {
                        prop_sentence_clausifier.$prop_sentence_and$.bind($AND, thread);
                        prop_sentence_clausifier.$prop_sentence_or$.bind($OR, thread);
                        prop_sentence_clausifier.$prop_sentence_not$.bind($NOT, thread);
                        prop_sentence_clausifier.$prop_sentence_true$.bind(T, thread);
                        prop_sentence_clausifier.$prop_sentence_false$.bind(NIL, thread);
                        incongruence_explanation = prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_dnf(prop_sentence_clausifier.prop_sentence_negate(prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_cnf(implication)))));
                    } finally {
                        prop_sentence_clausifier.$prop_sentence_false$.rebind(_prev_bind_4, thread);
                        prop_sentence_clausifier.$prop_sentence_true$.rebind(_prev_bind_3, thread);
                        prop_sentence_clausifier.$prop_sentence_not$.rebind(_prev_bind_2, thread);
                        prop_sentence_clausifier.$prop_sentence_or$.rebind(_prev_bind_1, thread);
                        prop_sentence_clausifier.$prop_sentence_and$.rebind(_prev_bind_0, thread);
                    }
                }
                return incongruence_explanation;
            }
        }
    }

    @LispMethod(comment = "Determine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.\r\nReturn a feature expression which would have problems, thus explaining the incongruence.\r\nReturn NIL if they are not incongruent.\nDetermine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.\nReturn a feature expression which would have problems, thus explaining the incongruence.\nReturn NIL if they are not incongruent.")
    public static SubLObject incongruent_features(final SubLObject defined_features, final SubLObject referenced_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defined_prop_sentence = feature_expression_transform(defined_features);
        final SubLObject referenced_prop_sentence = feature_expression_transform(referenced_features);
        final SubLObject implication = list($OR, list($NOT, defined_prop_sentence), referenced_prop_sentence);
        SubLObject incongruence_explanation = NIL;
        final SubLObject _prev_bind_0 = prop_sentence_clausifier.$prop_sentence_and$.currentBinding(thread);
        final SubLObject _prev_bind_2 = prop_sentence_clausifier.$prop_sentence_or$.currentBinding(thread);
        final SubLObject _prev_bind_3 = prop_sentence_clausifier.$prop_sentence_not$.currentBinding(thread);
        final SubLObject _prev_bind_4 = prop_sentence_clausifier.$prop_sentence_true$.currentBinding(thread);
        final SubLObject _prev_bind_5 = prop_sentence_clausifier.$prop_sentence_false$.currentBinding(thread);
        try {
            prop_sentence_clausifier.$prop_sentence_and$.bind($AND, thread);
            prop_sentence_clausifier.$prop_sentence_or$.bind($OR, thread);
            prop_sentence_clausifier.$prop_sentence_not$.bind($NOT, thread);
            prop_sentence_clausifier.$prop_sentence_true$.bind(T, thread);
            prop_sentence_clausifier.$prop_sentence_false$.bind(NIL, thread);
            incongruence_explanation = prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_dnf(prop_sentence_clausifier.prop_sentence_negate(prop_sentence_clausifier.prop_sentence_simplify(prop_sentence_clausifier.prop_sentence_to_cnf(implication)))));
        } finally {
            prop_sentence_clausifier.$prop_sentence_false$.rebind(_prev_bind_5, thread);
            prop_sentence_clausifier.$prop_sentence_true$.rebind(_prev_bind_4, thread);
            prop_sentence_clausifier.$prop_sentence_not$.rebind(_prev_bind_3, thread);
            prop_sentence_clausifier.$prop_sentence_or$.rebind(_prev_bind_2, thread);
            prop_sentence_clausifier.$prop_sentence_and$.rebind(_prev_bind_0, thread);
        }
        return incongruence_explanation;
    }/**
     * Determine if it is incongruent for DEFINED-FEATURES to reference REFERENCED-FEATURES.
     * Return a feature expression which would have problems, thus explaining the incongruence.
     * Return NIL if they are not incongruent.
     */


    public static final SubLObject feature_expression_transform_alt(SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(NON_FEATURE_SYMBOL_P), symbol_function(TRANSFORM_NON_FEATURE_SYMBOL), UNPROVIDED);
    }

    public static SubLObject feature_expression_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, symbol_function(NON_FEATURE_SYMBOL_P), symbol_function(TRANSFORM_NON_FEATURE_SYMBOL), UNPROVIDED);
    }

    public static final SubLObject non_feature_symbol_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (!v_object.isKeyword())) && (v_object != T)) && (v_object != NIL));
    }

    public static SubLObject non_feature_symbol_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isSymbol() && (!v_object.isKeyword())) && (v_object != T)) && (v_object != NIL));
    }

    public static final SubLObject transform_non_feature_symbol_alt(SubLObject symbol) {
        return make_keyword(symbol_name(symbol));
    }

    public static SubLObject transform_non_feature_symbol(final SubLObject symbol) {
        return make_keyword(symbol_name(symbol));
    }

    /**
     * Analyze the definitions in all modules and return a list of all the potential module-level feature problems.
     *
     * @return a list of objects suitable for show-feature-reference-incongruences
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all the potential module-level feature problems.\r\n\r\n@return a list of objects suitable for show-feature-reference-incongruences")
    public static final SubLObject all_module_level_feature_problems_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_feature_problems = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($str_alt24$Identifying_module_level_feature_, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_9 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject feature_problems = com.cyc.cycjava.cycl.translator_utilities.module_level_feature_problems(module);
                                                        SubLObject cdolist_list_var = feature_problems;
                                                        SubLObject feature_problem = NIL;
                                                        for (feature_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature_problem = cdolist_list_var.first()) {
                                                            all_feature_problems = cons(feature_problem, all_feature_problems);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_feature_problems);
            }
        }
    }

    /**
     * Analyze the definitions in all modules and return a list of all the potential module-level feature problems.
     *
     * @return a list of objects suitable for show-feature-reference-incongruences
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all the potential module-level feature problems.\r\n\r\n@return a list of objects suitable for show-feature-reference-incongruences")
    public static SubLObject all_module_level_feature_problems(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_feature_problems = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($str21$Identifying_module_level_feature_, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject feature_problems = cdolist_list_var = module_level_feature_problems(module);
                            SubLObject feature_problem = NIL;
                            feature_problem = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_feature_problems = cons(feature_problem, all_feature_problems);
                                cdolist_list_var = cdolist_list_var.rest();
                                feature_problem = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_feature_problems);
    }

    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of all the potential module-level feature problems.
     *
     * @return a list of objects suitable for show-feature-reference-incongruences
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of all the potential module-level feature problems.\r\n\r\n@return a list of objects suitable for show-feature-reference-incongruences")
    public static final SubLObject module_level_feature_problems_alt(SubLObject defined_module) {
        {
            SubLObject defined_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(defined_module);
            SubLObject feature_problems = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                SubLObject defined_method = NIL;
                for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(defined_method);
                        SubLObject cdolist_list_var_11 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , referenced_method = cdolist_list_var_11.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                        SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                        if (NIL != incongruence) {
                                            feature_problems = cons(list(list($METHOD, defined_method, defined_module, defined_features), list($METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(defined_method);
                        SubLObject cdolist_list_var_12 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , referenced_global = cdolist_list_var_12.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                        SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                        if (NIL != incongruence) {
                                            feature_problems = cons(list(list($METHOD, defined_method, defined_module, defined_features), list($GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                SubLObject defined_global = NIL;
                for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(defined_global);
                        SubLObject cdolist_list_var_13 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , referenced_method = cdolist_list_var_13.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                        SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                        if (NIL != incongruence) {
                                            feature_problems = cons(list(list($GLOBAL, defined_global, defined_module, defined_features), list($METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_global(defined_global);
                        SubLObject cdolist_list_var_14 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , referenced_global = cdolist_list_var_14.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                        SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                        if (NIL != incongruence) {
                                            feature_problems = cons(list(list($GLOBAL, defined_global, defined_module, defined_features), list($GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_methods;
                SubLObject referenced_method = NIL;
                for (referenced_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_method = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                        if (NIL != referenced_module) {
                            {
                                SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                if (NIL != incongruence) {
                                    feature_problems = cons(list(list($MODULE, defined_module, defined_features), list($METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_globals;
                SubLObject referenced_global = NIL;
                for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                        if (NIL != referenced_module) {
                            {
                                SubLObject referenced_features = com.cyc.cycjava.cycl.translator_utilities.td_module_features(referenced_module);
                                SubLObject incongruence = com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence(defined_features, referenced_features);
                                if (NIL != incongruence) {
                                    feature_problems = cons(list(list($MODULE, defined_module, defined_features), list($GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(feature_problems);
        }
    }

    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of all the potential module-level feature problems.
     *
     * @return a list of objects suitable for show-feature-reference-incongruences
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of all the potential module-level feature problems.\r\n\r\n@return a list of objects suitable for show-feature-reference-incongruences")
    public static SubLObject module_level_feature_problems(final SubLObject defined_module) {
        final SubLObject defined_features = td_module_features(defined_module);
        SubLObject feature_problems = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12;
            final SubLObject referenced_methods = cdolist_list_var_$12 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (NIL != incongruence) {
                        feature_problems = cons(list(list($METHOD, defined_method, defined_module, defined_features), list($METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                referenced_method = cdolist_list_var_$12.first();
            } 
            SubLObject cdolist_list_var_$13;
            final SubLObject referenced_globals = cdolist_list_var_$13 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (NIL != incongruence) {
                        feature_problems = cons(list(list($METHOD, defined_method, defined_module, defined_features), list($GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                referenced_global = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$14;
            final SubLObject referenced_methods = cdolist_list_var_$14 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (NIL != incongruence) {
                        feature_problems = cons(list(list($GLOBAL, defined_global, defined_module, defined_features), list($METHOD, referenced_method, referenced_module, referenced_features), incongruence), feature_problems);
                    }
                }
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                referenced_method = cdolist_list_var_$14.first();
            } 
            SubLObject cdolist_list_var_$15;
            final SubLObject referenced_globals = cdolist_list_var_$15 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (NIL != referenced_module) {
                    final SubLObject referenced_features = td_module_features(referenced_module);
                    final SubLObject incongruence = potential_module_level_feature_incongruence(defined_features, referenced_features);
                    if (NIL != incongruence) {
                        feature_problems = cons(list(list($GLOBAL, defined_global, defined_module, defined_features), list($GLOBAL, referenced_global, referenced_module, referenced_features), incongruence), feature_problems);
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
        SubLObject referenced_method2 = NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (NIL != referenced_module2) {
                final SubLObject referenced_features2 = td_module_features(referenced_module2);
                final SubLObject incongruence2 = potential_module_level_feature_incongruence(defined_features, referenced_features2);
                if (NIL != incongruence2) {
                    feature_problems = cons(list(list($MODULE, defined_module, defined_features), list($METHOD, referenced_method2, referenced_module2, referenced_features2), incongruence2), feature_problems);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        } 
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (NIL != referenced_module2) {
                final SubLObject referenced_features2 = td_module_features(referenced_module2);
                final SubLObject incongruence2 = potential_module_level_feature_incongruence(defined_features, referenced_features2);
                if (NIL != incongruence2) {
                    feature_problems = cons(list(list($MODULE, defined_module, defined_features), list($GLOBAL, referenced_global2, referenced_module2, referenced_features2), incongruence2), feature_problems);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        } 
        return nreverse(feature_problems);
    }

    public static final SubLObject potential_module_level_feature_incongruence_internal_alt(SubLObject defined_features, SubLObject referenced_features) {
        return com.cyc.cycjava.cycl.translator_utilities.incongruent_features(defined_features, referenced_features);
    }

    public static SubLObject potential_module_level_feature_incongruence_internal(final SubLObject defined_features, final SubLObject referenced_features) {
        return incongruent_features(defined_features, referenced_features);
    }

    public static final SubLObject potential_module_level_feature_incongruence_alt(SubLObject defined_features, SubLObject referenced_features) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence_internal(defined_features, referenced_features);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(defined_features, referenced_features);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw2$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (defined_features.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && referenced_features.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.translator_utilities.potential_module_level_feature_incongruence_internal(defined_features, referenced_features)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(defined_features, referenced_features));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject potential_module_level_feature_incongruence(final SubLObject defined_features, final SubLObject referenced_features) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return potential_module_level_feature_incongruence_internal(defined_features, referenced_features);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(defined_features, referenced_features);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (defined_features.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && referenced_features.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(potential_module_level_feature_incongruence_internal(defined_features, referenced_features)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(defined_features, referenced_features));
        return memoization_state.caching_results(results3);
    }

    /**
     * Show a list of feature problems described in FEATURE-PROBLEM-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of feature problems described in FEATURE-PROBLEM-SPECS to STREAM.")
    public static final SubLObject show_feature_problems_alt(SubLObject feature_problem_specs, SubLObject stream) {
        if (feature_problem_specs == UNPROVIDED) {
            feature_problem_specs = com.cyc.cycjava.cycl.translator_utilities.all_module_level_feature_problems(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = feature_problem_specs;
            SubLObject feature_problem_spec = NIL;
            for (feature_problem_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature_problem_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_feature_problem(feature_problem_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of feature problems described in FEATURE-PROBLEM-SPECS to STREAM.")
    public static SubLObject show_feature_problems(SubLObject feature_problem_specs, SubLObject stream) {
        if (feature_problem_specs == UNPROVIDED) {
            feature_problem_specs = all_module_level_feature_problems(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = feature_problem_specs;
        SubLObject feature_problem_spec = NIL;
        feature_problem_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_feature_problem(feature_problem_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            feature_problem_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of feature problems described in FEATURE-PROBLEM-SPECS to STREAM.
     */


    public static final SubLObject show_one_feature_problem_alt(SubLObject feature_problem_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = feature_problem_spec;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject def_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    def_type = current.first();
                    current = current.rest();
                    {
                        SubLObject def_args = current;
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt29);
                        {
                            SubLObject temp_15 = current.rest();
                            current = current.first();
                            {
                                SubLObject ref_type = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt29);
                                ref_type = current.first();
                                current = current.rest();
                                {
                                    SubLObject ref_args = current;
                                    current = temp_15;
                                    {
                                        SubLObject incongruence = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt29);
                                        incongruence = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject pcase_var = def_type;
                                                if (pcase_var.eql($MODULE)) {
                                                    {
                                                        SubLObject datum_16 = def_args;
                                                        SubLObject current_17 = datum_16;
                                                        SubLObject module = NIL;
                                                        SubLObject def_features = NIL;
                                                        destructuring_bind_must_consp(current_17, datum_16, $list_alt30);
                                                        module = current_17.first();
                                                        current_17 = current_17.rest();
                                                        destructuring_bind_must_consp(current_17, datum_16, $list_alt30);
                                                        def_features = current_17.first();
                                                        current_17 = current_17.rest();
                                                        if (NIL == current_17) {
                                                            format(stream, $str_alt31$__Top_level_form_in__A__, module);
                                                            com.cyc.cycjava.cycl.translator_utilities.show_one_feature_assumption(def_features, stream);
                                                        } else {
                                                            cdestructuring_bind_error(datum_16, $list_alt30);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($METHOD)) {
                                                        {
                                                            SubLObject datum_18 = def_args;
                                                            SubLObject current_19 = datum_18;
                                                            SubLObject def_object = NIL;
                                                            SubLObject module = NIL;
                                                            SubLObject def_features = NIL;
                                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt32);
                                                            def_object = current_19.first();
                                                            current_19 = current_19.rest();
                                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt32);
                                                            module = current_19.first();
                                                            current_19 = current_19.rest();
                                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt32);
                                                            def_features = current_19.first();
                                                            current_19 = current_19.rest();
                                                            if (NIL == current_19) {
                                                                format(stream, $str_alt33$__Method__A_in__A__, def_object, module);
                                                                com.cyc.cycjava.cycl.translator_utilities.show_one_feature_assumption(def_features, stream);
                                                            } else {
                                                                cdestructuring_bind_error(datum_18, $list_alt32);
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($GLOBAL)) {
                                                            {
                                                                SubLObject datum_20 = def_args;
                                                                SubLObject current_21 = datum_20;
                                                                SubLObject def_object = NIL;
                                                                SubLObject module = NIL;
                                                                SubLObject def_features = NIL;
                                                                destructuring_bind_must_consp(current_21, datum_20, $list_alt32);
                                                                def_object = current_21.first();
                                                                current_21 = current_21.rest();
                                                                destructuring_bind_must_consp(current_21, datum_20, $list_alt32);
                                                                module = current_21.first();
                                                                current_21 = current_21.rest();
                                                                destructuring_bind_must_consp(current_21, datum_20, $list_alt32);
                                                                def_features = current_21.first();
                                                                current_21 = current_21.rest();
                                                                if (NIL == current_21) {
                                                                    format(stream, $str_alt34$__Global__A_in__A__, def_object, module);
                                                                    com.cyc.cycjava.cycl.translator_utilities.show_one_feature_assumption(def_features, stream);
                                                                } else {
                                                                    cdestructuring_bind_error(datum_20, $list_alt32);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            format(stream, $str_alt35$_references);
                                            {
                                                SubLObject pcase_var = ref_type;
                                                if (pcase_var.eql($METHOD)) {
                                                    {
                                                        SubLObject datum_22 = ref_args;
                                                        SubLObject current_23 = datum_22;
                                                        SubLObject ref_object = NIL;
                                                        SubLObject module = NIL;
                                                        SubLObject ref_features = NIL;
                                                        destructuring_bind_must_consp(current_23, datum_22, $list_alt36);
                                                        ref_object = current_23.first();
                                                        current_23 = current_23.rest();
                                                        destructuring_bind_must_consp(current_23, datum_22, $list_alt36);
                                                        module = current_23.first();
                                                        current_23 = current_23.rest();
                                                        destructuring_bind_must_consp(current_23, datum_22, $list_alt36);
                                                        ref_features = current_23.first();
                                                        current_23 = current_23.rest();
                                                        if (NIL == current_23) {
                                                            format(stream, $str_alt37$__method__A_from__A__, ref_object, module);
                                                            com.cyc.cycjava.cycl.translator_utilities.show_one_feature_assumption(ref_features, stream);
                                                        } else {
                                                            cdestructuring_bind_error(datum_22, $list_alt36);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($GLOBAL)) {
                                                        {
                                                            SubLObject datum_24 = ref_args;
                                                            SubLObject current_25 = datum_24;
                                                            SubLObject ref_object = NIL;
                                                            SubLObject module = NIL;
                                                            SubLObject ref_features = NIL;
                                                            destructuring_bind_must_consp(current_25, datum_24, $list_alt36);
                                                            ref_object = current_25.first();
                                                            current_25 = current_25.rest();
                                                            destructuring_bind_must_consp(current_25, datum_24, $list_alt36);
                                                            module = current_25.first();
                                                            current_25 = current_25.rest();
                                                            destructuring_bind_must_consp(current_25, datum_24, $list_alt36);
                                                            ref_features = current_25.first();
                                                            current_25 = current_25.rest();
                                                            if (NIL == current_25) {
                                                                format(stream, $str_alt38$__global__A_from__A__, ref_object, module);
                                                                com.cyc.cycjava.cycl.translator_utilities.show_one_feature_assumption(ref_features, stream);
                                                            } else {
                                                                cdestructuring_bind_error(datum_24, $list_alt36);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            format(stream, $str_alt39$__which_will_have_problems_when__, com.cyc.cycjava.cycl.translator_utilities.feature_explanation(incongruence));
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt29);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return feature_problem_spec;
    }

    public static SubLObject show_one_feature_problem(final SubLObject feature_problem_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        destructuring_bind_must_consp(feature_problem_spec, feature_problem_spec, $list27);
        final SubLObject temp = feature_problem_spec.rest();
        SubLObject current = feature_problem_spec.first();
        SubLObject def_type = NIL;
        destructuring_bind_must_consp(current, feature_problem_spec, $list27);
        def_type = current.first();
        final SubLObject def_args;
        current = def_args = current.rest();
        current = temp;
        destructuring_bind_must_consp(current, feature_problem_spec, $list27);
        final SubLObject temp_$16 = current.rest();
        current = current.first();
        SubLObject ref_type = NIL;
        destructuring_bind_must_consp(current, feature_problem_spec, $list27);
        ref_type = current.first();
        final SubLObject ref_args;
        current = ref_args = current.rest();
        current = temp_$16;
        SubLObject incongruence = NIL;
        destructuring_bind_must_consp(current, feature_problem_spec, $list27);
        incongruence = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql($MODULE)) {
                SubLObject current_$18;
                final SubLObject datum_$17 = current_$18 = def_args;
                SubLObject module = NIL;
                SubLObject def_features = NIL;
                destructuring_bind_must_consp(current_$18, datum_$17, $list28);
                module = current_$18.first();
                current_$18 = current_$18.rest();
                destructuring_bind_must_consp(current_$18, datum_$17, $list28);
                def_features = current_$18.first();
                current_$18 = current_$18.rest();
                if (NIL == current_$18) {
                    format(stream, $str29$__Top_level_form_in__A__, module);
                    show_one_feature_assumption(def_features, stream);
                } else {
                    cdestructuring_bind_error(datum_$17, $list28);
                }
            } else
                if (pcase_var.eql($METHOD)) {
                    SubLObject current_$19;
                    final SubLObject datum_$18 = current_$19 = def_args;
                    SubLObject def_object = NIL;
                    SubLObject module2 = NIL;
                    SubLObject def_features2 = NIL;
                    destructuring_bind_must_consp(current_$19, datum_$18, $list30);
                    def_object = current_$19.first();
                    current_$19 = current_$19.rest();
                    destructuring_bind_must_consp(current_$19, datum_$18, $list30);
                    module2 = current_$19.first();
                    current_$19 = current_$19.rest();
                    destructuring_bind_must_consp(current_$19, datum_$18, $list30);
                    def_features2 = current_$19.first();
                    current_$19 = current_$19.rest();
                    if (NIL == current_$19) {
                        format(stream, $str31$__Method__A_in__A__, def_object, module2);
                        show_one_feature_assumption(def_features2, stream);
                    } else {
                        cdestructuring_bind_error(datum_$18, $list30);
                    }
                } else
                    if (pcase_var.eql($GLOBAL)) {
                        SubLObject current_$20;
                        final SubLObject datum_$19 = current_$20 = def_args;
                        SubLObject def_object = NIL;
                        SubLObject module2 = NIL;
                        SubLObject def_features2 = NIL;
                        destructuring_bind_must_consp(current_$20, datum_$19, $list30);
                        def_object = current_$20.first();
                        current_$20 = current_$20.rest();
                        destructuring_bind_must_consp(current_$20, datum_$19, $list30);
                        module2 = current_$20.first();
                        current_$20 = current_$20.rest();
                        destructuring_bind_must_consp(current_$20, datum_$19, $list30);
                        def_features2 = current_$20.first();
                        current_$20 = current_$20.rest();
                        if (NIL == current_$20) {
                            format(stream, $str32$__Global__A_in__A__, def_object, module2);
                            show_one_feature_assumption(def_features2, stream);
                        } else {
                            cdestructuring_bind_error(datum_$19, $list30);
                        }
                    }


            format(stream, $$$_references);
            pcase_var = ref_type;
            if (pcase_var.eql($METHOD)) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = ref_args;
                SubLObject ref_object = NIL;
                SubLObject module2 = NIL;
                SubLObject ref_features = NIL;
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                ref_object = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                module2 = current_$21.first();
                current_$21 = current_$21.rest();
                destructuring_bind_must_consp(current_$21, datum_$20, $list34);
                ref_features = current_$21.first();
                current_$21 = current_$21.rest();
                if (NIL == current_$21) {
                    format(stream, $str35$__method__A_from__A__, ref_object, module2);
                    show_one_feature_assumption(ref_features, stream);
                } else {
                    cdestructuring_bind_error(datum_$20, $list34);
                }
            } else
                if (pcase_var.eql($GLOBAL)) {
                    SubLObject current_$22;
                    final SubLObject datum_$21 = current_$22 = ref_args;
                    SubLObject ref_object = NIL;
                    SubLObject module2 = NIL;
                    SubLObject ref_features = NIL;
                    destructuring_bind_must_consp(current_$22, datum_$21, $list34);
                    ref_object = current_$22.first();
                    current_$22 = current_$22.rest();
                    destructuring_bind_must_consp(current_$22, datum_$21, $list34);
                    module2 = current_$22.first();
                    current_$22 = current_$22.rest();
                    destructuring_bind_must_consp(current_$22, datum_$21, $list34);
                    ref_features = current_$22.first();
                    current_$22 = current_$22.rest();
                    if (NIL == current_$22) {
                        format(stream, $str36$__global__A_from__A__, ref_object, module2);
                        show_one_feature_assumption(ref_features, stream);
                    } else {
                        cdestructuring_bind_error(datum_$21, $list34);
                    }
                }

            format(stream, $str37$__which_will_have_problems_when__, feature_explanation(incongruence));
        } else {
            cdestructuring_bind_error(feature_problem_spec, $list27);
        }
        return feature_problem_spec;
    }

    public static final SubLObject show_one_feature_assumption_alt(SubLObject feature_expression, SubLObject stream) {
        return format(stream, $str_alt40$assuming__A, com.cyc.cycjava.cycl.translator_utilities.feature_explanation(feature_expression));
    }

    public static SubLObject show_one_feature_assumption(final SubLObject feature_expression, final SubLObject stream) {
        return format(stream, $str38$assuming__A, feature_explanation(feature_expression));
    }

    /**
     * Return a phrase to explain feature-expression.
     */
    @LispMethod(comment = "Return a phrase to explain feature-expression.")
    public static final SubLObject feature_explanation_alt(SubLObject feature_expression) {
        return T == feature_expression ? ((SubLObject) ($$$no_features)) : feature_expression;
    }

    @LispMethod(comment = "Return a phrase to explain feature-expression.")
    public static SubLObject feature_explanation(final SubLObject feature_expression) {
        return T == feature_expression ? $$$no_features : feature_expression;
    }/**
     * Return a phrase to explain feature-expression.
     */


    /**
     * Analyze the definitions in all modules and return a list of all privacy-violations.
     *
     * @return a list of objects suitable for show-privacy-violations.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all privacy-violations.\r\n\r\n@return a list of objects suitable for show-privacy-violations.")
    public static final SubLObject all_privacy_violations_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_privacy_violations = NIL;
                SubLObject list_var = v_modules;
                $progress_note$.setDynamicValue($$$Identifying_privacy_violations, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject module = NIL;
                            for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject privacy_violations = com.cyc.cycjava.cycl.translator_utilities.module_privacy_violations(module);
                                    SubLObject cdolist_list_var = privacy_violations;
                                    SubLObject privacy_violation = NIL;
                                    for (privacy_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , privacy_violation = cdolist_list_var.first()) {
                                        all_privacy_violations = cons(privacy_violation, all_privacy_violations);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_privacy_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all privacy-violations.\r\n\r\n@return a list of objects suitable for show-privacy-violations.")
    public static SubLObject all_privacy_violations(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_privacy_violations = NIL;
        final SubLObject list_var = v_modules;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Identifying_privacy_violations, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject module = NIL;
                module = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var;
                    final SubLObject privacy_violations = cdolist_list_var = module_privacy_violations(module);
                    SubLObject privacy_violation = NIL;
                    privacy_violation = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        all_privacy_violations = cons(privacy_violation, all_privacy_violations);
                        cdolist_list_var = cdolist_list_var.rest();
                        privacy_violation = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    module = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_privacy_violations);
    }/**
     * Analyze the definitions in all modules and return a list of all privacy-violations.
     *
     * @return a list of objects suitable for show-privacy-violations.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its privacy violations.
     *
     * @return a list of objects suitable for show-privacy-violations.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its privacy violations.\r\n\r\n@return a list of objects suitable for show-privacy-violations.")
    public static final SubLObject module_privacy_violations_alt(SubLObject defined_module) {
        {
            SubLObject privacy_violations = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                SubLObject defined_method = NIL;
                for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(defined_method);
                        SubLObject cdolist_list_var_26 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , referenced_method = cdolist_list_var_26.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                if (NIL != referenced_module) {
                                    if (!defined_module.equal(referenced_module)) {
                                        if (NIL != form_translation.private_method_p(referenced_method)) {
                                            privacy_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module)), privacy_violations);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(defined_method);
                        SubLObject cdolist_list_var_27 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , referenced_global = cdolist_list_var_27.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                if (NIL != referenced_module) {
                                    if (!defined_module.equal(referenced_module)) {
                                        if (NIL != form_translation.private_global_p(referenced_global)) {
                                            privacy_violations = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, referenced_global, referenced_module)), privacy_violations);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                SubLObject defined_global = NIL;
                for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(defined_global);
                        SubLObject cdolist_list_var_28 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , referenced_method = cdolist_list_var_28.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                if (NIL != referenced_module) {
                                    if (!defined_module.equal(referenced_module)) {
                                        if (NIL != form_translation.private_method_p(referenced_method)) {
                                            privacy_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module)), privacy_violations);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_global(defined_global);
                        SubLObject cdolist_list_var_29 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , referenced_global = cdolist_list_var_29.first()) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                if (NIL != referenced_module) {
                                    if (!defined_module.equal(referenced_module)) {
                                        if (NIL != form_translation.private_global_p(referenced_global)) {
                                            privacy_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global, referenced_module)), privacy_violations);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_methods;
                SubLObject referenced_method = NIL;
                for (referenced_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_method = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                        if (NIL != referenced_module) {
                            if (!defined_module.equal(referenced_module)) {
                                if (NIL != form_translation.private_method_p(referenced_method)) {
                                    privacy_violations = cons(list(list($MODULE, defined_module), list($METHOD, referenced_method, referenced_module)), privacy_violations);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_globals;
                SubLObject referenced_global = NIL;
                for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                        if (NIL != referenced_module) {
                            if (!defined_module.equal(referenced_module)) {
                                if (NIL != form_translation.private_global_p(referenced_global)) {
                                    privacy_violations = cons(list(list($MODULE, defined_module), list($GLOBAL, referenced_global, referenced_module)), privacy_violations);
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(privacy_violations);
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its privacy violations.\r\n\r\n@return a list of objects suitable for show-privacy-violations.")
    public static SubLObject module_privacy_violations(final SubLObject defined_module) {
        SubLObject privacy_violations = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$28;
            final SubLObject referenced_methods = cdolist_list_var_$28 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$28.first();
            while (NIL != cdolist_list_var_$28) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (((NIL != referenced_module) && (!defined_module.equal(referenced_module))) && (NIL != form_translation.private_method_p(referenced_method))) {
                    privacy_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                referenced_method = cdolist_list_var_$28.first();
            } 
            SubLObject cdolist_list_var_$29;
            final SubLObject referenced_globals = cdolist_list_var_$29 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$29.first();
            while (NIL != cdolist_list_var_$29) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (((NIL != referenced_module) && (!defined_module.equal(referenced_module))) && (NIL != form_translation.private_global_p(referenced_global))) {
                    privacy_violations = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, referenced_global, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                referenced_global = cdolist_list_var_$29.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30;
            final SubLObject referenced_methods = cdolist_list_var_$30 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (((NIL != referenced_module) && (!defined_module.equal(referenced_module))) && (NIL != form_translation.private_method_p(referenced_method))) {
                    privacy_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                referenced_method = cdolist_list_var_$30.first();
            } 
            SubLObject cdolist_list_var_$31;
            final SubLObject referenced_globals = cdolist_list_var_$31 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$31.first();
            while (NIL != cdolist_list_var_$31) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (((NIL != referenced_module) && (!defined_module.equal(referenced_module))) && (NIL != form_translation.private_global_p(referenced_global))) {
                    privacy_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global, referenced_module)), privacy_violations);
                }
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                referenced_global = cdolist_list_var_$31.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        final SubLObject referenced_methods2 = cdolist_list_var2 = td_methods_called_by_module(defined_module);
        SubLObject referenced_method2 = NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (((NIL != referenced_module2) && (!defined_module.equal(referenced_module2))) && (NIL != form_translation.private_method_p(referenced_method2))) {
                privacy_violations = cons(list(list($MODULE, defined_module), list($METHOD, referenced_method2, referenced_module2)), privacy_violations);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        } 
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (((NIL != referenced_module2) && (!defined_module.equal(referenced_module2))) && (NIL != form_translation.private_global_p(referenced_global2))) {
                privacy_violations = cons(list(list($MODULE, defined_module), list($GLOBAL, referenced_global2, referenced_module2)), privacy_violations);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        } 
        return nreverse(privacy_violations);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its privacy violations.
     *
     * @return a list of objects suitable for show-privacy-violations.
     */


    /**
     * Show a list of privacy violations described in VIOLATION-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of privacy violations described in VIOLATION-SPECS to STREAM.")
    public static final SubLObject show_privacy_violations_alt(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = com.cyc.cycjava.cycl.translator_utilities.all_privacy_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = violation_specs;
            SubLObject violation_spec = NIL;
            for (violation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_privacy_violation(violation_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of privacy violations described in VIOLATION-SPECS to STREAM.")
    public static SubLObject show_privacy_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = all_privacy_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = NIL;
        violation_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_privacy_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of privacy violations described in VIOLATION-SPECS to STREAM.
     */


    public static final SubLObject show_one_privacy_violation_alt(SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = violation_spec;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject def_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    def_type = current.first();
                    current = current.rest();
                    {
                        SubLObject def_args = current;
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        {
                            SubLObject temp_30 = current.rest();
                            current = current.first();
                            {
                                SubLObject ref_type = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt43);
                                ref_type = current.first();
                                current = current.rest();
                                {
                                    SubLObject ref_args = current;
                                    current = temp_30;
                                    if (NIL == current) {
                                        {
                                            SubLObject pcase_var = def_type;
                                            if (pcase_var.eql($MODULE)) {
                                                {
                                                    SubLObject datum_31 = def_args;
                                                    SubLObject current_32 = datum_31;
                                                    SubLObject module = NIL;
                                                    destructuring_bind_must_consp(current_32, datum_31, $list_alt44);
                                                    module = current_32.first();
                                                    current_32 = current_32.rest();
                                                    if (NIL == current_32) {
                                                        format(stream, $str_alt31$__Top_level_form_in__A__, module);
                                                    } else {
                                                        cdestructuring_bind_error(datum_31, $list_alt44);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($METHOD)) {
                                                    {
                                                        SubLObject datum_33 = def_args;
                                                        SubLObject current_34 = datum_33;
                                                        SubLObject def_object = NIL;
                                                        SubLObject module = NIL;
                                                        destructuring_bind_must_consp(current_34, datum_33, $list_alt45);
                                                        def_object = current_34.first();
                                                        current_34 = current_34.rest();
                                                        destructuring_bind_must_consp(current_34, datum_33, $list_alt45);
                                                        module = current_34.first();
                                                        current_34 = current_34.rest();
                                                        if (NIL == current_34) {
                                                            format(stream, $str_alt33$__Method__A_in__A__, def_object, module);
                                                        } else {
                                                            cdestructuring_bind_error(datum_33, $list_alt45);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($GLOBAL)) {
                                                        {
                                                            SubLObject datum_35 = def_args;
                                                            SubLObject current_36 = datum_35;
                                                            SubLObject def_object = NIL;
                                                            SubLObject module = NIL;
                                                            destructuring_bind_must_consp(current_36, datum_35, $list_alt45);
                                                            def_object = current_36.first();
                                                            current_36 = current_36.rest();
                                                            destructuring_bind_must_consp(current_36, datum_35, $list_alt45);
                                                            module = current_36.first();
                                                            current_36 = current_36.rest();
                                                            if (NIL == current_36) {
                                                                format(stream, $str_alt34$__Global__A_in__A__, def_object, module);
                                                            } else {
                                                                cdestructuring_bind_error(datum_35, $list_alt45);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        format(stream, $str_alt46$_references_private);
                                        {
                                            SubLObject pcase_var = ref_type;
                                            if (pcase_var.eql($METHOD)) {
                                                {
                                                    SubLObject datum_37 = ref_args;
                                                    SubLObject current_38 = datum_37;
                                                    SubLObject ref_object = NIL;
                                                    SubLObject module = NIL;
                                                    destructuring_bind_must_consp(current_38, datum_37, $list_alt47);
                                                    ref_object = current_38.first();
                                                    current_38 = current_38.rest();
                                                    destructuring_bind_must_consp(current_38, datum_37, $list_alt47);
                                                    module = current_38.first();
                                                    current_38 = current_38.rest();
                                                    if (NIL == current_38) {
                                                        format(stream, $str_alt37$__method__A_from__A__, ref_object, module);
                                                    } else {
                                                        cdestructuring_bind_error(datum_37, $list_alt47);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($GLOBAL)) {
                                                    {
                                                        SubLObject datum_39 = ref_args;
                                                        SubLObject current_40 = datum_39;
                                                        SubLObject ref_object = NIL;
                                                        SubLObject module = NIL;
                                                        destructuring_bind_must_consp(current_40, datum_39, $list_alt47);
                                                        ref_object = current_40.first();
                                                        current_40 = current_40.rest();
                                                        destructuring_bind_must_consp(current_40, datum_39, $list_alt47);
                                                        module = current_40.first();
                                                        current_40 = current_40.rest();
                                                        if (NIL == current_40) {
                                                            format(stream, $str_alt38$__global__A_from__A__, ref_object, module);
                                                        } else {
                                                            cdestructuring_bind_error(datum_39, $list_alt47);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt43);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return violation_spec;
    }

    public static SubLObject show_one_privacy_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        destructuring_bind_must_consp(violation_spec, violation_spec, $list41);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        def_type = current.first();
        final SubLObject def_args;
        current = def_args = current.rest();
        current = temp;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        final SubLObject temp_$32 = current.rest();
        current = current.first();
        SubLObject ref_type = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = ref_args = current.rest();
        current = temp_$32;
        if (NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql($MODULE)) {
                SubLObject current_$34;
                final SubLObject datum_$33 = current_$34 = def_args;
                SubLObject module = NIL;
                destructuring_bind_must_consp(current_$34, datum_$33, $list42);
                module = current_$34.first();
                current_$34 = current_$34.rest();
                if (NIL == current_$34) {
                    format(stream, $str29$__Top_level_form_in__A__, module);
                } else {
                    cdestructuring_bind_error(datum_$33, $list42);
                }
            } else
                if (pcase_var.eql($METHOD)) {
                    SubLObject current_$35;
                    final SubLObject datum_$34 = current_$35 = def_args;
                    SubLObject def_object = NIL;
                    SubLObject module2 = NIL;
                    destructuring_bind_must_consp(current_$35, datum_$34, $list43);
                    def_object = current_$35.first();
                    current_$35 = current_$35.rest();
                    destructuring_bind_must_consp(current_$35, datum_$34, $list43);
                    module2 = current_$35.first();
                    current_$35 = current_$35.rest();
                    if (NIL == current_$35) {
                        format(stream, $str31$__Method__A_in__A__, def_object, module2);
                    } else {
                        cdestructuring_bind_error(datum_$34, $list43);
                    }
                } else
                    if (pcase_var.eql($GLOBAL)) {
                        SubLObject current_$36;
                        final SubLObject datum_$35 = current_$36 = def_args;
                        SubLObject def_object = NIL;
                        SubLObject module2 = NIL;
                        destructuring_bind_must_consp(current_$36, datum_$35, $list43);
                        def_object = current_$36.first();
                        current_$36 = current_$36.rest();
                        destructuring_bind_must_consp(current_$36, datum_$35, $list43);
                        module2 = current_$36.first();
                        current_$36 = current_$36.rest();
                        if (NIL == current_$36) {
                            format(stream, $str32$__Global__A_in__A__, def_object, module2);
                        } else {
                            cdestructuring_bind_error(datum_$35, $list43);
                        }
                    }


            format(stream, $$$_references_private);
            pcase_var = ref_type;
            if (pcase_var.eql($METHOD)) {
                SubLObject current_$37;
                final SubLObject datum_$36 = current_$37 = ref_args;
                SubLObject ref_object = NIL;
                SubLObject module2 = NIL;
                destructuring_bind_must_consp(current_$37, datum_$36, $list45);
                ref_object = current_$37.first();
                current_$37 = current_$37.rest();
                destructuring_bind_must_consp(current_$37, datum_$36, $list45);
                module2 = current_$37.first();
                current_$37 = current_$37.rest();
                if (NIL == current_$37) {
                    format(stream, $str35$__method__A_from__A__, ref_object, module2);
                } else {
                    cdestructuring_bind_error(datum_$36, $list45);
                }
            } else
                if (pcase_var.eql($GLOBAL)) {
                    SubLObject current_$38;
                    final SubLObject datum_$37 = current_$38 = ref_args;
                    SubLObject ref_object = NIL;
                    SubLObject module2 = NIL;
                    destructuring_bind_must_consp(current_$38, datum_$37, $list45);
                    ref_object = current_$38.first();
                    current_$38 = current_$38.rest();
                    destructuring_bind_must_consp(current_$38, datum_$37, $list45);
                    module2 = current_$38.first();
                    current_$38 = current_$38.rest();
                    if (NIL == current_$38) {
                        format(stream, $str36$__global__A_from__A__, ref_object, module2);
                    } else {
                        cdestructuring_bind_error(datum_$37, $list45);
                    }
                }

        } else {
            cdestructuring_bind_error(violation_spec, $list41);
        }
        return violation_spec;
    }

    /**
     * Analyze the definitions in all modules and return a list of all early rebinding violations.
     *
     * @return a list of objects suitable for show-early-rebinding-violations.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early rebinding violations.\r\n\r\n@return a list of objects suitable for show-early-rebinding-violations.")
    public static final SubLObject all_early_rebinding_violations_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_early_rebinding_violations = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($str_alt48$Identifying_early_rebinding_viola, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_41 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject early_rebinding_violations = com.cyc.cycjava.cycl.translator_utilities.module_early_rebinding_violations(module);
                                                        SubLObject cdolist_list_var = early_rebinding_violations;
                                                        SubLObject early_rebinding_violation = NIL;
                                                        for (early_rebinding_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , early_rebinding_violation = cdolist_list_var.first()) {
                                                            all_early_rebinding_violations = cons(early_rebinding_violation, all_early_rebinding_violations);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_early_rebinding_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early rebinding violations.\r\n\r\n@return a list of objects suitable for show-early-rebinding-violations.")
    public static SubLObject all_early_rebinding_violations(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_rebinding_violations = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$43 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($str46$Identifying_early_rebinding_viola, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_rebinding_violations = cdolist_list_var = module_early_rebinding_violations(module);
                            SubLObject early_rebinding_violation = NIL;
                            early_rebinding_violation = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_early_rebinding_violations = cons(early_rebinding_violation, all_early_rebinding_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_rebinding_violation = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_early_rebinding_violations);
    }/**
     * Analyze the definitions in all modules and return a list of all early rebinding violations.
     *
     * @return a list of objects suitable for show-early-rebinding-violations.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early rebinding violations.
     *
     * @return a list of objects suitable for show-early-rebinding-violations.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early rebinding violations.\r\n\r\n@return a list of objects suitable for show-early-rebinding-violations.")
    public static final SubLObject module_early_rebinding_violations_alt(SubLObject defined_module) {
        {
            SubLObject early_rebinding_violations = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
            SubLObject defined_method = NIL;
            for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                {
                    SubLObject defined_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(defined_method);
                    SubLObject rebound_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_rebound_by_method(defined_method);
                    SubLObject cdolist_list_var_43 = rebound_globals;
                    SubLObject rebound_global = NIL;
                    for (rebound_global = cdolist_list_var_43.first(); NIL != cdolist_list_var_43; cdolist_list_var_43 = cdolist_list_var_43.rest() , rebound_global = cdolist_list_var_43.first()) {
                        {
                            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(rebound_global);
                            if (NIL != referenced_module) {
                                {
                                    SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(rebound_global);
                                    if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $GLOBAL, rebound_global)) {
                                        early_rebinding_violations = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, rebound_global, referenced_module)), early_rebinding_violations);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(early_rebinding_violations);
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early rebinding violations.\r\n\r\n@return a list of objects suitable for show-early-rebinding-violations.")
    public static SubLObject module_early_rebinding_violations(final SubLObject defined_module) {
        SubLObject early_rebinding_violations = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$46;
            final SubLObject rebound_globals = cdolist_list_var_$46 = td_globals_rebound_by_method(defined_method);
            SubLObject rebound_global = NIL;
            rebound_global = cdolist_list_var_$46.first();
            while (NIL != cdolist_list_var_$46) {
                final SubLObject referenced_module = td_global_defining_module(rebound_global);
                if (NIL != referenced_module) {
                    final SubLObject referenced_position = td_global_definition_position(rebound_global);
                    if (NIL != td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $GLOBAL, rebound_global)) {
                        early_rebinding_violations = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, rebound_global, referenced_module)), early_rebinding_violations);
                    }
                }
                cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                rebound_global = cdolist_list_var_$46.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        return nreverse(early_rebinding_violations);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early rebinding violations.
     *
     * @return a list of objects suitable for show-early-rebinding-violations.
     */


    /**
     * Show a list of early rebinding violations described in VIOLATION-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of early rebinding violations described in VIOLATION-SPECS to STREAM.")
    public static final SubLObject show_early_rebinding_violations_alt(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = com.cyc.cycjava.cycl.translator_utilities.all_early_rebinding_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = violation_specs;
            SubLObject violation_spec = NIL;
            for (violation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_early_rebinding_violation(violation_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of early rebinding violations described in VIOLATION-SPECS to STREAM.")
    public static SubLObject show_early_rebinding_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = all_early_rebinding_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = NIL;
        violation_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_early_rebinding_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of early rebinding violations described in VIOLATION-SPECS to STREAM.
     */


    public static final SubLObject show_one_early_rebinding_violation_alt(SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = violation_spec;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject def_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    def_type = current.first();
                    current = current.rest();
                    {
                        SubLObject def_args = current;
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        {
                            SubLObject temp_44 = current.rest();
                            current = current.first();
                            {
                                SubLObject ref_type = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt43);
                                ref_type = current.first();
                                current = current.rest();
                                {
                                    SubLObject ref_args = current;
                                    current = temp_44;
                                    if (NIL == current) {
                                        {
                                            SubLObject pcase_var = def_type;
                                            if (pcase_var.eql($MODULE)) {
                                                {
                                                    SubLObject datum_45 = def_args;
                                                    SubLObject current_46 = datum_45;
                                                    SubLObject module = NIL;
                                                    destructuring_bind_must_consp(current_46, datum_45, $list_alt44);
                                                    module = current_46.first();
                                                    current_46 = current_46.rest();
                                                    if (NIL == current_46) {
                                                        format(stream, $str_alt31$__Top_level_form_in__A__, module);
                                                    } else {
                                                        cdestructuring_bind_error(datum_45, $list_alt44);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($METHOD)) {
                                                    {
                                                        SubLObject datum_47 = def_args;
                                                        SubLObject current_48 = datum_47;
                                                        SubLObject def_object = NIL;
                                                        SubLObject module = NIL;
                                                        destructuring_bind_must_consp(current_48, datum_47, $list_alt45);
                                                        def_object = current_48.first();
                                                        current_48 = current_48.rest();
                                                        destructuring_bind_must_consp(current_48, datum_47, $list_alt45);
                                                        module = current_48.first();
                                                        current_48 = current_48.rest();
                                                        if (NIL == current_48) {
                                                            format(stream, $str_alt33$__Method__A_in__A__, def_object, module);
                                                        } else {
                                                            cdestructuring_bind_error(datum_47, $list_alt45);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        format(stream, $str_alt49$_rebinds);
                                        {
                                            SubLObject pcase_var = ref_type;
                                            if (pcase_var.eql($GLOBAL)) {
                                                {
                                                    SubLObject datum_49 = ref_args;
                                                    SubLObject current_50 = datum_49;
                                                    SubLObject ref_object = NIL;
                                                    SubLObject module = NIL;
                                                    destructuring_bind_must_consp(current_50, datum_49, $list_alt47);
                                                    ref_object = current_50.first();
                                                    current_50 = current_50.rest();
                                                    destructuring_bind_must_consp(current_50, datum_49, $list_alt47);
                                                    module = current_50.first();
                                                    current_50 = current_50.rest();
                                                    if (NIL == current_50) {
                                                        format(stream, $str_alt38$__global__A_from__A__, ref_object, module);
                                                    } else {
                                                        cdestructuring_bind_error(datum_49, $list_alt47);
                                                    }
                                                }
                                            }
                                        }
                                        format(stream, $str_alt50$_before_it_is_defined__);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt43);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return violation_spec;
    }

    public static SubLObject show_one_early_rebinding_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        destructuring_bind_must_consp(violation_spec, violation_spec, $list41);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        def_type = current.first();
        final SubLObject def_args;
        current = def_args = current.rest();
        current = temp;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        final SubLObject temp_$47 = current.rest();
        current = current.first();
        SubLObject ref_type = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = ref_args = current.rest();
        current = temp_$47;
        if (NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql($MODULE)) {
                SubLObject current_$49;
                final SubLObject datum_$48 = current_$49 = def_args;
                SubLObject module = NIL;
                destructuring_bind_must_consp(current_$49, datum_$48, $list42);
                module = current_$49.first();
                current_$49 = current_$49.rest();
                if (NIL == current_$49) {
                    format(stream, $str29$__Top_level_form_in__A__, module);
                } else {
                    cdestructuring_bind_error(datum_$48, $list42);
                }
            } else
                if (pcase_var.eql($METHOD)) {
                    SubLObject current_$50;
                    final SubLObject datum_$49 = current_$50 = def_args;
                    SubLObject def_object = NIL;
                    SubLObject module2 = NIL;
                    destructuring_bind_must_consp(current_$50, datum_$49, $list43);
                    def_object = current_$50.first();
                    current_$50 = current_$50.rest();
                    destructuring_bind_must_consp(current_$50, datum_$49, $list43);
                    module2 = current_$50.first();
                    current_$50 = current_$50.rest();
                    if (NIL == current_$50) {
                        format(stream, $str31$__Method__A_in__A__, def_object, module2);
                    } else {
                        cdestructuring_bind_error(datum_$49, $list43);
                    }
                }

            format(stream, $$$_rebinds);
            pcase_var = ref_type;
            if (pcase_var.eql($GLOBAL)) {
                SubLObject current_$51;
                final SubLObject datum_$50 = current_$51 = ref_args;
                SubLObject ref_object = NIL;
                SubLObject module2 = NIL;
                destructuring_bind_must_consp(current_$51, datum_$50, $list45);
                ref_object = current_$51.first();
                current_$51 = current_$51.rest();
                destructuring_bind_must_consp(current_$51, datum_$50, $list45);
                module2 = current_$51.first();
                current_$51 = current_$51.rest();
                if (NIL == current_$51) {
                    format(stream, $str36$__global__A_from__A__, ref_object, module2);
                } else {
                    cdestructuring_bind_error(datum_$50, $list45);
                }
            }
            format(stream, $str48$_before_it_is_defined__);
        } else {
            cdestructuring_bind_error(violation_spec, $list41);
        }
        return violation_spec;
    }

    /**
     * Analyze the definitions in all modules and return a list of all early-reference violations.
     *
     * @return a list of objects suitable for show-early-reference-violations.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early-reference violations.\r\n\r\n@return a list of objects suitable for show-early-reference-violations.")
    public static final SubLObject all_early_reference_violations_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_early_reference_violations = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($str_alt51$Identifying_early_reference_viola, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_51 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject early_reference_violations = com.cyc.cycjava.cycl.translator_utilities.module_early_reference_violations(module);
                                                        SubLObject cdolist_list_var = early_reference_violations;
                                                        SubLObject early_reference_violation = NIL;
                                                        for (early_reference_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , early_reference_violation = cdolist_list_var.first()) {
                                                            all_early_reference_violations = cons(early_reference_violation, all_early_reference_violations);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_51, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_early_reference_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early-reference violations.\r\n\r\n@return a list of objects suitable for show-early-reference-violations.")
    public static SubLObject all_early_reference_violations(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_reference_violations = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$54 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($str49$Identifying_early_reference_viola, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_reference_violations = cdolist_list_var = module_early_reference_violations(module);
                            SubLObject early_reference_violation = NIL;
                            early_reference_violation = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_early_reference_violations = cons(early_reference_violation, all_early_reference_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_reference_violation = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$55 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_early_reference_violations);
    }/**
     * Analyze the definitions in all modules and return a list of all early-reference violations.
     *
     * @return a list of objects suitable for show-early-reference-violations.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early-reference violations.
     *
     * @return a list of objects suitable for show-early-reference-violations.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early-reference violations.\r\n\r\n@return a list of objects suitable for show-early-reference-violations.")
    public static final SubLObject module_early_reference_violations_alt(SubLObject defined_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject early_reference_violations = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                    SubLObject defined_method = NIL;
                    for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                        {
                            SubLObject defined_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(defined_method);
                            SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(defined_method);
                            SubLObject cdolist_list_var_53 = referenced_methods;
                            SubLObject referenced_method = NIL;
                            for (referenced_method = cdolist_list_var_53.first(); NIL != cdolist_list_var_53; cdolist_list_var_53 = cdolist_list_var_53.rest() , referenced_method = cdolist_list_var_53.first()) {
                                if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_macro_p(referenced_method)) {
                                    {
                                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                        if (NIL != referenced_module) {
                                            {
                                                SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                                                    SubLObject justifying_globals = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                        early_reference_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
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
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                    SubLObject defined_global = NIL;
                    for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                        {
                            SubLObject defined_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(defined_global);
                            {
                                SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(defined_global);
                                SubLObject cdolist_list_var_54 = referenced_methods;
                                SubLObject referenced_method = NIL;
                                for (referenced_method = cdolist_list_var_54.first(); NIL != cdolist_list_var_54; cdolist_list_var_54 = cdolist_list_var_54.rest() , referenced_method = cdolist_list_var_54.first()) {
                                    {
                                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                        if (NIL != referenced_module) {
                                            {
                                                SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $METHOD, referenced_method);
                                                    SubLObject justifying_globals = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                        early_reference_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_global(defined_global);
                                SubLObject cdolist_list_var_55 = referenced_globals;
                                SubLObject referenced_global = NIL;
                                for (referenced_global = cdolist_list_var_55.first(); NIL != cdolist_list_var_55; cdolist_list_var_55 = cdolist_list_var_55.rest() , referenced_global = cdolist_list_var_55.first()) {
                                    {
                                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                        if (NIL != referenced_module) {
                                            {
                                                SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(referenced_global);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $GLOBAL, referenced_global);
                                                    SubLObject justifying_globals = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                        early_reference_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
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
                {
                    SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_module(defined_module);
                    SubLObject cdolist_list_var = referenced_methods;
                    SubLObject referenced_method = NIL;
                    for (referenced_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_method = cdolist_list_var.first()) {
                        {
                            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                            if (NIL != referenced_module) {
                                {
                                    SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                    SubLObject module_positions = com.cyc.cycjava.cycl.translator_utilities.td_module_positions_calling_method(defined_module, referenced_method);
                                    SubLObject cdolist_list_var_56 = module_positions;
                                    SubLObject module_position = NIL;
                                    for (module_position = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , module_position = cdolist_list_var_56.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_evaluation_reference_p(defined_module, module_position, referenced_module, referenced_position, $METHOD, referenced_method);
                                            SubLObject justifying_globals = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                early_reference_violations = cons(list(list($MODULE, defined_module, module_position), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_module(defined_module);
                    SubLObject cdolist_list_var = referenced_globals;
                    SubLObject referenced_global = NIL;
                    for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                        {
                            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                            if (NIL != referenced_module) {
                                {
                                    SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(referenced_global);
                                    SubLObject module_positions = com.cyc.cycjava.cycl.translator_utilities.td_module_positions_calling_global(defined_module, referenced_global);
                                    SubLObject cdolist_list_var_57 = module_positions;
                                    SubLObject module_position = NIL;
                                    for (module_position = cdolist_list_var_57.first(); NIL != cdolist_list_var_57; cdolist_list_var_57 = cdolist_list_var_57.rest() , module_position = cdolist_list_var_57.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_evaluation_reference_p(defined_module, module_position, referenced_module, referenced_position, $GLOBAL, referenced_global);
                                            SubLObject justifying_globals = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                early_reference_violations = cons(list(list($MODULE, defined_module, module_position), list($GLOBAL, referenced_global, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(early_reference_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early-reference violations.\r\n\r\n@return a list of objects suitable for show-early-reference-violations.")
    public static SubLObject module_early_reference_violations(final SubLObject defined_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject early_reference_violations = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$57;
            final SubLObject referenced_methods = cdolist_list_var_$57 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                if (NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                            early_reference_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
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
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defined_position = td_global_definition_position(defined_global);
            SubLObject cdolist_list_var_$58;
            final SubLObject referenced_methods = cdolist_list_var_$58 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$58.first();
            while (NIL != cdolist_list_var_$58) {
                final SubLObject referenced_module = td_method_defining_module(referenced_method);
                if (NIL != referenced_module) {
                    final SubLObject referenced_position = td_method_definition_position(referenced_method);
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $METHOD, referenced_method);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                        early_reference_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
                    }
                }
                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                referenced_method = cdolist_list_var_$58.first();
            } 
            SubLObject cdolist_list_var_$59;
            final SubLObject referenced_globals = cdolist_list_var_$59 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$59.first();
            while (NIL != cdolist_list_var_$59) {
                final SubLObject referenced_module = td_global_defining_module(referenced_global);
                if (NIL != referenced_module) {
                    final SubLObject referenced_position = td_global_definition_position(referenced_global);
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, defined_position, referenced_module, referenced_position, $GLOBAL, referenced_global);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                        early_reference_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global, referenced_module), justifying_methods, justifying_globals), early_reference_violations);
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
        SubLObject referenced_method2 = NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
            if (NIL != referenced_module2) {
                final SubLObject referenced_position2 = td_method_definition_position(referenced_method2);
                SubLObject cdolist_list_var_$60;
                final SubLObject module_positions = cdolist_list_var_$60 = td_module_positions_calling_method(defined_module, referenced_method2);
                SubLObject module_position = NIL;
                module_position = cdolist_list_var_$60.first();
                while (NIL != cdolist_list_var_$60) {
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, module_position, referenced_module2, referenced_position2, $METHOD, referenced_method2);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                        early_reference_violations = cons(list(list($MODULE, defined_module, module_position), list($METHOD, referenced_method2, referenced_module2), justifying_methods, justifying_globals), early_reference_violations);
                    }
                    cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                    module_position = cdolist_list_var_$60.first();
                } 
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        } 
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
            if (NIL != referenced_module2) {
                final SubLObject referenced_position2 = td_global_definition_position(referenced_global2);
                SubLObject cdolist_list_var_$61;
                final SubLObject module_positions = cdolist_list_var_$61 = td_module_positions_calling_global(defined_module, referenced_global2);
                SubLObject module_position = NIL;
                module_position = cdolist_list_var_$61.first();
                while (NIL != cdolist_list_var_$61) {
                    thread.resetMultipleValues();
                    final SubLObject justifying_methods = td_early_evaluation_reference_p(defined_module, module_position, referenced_module2, referenced_position2, $GLOBAL, referenced_global2);
                    final SubLObject justifying_globals = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                        early_reference_violations = cons(list(list($MODULE, defined_module, module_position), list($GLOBAL, referenced_global2, referenced_module2), justifying_methods, justifying_globals), early_reference_violations);
                    }
                    cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                    module_position = cdolist_list_var_$61.first();
                } 
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        } 
        return nreverse(early_reference_violations);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early-reference violations.
     *
     * @return a list of objects suitable for show-early-reference-violations.
     */


    public static final SubLObject td_early_macro_use_p_alt(SubLObject referencing_module, SubLObject referencing_position, SubLObject macro_module, SubLObject macro_position, SubLObject referenced_macro) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justifying_methods = NIL;
                SubLObject justifying_globals = NIL;
                SubLObject latest_module_referenced_by_macro = com.cyc.cycjava.cycl.translator_utilities.td_method_latest_transitively_referenced_module_memoized(referenced_macro);
                if ((NIL != latest_module_referenced_by_macro) && (NIL == com.cyc.cycjava.cycl.translator_utilities.td_module_earlier(latest_module_referenced_by_macro, referencing_module))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject justifying_methods_58 = com.cyc.cycjava.cycl.translator_utilities.td_justify_method_latest_transitively_referenced_module(referenced_macro, latest_module_referenced_by_macro);
                        SubLObject justifying_globals_59 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        justifying_methods = justifying_methods_58;
                        justifying_globals = justifying_globals_59;
                    }
                }
                if ((NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_later(macro_module, referencing_module)) || (referencing_module.equal(macro_module) && macro_position.numG(referencing_position))) {
                    {
                        SubLObject item_var = referenced_macro;
                        if (NIL == member(item_var, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justifying_methods = cons(item_var, justifying_methods);
                        }
                    }
                }
                return values(justifying_methods, justifying_globals);
            }
        }
    }

    public static SubLObject td_early_macro_use_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject macro_module, final SubLObject macro_position, final SubLObject referenced_macro) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifying_methods = NIL;
        SubLObject justifying_globals = NIL;
        final SubLObject latest_module_referenced_by_macro = td_method_latest_transitively_referenced_module_memoized(referenced_macro);
        if ((NIL != latest_module_referenced_by_macro) && (NIL == td_module_earlier(latest_module_referenced_by_macro, referencing_module))) {
            thread.resetMultipleValues();
            final SubLObject justifying_methods_$62 = td_justify_method_latest_transitively_referenced_module(referenced_macro, latest_module_referenced_by_macro);
            final SubLObject justifying_globals_$63 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            justifying_methods = justifying_methods_$62;
            justifying_globals = justifying_globals_$63;
        }
        if (((NIL != td_module_later(macro_module, referencing_module)) || (referencing_module.equal(macro_module) && macro_position.numG(referencing_position))) && (NIL == member(referenced_macro, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY)))) {
            justifying_methods = cons(referenced_macro, justifying_methods);
        }
        return values(justifying_methods, justifying_globals);
    }

    /**
     * Analyze the reference
     * by REFERENCING-MODULE at REFERENCING-POSITION
     * to REFERENCED-OBJECT of REFERENCE-TYPE
     * defined in REFERENCED-MODULE at REFERENCED-POSITION
     * to see if it is too early with respect to load-time evaluation.
     */
    @LispMethod(comment = "Analyze the reference\r\nby REFERENCING-MODULE at REFERENCING-POSITION\r\nto REFERENCED-OBJECT of REFERENCE-TYPE\r\ndefined in REFERENCED-MODULE at REFERENCED-POSITION\r\nto see if it is too early with respect to load-time evaluation.\nAnalyze the reference\nby REFERENCING-MODULE at REFERENCING-POSITION\nto REFERENCED-OBJECT of REFERENCE-TYPE\ndefined in REFERENCED-MODULE at REFERENCED-POSITION\nto see if it is too early with respect to load-time evaluation.")
    public static final SubLObject td_early_evaluation_reference_p_alt(SubLObject referencing_module, SubLObject referencing_position, SubLObject referenced_module, SubLObject referenced_position, SubLObject reference_type, SubLObject referenced_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject justifying_methods = NIL;
                SubLObject justifying_globals = NIL;
                SubLObject latest_module_referenced_by_evaluation = ($METHOD == reference_type) ? ((SubLObject) (com.cyc.cycjava.cycl.translator_utilities.td_method_latest_transitively_referenced_module_memoized(referenced_object))) : com.cyc.cycjava.cycl.translator_utilities.td_global_latest_transitively_referenced_module_memoized(referenced_object);
                if (NIL != latest_module_referenced_by_evaluation) {
                    if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_module_earlier(latest_module_referenced_by_evaluation, referencing_module)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject candidate_methods = ($METHOD == reference_type) ? ((SubLObject) (com.cyc.cycjava.cycl.translator_utilities.td_justify_method_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation))) : com.cyc.cycjava.cycl.translator_utilities.td_justify_global_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation);
                            SubLObject candidate_globals = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_later(latest_module_referenced_by_evaluation, referencing_module)) {
                                justifying_methods = candidate_methods;
                                justifying_globals = candidate_globals;
                            } else {
                                {
                                    SubLObject cdolist_list_var = candidate_methods;
                                    SubLObject candidate_method = NIL;
                                    for (candidate_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_method = cdolist_list_var.first()) {
                                        {
                                            SubLObject definition_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(candidate_method);
                                            if (definition_position.numG(referencing_position)) {
                                                {
                                                    SubLObject item_var = candidate_method;
                                                    if (NIL == member(item_var, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        justifying_methods = cons(item_var, justifying_methods);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = candidate_globals;
                                    SubLObject candidate_global = NIL;
                                    for (candidate_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_global = cdolist_list_var.first()) {
                                        {
                                            SubLObject definition_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(candidate_global);
                                            if (definition_position.numG(referencing_position)) {
                                                {
                                                    SubLObject item_var = candidate_global;
                                                    if (NIL == member(item_var, justifying_globals, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        justifying_globals = cons(item_var, justifying_globals);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                justifying_methods = nreverse(justifying_methods);
                                justifying_globals = nreverse(justifying_globals);
                            }
                        }
                    }
                }
                if ((NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_later(referenced_module, referencing_module)) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position))) {
                    {
                        SubLObject item_var = referenced_object;
                        if (NIL == member(item_var, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justifying_methods = cons(item_var, justifying_methods);
                        }
                    }
                }
                return values(justifying_methods, justifying_globals);
            }
        }
    }

    @LispMethod(comment = "Analyze the reference\r\nby REFERENCING-MODULE at REFERENCING-POSITION\r\nto REFERENCED-OBJECT of REFERENCE-TYPE\r\ndefined in REFERENCED-MODULE at REFERENCED-POSITION\r\nto see if it is too early with respect to load-time evaluation.\nAnalyze the reference\nby REFERENCING-MODULE at REFERENCING-POSITION\nto REFERENCED-OBJECT of REFERENCE-TYPE\ndefined in REFERENCED-MODULE at REFERENCED-POSITION\nto see if it is too early with respect to load-time evaluation.")
    public static SubLObject td_early_evaluation_reference_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject referenced_module, final SubLObject referenced_position, final SubLObject reference_type, final SubLObject referenced_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifying_methods = NIL;
        SubLObject justifying_globals = NIL;
        final SubLObject latest_module_referenced_by_evaluation = ($METHOD == reference_type) ? td_method_latest_transitively_referenced_module_memoized(referenced_object) : td_global_latest_transitively_referenced_module_memoized(referenced_object);
        if ((NIL != latest_module_referenced_by_evaluation) && (NIL == td_module_earlier(latest_module_referenced_by_evaluation, referencing_module))) {
            thread.resetMultipleValues();
            final SubLObject candidate_methods = ($METHOD == reference_type) ? td_justify_method_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation) : td_justify_global_latest_transitively_referenced_module(referenced_object, latest_module_referenced_by_evaluation);
            final SubLObject candidate_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != td_module_later(latest_module_referenced_by_evaluation, referencing_module)) {
                justifying_methods = candidate_methods;
                justifying_globals = candidate_globals;
            } else {
                SubLObject cdolist_list_var = candidate_methods;
                SubLObject candidate_method = NIL;
                candidate_method = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject definition_position = td_method_definition_position(candidate_method);
                    if (definition_position.numG(referencing_position)) {
                        final SubLObject item_var = candidate_method;
                        if (NIL == member(item_var, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justifying_methods = cons(item_var, justifying_methods);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_method = cdolist_list_var.first();
                } 
                cdolist_list_var = candidate_globals;
                SubLObject candidate_global = NIL;
                candidate_global = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject definition_position = td_global_definition_position(candidate_global);
                    if (definition_position.numG(referencing_position)) {
                        final SubLObject item_var = candidate_global;
                        if (NIL == member(item_var, justifying_globals, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justifying_globals = cons(item_var, justifying_globals);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_global = cdolist_list_var.first();
                } 
                justifying_methods = nreverse(justifying_methods);
                justifying_globals = nreverse(justifying_globals);
            }
        }
        if (((NIL != td_module_later(referenced_module, referencing_module)) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position))) && (NIL == member(referenced_object, justifying_methods, symbol_function(EQL), symbol_function(IDENTITY)))) {
            justifying_methods = cons(referenced_object, justifying_methods);
        }
        return values(justifying_methods, justifying_globals);
    }/**
     * Analyze the reference
     * by REFERENCING-MODULE at REFERENCING-POSITION
     * to REFERENCED-OBJECT of REFERENCE-TYPE
     * defined in REFERENCED-MODULE at REFERENCED-POSITION
     * to see if it is too early with respect to load-time evaluation.
     */


    /**
     * Analyze the global binding of REFERENCED-GLOBAL
     * by REFERENCING-MODULE at REFERENCING-POSITION
     * to see if it is too early with respect to load-time evaluation.
     */
    @LispMethod(comment = "Analyze the global binding of REFERENCED-GLOBAL\r\nby REFERENCING-MODULE at REFERENCING-POSITION\r\nto see if it is too early with respect to load-time evaluation.\nAnalyze the global binding of REFERENCED-GLOBAL\nby REFERENCING-MODULE at REFERENCING-POSITION\nto see if it is too early with respect to load-time evaluation.")
    public static final SubLObject td_early_global_binding_p_alt(SubLObject referencing_module, SubLObject referencing_position, SubLObject referenced_global) {
        {
            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
            if (NIL != referenced_module) {
                {
                    SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(referenced_global);
                    return makeBoolean((NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_later(referenced_module, referencing_module)) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position)));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Analyze the global binding of REFERENCED-GLOBAL\r\nby REFERENCING-MODULE at REFERENCING-POSITION\r\nto see if it is too early with respect to load-time evaluation.\nAnalyze the global binding of REFERENCED-GLOBAL\nby REFERENCING-MODULE at REFERENCING-POSITION\nto see if it is too early with respect to load-time evaluation.")
    public static SubLObject td_early_global_binding_p(final SubLObject referencing_module, final SubLObject referencing_position, final SubLObject referenced_global) {
        final SubLObject referenced_module = td_global_defining_module(referenced_global);
        if (NIL != referenced_module) {
            final SubLObject referenced_position = td_global_definition_position(referenced_global);
            return makeBoolean((NIL != td_module_later(referenced_module, referencing_module)) || (referencing_module.equal(referenced_module) && referenced_position.numG(referencing_position)));
        }
        return NIL;
    }/**
     * Analyze the global binding of REFERENCED-GLOBAL
     * by REFERENCING-MODULE at REFERENCING-POSITION
     * to see if it is too early with respect to load-time evaluation.
     */


    /**
     * Show a list of early-reference violations described in VIOLATION-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of early-reference violations described in VIOLATION-SPECS to STREAM.")
    public static final SubLObject show_early_reference_violations_alt(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = com.cyc.cycjava.cycl.translator_utilities.all_early_reference_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = violation_specs;
            SubLObject violation_spec = NIL;
            for (violation_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , violation_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_early_reference_violation(violation_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of early-reference violations described in VIOLATION-SPECS to STREAM.")
    public static SubLObject show_early_reference_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = all_early_reference_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = violation_specs;
        SubLObject violation_spec = NIL;
        violation_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_early_reference_violation(violation_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            violation_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of early-reference violations described in VIOLATION-SPECS to STREAM.
     */


    public static final SubLObject show_one_early_reference_violation_alt(SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = violation_spec;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject def_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt52);
                    def_type = current.first();
                    current = current.rest();
                    {
                        SubLObject def_args = current;
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt52);
                        {
                            SubLObject temp_60 = current.rest();
                            current = current.first();
                            {
                                SubLObject ref_type = NIL;
                                SubLObject ref_object = NIL;
                                SubLObject module = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                ref_type = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                ref_object = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt52);
                                module = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp_60;
                                    {
                                        SubLObject justifying_methods = NIL;
                                        SubLObject justifying_globals = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt52);
                                        justifying_methods = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt52);
                                        justifying_globals = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject pcase_var = def_type;
                                                if (pcase_var.eql($MODULE)) {
                                                    {
                                                        SubLObject datum_61 = def_args;
                                                        SubLObject current_62 = datum_61;
                                                        SubLObject module_63 = NIL;
                                                        SubLObject position = NIL;
                                                        destructuring_bind_must_consp(current_62, datum_61, $list_alt53);
                                                        module_63 = current_62.first();
                                                        current_62 = current_62.rest();
                                                        destructuring_bind_must_consp(current_62, datum_61, $list_alt53);
                                                        position = current_62.first();
                                                        current_62 = current_62.rest();
                                                        if (NIL == current_62) {
                                                            format(stream, $str_alt54$__Top_level_form_in__A_at__S__, module_63, position);
                                                        } else {
                                                            cdestructuring_bind_error(datum_61, $list_alt53);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($METHOD)) {
                                                        {
                                                            SubLObject datum_64 = def_args;
                                                            SubLObject current_65 = datum_64;
                                                            SubLObject def_object = NIL;
                                                            SubLObject module_66 = NIL;
                                                            destructuring_bind_must_consp(current_65, datum_64, $list_alt45);
                                                            def_object = current_65.first();
                                                            current_65 = current_65.rest();
                                                            destructuring_bind_must_consp(current_65, datum_64, $list_alt45);
                                                            module_66 = current_65.first();
                                                            current_65 = current_65.rest();
                                                            if (NIL == current_65) {
                                                                format(stream, $str_alt33$__Method__A_in__A__, def_object, module_66);
                                                            } else {
                                                                cdestructuring_bind_error(datum_64, $list_alt45);
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($GLOBAL)) {
                                                            {
                                                                SubLObject datum_67 = def_args;
                                                                SubLObject current_68 = datum_67;
                                                                SubLObject def_object = NIL;
                                                                SubLObject module_69 = NIL;
                                                                destructuring_bind_must_consp(current_68, datum_67, $list_alt45);
                                                                def_object = current_68.first();
                                                                current_68 = current_68.rest();
                                                                destructuring_bind_must_consp(current_68, datum_67, $list_alt45);
                                                                module_69 = current_68.first();
                                                                current_68 = current_68.rest();
                                                                if (NIL == current_68) {
                                                                    format(stream, $str_alt34$__Global__A_in__A__, def_object, module_69);
                                                                } else {
                                                                    cdestructuring_bind_error(datum_67, $list_alt45);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            format(stream, $str_alt35$_references);
                                            {
                                                SubLObject pcase_var = ref_type;
                                                if (pcase_var.eql($METHOD)) {
                                                    format(stream, $str_alt37$__method__A_from__A__, ref_object, module);
                                                } else {
                                                    if (pcase_var.eql($GLOBAL)) {
                                                        format(stream, $str_alt38$__global__A_from__A__, ref_object, module);
                                                    }
                                                }
                                            }
                                            format(stream, $str_alt55$_before_it_is);
                                            if (((NIL == justifying_globals) && (NIL != list_utilities.singletonP(justifying_methods))) && (ref_object == justifying_methods.first())) {
                                                format(stream, $str_alt56$_defined__);
                                            } else {
                                                format(stream, $str_alt57$_completely_defined_due_to__);
                                                {
                                                    SubLObject cdolist_list_var = justifying_methods;
                                                    SubLObject justifying_method = NIL;
                                                    for (justifying_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justifying_method = cdolist_list_var.first()) {
                                                        format(stream, $str_alt58$method__A__, justifying_method);
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = justifying_globals;
                                                    SubLObject justifying_global = NIL;
                                                    for (justifying_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justifying_global = cdolist_list_var.first()) {
                                                        format(stream, $str_alt59$global__A__, justifying_global);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt52);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt52);
                                }
                            }
                        }
                    }
                }
            }
        }
        return violation_spec;
    }

    public static SubLObject show_one_early_reference_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        destructuring_bind_must_consp(violation_spec, violation_spec, $list50);
        final SubLObject temp = violation_spec.rest();
        SubLObject current = violation_spec.first();
        SubLObject def_type = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list50);
        def_type = current.first();
        final SubLObject def_args;
        current = def_args = current.rest();
        current = temp;
        destructuring_bind_must_consp(current, violation_spec, $list50);
        final SubLObject temp_$64 = current.rest();
        current = current.first();
        SubLObject ref_type = NIL;
        SubLObject ref_object = NIL;
        SubLObject module = NIL;
        destructuring_bind_must_consp(current, violation_spec, $list50);
        ref_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, violation_spec, $list50);
        ref_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, violation_spec, $list50);
        module = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp_$64;
            SubLObject justifying_methods = NIL;
            SubLObject justifying_globals = NIL;
            destructuring_bind_must_consp(current, violation_spec, $list50);
            justifying_methods = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, violation_spec, $list50);
            justifying_globals = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject pcase_var = def_type;
                if (pcase_var.eql($MODULE)) {
                    SubLObject current_$66;
                    final SubLObject datum_$65 = current_$66 = def_args;
                    SubLObject module_$67 = NIL;
                    SubLObject position = NIL;
                    destructuring_bind_must_consp(current_$66, datum_$65, $list51);
                    module_$67 = current_$66.first();
                    current_$66 = current_$66.rest();
                    destructuring_bind_must_consp(current_$66, datum_$65, $list51);
                    position = current_$66.first();
                    current_$66 = current_$66.rest();
                    if (NIL == current_$66) {
                        format(stream, $str52$__Top_level_form_in__A_at__S__, module_$67, position);
                    } else {
                        cdestructuring_bind_error(datum_$65, $list51);
                    }
                } else
                    if (pcase_var.eql($METHOD)) {
                        SubLObject current_$67;
                        final SubLObject datum_$66 = current_$67 = def_args;
                        SubLObject def_object = NIL;
                        SubLObject module_$68 = NIL;
                        destructuring_bind_must_consp(current_$67, datum_$66, $list43);
                        def_object = current_$67.first();
                        current_$67 = current_$67.rest();
                        destructuring_bind_must_consp(current_$67, datum_$66, $list43);
                        module_$68 = current_$67.first();
                        current_$67 = current_$67.rest();
                        if (NIL == current_$67) {
                            format(stream, $str31$__Method__A_in__A__, def_object, module_$68);
                        } else {
                            cdestructuring_bind_error(datum_$66, $list43);
                        }
                    } else
                        if (pcase_var.eql($GLOBAL)) {
                            SubLObject current_$68;
                            final SubLObject datum_$67 = current_$68 = def_args;
                            SubLObject def_object = NIL;
                            SubLObject module_$69 = NIL;
                            destructuring_bind_must_consp(current_$68, datum_$67, $list43);
                            def_object = current_$68.first();
                            current_$68 = current_$68.rest();
                            destructuring_bind_must_consp(current_$68, datum_$67, $list43);
                            module_$69 = current_$68.first();
                            current_$68 = current_$68.rest();
                            if (NIL == current_$68) {
                                format(stream, $str32$__Global__A_in__A__, def_object, module_$69);
                            } else {
                                cdestructuring_bind_error(datum_$67, $list43);
                            }
                        }


                format(stream, $$$_references);
                pcase_var = ref_type;
                if (pcase_var.eql($METHOD)) {
                    format(stream, $str35$__method__A_from__A__, ref_object, module);
                } else
                    if (pcase_var.eql($GLOBAL)) {
                        format(stream, $str36$__global__A_from__A__, ref_object, module);
                    }

                format(stream, $$$_before_it_is);
                if (((NIL == justifying_globals) && (NIL != list_utilities.singletonP(justifying_methods))) && ref_object.eql(justifying_methods.first())) {
                    format(stream, $str54$_defined__);
                } else {
                    format(stream, $str55$_completely_defined_due_to__);
                    SubLObject cdolist_list_var = justifying_methods;
                    SubLObject justifying_method = NIL;
                    justifying_method = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(stream, $str56$method__A__, justifying_method);
                        cdolist_list_var = cdolist_list_var.rest();
                        justifying_method = cdolist_list_var.first();
                    } 
                    cdolist_list_var = justifying_globals;
                    SubLObject justifying_global = NIL;
                    justifying_global = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        format(stream, $str57$global__A__, justifying_global);
                        cdolist_list_var = cdolist_list_var.rest();
                        justifying_global = cdolist_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(violation_spec, $list50);
            }
        } else {
            cdestructuring_bind_error(violation_spec, $list50);
        }
        return violation_spec;
    }

    /**
     * Analyze the definitions in all modules and return a list of all early-macro-use violations.
     *
     * @return a list of objects suitable for show-early-macro-use-violations.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early-macro-use violations.\r\n\r\n@return a list of objects suitable for show-early-macro-use-violations.")
    public static final SubLObject all_early_macro_use_violations_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_early_macro_use_violations = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($str_alt60$Identifying_early_macro_use_viola, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_70 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject early_macro_use_violations = com.cyc.cycjava.cycl.translator_utilities.module_early_macro_use_violations(module);
                                                        SubLObject cdolist_list_var = early_macro_use_violations;
                                                        SubLObject early_macro_use_violation = NIL;
                                                        for (early_macro_use_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , early_macro_use_violation = cdolist_list_var.first()) {
                                                            all_early_macro_use_violations = cons(early_macro_use_violation, all_early_macro_use_violations);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_70, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_71, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_early_macro_use_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all early-macro-use violations.\r\n\r\n@return a list of objects suitable for show-early-macro-use-violations.")
    public static SubLObject all_early_macro_use_violations(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_macro_use_violations = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$74 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($str58$Identifying_early_macro_use_viola, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject early_macro_use_violations = cdolist_list_var = module_early_macro_use_violations(module);
                            SubLObject early_macro_use_violation = NIL;
                            early_macro_use_violation = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_early_macro_use_violations = cons(early_macro_use_violation, all_early_macro_use_violations);
                                cdolist_list_var = cdolist_list_var.rest();
                                early_macro_use_violation = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$74, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_early_macro_use_violations);
    }/**
     * Analyze the definitions in all modules and return a list of all early-macro-use violations.
     *
     * @return a list of objects suitable for show-early-macro-use-violations.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early-macro-use violations.
     *
     * @return a list of objects suitable for show-early-macro-use-violations.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early-macro-use violations.\r\n\r\n@return a list of objects suitable for show-early-macro-use-violations.")
    public static final SubLObject module_early_macro_use_violations_alt(SubLObject defined_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject early_macro_use_violations = NIL;
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                    SubLObject defined_method = NIL;
                    for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                        {
                            SubLObject defined_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(defined_method);
                            SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(defined_method);
                            SubLObject cdolist_list_var_72 = referenced_methods;
                            SubLObject referenced_method = NIL;
                            for (referenced_method = cdolist_list_var_72.first(); NIL != cdolist_list_var_72; cdolist_list_var_72 = cdolist_list_var_72.rest() , referenced_method = cdolist_list_var_72.first()) {
                                if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_macro_p(referenced_method)) {
                                    {
                                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                        if (NIL != referenced_module) {
                                            {
                                                SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                                                    SubLObject justifying_globals = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                        early_macro_use_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
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
                {
                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                    SubLObject defined_global = NIL;
                    for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                        {
                            SubLObject defined_position = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_position(defined_global);
                            SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(defined_global);
                            SubLObject cdolist_list_var_73 = referenced_methods;
                            SubLObject referenced_method = NIL;
                            for (referenced_method = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , referenced_method = cdolist_list_var_73.first()) {
                                if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_macro_p(referenced_method)) {
                                    {
                                        SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                        if (NIL != referenced_module) {
                                            {
                                                SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                                                    SubLObject justifying_globals = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                        early_macro_use_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
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
                {
                    SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_module(defined_module);
                    SubLObject cdolist_list_var = referenced_methods;
                    SubLObject referenced_method = NIL;
                    for (referenced_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_method = cdolist_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_macro_p(referenced_method)) {
                            {
                                SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                if (NIL != referenced_module) {
                                    {
                                        SubLObject referenced_position = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_position(referenced_method);
                                        SubLObject module_positions = com.cyc.cycjava.cycl.translator_utilities.td_module_positions_calling_method(defined_module, referenced_method);
                                        SubLObject cdolist_list_var_74 = module_positions;
                                        SubLObject module_position = NIL;
                                        for (module_position = cdolist_list_var_74.first(); NIL != cdolist_list_var_74; cdolist_list_var_74 = cdolist_list_var_74.rest() , module_position = cdolist_list_var_74.first()) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject justifying_methods = com.cyc.cycjava.cycl.translator_utilities.td_early_macro_use_p(defined_module, module_position, referenced_module, referenced_position, referenced_method);
                                                SubLObject justifying_globals = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                                                    early_macro_use_violations = cons(list(list($MODULE, defined_module, module_position), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(early_macro_use_violations);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its early-macro-use violations.\r\n\r\n@return a list of objects suitable for show-early-macro-use-violations.")
    public static SubLObject module_early_macro_use_violations(final SubLObject defined_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject early_macro_use_violations = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defined_position = td_method_definition_position(defined_method);
            SubLObject cdolist_list_var_$77;
            final SubLObject referenced_methods = cdolist_list_var_$77 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$77.first();
            while (NIL != cdolist_list_var_$77) {
                if (NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                            early_macro_use_violations = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
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
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject defined_position = td_global_definition_position(defined_global);
            SubLObject cdolist_list_var_$78;
            final SubLObject referenced_methods = cdolist_list_var_$78 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$78.first();
            while (NIL != cdolist_list_var_$78) {
                if (NIL != td_method_macro_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (NIL != referenced_module) {
                        final SubLObject referenced_position = td_method_definition_position(referenced_method);
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, defined_position, referenced_module, referenced_position, referenced_method);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                            early_macro_use_violations = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method, referenced_module), justifying_methods, justifying_globals), early_macro_use_violations);
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
        SubLObject referenced_method2 = NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != td_method_macro_p(referenced_method2)) {
                final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
                if (NIL != referenced_module2) {
                    final SubLObject referenced_position2 = td_method_definition_position(referenced_method2);
                    SubLObject cdolist_list_var_$79;
                    final SubLObject module_positions = cdolist_list_var_$79 = td_module_positions_calling_method(defined_module, referenced_method2);
                    SubLObject module_position = NIL;
                    module_position = cdolist_list_var_$79.first();
                    while (NIL != cdolist_list_var_$79) {
                        thread.resetMultipleValues();
                        final SubLObject justifying_methods = td_early_macro_use_p(defined_module, module_position, referenced_module2, referenced_position2, referenced_method2);
                        final SubLObject justifying_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != justifying_methods) || (NIL != justifying_globals)) {
                            early_macro_use_violations = cons(list(list($MODULE, defined_module, module_position), list($METHOD, referenced_method2, referenced_module2), justifying_methods, justifying_globals), early_macro_use_violations);
                        }
                        cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                        module_position = cdolist_list_var_$79.first();
                    } 
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        } 
        return nreverse(early_macro_use_violations);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its early-macro-use violations.
     *
     * @return a list of objects suitable for show-early-macro-use-violations.
     */


    /**
     * Show a list of early-macro-use violations described in VIOLATION-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of early-macro-use violations described in VIOLATION-SPECS to STREAM.")
    public static final SubLObject show_early_macro_use_violations_alt(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = com.cyc.cycjava.cycl.translator_utilities.all_early_macro_use_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.translator_utilities.show_early_reference_violations(violation_specs, stream);
    }

    @LispMethod(comment = "Show a list of early-macro-use violations described in VIOLATION-SPECS to STREAM.")
    public static SubLObject show_early_macro_use_violations(SubLObject violation_specs, SubLObject stream) {
        if (violation_specs == UNPROVIDED) {
            violation_specs = all_early_macro_use_violations(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return show_early_reference_violations(violation_specs, stream);
    }/**
     * Show a list of early-macro-use violations described in VIOLATION-SPECS to STREAM.
     */


    public static final SubLObject show_one_early_macro_use_violation_alt(SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.translator_utilities.show_one_early_reference_violation(violation_spec, stream);
    }

    public static SubLObject show_one_early_macro_use_violation(final SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return show_one_early_reference_violation(violation_spec, stream);
    }

    /**
     * Analyze the definitions in all modules and return a list of all undefined references.
     *
     * @return a list of objects suitable for show-undefined-references.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all undefined references.\r\n\r\n@return a list of objects suitable for show-undefined-references.")
    public static final SubLObject all_undefined_references_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_undefined_references = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($$$Identifying_undefined_references, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_75 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject undefined_references = com.cyc.cycjava.cycl.translator_utilities.module_undefined_references(module);
                                                        SubLObject cdolist_list_var = undefined_references;
                                                        SubLObject undefined_reference = NIL;
                                                        for (undefined_reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , undefined_reference = cdolist_list_var.first()) {
                                                            all_undefined_references = cons(undefined_reference, all_undefined_references);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_75, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_76, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_undefined_references);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all undefined references.\r\n\r\n@return a list of objects suitable for show-undefined-references.")
    public static SubLObject all_undefined_references(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_undefined_references = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$80 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($$$Identifying_undefined_references, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject undefined_references = cdolist_list_var = module_undefined_references(module);
                            SubLObject undefined_reference = NIL;
                            undefined_reference = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_undefined_references = cons(undefined_reference, all_undefined_references);
                                cdolist_list_var = cdolist_list_var.rest();
                                undefined_reference = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$80, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_undefined_references);
    }/**
     * Analyze the definitions in all modules and return a list of all undefined references.
     *
     * @return a list of objects suitable for show-undefined-references.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its undefined references.
     *
     * @return a list of objects suitable for show-undefined-references.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its undefined references.\r\n\r\n@return a list of objects suitable for show-undefined-references.")
    public static final SubLObject module_undefined_references_alt(SubLObject defined_module) {
        {
            SubLObject undefined_references = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                SubLObject defined_method = NIL;
                for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(defined_method);
                        SubLObject cdolist_list_var_77 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , referenced_method = cdolist_list_var_77.first()) {
                            if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_method_p(referenced_method)) {
                                {
                                    SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                    if (NIL == referenced_module) {
                                        undefined_references = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method)), undefined_references);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(defined_method);
                        SubLObject cdolist_list_var_78 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_78.first(); NIL != cdolist_list_var_78; cdolist_list_var_78 = cdolist_list_var_78.rest() , referenced_global = cdolist_list_var_78.first()) {
                            if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_global_p(referenced_global)) {
                                {
                                    SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                    if (NIL == referenced_module) {
                                        undefined_references = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, referenced_global)), undefined_references);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                SubLObject defined_global = NIL;
                for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                    {
                        SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_global(defined_global);
                        SubLObject cdolist_list_var_79 = referenced_methods;
                        SubLObject referenced_method = NIL;
                        for (referenced_method = cdolist_list_var_79.first(); NIL != cdolist_list_var_79; cdolist_list_var_79 = cdolist_list_var_79.rest() , referenced_method = cdolist_list_var_79.first()) {
                            if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_method_p(referenced_method)) {
                                {
                                    SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                                    if (NIL == referenced_module) {
                                        undefined_references = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method)), undefined_references);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_global(defined_global);
                        SubLObject cdolist_list_var_80 = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var_80.first(); NIL != cdolist_list_var_80; cdolist_list_var_80 = cdolist_list_var_80.rest() , referenced_global = cdolist_list_var_80.first()) {
                            if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_global_p(referenced_global)) {
                                {
                                    SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                                    if (NIL == referenced_module) {
                                        undefined_references = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global)), undefined_references);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_methods;
                SubLObject referenced_method = NIL;
                for (referenced_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_method = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_method_p(referenced_method)) {
                        {
                            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
                            if (NIL == referenced_module) {
                                undefined_references = cons(list(list($MODULE, defined_module), list($METHOD, referenced_method)), undefined_references);
                            }
                        }
                    }
                }
            }
            {
                SubLObject referenced_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_module(defined_module);
                SubLObject cdolist_list_var = referenced_globals;
                SubLObject referenced_global = NIL;
                for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.translator_utilities.td_predefined_global_p(referenced_global)) {
                        {
                            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_global_defining_module(referenced_global);
                            if (NIL == referenced_module) {
                                undefined_references = cons(list(list($MODULE, defined_module), list($GLOBAL, referenced_global)), undefined_references);
                            }
                        }
                    }
                }
            }
            return nreverse(undefined_references);
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its undefined references.\r\n\r\n@return a list of objects suitable for show-undefined-references.")
    public static SubLObject module_undefined_references(final SubLObject defined_module) {
        SubLObject undefined_references = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$83;
            final SubLObject referenced_methods = cdolist_list_var_$83 = td_methods_called_by_method(defined_method);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$83.first();
            while (NIL != cdolist_list_var_$83) {
                if (NIL == td_predefined_method_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (NIL == referenced_module) {
                        undefined_references = cons(list(list($METHOD, defined_method, defined_module), list($METHOD, referenced_method)), undefined_references);
                    }
                }
                cdolist_list_var_$83 = cdolist_list_var_$83.rest();
                referenced_method = cdolist_list_var_$83.first();
            } 
            SubLObject cdolist_list_var_$84;
            final SubLObject referenced_globals = cdolist_list_var_$84 = td_globals_called_by_method(defined_method);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$84.first();
            while (NIL != cdolist_list_var_$84) {
                if (NIL == td_predefined_global_p(referenced_global)) {
                    final SubLObject referenced_module = td_global_defining_module(referenced_global);
                    if (NIL == referenced_module) {
                        undefined_references = cons(list(list($METHOD, defined_method, defined_module), list($GLOBAL, referenced_global)), undefined_references);
                    }
                }
                cdolist_list_var_$84 = cdolist_list_var_$84.rest();
                referenced_global = cdolist_list_var_$84.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$85;
            final SubLObject referenced_methods = cdolist_list_var_$85 = td_methods_called_by_global(defined_global);
            SubLObject referenced_method = NIL;
            referenced_method = cdolist_list_var_$85.first();
            while (NIL != cdolist_list_var_$85) {
                if (NIL == td_predefined_method_p(referenced_method)) {
                    final SubLObject referenced_module = td_method_defining_module(referenced_method);
                    if (NIL == referenced_module) {
                        undefined_references = cons(list(list($GLOBAL, defined_global, defined_module), list($METHOD, referenced_method)), undefined_references);
                    }
                }
                cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                referenced_method = cdolist_list_var_$85.first();
            } 
            SubLObject cdolist_list_var_$86;
            final SubLObject referenced_globals = cdolist_list_var_$86 = td_globals_called_by_global(defined_global);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var_$86.first();
            while (NIL != cdolist_list_var_$86) {
                if (NIL == td_predefined_global_p(referenced_global)) {
                    final SubLObject referenced_module = td_global_defining_module(referenced_global);
                    if (NIL == referenced_module) {
                        undefined_references = cons(list(list($GLOBAL, defined_global, defined_module), list($GLOBAL, referenced_global)), undefined_references);
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
        SubLObject referenced_method2 = NIL;
        referenced_method2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == td_predefined_method_p(referenced_method2)) {
                final SubLObject referenced_module2 = td_method_defining_module(referenced_method2);
                if (NIL == referenced_module2) {
                    undefined_references = cons(list(list($MODULE, defined_module), list($METHOD, referenced_method2)), undefined_references);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_method2 = cdolist_list_var2.first();
        } 
        final SubLObject referenced_globals2 = cdolist_list_var2 = td_globals_called_by_module(defined_module);
        SubLObject referenced_global2 = NIL;
        referenced_global2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == td_predefined_global_p(referenced_global2)) {
                final SubLObject referenced_module2 = td_global_defining_module(referenced_global2);
                if (NIL == referenced_module2) {
                    undefined_references = cons(list(list($MODULE, defined_module), list($GLOBAL, referenced_global2)), undefined_references);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            referenced_global2 = cdolist_list_var2.first();
        } 
        return nreverse(undefined_references);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its undefined references.
     *
     * @return a list of objects suitable for show-undefined-references.
     */


    /**
     * Show a list of undefined references described in REFERENCE-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of undefined references described in REFERENCE-SPECS to STREAM.")
    public static final SubLObject show_undefined_references_alt(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == UNPROVIDED) {
            reference_specs = com.cyc.cycjava.cycl.translator_utilities.all_undefined_references(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = reference_specs;
            SubLObject reference_spec = NIL;
            for (reference_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reference_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_undefined_reference(reference_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of undefined references described in REFERENCE-SPECS to STREAM.")
    public static SubLObject show_undefined_references(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == UNPROVIDED) {
            reference_specs = all_undefined_references(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = reference_specs;
        SubLObject reference_spec = NIL;
        reference_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_undefined_reference(reference_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            reference_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of undefined references described in REFERENCE-SPECS to STREAM.
     */


    public static final SubLObject show_one_undefined_reference_alt(SubLObject reference_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = reference_spec;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject def_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    def_type = current.first();
                    current = current.rest();
                    {
                        SubLObject def_args = current;
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt43);
                        {
                            SubLObject temp_81 = current.rest();
                            current = current.first();
                            {
                                SubLObject ref_type = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt43);
                                ref_type = current.first();
                                current = current.rest();
                                {
                                    SubLObject ref_args = current;
                                    current = temp_81;
                                    if (NIL == current) {
                                        {
                                            SubLObject pcase_var = def_type;
                                            if (pcase_var.eql($MODULE)) {
                                                {
                                                    SubLObject datum_82 = def_args;
                                                    SubLObject current_83 = datum_82;
                                                    SubLObject module = NIL;
                                                    destructuring_bind_must_consp(current_83, datum_82, $list_alt44);
                                                    module = current_83.first();
                                                    current_83 = current_83.rest();
                                                    if (NIL == current_83) {
                                                        format(stream, $str_alt31$__Top_level_form_in__A__, module);
                                                    } else {
                                                        cdestructuring_bind_error(datum_82, $list_alt44);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($METHOD)) {
                                                    {
                                                        SubLObject datum_84 = def_args;
                                                        SubLObject current_85 = datum_84;
                                                        SubLObject def_object = NIL;
                                                        SubLObject module = NIL;
                                                        destructuring_bind_must_consp(current_85, datum_84, $list_alt45);
                                                        def_object = current_85.first();
                                                        current_85 = current_85.rest();
                                                        destructuring_bind_must_consp(current_85, datum_84, $list_alt45);
                                                        module = current_85.first();
                                                        current_85 = current_85.rest();
                                                        if (NIL == current_85) {
                                                            format(stream, $str_alt33$__Method__A_in__A__, def_object, module);
                                                        } else {
                                                            cdestructuring_bind_error(datum_84, $list_alt45);
                                                        }
                                                    }
                                                } else {
                                                    if (pcase_var.eql($GLOBAL)) {
                                                        {
                                                            SubLObject datum_86 = def_args;
                                                            SubLObject current_87 = datum_86;
                                                            SubLObject def_object = NIL;
                                                            SubLObject module = NIL;
                                                            destructuring_bind_must_consp(current_87, datum_86, $list_alt45);
                                                            def_object = current_87.first();
                                                            current_87 = current_87.rest();
                                                            destructuring_bind_must_consp(current_87, datum_86, $list_alt45);
                                                            module = current_87.first();
                                                            current_87 = current_87.rest();
                                                            if (NIL == current_87) {
                                                                format(stream, $str_alt34$__Global__A_in__A__, def_object, module);
                                                            } else {
                                                                cdestructuring_bind_error(datum_86, $list_alt45);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        format(stream, $str_alt62$_references_undefined);
                                        {
                                            SubLObject pcase_var = ref_type;
                                            if (pcase_var.eql($METHOD)) {
                                                {
                                                    SubLObject datum_88 = ref_args;
                                                    SubLObject current_89 = datum_88;
                                                    SubLObject ref_object = NIL;
                                                    destructuring_bind_must_consp(current_89, datum_88, $list_alt63);
                                                    ref_object = current_89.first();
                                                    current_89 = current_89.rest();
                                                    if (NIL == current_89) {
                                                        format(stream, $str_alt64$__method__A__, ref_object);
                                                    } else {
                                                        cdestructuring_bind_error(datum_88, $list_alt63);
                                                    }
                                                }
                                            } else {
                                                if (pcase_var.eql($GLOBAL)) {
                                                    {
                                                        SubLObject datum_90 = ref_args;
                                                        SubLObject current_91 = datum_90;
                                                        SubLObject ref_object = NIL;
                                                        destructuring_bind_must_consp(current_91, datum_90, $list_alt63);
                                                        ref_object = current_91.first();
                                                        current_91 = current_91.rest();
                                                        if (NIL == current_91) {
                                                            format(stream, $str_alt65$__global__A__, ref_object);
                                                        } else {
                                                            cdestructuring_bind_error(datum_90, $list_alt63);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt43);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return reference_spec;
    }

    public static SubLObject show_one_undefined_reference(final SubLObject reference_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        destructuring_bind_must_consp(reference_spec, reference_spec, $list41);
        final SubLObject temp = reference_spec.rest();
        SubLObject current = reference_spec.first();
        SubLObject def_type = NIL;
        destructuring_bind_must_consp(current, reference_spec, $list41);
        def_type = current.first();
        final SubLObject def_args;
        current = def_args = current.rest();
        current = temp;
        destructuring_bind_must_consp(current, reference_spec, $list41);
        final SubLObject temp_$87 = current.rest();
        current = current.first();
        SubLObject ref_type = NIL;
        destructuring_bind_must_consp(current, reference_spec, $list41);
        ref_type = current.first();
        final SubLObject ref_args;
        current = ref_args = current.rest();
        current = temp_$87;
        if (NIL == current) {
            SubLObject pcase_var = def_type;
            if (pcase_var.eql($MODULE)) {
                SubLObject current_$89;
                final SubLObject datum_$88 = current_$89 = def_args;
                SubLObject module = NIL;
                destructuring_bind_must_consp(current_$89, datum_$88, $list42);
                module = current_$89.first();
                current_$89 = current_$89.rest();
                if (NIL == current_$89) {
                    format(stream, $str29$__Top_level_form_in__A__, module);
                } else {
                    cdestructuring_bind_error(datum_$88, $list42);
                }
            } else
                if (pcase_var.eql($METHOD)) {
                    SubLObject current_$90;
                    final SubLObject datum_$89 = current_$90 = def_args;
                    SubLObject def_object = NIL;
                    SubLObject module2 = NIL;
                    destructuring_bind_must_consp(current_$90, datum_$89, $list43);
                    def_object = current_$90.first();
                    current_$90 = current_$90.rest();
                    destructuring_bind_must_consp(current_$90, datum_$89, $list43);
                    module2 = current_$90.first();
                    current_$90 = current_$90.rest();
                    if (NIL == current_$90) {
                        format(stream, $str31$__Method__A_in__A__, def_object, module2);
                    } else {
                        cdestructuring_bind_error(datum_$89, $list43);
                    }
                } else
                    if (pcase_var.eql($GLOBAL)) {
                        SubLObject current_$91;
                        final SubLObject datum_$90 = current_$91 = def_args;
                        SubLObject def_object = NIL;
                        SubLObject module2 = NIL;
                        destructuring_bind_must_consp(current_$91, datum_$90, $list43);
                        def_object = current_$91.first();
                        current_$91 = current_$91.rest();
                        destructuring_bind_must_consp(current_$91, datum_$90, $list43);
                        module2 = current_$91.first();
                        current_$91 = current_$91.rest();
                        if (NIL == current_$91) {
                            format(stream, $str32$__Global__A_in__A__, def_object, module2);
                        } else {
                            cdestructuring_bind_error(datum_$90, $list43);
                        }
                    }


            format(stream, $$$_references_undefined);
            pcase_var = ref_type;
            if (pcase_var.eql($METHOD)) {
                SubLObject current_$92;
                final SubLObject datum_$91 = current_$92 = ref_args;
                SubLObject ref_object = NIL;
                destructuring_bind_must_consp(current_$92, datum_$91, $list61);
                ref_object = current_$92.first();
                current_$92 = current_$92.rest();
                if (NIL == current_$92) {
                    format(stream, $str62$__method__A__, ref_object);
                } else {
                    cdestructuring_bind_error(datum_$91, $list61);
                }
            } else
                if (pcase_var.eql($GLOBAL)) {
                    SubLObject current_$93;
                    final SubLObject datum_$92 = current_$93 = ref_args;
                    SubLObject ref_object = NIL;
                    destructuring_bind_must_consp(current_$93, datum_$92, $list61);
                    ref_object = current_$93.first();
                    current_$93 = current_$93.rest();
                    if (NIL == current_$93) {
                        format(stream, $str63$__global__A__, ref_object);
                    } else {
                        cdestructuring_bind_error(datum_$92, $list61);
                    }
                }

        } else {
            cdestructuring_bind_error(reference_spec, $list41);
        }
        return reference_spec;
    }

    /**
     * Analyze the definitions in all modules and return a list of all multiple-definitions.
     *
     * @return a list of objects suitable for show-multiple-definitions.
     */
    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all multiple-definitions.\r\n\r\n@return a list of objects suitable for show-multiple-definitions.")
    public static final SubLObject all_multiple_definitions_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_multiple_definitions = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = v_modules;
                                    SubLObject module = NIL;
                                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                        {
                                            SubLObject multiple_definitions = com.cyc.cycjava.cycl.translator_utilities.module_multiple_definitions(module);
                                            SubLObject cdolist_list_var_92 = multiple_definitions;
                                            SubLObject multiple_definition = NIL;
                                            for (multiple_definition = cdolist_list_var_92.first(); NIL != cdolist_list_var_92; cdolist_list_var_92 = cdolist_list_var_92.rest() , multiple_definition = cdolist_list_var_92.first()) {
                                                {
                                                    SubLObject item_var = multiple_definition;
                                                    if (NIL == member(item_var, all_multiple_definitions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        all_multiple_definitions = cons(item_var, all_multiple_definitions);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_93, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_multiple_definitions);
            }
        }
    }

    @LispMethod(comment = "Analyze the definitions in all modules and return a list of all multiple-definitions.\r\n\r\n@return a list of objects suitable for show-multiple-definitions.")
    public static SubLObject all_multiple_definitions(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_multiple_definitions = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = NIL;
                module = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$98;
                    final SubLObject multiple_definitions = cdolist_list_var_$98 = module_multiple_definitions(module);
                    SubLObject multiple_definition = NIL;
                    multiple_definition = cdolist_list_var_$98.first();
                    while (NIL != cdolist_list_var_$98) {
                        final SubLObject item_var = multiple_definition;
                        if (NIL == member(item_var, all_multiple_definitions, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            all_multiple_definitions = cons(item_var, all_multiple_definitions);
                        }
                        cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                        multiple_definition = cdolist_list_var_$98.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    module = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_multiple_definitions);
    }/**
     * Analyze the definitions in all modules and return a list of all multiple-definitions.
     *
     * @return a list of objects suitable for show-multiple-definitions.
     */


    /**
     * Analyze the definitions in DEFINED-MODULE and return a list of its multiple definitions
     *
     * @return a list of objects suitable for show-multiple-definitions.
     */
    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its multiple definitions\r\n\r\n@return a list of objects suitable for show-multiple-definitions.")
    public static final SubLObject module_multiple_definitions_alt(SubLObject defined_module) {
        {
            SubLObject multiple_definitions = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                SubLObject defined_method = NIL;
                for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_has_multiple_definitionsP(defined_method)) {
                        {
                            SubLObject position_specs = com.cyc.cycjava.cycl.translator_utilities.td_method_definition_positions(defined_method);
                            multiple_definitions = cons(list($METHOD, defined_method, position_specs), multiple_definitions);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                SubLObject defined_global = NIL;
                for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                    if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_global_has_multiple_definitionsP(defined_global)) {
                        {
                            SubLObject position_specs = com.cyc.cycjava.cycl.translator_utilities.td_global_definition_positions(defined_global);
                            multiple_definitions = cons(list($GLOBAL, defined_global, position_specs), multiple_definitions);
                        }
                    }
                }
            }
            return nreverse(multiple_definitions);
        }
    }

    @LispMethod(comment = "Analyze the definitions in DEFINED-MODULE and return a list of its multiple definitions\r\n\r\n@return a list of objects suitable for show-multiple-definitions.")
    public static SubLObject module_multiple_definitions(final SubLObject defined_module) {
        SubLObject multiple_definitions = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != td_method_has_multiple_definitionsP(defined_method)) {
                final SubLObject position_specs = td_method_definition_positions(defined_method);
                multiple_definitions = cons(list($METHOD, defined_method, position_specs), multiple_definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        cdolist_list_var = td_globals_defined_by_module(defined_module);
        SubLObject defined_global = NIL;
        defined_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != td_global_has_multiple_definitionsP(defined_global)) {
                final SubLObject position_specs = td_global_definition_positions(defined_global);
                multiple_definitions = cons(list($GLOBAL, defined_global, position_specs), multiple_definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_global = cdolist_list_var.first();
        } 
        return nreverse(multiple_definitions);
    }/**
     * Analyze the definitions in DEFINED-MODULE and return a list of its multiple definitions
     *
     * @return a list of objects suitable for show-multiple-definitions.
     */


    /**
     * Show a list of multiple definitions described in DEFINITION-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of multiple definitions described in DEFINITION-SPECS to STREAM.")
    public static final SubLObject show_multiple_definitions_alt(SubLObject definition_specs, SubLObject stream) {
        if (definition_specs == UNPROVIDED) {
            definition_specs = com.cyc.cycjava.cycl.translator_utilities.all_multiple_definitions(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = definition_specs;
            SubLObject definition_spec = NIL;
            for (definition_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_multiple_definition(definition_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of multiple definitions described in DEFINITION-SPECS to STREAM.")
    public static SubLObject show_multiple_definitions(SubLObject definition_specs, SubLObject stream) {
        if (definition_specs == UNPROVIDED) {
            definition_specs = all_multiple_definitions(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = definition_specs;
        SubLObject definition_spec = NIL;
        definition_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_multiple_definition(definition_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            definition_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of multiple definitions described in DEFINITION-SPECS to STREAM.
     */


    public static final SubLObject show_one_multiple_definition_alt(SubLObject definition_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = definition_spec;
            SubLObject current = datum;
            SubLObject def_type = NIL;
            SubLObject def_object = NIL;
            SubLObject definition_positions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt66);
            def_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt66);
            def_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt66);
            definition_positions = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = def_type;
                    if (pcase_var.eql($METHOD)) {
                        format(stream, $str_alt67$__Method__A_has_multiple_definiti, def_object);
                    } else {
                        if (pcase_var.eql($GLOBAL)) {
                            format(stream, $str_alt68$__Global__A_has_multiple_definiti, def_object);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = definition_positions;
                    SubLObject definition_position = NIL;
                    for (definition_position = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , definition_position = cdolist_list_var.first()) {
                        {
                            SubLObject datum_94 = definition_position;
                            SubLObject current_95 = datum_94;
                            SubLObject module = NIL;
                            SubLObject file_position = NIL;
                            destructuring_bind_must_consp(current_95, datum_94, $list_alt69);
                            module = current_95.first();
                            current_95 = current_95.rest();
                            file_position = current_95;
                            format(stream, $str_alt70$_____A_at_position__S, module, file_position);
                        }
                    }
                }
                terpri(stream);
            } else {
                cdestructuring_bind_error(datum, $list_alt66);
            }
        }
        return definition_spec;
    }

    public static SubLObject show_one_multiple_definition(final SubLObject definition_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject def_type = NIL;
        SubLObject def_object = NIL;
        SubLObject definition_positions = NIL;
        destructuring_bind_must_consp(definition_spec, definition_spec, $list64);
        def_type = definition_spec.first();
        SubLObject current = definition_spec.rest();
        destructuring_bind_must_consp(current, definition_spec, $list64);
        def_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, definition_spec, $list64);
        definition_positions = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = def_type;
            if (pcase_var.eql($METHOD)) {
                format(stream, $str65$__Method__A_has_multiple_definiti, def_object);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    format(stream, $str66$__Global__A_has_multiple_definiti, def_object);
                }

            SubLObject cdolist_list_var = definition_positions;
            SubLObject definition_position = NIL;
            definition_position = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$101;
                final SubLObject datum_$100 = current_$101 = definition_position;
                SubLObject module = NIL;
                SubLObject file_position = NIL;
                destructuring_bind_must_consp(current_$101, datum_$100, $list67);
                module = current_$101.first();
                current_$101 = file_position = current_$101.rest();
                format(stream, $str68$_____A_at_position__S, module, file_position);
                cdolist_list_var = cdolist_list_var.rest();
                definition_position = cdolist_list_var.first();
            } 
            terpri(stream);
        } else {
            cdestructuring_bind_error(definition_spec, $list64);
        }
        return definition_spec;
    }

    /**
     * Analyze the references in all modules and return a list of all early-constant-references.
     *
     * @return a list of objects suitable for show-early-constant-references.
     */
    @LispMethod(comment = "Analyze the references in all modules and return a list of all early-constant-references.\r\n\r\n@return a list of objects suitable for show-early-constant-references.")
    public static final SubLObject all_early_constant_references_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_early_constant_references = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = v_modules;
                                    SubLObject module = NIL;
                                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                        {
                                            SubLObject early_constant_references = com.cyc.cycjava.cycl.translator_utilities.module_early_constant_references(module);
                                            SubLObject cdolist_list_var_96 = early_constant_references;
                                            SubLObject early_constant_reference = NIL;
                                            for (early_constant_reference = cdolist_list_var_96.first(); NIL != cdolist_list_var_96; cdolist_list_var_96 = cdolist_list_var_96.rest() , early_constant_reference = cdolist_list_var_96.first()) {
                                                {
                                                    SubLObject item_var = early_constant_reference;
                                                    if (NIL == member(item_var, all_early_constant_references, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        all_early_constant_references = cons(item_var, all_early_constant_references);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_97, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(all_early_constant_references);
            }
        }
    }

    @LispMethod(comment = "Analyze the references in all modules and return a list of all early-constant-references.\r\n\r\n@return a list of objects suitable for show-early-constant-references.")
    public static SubLObject all_early_constant_references(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_early_constant_references = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = v_modules;
                SubLObject module = NIL;
                module = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$102;
                    final SubLObject early_constant_references = cdolist_list_var_$102 = module_early_constant_references(module);
                    SubLObject early_constant_reference = NIL;
                    early_constant_reference = cdolist_list_var_$102.first();
                    while (NIL != cdolist_list_var_$102) {
                        final SubLObject item_var = early_constant_reference;
                        if (NIL == member(item_var, all_early_constant_references, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            all_early_constant_references = cons(item_var, all_early_constant_references);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        early_constant_reference = cdolist_list_var_$102.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    module = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(all_early_constant_references);
    }/**
     * Analyze the references in all modules and return a list of all early-constant-references.
     *
     * @return a list of objects suitable for show-early-constant-references.
     */


    /**
     * Analyze the references in DEFINED-MODULE and return a list of its early-constant references
     *
     * @return a list of objects suitable for show-early-constant-references.
     */
    @LispMethod(comment = "Analyze the references in DEFINED-MODULE and return a list of its early-constant references\r\n\r\n@return a list of objects suitable for show-early-constant-references.")
    public static final SubLObject module_early_constant_references_alt(SubLObject defined_module) {
        {
            SubLObject referenced_method = READER_MAKE_CONSTANT_SHELL;
            SubLObject referenced_module = com.cyc.cycjava.cycl.translator_utilities.td_method_defining_module(referenced_method);
            if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_module_earlier(defined_module, referenced_module)) {
                {
                    SubLObject early_constant_references = NIL;
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
                        SubLObject defined_method = NIL;
                        for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_called_by_methodP(referenced_method, defined_method)) {
                                early_constant_references = cons(list($METHOD, defined_method, defined_module), early_constant_references);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_globals_defined_by_module(defined_module);
                        SubLObject defined_global = NIL;
                        for (defined_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_global = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_called_by_globalP(referenced_method, defined_global)) {
                                early_constant_references = cons(list($GLOBAL, defined_global, defined_module), early_constant_references);
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.translator_utilities.td_method_called_by_moduleP(referenced_method, defined_module)) {
                        early_constant_references = cons(list($MODULE, defined_module), early_constant_references);
                    }
                    return nreverse(early_constant_references);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Analyze the references in DEFINED-MODULE and return a list of its early-constant references\r\n\r\n@return a list of objects suitable for show-early-constant-references.")
    public static SubLObject module_early_constant_references(final SubLObject defined_module) {
        final SubLObject referenced_method = READER_MAKE_CONSTANT_SHELL;
        final SubLObject referenced_module = td_method_defining_module(referenced_method);
        if (NIL != td_module_earlier(defined_module, referenced_module)) {
            SubLObject early_constant_references = NIL;
            SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
            SubLObject defined_method = NIL;
            defined_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != td_method_called_by_methodP(referenced_method, defined_method)) {
                    early_constant_references = cons(list($METHOD, defined_method, defined_module), early_constant_references);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defined_method = cdolist_list_var.first();
            } 
            cdolist_list_var = td_globals_defined_by_module(defined_module);
            SubLObject defined_global = NIL;
            defined_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != td_method_called_by_globalP(referenced_method, defined_global)) {
                    early_constant_references = cons(list($GLOBAL, defined_global, defined_module), early_constant_references);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defined_global = cdolist_list_var.first();
            } 
            if (NIL != td_method_called_by_moduleP(referenced_method, defined_module)) {
                early_constant_references = cons(list($MODULE, defined_module), early_constant_references);
            }
            return nreverse(early_constant_references);
        }
        return NIL;
    }/**
     * Analyze the references in DEFINED-MODULE and return a list of its early-constant references
     *
     * @return a list of objects suitable for show-early-constant-references.
     */


    /**
     * Show a list of early-constant references described in REFERENCE-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of early-constant references described in REFERENCE-SPECS to STREAM.")
    public static final SubLObject show_early_constant_references_alt(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == UNPROVIDED) {
            reference_specs = com.cyc.cycjava.cycl.translator_utilities.all_early_constant_references(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = reference_specs;
            SubLObject reference_spec = NIL;
            for (reference_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reference_spec = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.translator_utilities.show_one_early_constant_reference(reference_spec, stream);
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of early-constant references described in REFERENCE-SPECS to STREAM.")
    public static SubLObject show_early_constant_references(SubLObject reference_specs, SubLObject stream) {
        if (reference_specs == UNPROVIDED) {
            reference_specs = all_early_constant_references(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = reference_specs;
        SubLObject reference_spec = NIL;
        reference_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            show_one_early_constant_reference(reference_spec, stream);
            cdolist_list_var = cdolist_list_var.rest();
            reference_spec = cdolist_list_var.first();
        } 
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of early-constant references described in REFERENCE-SPECS to STREAM.
     */


    public static final SubLObject show_one_early_constant_reference_alt(SubLObject reference_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = reference_spec;
            SubLObject current = datum;
            SubLObject ref_type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            ref_type = current.first();
            current = current.rest();
            {
                SubLObject ref_args = current;
                SubLObject pcase_var = ref_type;
                if (pcase_var.eql($MODULE)) {
                    {
                        SubLObject datum_98 = ref_args;
                        SubLObject current_99 = datum_98;
                        SubLObject module = NIL;
                        destructuring_bind_must_consp(current_99, datum_98, $list_alt44);
                        module = current_99.first();
                        current_99 = current_99.rest();
                        if (NIL == current_99) {
                            format(stream, $str_alt31$__Top_level_form_in__A__, module);
                        } else {
                            cdestructuring_bind_error(datum_98, $list_alt44);
                        }
                    }
                } else {
                    if (pcase_var.eql($METHOD)) {
                        {
                            SubLObject datum_100 = ref_args;
                            SubLObject current_101 = datum_100;
                            SubLObject ref_object = NIL;
                            SubLObject module = NIL;
                            destructuring_bind_must_consp(current_101, datum_100, $list_alt47);
                            ref_object = current_101.first();
                            current_101 = current_101.rest();
                            destructuring_bind_must_consp(current_101, datum_100, $list_alt47);
                            module = current_101.first();
                            current_101 = current_101.rest();
                            if (NIL == current_101) {
                                format(stream, $str_alt33$__Method__A_in__A__, ref_object, module);
                            } else {
                                cdestructuring_bind_error(datum_100, $list_alt47);
                            }
                        }
                    } else {
                        if (pcase_var.eql($GLOBAL)) {
                            {
                                SubLObject datum_102 = ref_args;
                                SubLObject current_103 = datum_102;
                                SubLObject ref_object = NIL;
                                SubLObject module = NIL;
                                destructuring_bind_must_consp(current_103, datum_102, $list_alt47);
                                ref_object = current_103.first();
                                current_103 = current_103.rest();
                                destructuring_bind_must_consp(current_103, datum_102, $list_alt47);
                                module = current_103.first();
                                current_103 = current_103.rest();
                                if (NIL == current_103) {
                                    format(stream, $str_alt34$__Global__A_in__A__, ref_object, module);
                                } else {
                                    cdestructuring_bind_error(datum_102, $list_alt47);
                                }
                            }
                        }
                    }
                }
                format(stream, $str_alt73$references____before_it_is_comple);
            }
        }
        return reference_spec;
    }

    public static SubLObject show_one_early_constant_reference(final SubLObject reference_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject ref_type = NIL;
        destructuring_bind_must_consp(reference_spec, reference_spec, $list70);
        ref_type = reference_spec.first();
        final SubLObject ref_args;
        final SubLObject current = ref_args = reference_spec.rest();
        final SubLObject pcase_var = ref_type;
        if (pcase_var.eql($MODULE)) {
            SubLObject current_$105;
            final SubLObject datum_$104 = current_$105 = ref_args;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current_$105, datum_$104, $list42);
            module = current_$105.first();
            current_$105 = current_$105.rest();
            if (NIL == current_$105) {
                format(stream, $str29$__Top_level_form_in__A__, module);
            } else {
                cdestructuring_bind_error(datum_$104, $list42);
            }
        } else
            if (pcase_var.eql($METHOD)) {
                SubLObject current_$106;
                final SubLObject datum_$105 = current_$106 = ref_args;
                SubLObject ref_object = NIL;
                SubLObject module2 = NIL;
                destructuring_bind_must_consp(current_$106, datum_$105, $list45);
                ref_object = current_$106.first();
                current_$106 = current_$106.rest();
                destructuring_bind_must_consp(current_$106, datum_$105, $list45);
                module2 = current_$106.first();
                current_$106 = current_$106.rest();
                if (NIL == current_$106) {
                    format(stream, $str31$__Method__A_in__A__, ref_object, module2);
                } else {
                    cdestructuring_bind_error(datum_$105, $list45);
                }
            } else
                if (pcase_var.eql($GLOBAL)) {
                    SubLObject current_$107;
                    final SubLObject datum_$106 = current_$107 = ref_args;
                    SubLObject ref_object = NIL;
                    SubLObject module2 = NIL;
                    destructuring_bind_must_consp(current_$107, datum_$106, $list45);
                    ref_object = current_$107.first();
                    current_$107 = current_$107.rest();
                    destructuring_bind_must_consp(current_$107, datum_$106, $list45);
                    module2 = current_$107.first();
                    current_$107 = current_$107.rest();
                    if (NIL == current_$107) {
                        format(stream, $str32$__Global__A_in__A__, ref_object, module2);
                    } else {
                        cdestructuring_bind_error(datum_$106, $list45);
                    }
                }


        format(stream, $str71$references____before_it_is_comple);
        return reference_spec;
    }

    /**
     * Print to STREAM warnings about API macros that expand into non-API methods.
     */
    @LispMethod(comment = "Print to STREAM warnings about API macros that expand into non-API methods.")
    public static final SubLObject show_api_macros_with_non_api_expansions_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject problems = NIL;
            SubLObject macro = NIL;
            SubLObject ignore = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator($api_predefined_macro_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        macro = getEntryKey(cdohash_entry);
                        ignore = getEntryValue(cdohash_entry);
                        {
                            SubLObject non_api_expansions = com.cyc.cycjava.cycl.translator_utilities.non_api_expansions_for_api_macro(macro);
                            if (NIL != non_api_expansions) {
                                problems = cons(cons(macro, non_api_expansions), problems);
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            if (NIL != problems) {
                {
                    SubLObject build_problem_spec = list($API_MACRO_VISIBILITY, problems);
                    com.cyc.cycjava.cycl.translator_utilities.show_one_build_problem(build_problem_spec, stream);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Print to STREAM warnings about API macros that expand into non-API methods.")
    public static SubLObject show_api_macros_with_non_api_expansions(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject problems = NIL;
        SubLObject macro = NIL;
        SubLObject ignore = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($api_predefined_macro_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                macro = getEntryKey(cdohash_entry);
                ignore = getEntryValue(cdohash_entry);
                final SubLObject non_api_expansions = non_api_expansions_for_api_macro(macro);
                if (NIL != non_api_expansions) {
                    problems = cons(cons(macro, non_api_expansions), problems);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        if (NIL != problems) {
            final SubLObject build_problem_spec = list($API_MACRO_VISIBILITY, problems);
            show_one_build_problem(build_problem_spec, stream);
        }
        return NIL;
    }/**
     * Print to STREAM warnings about API macros that expand into non-API methods.
     */


    public static final SubLObject show_one_api_macro_visibility_problem_alt(SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = violation_spec;
            SubLObject current = datum;
            SubLObject macro = NIL;
            SubLObject non_api_expansions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            macro = current.first();
            current = current.rest();
            non_api_expansions = current;
            format(stream, $str_alt76$__API_macro__A_expands_to_non_API, macro, non_api_expansions);
        }
        return NIL;
    }

    public static SubLObject show_one_api_macro_visibility_problem(final SubLObject violation_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject macro = NIL;
        SubLObject non_api_expansions = NIL;
        destructuring_bind_must_consp(violation_spec, violation_spec, $list73);
        macro = violation_spec.first();
        final SubLObject current = non_api_expansions = violation_spec.rest();
        format(stream, $str74$__API_macro__A_expands_to_non_API, macro, non_api_expansions);
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of methods in the expansion of MACRO that are not part of the API.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP of methods in the expansion of MACRO that are not part of the API.\r\n@unknown baxter")
    public static final SubLObject non_api_expansions_for_api_macro_alt(SubLObject macro) {
        SubLTrampolineFile.checkType(macro, API_PREDEFINED_MACRO_P);
        {
            SubLObject non_api_expansions = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_macro_expansion_calls(macro);
            SubLObject method = NIL;
            for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                if (!((NIL != api_predefined_macro_p(method)) || (NIL != api_predefined_function_p(method)))) {
                    non_api_expansions = cons(method, non_api_expansions);
                }
            }
            return non_api_expansions;
        }
    }

    /**
     *
     *
     * @return LISTP of methods in the expansion of MACRO that are not part of the API.
     * @unknown baxter
     */
    @LispMethod(comment = "@return LISTP of methods in the expansion of MACRO that are not part of the API.\r\n@unknown baxter")
    public static SubLObject non_api_expansions_for_api_macro(final SubLObject macro) {
        assert NIL != api_predefined_macro_p(macro) : "! utilities_macros.api_predefined_macro_p(macro) " + ("utilities_macros.api_predefined_macro_p(macro) " + "CommonSymbols.NIL != utilities_macros.api_predefined_macro_p(macro) ") + macro;
        SubLObject non_api_expansions = NIL;
        SubLObject cdolist_list_var = td_macro_expansion_calls(macro);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == api_predefined_macro_p(method)) && (NIL == api_predefined_function_p(method))) {
                non_api_expansions = cons(method, non_api_expansions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return non_api_expansions;
    }

    /**
     * Analyze each module in MODULES and return a list of all build problems.
     *
     * @return a list of objects suitable for show-build-problems.
     */
    @LispMethod(comment = "Analyze each module in MODULES and return a list of all build problems.\r\n\r\n@return a list of objects suitable for show-build-problems.")
    public static final SubLObject all_build_problems_alt(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = com.cyc.cycjava.cycl.translator_utilities.td_translation_modules();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_build_problems = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt4$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject list_var = v_modules;
                                    $progress_note$.setDynamicValue($$$Determining_build_problems, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_104 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject module = NIL;
                                                for (module = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , module = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject build_problems = com.cyc.cycjava.cycl.translator_utilities.module_build_problems(module);
                                                        SubLObject cdolist_list_var = build_problems;
                                                        SubLObject build_problem = NIL;
                                                        for (build_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , build_problem = cdolist_list_var.first()) {
                                                            all_build_problems = cons(build_problem, all_build_problems);
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_104, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_105, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                all_build_problems = nreverse(all_build_problems);
                return all_build_problems;
            }
        }
    }

    @LispMethod(comment = "Analyze each module in MODULES and return a list of all build problems.\r\n\r\n@return a list of objects suitable for show-build-problems.")
    public static SubLObject all_build_problems(SubLObject v_modules) {
        if (v_modules == UNPROVIDED) {
            v_modules = td_translation_modules();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_build_problems = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject list_var = v_modules;
                final SubLObject _prev_bind_0_$110 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($$$Determining_build_problems, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject module = NIL;
                        module = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            SubLObject cdolist_list_var;
                            final SubLObject build_problems = cdolist_list_var = module_build_problems(module);
                            SubLObject build_problem = NIL;
                            build_problem = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                all_build_problems = cons(build_problem, all_build_problems);
                                cdolist_list_var = cdolist_list_var.rest();
                                build_problem = cdolist_list_var.first();
                            } 
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            module = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$110, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        all_build_problems = nreverse(all_build_problems);
        return all_build_problems;
    }/**
     * Analyze each module in MODULES and return a list of all build problems.
     *
     * @return a list of objects suitable for show-build-problems.
     */


    /**
     * Analyze the references in DEFINED-MODULE and return a list of its build problems
     *
     * @return a list of objects suitable for show-build-problems.
     */
    @LispMethod(comment = "Analyze the references in DEFINED-MODULE and return a list of its build problems\r\n\r\n@return a list of objects suitable for show-build-problems.")
    public static final SubLObject module_build_problems_alt(SubLObject defined_module) {
        {
            SubLObject build_problems = NIL;
            SubLObject multiple_definitions = com.cyc.cycjava.cycl.translator_utilities.module_multiple_definitions(defined_module);
            if (NIL != multiple_definitions) {
                build_problems = cons(list($MULTIPLE_DEFINITIONS, multiple_definitions), build_problems);
            }
            {
                SubLObject undefined_references = com.cyc.cycjava.cycl.translator_utilities.module_undefined_references(defined_module);
                if (NIL != undefined_references) {
                    build_problems = cons(list($UNDEFINED_REFERENCES, undefined_references), build_problems);
                }
            }
            {
                SubLObject privacy_violations = com.cyc.cycjava.cycl.translator_utilities.module_privacy_violations(defined_module);
                if (NIL != privacy_violations) {
                    build_problems = cons(list($PRIVACY_VIOLATIONS, privacy_violations), build_problems);
                }
            }
            {
                SubLObject early_constant_references = com.cyc.cycjava.cycl.translator_utilities.module_early_constant_references(defined_module);
                if (NIL != early_constant_references) {
                    build_problems = cons(list($EARLY_CONSTANT_REFERENCES, early_constant_references), build_problems);
                }
            }
            {
                SubLObject early_reference_violations = com.cyc.cycjava.cycl.translator_utilities.module_early_reference_violations(defined_module);
                if (NIL != early_reference_violations) {
                    build_problems = cons(list($EARLY_REFERENCE_VIOLATIONS, early_reference_violations), build_problems);
                }
            }
            {
                SubLObject early_rebinding_violations = com.cyc.cycjava.cycl.translator_utilities.module_early_rebinding_violations(defined_module);
                if (NIL != early_rebinding_violations) {
                    build_problems = cons(list($EARLY_REBINDING_VIOLATIONS, early_rebinding_violations), build_problems);
                }
            }
            return nreverse(build_problems);
        }
    }

    @LispMethod(comment = "Analyze the references in DEFINED-MODULE and return a list of its build problems\r\n\r\n@return a list of objects suitable for show-build-problems.")
    public static SubLObject module_build_problems(final SubLObject defined_module) {
        SubLObject build_problems = NIL;
        final SubLObject multiple_definitions = module_multiple_definitions(defined_module);
        if (NIL != multiple_definitions) {
            build_problems = cons(list($MULTIPLE_DEFINITIONS, multiple_definitions), build_problems);
        }
        final SubLObject undefined_references = module_undefined_references(defined_module);
        if (NIL != undefined_references) {
            build_problems = cons(list($UNDEFINED_REFERENCES, undefined_references), build_problems);
        }
        final SubLObject privacy_violations = module_privacy_violations(defined_module);
        if (NIL != privacy_violations) {
            build_problems = cons(list($PRIVACY_VIOLATIONS, privacy_violations), build_problems);
        }
        final SubLObject early_constant_references = module_early_constant_references(defined_module);
        if (NIL != early_constant_references) {
            build_problems = cons(list($EARLY_CONSTANT_REFERENCES, early_constant_references), build_problems);
        }
        final SubLObject early_reference_violations = module_early_reference_violations(defined_module);
        if (NIL != early_reference_violations) {
            build_problems = cons(list($EARLY_REFERENCE_VIOLATIONS, early_reference_violations), build_problems);
        }
        final SubLObject early_rebinding_violations = module_early_rebinding_violations(defined_module);
        if (NIL != early_rebinding_violations) {
            build_problems = cons(list($EARLY_REBINDING_VIOLATIONS, early_rebinding_violations), build_problems);
        }
        return nreverse(build_problems);
    }/**
     * Analyze the references in DEFINED-MODULE and return a list of its build problems
     *
     * @return a list of objects suitable for show-build-problems.
     */


    /**
     * Show a list of build-problems described in BUILD-PROBLEM-SPECS to STREAM.
     */
    @LispMethod(comment = "Show a list of build-problems described in BUILD-PROBLEM-SPECS to STREAM.")
    public static final SubLObject show_build_problems_alt(SubLObject build_problem_specs, SubLObject stream) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = com.cyc.cycjava.cycl.translator_utilities.all_build_problems(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (NIL == build_problem_specs) {
            format(stream, $str_alt85$__No_build_problems_);
        } else {
            {
                SubLObject cdolist_list_var = build_problem_specs;
                SubLObject build_problem_spec = NIL;
                for (build_problem_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , build_problem_spec = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.translator_utilities.show_one_build_problem(build_problem_spec, stream);
                }
            }
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }

    @LispMethod(comment = "Show a list of build-problems described in BUILD-PROBLEM-SPECS to STREAM.")
    public static SubLObject show_build_problems(SubLObject build_problem_specs, SubLObject stream) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = all_build_problems(UNPROVIDED);
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (NIL == build_problem_specs) {
            format(stream, $str83$__No_build_problems_);
        } else {
            SubLObject cdolist_list_var = build_problem_specs;
            SubLObject build_problem_spec = NIL;
            build_problem_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                show_one_build_problem(build_problem_spec, stream);
                cdolist_list_var = cdolist_list_var.rest();
                build_problem_spec = cdolist_list_var.first();
            } 
        }
        terpri(stream);
        force_output(stream);
        return NIL;
    }/**
     * Show a list of build-problems described in BUILD-PROBLEM-SPECS to STREAM.
     */


    public static final SubLObject show_one_build_problem_alt(SubLObject build_problem_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject datum = build_problem_spec;
            SubLObject current = datum;
            SubLObject problem_class = NIL;
            SubLObject problems = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            problem_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt86);
            problems = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = problem_class;
                    if (pcase_var.eql($MULTIPLE_DEFINITIONS)) {
                        {
                            SubLObject cdolist_list_var = problems;
                            SubLObject problem = NIL;
                            for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.translator_utilities.show_one_multiple_definition(problem, stream);
                            }
                        }
                    } else {
                        if (pcase_var.eql($UNDEFINED_REFERENCES)) {
                            {
                                SubLObject cdolist_list_var = problems;
                                SubLObject problem = NIL;
                                for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.translator_utilities.show_one_undefined_reference(problem, stream);
                                }
                            }
                        } else {
                            if (pcase_var.eql($PRIVACY_VIOLATIONS)) {
                                {
                                    SubLObject cdolist_list_var = problems;
                                    SubLObject problem = NIL;
                                    for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.translator_utilities.show_one_privacy_violation(problem, stream);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($EARLY_CONSTANT_REFERENCES)) {
                                    {
                                        SubLObject cdolist_list_var = problems;
                                        SubLObject problem = NIL;
                                        for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                            com.cyc.cycjava.cycl.translator_utilities.show_one_early_constant_reference(problem, stream);
                                        }
                                    }
                                } else {
                                    if (pcase_var.eql($EARLY_REFERENCE_VIOLATIONS)) {
                                        {
                                            SubLObject cdolist_list_var = problems;
                                            SubLObject problem = NIL;
                                            for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                                com.cyc.cycjava.cycl.translator_utilities.show_one_early_reference_violation(problem, stream);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($EARLY_REBINDING_VIOLATIONS)) {
                                            {
                                                SubLObject cdolist_list_var = problems;
                                                SubLObject problem = NIL;
                                                for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                                    com.cyc.cycjava.cycl.translator_utilities.show_one_early_rebinding_violation(problem, stream);
                                                }
                                            }
                                        } else {
                                            if (pcase_var.eql($API_MACRO_VISIBILITY)) {
                                                {
                                                    SubLObject cdolist_list_var = problems;
                                                    SubLObject problem = NIL;
                                                    for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                                        com.cyc.cycjava.cycl.translator_utilities.show_one_api_macro_visibility_problem(problem, stream);
                                                    }
                                                }
                                            } else {
                                                Errors.error($str_alt87$Unknown_build_problem_class__S, problem_class);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt86);
            }
        }
        return NIL;
    }

    public static SubLObject show_one_build_problem(final SubLObject build_problem_spec, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject problem_class = NIL;
        SubLObject problems = NIL;
        destructuring_bind_must_consp(build_problem_spec, build_problem_spec, $list84);
        problem_class = build_problem_spec.first();
        SubLObject current = build_problem_spec.rest();
        destructuring_bind_must_consp(current, build_problem_spec, $list84);
        problems = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = problem_class;
            if (pcase_var.eql($MULTIPLE_DEFINITIONS)) {
                SubLObject cdolist_list_var = problems;
                SubLObject problem = NIL;
                problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    show_one_multiple_definition(problem, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                } 
            } else
                if (pcase_var.eql($UNDEFINED_REFERENCES)) {
                    SubLObject cdolist_list_var = problems;
                    SubLObject problem = NIL;
                    problem = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        show_one_undefined_reference(problem, stream);
                        cdolist_list_var = cdolist_list_var.rest();
                        problem = cdolist_list_var.first();
                    } 
                } else
                    if (pcase_var.eql($PRIVACY_VIOLATIONS)) {
                        SubLObject cdolist_list_var = problems;
                        SubLObject problem = NIL;
                        problem = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            show_one_privacy_violation(problem, stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            problem = cdolist_list_var.first();
                        } 
                    } else
                        if (pcase_var.eql($EARLY_CONSTANT_REFERENCES)) {
                            SubLObject cdolist_list_var = problems;
                            SubLObject problem = NIL;
                            problem = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                show_one_early_constant_reference(problem, stream);
                                cdolist_list_var = cdolist_list_var.rest();
                                problem = cdolist_list_var.first();
                            } 
                        } else
                            if (pcase_var.eql($EARLY_REFERENCE_VIOLATIONS)) {
                                SubLObject cdolist_list_var = problems;
                                SubLObject problem = NIL;
                                problem = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    show_one_early_reference_violation(problem, stream);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    problem = cdolist_list_var.first();
                                } 
                            } else
                                if (pcase_var.eql($EARLY_REBINDING_VIOLATIONS)) {
                                    SubLObject cdolist_list_var = problems;
                                    SubLObject problem = NIL;
                                    problem = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        show_one_early_rebinding_violation(problem, stream);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        problem = cdolist_list_var.first();
                                    } 
                                } else
                                    if (pcase_var.eql($API_MACRO_VISIBILITY)) {
                                        SubLObject cdolist_list_var = problems;
                                        SubLObject problem = NIL;
                                        problem = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            show_one_api_macro_visibility_problem(problem, stream);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            problem = cdolist_list_var.first();
                                        } 
                                    } else {
                                        Errors.error($str85$Unknown_build_problem_class__S, problem_class);
                                    }






        } else {
            cdestructuring_bind_error(build_problem_spec, $list84);
        }
        return NIL;
    }

    /**
     * Return the total number of build-problems described in BUILD-PROBLEM-SPECS
     */
    @LispMethod(comment = "Return the total number of build-problems described in BUILD-PROBLEM-SPECS")
    public static final SubLObject count_build_problems_alt(SubLObject build_problem_specs) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = com.cyc.cycjava.cycl.translator_utilities.all_build_problems(UNPROVIDED);
        }
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = build_problem_specs;
            SubLObject build_problem_spec = NIL;
            for (build_problem_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , build_problem_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = build_problem_spec;
                    SubLObject current = datum;
                    SubLObject problem_class = NIL;
                    SubLObject problems = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    problem_class = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    problems = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        total = add(total, length(problems));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt86);
                    }
                }
            }
            return total;
        }
    }

    @LispMethod(comment = "Return the total number of build-problems described in BUILD-PROBLEM-SPECS")
    public static SubLObject count_build_problems(SubLObject build_problem_specs) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = all_build_problems(UNPROVIDED);
        }
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = build_problem_specs;
        SubLObject build_problem_spec = NIL;
        build_problem_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = build_problem_spec;
            SubLObject problem_class = NIL;
            SubLObject problems = NIL;
            destructuring_bind_must_consp(current, datum, $list84);
            problem_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list84);
            problems = current.first();
            current = current.rest();
            if (NIL == current) {
                total = add(total, length(problems));
            } else {
                cdestructuring_bind_error(datum, $list84);
            }
            cdolist_list_var = cdolist_list_var.rest();
            build_problem_spec = cdolist_list_var.first();
        } 
        return total;
    }/**
     * Return the total number of build-problems described in BUILD-PROBLEM-SPECS
     */


    public static final SubLObject build_problem_counts_by_module_alt(SubLObject build_problem_specs) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = com.cyc.cycjava.cycl.translator_utilities.all_build_problems(UNPROVIDED);
        }
        {
            SubLObject table = dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER);
            SubLObject cdolist_list_var = build_problem_specs;
            SubLObject build_problem_spec = NIL;
            for (build_problem_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , build_problem_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = build_problem_spec;
                    SubLObject current = datum;
                    SubLObject problem_class = NIL;
                    SubLObject problems = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    problem_class = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    problems = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject problem = problems.first();
                            SubLObject module = list_utilities.tree_find_if(symbol_function(STRINGP), problem, UNPROVIDED);
                            if (module.isString()) {
                                dictionary_utilities.dictionary_increment(table, module, length(problems));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt86);
                    }
                }
            }
            {
                SubLObject problem_counts = dictionary_utilities.dictionary_to_alist(table);
                problem_counts = Sort.sort(problem_counts, symbol_function($sym89$_), symbol_function(CDR));
                return problem_counts;
            }
        }
    }

    public static SubLObject build_problem_counts_by_module(SubLObject build_problem_specs) {
        if (build_problem_specs == UNPROVIDED) {
            build_problem_specs = all_build_problems(UNPROVIDED);
        }
        final SubLObject table = dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER);
        SubLObject cdolist_list_var = build_problem_specs;
        SubLObject build_problem_spec = NIL;
        build_problem_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = build_problem_spec;
            SubLObject problem_class = NIL;
            SubLObject problems = NIL;
            destructuring_bind_must_consp(current, datum, $list84);
            problem_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list84);
            problems = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject problem = problems.first();
                final SubLObject module = list_utilities.tree_find_if(symbol_function(STRINGP), problem, UNPROVIDED);
                if (module.isString()) {
                    dictionary_utilities.dictionary_increment(table, module, length(problems));
                }
            } else {
                cdestructuring_bind_error(datum, $list84);
            }
            cdolist_list_var = cdolist_list_var.rest();
            build_problem_spec = cdolist_list_var.first();
        } 
        SubLObject problem_counts = dictionary_utilities.dictionary_to_alist(table);
        problem_counts = Sort.sort(problem_counts, symbol_function($sym87$_), symbol_function(CDR));
        return problem_counts;
    }

    /**
     * Return the list of all other methods that are always called by all the callers of METHOD.
     */
    @LispMethod(comment = "Return the list of all other methods that are always called by all the callers of METHOD.")
    public static final SubLObject td_method_co_called_methods_alt(SubLObject called_method) {
        {
            SubLObject all_co_called_methods = $UNINITIALIZED;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(called_method);
            SubLObject calling_method = NIL;
            for (calling_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , calling_method = cdolist_list_var.first()) {
                {
                    SubLObject co_called_methods = com.cyc.cycjava.cycl.translator_utilities.td_methods_called_by_method(calling_method);
                    if ($UNINITIALIZED == all_co_called_methods) {
                        all_co_called_methods = copy_list(co_called_methods);
                    } else {
                        all_co_called_methods = nintersection(all_co_called_methods, copy_list(co_called_methods), symbol_function(EQ), UNPROVIDED);
                    }
                }
            }
            if ($UNINITIALIZED != all_co_called_methods) {
                return delete(called_method, all_co_called_methods, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the list of all other methods that are always called by all the callers of METHOD.")
    public static SubLObject td_method_co_called_methods(final SubLObject called_method) {
        SubLObject all_co_called_methods = $UNINITIALIZED;
        SubLObject cdolist_list_var = td_methods_calling_method(called_method);
        SubLObject calling_method = NIL;
        calling_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject co_called_methods = td_methods_called_by_method(calling_method);
            if ($UNINITIALIZED == all_co_called_methods) {
                all_co_called_methods = copy_list(co_called_methods);
            } else {
                all_co_called_methods = nintersection(all_co_called_methods, copy_list(co_called_methods), symbol_function(EQ), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            calling_method = cdolist_list_var.first();
        } 
        if ($UNINITIALIZED != all_co_called_methods) {
            return delete(called_method, all_co_called_methods, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }/**
     * Return the list of all other methods that are always called by all the callers of METHOD.
     */


    /**
     * Return the list of all globals that are always called by all the callers of METHOD.
     */
    @LispMethod(comment = "Return the list of all globals that are always called by all the callers of METHOD.")
    public static final SubLObject td_method_co_called_globals_alt(SubLObject called_method) {
        {
            SubLObject all_co_called_globals = $UNINITIALIZED;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(called_method);
            SubLObject calling_method = NIL;
            for (calling_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , calling_method = cdolist_list_var.first()) {
                {
                    SubLObject co_called_globals = com.cyc.cycjava.cycl.translator_utilities.td_globals_called_by_method(calling_method);
                    if ($UNINITIALIZED == all_co_called_globals) {
                        all_co_called_globals = copy_list(co_called_globals);
                    } else {
                        all_co_called_globals = nintersection(all_co_called_globals, copy_list(co_called_globals), symbol_function(EQ), UNPROVIDED);
                    }
                }
            }
            if ($UNINITIALIZED != all_co_called_globals) {
                return all_co_called_globals;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the list of all globals that are always called by all the callers of METHOD.")
    public static SubLObject td_method_co_called_globals(final SubLObject called_method) {
        SubLObject all_co_called_globals = $UNINITIALIZED;
        SubLObject cdolist_list_var = td_methods_calling_method(called_method);
        SubLObject calling_method = NIL;
        calling_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject co_called_globals = td_globals_called_by_method(calling_method);
            if ($UNINITIALIZED == all_co_called_globals) {
                all_co_called_globals = copy_list(co_called_globals);
            } else {
                all_co_called_globals = nintersection(all_co_called_globals, copy_list(co_called_globals), symbol_function(EQ), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            calling_method = cdolist_list_var.first();
        } 
        if ($UNINITIALIZED != all_co_called_globals) {
            return all_co_called_globals;
        }
        return NIL;
    }/**
     * Return the list of all globals that are always called by all the callers of METHOD.
     */


    /**
     * Return two values, the methods and globals that expansions of MACRO end up calling.
     */
    @LispMethod(comment = "Return two values, the methods and globals that expansions of MACRO end up calling.")
    public static final SubLObject td_macro_expansion_calls_alt(SubLObject macro) {
        return values(com.cyc.cycjava.cycl.translator_utilities.td_method_co_called_methods(macro), com.cyc.cycjava.cycl.translator_utilities.td_method_co_called_globals(macro));
    }

    @LispMethod(comment = "Return two values, the methods and globals that expansions of MACRO end up calling.")
    public static SubLObject td_macro_expansion_calls(final SubLObject macro) {
        return values(td_method_co_called_methods(macro), td_method_co_called_globals(macro));
    }/**
     * Return two values, the methods and globals that expansions of MACRO end up calling.
     */


    public static final SubLObject td_possible_orphan_methods_from_module_alt(SubLObject defined_module) {
        {
            SubLObject unused_methods = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.translator_utilities.td_methods_defined_by_module(defined_module);
            SubLObject defined_method = NIL;
            for (defined_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defined_method = cdolist_list_var.first()) {
                if (!((((((NIL != html_macros.html_handler_functionP(defined_method)) || (NIL != funcall_helper_functionP(defined_method))) || (NIL != external_function_p(defined_method))) || (NIL != com.cyc.cycjava.cycl.translator_utilities.td_methods_calling_method(defined_method))) || (NIL != string_utilities.starts_with(symbol_name(defined_method), $$$CLEAR))) || (NIL != string_utilities.starts_with(symbol_name(defined_method), $$$REMOVE)))) {
                    unused_methods = cons(defined_method, unused_methods);
                }
            }
            return unused_methods;
        }
    }

    public static SubLObject td_possible_orphan_methods_from_module(final SubLObject defined_module) {
        SubLObject unused_methods = NIL;
        SubLObject cdolist_list_var = td_methods_defined_by_module(defined_module);
        SubLObject defined_method = NIL;
        defined_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((((NIL == html_macros.html_handler_functionP(defined_method)) && (NIL == funcall_helper_functionP(defined_method))) && (NIL == external_function_p(defined_method))) && (NIL == td_methods_calling_method(defined_method))) && (NIL == string_utilities.starts_with(symbol_name(defined_method), $$$CLEAR))) && (NIL == string_utilities.starts_with(symbol_name(defined_method), $$$REMOVE))) {
                unused_methods = cons(defined_method, unused_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defined_method = cdolist_list_var.first();
        } 
        return unused_methods;
    }

    public static final SubLObject declare_translator_utilities_file_alt() {
        declareFunction("td_module_p", "TD-MODULE-P", 1, 0, false);
        declareFunction("td_current_translation", "TD-CURRENT-TRANSLATION", 0, 0, false);
        declareFunction("td_translation_modules", "TD-TRANSLATION-MODULES", 0, 0, false);
        declareFunction("td_translation_modules_memoized_internal", "TD-TRANSLATION-MODULES-MEMOIZED-INTERNAL", 0, 0, false);
        declareFunction("td_translation_modules_memoized", "TD-TRANSLATION-MODULES-MEMOIZED", 0, 0, false);
        declareFunction("td_module_earlier", "TD-MODULE-EARLIER", 2, 0, false);
        declareFunction("td_module_translation_position_internal", "TD-MODULE-TRANSLATION-POSITION-INTERNAL", 1, 0, false);
        declareFunction("td_module_translation_position", "TD-MODULE-TRANSLATION-POSITION", 1, 0, false);
        declareFunction("td_module_later", "TD-MODULE-LATER", 2, 0, false);
        declareFunction("td_sort_modules_by_load_order", "TD-SORT-MODULES-BY-LOAD-ORDER", 1, 0, false);
        declareFunction("td_module_earlier_memoized", "TD-MODULE-EARLIER-MEMOIZED", 2, 0, false);
        declareFunction("td_module_later_memoized", "TD-MODULE-LATER-MEMOIZED", 2, 0, false);
        declareFunction("td_module_features", "TD-MODULE-FEATURES", 1, 0, false);
        declareFunction("td_translation_features", "TD-TRANSLATION-FEATURES", 0, 0, false);
        declareFunction("td_module_pathname", "TD-MODULE-PATHNAME", 1, 0, false);
        declareFunction("td_module_cvsweb_url", "TD-MODULE-CVSWEB-URL", 1, 0, false);
        declareFunction("td_predefined_method_p", "TD-PREDEFINED-METHOD-P", 1, 0, false);
        declareFunction("td_predefined_global_p", "TD-PREDEFINED-GLOBAL-P", 1, 0, false);
        declareFunction("td_method_macro_p", "TD-METHOD-MACRO-P", 1, 0, false);
        declareFunction("td_method_defining_module", "TD-METHOD-DEFINING-MODULE", 1, 0, false);
        declareFunction("td_method_definition_position", "TD-METHOD-DEFINITION-POSITION", 1, 0, false);
        declareFunction("td_method_has_multiple_definitionsP", "TD-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("td_method_definition_positions", "TD-METHOD-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("td_method_formal_arglist", "TD-METHOD-FORMAL-ARGLIST", 1, 0, false);
        declareFunction("td_global_binding_type", "TD-GLOBAL-BINDING-TYPE", 1, 0, false);
        declareFunction("td_global_defining_module", "TD-GLOBAL-DEFINING-MODULE", 1, 0, false);
        declareFunction("td_global_definition_position", "TD-GLOBAL-DEFINITION-POSITION", 1, 0, false);
        declareFunction("td_global_has_multiple_definitionsP", "TD-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("td_global_definition_positions", "TD-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("td_methods_defined_by_module", "TD-METHODS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("td_globals_defined_by_module", "TD-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("td_globals_called_by_method", "TD-GLOBALS-CALLED-BY-METHOD", 1, 0, false);
        declareFunction("td_globals_rebound_by_method", "TD-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
        declareFunction("td_methods_called_by_method", "TD-METHODS-CALLED-BY-METHOD", 1, 0, false);
        declareFunction("td_method_called_by_methodP", "TD-METHOD-CALLED-BY-METHOD?", 2, 0, false);
        declareFunction("td_modules_referenced_by_method", "TD-MODULES-REFERENCED-BY-METHOD", 1, 0, false);
        declareFunction("td_globals_called_by_global", "TD-GLOBALS-CALLED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_methods_called_by_global", "TD-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_method_called_by_globalP", "TD-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
        declareFunction("td_modules_referenced_by_global", "TD-MODULES-REFERENCED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_globals_called_by_module", "TD-GLOBALS-CALLED-BY-MODULE", 1, 0, false);
        declareFunction("td_methods_called_by_module", "TD-METHODS-CALLED-BY-MODULE", 1, 0, false);
        declareFunction("td_method_called_by_moduleP", "TD-METHOD-CALLED-BY-MODULE?", 2, 0, false);
        declareFunction("td_module_positions_calling_global", "TD-MODULE-POSITIONS-CALLING-GLOBAL", 2, 0, false);
        declareFunction("td_module_positions_calling_method", "TD-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
        declareFunction("td_method_unused_p", "TD-METHOD-UNUSED-P", 1, 0, false);
        declareFunction("td_globals_calling_method", "TD-GLOBALS-CALLING-METHOD", 1, 0, false);
        declareFunction("td_methods_calling_method", "TD-METHODS-CALLING-METHOD", 1, 0, false);
        declareFunction("td_modules_calling_method", "TD-MODULES-CALLING-METHOD", 1, 0, false);
        declareFunction("td_modules_referencing_method", "TD-MODULES-REFERENCING-METHOD", 1, 0, false);
        declareFunction("td_global_unused_p", "TD-GLOBAL-UNUSED-P", 1, 0, false);
        declareFunction("td_globals_calling_global", "TD-GLOBALS-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_methods_calling_global", "TD-METHODS-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_modules_calling_global", "TD-MODULES-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_modules_referencing_global", "TD-MODULES-REFERENCING-GLOBAL", 1, 0, false);
        declareFunction("td_method_potentially_private_p", "TD-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("td_global_potentially_private_p", "TD-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("td_modules_referencing_module", "TD-MODULES-REFERENCING-MODULE", 1, 0, false);
        declareFunction("td_modules_referenced_by_module", "TD-MODULES-REFERENCED-BY-MODULE", 1, 0, false);
        declareFunction("td_justify_module_referencing_module", "TD-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
        declareFunction("td_modules_implied_by_methods", "TD-MODULES-IMPLIED-BY-METHODS", 1, 1, false);
        declareFunction("td_modules_implied_by_globals", "TD-MODULES-IMPLIED-BY-GLOBALS", 1, 1, false);
        declareFunction("td_modules_affected_by_arglist_change", "TD-MODULES-AFFECTED-BY-ARGLIST-CHANGE", 1, 0, false);
        declareFunction("td_modules_cluster_containing_module", "TD-MODULES-CLUSTER-CONTAINING-MODULE", 1, 1, false);
        declareFunction("td_modules_properly_dependent_on_modules", "TD-MODULES-PROPERLY-DEPENDENT-ON-MODULES", 1, 1, false);
        declareFunction("td_modules_dependent_on_modules", "TD-MODULES-DEPENDENT-ON-MODULES", 1, 1, false);
        declareFunction("td_modules_dependent_on_module", "TD-MODULES-DEPENDENT-ON-MODULE", 1, 1, false);
        declareFunction("td_modules_dependent_on_module_methods", "TD-MODULES-DEPENDENT-ON-MODULE-METHODS", 1, 1, false);
        declareFunction("td_modules_dependent_on_module_globals", "TD-MODULES-DEPENDENT-ON-MODULE-GLOBALS", 1, 1, false);
        declareFunction("td_explain_how_module_depends_on_module", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULE", 2, 0, false);
        declareFunction("td_explain_how_module_depends_on_modules", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULES", 2, 0, false);
        declareFunction("td_method_calls_transitively", "TD-METHOD-CALLS-TRANSITIVELY", 1, 0, false);
        declareFunction("td_global_calls_transitively", "TD-GLOBAL-CALLS-TRANSITIVELY", 1, 0, false);
        declareFunction("td_note_method_called_transitively", "TD-NOTE-METHOD-CALLED-TRANSITIVELY", 1, 0, false);
        declareFunction("td_note_global_called_transitively", "TD-NOTE-GLOBAL-CALLED-TRANSITIVELY", 1, 0, false);
        declareFunction("td_method_references_modules_transitively", "TD-METHOD-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module_memoized_internal", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module_memoized", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        declareFunction("td_justify_method_latest_transitively_referenced_module", "TD-JUSTIFY-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        declareFunction("td_justify_method_calls_transitively", "TD-JUSTIFY-METHOD-CALLS-TRANSITIVELY", 2, 0, false);
        declareFunction("td_global_references_modules_transitively", "TD-GLOBAL-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module_memoized_internal", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module_memoized", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        declareFunction("td_justify_global_latest_transitively_referenced_module", "TD-JUSTIFY-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        declareFunction("incongruent_features", "INCONGRUENT-FEATURES", 2, 0, false);
        declareFunction("feature_expression_transform", "FEATURE-EXPRESSION-TRANSFORM", 1, 0, false);
        declareFunction("non_feature_symbol_p", "NON-FEATURE-SYMBOL-P", 1, 0, false);
        declareFunction("transform_non_feature_symbol", "TRANSFORM-NON-FEATURE-SYMBOL", 1, 0, false);
        declareFunction("all_module_level_feature_problems", "ALL-MODULE-LEVEL-FEATURE-PROBLEMS", 0, 1, false);
        declareFunction("module_level_feature_problems", "MODULE-LEVEL-FEATURE-PROBLEMS", 1, 0, false);
        declareFunction("potential_module_level_feature_incongruence_internal", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE-INTERNAL", 2, 0, false);
        declareFunction("potential_module_level_feature_incongruence", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE", 2, 0, false);
        declareFunction("show_feature_problems", "SHOW-FEATURE-PROBLEMS", 0, 2, false);
        declareFunction("show_one_feature_problem", "SHOW-ONE-FEATURE-PROBLEM", 1, 1, false);
        declareFunction("show_one_feature_assumption", "SHOW-ONE-FEATURE-ASSUMPTION", 2, 0, false);
        declareFunction("feature_explanation", "FEATURE-EXPLANATION", 1, 0, false);
        declareFunction("all_privacy_violations", "ALL-PRIVACY-VIOLATIONS", 0, 1, false);
        declareFunction("module_privacy_violations", "MODULE-PRIVACY-VIOLATIONS", 1, 0, false);
        declareFunction("show_privacy_violations", "SHOW-PRIVACY-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_privacy_violation", "SHOW-ONE-PRIVACY-VIOLATION", 1, 1, false);
        declareFunction("all_early_rebinding_violations", "ALL-EARLY-REBINDING-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_rebinding_violations", "MODULE-EARLY-REBINDING-VIOLATIONS", 1, 0, false);
        declareFunction("show_early_rebinding_violations", "SHOW-EARLY-REBINDING-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_rebinding_violation", "SHOW-ONE-EARLY-REBINDING-VIOLATION", 1, 1, false);
        declareFunction("all_early_reference_violations", "ALL-EARLY-REFERENCE-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_reference_violations", "MODULE-EARLY-REFERENCE-VIOLATIONS", 1, 0, false);
        declareFunction("td_early_macro_use_p", "TD-EARLY-MACRO-USE-P", 5, 0, false);
        declareFunction("td_early_evaluation_reference_p", "TD-EARLY-EVALUATION-REFERENCE-P", 6, 0, false);
        declareFunction("td_early_global_binding_p", "TD-EARLY-GLOBAL-BINDING-P", 3, 0, false);
        declareFunction("show_early_reference_violations", "SHOW-EARLY-REFERENCE-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_reference_violation", "SHOW-ONE-EARLY-REFERENCE-VIOLATION", 1, 1, false);
        declareFunction("all_early_macro_use_violations", "ALL-EARLY-MACRO-USE-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_macro_use_violations", "MODULE-EARLY-MACRO-USE-VIOLATIONS", 1, 0, false);
        declareFunction("show_early_macro_use_violations", "SHOW-EARLY-MACRO-USE-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_macro_use_violation", "SHOW-ONE-EARLY-MACRO-USE-VIOLATION", 1, 1, false);
        declareFunction("all_undefined_references", "ALL-UNDEFINED-REFERENCES", 0, 1, false);
        declareFunction("module_undefined_references", "MODULE-UNDEFINED-REFERENCES", 1, 0, false);
        declareFunction("show_undefined_references", "SHOW-UNDEFINED-REFERENCES", 0, 2, false);
        declareFunction("show_one_undefined_reference", "SHOW-ONE-UNDEFINED-REFERENCE", 1, 1, false);
        declareFunction("all_multiple_definitions", "ALL-MULTIPLE-DEFINITIONS", 0, 1, false);
        declareFunction("module_multiple_definitions", "MODULE-MULTIPLE-DEFINITIONS", 1, 0, false);
        declareFunction("show_multiple_definitions", "SHOW-MULTIPLE-DEFINITIONS", 0, 2, false);
        declareFunction("show_one_multiple_definition", "SHOW-ONE-MULTIPLE-DEFINITION", 1, 1, false);
        declareFunction("all_early_constant_references", "ALL-EARLY-CONSTANT-REFERENCES", 0, 1, false);
        declareFunction("module_early_constant_references", "MODULE-EARLY-CONSTANT-REFERENCES", 1, 0, false);
        declareFunction("show_early_constant_references", "SHOW-EARLY-CONSTANT-REFERENCES", 0, 2, false);
        declareFunction("show_one_early_constant_reference", "SHOW-ONE-EARLY-CONSTANT-REFERENCE", 1, 1, false);
        declareFunction("show_api_macros_with_non_api_expansions", "SHOW-API-MACROS-WITH-NON-API-EXPANSIONS", 0, 1, false);
        declareFunction("show_one_api_macro_visibility_problem", "SHOW-ONE-API-MACRO-VISIBILITY-PROBLEM", 1, 1, false);
        declareFunction("non_api_expansions_for_api_macro", "NON-API-EXPANSIONS-FOR-API-MACRO", 1, 0, false);
        declareFunction("all_build_problems", "ALL-BUILD-PROBLEMS", 0, 1, false);
        declareFunction("module_build_problems", "MODULE-BUILD-PROBLEMS", 1, 0, false);
        declareFunction("show_build_problems", "SHOW-BUILD-PROBLEMS", 0, 2, false);
        declareFunction("show_one_build_problem", "SHOW-ONE-BUILD-PROBLEM", 1, 1, false);
        declareFunction("count_build_problems", "COUNT-BUILD-PROBLEMS", 0, 1, false);
        declareFunction("build_problem_counts_by_module", "BUILD-PROBLEM-COUNTS-BY-MODULE", 0, 1, false);
        declareFunction("td_method_co_called_methods", "TD-METHOD-CO-CALLED-METHODS", 1, 0, false);
        declareFunction("td_method_co_called_globals", "TD-METHOD-CO-CALLED-GLOBALS", 1, 0, false);
        declareFunction("td_macro_expansion_calls", "TD-MACRO-EXPANSION-CALLS", 1, 0, false);
        declareFunction("td_possible_orphan_methods_from_module", "TD-POSSIBLE-ORPHAN-METHODS-FROM-MODULE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_translator_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("td_module_p", "TD-MODULE-P", 1, 0, false);
            declareFunction("td_current_translation", "TD-CURRENT-TRANSLATION", 0, 0, false);
            declareFunction("td_translation_modules", "TD-TRANSLATION-MODULES", 0, 0, false);
            declareFunction("td_translation_modules_memoized_internal", "TD-TRANSLATION-MODULES-MEMOIZED-INTERNAL", 0, 0, false);
            declareFunction("td_translation_modules_memoized", "TD-TRANSLATION-MODULES-MEMOIZED", 0, 0, false);
            declareFunction("td_module_earlier", "TD-MODULE-EARLIER", 2, 0, false);
            declareFunction("td_module_translation_position_internal", "TD-MODULE-TRANSLATION-POSITION-INTERNAL", 1, 0, false);
            declareFunction("td_module_translation_position", "TD-MODULE-TRANSLATION-POSITION", 1, 0, false);
            declareFunction("td_module_later", "TD-MODULE-LATER", 2, 0, false);
            declareFunction("td_sort_modules_by_load_order", "TD-SORT-MODULES-BY-LOAD-ORDER", 1, 0, false);
            declareFunction("td_module_earlier_memoized", "TD-MODULE-EARLIER-MEMOIZED", 2, 0, false);
            declareFunction("td_module_later_memoized", "TD-MODULE-LATER-MEMOIZED", 2, 0, false);
            declareFunction("td_module_features", "TD-MODULE-FEATURES", 1, 0, false);
            declareFunction("td_translation_features", "TD-TRANSLATION-FEATURES", 0, 0, false);
            declareFunction("td_module_pathname", "TD-MODULE-PATHNAME", 1, 0, false);
            declareFunction("td_predefined_method_p", "TD-PREDEFINED-METHOD-P", 1, 0, false);
            declareFunction("td_predefined_global_p", "TD-PREDEFINED-GLOBAL-P", 1, 0, false);
            declareFunction("td_method_macro_p", "TD-METHOD-MACRO-P", 1, 0, false);
            declareFunction("td_method_defining_module", "TD-METHOD-DEFINING-MODULE", 1, 0, false);
            declareFunction("td_method_definition_position", "TD-METHOD-DEFINITION-POSITION", 1, 0, false);
            declareFunction("td_method_has_multiple_definitionsP", "TD-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
            declareFunction("td_method_definition_positions", "TD-METHOD-DEFINITION-POSITIONS", 1, 0, false);
            declareFunction("td_method_formal_arglist", "TD-METHOD-FORMAL-ARGLIST", 1, 0, false);
            declareFunction("td_global_binding_type", "TD-GLOBAL-BINDING-TYPE", 1, 0, false);
            declareFunction("td_global_defining_module", "TD-GLOBAL-DEFINING-MODULE", 1, 0, false);
            declareFunction("td_global_definition_position", "TD-GLOBAL-DEFINITION-POSITION", 1, 0, false);
            declareFunction("td_global_has_multiple_definitionsP", "TD-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
            declareFunction("td_global_definition_positions", "TD-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
            declareFunction("td_methods_defined_by_module", "TD-METHODS-DEFINED-BY-MODULE", 1, 0, false);
            declareFunction("td_globals_defined_by_module", "TD-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
            declareFunction("td_globals_called_by_method", "TD-GLOBALS-CALLED-BY-METHOD", 1, 0, false);
            declareFunction("td_globals_rebound_by_method", "TD-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
            declareFunction("td_methods_called_by_method", "TD-METHODS-CALLED-BY-METHOD", 1, 0, false);
            declareFunction("td_method_called_by_methodP", "TD-METHOD-CALLED-BY-METHOD?", 2, 0, false);
            declareFunction("td_modules_referenced_by_method", "TD-MODULES-REFERENCED-BY-METHOD", 1, 0, false);
            declareFunction("td_globals_called_by_global", "TD-GLOBALS-CALLED-BY-GLOBAL", 1, 0, false);
            declareFunction("td_methods_called_by_global", "TD-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
            declareFunction("td_method_called_by_globalP", "TD-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
            declareFunction("td_modules_referenced_by_global", "TD-MODULES-REFERENCED-BY-GLOBAL", 1, 0, false);
            declareFunction("td_globals_called_by_module", "TD-GLOBALS-CALLED-BY-MODULE", 1, 0, false);
            declareFunction("td_methods_called_by_module", "TD-METHODS-CALLED-BY-MODULE", 1, 0, false);
            declareFunction("td_method_called_by_moduleP", "TD-METHOD-CALLED-BY-MODULE?", 2, 0, false);
            declareFunction("td_module_positions_calling_global", "TD-MODULE-POSITIONS-CALLING-GLOBAL", 2, 0, false);
            declareFunction("td_module_positions_calling_method", "TD-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
            declareFunction("td_method_unused_p", "TD-METHOD-UNUSED-P", 1, 0, false);
            declareFunction("td_globals_calling_method", "TD-GLOBALS-CALLING-METHOD", 1, 0, false);
            declareFunction("td_methods_calling_method", "TD-METHODS-CALLING-METHOD", 1, 0, false);
            declareFunction("td_modules_calling_method", "TD-MODULES-CALLING-METHOD", 1, 0, false);
            declareFunction("td_modules_referencing_method", "TD-MODULES-REFERENCING-METHOD", 1, 0, false);
            declareFunction("td_global_unused_p", "TD-GLOBAL-UNUSED-P", 1, 0, false);
            declareFunction("td_globals_calling_global", "TD-GLOBALS-CALLING-GLOBAL", 1, 0, false);
            declareFunction("td_methods_calling_global", "TD-METHODS-CALLING-GLOBAL", 1, 0, false);
            declareFunction("td_modules_calling_global", "TD-MODULES-CALLING-GLOBAL", 1, 0, false);
            declareFunction("td_modules_referencing_global", "TD-MODULES-REFERENCING-GLOBAL", 1, 0, false);
            declareFunction("td_method_potentially_private_p", "TD-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
            declareFunction("td_global_potentially_private_p", "TD-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
            declareFunction("td_modules_referencing_module", "TD-MODULES-REFERENCING-MODULE", 1, 0, false);
            declareFunction("td_modules_referenced_by_module", "TD-MODULES-REFERENCED-BY-MODULE", 1, 0, false);
            declareFunction("td_justify_module_referencing_module", "TD-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
            declareFunction("td_modules_implied_by_methods", "TD-MODULES-IMPLIED-BY-METHODS", 1, 1, false);
            declareFunction("td_modules_implied_by_globals", "TD-MODULES-IMPLIED-BY-GLOBALS", 1, 1, false);
            declareFunction("td_modules_affected_by_arglist_change", "TD-MODULES-AFFECTED-BY-ARGLIST-CHANGE", 1, 0, false);
            declareFunction("td_modules_cluster_containing_module", "TD-MODULES-CLUSTER-CONTAINING-MODULE", 1, 1, false);
            declareFunction("td_modules_properly_dependent_on_modules", "TD-MODULES-PROPERLY-DEPENDENT-ON-MODULES", 1, 1, false);
            declareFunction("td_modules_dependent_on_modules", "TD-MODULES-DEPENDENT-ON-MODULES", 1, 1, false);
            declareFunction("td_modules_dependent_on_module", "TD-MODULES-DEPENDENT-ON-MODULE", 1, 1, false);
            declareFunction("td_modules_dependent_on_module_methods", "TD-MODULES-DEPENDENT-ON-MODULE-METHODS", 1, 1, false);
            declareFunction("td_modules_dependent_on_module_globals", "TD-MODULES-DEPENDENT-ON-MODULE-GLOBALS", 1, 1, false);
            declareFunction("td_explain_how_module_depends_on_module", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULE", 2, 0, false);
            declareFunction("td_explain_how_module_depends_on_modules", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULES", 2, 0, false);
            declareFunction("td_method_calls_transitively", "TD-METHOD-CALLS-TRANSITIVELY", 1, 0, false);
            declareFunction("td_global_calls_transitively", "TD-GLOBAL-CALLS-TRANSITIVELY", 1, 0, false);
            declareFunction("td_note_method_called_transitively", "TD-NOTE-METHOD-CALLED-TRANSITIVELY", 1, 0, false);
            declareFunction("td_note_global_called_transitively", "TD-NOTE-GLOBAL-CALLED-TRANSITIVELY", 1, 0, false);
            declareFunction("td_method_references_modules_transitively", "TD-METHOD-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
            declareFunction("td_method_latest_transitively_referenced_module", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
            declareFunction("td_method_latest_transitively_referenced_module_memoized_internal", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
            declareFunction("td_method_latest_transitively_referenced_module_memoized", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
            declareFunction("td_justify_method_latest_transitively_referenced_module", "TD-JUSTIFY-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
            declareFunction("td_justify_method_calls_transitively", "TD-JUSTIFY-METHOD-CALLS-TRANSITIVELY", 2, 0, false);
            declareFunction("td_global_references_modules_transitively", "TD-GLOBAL-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
            declareFunction("td_global_latest_transitively_referenced_module", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
            declareFunction("td_global_latest_transitively_referenced_module_memoized_internal", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
            declareFunction("td_global_latest_transitively_referenced_module_memoized", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
            declareFunction("td_justify_global_latest_transitively_referenced_module", "TD-JUSTIFY-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
            declareFunction("incongruent_features", "INCONGRUENT-FEATURES", 2, 0, false);
            declareFunction("feature_expression_transform", "FEATURE-EXPRESSION-TRANSFORM", 1, 0, false);
            declareFunction("non_feature_symbol_p", "NON-FEATURE-SYMBOL-P", 1, 0, false);
            declareFunction("transform_non_feature_symbol", "TRANSFORM-NON-FEATURE-SYMBOL", 1, 0, false);
            declareFunction("all_module_level_feature_problems", "ALL-MODULE-LEVEL-FEATURE-PROBLEMS", 0, 1, false);
            declareFunction("module_level_feature_problems", "MODULE-LEVEL-FEATURE-PROBLEMS", 1, 0, false);
            declareFunction("potential_module_level_feature_incongruence_internal", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE-INTERNAL", 2, 0, false);
            declareFunction("potential_module_level_feature_incongruence", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE", 2, 0, false);
            declareFunction("show_feature_problems", "SHOW-FEATURE-PROBLEMS", 0, 2, false);
            declareFunction("show_one_feature_problem", "SHOW-ONE-FEATURE-PROBLEM", 1, 1, false);
            declareFunction("show_one_feature_assumption", "SHOW-ONE-FEATURE-ASSUMPTION", 2, 0, false);
            declareFunction("feature_explanation", "FEATURE-EXPLANATION", 1, 0, false);
            declareFunction("all_privacy_violations", "ALL-PRIVACY-VIOLATIONS", 0, 1, false);
            declareFunction("module_privacy_violations", "MODULE-PRIVACY-VIOLATIONS", 1, 0, false);
            declareFunction("show_privacy_violations", "SHOW-PRIVACY-VIOLATIONS", 0, 2, false);
            declareFunction("show_one_privacy_violation", "SHOW-ONE-PRIVACY-VIOLATION", 1, 1, false);
            declareFunction("all_early_rebinding_violations", "ALL-EARLY-REBINDING-VIOLATIONS", 0, 1, false);
            declareFunction("module_early_rebinding_violations", "MODULE-EARLY-REBINDING-VIOLATIONS", 1, 0, false);
            declareFunction("show_early_rebinding_violations", "SHOW-EARLY-REBINDING-VIOLATIONS", 0, 2, false);
            declareFunction("show_one_early_rebinding_violation", "SHOW-ONE-EARLY-REBINDING-VIOLATION", 1, 1, false);
            declareFunction("all_early_reference_violations", "ALL-EARLY-REFERENCE-VIOLATIONS", 0, 1, false);
            declareFunction("module_early_reference_violations", "MODULE-EARLY-REFERENCE-VIOLATIONS", 1, 0, false);
            declareFunction("td_early_macro_use_p", "TD-EARLY-MACRO-USE-P", 5, 0, false);
            declareFunction("td_early_evaluation_reference_p", "TD-EARLY-EVALUATION-REFERENCE-P", 6, 0, false);
            declareFunction("td_early_global_binding_p", "TD-EARLY-GLOBAL-BINDING-P", 3, 0, false);
            declareFunction("show_early_reference_violations", "SHOW-EARLY-REFERENCE-VIOLATIONS", 0, 2, false);
            declareFunction("show_one_early_reference_violation", "SHOW-ONE-EARLY-REFERENCE-VIOLATION", 1, 1, false);
            declareFunction("all_early_macro_use_violations", "ALL-EARLY-MACRO-USE-VIOLATIONS", 0, 1, false);
            declareFunction("module_early_macro_use_violations", "MODULE-EARLY-MACRO-USE-VIOLATIONS", 1, 0, false);
            declareFunction("show_early_macro_use_violations", "SHOW-EARLY-MACRO-USE-VIOLATIONS", 0, 2, false);
            declareFunction("show_one_early_macro_use_violation", "SHOW-ONE-EARLY-MACRO-USE-VIOLATION", 1, 1, false);
            declareFunction("all_undefined_references", "ALL-UNDEFINED-REFERENCES", 0, 1, false);
            declareFunction("module_undefined_references", "MODULE-UNDEFINED-REFERENCES", 1, 0, false);
            declareFunction("show_undefined_references", "SHOW-UNDEFINED-REFERENCES", 0, 2, false);
            declareFunction("show_one_undefined_reference", "SHOW-ONE-UNDEFINED-REFERENCE", 1, 1, false);
            declareFunction("all_multiple_definitions", "ALL-MULTIPLE-DEFINITIONS", 0, 1, false);
            declareFunction("module_multiple_definitions", "MODULE-MULTIPLE-DEFINITIONS", 1, 0, false);
            declareFunction("show_multiple_definitions", "SHOW-MULTIPLE-DEFINITIONS", 0, 2, false);
            declareFunction("show_one_multiple_definition", "SHOW-ONE-MULTIPLE-DEFINITION", 1, 1, false);
            declareFunction("all_early_constant_references", "ALL-EARLY-CONSTANT-REFERENCES", 0, 1, false);
            declareFunction("module_early_constant_references", "MODULE-EARLY-CONSTANT-REFERENCES", 1, 0, false);
            declareFunction("show_early_constant_references", "SHOW-EARLY-CONSTANT-REFERENCES", 0, 2, false);
            declareFunction("show_one_early_constant_reference", "SHOW-ONE-EARLY-CONSTANT-REFERENCE", 1, 1, false);
            declareFunction("show_api_macros_with_non_api_expansions", "SHOW-API-MACROS-WITH-NON-API-EXPANSIONS", 0, 1, false);
            declareFunction("show_one_api_macro_visibility_problem", "SHOW-ONE-API-MACRO-VISIBILITY-PROBLEM", 1, 1, false);
            declareFunction("non_api_expansions_for_api_macro", "NON-API-EXPANSIONS-FOR-API-MACRO", 1, 0, false);
            declareFunction("all_build_problems", "ALL-BUILD-PROBLEMS", 0, 1, false);
            declareFunction("module_build_problems", "MODULE-BUILD-PROBLEMS", 1, 0, false);
            declareFunction("show_build_problems", "SHOW-BUILD-PROBLEMS", 0, 2, false);
            declareFunction("show_one_build_problem", "SHOW-ONE-BUILD-PROBLEM", 1, 1, false);
            declareFunction("count_build_problems", "COUNT-BUILD-PROBLEMS", 0, 1, false);
            declareFunction("build_problem_counts_by_module", "BUILD-PROBLEM-COUNTS-BY-MODULE", 0, 1, false);
            declareFunction("td_method_co_called_methods", "TD-METHOD-CO-CALLED-METHODS", 1, 0, false);
            declareFunction("td_method_co_called_globals", "TD-METHOD-CO-CALLED-GLOBALS", 1, 0, false);
            declareFunction("td_macro_expansion_calls", "TD-MACRO-EXPANSION-CALLS", 1, 0, false);
            declareFunction("td_possible_orphan_methods_from_module", "TD-POSSIBLE-ORPHAN-METHODS-FROM-MODULE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("td_module_cvsweb_url", "TD-MODULE-CVSWEB-URL", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_translator_utilities_file_Previous() {
        declareFunction("td_module_p", "TD-MODULE-P", 1, 0, false);
        declareFunction("td_current_translation", "TD-CURRENT-TRANSLATION", 0, 0, false);
        declareFunction("td_translation_modules", "TD-TRANSLATION-MODULES", 0, 0, false);
        declareFunction("td_translation_modules_memoized_internal", "TD-TRANSLATION-MODULES-MEMOIZED-INTERNAL", 0, 0, false);
        declareFunction("td_translation_modules_memoized", "TD-TRANSLATION-MODULES-MEMOIZED", 0, 0, false);
        declareFunction("td_module_earlier", "TD-MODULE-EARLIER", 2, 0, false);
        declareFunction("td_module_translation_position_internal", "TD-MODULE-TRANSLATION-POSITION-INTERNAL", 1, 0, false);
        declareFunction("td_module_translation_position", "TD-MODULE-TRANSLATION-POSITION", 1, 0, false);
        declareFunction("td_module_later", "TD-MODULE-LATER", 2, 0, false);
        declareFunction("td_sort_modules_by_load_order", "TD-SORT-MODULES-BY-LOAD-ORDER", 1, 0, false);
        declareFunction("td_module_earlier_memoized", "TD-MODULE-EARLIER-MEMOIZED", 2, 0, false);
        declareFunction("td_module_later_memoized", "TD-MODULE-LATER-MEMOIZED", 2, 0, false);
        declareFunction("td_module_features", "TD-MODULE-FEATURES", 1, 0, false);
        declareFunction("td_translation_features", "TD-TRANSLATION-FEATURES", 0, 0, false);
        declareFunction("td_module_pathname", "TD-MODULE-PATHNAME", 1, 0, false);
        declareFunction("td_predefined_method_p", "TD-PREDEFINED-METHOD-P", 1, 0, false);
        declareFunction("td_predefined_global_p", "TD-PREDEFINED-GLOBAL-P", 1, 0, false);
        declareFunction("td_method_macro_p", "TD-METHOD-MACRO-P", 1, 0, false);
        declareFunction("td_method_defining_module", "TD-METHOD-DEFINING-MODULE", 1, 0, false);
        declareFunction("td_method_definition_position", "TD-METHOD-DEFINITION-POSITION", 1, 0, false);
        declareFunction("td_method_has_multiple_definitionsP", "TD-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("td_method_definition_positions", "TD-METHOD-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("td_method_formal_arglist", "TD-METHOD-FORMAL-ARGLIST", 1, 0, false);
        declareFunction("td_global_binding_type", "TD-GLOBAL-BINDING-TYPE", 1, 0, false);
        declareFunction("td_global_defining_module", "TD-GLOBAL-DEFINING-MODULE", 1, 0, false);
        declareFunction("td_global_definition_position", "TD-GLOBAL-DEFINITION-POSITION", 1, 0, false);
        declareFunction("td_global_has_multiple_definitionsP", "TD-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("td_global_definition_positions", "TD-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("td_methods_defined_by_module", "TD-METHODS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("td_globals_defined_by_module", "TD-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("td_globals_called_by_method", "TD-GLOBALS-CALLED-BY-METHOD", 1, 0, false);
        declareFunction("td_globals_rebound_by_method", "TD-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
        declareFunction("td_methods_called_by_method", "TD-METHODS-CALLED-BY-METHOD", 1, 0, false);
        declareFunction("td_method_called_by_methodP", "TD-METHOD-CALLED-BY-METHOD?", 2, 0, false);
        declareFunction("td_modules_referenced_by_method", "TD-MODULES-REFERENCED-BY-METHOD", 1, 0, false);
        declareFunction("td_globals_called_by_global", "TD-GLOBALS-CALLED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_methods_called_by_global", "TD-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_method_called_by_globalP", "TD-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
        declareFunction("td_modules_referenced_by_global", "TD-MODULES-REFERENCED-BY-GLOBAL", 1, 0, false);
        declareFunction("td_globals_called_by_module", "TD-GLOBALS-CALLED-BY-MODULE", 1, 0, false);
        declareFunction("td_methods_called_by_module", "TD-METHODS-CALLED-BY-MODULE", 1, 0, false);
        declareFunction("td_method_called_by_moduleP", "TD-METHOD-CALLED-BY-MODULE?", 2, 0, false);
        declareFunction("td_module_positions_calling_global", "TD-MODULE-POSITIONS-CALLING-GLOBAL", 2, 0, false);
        declareFunction("td_module_positions_calling_method", "TD-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
        declareFunction("td_method_unused_p", "TD-METHOD-UNUSED-P", 1, 0, false);
        declareFunction("td_globals_calling_method", "TD-GLOBALS-CALLING-METHOD", 1, 0, false);
        declareFunction("td_methods_calling_method", "TD-METHODS-CALLING-METHOD", 1, 0, false);
        declareFunction("td_modules_calling_method", "TD-MODULES-CALLING-METHOD", 1, 0, false);
        declareFunction("td_modules_referencing_method", "TD-MODULES-REFERENCING-METHOD", 1, 0, false);
        declareFunction("td_global_unused_p", "TD-GLOBAL-UNUSED-P", 1, 0, false);
        declareFunction("td_globals_calling_global", "TD-GLOBALS-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_methods_calling_global", "TD-METHODS-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_modules_calling_global", "TD-MODULES-CALLING-GLOBAL", 1, 0, false);
        declareFunction("td_modules_referencing_global", "TD-MODULES-REFERENCING-GLOBAL", 1, 0, false);
        declareFunction("td_method_potentially_private_p", "TD-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("td_global_potentially_private_p", "TD-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("td_modules_referencing_module", "TD-MODULES-REFERENCING-MODULE", 1, 0, false);
        declareFunction("td_modules_referenced_by_module", "TD-MODULES-REFERENCED-BY-MODULE", 1, 0, false);
        declareFunction("td_justify_module_referencing_module", "TD-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
        declareFunction("td_modules_implied_by_methods", "TD-MODULES-IMPLIED-BY-METHODS", 1, 1, false);
        declareFunction("td_modules_implied_by_globals", "TD-MODULES-IMPLIED-BY-GLOBALS", 1, 1, false);
        declareFunction("td_modules_affected_by_arglist_change", "TD-MODULES-AFFECTED-BY-ARGLIST-CHANGE", 1, 0, false);
        declareFunction("td_modules_cluster_containing_module", "TD-MODULES-CLUSTER-CONTAINING-MODULE", 1, 1, false);
        declareFunction("td_modules_properly_dependent_on_modules", "TD-MODULES-PROPERLY-DEPENDENT-ON-MODULES", 1, 1, false);
        declareFunction("td_modules_dependent_on_modules", "TD-MODULES-DEPENDENT-ON-MODULES", 1, 1, false);
        declareFunction("td_modules_dependent_on_module", "TD-MODULES-DEPENDENT-ON-MODULE", 1, 1, false);
        declareFunction("td_modules_dependent_on_module_methods", "TD-MODULES-DEPENDENT-ON-MODULE-METHODS", 1, 1, false);
        declareFunction("td_modules_dependent_on_module_globals", "TD-MODULES-DEPENDENT-ON-MODULE-GLOBALS", 1, 1, false);
        declareFunction("td_explain_how_module_depends_on_module", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULE", 2, 0, false);
        declareFunction("td_explain_how_module_depends_on_modules", "TD-EXPLAIN-HOW-MODULE-DEPENDS-ON-MODULES", 2, 0, false);
        declareFunction("td_method_calls_transitively", "TD-METHOD-CALLS-TRANSITIVELY", 1, 0, false);
        declareFunction("td_global_calls_transitively", "TD-GLOBAL-CALLS-TRANSITIVELY", 1, 0, false);
        declareFunction("td_note_method_called_transitively", "TD-NOTE-METHOD-CALLED-TRANSITIVELY", 1, 0, false);
        declareFunction("td_note_global_called_transitively", "TD-NOTE-GLOBAL-CALLED-TRANSITIVELY", 1, 0, false);
        declareFunction("td_method_references_modules_transitively", "TD-METHOD-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module_memoized_internal", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("td_method_latest_transitively_referenced_module_memoized", "TD-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        declareFunction("td_justify_method_latest_transitively_referenced_module", "TD-JUSTIFY-METHOD-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        declareFunction("td_justify_method_calls_transitively", "TD-JUSTIFY-METHOD-CALLS-TRANSITIVELY", 2, 0, false);
        declareFunction("td_global_references_modules_transitively", "TD-GLOBAL-REFERENCES-MODULES-TRANSITIVELY", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module_memoized_internal", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("td_global_latest_transitively_referenced_module_memoized", "TD-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE-MEMOIZED", 1, 0, false);
        declareFunction("td_justify_global_latest_transitively_referenced_module", "TD-JUSTIFY-GLOBAL-LATEST-TRANSITIVELY-REFERENCED-MODULE", 2, 0, false);
        declareFunction("incongruent_features", "INCONGRUENT-FEATURES", 2, 0, false);
        declareFunction("feature_expression_transform", "FEATURE-EXPRESSION-TRANSFORM", 1, 0, false);
        declareFunction("non_feature_symbol_p", "NON-FEATURE-SYMBOL-P", 1, 0, false);
        declareFunction("transform_non_feature_symbol", "TRANSFORM-NON-FEATURE-SYMBOL", 1, 0, false);
        declareFunction("all_module_level_feature_problems", "ALL-MODULE-LEVEL-FEATURE-PROBLEMS", 0, 1, false);
        declareFunction("module_level_feature_problems", "MODULE-LEVEL-FEATURE-PROBLEMS", 1, 0, false);
        declareFunction("potential_module_level_feature_incongruence_internal", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE-INTERNAL", 2, 0, false);
        declareFunction("potential_module_level_feature_incongruence", "POTENTIAL-MODULE-LEVEL-FEATURE-INCONGRUENCE", 2, 0, false);
        declareFunction("show_feature_problems", "SHOW-FEATURE-PROBLEMS", 0, 2, false);
        declareFunction("show_one_feature_problem", "SHOW-ONE-FEATURE-PROBLEM", 1, 1, false);
        declareFunction("show_one_feature_assumption", "SHOW-ONE-FEATURE-ASSUMPTION", 2, 0, false);
        declareFunction("feature_explanation", "FEATURE-EXPLANATION", 1, 0, false);
        declareFunction("all_privacy_violations", "ALL-PRIVACY-VIOLATIONS", 0, 1, false);
        declareFunction("module_privacy_violations", "MODULE-PRIVACY-VIOLATIONS", 1, 0, false);
        declareFunction("show_privacy_violations", "SHOW-PRIVACY-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_privacy_violation", "SHOW-ONE-PRIVACY-VIOLATION", 1, 1, false);
        declareFunction("all_early_rebinding_violations", "ALL-EARLY-REBINDING-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_rebinding_violations", "MODULE-EARLY-REBINDING-VIOLATIONS", 1, 0, false);
        declareFunction("show_early_rebinding_violations", "SHOW-EARLY-REBINDING-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_rebinding_violation", "SHOW-ONE-EARLY-REBINDING-VIOLATION", 1, 1, false);
        declareFunction("all_early_reference_violations", "ALL-EARLY-REFERENCE-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_reference_violations", "MODULE-EARLY-REFERENCE-VIOLATIONS", 1, 0, false);
        declareFunction("td_early_macro_use_p", "TD-EARLY-MACRO-USE-P", 5, 0, false);
        declareFunction("td_early_evaluation_reference_p", "TD-EARLY-EVALUATION-REFERENCE-P", 6, 0, false);
        declareFunction("td_early_global_binding_p", "TD-EARLY-GLOBAL-BINDING-P", 3, 0, false);
        declareFunction("show_early_reference_violations", "SHOW-EARLY-REFERENCE-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_reference_violation", "SHOW-ONE-EARLY-REFERENCE-VIOLATION", 1, 1, false);
        declareFunction("all_early_macro_use_violations", "ALL-EARLY-MACRO-USE-VIOLATIONS", 0, 1, false);
        declareFunction("module_early_macro_use_violations", "MODULE-EARLY-MACRO-USE-VIOLATIONS", 1, 0, false);
        declareFunction("show_early_macro_use_violations", "SHOW-EARLY-MACRO-USE-VIOLATIONS", 0, 2, false);
        declareFunction("show_one_early_macro_use_violation", "SHOW-ONE-EARLY-MACRO-USE-VIOLATION", 1, 1, false);
        declareFunction("all_undefined_references", "ALL-UNDEFINED-REFERENCES", 0, 1, false);
        declareFunction("module_undefined_references", "MODULE-UNDEFINED-REFERENCES", 1, 0, false);
        declareFunction("show_undefined_references", "SHOW-UNDEFINED-REFERENCES", 0, 2, false);
        declareFunction("show_one_undefined_reference", "SHOW-ONE-UNDEFINED-REFERENCE", 1, 1, false);
        declareFunction("all_multiple_definitions", "ALL-MULTIPLE-DEFINITIONS", 0, 1, false);
        declareFunction("module_multiple_definitions", "MODULE-MULTIPLE-DEFINITIONS", 1, 0, false);
        declareFunction("show_multiple_definitions", "SHOW-MULTIPLE-DEFINITIONS", 0, 2, false);
        declareFunction("show_one_multiple_definition", "SHOW-ONE-MULTIPLE-DEFINITION", 1, 1, false);
        declareFunction("all_early_constant_references", "ALL-EARLY-CONSTANT-REFERENCES", 0, 1, false);
        declareFunction("module_early_constant_references", "MODULE-EARLY-CONSTANT-REFERENCES", 1, 0, false);
        declareFunction("show_early_constant_references", "SHOW-EARLY-CONSTANT-REFERENCES", 0, 2, false);
        declareFunction("show_one_early_constant_reference", "SHOW-ONE-EARLY-CONSTANT-REFERENCE", 1, 1, false);
        declareFunction("show_api_macros_with_non_api_expansions", "SHOW-API-MACROS-WITH-NON-API-EXPANSIONS", 0, 1, false);
        declareFunction("show_one_api_macro_visibility_problem", "SHOW-ONE-API-MACRO-VISIBILITY-PROBLEM", 1, 1, false);
        declareFunction("non_api_expansions_for_api_macro", "NON-API-EXPANSIONS-FOR-API-MACRO", 1, 0, false);
        declareFunction("all_build_problems", "ALL-BUILD-PROBLEMS", 0, 1, false);
        declareFunction("module_build_problems", "MODULE-BUILD-PROBLEMS", 1, 0, false);
        declareFunction("show_build_problems", "SHOW-BUILD-PROBLEMS", 0, 2, false);
        declareFunction("show_one_build_problem", "SHOW-ONE-BUILD-PROBLEM", 1, 1, false);
        declareFunction("count_build_problems", "COUNT-BUILD-PROBLEMS", 0, 1, false);
        declareFunction("build_problem_counts_by_module", "BUILD-PROBLEM-COUNTS-BY-MODULE", 0, 1, false);
        declareFunction("td_method_co_called_methods", "TD-METHOD-CO-CALLED-METHODS", 1, 0, false);
        declareFunction("td_method_co_called_globals", "TD-METHOD-CO-CALLED-GLOBALS", 1, 0, false);
        declareFunction("td_macro_expansion_calls", "TD-MACRO-EXPANSION-CALLS", 1, 0, false);
        declareFunction("td_possible_orphan_methods_from_module", "TD-POSSIBLE-ORPHAN-METHODS-FROM-MODULE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_translator_utilities_file() {
        defvar("*XREF-DATABASE-MODE*", $NEW);
        defparameter("*TD-METHODS-CALLED-TRANSITIVELY*", NIL);
        defparameter("*TD-GLOBALS-CALLED-TRANSITIVELY*", NIL);
        return NIL;
    }

    public static SubLObject setup_translator_utilities_file() {
        memoization_state.note_memoized_function(TD_TRANSLATION_MODULES_MEMOIZED);
        memoization_state.note_memoized_function(TD_MODULE_TRANSLATION_POSITION);
        memoization_state.note_memoized_function(TD_METHOD_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED);
        memoization_state.note_memoized_function(TD_GLOBAL_LATEST_TRANSITIVELY_REFERENCED_MODULE_MEMOIZED);
        memoization_state.note_memoized_function(POTENTIAL_MODULE_LEVEL_FEATURE_INCONGRUENCE);
        return NIL;
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
    }

    public static final SubLSymbol $kw2$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt4$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt7$http___localhost_cgi_bin_cvsweb_c = makeString("http://localhost/cgi-bin/cvsweb/cycorp/cyc/~A");

    static private final SubLString $str_alt12$Checking__A_for_dependencies___ = makeString("Checking ~A for dependencies.~%");

    static private final SubLString $str_alt24$Identifying_module_level_feature_ = makeString("Identifying module-level feature problems");

    static private final SubLList $list_alt29 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS")), makeSymbol("INCONGRUENCE"));

    static private final SubLList $list_alt30 = list(makeSymbol("MODULE"), makeSymbol("DEF-FEATURES"));

    static private final SubLString $str_alt31$__Top_level_form_in__A__ = makeString("~%Top-level form in ~A~%");

    static private final SubLList $list_alt32 = list(makeSymbol("DEF-OBJECT"), makeSymbol("MODULE"), makeSymbol("DEF-FEATURES"));

    static private final SubLString $str_alt33$__Method__A_in__A__ = makeString("~%Method ~A in ~A~%");

    static private final SubLString $str_alt34$__Global__A_in__A__ = makeString("~%Global ~A in ~A~%");

    static private final SubLString $str_alt35$_references = makeString(" references");

    static private final SubLList $list_alt36 = list(makeSymbol("REF-OBJECT"), makeSymbol("MODULE"), makeSymbol("REF-FEATURES"));

    static private final SubLString $str_alt37$__method__A_from__A__ = makeString("~%method ~A from ~A~%");

    static private final SubLString $str_alt38$__global__A_from__A__ = makeString("~%global ~A from ~A~%");

    static private final SubLString $str_alt39$__which_will_have_problems_when__ = makeString("~%which will have problems when :~%  ~A~%");

    static private final SubLString $str_alt40$assuming__A = makeString("assuming ~A");

    static private final SubLList $list_alt43 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS")));

    static private final SubLList $list_alt44 = list(makeSymbol("MODULE"));

    static private final SubLList $list_alt45 = list(makeSymbol("DEF-OBJECT"), makeSymbol("MODULE"));

    static private final SubLString $str_alt46$_references_private = makeString(" references private");

    static private final SubLList $list_alt47 = list(makeSymbol("REF-OBJECT"), makeSymbol("MODULE"));

    static private final SubLString $str_alt48$Identifying_early_rebinding_viola = makeString("Identifying early rebinding violations");

    static private final SubLString $str_alt49$_rebinds = makeString(" rebinds");

    static private final SubLString $str_alt50$_before_it_is_defined__ = makeString(" before it is defined~%");

    static private final SubLString $str_alt51$Identifying_early_reference_viola = makeString("Identifying early reference violations");

    static private final SubLList $list_alt52 = list(list(makeSymbol("DEF-TYPE"), makeSymbol("&REST"), makeSymbol("DEF-ARGS")), list(makeSymbol("REF-TYPE"), makeSymbol("REF-OBJECT"), makeSymbol("MODULE")), makeSymbol("JUSTIFYING-METHODS"), makeSymbol("JUSTIFYING-GLOBALS"));

    static private final SubLList $list_alt53 = list(makeSymbol("MODULE"), makeSymbol("POSITION"));

    static private final SubLString $str_alt54$__Top_level_form_in__A_at__S__ = makeString("~%Top-level form in ~A at ~S~%");

    static private final SubLString $str_alt55$_before_it_is = makeString(" before it is");

    static private final SubLString $str_alt56$_defined__ = makeString(" defined~%");

    static private final SubLString $str_alt57$_completely_defined_due_to__ = makeString(" completely defined due to~%");

    static private final SubLString $str_alt58$method__A__ = makeString("method ~A~%");

    static private final SubLString $str_alt59$global__A__ = makeString("global ~A~%");

    static private final SubLString $str_alt60$Identifying_early_macro_use_viola = makeString("Identifying early macro use violations");

    static private final SubLString $str_alt62$_references_undefined = makeString(" references undefined");

    static private final SubLList $list_alt63 = list(makeSymbol("REF-OBJECT"));

    static private final SubLString $str_alt64$__method__A__ = makeString("~%method ~A~%");

    static private final SubLString $str_alt65$__global__A__ = makeString("~%global ~A~%");

    static private final SubLList $list_alt66 = list(makeSymbol("DEF-TYPE"), makeSymbol("DEF-OBJECT"), makeSymbol("DEFINITION-POSITIONS"));

    static private final SubLString $str_alt67$__Method__A_has_multiple_definiti = makeString("~%Method ~A has multiple definitions in");

    static private final SubLString $str_alt68$__Global__A_has_multiple_definiti = makeString("~%Global ~A has multiple definitions in");

    static private final SubLList $list_alt69 = cons(makeSymbol("MODULE"), makeSymbol("FILE-POSITION"));

    static private final SubLString $str_alt70$_____A_at_position__S = makeString("~%  ~A at position ~S");

    static private final SubLList $list_alt72 = list(makeSymbol("REF-TYPE"), makeSymbol("&REST"), makeSymbol("REF-ARGS"));

    static private final SubLString $str_alt73$references____before_it_is_comple = makeString("references #$ before it is completely defined~%");

    static private final SubLList $list_alt75 = cons(makeSymbol("MACRO"), makeSymbol("NON-API-EXPANSIONS"));

    static private final SubLString $str_alt76$__API_macro__A_expands_to_non_API = makeString("~&API macro ~A expands to non-API methods~% ~S~%");

    static private final SubLString $str_alt85$__No_build_problems_ = makeString("~%No build problems!");

    static private final SubLList $list_alt86 = list(makeSymbol("PROBLEM-CLASS"), makeSymbol("PROBLEMS"));

    static private final SubLString $str_alt87$Unknown_build_problem_class__S = makeString("Unknown build problem class ~S");

    static private final SubLSymbol $sym89$_ = makeSymbol(">");
}

/**
 * Total time: 1010 ms
 */
