package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_sentence extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_sentence";
    public static final String myFingerPrint = "2acd9ba8cb81281e9bb0f4d1baee694300e34cd7e7cafa40fd0e5fdbe391cc5f";
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 16198L)
    public static SubLSymbol $dont_generate_multi_clause_sentenceP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18721L)
    private static SubLSymbol $comma$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18755L)
    private static SubLSymbol $comma_and$;
    private static final SubLSymbol $kw0$S;
    private static final SubLSymbol $kw1$DECLARATIVE;
    private static final SubLSymbol $kw2$ANY;
    private static final SubLSymbol $kw3$CATEGORY;
    private static final SubLObject $const4$NLSentence;
    private static final SubLSymbol $kw5$DEFAULT;
    private static final SubLSymbol $kw6$FORCE;
    private static final SubLSymbol $kw7$TOPIC;
    private static final SubLSymbol $kw8$IGNORE;
    private static final SubLSymbol $sym9$PPH_GENL_PREDICATE_;
    private static final SubLObject $const10$Some_NLAttr;
    private static final SubLObject $const11$Pronoun;
    private static final SubLSymbol $sym12$PPH_PHRASE_STRING_NO_TAGS;
    private static final SubLSymbol $kw13$TEXT;
    private static final SubLSymbol $kw14$IMPERATIVE;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$INTERROGATIVE;
    private static final SubLSymbol $kw17$QUESTION;
    private static final SubLSymbol $kw18$NONE;
    private static final SubLString $str19$Recursive_generation_from_PPH_SEN;
    private static final SubLSymbol $sym20$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P;
    private static final SubLSymbol $sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM;
    private static final SubLString $str22$_;
    private static final SubLString $str23$__and;
    private static final SubLSymbol $sym24$PPH_STRING_EQUAL_;
    private static final SubLSymbol $sym25$PPH_PHRASE_STRING;
    private static final SubLString $str26$that;
    private static final SubLObject $const27$Person;
    private static final SubLString $str28$who;
    private static final SubLString $str29$which;
    private static final SubLString $str30$as;
    private static final SubLString $str31$Adjoined_additional_subject_to_fo;
    private static final SubLString $str32$_PPH_error_level_;
    private static final SubLString $str33$__;
    private static final SubLString $str34$Can_t_conjoin_non_English_sentenc;
    private static final SubLString $str35$Nothing_to_append_;
    private static final SubLString $str36$Removing_PP__S_from__S;
    private static final SubLSymbol $sym37$PPH_PHRASE_PP_;
    private static final SubLSymbol $kw38$TRUNCATED_PHRASES;
    private static final SubLString $str39$_S___starts_with__S;
    private static final SubLString $str40$Truncating__S_from__S___based_on_;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 843L)
    public static SubLObject pph_sentence_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != pph_phrase.pph_phrase_p(obj, (SubLObject)pph_sentence.UNPROVIDED) && document.sign_type(obj) == pph_sentence.$kw0$S);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 1005L)
    public static SubLObject new_pph_sentence(SubLObject cycl, SubLObject force, SubLObject agr_preds) {
        if (cycl == pph_sentence.UNPROVIDED) {
            cycl = (SubLObject)pph_sentence.NIL;
        }
        if (force == pph_sentence.UNPROVIDED) {
            force = (SubLObject)pph_sentence.$kw1$DECLARATIVE;
        }
        if (agr_preds == pph_sentence.UNPROVIDED) {
            agr_preds = (SubLObject)pph_sentence.$kw2$ANY;
        }
        final SubLObject sentence = pph_data_structures.new_pph_phrase((SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        document._csetf_sign_type(sentence, (SubLObject)pph_sentence.$kw0$S);
        if (pph_sentence.NIL != force) {
            pph_sentence_set_force(sentence, force);
        }
        pph_sentence_set_cycl(sentence, cycl);
        pph_sentence_set_agr_preds(sentence, agr_preds, (SubLObject)pph_sentence.UNPROVIDED);
        document.sign_update(sentence, (SubLObject)ConsesLow.list((SubLObject)pph_sentence.$kw3$CATEGORY, pph_sentence.$const4$NLSentence));
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 1448L)
    public static SubLObject pph_sentence_copy(final SubLObject old_sentence, SubLObject target) {
        if (target == pph_sentence.UNPROVIDED) {
            target = (SubLObject)pph_sentence.NIL;
        }
        if (pph_sentence.NIL == target) {
            target = new_pph_sentence((SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        }
        if (old_sentence.equalp(target)) {
            return target;
        }
        pph_sentence_set_output_list(target, pph_sentence_output_list(old_sentence));
        if (pph_sentence.NIL != pph_phrase.pph_phrase_dtrs(old_sentence)) {
            SubLObject new_phrases = (SubLObject)pph_sentence.NIL;
            SubLObject dtr_num = (SubLObject)pph_sentence.ZERO_INTEGER;
            if (document.sign_constituents(old_sentence).isVector()) {
                final SubLObject vector_var = document.sign_constituents(old_sentence);
                final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject phrase;
                SubLObject new_phrase;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                    element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                    phrase = Vectors.aref(vector_var, element_num);
                    new_phrase = ((pph_sentence.NIL != pph_sentence_p(phrase)) ? pph_sentence_copy(phrase, (SubLObject)pph_sentence.UNPROVIDED) : phrase);
                    new_phrases = (SubLObject)ConsesLow.cons(new_phrase, new_phrases);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_sentence.ONE_INTEGER);
                }
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(target, Sequences.nreverse(new_phrases), (SubLObject)pph_sentence.UNPROVIDED);
        }
        else {
            pph_phrase.pph_phrase_set_dtrs(target, (SubLObject)pph_sentence.NIL);
        }
        pph_sentence_set_cycl(target, pph_sentence_cycl(old_sentence));
        pph_phrase.pph_phrase_set_agr(target, pph_phrase.pph_phrase_agr(old_sentence), (SubLObject)pph_sentence.NIL);
        pph_sentence_set_force(target, pph_sentence_force(old_sentence));
        pph_sentence_set_justification(target, pph_sentence_justification(old_sentence));
        pph_phrase.pph_phrase_set_head_dtr_num(target, pph_phrase.pph_phrase_head_dtr_num(old_sentence));
        pph_phrase.pph_phrase_set_arg_position_map(target, pph_phrase.pph_phrase_arg_position_map(old_sentence));
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 2796L)
    public static SubLObject pph_sentence_set_force(final SubLObject sentence, SubLObject force) {
        if (force == pph_sentence.$kw5$DEFAULT) {
            force = (SubLObject)pph_sentence.$kw1$DECLARATIVE;
        }
        return pph_data_structures.pph_phrase_info_set(sentence, (SubLObject)pph_sentence.$kw6$FORCE, force);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3096L)
    public static SubLObject pph_sentence_force(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, (SubLObject)pph_sentence.$kw6$FORCE, (SubLObject)pph_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3238L)
    public static SubLObject pph_sentence_set_agr_pred(final SubLObject sentence, final SubLObject agr_pred, SubLObject descend_into_condP) {
        if (descend_into_condP == pph_sentence.UNPROVIDED) {
            descend_into_condP = (SubLObject)pph_sentence.T;
        }
        pph_phrase.pph_phrase_set_agr_pred(sentence, agr_pred, descend_into_condP);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3462L)
    public static SubLObject pph_sentence_set_agr_preds(final SubLObject sentence, final SubLObject agr_preds, SubLObject descend_into_condP) {
        if (descend_into_condP == pph_sentence.UNPROVIDED) {
            descend_into_condP = (SubLObject)pph_sentence.T;
        }
        pph_phrase.pph_phrase_set_agr_preds(sentence, agr_preds, descend_into_condP);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3690L)
    public static SubLObject pph_sentence_agr_pred(final SubLObject sentence) {
        return pph_phrase.pph_phrase_agr_pred(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3825L)
    public static SubLObject pph_sentence_agr_preds(final SubLObject sentence) {
        return pph_phrase.pph_phrase_agr_preds(sentence, (SubLObject)pph_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 3962L)
    public static SubLObject pph_sentence_set_string(final SubLObject sentence, final SubLObject string) {
        pph_phrase.pph_phrase_set_string(sentence, string);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4126L)
    public static SubLObject pph_sentence_string(final SubLObject sentence, SubLObject add_tagsP) {
        if (add_tagsP == pph_sentence.UNPROVIDED) {
            add_tagsP = (SubLObject)pph_sentence.T;
        }
        return pph_phrase.pph_phrase_string(sentence, add_tagsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4291L)
    public static SubLObject pph_sentence_set_justification(final SubLObject sentence, final SubLObject justification) {
        pph_phrase.pph_phrase_set_justification(sentence, justification);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4483L)
    public static SubLObject pph_sentence_justification(final SubLObject sentence) {
        return pph_phrase.pph_phrase_justification(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4628L)
    public static SubLObject pph_sentence_set_demerits(final SubLObject sentence, final SubLObject demerits, final SubLObject why) {
        pph_phrase.pph_phrase_set_top_level_demerits(sentence, demerits, why);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4818L)
    public static SubLObject pph_sentence_demerits(final SubLObject sentence) {
        return pph_phrase.pph_phrase_demerits(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 4953L)
    public static SubLObject pph_sentence_set_output_list(final SubLObject sentence, final SubLObject output_list) {
        pph_phrase.pph_phrase_set_output_list(sentence, output_list, (SubLObject)pph_sentence.UNPROVIDED);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 5137L)
    public static SubLObject pph_sentence_output_list(final SubLObject sentence) {
        return pph_phrase.pph_phrase_output_list(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 5278L)
    public static SubLObject pph_sentence_set_cycl(final SubLObject sentence, final SubLObject cycl) {
        pph_phrase.pph_phrase_set_cycl(sentence, cycl);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 5434L)
    public static SubLObject pph_sentence_cycl(final SubLObject sentence) {
        return pph_phrase.pph_phrase_cycl(sentence, (SubLObject)pph_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 5561L)
    public static SubLObject pph_sentence_set_topic(final SubLObject sentence, final SubLObject topic) {
        pph_data_structures.pph_phrase_info_set(sentence, (SubLObject)pph_sentence.$kw7$TOPIC, topic);
        final SubLObject cycl = pph_sentence_cycl(sentence);
        SubLObject focus_arg = (SubLObject)pph_sentence.NIL;
        SubLObject multipleP = (SubLObject)pph_sentence.NIL;
        if (pph_sentence.NIL != cycl_grammar.cycl_sentence_p(cycl) && pph_sentence.NIL != pph_phrase.pph_known_cycl_p(topic)) {
            SubLObject argnum = (SubLObject)pph_sentence.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(cycl, (SubLObject)pph_sentence.$kw8$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)pph_sentence.NIL, rest = args; pph_sentence.NIL == multipleP && pph_sentence.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                argnum = Numbers.add(argnum, (SubLObject)pph_sentence.ONE_INTEGER);
                if (arg.equal(topic)) {
                    if (pph_sentence.NIL != subl_promotions.non_negative_integer_p(focus_arg)) {
                        multipleP = (SubLObject)pph_sentence.T;
                        focus_arg = (SubLObject)pph_sentence.NIL;
                    }
                    else {
                        focus_arg = argnum;
                    }
                }
            }
        }
        if (pph_sentence.NIL != focus_arg) {
            pph_phrase.pph_phrase_set_focus_arg(sentence, focus_arg);
        }
        return topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 6176L)
    public static SubLObject pph_sentence_topic(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, (SubLObject)pph_sentence.$kw7$TOPIC, pph_phrase.pph_unknown_cycl());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 6337L)
    public static SubLObject pph_sentence_focus_arg(final SubLObject sentence) {
        return pph_phrase.pph_phrase_focus_arg(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 6474L)
    public static SubLObject pph_sentence_doneP(final SubLObject sentence) {
        return pph_phrase.pph_phrase_doneP(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 6603L)
    public static SubLObject pph_sentence_subject(final SubLObject sentence) {
        final SubLObject dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject maybe_subj = dtrs.first();
        if (pph_sentence.NIL != maybe_subj && pph_sentence.NIL != pph_phrase.pph_phrase_npP(maybe_subj)) {
            return maybe_subj;
        }
        final SubLObject head_verb = pph_sentence_head_verb(sentence);
        return (SubLObject)((pph_sentence.NIL != head_verb) ? pph_phrase.pph_phrase_subject_dtr(pph_phrase.pph_phrase_mother(head_verb)) : pph_sentence.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 7012L)
    public static SubLObject pph_sentence_head_verb(final SubLObject sentence) {
        final SubLObject main_clause_dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject head_verb = (SubLObject)((pph_sentence.NIL != list_utilities.non_empty_list_p(main_clause_dtrs)) ? pph_phrase.pph_phrase_head_dtr(pph_phrase.pph_phrase_mother(main_clause_dtrs.first())) : pph_sentence.NIL);
        return (SubLObject)((pph_sentence.NIL != head_verb && pph_sentence.NIL != pph_phrase.pph_phrase_verbP(head_verb)) ? head_verb : pph_sentence.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 7389L)
    public static SubLObject pph_subject_compatible_with_verbP(final SubLObject subj, final SubLObject verb) {
        if (pph_sentence.NIL == pph_phrase.pph_phrase_p(subj, (SubLObject)pph_sentence.UNPROVIDED) || pph_sentence.NIL == pph_phrase.pph_phrase_p(verb, (SubLObject)pph_sentence.UNPROVIDED) || pph_sentence.NIL == pph_phrase.pph_phrase_doneP(subj) || pph_sentence.NIL == pph_phrase.pph_phrase_doneP(verb)) {
            return (SubLObject)pph_sentence.NIL;
        }
        final SubLObject subj_preds = pph_phrase_resolution.verb_preds_for_subject(subj, (SubLObject)pph_sentence.UNPROVIDED);
        final SubLObject verb_pred = pph_phrase.pph_phrase_agr_pred(verb);
        return subl_promotions.memberP(verb_pred, subj_preds, Symbols.symbol_function((SubLObject)pph_sentence.$sym9$PPH_GENL_PREDICATE_), (SubLObject)pph_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 7737L)
    public static SubLObject pph_sentence_main_clause(final SubLObject sentence) {
        if (pph_sentence.NIL == pph_phrase.pph_phrase_has_dtrsP(sentence)) {
            return (SubLObject)pph_sentence.NIL;
        }
        SubLObject maybe_main_clause = sentence;
        for (SubLObject maybe_dtrs = pph_phrase.pph_phrase_dtr_list(sentence), maybe_subj = maybe_dtrs.first(); pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(maybe_subj) && (pph_sentence.NIL != pph_phrase.pph_phrase_sP(maybe_subj) || pph_sentence.ONE_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(pph_phrase.pph_phrase_mother(maybe_subj)))); maybe_subj = maybe_dtrs.first()) {
            maybe_dtrs = pph_phrase.pph_phrase_dtr_list(maybe_subj);
            maybe_main_clause = maybe_subj;
        }
        return maybe_main_clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 8328L)
    public static SubLObject pph_sentence_main_clause_dtr_list(final SubLObject sentence) {
        final SubLObject main_clause = pph_sentence_main_clause(sentence);
        if (pph_sentence.NIL != main_clause && pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(main_clause)) {
            final SubLObject dtrs = pph_phrase.pph_phrase_dtr_list(main_clause);
            final SubLObject head_dtr = pph_phrase.pph_phrase_head_dtr(main_clause);
            return (SubLObject)((pph_sentence.NIL != pph_phrase.pph_phrase_npP(dtrs.first()) || (pph_sentence.NIL != head_dtr && pph_sentence.NIL != pph_phrase.pph_phrase_verbP(head_dtr))) ? dtrs : pph_sentence.NIL);
        }
        return (SubLObject)pph_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 8788L)
    public static SubLObject pph_sentence_main_clause_post_modifiers(final SubLObject sentence) {
        final SubLObject main_clause_dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject main_clause = (SubLObject)((pph_sentence.NIL != main_clause_dtrs) ? pph_phrase.pph_phrase_mother(main_clause_dtrs.first()) : pph_sentence.NIL);
        final SubLObject s = (SubLObject)((pph_sentence.NIL != main_clause) ? pph_phrase.pph_phrase_mother(main_clause) : pph_sentence.NIL);
        SubLObject post_modifiers = (SubLObject)pph_sentence.NIL;
        if (pph_sentence.NIL != s) {
            SubLObject found_main_clauseP = (SubLObject)pph_sentence.NIL;
            SubLObject dtr_num = (SubLObject)pph_sentence.ZERO_INTEGER;
            if (document.sign_constituents(s).isVector()) {
                final SubLObject vector_var = document.sign_constituents(s);
                final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                    element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_sentence.NIL != found_main_clauseP) {
                        post_modifiers = (SubLObject)ConsesLow.cons(dtr, post_modifiers);
                    }
                    else if (dtr.eql(main_clause)) {
                        found_main_clauseP = (SubLObject)pph_sentence.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_sentence.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(post_modifiers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 9420L)
    public static SubLObject pph_sentences_differ_only_in_subjectP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (pph_sentence.NIL != pph_sentence_has_same_subjectP(previous_sentence, this_sentence)) {
            return (SubLObject)pph_sentence.NIL;
        }
        final SubLObject subj1 = pph_sentence_subject(previous_sentence);
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        if (pph_sentence.NIL == subj1 || pph_sentence.NIL == subj2) {
            return (SubLObject)pph_sentence.NIL;
        }
        final SubLObject subj1_string = pph_string.pph_string_downcase(pph_phrase.pph_phrase_string(subj1, (SubLObject)pph_sentence.NIL));
        final SubLObject subj2_string = pph_string.pph_string_downcase(pph_phrase.pph_phrase_string(subj2, (SubLObject)pph_sentence.NIL));
        final SubLObject prev_string = pph_string.pph_string_downcase(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.NIL));
        final SubLObject this_string = pph_string.pph_string_downcase(pph_sentence_string(this_sentence, (SubLObject)pph_sentence.NIL));
        return Equality.equal(pph_string.pph_remove_substring(prev_string, subj1_string), pph_string.pph_remove_substring(this_string, subj2_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 10186L)
    public static SubLObject pph_sentence_has_same_subjectP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj1 = pph_sentence_subject(previous_sentence);
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != subj1 && pph_sentence.NIL != subj2 && (pph_sentence.NIL != pph_string.pph_string_equalP(pph_phrase.pph_phrase_string(subj1, (SubLObject)pph_sentence.NIL), pph_phrase.pph_phrase_string(subj2, (SubLObject)pph_sentence.NIL)) || (pph_sentence.NIL != pph_np_has_same_cyclP(subj1, subj2) && pph_sentence.NIL != list_utilities.sublisp_boolean(pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(subj1, (SubLObject)pph_sentence.UNPROVIDED), pph_phrase.pph_phrase_agr_preds(subj2, (SubLObject)pph_sentence.UNPROVIDED), (SubLObject)pph_sentence.UNPROVIDED)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 10664L)
    public static SubLObject pph_np_has_same_cyclP(final SubLObject np1, final SubLObject np2) {
        SubLObject cycl1 = pph_phrase.pph_phrase_cycl(np1, (SubLObject)pph_sentence.UNPROVIDED);
        SubLObject cycl2 = pph_phrase.pph_phrase_cycl(np2, (SubLObject)pph_sentence.UNPROVIDED);
        if (pph_sentence.NIL != pph_phrase.pph_unknown_cycl_p(cycl1) && pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(np1) && pph_sentence.NIL != pph_phrase.pph_phrase_indefinite_articleP(pph_phrase.pph_phrase_nth_dtr(np1, (SubLObject)pph_sentence.ZERO_INTEGER))) {
            cycl1 = pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_head_dtr(np1), (SubLObject)pph_sentence.UNPROVIDED);
        }
        if (pph_sentence.NIL != pph_phrase.pph_unknown_cycl_p(cycl2) && pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(np2) && pph_sentence.NIL != pph_phrase.pph_phrase_indefinite_articleP(pph_phrase.pph_phrase_nth_dtr(np2, (SubLObject)pph_sentence.ZERO_INTEGER))) {
            cycl2 = pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_head_dtr(np2), (SubLObject)pph_sentence.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != pph_phrase.pph_known_cycl_p(cycl1) && cycl1.equal(cycl2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 11265L)
    public static SubLObject pph_sentence_ends_with_subject_ofP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        return (SubLObject)((pph_sentence.NIL != subj2) ? pph_sentence_ends_with_subjectP(previous_sentence, subj2) : pph_sentence.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 11572L)
    public static SubLObject pph_sentence_ends_with_subjectP(final SubLObject sentence, final SubLObject subj) {
        final SubLObject dtr = pph_phrase.pph_phrase_last_dtr(sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != subj && pph_sentence.NIL != dtr && (pph_sentence.NIL != pph_string.pph_string_equalP(pph_phrase.pph_phrase_string(subj, (SubLObject)pph_sentence.NIL), pph_phrase.pph_phrase_string(dtr, (SubLObject)pph_sentence.NIL)) || (pph_sentence.NIL != pph_phrase.pph_phrase_has_known_cyclP(subj) && pph_phrase.pph_phrase_cycl(subj, (SubLObject)pph_sentence.UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_sentence.UNPROVIDED))) || (pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr) && pph_sentence.NIL != pph_sentence_ends_with_subjectP(dtr, subj))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 12007L)
    public static SubLObject pph_subject_ok_to_distribute_across_andP(final SubLObject subject) {
        if (pph_sentence.NIL != pph_existentially_quantified_npP(subject)) {
            return (SubLObject)pph_sentence.NIL;
        }
        return (SubLObject)pph_sentence.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 12190L)
    public static SubLObject pph_existentially_quantified_npP(final SubLObject subject) {
        if (pph_phrase.pph_phrase_dtr_count(subject).numGE((SubLObject)pph_sentence.TWO_INTEGER)) {
            final SubLObject detp_dtr = pph_phrase.pph_phrase_nth_dtr(subject, (SubLObject)pph_sentence.ZERO_INTEGER);
            if (pph_sentence.$const10$Some_NLAttr.equal(pph_phrase.pph_phrase_cycl(detp_dtr, (SubLObject)pph_sentence.UNPROVIDED))) {
                return (SubLObject)pph_sentence.T;
            }
        }
        return (SubLObject)pph_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 12438L)
    public static SubLObject pph_sentences_surface_equal_modulo_pronounsP(final SubLObject s1, final SubLObject s2) {
        if (pph_sentence.NIL != pph_string.pph_string_equalP(pph_sentence_string(s1, (SubLObject)pph_sentence.NIL), pph_sentence_string(s2, (SubLObject)pph_sentence.NIL))) {
            return (SubLObject)pph_sentence.T;
        }
        if (pph_sentence.NIL == list_utilities.same_length_p(pph_sentence_main_clause_dtr_list(s1), pph_sentence_main_clause_dtr_list(s2))) {
            return (SubLObject)pph_sentence.NIL;
        }
        if (pph_sentence.NIL != list_utilities.empty_list_p(pph_sentence_main_clause_dtr_list(s1))) {
            return (SubLObject)pph_sentence.NIL;
        }
        SubLObject d1 = (SubLObject)pph_sentence.NIL;
        SubLObject d1_$1 = (SubLObject)pph_sentence.NIL;
        SubLObject d2 = (SubLObject)pph_sentence.NIL;
        SubLObject d2_$2 = (SubLObject)pph_sentence.NIL;
        d1 = pph_sentence_main_clause_dtr_list(s1);
        d1_$1 = d1.first();
        d2 = pph_sentence_main_clause_dtr_list(s2);
        d2_$2 = d2.first();
        while (pph_sentence.NIL != d2 || pph_sentence.NIL != d1) {
            final SubLObject d1_string = pph_phrase.pph_phrase_string(d1_$1, (SubLObject)pph_sentence.NIL);
            final SubLObject d2_string = pph_phrase.pph_phrase_string(d2_$2, (SubLObject)pph_sentence.NIL);
            if (pph_sentence.NIL == pph_string.pph_string_equalP(d1_string, d2_string) && pph_sentence.NIL == pph_variable_handling.pph_string_is_posP(d1_string, pph_sentence.$const11$Pronoun, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED) && pph_sentence.NIL == pph_variable_handling.pph_string_is_posP(d2_string, pph_sentence.$const11$Pronoun, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)) {
                return (SubLObject)pph_sentence.NIL;
            }
            d1 = d1.rest();
            d1_$1 = d1.first();
            d2 = d2.rest();
            d2_$2 = d2.first();
        }
        return pph_string.pph_string_equalP(pph_string.pph_bunge(Mapping.mapcar((SubLObject)pph_sentence.$sym12$PPH_PHRASE_STRING_NO_TAGS, pph_sentence_main_clause_post_modifiers(s1))), pph_string.pph_bunge(Mapping.mapcar((SubLObject)pph_sentence.$sym12$PPH_PHRASE_STRING_NO_TAGS, pph_sentence_main_clause_post_modifiers(s2))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 13440L)
    public static SubLObject pph_sentence_generate(final SubLObject sentence, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_sentence.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_sentence.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_sentence.UNPROVIDED) {
            mode = (SubLObject)pph_sentence.$kw13$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_sentence.NIL == pph_phrase.pph_phrase_doneP(sentence)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_sentence$.currentBinding(thread);
            try {
                pph_vars.$pph_sentence$.bind(sentence, thread);
                final SubLObject force = pph_sentence_force(sentence);
                final SubLObject formula = pph_sentence_cycl(sentence);
                final SubLObject nl_preds = pph_sentence_agr_preds(sentence);
                final SubLObject focus_arg = pph_sentence_focus_arg(sentence);
                SubLObject string = (SubLObject)pph_sentence.NIL;
                SubLObject pred = (SubLObject)pph_sentence.NIL;
                SubLObject just = (SubLObject)pph_sentence.NIL;
                SubLObject olist = (SubLObject)pph_sentence.NIL;
                SubLObject demerits = (SubLObject)pph_sentence.NIL;
                if (pph_sentence.NIL == pph_phrase.pph_unknown_cycl_p(formula)) {
                    final SubLObject pcase_var = force;
                    if (pcase_var.eql((SubLObject)pph_sentence.$kw1$DECLARATIVE)) {
                        final SubLObject _prev_bind_0_$3 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                            pph_sentence_generate_declarative(sentence);
                        }
                        finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_3, thread);
                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.$kw14$IMPERATIVE)) {
                        thread.resetMultipleValues();
                        final SubLObject string_$4 = pph_main.generate_text(formula, (SubLObject)pph_sentence.$list15, language_mt, domain_mt, mode, focus_arg);
                        final SubLObject pred_$5 = thread.secondMultipleValue();
                        final SubLObject just_$6 = thread.thirdMultipleValue();
                        final SubLObject olist_$7 = thread.fourthMultipleValue();
                        final SubLObject demerits_$8 = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        string = string_$4;
                        pred = pred_$5;
                        just = just_$6;
                        olist = olist_$7;
                        demerits = demerits_$8;
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.$kw16$INTERROGATIVE) || pcase_var.eql((SubLObject)pph_sentence.$kw17$QUESTION)) {
                        thread.resetMultipleValues();
                        final SubLObject string_$5 = pph_question.generate_question(formula, language_mt, domain_mt, mode, nl_preds);
                        final SubLObject pred_$6 = thread.secondMultipleValue();
                        final SubLObject just_$7 = thread.thirdMultipleValue();
                        final SubLObject olist_$8 = thread.fourthMultipleValue();
                        final SubLObject demerits_$9 = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        string = string_$5;
                        pred = pred_$6;
                        just = just_$7;
                        olist = olist_$8;
                        demerits = demerits_$9;
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.$kw18$NONE)) {
                        thread.resetMultipleValues();
                        final SubLObject string_$6 = pph_main.generate_phrase_no_checks(formula, nl_preds, (SubLObject)pph_sentence.NIL, language_mt, domain_mt, mode, (SubLObject)pph_sentence.NIL, focus_arg);
                        final SubLObject pred_$7 = thread.secondMultipleValue();
                        final SubLObject just_$8 = thread.thirdMultipleValue();
                        final SubLObject olist_$9 = thread.fourthMultipleValue();
                        final SubLObject demerits_$10 = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        string = string_$6;
                        pred = pred_$7;
                        just = just_$8;
                        olist = olist_$9;
                        demerits = demerits_$10;
                    }
                    if (pph_sentence.NIL == pph_sentence_doneP(sentence)) {
                        pph_sentence_update_from_helper_function_results(sentence, string, pred, just, olist, demerits);
                    }
                }
            }
            finally {
                pph_vars.$pph_sentence$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_sentence_string(sentence, (SubLObject)pph_sentence.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 14980L)
    public static SubLObject pph_sentence_update_from_helper_function_results(final SubLObject sentence, SubLObject string, final SubLObject pred, final SubLObject just, final SubLObject olist, final SubLObject demerits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_sentence.NIL != cycl_string.cycl_string_p(string)) {
            string = pph_string.pph_string_from_cycl_string(string);
        }
        if (pph_sentence.NIL != pph_string.pph_string_p(string)) {
            if (pph_sentence.NIL != pred) {
                pph_sentence_set_agr_pred(sentence, pred, (SubLObject)pph_sentence.UNPROVIDED);
            }
            pph_sentence_set_justification(sentence, just);
            if (pph_sentence.NIL != subl_promotions.non_negative_integer_p(demerits)) {
                pph_sentence_set_demerits(sentence, demerits, (SubLObject)pph_sentence.$str19$Recursive_generation_from_PPH_SEN);
            }
            final SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
            try {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P() && pph_sentence.NIL == Sequences.find_if((SubLObject)pph_sentence.$sym20$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, just, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)), thread);
                pph_sentence_set_output_list(sentence, olist);
            }
            finally {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
            }
            pph_phrase.pph_phrase_note_done(sentence);
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 15733L)
    public static SubLObject pph_sentence_generate_declarative(final SubLObject sentence) {
        if (pph_sentence.NIL != el_utilities.el_conjunction_p(pph_sentence_cycl(sentence))) {
            attempt_to_generate_multi_clause_sentence(sentence);
        }
        if (pph_sentence.NIL == pph_sentence_doneP(sentence)) {
            pph_main.pph_phrase_generate(sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
            if (pph_sentence.NIL != pph_sentence_doneP(sentence)) {
                pph_sentence_set_output_list(sentence, pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(pph_phrase.pph_phrase_output_list(sentence), (SubLObject)pph_sentence.$kw1$DECLARATIVE));
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 16267L)
    public static SubLObject attempt_to_generate_multi_clause_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_sentence.NIL == pph_sentence.$dont_generate_multi_clause_sentenceP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = pph_sentence.$dont_generate_multi_clause_sentenceP$.currentBinding(thread);
            try {
                pph_sentence.$dont_generate_multi_clause_sentenceP$.bind((SubLObject)pph_sentence.T, thread);
                final SubLObject agr_preds = pph_sentence_agr_preds(sentence);
                SubLObject sub_sentences = (SubLObject)pph_sentence.NIL;
                pph_utilities.pph_phrase_rephrase_cycl(sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(pph_sentence_cycl(sentence), (SubLObject)pph_sentence.$kw8$IGNORE);
                SubLObject conjunct = (SubLObject)pph_sentence.NIL;
                conjunct = cdolist_list_var.first();
                while (pph_sentence.NIL != cdolist_list_var) {
                    sub_sentences = (SubLObject)ConsesLow.cons(new_pph_sentence(conjunct, (SubLObject)pph_sentence.$kw1$DECLARATIVE, agr_preds), sub_sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                }
                final SubLObject paragraph = pph_document.new_pph_paragraph((SubLObject)pph_sentence.NIL, Sequences.nreverse(sub_sentences));
                pph_document.pph_paragraph_generate(paragraph, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
                if (pph_sentence.NIL != pph_document.pph_paragraph_doneP(paragraph)) {
                    SubLObject sentence_num = (SubLObject)pph_sentence.ZERO_INTEGER;
                    if (document.sign_constituents(paragraph).isVector()) {
                        final SubLObject vector_var = document.sign_constituents(paragraph);
                        final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject sub_sentence;
                        SubLObject sentence_arg_position;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                            element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                            sub_sentence = Vectors.aref(vector_var, element_num);
                            sentence_arg_position = pph_utilities.pph_arg_position_from_template(at_utilities.get_generic_arg(number_utilities.f_1X(sentence_num)));
                            update_arg_positions_in_multi_clause_sentence(sub_sentence, sentence_arg_position);
                            sentence_num = Numbers.add(sentence_num, (SubLObject)pph_sentence.ONE_INTEGER);
                        }
                    }
                    pph_document.pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                    pph_phrase.set_pph_phrase_dtrs_from_list(sentence, pph_phrase.pph_phrase_dtr_list(paragraph), (SubLObject)pph_sentence.UNPROVIDED);
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(sentence);
                    pph_phrase.pph_phrase_note_done(sentence);
                }
            }
            finally {
                pph_sentence.$dont_generate_multi_clause_sentenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 17629L)
    public static SubLObject update_arg_positions_in_multi_clause_sentence(final SubLObject constituent, final SubLObject sentence_arg_position) {
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(constituent);
        SubLObject item = (SubLObject)pph_sentence.NIL;
        item = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            update_arg_position_for_multi_clause_sentence_item(sentence_arg_position, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        SubLObject dtr_num = (SubLObject)pph_sentence.ZERO_INTEGER;
        if (document.sign_constituents(constituent).isVector()) {
            final SubLObject vector_var = document.sign_constituents(constituent);
            final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                update_arg_positions_in_multi_clause_sentence(dtr, sentence_arg_position);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_sentence.ONE_INTEGER);
            }
        }
        return constituent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18016L)
    public static SubLObject update_arg_position_for_multi_clause_sentence_item_internal(final SubLObject sentence_arg_position, final SubLObject item) {
        final SubLObject item_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
        if (pph_sentence.NIL != pph_utilities.pph_known_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item))) {
            final SubLObject new_arg_position = pph_utilities.pph_contextualize_arg_position(sentence_arg_position, item_position);
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, new_arg_position);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18016L)
    public static SubLObject update_arg_position_for_multi_clause_sentence_item(final SubLObject sentence_arg_position, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_sentence.NIL;
        if (pph_sentence.NIL == v_memoization_state) {
            return update_arg_position_for_multi_clause_sentence_item_internal(sentence_arg_position, item);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_sentence.$sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, (SubLObject)pph_sentence.UNPROVIDED);
        if (pph_sentence.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_sentence.$sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, (SubLObject)pph_sentence.TWO_INTEGER, (SubLObject)pph_sentence.NIL, (SubLObject)pph_sentence.EQUAL, (SubLObject)pph_sentence.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_sentence.$sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence_arg_position, item);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_sentence.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_sentence.NIL;
            collision = cdolist_list_var.first();
            while (pph_sentence.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence_arg_position.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_sentence.NIL != cached_args && pph_sentence.NIL == cached_args.rest() && item.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(update_arg_position_for_multi_clause_sentence_item_internal(sentence_arg_position, item)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence_arg_position, item));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18542L)
    public static SubLObject pph_sentence_add_alternative(final SubLObject alternative) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copy = pph_phrase.pph_phrase_copy(alternative, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        pph_phrase.pph_phrase_add_alternative(pph_vars.$pph_sentence$.getDynamicValue(thread), copy);
        return copy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 18796L)
    public static SubLObject pph_sentence_conjoin_roots(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject phrases_to_append = pph_sentence_main_clause_dtr_list(this_sentence);
        final SubLObject previous_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(previous_sentence).rest();
        final SubLObject comma_and_phrase = Sequences.find(pph_sentence.$comma_and$.getGlobalValue(), previous_sentence_main_vp_phrases, Symbols.symbol_function((SubLObject)pph_sentence.$sym24$PPH_STRING_EQUAL_), Symbols.symbol_function((SubLObject)pph_sentence.$sym25$PPH_PHRASE_STRING), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        pph_sentence_do_conjunction(previous_sentence, this_sentence, phrases_to_append, comma_and_phrase);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 19346L)
    public static SubLObject pph_sentence_okay_for_restrictive_rel_clauseP(final SubLObject sentence) {
        final SubLObject subj = pph_sentence_subject(sentence);
        final SubLObject subj_mother = (SubLObject)((pph_sentence.NIL != subj) ? pph_phrase.pph_phrase_mother(subj) : pph_sentence.NIL);
        SubLObject okP = (SubLObject)pph_sentence.NIL;
        if (pph_sentence.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_sentence.UNPROVIDED) && pph_sentence.NIL != subj_mother) {
            SubLObject dtr_num = (SubLObject)pph_sentence.ZERO_INTEGER;
            if (document.sign_constituents(subj_mother).isVector()) {
                final SubLObject vector_var = document.sign_constituents(subj_mother);
                final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sibling;
                SubLObject pcase_var;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                    element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                    sibling = Vectors.aref(vector_var, element_num);
                    pcase_var = dtr_num;
                    if (pcase_var.eql((SubLObject)pph_sentence.ZERO_INTEGER)) {
                        if (!sibling.eql(subj)) {
                            return (SubLObject)pph_sentence.NIL;
                        }
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.ONE_INTEGER)) {
                        if (pph_sentence.NIL == pph_phrase.pph_copula_phraseP(sibling)) {
                            return (SubLObject)pph_sentence.NIL;
                        }
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.TWO_INTEGER)) {
                        if (pph_sentence.NIL == pph_phrase.pph_phrase_npP(sibling)) {
                            return (SubLObject)pph_sentence.NIL;
                        }
                        okP = (SubLObject)pph_sentence.T;
                    }
                    else if (pcase_var.eql((SubLObject)pph_sentence.THREE_INTEGER)) {
                        return (SubLObject)pph_sentence.NIL;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_sentence.ONE_INTEGER);
                }
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 19936L)
    public static SubLObject pph_sentence_introduce_restrictive_rel_clause(final SubLObject previous_sentence, final SubLObject this_sentence) {
        pph_sentence_append(pph_data_structures.new_pph_phrase((SubLObject)pph_sentence.$str26$that, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        SubLObject cdolist_list_var = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        SubLObject dtr = (SubLObject)pph_sentence.NIL;
        dtr = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            pph_sentence_append(dtr, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        }
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 20567L)
    public static SubLObject pph_sentence_introduce_relative_clause(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj = pph_sentence_subject(this_sentence);
        final SubLObject subj_cycl = pph_phrase.pph_phrase_cycl(subj, (SubLObject)pph_sentence.UNPROVIDED);
        final SubLObject use_whoP = (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL != pph_phrase.pph_known_cycl_p(subj_cycl) && pph_sentence.NIL != pph_utilities.pph_isaP(subj_cycl, pph_sentence.$const27$Person, (SubLObject)pph_sentence.UNPROVIDED));
        pph_sentence_append(pph_data_structures.new_pph_phrase(pph_sentence.$comma$.getGlobalValue(), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        pph_sentence_append(pph_data_structures.new_pph_phrase((SubLObject)((pph_sentence.NIL != use_whoP) ? pph_sentence.$str28$who : pph_sentence.$str29$which), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        SubLObject cdolist_list_var = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        SubLObject dtr = (SubLObject)pph_sentence.NIL;
        dtr = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            pph_sentence_append(dtr, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        }
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 21380L)
    public static SubLObject pph_sentence_adjoin_additional_subject(final SubLObject previous_sentence, final SubLObject additional_subject) {
        final SubLObject head_verb = pph_sentence_head_verb(previous_sentence);
        final SubLObject new_verb = (pph_sentence.NIL != pph_phrase.pph_aux_verb_phraseP(head_verb) || pph_sentence.NIL != pph_phrase.pph_copula_phraseP(head_verb)) ? pph_phrase.pph_phrase_copy(head_verb, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED) : pph_utilities.new_pph_do_phrase_matching_head_verb_and_subject(head_verb, additional_subject);
        pph_sentence_append(pph_data_structures.new_pph_phrase(pph_sentence.$comma$.getGlobalValue(), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        pph_sentence_append(pph_data_structures.new_pph_phrase((SubLObject)pph_sentence.$str30$as, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        pph_sentence_append(new_verb, previous_sentence);
        pph_sentence_append(additional_subject, previous_sentence);
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        final SubLObject result_string = pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
        Errors.warn((SubLObject)pph_sentence.$str31$Adjoined_additional_subject_to_fo, result_string);
        return result_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 22281L)
    public static SubLObject pph_sentence_conjoin_main_vp(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (pph_sentence.NIL == pph_utilities.pph_english_contextP((SubLObject)pph_sentence.UNPROVIDED)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_sentence.$str32$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_sentence.ONE_INTEGER), pph_sentence.$str33$__, format_nil.format_nil_a_no_copy((SubLObject)pph_sentence.$str34$Can_t_conjoin_non_English_sentenc) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(pph_sentence.EMPTY_SUBL_OBJECT_ARRAY));
        }
        final SubLObject this_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        final SubLObject previous_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(previous_sentence).rest();
        final SubLObject comma_and_phrase = Sequences.find(pph_sentence.$comma_and$.getGlobalValue(), previous_sentence_main_vp_phrases, Symbols.symbol_function((SubLObject)pph_sentence.$sym24$PPH_STRING_EQUAL_), Symbols.symbol_function((SubLObject)pph_sentence.$sym25$PPH_PHRASE_STRING), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        final SubLObject previous_clause_main_vp_phrases = (pph_sentence.NIL != comma_and_phrase) ? Sequences.subseq(previous_sentence_main_vp_phrases, number_utilities.f_1X(Sequences.position(comma_and_phrase, previous_sentence_main_vp_phrases, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)), (SubLObject)pph_sentence.UNPROVIDED) : previous_sentence_main_vp_phrases;
        final SubLObject phrases_to_append = truncate_vp_conjunct(previous_clause_main_vp_phrases, this_sentence_main_vp_phrases);
        SubLObject truncated = (SubLObject)pph_sentence.NIL;
        SubLObject cdolist_list_var = this_sentence_main_vp_phrases;
        SubLObject phrase = (SubLObject)pph_sentence.NIL;
        phrase = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            if (pph_sentence.NIL == subl_promotions.memberP(phrase, phrases_to_append, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)) {
                truncated = (SubLObject)ConsesLow.cons(phrase, truncated);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        pph_sentence_set_truncated_phrases(previous_sentence, truncated);
        pph_sentence_do_conjunction(previous_sentence, this_sentence, phrases_to_append, comma_and_phrase);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 23527L)
    public static SubLObject pph_sentence_do_conjunction(final SubLObject previous_sentence, final SubLObject this_sentence, SubLObject phrases_to_append, final SubLObject comma_and_phrase) {
        if (pph_sentence.NIL != list_utilities.empty_list_p(phrases_to_append)) {
            Errors.sublisp_break((SubLObject)pph_sentence.$str35$Nothing_to_append_, pph_sentence.EMPTY_SUBL_OBJECT_ARRAY);
        }
        phrases_to_append = remove_repeated_pps(phrases_to_append, previous_sentence);
        if (pph_sentence.NIL == list_utilities.singletonP(phrases_to_append) || pph_sentence.NIL == pph_phrase.pph_phrase_ppP(list_utilities.only_one(phrases_to_append))) {
            if (pph_sentence.NIL != comma_and_phrase) {
                pph_phrase.pph_phrase_set_string(comma_and_phrase, pph_sentence.$comma$.getGlobalValue());
            }
            pph_sentence_append(pph_data_structures.new_pph_phrase(pph_sentence.$comma_and$.getGlobalValue(), (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED), previous_sentence);
        }
        SubLObject cdolist_list_var = phrases_to_append;
        SubLObject new_phrase = (SubLObject)pph_sentence.NIL;
        new_phrase = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            pph_sentence_append(new_phrase, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            new_phrase = cdolist_list_var.first();
        }
        cdolist_list_var = pph_sentence_main_clause_post_modifiers(this_sentence);
        new_phrase = (SubLObject)pph_sentence.NIL;
        new_phrase = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            pph_sentence_append(new_phrase, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            new_phrase = cdolist_list_var.first();
        }
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, (SubLObject)pph_sentence.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 24557L)
    public static SubLObject remove_repeated_pps(final SubLObject phrases, final SubLObject sentence) {
        SubLObject ans = (SubLObject)pph_sentence.NIL;
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = (SubLObject)pph_sentence.NIL;
        phrase = cdolist_list_var.first();
        while (pph_sentence.NIL != cdolist_list_var) {
            SubLObject doomedP = (SubLObject)pph_sentence.NIL;
            SubLObject cdolist_list_var_$19 = pph_phrase.pph_phrase_gather(phrase, (SubLObject)pph_sentence.$sym37$PPH_PHRASE_PP_, (SubLObject)pph_sentence.UNPROVIDED);
            SubLObject pp = (SubLObject)pph_sentence.NIL;
            pp = cdolist_list_var_$19.first();
            while (pph_sentence.NIL != cdolist_list_var_$19) {
                SubLObject mother = pph_phrase.pph_phrase_mother(pp);
                if ((pph_sentence.NIL != pph_phrase.pph_phrase_npP(mother) || pph_sentence.NIL != pph_phrase.pph_phrase_nbarP(mother)) && pph_sentence.NIL != pph_phrase_contains_matching_ppP(sentence, pp)) {
                    Errors.warn((SubLObject)pph_sentence.$str36$Removing_PP__S_from__S, pph_string.pph_string_to_utf8(pph_phrase.pph_phrase_string(pp, (SubLObject)pph_sentence.UNPROVIDED)), pph_string.pph_string_to_utf8(pph_phrase.pph_phrase_string(mother, (SubLObject)pph_sentence.UNPROVIDED)));
                    if (pph_sentence.NIL != subl_promotions.memberP(pp, phrases, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)) {
                        doomedP = (SubLObject)pph_sentence.T;
                    }
                    else {
                        SubLObject last_one_modified = pp;
                        pph_phrase.pph_phrase_remove_dtr(mother, pp);
                        while (pph_sentence.NIL != mother && pph_sentence.NIL == subl_promotions.memberP(last_one_modified, phrases, (SubLObject)pph_sentence.UNPROVIDED, (SubLObject)pph_sentence.UNPROVIDED)) {
                            pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(mother);
                            last_one_modified = mother;
                            mother = pph_phrase.pph_phrase_mother(mother);
                        }
                    }
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                pp = cdolist_list_var_$19.first();
            }
            if (pph_sentence.NIL == doomedP) {
                ans = (SubLObject)ConsesLow.cons(phrase, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 25568L)
    public static SubLObject pph_phrase_contains_matching_ppP(final SubLObject phrase, final SubLObject pp) {
        if (pph_sentence.NIL != pph_phrase.pph_phrase_ppP(phrase) && (pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_sentence.NIL).equal(pph_phrase.pph_phrase_string(pp, (SubLObject)pph_sentence.NIL)) || (pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_sentence.ZERO_INTEGER), (SubLObject)pph_sentence.UNPROVIDED).eql(pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(pp, (SubLObject)pph_sentence.ZERO_INTEGER), (SubLObject)pph_sentence.UNPROVIDED)) && pph_sentence.NIL != pph_phrase.pph_known_cycl_p(pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_sentence.ONE_INTEGER), (SubLObject)pph_sentence.UNPROVIDED)) && pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_sentence.ONE_INTEGER), (SubLObject)pph_sentence.UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(pp, (SubLObject)pph_sentence.ONE_INTEGER), (SubLObject)pph_sentence.UNPROVIDED))))) {
            return (SubLObject)pph_sentence.T;
        }
        SubLObject dtr_num = (SubLObject)pph_sentence.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_sentence.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_sentence.NIL, v_iteration = (SubLObject)pph_sentence.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_sentence.ONE_INTEGER)) {
                element_num = ((pph_sentence.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_sentence.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (pph_sentence.NIL != pph_phrase_contains_matching_ppP(dtr, pp)) {
                    return (SubLObject)pph_sentence.T;
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_sentence.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_sentence.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 26210L)
    public static SubLObject pph_sentence_set_truncated_phrases(final SubLObject sentence, final SubLObject truncated) {
        return pph_data_structures.pph_phrase_info_set(sentence, (SubLObject)pph_sentence.$kw38$TRUNCATED_PHRASES, truncated);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 26352L)
    public static SubLObject pph_sentence_truncated_phrases(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, (SubLObject)pph_sentence.$kw38$TRUNCATED_PHRASES, (SubLObject)pph_sentence.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 26478L)
    public static SubLObject pph_sentence_starts_withP(final SubLObject sentence, final SubLObject phrases) {
        SubLObject sentence_string = pph_sentence_string(sentence, (SubLObject)pph_sentence.NIL);
        SubLObject failP = (SubLObject)pph_sentence.NIL;
        if (pph_sentence.NIL == failP) {
            SubLObject csome_list_var = phrases;
            SubLObject phrase = (SubLObject)pph_sentence.NIL;
            phrase = csome_list_var.first();
            while (pph_sentence.NIL == failP && pph_sentence.NIL != csome_list_var) {
                if (pph_sentence.NIL != string_utilities.starts_with(string_utilities.trim_whitespace(sentence_string), pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_sentence.NIL))) {
                    sentence_string = string_utilities.pre_remove(sentence_string, pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_sentence.NIL), (SubLObject)pph_sentence.UNPROVIDED);
                }
                else {
                    failP = (SubLObject)pph_sentence.T;
                }
                csome_list_var = csome_list_var.rest();
                phrase = csome_list_var.first();
            }
        }
        if (pph_sentence.NIL == list_utilities.empty_list_p(phrases) && pph_sentence.NIL == failP) {
            Errors.warn((SubLObject)pph_sentence.$str39$_S___starts_with__S, sentence_string, string_utilities.bunge(Mapping.mapcar((SubLObject)pph_sentence.$sym25$PPH_PHRASE_STRING, phrases), (SubLObject)pph_sentence.UNPROVIDED));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sentence.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 27022L)
    public static SubLObject truncate_vp_conjunct(final SubLObject previous_sentence_main_vp_phrases, final SubLObject this_sentence_main_vp_phrases) {
        final SubLObject this_phrase = this_sentence_main_vp_phrases.first();
        final SubLObject previous_phrase = previous_sentence_main_vp_phrases.first();
        if (pph_sentence.NIL != pph_phrase.pph_copula_phraseP(this_phrase)) {
            return this_sentence_main_vp_phrases;
        }
        if (pph_sentence.NIL != pph_phrase_resolution.pph_phrase_detpP(this_phrase)) {
            return this_sentence_main_vp_phrases;
        }
        if (pph_phrase.pph_phrase_string(this_phrase, (SubLObject)pph_sentence.UNPROVIDED).equal(pph_phrase.pph_phrase_string(previous_phrase, (SubLObject)pph_sentence.UNPROVIDED)) && pph_phrase.pph_phrase_category(this_phrase, (SubLObject)pph_sentence.UNPROVIDED).equal(pph_phrase.pph_phrase_category(previous_phrase, (SubLObject)pph_sentence.UNPROVIDED))) {
            Errors.warn((SubLObject)pph_sentence.$str40$Truncating__S_from__S___based_on_, pph_phrase.pph_phrase_string(this_phrase, (SubLObject)pph_sentence.UNPROVIDED), pph_string.pph_bunge(Mapping.mapcar((SubLObject)pph_sentence.$sym25$PPH_PHRASE_STRING, this_sentence_main_vp_phrases)), pph_string.pph_bunge(Mapping.mapcar((SubLObject)pph_sentence.$sym25$PPH_PHRASE_STRING, previous_sentence_main_vp_phrases)));
            return truncate_vp_conjunct(previous_sentence_main_vp_phrases.rest(), this_sentence_main_vp_phrases.rest());
        }
        if (pph_sentence.NIL != pph_phrase.pph_phrase_has_dtrsP(this_phrase) && pph_phrase.pph_phrase_dtr_count(this_phrase).eql(pph_phrase.pph_phrase_dtr_count(previous_phrase))) {
            final SubLObject this_phrase_dtrs = pph_phrase.pph_phrase_dtr_list(this_phrase);
            final SubLObject this_phrase_truncated_dtrs = truncate_vp_conjunct(pph_phrase.pph_phrase_dtr_list(previous_phrase), this_phrase_dtrs);
            return this_phrase_dtrs.equal(this_phrase_truncated_dtrs) ? this_sentence_main_vp_phrases : ConsesLow.append(this_phrase_truncated_dtrs, this_sentence_main_vp_phrases.rest());
        }
        return this_sentence_main_vp_phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sentence.lisp", position = 28811L)
    public static SubLObject pph_sentence_append(final SubLObject new_phrase, final SubLObject sentence) {
        final SubLObject append_target = pph_sentence_main_clause(sentence);
        pph_phrase.pph_phrase_append(new_phrase, append_target);
        pph_phrase.pph_phrase_note_not_done(append_target);
        return sentence;
    }
    
    public static SubLObject declare_pph_sentence_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_p", "PPH-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "new_pph_sentence", "NEW-PPH-SENTENCE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_copy", "PPH-SENTENCE-COPY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_force", "PPH-SENTENCE-SET-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_force", "PPH-SENTENCE-FORCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_agr_pred", "PPH-SENTENCE-SET-AGR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_agr_preds", "PPH-SENTENCE-SET-AGR-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_agr_pred", "PPH-SENTENCE-AGR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_agr_preds", "PPH-SENTENCE-AGR-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_string", "PPH-SENTENCE-SET-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_string", "PPH-SENTENCE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_justification", "PPH-SENTENCE-SET-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_justification", "PPH-SENTENCE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_demerits", "PPH-SENTENCE-SET-DEMERITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_demerits", "PPH-SENTENCE-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_output_list", "PPH-SENTENCE-SET-OUTPUT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_output_list", "PPH-SENTENCE-OUTPUT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_cycl", "PPH-SENTENCE-SET-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_cycl", "PPH-SENTENCE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_topic", "PPH-SENTENCE-SET-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_topic", "PPH-SENTENCE-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_focus_arg", "PPH-SENTENCE-FOCUS-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_doneP", "PPH-SENTENCE-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_subject", "PPH-SENTENCE-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_head_verb", "PPH-SENTENCE-HEAD-VERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_subject_compatible_with_verbP", "PPH-SUBJECT-COMPATIBLE-WITH-VERB?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_main_clause", "PPH-SENTENCE-MAIN-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_main_clause_dtr_list", "PPH-SENTENCE-MAIN-CLAUSE-DTR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_main_clause_post_modifiers", "PPH-SENTENCE-MAIN-CLAUSE-POST-MODIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentences_differ_only_in_subjectP", "PPH-SENTENCES-DIFFER-ONLY-IN-SUBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_has_same_subjectP", "PPH-SENTENCE-HAS-SAME-SUBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_np_has_same_cyclP", "PPH-NP-HAS-SAME-CYCL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_ends_with_subject_ofP", "PPH-SENTENCE-ENDS-WITH-SUBJECT-OF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_ends_with_subjectP", "PPH-SENTENCE-ENDS-WITH-SUBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_subject_ok_to_distribute_across_andP", "PPH-SUBJECT-OK-TO-DISTRIBUTE-ACROSS-AND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_existentially_quantified_npP", "PPH-EXISTENTIALLY-QUANTIFIED-NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentences_surface_equal_modulo_pronounsP", "PPH-SENTENCES-SURFACE-EQUAL-MODULO-PRONOUNS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_generate", "PPH-SENTENCE-GENERATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_update_from_helper_function_results", "PPH-SENTENCE-UPDATE-FROM-HELPER-FUNCTION-RESULTS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_generate_declarative", "PPH-SENTENCE-GENERATE-DECLARATIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "attempt_to_generate_multi_clause_sentence", "ATTEMPT-TO-GENERATE-MULTI-CLAUSE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "update_arg_positions_in_multi_clause_sentence", "UPDATE-ARG-POSITIONS-IN-MULTI-CLAUSE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "update_arg_position_for_multi_clause_sentence_item_internal", "UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "update_arg_position_for_multi_clause_sentence_item", "UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_add_alternative", "PPH-SENTENCE-ADD-ALTERNATIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_conjoin_roots", "PPH-SENTENCE-CONJOIN-ROOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_okay_for_restrictive_rel_clauseP", "PPH-SENTENCE-OKAY-FOR-RESTRICTIVE-REL-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_introduce_restrictive_rel_clause", "PPH-SENTENCE-INTRODUCE-RESTRICTIVE-REL-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_introduce_relative_clause", "PPH-SENTENCE-INTRODUCE-RELATIVE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_adjoin_additional_subject", "PPH-SENTENCE-ADJOIN-ADDITIONAL-SUBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_conjoin_main_vp", "PPH-SENTENCE-CONJOIN-MAIN-VP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_do_conjunction", "PPH-SENTENCE-DO-CONJUNCTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "remove_repeated_pps", "REMOVE-REPEATED-PPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_phrase_contains_matching_ppP", "PPH-PHRASE-CONTAINS-MATCHING-PP?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_set_truncated_phrases", "PPH-SENTENCE-SET-TRUNCATED-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_truncated_phrases", "PPH-SENTENCE-TRUNCATED-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_starts_withP", "PPH-SENTENCE-STARTS-WITH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "truncate_vp_conjunct", "TRUNCATE-VP-CONJUNCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sentence", "pph_sentence_append", "PPH-SENTENCE-APPEND", 2, 0, false);
        return (SubLObject)pph_sentence.NIL;
    }
    
    public static SubLObject init_pph_sentence_file() {
        pph_sentence.$dont_generate_multi_clause_sentenceP$ = SubLFiles.defparameter("*DONT-GENERATE-MULTI-CLAUSE-SENTENCE?*", (SubLObject)pph_sentence.NIL);
        pph_sentence.$comma$ = SubLFiles.deflexical("*COMMA*", (SubLObject)pph_sentence.$str22$_);
        pph_sentence.$comma_and$ = SubLFiles.deflexical("*COMMA-AND*", (SubLObject)pph_sentence.$str23$__and);
        return (SubLObject)pph_sentence.NIL;
    }
    
    public static SubLObject setup_pph_sentence_file() {
        memoization_state.note_memoized_function((SubLObject)pph_sentence.$sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM);
        return (SubLObject)pph_sentence.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_sentence_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_sentence_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_sentence_file();
    }
    
    static {
        me = (SubLFile)new pph_sentence();
        pph_sentence.$dont_generate_multi_clause_sentenceP$ = null;
        pph_sentence.$comma$ = null;
        pph_sentence.$comma_and$ = null;
        $kw0$S = SubLObjectFactory.makeKeyword("S");
        $kw1$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw2$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw3$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $const4$NLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $kw5$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw6$FORCE = SubLObjectFactory.makeKeyword("FORCE");
        $kw7$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $kw8$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym9$PPH_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("PPH-GENL-PREDICATE?");
        $const10$Some_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr"));
        $const11$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $sym12$PPH_PHRASE_STRING_NO_TAGS = SubLObjectFactory.makeSymbol("PPH-PHRASE-STRING-NO-TAGS");
        $kw13$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw14$IMPERATIVE = SubLObjectFactory.makeKeyword("IMPERATIVE");
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")));
        $kw16$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw17$QUESTION = SubLObjectFactory.makeKeyword("QUESTION");
        $kw18$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str19$Recursive_generation_from_PPH_SEN = SubLObjectFactory.makeString("Recursive generation from PPH-SENTENCE-GENERATE");
        $sym20$GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = SubLObjectFactory.makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P");
        $sym21$UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM = SubLObjectFactory.makeSymbol("UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM");
        $str22$_ = SubLObjectFactory.makeString(",");
        $str23$__and = SubLObjectFactory.makeString(", and");
        $sym24$PPH_STRING_EQUAL_ = SubLObjectFactory.makeSymbol("PPH-STRING-EQUAL?");
        $sym25$PPH_PHRASE_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-STRING");
        $str26$that = SubLObjectFactory.makeString("that");
        $const27$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $str28$who = SubLObjectFactory.makeString("who");
        $str29$which = SubLObjectFactory.makeString("which");
        $str30$as = SubLObjectFactory.makeString("as");
        $str31$Adjoined_additional_subject_to_fo = SubLObjectFactory.makeString("Adjoined additional subject to form~% ~S");
        $str32$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str33$__ = SubLObjectFactory.makeString(") ");
        $str34$Can_t_conjoin_non_English_sentenc = SubLObjectFactory.makeString("Can't conjoin non-English sentence main VPs.");
        $str35$Nothing_to_append_ = SubLObjectFactory.makeString("Nothing to append!");
        $str36$Removing_PP__S_from__S = SubLObjectFactory.makeString("Removing PP ~S from ~S");
        $sym37$PPH_PHRASE_PP_ = SubLObjectFactory.makeSymbol("PPH-PHRASE-PP?");
        $kw38$TRUNCATED_PHRASES = SubLObjectFactory.makeKeyword("TRUNCATED-PHRASES");
        $str39$_S___starts_with__S = SubLObjectFactory.makeString("~S~% starts with ~S");
        $str40$Truncating__S_from__S___based_on_ = SubLObjectFactory.makeString("Truncating ~S from ~S~% based on ~S");
    }
}

/*

	Total time: 198 ms
	
*/