/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-SENTENCE-COMMUNICATOR
 * source file: /cyc/top/cycl/rkf-sentence-communicator.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_sentence_communicator extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_sentence_communicator();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_sentence_communicator";


    // Definitions
    /**
     * Return the most natural phrase for CycL SENTENCE in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL SENTENCE in a context where its meaning is clear.")
    public static final SubLObject rkf_sentence_phrase_alt(SubLObject sentence, SubLObject language_mt, SubLObject domain_mt, SubLObject paraphrase_mode) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
                    try {
                        pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
                        phrase = rkf_concept_communicator.rkf_term_phrase(sentence, language_mt, domain_mt, $DECLARATIVE, paraphrase_mode);
                    } finally {
                        pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    // Definitions
    /**
     * Return the most natural phrase for CycL SENTENCE in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL SENTENCE in a context where its meaning is clear.")
    public static SubLObject rkf_sentence_phrase(final SubLObject sentence, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(sentence, language_mt, domain_mt, $DECLARATIVE, paraphrase_mode);
        } finally {
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     * Generate a precise phrase for CycL SENTENCE out of context.
     */
    @LispMethod(comment = "Generate a precise phrase for CycL SENTENCE out of context.")
    public static final SubLObject rkf_sentence_phrase_precise_alt(SubLObject sentence, SubLObject language_mt, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                SubLTrampolineFile.checkType(T, PPH_PRECISION_P);
                {
                    SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(T, thread);
                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                        phrase = com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_sentence_phrase(sentence, language_mt, domain_mt, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_1, thread);
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    /**
     * Generate a precise phrase for CycL SENTENCE out of context.
     */
    @LispMethod(comment = "Generate a precise phrase for CycL SENTENCE out of context.")
    public static SubLObject rkf_sentence_phrase_precise(final SubLObject sentence, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "! pph_utilities.pph_precision_p( .T) " + ("pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) ") + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            phrase = rkf_sentence_phrase(sentence, language_mt, domain_mt, UNPROVIDED);
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     * Return the most natural phrase for CycL QUERY in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL QUERY in a context where its meaning is clear.")
    public static final SubLObject rkf_query_phrase_alt(SubLObject query, SubLObject language_mt, SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
                        pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
                        phrase = rkf_concept_communicator.rkf_term_phrase(query, language_mt, domain_mt, $QUESTION, paraphrase_mode);
                    } finally {
                        pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_1, thread);
                        pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    /**
     * Return the most natural phrase for CycL QUERY in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL QUERY in a context where its meaning is clear.")
    public static SubLObject rkf_query_phrase(final SubLObject query, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(query, language_mt, domain_mt, $QUESTION, paraphrase_mode);
        } finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_2, thread);
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     * Return the most natural phrase for CycL IMPERATIVE in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL IMPERATIVE in a context where its meaning is clear.")
    public static final SubLObject rkf_imperative_phrase_alt(SubLObject imperative, SubLObject language_mt, SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
                        pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
                        phrase = rkf_concept_communicator.rkf_term_phrase(imperative, language_mt, domain_mt, $IMPERATIVE, paraphrase_mode);
                    } finally {
                        pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_1, thread);
                        pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    /**
     * Return the most natural phrase for CycL IMPERATIVE in a context where its meaning is clear.
     */
    @LispMethod(comment = "Return the most natural phrase for CycL IMPERATIVE in a context where its meaning is clear.")
    public static SubLObject rkf_imperative_phrase(final SubLObject imperative, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == UNPROVIDED) {
            paraphrase_mode = $TEXT;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind(NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(imperative, language_mt, domain_mt, $IMPERATIVE, paraphrase_mode);
        } finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_2, thread);
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     * Return an HTML form of rkf-sentence-phrase.
     */
    @LispMethod(comment = "Return an HTML form of rkf-sentence-phrase.")
    public static final SubLObject rkf_html_sentence_phrase_alt(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                        phrase = com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_sentence_phrase(sentence, generation_mt, domain_mt, $HTML);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    @LispMethod(comment = "Return an HTML form of rkf-sentence-phrase.")
    public static SubLObject rkf_html_sentence_phrase(final SubLObject sentence, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind(NIL != function ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_sentence_phrase(sentence, generation_mt, domain_mt, $HTML);
        } finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }/**
     * Return an HTML form of rkf-sentence-phrase.
     */


    /**
     * Return an HTML form of rkf-sentence-phrase-precise.
     */
    @LispMethod(comment = "Return an HTML form of rkf-sentence-phrase-precise.")
    public static final SubLObject rkf_html_sentence_phrase_precise_alt(SubLObject sentence, SubLObject generation_mt, SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                SubLTrampolineFile.checkType(T, PPH_PRECISION_P);
                {
                    SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(T, thread);
                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                        phrase = com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_html_sentence_phrase(sentence, generation_mt, domain_mt, function, target);
                    } finally {
                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_1, thread);
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    @LispMethod(comment = "Return an HTML form of rkf-sentence-phrase-precise.")
    public static SubLObject rkf_html_sentence_phrase_precise(final SubLObject sentence, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "! pph_utilities.pph_precision_p( .T) " + ("pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) ") + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            phrase = rkf_html_sentence_phrase(sentence, generation_mt, domain_mt, function, target);
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }/**
     * Return an HTML form of rkf-sentence-phrase-precise.
     */


    /**
     * Return an HTML form of rkf-query-phrase.
     */
    @LispMethod(comment = "Return an HTML form of rkf-query-phrase.")
    public static final SubLObject rkf_html_query_phrase_alt(SubLObject query, SubLObject generation_mt, SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                        phrase = com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_query_phrase(query, generation_mt, domain_mt, $HTML, use_blanksP);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    @LispMethod(comment = "Return an HTML form of rkf-query-phrase.")
    public static SubLObject rkf_html_query_phrase(final SubLObject query, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind(NIL != function ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_query_phrase(query, generation_mt, domain_mt, $HTML, use_blanksP);
        } finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }/**
     * Return an HTML form of rkf-query-phrase.
     */


    /**
     * Return an HTML form of rkf-imperative-phrase.
     */
    @LispMethod(comment = "Return an HTML form of rkf-imperative-phrase.")
    public static final SubLObject rkf_html_imperative_phrase_alt(SubLObject imperative, SubLObject generation_mt, SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$constant_link_function$.bind(NIL != function ? ((SubLObject) (function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                        pph_vars.$html_generation_target$.bind(NIL != target ? ((SubLObject) (target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                        phrase = com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_imperative_phrase(imperative, generation_mt, domain_mt, $HTML, use_blanksP);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_1, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrase;
            }
        }
    }

    @LispMethod(comment = "Return an HTML form of rkf-imperative-phrase.")
    public static SubLObject rkf_html_imperative_phrase(final SubLObject imperative, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind(NIL != function ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_imperative_phrase(imperative, generation_mt, domain_mt, $HTML, use_blanksP);
        } finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }/**
     * Return an HTML form of rkf-imperative-phrase.
     */


    public static final SubLObject rkf_formula_string_alt(SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return pph_main.generate_phrase(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return pph_main.generate_text(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_formula_string(final SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return pph_main.generate_phrase(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return pph_main.generate_text(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_support_string_alt(SubLObject support) {
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        if (NIL != assertion_handles.assertion_p(support)) {
            return com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_assertion_string(support);
        } else {
            return com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_formula_string(arguments.support_formula(support));
        }
    }

    public static SubLObject rkf_support_string(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        if (NIL != assertion_handles.assertion_p(support)) {
            return rkf_assertion_string(support);
        }
        return rkf_formula_string(arguments.support_formula(support));
    }

    public static final SubLObject rkf_assertion_string_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return com.cyc.cycjava.cycl.rkf_sentence_communicator.rkf_formula_string(uncanonicalizer.assertion_el_formula(assertion));
    }

    public static SubLObject rkf_assertion_string(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        return rkf_formula_string(uncanonicalizer.assertion_el_formula(assertion));
    }

    public static SubLObject declare_rkf_sentence_communicator_file() {
        declareFunction("rkf_sentence_phrase", "RKF-SENTENCE-PHRASE", 3, 1, false);
        declareFunction("rkf_sentence_phrase_precise", "RKF-SENTENCE-PHRASE-PRECISE", 3, 0, false);
        declareFunction("rkf_query_phrase", "RKF-QUERY-PHRASE", 3, 2, false);
        declareFunction("rkf_imperative_phrase", "RKF-IMPERATIVE-PHRASE", 3, 2, false);
        declareFunction("rkf_html_sentence_phrase", "RKF-HTML-SENTENCE-PHRASE", 3, 2, false);
        declareFunction("rkf_html_sentence_phrase_precise", "RKF-HTML-SENTENCE-PHRASE-PRECISE", 3, 2, false);
        declareFunction("rkf_html_query_phrase", "RKF-HTML-QUERY-PHRASE", 3, 3, false);
        declareFunction("rkf_html_imperative_phrase", "RKF-HTML-IMPERATIVE-PHRASE", 3, 3, false);
        declareFunction("rkf_formula_string", "RKF-FORMULA-STRING", 1, 0, false);
        declareFunction("rkf_support_string", "RKF-SUPPORT-STRING", 1, 0, false);
        declareFunction("rkf_assertion_string", "RKF-ASSERTION-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_sentence_communicator_file() {
        return NIL;
    }

    public static SubLObject setup_rkf_sentence_communicator_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_sentence_communicator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_sentence_communicator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_sentence_communicator_file();
    }

    
}

/**
 * Total time: 118 ms
 */
