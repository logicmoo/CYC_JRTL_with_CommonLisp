/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.invalid_constant_names;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONSTANT-COMPLETION
 * source file: /cyc/top/cycl/constant-completion.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_completion extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_completion();

 public static final String myName = "com.cyc.cycjava.cycl.constant_completion";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $constant_names_in_code$ = makeSymbol("*CONSTANT-NAMES-IN-CODE*");

    public static final SubLSymbol $bogus_constant_names_in_code$ = makeSymbol("*BOGUS-CONSTANT-NAMES-IN-CODE*");

    static private final SubLSymbol $sym3$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str4$Computing_bogus_constant_names_in = makeString("Computing bogus constant names in code...");

    static private final SubLString $str5$The_following__A_constants_are_me = makeString("The following ~A constants are mentioned in code but missing in the KB:~%");

    static private final SubLString $str6$__A__ = makeString(" ~A~%");

    static private final SubLString $str7$__ = makeString("~%");

    static private final SubLString $str8$All_constants_mentioned_in_code_a = makeString("All constants mentioned in code are good in the KB.~%");

    public static final SubLObject constants_mentioned_in_code_alt() {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CONSTANT), $constant_names_in_code$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constants_mentioned_in_code() {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CONSTANT), $constant_names_in_code$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject constant_mentioned_in_codeP_alt(SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != member(constants_high.constant_name(constant), $constant_names_in_code$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)));
    }

    public static SubLObject constant_mentioned_in_codeP(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != member(constants_high.constant_name(constant), $constant_names_in_code$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject bogus_constants_mentioned_in_code_alt() {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CONSTANT), $bogus_constant_names_in_code$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bogus_constants_mentioned_in_code() {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CONSTANT), $bogus_constant_names_in_code$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject initialize_constant_names_in_code_alt() {
        if (ZERO_INTEGER.numE(constant_count())) {
            $constant_names_in_code$.setGlobalValue(NIL);
            {
                SubLObject cdolist_list_var = invalid_constant_names();
                SubLObject invalid_constant_name = NIL;
                for (invalid_constant_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , invalid_constant_name = cdolist_list_var.first()) {
                    $constant_names_in_code$.setGlobalValue(cons(invalid_constant_name, $constant_names_in_code$.getGlobalValue()));
                }
            }
            $constant_names_in_code$.setGlobalValue(Sort.sort($constant_names_in_code$.getGlobalValue(), symbol_function($sym3$STRING_), UNPROVIDED));
        }
        return length($constant_names_in_code$.getGlobalValue());
    }

    public static SubLObject initialize_constant_names_in_code() {
        if (ZERO_INTEGER.numE(constant_count())) {
            $constant_names_in_code$.setGlobalValue(NIL);
            SubLObject cdolist_list_var = invalid_constant_names();
            SubLObject invalid_constant_name = NIL;
            invalid_constant_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $constant_names_in_code$.setGlobalValue(cons(invalid_constant_name, $constant_names_in_code$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                invalid_constant_name = cdolist_list_var.first();
            } 
            $constant_names_in_code$.setGlobalValue(Sort.sort($constant_names_in_code$.getGlobalValue(), symbol_function($sym3$STRING_), UNPROVIDED));
        }
        return length($constant_names_in_code$.getGlobalValue());
    }

    public static final SubLObject compute_bogus_constant_names_in_code_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $constant_names_in_code$.getGlobalValue()) {
                {
                    SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                    try {
                        $noting_progress_start_time$.bind(get_universal_time(), thread);
                        noting_progress_preamble($str_alt4$Computing_bogus_constant_names_in);
                        $bogus_constant_names_in_code$.setGlobalValue(NIL);
                        {
                            SubLObject cdolist_list_var = $constant_names_in_code$.getGlobalValue();
                            SubLObject name = NIL;
                            for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                                {
                                    SubLObject constant = constants_high.find_constant(name);
                                    if (NIL != constants_high.uninstalled_constant_p(constant)) {
                                        $bogus_constant_names_in_code$.setGlobalValue(cons(name, $bogus_constant_names_in_code$.getGlobalValue()));
                                    }
                                }
                            }
                        }
                        $bogus_constant_names_in_code$.setGlobalValue(Sort.sort($bogus_constant_names_in_code$.getGlobalValue(), symbol_function($sym3$STRING_), UNPROVIDED));
                        noting_progress_postamble();
                    } finally {
                        $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return length($bogus_constant_names_in_code$.getGlobalValue());
        }
    }

    public static SubLObject compute_bogus_constant_names_in_code() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $constant_names_in_code$.getGlobalValue()) {
            final SubLObject str = $str4$Computing_bogus_constant_names_in;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                $bogus_constant_names_in_code$.setGlobalValue(NIL);
                SubLObject cdolist_list_var = $constant_names_in_code$.getGlobalValue();
                SubLObject name = NIL;
                name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject constant = constants_high.find_constant(name);
                    if (NIL != constants_high.uninstalled_constant_p(constant)) {
                        $bogus_constant_names_in_code$.setGlobalValue(cons(name, $bogus_constant_names_in_code$.getGlobalValue()));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    name = cdolist_list_var.first();
                } 
                $bogus_constant_names_in_code$.setGlobalValue(Sort.sort($bogus_constant_names_in_code$.getGlobalValue(), symbol_function($sym3$STRING_), UNPROVIDED));
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return length($bogus_constant_names_in_code$.getGlobalValue());
    }

    public static final SubLObject report_constant_names_in_code_but_not_kb_alt() {
        {
            SubLObject constant_names = com.cyc.cycjava.cycl.constant_completion.constant_names_in_code_but_not_kb();
            if (NIL != constant_names) {
                format(T, $str_alt5$The_following__A_constants_are_me, length(constant_names));
                {
                    SubLObject cdolist_list_var = constant_names;
                    SubLObject constant_name = NIL;
                    for (constant_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant_name = cdolist_list_var.first()) {
                        format(T, $str_alt6$__A__, constant_name);
                    }
                }
                format(T, $str_alt7$__);
            } else {
                format(T, $str_alt8$All_constants_mentioned_in_code_a);
            }
        }
        force_output(T);
        return NIL;
    }

    public static SubLObject report_constant_names_in_code_but_not_kb() {
        final SubLObject constant_names = constant_names_in_code_but_not_kb();
        if (NIL != constant_names) {
            format(T, $str5$The_following__A_constants_are_me, length(constant_names));
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = NIL;
            constant_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str6$__A__, constant_name);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            } 
            format(T, $str7$__);
        } else {
            format(T, $str8$All_constants_mentioned_in_code_a);
        }
        force_output(T);
        return NIL;
    }

    public static final SubLObject constant_names_in_code_but_not_kb_alt() {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = invalid_constant_names();
            SubLObject name = NIL;
            for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                if (name.isString()) {
                    {
                        SubLObject constant = constants_high.find_constant(name);
                        if ((NIL == constant) || (NIL != constants_high.uninstalled_constant_p(constant))) {
                            result = cons(name, result);
                        }
                    }
                }
            }
            result = Sort.sort(result, symbol_function($sym3$STRING_), UNPROVIDED);
            return result;
        }
    }

    public static SubLObject constant_names_in_code_but_not_kb() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = invalid_constant_names();
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (name.isString()) {
                final SubLObject constant = constants_high.find_constant(name);
                if ((NIL == constant) || (NIL != constants_high.uninstalled_constant_p(constant))) {
                    result = cons(name, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        result = Sort.sort(result, symbol_function($sym3$STRING_), UNPROVIDED);
        return result;
    }

    static private final SubLString $str_alt4$Computing_bogus_constant_names_in = makeString("Computing bogus constant names in code...");

    static private final SubLString $str_alt5$The_following__A_constants_are_me = makeString("The following ~A constants are mentioned in code but missing in the KB:~%");

    public static SubLObject declare_constant_completion_file() {
        declareFunction("constants_mentioned_in_code", "CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
        declareFunction("constant_mentioned_in_codeP", "CONSTANT-MENTIONED-IN-CODE?", 1, 0, false);
        declareFunction("bogus_constants_mentioned_in_code", "BOGUS-CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
        declareFunction("initialize_constant_names_in_code", "INITIALIZE-CONSTANT-NAMES-IN-CODE", 0, 0, false);
        declareFunction("compute_bogus_constant_names_in_code", "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE", 0, 0, false);
        declareFunction("report_constant_names_in_code_but_not_kb", "REPORT-CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
        declareFunction("constant_names_in_code_but_not_kb", "CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt6$__A__ = makeString(" ~A~%");

    static private final SubLString $str_alt7$__ = makeString("~%");

    static private final SubLString $str_alt8$All_constants_mentioned_in_code_a = makeString("All constants mentioned in code are good in the KB.~%");

    public static final SubLObject init_constant_completion_file_alt() {
        deflexical("*CONSTANT-NAMES-IN-CODE*", NIL != boundp($constant_names_in_code$) ? ((SubLObject) ($constant_names_in_code$.getGlobalValue())) : NIL);
        deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", NIL != boundp($bogus_constant_names_in_code$) ? ((SubLObject) ($bogus_constant_names_in_code$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_constant_completion_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CONSTANT-NAMES-IN-CODE*", SubLTrampolineFile.maybeDefault($constant_names_in_code$, $constant_names_in_code$, NIL));
            deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", SubLTrampolineFile.maybeDefault($bogus_constant_names_in_code$, $bogus_constant_names_in_code$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CONSTANT-NAMES-IN-CODE*", NIL != boundp($constant_names_in_code$) ? ((SubLObject) ($constant_names_in_code$.getGlobalValue())) : NIL);
            deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", NIL != boundp($bogus_constant_names_in_code$) ? ((SubLObject) ($bogus_constant_names_in_code$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_constant_completion_file_Previous() {
        deflexical("*CONSTANT-NAMES-IN-CODE*", SubLTrampolineFile.maybeDefault($constant_names_in_code$, $constant_names_in_code$, NIL));
        deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", SubLTrampolineFile.maybeDefault($bogus_constant_names_in_code$, $bogus_constant_names_in_code$, NIL));
        return NIL;
    }

    public static SubLObject setup_constant_completion_file() {
        declare_defglobal($constant_names_in_code$);
        declare_defglobal($bogus_constant_names_in_code$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_completion_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_completion_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_completion_file();
    }

    static {
    }
}

/**
 * Total time: 37 ms
 */
