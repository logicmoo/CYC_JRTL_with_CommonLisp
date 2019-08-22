/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIA-DISPLAY-PRIMITIVES
 *  source file: /cyc/top/cycl/cb-uia-display-primitives.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_uia_display_primitives extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uia_display_primitives() {
    }

    public static final SubLFile me = new cb_uia_display_primitives();

    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_display_primitives";

    // // Definitions
    public static final SubLObject cb_uia_show_term(SubLObject v_term, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term_int(v_term, NIL, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_term_precise(SubLObject v_term, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term(v_term, list($PHRASE, phrase, $kw1$PRECISE_, T));
    }

    public static final SubLObject cb_uia_show_term_without_link(SubLObject v_term, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term_int(v_term, NIL, phrase, $NONE, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_term_with_clarifying_link(SubLObject v_term, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term_int(v_term, NIL, phrase, $CONCEPT_CLARIFIER, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_term_oe_link(SubLObject v_term, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term_int(v_term, NIL, phrase, $OE, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_term_in_interaction(SubLObject v_term, SubLObject interaction, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_term(v_term, list($INTERACTION, interaction, $PHRASE, phrase, $LINK, $NONE));
    }

    public static final SubLObject cb_uia_show_term_link(SubLObject cycl_sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (NIL == linktext) {
            linktext = $str_alt7$___;
        }
        return cb_utilities.cb_link($UIA_CONCEPT_CLARIFIER, cycl_sentence, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * valid plist indicators:
     * :interaction; nil or user-interaction
     * :phrase; a string to show
     * :link; either :concept-clarifier, :oe, or :none
     * :precise?; t or nil
     * :capitalize; t or nil
     */
    public static final SubLObject cb_uia_fancy_show_term(SubLObject v_term, SubLObject plist) {
        {
            SubLObject datum = plist;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt9);
                current_1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt9);
                if (NIL == member(current_1, $list_alt10, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt9);
            }
            {
                SubLObject interaction_tail = property_list_member($INTERACTION, current);
                SubLObject interaction = (NIL != interaction_tail) ? ((SubLObject) (cadr(interaction_tail))) : NIL;
                SubLObject phrase_tail = property_list_member($PHRASE, current);
                SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                SubLObject link_tail = property_list_member($LINK, current);
                SubLObject link = (NIL != link_tail) ? ((SubLObject) (cadr(link_tail))) : $UIA_ONTOLOGY_BROWSER_FOCUS;
                SubLObject preciseP_tail = property_list_member($kw1$PRECISE_, current);
                SubLObject preciseP = (NIL != preciseP_tail) ? ((SubLObject) (cadr(preciseP_tail))) : NIL;
                SubLObject capitalizeP_tail = property_list_member($kw13$CAPITALIZE_, current);
                SubLObject capitalizeP = (NIL != capitalizeP_tail) ? ((SubLObject) (cadr(capitalizeP_tail))) : NIL;
                return cb_uia_fancy_show_term_int(v_term, interaction, phrase, link, preciseP, capitalizeP);
            }
        }
    }

    public static final SubLObject cb_uia_fancy_show_term_int(SubLObject v_term, SubLObject interaction, SubLObject phrase, SubLObject link, SubLObject preciseP, SubLObject capitalizeP) {
        if (interaction == UNPROVIDED) {
            interaction = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (link == UNPROVIDED) {
            link = $NONE;
        }
        if (preciseP == UNPROVIDED) {
            preciseP = NIL;
        }
        if (capitalizeP == UNPROVIDED) {
            capitalizeP = NIL;
        }
        if (NIL == phrase) {
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject generation_mt = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_generation_language_mt(interaction))) : user_interaction_agenda.uia_generation_language_mt(v_agenda);
                SubLObject domain_mt = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_generation_domain_mt(interaction))) : user_interaction_agenda.uia_generation_domain_mt(v_agenda);
                SubLObject paraphrase_fn = (NIL != preciseP) ? ((SubLObject) (UIA_HTML_TERM_PHRASE_PRECISE)) : UIA_HTML_TERM_PHRASE;
                phrase = funcall(paraphrase_fn, v_agenda, v_term, generation_mt, domain_mt);
            }
        }
        if (NIL != capitalizeP) {
            phrase = pph_utilities.upcase_leading_smart(phrase);
        }
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        {
            SubLObject pcase_var = link;
            if (pcase_var.eql($CONCEPT_CLARIFIER) || pcase_var.eql($UIA_ONTOLOGY_BROWSER_FOCUS)) {
                cb_uia_show_term_link(v_term, UNPROVIDED);
                html_utilities.html_princ($str_alt16$_);
                html_utilities.html_markup(phrase);
            } else
                if (pcase_var.eql($OE)) {
                    if (NIL != constant_handles.constant_p(v_term)) {
                        cb_utilities.cb_link($CONSTANT, v_term, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL != nart_handles.nart_p(v_term)) {
                            cb_utilities.cb_link($NART, v_term, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            html_utilities.html_markup(phrase);
                        }

                } else
                    if (pcase_var.eql($NONE)) {
                        html_utilities.html_markup(phrase);
                    }


        }
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return v_term;
    }

    public static final SubLObject cb_uia_show_term_oe_link_image(SubLObject v_term, SubLObject phrase) {
        if (NIL != nart_handles.nart_p(v_term)) {
            cb_utilities.cb_link($NART, v_term, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != constant_handles.constant_p(v_term)) {
                cb_utilities.cb_link($CONSTANT, v_term, phrase, $CYC_LOGO_LARGE_VIOLET_FULL_URL, UNPROVIDED, UNPROVIDED);
            } else {
                html_utilities.html_markup(phrase);
            }

        return NIL;
    }

    public static final SubLObject cb_uia_show_sentence(SubLObject sentence, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_sentence(sentence, list($PHRASE, phrase));
    }

    public static final SubLObject cb_uia_show_sentence_precise(SubLObject sentence) {
        return cb_uia_fancy_show_sentence(sentence, $list_alt20);
    }

    public static final SubLObject cb_uia_show_sentence_precise_with_clarifying_link(SubLObject sentence) {
        return cb_uia_fancy_show_sentence(sentence, $list_alt21);
    }

    public static final SubLObject cb_uia_show_sentence_in_interaction(SubLObject sentence, SubLObject interaction) {
        return cb_uia_fancy_show_sentence(sentence, list($INTERACTION, interaction));
    }

    public static final SubLObject cb_uia_show_sentence_link(SubLObject cycl_sentence, SubLObject linktext, SubLObject force) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (NIL == linktext) {
            linktext = $str_alt7$___;
        }
        return cb_utilities.cb_link($UIA_SENTENCE_CLARIFIER, cycl_sentence, linktext, force, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_sentence_with_hoverover_only(SubLObject sentence, SubLObject phrase, SubLObject linktext) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        return cb_uia_fancy_show_sentence(sentence, list($SENTENCE_LINK, $HOVEROVER_ONLY, $PHRASE, phrase, $SENTENCE_LINKTEXT, linktext));
    }

    public static final SubLObject cb_uia_show_sentence_without_link(SubLObject sentence, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_sentence(sentence, list($SENTENCE_LINK, $NONE, $PHRASE, phrase));
    }

    public static final SubLObject cb_uia_show_sentence_with_clarifying_link(SubLObject sentence, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_sentence(sentence, list($SENTENCE_LINK, $SENTENCE_CLARIFIER, $PHRASE, phrase));
    }

    public static final SubLObject cb_uia_show_query_with_clarifying_link(SubLObject sentence, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        return cb_uia_fancy_show_sentence(sentence, listS($SENTENCE_LINK, $SENTENCE_CLARIFIER, $PHRASE, phrase, $list_alt28));
    }

    /**
     * valid plist indicators:
     * :interaction; nil or user-interaction
     * :phrase string to print for sentence
     * :term-links :concept-clarifier or :none
     * :precise?; t or nil
     * :sentence-link; :sentence-clarifier or :none
     * :sentence-linktext; a string, for now
     * :term-phrase-mappings; an alist-p of term -> phrase mappings which will override the default generation.
     * :force; :question or :declarative
     */
    public static final SubLObject cb_uia_fancy_show_sentence(SubLObject sentence, SubLObject plist) {
        {
            SubLObject datum = plist;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_2 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt29);
                current_2 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt29);
                if (NIL == member(current_2, $list_alt30, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_2 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt29);
            }
            {
                SubLObject interaction_tail = property_list_member($INTERACTION, current);
                SubLObject interaction = (NIL != interaction_tail) ? ((SubLObject) (cadr(interaction_tail))) : NIL;
                SubLObject phrase_tail = property_list_member($PHRASE, current);
                SubLObject phrase = (NIL != phrase_tail) ? ((SubLObject) (cadr(phrase_tail))) : NIL;
                SubLObject term_links_tail = property_list_member($TERM_LINKS, current);
                SubLObject term_links = (NIL != term_links_tail) ? ((SubLObject) (cadr(term_links_tail))) : $ONTOLOGY_BROWSER;
                SubLObject preciseP_tail = property_list_member($kw1$PRECISE_, current);
                SubLObject preciseP = (NIL != preciseP_tail) ? ((SubLObject) (cadr(preciseP_tail))) : NIL;
                SubLObject sentence_link_tail = property_list_member($SENTENCE_LINK, current);
                SubLObject sentence_link = (NIL != sentence_link_tail) ? ((SubLObject) (cadr(sentence_link_tail))) : $SENTENCE_CLARIFIER;
                SubLObject sentence_linktext_tail = property_list_member($SENTENCE_LINKTEXT, current);
                SubLObject sentence_linktext = (NIL != sentence_linktext_tail) ? ((SubLObject) (cadr(sentence_linktext_tail))) : $str_alt7$___;
                SubLObject force_tail = property_list_member($FORCE, current);
                SubLObject force = (NIL != force_tail) ? ((SubLObject) (cadr(force_tail))) : $DECLARATIVE;
                SubLObject term_phrase_mappings_tail = property_list_member($TERM_PHRASE_MAPPINGS, current);
                SubLObject term_phrase_mappings = (NIL != term_phrase_mappings_tail) ? ((SubLObject) (cadr(term_phrase_mappings_tail))) : $NONE;
                return cb_uia_fancy_show_sentence_int(sentence, interaction, phrase, term_links, preciseP, sentence_link, sentence_linktext, term_phrase_mappings, force);
            }
        }
    }

    public static final SubLObject cb_uia_fancy_show_sentence_int(SubLObject sentence, SubLObject interaction, SubLObject phrase, SubLObject term_links, SubLObject preciseP, SubLObject sentence_link, SubLObject sentence_linktext, SubLObject term_phrase_mappings, SubLObject force) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (NIL == phrase) {
            phrase = cb_uia_fancy_show_sentence_phrase(sentence, interaction, term_links, preciseP, term_phrase_mappings, force);
        }
        {
            SubLObject pcase_var = sentence_link;
            if (pcase_var.eql($SENTENCE_CLARIFIER)) {
                cb_uia_show_sentence_link(sentence, sentence_linktext, force);
                html_utilities.html_indent(UNPROVIDED);
            } else
                if (pcase_var.eql($HOVEROVER_ONLY)) {
                    cb_uia_tools_browsing.cb_uia_display_non_linking_sentence_hoverover(sentence, force, sentence_linktext);
                } else
                    if (pcase_var.eql($NONE)) {
                    } else {
                        Errors.warn($str_alt35$Sentence_link__A_is_not_supported, sentence_link, CB_UIA_FANCY_SHOW_SENTENCE_INT);
                    }


        }
        if (term_links == $NONE) {
            html_utilities.html_princ(phrase);
        } else {
            html_utilities.html_markup(phrase);
        }
        return sentence;
    }

    public static final SubLObject cb_uia_fancy_show_sentence_phrase(SubLObject sentence, SubLObject interaction, SubLObject term_links, SubLObject preciseP, SubLObject term_phrase_mappings, SubLObject force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
                SubLObject generation_mt = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_generation_language_mt(interaction))) : user_interaction_agenda.uia_generation_language_mt(v_agenda);
                SubLObject domain_mt = (NIL != interaction) ? ((SubLObject) (user_interaction_agenda.ui_generation_domain_mt(interaction))) : user_interaction_agenda.uia_generation_domain_mt(v_agenda);
                SubLObject linksP = makeBoolean(term_links != $NONE);
                SubLObject paraphrase_fn = cb_uia_fancy_show_sentence_paraphrase_fn(linksP, preciseP, force);
                SubLObject phrase = NIL;
                if (term_phrase_mappings == $NONE) {
                    phrase = funcall(paraphrase_fn, v_agenda, sentence, generation_mt, domain_mt);
                } else {
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                        try {
                            pph_vars.$pph_term_paraphrase_map$.bind(term_phrase_mappings, thread);
                            phrase = funcall(paraphrase_fn, v_agenda, sentence, generation_mt, domain_mt);
                        } finally {
                            pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return phrase;
            }
        }
    }

    public static final SubLObject cb_uia_fancy_show_sentence_paraphrase_fn(SubLObject linksP, SubLObject preciseP, SubLObject force) {
        if (force == $DECLARATIVE) {
            if ((NIL != linksP) && (NIL != preciseP)) {
                return UIA_HTML_SENTENCE_PHRASE_PRECISE;
            } else
                if (NIL != linksP) {
                    return UIA_HTML_SENTENCE_PHRASE;
                } else
                    if (NIL != preciseP) {
                        return UIA_SENTENCE_PHRASE_PRECISE;
                    } else {
                        return UIA_SENTENCE_PHRASE;
                    }


        } else {
            return UIA_HTML_QUERY_PHRASE;
        }
    }

    public static final SubLObject cb_uia_show_predicate(SubLObject predicate) {
        return cb_uia_show_term(predicate, UNPROVIDED);
    }

    public static final SubLObject cb_uia_show_question(SubLObject v_question, SubLObject use_blanksP) {
        if (use_blanksP == UNPROVIDED) {
            use_blanksP = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            html_utilities.html_markup(uia_trampolines.uia_html_query_phrase(v_agenda, v_question, user_interaction_agenda.uia_generation_language_mt(v_agenda), user_interaction_agenda.uia_generation_domain_mt(v_agenda), use_blanksP));
        }
        return NIL;
    }

    public static final SubLObject cb_uia_show_imperative(SubLObject imperative) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            html_utilities.html_markup(uia_trampolines.uia_html_imperative_phrase(v_agenda, imperative, user_interaction_agenda.uia_generation_language_mt(v_agenda), user_interaction_agenda.uia_generation_domain_mt(v_agenda)));
        }
        return NIL;
    }

    public static final SubLObject cb_uia_show_assertion(SubLObject assertion) {
        return cb_uia_show_sentence_with_clarifying_link(assertion, UNPROVIDED);
    }

    /**
     * How many levels of meta-supports should we find and allow the display of?
     */
    // deflexical
    private static final SubLSymbol $cb_uia_meta_support_max$ = makeSymbol("*CB-UIA-META-SUPPORT-MAX*");

    /**
     *
     *
     * @param VALUE
     * 		non-negative-integer-p; How many levels of meta-supports to use
     */
    public static final SubLObject cb_uia_set_meta_support_max(SubLObject value) {
        if (NIL != subl_promotions.non_negative_integer_p(value)) {
            $cb_uia_meta_support_max$.setGlobalValue(value);
        }
        return $cb_uia_meta_support_max$.getGlobalValue();
    }

    /**
     * What level of support are we currently on?
     */
    // defparameter
    private static final SubLSymbol $cb_uia_meta_support_level$ = makeSymbol("*CB-UIA-META-SUPPORT-LEVEL*");

    public static final SubLObject cb_uia_show_support(SubLObject support, SubLObject index_string, SubLObject known_invalid_supports) {
        if (index_string == UNPROVIDED) {
            index_string = $$$support;
        }
        if (known_invalid_supports == UNPROVIDED) {
            known_invalid_supports = $UNCOMPUTED;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != assertion_handles.assertion_p(support)) && (NIL != assertions_high.asserted_assertionP(support))) {
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) || (NIL != assertions_high.rule_assertionP(support))), thread);
                        cb_uia_show_assertion(support);
                        cb_uia_maybe_show_assert_info(support, index_string);
                    } finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
            } else
                if (known_invalid_supports.isList() && (NIL != member(support, known_invalid_supports, symbol_function(EQUAL), UNPROVIDED))) {
                    cb_uia_show_invalidated_support(support);
                } else
                    if ((known_invalid_supports == $UNCOMPUTED) && (NIL != uia_trampolines.uia_invalid_supportP(support))) {
                        cb_uia_show_invalidated_support(support);
                    } else
                        if (NIL != arguments.support_p(support)) {
                            {
                                SubLObject formula = arguments.support_sentence(support);
                                SubLObject meta_supports = ($cb_uia_meta_support_level$.getDynamicValue(thread).numL($cb_uia_meta_support_max$.getGlobalValue())) ? ((SubLObject) (cb_uia_meta_supports_to_show(support))) : NIL;
                                cb_uia_show_sentence_with_clarifying_link(formula, UNPROVIDED);
                                if (NIL != meta_supports) {
                                    {
                                        SubLObject _prev_bind_0 = $cb_uia_meta_support_level$.currentBinding(thread);
                                        try {
                                            $cb_uia_meta_support_level$.bind(number_utilities.f_1X($cb_uia_meta_support_level$.getDynamicValue(thread)), thread);
                                            cb_uia_maybe_show_meta_supports(meta_supports, index_string, UNPROVIDED);
                                        } finally {
                                            $cb_uia_meta_support_level$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }



            return NIL;
        }
    }

    /**
     * Display a support which we cannot verify, typically because an assertion it relied on
     * is no longer there.
     */
    public static final SubLObject cb_uia_show_invalidated_support(SubLObject support) {
        {
            SubLObject sentence = arguments.support_sentence(support);
            html_utilities.html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
            if (NIL != el_utilities.el_formula_p(sentence)) {
                cb_uia_show_sentence_with_clarifying_link(sentence, UNPROVIDED);
            } else {
                html_utilities.html_princ($$$Invalidated_support);
            }
            html_utilities.html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
        }
        return support;
    }

    /**
     *
     *
     * @return LISTP of meta-supports for SUPPORT, filtering out silly ones.
     */
    public static final SubLObject cb_uia_meta_supports_to_show(SubLObject support) {
        {
            SubLObject all_meta_supports = uia_trampolines.uia_meta_supports(support);
            SubLObject support_formula = arguments.support_formula(support);
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = all_meta_supports;
            SubLObject meta_support = NIL;
            for (meta_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_support = cdolist_list_var.first()) {
                if (!arguments.support_formula(meta_support).equal(support_formula)) {
                    ans = cons(meta_support, ans);
                }
            }
            return nreverse(ans);
        }
    }

    public static final SubLObject cb_uia_show_entire_support(SubLObject support) {
        {
            SubLObject formula = arguments.support_sentence(support);
            SubLObject mt = arguments.support_mt(support);
            SubLObject module = arguments.support_module(support);
            if (NIL != module) {
                html_utilities.html_princ($str_alt45$Module_);
                html_utilities.html_princ(module);
            }
            if ((NIL != module) && (NIL != mt)) {
                html_utilities.html_princ($str_alt46$_in_);
            }
            if (NIL != mt) {
                html_utilities.html_princ($str_alt47$Mt_);
                cb_uia_show_term(mt, UNPROVIDED);
            }
            if ((NIL != module) || (NIL != mt)) {
                html_utilities.html_princ($str_alt48$_claims_);
                html_utilities.html_newline(UNPROVIDED);
            }
            html_utilities.html_indent(FIVE_INTEGER);
            cb_uia_show_sentence(formula, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_uia_show_cycl_sentence_paragraph(SubLObject v_term, SubLObject cycl_sentences, SubLObject language_mt, SubLObject domain_mt, SubLObject new_paragraphP) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (new_paragraphP == UNPROVIDED) {
            new_paragraphP = NIL;
        }
        {
            SubLObject paragraph = pph_document.pph_summary_paragraph_from_cycl_sentences(v_term, cycl_sentences);
            pph_document.pph_paragraph_generate(paragraph, language_mt, domain_mt, $HTML);
            pph_document.pph_html_paragraph_print(paragraph, new_paragraphP);
            return paragraph;
        }
    }

    public static final SubLObject cb_uia_show_contradiction(SubLObject contradiction) {
        cb_uia_show_arguments(contradiction, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uia_show_redundancy(SubLObject redundancy) {
        cb_uia_show_arguments(redundancy, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_uia_show_why_not_wff(SubLObject why_not_wff) {
        return cb_uia_show_argument(why_not_wff, $$$wff);
    }

    public static final SubLObject cb_uia_show_inference_answer_proofs(SubLObject inference_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                SubLObject _prev_bind_1 = pph_vars.$pph_use_cb_uia_display_methodsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_showXhideP$.bind(T, thread);
                    pph_vars.$pph_use_cb_uia_display_methodsP$.bind(T, thread);
                    pph_proof.pph_show_inference_answer_proofs(inference_answer);
                } finally {
                    pph_vars.$pph_use_cb_uia_display_methodsP$.rebind(_prev_bind_1, thread);
                    pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_0, thread);
                }
            }
            return inference_answer;
        }
    }

    public static final SubLObject cb_uia_show_inference_answer_proof(SubLObject inference_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = pph_vars.$pph_use_showXhideP$.currentBinding(thread);
                SubLObject _prev_bind_1 = pph_vars.$pph_use_cb_uia_display_methodsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_showXhideP$.bind(T, thread);
                    pph_vars.$pph_use_cb_uia_display_methodsP$.bind(T, thread);
                    pph_proof.pph_show_inference_answer_proof(inference_answer, UNPROVIDED);
                } finally {
                    pph_vars.$pph_use_cb_uia_display_methodsP$.rebind(_prev_bind_1, thread);
                    pph_vars.$pph_use_showXhideP$.rebind(_prev_bind_0, thread);
                }
            }
            return inference_answer;
        }
    }

    /**
     *
     *
     * @param ARGUMENTS;
     * 		listp of arguments, each a list of supports.
     * @unknown baxter
     */
    public static final SubLObject cb_uia_show_arguments(SubLObject v_arguments, SubLObject type, SubLObject show_separatorP) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (show_separatorP == UNPROVIDED) {
            show_separatorP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    {
                        SubLObject list_var = NIL;
                        SubLObject argument = NIL;
                        SubLObject index = NIL;
                        for (list_var = v_arguments, argument = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , argument = list_var.first() , index = add(ONE_INTEGER, index)) {
                            {
                                SubLObject prefix_string = (NIL != type) ? ((SubLObject) (format(NIL, $str_alt51$_A_, symbol_name(type)))) : $str_alt52$;
                                SubLObject index_string = format(NIL, $str_alt53$_A_D, prefix_string, index);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align($TOP));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt55$_S_, number_utilities.f_1X(index));
                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                cb_uia_show_argument(argument, index_string);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                if (NIL != list_utilities.lengthG(v_arguments, index, UNPROVIDED)) {
                                    if (NIL != show_separatorP) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     *
     *
     * @param ARGUMENT;
     * 		listp of supports.
     * @param INDEX-STRING;
     * 		stringp unique for this argument on this html page.
     */
    public static final SubLObject cb_uia_show_argument(SubLObject argument, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            argument = uia_trampolines.uia_sub_isomorphic_assertions_into_supports(argument);
            {
                SubLObject invalid_supports = list_utilities.remove_if_not($sym56$UIA_INVALID_SUPPORT_, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != invalid_supports) {
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt57$_2);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    if (NIL != html_macros.$html_color_cyc_logo_violet$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_cyc_logo_violet$.getDynamicValue(thread)));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                            html_utilities.html_princ_strong($$$Invalid);
                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                {
                    SubLObject additional_supports = list_utilities.remove_if_not(RKF_IRRELEVANT_SUPPORT_P, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.same_length_p(argument, additional_supports)) {
                        additional_supports = NIL;
                    }
                    additional_supports = set_difference(additional_supports, invalid_supports, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject list_var = NIL;
                                SubLObject support = NIL;
                                SubLObject support_num = NIL;
                                for (list_var = argument, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                    if (NIL == subl_promotions.memberP(support, additional_supports, UNPROVIDED, UNPROVIDED)) {
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject support_index_string = format(NIL, $str_alt60$_A__D, index_string, support_num);
                                                    cb_uia_show_support(support, support_index_string, invalid_supports);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    if (NIL != additional_supports) {
                        cb_uia_maybe_show_additional_supports(additional_supports, index_string);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_maybe_show_additional_supports(SubLObject supports, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = cconcatenate($str_alt61$additional_supports_, index_string);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt62$text_css);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$screen);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $$$Additional_Supports);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject support = NIL;
                                    SubLObject support_num = NIL;
                                    for (list_var = supports, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject support_index_string = format(NIL, $str_alt68$_A_additional__D, index_string, support_num);
                                                    cb_uia_show_support(support, support_index_string, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_maybe_show_meta_supports(SubLObject meta_supports, SubLObject index_string, SubLObject label) {
        if (label == UNPROVIDED) {
            label = $str_alt52$;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = cconcatenate($str_alt69$meta_supports_, index_string);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt62$text_css);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$screen);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, label);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject support = NIL;
                                    SubLObject support_num = NIL;
                                    for (list_var = meta_supports, support = list_var.first(), support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , support = list_var.first() , support_num = add(ONE_INTEGER, support_num)) {
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject support_index_string = format(NIL, $str_alt70$_A_meta__D, index_string, support_num);
                                                    cb_uia_show_support(support, support_index_string, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_maybe_show_assert_info(SubLObject assertion, SubLObject index_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = cconcatenate($str_alt71$assert_info_, index_string);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt62$text_css);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$screen);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$none);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_indent(TWO_INTEGER);
                dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt52$);
                dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_uia_show_assert_info(assertion, cb_user_interaction_agenda.cb_current_uia());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_show_assert_info(SubLObject assertion, SubLObject v_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject mt = cb_uia_assert_info(assertion);
                SubLObject cyclist = thread.secondMultipleValue();
                SubLObject when = thread.thirdMultipleValue();
                SubLObject tool = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject hypothesizedP = isa.isaP(mt, $$HypotheticalContext, UNPROVIDED, UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    if (NIL != tool) {
                        {
                            SubLObject tool_name = uia_trampolines.uia_term_phrase_np(v_agenda, tool, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_princ($str_alt73$Entered_by_);
                            cb_uia_show_term(tool, tool_name);
                        }
                    } else
                        if (cyclist.equal(uia_setup_state.uia_user(v_agenda))) {
                            html_utilities.html_princ($str_alt74$Apparently__you_told_me_this);
                        } else
                            if (NIL != hypothesizedP) {
                                html_utilities.html_princ($str_alt75$This_was_given_in_the_question_fo);
                            } else {
                                html_utilities.html_princ($$$I_was_told_this);
                                if (NIL != isa.isaP(cyclist, $$Cyclist, user_interaction_agenda.uia_domain_mt(v_agenda), UNPROVIDED)) {
                                    html_utilities.html_princ($str_alt78$_by_);
                                    cb_uia_show_term(cyclist, UNPROVIDED);
                                }
                            }


                    if (NIL != when) {
                        {
                            SubLObject todayP = eql(numeric_date_utilities.today(), when);
                            SubLObject yesterdayP = eql(numeric_date_utilities.yesterday(), when);
                            if (NIL != todayP) {
                                {
                                    SubLObject time = assertions_high.asserted_second(assertion);
                                    if (NIL != numeric_date_utilities.universal_second_p(time)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt79$_at__A, numeric_date_utilities.secondstring(time));
                                    }
                                }
                                html_utilities.html_princ($str_alt80$_today_);
                            } else
                                if (NIL != yesterdayP) {
                                    html_utilities.html_princ($str_alt81$_yesterday_);
                                } else {
                                    html_utilities.html_princ($str_alt82$_on_);
                                    cb_uia_show_term(date_utilities.universal_date_to_cycl_date(when), UNPROVIDED);
                                }

                        }
                    }
                    if (NIL == hypothesizedP) {
                        html_utilities.html_princ($str_alt46$_in_);
                        cb_uia_show_term(mt, UNPROVIDED);
                        html_utilities.html_princ($str_alt83$_);
                    }
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_assert_info(SubLObject assertion) {
        {
            SubLObject tool = uia_assertion_tool(assertion);
            return values(assertions_high.assertion_mt(assertion), assertions_high.asserted_by(assertion), assertions_high.asserted_when(assertion), tool);
        }
    }

    public static final SubLObject uia_assertion_tool(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tool = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(rkf_assertion_utilities.rkf_assertion_attribution_mt());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        tool = kb_mapping_utilities.fpred_value(assertion, $$assertedUsingTool, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return tool;
            }
        }
    }

    /**
     * Display a strong warning about the arg-type constraints relevant to cloning CYCL-SENTENCE.
     */
    public static final SubLObject cb_uia_show_arg_type_warning_for_sentence_strong(SubLObject cycl_sentence, SubLObject v_agenda) {
        {
            SubLObject pred = uia_tools_basic.uiat_arg_type_constraint_pred_for_sentence(cycl_sentence);
            return cb_uia_show_arg_type_warning_for_pred(pred, v_agenda, $STRONG);
        }
    }

    /**
     * Display a warning about the arg-type constraints relevant to cloning CYCL-SENTENCE.
     */
    public static final SubLObject cb_uia_show_arg_type_warning_for_sentence(SubLObject cycl_sentence, SubLObject v_agenda) {
        {
            SubLObject pred = uia_tools_basic.uiat_arg_type_constraint_pred_for_sentence(cycl_sentence);
            return cb_uia_show_arg_type_warning_for_pred(pred, v_agenda, $NORMAL);
        }
    }

    /**
     * Display a warning about the arg-type constraints on PRED.
     */
    public static final SubLObject cb_uia_show_arg_type_warning_for_pred(SubLObject pred, SubLObject v_agenda, SubLObject strength) {
        if (strength == UNPROVIDED) {
            strength = $NORMAL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject warning_string = uia_tools_basic.uiat_arg_type_warning_string_for_pred(pred, v_agenda);
                if (warning_string.isString()) {
                    {
                        SubLObject note_string = ($STRONG == strength) ? ((SubLObject) ($$$Warning)) : $$$Note;
                        SubLObject full_warning_string = format(NIL, $str_alt89$__A___A_, note_string, warning_string);
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        if ($STRONG == strength) {
                            {
                                SubLObject color_val = $RED;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ(full_warning_string);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                        } else {
                            html_utilities.html_princ(full_warning_string);
                        }
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_newline(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_uia_princ_tool_linktext(SubLObject text) {
        html_utilities.html_princ_non_breaking(text);
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $uia_should_ignore_gkeP$ = makeSymbol("*UIA-SHOULD-IGNORE-GKE?*");

    public static final SubLObject uia_should_ignore_gkeP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $uia_should_ignore_gkeP$.getDynamicValue(thread);
        }
    }

    public static final SubLObject uia_should_ignore_gke() {
        $uia_should_ignore_gkeP$.setDynamicValue(T);
        return uia_should_ignore_gkeP();
    }

    public static final SubLObject uia_should_not_ignore_gke() {
        $uia_should_ignore_gkeP$.setDynamicValue(NIL);
        return uia_should_ignore_gkeP();
    }

    /**
     * plist args: :is-question? :editable-arg-positions :appname :height :width
     */
    public static final SubLObject cb_uia_gke_applet(SubLObject interaction, SubLObject formula, SubLObject mt, SubLObject submit_url_params, SubLObject handler, SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = plist;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_15 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt92);
                    current_15 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt92);
                    if (NIL == member(current_15, $list_alt93, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_15 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt92);
                }
                {
                    SubLObject is_questionP_tail = property_list_member($kw94$IS_QUESTION_, current);
                    SubLObject is_questionP = (NIL != is_questionP_tail) ? ((SubLObject) (cadr(is_questionP_tail))) : NIL;
                    SubLObject editable_arg_positions_tail = property_list_member($EDITABLE_ARG_POSITIONS, current);
                    SubLObject editable_arg_positions = (NIL != editable_arg_positions_tail) ? ((SubLObject) (cadr(editable_arg_positions_tail))) : NIL;
                    SubLObject appname_tail = property_list_member($APPNAME, current);
                    SubLObject appname = (NIL != appname_tail) ? ((SubLObject) (cadr(appname_tail))) : $$$Guided_Knowledge_Entry;
                    SubLObject height_tail = property_list_member($HEIGHT, current);
                    SubLObject height = (NIL != height_tail) ? ((SubLObject) (cadr(height_tail))) : cb_gke_applet.$cb_gke_default_height$.getGlobalValue();
                    SubLObject width_tail = property_list_member($WIDTH, current);
                    SubLObject width = (NIL != width_tail) ? ((SubLObject) (cadr(width_tail))) : cb_gke_applet.$cb_gke_default_width$.getGlobalValue();
                    if (NIL == $uia_should_ignore_gkeP$.getDynamicValue(thread)) {
                        {
                            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                            SubLObject is_nusketch_availableP = uia_coa_utilities.uia_coa_valid_nusketch_connectionP(v_agenda);
                            SubLObject generation_mt = user_interaction_agenda.uia_generation_language_mt(v_agenda);
                            SubLObject parsing_mt = user_interaction_agenda.uia_parsing_mt(v_agenda);
                            SubLObject lookup_function = (NIL != is_nusketch_availableP) ? ((SubLObject) (UIA_GKE_PERFORM_OTHER_FIND)) : NIL;
                            SubLObject lookup_text = (NIL != is_nusketch_availableP) ? ((SubLObject) (uia_coa_utilities.uia_gke_get_other_find_label(interaction))) : NIL;
                            SubLObject lookup_funargs = (NIL != is_nusketch_availableP) ? ((SubLObject) (uia_coa_utilities.uia_gke_construct_context(interaction))) : NIL;
                            SubLObject plist_16 = list(new SubLObject[]{ $APPNAME, appname, $kw94$IS_QUESTION_, is_questionP, $EDITABLE_ARG_POSITIONS, editable_arg_positions, $GENERATION_MT, generation_mt, $PARSING_MT, parsing_mt, $LOOKUP_TERM_FUNCTION, lookup_function, $LOOKUP_TERM_FUNCTION_ARGS, lookup_funargs, $LOOKUP_TERM_TEXT, lookup_text, $HEIGHT, height, $WIDTH, width });
                            cb_gke_applet.cb_gke_applet(formula, mt, submit_url_params, handler, plist_16);
                        }
                        return interaction;
                    }
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @param SENTENCE-PLISTS
     * 		plist; keys include :formula and :creator, :justifications, :assertion, :interview for the moment,
     * 		with more expected in future (July2002)
     * 		emits a sequence of table-rows that describe the formulas
     */
    public static final SubLObject cb_uia_show_sentence_plist_set(SubLObject sentence_plists, SubLObject index_string, SubLObject indent, SubLObject display_justificationsP) {
        if (indent == UNPROVIDED) {
            indent = ZERO_INTEGER;
        }
        if (display_justificationsP == UNPROVIDED) {
            display_justificationsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filtered_sentence_plists = remove_duplicates(sentence_plists, $sym106$SENTENCE_PLIST__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject within_sentence_finderP = uia_tools_basic.uia_within_sentence_finderP(cb_user_interaction_agenda.cb_current_uia());
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                        {
                            SubLObject bgcolor = NIL;
                            if (NIL == cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                bgcolor = html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                            }
                            {
                                SubLObject color_toggle = NIL;
                                SubLObject list_var = NIL;
                                SubLObject sentence_plist = NIL;
                                SubLObject sentence_num = NIL;
                                for (list_var = filtered_sentence_plists, sentence_plist = list_var.first(), sentence_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , sentence_plist = list_var.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                                    if (NIL != cb_parameters.$cb_show_enhanced_tables$.getDynamicValue(thread)) {
                                        if (NIL != color_toggle) {
                                            color_toggle = NIL;
                                        } else {
                                            color_toggle = T;
                                        }
                                        bgcolor = (NIL != color_toggle) ? ((SubLObject) (html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread))) : html_macros.$html_color_cyc_logo_light_violet$.getDynamicValue(thread);
                                    }
                                    {
                                        SubLObject sentence_index_string = cconcatenate(index_string, new SubLObject[]{ $str_alt107$_, princ_to_string(sentence_num) });
                                        SubLObject supports = getf(sentence_plist, $JUSTIFICATIONS, UNPROVIDED);
                                        SubLObject sentence = getf(sentence_plist, $FORMULA, UNPROVIDED);
                                        SubLObject assertion = getf(sentence_plist, $ASSERTION, UNPROVIDED);
                                        SubLObject thing_to_show = (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) ? ((SubLObject) (assertion)) : sentence;
                                        SubLObject display_justsP = (NIL != supports) ? ((SubLObject) (display_justificationsP)) : NIL;
                                        SubLObject object_id = NIL;
                                        if (NIL != supports) {
                                            object_id = cconcatenate($str_alt111$sentence_supports_, sentence_index_string);
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt62$text_css);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$screen);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                                                    dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                                                    html_utilities.html_markup($$$none);
                                                    dhtml_macros.dhtml_dom_attribute_postamble();
                                                    dhtml_macros.dhtml_dom_wrapper_postamble();
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                }
                                            }
                                            html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                                            html_utilities.html_terpri(UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(bgcolor);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_indent(indent);
                                                        if (NIL != within_sentence_finderP) {
                                                            cb_utilities.cb_link($UIA_SENTENCE_FINDER_THROW, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_indent(UNPROVIDED);
                                                        }
                                                        cb_uia_show_sentence(thing_to_show, UNPROVIDED);
                                                        if (NIL != display_justsP) {
                                                            dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, $str_alt52$);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if (getf(sentence_plist, $INTERVIEW, UNPROVIDED) == $TRUE) {
                                                            cb_uia_tools_salient_descriptor.cb_uia_maybe_salient_descriptor_link_for_term(sentence_plist, UNPROVIDED);
                                                            html_utilities.html_newline(UNPROVIDED);
                                                        }
                                                        {
                                                            SubLObject pcase_var = getf(sentence_plist, $CREATOR, UNPROVIDED);
                                                            if (pcase_var.eql($USER)) {
                                                                html_utilities.html_princ($str_alt117$User_authored);
                                                            } else
                                                                if (pcase_var.eql($DERIVED)) {
                                                                    html_utilities.html_princ($$$Derived_Fact);
                                                                } else
                                                                    if (pcase_var.eql($CYC)) {
                                                                        html_utilities.html_princ($str_alt121$Cyc_authored);
                                                                    }


                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        if (NIL != display_justsP) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            if (NIL != bgcolor) {
                                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(bgcolor);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            dhtml_macros.dhtml_set_switched_visibility(object_id, $INVISIBLE, $TEXT);
                                                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                            if (NIL != object_id) {
                                                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(object_id);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    cb_uia_tools_misc.cb_uiat_show_sentence_justification(cb_user_interaction_agenda.cb_current_uia(), thing_to_show, list(supports), object_id);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sentence_plist_E(SubLObject plist1, SubLObject plist2) {
        return equal(getf(plist1, $FORMULA, UNPROVIDED), getf(plist2, $FORMULA, UNPROVIDED));
    }

    // deflexical
    private static final SubLSymbol $cb_uiat_loading_object_id$ = makeSymbol("*CB-UIAT-LOADING-OBJECT-ID*");

    public static final SubLObject cb_uiat_show_load_pacifier(SubLObject interaction, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $str_alt124$Loading_____please_wait_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = $cb_uiat_loading_object_id$.getGlobalValue();
                html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
                html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($str_alt62$text_css);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($$$screen);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_terpri(UNPROVIDED);
                        dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
                        dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
                        html_utilities.html_markup($$$inline);
                        dhtml_macros.dhtml_dom_attribute_postamble();
                        dhtml_macros.dhtml_dom_wrapper_postamble();
                        html_utilities.html_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
                html_utilities.html_terpri(UNPROVIDED);
                dhtml_macros.dhtml_set_visibility(object_id, $VISIBLE, $TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (NIL != object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(object_id);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt57$_2);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != html_macros.$html_color_sat_red$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getDynamicValue(thread)));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(message);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return interaction;
        }
    }

    public static final SubLObject cb_uiat_hide_load_pacifier(SubLObject interaction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_id = $cb_uiat_loading_object_id$.getGlobalValue();
                SubLObject setter = dhtml_macros.dhtml_generate_visibility_setter(object_id, $INVISIBLE, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(setter);
                        html_utilities.html_princ($str_alt127$_);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            }
            return interaction;
        }
    }

    /**
     * Display a button for pasting input into the field named TEXTBOX-NAME.
     */
    public static final SubLObject cb_uia_paste_button(SubLObject textbox_name, SubLObject name) {
        if (name == UNPROVIDED) {
            name = $str_alt128$Find___Paste;
        }
        return html_script_utilities.html_completing_input_button(textbox_name, uia_tools_basic.$uiat_default_trigger_string_for_finding$.getGlobalValue(), name);
    }

    // deflexical
    private static final SubLSymbol $cb_uia_jsrefresh_timeout_secs_to_msecs$ = makeSymbol("*CB-UIA-JSREFRESH-TIMEOUT-SECS-TO-MSECS*");

    // deflexical
    private static final SubLSymbol $cb_uia_jsrefresh_timeout_marker$ = makeSymbol("*CB-UIA-JSREFRESH-TIMEOUT-MARKER*");

    // deflexical
    private static final SubLSymbol $cb_uia_jsrefresh_next_marker$ = makeSymbol("*CB-UIA-JSREFRESH-NEXT-MARKER*");

    // deflexical
    private static final SubLSymbol $cb_uia_jsrefresh_script$ = makeSymbol("*CB-UIA-JSREFRESH-SCRIPT*");

    public static final SubLObject cb_uia_refresh_script(SubLObject secs, SubLObject goto_handler_function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject timeout = string_utilities.to_string(multiply(secs, $cb_uia_jsrefresh_timeout_secs_to_msecs$.getGlobalValue()));
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        {
                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(NIL, thread);
                                html_utilities.html_princ(html_script_utilities.instantiate_javascript_template($cb_uia_jsrefresh_script$.getGlobalValue(), list(cons($cb_uia_jsrefresh_timeout_marker$.getGlobalValue(), timeout), cons($cb_uia_jsrefresh_next_marker$.getGlobalValue(), goto_handler_function))));
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                            }
                        }
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
            }
            return secs;
        }
    }

    public static final SubLObject declare_cb_uia_display_primitives_file() {
        declareFunction("cb_uia_show_term", "CB-UIA-SHOW-TERM", 1, 1, false);
        declareFunction("cb_uia_show_term_precise", "CB-UIA-SHOW-TERM-PRECISE", 1, 1, false);
        declareFunction("cb_uia_show_term_without_link", "CB-UIA-SHOW-TERM-WITHOUT-LINK", 1, 1, false);
        declareFunction("cb_uia_show_term_with_clarifying_link", "CB-UIA-SHOW-TERM-WITH-CLARIFYING-LINK", 1, 1, false);
        declareFunction("cb_uia_show_term_oe_link", "CB-UIA-SHOW-TERM-OE-LINK", 1, 1, false);
        declareFunction("cb_uia_show_term_in_interaction", "CB-UIA-SHOW-TERM-IN-INTERACTION", 2, 1, false);
        declareFunction("cb_uia_show_term_link", "CB-UIA-SHOW-TERM-LINK", 1, 1, false);
        declareFunction("cb_uia_fancy_show_term", "CB-UIA-FANCY-SHOW-TERM", 2, 0, false);
        declareFunction("cb_uia_fancy_show_term_int", "CB-UIA-FANCY-SHOW-TERM-INT", 1, 5, false);
        declareFunction("cb_uia_show_term_oe_link_image", "CB-UIA-SHOW-TERM-OE-LINK-IMAGE", 2, 0, false);
        declareFunction("cb_uia_show_sentence", "CB-UIA-SHOW-SENTENCE", 1, 1, false);
        declareFunction("cb_uia_show_sentence_precise", "CB-UIA-SHOW-SENTENCE-PRECISE", 1, 0, false);
        declareFunction("cb_uia_show_sentence_precise_with_clarifying_link", "CB-UIA-SHOW-SENTENCE-PRECISE-WITH-CLARIFYING-LINK", 1, 0, false);
        declareFunction("cb_uia_show_sentence_in_interaction", "CB-UIA-SHOW-SENTENCE-IN-INTERACTION", 2, 0, false);
        declareFunction("cb_uia_show_sentence_link", "CB-UIA-SHOW-SENTENCE-LINK", 1, 2, false);
        declareFunction("cb_uia_show_sentence_with_hoverover_only", "CB-UIA-SHOW-SENTENCE-WITH-HOVEROVER-ONLY", 1, 2, false);
        declareFunction("cb_uia_show_sentence_without_link", "CB-UIA-SHOW-SENTENCE-WITHOUT-LINK", 1, 1, false);
        declareFunction("cb_uia_show_sentence_with_clarifying_link", "CB-UIA-SHOW-SENTENCE-WITH-CLARIFYING-LINK", 1, 1, false);
        declareFunction("cb_uia_show_query_with_clarifying_link", "CB-UIA-SHOW-QUERY-WITH-CLARIFYING-LINK", 1, 1, false);
        declareFunction("cb_uia_fancy_show_sentence", "CB-UIA-FANCY-SHOW-SENTENCE", 2, 0, false);
        declareFunction("cb_uia_fancy_show_sentence_int", "CB-UIA-FANCY-SHOW-SENTENCE-INT", 8, 1, false);
        declareFunction("cb_uia_fancy_show_sentence_phrase", "CB-UIA-FANCY-SHOW-SENTENCE-PHRASE", 6, 0, false);
        declareFunction("cb_uia_fancy_show_sentence_paraphrase_fn", "CB-UIA-FANCY-SHOW-SENTENCE-PARAPHRASE-FN", 3, 0, false);
        declareFunction("cb_uia_show_predicate", "CB-UIA-SHOW-PREDICATE", 1, 0, false);
        declareFunction("cb_uia_show_question", "CB-UIA-SHOW-QUESTION", 1, 1, false);
        declareFunction("cb_uia_show_imperative", "CB-UIA-SHOW-IMPERATIVE", 1, 0, false);
        declareFunction("cb_uia_show_assertion", "CB-UIA-SHOW-ASSERTION", 1, 0, false);
        declareFunction("cb_uia_set_meta_support_max", "CB-UIA-SET-META-SUPPORT-MAX", 1, 0, false);
        declareFunction("cb_uia_show_support", "CB-UIA-SHOW-SUPPORT", 1, 2, false);
        declareFunction("cb_uia_show_invalidated_support", "CB-UIA-SHOW-INVALIDATED-SUPPORT", 1, 0, false);
        declareFunction("cb_uia_meta_supports_to_show", "CB-UIA-META-SUPPORTS-TO-SHOW", 1, 0, false);
        declareFunction("cb_uia_show_entire_support", "CB-UIA-SHOW-ENTIRE-SUPPORT", 1, 0, false);
        declareFunction("cb_uia_show_cycl_sentence_paragraph", "CB-UIA-SHOW-CYCL-SENTENCE-PARAGRAPH", 2, 3, false);
        declareFunction("cb_uia_show_contradiction", "CB-UIA-SHOW-CONTRADICTION", 1, 0, false);
        declareFunction("cb_uia_show_redundancy", "CB-UIA-SHOW-REDUNDANCY", 1, 0, false);
        declareFunction("cb_uia_show_why_not_wff", "CB-UIA-SHOW-WHY-NOT-WFF", 1, 0, false);
        declareFunction("cb_uia_show_inference_answer_proofs", "CB-UIA-SHOW-INFERENCE-ANSWER-PROOFS", 1, 0, false);
        declareFunction("cb_uia_show_inference_answer_proof", "CB-UIA-SHOW-INFERENCE-ANSWER-PROOF", 1, 0, false);
        declareFunction("cb_uia_show_arguments", "CB-UIA-SHOW-ARGUMENTS", 1, 2, false);
        declareFunction("cb_uia_show_argument", "CB-UIA-SHOW-ARGUMENT", 2, 0, false);
        declareFunction("cb_uia_maybe_show_additional_supports", "CB-UIA-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false);
        declareFunction("cb_uia_maybe_show_meta_supports", "CB-UIA-MAYBE-SHOW-META-SUPPORTS", 2, 1, false);
        declareFunction("cb_uia_maybe_show_assert_info", "CB-UIA-MAYBE-SHOW-ASSERT-INFO", 2, 0, false);
        declareFunction("cb_uia_show_assert_info", "CB-UIA-SHOW-ASSERT-INFO", 2, 0, false);
        declareFunction("cb_uia_assert_info", "CB-UIA-ASSERT-INFO", 1, 0, false);
        declareFunction("uia_assertion_tool", "UIA-ASSERTION-TOOL", 1, 0, false);
        declareFunction("cb_uia_show_arg_type_warning_for_sentence_strong", "CB-UIA-SHOW-ARG-TYPE-WARNING-FOR-SENTENCE-STRONG", 2, 0, false);
        declareFunction("cb_uia_show_arg_type_warning_for_sentence", "CB-UIA-SHOW-ARG-TYPE-WARNING-FOR-SENTENCE", 2, 0, false);
        declareFunction("cb_uia_show_arg_type_warning_for_pred", "CB-UIA-SHOW-ARG-TYPE-WARNING-FOR-PRED", 2, 1, false);
        declareFunction("cb_uia_princ_tool_linktext", "CB-UIA-PRINC-TOOL-LINKTEXT", 1, 0, false);
        declareFunction("uia_should_ignore_gkeP", "UIA-SHOULD-IGNORE-GKE?", 0, 0, false);
        declareFunction("uia_should_ignore_gke", "UIA-SHOULD-IGNORE-GKE", 0, 0, false);
        declareFunction("uia_should_not_ignore_gke", "UIA-SHOULD-NOT-IGNORE-GKE", 0, 0, false);
        declareFunction("cb_uia_gke_applet", "CB-UIA-GKE-APPLET", 5, 1, false);
        declareFunction("cb_uia_show_sentence_plist_set", "CB-UIA-SHOW-SENTENCE-PLIST-SET", 2, 2, false);
        declareFunction("sentence_plist_E", "SENTENCE-PLIST-=", 2, 0, false);
        declareFunction("cb_uiat_show_load_pacifier", "CB-UIAT-SHOW-LOAD-PACIFIER", 1, 1, false);
        declareFunction("cb_uiat_hide_load_pacifier", "CB-UIAT-HIDE-LOAD-PACIFIER", 1, 0, false);
        declareFunction("cb_uia_paste_button", "CB-UIA-PASTE-BUTTON", 1, 1, false);
        declareFunction("cb_uia_refresh_script", "CB-UIA-REFRESH-SCRIPT", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uia_display_primitives_file() {
        deflexical("*CB-UIA-META-SUPPORT-MAX*", ONE_INTEGER);
        defparameter("*CB-UIA-META-SUPPORT-LEVEL*", ZERO_INTEGER);
        defparameter("*UIA-SHOULD-IGNORE-GKE?*", NIL);
        deflexical("*CB-UIAT-LOADING-OBJECT-ID*", $str_alt123$_loading_pacifier);
        deflexical("*CB-UIA-JSREFRESH-TIMEOUT-SECS-TO-MSECS*", $int$1000);
        deflexical("*CB-UIA-JSREFRESH-TIMEOUT-MARKER*", $str_alt130$_TIMEOUT_);
        deflexical("*CB-UIA-JSREFRESH-NEXT-MARKER*", $str_alt131$_NEXT_INTERACTION_);
        deflexical("*CB-UIA-JSREFRESH-SCRIPT*", $str_alt132$_function_perform_window_refresh_);
        return NIL;
    }

    public static final SubLObject setup_cb_uia_display_primitives_file() {
                utilities_macros.register_html_state_variable($sym91$_UIA_SHOULD_IGNORE_GKE__);
        return NIL;
    }



    public static final SubLSymbol $kw1$PRECISE_ = makeKeyword("PRECISE?");



    private static final SubLSymbol $CONCEPT_CLARIFIER = makeKeyword("CONCEPT-CLARIFIER");

    private static final SubLSymbol $OE = makeKeyword("OE");





    static private final SubLString $str_alt7$___ = makeString("[+]");

    private static final SubLSymbol $UIA_CONCEPT_CLARIFIER = makeKeyword("UIA-CONCEPT-CLARIFIER");

    static private final SubLList $list_alt9 = list(makeSymbol("&KEY"), makeSymbol("INTERACTION"), makeSymbol("PHRASE"), list(makeSymbol("LINK"), makeKeyword("UIA-ONTOLOGY-BROWSER-FOCUS")), makeSymbol("PRECISE?"), makeSymbol("CAPITALIZE?"));

    static private final SubLList $list_alt10 = list(makeKeyword("INTERACTION"), makeKeyword("PHRASE"), $LINK, makeKeyword("PRECISE?"), makeKeyword("CAPITALIZE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $UIA_ONTOLOGY_BROWSER_FOCUS = makeKeyword("UIA-ONTOLOGY-BROWSER-FOCUS");

    public static final SubLSymbol $kw13$CAPITALIZE_ = makeKeyword("CAPITALIZE?");

    private static final SubLSymbol UIA_HTML_TERM_PHRASE_PRECISE = makeSymbol("UIA-HTML-TERM-PHRASE-PRECISE");

    private static final SubLSymbol UIA_HTML_TERM_PHRASE = makeSymbol("UIA-HTML-TERM-PHRASE");

    static private final SubLString $str_alt16$_ = makeString(" ");





    private static final SubLSymbol $CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");

    static private final SubLList $list_alt20 = list(makeKeyword("PRECISE?"), T);

    static private final SubLList $list_alt21 = list(makeKeyword("PRECISE?"), T, makeKeyword("SENTENCE-LINK"), makeKeyword("SENTENCE-CLARIFIER"));



    private static final SubLSymbol $UIA_SENTENCE_CLARIFIER = makeKeyword("UIA-SENTENCE-CLARIFIER");

    private static final SubLSymbol $SENTENCE_LINK = makeKeyword("SENTENCE-LINK");

    private static final SubLSymbol $HOVEROVER_ONLY = makeKeyword("HOVEROVER-ONLY");

    private static final SubLSymbol $SENTENCE_LINKTEXT = makeKeyword("SENTENCE-LINKTEXT");

    private static final SubLSymbol $SENTENCE_CLARIFIER = makeKeyword("SENTENCE-CLARIFIER");

    static private final SubLList $list_alt28 = list(makeKeyword("FORCE"), makeKeyword("QUESTION"));

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("INTERACTION"), makeSymbol("PHRASE"), list(makeSymbol("TERM-LINKS"), makeKeyword("ONTOLOGY-BROWSER")), makeSymbol("PRECISE?"), list(makeSymbol("SENTENCE-LINK"), makeKeyword("SENTENCE-CLARIFIER")), list(makeSymbol("SENTENCE-LINKTEXT"), makeString("[+]")), list(makeSymbol("FORCE"), makeKeyword("DECLARATIVE")), list(makeSymbol("TERM-PHRASE-MAPPINGS"), $NONE) });

    static private final SubLList $list_alt30 = list(makeKeyword("INTERACTION"), makeKeyword("PHRASE"), makeKeyword("TERM-LINKS"), makeKeyword("PRECISE?"), makeKeyword("SENTENCE-LINK"), makeKeyword("SENTENCE-LINKTEXT"), makeKeyword("FORCE"), makeKeyword("TERM-PHRASE-MAPPINGS"));

    private static final SubLSymbol $TERM_LINKS = makeKeyword("TERM-LINKS");

    private static final SubLSymbol $ONTOLOGY_BROWSER = makeKeyword("ONTOLOGY-BROWSER");



    private static final SubLSymbol $TERM_PHRASE_MAPPINGS = makeKeyword("TERM-PHRASE-MAPPINGS");

    static private final SubLString $str_alt35$Sentence_link__A_is_not_supported = makeString("Sentence link ~A is not supported in ~A");

    private static final SubLSymbol CB_UIA_FANCY_SHOW_SENTENCE_INT = makeSymbol("CB-UIA-FANCY-SHOW-SENTENCE-INT");

    private static final SubLSymbol UIA_HTML_SENTENCE_PHRASE_PRECISE = makeSymbol("UIA-HTML-SENTENCE-PHRASE-PRECISE");

    private static final SubLSymbol UIA_HTML_SENTENCE_PHRASE = makeSymbol("UIA-HTML-SENTENCE-PHRASE");

    private static final SubLSymbol UIA_SENTENCE_PHRASE_PRECISE = makeSymbol("UIA-SENTENCE-PHRASE-PRECISE");

    private static final SubLSymbol UIA_SENTENCE_PHRASE = makeSymbol("UIA-SENTENCE-PHRASE");

    private static final SubLSymbol UIA_HTML_QUERY_PHRASE = makeSymbol("UIA-HTML-QUERY-PHRASE");

    static private final SubLString $$$support = makeString("support");



    static private final SubLString $$$Invalidated_support = makeString("Invalidated support");

    static private final SubLString $str_alt45$Module_ = makeString("Module ");

    static private final SubLString $str_alt46$_in_ = makeString(" in ");

    static private final SubLString $str_alt47$Mt_ = makeString("Mt ");

    static private final SubLString $str_alt48$_claims_ = makeString(" claims:");



    static private final SubLString $$$wff = makeString("wff");

    static private final SubLString $str_alt51$_A_ = makeString("~A_");

    static private final SubLString $str_alt52$ = makeString("");

    static private final SubLString $str_alt53$_A_D = makeString("~A~D");



    static private final SubLString $str_alt55$_S_ = makeString("~S.");

    static private final SubLSymbol $sym56$UIA_INVALID_SUPPORT_ = makeSymbol("UIA-INVALID-SUPPORT?");

    static private final SubLString $str_alt57$_2 = makeString("+2");

    static private final SubLString $$$Invalid = makeString("Invalid");

    private static final SubLSymbol RKF_IRRELEVANT_SUPPORT_P = makeSymbol("RKF-IRRELEVANT-SUPPORT-P");

    static private final SubLString $str_alt60$_A__D = makeString("~A_~D");

    static private final SubLString $str_alt61$additional_supports_ = makeString("additional_supports_");

    static private final SubLString $str_alt62$text_css = makeString("text/css");

    static private final SubLString $$$screen = makeString("screen");

    static private final SubLString $$$none = makeString("none");

    static private final SubLString $$$Additional_Supports = makeString("Additional Supports");





    static private final SubLString $str_alt68$_A_additional__D = makeString("~A_additional_~D");

    static private final SubLString $str_alt69$meta_supports_ = makeString("meta_supports_");

    static private final SubLString $str_alt70$_A_meta__D = makeString("~A_meta_~D");

    static private final SubLString $str_alt71$assert_info_ = makeString("assert_info_");

    public static final SubLObject $$HypotheticalContext = constant_handles.reader_make_constant_shell(makeString("HypotheticalContext"));

    static private final SubLString $str_alt73$Entered_by_ = makeString("Entered by ");

    static private final SubLString $str_alt74$Apparently__you_told_me_this = makeString("Apparently, you told me this");

    static private final SubLString $str_alt75$This_was_given_in_the_question_fo = makeString("This was given in the question formulation.");

    static private final SubLString $$$I_was_told_this = makeString("I was told this");

    public static final SubLObject $$Cyclist = constant_handles.reader_make_constant_shell(makeString("Cyclist"));

    static private final SubLString $str_alt78$_by_ = makeString(" by ");

    static private final SubLString $str_alt79$_at__A = makeString(" at ~A");

    static private final SubLString $str_alt80$_today_ = makeString(" today ");

    static private final SubLString $str_alt81$_yesterday_ = makeString(" yesterday ");

    static private final SubLString $str_alt82$_on_ = makeString(" on ");

    static private final SubLString $str_alt83$_ = makeString(".");

    public static final SubLObject $$assertedUsingTool = constant_handles.reader_make_constant_shell(makeString("assertedUsingTool"));





    static private final SubLString $$$Warning = makeString("Warning");

    static private final SubLString $$$Note = makeString("Note");

    static private final SubLString $str_alt89$__A___A_ = makeString("(~A: ~A)");



    static private final SubLSymbol $sym91$_UIA_SHOULD_IGNORE_GKE__ = makeSymbol("*UIA-SHOULD-IGNORE-GKE?*");

    static private final SubLList $list_alt92 = list(makeSymbol("&KEY"), makeSymbol("IS-QUESTION?"), makeSymbol("EDITABLE-ARG-POSITIONS"), list(makeSymbol("APPNAME"), makeString("Guided Knowledge Entry")), list(makeSymbol("HEIGHT"), makeSymbol("*CB-GKE-DEFAULT-HEIGHT*")), list(makeSymbol("WIDTH"), makeSymbol("*CB-GKE-DEFAULT-WIDTH*")));

    static private final SubLList $list_alt93 = list(makeKeyword("IS-QUESTION?"), makeKeyword("EDITABLE-ARG-POSITIONS"), makeKeyword("APPNAME"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"));

    public static final SubLSymbol $kw94$IS_QUESTION_ = makeKeyword("IS-QUESTION?");

    private static final SubLSymbol $EDITABLE_ARG_POSITIONS = makeKeyword("EDITABLE-ARG-POSITIONS");



    static private final SubLString $$$Guided_Knowledge_Entry = makeString("Guided Knowledge Entry");





    private static final SubLSymbol UIA_GKE_PERFORM_OTHER_FIND = makeSymbol("UIA-GKE-PERFORM-OTHER-FIND");





    private static final SubLSymbol $LOOKUP_TERM_FUNCTION = makeKeyword("LOOKUP-TERM-FUNCTION");

    private static final SubLSymbol $LOOKUP_TERM_FUNCTION_ARGS = makeKeyword("LOOKUP-TERM-FUNCTION-ARGS");

    private static final SubLSymbol $LOOKUP_TERM_TEXT = makeKeyword("LOOKUP-TERM-TEXT");

    static private final SubLSymbol $sym106$SENTENCE_PLIST__ = makeSymbol("SENTENCE-PLIST-=");

    static private final SubLString $str_alt107$_ = makeString("_");







    static private final SubLString $str_alt111$sentence_supports_ = makeString("sentence_supports_");

    private static final SubLSymbol $UIA_SENTENCE_FINDER_THROW = makeKeyword("UIA-SENTENCE-FINDER-THROW");



    private static final SubLSymbol $INTERVIEW = makeKeyword("INTERVIEW");





    static private final SubLString $str_alt117$User_authored = makeString("User-authored");



    static private final SubLString $$$Derived_Fact = makeString("Derived Fact");



    static private final SubLString $str_alt121$Cyc_authored = makeString("Cyc-authored");



    static private final SubLString $str_alt123$_loading_pacifier = makeString("_loading_pacifier");

    static private final SubLString $str_alt124$Loading_____please_wait_ = makeString("Loading ... please wait.");

    static private final SubLString $$$inline = makeString("inline");



    static private final SubLString $str_alt127$_ = makeString(";");

    static private final SubLString $str_alt128$Find___Paste = makeString("Find & Paste");



    static private final SubLString $str_alt130$_TIMEOUT_ = makeString("%TIMEOUT%");

    static private final SubLString $str_alt131$_NEXT_INTERACTION_ = makeString("%NEXT-INTERACTION%");

    static private final SubLString $str_alt132$_function_perform_window_refresh_ = makeString("\nfunction perform_window_refresh() {\n  var location = self.document.location.href;\n  var question_mark = location.indexOf(\"?\");\n  if (question_mark != -1) {\n    location = location.substring(0,question_mark);\n  }\n  window.location.replace( location + \"?\" + \"%NEXT-INTERACTION%\" );\n}\n\nwindow.setTimeout( \'perform_window_refresh();\', %TIMEOUT%);\n");

    // // Initializers
    public void declareFunctions() {
        declare_cb_uia_display_primitives_file();
    }

    public void initializeVariables() {
        init_cb_uia_display_primitives_file();
    }

    public void runTopLevelForms() {
        setup_cb_uia_display_primitives_file();
    }
}

