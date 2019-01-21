package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_sentence_communicator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_sentence_communicator";
    public static final String myFingerPrint = "04aa5896d2d6490a7fc3ce5982f5aac457eef7d3e23c42e1c3e9a987b4205cb6";
    private static final SubLSymbol $kw0$TEXT;
    private static final SubLSymbol $kw1$DECLARATIVE;
    private static final SubLSymbol $sym2$PPH_PRECISION_P;
    private static final SubLSymbol $kw3$QUESTION;
    private static final SubLSymbol $kw4$IMPERATIVE;
    private static final SubLSymbol $kw5$HTML;
    private static final SubLSymbol $sym6$SUPPORT_P;
    private static final SubLSymbol $sym7$ASSERTION_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 830L)
    public static SubLObject rkf_sentence_phrase(final SubLObject sentence, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode) {
        if (paraphrase_mode == rkf_sentence_communicator.UNPROVIDED) {
            paraphrase_mode = (SubLObject)rkf_sentence_communicator.$kw0$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind((SubLObject)rkf_sentence_communicator.NIL, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(sentence, language_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw1$DECLARATIVE, paraphrase_mode);
        }
        finally {
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 1379L)
    public static SubLObject rkf_sentence_phrase_precise(final SubLObject sentence, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        assert rkf_sentence_communicator.NIL != pph_utilities.pph_precision_p((SubLObject)rkf_sentence_communicator.T) : rkf_sentence_communicator.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)rkf_sentence_communicator.T, thread);
            pph_vars.$pph_ambiguous_strings$.bind((rkf_sentence_communicator.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rkf_sentence_communicator.EQUALP), (SubLObject)rkf_sentence_communicator.UNPROVIDED), thread);
            phrase = rkf_sentence_phrase(sentence, language_mt, domain_mt, (SubLObject)rkf_sentence_communicator.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 1663L)
    public static SubLObject rkf_query_phrase(final SubLObject query, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == rkf_sentence_communicator.UNPROVIDED) {
            paraphrase_mode = (SubLObject)rkf_sentence_communicator.$kw0$TEXT;
        }
        if (use_blanksP == rkf_sentence_communicator.UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind((SubLObject)rkf_sentence_communicator.NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(query, language_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw3$QUESTION, paraphrase_mode);
        }
        finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_2, thread);
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 2130L)
    public static SubLObject rkf_imperative_phrase(final SubLObject imperative, final SubLObject language_mt, final SubLObject domain_mt, SubLObject paraphrase_mode, SubLObject use_blanksP) {
        if (paraphrase_mode == rkf_sentence_communicator.UNPROVIDED) {
            paraphrase_mode = (SubLObject)rkf_sentence_communicator.$kw0$TEXT;
        }
        if (use_blanksP == rkf_sentence_communicator.UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$rkf_prefer_nouns_for_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            pph_vars.$rkf_prefer_nouns_for_termsP$.bind((SubLObject)rkf_sentence_communicator.NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind(use_blanksP, thread);
            phrase = rkf_concept_communicator.rkf_term_phrase(imperative, language_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw4$IMPERATIVE, paraphrase_mode);
        }
        finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_2, thread);
            pph_vars.$rkf_prefer_nouns_for_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 2611L)
    public static SubLObject rkf_html_sentence_phrase(final SubLObject sentence, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == rkf_sentence_communicator.UNPROVIDED) {
            function = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (target == rkf_sentence_communicator.UNPROVIDED) {
            target = (SubLObject)rkf_sentence_communicator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind((rkf_sentence_communicator.NIL != function) ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind((rkf_sentence_communicator.NIL != target) ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_sentence_phrase(sentence, generation_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw5$HTML);
        }
        finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 2956L)
    public static SubLObject rkf_html_sentence_phrase_precise(final SubLObject sentence, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target) {
        if (function == rkf_sentence_communicator.UNPROVIDED) {
            function = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (target == rkf_sentence_communicator.UNPROVIDED) {
            target = (SubLObject)rkf_sentence_communicator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        assert rkf_sentence_communicator.NIL != pph_utilities.pph_precision_p((SubLObject)rkf_sentence_communicator.T) : rkf_sentence_communicator.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)rkf_sentence_communicator.T, thread);
            pph_vars.$pph_ambiguous_strings$.bind((rkf_sentence_communicator.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rkf_sentence_communicator.EQUALP), (SubLObject)rkf_sentence_communicator.UNPROVIDED), thread);
            phrase = rkf_html_sentence_phrase(sentence, generation_mt, domain_mt, function, target);
        }
        finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 3288L)
    public static SubLObject rkf_html_query_phrase(final SubLObject query, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == rkf_sentence_communicator.UNPROVIDED) {
            function = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (target == rkf_sentence_communicator.UNPROVIDED) {
            target = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (use_blanksP == rkf_sentence_communicator.UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind((rkf_sentence_communicator.NIL != function) ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind((rkf_sentence_communicator.NIL != target) ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_query_phrase(query, generation_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw5$HTML, use_blanksP);
        }
        finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 3657L)
    public static SubLObject rkf_html_imperative_phrase(final SubLObject imperative, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject function, SubLObject target, SubLObject use_blanksP) {
        if (function == rkf_sentence_communicator.UNPROVIDED) {
            function = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (target == rkf_sentence_communicator.UNPROVIDED) {
            target = (SubLObject)rkf_sentence_communicator.NIL;
        }
        if (use_blanksP == rkf_sentence_communicator.UNPROVIDED) {
            use_blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_sentence_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind((rkf_sentence_communicator.NIL != function) ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind((rkf_sentence_communicator.NIL != target) ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = rkf_imperative_phrase(imperative, generation_mt, domain_mt, (SubLObject)rkf_sentence_communicator.$kw5$HTML, use_blanksP);
        }
        finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 4054L)
    public static SubLObject rkf_formula_string(final SubLObject formula) {
        if (rkf_sentence_communicator.NIL != term.nautP(formula, (SubLObject)rkf_sentence_communicator.UNPROVIDED)) {
            return pph_main.generate_phrase(formula, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED);
        }
        return pph_main.generate_text(formula, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED, (SubLObject)rkf_sentence_communicator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 4434L)
    public static SubLObject rkf_support_string(final SubLObject support) {
        assert rkf_sentence_communicator.NIL != arguments.support_p(support) : support;
        if (rkf_sentence_communicator.NIL != assertion_handles.assertion_p(support)) {
            return rkf_assertion_string(support);
        }
        return rkf_formula_string(arguments.support_formula(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-sentence-communicator.lisp", position = 4647L)
    public static SubLObject rkf_assertion_string(final SubLObject assertion) {
        assert rkf_sentence_communicator.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return rkf_formula_string(uncanonicalizer.assertion_el_formula(assertion));
    }
    
    public static SubLObject declare_rkf_sentence_communicator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_sentence_phrase", "RKF-SENTENCE-PHRASE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_sentence_phrase_precise", "RKF-SENTENCE-PHRASE-PRECISE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_query_phrase", "RKF-QUERY-PHRASE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_imperative_phrase", "RKF-IMPERATIVE-PHRASE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_html_sentence_phrase", "RKF-HTML-SENTENCE-PHRASE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_html_sentence_phrase_precise", "RKF-HTML-SENTENCE-PHRASE-PRECISE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_html_query_phrase", "RKF-HTML-QUERY-PHRASE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_html_imperative_phrase", "RKF-HTML-IMPERATIVE-PHRASE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_formula_string", "RKF-FORMULA-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_support_string", "RKF-SUPPORT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_sentence_communicator", "rkf_assertion_string", "RKF-ASSERTION-STRING", 1, 0, false);
        return (SubLObject)rkf_sentence_communicator.NIL;
    }
    
    public static SubLObject init_rkf_sentence_communicator_file() {
        return (SubLObject)rkf_sentence_communicator.NIL;
    }
    
    public static SubLObject setup_rkf_sentence_communicator_file() {
        return (SubLObject)rkf_sentence_communicator.NIL;
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
        me = (SubLFile)new rkf_sentence_communicator();
        $kw0$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw1$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $sym2$PPH_PRECISION_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $kw3$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $kw4$IMPERATIVE = SubLObjectFactory.makeKeyword("IMPERATIVE");
        $kw5$HTML = SubLObjectFactory.makeKeyword("HTML");
        $sym6$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym7$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
    }
}

/*

	Total time: 118 ms
	
*/