package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class string_typing extends SubLTranslatedFile {
    public static final SubLFile me = new string_typing();

    public static final String myName = "com.cyc.cycjava.cycl.string_typing";

    public static final String myFingerPrint = "1003f6b995c10650da85c94b0149c145d3a1436b6c364e4a2070217bd918ac45";





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLSymbol $sym4$_EXIT = makeSymbol("%EXIT");

















    private static final SubLSymbol ORGANIZATION = makeSymbol("ORGANIZATION");

    private static final SubLSymbol LOCATION = makeSymbol("LOCATION");





    private static final SubLList $list17 = list(new SubLObject[]{ makeString("Mr"), makeString("Mrs"), makeString("Miss"), makeString("Ms"), makeString("Sir"), makeString("Prof"), makeString("Colonel"), makeString("General"), makeString("Lieutenant"), makeString("Captain"), makeString("Major"), makeString("Seargant"), makeString("President"), makeString("Lady") });





    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$noNotableInstances = reader_make_constant_shell(makeString("noNotableInstances"));

    private static final SubLObject $$instancesDontNeedLexification = reader_make_constant_shell(makeString("instancesDontNeedLexification"));



    private static final SubLList $list25 = list(makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("NNP"), makeKeyword("NNPS"), makeKeyword("FW"), makeKeyword("VBG"));

    private static final SubLList $list26 = list(list(makeSymbol("QUOTE"), makeSymbol("PERSON")), list(makeSymbol("QUOTE"), makeSymbol("ORGANIZATION")), list(makeSymbol("QUOTE"), makeSymbol("LOCATION")), list(makeSymbol("QUOTE"), makeSymbol("DATE")));



    private static final SubLSymbol NEW_LINIFY = makeSymbol("NEW-LINIFY");

    private static final SubLString $$$lynx = makeString("lynx");

    private static final SubLString $str30$_dump = makeString("-dump");

    private static final SubLString $str31$number_of_sample_elements__a_exce = makeString("number of sample elements ~a exceeds list size ~a");

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    public static SubLObject type_string(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        SubLObject type = type_string_cyc(word);
        if (!type.eql($UNKNOWN)) {
            return type;
        }
        type = type_string_ner(word);
        if (!type.eql($UNKNOWN)) {
            return type;
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != phraseP(word)) {
                        final SubLObject head_word = get_np_head(word);
                        if (NIL != string_utilities_lexical.every_word_starts_with_capitalP(word)) {
                            final SubLObject type2 = type_string_cyc(head_word);
                            return type2;
                        }
                        if (NIL != head_only_admits_collectionsP(head_word, UNPROVIDED)) {
                            return $COLLECTION;
                        }
                        return $UNKNOWN;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return $UNKNOWN;
    }

    public static SubLObject type_string_ner(final SubLObject word) {
        final SubLObject ner = methods.funcall_class_method_with_0_args(STANFORD_NER, NEW);
        final SubLObject named_entities = methods.funcall_instance_method_with_1_args(ner, RUN, word);
        if (NIL != list_utilities.singletonP(named_entities)) {
            final SubLObject pcase_var;
            final SubLObject type = pcase_var = methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_TYPE);
            if (pcase_var.eql(QUOTE) || pcase_var.eql(PERSON)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(ORGANIZATION)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(LOCATION)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(DATE)) {
                return $INDIVIDUAL;
            }
            return $UNKNOWN;
        } else {
            if (((NIL != list_utilities.doubletonP(named_entities)) && methods.funcall_instance_method_with_0_args(second(named_entities).first(), GET_TYPE).eql(PERSON)) && (NIL != member(methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_STRING), $list17, EQUALP, UNPROVIDED))) {
                return $INDIVIDUAL;
            }
            return $UNKNOWN;
        }
    }

    public static SubLObject type_string_cyc(final SubLObject word) {
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject types = NIL;
        SubLObject denot = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, word);
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
            if (NIL != fort_types_interface.collection_in_any_mtP(denot)) {
                types = cons($COLLECTION, types);
            } else
                if (NIL == fort_types_interface.functorP(denot)) {
                    if (NIL == fort_types_interface.predicateP(denot)) {
                        if (NIL != kb_accessors.individualP(denot)) {
                            types = cons($INDIVIDUAL, types);
                        }
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        if (NIL != types) {
            final SubLObject frequent = most_frequent(types);
            final SubLObject tag = (NIL != list_utilities.singletonP(frequent)) ? frequent.first() : $UNKNOWN;
            return tag;
        }
        return $UNKNOWN;
    }

    public static SubLObject head_only_admits_collectionsP(final SubLObject head, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject denot = NIL;
        final SubLObject value_set = T;
        SubLObject allows_individualsP = NIL;
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
        if (NIL == lex_entries) {
            return NIL;
        }
        if (NIL == allows_individualsP) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
            SubLObject lex = NIL;
            lex = csome_list_var.first();
            while ((NIL == allows_individualsP) && (NIL != csome_list_var)) {
                denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                if ((NIL == builder_utilities.higher_order_collectionP(denot)) && (NIL == dont_make_instancesP(denot, mt))) {
                    allows_individualsP = T;
                }
                csome_list_var = csome_list_var.rest();
                lex = csome_list_var.first();
            } 
        }
        return NIL != value_set ? makeBoolean(NIL == allows_individualsP) : NIL;
    }

    public static SubLObject dont_make_instancesP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return ask_utilities.query_boolean(list($$or, list($$noNotableInstances, v_term), list($$instancesDontNeedLexification, v_term)), mt, UNPROVIDED);
    }

    public static SubLObject phraseP(final SubLObject word) {
        return numG(length(string_utilities.split_string(word, UNPROVIDED)), ONE_INTEGER);
    }

    public static SubLObject get_np_head(final SubLObject phrase) {
        final SubLObject head = get_np_head_tagged(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(phrase, UNPROVIDED)));
        return NIL != head ? document.word_string(head) : last(string_utilities.split_string(phrase, UNPROVIDED), UNPROVIDED).first();
    }

    public static SubLObject get_np_head_tagged(final SubLObject tagged) {
        SubLObject nouns = NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(tagged);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cat = document.word_category(word);
            if ((NIL != nouns) && cat.eql($IN)) {
                return nouns.first();
            }
            if (NIL != member(cat, $list25, UNPROVIDED, UNPROVIDED)) {
                nouns = cons(word, nouns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nouns.first();
    }

    public static SubLObject singularP(final SubLObject word) {
        final SubLObject ne = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args(STANFORD_NER, NEW), RUN, word).first().first();
        if (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(ne, GET_TYPE), $list26, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        final SubLObject tokens = string_utilities.split_string(word, UNPROVIDED);
        final SubLObject head = (NIL != list_utilities.lengthE(tokens, ONE_INTEGER, UNPROVIDED)) ? word : get_np_head(word);
        return equalp(head, morphology.singularize_string(head, UNPROVIDED));
    }

    public static SubLObject lynx(final SubLObject url) {
        assert NIL != stringp(url) : "Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) " + url;
        return apply(CCONCATENATE, Mapping.mapcar(NEW_LINIFY, os_process_utilities.os_process_evaluation_output_strings($$$lynx, list($str30$_dump, url), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject new_linify(final SubLObject string) {
        return cconcatenate(string, string_utilities.$new_line_string$.getGlobalValue());
    }

    public static SubLObject random_sample(final SubLObject elements, final SubLObject n) {
        final SubLObject size = length(elements);
        if (n.numG(size)) {
            Errors.error($str31$number_of_sample_elements__a_exce, n, size);
        }
        SubLObject sample = NIL;
        SubLObject member = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            member = nth(random.random(length(elements)), elements);
            sample = cons(member, sample);
            delete(member, elements, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return sample;
    }

    public static SubLObject most_frequent(final SubLObject elements) {
        SubLObject counts = NIL;
        SubLObject cdolist_list_var = elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject old_entry = assoc(element, counts, UNPROVIDED, UNPROVIDED);
            if (NIL == old_entry) {
                old_entry = cons(element, ZERO_INTEGER);
                counts = cons(old_entry, counts);
            }
            rplacd(old_entry, number_utilities.f_1X(old_entry.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        SubLObject max = ZERO_INTEGER;
        SubLObject max_elements = NIL;
        SubLObject cdolist_list_var2 = counts;
        SubLObject entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (entry.rest().numG(max)) {
                max = entry.rest();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = counts;
        entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (entry.rest().numE(max)) {
                max_elements = cons(entry.first(), max_elements);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        return max_elements;
    }

    public static SubLObject plural_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = morphology.pluralize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tagged = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, UNPROVIDED));
            SubLObject head = get_np_head_tagged(tagged);
            final SubLObject words = document.sentence_yield(tagged);
            if (NIL == head) {
                head = vector_utilities.last_aref(words);
            }
            SubLObject plural_head = morphology.pluralize_string_wXlexicon(document.word_string(head), mt);
            if (NIL == plural_head) {
                plural_head = morphology.plural_reg(document.word_string(head));
            }
            document.set_word_string(head, plural_head);
            ans = sentence_compute_string(tagged);
        }
        return ans;
    }

    public static SubLObject sentence_compute_string(final SubLObject sentence) {
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strings = cons(document.word_string(word), strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return string_utilities.bunge(nreverse(strings), UNPROVIDED);
    }

    public static SubLObject declare_string_typing_file() {
        declareFunction(me, "type_string", "TYPE-STRING", 1, 0, false);
        declareFunction(me, "type_string_ner", "TYPE-STRING-NER", 1, 0, false);
        declareFunction(me, "type_string_cyc", "TYPE-STRING-CYC", 1, 0, false);
        declareFunction(me, "head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false);
        declareFunction(me, "dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false);
        declareFunction(me, "phraseP", "PHRASE?", 1, 0, false);
        declareFunction(me, "get_np_head", "GET-NP-HEAD", 1, 0, false);
        declareFunction(me, "get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false);
        declareFunction(me, "singularP", "SINGULAR?", 1, 0, false);
        declareFunction(me, "lynx", "LYNX", 1, 0, false);
        declareFunction(me, "new_linify", "NEW-LINIFY", 1, 0, false);
        declareFunction(me, "random_sample", "RANDOM-SAMPLE", 2, 0, false);
        declareFunction(me, "most_frequent", "MOST-FREQUENT", 1, 0, false);
        declareFunction(me, "plural_string", "PLURAL-STRING", 1, 1, false);
        declareFunction(me, "sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_string_typing_file() {
        return NIL;
    }

    public static SubLObject setup_string_typing_file() {
        return NIL;
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

    
}

/**
 * Total time: 207 ms
 */
