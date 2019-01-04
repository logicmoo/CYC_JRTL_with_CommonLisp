package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion_low extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_low";
    public static final String myFingerPrint = "3385724f24f9a16273eebc121344f942ba442868230293e0d6feffa88e01aca6";
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 853L)
    private static SubLSymbol $constant_completion_table$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 1104L)
    public static SubLSymbol $require_valid_constants$;
    private static final SubLSymbol $sym0$_CONSTANT_COMPLETION_TABLE_;
    private static final SubLString $str1$Constant_Completion_Table;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLSymbol $sym3$INVALID_CONSTANT_HANDLE_;
    private static final SubLSymbol $sym4$CHAR_EQUAL;
    private static final SubLSymbol $sym5$CONSTANT_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 1231L)
    public static SubLObject constant_shell_from_name(final SubLObject string) {
        assert constant_completion_low.NIL != Types.stringp(string) : string;
        return tries.trie_exact(constant_completion_low.$constant_completion_table$.getGlobalValue(), string, (SubLObject)constant_completion_low.T, (SubLObject)constant_completion_low.ZERO_INTEGER, (SubLObject)constant_completion_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 1528L)
    public static SubLObject kb_constant_complete_exact_internal(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_exact(constant_completion_low.$constant_completion_table$.getGlobalValue(), string, (SubLObject)constant_completion_low.T, start, end);
        if (constant_completion_low.NIL != constant_handles.constant_p(v_answer) && constant_completion_low.NIL != constant_completion_low.$require_valid_constants$.getDynamicValue(thread) && constant_completion_low.NIL == constant_handles.valid_constant_handleP(v_answer)) {
            v_answer = (SubLObject)constant_completion_low.NIL;
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 1837L)
    public static SubLObject kb_constant_complete_internal(final SubLObject prefix, final SubLObject case_sensitiveP, final SubLObject exact_lengthP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_prefix(constant_completion_low.$constant_completion_table$.getGlobalValue(), prefix, case_sensitiveP, exact_lengthP, start, end);
        if (constant_completion_low.NIL != constant_completion_low.$require_valid_constants$.getDynamicValue(thread)) {
            v_answer = Sequences.delete_if((SubLObject)constant_completion_low.$sym3$INVALID_CONSTANT_HANDLE_, v_answer, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 2175L)
    public static SubLObject kb_constant_apropos_internal(final SubLObject substring, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_search(constant_completion_low.$constant_completion_table$.getGlobalValue(), substring, case_sensitiveP, start, end);
        if (constant_completion_low.NIL != constant_completion_low.$require_valid_constants$.getDynamicValue(thread)) {
            v_answer = Sequences.delete_if((SubLObject)constant_completion_low.$sym3$INVALID_CONSTANT_HANDLE_, v_answer, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 2481L)
    public static SubLObject kb_constant_postfix_internal(final SubLObject postfix, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end) {
        final SubLObject apropos_results = kb_constant_apropos_internal(postfix, case_sensitiveP, start, end);
        SubLObject postfix_results = (SubLObject)constant_completion_low.NIL;
        SubLObject cdolist_list_var = apropos_results;
        SubLObject result = (SubLObject)constant_completion_low.NIL;
        result = cdolist_list_var.first();
        while (constant_completion_low.NIL != cdolist_list_var) {
            final SubLObject constant_name = constants_high.constant_name(result);
            final SubLObject name_length = Sequences.length(constant_name);
            final SubLObject postfix_end = (constant_completion_low.NIL != end) ? end : Sequences.length(postfix);
            final SubLObject postfix_length = Numbers.subtract(postfix_end, start);
            final SubLObject name_start = Numbers.subtract(name_length, postfix_length);
            if (constant_completion_low.NIL != Sequences.search(postfix, constant_name, Symbols.symbol_function((SubLObject)constant_completion_low.$sym4$CHAR_EQUAL), Symbols.symbol_function((SubLObject)constant_completion_low.IDENTITY), start, end, name_start, name_length)) {
                postfix_results = (SubLObject)ConsesLow.cons(result, postfix_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Sequences.nreverse(postfix_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 3243L)
    public static SubLObject kb_n_constants_before_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, (SubLObject)constant_completion_low.NIL, strictP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 3420L)
    public static SubLObject kb_n_constants_after_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, (SubLObject)constant_completion_low.T, strictP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 3594L)
    public static SubLObject kb_n_constants_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = (SubLObject)constant_completion_low.NIL;
        if (!n.isZero()) {
            final SubLObject iterator = kb_new_directed_constant_completion_iterator_internal(string, case_sensitiveP, start, end, forwardP, strictP);
            SubLObject count = (SubLObject)constant_completion_low.ZERO_INTEGER;
            SubLObject done_var;
            SubLObject valid;
            for (SubLObject new_done = done_var = Numbers.numGE(count, n); constant_completion_low.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(constant_completion_low.NIL == valid || constant_completion_low.NIL != new_done)) {
                thread.resetMultipleValues();
                final SubLObject constant = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (constant_completion_low.NIL != valid) {
                    constants = (SubLObject)ConsesLow.cons(constant, constants);
                    count = Numbers.add(count, (SubLObject)constant_completion_low.ONE_INTEGER);
                    if (count.numGE(n)) {
                        new_done = (SubLObject)constant_completion_low.T;
                    }
                }
            }
            iteration.iteration_finalize(iterator);
        }
        return Sequences.nreverse(constants);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 4006L)
    public static SubLObject clear_constant_completion_table() {
        return tries.clear_trie(constant_completion_low.$constant_completion_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 4171L)
    public static SubLObject add_constant_to_completions(final SubLObject constant, final SubLObject string) {
        assert constant_completion_low.NIL != constant_handles.constant_p(constant) : constant;
        assert constant_completion_low.NIL != Types.stringp(string) : string;
        tries.trie_insert(constant_completion_low.$constant_completion_table$.getGlobalValue(), string, constant, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 4444L)
    public static SubLObject remove_constant_from_completions(final SubLObject constant, final SubLObject string) {
        assert constant_completion_low.NIL != constant_handles.constant_p(constant) : constant;
        assert constant_completion_low.NIL != Types.stringp(string) : string;
        tries.trie_remove(constant_completion_low.$constant_completion_table$.getGlobalValue(), string, constant, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED);
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 4726L)
    public static SubLObject kb_new_constant_completion_iterator_internal(SubLObject forwardP) {
        if (forwardP == constant_completion_low.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_low.T;
        }
        return tries.new_trie_iterator(constant_completion_low.$constant_completion_table$.getGlobalValue(), forwardP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-low.lisp", position = 4922L)
    public static SubLObject kb_new_directed_constant_completion_iterator_internal(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        if (case_sensitiveP == constant_completion_low.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_low.T;
        }
        if (start == constant_completion_low.UNPROVIDED) {
            start = (SubLObject)constant_completion_low.ZERO_INTEGER;
        }
        if (end == constant_completion_low.UNPROVIDED) {
            end = (SubLObject)constant_completion_low.NIL;
        }
        if (forwardP == constant_completion_low.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_low.T;
        }
        if (strictP == constant_completion_low.UNPROVIDED) {
            strictP = (SubLObject)constant_completion_low.NIL;
        }
        return tries.new_directed_trie_iterator(constant_completion_low.$constant_completion_table$.getGlobalValue(), string, case_sensitiveP, start, end, forwardP, strictP);
    }
    
    public static SubLObject declare_constant_completion_low_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "constant_shell_from_name", "CONSTANT-SHELL-FROM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_constant_complete_exact_internal", "KB-CONSTANT-COMPLETE-EXACT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_constant_complete_internal", "KB-CONSTANT-COMPLETE-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_constant_apropos_internal", "KB-CONSTANT-APROPOS-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_constant_postfix_internal", "KB-CONSTANT-POSTFIX-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_n_constants_before_internal", "KB-N-CONSTANTS-BEFORE-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_n_constants_after_internal", "KB-N-CONSTANTS-AFTER-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_n_constants_internal", "KB-N-CONSTANTS-INTERNAL", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "clear_constant_completion_table", "CLEAR-CONSTANT-COMPLETION-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "add_constant_to_completions", "ADD-CONSTANT-TO-COMPLETIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "remove_constant_from_completions", "REMOVE-CONSTANT-FROM-COMPLETIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_new_constant_completion_iterator_internal", "KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_low", "kb_new_directed_constant_completion_iterator_internal", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 1, 5, false);
        return (SubLObject)constant_completion_low.NIL;
    }
    
    public static SubLObject init_constant_completion_low_file() {
        constant_completion_low.$constant_completion_table$ = SubLFiles.deflexical("*CONSTANT-COMPLETION-TABLE*", (constant_completion_low.NIL != Symbols.boundp((SubLObject)constant_completion_low.$sym0$_CONSTANT_COMPLETION_TABLE_)) ? constant_completion_low.$constant_completion_table$.getGlobalValue() : tries.create_trie((SubLObject)constant_completion_low.T, (SubLObject)constant_completion_low.$str1$Constant_Completion_Table, (SubLObject)constant_completion_low.UNPROVIDED, (SubLObject)constant_completion_low.UNPROVIDED));
        constant_completion_low.$require_valid_constants$ = SubLFiles.defparameter("*REQUIRE-VALID-CONSTANTS*", (SubLObject)constant_completion_low.T);
        return (SubLObject)constant_completion_low.NIL;
    }
    
    public static SubLObject setup_constant_completion_low_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)constant_completion_low.$sym0$_CONSTANT_COMPLETION_TABLE_);
        return (SubLObject)constant_completion_low.NIL;
    }
    
    public void declareFunctions() {
        declare_constant_completion_low_file();
    }
    
    public void initializeVariables() {
        init_constant_completion_low_file();
    }
    
    public void runTopLevelForms() {
        setup_constant_completion_low_file();
    }
    
    static {
        me = (SubLFile)new constant_completion_low();
        constant_completion_low.$constant_completion_table$ = null;
        constant_completion_low.$require_valid_constants$ = null;
        $sym0$_CONSTANT_COMPLETION_TABLE_ = SubLObjectFactory.makeSymbol("*CONSTANT-COMPLETION-TABLE*");
        $str1$Constant_Completion_Table = SubLObjectFactory.makeString("Constant Completion Table");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym3$INVALID_CONSTANT_HANDLE_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT-HANDLE?");
        $sym4$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $sym5$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
    }
}

/*

	Total time: 48 ms
	
*/