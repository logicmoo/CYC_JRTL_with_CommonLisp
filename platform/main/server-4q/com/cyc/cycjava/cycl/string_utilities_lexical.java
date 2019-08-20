/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      STRING-UTILITIES-LEXICAL
 * source file: /cyc/top/cycl/string-utilities-lexical.lisp
 * created:     2019/07/03 17:38:15
 */
public final class string_utilities_lexical extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new string_utilities_lexical();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeString("st"), makeString("nd"), makeString("rd"), makeString("th"));

    private static final SubLSymbol NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");

    static private final SubLSymbol $sym2$EVERY_WORD_STARTS_WITH_CAPITAL_ = makeSymbol("EVERY-WORD-STARTS-WITH-CAPITAL?");

    private static final SubLList $list9 = list(list(list(makeString("Atheroembolic renal disease")), NIL), list(list(makeString("Atheroembolic Renal Disease")), T), list(list(makeString("atheroembolic renal disease")), NIL), list(list(makeString("disease")), NIL), list(list(makeString("Disease")), T));

    // Definitions
    /**
     * does STRING denote a number?
     *
     * @param STRING
    string
     * 		
     */
    @LispMethod(comment = "does STRING denote a number?\r\n\r\n@param STRING\nstring")
    public static final SubLObject denots_english_number_p_alt(SubLObject string) {
        return makeBoolean((((NIL != number_utilities.number_string_p(string)) || (NIL != string_utilities.english_ordinal_number_string_p(string))) || (NIL != com.cyc.cycjava.cycl.string_utilities_lexical.english_number_word_p(string))) || (NIL != com.cyc.cycjava.cycl.string_utilities_lexical.english_ordinal_word_string_p(string)));
    }

    // Definitions
    /**
     * does STRING denote a number?
     *
     * @param STRING
    		string
     * 		
     */
    @LispMethod(comment = "does STRING denote a number?\r\n\r\n@param STRING\n\t\tstring")
    public static SubLObject denots_english_number_p(final SubLObject string) {
        return makeBoolean((((NIL != number_utilities.number_string_p(string)) || (NIL != string_utilities.english_ordinal_number_string_p(string))) || (NIL != english_number_word_p(string))) || (NIL != english_ordinal_word_string_p(string)));
    }

    /**
     * is string a single word that denots a number (e.g. works for 'ten', but not for '10')
     *
     * @param STRING
    string
     * 		
     */
    @LispMethod(comment = "is string a single word that denots a number (e.g. works for \'ten\', but not for \'10\')\r\n\r\n@param STRING\nstring")
    public static final SubLObject english_number_word_p_alt(SubLObject string) {
        {
            SubLObject denots = lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = denots;
            SubLObject denot = NIL;
            for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                if (denot.isNumber()) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * is string a single word that denots a number (e.g. works for 'ten', but not for '10')
     *
     * @param STRING
    		string
     * 		
     */
    @LispMethod(comment = "is string a single word that denots a number (e.g. works for \'ten\', but not for \'10\')\r\n\r\n@param STRING\n\t\tstring")
    public static SubLObject english_number_word_p(final SubLObject string) {
        SubLObject cdolist_list_var;
        final SubLObject denots = cdolist_list_var = lexicon_accessors.all_parsing_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (denot.isNumber()) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * is string an ordinal number string such as 1st, 2nd, 3rd, 4th, etc
     */
    @LispMethod(comment = "is string an ordinal number string such as 1st, 2nd, 3rd, 4th, etc")
    public static final SubLObject english_ordinal_word_string_p_alt(SubLObject string) {
        {
            SubLObject possibly_ordinal_numberP = string_utilities.ends_with_one_of(string, $list_alt0);
            return NIL != possibly_ordinal_numberP ? ((SubLObject) (com.cyc.cycjava.cycl.string_utilities_lexical.english_number_word_p(string_utilities.english_ordinal_string_to_cardinal_string(string)))) : NIL;
        }
    }

    @LispMethod(comment = "is string an ordinal number string such as 1st, 2nd, 3rd, 4th, etc")
    public static SubLObject english_ordinal_word_string_p(final SubLObject string) {
        final SubLObject possibly_ordinal_numberP = string_utilities.ends_with_one_of(string, $list0);
        return NIL != possibly_ordinal_numberP ? english_number_word_p(string_utilities.english_ordinal_string_to_cardinal_string(string)) : NIL;
    }

    /**
     *
     *
     * @unknown the head noun of string
     */
    @LispMethod(comment = "@unknown the head noun of string")
    public static final SubLObject find_head_noun_of_string_alt(SubLObject string) {
        {
            SubLObject head_noun_pos = NIL;
            SubLObject final_pos = subtract(string_utilities.number_of_words(string), ONE_INTEGER);
            SubLObject prep_pos = com.cyc.cycjava.cycl.string_utilities_lexical.where_is_first_prepositionP(string);
            if (NIL != subl_promotions.positive_integer_p(prep_pos)) {
                head_noun_pos = subtract(prep_pos, ONE_INTEGER);
            } else {
                head_noun_pos = final_pos;
            }
            return string_utilities.nth_word_of_string(head_noun_pos, string);
        }
    }

    /**
     *
     *
     * @unknown the head noun of string
     */
    @LispMethod(comment = "@unknown the head noun of string")
    public static SubLObject find_head_noun_of_string(final SubLObject string) {
        SubLObject head_noun_pos = NIL;
        final SubLObject final_pos = subtract(string_utilities.number_of_words(string), ONE_INTEGER);
        final SubLObject prep_pos = where_is_first_prepositionP(string);
        if (NIL != subl_promotions.positive_integer_p(prep_pos)) {
            head_noun_pos = subtract(prep_pos, ONE_INTEGER);
        } else {
            head_noun_pos = final_pos;
        }
        return string_utilities.nth_word_of_string(head_noun_pos, string);
    }

    /**
     *
     *
     * @unknown an integer corresponding to the position of the first (left most) preposition in string; when string contains no prepositoin, it returns nil
     */
    @LispMethod(comment = "@unknown an integer corresponding to the position of the first (left most) preposition in string; when string contains no prepositoin, it returns nil")
    public static final SubLObject where_is_first_prepositionP_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                SubLObject location = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
                    try {
                        string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
                        {
                            SubLObject word_list_var = string_utilities.break_words(string, NOT_TEST_CHAR, UNPROVIDED);
                            SubLObject cdolist_list_var = word_list_var;
                            SubLObject word = NIL;
                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                if ((NIL != doneP) || (NIL != lexicon_accessors.preposition_stringP(word, UNPROVIDED))) {
                                    doneP = T;
                                } else {
                                    location = add(location, ONE_INTEGER);
                                }
                            }
                        }
                    } finally {
                        string_utilities.$test_char$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != doneP ? ((SubLObject) (location)) : NIL;
            }
        }
    }

    /**
     *
     *
     * @unknown an integer corresponding to the position of the first (left most) preposition in string; when string contains no prepositoin, it returns nil
     */
    @LispMethod(comment = "@unknown an integer corresponding to the position of the first (left most) preposition in string; when string contains no prepositoin, it returns nil")
    public static SubLObject where_is_first_prepositionP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject location = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words(string, NOT_TEST_CHAR, UNPROVIDED);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != doneP) || (NIL != lexicon_accessors.preposition_stringP(word, UNPROVIDED))) {
                    doneP = T;
                } else {
                    location = add(location, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        } finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        return NIL != doneP ? location : NIL;
    }

    public static final SubLObject every_word_starts_with_capitalP_alt(SubLObject string) {
        {
            SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            SubLObject non_capital_seenP = NIL;
            if (NIL == non_capital_seenP) {
                {
                    SubLObject csome_list_var = tokens;
                    SubLObject token = NIL;
                    for (token = csome_list_var.first(); !((NIL != non_capital_seenP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , token = csome_list_var.first()) {
                        if ((NIL != alpha_char_p(Strings.sublisp_char(token, ZERO_INTEGER))) && (NIL == upper_case_p(Strings.sublisp_char(token, ZERO_INTEGER)))) {
                            non_capital_seenP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == non_capital_seenP);
        }
    }

    public static SubLObject every_word_starts_with_capitalP(final SubLObject string) {
        final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
        SubLObject non_capital_seenP = NIL;
        if (NIL == non_capital_seenP) {
            SubLObject csome_list_var = tokens;
            SubLObject token = NIL;
            token = csome_list_var.first();
            while ((NIL == non_capital_seenP) && (NIL != csome_list_var)) {
                if ((NIL != alpha_char_p(Strings.sublisp_char(token, ZERO_INTEGER))) && (NIL == upper_case_p(Strings.sublisp_char(token, ZERO_INTEGER)))) {
                    non_capital_seenP = T;
                }
                csome_list_var = csome_list_var.rest();
                token = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == non_capital_seenP);
    }

    public static SubLObject declare_string_utilities_lexical_file() {
        declareFunction("denots_english_number_p", "DENOTS-ENGLISH-NUMBER-P", 1, 0, false);
        declareFunction("english_number_word_p", "ENGLISH-NUMBER-WORD-P", 1, 0, false);
        declareFunction("english_ordinal_word_string_p", "ENGLISH-ORDINAL-WORD-STRING-P", 1, 0, false);
        declareFunction("find_head_noun_of_string", "FIND-HEAD-NOUN-OF-STRING", 1, 0, false);
        declareFunction("where_is_first_prepositionP", "WHERE-IS-FIRST-PREPOSITION?", 1, 0, false);
        declareFunction("every_word_starts_with_capitalP", "EVERY-WORD-STARTS-WITH-CAPITAL?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_string_utilities_lexical_file() {
        return NIL;
    }

    public static final SubLObject setup_string_utilities_lexical_file_alt() {
        define_test_case_table_int($sym2$EVERY_WORD_STARTS_WITH_CAPITAL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt10);
        return NIL;
    }

    public static SubLObject setup_string_utilities_lexical_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int($sym2$EVERY_WORD_STARTS_WITH_CAPITAL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list9);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int($sym2$EVERY_WORD_STARTS_WITH_CAPITAL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt10);
        }
        return NIL;
    }

    public static SubLObject setup_string_utilities_lexical_file_Previous() {
        define_test_case_table_int($sym2$EVERY_WORD_STARTS_WITH_CAPITAL_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_string_utilities_lexical_file();
    }

    @Override
    public void initializeVariables() {
        init_string_utilities_lexical_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_string_utilities_lexical_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeString("st"), makeString("nd"), makeString("rd"), makeString("th"));

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt10 = list(list(list(makeString("Atheroembolic renal disease")), NIL), list(list(makeString("Atheroembolic Renal Disease")), T), list(list(makeString("atheroembolic renal disease")), NIL), list(list(makeString("disease")), NIL), list(list(makeString("Disease")), T));
}

/**
 * Total time: 130 ms
 */
