package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_completion";
    public static final String myFingerPrint = "343128ffb056501532eaf0603c93caaa87c35b6ed0609776269ce07df9232973";
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 636L)
    private static SubLSymbol $constant_names_in_code$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1121L)
    private static SubLSymbol $bogus_constant_names_in_code$;
    private static final SubLSymbol $sym0$_CONSTANT_NAMES_IN_CODE_;
    private static final SubLSymbol $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_;
    private static final SubLSymbol $sym2$FIND_CONSTANT;
    private static final SubLSymbol $sym3$STRING_;
    private static final SubLString $str4$Computing_bogus_constant_names_in;
    private static final SubLString $str5$The_following__A_constants_are_me;
    private static final SubLString $str6$__A__;
    private static final SubLString $str7$__;
    private static final SubLString $str8$All_constants_mentioned_in_code_a;
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1175L)
    public static SubLObject constants_mentioned_in_code() {
        return Sequences.delete((SubLObject)constant_completion.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)constant_completion.$sym2$FIND_CONSTANT), constant_completion.$constant_names_in_code$.getGlobalValue()), (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1297L)
    public static SubLObject constant_mentioned_in_codeP(final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constant_completion.NIL != constant_handles.constant_p(constant) && constant_completion.NIL != conses_high.member(constants_high.constant_name(constant), constant_completion.$constant_names_in_code$.getGlobalValue(), Symbols.symbol_function((SubLObject)constant_completion.EQUAL), (SubLObject)constant_completion.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1466L)
    public static SubLObject bogus_constants_mentioned_in_code() {
        return Sequences.delete((SubLObject)constant_completion.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)constant_completion.$sym2$FIND_CONSTANT), constant_completion.$bogus_constant_names_in_code$.getGlobalValue()), (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED, (SubLObject)constant_completion.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 1600L)
    public static SubLObject initialize_constant_names_in_code() {
        if (constant_completion.ZERO_INTEGER.numE(constant_handles.constant_count())) {
            constant_completion.$constant_names_in_code$.setGlobalValue((SubLObject)constant_completion.NIL);
            SubLObject cdolist_list_var = constant_handles.invalid_constant_names();
            SubLObject invalid_constant_name = (SubLObject)constant_completion.NIL;
            invalid_constant_name = cdolist_list_var.first();
            while (constant_completion.NIL != cdolist_list_var) {
                constant_completion.$constant_names_in_code$.setGlobalValue((SubLObject)ConsesLow.cons(invalid_constant_name, constant_completion.$constant_names_in_code$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                invalid_constant_name = cdolist_list_var.first();
            }
            constant_completion.$constant_names_in_code$.setGlobalValue(Sort.sort(constant_completion.$constant_names_in_code$.getGlobalValue(), Symbols.symbol_function((SubLObject)constant_completion.$sym3$STRING_), (SubLObject)constant_completion.UNPROVIDED));
        }
        return Sequences.length(constant_completion.$constant_names_in_code$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 2143L)
    public static SubLObject compute_bogus_constant_names_in_code() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (constant_completion.NIL != constant_completion.$constant_names_in_code$.getGlobalValue()) {
            final SubLObject str = (SubLObject)constant_completion.$str4$Computing_bogus_constant_names_in;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)constant_completion.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)constant_completion.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)constant_completion.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)constant_completion.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((constant_completion.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : constant_completion.T), thread);
                utilities_macros.noting_progress_preamble(str);
                constant_completion.$bogus_constant_names_in_code$.setGlobalValue((SubLObject)constant_completion.NIL);
                SubLObject cdolist_list_var = constant_completion.$constant_names_in_code$.getGlobalValue();
                SubLObject name = (SubLObject)constant_completion.NIL;
                name = cdolist_list_var.first();
                while (constant_completion.NIL != cdolist_list_var) {
                    final SubLObject constant = constants_high.find_constant(name);
                    if (constant_completion.NIL != constants_high.uninstalled_constant_p(constant)) {
                        constant_completion.$bogus_constant_names_in_code$.setGlobalValue((SubLObject)ConsesLow.cons(name, constant_completion.$bogus_constant_names_in_code$.getGlobalValue()));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    name = cdolist_list_var.first();
                }
                constant_completion.$bogus_constant_names_in_code$.setGlobalValue(Sort.sort(constant_completion.$bogus_constant_names_in_code$.getGlobalValue(), Symbols.symbol_function((SubLObject)constant_completion.$sym3$STRING_), (SubLObject)constant_completion.UNPROVIDED));
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.length(constant_completion.$bogus_constant_names_in_code$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 2680L)
    public static SubLObject report_constant_names_in_code_but_not_kb() {
        final SubLObject constant_names = constant_names_in_code_but_not_kb();
        if (constant_completion.NIL != constant_names) {
            PrintLow.format((SubLObject)constant_completion.T, (SubLObject)constant_completion.$str5$The_following__A_constants_are_me, Sequences.length(constant_names));
            SubLObject cdolist_list_var = constant_names;
            SubLObject constant_name = (SubLObject)constant_completion.NIL;
            constant_name = cdolist_list_var.first();
            while (constant_completion.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)constant_completion.T, (SubLObject)constant_completion.$str6$__A__, constant_name);
                cdolist_list_var = cdolist_list_var.rest();
                constant_name = cdolist_list_var.first();
            }
            PrintLow.format((SubLObject)constant_completion.T, (SubLObject)constant_completion.$str7$__);
        }
        else {
            PrintLow.format((SubLObject)constant_completion.T, (SubLObject)constant_completion.$str8$All_constants_mentioned_in_code_a);
        }
        streams_high.force_output((SubLObject)constant_completion.T);
        return (SubLObject)constant_completion.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion.lisp", position = 3176L)
    public static SubLObject constant_names_in_code_but_not_kb() {
        SubLObject result = (SubLObject)constant_completion.NIL;
        SubLObject cdolist_list_var = constant_handles.invalid_constant_names();
        SubLObject name = (SubLObject)constant_completion.NIL;
        name = cdolist_list_var.first();
        while (constant_completion.NIL != cdolist_list_var) {
            if (name.isString()) {
                final SubLObject constant = constants_high.find_constant(name);
                if (constant_completion.NIL == constant || constant_completion.NIL != constants_high.uninstalled_constant_p(constant)) {
                    result = (SubLObject)ConsesLow.cons(name, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        result = Sort.sort(result, Symbols.symbol_function((SubLObject)constant_completion.$sym3$STRING_), (SubLObject)constant_completion.UNPROVIDED);
        return result;
    }
    
    public static SubLObject declare_constant_completion_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "constants_mentioned_in_code", "CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "constant_mentioned_in_codeP", "CONSTANT-MENTIONED-IN-CODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "bogus_constants_mentioned_in_code", "BOGUS-CONSTANTS-MENTIONED-IN-CODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "initialize_constant_names_in_code", "INITIALIZE-CONSTANT-NAMES-IN-CODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "compute_bogus_constant_names_in_code", "COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "report_constant_names_in_code_but_not_kb", "REPORT-CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion", "constant_names_in_code_but_not_kb", "CONSTANT-NAMES-IN-CODE-BUT-NOT-KB", 0, 0, false);
        return (SubLObject)constant_completion.NIL;
    }
    
    public static SubLObject init_constant_completion_file() {
        constant_completion.$constant_names_in_code$ = SubLFiles.deflexical("*CONSTANT-NAMES-IN-CODE*", (SubLObject)(maybeDefault((SubLObject)constant_completion.$sym0$_CONSTANT_NAMES_IN_CODE_, constant_completion.$constant_names_in_code$, constant_completion.NIL)));
        constant_completion.$bogus_constant_names_in_code$ = SubLFiles.deflexical("*BOGUS-CONSTANT-NAMES-IN-CODE*", (SubLObject)(maybeDefault((SubLObject)constant_completion.$sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_, constant_completion.$bogus_constant_names_in_code$, constant_completion.NIL)));
        return (SubLObject)constant_completion.NIL;
    }
    
    public static SubLObject setup_constant_completion_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)constant_completion.$sym0$_CONSTANT_NAMES_IN_CODE_);
        subl_macro_promotions.declare_defglobal((SubLObject)constant_completion.$sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_);
        return (SubLObject)constant_completion.NIL;
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
        me = (SubLFile)new constant_completion();
        constant_completion.$constant_names_in_code$ = null;
        constant_completion.$bogus_constant_names_in_code$ = null;
        $sym0$_CONSTANT_NAMES_IN_CODE_ = SubLObjectFactory.makeSymbol("*CONSTANT-NAMES-IN-CODE*");
        $sym1$_BOGUS_CONSTANT_NAMES_IN_CODE_ = SubLObjectFactory.makeSymbol("*BOGUS-CONSTANT-NAMES-IN-CODE*");
        $sym2$FIND_CONSTANT = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $sym3$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $str4$Computing_bogus_constant_names_in = SubLObjectFactory.makeString("Computing bogus constant names in code...");
        $str5$The_following__A_constants_are_me = SubLObjectFactory.makeString("The following ~A constants are mentioned in code but missing in the KB:~%");
        $str6$__A__ = SubLObjectFactory.makeString(" ~A~%");
        $str7$__ = SubLObjectFactory.makeString("~%");
        $str8$All_constants_mentioned_in_code_a = SubLObjectFactory.makeString("All constants mentioned in code are good in the KB.~%");
    }
}

/*

	Total time: 37 ms
	
*/