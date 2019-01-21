package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class string_typing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.string_typing";
    public static final String myFingerPrint = "1003f6b995c10650da85c94b0149c145d3a1436b6c364e4a2070217bd918ac45";
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLSymbol $kw1$UNKNOWN;
    private static final SubLSymbol $kw2$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym3$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym4$_EXIT;
    private static final SubLSymbol $kw5$COLLECTION;
    private static final SubLSymbol $sym6$STANFORD_NER;
    private static final SubLSymbol $sym7$NEW;
    private static final SubLSymbol $sym8$RUN;
    private static final SubLSymbol $sym9$GET_TYPE;
    private static final SubLSymbol $sym10$QUOTE;
    private static final SubLSymbol $sym11$PERSON;
    private static final SubLSymbol $kw12$INDIVIDUAL;
    private static final SubLSymbol $sym13$ORGANIZATION;
    private static final SubLSymbol $sym14$LOCATION;
    private static final SubLSymbol $sym15$DATE;
    private static final SubLSymbol $sym16$GET_STRING;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$GET;
    private static final SubLSymbol $kw19$DENOT;
    private static final SubLObject $const20$InferencePSC;
    private static final SubLObject $const21$or;
    private static final SubLObject $const22$noNotableInstances;
    private static final SubLObject $const23$instancesDontNeedLexification;
    private static final SubLSymbol $kw24$IN;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$CCONCATENATE;
    private static final SubLSymbol $sym28$NEW_LINIFY;
    private static final SubLString $str29$lynx;
    private static final SubLString $str30$_dump;
    private static final SubLString $str31$number_of_sample_elements__a_exce;
    private static final SubLObject $const32$EnglishMt;
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 1001L)
    public static SubLObject type_string(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert string_typing.NIL != Types.stringp(word) : word;
        SubLObject type = type_string_cyc(word);
        if (!type.eql((SubLObject)string_typing.$kw1$UNKNOWN)) {
            return type;
        }
        type = type_string_ner(word);
        if (!type.eql((SubLObject)string_typing.$kw1$UNKNOWN)) {
            return type;
        }
        SubLObject ignore_errors_tag = (SubLObject)string_typing.NIL;
        try {
            thread.throwStack.push(string_typing.$kw2$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)string_typing.$sym3$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (string_typing.NIL != phraseP(word)) {
                        final SubLObject head_word = get_np_head(word);
                        if (string_typing.NIL != string_utilities_lexical.every_word_starts_with_capitalP(word)) {
                            final SubLObject type2 = type_string_cyc(head_word);
                            return type2;
                        }
                        if (string_typing.NIL != head_only_admits_collectionsP(head_word, (SubLObject)string_typing.UNPROVIDED)) {
                            return (SubLObject)string_typing.$kw5$COLLECTION;
                        }
                        return (SubLObject)string_typing.$kw1$UNKNOWN;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)string_typing.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)string_typing.$kw2$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)string_typing.$kw1$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 1856L)
    public static SubLObject type_string_ner(final SubLObject word) {
        final SubLObject ner = methods.funcall_class_method_with_0_args((SubLObject)string_typing.$sym6$STANFORD_NER, (SubLObject)string_typing.$sym7$NEW);
        final SubLObject named_entities = methods.funcall_instance_method_with_1_args(ner, (SubLObject)string_typing.$sym8$RUN, word);
        if (string_typing.NIL != list_utilities.singletonP(named_entities)) {
            final SubLObject pcase_var;
            final SubLObject type = pcase_var = methods.funcall_instance_method_with_0_args(named_entities.first().first(), (SubLObject)string_typing.$sym9$GET_TYPE);
            if (pcase_var.eql((SubLObject)string_typing.$sym10$QUOTE) || pcase_var.eql((SubLObject)string_typing.$sym11$PERSON)) {
                return (SubLObject)string_typing.$kw12$INDIVIDUAL;
            }
            if (pcase_var.eql((SubLObject)string_typing.$sym10$QUOTE) || pcase_var.eql((SubLObject)string_typing.$sym13$ORGANIZATION)) {
                return (SubLObject)string_typing.$kw12$INDIVIDUAL;
            }
            if (pcase_var.eql((SubLObject)string_typing.$sym10$QUOTE) || pcase_var.eql((SubLObject)string_typing.$sym14$LOCATION)) {
                return (SubLObject)string_typing.$kw12$INDIVIDUAL;
            }
            if (pcase_var.eql((SubLObject)string_typing.$sym10$QUOTE) || pcase_var.eql((SubLObject)string_typing.$sym15$DATE)) {
                return (SubLObject)string_typing.$kw12$INDIVIDUAL;
            }
            return (SubLObject)string_typing.$kw1$UNKNOWN;
        }
        else {
            if (string_typing.NIL != list_utilities.doubletonP(named_entities) && methods.funcall_instance_method_with_0_args(conses_high.second(named_entities).first(), (SubLObject)string_typing.$sym9$GET_TYPE).eql((SubLObject)string_typing.$sym11$PERSON) && string_typing.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(named_entities.first().first(), (SubLObject)string_typing.$sym16$GET_STRING), (SubLObject)string_typing.$list17, (SubLObject)string_typing.EQUALP, (SubLObject)string_typing.UNPROVIDED)) {
                return (SubLObject)string_typing.$kw12$INDIVIDUAL;
            }
            return (SubLObject)string_typing.$kw1$UNKNOWN;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 4021L)
    public static SubLObject type_string_cyc(final SubLObject word) {
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject types = (SubLObject)string_typing.NIL;
        SubLObject denot = (SubLObject)string_typing.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)string_typing.$sym18$GET, word);
        SubLObject lex = (SubLObject)string_typing.NIL;
        lex = cdolist_list_var.first();
        while (string_typing.NIL != cdolist_list_var) {
            denot = methods.funcall_instance_method_with_1_args(lex, (SubLObject)string_typing.$sym18$GET, (SubLObject)string_typing.$kw19$DENOT);
            if (string_typing.NIL != fort_types_interface.collection_in_any_mtP(denot)) {
                types = (SubLObject)ConsesLow.cons((SubLObject)string_typing.$kw5$COLLECTION, types);
            }
            else if (string_typing.NIL == fort_types_interface.functorP(denot)) {
                if (string_typing.NIL == fort_types_interface.predicateP(denot)) {
                    if (string_typing.NIL != kb_accessors.individualP(denot)) {
                        types = (SubLObject)ConsesLow.cons((SubLObject)string_typing.$kw12$INDIVIDUAL, types);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        }
        if (string_typing.NIL != types) {
            final SubLObject frequent = most_frequent(types);
            final SubLObject tag = (SubLObject)((string_typing.NIL != list_utilities.singletonP(frequent)) ? frequent.first() : string_typing.$kw1$UNKNOWN);
            return tag;
        }
        return (SubLObject)string_typing.$kw1$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 4650L)
    public static SubLObject head_only_admits_collectionsP(final SubLObject head, SubLObject mt) {
        if (mt == string_typing.UNPROVIDED) {
            mt = string_typing.$const20$InferencePSC;
        }
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject denot = (SubLObject)string_typing.NIL;
        final SubLObject value_set = (SubLObject)string_typing.T;
        SubLObject allows_individualsP = (SubLObject)string_typing.NIL;
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)string_typing.$sym18$GET, head);
        if (string_typing.NIL == lex_entries) {
            return (SubLObject)string_typing.NIL;
        }
        if (string_typing.NIL == allows_individualsP) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)string_typing.$sym18$GET, head);
            SubLObject lex = (SubLObject)string_typing.NIL;
            lex = csome_list_var.first();
            while (string_typing.NIL == allows_individualsP && string_typing.NIL != csome_list_var) {
                denot = methods.funcall_instance_method_with_1_args(lex, (SubLObject)string_typing.$sym18$GET, (SubLObject)string_typing.$kw19$DENOT);
                if (string_typing.NIL == builder_utilities.higher_order_collectionP(denot) && string_typing.NIL == dont_make_instancesP(denot, mt)) {
                    allows_individualsP = (SubLObject)string_typing.T;
                }
                csome_list_var = csome_list_var.rest();
                lex = csome_list_var.first();
            }
        }
        return (SubLObject)((string_typing.NIL != value_set) ? SubLObjectFactory.makeBoolean(string_typing.NIL == allows_individualsP) : string_typing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5452L)
    public static SubLObject dont_make_instancesP(final SubLObject v_term, SubLObject mt) {
        if (mt == string_typing.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return ask_utilities.query_boolean((SubLObject)ConsesLow.list(string_typing.$const21$or, (SubLObject)ConsesLow.list(string_typing.$const22$noNotableInstances, v_term), (SubLObject)ConsesLow.list(string_typing.$const23$instancesDontNeedLexification, v_term)), mt, (SubLObject)string_typing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5630L)
    public static SubLObject phraseP(final SubLObject word) {
        return Numbers.numG(Sequences.length(string_utilities.split_string(word, (SubLObject)string_typing.UNPROVIDED)), (SubLObject)string_typing.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 5784L)
    public static SubLObject get_np_head(final SubLObject phrase) {
        final SubLObject head = get_np_head_tagged(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(phrase, (SubLObject)string_typing.UNPROVIDED)));
        return (string_typing.NIL != head) ? document.word_string(head) : conses_high.last(string_utilities.split_string(phrase, (SubLObject)string_typing.UNPROVIDED), (SubLObject)string_typing.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6044L)
    public static SubLObject get_np_head_tagged(final SubLObject tagged) {
        SubLObject nouns = (SubLObject)string_typing.NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(tagged);
        SubLObject word = (SubLObject)string_typing.NIL;
        word = cdolist_list_var.first();
        while (string_typing.NIL != cdolist_list_var) {
            final SubLObject cat = document.word_category(word);
            if (string_typing.NIL != nouns && cat.eql((SubLObject)string_typing.$kw24$IN)) {
                return nouns.first();
            }
            if (string_typing.NIL != conses_high.member(cat, (SubLObject)string_typing.$list25, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED)) {
                nouns = (SubLObject)ConsesLow.cons(word, nouns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return nouns.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6434L)
    public static SubLObject singularP(final SubLObject word) {
        final SubLObject ne = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args((SubLObject)string_typing.$sym6$STANFORD_NER, (SubLObject)string_typing.$sym7$NEW), (SubLObject)string_typing.$sym8$RUN, word).first().first();
        if (string_typing.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(ne, (SubLObject)string_typing.$sym9$GET_TYPE), (SubLObject)string_typing.$list26, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED)) {
            return (SubLObject)string_typing.T;
        }
        final SubLObject tokens = string_utilities.split_string(word, (SubLObject)string_typing.UNPROVIDED);
        final SubLObject head = (string_typing.NIL != list_utilities.lengthE(tokens, (SubLObject)string_typing.ONE_INTEGER, (SubLObject)string_typing.UNPROVIDED)) ? word : get_np_head(word);
        return Equality.equalp(head, morphology.singularize_string(head, (SubLObject)string_typing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 6821L)
    public static SubLObject lynx(final SubLObject url) {
        assert string_typing.NIL != Types.stringp(url) : url;
        return Functions.apply((SubLObject)string_typing.$sym27$CCONCATENATE, Mapping.mapcar((SubLObject)string_typing.$sym28$NEW_LINIFY, os_process_utilities.os_process_evaluation_output_strings((SubLObject)string_typing.$str29$lynx, (SubLObject)ConsesLow.list((SubLObject)string_typing.$str30$_dump, url), (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 7066L)
    public static SubLObject new_linify(final SubLObject string) {
        return Sequences.cconcatenate(string, string_utilities.$new_line_string$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 7195L)
    public static SubLObject random_sample(final SubLObject elements, final SubLObject n) {
        final SubLObject size = Sequences.length(elements);
        if (n.numG(size)) {
            Errors.error((SubLObject)string_typing.$str31$number_of_sample_elements__a_exce, n, size);
        }
        SubLObject sample = (SubLObject)string_typing.NIL;
        SubLObject member = (SubLObject)string_typing.NIL;
        SubLObject i;
        for (i = (SubLObject)string_typing.NIL, i = (SubLObject)string_typing.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)string_typing.ONE_INTEGER)) {
            member = ConsesLow.nth(random.random(Sequences.length(elements)), elements);
            sample = (SubLObject)ConsesLow.cons(member, sample);
            Sequences.delete(member, elements, (SubLObject)string_typing.EQUAL, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED);
        }
        return sample;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 8276L)
    public static SubLObject most_frequent(final SubLObject elements) {
        SubLObject counts = (SubLObject)string_typing.NIL;
        SubLObject cdolist_list_var = elements;
        SubLObject element = (SubLObject)string_typing.NIL;
        element = cdolist_list_var.first();
        while (string_typing.NIL != cdolist_list_var) {
            SubLObject old_entry = conses_high.assoc(element, counts, (SubLObject)string_typing.UNPROVIDED, (SubLObject)string_typing.UNPROVIDED);
            if (string_typing.NIL == old_entry) {
                old_entry = (SubLObject)ConsesLow.cons(element, (SubLObject)string_typing.ZERO_INTEGER);
                counts = (SubLObject)ConsesLow.cons(old_entry, counts);
            }
            ConsesLow.rplacd(old_entry, number_utilities.f_1X(old_entry.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        SubLObject max = (SubLObject)string_typing.ZERO_INTEGER;
        SubLObject max_elements = (SubLObject)string_typing.NIL;
        SubLObject cdolist_list_var2 = counts;
        SubLObject entry = (SubLObject)string_typing.NIL;
        entry = cdolist_list_var2.first();
        while (string_typing.NIL != cdolist_list_var2) {
            if (entry.rest().numG(max)) {
                max = entry.rest();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        }
        cdolist_list_var2 = counts;
        entry = (SubLObject)string_typing.NIL;
        entry = cdolist_list_var2.first();
        while (string_typing.NIL != cdolist_list_var2) {
            if (entry.rest().numE(max)) {
                max_elements = (SubLObject)ConsesLow.cons(entry.first(), max_elements);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        }
        return max_elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 8873L)
    public static SubLObject plural_string(final SubLObject string, SubLObject mt) {
        if (mt == string_typing.UNPROVIDED) {
            mt = string_typing.$const32$EnglishMt;
        }
        SubLObject ans = morphology.pluralize_string_wXlexicon(string, mt);
        if (string_typing.NIL == ans) {
            final SubLObject tagged = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, (SubLObject)string_typing.UNPROVIDED));
            SubLObject head = get_np_head_tagged(tagged);
            final SubLObject words = document.sentence_yield(tagged);
            if (string_typing.NIL == head) {
                head = vector_utilities.last_aref(words);
            }
            SubLObject plural_head = morphology.pluralize_string_wXlexicon(document.word_string(head), mt);
            if (string_typing.NIL == plural_head) {
                plural_head = morphology.plural_reg(document.word_string(head));
            }
            document.set_word_string(head, plural_head);
            ans = sentence_compute_string(tagged);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-typing.lisp", position = 9717L)
    public static SubLObject sentence_compute_string(final SubLObject sentence) {
        SubLObject strings = (SubLObject)string_typing.NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = (SubLObject)string_typing.NIL;
        word = cdolist_list_var.first();
        while (string_typing.NIL != cdolist_list_var) {
            strings = (SubLObject)ConsesLow.cons(document.word_string(word), strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return string_utilities.bunge(Sequences.nreverse(strings), (SubLObject)string_typing.UNPROVIDED);
    }
    
    public static SubLObject declare_string_typing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "type_string", "TYPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "type_string_ner", "TYPE-STRING-NER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "type_string_cyc", "TYPE-STRING-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "phraseP", "PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "get_np_head", "GET-NP-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "singularP", "SINGULAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "lynx", "LYNX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "new_linify", "NEW-LINIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "random_sample", "RANDOM-SAMPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "most_frequent", "MOST-FREQUENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "plural_string", "PLURAL-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_typing", "sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false);
        return (SubLObject)string_typing.NIL;
    }
    
    public static SubLObject init_string_typing_file() {
        return (SubLObject)string_typing.NIL;
    }
    
    public static SubLObject setup_string_typing_file() {
        return (SubLObject)string_typing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_string_typing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_string_typing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_string_typing_file();
    }
    
    static {
        me = (SubLFile)new string_typing();
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw1$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw2$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym3$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym4$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw5$COLLECTION = SubLObjectFactory.makeKeyword("COLLECTION");
        $sym6$STANFORD_NER = SubLObjectFactory.makeSymbol("STANFORD-NER");
        $sym7$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym8$RUN = SubLObjectFactory.makeSymbol("RUN");
        $sym9$GET_TYPE = SubLObjectFactory.makeSymbol("GET-TYPE");
        $sym10$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym11$PERSON = SubLObjectFactory.makeSymbol("PERSON");
        $kw12$INDIVIDUAL = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $sym13$ORGANIZATION = SubLObjectFactory.makeSymbol("ORGANIZATION");
        $sym14$LOCATION = SubLObjectFactory.makeSymbol("LOCATION");
        $sym15$DATE = SubLObjectFactory.makeSymbol("DATE");
        $sym16$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Mr"), SubLObjectFactory.makeString("Mrs"), SubLObjectFactory.makeString("Miss"), SubLObjectFactory.makeString("Ms"), SubLObjectFactory.makeString("Sir"), SubLObjectFactory.makeString("Prof"), SubLObjectFactory.makeString("Colonel"), SubLObjectFactory.makeString("General"), SubLObjectFactory.makeString("Lieutenant"), SubLObjectFactory.makeString("Captain"), SubLObjectFactory.makeString("Major"), SubLObjectFactory.makeString("Seargant"), SubLObjectFactory.makeString("President"), SubLObjectFactory.makeString("Lady") });
        $sym18$GET = SubLObjectFactory.makeSymbol("GET");
        $kw19$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $const20$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const21$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const22$noNotableInstances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("noNotableInstances"));
        $const23$instancesDontNeedLexification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("instancesDontNeedLexification"));
        $kw24$IN = SubLObjectFactory.makeKeyword("IN");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"), (SubLObject)SubLObjectFactory.makeKeyword("FW"), (SubLObject)SubLObjectFactory.makeKeyword("VBG"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERSON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ORGANIZATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOCATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")));
        $sym27$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym28$NEW_LINIFY = SubLObjectFactory.makeSymbol("NEW-LINIFY");
        $str29$lynx = SubLObjectFactory.makeString("lynx");
        $str30$_dump = SubLObjectFactory.makeString("-dump");
        $str31$number_of_sample_elements__a_exce = SubLObjectFactory.makeString("number of sample elements ~a exceeds list size ~a");
        $const32$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
    }
}

/*

	Total time: 207 ms
	
*/