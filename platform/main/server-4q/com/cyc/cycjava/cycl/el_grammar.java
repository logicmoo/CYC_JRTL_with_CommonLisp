/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EL-GRAMMAR
 * source file: /cyc/top/cycl/el-grammar.lisp
 * created:     2019/07/03 17:37:23
 */
public final class el_grammar extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new el_grammar();



    // Definitions
    /**
     * Like @xref why-not-sentence except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref why-not-sentence except it only permits EL constructs.")
    public static final SubLObject why_not_el_sentence_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result1 = NIL;
                SubLObject result2 = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject res1 = cycl_grammar.why_not_cycl_sentence(v_object);
                            SubLObject res2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result1 = res1;
                            result2 = res2;
                        }
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result1, result2);
            }
        }
    }

    // Definitions
    /**
     * Like @xref why-not-sentence except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref why-not-sentence except it only permits EL constructs.")
    public static SubLObject why_not_el_sentence(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result1 = NIL;
        SubLObject result2 = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject res1 = cycl_grammar.why_not_cycl_sentence(v_object);
            final SubLObject res2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result1 = res1;
            result2 = res2;
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return values(result1, result2);
    }

    /**
     * Like @xref cycl-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-sentence-p except it only permits EL constructs.")
    public static SubLObject el_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-sentence-p except it only permits EL constructs.
     */


    /**
     * returns t iff SENTENCE is an EL sentence, but not an EL formula.
     * currently (11/9/99) the only such animals are #$True, #$False, and EL variables.
     */
    @LispMethod(comment = "returns t iff SENTENCE is an EL sentence, but not an EL formula.\r\ncurrently (11/9/99) the only such animals are #$True, #$False, and EL variables.\nreturns t iff SENTENCE is an EL sentence, but not an EL formula.\ncurrently (11/9/99) the only such animals are #$True, #$False, and EL variables.")
    public static final SubLObject el_non_formula_sentence_p_alt(SubLObject sentence) {
        return makeBoolean((NIL == el_formula_p(sentence)) && (NIL != com.cyc.cycjava.cycl.el_grammar.el_sentence_p(sentence)));
    }

    @LispMethod(comment = "returns t iff SENTENCE is an EL sentence, but not an EL formula.\r\ncurrently (11/9/99) the only such animals are #$True, #$False, and EL variables.\nreturns t iff SENTENCE is an EL sentence, but not an EL formula.\ncurrently (11/9/99) the only such animals are #$True, #$False, and EL variables.")
    public static SubLObject el_non_formula_sentence_p(final SubLObject sentence) {
        return makeBoolean((NIL == el_formula_p(sentence)) && (NIL != el_sentence_p(sentence)));
    }/**
     * returns t iff SENTENCE is an EL sentence, but not an EL formula.
     * currently (11/9/99) the only such animals are #$True, #$False, and EL variables.
     */


    /**
     * returns t iff SENTENCE is a CycL sentence, but not an EL formula.
     * currently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.
     */
    @LispMethod(comment = "returns t iff SENTENCE is a CycL sentence, but not an EL formula.\r\ncurrently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.\nreturns t iff SENTENCE is a CycL sentence, but not an EL formula.\ncurrently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.")
    public static final SubLObject non_el_formula_sentence_p_alt(SubLObject sentence) {
        return makeBoolean((NIL == el_formula_p(sentence)) && (NIL != cycl_grammar.cycl_sentence_p(sentence)));
    }

    @LispMethod(comment = "returns t iff SENTENCE is a CycL sentence, but not an EL formula.\r\ncurrently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.\nreturns t iff SENTENCE is a CycL sentence, but not an EL formula.\ncurrently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.")
    public static SubLObject non_el_formula_sentence_p(final SubLObject sentence) {
        return makeBoolean((NIL == el_formula_p(sentence)) && (NIL != cycl_grammar.cycl_sentence_p(sentence)));
    }/**
     * returns t iff SENTENCE is a CycL sentence, but not an EL formula.
     * currently (11/9/99) the only such animals are #$True, #$False, variables, and some HL constructs.
     */


    /**
     * Like @xref cycl-sentence-sequence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-sentence-sequence-p except it only permits EL constructs.")
    public static final SubLObject el_sentence_sequence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_sentence_sequence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-sentence-sequence-p except it only permits EL constructs.")
    public static SubLObject el_sentence_sequence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_sentence_sequence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-sentence-sequence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-unary-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-unary-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_unary_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_unary_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-unary-sentence-p except it only permits EL constructs.")
    public static SubLObject el_unary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_unary_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-unary-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-binary-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-binary-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_binary_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_binary_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-binary-sentence-p except it only permits EL constructs.")
    public static SubLObject el_binary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_binary_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-binary-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-ternary-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-ternary-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_ternary_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_ternary_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-ternary-sentence-p except it only permits EL constructs.")
    public static SubLObject el_ternary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_ternary_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-ternary-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-quaternary-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-quaternary-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_quaternary_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_quaternary_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-quaternary-sentence-p except it only permits EL constructs.")
    public static SubLObject el_quaternary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_quaternary_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-quaternary-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-quintary-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-quintary-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_quintary_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_quintary_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-quintary-sentence-p except it only permits EL constructs.")
    public static SubLObject el_quintary_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_quintary_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-quintary-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-variable-arity-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-variable-arity-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_variable_arity_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_variable_arity_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-variable-arity-sentence-p except it only permits EL constructs.")
    public static SubLObject el_variable_arity_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_variable_arity_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-variable-arity-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-regularly-quantified-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-regularly-quantified-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_regularly_quantified_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_regularly_quantified_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-regularly-quantified-sentence-p except it only permits EL constructs.")
    public static SubLObject el_regularly_quantified_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_regularly_quantified_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-regularly-quantified-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-bounded-existential-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-bounded-existential-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_bounded_existential_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_bounded_existential_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-bounded-existential-sentence-p except it only permits EL constructs.")
    public static SubLObject el_bounded_existential_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_bounded_existential_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-bounded-existential-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-quantified-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-quantified-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_quantified_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_quantified_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-quantified-sentence-p except it only permits EL constructs.")
    public static SubLObject el_quantified_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_quantified_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-quantified-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-literal-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-literal-p except it only permits EL constructs.")
    public static final SubLObject el_literal_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_literal_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-literal-p except it only permits EL constructs.")
    public static SubLObject el_literal_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_literal_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-literal-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-atomic-sentence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-atomic-sentence-p except it only permits EL constructs.")
    public static final SubLObject el_atomic_sentence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_atomic_sentence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-atomic-sentence-p except it only permits EL constructs.")
    public static SubLObject el_atomic_sentence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_atomic_sentence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-atomic-sentence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-argument-sequence-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-argument-sequence-p except it only permits EL constructs.")
    public static final SubLObject el_argument_sequence_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_argument_sequence_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-argument-sequence-p except it only permits EL constructs.")
    public static SubLObject el_argument_sequence_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_argument_sequence_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-argument-sequence-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-predicate-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-predicate-p except it only permits EL constructs.")
    public static final SubLObject el_predicate_syntax_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_predicate_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-predicate-p except it only permits EL constructs.")
    public static SubLObject el_predicate_syntax_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_predicate_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-predicate-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-nat-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-nat-p except it only permits EL constructs.")
    public static final SubLObject el_nat_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_nat_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-nat-p except it only permits EL constructs.")
    public static SubLObject el_nat_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_nat_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-nat-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-function-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-function-p except it only permits EL constructs.")
    public static final SubLObject el_function_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_function_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-function-p except it only permits EL constructs.")
    public static SubLObject el_function_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_function_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-function-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-expression-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-expression-p except it only permits EL constructs.")
    public static final SubLObject el_expression_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_expression_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-expression-p except it only permits EL constructs.")
    public static SubLObject el_expression_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_expression_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-expression-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-term-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-term-p except it only permits EL constructs.")
    public static final SubLObject el_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_term_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-term-p except it only permits EL constructs.")
    public static SubLObject el_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_term_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-term-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-denotational-term-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-denotational-term-p except it only permits EL constructs.")
    public static final SubLObject el_denotational_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_denotational_term_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-denotational-term-p except it only permits EL constructs.")
    public static SubLObject el_denotational_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_denotational_term_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-denotational-term-p except it only permits EL constructs.
     */


    /**
     * Like @xref cycl-represented-term-p except it only permits EL constructs.
     */
    @LispMethod(comment = "Like @xref cycl-represented-term-p except it only permits EL constructs.")
    public static final SubLObject el_represented_term_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
                    try {
                        cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
                        result = cycl_grammar.cycl_represented_term_p(v_object);
                    } finally {
                        cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Like @xref cycl-represented-term-p except it only permits EL constructs.")
    public static SubLObject el_represented_term_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_hlP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_permits_hlP$.bind(NIL, thread);
            result = cycl_grammar.cycl_represented_term_p(v_object);
        } finally {
            cycl_grammar.$grammar_permits_hlP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Like @xref cycl-represented-term-p except it only permits EL constructs.
     */


    public static SubLObject declare_el_grammar_file() {
        declareFunction("why_not_el_sentence", "WHY-NOT-EL-SENTENCE", 1, 0, false);
        declareFunction("el_sentence_p", "EL-SENTENCE-P", 1, 0, false);
        declareFunction("el_non_formula_sentence_p", "EL-NON-FORMULA-SENTENCE-P", 1, 0, false);
        declareFunction("non_el_formula_sentence_p", "NON-EL-FORMULA-SENTENCE-P", 1, 0, false);
        declareFunction("el_sentence_sequence_p", "EL-SENTENCE-SEQUENCE-P", 1, 0, false);
        declareFunction("el_unary_sentence_p", "EL-UNARY-SENTENCE-P", 1, 0, false);
        declareFunction("el_binary_sentence_p", "EL-BINARY-SENTENCE-P", 1, 0, false);
        declareFunction("el_ternary_sentence_p", "EL-TERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("el_quaternary_sentence_p", "EL-QUATERNARY-SENTENCE-P", 1, 0, false);
        declareFunction("el_quintary_sentence_p", "EL-QUINTARY-SENTENCE-P", 1, 0, false);
        declareFunction("el_variable_arity_sentence_p", "EL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
        declareFunction("el_regularly_quantified_sentence_p", "EL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("el_bounded_existential_sentence_p", "EL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
        declareFunction("el_quantified_sentence_p", "EL-QUANTIFIED-SENTENCE-P", 1, 0, false);
        declareFunction("el_literal_p", "EL-LITERAL-P", 1, 0, false);
        declareFunction("el_atomic_sentence_p", "EL-ATOMIC-SENTENCE-P", 1, 0, false);
        declareFunction("el_argument_sequence_p", "EL-ARGUMENT-SEQUENCE-P", 1, 0, false);
        declareFunction("el_predicate_syntax_p", "EL-PREDICATE-SYNTAX-P", 1, 0, false);
        declareFunction("el_nat_p", "EL-NAT-P", 1, 0, false);
        declareFunction("el_function_p", "EL-FUNCTION-P", 1, 0, false);
        declareFunction("el_expression_p", "EL-EXPRESSION-P", 1, 0, false);
        declareFunction("el_term_p", "EL-TERM-P", 1, 0, false);
        declareFunction("el_denotational_term_p", "EL-DENOTATIONAL-TERM-P", 1, 0, false);
        declareFunction("el_represented_term_p", "EL-REPRESENTED-TERM-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_el_grammar_file() {
        return NIL;
    }

    public static SubLObject setup_el_grammar_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_el_grammar_file();
    }

    @Override
    public void initializeVariables() {
        init_el_grammar_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_el_grammar_file();
    }

    static {
    }
}

/**
 * Total time: 921 ms
 */
