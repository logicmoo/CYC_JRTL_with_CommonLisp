package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_concept_communicator extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_concept_communicator();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_communicator";

    public static final String myFingerPrint = "2a4ff403001e6084908e03d80b2d0aebaf6b7c9f5ca0a948658936c7a8cfb7e4";

    // defparameter
    // Preds used for generation of RKF-TERM-STRING terms.
    private static final SubLSymbol $rkf_term_string_preds$ = makeSymbol("*RKF-TERM-STRING-PREDS*");





    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("regularDegree")));





    public static final SubLList $list5 = list(makeSymbol("TERMS"), makeSymbol("&KEY"), makeSymbol("ARG-ORDER-SUBLIST"), list(makeSymbol("OPR-KEY"), makeKeyword("AND")));

    public static final SubLList $list6 = list(makeKeyword("ARG-ORDER-SUBLIST"), makeKeyword("OPR-KEY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $ARG_ORDER_SUBLIST = makeKeyword("ARG-ORDER-SUBLIST");





    private static final SubLSymbol $RKF_TERM_CONJUNCTION = makeKeyword("RKF-TERM-CONJUNCTION");







    public static final SubLSymbol $sym15$CONTAINS_NL_TAG_ = makeSymbol("CONTAINS-NL-TAG?");

    public static final SubLList $list16 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));

    private static final SubLList $list17 = cons(makeSymbol("TERM"), makeSymbol("STRING"));



    private static final SubLObject $$predicateArgIsaSummary = reader_make_constant_shell(makeString("predicateArgIsaSummary"));



    private static final SubLSymbol RKF_NON_TRIVIAL_ARG_TYPE_P = makeSymbol("RKF-NON-TRIVIAL-ARG-TYPE-P");



    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLList $list24 = list(makeKeyword("MASS-NUMBER"), makeKeyword("PN-MASS-NUMBER"), makeKeyword("AGENTIVE-MASS"), makeKeyword("GERUND"), makeKeyword("SINGULAR"), makeKeyword("PN-SINGULAR"), makeKeyword("AGENTIVE-SG"));

    private static final SubLString $str25$_A__A = makeString("~A ~A");

    private static final SubLString $str26$_S = makeString("~S");

    public static final SubLList $list27 = list(reader_make_constant_shell(makeString("plural-Generic")), reader_make_constant_shell(makeString("nameString")));

    private static final SubLList $list28 = list(reader_make_constant_shell(makeString("nonPlural-Generic")), reader_make_constant_shell(makeString("nameString")));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str30$_A___A_ = makeString("~A (~A)");

    private static final SubLString $$$The_relationship_ = makeString("The relationship ");

    private static final SubLString $str32$in_this_example__ = makeString("in this example :");

    private static final SubLString $$$between = makeString("between");

    private static final SubLString $str34$___ = makeString("~% ");

    private static final SubLString $$$_and = makeString(" and");

    private static final SubLString $str36$_ = makeString(",");

    private static final SubLString $str37$__A = makeString(" ~A");

    private static final SubLString $str38$__in_this_example__ = makeString("~%in this example :");

    private static final SubLString $str39$_____A = makeString("~%  ~A");

    public static SubLObject rkf_term_phrase(final SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject force, SubLObject mode) {
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nl_preds = (NIL != pph_vars.$rkf_prefer_nouns_for_termsP$.getDynamicValue(thread)) ? $list2 : $ANY;
        SubLObject phrase = NIL;
        if (NIL == hlmt.hlmt_p(generation_mt)) {
            generation_mt = $DEFAULT;
        }
        if (NIL == hlmt.hlmt_p(domain_mt)) {
            domain_mt = $DEFAULT;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind(makeBoolean(NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind(NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread) ? TWO_INTEGER : ZERO_INTEGER, thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            if (NIL != rkf_term_conjunction_p(v_term)) {
                SubLObject current;
                final SubLObject datum = current = v_term.rest();
                SubLObject terms = NIL;
                destructuring_bind_must_consp(current, datum, $list5);
                terms = current.first();
                current = current.rest();
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_$1 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list5);
                    current_$1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list5);
                    if (NIL == member(current_$1, $list6, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list5);
                }
                final SubLObject arg_order_sublist_tail = property_list_member($ARG_ORDER_SUBLIST, current);
                final SubLObject arg_order_sublist = (NIL != arg_order_sublist_tail) ? cadr(arg_order_sublist_tail) : NIL;
                final SubLObject opr_key_tail = property_list_member($OPR_KEY, current);
                final SubLObject opr_key = (NIL != opr_key_tail) ? cadr(opr_key_tail) : $AND;
                phrase = pph_methods_formulas.generate_juncts(terms, arg_order_sublist, opr_key, UNPROVIDED);
            } else {
                phrase = pph_main.generate_text_wXsentential_force(v_term, force, nl_preds, generation_mt, domain_mt, mode, UNPROVIDED);
            }
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject rkf_term_conjunction_p(final SubLObject v_term) {
        return makeBoolean(v_term.isCons() && (v_term.first() == $RKF_TERM_CONJUNCTION));
    }

    public static SubLObject make_rkf_term_conjunction(final SubLObject terms, SubLObject arg_order_sublist, SubLObject opr_key) {
        if (arg_order_sublist == UNPROVIDED) {
            arg_order_sublist = NIL;
        }
        if (opr_key == UNPROVIDED) {
            opr_key = NIL;
        }
        final SubLObject ans = list($RKF_TERM_CONJUNCTION, terms);
        if (NIL != arg_order_sublist) {
            putf(ans, $ARG_ORDER_SUBLIST, arg_order_sublist);
        }
        if (NIL != opr_key) {
            putf(ans, $OPR_KEY, opr_key);
        }
        return ans;
    }

    public static SubLObject rkf_term_phrase_precise(final SubLObject v_term, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject force, SubLObject mode) {
        if (force == UNPROVIDED) {
            force = $NONE;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            phrase = rkf_term_phrase(v_term, generation_mt, domain_mt, force, mode);
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject rkf_html_summary_sentence(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind(makeBoolean(NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind(NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread) ? TWO_INTEGER : ZERO_INTEGER, thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            ans = pph_document.pph_summarize_term(v_term, summary_sentences, language_mt, domain_mt, $HTML, UNPROVIDED);
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_terms_distinguishing_phrases(final SubLObject terms, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject force, SubLObject mode, SubLObject include_typesP, SubLObject agr_pred) {
        if (force == UNPROVIDED) {
            force = $DECLARATIVE;
        }
        if (mode == UNPROVIDED) {
            mode = $HTML;
        }
        if (include_typesP == UNPROVIDED) {
            include_typesP = NIL;
        }
        if (agr_pred == UNPROVIDED) {
            agr_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject nl_preds = $ANY;
        if (NIL != agr_pred) {
            nl_preds = list(agr_pred);
        } else
            if (((NIL != pph_vars.$rkf_prefer_nouns_for_termsP$.getDynamicValue(thread)) && (force == $NONE)) && (NIL == find_if($sym15$CONTAINS_NL_TAG_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                nl_preds = $list16;
            }

        final SubLObject _prev_bind_0 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind(makeBoolean(NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind(NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread) ? TWO_INTEGER : ZERO_INTEGER, thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind(T, thread);
            if (NIL != include_typesP) {
                ans = pph_main.generate_disambiguation_phrases_and_types(terms, nl_preds, generation_mt, domain_mt, mode, UNPROVIDED);
            } else {
                SubLObject cdolist_list_var = pph_main.generate_disambiguation_phrases(terms, force, nl_preds, generation_mt, domain_mt, mode, UNPROVIDED);
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject v_term = NIL;
                    SubLObject string = NIL;
                    destructuring_bind_must_consp(current, datum, $list17);
                    v_term = current.first();
                    current = string = current.rest();
                    ans = cons(list(v_term, string), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
                ans = nreverse(ans);
            }
        } finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_arg_type_summary_for_pred(final SubLObject pred, final SubLObject language_mt, final SubLObject domain_mt, SubLObject argnum, SubLObject mode) {
        if (argnum == UNPROVIDED) {
            argnum = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLObject summary_cycl = rkf_arg_type_summary_cycl_for_pred(pred, domain_mt, argnum);
        if (summary_cycl.isKeyword()) {
            return summary_cycl;
        }
        return rkf_sentence_communicator.rkf_sentence_phrase(summary_cycl, language_mt, domain_mt, mode);
    }

    public static SubLObject rkf_arg_type_summary_cycl_for_pred(final SubLObject pred, final SubLObject domain_mt, SubLObject argnum) {
        if (argnum == UNPROVIDED) {
            argnum = $ALL;
        }
        if (($ALL == argnum) && (NIL != fort_types_interface.predicateP($$predicateArgIsaSummary))) {
            final SubLObject v_arity = rkf_concept_clarifier.rkf_arity(pred);
            SubLObject isa_cols = NIL;
            if (!v_arity.isInteger()) {
                return $UNSUPPORTED;
            }
            SubLObject i;
            SubLObject curr_argnum;
            for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                curr_argnum = number_utilities.f_1X(i);
                isa_cols = cons(rkf_concept_clarifier.rkf_salient_argn_isa(pred, curr_argnum, domain_mt), isa_cols);
            }
            if (NIL != find_if(RKF_NON_TRIVIAL_ARG_TYPE_P, isa_cols, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return make_el_formula($$predicateArgIsaSummary, cons(pred, nreverse(isa_cols)), UNPROVIDED);
            }
            return $TRIVIAL;
        } else {
            if (!argnum.isInteger()) {
                return $UNSUPPORTED;
            }
            final SubLObject isa_col = rkf_concept_clarifier.rkf_salient_argn_isa(pred, argnum, domain_mt);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_preds(argnum, UNPROVIDED, UNPROVIDED).first();
            if (NIL != rkf_non_trivial_arg_type_p(isa_col)) {
                return make_el_formula(arg_isa_pred, list(pred, isa_col), UNPROVIDED);
            }
            return $TRIVIAL;
        }
    }

    public static SubLObject rkf_non_trivial_arg_type_p(final SubLObject v_arg_type) {
        return makeBoolean(!v_arg_type.eql($$Thing));
    }

    public static SubLObject rkf_naut_string(final SubLObject naut, SubLObject determiner) {
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase = pph_main.generate_phrase(naut, $rkf_term_string_preds$.getDynamicValue(thread), determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (phrase.isString()) {
            return NIL != determiner ? format(NIL, $str25$_A__A, determiner, phrase) : phrase;
        }
        return format(NIL, $str26$_S, naut);
    }

    public static SubLObject rkf_term_string(final SubLObject term_or_naut, SubLObject prefer_pluralP, SubLObject prefer_naturalP) {
        if (prefer_pluralP == UNPROVIDED) {
            prefer_pluralP = NIL;
        }
        if (prefer_naturalP == UNPROVIDED) {
            prefer_naturalP = NIL;
        }
        SubLObject nl_preds = (NIL != prefer_pluralP) ? $list27 : $list28;
        if (NIL != prefer_naturalP) {
            nl_preds = NIL;
        }
        return pph_main.generate_phrase(term_or_naut, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_term_disambiguation_string(final SubLObject v_term) {
        final SubLObject generalization = rkf_concept_clarifier.rkf_salient_generalization(v_term, $$EverythingPSC);
        if (NIL != generalization) {
            return format(NIL, $str30$_A___A_, rkf_term_string(v_term, UNPROVIDED, UNPROVIDED), rkf_term_string(generalization, UNPROVIDED, UNPROVIDED));
        }
        return rkf_term_string(v_term, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_relation_disambiguation_string(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLObject examples = rkf_concept_summarizer.rkf_term_examples(relation, ONE_INTEGER, mt);
        if (NIL == examples) {
            return rkf_term_disambiguation_string(relation);
        }
        final SubLObject example = examples.first();
        final SubLObject example_args = cycl_utilities.formula_args(example, UNPROVIDED);
        final SubLObject stream = make_string_output_stream();
        format(stream, $$$The_relationship_);
        if (NIL != list_utilities.singletonP(example_args)) {
            format(stream, $str32$in_this_example__);
        } else {
            format(stream, $$$between);
            format(stream, $str34$___);
            final SubLObject total_args = length(example_args);
            SubLObject arg_number = ZERO_INTEGER;
            SubLObject cdolist_list_var = example_args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                arg_number = add(arg_number, ONE_INTEGER);
                if (!ONE_INTEGER.numE(arg_number)) {
                    if (total_args.numE(arg_number)) {
                        format(stream, $$$_and);
                    } else {
                        format(stream, $str36$_);
                    }
                }
                format(stream, $str37$__A, rkf_term_string(arg, UNPROVIDED, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
            format(stream, $str38$__in_this_example__);
        }
        format(stream, $str39$_____A, rkf_sentence_communicator.rkf_formula_string(example));
        return get_output_stream_string(stream);
    }

    public static SubLObject declare_rkf_concept_communicator_file() {
        declareFunction(me, "rkf_term_phrase", "RKF-TERM-PHRASE", 3, 2, false);
        declareFunction(me, "rkf_term_conjunction_p", "RKF-TERM-CONJUNCTION-P", 1, 0, false);
        declareFunction(me, "make_rkf_term_conjunction", "MAKE-RKF-TERM-CONJUNCTION", 1, 2, false);
        declareFunction(me, "rkf_term_phrase_precise", "RKF-TERM-PHRASE-PRECISE", 3, 2, false);
        declareFunction(me, "rkf_html_summary_sentence", "RKF-HTML-SUMMARY-SENTENCE", 4, 0, false);
        declareFunction(me, "rkf_terms_distinguishing_phrases", "RKF-TERMS-DISTINGUISHING-PHRASES", 3, 4, false);
        declareFunction(me, "rkf_arg_type_summary_for_pred", "RKF-ARG-TYPE-SUMMARY-FOR-PRED", 3, 2, false);
        declareFunction(me, "rkf_arg_type_summary_cycl_for_pred", "RKF-ARG-TYPE-SUMMARY-CYCL-FOR-PRED", 2, 1, false);
        declareFunction(me, "rkf_non_trivial_arg_type_p", "RKF-NON-TRIVIAL-ARG-TYPE-P", 1, 0, false);
        declareFunction(me, "rkf_naut_string", "RKF-NAUT-STRING", 1, 1, false);
        declareFunction(me, "rkf_term_string", "RKF-TERM-STRING", 1, 2, false);
        declareFunction(me, "rkf_term_disambiguation_string", "RKF-TERM-DISAMBIGUATION-STRING", 1, 0, false);
        declareFunction(me, "rkf_relation_disambiguation_string", "RKF-RELATION-DISAMBIGUATION-STRING", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rkf_concept_communicator_file() {
        defparameter("*RKF-TERM-STRING-PREDS*", $list24);
        return NIL;
    }

    public static SubLObject setup_rkf_concept_communicator_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_concept_communicator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_concept_communicator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_concept_communicator_file();
    }

    
}

/**
 * Total time: 182 ms
 */
