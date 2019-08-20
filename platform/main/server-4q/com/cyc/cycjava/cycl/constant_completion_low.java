/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant_handleP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 * module:      CONSTANT-COMPLETION-LOW
 * source file: /cyc/top/cycl/constant-completion-low.lisp
 * created:     2019/07/03 17:37:18
 */
public final class constant_completion_low extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new constant_completion_low();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $require_valid_constants$ = makeSymbol("*REQUIRE-VALID-CONSTANTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $constant_completion_table$ = makeSymbol("*CONSTANT-COMPLETION-TABLE*");

    static private final SubLString $$$Constant_Completion_Table = makeString("Constant Completion Table");

    static private final SubLSymbol $sym3$INVALID_CONSTANT_HANDLE_ = makeSymbol("INVALID-CONSTANT-HANDLE?");

    /**
     * Return a constant or constant shell whose name exactly matches STRING.
     */
    @LispMethod(comment = "Return a constant or constant shell whose name exactly matches STRING.")
    public static final SubLObject constant_shell_from_name_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        return tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, ZERO_INTEGER, NIL);
    }

    /**
     * Return a constant or constant shell whose name exactly matches STRING.
     */
    @LispMethod(comment = "Return a constant or constant shell whose name exactly matches STRING.")
    public static SubLObject constant_shell_from_name(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, ZERO_INTEGER, NIL);
    }

    public static final SubLObject kb_constant_complete_exact_internal_alt(SubLObject string, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, start, end);
                if (NIL != constant_p(v_answer)) {
                    if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
                        if (NIL == valid_constant_handleP(v_answer)) {
                            v_answer = NIL;
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject kb_constant_complete_exact_internal(final SubLObject string, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_exact($constant_completion_table$.getGlobalValue(), string, T, start, end);
        if (((NIL != constant_p(v_answer)) && (NIL != $require_valid_constants$.getDynamicValue(thread))) && (NIL == valid_constant_handleP(v_answer))) {
            v_answer = NIL;
        }
        return v_answer;
    }

    public static final SubLObject kb_constant_complete_internal_alt(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = tries.trie_prefix($constant_completion_table$.getGlobalValue(), prefix, case_sensitiveP, exact_lengthP, start, end);
                if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
                    v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return v_answer;
            }
        }
    }

    public static SubLObject kb_constant_complete_internal(final SubLObject prefix, final SubLObject case_sensitiveP, final SubLObject exact_lengthP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_prefix($constant_completion_table$.getGlobalValue(), prefix, case_sensitiveP, exact_lengthP, start, end);
        if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
            v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static final SubLObject kb_constant_apropos_internal_alt(SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = tries.trie_search($constant_completion_table$.getGlobalValue(), substring, case_sensitiveP, start, end);
                if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
                    v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return v_answer;
            }
        }
    }

    public static SubLObject kb_constant_apropos_internal(final SubLObject substring, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = tries.trie_search($constant_completion_table$.getGlobalValue(), substring, case_sensitiveP, start, end);
        if (NIL != $require_valid_constants$.getDynamicValue(thread)) {
            v_answer = delete_if($sym3$INVALID_CONSTANT_HANDLE_, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static final SubLObject kb_constant_postfix_internal_alt(SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        {
            SubLObject apropos_results = com.cyc.cycjava.cycl.constant_completion_low.kb_constant_apropos_internal(postfix, case_sensitiveP, start, end);
            SubLObject postfix_results = NIL;
            SubLObject cdolist_list_var = apropos_results;
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject constant_name = constants_high.constant_name(result);
                    SubLObject name_length = length(constant_name);
                    SubLObject postfix_end = (NIL != end) ? ((SubLObject) (end)) : length(postfix);
                    SubLObject postfix_length = subtract(postfix_end, start);
                    SubLObject name_start = subtract(name_length, postfix_length);
                    if (NIL != search(postfix, constant_name, symbol_function(CHAR_EQUAL), symbol_function(IDENTITY), start, end, name_start, name_length)) {
                        postfix_results = cons(result, postfix_results);
                    }
                }
            }
            return nreverse(postfix_results);
        }
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

    public static final SubLObject kb_n_constants_before_internal_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        return com.cyc.cycjava.cycl.constant_completion_low.kb_n_constants_internal(n, string, case_sensitiveP, start, end, NIL, strictP);
    }

    public static SubLObject kb_n_constants_before_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, NIL, strictP);
    }

    public static final SubLObject kb_n_constants_after_internal_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        return com.cyc.cycjava.cycl.constant_completion_low.kb_n_constants_internal(n, string, case_sensitiveP, start, end, T, strictP);
    }

    public static SubLObject kb_n_constants_after_internal(final SubLObject n, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject strictP) {
        return kb_n_constants_internal(n, string, case_sensitiveP, start, end, T, strictP);
    }

    public static final SubLObject kb_n_constants_internal_alt(SubLObject n, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constants = NIL;
                if (!n.isZero()) {
                    {
                        SubLObject iterator = com.cyc.cycjava.cycl.constant_completion_low.kb_new_directed_constant_completion_iterator_internal(string, case_sensitiveP, start, end, forwardP, strictP);
                        SubLObject count = ZERO_INTEGER;
                        SubLObject new_done = numGE(count, n);
                        SubLObject done_var = new_done;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject constant = iteration.iteration_next(iterator);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    constants = cons(constant, constants);
                                    count = add(count, ONE_INTEGER);
                                    if (count.numGE(n)) {
                                        new_done = T;
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != new_done));
                            }
                        } 
                        iteration.iteration_finalize(iterator);
                    }
                }
                return nreverse(constants);
            }
        }
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

    /**
     * Empty the entire constant completion table
     */
    @LispMethod(comment = "Empty the entire constant completion table")
    public static final SubLObject clear_constant_completion_table_alt() {
        return tries.clear_trie($constant_completion_table$.getGlobalValue());
    }

    @LispMethod(comment = "Empty the entire constant completion table")
    public static SubLObject clear_constant_completion_table() {
        return tries.clear_trie($constant_completion_table$.getGlobalValue());
    }/**
     * Empty the entire constant completion table
     */


    /**
     * Add CONSTANT to the completions table under the name STRING.
     */
    @LispMethod(comment = "Add CONSTANT to the completions table under the name STRING.")
    public static final SubLObject add_constant_to_completions_alt(SubLObject constant, SubLObject string) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        tries.trie_insert($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    @LispMethod(comment = "Add CONSTANT to the completions table under the name STRING.")
    public static SubLObject add_constant_to_completions(final SubLObject constant, final SubLObject string) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        tries.trie_insert($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }/**
     * Add CONSTANT to the completions table under the name STRING.
     */


    /**
     * Remove CONSTANT from the completion table under the name STRING.
     */
    @LispMethod(comment = "Remove CONSTANT from the completion table under the name STRING.")
    public static final SubLObject remove_constant_from_completions_alt(SubLObject constant, SubLObject string) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        tries.trie_remove($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    @LispMethod(comment = "Remove CONSTANT from the completion table under the name STRING.")
    public static SubLObject remove_constant_from_completions(final SubLObject constant, final SubLObject string) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        tries.trie_remove($constant_completion_table$.getGlobalValue(), string, constant, UNPROVIDED, UNPROVIDED);
        return constant;
    }

    public static final SubLObject kb_new_constant_completion_iterator_internal_alt(SubLObject forwardP) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        return tries.new_trie_iterator($constant_completion_table$.getGlobalValue(), forwardP);
    }

    public static SubLObject kb_new_constant_completion_iterator_internal(SubLObject forwardP) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        return tries.new_trie_iterator($constant_completion_table$.getGlobalValue(), forwardP);
    }

    public static final SubLObject kb_new_directed_constant_completion_iterator_internal_alt(SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
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
        declareFunction("constant_shell_from_name", "CONSTANT-SHELL-FROM-NAME", 1, 0, false);
        declareFunction("kb_constant_complete_exact_internal", "KB-CONSTANT-COMPLETE-EXACT-INTERNAL", 3, 0, false);
        declareFunction("kb_constant_complete_internal", "KB-CONSTANT-COMPLETE-INTERNAL", 5, 0, false);
        declareFunction("kb_constant_apropos_internal", "KB-CONSTANT-APROPOS-INTERNAL", 4, 0, false);
        declareFunction("kb_constant_postfix_internal", "KB-CONSTANT-POSTFIX-INTERNAL", 4, 0, false);
        declareFunction("kb_n_constants_before_internal", "KB-N-CONSTANTS-BEFORE-INTERNAL", 6, 0, false);
        declareFunction("kb_n_constants_after_internal", "KB-N-CONSTANTS-AFTER-INTERNAL", 6, 0, false);
        declareFunction("kb_n_constants_internal", "KB-N-CONSTANTS-INTERNAL", 7, 0, false);
        declareFunction("clear_constant_completion_table", "CLEAR-CONSTANT-COMPLETION-TABLE", 0, 0, false);
        declareFunction("add_constant_to_completions", "ADD-CONSTANT-TO-COMPLETIONS", 2, 0, false);
        declareFunction("remove_constant_from_completions", "REMOVE-CONSTANT-FROM-COMPLETIONS", 2, 0, false);
        declareFunction("kb_new_constant_completion_iterator_internal", "KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 0, 1, false);
        declareFunction("kb_new_directed_constant_completion_iterator_internal", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL", 1, 5, false);
        return NIL;
    }

    public static final SubLObject init_constant_completion_low_file_alt() {
        deflexical("*CONSTANT-COMPLETION-TABLE*", NIL != boundp($constant_completion_table$) ? ((SubLObject) ($constant_completion_table$.getGlobalValue())) : tries.create_trie(T, $$$Constant_Completion_Table, UNPROVIDED, UNPROVIDED));
        defparameter("*REQUIRE-VALID-CONSTANTS*", T);
        return NIL;
    }

    public static SubLObject init_constant_completion_low_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CONSTANT-COMPLETION-TABLE*", SubLTrampolineFile.maybeDefault($constant_completion_table$, $constant_completion_table$, () -> tries.create_trie(T, $$$Constant_Completion_Table, UNPROVIDED, UNPROVIDED)));
            defparameter("*REQUIRE-VALID-CONSTANTS*", T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CONSTANT-COMPLETION-TABLE*", NIL != boundp($constant_completion_table$) ? ((SubLObject) ($constant_completion_table$.getGlobalValue())) : tries.create_trie(T, $$$Constant_Completion_Table, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_constant_completion_low_file_Previous() {
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

    static {
    }
}

/**
 * Total time: 48 ms
 */
