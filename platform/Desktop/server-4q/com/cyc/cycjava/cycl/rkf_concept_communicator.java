package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_concept_communicator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_communicator";
    public static final String myFingerPrint = "2a4ff403001e6084908e03d80b2d0aebaf6b7c9f5ca0a948658936c7a8cfb7e4";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 6260L)
    private static SubLSymbol $rkf_term_string_preds$;
    private static final SubLSymbol $kw0$NONE;
    private static final SubLSymbol $kw1$TEXT;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$ANY;
    private static final SubLSymbol $kw4$DEFAULT;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw8$ARG_ORDER_SUBLIST;
    private static final SubLSymbol $kw9$OPR_KEY;
    private static final SubLSymbol $kw10$AND;
    private static final SubLSymbol $kw11$RKF_TERM_CONJUNCTION;
    private static final SubLSymbol $sym12$PPH_PRECISION_P;
    private static final SubLSymbol $kw13$HTML;
    private static final SubLSymbol $kw14$DECLARATIVE;
    private static final SubLSymbol $sym15$CONTAINS_NL_TAG_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$ALL;
    private static final SubLObject $const19$predicateArgIsaSummary;
    private static final SubLSymbol $kw20$UNSUPPORTED;
    private static final SubLSymbol $sym21$RKF_NON_TRIVIAL_ARG_TYPE_P;
    private static final SubLSymbol $kw22$TRIVIAL;
    private static final SubLObject $const23$Thing;
    private static final SubLList $list24;
    private static final SubLString $str25$_A__A;
    private static final SubLString $str26$_S;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLObject $const29$EverythingPSC;
    private static final SubLString $str30$_A___A_;
    private static final SubLString $str31$The_relationship_;
    private static final SubLString $str32$in_this_example__;
    private static final SubLString $str33$between;
    private static final SubLString $str34$___;
    private static final SubLString $str35$_and;
    private static final SubLString $str36$_;
    private static final SubLString $str37$__A;
    private static final SubLString $str38$__in_this_example__;
    private static final SubLString $str39$_____A;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 913L)
    public static SubLObject rkf_term_phrase(final SubLObject v_term, SubLObject generation_mt, SubLObject domain_mt, SubLObject force, SubLObject mode) {
        if (force == rkf_concept_communicator.UNPROVIDED) {
            force = (SubLObject)rkf_concept_communicator.$kw0$NONE;
        }
        if (mode == rkf_concept_communicator.UNPROVIDED) {
            mode = (SubLObject)rkf_concept_communicator.$kw1$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nl_preds = (SubLObject)((rkf_concept_communicator.NIL != pph_vars.$rkf_prefer_nouns_for_termsP$.getDynamicValue(thread)) ? rkf_concept_communicator.$list2 : rkf_concept_communicator.$kw3$ANY);
        SubLObject phrase = (SubLObject)rkf_concept_communicator.NIL;
        if (rkf_concept_communicator.NIL == hlmt.hlmt_p(generation_mt)) {
            generation_mt = (SubLObject)rkf_concept_communicator.$kw4$DEFAULT;
        }
        if (rkf_concept_communicator.NIL == hlmt.hlmt_p(domain_mt)) {
            domain_mt = (SubLObject)rkf_concept_communicator.$kw4$DEFAULT;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(rkf_concept_communicator.NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind((SubLObject)((rkf_concept_communicator.NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread)) ? rkf_concept_communicator.TWO_INTEGER : rkf_concept_communicator.ZERO_INTEGER), thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)rkf_concept_communicator.T, thread);
            if (rkf_concept_communicator.NIL != rkf_term_conjunction_p(v_term)) {
                SubLObject current;
                final SubLObject datum = current = v_term.rest();
                SubLObject terms = (SubLObject)rkf_concept_communicator.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_communicator.$list5);
                terms = current.first();
                current = current.rest();
                SubLObject allow_other_keys_p = (SubLObject)rkf_concept_communicator.NIL;
                SubLObject rest = current;
                SubLObject bad = (SubLObject)rkf_concept_communicator.NIL;
                SubLObject current_$1 = (SubLObject)rkf_concept_communicator.NIL;
                while (rkf_concept_communicator.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_concept_communicator.$list5);
                    current_$1 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_concept_communicator.$list5);
                    if (rkf_concept_communicator.NIL == conses_high.member(current_$1, (SubLObject)rkf_concept_communicator.$list6, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED)) {
                        bad = (SubLObject)rkf_concept_communicator.T;
                    }
                    if (current_$1 == rkf_concept_communicator.$kw7$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (rkf_concept_communicator.NIL != bad && rkf_concept_communicator.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_concept_communicator.$list5);
                }
                final SubLObject arg_order_sublist_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_concept_communicator.$kw8$ARG_ORDER_SUBLIST, current);
                final SubLObject arg_order_sublist = (SubLObject)((rkf_concept_communicator.NIL != arg_order_sublist_tail) ? conses_high.cadr(arg_order_sublist_tail) : rkf_concept_communicator.NIL);
                final SubLObject opr_key_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_concept_communicator.$kw9$OPR_KEY, current);
                final SubLObject opr_key = (SubLObject)((rkf_concept_communicator.NIL != opr_key_tail) ? conses_high.cadr(opr_key_tail) : rkf_concept_communicator.$kw10$AND);
                phrase = pph_methods_formulas.generate_juncts(terms, arg_order_sublist, opr_key, (SubLObject)rkf_concept_communicator.UNPROVIDED);
            }
            else {
                phrase = pph_main.generate_text_wXsentential_force(v_term, force, nl_preds, generation_mt, domain_mt, mode, (SubLObject)rkf_concept_communicator.UNPROVIDED);
            }
        }
        finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 1920L)
    public static SubLObject rkf_term_conjunction_p(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isCons() && v_term.first() == rkf_concept_communicator.$kw11$RKF_TERM_CONJUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 2042L)
    public static SubLObject make_rkf_term_conjunction(final SubLObject terms, SubLObject arg_order_sublist, SubLObject opr_key) {
        if (arg_order_sublist == rkf_concept_communicator.UNPROVIDED) {
            arg_order_sublist = (SubLObject)rkf_concept_communicator.NIL;
        }
        if (opr_key == rkf_concept_communicator.UNPROVIDED) {
            opr_key = (SubLObject)rkf_concept_communicator.NIL;
        }
        final SubLObject ans = (SubLObject)ConsesLow.list((SubLObject)rkf_concept_communicator.$kw11$RKF_TERM_CONJUNCTION, terms);
        if (rkf_concept_communicator.NIL != arg_order_sublist) {
            conses_high.putf(ans, (SubLObject)rkf_concept_communicator.$kw8$ARG_ORDER_SUBLIST, arg_order_sublist);
        }
        if (rkf_concept_communicator.NIL != opr_key) {
            conses_high.putf(ans, (SubLObject)rkf_concept_communicator.$kw9$OPR_KEY, opr_key);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 2457L)
    public static SubLObject rkf_term_phrase_precise(final SubLObject v_term, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject force, SubLObject mode) {
        if (force == rkf_concept_communicator.UNPROVIDED) {
            force = (SubLObject)rkf_concept_communicator.$kw0$NONE;
        }
        if (mode == rkf_concept_communicator.UNPROVIDED) {
            mode = (SubLObject)rkf_concept_communicator.$kw1$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = (SubLObject)rkf_concept_communicator.NIL;
        assert rkf_concept_communicator.NIL != pph_utilities.pph_precision_p((SubLObject)rkf_concept_communicator.T) : rkf_concept_communicator.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)rkf_concept_communicator.T, thread);
            pph_vars.$pph_ambiguous_strings$.bind((rkf_concept_communicator.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rkf_concept_communicator.EQUALP), (SubLObject)rkf_concept_communicator.UNPROVIDED), thread);
            phrase = rkf_term_phrase(v_term, generation_mt, domain_mt, force, mode);
        }
        finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 2791L)
    public static SubLObject rkf_html_summary_sentence(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_concept_communicator.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)rkf_concept_communicator.T, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(rkf_concept_communicator.NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind((SubLObject)((rkf_concept_communicator.NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread)) ? rkf_concept_communicator.TWO_INTEGER : rkf_concept_communicator.ZERO_INTEGER), thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)rkf_concept_communicator.T, thread);
            ans = pph_document.pph_summarize_term(v_term, summary_sentences, language_mt, domain_mt, (SubLObject)rkf_concept_communicator.$kw13$HTML, (SubLObject)rkf_concept_communicator.UNPROVIDED);
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 3081L)
    public static SubLObject rkf_terms_distinguishing_phrases(final SubLObject terms, final SubLObject generation_mt, final SubLObject domain_mt, SubLObject force, SubLObject mode, SubLObject include_typesP, SubLObject agr_pred) {
        if (force == rkf_concept_communicator.UNPROVIDED) {
            force = (SubLObject)rkf_concept_communicator.$kw14$DECLARATIVE;
        }
        if (mode == rkf_concept_communicator.UNPROVIDED) {
            mode = (SubLObject)rkf_concept_communicator.$kw13$HTML;
        }
        if (include_typesP == rkf_concept_communicator.UNPROVIDED) {
            include_typesP = (SubLObject)rkf_concept_communicator.NIL;
        }
        if (agr_pred == rkf_concept_communicator.UNPROVIDED) {
            agr_pred = (SubLObject)rkf_concept_communicator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rkf_concept_communicator.NIL;
        SubLObject nl_preds = (SubLObject)rkf_concept_communicator.$kw3$ANY;
        if (rkf_concept_communicator.NIL != agr_pred) {
            nl_preds = (SubLObject)ConsesLow.list(agr_pred);
        }
        else if (rkf_concept_communicator.NIL != pph_vars.$rkf_prefer_nouns_for_termsP$.getDynamicValue(thread) && force == rkf_concept_communicator.$kw0$NONE && rkf_concept_communicator.NIL == Sequences.find_if((SubLObject)rkf_concept_communicator.$sym15$CONTAINS_NL_TAG_, terms, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED)) {
            nl_preds = (SubLObject)rkf_concept_communicator.$list16;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_guess_names_for_unlexified_termsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$select_string_methods_to_omit$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_guess_names_for_unlexified_termsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(rkf_concept_communicator.NIL == pph_vars.$rkf_use_cycl_for_unlexified_termsP$.getDynamicValue(thread)), thread);
            pph_vars.$pph_search_limit$.bind((SubLObject)((rkf_concept_communicator.NIL != pph_vars.$rkf_use_genl_preds_for_paraphraseP$.getDynamicValue(thread)) ? rkf_concept_communicator.TWO_INTEGER : rkf_concept_communicator.ZERO_INTEGER), thread);
            pph_vars.$pph_speaker$.bind(rkf_macros.rkf_speaker(), thread);
            pph_vars.$pph_addressee$.bind(rkf_macros.rkf_addressee(), thread);
            pph_vars.$select_string_methods_to_omit$.bind(rkf_macros.rkf_paraphrase_methods_to_skip(), thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)rkf_concept_communicator.T, thread);
            if (rkf_concept_communicator.NIL != include_typesP) {
                ans = pph_main.generate_disambiguation_phrases_and_types(terms, nl_preds, generation_mt, domain_mt, mode, (SubLObject)rkf_concept_communicator.UNPROVIDED);
            }
            else {
                SubLObject cdolist_list_var = pph_main.generate_disambiguation_phrases(terms, force, nl_preds, generation_mt, domain_mt, mode, (SubLObject)rkf_concept_communicator.UNPROVIDED);
                SubLObject cons = (SubLObject)rkf_concept_communicator.NIL;
                cons = cdolist_list_var.first();
                while (rkf_concept_communicator.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject v_term = (SubLObject)rkf_concept_communicator.NIL;
                    SubLObject string = (SubLObject)rkf_concept_communicator.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_communicator.$list17);
                    v_term = current.first();
                    current = (string = current.rest());
                    ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, string), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                ans = Sequences.nreverse(ans);
            }
        }
        finally {
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_6, thread);
            pph_vars.$select_string_methods_to_omit$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_search_limit$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_guess_names_for_unlexified_termsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 4129L)
    public static SubLObject rkf_arg_type_summary_for_pred(final SubLObject pred, final SubLObject language_mt, final SubLObject domain_mt, SubLObject argnum, SubLObject mode) {
        if (argnum == rkf_concept_communicator.UNPROVIDED) {
            argnum = (SubLObject)rkf_concept_communicator.$kw18$ALL;
        }
        if (mode == rkf_concept_communicator.UNPROVIDED) {
            mode = (SubLObject)rkf_concept_communicator.$kw1$TEXT;
        }
        final SubLObject summary_cycl = rkf_arg_type_summary_cycl_for_pred(pred, domain_mt, argnum);
        if (summary_cycl.isKeyword()) {
            return summary_cycl;
        }
        return rkf_sentence_communicator.rkf_sentence_phrase(summary_cycl, language_mt, domain_mt, mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 5149L)
    public static SubLObject rkf_arg_type_summary_cycl_for_pred(final SubLObject pred, final SubLObject domain_mt, SubLObject argnum) {
        if (argnum == rkf_concept_communicator.UNPROVIDED) {
            argnum = (SubLObject)rkf_concept_communicator.$kw18$ALL;
        }
        if (rkf_concept_communicator.$kw18$ALL == argnum && rkf_concept_communicator.NIL != fort_types_interface.predicateP(rkf_concept_communicator.$const19$predicateArgIsaSummary)) {
            final SubLObject v_arity = rkf_concept_clarifier.rkf_arity(pred);
            SubLObject isa_cols = (SubLObject)rkf_concept_communicator.NIL;
            if (!v_arity.isInteger()) {
                return (SubLObject)rkf_concept_communicator.$kw20$UNSUPPORTED;
            }
            SubLObject i;
            SubLObject curr_argnum;
            for (i = (SubLObject)rkf_concept_communicator.NIL, i = (SubLObject)rkf_concept_communicator.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)rkf_concept_communicator.ONE_INTEGER)) {
                curr_argnum = number_utilities.f_1X(i);
                isa_cols = (SubLObject)ConsesLow.cons(rkf_concept_clarifier.rkf_salient_argn_isa(pred, curr_argnum, domain_mt), isa_cols);
            }
            if (rkf_concept_communicator.NIL != Sequences.find_if((SubLObject)rkf_concept_communicator.$sym21$RKF_NON_TRIVIAL_ARG_TYPE_P, isa_cols, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED)) {
                return el_utilities.make_el_formula(rkf_concept_communicator.$const19$predicateArgIsaSummary, (SubLObject)ConsesLow.cons(pred, Sequences.nreverse(isa_cols)), (SubLObject)rkf_concept_communicator.UNPROVIDED);
            }
            return (SubLObject)rkf_concept_communicator.$kw22$TRIVIAL;
        }
        else {
            if (!argnum.isInteger()) {
                return (SubLObject)rkf_concept_communicator.$kw20$UNSUPPORTED;
            }
            final SubLObject isa_col = rkf_concept_clarifier.rkf_salient_argn_isa(pred, argnum, domain_mt);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_preds(argnum, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED).first();
            if (rkf_concept_communicator.NIL != rkf_non_trivial_arg_type_p(isa_col)) {
                return el_utilities.make_el_formula(arg_isa_pred, (SubLObject)ConsesLow.list(pred, isa_col), (SubLObject)rkf_concept_communicator.UNPROVIDED);
            }
            return (SubLObject)rkf_concept_communicator.$kw22$TRIVIAL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 6166L)
    public static SubLObject rkf_non_trivial_arg_type_p(final SubLObject v_arg_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!v_arg_type.eql(rkf_concept_communicator.$const23$Thing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 6738L)
    public static SubLObject rkf_naut_string(final SubLObject naut, SubLObject determiner) {
        if (determiner == rkf_concept_communicator.UNPROVIDED) {
            determiner = (SubLObject)rkf_concept_communicator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase = pph_main.generate_phrase(naut, rkf_concept_communicator.$rkf_term_string_preds$.getDynamicValue(thread), determiner, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED);
        if (phrase.isString()) {
            return (rkf_concept_communicator.NIL != determiner) ? PrintLow.format((SubLObject)rkf_concept_communicator.NIL, (SubLObject)rkf_concept_communicator.$str25$_A__A, determiner, phrase) : phrase;
        }
        return PrintLow.format((SubLObject)rkf_concept_communicator.NIL, (SubLObject)rkf_concept_communicator.$str26$_S, naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 7022L)
    public static SubLObject rkf_term_string(final SubLObject term_or_naut, SubLObject prefer_pluralP, SubLObject prefer_naturalP) {
        if (prefer_pluralP == rkf_concept_communicator.UNPROVIDED) {
            prefer_pluralP = (SubLObject)rkf_concept_communicator.NIL;
        }
        if (prefer_naturalP == rkf_concept_communicator.UNPROVIDED) {
            prefer_naturalP = (SubLObject)rkf_concept_communicator.NIL;
        }
        SubLObject nl_preds = (SubLObject)((rkf_concept_communicator.NIL != prefer_pluralP) ? rkf_concept_communicator.$list27 : rkf_concept_communicator.$list28);
        if (rkf_concept_communicator.NIL != prefer_naturalP) {
            nl_preds = (SubLObject)rkf_concept_communicator.NIL;
        }
        return pph_main.generate_phrase(term_or_naut, nl_preds, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 7540L)
    public static SubLObject rkf_term_disambiguation_string(final SubLObject v_term) {
        final SubLObject generalization = rkf_concept_clarifier.rkf_salient_generalization(v_term, rkf_concept_communicator.$const29$EverythingPSC);
        if (rkf_concept_communicator.NIL != generalization) {
            return PrintLow.format((SubLObject)rkf_concept_communicator.NIL, (SubLObject)rkf_concept_communicator.$str30$_A___A_, rkf_term_string(v_term, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED), rkf_term_string(generalization, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED));
        }
        return rkf_term_string(v_term, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-communicator.lisp", position = 7832L)
    public static SubLObject rkf_relation_disambiguation_string(final SubLObject relation, SubLObject mt) {
        if (mt == rkf_concept_communicator.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLObject examples = rkf_concept_summarizer.rkf_term_examples(relation, (SubLObject)rkf_concept_communicator.ONE_INTEGER, mt);
        if (rkf_concept_communicator.NIL == examples) {
            return rkf_term_disambiguation_string(relation);
        }
        final SubLObject example = examples.first();
        final SubLObject example_args = cycl_utilities.formula_args(example, (SubLObject)rkf_concept_communicator.UNPROVIDED);
        final SubLObject stream = streams_high.make_string_output_stream();
        PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str31$The_relationship_);
        if (rkf_concept_communicator.NIL != list_utilities.singletonP(example_args)) {
            PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str32$in_this_example__);
        }
        else {
            PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str33$between);
            PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str34$___);
            final SubLObject total_args = Sequences.length(example_args);
            SubLObject arg_number = (SubLObject)rkf_concept_communicator.ZERO_INTEGER;
            SubLObject cdolist_list_var = example_args;
            SubLObject arg = (SubLObject)rkf_concept_communicator.NIL;
            arg = cdolist_list_var.first();
            while (rkf_concept_communicator.NIL != cdolist_list_var) {
                arg_number = Numbers.add(arg_number, (SubLObject)rkf_concept_communicator.ONE_INTEGER);
                if (!rkf_concept_communicator.ONE_INTEGER.numE(arg_number)) {
                    if (total_args.numE(arg_number)) {
                        PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str35$_and);
                    }
                    else {
                        PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str36$_);
                    }
                }
                PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str37$__A, rkf_term_string(arg, (SubLObject)rkf_concept_communicator.UNPROVIDED, (SubLObject)rkf_concept_communicator.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str38$__in_this_example__);
        }
        PrintLow.format(stream, (SubLObject)rkf_concept_communicator.$str39$_____A, rkf_sentence_communicator.rkf_formula_string(example));
        return streams_high.get_output_stream_string(stream);
    }
    
    public static SubLObject declare_rkf_concept_communicator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_term_phrase", "RKF-TERM-PHRASE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_term_conjunction_p", "RKF-TERM-CONJUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "make_rkf_term_conjunction", "MAKE-RKF-TERM-CONJUNCTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_term_phrase_precise", "RKF-TERM-PHRASE-PRECISE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_html_summary_sentence", "RKF-HTML-SUMMARY-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_terms_distinguishing_phrases", "RKF-TERMS-DISTINGUISHING-PHRASES", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_arg_type_summary_for_pred", "RKF-ARG-TYPE-SUMMARY-FOR-PRED", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_arg_type_summary_cycl_for_pred", "RKF-ARG-TYPE-SUMMARY-CYCL-FOR-PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_non_trivial_arg_type_p", "RKF-NON-TRIVIAL-ARG-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_naut_string", "RKF-NAUT-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_term_string", "RKF-TERM-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_term_disambiguation_string", "RKF-TERM-DISAMBIGUATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_communicator", "rkf_relation_disambiguation_string", "RKF-RELATION-DISAMBIGUATION-STRING", 1, 1, false);
        return (SubLObject)rkf_concept_communicator.NIL;
    }
    
    public static SubLObject init_rkf_concept_communicator_file() {
        rkf_concept_communicator.$rkf_term_string_preds$ = SubLFiles.defparameter("*RKF-TERM-STRING-PREDS*", (SubLObject)rkf_concept_communicator.$list24);
        return (SubLObject)rkf_concept_communicator.NIL;
    }
    
    public static SubLObject setup_rkf_concept_communicator_file() {
        return (SubLObject)rkf_concept_communicator.NIL;
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
    
    static {
        me = (SubLFile)new rkf_concept_communicator();
        rkf_concept_communicator.$rkf_term_string_preds$ = null;
        $kw0$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw1$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree")));
        $kw3$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw4$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-ORDER-SUBLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPR-KEY"), (SubLObject)SubLObjectFactory.makeKeyword("AND")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG-ORDER-SUBLIST"), (SubLObject)SubLObjectFactory.makeKeyword("OPR-KEY"));
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$ARG_ORDER_SUBLIST = SubLObjectFactory.makeKeyword("ARG-ORDER-SUBLIST");
        $kw9$OPR_KEY = SubLObjectFactory.makeKeyword("OPR-KEY");
        $kw10$AND = SubLObjectFactory.makeKeyword("AND");
        $kw11$RKF_TERM_CONJUNCTION = SubLObjectFactory.makeKeyword("RKF-TERM-CONJUNCTION");
        $sym12$PPH_PRECISION_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $kw13$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw14$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $sym15$CONTAINS_NL_TAG_ = SubLObjectFactory.makeSymbol("CONTAINS-NL-TAG?");
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $list17 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $kw18$ALL = SubLObjectFactory.makeKeyword("ALL");
        $const19$predicateArgIsaSummary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateArgIsaSummary"));
        $kw20$UNSUPPORTED = SubLObjectFactory.makeKeyword("UNSUPPORTED");
        $sym21$RKF_NON_TRIVIAL_ARG_TYPE_P = SubLObjectFactory.makeSymbol("RKF-NON-TRIVIAL-ARG-TYPE-P");
        $kw22$TRIVIAL = SubLObjectFactory.makeKeyword("TRIVIAL");
        $const23$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASS-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("PN-MASS-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("AGENTIVE-MASS"), (SubLObject)SubLObjectFactory.makeKeyword("GERUND"), (SubLObject)SubLObjectFactory.makeKeyword("SINGULAR"), (SubLObject)SubLObjectFactory.makeKeyword("PN-SINGULAR"), (SubLObject)SubLObjectFactory.makeKeyword("AGENTIVE-SG"));
        $str25$_A__A = SubLObjectFactory.makeString("~A ~A");
        $str26$_S = SubLObjectFactory.makeString("~S");
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")));
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")));
        $const29$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str30$_A___A_ = SubLObjectFactory.makeString("~A (~A)");
        $str31$The_relationship_ = SubLObjectFactory.makeString("The relationship ");
        $str32$in_this_example__ = SubLObjectFactory.makeString("in this example :");
        $str33$between = SubLObjectFactory.makeString("between");
        $str34$___ = SubLObjectFactory.makeString("~% ");
        $str35$_and = SubLObjectFactory.makeString(" and");
        $str36$_ = SubLObjectFactory.makeString(",");
        $str37$__A = SubLObjectFactory.makeString(" ~A");
        $str38$__in_this_example__ = SubLObjectFactory.makeString("~%in this example :");
        $str39$_____A = SubLObjectFactory.makeString("~%  ~A");
    }
}

/*

	Total time: 182 ms
	
*/