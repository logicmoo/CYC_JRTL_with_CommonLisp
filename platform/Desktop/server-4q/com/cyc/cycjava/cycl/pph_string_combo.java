package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_string_combo extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_string_combo";
    public static final String myFingerPrint = "cc3e2a897b7193a62a74c59162d3721108c958884863878e37b98c1b7f492c04";
    private static final SubLSymbol $sym0$PPH_STRING_COMBO_;
    private static final SubLSymbol $sym1$PPH_BUNGE;
    private static final SubLSymbol $sym2$_;
    private static final SubLSymbol $sym3$INTERVAL_SPAN_LENGTH;
    private static final SubLSymbol $sym4$INTERVAL_SPAN_OVERLAPS_;
    private static final SubLSymbol $sym5$INTERVAL_SPAN_PRECEDES_;
    private static final SubLSymbol $kw6$HTML;
    private static final SubLSymbol $kw7$NONE;
    private static final SubLSymbol $kw8$COMPLETE;
    private static final SubLSymbol $kw9$INITIAL;
    private static final SubLSymbol $kw10$FINAL;
    private static final SubLSymbol $kw11$MEDIAL;
    private static final SubLSymbol $sym12$PPH_STRING_GENERATES_TOKEN_SEQUENCE_;
    private static final SubLSymbol $kw13$TEST;
    private static final SubLSymbol $kw14$OWNER;
    private static final SubLSymbol $kw15$CLASSES;
    private static final SubLSymbol $kw16$KB;
    private static final SubLSymbol $kw17$TINY;
    private static final SubLSymbol $kw18$WORKING_;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$PPH_STRING_COMBO_TOKEN_LIST_GENERATES_TOKEN_SEQUENCE_;
    private static final SubLList $list23;
    private static final SubLString $str24$Ignoring_possible_variants_for_me;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 918L)
    public static SubLObject pph_string_comboP(final SubLObject v_object) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(v_object)) {
            return (SubLObject)pph_string_combo.T;
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(v_object)) {
            return Types.sublisp_null(list_utilities.find_if_not((SubLObject)pph_string_combo.$sym0$PPH_STRING_COMBO_, v_object, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED));
        }
        if (pph_string_combo.NIL != set.set_p(v_object)) {
            return Types.sublisp_null(set_utilities.set_find_if_not((SubLObject)pph_string_combo.$sym0$PPH_STRING_COMBO_, v_object, (SubLObject)pph_string_combo.UNPROVIDED));
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 1361L)
    public static SubLObject explode_pph_string_combo(final SubLObject combo, SubLObject max_number) {
        if (max_number == pph_string_combo.UNPROVIDED) {
            max_number = number_utilities.positive_infinity();
        }
        return explode_pph_string_combo_int(combo, max_number, (SubLObject)pph_string_combo.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 1589L)
    public static SubLObject explode_pph_string_combo_int(final SubLObject combo, final SubLObject max_number, SubLObject sofar) {
        if (max_number.isNumber() && sofar.numGE(max_number)) {
            return (SubLObject)pph_string_combo.NIL;
        }
        SubLObject strings = (SubLObject)pph_string_combo.NIL;
        SubLObject enoughP = (SubLObject)pph_string_combo.NIL;
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            strings = (SubLObject)ConsesLow.cons(combo, strings);
            sofar = Numbers.add(sofar, (SubLObject)pph_string_combo.ONE_INTEGER);
        }
        else if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject pieces = (SubLObject)pph_string_combo.NIL;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = (SubLObject)pph_string_combo.NIL;
            subcombo = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                pieces = (SubLObject)ConsesLow.cons(explode_pph_string_combo_int(subcombo, max_number, sofar), pieces);
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            }
            if (pph_string_combo.NIL == enoughP) {
                SubLObject csome_list_var = Mapping.mapcar((SubLObject)pph_string_combo.$sym1$PPH_BUNGE, list_utilities.cartesian_product(Sequences.nreverse(pieces), (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED));
                SubLObject string = (SubLObject)pph_string_combo.NIL;
                string = csome_list_var.first();
                while (pph_string_combo.NIL == enoughP && pph_string_combo.NIL != csome_list_var) {
                    strings = (SubLObject)ConsesLow.cons(string, strings);
                    sofar = Numbers.add(sofar, (SubLObject)pph_string_combo.ONE_INTEGER);
                    enoughP = (SubLObject)SubLObjectFactory.makeBoolean(max_number.isNumber() && sofar.numGE(max_number));
                    csome_list_var = csome_list_var.rest();
                    string = csome_list_var.first();
                }
            }
        }
        else if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            SubLObject csome_list_var2;
            SubLObject string2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo2) && pph_string_combo.NIL == enoughP) {
                    csome_list_var2 = explode_pph_string_combo_int(subcombo2, max_number, sofar);
                    string2 = (SubLObject)pph_string_combo.NIL;
                    string2 = csome_list_var2.first();
                    while (pph_string_combo.NIL == enoughP && pph_string_combo.NIL != csome_list_var2) {
                        if (pph_string_combo.NIL == conses_high.member(string2, strings, Symbols.symbol_function((SubLObject)pph_string_combo.EQUAL), (SubLObject)pph_string_combo.UNPROVIDED)) {
                            strings = (SubLObject)ConsesLow.cons(string2, strings);
                            sofar = Numbers.add(sofar, (SubLObject)pph_string_combo.ONE_INTEGER);
                            enoughP = (SubLObject)SubLObjectFactory.makeBoolean(max_number.isNumber() && sofar.numGE(max_number));
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        string2 = csome_list_var2.first();
                    }
                }
            }
        }
        return Values.values(strings, sofar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 2644L)
    public static SubLObject pph_string_combo_size_estimate(final SubLObject combo) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return (SubLObject)pph_string_combo.ONE_INTEGER;
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.ONE_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = (SubLObject)pph_string_combo.NIL;
            subcombo = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                size = Numbers.multiply(size, pph_string_combo_size_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            }
            return size;
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    size = Numbers.add(size, pph_string_combo_size_estimate(subcombo2));
                }
            }
            return size;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 3230L)
    public static SubLObject pph_string_combo_max_word_count_estimate(final SubLObject combo) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return number_utilities.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, combo, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED));
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.ZERO_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = (SubLObject)pph_string_combo.NIL;
            subcombo = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                size = Numbers.add(size, pph_string_combo_max_word_count_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            }
            return size;
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            SubLObject this_size;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    this_size = pph_string_combo_size_estimate(subcombo2);
                    if (this_size.numG(size)) {
                        size = this_size;
                    }
                }
            }
            return size;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 3928L)
    public static SubLObject pph_string_combo_min_word_count_estimate(final SubLObject combo) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return number_utilities.f_1X(Sequences.count((SubLObject)Characters.CHAR_space, combo, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED));
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.ZERO_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = (SubLObject)pph_string_combo.NIL;
            subcombo = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                size = Numbers.add(size, pph_string_combo_min_word_count_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            }
            return size;
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            SubLObject size = (SubLObject)pph_string_combo.NIL;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            SubLObject this_size;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    this_size = pph_string_combo_size_estimate(subcombo2);
                    if (pph_string_combo.NIL == size || this_size.numL(size)) {
                        size = this_size;
                    }
                }
            }
            return size;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 4647L)
    public static SubLObject pph_string_combo_unsubsumed_subphrases(final SubLObject combo, final SubLObject phrase, SubLObject case_sensitiveP) {
        if (case_sensitiveP == pph_string_combo.UNPROVIDED) {
            case_sensitiveP = (SubLObject)pph_string_combo.NIL;
        }
        final SubLObject tokens = string_utilities.string_tokenize(phrase, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED);
        final SubLObject token_count = Sequences.length(tokens);
        SubLObject v_ranges = (SubLObject)pph_string_combo.NIL;
        SubLObject end_var;
        SubLObject i;
        SubLObject end_var_$1;
        SubLObject j;
        for (end_var = token_count, i = (SubLObject)pph_string_combo.NIL, i = (SubLObject)pph_string_combo.ZERO_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            for (end_var_$1 = number_utilities.f_1X(token_count), j = (SubLObject)pph_string_combo.NIL, j = (SubLObject)pph_string_combo.ONE_INTEGER; !j.numGE(end_var_$1); j = number_utilities.f_1X(j)) {
                if (j.numG(i) && pph_string_combo.NIL != pph_string_combo_generates_token_sequenceP(combo, tokens, i, j, (SubLObject)pph_string_combo.NIL, case_sensitiveP)) {
                    v_ranges = (SubLObject)ConsesLow.cons(interval_span.get_interval_span(i, j), v_ranges);
                }
            }
        }
        SubLObject remaining_ranges = Sort.sort(v_ranges, Symbols.symbol_function((SubLObject)pph_string_combo.$sym2$_), (SubLObject)pph_string_combo.$sym3$INTERVAL_SPAN_LENGTH);
        SubLObject best_ranges = (SubLObject)pph_string_combo.NIL;
        SubLObject phrases = (SubLObject)pph_string_combo.NIL;
        while (pph_string_combo.NIL != remaining_ranges) {
            final SubLObject longest = remaining_ranges.first();
            remaining_ranges = remaining_ranges.rest();
            if (pph_string_combo.NIL == Sequences.find(longest, best_ranges, (SubLObject)pph_string_combo.$sym4$INTERVAL_SPAN_OVERLAPS_, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED)) {
                best_ranges = (SubLObject)ConsesLow.cons(longest, best_ranges);
            }
        }
        SubLObject cdolist_list_var = Sort.sort(best_ranges, (SubLObject)pph_string_combo.$sym5$INTERVAL_SPAN_PRECEDES_, (SubLObject)pph_string_combo.UNPROVIDED);
        SubLObject range = (SubLObject)pph_string_combo.NIL;
        range = cdolist_list_var.first();
        while (pph_string_combo.NIL != cdolist_list_var) {
            phrases = (SubLObject)ConsesLow.cons(string_utilities.bunge(Sequences.subseq(tokens, interval_span.interval_span_start(range), interval_span.interval_span_end(range)), (SubLObject)pph_string_combo.UNPROVIDED), phrases);
            cdolist_list_var = cdolist_list_var.rest();
            range = cdolist_list_var.first();
        }
        return Sequences.nreverse(phrases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 5589L)
    public static SubLObject pph_phrase_string_combo(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == pph_string_combo.UNPROVIDED) {
            add_tagsP = Equality.eq((SubLObject)pph_string_combo.$kw6$HTML, pph_vars.$paraphrase_mode$.getDynamicValue());
        }
        return pph_phrase_string_combo_internal(phrase, add_tagsP, (SubLObject)pph_string_combo.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 5824L)
    public static SubLObject pph_string_combo_has_sentential_forceP(final SubLObject combo, final SubLObject force) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_string_combo.NIL != pph_string_combo_has_sentence_initial_forceP(combo, force) && pph_string_combo.NIL != pph_string_combo_has_sentence_final_forceP(combo, force));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 6034L)
    public static SubLObject pph_string_combo_has_sentence_initial_forceP(final SubLObject combo, final SubLObject force) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_has_sentence_initial_forceP(combo, force);
        }
        if (combo.isList()) {
            return pph_string_combo_has_sentence_initial_forceP(combo.first(), force);
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo) && pph_string_combo.NIL == pph_string_combo_has_sentence_initial_forceP(subcombo, force)) {
                    return (SubLObject)pph_string_combo.NIL;
                }
            }
            return (SubLObject)pph_string_combo.T;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 6456L)
    public static SubLObject pph_string_combo_has_sentence_final_forceP(final SubLObject combo, final SubLObject force) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_has_sentence_final_forceP(combo, force);
        }
        if (combo.isList()) {
            return pph_string_combo_has_sentence_final_forceP(combo.first(), force);
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo) && pph_string_combo.NIL == pph_string_combo_has_sentence_final_forceP(subcombo, force)) {
                    return (SubLObject)pph_string_combo.NIL;
                }
            }
            return (SubLObject)pph_string_combo.T;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 6870L)
    public static SubLObject pph_string_combo_add_sentential_force(final SubLObject combo, final SubLObject force) {
        return pph_string_combo_add_sentence_initial_force(pph_string_combo_add_sentence_final_force(combo, force), force);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 7065L)
    public static SubLObject pph_string_combo_add_sentence_initial_force(final SubLObject combo, final SubLObject force) {
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_add_sentence_initial_force(combo, force);
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            return (SubLObject)ConsesLow.cons(pph_string_combo_add_sentence_initial_force(combo.first(), force), combo.rest());
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)pph_string_combo.EQUAL), (SubLObject)pph_string_combo.UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    set.set_add(pph_string_combo_add_sentence_initial_force(subcombo, force), result);
                }
            }
            return result;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 7562L)
    public static SubLObject pph_string_combo_add_sentence_final_force(final SubLObject combo, final SubLObject force) {
        if (force.eql((SubLObject)pph_string_combo.$kw7$NONE)) {
            return combo;
        }
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_add_sentence_final_force(combo, force);
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            return list_utilities.replace_last(combo, pph_string_combo_add_sentence_final_force(list_utilities.last_one(combo), force));
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)pph_string_combo.EQUAL), (SubLObject)pph_string_combo.UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    set.set_add(pph_string_combo_add_sentence_final_force(subcombo, force), result);
                }
            }
            return result;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 8086L)
    public static SubLObject pph_string_combo_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, SubLObject start, SubLObject end, SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (start == pph_string_combo.UNPROVIDED) {
            start = (SubLObject)pph_string_combo.ZERO_INTEGER;
        }
        if (end == pph_string_combo.UNPROVIDED) {
            end = (SubLObject)pph_string_combo.NIL;
        }
        if (start_at_startP == pph_string_combo.UNPROVIDED) {
            start_at_startP = (SubLObject)pph_string_combo.NIL;
        }
        if (case_sensitiveP == pph_string_combo.UNPROVIDED) {
            case_sensitiveP = (SubLObject)pph_string_combo.NIL;
        }
        if (pph_string_combo.NIL == end) {
            end = Sequences.length(tokens);
        }
        if (pph_string_combo.NIL != pph_string.pph_string_p(combo)) {
            return pph_string_generates_token_sequenceP(combo, tokens, start, end, start_at_startP, case_sensitiveP);
        }
        if (pph_string_combo.NIL != list_utilities.non_empty_list_p(combo)) {
            return pph_string_combo_token_list_generates_token_sequenceP(combo, tokens, start, end, start_at_startP, case_sensitiveP);
        }
        if (pph_string_combo.NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            SubLObject subcombo_result;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_string_combo.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_string_combo.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (pph_string_combo.NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    subcombo_result = pph_string_combo_generates_token_sequenceP(subcombo, tokens, start, end, start_at_startP, case_sensitiveP);
                    if (pph_string_combo.NIL != subcombo_result) {
                        return subcombo_result;
                    }
                }
            }
            return (SubLObject)pph_string_combo.NIL;
        }
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 8954L)
    public static SubLObject pph_string_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, final SubLObject start, final SubLObject end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == pph_string_combo.UNPROVIDED) {
            case_sensitiveP = (SubLObject)pph_string_combo.NIL;
        }
        final SubLObject combo_tokens = pph_string.pph_string_tokenize(combo, (SubLObject)pph_string_combo.UNPROVIDED);
        if (combo_tokens.equal(Sequences.subseq(tokens, start, end))) {
            return (SubLObject)pph_string_combo.$kw8$COMPLETE;
        }
        final SubLObject test = (pph_string_combo.NIL != case_sensitiveP) ? Symbols.symbol_function((SubLObject)pph_string_combo.EQUAL) : Symbols.symbol_function((SubLObject)pph_string_combo.EQUALP);
        final SubLObject search_result = Sequences.search(tokens, combo_tokens, test, Symbols.symbol_function((SubLObject)pph_string_combo.IDENTITY), start, end, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED);
        final SubLObject initialP = Equality.eql((SubLObject)pph_string_combo.ZERO_INTEGER, search_result);
        final SubLObject finalP = Equality.eql(search_result, Numbers.subtract(Sequences.length(combo_tokens), Numbers.subtract(end, start)));
        return (SubLObject)((pph_string_combo.NIL == search_result) ? pph_string_combo.NIL : ((pph_string_combo.NIL != initialP && pph_string_combo.NIL != finalP) ? pph_string_combo.$kw8$COMPLETE : ((pph_string_combo.NIL != initialP) ? pph_string_combo.$kw9$INITIAL : ((pph_string_combo.NIL != start_at_startP) ? pph_string_combo.NIL : ((pph_string_combo.NIL != finalP) ? pph_string_combo.$kw10$FINAL : pph_string_combo.$kw11$MEDIAL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 10432L)
    public static SubLObject pph_string_combo_token_list_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, final SubLObject start, final SubLObject end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == pph_string_combo.UNPROVIDED) {
            case_sensitiveP = (SubLObject)pph_string_combo.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_string_combo.NIL != list_utilities.singletonP(combo)) {
            return pph_string_combo_generates_token_sequenceP(list_utilities.only_one(combo), tokens, start, end, start_at_startP, case_sensitiveP);
        }
        SubLObject my_end = number_utilities.f_1X(start);
        SubLObject survivors = (SubLObject)pph_string_combo.NIL;
        SubLObject list_var = (SubLObject)pph_string_combo.NIL;
        SubLObject subcombo = (SubLObject)pph_string_combo.NIL;
        SubLObject i = (SubLObject)pph_string_combo.NIL;
        list_var = combo;
        subcombo = list_var.first();
        for (i = (SubLObject)pph_string_combo.ZERO_INTEGER; pph_string_combo.NIL != list_var; list_var = list_var.rest(), subcombo = list_var.first(), i = Numbers.add((SubLObject)pph_string_combo.ONE_INTEGER, i)) {
            if (pph_string_combo.NIL == start_at_startP || !i.numG((SubLObject)pph_string_combo.ZERO_INTEGER)) {
                thread.resetMultipleValues();
                final SubLObject okP = try_one_string_combo_token(subcombo, tokens, start, my_end, start_at_startP, case_sensitiveP);
                final SubLObject exhaustedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_string_combo.NIL != okP) {
                    survivors = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((pph_string_combo.NIL != exhaustedP) ? number_utilities.f_1X(start) : start, i, exhaustedP, Equality.eql(i, (SubLObject)pph_string_combo.ZERO_INTEGER)), survivors);
                }
            }
        }
        while (pph_string_combo.NIL != survivors && my_end.numL(end)) {
            my_end = Numbers.add(my_end, (SubLObject)pph_string_combo.ONE_INTEGER);
            SubLObject new_survivors = (SubLObject)pph_string_combo.NIL;
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = (SubLObject)pph_string_combo.NIL;
            survivor = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = survivor;
                SubLObject my_start = (SubLObject)pph_string_combo.NIL;
                SubLObject surv_end = (SubLObject)pph_string_combo.NIL;
                SubLObject exhaustedP2 = (SubLObject)pph_string_combo.NIL;
                SubLObject initialP = (SubLObject)pph_string_combo.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string_combo.$list20);
                my_start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string_combo.$list20);
                surv_end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string_combo.$list20);
                exhaustedP2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_string_combo.$list20);
                initialP = current.first();
                current = current.rest();
                if (pph_string_combo.NIL == current) {
                    final SubLObject new_surv_end = (pph_string_combo.NIL != exhaustedP2) ? number_utilities.f_1X(surv_end) : surv_end;
                    final SubLObject subcombo2 = ConsesLow.nth(new_surv_end, combo);
                    final SubLObject start_at_startP_$2 = exhaustedP2;
                    if (pph_string_combo.NIL != subcombo2) {
                        thread.resetMultipleValues();
                        final SubLObject okP2 = try_one_string_combo_token(subcombo2, tokens, my_start, my_end, start_at_startP_$2, case_sensitiveP);
                        final SubLObject exhaustedP_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_string_combo.NIL != okP2) {
                            new_survivors = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((pph_string_combo.NIL != exhaustedP_$3) ? my_end : my_start, new_surv_end, exhaustedP_$3, initialP), new_survivors);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_string_combo.$list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            }
            survivors = new_survivors;
        }
        if (pph_string_combo.NIL != list_utilities.empty_list_p(survivors)) {
            return (SubLObject)pph_string_combo.NIL;
        }
        SubLObject current2;
        final SubLObject datum2 = current2 = survivors.first();
        SubLObject surv_start = (SubLObject)pph_string_combo.NIL;
        SubLObject surv_end2 = (SubLObject)pph_string_combo.NIL;
        SubLObject exhaustedP = (SubLObject)pph_string_combo.NIL;
        SubLObject initialP2 = (SubLObject)pph_string_combo.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_string_combo.$list21);
        surv_start = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_string_combo.$list21);
        surv_end2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_string_combo.$list21);
        exhaustedP = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)pph_string_combo.$list21);
        initialP2 = current2.first();
        current2 = current2.rest();
        if (pph_string_combo.NIL != current2) {
            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)pph_string_combo.$list21);
            return (SubLObject)pph_string_combo.NIL;
        }
        final SubLObject finalP = (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(combo).eql(number_utilities.f_1X(surv_end2)) && pph_string_combo.NIL != exhaustedP);
        if (pph_string_combo.NIL != initialP2 && pph_string_combo.NIL != finalP) {
            return (SubLObject)pph_string_combo.$kw8$COMPLETE;
        }
        if (pph_string_combo.NIL != initialP2) {
            return (SubLObject)pph_string_combo.$kw9$INITIAL;
        }
        if (pph_string_combo.NIL != finalP) {
            return (SubLObject)pph_string_combo.$kw10$FINAL;
        }
        return (SubLObject)pph_string_combo.$kw11$MEDIAL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 13006L)
    public static SubLObject try_one_string_combo_token(final SubLObject subcombo, final SubLObject tokens, final SubLObject start, final SubLObject my_end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == pph_string_combo.UNPROVIDED) {
            case_sensitiveP = (SubLObject)pph_string_combo.NIL;
        }
        SubLObject okP = (SubLObject)pph_string_combo.NIL;
        SubLObject exhaustedP = (SubLObject)pph_string_combo.NIL;
        final SubLObject pcase_var = pph_string_combo_generates_token_sequenceP(subcombo, tokens, start, my_end, start_at_startP, case_sensitiveP);
        if (pcase_var.eql((SubLObject)pph_string_combo.$kw8$COMPLETE)) {
            okP = (SubLObject)pph_string_combo.T;
            exhaustedP = (SubLObject)pph_string_combo.T;
        }
        else if (pcase_var.eql((SubLObject)pph_string_combo.$kw10$FINAL)) {
            if (pph_string_combo.NIL == start_at_startP) {
                okP = (SubLObject)pph_string_combo.T;
                exhaustedP = (SubLObject)pph_string_combo.T;
            }
        }
        else if (pcase_var.eql((SubLObject)pph_string_combo.$kw11$MEDIAL)) {
            if (pph_string_combo.NIL == start_at_startP) {
                okP = (SubLObject)pph_string_combo.T;
            }
        }
        else if (pcase_var.eql((SubLObject)pph_string_combo.$kw9$INITIAL)) {
            okP = (SubLObject)pph_string_combo.T;
        }
        return Values.values(okP, exhaustedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 13548L)
    public static SubLObject pph_phrase_string_combo_internal(final SubLObject phrase, final SubLObject add_tagsP, final SubLObject top_levelP) {
        final SubLObject variants = pph_phrase_string_combos(phrase, add_tagsP, top_levelP);
        return (pph_string_combo.NIL != list_utilities.singletonP(variants)) ? list_utilities.only_one(variants) : set_utilities.construct_set_from_list(variants, (SubLObject)pph_string_combo.UNPROVIDED, (SubLObject)pph_string_combo.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-string-combo.lisp", position = 13802L)
    public static SubLObject pph_phrase_string_combos(final SubLObject phrase, final SubLObject add_tagsP, final SubLObject top_levelP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combos = (SubLObject)pph_string_combo.NIL;
        if (pph_string_combo.NIL != pph_phrase.pph_phrase_doneP(phrase) && pph_string_combo.NIL == pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), (SubLObject)pph_string_combo.UNPROVIDED)) {
            final SubLObject item_var = pph_phrase.pph_phrase_string(phrase, add_tagsP);
            if (pph_string_combo.NIL == conses_high.member(item_var, combos, Symbols.symbol_function((SubLObject)pph_string_combo.EQUALP), Symbols.symbol_function((SubLObject)pph_string_combo.IDENTITY))) {
                combos = (SubLObject)ConsesLow.cons(item_var, combos);
            }
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_alternatives(phrase);
            SubLObject alternative = (SubLObject)pph_string_combo.NIL;
            alternative = cdolist_list_var.first();
            while (pph_string_combo.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$4 = pph_phrase_string_combos(alternative, add_tagsP, (SubLObject)pph_string_combo.NIL);
                SubLObject alternative_combo = (SubLObject)pph_string_combo.NIL;
                alternative_combo = cdolist_list_var_$4.first();
                while (pph_string_combo.NIL != cdolist_list_var_$4) {
                    final SubLObject item_var2 = alternative_combo;
                    if (pph_string_combo.NIL == conses_high.member(item_var2, combos, Symbols.symbol_function((SubLObject)pph_string_combo.EQUALP), Symbols.symbol_function((SubLObject)pph_string_combo.IDENTITY))) {
                        combos = (SubLObject)ConsesLow.cons(item_var2, combos);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    alternative_combo = cdolist_list_var_$4.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                alternative = cdolist_list_var.first();
            }
            if (pph_string_combo.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                SubLObject dtr_combo = (SubLObject)pph_string_combo.NIL;
                SubLObject dtr_num = (SubLObject)pph_string_combo.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_string_combo.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_string_combo.NIL, v_iteration = (SubLObject)pph_string_combo.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_string_combo.ONE_INTEGER)) {
                        element_num = ((pph_string_combo.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_string_combo.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (pph_string_combo.NIL != pph_phrase.pph_meta_phrase_p(dtr)) {
                            if (pph_string_combo.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_string_combo.ONE_INTEGER) && pph_string_combo.NIL == pph_error.suppress_pph_warningsP()) {
                                Errors.warn((SubLObject)pph_string_combo.$str24$Ignoring_possible_variants_for_me, dtr);
                                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            dtr_combo = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_string(dtr, add_tagsP), dtr_combo);
                        }
                        else {
                            dtr_combo = (SubLObject)ConsesLow.cons(pph_phrase_string_combo_internal(dtr, add_tagsP, (SubLObject)pph_string_combo.NIL), dtr_combo);
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_string_combo.ONE_INTEGER);
                    }
                }
                combos = (SubLObject)ConsesLow.cons(Sequences.nreverse(dtr_combo), combos);
            }
        }
        return combos;
    }
    
    public static SubLObject declare_pph_string_combo_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_comboP", "PPH-STRING-COMBO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "explode_pph_string_combo", "EXPLODE-PPH-STRING-COMBO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "explode_pph_string_combo_int", "EXPLODE-PPH-STRING-COMBO-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_size_estimate", "PPH-STRING-COMBO-SIZE-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_max_word_count_estimate", "PPH-STRING-COMBO-MAX-WORD-COUNT-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_min_word_count_estimate", "PPH-STRING-COMBO-MIN-WORD-COUNT-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_unsubsumed_subphrases", "PPH-STRING-COMBO-UNSUBSUMED-SUBPHRASES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_phrase_string_combo", "PPH-PHRASE-STRING-COMBO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_has_sentential_forceP", "PPH-STRING-COMBO-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_has_sentence_initial_forceP", "PPH-STRING-COMBO-HAS-SENTENCE-INITIAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_has_sentence_final_forceP", "PPH-STRING-COMBO-HAS-SENTENCE-FINAL-FORCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_add_sentential_force", "PPH-STRING-COMBO-ADD-SENTENTIAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_add_sentence_initial_force", "PPH-STRING-COMBO-ADD-SENTENCE-INITIAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_add_sentence_final_force", "PPH-STRING-COMBO-ADD-SENTENCE-FINAL-FORCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_generates_token_sequenceP", "PPH-STRING-COMBO-GENERATES-TOKEN-SEQUENCE?", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_generates_token_sequenceP", "PPH-STRING-GENERATES-TOKEN-SEQUENCE?", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_string_combo_token_list_generates_token_sequenceP", "PPH-STRING-COMBO-TOKEN-LIST-GENERATES-TOKEN-SEQUENCE?", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "try_one_string_combo_token", "TRY-ONE-STRING-COMBO-TOKEN", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_phrase_string_combo_internal", "PPH-PHRASE-STRING-COMBO-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_string_combo", "pph_phrase_string_combos", "PPH-PHRASE-STRING-COMBOS", 3, 0, false);
        return (SubLObject)pph_string_combo.NIL;
    }
    
    public static SubLObject init_pph_string_combo_file() {
        return (SubLObject)pph_string_combo.NIL;
    }
    
    public static SubLObject setup_pph_string_combo_file() {
        generic_testing.define_test_case_table_int((SubLObject)pph_string_combo.$sym12$PPH_STRING_GENERATES_TOKEN_SEQUENCE_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string_combo.$kw13$TEST, pph_string_combo.NIL, pph_string_combo.$kw14$OWNER, pph_string_combo.NIL, pph_string_combo.$kw15$CLASSES, pph_string_combo.NIL, pph_string_combo.$kw16$KB, pph_string_combo.$kw17$TINY, pph_string_combo.$kw18$WORKING_, pph_string_combo.T }), (SubLObject)pph_string_combo.$list19);
        generic_testing.define_test_case_table_int((SubLObject)pph_string_combo.$sym22$PPH_STRING_COMBO_TOKEN_LIST_GENERATES_TOKEN_SEQUENCE_, (SubLObject)ConsesLow.list(new SubLObject[] { pph_string_combo.$kw13$TEST, pph_string_combo.NIL, pph_string_combo.$kw14$OWNER, pph_string_combo.NIL, pph_string_combo.$kw15$CLASSES, pph_string_combo.NIL, pph_string_combo.$kw16$KB, pph_string_combo.$kw17$TINY, pph_string_combo.$kw18$WORKING_, pph_string_combo.T }), (SubLObject)pph_string_combo.$list23);
        return (SubLObject)pph_string_combo.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_string_combo_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_string_combo_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_string_combo_file();
    }
    
    static {
        me = (SubLFile)new pph_string_combo();
        $sym0$PPH_STRING_COMBO_ = SubLObjectFactory.makeSymbol("PPH-STRING-COMBO?");
        $sym1$PPH_BUNGE = SubLObjectFactory.makeSymbol("PPH-BUNGE");
        $sym2$_ = SubLObjectFactory.makeSymbol(">");
        $sym3$INTERVAL_SPAN_LENGTH = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-LENGTH");
        $sym4$INTERVAL_SPAN_OVERLAPS_ = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-OVERLAPS?");
        $sym5$INTERVAL_SPAN_PRECEDES_ = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-PRECEDES?");
        $kw6$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw7$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw8$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $kw9$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
        $kw10$FINAL = SubLObjectFactory.makeKeyword("FINAL");
        $kw11$MEDIAL = SubLObjectFactory.makeKeyword("MEDIAL");
        $sym12$PPH_STRING_GENERATES_TOKEN_SEQUENCE_ = SubLObjectFactory.makeSymbol("PPH-STRING-GENERATES-TOKEN-SEQUENCE?");
        $kw13$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw14$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw15$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw16$KB = SubLObjectFactory.makeKeyword("KB");
        $kw17$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw18$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list19 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.SIX_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.THREE_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.THREE_INTEGER, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat is on the mat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("dog")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.ONE_INTEGER, (SubLObject)pph_string_combo.T, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.ONE_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")) });
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-START"), (SubLObject)SubLObjectFactory.makeSymbol("SURV-END"), (SubLObject)SubLObjectFactory.makeSymbol("EXHAUSTED?"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL?"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SURV-START"), (SubLObject)SubLObjectFactory.makeSymbol("SURV-END"), (SubLObject)SubLObjectFactory.makeSymbol("EXHAUSTED?"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL?"));
        $sym22$PPH_STRING_COMBO_TOKEN_LIST_GENERATES_TOKEN_SEQUENCE_ = SubLObjectFactory.makeSymbol("PPH-STRING-COMBO-TOKEN-LIST-GENERATES-TOKEN-SEQUENCE?");
        $list23 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.SIX_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.SIX_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.THREE_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.THREE_INTEGER, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("FINAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.NIL), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the pretty cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("cat"), (SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("mat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"), (SubLObject)SubLObjectFactory.makeString("dog")), (SubLObject)pph_string_combo.ZERO_INTEGER, (SubLObject)pph_string_combo.TWO_INTEGER, (SubLObject)pph_string_combo.T), (SubLObject)pph_string_combo.NIL) });
        $str24$Ignoring_possible_variants_for_me = SubLObjectFactory.makeString("Ignoring possible variants for meta phrase~% ~S");
    }
}

/*

	Total time: 157 ms
	
*/