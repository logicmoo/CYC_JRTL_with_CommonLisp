package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.preprocessor;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.preprocessor.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class preprocessor extends SubLTranslatedFile {
    public static final SubLFile me = new preprocessor();

    public static final String myName = "com.cyc.cycjava.cycl.preprocessor";

    public static final String myFingerPrint = "436699e704df1251bf4ae4b04f494e9f4be0834767d1f8783243d02632aa65c4";

    // defparameter
    private static final SubLSymbol $preprocess_apostrophe_table$ = makeSymbol("*PREPROCESS-APOSTROPHE-TABLE*");

    // defparameter
    private static final SubLSymbol $preprocess_contraction_suffixes$ = makeSymbol("*PREPROCESS-CONTRACTION-SUFFIXES*");



    public static final SubLSymbol $sym1$WORD_BREAK_CHAR_ = makeSymbol("WORD-BREAK-CHAR?");

    public static final SubLString $str2$______________________________ = makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");

    public static final SubLList $list3 = list(new SubLObject[]{ list(list(makeString("'"), makeString("d")), makeSymbol("->"), list(makeString("'d"))), list(list(makeString("'"), makeString("m")), makeSymbol("->"), list(makeString("'m"))), list(list(makeString("'"), makeString("s")), makeSymbol("->"), list(makeString("'s"))), list(list(makeString("'"), makeString("t")), makeSymbol("->"), list(makeString("'t"))), list(list(makeString("'"), makeString("ll")), makeSymbol("->"), list(makeString("'ll"))), list(list(makeString("'"), makeString("re")), makeSymbol("->"), list(makeString("'re"))), list(list(makeString("'"), makeString("ve")), makeSymbol("->"), list(makeString("'ve"))), list(list(makeString("'"), makeString("'")), makeSymbol("->"), list(makeString("''"))), list(list(makeString("`"), makeString("`")), makeSymbol("->"), list(makeString("``"))) });

    public static final SubLList $list4 = list(makeSymbol("OLD-SEQ"), makeSymbol("->"), makeSymbol("NEW-SEQ"));

    public static final SubLString $str5$_ = makeString("'");

    public static final SubLString $str6$s_ = makeString("s'");

    public static final SubLString $str7$_A_A = makeString("~A~A");

    public static final SubLString $$$s = makeString("s");

    public static final SubLList $list9 = list(CHAR_s, CHAR_S);

    public static final SubLList $list10 = list(makeString("'d"), makeString("'ve"), makeString("'ll"));

    public static final SubLString $str11$_ = makeString(".");



    public static final SubLString $str13$_ = makeString(",");

    public static final SubLString $$$_ = makeString(" ");

    public static SubLObject preprocess_phrase(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject phrase = break_into_words(string);
        phrase = handle_commas_in_big_nums(phrase);
        phrase = handle_apostrophes(phrase);
        phrase = handle_plural_possessives(phrase);
        phrase = handle_contractions(phrase);
        phrase = handle_final_cleanups(phrase);
        return phrase;
    }

    public static SubLObject last_word_of_phrase(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject word_list = preprocess_phrase(string);
        return last(word_list, UNPROVIDED).first();
    }

    public static SubLObject break_into_words(final SubLObject string) {
        return reverse(break_into_words_1(string, NIL));
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

    public static SubLObject word_break_charP(final SubLObject v_char) {
        return makeBoolean(((NIL == alpha_char_p(v_char)) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL != find(v_char, $str2$______________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
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

    public static SubLObject all_left_neighbors(final SubLObject list, final SubLObject item, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return all_left_neighbors_1(list, item, NIL, NIL, test);
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

    public static SubLObject chop_off_last_s(final SubLObject word) {
        return Strings.string_right_trim($list9, word);
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

    public static SubLObject string_of_numbersP(final SubLObject string) {
        return makeBoolean((string.isString() && length(string).numG(ZERO_INTEGER)) && (NIL == list_utilities.find_if_not(symbol_function(DIGIT_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject one_to_three_all_digits(final SubLObject word) {
        return makeBoolean((NIL != string_of_numbersP(word)) && length(word).numLE(THREE_INTEGER));
    }

    public static SubLObject three_digits(final SubLObject word) {
        return makeBoolean((NIL != string_of_numbersP(word)) && length(word).numE(THREE_INTEGER));
    }

    public static SubLObject handle_commas_in_big_nums(final SubLObject input_phrase) {
        return nreverse(preprocess_stage_1(input_phrase.first(), input_phrase.rest(), NIL));
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

    public static SubLObject preprocess_stage_2(final SubLObject current_word, final SubLObject num_under_construction, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (NIL == current_word) {
            return cons(num_under_construction, output_phrase);
        }
        if (NIL != commaP(current_word)) {
            return preprocess_stage_3(input_phrase.first(), num_under_construction, input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), nconc(list(current_word, num_under_construction), output_phrase));
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

    public static SubLObject commaP(final SubLObject word) {
        return equal(word, $str13$_);
    }

    public static SubLObject handle_final_cleanups(final SubLObject phrase) {
        return delete($$$_, phrase, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_preprocessor_file() {
        declareFunction(me, "preprocess_phrase", "PREPROCESS-PHRASE", 1, 0, false);
        declareFunction(me, "last_word_of_phrase", "LAST-WORD-OF-PHRASE", 1, 0, false);
        declareFunction(me, "break_into_words", "BREAK-INTO-WORDS", 1, 0, false);
        declareFunction(me, "break_into_words_1", "BREAK-INTO-WORDS-1", 2, 0, false);
        declareFunction(me, "word_break_charP", "WORD-BREAK-CHAR?", 1, 0, false);
        declareFunction(me, "handle_apostrophes", "HANDLE-APOSTROPHES", 1, 0, false);
        declareFunction(me, "handle_plural_possessives", "HANDLE-PLURAL-POSSESSIVES", 1, 0, false);
        declareFunction(me, "all_left_neighbors", "ALL-LEFT-NEIGHBORS", 2, 1, false);
        declareFunction(me, "all_left_neighbors_1", "ALL-LEFT-NEIGHBORS-1", 5, 0, false);
        declareFunction(me, "chop_off_last_s", "CHOP-OFF-LAST-S", 1, 0, false);
        declareFunction(me, "handle_contractions", "HANDLE-CONTRACTIONS", 1, 0, false);
        declareFunction(me, "handle_decimals_in_numbers", "HANDLE-DECIMALS-IN-NUMBERS", 1, 0, false);
        declareFunction(me, "string_of_numbersP", "STRING-OF-NUMBERS?", 1, 0, false);
        declareFunction(me, "one_to_three_all_digits", "ONE-TO-THREE-ALL-DIGITS", 1, 0, false);
        declareFunction(me, "three_digits", "THREE-DIGITS", 1, 0, false);
        declareFunction(me, "handle_commas_in_big_nums", "HANDLE-COMMAS-IN-BIG-NUMS", 1, 0, false);
        declareFunction(me, "preprocess_stage_1", "PREPROCESS-STAGE-1", 3, 0, false);
        declareFunction(me, "preprocess_stage_2", "PREPROCESS-STAGE-2", 4, 0, false);
        declareFunction(me, "preprocess_stage_3", "PREPROCESS-STAGE-3", 4, 0, false);
        declareFunction(me, "commaP", "COMMA?", 1, 0, false);
        declareFunction(me, "handle_final_cleanups", "HANDLE-FINAL-CLEANUPS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_preprocessor_file() {
        defparameter("*PREPROCESS-APOSTROPHE-TABLE*", $list3);
        defparameter("*PREPROCESS-CONTRACTION-SUFFIXES*", $list10);
        return NIL;
    }

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
}

/**
 * Total time: 196 ms
 */
