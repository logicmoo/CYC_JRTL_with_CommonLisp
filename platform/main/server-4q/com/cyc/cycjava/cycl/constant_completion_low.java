package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constant_completion_low extends SubLTranslatedFile {
    public static final SubLFile me = new constant_completion_low();

    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_low";

    public static final String myFingerPrint = "3385724f24f9a16273eebc121344f942ba442868230293e0d6feffa88e01aca6";



    // defparameter
    public static final SubLSymbol $require_valid_constants$ = makeSymbol("*REQUIRE-VALID-CONSTANTS*");

    // Internal Constants
    public static final SubLSymbol $constant_completion_table$ = makeSymbol("*CONSTANT-COMPLETION-TABLE*");

    public static final SubLString $$$Constant_Completion_Table = makeString("Constant Completion Table");



    public static final SubLSymbol $sym3$INVALID_CONSTANT_HANDLE_ = makeSymbol("INVALID-CONSTANT-HANDLE?");





    public static SubLObject constant_shell_from_name(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, ZERO_INTEGER, NIL);
    }

    public static SubLObject kb_constant_complete_exact_internal(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, start, end);
        if (((NIL != constant_p(v_answer)) && (NIL != $require_valid_constants$.getDynamicValue(thread))) && (NIL == valid_constant_handleP(v_answer))) {
            v_answer = NIL;
        }
        return v_answer;
    }

    public static SubLObject kb_constant_complete_internal(final SubLObject prefix, final SubLObject case_sensitiveP, final SubLObject exact_lengthP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_prefix($constant_completion_table$.getGlobalValue(), prefix, case_sensitiveP, exact_lengthP, start, end);
        if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
            v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject kb_constant_apropos_internal(final SubLObject substring, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_search($constant_completion_table$.getGlobalValue(), substring, case_sensitiveP, start, end);
        if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
            v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject kb_constant_postfix_internal(final SubLObject postfix, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end) {
        final SubLObject apropos_results = kb_constant_apropos_internal(postfix, case_sensitiveP, start, end);
        SubLObject postfix_results = NIL;
        SubLObject cdolist_list_var = apropos_results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constant_name = constants_high.constant_name(result);
            final SubLObject name_length = length(constant_name);
            final SubLObject postfix_end = (NIL != end) ? end : length(postfix);
            final SubLObject postfix_length = subtract(postfix_end, start);
            final SubLObject name_start = subtract(name_length, postfix_length);
            if (NIL != search(postfix, constant_name, symbol_function(CHAR_EQUAL), symbol_function(IDENTITY), start, end, name_start, name_length)) {
                postfix_results = cons(result, postfix_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return nreverse(postfix_results);
    }

    public static SubLObject kb_n_constants_before_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, NIL, strictP);
    }

    public static SubLObject kb_n_constants_after_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, T, strictP);
    }

    public static SubLObject kb_n_constants_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants = NIL;
        if (!n.isZero()) {
            final SubLObject iterator = kb_new_directed_constant_completion_iterator_internal(string, case_sensitiveP, start, end, forwardP, strictP);
            SubLObject count = ZERO_INTEGER;
            SubLObject done_var;
            SubLObject valid;
            for (SubLObject new_done = done_var = numGE(count, n); NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != new_done))) {
                thread.resetMultipleValues();
                final SubLObject constant = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    constants = cons(constant, constants);
                    count = add(count, ONE_INTEGER);
                    if (count.numGE(n)) {
                        new_done = T;
                    }
                }
            }
            iteration.iteration_finalize(iterator);
        }
        return nreverse(constants);
    }

    public static SubLObject clear_constant_completion_table() {
        return tries.clear_trie($constant_completion_table$.getGlobalValue());
    }

    public static SubLObject add_constant_to_completions(final SubLObject constant, final SubLObject string) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        tries.trie_insert($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    public static SubLObject remove_constant_from_completions(final SubLObject constant, final SubLObject string) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        tries.trie_remove($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    public static SubLObject kb_new_constant_completion_iterator_internal(SubLObject forwardP) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        return tries.new_trie_iterator($constant_completion_table$.getGlobalValue(), forwardP);
    }

    public static SubLObject kb_new_directed_constant_completion_iterator_internal(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return tries.new_directed_trie_iterator($constant_completion_table$.getGlobalValue(), string, case_sensitiveP, start, end, forwardP, strictP);
    }

    public static SubLObject declare_constant_completion_low_file() {
        declareFunction(me, "constant_shell_from_name", "CONSTANT-SHELL-FROM-NAME", 1, 0, false);
        declareFunction(me, "kb_constant_complete_exact_internal", "KB-CONSTANT-COMPLETE-EXACT-INTERNAL", 3, 0, false);
        declareFunction(me, "kb_constant_complete_internal", "KB-CONSTANT-COMPLETE-INTERNAL", 5, 0, false);
        declareFunction(me, "kb_constant_apropos_internal", "KB-CONSTANT-APROPOS-INTERNAL", 4, 0, false);
        declareFunction(me, "kb_constant_postfix_internal", "KB-CONSTANT-POSTFIX-INTERNAL", 4, 0, false);
        declareFunction(me, "kb_n_constants_before_internal", "KB-N-CONSTANTS-BEFORE-INTERNAL", 6, 0, false);
        declareFunction(me, "kb_n_constants_after_internal", "KB-N-CONSTANTS-AFTER-INTERNAL", 6, 0, false);
        declareFunction(me, "kb_n_constants_internal", "KB-N-CONSTANTS-INTERNAL", 7, 0, false);
        declareFunction(me, "clear_constant_completion_table", "CLEAR-CONSTANT-COMPLETION-TABLE", 0, 0, false);
        declareFunction(me, "add_constant_to_completions", "ADD-CONSTANT-TO-COMPLETIONS", 2, 0, false);
        declareFunction(me, "remove_constant_from_completions", "REMOVE-CONSTANT-FROM-COMPLETIONS", 2, 0, false);
        declareFunction(me, "kb_new_constant_completion_iterator_internal", "KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 0, 1, false);
        declareFunction(me, "kb_new_directed_constant_completion_iterator_internal", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 1, 5, false);
        return NIL;
    }

    public static SubLObject init_constant_completion_low_file() {
        deflexical("*CONSTANT-COMPLETION-TABLE*", SubLTrampolineFile.maybeDefault($constant_completion_table$, $constant_completion_table$, () -> tries.create_trie(T, $$$Constant_Completion_Table, UNPROVIDED, UNPROVIDED)));
        defparameter("*REQUIRE-VALID-CONSTANTS*", T);
        return NIL;
    }

    public static SubLObject setup_constant_completion_low_file() {
        declare_defglobal($constant_completion_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_completion_low_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_completion_low_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_completion_low_file();
    }

    
}

/**
 * Total time: 48 ms
 */
