package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_sentence_communicator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.rkf_sentence_communicator.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rkf_sentence_communicator extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_sentence_communicator();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_sentence_communicator";

    public static final String myFingerPrint = "04aa5896d2d6490a7fc3ce5982f5aac457eef7d3e23c42e1c3e9a987b4205cb6";

















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

    public static SubLObject rkf_sentence_phrase_precise(final SubLObject sentence, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
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
    }

    public static SubLObject rkf_html_sentence_phrase_precise(final SubLObject sentence, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
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
    }

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
    }

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
    }

    public static SubLObject rkf_formula_string(final SubLObject formula) {
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return pph_main.generate_phrase(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return pph_main.generate_text(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_support_string(final SubLObject support) {
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        if (NIL != assertion_handles.assertion_p(support)) {
            return rkf_assertion_string(support);
        }
        return rkf_formula_string(arguments.support_formula(support));
    }

    public static SubLObject rkf_assertion_string(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return rkf_formula_string(uncanonicalizer.assertion_el_formula(assertion));
    }

    public static SubLObject declare_rkf_sentence_communicator_file() {
        declareFunction(me, "rkf_sentence_phrase", "RKF-SENTENCE-PHRASE", 3, 1, false);
        declareFunction(me, "rkf_sentence_phrase_precise", "RKF-SENTENCE-PHRASE-PRECISE", 3, 0, false);
        declareFunction(me, "rkf_query_phrase", "RKF-QUERY-PHRASE", 3, 2, false);
        declareFunction(me, "rkf_imperative_phrase", "RKF-IMPERATIVE-PHRASE", 3, 2, false);
        declareFunction(me, "rkf_html_sentence_phrase", "RKF-HTML-SENTENCE-PHRASE", 3, 2, false);
        declareFunction(me, "rkf_html_sentence_phrase_precise", "RKF-HTML-SENTENCE-PHRASE-PRECISE", 3, 2, false);
        declareFunction(me, "rkf_html_query_phrase", "RKF-HTML-QUERY-PHRASE", 3, 3, false);
        declareFunction(me, "rkf_html_imperative_phrase", "RKF-HTML-IMPERATIVE-PHRASE", 3, 3, false);
        declareFunction(me, "rkf_formula_string", "RKF-FORMULA-STRING", 1, 0, false);
        declareFunction(me, "rkf_support_string", "RKF-SUPPORT-STRING", 1, 0, false);
        declareFunction(me, "rkf_assertion_string", "RKF-ASSERTION-STRING", 1, 0, false);
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

    static {









    }
}

/**
 * Total time: 118 ms
 */
