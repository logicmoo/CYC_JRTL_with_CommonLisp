package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_sentence extends SubLTranslatedFile {
    public static final SubLFile me = new pph_sentence();

    public static final String myName = "com.cyc.cycjava.cycl.pph_sentence";

    public static final String myFingerPrint = "2acd9ba8cb81281e9bb0f4d1baee694300e34cd7e7cafa40fd0e5fdbe391cc5f";

    // defparameter
    public static final SubLSymbol $dont_generate_multi_clause_sentenceP$ = makeSymbol("*DONT-GENERATE-MULTI-CLAUSE-SENTENCE?*");

    // deflexical
    private static final SubLSymbol $comma$ = makeSymbol("*COMMA*");

    // deflexical
    private static final SubLSymbol $comma_and$ = makeSymbol("*COMMA-AND*");









    private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));









    private static final SubLSymbol $sym9$PPH_GENL_PREDICATE_ = makeSymbol("PPH-GENL-PREDICATE?");

    private static final SubLObject $$Some_NLAttr = reader_make_constant_shell(makeString("Some-NLAttr"));

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLSymbol PPH_PHRASE_STRING_NO_TAGS = makeSymbol("PPH-PHRASE-STRING-NO-TAGS");





    private static final SubLList $list15 = list(reader_make_constant_shell(makeString("infinitive")));







    private static final SubLString $str19$Recursive_generation_from_PPH_SEN = makeString("Recursive generation from PPH-SENTENCE-GENERATE");

    private static final SubLSymbol GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P");

    private static final SubLSymbol UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM = makeSymbol("UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM");

    private static final SubLString $str22$_ = makeString(",");

    private static final SubLString $str23$__and = makeString(", and");

    private static final SubLSymbol $sym24$PPH_STRING_EQUAL_ = makeSymbol("PPH-STRING-EQUAL?");

    private static final SubLSymbol PPH_PHRASE_STRING = makeSymbol("PPH-PHRASE-STRING");

    private static final SubLString $$$that = makeString("that");

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLString $$$who = makeString("who");

    private static final SubLString $$$which = makeString("which");

    private static final SubLString $$$as = makeString("as");

    private static final SubLString $str31$Adjoined_additional_subject_to_fo = makeString("Adjoined additional subject to form~% ~S");

    private static final SubLString $str32$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str33$__ = makeString(") ");

    private static final SubLString $str34$Can_t_conjoin_non_English_sentenc = makeString("Can't conjoin non-English sentence main VPs.");

    private static final SubLString $str35$Nothing_to_append_ = makeString("Nothing to append!");

    private static final SubLString $str36$Removing_PP__S_from__S = makeString("Removing PP ~S from ~S");

    private static final SubLSymbol $sym37$PPH_PHRASE_PP_ = makeSymbol("PPH-PHRASE-PP?");



    private static final SubLString $str39$_S___starts_with__S = makeString("~S~% starts with ~S");

    private static final SubLString $str40$Truncating__S_from__S___based_on_ = makeString("Truncating ~S from ~S~% based on ~S");

    public static SubLObject pph_sentence_p(final SubLObject obj) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(obj, UNPROVIDED)) && (document.sign_type(obj) == $S));
    }

    public static SubLObject new_pph_sentence(SubLObject cycl, SubLObject force, SubLObject agr_preds) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (agr_preds == UNPROVIDED) {
            agr_preds = $ANY;
        }
        final SubLObject sentence = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        document._csetf_sign_type(sentence, $S);
        if (NIL != force) {
            pph_sentence_set_force(sentence, force);
        }
        pph_sentence_set_cycl(sentence, cycl);
        pph_sentence_set_agr_preds(sentence, agr_preds, UNPROVIDED);
        document.sign_update(sentence, list($CATEGORY, $$NLSentence));
        return sentence;
    }

    public static SubLObject pph_sentence_copy(final SubLObject old_sentence, SubLObject target) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (NIL == target) {
            target = new_pph_sentence(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (old_sentence.equalp(target)) {
            return target;
        }
        pph_sentence_set_output_list(target, pph_sentence_output_list(old_sentence));
        if (NIL != pph_phrase.pph_phrase_dtrs(old_sentence)) {
            SubLObject new_phrases = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(old_sentence).isVector()) {
                final SubLObject vector_var = document.sign_constituents(old_sentence);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject phrase;
                SubLObject new_phrase;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    phrase = aref(vector_var, element_num);
                    new_phrase = (NIL != pph_sentence_p(phrase)) ? pph_sentence_copy(phrase, UNPROVIDED) : phrase;
                    new_phrases = cons(new_phrase, new_phrases);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(target, nreverse(new_phrases), UNPROVIDED);
        } else {
            pph_phrase.pph_phrase_set_dtrs(target, NIL);
        }
        pph_sentence_set_cycl(target, pph_sentence_cycl(old_sentence));
        pph_phrase.pph_phrase_set_agr(target, pph_phrase.pph_phrase_agr(old_sentence), NIL);
        pph_sentence_set_force(target, pph_sentence_force(old_sentence));
        pph_sentence_set_justification(target, pph_sentence_justification(old_sentence));
        pph_phrase.pph_phrase_set_head_dtr_num(target, pph_phrase.pph_phrase_head_dtr_num(old_sentence));
        pph_phrase.pph_phrase_set_arg_position_map(target, pph_phrase.pph_phrase_arg_position_map(old_sentence));
        return target;
    }

    public static SubLObject pph_sentence_set_force(final SubLObject sentence, SubLObject force) {
        if (force == $DEFAULT) {
            force = $DECLARATIVE;
        }
        return pph_data_structures.pph_phrase_info_set(sentence, $FORCE, force);
    }

    public static SubLObject pph_sentence_force(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, $FORCE, UNPROVIDED);
    }

    public static SubLObject pph_sentence_set_agr_pred(final SubLObject sentence, final SubLObject agr_pred, SubLObject descend_into_condP) {
        if (descend_into_condP == UNPROVIDED) {
            descend_into_condP = T;
        }
        pph_phrase.pph_phrase_set_agr_pred(sentence, agr_pred, descend_into_condP);
        return sentence;
    }

    public static SubLObject pph_sentence_set_agr_preds(final SubLObject sentence, final SubLObject agr_preds, SubLObject descend_into_condP) {
        if (descend_into_condP == UNPROVIDED) {
            descend_into_condP = T;
        }
        pph_phrase.pph_phrase_set_agr_preds(sentence, agr_preds, descend_into_condP);
        return sentence;
    }

    public static SubLObject pph_sentence_agr_pred(final SubLObject sentence) {
        return pph_phrase.pph_phrase_agr_pred(sentence);
    }

    public static SubLObject pph_sentence_agr_preds(final SubLObject sentence) {
        return pph_phrase.pph_phrase_agr_preds(sentence, UNPROVIDED);
    }

    public static SubLObject pph_sentence_set_string(final SubLObject sentence, final SubLObject string) {
        pph_phrase.pph_phrase_set_string(sentence, string);
        return sentence;
    }

    public static SubLObject pph_sentence_string(final SubLObject sentence, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = T;
        }
        return pph_phrase.pph_phrase_string(sentence, add_tagsP);
    }

    public static SubLObject pph_sentence_set_justification(final SubLObject sentence, final SubLObject justification) {
        pph_phrase.pph_phrase_set_justification(sentence, justification);
        return sentence;
    }

    public static SubLObject pph_sentence_justification(final SubLObject sentence) {
        return pph_phrase.pph_phrase_justification(sentence);
    }

    public static SubLObject pph_sentence_set_demerits(final SubLObject sentence, final SubLObject demerits, final SubLObject why) {
        pph_phrase.pph_phrase_set_top_level_demerits(sentence, demerits, why);
        return sentence;
    }

    public static SubLObject pph_sentence_demerits(final SubLObject sentence) {
        return pph_phrase.pph_phrase_demerits(sentence);
    }

    public static SubLObject pph_sentence_set_output_list(final SubLObject sentence, final SubLObject output_list) {
        pph_phrase.pph_phrase_set_output_list(sentence, output_list, UNPROVIDED);
        return sentence;
    }

    public static SubLObject pph_sentence_output_list(final SubLObject sentence) {
        return pph_phrase.pph_phrase_output_list(sentence);
    }

    public static SubLObject pph_sentence_set_cycl(final SubLObject sentence, final SubLObject cycl) {
        pph_phrase.pph_phrase_set_cycl(sentence, cycl);
        return sentence;
    }

    public static SubLObject pph_sentence_cycl(final SubLObject sentence) {
        return pph_phrase.pph_phrase_cycl(sentence, UNPROVIDED);
    }

    public static SubLObject pph_sentence_set_topic(final SubLObject sentence, final SubLObject topic) {
        pph_data_structures.pph_phrase_info_set(sentence, $TOPIC, topic);
        final SubLObject cycl = pph_sentence_cycl(sentence);
        SubLObject focus_arg = NIL;
        SubLObject multipleP = NIL;
        if ((NIL != cycl_grammar.cycl_sentence_p(cycl)) && (NIL != pph_phrase.pph_known_cycl_p(topic))) {
            SubLObject argnum = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(cycl, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == multipleP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                argnum = add(argnum, ONE_INTEGER);
                if (arg.equal(topic)) {
                    if (NIL != subl_promotions.non_negative_integer_p(focus_arg)) {
                        multipleP = T;
                        focus_arg = NIL;
                    } else {
                        focus_arg = argnum;
                    }
                }
            }
        }
        if (NIL != focus_arg) {
            pph_phrase.pph_phrase_set_focus_arg(sentence, focus_arg);
        }
        return topic;
    }

    public static SubLObject pph_sentence_topic(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, $TOPIC, pph_phrase.pph_unknown_cycl());
    }

    public static SubLObject pph_sentence_focus_arg(final SubLObject sentence) {
        return pph_phrase.pph_phrase_focus_arg(sentence);
    }

    public static SubLObject pph_sentence_doneP(final SubLObject sentence) {
        return pph_phrase.pph_phrase_doneP(sentence);
    }

    public static SubLObject pph_sentence_subject(final SubLObject sentence) {
        final SubLObject dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject maybe_subj = dtrs.first();
        if ((NIL != maybe_subj) && (NIL != pph_phrase.pph_phrase_npP(maybe_subj))) {
            return maybe_subj;
        }
        final SubLObject head_verb = pph_sentence_head_verb(sentence);
        return NIL != head_verb ? pph_phrase.pph_phrase_subject_dtr(pph_phrase.pph_phrase_mother(head_verb)) : NIL;
    }

    public static SubLObject pph_sentence_head_verb(final SubLObject sentence) {
        final SubLObject main_clause_dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject head_verb = (NIL != list_utilities.non_empty_list_p(main_clause_dtrs)) ? pph_phrase.pph_phrase_head_dtr(pph_phrase.pph_phrase_mother(main_clause_dtrs.first())) : NIL;
        return (NIL != head_verb) && (NIL != pph_phrase.pph_phrase_verbP(head_verb)) ? head_verb : NIL;
    }

    public static SubLObject pph_subject_compatible_with_verbP(final SubLObject subj, final SubLObject verb) {
        if ((((NIL == pph_phrase.pph_phrase_p(subj, UNPROVIDED)) || (NIL == pph_phrase.pph_phrase_p(verb, UNPROVIDED))) || (NIL == pph_phrase.pph_phrase_doneP(subj))) || (NIL == pph_phrase.pph_phrase_doneP(verb))) {
            return NIL;
        }
        final SubLObject subj_preds = pph_phrase_resolution.verb_preds_for_subject(subj, UNPROVIDED);
        final SubLObject verb_pred = pph_phrase.pph_phrase_agr_pred(verb);
        return subl_promotions.memberP(verb_pred, subj_preds, symbol_function($sym9$PPH_GENL_PREDICATE_), UNPROVIDED);
    }

    public static SubLObject pph_sentence_main_clause(final SubLObject sentence) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(sentence)) {
            return NIL;
        }
        SubLObject maybe_main_clause = sentence;
        for (SubLObject maybe_dtrs = pph_phrase.pph_phrase_dtr_list(sentence), maybe_subj = maybe_dtrs.first(); (NIL != pph_phrase.pph_phrase_has_dtrsP(maybe_subj)) && ((NIL != pph_phrase.pph_phrase_sP(maybe_subj)) || ONE_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(pph_phrase.pph_phrase_mother(maybe_subj)))); maybe_subj = maybe_dtrs.first()) {
            maybe_dtrs = pph_phrase.pph_phrase_dtr_list(maybe_subj);
            maybe_main_clause = maybe_subj;
        }
        return maybe_main_clause;
    }

    public static SubLObject pph_sentence_main_clause_dtr_list(final SubLObject sentence) {
        final SubLObject main_clause = pph_sentence_main_clause(sentence);
        if ((NIL != main_clause) && (NIL != pph_phrase.pph_phrase_has_dtrsP(main_clause))) {
            final SubLObject dtrs = pph_phrase.pph_phrase_dtr_list(main_clause);
            final SubLObject head_dtr = pph_phrase.pph_phrase_head_dtr(main_clause);
            return (NIL != pph_phrase.pph_phrase_npP(dtrs.first())) || ((NIL != head_dtr) && (NIL != pph_phrase.pph_phrase_verbP(head_dtr))) ? dtrs : NIL;
        }
        return NIL;
    }

    public static SubLObject pph_sentence_main_clause_post_modifiers(final SubLObject sentence) {
        final SubLObject main_clause_dtrs = pph_sentence_main_clause_dtr_list(sentence);
        final SubLObject main_clause = (NIL != main_clause_dtrs) ? pph_phrase.pph_phrase_mother(main_clause_dtrs.first()) : NIL;
        final SubLObject s = (NIL != main_clause) ? pph_phrase.pph_phrase_mother(main_clause) : NIL;
        SubLObject post_modifiers = NIL;
        if (NIL != s) {
            SubLObject found_main_clauseP = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(s).isVector()) {
                final SubLObject vector_var = document.sign_constituents(s);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL != found_main_clauseP) {
                        post_modifiers = cons(dtr, post_modifiers);
                    } else
                        if (dtr.eql(main_clause)) {
                            found_main_clauseP = T;
                        }

                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return nreverse(post_modifiers);
    }

    public static SubLObject pph_sentences_differ_only_in_subjectP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (NIL != pph_sentence_has_same_subjectP(previous_sentence, this_sentence)) {
            return NIL;
        }
        final SubLObject subj1 = pph_sentence_subject(previous_sentence);
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        if ((NIL == subj1) || (NIL == subj2)) {
            return NIL;
        }
        final SubLObject subj1_string = pph_string.pph_string_downcase(pph_phrase.pph_phrase_string(subj1, NIL));
        final SubLObject subj2_string = pph_string.pph_string_downcase(pph_phrase.pph_phrase_string(subj2, NIL));
        final SubLObject prev_string = pph_string.pph_string_downcase(pph_sentence_string(previous_sentence, NIL));
        final SubLObject this_string = pph_string.pph_string_downcase(pph_sentence_string(this_sentence, NIL));
        return equal(pph_string.pph_remove_substring(prev_string, subj1_string), pph_string.pph_remove_substring(this_string, subj2_string));
    }

    public static SubLObject pph_sentence_has_same_subjectP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj1 = pph_sentence_subject(previous_sentence);
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        return makeBoolean(((NIL != subj1) && (NIL != subj2)) && ((NIL != pph_string.pph_string_equalP(pph_phrase.pph_phrase_string(subj1, NIL), pph_phrase.pph_phrase_string(subj2, NIL))) || ((NIL != pph_np_has_same_cyclP(subj1, subj2)) && (NIL != list_utilities.sublisp_boolean(pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(subj1, UNPROVIDED), pph_phrase.pph_phrase_agr_preds(subj2, UNPROVIDED), UNPROVIDED))))));
    }

    public static SubLObject pph_np_has_same_cyclP(final SubLObject np1, final SubLObject np2) {
        SubLObject cycl1 = pph_phrase.pph_phrase_cycl(np1, UNPROVIDED);
        SubLObject cycl2 = pph_phrase.pph_phrase_cycl(np2, UNPROVIDED);
        if (((NIL != pph_phrase.pph_unknown_cycl_p(cycl1)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(np1))) && (NIL != pph_phrase.pph_phrase_indefinite_articleP(pph_phrase.pph_phrase_nth_dtr(np1, ZERO_INTEGER)))) {
            cycl1 = pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_head_dtr(np1), UNPROVIDED);
        }
        if (((NIL != pph_phrase.pph_unknown_cycl_p(cycl2)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(np2))) && (NIL != pph_phrase.pph_phrase_indefinite_articleP(pph_phrase.pph_phrase_nth_dtr(np2, ZERO_INTEGER)))) {
            cycl2 = pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_head_dtr(np2), UNPROVIDED);
        }
        return makeBoolean((NIL != pph_phrase.pph_known_cycl_p(cycl1)) && cycl1.equal(cycl2));
    }

    public static SubLObject pph_sentence_ends_with_subject_ofP(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj2 = pph_sentence_subject(this_sentence);
        return NIL != subj2 ? pph_sentence_ends_with_subjectP(previous_sentence, subj2) : NIL;
    }

    public static SubLObject pph_sentence_ends_with_subjectP(final SubLObject sentence, final SubLObject subj) {
        final SubLObject dtr = pph_phrase.pph_phrase_last_dtr(sentence);
        return makeBoolean(((NIL != subj) && (NIL != dtr)) && (((NIL != pph_string.pph_string_equalP(pph_phrase.pph_phrase_string(subj, NIL), pph_phrase.pph_phrase_string(dtr, NIL))) || ((NIL != pph_phrase.pph_phrase_has_known_cyclP(subj)) && pph_phrase.pph_phrase_cycl(subj, UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED)))) || ((NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) && (NIL != pph_sentence_ends_with_subjectP(dtr, subj)))));
    }

    public static SubLObject pph_subject_ok_to_distribute_across_andP(final SubLObject subject) {
        if (NIL != pph_existentially_quantified_npP(subject)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject pph_existentially_quantified_npP(final SubLObject subject) {
        if (pph_phrase.pph_phrase_dtr_count(subject).numGE(TWO_INTEGER)) {
            final SubLObject detp_dtr = pph_phrase.pph_phrase_nth_dtr(subject, ZERO_INTEGER);
            if ($$Some_NLAttr.equal(pph_phrase.pph_phrase_cycl(detp_dtr, UNPROVIDED))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject pph_sentences_surface_equal_modulo_pronounsP(final SubLObject s1, final SubLObject s2) {
        if (NIL != pph_string.pph_string_equalP(pph_sentence_string(s1, NIL), pph_sentence_string(s2, NIL))) {
            return T;
        }
        if (NIL == list_utilities.same_length_p(pph_sentence_main_clause_dtr_list(s1), pph_sentence_main_clause_dtr_list(s2))) {
            return NIL;
        }
        if (NIL != list_utilities.empty_list_p(pph_sentence_main_clause_dtr_list(s1))) {
            return NIL;
        }
        SubLObject d1 = NIL;
        SubLObject d1_$1 = NIL;
        SubLObject d2 = NIL;
        SubLObject d2_$2 = NIL;
        d1 = pph_sentence_main_clause_dtr_list(s1);
        d1_$1 = d1.first();
        d2 = pph_sentence_main_clause_dtr_list(s2);
        d2_$2 = d2.first();
        while ((NIL != d2) || (NIL != d1)) {
            final SubLObject d1_string = pph_phrase.pph_phrase_string(d1_$1, NIL);
            final SubLObject d2_string = pph_phrase.pph_phrase_string(d2_$2, NIL);
            if (((NIL == pph_string.pph_string_equalP(d1_string, d2_string)) && (NIL == pph_variable_handling.pph_string_is_posP(d1_string, $$Pronoun, UNPROVIDED, UNPROVIDED))) && (NIL == pph_variable_handling.pph_string_is_posP(d2_string, $$Pronoun, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
            d1 = d1.rest();
            d1_$1 = d1.first();
            d2 = d2.rest();
            d2_$2 = d2.first();
        } 
        return pph_string.pph_string_equalP(pph_string.pph_bunge(Mapping.mapcar(PPH_PHRASE_STRING_NO_TAGS, pph_sentence_main_clause_post_modifiers(s1))), pph_string.pph_bunge(Mapping.mapcar(PPH_PHRASE_STRING_NO_TAGS, pph_sentence_main_clause_post_modifiers(s2))));
    }

    public static SubLObject pph_sentence_generate(final SubLObject sentence, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_phrase.pph_phrase_doneP(sentence)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_sentence$.currentBinding(thread);
            try {
                pph_vars.$pph_sentence$.bind(sentence, thread);
                final SubLObject force = pph_sentence_force(sentence);
                final SubLObject formula = pph_sentence_cycl(sentence);
                final SubLObject nl_preds = pph_sentence_agr_preds(sentence);
                final SubLObject focus_arg = pph_sentence_focus_arg(sentence);
                SubLObject string = NIL;
                SubLObject pred = NIL;
                SubLObject just = NIL;
                SubLObject olist = NIL;
                SubLObject demerits = NIL;
                if (NIL == pph_phrase.pph_unknown_cycl_p(formula)) {
                    final SubLObject pcase_var = force;
                    if (pcase_var.eql($DECLARATIVE)) {
                        final SubLObject _prev_bind_0_$3 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                        try {
                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                            pph_vars.$paraphrase_mode$.bind(mode, thread);
                            pph_sentence_generate_declarative(sentence);
                        } finally {
                            pph_vars.$paraphrase_mode$.rebind(_prev_bind_3, thread);
                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$3, thread);
                        }
                    } else
                        if (pcase_var.eql($IMPERATIVE)) {
                            thread.resetMultipleValues();
                            final SubLObject string_$4 = pph_main.generate_text(formula, $list15, language_mt, domain_mt, mode, focus_arg);
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
                        } else
                            if (pcase_var.eql($INTERROGATIVE) || pcase_var.eql($QUESTION)) {
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
                            } else
                                if (pcase_var.eql($NONE)) {
                                    thread.resetMultipleValues();
                                    final SubLObject string_$6 = pph_main.generate_phrase_no_checks(formula, nl_preds, NIL, language_mt, domain_mt, mode, NIL, focus_arg);
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



                    if (NIL == pph_sentence_doneP(sentence)) {
                        pph_sentence_update_from_helper_function_results(sentence, string, pred, just, olist, demerits);
                    }
                }
            } finally {
                pph_vars.$pph_sentence$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_sentence_string(sentence, UNPROVIDED);
    }

    public static SubLObject pph_sentence_update_from_helper_function_results(final SubLObject sentence, SubLObject string, final SubLObject pred, final SubLObject just, final SubLObject olist, final SubLObject demerits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_string.cycl_string_p(string)) {
            string = pph_string.pph_string_from_cycl_string(string);
        }
        if (NIL != pph_string.pph_string_p(string)) {
            if (NIL != pred) {
                pph_sentence_set_agr_pred(sentence, pred, UNPROVIDED);
            }
            pph_sentence_set_justification(sentence, just);
            if (NIL != subl_promotions.non_negative_integer_p(demerits)) {
                pph_sentence_set_demerits(sentence, demerits, $str19$Recursive_generation_from_PPH_SEN);
            }
            final SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
            try {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, just, UNPROVIDED, UNPROVIDED, UNPROVIDED))), thread);
                pph_sentence_set_output_list(sentence, olist);
            } finally {
                pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
            }
            pph_phrase.pph_phrase_note_done(sentence);
        }
        return sentence;
    }

    public static SubLObject pph_sentence_generate_declarative(final SubLObject sentence) {
        if (NIL != el_conjunction_p(pph_sentence_cycl(sentence))) {
            attempt_to_generate_multi_clause_sentence(sentence);
        }
        if (NIL == pph_sentence_doneP(sentence)) {
            pph_main.pph_phrase_generate(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pph_sentence_doneP(sentence)) {
                pph_sentence_set_output_list(sentence, pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(pph_phrase.pph_phrase_output_list(sentence), $DECLARATIVE));
            }
        }
        return sentence;
    }

    public static SubLObject attempt_to_generate_multi_clause_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $dont_generate_multi_clause_sentenceP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $dont_generate_multi_clause_sentenceP$.currentBinding(thread);
            try {
                $dont_generate_multi_clause_sentenceP$.bind(T, thread);
                final SubLObject agr_preds = pph_sentence_agr_preds(sentence);
                SubLObject sub_sentences = NIL;
                pph_utilities.pph_phrase_rephrase_cycl(sentence, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(pph_sentence_cycl(sentence), $IGNORE);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sub_sentences = cons(new_pph_sentence(conjunct, $DECLARATIVE, agr_preds), sub_sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                final SubLObject paragraph = pph_document.new_pph_paragraph(NIL, nreverse(sub_sentences));
                pph_document.pph_paragraph_generate(paragraph, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_document.pph_paragraph_doneP(paragraph)) {
                    SubLObject sentence_num = ZERO_INTEGER;
                    if (document.sign_constituents(paragraph).isVector()) {
                        final SubLObject vector_var = document.sign_constituents(paragraph);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject sub_sentence;
                        SubLObject sentence_arg_position;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            sub_sentence = aref(vector_var, element_num);
                            sentence_arg_position = pph_utilities.pph_arg_position_from_template(at_utilities.get_generic_arg(number_utilities.f_1X(sentence_num)));
                            update_arg_positions_in_multi_clause_sentence(sub_sentence, sentence_arg_position);
                            sentence_num = add(sentence_num, ONE_INTEGER);
                        }
                    }
                    pph_document.pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                    pph_phrase.set_pph_phrase_dtrs_from_list(sentence, pph_phrase.pph_phrase_dtr_list(paragraph), UNPROVIDED);
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(sentence);
                    pph_phrase.pph_phrase_note_done(sentence);
                }
            } finally {
                $dont_generate_multi_clause_sentenceP$.rebind(_prev_bind_0, thread);
            }
        }
        return sentence;
    }

    public static SubLObject update_arg_positions_in_multi_clause_sentence(final SubLObject constituent, final SubLObject sentence_arg_position) {
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(constituent);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            update_arg_position_for_multi_clause_sentence_item(sentence_arg_position, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(constituent).isVector()) {
            final SubLObject vector_var = document.sign_constituents(constituent);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                update_arg_positions_in_multi_clause_sentence(dtr, sentence_arg_position);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return constituent;
    }

    public static SubLObject update_arg_position_for_multi_clause_sentence_item_internal(final SubLObject sentence_arg_position, final SubLObject item) {
        final SubLObject item_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
        if (NIL != pph_utilities.pph_known_arg_position_p(pph_data_structures.pph_phrase_output_item_arg_position(item))) {
            final SubLObject new_arg_position = pph_utilities.pph_contextualize_arg_position(sentence_arg_position, item_position);
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, new_arg_position);
        }
        return item;
    }

    public static SubLObject update_arg_position_for_multi_clause_sentence_item(final SubLObject sentence_arg_position, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return update_arg_position_for_multi_clause_sentence_item_internal(sentence_arg_position, item);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence_arg_position, item);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence_arg_position.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && item.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(update_arg_position_for_multi_clause_sentence_item_internal(sentence_arg_position, item)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence_arg_position, item));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_sentence_add_alternative(final SubLObject alternative) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copy = pph_phrase.pph_phrase_copy(alternative, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_add_alternative(pph_vars.$pph_sentence$.getDynamicValue(thread), copy);
        return copy;
    }

    public static SubLObject pph_sentence_conjoin_roots(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject phrases_to_append = pph_sentence_main_clause_dtr_list(this_sentence);
        final SubLObject previous_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(previous_sentence).rest();
        final SubLObject comma_and_phrase = find($comma_and$.getGlobalValue(), previous_sentence_main_vp_phrases, symbol_function($sym24$PPH_STRING_EQUAL_), symbol_function(PPH_PHRASE_STRING), UNPROVIDED, UNPROVIDED);
        pph_sentence_do_conjunction(previous_sentence, this_sentence, phrases_to_append, comma_and_phrase);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
    }

    public static SubLObject pph_sentence_okay_for_restrictive_rel_clauseP(final SubLObject sentence) {
        final SubLObject subj = pph_sentence_subject(sentence);
        final SubLObject subj_mother = (NIL != subj) ? pph_phrase.pph_phrase_mother(subj) : NIL;
        SubLObject okP = NIL;
        if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != subj_mother)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(subj_mother).isVector()) {
                final SubLObject vector_var = document.sign_constituents(subj_mother);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sibling;
                SubLObject pcase_var;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    sibling = aref(vector_var, element_num);
                    pcase_var = dtr_num;
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        if (!sibling.eql(subj)) {
                            return NIL;
                        }
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            if (NIL == pph_phrase.pph_copula_phraseP(sibling)) {
                                return NIL;
                            }
                        } else
                            if (pcase_var.eql(TWO_INTEGER)) {
                                if (NIL == pph_phrase.pph_phrase_npP(sibling)) {
                                    return NIL;
                                }
                                okP = T;
                            } else
                                if (pcase_var.eql(THREE_INTEGER)) {
                                    return NIL;
                                }



                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return okP;
    }

    public static SubLObject pph_sentence_introduce_restrictive_rel_clause(final SubLObject previous_sentence, final SubLObject this_sentence) {
        pph_sentence_append(pph_data_structures.new_pph_phrase($$$that, UNPROVIDED, UNPROVIDED), previous_sentence);
        SubLObject cdolist_list_var = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        SubLObject dtr = NIL;
        dtr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_sentence_append(dtr, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        } 
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
    }

    public static SubLObject pph_sentence_introduce_relative_clause(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject subj = pph_sentence_subject(this_sentence);
        final SubLObject subj_cycl = pph_phrase.pph_phrase_cycl(subj, UNPROVIDED);
        final SubLObject use_whoP = makeBoolean((NIL != pph_phrase.pph_known_cycl_p(subj_cycl)) && (NIL != pph_utilities.pph_isaP(subj_cycl, $$Person, UNPROVIDED)));
        pph_sentence_append(pph_data_structures.new_pph_phrase($comma$.getGlobalValue(), UNPROVIDED, UNPROVIDED), previous_sentence);
        pph_sentence_append(pph_data_structures.new_pph_phrase(NIL != use_whoP ? $$$who : $$$which, UNPROVIDED, UNPROVIDED), previous_sentence);
        SubLObject cdolist_list_var = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        SubLObject dtr = NIL;
        dtr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_sentence_append(dtr, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            dtr = cdolist_list_var.first();
        } 
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
    }

    public static SubLObject pph_sentence_adjoin_additional_subject(final SubLObject previous_sentence, final SubLObject additional_subject) {
        final SubLObject head_verb = pph_sentence_head_verb(previous_sentence);
        final SubLObject new_verb = ((NIL != pph_phrase.pph_aux_verb_phraseP(head_verb)) || (NIL != pph_phrase.pph_copula_phraseP(head_verb))) ? pph_phrase.pph_phrase_copy(head_verb, UNPROVIDED, UNPROVIDED) : pph_utilities.new_pph_do_phrase_matching_head_verb_and_subject(head_verb, additional_subject);
        pph_sentence_append(pph_data_structures.new_pph_phrase($comma$.getGlobalValue(), UNPROVIDED, UNPROVIDED), previous_sentence);
        pph_sentence_append(pph_data_structures.new_pph_phrase($$$as, UNPROVIDED, UNPROVIDED), previous_sentence);
        pph_sentence_append(new_verb, previous_sentence);
        pph_sentence_append(additional_subject, previous_sentence);
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject result_string = pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
        Errors.warn($str31$Adjoined_additional_subject_to_fo, result_string);
        return result_string;
    }

    public static SubLObject pph_sentence_conjoin_main_vp(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            final SubLObject new_format_string = cconcatenate($str32$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str33$__, format_nil.format_nil_a_no_copy($str34$Can_t_conjoin_non_English_sentenc) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        final SubLObject this_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(this_sentence).rest();
        final SubLObject previous_sentence_main_vp_phrases = pph_sentence_main_clause_dtr_list(previous_sentence).rest();
        final SubLObject comma_and_phrase = find($comma_and$.getGlobalValue(), previous_sentence_main_vp_phrases, symbol_function($sym24$PPH_STRING_EQUAL_), symbol_function(PPH_PHRASE_STRING), UNPROVIDED, UNPROVIDED);
        final SubLObject previous_clause_main_vp_phrases = (NIL != comma_and_phrase) ? subseq(previous_sentence_main_vp_phrases, number_utilities.f_1X(position(comma_and_phrase, previous_sentence_main_vp_phrases, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED) : previous_sentence_main_vp_phrases;
        final SubLObject phrases_to_append = truncate_vp_conjunct(previous_clause_main_vp_phrases, this_sentence_main_vp_phrases);
        SubLObject truncated = NIL;
        SubLObject cdolist_list_var = this_sentence_main_vp_phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(phrase, phrases_to_append, UNPROVIDED, UNPROVIDED)) {
                truncated = cons(phrase, truncated);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        pph_sentence_set_truncated_phrases(previous_sentence, truncated);
        pph_sentence_do_conjunction(previous_sentence, this_sentence, phrases_to_append, comma_and_phrase);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
    }

    public static SubLObject pph_sentence_do_conjunction(final SubLObject previous_sentence, final SubLObject this_sentence, SubLObject phrases_to_append, final SubLObject comma_and_phrase) {
        if (NIL != list_utilities.empty_list_p(phrases_to_append)) {
            Errors.sublisp_break($str35$Nothing_to_append_, EMPTY_SUBL_OBJECT_ARRAY);
        }
        phrases_to_append = remove_repeated_pps(phrases_to_append, previous_sentence);
        if ((NIL == list_utilities.singletonP(phrases_to_append)) || (NIL == pph_phrase.pph_phrase_ppP(list_utilities.only_one(phrases_to_append)))) {
            if (NIL != comma_and_phrase) {
                pph_phrase.pph_phrase_set_string(comma_and_phrase, $comma$.getGlobalValue());
            }
            pph_sentence_append(pph_data_structures.new_pph_phrase($comma_and$.getGlobalValue(), UNPROVIDED, UNPROVIDED), previous_sentence);
        }
        SubLObject cdolist_list_var = phrases_to_append;
        SubLObject new_phrase = NIL;
        new_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_sentence_append(new_phrase, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            new_phrase = cdolist_list_var.first();
        } 
        cdolist_list_var = pph_sentence_main_clause_post_modifiers(this_sentence);
        new_phrase = NIL;
        new_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_sentence_append(new_phrase, previous_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            new_phrase = cdolist_list_var.first();
        } 
        pph_phrase.pph_phrase_note_not_done(previous_sentence);
        pph_sentence_generate(previous_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return pph_string.pph_string_to_utf8(pph_sentence_string(previous_sentence, UNPROVIDED));
    }

    public static SubLObject remove_repeated_pps(final SubLObject phrases, final SubLObject sentence) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject doomedP = NIL;
            SubLObject cdolist_list_var_$19 = pph_phrase.pph_phrase_gather(phrase, $sym37$PPH_PHRASE_PP_, UNPROVIDED);
            SubLObject pp = NIL;
            pp = cdolist_list_var_$19.first();
            while (NIL != cdolist_list_var_$19) {
                SubLObject mother = pph_phrase.pph_phrase_mother(pp);
                if (((NIL != pph_phrase.pph_phrase_npP(mother)) || (NIL != pph_phrase.pph_phrase_nbarP(mother))) && (NIL != pph_phrase_contains_matching_ppP(sentence, pp))) {
                    Errors.warn($str36$Removing_PP__S_from__S, pph_string.pph_string_to_utf8(pph_phrase.pph_phrase_string(pp, UNPROVIDED)), pph_string.pph_string_to_utf8(pph_phrase.pph_phrase_string(mother, UNPROVIDED)));
                    if (NIL != subl_promotions.memberP(pp, phrases, UNPROVIDED, UNPROVIDED)) {
                        doomedP = T;
                    } else {
                        SubLObject last_one_modified = pp;
                        pph_phrase.pph_phrase_remove_dtr(mother, pp);
                        while ((NIL != mother) && (NIL == subl_promotions.memberP(last_one_modified, phrases, UNPROVIDED, UNPROVIDED))) {
                            pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(mother);
                            last_one_modified = mother;
                            mother = pph_phrase.pph_phrase_mother(mother);
                        } 
                    }
                }
                cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                pp = cdolist_list_var_$19.first();
            } 
            if (NIL == doomedP) {
                ans = cons(phrase, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject pph_phrase_contains_matching_ppP(final SubLObject phrase, final SubLObject pp) {
        if ((NIL != pph_phrase.pph_phrase_ppP(phrase)) && (pph_phrase.pph_phrase_string(phrase, NIL).equal(pph_phrase.pph_phrase_string(pp, NIL)) || ((pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED).eql(pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(pp, ZERO_INTEGER), UNPROVIDED)) && (NIL != pph_phrase.pph_known_cycl_p(pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER), UNPROVIDED)))) && pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER), UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(pph_phrase.pph_phrase_nth_dtr(pp, ONE_INTEGER), UNPROVIDED))))) {
            return T;
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL != pph_phrase_contains_matching_ppP(dtr, pp)) {
                    return T;
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    public static SubLObject pph_sentence_set_truncated_phrases(final SubLObject sentence, final SubLObject truncated) {
        return pph_data_structures.pph_phrase_info_set(sentence, $TRUNCATED_PHRASES, truncated);
    }

    public static SubLObject pph_sentence_truncated_phrases(final SubLObject sentence) {
        return pph_data_structures.pph_phrase_info_lookup(sentence, $TRUNCATED_PHRASES, NIL);
    }

    public static SubLObject pph_sentence_starts_withP(final SubLObject sentence, final SubLObject phrases) {
        SubLObject sentence_string = pph_sentence_string(sentence, NIL);
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = phrases;
            SubLObject phrase = NIL;
            phrase = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL != string_utilities.starts_with(string_utilities.trim_whitespace(sentence_string), pph_phrase.pph_phrase_string(phrase, NIL))) {
                    sentence_string = string_utilities.pre_remove(sentence_string, pph_phrase.pph_phrase_string(phrase, NIL), UNPROVIDED);
                } else {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                phrase = csome_list_var.first();
            } 
        }
        if ((NIL == list_utilities.empty_list_p(phrases)) && (NIL == failP)) {
            Errors.warn($str39$_S___starts_with__S, sentence_string, string_utilities.bunge(Mapping.mapcar(PPH_PHRASE_STRING, phrases), UNPROVIDED));
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject truncate_vp_conjunct(final SubLObject previous_sentence_main_vp_phrases, final SubLObject this_sentence_main_vp_phrases) {
        final SubLObject this_phrase = this_sentence_main_vp_phrases.first();
        final SubLObject previous_phrase = previous_sentence_main_vp_phrases.first();
        if (NIL != pph_phrase.pph_copula_phraseP(this_phrase)) {
            return this_sentence_main_vp_phrases;
        }
        if (NIL != pph_phrase_resolution.pph_phrase_detpP(this_phrase)) {
            return this_sentence_main_vp_phrases;
        }
        if (pph_phrase.pph_phrase_string(this_phrase, UNPROVIDED).equal(pph_phrase.pph_phrase_string(previous_phrase, UNPROVIDED)) && pph_phrase.pph_phrase_category(this_phrase, UNPROVIDED).equal(pph_phrase.pph_phrase_category(previous_phrase, UNPROVIDED))) {
            Errors.warn($str40$Truncating__S_from__S___based_on_, pph_phrase.pph_phrase_string(this_phrase, UNPROVIDED), pph_string.pph_bunge(Mapping.mapcar(PPH_PHRASE_STRING, this_sentence_main_vp_phrases)), pph_string.pph_bunge(Mapping.mapcar(PPH_PHRASE_STRING, previous_sentence_main_vp_phrases)));
            return truncate_vp_conjunct(previous_sentence_main_vp_phrases.rest(), this_sentence_main_vp_phrases.rest());
        }
        if ((NIL != pph_phrase.pph_phrase_has_dtrsP(this_phrase)) && pph_phrase.pph_phrase_dtr_count(this_phrase).eql(pph_phrase.pph_phrase_dtr_count(previous_phrase))) {
            final SubLObject this_phrase_dtrs = pph_phrase.pph_phrase_dtr_list(this_phrase);
            final SubLObject this_phrase_truncated_dtrs = truncate_vp_conjunct(pph_phrase.pph_phrase_dtr_list(previous_phrase), this_phrase_dtrs);
            return this_phrase_dtrs.equal(this_phrase_truncated_dtrs) ? this_sentence_main_vp_phrases : append(this_phrase_truncated_dtrs, this_sentence_main_vp_phrases.rest());
        }
        return this_sentence_main_vp_phrases;
    }

    public static SubLObject pph_sentence_append(final SubLObject new_phrase, final SubLObject sentence) {
        final SubLObject append_target = pph_sentence_main_clause(sentence);
        pph_phrase.pph_phrase_append(new_phrase, append_target);
        pph_phrase.pph_phrase_note_not_done(append_target);
        return sentence;
    }

    public static SubLObject declare_pph_sentence_file() {
        declareFunction(me, "pph_sentence_p", "PPH-SENTENCE-P", 1, 0, false);
        declareFunction(me, "new_pph_sentence", "NEW-PPH-SENTENCE", 0, 3, false);
        declareFunction(me, "pph_sentence_copy", "PPH-SENTENCE-COPY", 1, 1, false);
        declareFunction(me, "pph_sentence_set_force", "PPH-SENTENCE-SET-FORCE", 2, 0, false);
        declareFunction(me, "pph_sentence_force", "PPH-SENTENCE-FORCE", 1, 0, false);
        declareFunction(me, "pph_sentence_set_agr_pred", "PPH-SENTENCE-SET-AGR-PRED", 2, 1, false);
        declareFunction(me, "pph_sentence_set_agr_preds", "PPH-SENTENCE-SET-AGR-PREDS", 2, 1, false);
        declareFunction(me, "pph_sentence_agr_pred", "PPH-SENTENCE-AGR-PRED", 1, 0, false);
        declareFunction(me, "pph_sentence_agr_preds", "PPH-SENTENCE-AGR-PREDS", 1, 0, false);
        declareFunction(me, "pph_sentence_set_string", "PPH-SENTENCE-SET-STRING", 2, 0, false);
        declareFunction(me, "pph_sentence_string", "PPH-SENTENCE-STRING", 1, 1, false);
        declareFunction(me, "pph_sentence_set_justification", "PPH-SENTENCE-SET-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "pph_sentence_justification", "PPH-SENTENCE-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "pph_sentence_set_demerits", "PPH-SENTENCE-SET-DEMERITS", 3, 0, false);
        declareFunction(me, "pph_sentence_demerits", "PPH-SENTENCE-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_sentence_set_output_list", "PPH-SENTENCE-SET-OUTPUT-LIST", 2, 0, false);
        declareFunction(me, "pph_sentence_output_list", "PPH-SENTENCE-OUTPUT-LIST", 1, 0, false);
        declareFunction(me, "pph_sentence_set_cycl", "PPH-SENTENCE-SET-CYCL", 2, 0, false);
        declareFunction(me, "pph_sentence_cycl", "PPH-SENTENCE-CYCL", 1, 0, false);
        declareFunction(me, "pph_sentence_set_topic", "PPH-SENTENCE-SET-TOPIC", 2, 0, false);
        declareFunction(me, "pph_sentence_topic", "PPH-SENTENCE-TOPIC", 1, 0, false);
        declareFunction(me, "pph_sentence_focus_arg", "PPH-SENTENCE-FOCUS-ARG", 1, 0, false);
        declareFunction(me, "pph_sentence_doneP", "PPH-SENTENCE-DONE?", 1, 0, false);
        declareFunction(me, "pph_sentence_subject", "PPH-SENTENCE-SUBJECT", 1, 0, false);
        declareFunction(me, "pph_sentence_head_verb", "PPH-SENTENCE-HEAD-VERB", 1, 0, false);
        declareFunction(me, "pph_subject_compatible_with_verbP", "PPH-SUBJECT-COMPATIBLE-WITH-VERB?", 2, 0, false);
        declareFunction(me, "pph_sentence_main_clause", "PPH-SENTENCE-MAIN-CLAUSE", 1, 0, false);
        declareFunction(me, "pph_sentence_main_clause_dtr_list", "PPH-SENTENCE-MAIN-CLAUSE-DTR-LIST", 1, 0, false);
        declareFunction(me, "pph_sentence_main_clause_post_modifiers", "PPH-SENTENCE-MAIN-CLAUSE-POST-MODIFIERS", 1, 0, false);
        declareFunction(me, "pph_sentences_differ_only_in_subjectP", "PPH-SENTENCES-DIFFER-ONLY-IN-SUBJECT?", 2, 0, false);
        declareFunction(me, "pph_sentence_has_same_subjectP", "PPH-SENTENCE-HAS-SAME-SUBJECT?", 2, 0, false);
        declareFunction(me, "pph_np_has_same_cyclP", "PPH-NP-HAS-SAME-CYCL?", 2, 0, false);
        declareFunction(me, "pph_sentence_ends_with_subject_ofP", "PPH-SENTENCE-ENDS-WITH-SUBJECT-OF?", 2, 0, false);
        declareFunction(me, "pph_sentence_ends_with_subjectP", "PPH-SENTENCE-ENDS-WITH-SUBJECT?", 2, 0, false);
        declareFunction(me, "pph_subject_ok_to_distribute_across_andP", "PPH-SUBJECT-OK-TO-DISTRIBUTE-ACROSS-AND?", 1, 0, false);
        declareFunction(me, "pph_existentially_quantified_npP", "PPH-EXISTENTIALLY-QUANTIFIED-NP?", 1, 0, false);
        declareFunction(me, "pph_sentences_surface_equal_modulo_pronounsP", "PPH-SENTENCES-SURFACE-EQUAL-MODULO-PRONOUNS?", 2, 0, false);
        declareFunction(me, "pph_sentence_generate", "PPH-SENTENCE-GENERATE", 1, 3, false);
        declareFunction(me, "pph_sentence_update_from_helper_function_results", "PPH-SENTENCE-UPDATE-FROM-HELPER-FUNCTION-RESULTS", 6, 0, false);
        declareFunction(me, "pph_sentence_generate_declarative", "PPH-SENTENCE-GENERATE-DECLARATIVE", 1, 0, false);
        declareFunction(me, "attempt_to_generate_multi_clause_sentence", "ATTEMPT-TO-GENERATE-MULTI-CLAUSE-SENTENCE", 1, 0, false);
        declareFunction(me, "update_arg_positions_in_multi_clause_sentence", "UPDATE-ARG-POSITIONS-IN-MULTI-CLAUSE-SENTENCE", 2, 0, false);
        declareFunction(me, "update_arg_position_for_multi_clause_sentence_item_internal", "UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM-INTERNAL", 2, 0, false);
        declareFunction(me, "update_arg_position_for_multi_clause_sentence_item", "UPDATE-ARG-POSITION-FOR-MULTI-CLAUSE-SENTENCE-ITEM", 2, 0, false);
        declareFunction(me, "pph_sentence_add_alternative", "PPH-SENTENCE-ADD-ALTERNATIVE", 1, 0, false);
        declareFunction(me, "pph_sentence_conjoin_roots", "PPH-SENTENCE-CONJOIN-ROOTS", 2, 0, false);
        declareFunction(me, "pph_sentence_okay_for_restrictive_rel_clauseP", "PPH-SENTENCE-OKAY-FOR-RESTRICTIVE-REL-CLAUSE?", 1, 0, false);
        declareFunction(me, "pph_sentence_introduce_restrictive_rel_clause", "PPH-SENTENCE-INTRODUCE-RESTRICTIVE-REL-CLAUSE", 2, 0, false);
        declareFunction(me, "pph_sentence_introduce_relative_clause", "PPH-SENTENCE-INTRODUCE-RELATIVE-CLAUSE", 2, 0, false);
        declareFunction(me, "pph_sentence_adjoin_additional_subject", "PPH-SENTENCE-ADJOIN-ADDITIONAL-SUBJECT", 2, 0, false);
        declareFunction(me, "pph_sentence_conjoin_main_vp", "PPH-SENTENCE-CONJOIN-MAIN-VP", 2, 0, false);
        declareFunction(me, "pph_sentence_do_conjunction", "PPH-SENTENCE-DO-CONJUNCTION", 4, 0, false);
        declareFunction(me, "remove_repeated_pps", "REMOVE-REPEATED-PPS", 2, 0, false);
        declareFunction(me, "pph_phrase_contains_matching_ppP", "PPH-PHRASE-CONTAINS-MATCHING-PP?", 2, 0, false);
        declareFunction(me, "pph_sentence_set_truncated_phrases", "PPH-SENTENCE-SET-TRUNCATED-PHRASES", 2, 0, false);
        declareFunction(me, "pph_sentence_truncated_phrases", "PPH-SENTENCE-TRUNCATED-PHRASES", 1, 0, false);
        declareFunction(me, "pph_sentence_starts_withP", "PPH-SENTENCE-STARTS-WITH?", 2, 0, false);
        declareFunction(me, "truncate_vp_conjunct", "TRUNCATE-VP-CONJUNCT", 2, 0, false);
        declareFunction(me, "pph_sentence_append", "PPH-SENTENCE-APPEND", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_sentence_file() {
        defparameter("*DONT-GENERATE-MULTI-CLAUSE-SENTENCE?*", NIL);
        deflexical("*COMMA*", $str22$_);
        deflexical("*COMMA-AND*", $str23$__and);
        return NIL;
    }

    public static SubLObject setup_pph_sentence_file() {
        memoization_state.note_memoized_function(UPDATE_ARG_POSITION_FOR_MULTI_CLAUSE_SENTENCE_ITEM);
        return NIL;
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

    
}

/**
 * Total time: 198 ms
 */
