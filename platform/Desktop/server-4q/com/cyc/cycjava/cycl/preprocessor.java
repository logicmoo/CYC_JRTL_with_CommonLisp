package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class preprocessor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.preprocessor";
    public static final String myFingerPrint = "436699e704df1251bf4ae4b04f494e9f4be0834767d1f8783243d02632aa65c4";
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 2807L)
    private static SubLSymbol $preprocess_apostrophe_table$;
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 4575L)
    private static SubLSymbol $preprocess_contraction_suffixes$;
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLSymbol $sym1$WORD_BREAK_CHAR_;
    private static final SubLString $str2$______________________________;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLString $str5$_;
    private static final SubLString $str6$s_;
    private static final SubLString $str7$_A_A;
    private static final SubLString $str8$s;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLString $str11$_;
    private static final SubLSymbol $sym12$DIGIT_CHAR_P;
    private static final SubLString $str13$_;
    private static final SubLString $str14$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 1001L)
    public static SubLObject preprocess_phrase(final SubLObject string) {
        assert preprocessor.NIL != Types.stringp(string) : string;
        SubLObject phrase = break_into_words(string);
        phrase = handle_commas_in_big_nums(phrase);
        phrase = handle_apostrophes(phrase);
        phrase = handle_plural_possessives(phrase);
        phrase = handle_contractions(phrase);
        phrase = handle_final_cleanups(phrase);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 1533L)
    public static SubLObject last_word_of_phrase(final SubLObject string) {
        assert preprocessor.NIL != Types.stringp(string) : string;
        final SubLObject word_list = preprocess_phrase(string);
        return conses_high.last(word_list, (SubLObject)preprocessor.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 1772L)
    public static SubLObject break_into_words(final SubLObject string) {
        return Sequences.reverse(break_into_words_1(string, (SubLObject)preprocessor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 1971L)
    public static SubLObject break_into_words_1(final SubLObject string, final SubLObject word_list) {
        final SubLObject next_word_break_char = Sequences.position_if(Symbols.symbol_function((SubLObject)preprocessor.$sym1$WORD_BREAK_CHAR_), string, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED);
        if (preprocessor.NIL == next_word_break_char) {
            return (SubLObject)ConsesLow.cons(string, word_list);
        }
        if (next_word_break_char.numE((SubLObject)preprocessor.ZERO_INTEGER)) {
            if (Sequences.length(string).numE((SubLObject)preprocessor.ONE_INTEGER)) {
                return (SubLObject)ConsesLow.cons(string, word_list);
            }
            return break_into_words_1(string_utilities.substring(string, Numbers.add((SubLObject)preprocessor.ONE_INTEGER, next_word_break_char), (SubLObject)preprocessor.UNPROVIDED), (SubLObject)ConsesLow.cons(Strings.string(Strings.sublisp_char(string, (SubLObject)preprocessor.ZERO_INTEGER)), word_list));
        }
        else {
            if (next_word_break_char.numG((SubLObject)preprocessor.ZERO_INTEGER)) {
                return break_into_words_1(string_utilities.substring(string, next_word_break_char, (SubLObject)preprocessor.UNPROVIDED), (SubLObject)ConsesLow.cons(string_utilities.substring(string, (SubLObject)preprocessor.ZERO_INTEGER, next_word_break_char), word_list));
            }
            return (SubLObject)preprocessor.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 2639L)
    public static SubLObject word_break_charP(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(preprocessor.NIL == Characters.alpha_char_p(v_char) && preprocessor.NIL == Characters.digit_char_p(v_char, (SubLObject)preprocessor.UNPROVIDED) && preprocessor.NIL != Sequences.find(v_char, (SubLObject)preprocessor.$str2$______________________________, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 3164L)
    public static SubLObject handle_apostrophes(SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = preprocessor.$preprocess_apostrophe_table$.getDynamicValue(thread);
        SubLObject info = (SubLObject)preprocessor.NIL;
        info = cdolist_list_var.first();
        while (preprocessor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject old_seq = (SubLObject)preprocessor.NIL;
            SubLObject _G = (SubLObject)preprocessor.NIL;
            SubLObject new_seq = (SubLObject)preprocessor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)preprocessor.$list4);
            old_seq = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)preprocessor.$list4);
            _G = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)preprocessor.$list4);
            new_seq = current.first();
            current = current.rest();
            if (preprocessor.NIL == current) {
                phrase = list_utilities.substitute_sequence(new_seq, old_seq, phrase);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)preprocessor.$list4);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 3410L)
    public static SubLObject handle_plural_possessives(SubLObject phrase) {
        SubLObject cdolist_list_var;
        final SubLObject left_neighbors = cdolist_list_var = all_left_neighbors(phrase, (SubLObject)preprocessor.$str5$_, Symbols.symbol_function((SubLObject)preprocessor.EQUAL));
        SubLObject left_neighbor = (SubLObject)preprocessor.NIL;
        left_neighbor = cdolist_list_var.first();
        while (preprocessor.NIL != cdolist_list_var) {
            final SubLObject word_with_s_chopped_off = chop_off_last_s(left_neighbor);
            phrase = list_utilities.substitute_sequence((SubLObject)ConsesLow.list(word_with_s_chopped_off, (SubLObject)preprocessor.$str6$s_), (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)preprocessor.NIL, (SubLObject)preprocessor.$str7$_A_A, word_with_s_chopped_off, (SubLObject)preprocessor.$str8$s), (SubLObject)preprocessor.$str5$_), phrase);
            cdolist_list_var = cdolist_list_var.rest();
            left_neighbor = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 3919L)
    public static SubLObject all_left_neighbors(final SubLObject list, final SubLObject item, SubLObject test) {
        if (test == preprocessor.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)preprocessor.EQL);
        }
        return all_left_neighbors_1(list, item, (SubLObject)preprocessor.NIL, (SubLObject)preprocessor.NIL, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 4169L)
    public static SubLObject all_left_neighbors_1(final SubLObject list, final SubLObject item, final SubLObject previous_head, SubLObject lefty_list, final SubLObject test) {
        if (preprocessor.NIL == list) {
            return lefty_list;
        }
        if (preprocessor.NIL != Functions.funcall(test, list.first(), item) && preprocessor.NIL != previous_head) {
            lefty_list = (SubLObject)ConsesLow.cons(previous_head, lefty_list);
        }
        return all_left_neighbors_1(list.rest(), item, list.first(), lefty_list, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 4490L)
    public static SubLObject chop_off_last_s(final SubLObject word) {
        return Strings.string_right_trim((SubLObject)preprocessor.$list9, word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 4724L)
    public static SubLObject handle_contractions(SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = preprocessor.$preprocess_contraction_suffixes$.getDynamicValue(thread);
        SubLObject contraction_suffix = (SubLObject)preprocessor.NIL;
        contraction_suffix = cdolist_list_var.first();
        while (preprocessor.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = all_left_neighbors(phrase, contraction_suffix, Symbols.symbol_function((SubLObject)preprocessor.EQUAL));
            SubLObject contraction_head = (SubLObject)preprocessor.NIL;
            contraction_head = cdolist_list_var_$1.first();
            while (preprocessor.NIL != cdolist_list_var_$1) {
                phrase = list_utilities.substitute_sequence((SubLObject)ConsesLow.list(PrintLow.format((SubLObject)preprocessor.NIL, (SubLObject)preprocessor.$str7$_A_A, contraction_head, contraction_suffix)), (SubLObject)ConsesLow.list(contraction_head, contraction_suffix), phrase);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                contraction_head = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contraction_suffix = cdolist_list_var.first();
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 5121L)
    public static SubLObject handle_decimals_in_numbers(final SubLObject input_phrase) {
        SubLObject val = (SubLObject)preprocessor.NIL;
        if (preprocessor.NIL == input_phrase) {
            val = (SubLObject)preprocessor.NIL;
        }
        else if (preprocessor.NIL != string_of_numbersP(input_phrase.first())) {
            if (conses_high.second(input_phrase).equal((SubLObject)preprocessor.$str11$_) && preprocessor.NIL != string_of_numbersP(conses_high.third(input_phrase))) {
                val = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(input_phrase.first(), new SubLObject[] { conses_high.second(input_phrase), conses_high.third(input_phrase) }), handle_decimals_in_numbers(input_phrase.rest().rest().rest()));
            }
            else {
                val = (SubLObject)ConsesLow.cons(input_phrase.first(), handle_decimals_in_numbers(input_phrase.rest()));
            }
        }
        else {
            val = (SubLObject)ConsesLow.cons(input_phrase.first(), handle_decimals_in_numbers(input_phrase.rest()));
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 5925L)
    public static SubLObject string_of_numbersP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && Sequences.length(string).numG((SubLObject)preprocessor.ZERO_INTEGER) && preprocessor.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)preprocessor.$sym12$DIGIT_CHAR_P), string, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 6094L)
    public static SubLObject one_to_three_all_digits(final SubLObject word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(preprocessor.NIL != string_of_numbersP(word) && Sequences.length(word).numLE((SubLObject)preprocessor.THREE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 6211L)
    public static SubLObject three_digits(final SubLObject word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(preprocessor.NIL != string_of_numbersP(word) && Sequences.length(word).numE((SubLObject)preprocessor.THREE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 6316L)
    public static SubLObject handle_commas_in_big_nums(final SubLObject input_phrase) {
        return Sequences.nreverse(preprocess_stage_1(input_phrase.first(), input_phrase.rest(), (SubLObject)preprocessor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 6970L)
    public static SubLObject preprocess_stage_1(final SubLObject current_word, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (preprocessor.NIL == current_word) {
            return output_phrase;
        }
        if (preprocessor.NIL != one_to_three_all_digits(current_word)) {
            return preprocess_stage_2(input_phrase.first(), current_word, input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), (SubLObject)ConsesLow.cons(current_word, output_phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 7377L)
    public static SubLObject preprocess_stage_2(final SubLObject current_word, final SubLObject num_under_construction, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (preprocessor.NIL == current_word) {
            return (SubLObject)ConsesLow.cons(num_under_construction, output_phrase);
        }
        if (preprocessor.NIL != commaP(current_word)) {
            return preprocess_stage_3(input_phrase.first(), num_under_construction, input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(current_word, num_under_construction), output_phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 7878L)
    public static SubLObject preprocess_stage_3(final SubLObject current_word, final SubLObject num_under_construction, final SubLObject input_phrase, final SubLObject output_phrase) {
        if (preprocessor.NIL == current_word) {
            return (SubLObject)ConsesLow.cons(num_under_construction, output_phrase);
        }
        if (preprocessor.NIL != three_digits(current_word)) {
            return preprocess_stage_2(input_phrase.first(), PrintLow.format((SubLObject)preprocessor.NIL, (SubLObject)preprocessor.$str7$_A_A, num_under_construction, current_word), input_phrase.rest(), output_phrase);
        }
        return preprocess_stage_1(input_phrase.first(), input_phrase.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(current_word, (SubLObject)preprocessor.$str13$_, num_under_construction), output_phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 8418L)
    public static SubLObject commaP(final SubLObject word) {
        return Equality.equal(word, (SubLObject)preprocessor.$str13$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preprocessor.lisp", position = 8475L)
    public static SubLObject handle_final_cleanups(final SubLObject phrase) {
        return Sequences.delete((SubLObject)preprocessor.$str14$_, phrase, Symbols.symbol_function((SubLObject)preprocessor.EQUAL), (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED, (SubLObject)preprocessor.UNPROVIDED);
    }
    
    public static SubLObject declare_preprocessor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "preprocess_phrase", "PREPROCESS-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "last_word_of_phrase", "LAST-WORD-OF-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "break_into_words", "BREAK-INTO-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "break_into_words_1", "BREAK-INTO-WORDS-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "word_break_charP", "WORD-BREAK-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_apostrophes", "HANDLE-APOSTROPHES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_plural_possessives", "HANDLE-PLURAL-POSSESSIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "all_left_neighbors", "ALL-LEFT-NEIGHBORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "all_left_neighbors_1", "ALL-LEFT-NEIGHBORS-1", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "chop_off_last_s", "CHOP-OFF-LAST-S", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_contractions", "HANDLE-CONTRACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_decimals_in_numbers", "HANDLE-DECIMALS-IN-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "string_of_numbersP", "STRING-OF-NUMBERS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "one_to_three_all_digits", "ONE-TO-THREE-ALL-DIGITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "three_digits", "THREE-DIGITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_commas_in_big_nums", "HANDLE-COMMAS-IN-BIG-NUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "preprocess_stage_1", "PREPROCESS-STAGE-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "preprocess_stage_2", "PREPROCESS-STAGE-2", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "preprocess_stage_3", "PREPROCESS-STAGE-3", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "commaP", "COMMA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preprocessor", "handle_final_cleanups", "HANDLE-FINAL-CLEANUPS", 1, 0, false);
        return (SubLObject)preprocessor.NIL;
    }
    
    public static SubLObject init_preprocessor_file() {
        preprocessor.$preprocess_apostrophe_table$ = SubLFiles.defparameter("*PREPROCESS-APOSTROPHE-TABLE*", (SubLObject)preprocessor.$list3);
        preprocessor.$preprocess_contraction_suffixes$ = SubLFiles.defparameter("*PREPROCESS-CONTRACTION-SUFFIXES*", (SubLObject)preprocessor.$list10);
        return (SubLObject)preprocessor.NIL;
    }
    
    public static SubLObject setup_preprocessor_file() {
        return (SubLObject)preprocessor.NIL;
    }
    
    public void declareFunctions() {
        declare_preprocessor_file();
    }
    
    public void initializeVariables() {
        init_preprocessor_file();
    }
    
    public void runTopLevelForms() {
        setup_preprocessor_file();
    }
    
    static {
        me = (SubLFile)new preprocessor();
        preprocessor.$preprocess_apostrophe_table$ = null;
        preprocessor.$preprocess_contraction_suffixes$ = null;
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym1$WORD_BREAK_CHAR_ = SubLObjectFactory.makeSymbol("WORD-BREAK-CHAR?");
        $str2$______________________________ = SubLObjectFactory.makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("d")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'d"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("m")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'m"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("s")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'s"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'t"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("ll")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'ll"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("re")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'re"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("ve")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'ve"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("'")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("''"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("`"), (SubLObject)SubLObjectFactory.makeString("`")), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("``"))) });
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-SEQ"), (SubLObject)SubLObjectFactory.makeSymbol("->"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQ"));
        $str5$_ = SubLObjectFactory.makeString("'");
        $str6$s_ = SubLObjectFactory.makeString("s'");
        $str7$_A_A = SubLObjectFactory.makeString("~A~A");
        $str8$s = SubLObjectFactory.makeString("s");
        $list9 = ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_S);
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'d"), (SubLObject)SubLObjectFactory.makeString("'ve"), (SubLObject)SubLObjectFactory.makeString("'ll"));
        $str11$_ = SubLObjectFactory.makeString(".");
        $sym12$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $str13$_ = SubLObjectFactory.makeString(",");
        $str14$_ = SubLObjectFactory.makeString(" ");
    }
}

/*

	Total time: 196 ms
	
*/