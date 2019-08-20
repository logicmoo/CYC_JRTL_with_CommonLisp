/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PREPROCESSOR
 * source file: /cyc/top/cycl/preprocessor.lisp
 * created:     2019/07/03 17:38:15
 */
public final class preprocessor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new preprocessor();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $preprocess_apostrophe_table$ = makeSymbol("*PREPROCESS-APOSTROPHE-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $preprocess_contraction_suffixes$ = makeSymbol("*PREPROCESS-CONTRACTION-SUFFIXES*");

    static private final SubLSymbol $sym1$WORD_BREAK_CHAR_ = makeSymbol("WORD-BREAK-CHAR?");

    static private final SubLString $str2$______________________________ = makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");

    static private final SubLList $list3 = list(new SubLObject[]{ list(list(makeString("'"), makeString("d")), makeSymbol("->"), list(makeString("'d"))), list(list(makeString("'"), makeString("m")), makeSymbol("->"), list(makeString("'m"))), list(list(makeString("'"), makeString("s")), makeSymbol("->"), list(makeString("'s"))), list(list(makeString("'"), makeString("t")), makeSymbol("->"), list(makeString("'t"))), list(list(makeString("'"), makeString("ll")), makeSymbol("->"), list(makeString("'ll"))), list(list(makeString("'"), makeString("re")), makeSymbol("->"), list(makeString("'re"))), list(list(makeString("'"), makeString("ve")), makeSymbol("->"), list(makeString("'ve"))), list(list(makeString("'"), makeString("'")), makeSymbol("->"), list(makeString("''"))), list(list(makeString("`"), makeString("`")), makeSymbol("->"), list(makeString("``"))) });

    static private final SubLList $list4 = list(makeSymbol("OLD-SEQ"), makeSymbol("->"), makeSymbol("NEW-SEQ"));

    static private final SubLString $str5$_ = makeString("'");

    static private final SubLString $str6$s_ = makeString("s'");

    static private final SubLString $str7$_A_A = makeString("~A~A");

    static private final SubLString $$$s = makeString("s");

    static private final SubLList $list9 = list(CHAR_s, CHAR_S);

    static private final SubLList $list10 = list(makeString("'d"), makeString("'ve"), makeString("'ll"));

    static private final SubLString $str11$_ = makeString(".");

    static private final SubLString $str13$_ = makeString(",");

    static private final SubLString $$$_ = makeString(" ");

    // Definitions
    /**
     * Convert STRING into a phrase (list of strings) suitable for NLWE parsing.
     */
    @LispMethod(comment = "Convert STRING into a phrase (list of strings) suitable for NLWE parsing.")
    public static final SubLObject preprocess_phrase_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject phrase = com.cyc.cycjava.cycl.preprocessor.break_into_words(string);
            phrase = com.cyc.cycjava.cycl.preprocessor.handle_commas_in_big_nums(phrase);
            phrase = com.cyc.cycjava.cycl.preprocessor.handle_apostrophes(phrase);
            phrase = com.cyc.cycjava.cycl.preprocessor.handle_plural_possessives(phrase);
            phrase = com.cyc.cycjava.cycl.preprocessor.handle_contractions(phrase);
            phrase = com.cyc.cycjava.cycl.preprocessor.handle_final_cleanups(phrase);
            return phrase;
        }
    }

    // Definitions
    /**
     * Convert STRING into a phrase (list of strings) suitable for NLWE parsing.
     */
    @LispMethod(comment = "Convert STRING into a phrase (list of strings) suitable for NLWE parsing.")
    public static SubLObject preprocess_phrase(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        SubLObject phrase = break_into_words(string);
        phrase = handle_commas_in_big_nums(phrase);
        phrase = handle_apostrophes(phrase);
        phrase = handle_plural_possessives(phrase);
        phrase = handle_contractions(phrase);
        phrase = handle_final_cleanups(phrase);
        return phrase;
    }

    /**
     * Return the last string from the phrase resulting from preprocessing STRING.
     */
    @LispMethod(comment = "Return the last string from the phrase resulting from preprocessing STRING.")
    public static final SubLObject last_word_of_phrase_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject word_list = com.cyc.cycjava.cycl.preprocessor.preprocess_phrase(string);
            return last(word_list, UNPROVIDED).first();
        }
    }

    /**
     * Return the last string from the phrase resulting from preprocessing STRING.
     */
    @LispMethod(comment = "Return the last string from the phrase resulting from preprocessing STRING.")
    public static SubLObject last_word_of_phrase(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject word_list = preprocess_phrase(string);
        return last(word_list, UNPROVIDED).first();
    }

    /**
     * breaks string into words and punctuation marks.
     */
    @LispMethod(comment = "breaks string into words and punctuation marks.")
    public static final SubLObject break_into_words_alt(SubLObject string) {
        return reverse(com.cyc.cycjava.cycl.preprocessor.break_into_words_1(string, NIL));
    }

    /**
     * breaks string into words and punctuation marks.
     */
    @LispMethod(comment = "breaks string into words and punctuation marks.")
    public static SubLObject break_into_words(final SubLObject string) {
        return reverse(break_into_words_1(string, NIL));
    }

    public static final SubLObject break_into_words_1_alt(SubLObject string, SubLObject word_list) {
        {
            SubLObject next_word_break_char = position_if(symbol_function($sym1$WORD_BREAK_CHAR_), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == next_word_break_char) {
                return cons(string, word_list);
            } else {
                if (next_word_break_char.numE(ZERO_INTEGER)) {
                    if (length(string).numE(ONE_INTEGER)) {
                        return cons(string, word_list);
                    } else {
                        return com.cyc.cycjava.cycl.preprocessor.break_into_words_1(string_utilities.substring(string, add(ONE_INTEGER, next_word_break_char), UNPROVIDED), cons(Strings.string(Strings.sublisp_char(string, ZERO_INTEGER)), word_list));
                    }
                } else {
                    if (next_word_break_char.numG(ZERO_INTEGER)) {
                        return com.cyc.cycjava.cycl.preprocessor.break_into_words_1(string_utilities.substring(string, next_word_break_char, UNPROVIDED), cons(string_utilities.substring(string, ZERO_INTEGER, next_word_break_char), word_list));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject break_into_words_1(final SubLObject string, final SubLObject word_list) {
        final SubLObject next_word_break_char = position_if(symbol_function($sym1$WORD_BREAK_CHAR_), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == next_word_break_char) {
            return cons(string, word_list);
        }
        if (next_word_break_char.numE(ZERO_INTEGER)) {
            if (length(string).numE(ONE_INTEGER)) {
                return cons(string, word_list);
            }
            return break_into_words_1(string_utilities.substring(string, add(ONE_INTEGER, next_word_break_char), UNPROVIDED), cons(Strings.string(Strings.sublisp_char(string, ZERO_INTEGER)), word_list));
        } else {
            if (next_word_break_char.numG(ZERO_INTEGER)) {
                return break_into_words_1(string_utilities.substring(string, next_word_break_char, UNPROVIDED), cons(string_utilities.substring(string, ZERO_INTEGER, next_word_break_char), word_list));
            }
            return NIL;
        }
    }

    public static final SubLObject word_break_charP_alt(SubLObject v_char) {
        return makeBoolean(((NIL == alpha_char_p(v_char)) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL != find(v_char, $str_alt2$______________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject word_break_charP(final SubLObject v_char) {
        return makeBoolean(((NIL == alpha_char_p(v_char)) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL != find(v_char, $str2$______________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject handle_apostrophes_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $preprocess_apostrophe_table$.getDynamicValue(thread);
                SubLObject info = NIL;
                for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                    {
                        SubLObject datum = info;
                        SubLObject current = datum;
                        SubLObject old_seq = NIL;
                        SubLObject _G = NIL;
                        SubLObject new_seq = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        old_seq = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        _G = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt4);
                        new_seq = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            phrase = list_utilities.substitute_sequence(new_seq, old_seq, phrase);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt4);
                        }
                    }
                }
            }
            return phrase;
        }
    }

    public static SubLObject handle_apostrophes(SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $preprocess_apostrophe_table$.getDynamicValue(thread);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject old_seq = NIL;
            SubLObject _G = NIL;
            SubLObject new_seq = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            old_seq = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            _G = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list4);
            new_seq = current.first();
            current = current.rest();
            if (NIL == current) {
                phrase = list_utilities.substitute_sequence(new_seq, old_seq, phrase);
            } else {
                cdestructuring_bind_error(datum, $list4);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static final SubLObject handle_plural_possessives_alt(SubLObject phrase) {
        {
            SubLObject left_neighbors = com.cyc.cycjava.cycl.preprocessor.all_left_neighbors(phrase, $str_alt5$_, symbol_function(EQUAL));
            SubLObject cdolist_list_var = left_neighbors;
            SubLObject left_neighbor = NIL;
            for (left_neighbor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , left_neighbor = cdolist_list_var.first()) {
                {
                    SubLObject word_with_s_chopped_off = com.cyc.cycjava.cycl.preprocessor.chop_off_last_s(left_neighbor);
                    phrase = list_utilities.substitute_sequence(list(word_with_s_chopped_off, $str_alt6$s_), list(format(NIL, $str_alt7$_A_A, word_with_s_chopped_off, $$$s), $str_alt5$_), phrase);
                }
            }
        }
        return phrase;
    }

    public static SubLObject handle_plural_possessives(SubLObject phrase) {
        SubLObject cdolist_list_var;
        final SubLObject left_neighbors = cdolist_list_var = all_left_neighbors(phrase, $str5$_, symbol_function(EQUAL));
        SubLObject left_neighbor = NIL;
        left_neighbor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject word_with_s_chopped_off = chop_off_last_s(left_neighbor);
            phrase = list_utilities.substitute_sequence(list(word_with_s_chopped_off, $str6$s_), list(format(NIL, $str7$_A_A, word_with_s_chopped_off, $$$s), $str5$_), phrase);
            cdolist_list_var = cdolist_list_var.rest();
            left_neighbor = cdolist_list_var.first();
        } 
        return phrase;
    }

    /**
     * returns a list of the elements which are immediately to the left of
     * the all occurrences of ITEM in LIST.
     */
    @LispMethod(comment = "returns a list of the elements which are immediately to the left of\r\nthe all occurrences of ITEM in LIST.\nreturns a list of the elements which are immediately to the left of\nthe all occurrences of ITEM in LIST.")
    public static final SubLObject all_left_neighbors_alt(SubLObject list, SubLObject item, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return com.cyc.cycjava.cycl.preprocessor.all_left_neighbors_1(list, item, NIL, NIL, test);
    }

    @LispMethod(comment = "returns a list of the elements which are immediately to the left of\r\nthe all occurrences of ITEM in LIST.\nreturns a list of the elements which are immediately to the left of\nthe all occurrences of ITEM in LIST.")
    public static SubLObject all_left_neighbors(final SubLObject list, final SubLObject item, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return all_left_neighbors_1(list, item, NIL, NIL, test);
    }

    public static final SubLObject all_left_neighbors_1_alt(SubLObject list, SubLObject item, SubLObject previous_head, SubLObject lefty_list, SubLObject test) {
        if (NIL == list) {
            return lefty_list;
        } else {
            if ((NIL != funcall(test, list.first(), item)) && (NIL != previous_head)) {
                lefty_list = cons(previous_head, lefty_list);
            }
            return com.cyc.cycjava.cycl.preprocessor.all_left_neighbors_1(list.rest(), item, list.first(), lefty_list, test);
        }
    }

    public static SubLObject all_left_neighbors_1(final SubLObject list, final SubLObject item, final SubLObject previous_head, SubLObject lefty_list, final SubLObject test) {
        if (NIL == list) {
            return lefty_list;
        }
        if ((NIL != funcall(test, list.first(), item)) && (NIL != previous_head)) {
            lefty_list = cons(previous_head, lefty_list);
        }
        return all_left_neighbors_1(list.rest(), item, list.first(), lefty_list, test);
    }

    public static final SubLObject chop_off_last_s_alt(SubLObject word) {
        return Strings.string_right_trim($list_alt9, word);
    }

    public static SubLObject chop_off_last_s(final SubLObject word) {
        return Strings.string_right_trim($list9, word);
    }

    public static final SubLObject handle_contractions_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $preprocess_contraction_suffixes$.getDynamicValue(thread);
                SubLObject contraction_suffix = NIL;
                for (contraction_suffix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contraction_suffix = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_1 = com.cyc.cycjava.cycl.preprocessor.all_left_neighbors(phrase, contraction_suffix, symbol_function(EQUAL));
                        SubLObject contraction_head = NIL;
                        for (contraction_head = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , contraction_head = cdolist_list_var_1.first()) {
                            phrase = list_utilities.substitute_sequence(list(format(NIL, $str_alt7$_A_A, contraction_head, contraction_suffix)), list(contraction_head, contraction_suffix), phrase);
                        }
                    }
                }
            }
            return phrase;
        }
    }

    public static SubLObject handle_contractions(SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $preprocess_contraction_suffixes$.getDynamicValue(thread);
        SubLObject contraction_suffix = NIL;
        contraction_suffix = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = all_left_neighbors(phrase, contraction_suffix, symbol_function(EQUAL));
            SubLObject contraction_head = NIL;
            contraction_head = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                phrase = list_utilities.substitute_sequence(list(format(NIL, $str7$_A_A, contraction_head, contraction_suffix)), list(contraction_head, contraction_suffix), phrase);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                contraction_head = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            contraction_suffix = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static final SubLObject handle_decimals_in_numbers_alt(SubLObject input_phrase) {
        {
            SubLObject val = NIL;
            if (NIL == input_phrase) {
                val = NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.preprocessor.string_of_numbersP(input_phrase.first())) {
                    if (second(input_phrase).equal($str_alt11$_) && (NIL != com.cyc.cycjava.cycl.preprocessor.string_of_numbersP(third(input_phrase)))) {
                        val = cons(cconcatenate(input_phrase.first(), new SubLObject[]{ second(input_phrase), third(input_phrase) }), com.cyc.cycjava.cycl.preprocessor.handle_decimals_in_numbers(input_phrase.rest().rest().rest()));
                    } else {
                        val = cons(input_phrase.first(), com.cyc.cycjava.cycl.preprocessor.handle_decimals_in_numbers(input_phrase.rest()));
                    }
                } else {
                    val = cons(input_phrase.first(), com.cyc.cycjava.cycl.preprocessor.handle_decimals_in_numbers(input_phrase.rest()));
                }
            }
            return val;
        }
    }

    public static SubLObject handle_decimals_in_numbers(final SubLObject input_phrase) {
        SubLObject val = NIL;
        if (NIL == input_phrase) {
            val = NIL;
        } else
            if (NIL != string_of_numbersP(input_phrase.first())) {
                if (second(input_phrase).equal($str11$_) && (NIL != string_of_numbersP(third(input_phrase)))) {
                    val = cons(cconcatenate(input_phrase.first(), new SubLObject[]{ second(input_phrase), third(input_phrase) }), handle_decimals_in_numbers(input_phrase.rest().rest().rest()));
                } else {
                    val = cons(input_phrase.first(), handle_decimals_in_numbers(input_phrase.rest()));
                }
            } else {
                val = cons(input_phrase.first(), handle_decimals_in_numbers(input_phrase.rest()));
            }

        return val;
    }

    public static final SubLObject string_of_numbersP_alt(SubLObject string) {
        return makeBoolean((string.isString() && length(string).numG(ZERO_INTEGER)) && (NIL == list_utilities.find_if_not(symbol_function(DIGIT_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject string_of_numbersP(final SubLObject string) {
        return makeBoolean((string.isString() && length(string).numG(ZERO_INTEGER)) && (NIL == list_utilities.find_if_not(symbol_function(DIGIT_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject one_to_three_all_digits_alt(SubLObject word) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.preprocessor.string_of_numbersP(word)) && length(word).numLE(THREE_INTEGER));
    }

    public static SubLObject one_to_three_all_digits(final SubLObject word) {
        return makeBoolean((NIL != string_of_numbersP(word)) && length(word).numLE(THREE_INTEGER));
    }

    public static final SubLObject three_digits_alt(SubLObject word) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.preprocessor.string_of_numbersP(word)) && length(word).numE(THREE_INTEGER));
    }

    public static SubLObject three_digits(final SubLObject word) {
        return makeBoolean((NIL != string_of_numbersP(word)) && length(word).numE(THREE_INTEGER));
    }

    public static final SubLObject handle_commas_in_big_nums_alt(SubLObject input_phrase) {
        return nreverse(com.cyc.cycjava.cycl.preprocessor.preprocess_stage_1(input_phrase.first(), input_phrase.rest(), NIL));
    }

    public static SubLObject handle_commas_in_big_nums(final SubLObject input_phrase) {
        return nreverse(preprocess_stage_1(input_phrase.first(), input_phrase.rest(), NIL));
    }

    public static final SubLObject preprocess_stage_1_alt(SubLObject current_word, SubLObject input_phrase, SubLObject output_phrase) {
        if (NIL == current_word) {
            return output_phrase;
        } else {
            if (NIL != com.cyc.cycjava.cycl.preprocessor.one_to_three_all_digits(current_word)) {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_2(input_phrase.first(), current_word, input_phrase.rest(), output_phrase);
            } else {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_1(input_phrase.first(), input_phrase.rest(), cons(current_word, output_phrase));
            }
        }
    }

    public static SubLObject preprocess_stage_1(final SubLObject current_word, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (NIL == current_word) {
            return output_phrase;
        }
        if (NIL != one_to_three_all_digits(current_word)) {
            return preprocess_stage_2(input_phrase.first(), current_word, input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), cons(current_word, output_phrase));
    }

    public static final SubLObject preprocess_stage_2_alt(SubLObject current_word, SubLObject num_under_construction, SubLObject input_phrase, SubLObject output_phrase) {
        if (NIL != current_word) {
            if (NIL != com.cyc.cycjava.cycl.preprocessor.commaP(current_word)) {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_3(input_phrase.first(), num_under_construction, input_phrase.rest(), output_phrase);
            } else {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_1(input_phrase.first(), input_phrase.rest(), nconc(list(current_word, num_under_construction), output_phrase));
            }
        } else {
            return cons(num_under_construction, output_phrase);
        }
    }

    public static SubLObject preprocess_stage_2(final SubLObject current_word, final SubLObject num_under_construction, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (NIL == current_word) {
            return cons(num_under_construction, output_phrase);
        }
        if (NIL != commaP(current_word)) {
            return preprocess_stage_3(input_phrase.first(), num_under_construction, input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), nconc(list(current_word, num_under_construction), output_phrase));
    }

    public static final SubLObject preprocess_stage_3_alt(SubLObject current_word, SubLObject num_under_construction, SubLObject input_phrase, SubLObject output_phrase) {
        if (NIL != current_word) {
            if (NIL != com.cyc.cycjava.cycl.preprocessor.three_digits(current_word)) {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_2(input_phrase.first(), format(NIL, $str_alt7$_A_A, num_under_construction, current_word), input_phrase.rest(), output_phrase);
            } else {
                return com.cyc.cycjava.cycl.preprocessor.preprocess_stage_1(input_phrase.first(), input_phrase.rest(), nconc(list(current_word, $str_alt13$_, num_under_construction), output_phrase));
            }
        } else {
            return cons(num_under_construction, output_phrase);
        }
    }

    public static SubLObject preprocess_stage_3(final SubLObject current_word, final SubLObject num_under_construction, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (NIL == current_word) {
            return cons(num_under_construction, output_phrase);
        }
        if (NIL != three_digits(current_word)) {
            return preprocess_stage_2(input_phrase.first(), format(NIL, $str7$_A_A, num_under_construction, current_word), input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), nconc(list(current_word, $str13$_, num_under_construction), output_phrase));
    }

    public static final SubLObject commaP_alt(SubLObject word) {
        return equal(word, $str_alt13$_);
    }

    public static SubLObject commaP(final SubLObject word) {
        return equal(word, $str13$_);
    }

    public static final SubLObject handle_final_cleanups_alt(SubLObject phrase) {
        return delete($str_alt14$_, phrase, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject handle_final_cleanups(final SubLObject phrase) {
        return delete($$$_, phrase, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_preprocessor_file() {
        declareFunction("preprocess_phrase", "PREPROCESS-PHRASE", 1, 0, false);
        declareFunction("last_word_of_phrase", "LAST-WORD-OF-PHRASE", 1, 0, false);
        declareFunction("break_into_words", "BREAK-INTO-WORDS", 1, 0, false);
        declareFunction("break_into_words_1", "BREAK-INTO-WORDS-1", 2, 0, false);
        declareFunction("word_break_charP", "WORD-BREAK-CHAR?", 1, 0, false);
        declareFunction("handle_apostrophes", "HANDLE-APOSTROPHES", 1, 0, false);
        declareFunction("handle_plural_possessives", "HANDLE-PLURAL-POSSESSIVES", 1, 0, false);
        declareFunction("all_left_neighbors", "ALL-LEFT-NEIGHBORS", 2, 1, false);
        declareFunction("all_left_neighbors_1", "ALL-LEFT-NEIGHBORS-1", 5, 0, false);
        declareFunction("chop_off_last_s", "CHOP-OFF-LAST-S", 1, 0, false);
        declareFunction("handle_contractions", "HANDLE-CONTRACTIONS", 1, 0, false);
        declareFunction("handle_decimals_in_numbers", "HANDLE-DECIMALS-IN-NUMBERS", 1, 0, false);
        declareFunction("string_of_numbersP", "STRING-OF-NUMBERS?", 1, 0, false);
        declareFunction("one_to_three_all_digits", "ONE-TO-THREE-ALL-DIGITS", 1, 0, false);
        declareFunction("three_digits", "THREE-DIGITS", 1, 0, false);
        declareFunction("handle_commas_in_big_nums", "HANDLE-COMMAS-IN-BIG-NUMS", 1, 0, false);
        declareFunction("preprocess_stage_1", "PREPROCESS-STAGE-1", 3, 0, false);
        declareFunction("preprocess_stage_2", "PREPROCESS-STAGE-2", 4, 0, false);
        declareFunction("preprocess_stage_3", "PREPROCESS-STAGE-3", 4, 0, false);
        declareFunction("commaP", "COMMA?", 1, 0, false);
        declareFunction("handle_final_cleanups", "HANDLE-FINAL-CLEANUPS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_preprocessor_file() {
        defparameter("*PREPROCESS-APOSTROPHE-TABLE*", $list3);
        defparameter("*PREPROCESS-CONTRACTION-SUFFIXES*", $list10);
        return NIL;
    }

    static private final SubLString $str_alt2$______________________________ = makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(list(makeString("'"), makeString("d")), makeSymbol("->"), list(makeString("'d"))), list(list(makeString("'"), makeString("m")), makeSymbol("->"), list(makeString("'m"))), list(list(makeString("'"), makeString("s")), makeSymbol("->"), list(makeString("'s"))), list(list(makeString("'"), makeString("t")), makeSymbol("->"), list(makeString("'t"))), list(list(makeString("'"), makeString("ll")), makeSymbol("->"), list(makeString("'ll"))), list(list(makeString("'"), makeString("re")), makeSymbol("->"), list(makeString("'re"))), list(list(makeString("'"), makeString("ve")), makeSymbol("->"), list(makeString("'ve"))), list(list(makeString("'"), makeString("'")), makeSymbol("->"), list(makeString("''"))), list(list(makeString("`"), makeString("`")), makeSymbol("->"), list(makeString("``"))) });

    public static SubLObject setup_preprocessor_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_preprocessor_file();
    }

    @Override
    public void initializeVariables() {
        init_preprocessor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_preprocessor_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = list(makeSymbol("OLD-SEQ"), makeSymbol("->"), makeSymbol("NEW-SEQ"));

    static private final SubLString $str_alt5$_ = makeString("'");

    static private final SubLString $str_alt6$s_ = makeString("s'");

    static private final SubLString $str_alt7$_A_A = makeString("~A~A");

    static private final SubLList $list_alt9 = list(CHAR_s, CHAR_S);

    static private final SubLList $list_alt10 = list(makeString("'d"), makeString("'ve"), makeString("'ll"));

    static private final SubLString $str_alt11$_ = makeString(".");

    static private final SubLString $str_alt13$_ = makeString(",");

    static private final SubLString $str_alt14$_ = makeString(" ");
}

/**
 * Total time: 196 ms
 */
