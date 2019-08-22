/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ldiff;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-TOOLS-BROWSING
 *  source file: /cyc/top/cycl/uia-tools-browsing.lisp
 *  created:     2019/07/03 17:37:57
 */
public final class uia_tools_browsing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_tools_browsing() {
    }

    public static final SubLFile me = new uia_tools_browsing();

    public static final String myName = "com.cyc.cycjava.cycl.uia_tools_browsing";

    // // Definitions
    public static final SubLObject uia_act_new_concept_clarifier(SubLObject v_agenda, SubLObject mode, SubLObject v_term) {
        user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_CLARIFIER, list(v_term), UNPROVIDED);
    }

    public static final SubLObject uiat_concept_clarifier_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt3$Clarify____A, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_clarifier_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject clarifying_sentences = uia_trampolines.uia_term_clarifying_sentences(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject alt_phrases = uia_term_alternative_phrases(v_agenda, v_term);
                    SubLObject is_sme_term = misc_utilities.boolean_to_keyword(is_sme_term_in_interactionP(v_term, interaction));
                    SubLObject select = misc_utilities.boolean_to_keyword(uia_tools_basic.uia_within_concept_finderP(v_agenda));
                    SubLObject highlight = uiat_concept_clarifier_compute_highlight_state(v_agenda, v_term);
                    SubLObject examples = uiat_concept_clarifier_compute_good_examples(v_agenda, v_term);
                    SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $TERM, v_term, $CLARIFYING_SENTENCES, clarifying_sentences, $IS_SME_TERM, is_sme_term, $SELECT, select, $ALT_PHRASES, alt_phrases, $HIGHLIGHT, highlight, $EXAMPLES, examples }));
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    return request;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_clarifier_compute_highlight_state(SubLObject v_agenda, SubLObject v_term) {
        if (!((NIL != cb_uia_collaborators.is_nusketch_server_availableP()) && (NIL != isa.isaP(v_term, $$CoaDiagramObject, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED)))) {
            return NIL;
        }
        return cb_uia_collaborators.uiaext_get_term_highlight_state(v_agenda, v_term);
    }

    public static final SubLObject uiat_concept_clarifier_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_1 = plist;
                        SubLObject current_2 = datum_1;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_2;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_1, $list_alt18);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_1, $list_alt18);
                            if (NIL == member(current_3, $list_alt19, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_1, $list_alt18);
                        }
                        {
                            SubLObject term_tail = property_list_member($TERM, current_2);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_2);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_concept_clarifier(v_agenda, mode, v_term);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list ; alternative phrases that can be used to refer to term
     */
    public static final SubLObject uia_term_alternative_phrases(SubLObject v_agenda, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrases = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        pph_vars.$pph_language_mt$.bind(user_interaction_agenda.uia_generation_language_mt(v_agenda), thread);
                        lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                        {
                            SubLObject main_phrase = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            phrases = remove(main_phrase, pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return phrases;
            }
        }
    }

    public static final SubLObject is_sme_term_in_interactionP(SubLObject v_term, SubLObject interaction) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            return uia_trampolines.is_sme_term_in_mtP(v_term, mt);
        }
    }

    public static final SubLObject uiat_concept_clarifier_compute_good_examples(SubLObject v_agenda, SubLObject v_term) {
        if (NIL != fort_types_interface.predicateP(v_term)) {
            return uia_trampolines.uia_all_predicate_example_sentences(v_agenda, v_term, UNPROVIDED);
        } else {
            return NIL;
        }
    }

    public static final SubLObject uia_act_new_sentence_clarifier(SubLObject v_agenda, SubLObject mode, SubLObject cycl_sentence, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        {
            SubLObject pcase_var = force;
            if (pcase_var.eql($DECLARATIVE)) {
                user_interaction_agenda.uia_add_fact_to_crumb_trail(v_agenda, cycl_sentence, NIL);
            } else
                if (pcase_var.eql($QUESTION) || pcase_var.eql($INTERROGATIVE)) {
                    user_interaction_agenda.uia_add_question_to_crumb_trail(v_agenda, cycl_sentence, NIL);
                }

        }
        {
            SubLObject assertion = NIL;
            if (NIL != assertion_handles.assertion_p(cycl_sentence)) {
                Errors.warn($str_alt28$Sentence_Clarifier_called_with_an);
                assertion = cycl_sentence;
                cycl_sentence = uncanonicalizer.assertion_el_formula(cycl_sentence);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_CLARIFIER, list(cycl_sentence, force, assertion), UNPROVIDED);
        }
    }

    public static final SubLObject uiat_sentence_clarifier_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject sentence = NIL;
            SubLObject force = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt29);
            force = current.first();
            current = current.rest();
            {
                SubLObject assertion = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt29);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject nl_sentence = uia_trampolines.uia_sentence_phrase(v_agenda, sentence, UNPROVIDED, UNPROVIDED);
                        return format(NIL, $str_alt3$Clarify____A, nl_sentence);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt29);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_clarifier_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cycl_sentence = NIL;
            SubLObject force = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            cycl_sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            force = current.first();
            current = current.rest();
            {
                SubLObject assertion = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt30);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject unassertible = misc_utilities.boolean_to_keyword(uia_trampolines.uia_unassertibleP(v_agenda, cycl_sentence));
                        SubLObject select = misc_utilities.boolean_to_keyword(uia_tools_basic.uia_within_sentence_finderP(v_agenda));
                        SubLObject indexical_table = uia_tools_basic.uia_sentence_finder_indexical_table_peek(v_agenda);
                        SubLObject request = NIL;
                        if ($QUESTION == force) {
                            {
                                SubLObject variable_instantiated_cycl_sentence = uiat_instantiate_variables(interaction, cycl_sentence);
                                request = user_interaction_agenda.make_ui_request(interaction, $SHOW_QUESTION, list($QUERY_SENTENCE, cycl_sentence, $NO_VARS, variable_instantiated_cycl_sentence, $TERM_PHRASE_MAPPINGS, indexical_table));
                            }
                        } else
                            if ((NIL != el_utilities.cafP(cycl_sentence)) || (NIL != assertions_high.gaf_assertionP(cycl_sentence))) {
                                {
                                    SubLObject known = misc_utilities.boolean_to_keyword(makeBoolean(($TRUE == unassertible) || (NIL != uia_trampolines.uia_knownP(v_agenda, cycl_sentence, UNPROVIDED))));
                                    SubLObject justification = ($TRUE == known) ? ((SubLObject) (uia_trampolines.uia_justify(v_agenda, cycl_sentence, UNPROVIDED))) : NIL;
                                    request = user_interaction_agenda.make_ui_request(interaction, $SHOW_GAF, list(new SubLObject[]{ $SENTENCE, cycl_sentence, $UNASSERTIBLE, unassertible, $KNOWN, known, $JUSTIFICATION, justification, $SELECT, select, $TERM_PHRASE_MAPPINGS, indexical_table }));
                                }
                            } else {
                                request = user_interaction_agenda.make_ui_request(interaction, $SHOW_RULE, list($SENTENCE, cycl_sentence, $UNASSERTIBLE, unassertible, $TERM_PHRASE_MAPPINGS, indexical_table, $ASSERTION, assertion));
                            }

                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                        return request;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt30);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_instantiate_variables(SubLObject interaction, SubLObject cycl_sentence) {
        {
            SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            SubLObject ans = cycl_sentence;
            SubLObject cdolist_list_var = el_utilities.sentence_free_variables(cycl_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                {
                    SubLObject salient_isa = uiat_salient_term_isa(interaction, var, cycl_sentence, mt);
                    if (NIL != salient_isa) {
                        ans = cycl_utilities.expression_subst(list($$SomeExampleFn, salient_isa), var, ans, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject uiat_salient_term_isa(SubLObject interaction, SubLObject var, SubLObject sentence, SubLObject mt) {
        {
            SubLObject ans = NIL;
            if (NIL != el_utilities.atomic_sentenceP(sentence)) {
                {
                    SubLObject argnum = position(var, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    ans = uiat_salient_isa_for_argnum(interaction, argnum, sentence);
                }
            } else {
                {
                    SubLObject argnum = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                    SubLObject rest = NIL;
                    for (rest = args; !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject subsentence = rest.first();
                            argnum = add(argnum, ONE_INTEGER);
                            ans = uiat_salient_term_isa(interaction, var, subsentence, mt);
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject uiat_salient_isa_for_argnum(SubLObject interaction, SubLObject argnum, SubLObject sentence) {
        {
            SubLObject ans = NIL;
            SubLObject pred = cycl_utilities.formula_arg0(sentence);
            if (argnum.isInteger()) {
                ans = uia_trampolines.uia_salient_argn_isa(user_interaction_agenda.ui_agenda(interaction), pred, argnum, UNPROVIDED);
            }
            return ans;
        }
    }

    public static final SubLObject uiat_sentence_clarifier_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_4 = plist;
                        SubLObject current_5 = datum_4;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_5;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_4, $list_alt45);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_4, $list_alt45);
                            if (NIL == member(current_6, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_4, $list_alt45);
                        }
                        {
                            SubLObject sentence_tail = property_list_member($SENTENCE, current_5);
                            SubLObject sentence = (NIL != sentence_tail) ? ((SubLObject) (cadr(sentence_tail))) : NIL;
                            SubLObject force_tail = property_list_member($FORCE, current_5);
                            SubLObject force = (NIL != force_tail) ? ((SubLObject) (cadr(force_tail))) : $DECLARATIVE;
                            SubLObject mode_tail = property_list_member($MODE, current_5);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_sentence_clarifier(v_agenda, mode, sentence, force);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_justification_browser(SubLObject v_agenda, SubLObject mode, SubLObject inference_answer) {
        return NIL != inference_datastructures_inference.inference_answer_p(inference_answer) ? ((SubLObject) (user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $JUSTIFICATION_BROWSER, list(inference_answer), UNPROVIDED))) : NIL;
    }

    public static final SubLObject uiat_justification_browser_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject inference_answer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            inference_answer = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject identifier = inference_answer;
                    if (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) {
                        {
                            SubLObject input_query = inference_datastructures_inference.inference_input_el_query(inference_datastructures_inference.inference_answer_inference(inference_answer));
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject query_paraphrase = uia_trampolines.uia_query_phrase(v_agenda, input_query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (query_paraphrase.isString()) {
                                identifier = query_paraphrase;
                            }
                        }
                    }
                    return format(NIL, $str_alt51$Justification____A, identifier);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt50);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_justification_browser_finalize(SubLObject interaction) {
        user_interaction_agenda.ui_state_clear(interaction, $INFERENCE_ANSWER);
        return interaction;
    }

    public static final SubLObject uiat_justification_browser_generate_request(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject inference_answer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            inference_answer = current.first();
            current = current.rest();
            if (NIL == current) {
                return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($INFERENCE_ANSWER, inference_answer));
            } else {
                cdestructuring_bind_error(datum, $list_alt50);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_justification_browser_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_7 = plist;
                        SubLObject current_8 = datum_7;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_8;
                        SubLObject bad = NIL;
                        SubLObject current_9 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_7, $list_alt53);
                            current_9 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_7, $list_alt53);
                            if (NIL == member(current_9, $list_alt54, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_9 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_7, $list_alt53);
                        }
                        {
                            SubLObject inference_answer_tail = property_list_member($INFERENCE_ANSWER, current_8);
                            SubLObject inference_answer = (NIL != inference_answer_tail) ? ((SubLObject) (cadr(inference_answer_tail))) : NIL;
                            uia_act_new_justification_browser(v_agenda, $REQUIRED, inference_answer);
                        }
                    }
                } else
                    if (pcase_var.eql($DONE)) {
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_sentence_variations(SubLObject v_agenda, SubLObject mode, SubLObject sentence) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $SENTENCE_VARIATIONS, list(sentence), UNPROVIDED);
    }

    public static final SubLObject uiat_sentence_variations_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject datum = user_interaction_agenda.ui_args(interaction);
            SubLObject current = datum;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject variations = uiat_sentence_variations(v_agenda, sentence);
                    SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($SENTENCE, sentence, $VARIATIONS, variations));
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, sentence);
                    return request;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt57);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_sentence_variations(SubLObject v_agenda, SubLObject sentence) {
        {
            SubLObject variations = uia_trampolines.uia_sentence_variations(v_agenda, sentence, UNPROVIDED);
            variations = uiat_sentence_variations_sort(v_agenda, copy_list(variations));
            return variations;
        }
    }

    // defparameter
    private static final SubLSymbol $uiat_sentence_variations_sort_agenda$ = makeSymbol("*UIAT-SENTENCE-VARIATIONS-SORT-AGENDA*");

    public static final SubLObject uiat_sentence_variations_sort(SubLObject v_agenda, SubLObject variations) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $uiat_sentence_variations_sort_agenda$.currentBinding(thread);
                try {
                    $uiat_sentence_variations_sort_agenda$.bind(v_agenda, thread);
                    {
                        SubLObject cdolist_list_var = variations;
                        SubLObject sentence = NIL;
                        for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                            uiat_sentence_variations_sort_key(sentence);
                        }
                        variations = Sort.sort(variations, symbol_function($sym59$STRING_), symbol_function(UIAT_SENTENCE_VARIATIONS_SORT_KEY));
                        variations = Sort.stable_sort(variations, symbol_function($sym61$SEQUENCE_LENGTH__), symbol_function(UIAT_SENTENCE_VARIATIONS_SORT_KEY));
                    }
                } finally {
                    $uiat_sentence_variations_sort_agenda$.rebind(_prev_bind_0, thread);
                }
            }
            return variations;
        }
    }

    public static final SubLObject uiat_sentence_variations_sort_key(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = $uiat_sentence_variations_sort_agenda$.getDynamicValue(thread);
                SubLObject generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
                SubLObject domain_mt = user_interaction_agenda.uia_generation_domain_mt(v_agenda);
                return uia_trampolines.uia_sentence_phrase(v_agenda, sentence, generation_mt, domain_mt);
            }
        }
    }

    public static final SubLObject sequence_length_L(SubLObject sequence1, SubLObject sequence2) {
        return numL(length(sequence1), length(sequence2));
    }

    public static final SubLObject uia_act_new_domain_examples(SubLObject v_agenda, SubLObject mode) {
        {
            SubLObject sort_method = uiat_domain_examples_default_sort_method();
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $DOMAIN_EXAMPLES, NIL, list($SORT_METHOD, sort_method));
        }
    }

    public static final SubLObject uiat_domain_examples_hint(SubLObject interaction) {
        {
            SubLObject filter_term = user_interaction_agenda.ui_state_lookup(interaction, $FILTER_TERM, $UNDETERMINED);
            if ($UNDETERMINED == filter_term) {
                return $$$Examples;
            }
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject phrase = uia_trampolines.uia_term_phrase(v_agenda, filter_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return format(NIL, $str_alt68$Examples____A, phrase);
            }
        }
    }

    public static final SubLObject uiat_domain_examples_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $FILTER_TERM, v_term);
                }
            } else
                if (pcase_var.eql($THINKING)) {
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_domain_examples_child_rejected(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
            } else
                if (pcase_var.eql($THINKING)) {
                    {
                        SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
                        user_interaction_agenda.uia_act_reject(v_agenda, parent);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject uiat_domain_examples_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject initialized = uiat_domain_examples_initialized(v_agenda);
            if (NIL == initialized) {
                uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_DOMAIN_EXAMPLES_INITIALIZE, list(v_agenda), UNPROVIDED, UNPROVIDED);
                sleep(ONE_INTEGER);
                return user_interaction_agenda.uia_generate_next_request(v_agenda);
            }
            {
                SubLObject sample_sentence = user_interaction_agenda.ui_state_lookup(interaction, $SAMPLE_SENTENCE, $UNDETERMINED);
                SubLObject filter_term = user_interaction_agenda.ui_state_lookup(interaction, $FILTER_TERM, $UNDETERMINED);
                SubLObject sort_method = user_interaction_agenda.ui_state_lookup(interaction, $SORT_METHOD, $UNDETERMINED);
                SubLObject subgraph_count = user_interaction_agenda.uia_state_lookup(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_GRAPH_COUNT, UNPROVIDED);
                SubLObject sentence_sections = uiat_domain_examples_sentence_sections(v_agenda, sample_sentence, filter_term, sort_method);
                return user_interaction_agenda.make_ui_request(interaction, $SHOW, nconc(new SubLObject[]{ list($SENTENCE_SECTIONS, sentence_sections), $UNDETERMINED == sample_sentence ? ((SubLObject) (NIL)) : list($SAMPLE_SENTENCE, sample_sentence), $UNDETERMINED == filter_term ? ((SubLObject) (NIL)) : list($FILTER_TERM, filter_term), list($SORT_METHOD, sort_method), list($SUBGRAPHS, subgraph_count) }));
            }
        }
    }

    public static final SubLObject uiat_domain_examples_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ANSWER)) {
                    {
                        SubLObject datum_10 = plist;
                        SubLObject current_11 = datum_10;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_11;
                        SubLObject bad = NIL;
                        SubLObject current_12 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_10, $list_alt77);
                            current_12 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_10, $list_alt77);
                            if (NIL == member(current_12, $list_alt78, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_12 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_10, $list_alt77);
                        }
                        {
                            SubLObject sample_sentence_tail = property_list_member($SAMPLE_SENTENCE, current_11);
                            SubLObject sample_sentence = (NIL != sample_sentence_tail) ? ((SubLObject) (cadr(sample_sentence_tail))) : NIL;
                            SubLObject filter_term_tail = property_list_member($FILTER_TERM, current_11);
                            SubLObject filter_term = (NIL != filter_term_tail) ? ((SubLObject) (cadr(filter_term_tail))) : NIL;
                            SubLObject filter_phrase_tail = property_list_member($FILTER_PHRASE, current_11);
                            SubLObject filter_phrase = (NIL != filter_phrase_tail) ? ((SubLObject) (cadr(filter_phrase_tail))) : NIL;
                            SubLObject sort_method_tail = property_list_member($SORT_METHOD, current_11);
                            SubLObject sort_method = (NIL != sort_method_tail) ? ((SubLObject) (cadr(sort_method_tail))) : NIL;
                            if (sample_sentence.isString()) {
                                user_interaction_agenda.ui_state_update(interaction, $SAMPLE_SENTENCE, sample_sentence);
                            } else {
                                user_interaction_agenda.ui_state_update(interaction, $SAMPLE_SENTENCE, $UNDETERMINED);
                            }
                            user_interaction_agenda.ui_state_update(interaction, $SORT_METHOD, sort_method);
                            if (!((NIL != filter_term) || (NIL != filter_phrase))) {
                                user_interaction_agenda.ui_state_update(interaction, $FILTER_TERM, $UNDETERMINED);
                            }
                            if (NIL != filter_term) {
                                user_interaction_agenda.ui_state_update(interaction, $FILTER_TERM, filter_term);
                            }
                            if (NIL != filter_phrase) {
                                {
                                    SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, filter_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_domain_examples_initialized(SubLObject v_agenda) {
        return uia_trampolines.uia_domain_example_predicates_already_memoized(v_agenda, UNPROVIDED);
    }

    /**
     * Initialize the domain examples for AGENDA.  Suitable for a :thinking process.
     */
    public static final SubLObject uiat_domain_examples_initialize(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicates = NIL;
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt80$Computing_example_predicates_, UNPROVIDED);
                predicates = uia_trampolines.uia_domain_example_predicates(v_agenda, UNPROVIDED);
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt81$Grouping_general_and_specific_pre, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject v_graph = uia_trampolines.uia_build_spec_predicate_graph(v_agenda, predicates, UNPROVIDED);
                    SubLObject orphans = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    user_interaction_agenda.uia_state_update(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_GRAPH, v_graph);
                    user_interaction_agenda.uia_state_update(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_ORPHANS, orphans);
                    user_interaction_agenda.uia_state_update(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_GRAPH_COUNT, uia_trampolines.uia_count_spec_predicate_sub_graphs(v_agenda, v_graph));
                }
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt84$Computing_topical_utility_of_pred, UNPROVIDED);
                uia_organize_predicates_by_topical_utility(v_agenda, predicates);
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt85$Computing_general_utility_of_pred, UNPROVIDED);
                uia_organize_predicates_by_general_utility(v_agenda, predicates);
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt86$Computing_specificity_of_predicat, UNPROVIDED);
                uia_trampolines.uia_organize_predicates_by_specificity_of_args(v_agenda, predicates, UNPROVIDED);
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt87$Computing_topical_relevance_of_pr, UNPROVIDED);
                uia_trampolines.uia_organize_predicates_by_mt(v_agenda, predicates);
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt88$Computing_similarity_of_predicate, UNPROVIDED);
                uia_trampolines.uia_organize_predicates_by_similarity(v_agenda, predicates, UNPROVIDED);
                {
                    SubLObject sentences = NIL;
                    {
                        SubLObject total = length(predicates);
                        uia_tools_basic.uiat_thinking_note_progress_message($str_alt89$Computing_example_sentences_for_p, UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject predicate = NIL;
                            SubLObject sofar = NIL;
                            for (list_var = predicates, predicate = list_var.first(), sofar = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predicate = list_var.first() , sofar = add(ONE_INTEGER, sofar)) {
                                uia_tools_basic.uiat_thinking_note_percent_progress(sofar, total, UNPROVIDED);
                                {
                                    SubLObject example_sentences = uia_trampolines.uia_all_predicate_example_sentences(v_agenda, predicate, UNPROVIDED);
                                    SubLObject cdolist_list_var = example_sentences;
                                    SubLObject example_sentence = NIL;
                                    for (example_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_sentence = cdolist_list_var.first()) {
                                        sentences = cons(example_sentence, sentences);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject total = length(sentences);
                        uia_tools_basic.uiat_thinking_note_progress_message($str_alt90$Determining_which_example_sentenc, UNPROVIDED);
                        {
                            SubLObject list_var = NIL;
                            SubLObject sentence = NIL;
                            SubLObject sofar = NIL;
                            for (list_var = sentences, sentence = list_var.first(), sofar = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence = list_var.first() , sofar = add(ONE_INTEGER, sofar)) {
                                uia_tools_basic.uiat_thinking_note_percent_progress(sofar, total, UNPROVIDED);
                                uia_trampolines.uia_sentence_has_variations(v_agenda, sentence, UNPROVIDED);
                            }
                        }
                    }
                    uia_trampolines.uia_precache_html_sentence_phrases(v_agenda, sentences, $str_alt91$Translating_example_sentences_, UNPROVIDED, UNPROVIDED);
                }
                uia_tools_basic.uiat_thinking_note_progress_message($str_alt92$Computing_predicate_indicators_, UNPROVIDED);
                {
                    SubLObject total = length(predicates);
                    SubLObject list_var = NIL;
                    SubLObject predicate = NIL;
                    SubLObject sofar = NIL;
                    for (list_var = predicates, predicate = list_var.first(), sofar = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predicate = list_var.first() , sofar = add(ONE_INTEGER, sofar)) {
                        uia_tools_basic.uiat_thinking_note_percent_progress(sofar, total, UNPROVIDED);
                        uia_trampolines.uia_predicate_indicators(v_agenda, predicate, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uiat_domain_examples_all_sentences(SubLObject v_agenda) {
        {
            SubLObject predicates = uia_trampolines.uia_domain_example_predicates(v_agenda, UNPROVIDED);
            SubLObject sentences = NIL;
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject example_sentences = uia_trampolines.uia_all_predicate_example_sentences(v_agenda, predicate, UNPROVIDED);
                    SubLObject cdolist_list_var_13 = example_sentences;
                    SubLObject example_sentence = NIL;
                    for (example_sentence = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , example_sentence = cdolist_list_var_13.first()) {
                        sentences = cons(example_sentence, sentences);
                    }
                }
            }
            return sentences;
        }
    }

    // deflexical
    private static final SubLSymbol $uiat_domain_examples_sort_method_table$ = makeSymbol("*UIAT-DOMAIN-EXAMPLES-SORT-METHOD-TABLE*");

    public static final SubLObject uiat_domain_examples_sort_method_table() {
        return $uiat_domain_examples_sort_method_table$.getGlobalValue();
    }

    public static final SubLObject uiat_domain_examples_default_sort_method() {
        {
            SubLObject default_sort_method_info = $uiat_domain_examples_sort_method_table$.getGlobalValue().first();
            SubLObject datum = default_sort_method_info;
            SubLObject current = datum;
            SubLObject default_sort_method = NIL;
            SubLObject rest = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt94);
            default_sort_method = current.first();
            current = current.rest();
            rest = current;
            return default_sort_method;
        }
    }

    public static final SubLObject uiat_domain_examples_sentence_sections(SubLObject v_agenda, SubLObject sample_sentence, SubLObject filter_term, SubLObject sort_method) {
        {
            SubLObject predicates = uia_trampolines.uia_domain_example_predicates(v_agenda, UNPROVIDED);
            if ($UNDETERMINED != filter_term) {
                predicates = uia_trampolines.uia_predicate_filter(v_agenda, predicates, filter_term, UNPROVIDED);
            }
            {
                SubLObject predicate_sections = NIL;
                SubLObject pcase_var = sort_method;
                if (pcase_var.eql($TOPICAL_UTILITY)) {
                    predicate_sections = uia_organize_predicates_by_topical_utility(v_agenda, predicates);
                } else
                    if (pcase_var.eql($GENERAL_UTILITY)) {
                        predicate_sections = uia_organize_predicates_by_general_utility(v_agenda, predicates);
                    } else
                        if (pcase_var.eql($CLOSENESS)) {
                            if ($UNDETERMINED == sample_sentence) {
                                sample_sentence = $str_alt98$;
                            }
                            predicate_sections = uia_organize_predicates_by_closeness(v_agenda, predicates, sample_sentence);
                        } else
                            if (pcase_var.eql($SPECIFICITY)) {
                                if ($UNDETERMINED != filter_term) {
                                    predicate_sections = uia_trampolines.uia_organize_predicates_by_specificity_to_term(v_agenda, predicates, filter_term, UNPROVIDED);
                                } else {
                                    predicate_sections = uia_trampolines.uia_organize_predicates_by_specificity_of_args(v_agenda, predicates, UNPROVIDED);
                                }
                            } else
                                if (pcase_var.eql($MT_RELEVANCE)) {
                                    predicate_sections = uia_trampolines.uia_organize_predicates_by_mt(v_agenda, predicates);
                                } else
                                    if (pcase_var.eql($SIMILARITY)) {
                                        predicate_sections = uia_trampolines.uia_organize_predicates_by_similarity(v_agenda, predicates, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($ALPHABETICALLY)) {
                                            predicate_sections = uia_organize_predicates_alphabetically(v_agenda, predicates);
                                        } else
                                            if (pcase_var.eql($RANDOMLY)) {
                                                predicate_sections = list(list(NIL, list_utilities.randomize_list(predicates)));
                                            } else {
                                                predicate_sections = list(list(NIL, predicates));
                                            }







                return uiat_domain_examples_predicate_sections_to_sentence_sections(v_agenda, predicate_sections);
            }
        }
    }

    public static final SubLObject uiat_domain_examples_predicate_sections_to_sentence_sections(SubLObject v_agenda, SubLObject predicate_sections) {
        {
            SubLObject sentence_sections = NIL;
            SubLObject v_graph = user_interaction_agenda.uia_state_lookup(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_GRAPH, UNPROVIDED);
            SubLObject orphans = user_interaction_agenda.uia_state_lookup(v_agenda, $DOMAIN_EXAMPLE_SPECPRED_ORPHANS, UNPROVIDED);
            SubLObject cdolist_list_var = predicate_sections;
            SubLObject predicate_section = NIL;
            for (predicate_section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate_section = cdolist_list_var.first()) {
                {
                    SubLObject datum = predicate_section;
                    SubLObject current = datum;
                    SubLObject section_key = NIL;
                    SubLObject predicates = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    section_key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    predicates = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject sentence_infos = NIL;
                            SubLObject interpretation = NIL;
                            interpretation = uia_trampolines.uia_interpret_spec_predicate_graph(v_agenda, predicates, v_graph, NIL, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var_14 = interpretation;
                                SubLObject predicate_info = NIL;
                                for (predicate_info = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , predicate_info = cdolist_list_var_14.first()) {
                                    {
                                        SubLObject sentence_info = uiat_domain_examples_interpret_predicate_info(v_agenda, predicate_info);
                                        sentence_infos = cons(sentence_info, sentence_infos);
                                    }
                                }
                            }
                            sentence_sections = cons(list(section_key, sentence_infos), sentence_sections);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt104);
                    }
                }
            }
            return nreverse(sentence_sections);
        }
    }

    public static final SubLObject uiat_domain_examples_interpret_predicate_info(SubLObject v_agenda, SubLObject predicate_info) {
        {
            SubLObject datum = predicate_info;
            SubLObject current = datum;
            SubLObject node = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            node = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt105);
            predicate = current.first();
            current = current.rest();
            {
                SubLObject specs = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt105);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sentence = uia_trampolines.uia_predicate_example_sentence(v_agenda, predicate, UNPROVIDED);
                        SubLObject has_variationsP = uia_trampolines.uia_sentence_has_variations(v_agenda, sentence, UNPROVIDED);
                        SubLObject more_specifics = NIL;
                        if (NIL == specs) {
                            return list(sentence, has_variationsP);
                        }
                        {
                            SubLObject cdolist_list_var = specs;
                            SubLObject spec_pred_info = NIL;
                            for (spec_pred_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred_info = cdolist_list_var.first()) {
                                {
                                    SubLObject interpretation = uiat_domain_examples_interpret_predicate_info(v_agenda, spec_pred_info);
                                    more_specifics = cons(interpretation, more_specifics);
                                }
                            }
                        }
                        return list(sentence, has_variationsP, nreverse(more_specifics));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt105);
                }
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $predicate_utility_section_map$ = makeSymbol("*PREDICATE-UTILITY-SECTION-MAP*");

    public static final SubLObject uia_organize_predicates_by_topical_utility(SubLObject v_agenda, SubLObject predicates) {
        {
            SubLObject topical_utility_info = NIL;
            {
                SubLObject cdolist_list_var = predicates;
                SubLObject predicate = NIL;
                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                    {
                        SubLObject topical_utility = uia_predicate_topical_utility(v_agenda, predicate, UNPROVIDED);
                        topical_utility_info = cons(list(predicate, topical_utility), topical_utility_info);
                    }
                }
            }
            topical_utility_info = Sort.sort(topical_utility_info, symbol_function($sym107$_), symbol_function(SECOND));
            {
                SubLObject predicates_15 = NIL;
                SubLObject cdolist_list_var = topical_utility_info;
                SubLObject topical_utility_item = NIL;
                for (topical_utility_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , topical_utility_item = cdolist_list_var.first()) {
                    predicates_15 = cons(topical_utility_item.first(), predicates_15);
                }
                predicates_15 = nreverse(predicates_15);
                {
                    SubLObject utility_section_map = $predicate_utility_section_map$.getGlobalValue();
                    SubLObject sections = sectionize_list_by_percent_thresholds(predicates_15, Mapping.mapcar(symbol_function(FIRST), utility_section_map));
                    SubLObject predicate_sections = Mapping.mapcar(symbol_function(LIST), Mapping.mapcar(symbol_function(SECOND), utility_section_map), new SubLObject[]{ sections });
                    return predicate_sections;
                }
            }
        }
    }

    public static final SubLObject uia_organize_predicates_by_general_utility(SubLObject v_agenda, SubLObject predicates) {
        {
            SubLObject general_utility_info = NIL;
            {
                SubLObject cdolist_list_var = predicates;
                SubLObject predicate = NIL;
                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                    {
                        SubLObject general_utility = uia_trampolines.uia_predicate_general_utility(v_agenda, predicate, UNPROVIDED);
                        general_utility_info = cons(list(predicate, general_utility), general_utility_info);
                    }
                }
            }
            general_utility_info = Sort.sort(general_utility_info, symbol_function($sym107$_), symbol_function(SECOND));
            {
                SubLObject predicates_16 = NIL;
                SubLObject cdolist_list_var = general_utility_info;
                SubLObject general_utility_item = NIL;
                for (general_utility_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , general_utility_item = cdolist_list_var.first()) {
                    predicates_16 = cons(general_utility_item.first(), predicates_16);
                }
                predicates_16 = nreverse(predicates_16);
                {
                    SubLObject utility_section_map = $predicate_utility_section_map$.getGlobalValue();
                    SubLObject sections = sectionize_list_by_percent_thresholds(predicates_16, Mapping.mapcar(symbol_function(FIRST), utility_section_map));
                    SubLObject predicate_sections = Mapping.mapcar(symbol_function(LIST), Mapping.mapcar(symbol_function(SECOND), utility_section_map), new SubLObject[]{ sections });
                    return predicate_sections;
                }
            }
        }
    }

    public static final SubLObject sectionize_list_by_percent_thresholds(SubLObject list, SubLObject percent_thresholds) {
        {
            SubLObject sections = NIL;
            SubLObject total = length(list);
            SubLObject last_percent_threshold = ZERO_INTEGER;
            SubLObject cdolist_list_var = percent_thresholds;
            SubLObject percent_threshold = NIL;
            for (percent_threshold = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , percent_threshold = cdolist_list_var.first()) {
                {
                    SubLObject start = integerDivide(multiply(last_percent_threshold, total), $int$100);
                    SubLObject end = integerDivide(multiply(percent_threshold, total), $int$100);
                    SubLObject start_cons = nthcdr(start, list);
                    SubLObject end_cons = nthcdr(end, list);
                    SubLObject section = ldiff(start_cons, end_cons);
                    sections = cons(section, sections);
                    last_percent_threshold = percent_threshold;
                }
            }
            return nreverse(sections);
        }
    }

    public static final SubLObject uia_organize_predicates_by_closeness(SubLObject v_agenda, SubLObject predicates, SubLObject sample_sentence) {
        {
            SubLObject closeness_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                {
                    SubLObject closeness_score = uia_trampolines.uia_predicate_closeness_score(v_agenda, predicate, sample_sentence, UNPROVIDED, UNPROVIDED);
                    sethash(closeness_score, closeness_table, cons(predicate, gethash(closeness_score, closeness_table, UNPROVIDED)));
                }
            }
            {
                SubLObject closeness_info = NIL;
                SubLObject closeness_score = NIL;
                SubLObject predicates_17 = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(closeness_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            closeness_score = getEntryKey(cdohash_entry);
                            predicates_17 = getEntryValue(cdohash_entry);
                            closeness_info = cons(list(closeness_score, predicates_17), closeness_info);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                closeness_info = Sort.sort(closeness_info, symbol_function($sym107$_), symbol_function(FIRST));
                return closeness_info;
            }
        }
    }

    public static final SubLObject uia_organize_predicates_alphabetically(SubLObject v_agenda, SubLObject predicates) {
        {
            SubLObject sentences = uia_trampolines.uia_predicates_to_example_sentences(v_agenda, predicates, UNPROVIDED);
            sentences = uia_trampolines.uia_sort_sentences(v_agenda, sentences, UNPROVIDED, UNPROVIDED);
            {
                SubLObject predicates_18 = NIL;
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    predicates_18 = cons(cycl_utilities.sentence_arg0(sentence), predicates_18);
                }
                predicates_18 = nreverse(predicates_18);
                return list(list(NIL, predicates_18));
            }
        }
    }

    public static final SubLObject uia_predicate_topical_utility(SubLObject v_agenda, SubLObject predicate, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == domain_mt) {
                domain_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
            }
            {
                SubLObject v_answer = ZERO_INTEGER;
                v_answer = add(v_answer, uia_trampolines.uia_predicate_general_utility(v_agenda, predicate, UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind($$BaseKB, thread);
                        v_answer = subtract(v_answer, kb_indexing.relevant_num_index(predicate));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(domain_mt, thread);
                        v_answer = add(v_answer, multiply($int$100, kb_indexing.relevant_num_index(predicate)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject uia_act_new_knowledge_scrapbook(SubLObject v_agenda, SubLObject mode) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $KNOWLEDGE_SCRAPBOOK, NIL, UNPROVIDED);
    }

    public static final SubLObject uiat_knowledge_scrapbook_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($ASSERTION_CREATOR) || pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject entity = user_interaction_agenda.ui_result(child);
                    uia_add_to_scrap_book(v_agenda, entity);
                }
                if ($ASSERTION == user_interaction_agenda.ui_state_lookup(child, $ENTITY_TYPE, UNPROVIDED)) {
                    user_interaction_agenda.ui_state_update(parent, $EL_FORMULAS, NIL);
                }
            } else
                if (pcase_var.eql($SENTENCE_READER)) {
                    {
                        SubLObject sentences = user_interaction_agenda.ui_result(child);
                        SubLObject cdolist_list_var = sentences;
                        SubLObject sentence = NIL;
                        for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                            uia_add_to_scrap_book(v_agenda, sentence);
                        }
                    }
                } else
                    if (pcase_var.eql($FILE_BROWSER)) {
                        {
                            SubLObject filename = user_interaction_agenda.ui_result(child);
                            SubLObject datum = user_interaction_agenda.ui_args(child);
                            SubLObject current = datum;
                            SubLObject file_browser = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt121);
                            file_browser = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject mode = uia_tools_basic.file_browser_type(file_browser);
                                    SubLObject pcase_var_19 = mode;
                                    if (pcase_var_19.eql($LOAD)) {
                                        uiat_kescrap_load(v_agenda, filename);
                                    } else
                                        if (pcase_var_19.eql($SAVE)) {
                                            uiat_kescrap_save(v_agenda, filename);
                                        }

                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt121);
                            }
                        }
                    }


        }
        return parent;
    }

    public static final SubLObject uiat_knowledge_scrapbook_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject terms = uia_get_scrap_book_terms(v_agenda);
            SubLObject crumb_terms = user_interaction_agenda.uia_get_terms_on_crumb_trail(v_agenda);
            SubLObject assertions = uia_get_scrap_book_assertions(v_agenda);
            SubLObject crumb_assertions = user_interaction_agenda.uia_get_facts_on_crumb_trail(v_agenda);
            SubLObject sentences = uia_get_scrap_book_sentences(v_agenda);
            SubLObject el_formulas = user_interaction_agenda.ui_state_lookup(interaction, $EL_FORMULAS, UNPROVIDED);
            if (NIL == el_formulas) {
                uiat_kescrap_constructor(interaction, assertions);
                el_formulas = user_interaction_agenda.ui_state_lookup(interaction, $EL_FORMULAS, UNPROVIDED);
            }
            {
                SubLObject select_terms = misc_utilities.boolean_to_keyword(uia_tools_basic.uia_within_concept_finderP(v_agenda));
                SubLObject select_sentences = misc_utilities.boolean_to_keyword(uia_tools_basic.uia_within_sentence_finderP(v_agenda));
                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $TERMS, terms, $SENTENCES, sentences, $ASSERTIONS, el_formulas, $CRUMB_TERMS, crumb_terms, $CRUMB_ASSERTIONS, crumb_assertions, $SELECT_TERMS, select_terms, $SELECT_SENTENCES, select_sentences }));
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                return request;
            }
        }
    }

    public static final SubLObject uiat_kescrap_constructor(SubLObject interaction, SubLObject assertions) {
        {
            SubLObject el_formulas = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    el_formulas = cons(uncanonicalizer.assertion_el_formula(assertion), el_formulas);
                }
            }
            user_interaction_agenda.ui_state_update(interaction, $EL_FORMULAS, el_formulas);
        }
        return interaction;
    }

    public static final SubLObject uiat_knowledge_scrapbook_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($ADD_NEW)) {
                    {
                        SubLObject datum_20 = plist;
                        SubLObject current_21 = datum_20;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_21;
                        SubLObject bad = NIL;
                        SubLObject current_22 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_20, $list_alt132);
                            current_22 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_20, $list_alt132);
                            if (NIL == member(current_22, $list_alt133, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_22 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_20, $list_alt132);
                        }
                        {
                            SubLObject type_tail = property_list_member($TYPE, current_21);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                            SubLObject phrase_tail = property_list_member($PHRASE, current_21);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            uiat_kescrap_handle_add_new_reply(v_agenda, type, phrase);
                        }
                    }
                } else
                    if (pcase_var.eql($ADD)) {
                        {
                            SubLObject datum_23 = plist;
                            SubLObject current_24 = datum_23;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_24;
                            SubLObject bad = NIL;
                            SubLObject current_25 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_23, $list_alt137);
                                current_25 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_23, $list_alt137);
                                if (NIL == member(current_25, $list_alt138, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_25 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_23, $list_alt137);
                            }
                            {
                                SubLObject type_tail = property_list_member($TYPE, current_24);
                                SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                                SubLObject entity_tail = property_list_member($ENTITY, current_24);
                                SubLObject entity = (NIL != entity_tail) ? ((SubLObject) (cadr(entity_tail))) : NIL;
                                uia_add_to_scrap_book(v_agenda, entity);
                            }
                        }
                    } else
                        if (pcase_var.eql($DROP)) {
                            {
                                SubLObject datum_26 = plist;
                                SubLObject current_27 = datum_26;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_27;
                                SubLObject bad = NIL;
                                SubLObject current_28 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_26, $list_alt141);
                                    current_28 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_26, $list_alt141);
                                    if (NIL == member(current_28, $list_alt142, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_28 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_26, $list_alt141);
                                }
                                {
                                    SubLObject type_tail = property_list_member($TYPE, current_27);
                                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                                    SubLObject id_tail = property_list_member($ID, current_27);
                                    SubLObject id = (NIL != id_tail) ? ((SubLObject) (cadr(id_tail))) : NIL;
                                    uiat_kescrap_handle_drop_reply(v_agenda, type, id);
                                }
                            }
                        } else
                            if (pcase_var.eql($SAVE)) {
                                {
                                    SubLObject child = uia_tools_basic.uia_act_new_file_browser(v_agenda, $str_alt144$_, $SAVE, UNPROVIDED);
                                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                }
                            } else
                                if (pcase_var.eql($LOAD)) {
                                    {
                                        SubLObject child = uia_tools_basic.uia_act_new_file_browser(v_agenda, $str_alt144$_, $LOAD, UNPROVIDED);
                                        user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                                    }
                                }




            }
        }
        return NIL;
    }

    public static final SubLObject uiat_kescrap_handle_add_new_reply(SubLObject v_agenda, SubLObject type, SubLObject phrase) {
        {
            SubLObject interaction = uia_act_new_knowledge_scrapbook(v_agenda, $REQUIRED);
            SubLObject child = NIL;
            if (type == $SENTENCE) {
                child = cb_uiat_smart.uia_act_new_sentence_reader(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED);
            } else
                if (type == $ASSERTION) {
                    child = uia_tools_introduction.uia_act_new_assertion_creator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED);
                } else
                    if (type == $TERM) {
                        child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }


            user_interaction_agenda.ui_state_update(child, $ENTITY_TYPE, type);
            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
            return interaction;
        }
    }

    public static final SubLObject uiat_kescrap_handle_drop_reply(SubLObject v_agenda, SubLObject type, SubLObject id) {
        {
            SubLObject interaction = uia_act_new_knowledge_scrapbook(v_agenda, $REQUIRED);
            SubLObject list = NIL;
            if (type == $ASSERTION) {
                user_interaction_agenda.ui_state_update(interaction, $EL_FORMULAS, NIL);
                list = uia_get_scrap_book_assertions(v_agenda);
            } else
                if (type == $SENTENCE) {
                    list = uia_get_scrap_book_sentences(v_agenda);
                } else
                    if (type == $TERM) {
                        list = uia_get_scrap_book_terms(v_agenda);
                    }


            {
                SubLObject entity = nth(id, list);
                if (NIL != entity) {
                    uia_rem_from_scrap_book(v_agenda, entity);
                }
            }
            return interaction;
        }
    }

    public static final SubLObject uiat_kescrap_load(SubLObject v_agenda, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
                if (NIL == scrapbook) {
                    scrapbook = new_scrap_book();
                    user_interaction_agenda.uia_state_update(v_agenda, $SCRAPBOOK, scrapbook);
                }
                {
                    SubLObject mode = $TERM;
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(filename, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt148$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject s = stream;
                            SubLObject item = NIL;
                            for (item = read_ignoring_errors(s, NIL, $EOF); $EOF != item; item = read_ignoring_errors(s, NIL, $EOF)) {
                                {
                                    SubLObject pcase_var = item;
                                    if (pcase_var.eql($TERM)) {
                                        mode = $TERM;
                                    } else
                                        if (pcase_var.eql($SENTENCE)) {
                                            mode = $SENTENCE;
                                        } else {
                                            add_to_scrap_book(scrapbook, item);
                                        }

                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uiat_kescrap_save(SubLObject v_agenda, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt148$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        format(s, $str_alt151$___KE_Scrapbook_____Saved____A, numeric_date_utilities.timestring(UNPROVIDED));
                        format(s, $str_alt152$___S, $TERM);
                        {
                            SubLObject cdolist_list_var = uia_get_scrap_book_terms(v_agenda);
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                format(s, $str_alt152$___S, v_term);
                            }
                        }
                        format(s, $str_alt152$___S, $SENTENCE);
                        {
                            SubLObject cdolist_list_var = uia_get_scrap_book_sentences(v_agenda);
                            SubLObject sentence = NIL;
                            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                format(s, $str_alt152$___S, sentence);
                            }
                        }
                        terpri(s);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return v_agenda;
        }
    }

    public static final SubLObject uia_add_to_scrap_book(SubLObject v_agenda, SubLObject item) {
        uia_act_new_knowledge_scrapbook(v_agenda, $REQUIRED);
        {
            SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
            if (NIL == scrapbook) {
                scrapbook = new_scrap_book();
                user_interaction_agenda.uia_state_update(v_agenda, $SCRAPBOOK, scrapbook);
            }
            add_to_scrap_book(scrapbook, item);
        }
        return v_agenda;
    }

    public static final SubLObject uia_rem_from_scrap_book(SubLObject v_agenda, SubLObject item) {
        {
            SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
            if (NIL != scrapbook) {
                rem_from_scrap_book(scrapbook, item);
            }
        }
        return v_agenda;
    }

    public static final SubLObject uia_get_scrap_book_terms(SubLObject v_agenda) {
        {
            SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
            if (NIL == scrapbook) {
                return NIL;
            } else {
                return scrap_book_terms(scrapbook);
            }
        }
    }

    public static final SubLObject uia_get_scrap_book_assertions(SubLObject v_agenda) {
        {
            SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
            if (NIL == scrapbook) {
                return NIL;
            } else {
                return scrap_book_assertions(scrapbook);
            }
        }
    }

    public static final SubLObject uia_get_scrap_book_sentences(SubLObject v_agenda) {
        {
            SubLObject scrapbook = user_interaction_agenda.uia_state_lookup(v_agenda, $SCRAPBOOK, UNPROVIDED);
            if (NIL == scrapbook) {
                return NIL;
            } else {
                return scrap_book_sentences(scrapbook);
            }
        }
    }

    public static final class $scrap_book_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return uia_tools_browsing.$scrap_book_native.structDecl;
        }

        @Override
	public SubLObject getField2() {
            return $terms;
        }

        @Override
	public SubLObject getField3() {
            return $assertions;
        }

        @Override
	public SubLObject getField4() {
            return $sentences;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return $terms = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return $assertions = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return $sentences = value;
        }

        public SubLObject $terms = Lisp.NIL;

        public SubLObject $assertions = Lisp.NIL;

        public SubLObject $sentences = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(uia_tools_browsing.$scrap_book_native.class, SCRAP_BOOK, SCRAP_BOOK_P, $list_alt155, $list_alt156, new String[]{ "$terms", "$assertions", "$sentences" }, $list_alt157, $list_alt158, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_scrap_book$ = makeSymbol("*DTP-SCRAP-BOOK*");

    public static final SubLObject scrap_book_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject scrap_book_p(SubLObject v_object) {
        return v_object.getClass() == uia_tools_browsing.$scrap_book_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $scrap_book_p$UnaryFunction extends UnaryFunction {
        public $scrap_book_p$UnaryFunction() {
            super(extractFunctionNamed("SCRAP-BOOK-P"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1) {
            return scrap_book_p(arg1);
        }
    }

    public static final SubLObject scrap_book_terms(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.getField2();
    }

    public static final SubLObject scrap_book_assertions(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.getField3();
    }

    public static final SubLObject scrap_book_sentences(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_scrap_book_terms(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_scrap_book_assertions(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_scrap_book_sentences(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SCRAP_BOOK_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_scrap_book(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new uia_tools_browsing.$scrap_book_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TERMS)) {
                        _csetf_scrap_book_terms(v_new, current_value);
                    } else
                        if (pcase_var.eql($ASSERTIONS)) {
                            _csetf_scrap_book_assertions(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCES)) {
                                _csetf_scrap_book_sentences(v_new, current_value);
                            } else {
                                Errors.error($str_alt167$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_scrap_book() {
        {
            SubLObject scrapbook = make_scrap_book(UNPROVIDED);
            _csetf_scrap_book_terms(scrapbook, NIL);
            _csetf_scrap_book_assertions(scrapbook, NIL);
            _csetf_scrap_book_sentences(scrapbook, NIL);
            return scrapbook;
        }
    }

    public static final SubLObject add_term_to_scrap_book(SubLObject scrapbook, SubLObject v_term) {
        {
            SubLObject terms = scrap_book_terms(scrapbook);
            SubLObject item_var = v_term;
            if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                terms = cons(item_var, terms);
            }
            _csetf_scrap_book_terms(scrapbook, terms);
        }
        return scrapbook;
    }

    public static final SubLObject add_assertion_to_scrap_book(SubLObject scrapbook, SubLObject assertion) {
        {
            SubLObject assertions = scrap_book_assertions(scrapbook);
            SubLObject item_var = assertion;
            if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                assertions = cons(item_var, assertions);
            }
            _csetf_scrap_book_assertions(scrapbook, assertions);
        }
        return scrapbook;
    }

    public static final SubLObject add_sentence_to_scrap_book(SubLObject scrapbook, SubLObject sentence) {
        {
            SubLObject sentences = scrap_book_sentences(scrapbook);
            SubLObject item_var = sentence;
            if (NIL == member(item_var, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                sentences = cons(item_var, sentences);
            }
            _csetf_scrap_book_sentences(scrapbook, sentences);
        }
        return scrapbook;
    }

    public static final SubLObject rem_term_from_scrap_book(SubLObject scrapbook, SubLObject v_term) {
        {
            SubLObject terms = scrap_book_terms(scrapbook);
            _csetf_scrap_book_terms(scrapbook, delete(v_term, terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return scrapbook;
    }

    public static final SubLObject rem_assertion_from_scrap_book(SubLObject scrapbook, SubLObject assertion) {
        {
            SubLObject assertions = scrap_book_assertions(scrapbook);
            _csetf_scrap_book_assertions(scrapbook, delete(assertion, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return scrapbook;
    }

    public static final SubLObject rem_sentence_from_scrap_book(SubLObject scrapbook, SubLObject sentence) {
        {
            SubLObject sentences = scrap_book_sentences(scrapbook);
            _csetf_scrap_book_sentences(scrapbook, delete(sentence, sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return scrapbook;
    }

    public static final SubLObject rem_from_scrap_book(SubLObject scrapbook, SubLObject entity) {
        if (NIL != forts.fort_p(entity)) {
            rem_term_from_scrap_book(scrapbook, entity);
        } else
            if (NIL != assertion_handles.assertion_p(entity)) {
                rem_assertion_from_scrap_book(scrapbook, entity);
            } else
                if (NIL != term.nautP(entity, UNPROVIDED)) {
                    rem_term_from_scrap_book(scrapbook, entity);
                } else
                    if (NIL != collection_defns.cycl_sentenceP(entity)) {
                        rem_sentence_from_scrap_book(scrapbook, entity);
                    }



        return scrapbook;
    }

    public static final SubLObject add_to_scrap_book(SubLObject scrapbook, SubLObject entity) {
        if (NIL != forts.fort_p(entity)) {
            add_term_to_scrap_book(scrapbook, entity);
        } else
            if (NIL != assertion_handles.assertion_p(entity)) {
                add_assertion_to_scrap_book(scrapbook, entity);
            } else
                if (NIL != term.nautP(entity, UNPROVIDED)) {
                    add_term_to_scrap_book(scrapbook, entity);
                } else
                    if (NIL != collection_defns.cycl_sentenceP(entity)) {
                        add_sentence_to_scrap_book(scrapbook, entity);
                    }



        return scrapbook;
    }

    public static final SubLObject uia_act_new_ontology_browser(SubLObject v_agenda, SubLObject mode, SubLObject v_term, SubLObject term_name) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (term_name == UNPROVIDED) {
            term_name = NIL;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ONTOLOGY_BROWSER, NIL, nconc(NIL != v_term ? ((SubLObject) (list($TERM, v_term))) : NIL, NIL != term_name ? ((SubLObject) (list($TERM_NAME, term_name))) : NIL));
    }

    public static final SubLObject uia_act_new_focused_ontology_browser(SubLObject v_agenda, SubLObject mode, SubLObject v_term, SubLObject term_name) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (term_name == UNPROVIDED) {
            term_name = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interaction = NIL;
                {
                    SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                    try {
                        uia_macros.$focused_uia_interaction$.bind(T, thread);
                        interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ONTOLOGY_BROWSER, NIL, nconc(NIL != v_term ? ((SubLObject) (list($TERM, v_term))) : NIL, NIL != term_name ? ((SubLObject) (list($TERM_NAME, term_name))) : NIL));
                    } finally {
                        uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                    }
                }
                return interaction;
            }
        }
    }

    public static final SubLObject uia_ontology_browser_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
            SubLObject term_name = (NIL != args) ? ((SubLObject) (args.first())) : user_interaction_agenda.ui_state_lookup(interaction, $TERM_NAME, $UNDETERMINED);
            SubLObject select = misc_utilities.boolean_to_keyword(uia_tools_basic.uia_within_concept_finderP(v_agenda));
            SubLObject domain_interaction_mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
            if ($UNDETERMINED != term_name) {
                {
                    SubLObject child = cb_uiat_smart.uia_act_new_term_reader(v_agenda, $REQUIRED, term_name, NIL, NIL, T);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            }
            if ($UNDETERMINED == v_term) {
                user_interaction_agenda.ui_state_update(interaction, $DOMAIN_EXAMPLES, uia_ontology_browser_domain_example_terms(v_agenda));
                user_interaction_agenda.ui_state_update(interaction, $GENERAL_EXAMPLES, uia_ontology_browser_example_terms(domain_interaction_mt));
                {
                    SubLObject request = user_interaction_agenda.make_ui_request(interaction, $EXAMPLES, list($SELECT, select));
                    user_interaction_agenda.uia_act_complete(v_agenda, interaction, $EXAMPLES);
                    return request;
                }
            }
            if (NIL != narts_high.naut_p(v_term)) {
                v_term = narts_high.find_nart(v_term);
                user_interaction_agenda.ui_state_update(interaction, $TERM, v_term);
            }
            {
                SubLObject highlight = uiat_concept_clarifier_compute_highlight_state(v_agenda, v_term);
                SubLObject alt_phrases_list = uia_term_alternative_phrases(v_agenda, v_term);
                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERM, v_term, $SELECT, select, $HIGHLIGHT, highlight));
                user_interaction_agenda.ui_state_update(interaction, $SME_TERM, misc_utilities.boolean_to_keyword(is_sme_term_in_interactionP(v_term, interaction)));
                user_interaction_agenda.ui_state_update(interaction, $HELP_TEXT, user_interaction_agenda.ui_help_text(interaction));
                user_interaction_agenda.ui_state_update(interaction, $SUMMARY_SENTENCE, uia_trampolines.uia_html_summary_sentence(v_agenda, v_term));
                user_interaction_agenda.ui_state_update(interaction, $ALT_PHRASES, NIL != alt_phrases_list ? ((SubLObject) (cb_uia_tools_glossary.string_for_list_comma_separated(alt_phrases_list))) : NIL);
                user_interaction_agenda.ui_state_update(interaction, $TERM_RELATIONS, uia_ontology_browser_gather_term_connections(interaction, v_term));
                user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
                user_interaction_agenda.uia_act_complete(v_agenda, interaction, v_term);
                return request;
            }
        }
    }

    public static final SubLObject uia_ontology_browser_handle_reply(SubLObject reply) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = reply;
                SubLObject current = datum;
                SubLObject operator = NIL;
                SubLObject action_type = NIL;
                SubLObject temp_plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt14);
                operator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt14);
                action_type = current.first();
                current = current.rest();
                temp_plist = current;
                {
                    SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                    SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                    SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                    SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                    SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                    SubLObject pcase_var = action_type;
                    if (pcase_var.eql($LAUNCH)) {
                        {
                            SubLObject datum_29 = plist;
                            SubLObject current_30 = datum_29;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current_30;
                            SubLObject bad = NIL;
                            SubLObject current_31 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum_29, $list_alt176);
                                current_31 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum_29, $list_alt176);
                                if (NIL == member(current_31, $list_alt177, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_31 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum_29, $list_alt176);
                            }
                            {
                                SubLObject term_tail = property_list_member($TERM, current_30);
                                SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                SubLObject focused_interaction_tail = property_list_member($FOCUSED_INTERACTION, current_30);
                                SubLObject focused_interaction = (NIL != focused_interaction_tail) ? ((SubLObject) (cadr(focused_interaction_tail))) : NIL;
                                if (NIL != focused_interaction) {
                                    uia_act_new_focused_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                } else {
                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                }
                            }
                        }
                    } else
                        if (pcase_var.eql($INTERPRET)) {
                            {
                                SubLObject datum_32 = plist;
                                SubLObject current_33 = datum_32;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current_33;
                                SubLObject bad = NIL;
                                SubLObject current_34 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum_32, $list_alt180);
                                    current_34 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum_32, $list_alt180);
                                    if (NIL == member(current_34, $list_alt181, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_34 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum_32, $list_alt180);
                                }
                                {
                                    SubLObject term_name_tail = property_list_member($TERM_NAME, current_33);
                                    SubLObject term_name = (NIL != term_name_tail) ? ((SubLObject) (cadr(term_name_tail))) : NIL;
                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, $UNDETERMINED, term_name);
                                }
                            }
                        } else
                            if (pcase_var.eql($FOCUS)) {
                                {
                                    SubLObject datum_35 = plist;
                                    SubLObject current_36 = datum_35;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current_36;
                                    SubLObject bad = NIL;
                                    SubLObject current_37 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum_35, $list_alt183);
                                        current_37 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum_35, $list_alt183);
                                        if (NIL == member(current_37, $list_alt184, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_37 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum_35, $list_alt183);
                                    }
                                    {
                                        SubLObject term_tail = property_list_member($TERM, current_36);
                                        SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                        uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                    }
                                }
                            } else
                                if (pcase_var.eql($RESTART)) {
                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($OTHER)) {
                                        {
                                            SubLObject datum_38 = plist;
                                            SubLObject current_39 = datum_38;
                                            SubLObject allow_other_keys_p = NIL;
                                            SubLObject rest = current_39;
                                            SubLObject bad = NIL;
                                            SubLObject current_40 = NIL;
                                            for (; NIL != rest;) {
                                                destructuring_bind_must_consp(rest, datum_38, $list_alt187);
                                                current_40 = rest.first();
                                                rest = rest.rest();
                                                destructuring_bind_must_consp(rest, datum_38, $list_alt187);
                                                if (NIL == member(current_40, $list_alt188, UNPROVIDED, UNPROVIDED)) {
                                                    bad = T;
                                                }
                                                if (current_40 == $ALLOW_OTHER_KEYS) {
                                                    allow_other_keys_p = rest.first();
                                                }
                                                rest = rest.rest();
                                            }
                                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                                cdestructuring_bind_error(datum_38, $list_alt187);
                                            }
                                            {
                                                SubLObject term_tail = property_list_member($TERM, current_39);
                                                SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                                                SubLObject requested_action_tail = property_list_member($REQUESTED_ACTION, current_39);
                                                SubLObject requested_action = (NIL != requested_action_tail) ? ((SubLObject) (cadr(requested_action_tail))) : NIL;
                                                SubLObject action_key = make_keyword(Strings.string_trim($list_alt190, requested_action));
                                                SubLObject pcase_var_41 = action_key;
                                                if (pcase_var_41.eql($ASSERTED_SENTENCES)) {
                                                    {
                                                        SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                        try {
                                                            uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                            uia_act_new_asserted_sentences(v_agenda, $REQUIRED, $str_alt98$, v_term);
                                                        } finally {
                                                            uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                        }
                                                    }
                                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                } else
                                                    if (pcase_var_41.eql($ADD_SCRAP)) {
                                                        {
                                                            SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                            try {
                                                                uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                uia_add_to_scrap_book(v_agenda, v_term);
                                                            } finally {
                                                                uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                            }
                                                        }
                                                        uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                    } else
                                                        if (pcase_var_41.eql($INTERVIEW)) {
                                                            {
                                                                SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                try {
                                                                    uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                    user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                    uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, $REQUIRED, $str_alt98$, v_term);
                                                                } finally {
                                                                    uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                }
                                                            }
                                                            uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                        } else
                                                            if (pcase_var_41.eql($LEXIFY)) {
                                                                {
                                                                    SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                    try {
                                                                        uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                        user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                        cb_uiat_lexification_wizard.uia_act_new_lexification_wizard(v_agenda, v_term, UNPROVIDED, UNPROVIDED);
                                                                    } finally {
                                                                        uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                    }
                                                                }
                                                                uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                            } else
                                                                if (pcase_var_41.eql($CONCEPT_RELATOR)) {
                                                                    {
                                                                        SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                        try {
                                                                            uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                            cb_uia_tools_browsing.uia_act_new_concept_relator(v_agenda, $REQUIRED, $str_alt98$, v_term);
                                                                        } finally {
                                                                            uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                        }
                                                                    }
                                                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                } else
                                                                    if (pcase_var_41.eql($COMMON_QUERIES)) {
                                                                        {
                                                                            SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                            try {
                                                                                uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                uia_tools_review_and_testing.uia_act_new_common_queries(v_agenda, $REQUIRED, v_term);
                                                                            } finally {
                                                                                uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                            }
                                                                        }
                                                                        uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                    } else
                                                                        if (pcase_var_41.eql($CREATE_SIMILAR)) {
                                                                            {
                                                                                SubLObject term_name = uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                    try {
                                                                                        uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                        user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                        uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, $$$your_new_term, NIL, NIL, term_name, UNPROVIDED);
                                                                                    } finally {
                                                                                        uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                    }
                                                                                }
                                                                                uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                            }
                                                                        } else
                                                                            if (pcase_var_41.eql($CREATE_INSTANCE)) {
                                                                                {
                                                                                    SubLObject term_name = cconcatenate($str_alt201$your_new_, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                    {
                                                                                        SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                        try {
                                                                                            uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                            uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, term_name, list(v_term), NIL, UNPROVIDED, UNPROVIDED);
                                                                                        } finally {
                                                                                            uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                        }
                                                                                    }
                                                                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                                }
                                                                            } else
                                                                                if (pcase_var_41.eql($CREATE_SPEC)) {
                                                                                    {
                                                                                        SubLObject term_name = cconcatenate($str_alt203$your_new_kind_of_, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                        {
                                                                                            SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                            try {
                                                                                                uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                                user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                                uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, term_name, NIL, list(v_term), UNPROVIDED, UNPROVIDED);
                                                                                            } finally {
                                                                                                uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                            }
                                                                                        }
                                                                                        uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                                    }
                                                                                } else
                                                                                    if (pcase_var_41.eql($KILL_TERM)) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                            try {
                                                                                                uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                                user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                                uia_tools_misc.uia_act_new_concept_killer(v_agenda, $REQUIRED, v_term);
                                                                                            } finally {
                                                                                                uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                            }
                                                                                        }
                                                                                        uia_act_new_ontology_browser(v_agenda, $REQUIRED, UNPROVIDED, UNPROVIDED);
                                                                                    } else
                                                                                        if (pcase_var_41.eql($COMPARE)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                                try {
                                                                                                    uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                                    user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                                    cb_uia_launchers.cb_uia_launch_concept_comparator(uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                                } finally {
                                                                                                    uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                                }
                                                                                            }
                                                                                            uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                                        } else
                                                                                            if (pcase_var_41.eql($ANALOGY)) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                                    try {
                                                                                                        uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                                        user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                                        cb_uia_launchers.cb_uia_launch_analogy_developer(list(uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                                                                                    } finally {
                                                                                                        uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                                    }
                                                                                                }
                                                                                                uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                                            } else
                                                                                                if (pcase_var_41.eql($RELATION_SUGGESTOR)) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0 = uia_macros.$focused_uia_interaction$.currentBinding(thread);
                                                                                                        try {
                                                                                                            uia_macros.$focused_uia_interaction$.bind(T, thread);
                                                                                                            user_interaction_agenda.uia_schedule_frame_for_refresh(v_agenda, $UIA_INTERACTION);
                                                                                                            cb_uia_launchers.cb_uia_launch_relationship_suggestor(list(uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                                                                                        } finally {
                                                                                                            uia_macros.$focused_uia_interaction$.rebind(_prev_bind_0, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    uia_act_new_ontology_browser(v_agenda, $REQUIRED, v_term, UNPROVIDED);
                                                                                                }












                                            }
                                        }
                                    }




                }
            }
            return NIL;
        }
    }

    public static final SubLObject uia_ontology_browser_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($TERM_READER)) {
                {
                    SubLObject result = user_interaction_agenda.ui_result(child);
                    SubLObject result_string = user_interaction_agenda.ui_state_lookup(child, $RETURN_STRING, UNPROVIDED);
                    user_interaction_agenda.ui_state_clear(parent, $TERM_NAME);
                    user_interaction_agenda._csetf_ui_args(parent, NIL);
                    if (NIL != result_string) {
                        user_interaction_agenda.ui_state_update(parent, $HEADER_STRING, result_string);
                    } else {
                        user_interaction_agenda.ui_state_clear(parent, $HEADER_STRING);
                    }
                    if (result.isCons()) {
                        if (NIL != forts.fort_p(narts_high.find_nart(result))) {
                            result = narts_high.find_nart(result);
                        } else {
                            result = result.first();
                        }
                    }
                    if (NIL != forts.fort_p(result)) {
                        user_interaction_agenda.ui_state_update(parent, $TERM, result);
                    } else {
                        user_interaction_agenda.ui_state_clear(parent, $TERM);
                    }
                }
            }
        }
        return parent;
    }

    // deflexical
    private static final SubLSymbol $uia_ontology_browser_example_terms$ = makeSymbol("*UIA-ONTOLOGY-BROWSER-EXAMPLE-TERMS*");

    public static final SubLObject uia_ontology_browser_example_terms(SubLObject domain_mt) {
        return list_utilities.remove_if_not(symbol_function($sym212$VALID_FORT_), $uia_ontology_browser_example_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uia_ontology_browser_domain_example_terms(SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_mt = user_interaction_agenda.uia_domain_mt(v_agenda);
                SubLObject examples = NIL;
                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt213$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                examples = uia_ontology_browser_domain_example_terms_memoized(domain_mt);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return examples;
            }
        }
    }

    public static final SubLObject uia_ontology_browser_domain_example_terms_memoized_internal(SubLObject domain_mt) {
        return ask_utilities.ask_variable($sym215$_VAR, $list_alt216, domain_mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject uia_ontology_browser_domain_example_terms_memoized(SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_ontology_browser_domain_example_terms_memoized_internal(domain_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_ONTOLOGY_BROWSER_DOMAIN_EXAMPLE_TERMS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_ONTOLOGY_BROWSER_DOMAIN_EXAMPLE_TERMS_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_ONTOLOGY_BROWSER_DOMAIN_EXAMPLE_TERMS_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, domain_mt, $kw217$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw217$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_ontology_browser_domain_example_terms_memoized_internal(domain_mt)));
                        memoization_state.caching_state_put(caching_state, domain_mt, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     *
     *
     * @unknown this function is lumping together two different notions of examples, but these two notions may not actually be the same
     */
    public static final SubLObject uia_ontology_browser_gather_term_connections(SubLObject interaction, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject mt = user_interaction_agenda.ui_domain_interaction_mt(interaction);
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject example_usage_sentences = uiat_concept_clarifier_compute_good_examples(v_agenda, v_term);
                SubLObject connections = NIL;
                SubLObject predicates = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_43 = NIL;
                                                            SubLObject token_var_44 = NIL;
                                                            while (NIL == done_var_43) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_44);
                                                                    SubLObject valid_45 = makeBoolean(token_var_44 != assertion);
                                                                    if (NIL != valid_45) {
                                                                        {
                                                                            SubLObject formula = assertions_high.assertion_formula(assertion);
                                                                            SubLObject predicate = cycl_utilities.formula_arg0(formula);
                                                                            if (NIL == uia_ontology_browser_irrelevant_connectionP(v_agenda, predicate)) {
                                                                                if (NIL == dictionary.dictionary_lookup(map, predicate, UNPROVIDED)) {
                                                                                    dictionary.dictionary_enter(map, predicate, formula);
                                                                                    predicates = cons(predicate, predicates);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_43 = makeBoolean(NIL == valid_45);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_46, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = predicates;
                    SubLObject predicate = NIL;
                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                        {
                            SubLObject formula = dictionary.dictionary_lookup(map, predicate, UNPROVIDED);
                            connections = cons(formula, connections);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = example_usage_sentences;
                    SubLObject sentence = NIL;
                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                        connections = cons(sentence, connections);
                    }
                }
                return remove_duplicates(connections, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLObject uia_ontology_browser_irrelevant_connectionP(SubLObject v_agenda, SubLObject predicate) {
        if (NIL != subl_promotions.memberP(predicate, list($$isa, $$genls, $$repatriateToMt, $$definingMt), UNPROVIDED, UNPROVIDED)) {
            return T;
        } else
            if (NIL != uia_trampolines.uia_irrelevant_termP(v_agenda, predicate, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }

    }

    /**
     * verbose is true for entry via the concept creator and nil for entry via the recognizer
     */
    public static final SubLObject uia_act_new_concept_recognizer(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject auto_create_unrecognizedP) {
        if (auto_create_unrecognizedP == UNPROVIDED) {
            auto_create_unrecognizedP = NIL;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_RECOGNIZER, list(phrase, auto_create_unrecognizedP), UNPROVIDED);
    }

    public static final SubLObject uiat_concept_recognizer_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject toss = current;
                return format(NIL, $str_alt226$Recognize____A, phrase);
            }
        }
    }

    public static final SubLObject uiat_concept_recognizer_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt227);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject auto_create_unrecognizedP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt227);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject candidate_terms = user_interaction_agenda.ui_state_lookup(interaction, $CANDIDATE_TERMS, $UNDETERMINED);
                        if ($UNDETERMINED == candidate_terms) {
                            {
                                SubLObject message = format(NIL, $str_alt229$Reading__S, phrase);
                                uia_mumbler.uia_mumble(v_agenda, message);
                                uia_tools_basic.uia_act_new_thinking_child(interaction, UIA_PHRASE_CANDIDATE_TERMS, list(v_agenda, phrase), message, $CANDIDATE_TERMS);
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                        {
                            SubLObject indexical_table = user_interaction_agenda.ui_state_lookup(interaction, $INDEXICAL_TABLE, UNPROVIDED);
                            SubLObject term_info_table = uia_tools_basic.uiat_disambiguate_terms_info_table(interaction, candidate_terms, $FALSE, indexical_table);
                            SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($PHRASE, phrase, $CANDIDATE_TERMS, candidate_terms, $TERM_INFO_TABLE, term_info_table, $kw234$WITHIN_CONCEPT_CREATOR_, auto_create_unrecognizedP));
                            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                            return request;
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt227);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_recognizer_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(parent);
            SubLObject pcase_var = user_interaction_agenda.ui_operator(child);
            if (pcase_var.eql($THINKING)) {
                {
                    SubLObject datum = user_interaction_agenda.ui_args(parent);
                    SubLObject current = datum;
                    SubLObject phrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt227);
                    phrase = current.first();
                    current = current.rest();
                    {
                        SubLObject auto_create_unrecognizedP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt227);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject candidate_terms = user_interaction_agenda.ui_result(child);
                                SubLObject datum_47 = uia_trampolines.uia_forts_and_non_forts(candidate_terms);
                                SubLObject current_48 = datum_47;
                                SubLObject likely_terms = NIL;
                                SubLObject unlikely_terms = NIL;
                                destructuring_bind_must_consp(current_48, datum_47, $list_alt235);
                                likely_terms = current_48.first();
                                current_48 = current_48.rest();
                                destructuring_bind_must_consp(current_48, datum_47, $list_alt235);
                                unlikely_terms = current_48.first();
                                current_48 = current_48.rest();
                                if (NIL == current_48) {
                                    likely_terms = uia_trampolines.uia_sort_terms(v_agenda, likely_terms, UNPROVIDED, UNPROVIDED);
                                    unlikely_terms = uia_trampolines.uia_sort_terms(v_agenda, unlikely_terms, UNPROVIDED, UNPROVIDED);
                                    candidate_terms = cconcatenate(likely_terms, unlikely_terms);
                                } else {
                                    cdestructuring_bind_error(datum_47, $list_alt235);
                                }
                                user_interaction_agenda.ui_state_update(parent, $CANDIDATE_TERMS, candidate_terms);
                                if (NIL == candidate_terms) {
                                    if (NIL != auto_create_unrecognizedP) {
                                        uia_tools_introduction.uia_act_new_concept_creator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        uia_tools_basic.uia_act_new_unknown_term(v_agenda, $REQUIRED, phrase, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt227);
                        }
                    }
                }
            } else {
                user_interaction_agenda.uia_act_invalidate(v_agenda, parent);
            }
        }
        return parent;
    }

    public static final SubLObject uia_act_new_asserted_sentences(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        {
            SubLObject plist = (NIL != v_term) ? ((SubLObject) (list($TERM, v_term))) : NIL;
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $ASSERTED_SENTENCES, list(phrase), plist);
        }
    }

    public static final SubLObject uiat_asserted_sentences_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt237);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject parse_template = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt237);
                current = current.rest();
                if (NIL == current) {
                    return list($str_alt238$List_known_facts_about_, $TERM, cconcatenate($str_alt239$_, phrase));
                } else {
                    cdestructuring_bind_error(datum, $list_alt237);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_asserted_sentences_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt237);
            phrase = current.first();
            current = current.rest();
            {
                SubLObject parse_template = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt237);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                        if ($UNDETERMINED == v_term) {
                            {
                                SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, NIL, NIL, parse_template, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                        }
                        {
                            SubLObject sentences = user_interaction_agenda.ui_state_lookup(interaction, $SENTENCES, $UNDETERMINED);
                            user_interaction_agenda.uia_add_term_to_crumb_trail(v_agenda, v_term);
                            if ($UNDETERMINED == sentences) {
                                uia_tools_basic.uia_act_new_thinking_child(interaction, UIAT_ASSERTED_SENTENCES_THINKING, list(v_agenda, v_term), UNPROVIDED, UNPROVIDED);
                                sleep(ONE_INTEGER);
                                return user_interaction_agenda.uia_generate_next_request(v_agenda);
                            }
                            {
                                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERM, v_term, $SENTENCES, sentences));
                                user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                                return request;
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt237);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_asserted_sentences_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $TERM, v_term);
                }
            } else
                if (pcase_var.eql($THINKING)) {
                    {
                        SubLObject sentences = user_interaction_agenda.ui_result(child);
                        user_interaction_agenda.ui_state_update(parent, $SENTENCES, sentences);
                    }
                }

        }
        return parent;
    }

    public static final SubLObject uiat_asserted_sentences_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_49 = plist;
                        SubLObject current_50 = datum_49;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_50;
                        SubLObject bad = NIL;
                        SubLObject current_51 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_49, $list_alt241);
                            current_51 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_49, $list_alt241);
                            if (NIL == member(current_51, $list_alt242, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_51 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_49, $list_alt241);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_50);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject term_tail = property_list_member($TERM, current_50);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_50);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_asserted_sentences(v_agenda, mode, phrase, v_term);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_asserted_sentences_thinking(SubLObject v_agenda, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_string = uia_trampolines.uia_term_phrase_np(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                uia_tools_basic.uiat_thinking_note_progress_message(cconcatenate($str_alt243$Computing_known_facts_about_, new SubLObject[]{ term_string, $str_alt144$_ }), UNPROVIDED);
                {
                    SubLObject sentences = uia_trampolines.uia_sentences_for_term(v_agenda, v_term, UNPROVIDED);
                    SubLObject subsentences = Mapping.mapcar(FORMULA_ARG2, sentences);
                    SubLObject mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                    SubLObject assertions = NIL;
                    uia_trampolines.uia_precache_html_sentence_phrases(v_agenda, subsentences, cconcatenate($str_alt245$Determining_how_to_express_known_, term_string), UNPROVIDED, UNPROVIDED);
                    sentences = group_sentences_by_mt(sentences);
                    {
                        SubLObject cdolist_list_var = sentences;
                        SubLObject group = NIL;
                        for (group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , group = cdolist_list_var.first()) {
                            {
                                SubLObject datum = group;
                                SubLObject current = datum;
                                SubLObject sentences_mt = NIL;
                                SubLObject sentences_52 = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt246);
                                sentences_mt = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt246);
                                sentences_52 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    {
                                        SubLObject group_result = NIL;
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(mt, thread);
                                                group_result = Mapping.mapcan(UIAT_ASSERTED_SENTENCES_MAYBE_FIND_ASSERTION_FROM_MT, sentences_52, EMPTY_SUBL_OBJECT_ARRAY);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        group_result = uia_tools_review_and_testing.uiat_knowledge_reviewer_assertion_by_term_mapper(group_result, mt);
                                        assertions = cons(list(sentences_mt, group_result), assertions);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt246);
                                }
                            }
                        }
                    }
                    return assertions;
                }
            }
        }
    }

    public static final SubLObject uiat_asserted_sentences_maybe_find_assertion_from_mt(SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject cnfs = clausifier.cnf_clausal_form(narts_high.nart_substitute(cycl), mt);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = cnfs;
            SubLObject cnf = NIL;
            for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                {
                    SubLObject v_assert = kb_indexing.find_assertion_genl_mts(cnf, mt);
                    if (NIL != v_assert) {
                        result = cons(v_assert, result);
                    }
                }
            }
            if (NIL != result) {
                return result;
            } else {
                return list(cycl);
            }
        }
    }

    /**
     * sorts the Mt's in order of specificity
     *
     * @param CYCL-SENTENCES,
     * 		a list of Cycl sentences, in #$ist form
     * @return list; a list of mt-sentences pair, where each pair has the form (mt (sentence1 ... sentenceN))
     */
    public static final SubLObject group_sentences_by_mt(SubLObject cycl_sentences) {
        {
            SubLObject sentence_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = cycl_sentences;
                SubLObject ist_sentence = NIL;
                for (ist_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ist_sentence = cdolist_list_var.first()) {
                    {
                        SubLObject mt = cycl_utilities.sentence_arg1(ist_sentence, UNPROVIDED);
                        SubLObject sentence = cycl_utilities.sentence_arg2(ist_sentence, UNPROVIDED);
                        dictionary_utilities.dictionary_push(sentence_dict, mt, sentence);
                    }
                }
            }
            {
                SubLObject mt_list = dictionary.dictionary_keys(sentence_dict);
                SubLObject sorted_mt_list = Sort.sort(mt_list, symbol_function($sym107$_), GENERALITY_ESTIMATE);
                SubLObject mt_sentences_pairs = NIL;
                SubLObject cdolist_list_var = sorted_mt_list;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    mt_sentences_pairs = cons(list(mt, nreverse(dictionary.dictionary_lookup(sentence_dict, mt, UNPROVIDED))), mt_sentences_pairs);
                }
                return mt_sentences_pairs;
            }
        }
    }

    /**
     * sorts the Mt's in order of specificity
     *
     * @param ASSERTIONS,
     * 		a list of assertions
     * @return list; a list of mt-assertions pairs, where each pair has the form (mt (sentence1 ... sentenceN))
     */
    public static final SubLObject group_assertions_by_mt(SubLObject asserts) {
        {
            SubLObject assert_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = asserts;
                SubLObject v_assert = NIL;
                for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                    {
                        SubLObject mt = assertions_high.assertion_mt(v_assert);
                        dictionary_utilities.dictionary_push(assert_dict, mt, v_assert);
                    }
                }
            }
            {
                SubLObject mt_list = dictionary.dictionary_keys(assert_dict);
                SubLObject sorted_mt_list = Sort.sort(mt_list, symbol_function($sym107$_), GENERALITY_ESTIMATE);
                SubLObject mt_assert_pairs = NIL;
                SubLObject cdolist_list_var = sorted_mt_list;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    mt_assert_pairs = cons(list(mt, nreverse(dictionary.dictionary_lookup(assert_dict, mt, UNPROVIDED))), mt_assert_pairs);
                }
                return mt_assert_pairs;
            }
        }
    }

    public static final SubLObject uia_act_new_concept_comparator(SubLObject v_agenda, SubLObject mode, SubLObject phrase1, SubLObject phrase2, SubLObject term1, SubLObject term2) {
        if (term1 == UNPROVIDED) {
            term1 = NIL;
        }
        if (term2 == UNPROVIDED) {
            term2 = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != term1) {
                term1 = parsing_utilities.strip_nl_tags(term1, UNPROVIDED);
            }
            if (NIL != term2) {
                term2 = parsing_utilities.strip_nl_tags(term2, UNPROVIDED);
            }
            if (NIL != term1) {
                plist = putf(plist, $TERM1, term1);
            }
            if (NIL != term2) {
                plist = putf(plist, $TERM2, term2);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $CONCEPT_COMPARATOR, list(phrase1, phrase2), plist);
        }
    }

    public static final SubLObject uiat_concept_comparator_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase1 = NIL;
            SubLObject phrase2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt255$Compare____A_and__A, phrase1, phrase2);
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_concept_comparator_generate_request(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                SubLObject args = user_interaction_agenda.ui_args(interaction);
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject phrase1 = NIL;
                SubLObject phrase2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt254);
                phrase1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt254);
                phrase2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject term1 = user_interaction_agenda.ui_state_lookup(interaction, $TERM1, $UNDETERMINED);
                        SubLObject term2 = user_interaction_agenda.ui_state_lookup(interaction, $TERM2, $UNDETERMINED);
                        if ($UNDETERMINED == term1) {
                            {
                                SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase1, $TERM1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                        if ($UNDETERMINED == term2) {
                            {
                                SubLObject concept_disambiguator_action = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase2, $TERM2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, concept_disambiguator_action);
                            }
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject common_sentences = uia_trampolines.uia_compare_terms(v_agenda, term1, term2, UNPROVIDED);
                            SubLObject term1_unique_sentences = thread.secondMultipleValue();
                            SubLObject term2_unique_sentences = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject phrase1_53 = uia_trampolines.uia_term_phrase(v_agenda, term1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject phrase2_54 = uia_trampolines.uia_term_phrase(v_agenda, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject v_equals = misc_utilities.boolean_to_keyword(uia_trampolines.uia_equalsP(v_agenda, term1, term2, UNPROVIDED));
                                SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list(new SubLObject[]{ $TERM1, term1, $TERM2, term2, $PHRASE1, phrase1_53, $PHRASE2, phrase2_54, $EQUALS, v_equals, $COMMON_SENTENCES, common_sentences, $TERM1_UNIQUE_SENTENCES, term1_unique_sentences, $TERM2_UNIQUE_SENTENCES, term2_unique_sentences }));
                                return request;
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt254);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject uiat_concept_comparator_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_term = user_interaction_agenda.ui_result(child);
            SubLObject which_one = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
            user_interaction_agenda.ui_state_update(parent, which_one, v_term);
        }
        return parent;
    }

    public static final SubLObject uiat_concept_comparator_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_55 = plist;
                        SubLObject current_56 = datum_55;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_56;
                        SubLObject bad = NIL;
                        SubLObject current_57 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_55, $list_alt263);
                            current_57 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_55, $list_alt263);
                            if (NIL == member(current_57, $list_alt264, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_57 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_55, $list_alt263);
                        }
                        {
                            SubLObject phrase1_tail = property_list_member($PHRASE1, current_56);
                            SubLObject phrase1 = (NIL != phrase1_tail) ? ((SubLObject) (cadr(phrase1_tail))) : NIL;
                            SubLObject phrase2_tail = property_list_member($PHRASE2, current_56);
                            SubLObject phrase2 = (NIL != phrase2_tail) ? ((SubLObject) (cadr(phrase2_tail))) : NIL;
                            SubLObject term1_tail = property_list_member($TERM1, current_56);
                            SubLObject term1 = (NIL != term1_tail) ? ((SubLObject) (cadr(term1_tail))) : NIL;
                            SubLObject term2_tail = property_list_member($TERM2, current_56);
                            SubLObject term2 = (NIL != term2_tail) ? ((SubLObject) (cadr(term2_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_56);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_concept_comparator(v_agenda, mode, phrase1, phrase2, term1, term2);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_relationship_suggestor(SubLObject v_agenda, SubLObject mode, SubLObject phrase1, SubLObject phrase2, SubLObject term1, SubLObject term2) {
        if (term1 == UNPROVIDED) {
            term1 = NIL;
        }
        if (term2 == UNPROVIDED) {
            term2 = NIL;
        }
        {
            SubLObject plist = NIL;
            if (NIL != term1) {
                plist = putf(plist, $TERM1, term1);
            }
            if (NIL != term2) {
                plist = putf(plist, $TERM2, term2);
            }
            return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $RELATIONSHIP_SUGGESTOR, list(phrase1, phrase2), plist);
        }
    }

    public static final SubLObject uiat_relationship_suggestor_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase1 = NIL;
            SubLObject phrase2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase2 = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt267$Relate____A_and__A, phrase1, phrase2);
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_relationship_suggestor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject v_term = user_interaction_agenda.ui_result(child);
            SubLObject which_one = user_interaction_agenda.ui_state_lookup(child, $MY_RESULT_WILL_BE, UNPROVIDED);
            user_interaction_agenda.ui_state_update(parent, which_one, v_term);
        }
        return parent;
    }

    public static final SubLObject uiat_relationship_suggestor_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase1 = NIL;
            SubLObject phrase2 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt254);
            phrase2 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject term1 = user_interaction_agenda.ui_state_lookup(interaction, $TERM1, $UNDETERMINED);
                    SubLObject term2 = user_interaction_agenda.ui_state_lookup(interaction, $TERM2, $UNDETERMINED);
                    if ($UNDETERMINED == term1) {
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase1, $TERM1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                    if ($UNDETERMINED == term2) {
                        {
                            SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase2, $TERM2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                            return user_interaction_agenda.uia_generate_next_request(v_agenda);
                        }
                    }
                    {
                        SubLObject sentences = uia_trampolines.uia_candidate_sentences_relating_terms(v_agenda, list(term1, term2), UNPROVIDED);
                        SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERMS, list(term1, term2), $SENTENCES, sentences));
                        user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
                        return request;
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt254);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_relationship_suggestor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_58 = plist;
                        SubLObject current_59 = datum_58;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_59;
                        SubLObject bad = NIL;
                        SubLObject current_60 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_58, $list_alt263);
                            current_60 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_58, $list_alt263);
                            if (NIL == member(current_60, $list_alt264, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_60 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_58, $list_alt263);
                        }
                        {
                            SubLObject phrase1_tail = property_list_member($PHRASE1, current_59);
                            SubLObject phrase1 = (NIL != phrase1_tail) ? ((SubLObject) (cadr(phrase1_tail))) : NIL;
                            SubLObject phrase2_tail = property_list_member($PHRASE2, current_59);
                            SubLObject phrase2 = (NIL != phrase2_tail) ? ((SubLObject) (cadr(phrase2_tail))) : NIL;
                            SubLObject term1_tail = property_list_member($TERM1, current_59);
                            SubLObject term1 = (NIL != term1_tail) ? ((SubLObject) (cadr(term1_tail))) : NIL;
                            SubLObject term2_tail = property_list_member($TERM2, current_59);
                            SubLObject term2 = (NIL != term2_tail) ? ((SubLObject) (cadr(term2_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_59);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_relationship_suggestor(v_agenda, mode, phrase1, phrase2, term1, term2);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uia_act_new_predicate_suggestor(SubLObject v_agenda, SubLObject mode, SubLObject phrase, SubLObject v_term, SubLObject horizon) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $PREDICATE_SUGGESTOR, list(phrase), nconc(NIL != v_term ? ((SubLObject) (list($TERM, v_term))) : NIL, NIL != horizon ? ((SubLObject) (list($HORIZON, horizon))) : NIL));
    }

    public static final SubLObject uiat_predicate_suggestor_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt271);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt272$Predicates____A, phrase);
            } else {
                cdestructuring_bind_error(datum, $list_alt271);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_predicate_suggestor_child_completed(SubLObject parent, SubLObject child) {
        {
            SubLObject operator = user_interaction_agenda.ui_operator(child);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($CONCEPT_DISAMBIGUATOR)) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_result(child);
                    user_interaction_agenda.ui_state_update(parent, $TERM, v_term);
                }
            }
        }
        return parent;
    }

    public static final SubLObject uiat_predicate_suggestor_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject phrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt271);
            phrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject v_term = user_interaction_agenda.ui_state_lookup(interaction, $TERM, $UNDETERMINED);
                    if ($UNDETERMINED != v_term) {
                        {
                            SubLObject horizon = user_interaction_agenda.ui_state_lookup(interaction, $HORIZON, NIL);
                            SubLObject sentence_sections = uiat_predicate_suggestor_sections(v_agenda, v_term, horizon);
                            return user_interaction_agenda.make_ui_request(interaction, $SHOW, list($TERM, v_term, $SENTENCE_SECTIONS, sentence_sections));
                        }
                    }
                }
                {
                    SubLObject child = uia_tools_basic.uia_act_new_concept_disambiguator(v_agenda, $REQUIRED, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    user_interaction_agenda.uia_act_add_dependent(v_agenda, interaction, child);
                    return user_interaction_agenda.uia_generate_next_request(v_agenda);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt271);
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_predicate_suggestor_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($LAUNCH)) {
                    {
                        SubLObject datum_61 = plist;
                        SubLObject current_62 = datum_61;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_62;
                        SubLObject bad = NIL;
                        SubLObject current_63 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_61, $list_alt241);
                            current_63 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_61, $list_alt241);
                            if (NIL == member(current_63, $list_alt242, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_63 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_61, $list_alt241);
                        }
                        {
                            SubLObject phrase_tail = property_list_member($PHRASE, current_62);
                            SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                            SubLObject term_tail = property_list_member($TERM, current_62);
                            SubLObject v_term = (NIL != term_tail) ? ((SubLObject) (cadr(term_tail))) : NIL;
                            SubLObject mode_tail = property_list_member($MODE, current_62);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $REQUIRED;
                            uia_act_new_predicate_suggestor(v_agenda, mode, phrase, v_term, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject uiat_predicate_suggestor_sections(SubLObject v_agenda, SubLObject v_term, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        {
            SubLObject matches = uia_predicate_suggestor_matches(v_agenda, v_term, horizon);
            SubLObject sections = uia_trampolines.uia_organize_predicate_matches_by_collection(v_agenda, matches);
            SubLObject sentence_sections = NIL;
            SubLObject cdolist_list_var = sections;
            SubLObject section = NIL;
            for (section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , section = cdolist_list_var.first()) {
                {
                    SubLObject datum = section;
                    SubLObject current = datum;
                    SubLObject col = NIL;
                    SubLObject predicate_sections = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt273);
                    col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt273);
                    predicate_sections = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject predicates = NIL;
                            SubLObject cdolist_list_var_64 = predicate_sections;
                            SubLObject predicate_section = NIL;
                            for (predicate_section = cdolist_list_var_64.first(); NIL != cdolist_list_var_64; cdolist_list_var_64 = cdolist_list_var_64.rest() , predicate_section = cdolist_list_var_64.first()) {
                                {
                                    SubLObject datum_65 = predicate_section;
                                    SubLObject current_66 = datum_65;
                                    SubLObject predicate = NIL;
                                    SubLObject argnum_list = NIL;
                                    destructuring_bind_must_consp(current_66, datum_65, $list_alt274);
                                    predicate = current_66.first();
                                    current_66 = current_66.rest();
                                    destructuring_bind_must_consp(current_66, datum_65, $list_alt274);
                                    argnum_list = current_66.first();
                                    current_66 = current_66.rest();
                                    if (NIL == current_66) {
                                        predicates = cons(predicate, predicates);
                                    } else {
                                        cdestructuring_bind_error(datum_65, $list_alt274);
                                    }
                                }
                            }
                            predicates = nreverse(predicates);
                            {
                                SubLObject sentences = uia_trampolines.uia_predicates_to_example_sentences(v_agenda, predicates, UNPROVIDED);
                                sentence_sections = cons(list(col, sentences), sentence_sections);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt273);
                    }
                }
            }
            return nreverse(sentence_sections);
        }
    }

    public static final SubLObject uia_predicate_suggestor_matches(SubLObject v_agenda, SubLObject v_term, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
                SubLObject matches = NIL;
                SubLObject state = user_interaction_agenda.uia_memoization_state(v_agenda);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt213$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                matches = uia_predicate_suggestor_matches_memoized(v_term, domain_interaction_mt, horizon);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return matches;
            }
        }
    }

    public static final SubLObject uia_predicate_suggestor_matches_memoized_internal(SubLObject v_term, SubLObject domain_mt, SubLObject horizon) {
        return rkf_domain_examples.rkf_predicate_suggestor_matches(v_term, domain_mt, horizon);
    }

    public static final SubLObject uia_predicate_suggestor_matches_memoized(SubLObject v_term, SubLObject domain_mt, SubLObject horizon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return uia_predicate_suggestor_matches_memoized_internal(v_term, domain_mt, horizon);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, UIA_PREDICATE_SUGGESTOR_MATCHES_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), UIA_PREDICATE_SUGGESTOR_MATCHES_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, UIA_PREDICATE_SUGGESTOR_MATCHES_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, domain_mt, horizon);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw217$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (v_term.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (domain_mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && horizon.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(uia_predicate_suggestor_matches_memoized_internal(v_term, domain_mt, horizon)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, domain_mt, horizon));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Number of terms to show on any one screen
     */
    // deflexical
    public static final SubLSymbol $uia_lexicon_search_display_increment$ = makeSymbol("*UIA-LEXICON-SEARCH-DISPLAY-INCREMENT*");

    /**
     * Creates a new interaction with args (MATCHING-INDEX-ENTRIES SEARCH-TYPE)
     */
    public static final SubLObject uia_act_new_lexicon_search(SubLObject v_agenda, SubLObject mode, SubLObject pattern, SubLObject search_type) {
        return user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $LEXICON_SEARCH, list(pattern, search_type), UNPROVIDED);
    }

    /**
     * Formats lexicon search hint showing pattern and type
     */
    public static final SubLObject uiat_lexicon_search_hint(SubLObject interaction) {
        {
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject search_type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt278);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt278);
            search_type = current.first();
            current = current.rest();
            if (NIL == current) {
                return format(NIL, $str_alt279$Search____S, pattern);
            } else {
                cdestructuring_bind_error(datum, $list_alt278);
            }
        }
        return NIL;
    }

    /**
     * Processes initial lexicon search request by retrieving matching nl-trie index entries
     */
    public static final SubLObject uiat_lexicon_search_generate_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject search_type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt278);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt278);
            search_type = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject matching_index_entries = user_interaction_agenda.ui_state_lookup(interaction, $MATCHING_INDEX_ENTRIES, $UNDETERMINED);
                    nl_trie_accessors.initialize_nl_trie_rotation_index(UNPROVIDED);
                    if ($UNDETERMINED == matching_index_entries) {
                        user_interaction_agenda.ui_state_update(interaction, $PATTERN, pattern);
                        user_interaction_agenda.ui_state_update(interaction, $MATCHING_INDEX_ENTRIES, delete_duplicates(nl_trie_accessors.nl_trie_matching_phrases(pattern, search_type), symbol_function(EQUAL), NL_TRIE_INDEX_ITEM_TERM, UNPROVIDED, UNPROVIDED));
                        user_interaction_agenda.ui_state_update(interaction, $SEARCH_TYPE, search_type);
                        user_interaction_agenda.ui_state_update(interaction, $RESULT_PAGE_NUM, ZERO_INTEGER);
                        return user_interaction_agenda.uia_generate_next_request(v_agenda);
                    }
                    return make_lexicon_search_show_request(interaction);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt278);
            }
        }
        return NIL;
    }

    /**
     * Create UI request or displaying the current lexicon search
     */
    public static final SubLObject make_lexicon_search_show_request(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject pattern = user_interaction_agenda.ui_state_lookup(interaction, $PATTERN, UNPROVIDED);
            SubLObject search_type = user_interaction_agenda.ui_state_lookup(interaction, $SEARCH_TYPE, UNPROVIDED);
            SubLObject result_page_num = user_interaction_agenda.ui_state_lookup(interaction, $RESULT_PAGE_NUM, UNPROVIDED);
            SubLObject matching_index_entries = user_interaction_agenda.ui_state_lookup(interaction, $MATCHING_INDEX_ENTRIES, UNPROVIDED);
            SubLObject request = user_interaction_agenda.make_ui_request(interaction, $SHOW, list($PATTERN, pattern, $SEARCH_TYPE, search_type, $RESULT_PAGE_NUM, result_page_num, $MATCHING_INDEX_ENTRIES, matching_index_entries));
            return request;
        }
    }

    public static final SubLObject uiat_lexicon_search_handle_reply(SubLObject reply) {
        {
            SubLObject datum = reply;
            SubLObject current = datum;
            SubLObject operator = NIL;
            SubLObject action_type = NIL;
            SubLObject temp_plist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt14);
            operator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt14);
            action_type = current.first();
            current = current.rest();
            temp_plist = current;
            {
                SubLObject signature = getf(temp_plist, $SIGNATURE, UNPROVIDED);
                SubLObject agenda_signature = getf(temp_plist, $AGENDA_SIGNATURE, UNPROVIDED);
                SubLObject plist = remf(remf(copy_list(temp_plist), $SIGNATURE), $AGENDA_SIGNATURE);
                SubLObject interaction = (NIL != signature) ? ((SubLObject) (user_interaction_agenda.find_ui_by_signature(signature))) : NIL;
                SubLObject v_agenda = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_agenda(interaction))) : user_interaction_agenda.find_uia_by_signature(agenda_signature);
                SubLObject pcase_var = action_type;
                if (pcase_var.eql($GOTO_PAGE)) {
                    {
                        SubLObject datum_68 = plist;
                        SubLObject current_69 = datum_68;
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current_69;
                        SubLObject bad = NIL;
                        SubLObject current_70 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum_68, $list_alt286);
                            current_70 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum_68, $list_alt286);
                            if (NIL == member(current_70, $list_alt287, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_70 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum_68, $list_alt286);
                        }
                        {
                            SubLObject goto_page_num_tail = property_list_member($GOTO_PAGE_NUM, current_69);
                            SubLObject goto_page_num = (NIL != goto_page_num_tail) ? ((SubLObject) (cadr(goto_page_num_tail))) : ZERO_INTEGER;
                            user_interaction_agenda.ui_state_update(interaction, $RESULT_PAGE_NUM, goto_page_num);
                        }
                    }
                    make_lexicon_search_show_request(interaction);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list ; filters @xref nl-trie-matching-phrases to include just the phrases for terms relevant to AGENDA and accessible via the lexical interaction mt
     */
    public static final SubLObject uia_matching_phrases(SubLObject v_agenda, SubLObject pattern, SubLObject search_type) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = nl_trie_accessors.nl_trie_matching_phrases(pattern, search_type);
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != uia_suitable_phrase_index_entry(v_agenda, item)) {
                    result = cons(item, result);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @return boolean ; whether INDEX-ENTRY should be included in the display
     */
    public static final SubLObject uia_suitable_phrase_index_entry(SubLObject v_agenda, SubLObject index_entry) {
        {
            SubLObject ok = NIL;
            SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
            ok = makeBoolean((NIL == uia_trampolines.uia_irrelevant_termP(v_agenda, nl_trie_accessors.nl_trie_index_item_term(index_entry), UNPROVIDED)) && (NIL != lexicon_accessors.genl_lexicon_mtP(lexical_interaction_mt, nl_trie_accessors.nl_trie_index_item_mt(index_entry))));
            return ok;
        }
    }

    /**
     *
     *
     * @return string ; textual description of SEARCH-TYPE
     */
    public static final SubLObject uiat_search_type_description(SubLObject search_type) {
        {
            SubLObject pcase_var = search_type;
            if (pcase_var.eql($PREFIX)) {
                return $$$at_the_beginning;
            } else
                if (pcase_var.eql($SUFFIX)) {
                    return $$$at_the_end;
                } else
                    if (pcase_var.eql($INFIX)) {
                        return $$$somewhere;
                    }


        }
        return NIL;
    }

    public static final SubLObject declare_uia_tools_browsing_file() {
        declareFunction("uia_act_new_concept_clarifier", "UIA-ACT-NEW-CONCEPT-CLARIFIER", 3, 0, false);
        declareFunction("uiat_concept_clarifier_hint", "UIAT-CONCEPT-CLARIFIER-HINT", 1, 0, false);
        declareFunction("uiat_concept_clarifier_generate_request", "UIAT-CONCEPT-CLARIFIER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_clarifier_compute_highlight_state", "UIAT-CONCEPT-CLARIFIER-COMPUTE-HIGHLIGHT-STATE", 2, 0, false);
        declareFunction("uiat_concept_clarifier_handle_reply", "UIAT-CONCEPT-CLARIFIER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_term_alternative_phrases", "UIA-TERM-ALTERNATIVE-PHRASES", 2, 0, false);
        declareFunction("is_sme_term_in_interactionP", "IS-SME-TERM-IN-INTERACTION?", 2, 0, false);
        declareFunction("uiat_concept_clarifier_compute_good_examples", "UIAT-CONCEPT-CLARIFIER-COMPUTE-GOOD-EXAMPLES", 2, 0, false);
        declareFunction("uia_act_new_sentence_clarifier", "UIA-ACT-NEW-SENTENCE-CLARIFIER", 3, 1, false);
        declareFunction("uiat_sentence_clarifier_hint", "UIAT-SENTENCE-CLARIFIER-HINT", 1, 0, false);
        declareFunction("uiat_sentence_clarifier_generate_request", "UIAT-SENTENCE-CLARIFIER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_instantiate_variables", "UIAT-INSTANTIATE-VARIABLES", 2, 0, false);
        declareFunction("uiat_salient_term_isa", "UIAT-SALIENT-TERM-ISA", 4, 0, false);
        declareFunction("uiat_salient_isa_for_argnum", "UIAT-SALIENT-ISA-FOR-ARGNUM", 3, 0, false);
        declareFunction("uiat_sentence_clarifier_handle_reply", "UIAT-SENTENCE-CLARIFIER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_justification_browser", "UIA-ACT-NEW-JUSTIFICATION-BROWSER", 3, 0, false);
        declareFunction("uiat_justification_browser_hint", "UIAT-JUSTIFICATION-BROWSER-HINT", 1, 0, false);
        declareFunction("uiat_justification_browser_finalize", "UIAT-JUSTIFICATION-BROWSER-FINALIZE", 1, 0, false);
        declareFunction("uiat_justification_browser_generate_request", "UIAT-JUSTIFICATION-BROWSER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_justification_browser_handle_reply", "UIAT-JUSTIFICATION-BROWSER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_sentence_variations", "UIA-ACT-NEW-SENTENCE-VARIATIONS", 3, 0, false);
        declareFunction("uiat_sentence_variations_generate_request", "UIAT-SENTENCE-VARIATIONS-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_sentence_variations", "UIAT-SENTENCE-VARIATIONS", 2, 0, false);
        declareFunction("uiat_sentence_variations_sort", "UIAT-SENTENCE-VARIATIONS-SORT", 2, 0, false);
        declareFunction("uiat_sentence_variations_sort_key", "UIAT-SENTENCE-VARIATIONS-SORT-KEY", 1, 0, false);
        declareFunction("sequence_length_L", "SEQUENCE-LENGTH-<", 2, 0, false);
        declareFunction("uia_act_new_domain_examples", "UIA-ACT-NEW-DOMAIN-EXAMPLES", 2, 0, false);
        declareFunction("uiat_domain_examples_hint", "UIAT-DOMAIN-EXAMPLES-HINT", 1, 0, false);
        declareFunction("uiat_domain_examples_child_completed", "UIAT-DOMAIN-EXAMPLES-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_domain_examples_child_rejected", "UIAT-DOMAIN-EXAMPLES-CHILD-REJECTED", 2, 0, false);
        declareFunction("uiat_domain_examples_generate_request", "UIAT-DOMAIN-EXAMPLES-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_domain_examples_handle_reply", "UIAT-DOMAIN-EXAMPLES-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_domain_examples_initialized", "UIAT-DOMAIN-EXAMPLES-INITIALIZED", 1, 0, false);
        declareFunction("uiat_domain_examples_initialize", "UIAT-DOMAIN-EXAMPLES-INITIALIZE", 1, 0, false);
        declareFunction("uiat_domain_examples_all_sentences", "UIAT-DOMAIN-EXAMPLES-ALL-SENTENCES", 1, 0, false);
        declareFunction("uiat_domain_examples_sort_method_table", "UIAT-DOMAIN-EXAMPLES-SORT-METHOD-TABLE", 0, 0, false);
        declareFunction("uiat_domain_examples_default_sort_method", "UIAT-DOMAIN-EXAMPLES-DEFAULT-SORT-METHOD", 0, 0, false);
        declareFunction("uiat_domain_examples_sentence_sections", "UIAT-DOMAIN-EXAMPLES-SENTENCE-SECTIONS", 4, 0, false);
        declareFunction("uiat_domain_examples_predicate_sections_to_sentence_sections", "UIAT-DOMAIN-EXAMPLES-PREDICATE-SECTIONS-TO-SENTENCE-SECTIONS", 2, 0, false);
        declareFunction("uiat_domain_examples_interpret_predicate_info", "UIAT-DOMAIN-EXAMPLES-INTERPRET-PREDICATE-INFO", 2, 0, false);
        declareFunction("uia_organize_predicates_by_topical_utility", "UIA-ORGANIZE-PREDICATES-BY-TOPICAL-UTILITY", 2, 0, false);
        declareFunction("uia_organize_predicates_by_general_utility", "UIA-ORGANIZE-PREDICATES-BY-GENERAL-UTILITY", 2, 0, false);
        declareFunction("sectionize_list_by_percent_thresholds", "SECTIONIZE-LIST-BY-PERCENT-THRESHOLDS", 2, 0, false);
        declareFunction("uia_organize_predicates_by_closeness", "UIA-ORGANIZE-PREDICATES-BY-CLOSENESS", 3, 0, false);
        declareFunction("uia_organize_predicates_alphabetically", "UIA-ORGANIZE-PREDICATES-ALPHABETICALLY", 2, 0, false);
        declareFunction("uia_predicate_topical_utility", "UIA-PREDICATE-TOPICAL-UTILITY", 2, 1, false);
        declareFunction("uia_act_new_knowledge_scrapbook", "UIA-ACT-NEW-KNOWLEDGE-SCRAPBOOK", 2, 0, false);
        declareFunction("uiat_knowledge_scrapbook_child_completed", "UIAT-KNOWLEDGE-SCRAPBOOK-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_knowledge_scrapbook_generate_request", "UIAT-KNOWLEDGE-SCRAPBOOK-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_kescrap_constructor", "UIAT-KESCRAP-CONSTRUCTOR", 2, 0, false);
        declareFunction("uiat_knowledge_scrapbook_handle_reply", "UIAT-KNOWLEDGE-SCRAPBOOK-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_kescrap_handle_add_new_reply", "UIAT-KESCRAP-HANDLE-ADD-NEW-REPLY", 3, 0, false);
        declareFunction("uiat_kescrap_handle_drop_reply", "UIAT-KESCRAP-HANDLE-DROP-REPLY", 3, 0, false);
        declareFunction("uiat_kescrap_load", "UIAT-KESCRAP-LOAD", 2, 0, false);
        declareFunction("uiat_kescrap_save", "UIAT-KESCRAP-SAVE", 2, 0, false);
        declareFunction("uia_add_to_scrap_book", "UIA-ADD-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("uia_rem_from_scrap_book", "UIA-REM-FROM-SCRAP-BOOK", 2, 0, false);
        declareFunction("uia_get_scrap_book_terms", "UIA-GET-SCRAP-BOOK-TERMS", 1, 0, false);
        declareFunction("uia_get_scrap_book_assertions", "UIA-GET-SCRAP-BOOK-ASSERTIONS", 1, 0, false);
        declareFunction("uia_get_scrap_book_sentences", "UIA-GET-SCRAP-BOOK-SENTENCES", 1, 0, false);
        declareFunction("scrap_book_print_function_trampoline", "SCRAP-BOOK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("scrap_book_p", "SCRAP-BOOK-P", 1, 0, false);
        new uia_tools_browsing.$scrap_book_p$UnaryFunction();
        declareFunction("scrap_book_terms", "SCRAP-BOOK-TERMS", 1, 0, false);
        declareFunction("scrap_book_assertions", "SCRAP-BOOK-ASSERTIONS", 1, 0, false);
        declareFunction("scrap_book_sentences", "SCRAP-BOOK-SENTENCES", 1, 0, false);
        declareFunction("_csetf_scrap_book_terms", "_CSETF-SCRAP-BOOK-TERMS", 2, 0, false);
        declareFunction("_csetf_scrap_book_assertions", "_CSETF-SCRAP-BOOK-ASSERTIONS", 2, 0, false);
        declareFunction("_csetf_scrap_book_sentences", "_CSETF-SCRAP-BOOK-SENTENCES", 2, 0, false);
        declareFunction("make_scrap_book", "MAKE-SCRAP-BOOK", 0, 1, false);
        declareFunction("new_scrap_book", "NEW-SCRAP-BOOK", 0, 0, false);
        declareFunction("add_term_to_scrap_book", "ADD-TERM-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("add_assertion_to_scrap_book", "ADD-ASSERTION-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("add_sentence_to_scrap_book", "ADD-SENTENCE-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("rem_term_from_scrap_book", "REM-TERM-FROM-SCRAP-BOOK", 2, 0, false);
        declareFunction("rem_assertion_from_scrap_book", "REM-ASSERTION-FROM-SCRAP-BOOK", 2, 0, false);
        declareFunction("rem_sentence_from_scrap_book", "REM-SENTENCE-FROM-SCRAP-BOOK", 2, 0, false);
        declareFunction("rem_from_scrap_book", "REM-FROM-SCRAP-BOOK", 2, 0, false);
        declareFunction("add_to_scrap_book", "ADD-TO-SCRAP-BOOK", 2, 0, false);
        declareFunction("uia_act_new_ontology_browser", "UIA-ACT-NEW-ONTOLOGY-BROWSER", 2, 2, false);
        declareFunction("uia_act_new_focused_ontology_browser", "UIA-ACT-NEW-FOCUSED-ONTOLOGY-BROWSER", 2, 2, false);
        declareFunction("uia_ontology_browser_generate_request", "UIA-ONTOLOGY-BROWSER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uia_ontology_browser_handle_reply", "UIA-ONTOLOGY-BROWSER-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_ontology_browser_child_completed", "UIA-ONTOLOGY-BROWSER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_ontology_browser_example_terms", "UIA-ONTOLOGY-BROWSER-EXAMPLE-TERMS", 1, 0, false);
        declareFunction("uia_ontology_browser_domain_example_terms", "UIA-ONTOLOGY-BROWSER-DOMAIN-EXAMPLE-TERMS", 1, 0, false);
        declareFunction("uia_ontology_browser_domain_example_terms_memoized_internal", "UIA-ONTOLOGY-BROWSER-DOMAIN-EXAMPLE-TERMS-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("uia_ontology_browser_domain_example_terms_memoized", "UIA-ONTOLOGY-BROWSER-DOMAIN-EXAMPLE-TERMS-MEMOIZED", 1, 0, false);
        declareFunction("uia_ontology_browser_gather_term_connections", "UIA-ONTOLOGY-BROWSER-GATHER-TERM-CONNECTIONS", 2, 0, false);
        declareFunction("uia_ontology_browser_irrelevant_connectionP", "UIA-ONTOLOGY-BROWSER-IRRELEVANT-CONNECTION?", 2, 0, false);
        declareFunction("uia_act_new_concept_recognizer", "UIA-ACT-NEW-CONCEPT-RECOGNIZER", 3, 1, false);
        declareFunction("uiat_concept_recognizer_hint", "UIAT-CONCEPT-RECOGNIZER-HINT", 1, 0, false);
        declareFunction("uiat_concept_recognizer_generate_request", "UIAT-CONCEPT-RECOGNIZER-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_recognizer_child_completed", "UIAT-CONCEPT-RECOGNIZER-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uia_act_new_asserted_sentences", "UIA-ACT-NEW-ASSERTED-SENTENCES", 3, 1, false);
        declareFunction("uiat_asserted_sentences_hint", "UIAT-ASSERTED-SENTENCES-HINT", 1, 0, false);
        declareFunction("uiat_asserted_sentences_generate_request", "UIAT-ASSERTED-SENTENCES-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_asserted_sentences_child_completed", "UIAT-ASSERTED-SENTENCES-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_asserted_sentences_handle_reply", "UIAT-ASSERTED-SENTENCES-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_asserted_sentences_thinking", "UIAT-ASSERTED-SENTENCES-THINKING", 2, 0, false);
        declareFunction("uiat_asserted_sentences_maybe_find_assertion_from_mt", "UIAT-ASSERTED-SENTENCES-MAYBE-FIND-ASSERTION-FROM-MT", 1, 1, false);
        declareFunction("group_sentences_by_mt", "GROUP-SENTENCES-BY-MT", 1, 0, false);
        declareFunction("group_assertions_by_mt", "GROUP-ASSERTIONS-BY-MT", 1, 0, false);
        declareFunction("uia_act_new_concept_comparator", "UIA-ACT-NEW-CONCEPT-COMPARATOR", 4, 2, false);
        declareFunction("uiat_concept_comparator_hint", "UIAT-CONCEPT-COMPARATOR-HINT", 1, 0, false);
        declareFunction("uiat_concept_comparator_generate_request", "UIAT-CONCEPT-COMPARATOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_concept_comparator_child_completed", "UIAT-CONCEPT-COMPARATOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_concept_comparator_handle_reply", "UIAT-CONCEPT-COMPARATOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_relationship_suggestor", "UIA-ACT-NEW-RELATIONSHIP-SUGGESTOR", 4, 2, false);
        declareFunction("uiat_relationship_suggestor_hint", "UIAT-RELATIONSHIP-SUGGESTOR-HINT", 1, 0, false);
        declareFunction("uiat_relationship_suggestor_child_completed", "UIAT-RELATIONSHIP-SUGGESTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_relationship_suggestor_generate_request", "UIAT-RELATIONSHIP-SUGGESTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_relationship_suggestor_handle_reply", "UIAT-RELATIONSHIP-SUGGESTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_act_new_predicate_suggestor", "UIA-ACT-NEW-PREDICATE-SUGGESTOR", 3, 2, false);
        declareFunction("uiat_predicate_suggestor_hint", "UIAT-PREDICATE-SUGGESTOR-HINT", 1, 0, false);
        declareFunction("uiat_predicate_suggestor_child_completed", "UIAT-PREDICATE-SUGGESTOR-CHILD-COMPLETED", 2, 0, false);
        declareFunction("uiat_predicate_suggestor_generate_request", "UIAT-PREDICATE-SUGGESTOR-GENERATE-REQUEST", 1, 0, false);
        declareFunction("uiat_predicate_suggestor_handle_reply", "UIAT-PREDICATE-SUGGESTOR-HANDLE-REPLY", 1, 0, false);
        declareFunction("uiat_predicate_suggestor_sections", "UIAT-PREDICATE-SUGGESTOR-SECTIONS", 2, 1, false);
        declareFunction("uia_predicate_suggestor_matches", "UIA-PREDICATE-SUGGESTOR-MATCHES", 2, 1, false);
        declareFunction("uia_predicate_suggestor_matches_memoized_internal", "UIA-PREDICATE-SUGGESTOR-MATCHES-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("uia_predicate_suggestor_matches_memoized", "UIA-PREDICATE-SUGGESTOR-MATCHES-MEMOIZED", 3, 0, false);
        declareFunction("uia_act_new_lexicon_search", "UIA-ACT-NEW-LEXICON-SEARCH", 4, 0, false);
        declareFunction("uiat_lexicon_search_hint", "UIAT-LEXICON-SEARCH-HINT", 1, 0, false);
        declareFunction("uiat_lexicon_search_generate_request", "UIAT-LEXICON-SEARCH-GENERATE-REQUEST", 1, 0, false);
        declareFunction("make_lexicon_search_show_request", "MAKE-LEXICON-SEARCH-SHOW-REQUEST", 1, 0, false);
        declareFunction("uiat_lexicon_search_handle_reply", "UIAT-LEXICON-SEARCH-HANDLE-REPLY", 1, 0, false);
        declareFunction("uia_matching_phrases", "UIA-MATCHING-PHRASES", 3, 0, false);
        declareFunction("uia_suitable_phrase_index_entry", "UIA-SUITABLE-PHRASE-INDEX-ENTRY", 2, 0, false);
        declareFunction("uiat_search_type_description", "UIAT-SEARCH-TYPE-DESCRIPTION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_tools_browsing_file() {
        defparameter("*UIAT-SENTENCE-VARIATIONS-SORT-AGENDA*", NIL);
        deflexical("*UIAT-DOMAIN-EXAMPLES-SORT-METHOD-TABLE*", $list_alt93);
        deflexical("*PREDICATE-UTILITY-SECTION-MAP*", $list_alt106);
        defconstant("*DTP-SCRAP-BOOK*", SCRAP_BOOK);
        deflexical("*UIA-ONTOLOGY-BROWSER-EXAMPLE-TERMS*", $list_alt211);
        deflexical("*UIA-LEXICON-SEARCH-DISPLAY-INCREMENT*", TWENTY_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_uia_tools_browsing_file() {
                uia_tool_declaration.declare_uia_tool($CONCEPT_CLARIFIER, $list_alt1);
        uia_tool_declaration.declare_uia_tool($SENTENCE_CLARIFIER, $list_alt24);
        uia_tool_declaration.declare_uia_tool($JUSTIFICATION_BROWSER, $list_alt49);
        uia_tool_declaration.declare_uia_tool($SENTENCE_VARIATIONS, $list_alt56);
        uia_tool_declaration.declare_uia_tool($DOMAIN_EXAMPLES, $list_alt63);
        uia_tool_declaration.declare_uia_tool($KNOWLEDGE_SCRAPBOOK, $list_alt115);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_scrap_book$.getGlobalValue(), symbol_function(SCRAP_BOOK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SCRAP_BOOK_TERMS, _CSETF_SCRAP_BOOK_TERMS);
        def_csetf(SCRAP_BOOK_ASSERTIONS, _CSETF_SCRAP_BOOK_ASSERTIONS);
        def_csetf(SCRAP_BOOK_SENTENCES, _CSETF_SCRAP_BOOK_SENTENCES);
        identity(SCRAP_BOOK);
        uia_tool_declaration.declare_uia_tool($ONTOLOGY_BROWSER, $list_alt169);
        memoization_state.note_memoized_function(UIA_ONTOLOGY_BROWSER_DOMAIN_EXAMPLE_TERMS_MEMOIZED);
        uia_tool_declaration.declare_uia_tool($CONCEPT_RECOGNIZER, $list_alt224);
        uia_tool_declaration.declare_uia_tool($ASSERTED_SENTENCES, $list_alt236);
        uia_tool_declaration.declare_uia_tool($CONCEPT_COMPARATOR, $list_alt251);
        uia_tool_declaration.declare_uia_tool($RELATIONSHIP_SUGGESTOR, $list_alt266);
        uia_tool_declaration.declare_uia_tool($PREDICATE_SUGGESTOR, $list_alt269);
        memoization_state.note_memoized_function(UIA_PREDICATE_SUGGESTOR_MATCHES_MEMOIZED);
        uia_tool_declaration.declare_uia_tool($LEXICON_SEARCH, $list_alt277);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $CONCEPT_CLARIFIER = makeKeyword("CONCEPT-CLARIFIER");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ $NAME, makeString("Concept Clarifier"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-CLARIFIER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-CLARIFIER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONCEPT-CLARIFIER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptClarifierTool")), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING")) });

    static private final SubLList $list_alt2 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt3$Clarify____A = makeString("Clarify : ~A");





    private static final SubLSymbol $CLARIFYING_SENTENCES = makeKeyword("CLARIFYING-SENTENCES");

    private static final SubLSymbol $IS_SME_TERM = makeKeyword("IS-SME-TERM");



    private static final SubLSymbol $ALT_PHRASES = makeKeyword("ALT-PHRASES");

    private static final SubLSymbol $HIGHLIGHT = makeKeyword("HIGHLIGHT");





    public static final SubLObject $$CoaDiagramObject = constant_handles.reader_make_constant_shell(makeString("CoaDiagramObject"));

    static private final SubLList $list_alt14 = listS(makeUninternedSymbol("OPERATOR"), makeSymbol("ACTION-TYPE"), makeUninternedSymbol("TEMP-PLIST"));





    private static final SubLSymbol $LAUNCH = makeKeyword("LAUNCH");

    static private final SubLList $list_alt18 = list(makeSymbol("&KEY"), makeSymbol("TERM"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt19 = list($TERM, $MODE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $SENTENCE_CLARIFIER = makeKeyword("SENTENCE-CLARIFIER");

    static private final SubLList $list_alt24 = list(new SubLObject[]{ $NAME, makeString("Sentence Clarifier"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-SENTENCE-CLARIFIER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SENTENCE-CLARIFIER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SENTENCE-CLARIFIER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertionClarifierTool")), makeKeyword("FEATURES"), list(makeKeyword("SENTENCE-BROWSING")) });







    static private final SubLString $str_alt28$Sentence_Clarifier_called_with_an = makeString("Sentence Clarifier called with an assertion object -- converting.~%");

    static private final SubLList $list_alt29 = list(makeSymbol("SENTENCE"), makeSymbol("FORCE"), makeSymbol("&OPTIONAL"), makeSymbol("ASSERTION"));

    static private final SubLList $list_alt30 = list(makeSymbol("CYCL-SENTENCE"), makeSymbol("FORCE"), makeSymbol("&OPTIONAL"), makeSymbol("ASSERTION"));

    private static final SubLSymbol $SHOW_QUESTION = makeKeyword("SHOW-QUESTION");



    private static final SubLSymbol $NO_VARS = makeKeyword("NO-VARS");

    private static final SubLSymbol $TERM_PHRASE_MAPPINGS = makeKeyword("TERM-PHRASE-MAPPINGS");



    private static final SubLSymbol $SHOW_GAF = makeKeyword("SHOW-GAF");



    private static final SubLSymbol $UNASSERTIBLE = makeKeyword("UNASSERTIBLE");





    private static final SubLSymbol $SHOW_RULE = makeKeyword("SHOW-RULE");



    public static final SubLObject $$SomeExampleFn = constant_handles.reader_make_constant_shell(makeString("SomeExampleFn"));



    static private final SubLList $list_alt45 = list(makeSymbol("&KEY"), makeSymbol("SENTENCE"), list(makeSymbol("FORCE"), makeKeyword("DECLARATIVE")), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt46 = list(makeKeyword("SENTENCE"), makeKeyword("FORCE"), $MODE);



    private static final SubLSymbol $JUSTIFICATION_BROWSER = makeKeyword("JUSTIFICATION-BROWSER");

    static private final SubLList $list_alt49 = list(new SubLObject[]{ $NAME, makeString("Justification Browser"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-JUSTIFICATION-BROWSER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-JUSTIFICATION-BROWSER-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-JUSTIFICATION-BROWSER-HANDLE-REPLY"), makeKeyword("FINALIZE-METHOD"), makeSymbol("UIAT-JUSTIFICATION-BROWSER-FINALIZE") });

    static private final SubLList $list_alt50 = list(makeSymbol("INFERENCE-ANSWER"));

    static private final SubLString $str_alt51$Justification____A = makeString("Justification : ~A");



    static private final SubLList $list_alt53 = list(makeSymbol("&KEY"), makeSymbol("INFERENCE-ANSWER"));

    static private final SubLList $list_alt54 = list(makeKeyword("INFERENCE-ANSWER"));

    private static final SubLSymbol $SENTENCE_VARIATIONS = makeKeyword("SENTENCE-VARIATIONS");

    static private final SubLList $list_alt56 = list($NAME, makeString("Sentence Variations"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-SENTENCE-VARIATIONS-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-SENTENCE-VARIATIONS-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycSentenceVariationsTool")));

    static private final SubLList $list_alt57 = list(makeSymbol("SENTENCE"));

    private static final SubLSymbol $VARIATIONS = makeKeyword("VARIATIONS");

    static private final SubLSymbol $sym59$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol UIAT_SENTENCE_VARIATIONS_SORT_KEY = makeSymbol("UIAT-SENTENCE-VARIATIONS-SORT-KEY");

    static private final SubLSymbol $sym61$SEQUENCE_LENGTH__ = makeSymbol("SEQUENCE-LENGTH-<");

    private static final SubLSymbol $DOMAIN_EXAMPLES = makeKeyword("DOMAIN-EXAMPLES");

    static private final SubLList $list_alt63 = list(new SubLObject[]{ $NAME, makeString("Domain Examples"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-DOMAIN-EXAMPLES-HINT"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-DOMAIN-EXAMPLES-CHILD-COMPLETED"), makeKeyword("CHILD-REJECTED-METHOD"), makeSymbol("UIAT-DOMAIN-EXAMPLES-CHILD-REJECTED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-DOMAIN-EXAMPLES-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-DOMAIN-EXAMPLES-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycDomainExamplesTool")), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING"), makeKeyword("SENTENCE-BROWSING")) });

    private static final SubLSymbol $SORT_METHOD = makeKeyword("SORT-METHOD");





    static private final SubLString $$$Examples = makeString("Examples");

    static private final SubLString $str_alt68$Examples____A = makeString("Examples : ~A");

    private static final SubLSymbol $CONCEPT_DISAMBIGUATOR = makeKeyword("CONCEPT-DISAMBIGUATOR");



    private static final SubLSymbol UIAT_DOMAIN_EXAMPLES_INITIALIZE = makeSymbol("UIAT-DOMAIN-EXAMPLES-INITIALIZE");



    private static final SubLSymbol $DOMAIN_EXAMPLE_SPECPRED_GRAPH_COUNT = makeKeyword("DOMAIN-EXAMPLE-SPECPRED-GRAPH-COUNT");

    private static final SubLSymbol $SENTENCE_SECTIONS = makeKeyword("SENTENCE-SECTIONS");

    private static final SubLSymbol $SUBGRAPHS = makeKeyword("SUBGRAPHS");



    static private final SubLList $list_alt77 = list(makeSymbol("&KEY"), makeSymbol("SAMPLE-SENTENCE"), makeSymbol("FILTER-TERM"), makeSymbol("FILTER-PHRASE"), makeSymbol("SORT-METHOD"));

    static private final SubLList $list_alt78 = list(makeKeyword("SAMPLE-SENTENCE"), makeKeyword("FILTER-TERM"), makeKeyword("FILTER-PHRASE"), makeKeyword("SORT-METHOD"));

    private static final SubLSymbol $FILTER_PHRASE = makeKeyword("FILTER-PHRASE");

    static private final SubLString $str_alt80$Computing_example_predicates_ = makeString("Computing example predicates.");

    static private final SubLString $str_alt81$Grouping_general_and_specific_pre = makeString("Grouping general and specific predicates.");

    private static final SubLSymbol $DOMAIN_EXAMPLE_SPECPRED_GRAPH = makeKeyword("DOMAIN-EXAMPLE-SPECPRED-GRAPH");

    private static final SubLSymbol $DOMAIN_EXAMPLE_SPECPRED_ORPHANS = makeKeyword("DOMAIN-EXAMPLE-SPECPRED-ORPHANS");

    static private final SubLString $str_alt84$Computing_topical_utility_of_pred = makeString("Computing topical utility of predicates.");

    static private final SubLString $str_alt85$Computing_general_utility_of_pred = makeString("Computing general utility of predicates.");

    static private final SubLString $str_alt86$Computing_specificity_of_predicat = makeString("Computing specificity of predicates.");

    static private final SubLString $str_alt87$Computing_topical_relevance_of_pr = makeString("Computing topical relevance of predicates.");

    static private final SubLString $str_alt88$Computing_similarity_of_predicate = makeString("Computing similarity of predicates.");

    static private final SubLString $str_alt89$Computing_example_sentences_for_p = makeString("Computing example sentences for predicates.");

    static private final SubLString $str_alt90$Determining_which_example_sentenc = makeString("Determining which example sentences have variations.");

    static private final SubLString $str_alt91$Translating_example_sentences_ = makeString("Translating example sentences.");

    static private final SubLString $str_alt92$Computing_predicate_indicators_ = makeString("Computing predicate indicators.");

    static private final SubLList $list_alt93 = list(list(makeKeyword("TOPICAL-UTILITY"), makeString("by topical utility")), list(makeKeyword("GENERAL-UTILITY"), makeString("by general utility")), list(makeKeyword("CLOSENESS"), makeString("by closeness to this sentence")), list(makeKeyword("SPECIFICITY"), makeString("by specificity")), list(makeKeyword("MT-RELEVANCE"), makeString("by topical relevance")), list(makeKeyword("SIMILARITY"), makeString("by similarity")), list(makeKeyword("ALPHABETICALLY"), makeString("alphabetically")), list(makeKeyword("RANDOMLY"), makeString("in random order")));

    static private final SubLList $list_alt94 = cons(makeSymbol("DEFAULT-SORT-METHOD"), makeSymbol("REST"));

    private static final SubLSymbol $TOPICAL_UTILITY = makeKeyword("TOPICAL-UTILITY");

    private static final SubLSymbol $GENERAL_UTILITY = makeKeyword("GENERAL-UTILITY");

    private static final SubLSymbol $CLOSENESS = makeKeyword("CLOSENESS");

    static private final SubLString $str_alt98$ = makeString("");

    private static final SubLSymbol $SPECIFICITY = makeKeyword("SPECIFICITY");

    private static final SubLSymbol $MT_RELEVANCE = makeKeyword("MT-RELEVANCE");



    private static final SubLSymbol $ALPHABETICALLY = makeKeyword("ALPHABETICALLY");

    private static final SubLSymbol $RANDOMLY = makeKeyword("RANDOMLY");

    static private final SubLList $list_alt104 = list(makeSymbol("SECTION-KEY"), makeSymbol("PREDICATES"));

    static private final SubLList $list_alt105 = list(makeSymbol("NODE"), makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), makeSymbol("SPECS"));

    static private final SubLList $list_alt106 = list(list(FIVE_INTEGER, makeString("Used very frequently")), list(TEN_INTEGER, makeString("Used frequently")), list(TWENTY_INTEGER, makeString("Used occasionally")), list(makeInteger(100), makeString("Used infrequently")));

    static private final SubLSymbol $sym107$_ = makeSymbol(">");











    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $KNOWLEDGE_SCRAPBOOK = makeKeyword("KNOWLEDGE-SCRAPBOOK");

    static private final SubLList $list_alt115 = list(new SubLObject[]{ $NAME, makeString("My Scrapbook"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-KNOWLEDGE-SCRAPBOOK-CHILD-COMPLETED"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-KNOWLEDGE-SCRAPBOOK-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-KNOWLEDGE-SCRAPBOOK-HANDLE-REPLY"), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING"), makeKeyword("SENTENCE-BROWSING")) });

    private static final SubLSymbol $ASSERTION_CREATOR = makeKeyword("ASSERTION-CREATOR");

    private static final SubLSymbol $ENTITY_TYPE = makeKeyword("ENTITY-TYPE");



    private static final SubLSymbol $SENTENCE_READER = makeKeyword("SENTENCE-READER");

    private static final SubLSymbol $FILE_BROWSER = makeKeyword("FILE-BROWSER");

    static private final SubLList $list_alt121 = list(makeSymbol("FILE-BROWSER"));









    private static final SubLSymbol $CRUMB_TERMS = makeKeyword("CRUMB-TERMS");

    private static final SubLSymbol $CRUMB_ASSERTIONS = makeKeyword("CRUMB-ASSERTIONS");

    private static final SubLSymbol $SELECT_TERMS = makeKeyword("SELECT-TERMS");

    private static final SubLSymbol $SELECT_SENTENCES = makeKeyword("SELECT-SENTENCES");

    private static final SubLSymbol $ADD_NEW = makeKeyword("ADD-NEW");

    static private final SubLList $list_alt132 = list(makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("PHRASE"));

    static private final SubLList $list_alt133 = list($TYPE, makeKeyword("PHRASE"));







    static private final SubLList $list_alt137 = list(makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ENTITY"));

    static private final SubLList $list_alt138 = list($TYPE, makeKeyword("ENTITY"));

    private static final SubLSymbol $ENTITY = makeKeyword("ENTITY");



    static private final SubLList $list_alt141 = list(makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ID"));

    static private final SubLList $list_alt142 = list($TYPE, makeKeyword("ID"));



    static private final SubLString $str_alt144$_ = makeString(".");



    private static final SubLSymbol $SCRAPBOOK = makeKeyword("SCRAPBOOK");



    static private final SubLString $str_alt148$Unable_to_open__S = makeString("Unable to open ~S");





    static private final SubLString $str_alt151$___KE_Scrapbook_____Saved____A = makeString(";; KE Scrapbook~%;; Saved : ~A");

    static private final SubLString $str_alt152$___S = makeString("~%~S");

    private static final SubLSymbol SCRAP_BOOK = makeSymbol("SCRAP-BOOK");

    private static final SubLSymbol SCRAP_BOOK_P = makeSymbol("SCRAP-BOOK-P");

    static private final SubLList $list_alt155 = list(makeSymbol("TERMS"), makeSymbol("ASSERTIONS"), makeSymbol("SENTENCES"));

    static private final SubLList $list_alt156 = list(makeKeyword("TERMS"), makeKeyword("ASSERTIONS"), makeKeyword("SENTENCES"));

    static private final SubLList $list_alt157 = list(makeSymbol("SCRAP-BOOK-TERMS"), makeSymbol("SCRAP-BOOK-ASSERTIONS"), makeSymbol("SCRAP-BOOK-SENTENCES"));

    static private final SubLList $list_alt158 = list(makeSymbol("_CSETF-SCRAP-BOOK-TERMS"), makeSymbol("_CSETF-SCRAP-BOOK-ASSERTIONS"), makeSymbol("_CSETF-SCRAP-BOOK-SENTENCES"));



    private static final SubLSymbol SCRAP_BOOK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SCRAP-BOOK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol SCRAP_BOOK_TERMS = makeSymbol("SCRAP-BOOK-TERMS");

    public static final SubLSymbol _CSETF_SCRAP_BOOK_TERMS = makeSymbol("_CSETF-SCRAP-BOOK-TERMS");

    private static final SubLSymbol SCRAP_BOOK_ASSERTIONS = makeSymbol("SCRAP-BOOK-ASSERTIONS");

    public static final SubLSymbol _CSETF_SCRAP_BOOK_ASSERTIONS = makeSymbol("_CSETF-SCRAP-BOOK-ASSERTIONS");

    private static final SubLSymbol SCRAP_BOOK_SENTENCES = makeSymbol("SCRAP-BOOK-SENTENCES");

    public static final SubLSymbol _CSETF_SCRAP_BOOK_SENTENCES = makeSymbol("_CSETF-SCRAP-BOOK-SENTENCES");

    static private final SubLString $str_alt167$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");

    static private final SubLList $list_alt169 = list(new SubLObject[]{ $NAME, makeString("Ontology Browser"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIA-ONTOLOGY-BROWSER-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIA-ONTOLOGY-BROWSER-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIA-ONTOLOGY-BROWSER-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycUIAOntologyBrowser")), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING")) });



    private static final SubLSymbol $GENERAL_EXAMPLES = makeKeyword("GENERAL-EXAMPLES");

    private static final SubLSymbol $SME_TERM = makeKeyword("SME-TERM");

    private static final SubLSymbol $HELP_TEXT = makeKeyword("HELP-TEXT");

    private static final SubLSymbol $SUMMARY_SENTENCE = makeKeyword("SUMMARY-SENTENCE");

    private static final SubLSymbol $TERM_RELATIONS = makeKeyword("TERM-RELATIONS");

    static private final SubLList $list_alt176 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("FOCUSED-INTERACTION"));

    static private final SubLList $list_alt177 = list($TERM, makeKeyword("FOCUSED-INTERACTION"));



    private static final SubLSymbol $INTERPRET = makeKeyword("INTERPRET");

    static private final SubLList $list_alt180 = list(makeSymbol("&KEY"), makeSymbol("TERM-NAME"));

    static private final SubLList $list_alt181 = list(makeKeyword("TERM-NAME"));



    static private final SubLList $list_alt183 = list(makeSymbol("&KEY"), makeSymbol("TERM"));

    static private final SubLList $list_alt184 = list($TERM);





    static private final SubLList $list_alt187 = list(makeSymbol("&KEY"), makeSymbol("TERM"), makeSymbol("REQUESTED-ACTION"));

    static private final SubLList $list_alt188 = list($TERM, makeKeyword("REQUESTED-ACTION"));

    private static final SubLSymbol $REQUESTED_ACTION = makeKeyword("REQUESTED-ACTION");

    static private final SubLList $list_alt190 = list(CHAR_colon);

    private static final SubLSymbol $ASSERTED_SENTENCES = makeKeyword("ASSERTED-SENTENCES");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    private static final SubLSymbol $ADD_SCRAP = makeKeyword("ADD-SCRAP");

    private static final SubLSymbol $INTERVIEW = makeKeyword("INTERVIEW");

    private static final SubLSymbol $LEXIFY = makeKeyword("LEXIFY");

    private static final SubLSymbol $CONCEPT_RELATOR = makeKeyword("CONCEPT-RELATOR");

    private static final SubLSymbol $COMMON_QUERIES = makeKeyword("COMMON-QUERIES");



    static private final SubLString $$$your_new_term = makeString("your new term");



    static private final SubLString $str_alt201$your_new_ = makeString("your new ");



    static private final SubLString $str_alt203$your_new_kind_of_ = makeString("your new kind of ");

    private static final SubLSymbol $KILL_TERM = makeKeyword("KILL-TERM");



    private static final SubLSymbol $ANALOGY = makeKeyword("ANALOGY");

    private static final SubLSymbol $RELATION_SUGGESTOR = makeKeyword("RELATION-SUGGESTOR");

    private static final SubLSymbol $TERM_READER = makeKeyword("TERM-READER");

    private static final SubLSymbol $RETURN_STRING = makeKeyword("RETURN-STRING");

    private static final SubLSymbol $HEADER_STRING = makeKeyword("HEADER-STRING");

    static private final SubLList $list_alt211 = list(new SubLObject[]{ constant_handles.reader_make_constant_shell(makeString("Person")), constant_handles.reader_make_constant_shell(makeString("Dog")), constant_handles.reader_make_constant_shell(makeString("Plant")), constant_handles.reader_make_constant_shell(makeString("Pizza")), constant_handles.reader_make_constant_shell(makeString("Country")), constant_handles.reader_make_constant_shell(makeString("River")), constant_handles.reader_make_constant_shell(makeString("Business")), constant_handles.reader_make_constant_shell(makeString("FurniturePiece")), constant_handles.reader_make_constant_shell(makeString("Automobile")), constant_handles.reader_make_constant_shell(makeString("Tool")), constant_handles.reader_make_constant_shell(makeString("AnimalWalkingProcess")), constant_handles.reader_make_constant_shell(makeString("RedColor")), constant_handles.reader_make_constant_shell(makeString("FeelingAttribute")), constant_handles.reader_make_constant_shell(makeString("Book-CW")), constant_handles.reader_make_constant_shell(makeString("Mile")), constant_handles.reader_make_constant_shell(makeString("Dollar-UnitedStates")), constant_handles.reader_make_constant_shell(makeString("Number-General")), constant_handles.reader_make_constant_shell(makeString("Predicate")), constant_handles.reader_make_constant_shell(makeString("Microtheory")), constant_handles.reader_make_constant_shell(makeString("Function-Denotational")), constant_handles.reader_make_constant_shell(makeString("LexicalWord")) });

    static private final SubLSymbol $sym212$VALID_FORT_ = makeSymbol("VALID-FORT?");

    static private final SubLString $str_alt213$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    private static final SubLSymbol UIA_ONTOLOGY_BROWSER_DOMAIN_EXAMPLE_TERMS_MEMOIZED = makeSymbol("UIA-ONTOLOGY-BROWSER-DOMAIN-EXAMPLE-TERMS-MEMOIZED");

    static private final SubLSymbol $sym215$_VAR = makeSymbol("?VAR");

    static private final SubLList $list_alt216 = list(constant_handles.reader_make_constant_shell(makeString("keBrowsingPointOfReference")), makeSymbol("?VAR"));

    public static final SubLSymbol $kw217$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$repatriateToMt = constant_handles.reader_make_constant_shell(makeString("repatriateToMt"));

    public static final SubLObject $$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));

    private static final SubLSymbol $CONCEPT_RECOGNIZER = makeKeyword("CONCEPT-RECOGNIZER");

    static private final SubLList $list_alt224 = list(new SubLObject[]{ $NAME, makeString("Concept Recognizer"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-RECOGNIZER-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-RECOGNIZER-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-RECOGNIZER-CHILD-COMPLETED"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycConceptRecognizer")) });

    static private final SubLList $list_alt225 = list(makeSymbol("PHRASE"), makeSymbol("&REST"), makeSymbol("TOSS"));

    static private final SubLString $str_alt226$Recognize____A = makeString("Recognize : ~A");

    static private final SubLList $list_alt227 = list(makeSymbol("PHRASE"), makeSymbol("&OPTIONAL"), list(makeSymbol("AUTO-CREATE-UNRECOGNIZED?"), NIL));



    static private final SubLString $str_alt229$Reading__S = makeString("Reading ~S");

    private static final SubLSymbol UIA_PHRASE_CANDIDATE_TERMS = makeSymbol("UIA-PHRASE-CANDIDATE-TERMS");





    private static final SubLSymbol $TERM_INFO_TABLE = makeKeyword("TERM-INFO-TABLE");

    public static final SubLSymbol $kw234$WITHIN_CONCEPT_CREATOR_ = makeKeyword("WITHIN-CONCEPT-CREATOR?");

    static private final SubLList $list_alt235 = list(makeSymbol("LIKELY-TERMS"), makeSymbol("UNLIKELY-TERMS"));

    static private final SubLList $list_alt236 = list(new SubLObject[]{ $NAME, makeString("Known Facts"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-ASSERTED-SENTENCES-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-ASSERTED-SENTENCES-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-ASSERTED-SENTENCES-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-ASSERTED-SENTENCES-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycAssertedSentencesTool")), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING")) });

    static private final SubLList $list_alt237 = list(makeSymbol("PHRASE"), makeSymbol("&OPTIONAL"), makeSymbol("PARSE-TEMPLATE"));

    static private final SubLString $str_alt238$List_known_facts_about_ = makeString("List known facts about ");

    static private final SubLString $str_alt239$_ = makeString(" ");

    private static final SubLSymbol UIAT_ASSERTED_SENTENCES_THINKING = makeSymbol("UIAT-ASSERTED-SENTENCES-THINKING");

    static private final SubLList $list_alt241 = list(makeSymbol("&KEY"), makeSymbol("PHRASE"), makeSymbol("TERM"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt242 = list(makeKeyword("PHRASE"), $TERM, $MODE);

    static private final SubLString $str_alt243$Computing_known_facts_about_ = makeString("Computing known facts about ");



    static private final SubLString $str_alt245$Determining_how_to_express_known_ = makeString("Determining how to express known facts about ");

    static private final SubLList $list_alt246 = list(makeSymbol("SENTENCES-MT"), makeSymbol("SENTENCES"));



    private static final SubLSymbol UIAT_ASSERTED_SENTENCES_MAYBE_FIND_ASSERTION_FROM_MT = makeSymbol("UIAT-ASSERTED-SENTENCES-MAYBE-FIND-ASSERTION-FROM-MT");



    private static final SubLSymbol $CONCEPT_COMPARATOR = makeKeyword("CONCEPT-COMPARATOR");

    static private final SubLList $list_alt251 = list(new SubLObject[]{ $NAME, makeString("Concept Comparator"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-CONCEPT-COMPARATOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-CONCEPT-COMPARATOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-CONCEPT-COMPARATOR-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-CONCEPT-COMPARATOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycComparatorContrastor")), makeKeyword("FEATURES"), list(makeKeyword("CONCEPT-BROWSING")) });





    static private final SubLList $list_alt254 = list(makeSymbol("PHRASE1"), makeSymbol("PHRASE2"));

    static private final SubLString $str_alt255$Compare____A_and__A = makeString("Compare : ~A and ~A");

    private static final SubLSymbol $PHRASE1 = makeKeyword("PHRASE1");

    private static final SubLSymbol $PHRASE2 = makeKeyword("PHRASE2");



    private static final SubLSymbol $COMMON_SENTENCES = makeKeyword("COMMON-SENTENCES");

    private static final SubLSymbol $TERM1_UNIQUE_SENTENCES = makeKeyword("TERM1-UNIQUE-SENTENCES");

    private static final SubLSymbol $TERM2_UNIQUE_SENTENCES = makeKeyword("TERM2-UNIQUE-SENTENCES");

    private static final SubLSymbol $MY_RESULT_WILL_BE = makeKeyword("MY-RESULT-WILL-BE");

    static private final SubLList $list_alt263 = list(makeSymbol("&KEY"), makeSymbol("PHRASE1"), makeSymbol("PHRASE2"), makeSymbol("TERM1"), makeSymbol("TERM2"), list(makeSymbol("MODE"), makeKeyword("REQUIRED")));

    static private final SubLList $list_alt264 = list(makeKeyword("PHRASE1"), makeKeyword("PHRASE2"), makeKeyword("TERM1"), makeKeyword("TERM2"), $MODE);

    private static final SubLSymbol $RELATIONSHIP_SUGGESTOR = makeKeyword("RELATIONSHIP-SUGGESTOR");

    static private final SubLList $list_alt266 = list(new SubLObject[]{ $NAME, makeString("Relationship Suggestor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-RELATIONSHIP-SUGGESTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-RELATIONSHIP-SUGGESTOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-RELATIONSHIP-SUGGESTOR-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-RELATIONSHIP-SUGGESTOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycRelationshipSuggestor")) });

    static private final SubLString $str_alt267$Relate____A_and__A = makeString("Relate : ~A and ~A");

    private static final SubLSymbol $PREDICATE_SUGGESTOR = makeKeyword("PREDICATE-SUGGESTOR");

    static private final SubLList $list_alt269 = list(new SubLObject[]{ $NAME, makeString("Predicate Suggestor"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-PREDICATE-SUGGESTOR-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-PREDICATE-SUGGESTOR-GENERATE-REQUEST"), makeKeyword("CHILD-COMPLETED-METHOD"), makeSymbol("UIAT-PREDICATE-SUGGESTOR-CHILD-COMPLETED"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-PREDICATE-SUGGESTOR-HANDLE-REPLY"), $CYCL, constant_handles.reader_make_constant_shell(makeString("CycPredicateSuggestor")) });

    private static final SubLSymbol $HORIZON = makeKeyword("HORIZON");

    static private final SubLList $list_alt271 = list(makeSymbol("PHRASE"));

    static private final SubLString $str_alt272$Predicates____A = makeString("Predicates : ~A");

    static private final SubLList $list_alt273 = list(makeSymbol("COL"), makeSymbol("PREDICATE-SECTIONS"));

    static private final SubLList $list_alt274 = list(makeSymbol("PREDICATE"), makeSymbol("ARGNUM-LIST"));

    private static final SubLSymbol UIA_PREDICATE_SUGGESTOR_MATCHES_MEMOIZED = makeSymbol("UIA-PREDICATE-SUGGESTOR-MATCHES-MEMOIZED");

    private static final SubLSymbol $LEXICON_SEARCH = makeKeyword("LEXICON-SEARCH");

    static private final SubLList $list_alt277 = list($NAME, makeString("Dictionary Search"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-LEXICON-SEARCH-HINT"), makeKeyword("GENERATE-REQUEST-METHOD"), makeSymbol("UIAT-LEXICON-SEARCH-GENERATE-REQUEST"), makeKeyword("HANDLE-REPLY-METHOD"), makeSymbol("UIAT-LEXICON-SEARCH-HANDLE-REPLY"));

    static private final SubLList $list_alt278 = list(makeSymbol("PATTERN"), makeSymbol("SEARCH-TYPE"));

    static private final SubLString $str_alt279$Search____S = makeString("Search : ~S");

    private static final SubLSymbol $MATCHING_INDEX_ENTRIES = makeKeyword("MATCHING-INDEX-ENTRIES");



    private static final SubLSymbol NL_TRIE_INDEX_ITEM_TERM = makeSymbol("NL-TRIE-INDEX-ITEM-TERM");



    private static final SubLSymbol $RESULT_PAGE_NUM = makeKeyword("RESULT-PAGE-NUM");

    private static final SubLSymbol $GOTO_PAGE = makeKeyword("GOTO-PAGE");

    static private final SubLList $list_alt286 = list(makeSymbol("&KEY"), list(makeSymbol("GOTO-PAGE-NUM"), ZERO_INTEGER));

    static private final SubLList $list_alt287 = list(makeKeyword("GOTO-PAGE-NUM"));

    private static final SubLSymbol $GOTO_PAGE_NUM = makeKeyword("GOTO-PAGE-NUM");



    static private final SubLString $$$at_the_beginning = makeString("at the beginning");



    static private final SubLString $$$at_the_end = makeString("at the end");



    static private final SubLString $$$somewhere = makeString("somewhere");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_uia_tools_browsing_file();
    }

    @Override
    public void initializeVariables() {
        init_uia_tools_browsing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_uia_tools_browsing_file();
    }
}

