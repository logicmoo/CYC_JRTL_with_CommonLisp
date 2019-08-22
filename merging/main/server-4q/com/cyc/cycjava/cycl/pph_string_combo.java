package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_string_combo extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new pph_string_combo();

    public static final String myName = "com.cyc.cycjava_2.cycl.pph_string_combo";


    private static final SubLSymbol $sym0$PPH_STRING_COMBO_ = makeSymbol("PPH-STRING-COMBO?");

    private static final SubLSymbol PPH_BUNGE = makeSymbol("PPH-BUNGE");

    private static final SubLSymbol $sym2$_ = makeSymbol(">");

    private static final SubLSymbol INTERVAL_SPAN_LENGTH = makeSymbol("INTERVAL-SPAN-LENGTH");

    private static final SubLSymbol $sym4$INTERVAL_SPAN_OVERLAPS_ = makeSymbol("INTERVAL-SPAN-OVERLAPS?");

    private static final SubLSymbol $sym5$INTERVAL_SPAN_PRECEDES_ = makeSymbol("INTERVAL-SPAN-PRECEDES?");













    private static final SubLSymbol $sym12$PPH_STRING_GENERATES_TOKEN_SEQUENCE_ = makeSymbol("PPH-STRING-GENERATES-TOKEN-SEQUENCE?");













    private static final SubLList $list19 = list(new SubLObject[]{ list(list(makeString("the cat is on the mat"), list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, SIX_INTEGER, T), makeKeyword("COMPLETE")), list(list(makeString("the cat is on the mat"), list(makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, THREE_INTEGER, T), NIL), list(list(makeString("the cat is on the mat"), list(makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, THREE_INTEGER, NIL), makeKeyword("FINAL")), list(list(makeString("the cat is on the mat"), list(makeString("on"), makeString("the")), ZERO_INTEGER, TWO_INTEGER, NIL), makeKeyword("MEDIAL")), list(list(makeString("the cat is on the mat"), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T), makeKeyword("INITIAL")), list(list(makeString("The cat is on the mat"), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T, NIL), makeKeyword("INITIAL")), list(list(makeString("The cat is on the mat"), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T, T), NIL), list(list(makeString("the cat is on the mat"), list(makeString("the"), makeString("dog")), ZERO_INTEGER, TWO_INTEGER, T), NIL), list(list(makeString("the cat"), list(makeString("the"), makeString("cat")), ZERO_INTEGER, ONE_INTEGER, T, NIL), makeKeyword("INITIAL")), list(list(makeString("the"), list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, ONE_INTEGER, T), makeKeyword("COMPLETE")) });

    private static final SubLList $list20 = list(makeSymbol("MY-START"), makeSymbol("SURV-END"), makeSymbol("EXHAUSTED?"), makeSymbol("INITIAL?"));

    private static final SubLList $list21 = list(makeSymbol("SURV-START"), makeSymbol("SURV-END"), makeSymbol("EXHAUSTED?"), makeSymbol("INITIAL?"));

    private static final SubLSymbol $sym22$PPH_STRING_COMBO_TOKEN_LIST_GENERATES_TOKEN_SEQUENCE_ = makeSymbol("PPH-STRING-COMBO-TOKEN-LIST-GENERATES-TOKEN-SEQUENCE?");

    private static final SubLList $list23 = list(new SubLObject[]{ list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, SIX_INTEGER, T), makeKeyword("COMPLETE")), list(list(list(makeString("the cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, SIX_INTEGER, T), makeKeyword("COMPLETE")), list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, THREE_INTEGER, T), NIL), list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("on"), makeString("the"), makeString("mat")), ZERO_INTEGER, THREE_INTEGER, NIL), makeKeyword("FINAL")), list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("on"), makeString("the")), ZERO_INTEGER, TWO_INTEGER, NIL), makeKeyword("MEDIAL")), list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T), makeKeyword("INITIAL")), list(list(list(makeString("the cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T), makeKeyword("INITIAL")), list(list(list(makeString("the pretty cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("cat")), ZERO_INTEGER, TWO_INTEGER, T), NIL), list(list(list(makeString("the"), makeString("cat"), makeString("is"), makeString("on"), makeString("the"), makeString("mat")), list(makeString("the"), makeString("dog")), ZERO_INTEGER, TWO_INTEGER, T), NIL) });

    private static final SubLString $str24$Ignoring_possible_variants_for_me = makeString("Ignoring possible variants for meta phrase~% ~S");

    public static SubLObject pph_string_comboP(final SubLObject v_object) {
        if (NIL != pph_string.pph_string_p(v_object)) {
            return T;
        }
        if (NIL != list_utilities.non_empty_list_p(v_object)) {
            return sublisp_null(list_utilities.find_if_not($sym0$PPH_STRING_COMBO_, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != set.set_p(v_object)) {
            return sublisp_null(set_utilities.set_find_if_not($sym0$PPH_STRING_COMBO_, v_object, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject explode_pph_string_combo(final SubLObject combo, SubLObject max_number) {
        if (max_number == UNPROVIDED) {
            max_number = number_utilities.positive_infinity();
        }
        return explode_pph_string_combo_int(combo, max_number, ZERO_INTEGER);
    }

    public static SubLObject explode_pph_string_combo_int(final SubLObject combo, final SubLObject max_number, SubLObject sofar) {
        if (max_number.isNumber() && sofar.numGE(max_number)) {
            return NIL;
        }
        SubLObject strings = NIL;
        SubLObject enoughP = NIL;
        if (NIL != pph_string.pph_string_p(combo)) {
            strings = cons(combo, strings);
            sofar = add(sofar, ONE_INTEGER);
        } else
            if (NIL != list_utilities.non_empty_list_p(combo)) {
                SubLObject pieces = NIL;
                SubLObject cdolist_list_var = combo;
                SubLObject subcombo = NIL;
                subcombo = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    pieces = cons(explode_pph_string_combo_int(subcombo, max_number, sofar), pieces);
                    cdolist_list_var = cdolist_list_var.rest();
                    subcombo = cdolist_list_var.first();
                } 
                if (NIL == enoughP) {
                    SubLObject csome_list_var = Mapping.mapcar(PPH_BUNGE, list_utilities.cartesian_product(nreverse(pieces), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    SubLObject string = NIL;
                    string = csome_list_var.first();
                    while ((NIL == enoughP) && (NIL != csome_list_var)) {
                        strings = cons(string, strings);
                        sofar = add(sofar, ONE_INTEGER);
                        enoughP = makeBoolean(max_number.isNumber() && sofar.numGE(max_number));
                        csome_list_var = csome_list_var.rest();
                        string = csome_list_var.first();
                    } 
                }
            } else
                if (NIL != set.set_p(combo)) {
                    final SubLObject set_contents_var = set.do_set_internal(combo);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject subcombo2;
                    SubLObject csome_list_var2;
                    SubLObject string2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) && (NIL == enoughP)) {
                            csome_list_var2 = explode_pph_string_combo_int(subcombo2, max_number, sofar);
                            string2 = NIL;
                            string2 = csome_list_var2.first();
                            while ((NIL == enoughP) && (NIL != csome_list_var2)) {
                                if (NIL == member(string2, strings, symbol_function(EQUAL), UNPROVIDED)) {
                                    strings = cons(string2, strings);
                                    sofar = add(sofar, ONE_INTEGER);
                                    enoughP = makeBoolean(max_number.isNumber() && sofar.numGE(max_number));
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                string2 = csome_list_var2.first();
                            } 
                        }
                    }
                }


        return values(strings, sofar);
    }

    public static SubLObject pph_string_combo_size_estimate(final SubLObject combo) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return ONE_INTEGER;
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = ONE_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = NIL;
            subcombo = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                size = multiply(size, pph_string_combo_size_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            } 
            return size;
        }
        if (NIL != set.set_p(combo)) {
            SubLObject size = ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    size = add(size, pph_string_combo_size_estimate(subcombo2));
                }
            }
            return size;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_max_word_count_estimate(final SubLObject combo) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return number_utilities.f_1X(count(CHAR_space, combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = ZERO_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = NIL;
            subcombo = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                size = add(size, pph_string_combo_max_word_count_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            } 
            return size;
        }
        if (NIL != set.set_p(combo)) {
            SubLObject size = ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            SubLObject this_size;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    this_size = pph_string_combo_size_estimate(subcombo2);
                    if (this_size.numG(size)) {
                        size = this_size;
                    }
                }
            }
            return size;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_min_word_count_estimate(final SubLObject combo) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return number_utilities.f_1X(count(CHAR_space, combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            SubLObject size = ZERO_INTEGER;
            SubLObject cdolist_list_var = combo;
            SubLObject subcombo = NIL;
            subcombo = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                size = add(size, pph_string_combo_min_word_count_estimate(subcombo));
                cdolist_list_var = cdolist_list_var.rest();
                subcombo = cdolist_list_var.first();
            } 
            return size;
        }
        if (NIL != set.set_p(combo)) {
            SubLObject size = NIL;
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo2;
            SubLObject this_size;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo2 = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo2)) {
                    this_size = pph_string_combo_size_estimate(subcombo2);
                    if ((NIL == size) || this_size.numL(size)) {
                        size = this_size;
                    }
                }
            }
            return size;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_unsubsumed_subphrases(final SubLObject combo, final SubLObject phrase, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        final SubLObject tokens = string_utilities.string_tokenize(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject token_count = length(tokens);
        SubLObject v_ranges = NIL;
        SubLObject end_var;
        SubLObject i;
        SubLObject end_var_$1;
        SubLObject j;
        for (end_var = token_count, i = NIL, i = ZERO_INTEGER; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
            for (end_var_$1 = number_utilities.f_1X(token_count), j = NIL, j = ONE_INTEGER; !j.numGE(end_var_$1); j = number_utilities.f_1X(j)) {
                if (j.numG(i) && (NIL != pph_string_combo_generates_token_sequenceP(combo, tokens, i, j, NIL, case_sensitiveP))) {
                    v_ranges = cons(interval_span.get_interval_span(i, j), v_ranges);
                }
            }
        }
        SubLObject remaining_ranges = Sort.sort(v_ranges, symbol_function($sym2$_), INTERVAL_SPAN_LENGTH);
        SubLObject best_ranges = NIL;
        SubLObject phrases = NIL;
        while (NIL != remaining_ranges) {
            final SubLObject longest = remaining_ranges.first();
            remaining_ranges = remaining_ranges.rest();
            if (NIL == find(longest, best_ranges, $sym4$INTERVAL_SPAN_OVERLAPS_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                best_ranges = cons(longest, best_ranges);
            }
        } 
        SubLObject cdolist_list_var = Sort.sort(best_ranges, $sym5$INTERVAL_SPAN_PRECEDES_, UNPROVIDED);
        SubLObject range = NIL;
        range = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            phrases = cons(string_utilities.bunge(subseq(tokens, interval_span.interval_span_start(range), interval_span.interval_span_end(range)), UNPROVIDED), phrases);
            cdolist_list_var = cdolist_list_var.rest();
            range = cdolist_list_var.first();
        } 
        return nreverse(phrases);
    }

    public static SubLObject pph_phrase_string_combo(final SubLObject phrase, SubLObject add_tagsP) {
        if (add_tagsP == UNPROVIDED) {
            add_tagsP = eq($HTML, pph_vars.$paraphrase_mode$.getDynamicValue());
        }
        return pph_phrase_string_combo_internal(phrase, add_tagsP, T);
    }

    public static SubLObject pph_string_combo_has_sentential_forceP(final SubLObject combo, final SubLObject force) {
        return makeBoolean((NIL != pph_string_combo_has_sentence_initial_forceP(combo, force)) && (NIL != pph_string_combo_has_sentence_final_forceP(combo, force)));
    }

    public static SubLObject pph_string_combo_has_sentence_initial_forceP(final SubLObject combo, final SubLObject force) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_has_sentence_initial_forceP(combo, force);
        }
        if (combo.isList()) {
            return pph_string_combo_has_sentence_initial_forceP(combo.first(), force);
        }
        if (NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, subcombo)) && (NIL == pph_string_combo_has_sentence_initial_forceP(subcombo, force))) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_has_sentence_final_forceP(final SubLObject combo, final SubLObject force) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_has_sentence_final_forceP(combo, force);
        }
        if (combo.isList()) {
            return pph_string_combo_has_sentence_final_forceP(combo.first(), force);
        }
        if (NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, subcombo)) && (NIL == pph_string_combo_has_sentence_final_forceP(subcombo, force))) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_add_sentential_force(final SubLObject combo, final SubLObject force) {
        return pph_string_combo_add_sentence_initial_force(pph_string_combo_add_sentence_final_force(combo, force), force);
    }

    public static SubLObject pph_string_combo_add_sentence_initial_force(final SubLObject combo, final SubLObject force) {
        if (NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_add_sentence_initial_force(combo, force);
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            return cons(pph_string_combo_add_sentence_initial_force(combo.first(), force), combo.rest());
        }
        if (NIL != set.set_p(combo)) {
            final SubLObject result = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    set.set_add(pph_string_combo_add_sentence_initial_force(subcombo, force), result);
                }
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_add_sentence_final_force(final SubLObject combo, final SubLObject force) {
        if (force.eql($NONE)) {
            return combo;
        }
        if (NIL != pph_string.pph_string_p(combo)) {
            return pph_phrase_resolution.pph_string_add_sentence_final_force(combo, force);
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            return list_utilities.replace_last(combo, pph_string_combo_add_sentence_final_force(list_utilities.last_one(combo), force));
        }
        if (NIL != set.set_p(combo)) {
            final SubLObject result = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    set.set_add(pph_string_combo_add_sentence_final_force(subcombo, force), result);
                }
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject pph_string_combo_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, SubLObject start, SubLObject end, SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (start_at_startP == UNPROVIDED) {
            start_at_startP = NIL;
        }
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (NIL == end) {
            end = length(tokens);
        }
        if (NIL != pph_string.pph_string_p(combo)) {
            return pph_string_generates_token_sequenceP(combo, tokens, start, end, start_at_startP, case_sensitiveP);
        }
        if (NIL != list_utilities.non_empty_list_p(combo)) {
            return pph_string_combo_token_list_generates_token_sequenceP(combo, tokens, start, end, start_at_startP, case_sensitiveP);
        }
        if (NIL != set.set_p(combo)) {
            final SubLObject set_contents_var = set.do_set_internal(combo);
            SubLObject basis_object;
            SubLObject state;
            SubLObject subcombo;
            SubLObject subcombo_result;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                subcombo = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, subcombo)) {
                    subcombo_result = pph_string_combo_generates_token_sequenceP(subcombo, tokens, start, end, start_at_startP, case_sensitiveP);
                    if (NIL != subcombo_result) {
                        return subcombo_result;
                    }
                }
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject pph_string_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, final SubLObject start, final SubLObject end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        final SubLObject combo_tokens = pph_string.pph_string_tokenize(combo, UNPROVIDED);
        if (combo_tokens.equal(subseq(tokens, start, end))) {
            return $COMPLETE;
        }
        final SubLObject test = (NIL != case_sensitiveP) ? symbol_function(EQUAL) : symbol_function(EQUALP);
        final SubLObject search_result = search(tokens, combo_tokens, test, symbol_function(IDENTITY), start, end, UNPROVIDED, UNPROVIDED);
        final SubLObject initialP = eql(ZERO_INTEGER, search_result);
        final SubLObject finalP = eql(search_result, subtract(length(combo_tokens), subtract(end, start)));
        return NIL == search_result ? NIL : (NIL != initialP) && (NIL != finalP) ? $COMPLETE : NIL != initialP ? $INITIAL : NIL != start_at_startP ? NIL : NIL != finalP ? $FINAL : $MEDIAL;
    }

    public static SubLObject pph_string_combo_token_list_generates_token_sequenceP(final SubLObject combo, final SubLObject tokens, final SubLObject start, final SubLObject end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(combo)) {
            return pph_string_combo_generates_token_sequenceP(list_utilities.only_one(combo), tokens, start, end, start_at_startP, case_sensitiveP);
        }
        SubLObject my_end = number_utilities.f_1X(start);
        SubLObject survivors = NIL;
        SubLObject list_var = NIL;
        SubLObject subcombo = NIL;
        SubLObject i = NIL;
        list_var = combo;
        subcombo = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , subcombo = list_var.first() , i = add(ONE_INTEGER, i)) {
            if ((NIL == start_at_startP) || (!i.numG(ZERO_INTEGER))) {
                thread.resetMultipleValues();
                final SubLObject okP = try_one_string_combo_token(subcombo, tokens, start, my_end, start_at_startP, case_sensitiveP);
                final SubLObject exhaustedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != okP) {
                    survivors = cons(list(NIL != exhaustedP ? number_utilities.f_1X(start) : start, i, exhaustedP, eql(i, ZERO_INTEGER)), survivors);
                }
            }
        }
        while ((NIL != survivors) && my_end.numL(end)) {
            my_end = add(my_end, ONE_INTEGER);
            SubLObject new_survivors = NIL;
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = NIL;
            survivor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = survivor;
                SubLObject my_start = NIL;
                SubLObject surv_end = NIL;
                SubLObject exhaustedP2 = NIL;
                SubLObject initialP = NIL;
                destructuring_bind_must_consp(current, datum, $list20);
                my_start = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                surv_end = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                exhaustedP2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list20);
                initialP = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject new_surv_end = (NIL != exhaustedP2) ? number_utilities.f_1X(surv_end) : surv_end;
                    final SubLObject subcombo2 = nth(new_surv_end, combo);
                    final SubLObject start_at_startP_$2 = exhaustedP2;
                    if (NIL != subcombo2) {
                        thread.resetMultipleValues();
                        final SubLObject okP2 = try_one_string_combo_token(subcombo2, tokens, my_start, my_end, start_at_startP_$2, case_sensitiveP);
                        final SubLObject exhaustedP_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != okP2) {
                            new_survivors = cons(list(NIL != exhaustedP_$3 ? my_end : my_start, new_surv_end, exhaustedP_$3, initialP), new_survivors);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list20);
                }
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            } 
            survivors = new_survivors;
        } 
        if (NIL != list_utilities.empty_list_p(survivors)) {
            return NIL;
        }
        SubLObject current2;
        final SubLObject datum2 = current2 = survivors.first();
        SubLObject surv_start = NIL;
        SubLObject surv_end2 = NIL;
        SubLObject exhaustedP = NIL;
        SubLObject initialP2 = NIL;
        destructuring_bind_must_consp(current2, datum2, $list21);
        surv_start = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list21);
        surv_end2 = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list21);
        exhaustedP = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list21);
        initialP2 = current2.first();
        current2 = current2.rest();
        if (NIL != current2) {
            cdestructuring_bind_error(datum2, $list21);
            return NIL;
        }
        final SubLObject finalP = makeBoolean(length(combo).eql(number_utilities.f_1X(surv_end2)) && (NIL != exhaustedP));
        if ((NIL != initialP2) && (NIL != finalP)) {
            return $COMPLETE;
        }
        if (NIL != initialP2) {
            return $INITIAL;
        }
        if (NIL != finalP) {
            return $FINAL;
        }
        return $MEDIAL;
    }

    public static SubLObject try_one_string_combo_token(final SubLObject subcombo, final SubLObject tokens, final SubLObject start, final SubLObject my_end, final SubLObject start_at_startP, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        SubLObject okP = NIL;
        SubLObject exhaustedP = NIL;
        final SubLObject pcase_var = pph_string_combo_generates_token_sequenceP(subcombo, tokens, start, my_end, start_at_startP, case_sensitiveP);
        if (pcase_var.eql($COMPLETE)) {
            okP = T;
            exhaustedP = T;
        } else
            if (pcase_var.eql($FINAL)) {
                if (NIL == start_at_startP) {
                    okP = T;
                    exhaustedP = T;
                }
            } else
                if (pcase_var.eql($MEDIAL)) {
                    if (NIL == start_at_startP) {
                        okP = T;
                    }
                } else
                    if (pcase_var.eql($INITIAL)) {
                        okP = T;
                    }



        return values(okP, exhaustedP);
    }

    public static SubLObject pph_phrase_string_combo_internal(final SubLObject phrase, final SubLObject add_tagsP, final SubLObject top_levelP) {
        final SubLObject variants = pph_phrase_string_combos(phrase, add_tagsP, top_levelP);
        return NIL != list_utilities.singletonP(variants) ? list_utilities.only_one(variants) : set_utilities.construct_set_from_list(variants, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_phrase_string_combos(final SubLObject phrase, final SubLObject add_tagsP, final SubLObject top_levelP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combos = NIL;
        if ((NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL == pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), UNPROVIDED))) {
            final SubLObject item_var = pph_phrase.pph_phrase_string(phrase, add_tagsP);
            if (NIL == member(item_var, combos, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                combos = cons(item_var, combos);
            }
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_alternatives(phrase);
            SubLObject alternative = NIL;
            alternative = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$4 = pph_phrase_string_combos(alternative, add_tagsP, NIL);
                SubLObject alternative_combo = NIL;
                alternative_combo = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    final SubLObject item_var2 = alternative_combo;
                    if (NIL == member(item_var2, combos, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        combos = cons(item_var2, combos);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    alternative_combo = cdolist_list_var_$4.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                alternative = cdolist_list_var.first();
            } 
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                SubLObject dtr_combo = NIL;
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
                        if (NIL != pph_phrase.pph_meta_phrase_p(dtr)) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str24$Ignoring_possible_variants_for_me, dtr);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            dtr_combo = cons(pph_phrase.pph_phrase_string(dtr, add_tagsP), dtr_combo);
                        } else {
                            dtr_combo = cons(pph_phrase_string_combo_internal(dtr, add_tagsP, NIL), dtr_combo);
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
                combos = cons(nreverse(dtr_combo), combos);
            }
        }
        return combos;
    }

    public static SubLObject declare_pph_string_combo_file() {
        declareFunction("pph_string_comboP", "PPH-STRING-COMBO?", 1, 0, false);
        declareFunction("explode_pph_string_combo", "EXPLODE-PPH-STRING-COMBO", 1, 1, false);
        declareFunction("explode_pph_string_combo_int", "EXPLODE-PPH-STRING-COMBO-INT", 3, 0, false);
        declareFunction("pph_string_combo_size_estimate", "PPH-STRING-COMBO-SIZE-ESTIMATE", 1, 0, false);
        declareFunction("pph_string_combo_max_word_count_estimate", "PPH-STRING-COMBO-MAX-WORD-COUNT-ESTIMATE", 1, 0, false);
        declareFunction("pph_string_combo_min_word_count_estimate", "PPH-STRING-COMBO-MIN-WORD-COUNT-ESTIMATE", 1, 0, false);
        declareFunction("pph_string_combo_unsubsumed_subphrases", "PPH-STRING-COMBO-UNSUBSUMED-SUBPHRASES", 2, 1, false);
        declareFunction("pph_phrase_string_combo", "PPH-PHRASE-STRING-COMBO", 1, 1, false);
        declareFunction("pph_string_combo_has_sentential_forceP", "PPH-STRING-COMBO-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_combo_has_sentence_initial_forceP", "PPH-STRING-COMBO-HAS-SENTENCE-INITIAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_combo_has_sentence_final_forceP", "PPH-STRING-COMBO-HAS-SENTENCE-FINAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_combo_add_sentential_force", "PPH-STRING-COMBO-ADD-SENTENTIAL-FORCE", 2, 0, false);
        declareFunction("pph_string_combo_add_sentence_initial_force", "PPH-STRING-COMBO-ADD-SENTENCE-INITIAL-FORCE", 2, 0, false);
        declareFunction("pph_string_combo_add_sentence_final_force", "PPH-STRING-COMBO-ADD-SENTENCE-FINAL-FORCE", 2, 0, false);
        declareFunction("pph_string_combo_generates_token_sequenceP", "PPH-STRING-COMBO-GENERATES-TOKEN-SEQUENCE?", 2, 4, false);
        declareFunction("pph_string_generates_token_sequenceP", "PPH-STRING-GENERATES-TOKEN-SEQUENCE?", 5, 1, false);
        declareFunction("pph_string_combo_token_list_generates_token_sequenceP", "PPH-STRING-COMBO-TOKEN-LIST-GENERATES-TOKEN-SEQUENCE?", 5, 1, false);
        declareFunction("try_one_string_combo_token", "TRY-ONE-STRING-COMBO-TOKEN", 5, 1, false);
        declareFunction("pph_phrase_string_combo_internal", "PPH-PHRASE-STRING-COMBO-INTERNAL", 3, 0, false);
        declareFunction("pph_phrase_string_combos", "PPH-PHRASE-STRING-COMBOS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_string_combo_file() {
        return NIL;
    }

    public static SubLObject setup_pph_string_combo_file() {
        define_test_case_table_int($sym12$PPH_STRING_GENERATES_TOKEN_SEQUENCE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list19);
        define_test_case_table_int($sym22$PPH_STRING_COMBO_TOKEN_LIST_GENERATES_TOKEN_SEQUENCE_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list23);
        return NIL;
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

    
}

/**
 * Total time: 157 ms
 */
