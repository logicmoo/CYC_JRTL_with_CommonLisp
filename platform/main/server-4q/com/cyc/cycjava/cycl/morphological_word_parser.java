/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MORPHOLOGICAL-WORD-PARSER
 * source file: /cyc/top/cycl/morphological-word-parser.lisp
 * created:     2019/07/03 17:38:23
 */
public final class morphological_word_parser extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_morphological_parsing_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_morphological_parsing_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject morphological_parsing_test_case_p(SubLObject morphological_parsing_test_case) {
        return classes.subloop_instanceof_class(morphological_parsing_test_case, MORPHOLOGICAL_PARSING_TEST_CASE);
    }

    public static final SubLFile me = new morphological_word_parser();

 public static final String myName = "com.cyc.cycjava.cycl.morphological_word_parser";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $complex_word_string_is_speech_partP_caching_state$ = makeSymbol("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*");



    static private final SubLList $list1 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("WORD-UNIT"));

    static private final SubLList $list2 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("WORD-UNIT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $WORD_POS_PRED = makeKeyword("WORD-POS-PRED");

    static private final SubLList $list7 = list(makeSymbol("&KEY"), makeSymbol("BASE"), makeSymbol("AFFIX"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list8 = list($BASE, makeKeyword("AFFIX"), makeKeyword("WORD-POS-PRED"));

    static private final SubLList $list11 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("SEM-PRED"));

    static private final SubLList $list12 = list(makeKeyword("WORD-DENOT"), makeKeyword("SEM-PRED"));

    static private final SubLList $list14 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("SEM-PRED"));

    static private final SubLList $list15 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("SEM-PRED"));

    static private final SubLSymbol $sym16$SPEECH_PART_ = makeSymbol("SPEECH-PART?");

    static private final SubLList $list18 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"));

    static private final SubLList $list19 = list(makeKeyword("WORD-UNIT"));

    static private final SubLList $list20 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list21 = list(makeKeyword("WORD-UNIT"), makeKeyword("WORD-POS-PRED"));

    static private final SubLList $list22 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"), makeSymbol("WORD-POS-PRED"), makeSymbol("SEM-PRED"));

    static private final SubLList $list23 = list(makeKeyword("WORD-UNIT"), makeKeyword("WORD-POS-PRED"), makeKeyword("SEM-PRED"));

    static private final SubLSymbol $sym27$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    static private final SubLList $list28 = list(makeSymbol("&KEY"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list29 = list(makeKeyword("WORD-POS-PRED"));

    static private final SubLSymbol $sym30$LEXICAL_WORD_ = makeSymbol("LEXICAL-WORD?");

    private static final SubLSymbol POS_OF_PRED = makeSymbol("POS-OF-PRED");

    static private final SubLSymbol $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_ = makeSymbol("COMPLEX-WORD-STRING-IS-SPEECH-PART?");

    static private final SubLSymbol $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_ = makeSymbol("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol PARSE_COMPLEX_WORD_STRING = makeSymbol("PARSE-COMPLEX-WORD-STRING");

    private static final SubLSymbol $parse_complex_word_string_caching_state$ = makeSymbol("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*");

    private static final SubLSymbol CLEAR_PARSE_COMPLEX_WORD_STRING = makeSymbol("CLEAR-PARSE-COMPLEX-WORD-STRING");

    private static final SubLSymbol $mwp_initializedP$ = makeSymbol("*MWP-INITIALIZED?*");

    private static final SubLSymbol MWP_PSEUDO_FUNCTION_P = makeSymbol("MWP-PSEUDO-FUNCTION-P");

    private static final SubLString $$$Morphological_Word_Parser = makeString("Morphological Word Parser");

    private static final SubLString $str44$Morphological_Word_Parser_Test_Su = makeString("Morphological Word Parser Test Suite");

    private static final SubLList $list45 = list(makeString("Morphological Word Parser"));

    // Definitions
    /**
     * Parse WORD-STRING using all known applicable affixes.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return LISTP ((<DENOT> <POS-PRED> <WORD-UNIT>)*)
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return LISTP ((<DENOT> <POS-PRED> <WORD-UNIT>)*)")
    public static final SubLObject parse_affixes_alt(SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_1 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt1);
                                current_1 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt1);
                                if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_1 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt1);
                            }
                            {
                                SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                if ((((NIL != word_denot) || (NIL != word_pos_pred)) || (NIL != word_unit)) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.denot_acceptableP(word_denot, suppress_fake_denotsP))) {
                                    {
                                        SubLObject item_var = list(word_denot, word_pos_pred, word_unit);
                                        if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    // Definitions
    /**
     * Parse WORD-STRING using all known applicable affixes.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return LISTP ((<DENOT> <POS-PRED> <WORD-UNIT>)*)
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return LISTP ((<DENOT> <POS-PRED> <WORD-UNIT>)*)")
    public static SubLObject parse_affixes(final SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$1;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$1 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list1);
                    current_$1 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list1);
                    if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$1 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list1);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                if ((((NIL != word_denot) || (NIL != word_pos_pred)) || (NIL != word_unit)) && (NIL != denot_acceptableP(word_denot, suppress_fake_denotsP))) {
                    item_var = list(word_denot, word_pos_pred, word_unit);
                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }

    /**
     * Parse WORD-STRING using all known applicable affixes.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP of NL-TRIE-WORD-P objects
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP of NL-TRIE-WORD-P objects")
    public static final SubLObject derived_nl_trie_words_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        com.cyc.cycjava.cycl.morphological_word_parser.mwp_check_initializations();
        return morph_word.derived_nl_trie_words_int(word_string, NIL);
    }

    /**
     * Parse WORD-STRING using all known applicable affixes.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP of NL-TRIE-WORD-P objects
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP of NL-TRIE-WORD-P objects")
    public static SubLObject derived_nl_trie_words(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        mwp_check_initializations();
        return morph_word.derived_nl_trie_words_int(word_string, NIL);
    }

    /**
     * Find possible stems for WORD-STRING.
     *
     * @return LISTP OF (<base> <affix> <pos-pred>) triples
     */
    @LispMethod(comment = "Find possible stems for WORD-STRING.\r\n\r\n@return LISTP OF (<base> <affix> <pos-pred>) triples")
    public static final SubLObject mwp_find_stems_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_2 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt7);
                                current_2 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt7);
                                if (NIL == member(current_2, $list_alt8, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_2 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt7);
                            }
                            {
                                SubLObject base_tail = property_list_member($BASE, current);
                                SubLObject base = (NIL != base_tail) ? ((SubLObject) (cadr(base_tail))) : NIL;
                                SubLObject affix_tail = property_list_member($AFFIX, current);
                                SubLObject affix = (NIL != affix_tail) ? ((SubLObject) (cadr(affix_tail))) : NIL;
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                SubLObject item_var = list(base, affix, word_pos_pred);
                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var, ans);
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Find possible stems for WORD-STRING.
     *
     * @return LISTP OF (<base> <affix> <pos-pred>) triples
     */
    @LispMethod(comment = "Find possible stems for WORD-STRING.\r\n\r\n@return LISTP OF (<base> <affix> <pos-pred>) triples")
    public static SubLObject mwp_find_stems(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$2;
        SubLObject base_tail;
        SubLObject base;
        SubLObject affix_tail;
        SubLObject affix;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$2 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list7);
                    current_$2 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list7);
                    if (NIL == member(current_$2, $list8, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$2 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list7);
                }
                base_tail = property_list_member($BASE, current);
                base = (NIL != base_tail) ? cadr(base_tail) : NIL;
                affix_tail = property_list_member($AFFIX, current);
                affix = (NIL != affix_tail) ? cadr(affix_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                item_var = list(base, affix, word_pos_pred);
                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
        }
        return ans;
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP ; CycL denotational terms denoted by WORD-STRING
     * @return 1 LISTP ; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP ; CycL denotational terms denoted by WORD-STRING\r\n@return 1 LISTP ; list of predicate lists for each denotation")
    public static final SubLObject denots_of_complex_word_string_alt(SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject denots = NIL;
            SubLObject sem_pred_lists = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_3 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt11);
                                current_3 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt11);
                                if (NIL == member(current_3, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_3 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt11);
                            }
                            {
                                SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                SubLObject sem_pred_tail = property_list_member($SEM_PRED, current);
                                SubLObject sem_pred = (NIL != sem_pred_tail) ? ((SubLObject) (cadr(sem_pred_tail))) : NIL;
                                if (((NIL != word_denot) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                                    denots = cons(word_denot, denots);
                                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                                }
                            }
                        }
                    }
                }
            }
            return values(denots, sem_pred_lists);
        }
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP ; CycL denotational terms denoted by WORD-STRING
     * @return 1 LISTP ; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP ; CycL denotational terms denoted by WORD-STRING\r\n@return 1 LISTP ; list of predicate lists for each denotation")
    public static SubLObject denots_of_complex_word_string(final SubLObject word_string, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject denots = NIL;
        SubLObject sem_pred_lists = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$3;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$3 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list11);
                    current_$3 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list11);
                    if (NIL == member(current_$3, $list12, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$3 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list11);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                sem_pred_tail = property_list_member($SEM_PRED, current);
                sem_pred = (NIL != sem_pred_tail) ? cadr(sem_pred_tail) : NIL;
                if (((NIL != word_denot) && (NIL != denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                    denots = cons(word_denot, denots);
                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                }
            }
        }
        return values(denots, sem_pred_lists);
    }

    /**
     * Parse WORD-STRING as the speech-part POS-PRED using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-PRED
     * 		predicate-p; a #$SpeechPartPredicate by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part pred POS-PRED.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-PRED using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-PRED\r\n\t\tpredicate-p; a #$SpeechPartPredicate by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part pred POS-PRED.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static final SubLObject denots_of_complex_word_stringXpos_pred_alt(SubLObject word_string, SubLObject pos_pred, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject denots = NIL;
            SubLObject sem_pred_lists = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_4 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                current_4 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                if (NIL == member(current_4, $list_alt15, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_4 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt14);
                            }
                            {
                                SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                SubLObject sem_pred_tail = property_list_member($SEM_PRED, current);
                                SubLObject sem_pred = (NIL != sem_pred_tail) ? ((SubLObject) (cadr(sem_pred_tail))) : NIL;
                                if (((NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pos_pred, mt)) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                                    denots = cons(word_denot, denots);
                                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                                }
                            }
                        }
                    }
                }
            }
            return values(denots, sem_pred_lists);
        }
    }

    /**
     * Parse WORD-STRING as the speech-part POS-PRED using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-PRED
     * 		predicate-p; a #$SpeechPartPredicate by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part pred POS-PRED.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-PRED using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-PRED\r\n\t\tpredicate-p; a #$SpeechPartPredicate by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part pred POS-PRED.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static SubLObject denots_of_complex_word_stringXpos_pred(final SubLObject word_string, final SubLObject pos_pred, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject denots = NIL;
        SubLObject sem_pred_lists = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$4;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$4 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list14);
                    current_$4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list14);
                    if (NIL == member(current_$4, $list15, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list14);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                sem_pred_tail = property_list_member($SEM_PRED, current);
                sem_pred = (NIL != sem_pred_tail) ? cadr(sem_pred_tail) : NIL;
                if (((NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pos_pred, mt)) && (NIL != denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                    denots = cons(word_denot, denots);
                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                }
            }
        }
        return values(denots, sem_pred_lists);
    }

    /**
     * Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
     * 		speech-part?; a #$SpeechPart by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part SPEECH-PART.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\r\n\t\tspeech-part?; a #$SpeechPart by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part SPEECH-PART.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static final SubLObject denots_of_complex_word_stringXspeech_part_alt(SubLObject word_string, SubLObject speech_part, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(speech_part, $sym16$SPEECH_PART_);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject denots = NIL;
            SubLObject sem_pred_lists = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_5 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                current_5 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                if (NIL == member(current_5, $list_alt15, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_5 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt14);
                            }
                            {
                                SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                SubLObject sem_pred_tail = property_list_member($SEM_PRED, current);
                                SubLObject sem_pred = (NIL != sem_pred_tail) ? ((SubLObject) (cadr(sem_pred_tail))) : NIL;
                                if (((NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                                    denots = cons(word_denot, denots);
                                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                                }
                            }
                        }
                    }
                }
            }
            return values(denots, sem_pred_lists);
        }
    }

    /**
     * Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
     * 		speech-part?; a #$SpeechPart by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part SPEECH-PART.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\r\n\t\tspeech-part?; a #$SpeechPart by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part SPEECH-PART.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static SubLObject denots_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part, SubLObject suppress_fake_denotsP) {
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.speech_partP(speech_part, UNPROVIDED) : "! lexicon_accessors.speech_partP(speech_part, .UNPROVIDED) " + ("lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) ") + speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject denots = NIL;
        SubLObject sem_pred_lists = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$5;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$5 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list14);
                    current_$5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list14);
                    if (NIL == member(current_$5, $list15, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list14);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                sem_pred_tail = property_list_member($SEM_PRED, current);
                sem_pred = (NIL != sem_pred_tail) ? cadr(sem_pred_tail) : NIL;
                if (((NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) && (NIL != denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                    denots = cons(word_denot, denots);
                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                }
            }
        }
        return values(denots, sem_pred_lists);
    }

    /**
     * Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-KEYWORD
     * 		keywordp; a POS keyword by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part POS-KEYWORD.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-KEYWORD\r\n\t\tkeywordp; a POS keyword by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part POS-KEYWORD.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static final SubLObject denots_of_complex_word_stringXpos_alt(SubLObject word_string, SubLObject pos_keyword, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(pos_keyword, KEYWORDP);
        {
            SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject denots = NIL;
            SubLObject sem_pred_lists = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_6 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                current_6 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt14);
                                if (NIL == member(current_6, $list_alt15, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_6 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt14);
                            }
                            {
                                SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                SubLObject sem_pred_tail = property_list_member($SEM_PRED, current);
                                SubLObject sem_pred = (NIL != sem_pred_tail) ? ((SubLObject) (cadr(sem_pred_tail))) : NIL;
                                if (((NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, symbol_function(EQ), UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                                    denots = cons(word_denot, denots);
                                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                                }
                            }
                        }
                    }
                }
            }
            return values(denots, sem_pred_lists);
        }
    }

    /**
     * Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes, and return derived meanings.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-KEYWORD
     * 		keywordp; a POS keyword by which to constrain the results
     * @param SUPPRESS-FAKE-DENOTS?
     * 		booleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P
     * @return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part POS-KEYWORD.
     * @return 1 LISTP; list of predicate lists for each denotation
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes, and return derived meanings.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-KEYWORD\r\n\t\tkeywordp; a POS keyword by which to constrain the results\r\n@param SUPPRESS-FAKE-DENOTS?\r\n\t\tbooleanp; whether to suppress denotata containing an MWP-PSEUDO-FUNCTION-P\r\n@return 0 LISTP; CycL denotational terms denoted by WORD-STRING with the speech-part POS-KEYWORD.\r\n@return 1 LISTP; list of predicate lists for each denotation")
    public static SubLObject denots_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt, SubLObject suppress_fake_denotsP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (suppress_fake_denotsP == UNPROVIDED) {
            suppress_fake_denotsP = T;
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != keywordp(pos_keyword) : "! keywordp(pos_keyword) " + ("Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) ") + pos_keyword;
        final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject denots = NIL;
        SubLObject sem_pred_lists = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$6;
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$6 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list14);
                    current_$6 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list14);
                    if (NIL == member(current_$6, $list15, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$6 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list14);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                sem_pred_tail = property_list_member($SEM_PRED, current);
                sem_pred = (NIL != sem_pred_tail) ? cadr(sem_pred_tail) : NIL;
                if (((NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, symbol_function(EQL), UNPROVIDED)) && (NIL != denot_acceptableP(word_denot, suppress_fake_denotsP))) && (NIL == subl_promotions.memberP(word_denot, denots, symbol_function(EQUAL), UNPROVIDED))) {
                    denots = cons(word_denot, denots);
                    sem_pred_lists = cons(list(sem_pred), sem_pred_lists);
                }
            }
        }
        return values(denots, sem_pred_lists);
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP; word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP; word units associated with WORD-STRING.")
    public static final SubLObject words_of_complex_word_string_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_7 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt18);
                                current_7 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt18);
                                if (NIL == member(current_7, $list_alt19, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_7 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt18);
                            }
                            {
                                SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                SubLObject item_var = word_unit;
                                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    ans = cons(item_var, ans);
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP; word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP; word units associated with WORD-STRING.")
    public static SubLObject words_of_complex_word_string(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$7;
        SubLObject word_unit_tail;
        SubLObject item_var;
        SubLObject word_unit;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$7 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list18);
                    current_$7 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list18);
                    if (NIL == member(current_$7, $list19, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$7 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list18);
                }
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = item_var = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
        }
        return ans;
    }

    /**
     * Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
     * 		speech-part?; a #$SpeechPart by which to constrain the results
     * @return LISTP; complex word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\r\n\t\tspeech-part?; a #$SpeechPart by which to constrain the results\r\n@return LISTP; complex word units associated with WORD-STRING.\nParse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,\nand return associated word units.")
    public static final SubLObject words_of_complex_word_stringXspeech_part_alt(SubLObject word_string, SubLObject speech_part) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(speech_part, $sym16$SPEECH_PART_);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject words_to_preds = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (NIL != morph_word.mwp_parse_complex_p(parse)) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_8 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    current_8 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    if (NIL == member(current_8, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_8 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt20);
                                }
                                {
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) {
                                        words_to_preds = list_utilities.alist_pushnew(words_to_preds, word_unit, word_pos_pred, symbol_function(EQUAL), symbol_function(EQUAL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(list_utilities.alist_keys(words_to_preds), list_utilities.alist_values(words_to_preds));
        }
    }

    /**
     * Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
     * 		speech-part?; a #$SpeechPart by which to constrain the results
     * @return LISTP; complex word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\r\n\t\tspeech-part?; a #$SpeechPart by which to constrain the results\r\n@return LISTP; complex word units associated with WORD-STRING.\nParse WORD-STRING as the speech-part SPEECH-PART using all known applicable affixes,\nand return associated word units.")
    public static SubLObject words_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.speech_partP(speech_part, UNPROVIDED) : "! lexicon_accessors.speech_partP(speech_part, .UNPROVIDED) " + ("lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) ") + speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject words_to_preds = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$8;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && (NIL != morph_word.mwp_parse_complex_p(parse))) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$8 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list20);
                    current_$8 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list20);
                    if (NIL == member(current_$8, $list21, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$8 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list20);
                }
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) {
                    words_to_preds = list_utilities.alist_pushnew(words_to_preds, word_unit, word_pos_pred, symbol_function(EQUAL), symbol_function(EQUAL));
                }
            }
        }
        return values(list_utilities.alist_keys(words_to_preds), list_utilities.alist_values(words_to_preds));
    }

    /**
     * Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-KEYWORD
     * 		keywordp; a POS keyword by which to constrain the results
     * @return 0 LISTP; complex word units associated with WORD-STRING.
     * @return 1 LISTP; a #$SpeechPartPredicate for each word-unit
     * @return 2 LISTP; list of predicate lists for each word-unit
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-KEYWORD\r\n\t\tkeywordp; a POS keyword by which to constrain the results\r\n@return 0 LISTP; complex word units associated with WORD-STRING.\r\n@return 1 LISTP; a #$SpeechPartPredicate for each word-unit\r\n@return 2 LISTP; list of predicate lists for each word-unit\nParse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,\nand return associated word units.")
    public static final SubLObject words_of_complex_word_stringXpos_alt(SubLObject word_string, SubLObject pos_keyword, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(pos_keyword, KEYWORDP);
        {
            SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject triples = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (NIL != morph_word.mwp_parse_complex_p(parse)) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_9 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt22);
                                    current_9 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt22);
                                    if (NIL == member(current_9, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_9 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt22);
                                }
                                {
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    SubLObject sem_pred_tail = property_list_member($SEM_PRED, current);
                                    SubLObject sem_pred = (NIL != sem_pred_tail) ? ((SubLObject) (cadr(sem_pred_tail))) : NIL;
                                    if (NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, symbol_function(EQ), UNPROVIDED)) {
                                        {
                                            SubLObject item_var = list(word_unit, word_pos_pred, sem_pred);
                                            if (NIL == member(item_var, triples, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                triples = cons(item_var, triples);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(Mapping.mapcar(symbol_function(FIRST), triples), Mapping.mapcar(symbol_function(SECOND), triples), Mapping.mapcar(symbol_function(THIRD), triples));
        }
    }

    /**
     * Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param POS-KEYWORD
     * 		keywordp; a POS keyword by which to constrain the results
     * @return 0 LISTP; complex word units associated with WORD-STRING.
     * @return 1 LISTP; a #$SpeechPartPredicate for each word-unit
     * @return 2 LISTP; list of predicate lists for each word-unit
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param POS-KEYWORD\r\n\t\tkeywordp; a POS keyword by which to constrain the results\r\n@return 0 LISTP; complex word units associated with WORD-STRING.\r\n@return 1 LISTP; a #$SpeechPartPredicate for each word-unit\r\n@return 2 LISTP; list of predicate lists for each word-unit\nParse WORD-STRING as the speech-part POS-KEYWORD using all known applicable affixes,\nand return associated word units.")
    public static SubLObject words_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != keywordp(pos_keyword) : "! keywordp(pos_keyword) " + ("Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) ") + pos_keyword;
        final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword(pos_keyword, mt);
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject triples = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$9;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject sem_pred_tail;
        SubLObject sem_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && (NIL != morph_word.mwp_parse_complex_p(parse))) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$9 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list22);
                    current_$9 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list22);
                    if (NIL == member(current_$9, $list23, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$9 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list22);
                }
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                sem_pred_tail = property_list_member($SEM_PRED, current);
                sem_pred = (NIL != sem_pred_tail) ? cadr(sem_pred_tail) : NIL;
                if (NIL != subl_promotions.memberP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part_list, symbol_function(EQL), UNPROVIDED)) {
                    item_var = list(word_unit, word_pos_pred, sem_pred);
                    if (NIL == member(item_var, triples, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        triples = cons(item_var, triples);
                    }
                }
            }
        }
        return values(Mapping.mapcar(symbol_function(FIRST), triples), Mapping.mapcar(symbol_function(SECOND), triples), Mapping.mapcar(symbol_function(THIRD), triples));
    }

    /**
     * Parse WORD-STRING as the speech-part PRED using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param PRED
     * 		speech-part-pred?; a speech-part by which to constrain the results
     * @return LISTP; complex word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part PRED using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param PRED\r\n\t\tspeech-part-pred?; a speech-part by which to constrain the results\r\n@return LISTP; complex word units associated with WORD-STRING.\nParse WORD-STRING as the speech-part PRED using all known applicable affixes,\nand return associated word units.")
    public static final SubLObject words_of_complex_word_stringXpred_alt(SubLObject word_string, SubLObject pred) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(pred, $sym27$SPEECH_PART_PRED_);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (NIL != morph_word.mwp_parse_complex_p(parse)) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_10 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    current_10 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    if (NIL == member(current_10, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_10 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt20);
                                }
                                {
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    if (NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pred, UNPROVIDED)) {
                                        {
                                            SubLObject item_var = word_unit;
                                            if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var, ans);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Parse WORD-STRING as the speech-part PRED using all known applicable affixes,
     * and return associated word units.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param PRED
     * 		speech-part-pred?; a speech-part by which to constrain the results
     * @return LISTP; complex word units associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING as the speech-part PRED using all known applicable affixes,\r\nand return associated word units.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param PRED\r\n\t\tspeech-part-pred?; a speech-part by which to constrain the results\r\n@return LISTP; complex word units associated with WORD-STRING.\nParse WORD-STRING as the speech-part PRED using all known applicable affixes,\nand return associated word units.")
    public static SubLObject words_of_complex_word_stringXpred(final SubLObject word_string, final SubLObject pred) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "! lexicon_accessors.speech_part_predP(pred, .UNPROVIDED) " + ("lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) ") + pred;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$10;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && (NIL != morph_word.mwp_parse_complex_p(parse))) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$10 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list20);
                    current_$10 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list20);
                    if (NIL == member(current_$10, $list21, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$10 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list20);
                }
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                if (NIL != lexicon_accessors.genl_pos_predP(word_pos_pred, pred, UNPROVIDED)) {
                    item_var = word_unit;
                    if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return listp; all syntactic predicates applicable to the string.
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated syntactic predicates.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return listp; all syntactic predicates applicable to the string.")
    public static final SubLObject preds_of_complex_word_string_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (NIL != morph_word.mwp_parse_complex_p(parse)) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_11 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt28);
                                    current_11 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt28);
                                    if (NIL == member(current_11, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt28);
                                }
                                {
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    SubLObject item_var = word_pos_pred;
                                    if (NIL == member(item_var, ans, symbol_function(EQ), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return listp; all syntactic predicates applicable to the string.
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated syntactic predicates.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return listp; all syntactic predicates applicable to the string.")
    public static SubLObject preds_of_complex_word_string(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$11;
        SubLObject word_pos_pred_tail;
        SubLObject item_var;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && (NIL != morph_word.mwp_parse_complex_p(parse))) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$11 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list28);
                    current_$11 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list28);
                    if (NIL == member(current_$11, $list29, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$11 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list28);
                }
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = item_var = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
        }
        return ans;
    }/**
     * Parse WORD-STRING using all known applicable affixes, and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return listp; all syntactic predicates applicable to the string.
     */


    /**
     * Parse WORD-STRING as the word-unit WORD using all known applicable affixes,
     * and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param WORD
     * 		lexical-word?; a CycL word-unit by which to constrain the results.
     * @return listp; all syntactic predicates applicable to the string and word-unit.
     */
    @LispMethod(comment = "Parse WORD-STRING as the word-unit WORD using all known applicable affixes,\r\nand return associated syntactic predicates.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param WORD\r\n\t\tlexical-word?; a CycL word-unit by which to constrain the results.\r\n@return listp; all syntactic predicates applicable to the string and word-unit.\nParse WORD-STRING as the word-unit WORD using all known applicable affixes,\nand return associated syntactic predicates.")
    public static final SubLObject preds_of_complex_word_stringXword_alt(SubLObject word_string, SubLObject word) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(word, $sym30$LEXICAL_WORD_);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (NIL != morph_word.mwp_parse_complex_p(parse)) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_12 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    current_12 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt20);
                                    if (NIL == member(current_12, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_12 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt20);
                                }
                                {
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    if (NIL != czer_utilities.equals_elP(word_unit, word, UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject item_var = word_pos_pred;
                                            if (NIL == member(item_var, ans, symbol_function(EQ), symbol_function(IDENTITY))) {
                                                ans = cons(item_var, ans);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Parse WORD-STRING as the word-unit WORD using all known applicable affixes,
     * and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param WORD
     * 		lexical-word?; a CycL word-unit by which to constrain the results.
     * @return listp; all syntactic predicates applicable to the string and word-unit.
     */
    @LispMethod(comment = "Parse WORD-STRING as the word-unit WORD using all known applicable affixes,\r\nand return associated syntactic predicates.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param WORD\r\n\t\tlexical-word?; a CycL word-unit by which to constrain the results.\r\n@return listp; all syntactic predicates applicable to the string and word-unit.\nParse WORD-STRING as the word-unit WORD using all known applicable affixes,\nand return associated syntactic predicates.")
    public static SubLObject preds_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.lexical_wordP(word) : "! lexicon_accessors.lexical_wordP(word) " + ("lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) ") + word;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$12;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && (NIL != morph_word.mwp_parse_complex_p(parse))) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$12 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list20);
                    current_$12 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list20);
                    if (NIL == member(current_$12, $list21, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$12 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list20);
                }
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                if (NIL != czer_utilities.equals_elP(word_unit, word, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    item_var = word_pos_pred;
                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
            }
        }
        return ans;
    }/**
     * Parse WORD-STRING as the word-unit WORD using all known applicable affixes,
     * and return associated syntactic predicates.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param WORD
     * 		lexical-word?; a CycL word-unit by which to constrain the results.
     * @return listp; all syntactic predicates applicable to the string and word-unit.
     */


    /**
     * Parse WORD-STRING using all known applicable affixes, and return associated speech parts.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP; all speech parts associated with WORD-STRING.
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated speech parts.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP; all speech parts associated with WORD-STRING.")
    public static final SubLObject pos_of_complex_word_string_alt(SubLObject word_string) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        {
            SubLObject word_pos_preds = com.cyc.cycjava.cycl.morphological_word_parser.preds_of_complex_word_string(word_string);
            return list_utilities.mapcar_unique(symbol_function(POS_OF_PRED), word_pos_preds, symbol_function(EQ));
        }
    }

    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return associated speech parts.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP; all speech parts associated with WORD-STRING.")
    public static SubLObject pos_of_complex_word_string(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        final SubLObject word_pos_preds = preds_of_complex_word_string(word_string);
        return list_utilities.mapcar_unique(symbol_function(POS_OF_PRED), word_pos_preds, symbol_function(EQL));
    }/**
     * Parse WORD-STRING using all known applicable affixes, and return associated speech parts.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP; all speech parts associated with WORD-STRING.
     */


    /**
     * Parse WORD-STRING as the word-unit WORD using all known applicable affixes, and return associated speech parts.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param WORD
     * 		lexical-word?; a CycL word-unit by which to constrain the results.
     * @return LISTP; all speech parts associated with WORD-STRING and WORD.
     */
    @LispMethod(comment = "Parse WORD-STRING as the word-unit WORD using all known applicable affixes, and return associated speech parts.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param WORD\r\n\t\tlexical-word?; a CycL word-unit by which to constrain the results.\r\n@return LISTP; all speech parts associated with WORD-STRING and WORD.")
    public static final SubLObject pos_of_complex_word_stringXword_alt(SubLObject word_string, SubLObject word) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(word, $sym30$LEXICAL_WORD_);
        {
            SubLObject word_pos_preds = com.cyc.cycjava.cycl.morphological_word_parser.preds_of_complex_word_stringXword(word_string, word);
            return list_utilities.mapcar_unique(symbol_function(POS_OF_PRED), word_pos_preds, symbol_function(EQ));
        }
    }

    @LispMethod(comment = "Parse WORD-STRING as the word-unit WORD using all known applicable affixes, and return associated speech parts.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param WORD\r\n\t\tlexical-word?; a CycL word-unit by which to constrain the results.\r\n@return LISTP; all speech parts associated with WORD-STRING and WORD.")
    public static SubLObject pos_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.lexical_wordP(word) : "! lexicon_accessors.lexical_wordP(word) " + ("lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) ") + word;
        final SubLObject word_pos_preds = preds_of_complex_word_stringXword(word_string, word);
        return list_utilities.mapcar_unique(symbol_function(POS_OF_PRED), word_pos_preds, symbol_function(EQL));
    }/**
     * Parse WORD-STRING as the word-unit WORD using all known applicable affixes, and return associated speech parts.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param WORD
     * 		lexical-word?; a CycL word-unit by which to constrain the results.
     * @return LISTP; all speech parts associated with WORD-STRING and WORD.
     */


    public static final SubLObject clear_complex_word_string_is_speech_partP_alt() {
        {
            SubLObject cs = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_complex_word_string_is_speech_partP() {
        final SubLObject cs = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_complex_word_string_is_speech_partP_alt(SubLObject word_string, SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args($complex_word_string_is_speech_partP_caching_state$.getGlobalValue(), list(word_string, speech_part), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args($complex_word_string_is_speech_partP_caching_state$.getGlobalValue(), list(word_string, speech_part), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Parse WORD-STRING using all known applicable affixes, and return whether it has the speech-part SPEECH-PART.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
    speech-part?;
     * 		
     * @return BOOLEAN; Does WORD-STRING have the speech-part SPEECH-PART?
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return whether it has the speech-part SPEECH-PART.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\nspeech-part?;\r\n\t\t\r\n@return BOOLEAN; Does WORD-STRING have the speech-part SPEECH-PART?")
    public static final SubLObject complex_word_string_is_speech_partP_internal_alt(SubLObject word_string, SubLObject speech_part) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        SubLTrampolineFile.checkType(speech_part, $sym16$SPEECH_PART_);
        {
            SubLObject v_morph_word = com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string(word_string, UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject datum = parse;
                            SubLObject current = datum;
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_13 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt28);
                                current_13 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt28);
                                if (NIL == member(current_13, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_13 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt28);
                            }
                            {
                                SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes, and return whether it has the speech-part SPEECH-PART.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@param SPEECH-PART\n\t\tspeech-part?;\r\n\t\t\r\n@return BOOLEAN; Does WORD-STRING have the speech-part SPEECH-PART?")
    public static SubLObject complex_word_string_is_speech_partP_internal(final SubLObject word_string, final SubLObject speech_part) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        assert NIL != lexicon_accessors.speech_partP(speech_part, UNPROVIDED) : "! lexicon_accessors.speech_partP(speech_part, .UNPROVIDED) " + ("lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) ") + speech_part;
        final SubLObject v_morph_word = parse_complex_word_string(word_string, UNPROVIDED);
        final SubLObject set_var = morph_word.morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject current;
        SubLObject datum;
        SubLObject allow_other_keys_p;
        SubLObject rest;
        SubLObject bad;
        SubLObject current_$13;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$13 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list28);
                    current_$13 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list28);
                    if (NIL == member(current_$13, $list29, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$13 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list28);
                }
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(word_pos_pred), speech_part, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }/**
     * Parse WORD-STRING using all known applicable affixes, and return whether it has the speech-part SPEECH-PART.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @param SPEECH-PART
    		speech-part?;
     * 		
     * @return BOOLEAN; Does WORD-STRING have the speech-part SPEECH-PART?
     */


    public static final SubLObject complex_word_string_is_speech_partP_alt(SubLObject word_string, SubLObject speech_part) {
        {
            SubLObject caching_state = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_, $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_, $int$200, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (word_string.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && speech_part.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morphological_word_parser.complex_word_string_is_speech_partP_internal(word_string, speech_part)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_string, speech_part));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part) {
        SubLObject caching_state = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_, $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_, $int$200, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && speech_part.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(complex_word_string_is_speech_partP_internal(word_string, speech_part)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_string, speech_part));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_parse_complex_word_string_alt() {
        {
            SubLObject cs = $parse_complex_word_string_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_parse_complex_word_string() {
        final SubLObject cs = $parse_complex_word_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_parse_complex_word_string_alt(SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($parse_complex_word_string_caching_state$.getGlobalValue(), list(word_string, wff_filter_level), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($parse_complex_word_string_caching_state$.getGlobalValue(), list(word_string, wff_filter_level), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Parse WORD-STRING as a morphologically complex word.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return morph-word-p;  a morph-word representing WORD-STRING, parsed.
     */
    @LispMethod(comment = "Parse WORD-STRING as a morphologically complex word.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return morph-word-p;  a morph-word representing WORD-STRING, parsed.")
    public static final SubLObject parse_complex_word_string_internal_alt(SubLObject word_string, SubLObject wff_filter_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(word_string, STRINGP);
            com.cyc.cycjava.cycl.morphological_word_parser.mwp_check_initializations();
            {
                SubLObject word = morph_word.new_morph_word(word_string);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$mwp_wff_filter_level$.currentBinding(thread);
                    try {
                        lexicon_vars.$mwp_wff_filter_level$.bind(wff_filter_level, thread);
                        morph_word.morph_word_parse_affixes(word, UNPROVIDED);
                    } finally {
                        lexicon_vars.$mwp_wff_filter_level$.rebind(_prev_bind_0, thread);
                    }
                }
                return word;
            }
        }
    }

    @LispMethod(comment = "Parse WORD-STRING as a morphologically complex word.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return morph-word-p;  a morph-word representing WORD-STRING, parsed.")
    public static SubLObject parse_complex_word_string_internal(final SubLObject word_string, final SubLObject wff_filter_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        mwp_check_initializations();
        final SubLObject word = morph_word.new_morph_word(word_string);
        final SubLObject _prev_bind_0 = lexicon_vars.$mwp_wff_filter_level$.currentBinding(thread);
        try {
            lexicon_vars.$mwp_wff_filter_level$.bind(wff_filter_level, thread);
            morph_word.morph_word_parse_affixes(word, UNPROVIDED);
        } finally {
            lexicon_vars.$mwp_wff_filter_level$.rebind(_prev_bind_0, thread);
        }
        return word;
    }/**
     * Parse WORD-STRING as a morphologically complex word.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return morph-word-p;  a morph-word representing WORD-STRING, parsed.
     */


    public static final SubLObject parse_complex_word_string_alt(SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        {
            SubLObject caching_state = $parse_complex_word_string_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PARSE_COMPLEX_WORD_STRING, $parse_complex_word_string_caching_state$, $int$1000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_PARSE_COMPLEX_WORD_STRING);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, wff_filter_level);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (word_string.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && wff_filter_level.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morphological_word_parser.parse_complex_word_string_internal(word_string, wff_filter_level)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_string, wff_filter_level));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level) {
        if (wff_filter_level == UNPROVIDED) {
            wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
        }
        SubLObject caching_state = $parse_complex_word_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PARSE_COMPLEX_WORD_STRING, $parse_complex_word_string_caching_state$, $int$1000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_PARSE_COMPLEX_WORD_STRING);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, wff_filter_level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && wff_filter_level.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(parse_complex_word_string_internal(word_string, wff_filter_level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_string, wff_filter_level));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject mwp_check_initializations_alt() {
        if (NIL == com.cyc.cycjava.cycl.morphological_word_parser.mwp_initializedP()) {
            com.cyc.cycjava.cycl.morphological_word_parser.initialize_mwp();
        }
        return NIL;
    }

    public static SubLObject mwp_check_initializations() {
        if (NIL == mwp_initializedP()) {
            initialize_mwp();
        }
        return NIL;
    }

    public static final SubLObject mwp_initializedP_alt() {
        return $mwp_initializedP$.getGlobalValue();
    }

    public static SubLObject mwp_initializedP() {
        return $mwp_initializedP$.getGlobalValue();
    }

    /**
     * Compile the affix rules used by the morphological word parser.
     */
    @LispMethod(comment = "Compile the affix rules used by the morphological word parser.")
    public static final SubLObject initialize_mwp_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                try {
                    $silent_progressP$.bind(T, thread);
                    mwp_affix_matcher.mwp_suffix_matcher_init();
                    mwp_affix_matcher.mwp_prefix_matcher_init();
                    mwp_rule.mwp_rule_constraint_table_init();
                    mwp_rule.mwp_rule_spec_table_init();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_0, thread);
                }
            }
            $mwp_initializedP$.setGlobalValue(T);
            return NIL;
        }
    }

    @LispMethod(comment = "Compile the affix rules used by the morphological word parser.")
    public static SubLObject initialize_mwp() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(T, thread);
            mwp_affix_matcher.mwp_suffix_matcher_init();
            mwp_affix_matcher.mwp_prefix_matcher_init();
            mwp_rule.mwp_rule_constraint_table_init();
            mwp_rule.mwp_rule_spec_table_init();
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        $mwp_initializedP$.setGlobalValue(T);
        return NIL;
    }/**
     * Compile the affix rules used by the morphological word parser.
     */


    /**
     * Note that the MWP should be reinitialized before the next time it is run.
     */
    @LispMethod(comment = "Note that the MWP should be reinitialized before the next time it is run.")
    public static final SubLObject note_mwp_needs_reinitialization_alt() {
        $mwp_initializedP$.setGlobalValue(NIL);
        com.cyc.cycjava.cycl.morphological_word_parser.clear_complex_word_string_is_speech_partP();
        return NIL;
    }

    @LispMethod(comment = "Note that the MWP should be reinitialized before the next time it is run.")
    public static SubLObject note_mwp_needs_reinitialization() {
        $mwp_initializedP$.setGlobalValue(NIL);
        clear_complex_word_string_is_speech_partP();
        return NIL;
    }/**
     * Note that the MWP should be reinitialized before the next time it is run.
     */


    /**
     * Returns T unless DENOT is fake and we want to suppress fake derived meanings.
     */
    @LispMethod(comment = "Returns T unless DENOT is fake and we want to suppress fake derived meanings.")
    public static final SubLObject denot_acceptableP_alt(SubLObject denot, SubLObject suppress_fake_denotsP) {
        return makeBoolean(!((NIL != suppress_fake_denotsP) && (NIL != com.cyc.cycjava.cycl.morphological_word_parser.fake_derived_denotation_p(denot))));
    }

    @LispMethod(comment = "Returns T unless DENOT is fake and we want to suppress fake derived meanings.")
    public static SubLObject denot_acceptableP(final SubLObject denot, final SubLObject suppress_fake_denotsP) {
        return makeBoolean((NIL == suppress_fake_denotsP) || (NIL == fake_derived_denotation_p(denot)));
    }/**
     * Returns T unless DENOT is fake and we want to suppress fake derived meanings.
     */


    /**
     * Is OBJECT a fake derived denotation?
     * (These are denotations derived by combining units, at least one of which we don't know the meaning of.)
     */
    @LispMethod(comment = "Is OBJECT a fake derived denotation?\r\n(These are denotations derived by combining units, at least one of which we don\'t know the meaning of.)\nIs OBJECT a fake derived denotation?\n(These are denotations derived by combining units, at least one of which we don\'t know the meaning of.)")
    public static final SubLObject fake_derived_denotation_p_alt(SubLObject v_object) {
        return cycl_utilities.expression_find_if(symbol_function(MWP_PSEUDO_FUNCTION_P), v_object, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Is OBJECT a fake derived denotation?\r\n(These are denotations derived by combining units, at least one of which we don\'t know the meaning of.)\nIs OBJECT a fake derived denotation?\n(These are denotations derived by combining units, at least one of which we don\'t know the meaning of.)")
    public static SubLObject fake_derived_denotation_p(final SubLObject v_object) {
        return cycl_utilities.expression_find_if(symbol_function(MWP_PSEUDO_FUNCTION_P), v_object, UNPROVIDED, UNPROVIDED);
    }/**
     * Is OBJECT a fake derived denotation?
     * (These are denotations derived by combining units, at least one of which we don't know the meaning of.)
     */


    public static final SubLObject mwp_pseudo_function_p_alt(SubLObject v_object) {
        return makeBoolean((v_object == $APPLY_AFFIX) || (v_object == $DENOT_OF));
    }

    public static SubLObject mwp_pseudo_function_p(final SubLObject v_object) {
        return makeBoolean((v_object == $APPLY_AFFIX) || (v_object == $DENOT_OF));
    }

    public static final SubLObject declare_morphological_word_parser_file_alt() {
        declareFunction("parse_affixes", "PARSE-AFFIXES", 1, 1, false);
        declareFunction("derived_nl_trie_words", "DERIVED-NL-TRIE-WORDS", 1, 0, false);
        declareFunction("mwp_find_stems", "MWP-FIND-STEMS", 1, 0, false);
        declareFunction("denots_of_complex_word_string", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("denots_of_complex_word_stringXpos_pred", "DENOTS-OF-COMPLEX-WORD-STRING&POS-PRED", 2, 2, false);
        declareFunction("denots_of_complex_word_stringXspeech_part", "DENOTS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 1, false);
        declareFunction("denots_of_complex_word_stringXpos", "DENOTS-OF-COMPLEX-WORD-STRING&POS", 2, 2, false);
        declareFunction("words_of_complex_word_string", "WORDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("words_of_complex_word_stringXspeech_part", "WORDS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 0, false);
        declareFunction("words_of_complex_word_stringXpos", "WORDS-OF-COMPLEX-WORD-STRING&POS", 2, 1, false);
        declareFunction("words_of_complex_word_stringXpred", "WORDS-OF-COMPLEX-WORD-STRING&PRED", 2, 0, false);
        declareFunction("preds_of_complex_word_string", "PREDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("preds_of_complex_word_stringXword", "PREDS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        declareFunction("pos_of_complex_word_string", "POS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("pos_of_complex_word_stringXword", "POS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        declareFunction("clear_complex_word_string_is_speech_partP", "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 0, 0, false);
        declareFunction("remove_complex_word_string_is_speech_partP", "REMOVE-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        declareFunction("complex_word_string_is_speech_partP_internal", "COMPLEX-WORD-STRING-IS-SPEECH-PART?-INTERNAL", 2, 0, false);
        declareFunction("complex_word_string_is_speech_partP", "COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        declareFunction("clear_parse_complex_word_string", "CLEAR-PARSE-COMPLEX-WORD-STRING", 0, 0, false);
        declareFunction("remove_parse_complex_word_string", "REMOVE-PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("parse_complex_word_string_internal", "PARSE-COMPLEX-WORD-STRING-INTERNAL", 2, 0, false);
        declareFunction("parse_complex_word_string", "PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("mwp_check_initializations", "MWP-CHECK-INITIALIZATIONS", 0, 0, false);
        declareFunction("mwp_initializedP", "MWP-INITIALIZED?", 0, 0, false);
        declareFunction("initialize_mwp", "INITIALIZE-MWP", 0, 0, false);
        declareFunction("note_mwp_needs_reinitialization", "NOTE-MWP-NEEDS-REINITIALIZATION", 0, 0, false);
        declareFunction("denot_acceptableP", "DENOT-ACCEPTABLE?", 2, 0, false);
        declareFunction("fake_derived_denotation_p", "FAKE-DERIVED-DENOTATION-P", 1, 0, false);
        declareFunction("mwp_pseudo_function_p", "MWP-PSEUDO-FUNCTION-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_morphological_parsing_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_morphological_parsing_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("morphological_parsing_test_case_p", "MORPHOLOGICAL-PARSING-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_morphological_word_parser_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("parse_affixes", "PARSE-AFFIXES", 1, 1, false);
            declareFunction("derived_nl_trie_words", "DERIVED-NL-TRIE-WORDS", 1, 0, false);
            declareFunction("mwp_find_stems", "MWP-FIND-STEMS", 1, 0, false);
            declareFunction("denots_of_complex_word_string", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false);
            declareFunction("denots_of_complex_word_stringXpos_pred", "DENOTS-OF-COMPLEX-WORD-STRING&POS-PRED", 2, 2, false);
            declareFunction("denots_of_complex_word_stringXspeech_part", "DENOTS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 1, false);
            declareFunction("denots_of_complex_word_stringXpos", "DENOTS-OF-COMPLEX-WORD-STRING&POS", 2, 2, false);
            declareFunction("words_of_complex_word_string", "WORDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
            declareFunction("words_of_complex_word_stringXspeech_part", "WORDS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 0, false);
            declareFunction("words_of_complex_word_stringXpos", "WORDS-OF-COMPLEX-WORD-STRING&POS", 2, 1, false);
            declareFunction("words_of_complex_word_stringXpred", "WORDS-OF-COMPLEX-WORD-STRING&PRED", 2, 0, false);
            declareFunction("preds_of_complex_word_string", "PREDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
            declareFunction("preds_of_complex_word_stringXword", "PREDS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
            declareFunction("pos_of_complex_word_string", "POS-OF-COMPLEX-WORD-STRING", 1, 0, false);
            declareFunction("pos_of_complex_word_stringXword", "POS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
            declareFunction("clear_complex_word_string_is_speech_partP", "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 0, 0, false);
            declareFunction("remove_complex_word_string_is_speech_partP", "REMOVE-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
            declareFunction("complex_word_string_is_speech_partP_internal", "COMPLEX-WORD-STRING-IS-SPEECH-PART?-INTERNAL", 2, 0, false);
            declareFunction("complex_word_string_is_speech_partP", "COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
            declareFunction("clear_parse_complex_word_string", "CLEAR-PARSE-COMPLEX-WORD-STRING", 0, 0, false);
            declareFunction("remove_parse_complex_word_string", "REMOVE-PARSE-COMPLEX-WORD-STRING", 1, 1, false);
            declareFunction("parse_complex_word_string_internal", "PARSE-COMPLEX-WORD-STRING-INTERNAL", 2, 0, false);
            declareFunction("parse_complex_word_string", "PARSE-COMPLEX-WORD-STRING", 1, 1, false);
            declareFunction("mwp_check_initializations", "MWP-CHECK-INITIALIZATIONS", 0, 0, false);
            declareFunction("mwp_initializedP", "MWP-INITIALIZED?", 0, 0, false);
            declareFunction("initialize_mwp", "INITIALIZE-MWP", 0, 0, false);
            declareFunction("note_mwp_needs_reinitialization", "NOTE-MWP-NEEDS-REINITIALIZATION", 0, 0, false);
            declareFunction("denot_acceptableP", "DENOT-ACCEPTABLE?", 2, 0, false);
            declareFunction("fake_derived_denotation_p", "FAKE-DERIVED-DENOTATION-P", 1, 0, false);
            declareFunction("mwp_pseudo_function_p", "MWP-PSEUDO-FUNCTION-P", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_morphological_parsing_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_morphological_parsing_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("morphological_parsing_test_case_p", "MORPHOLOGICAL-PARSING-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_morphological_word_parser_file_Previous() {
        declareFunction("parse_affixes", "PARSE-AFFIXES", 1, 1, false);
        declareFunction("derived_nl_trie_words", "DERIVED-NL-TRIE-WORDS", 1, 0, false);
        declareFunction("mwp_find_stems", "MWP-FIND-STEMS", 1, 0, false);
        declareFunction("denots_of_complex_word_string", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("denots_of_complex_word_stringXpos_pred", "DENOTS-OF-COMPLEX-WORD-STRING&POS-PRED", 2, 2, false);
        declareFunction("denots_of_complex_word_stringXspeech_part", "DENOTS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 1, false);
        declareFunction("denots_of_complex_word_stringXpos", "DENOTS-OF-COMPLEX-WORD-STRING&POS", 2, 2, false);
        declareFunction("words_of_complex_word_string", "WORDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("words_of_complex_word_stringXspeech_part", "WORDS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 0, false);
        declareFunction("words_of_complex_word_stringXpos", "WORDS-OF-COMPLEX-WORD-STRING&POS", 2, 1, false);
        declareFunction("words_of_complex_word_stringXpred", "WORDS-OF-COMPLEX-WORD-STRING&PRED", 2, 0, false);
        declareFunction("preds_of_complex_word_string", "PREDS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("preds_of_complex_word_stringXword", "PREDS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        declareFunction("pos_of_complex_word_string", "POS-OF-COMPLEX-WORD-STRING", 1, 0, false);
        declareFunction("pos_of_complex_word_stringXword", "POS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false);
        declareFunction("clear_complex_word_string_is_speech_partP", "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 0, 0, false);
        declareFunction("remove_complex_word_string_is_speech_partP", "REMOVE-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        declareFunction("complex_word_string_is_speech_partP_internal", "COMPLEX-WORD-STRING-IS-SPEECH-PART?-INTERNAL", 2, 0, false);
        declareFunction("complex_word_string_is_speech_partP", "COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false);
        declareFunction("clear_parse_complex_word_string", "CLEAR-PARSE-COMPLEX-WORD-STRING", 0, 0, false);
        declareFunction("remove_parse_complex_word_string", "REMOVE-PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("parse_complex_word_string_internal", "PARSE-COMPLEX-WORD-STRING-INTERNAL", 2, 0, false);
        declareFunction("parse_complex_word_string", "PARSE-COMPLEX-WORD-STRING", 1, 1, false);
        declareFunction("mwp_check_initializations", "MWP-CHECK-INITIALIZATIONS", 0, 0, false);
        declareFunction("mwp_initializedP", "MWP-INITIALIZED?", 0, 0, false);
        declareFunction("initialize_mwp", "INITIALIZE-MWP", 0, 0, false);
        declareFunction("note_mwp_needs_reinitialization", "NOTE-MWP-NEEDS-REINITIALIZATION", 0, 0, false);
        declareFunction("denot_acceptableP", "DENOT-ACCEPTABLE?", 2, 0, false);
        declareFunction("fake_derived_denotation_p", "FAKE-DERIVED-DENOTATION-P", 1, 0, false);
        declareFunction("mwp_pseudo_function_p", "MWP-PSEUDO-FUNCTION-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_morphological_word_parser_file_alt() {
        deflexical("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*", NIL);
        deflexical("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*MWP-INITIALIZED?*", NIL != boundp($mwp_initializedP$) ? ((SubLObject) ($mwp_initializedP$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_morphological_word_parser_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*", NIL);
            deflexical("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*", NIL);
            deflexical("*MWP-INITIALIZED?*", SubLTrampolineFile.maybeDefault($mwp_initializedP$, $mwp_initializedP$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MWP-INITIALIZED?*", NIL != boundp($mwp_initializedP$) ? ((SubLObject) ($mwp_initializedP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_morphological_word_parser_file_Previous() {
        deflexical("*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*", NIL);
        deflexical("*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*MWP-INITIALIZED?*", SubLTrampolineFile.maybeDefault($mwp_initializedP$, $mwp_initializedP$, NIL));
        return NIL;
    }

    public static final SubLObject setup_morphological_word_parser_file_alt() {
        memoization_state.note_globally_cached_function($sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_);
        memoization_state.note_globally_cached_function(PARSE_COMPLEX_WORD_STRING);
        declare_defglobal($mwp_initializedP$);
        sunit_external.define_test_category($$$Morphological_Word_Parser, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MORPHOLOGICAL_PARSING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MORPHOLOGICAL_PARSING_TEST_CASE);
        classes.subloop_new_class(MORPHOLOGICAL_PARSING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt47);
        classes.class_set_implements_slot_listeners(MORPHOLOGICAL_PARSING_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(MORPHOLOGICAL_PARSING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(MORPHOLOGICAL_PARSING_TEST_CASE, $sym61$SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_INSTA);
        com.cyc.cycjava.cycl.morphological_word_parser.subloop_reserved_initialize_morphological_parsing_test_case_class(MORPHOLOGICAL_PARSING_TEST_CASE);
        sunit_macros.define_test_case_postamble(MORPHOLOGICAL_PARSING_TEST_CASE, $str_alt62$morphological_word_parser, $$$cycl, $list_alt64);
        sunit_macros.def_test_method_register(MORPHOLOGICAL_PARSING_TEST_CASE, TEST_MORPHOLOGICAL_PARSING);
        sunit_external.define_test_suite($str_alt66$Morphological_Word_Parser_Test_Su, $list_alt64, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_morphological_word_parser_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function($sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_);
            memoization_state.note_globally_cached_function(PARSE_COMPLEX_WORD_STRING);
            declare_defglobal($mwp_initializedP$);
            sunit_external.define_test_category($$$Morphological_Word_Parser, UNPROVIDED);
            sunit_external.define_test_suite($str44$Morphological_Word_Parser_Test_Su, $list45, UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($mwp_initializedP$);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MORPHOLOGICAL_PARSING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MORPHOLOGICAL_PARSING_TEST_CASE);
            classes.subloop_new_class(MORPHOLOGICAL_PARSING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt47);
            classes.class_set_implements_slot_listeners(MORPHOLOGICAL_PARSING_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(MORPHOLOGICAL_PARSING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(MORPHOLOGICAL_PARSING_TEST_CASE, $sym61$SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_INSTA);
            com.cyc.cycjava.cycl.morphological_word_parser.subloop_reserved_initialize_morphological_parsing_test_case_class(MORPHOLOGICAL_PARSING_TEST_CASE);
            sunit_macros.define_test_case_postamble(MORPHOLOGICAL_PARSING_TEST_CASE, $str_alt62$morphological_word_parser, $$$cycl, $list_alt64);
            sunit_macros.def_test_method_register(MORPHOLOGICAL_PARSING_TEST_CASE, TEST_MORPHOLOGICAL_PARSING);
            sunit_external.define_test_suite($str_alt66$Morphological_Word_Parser_Test_Su, $list_alt64, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_morphological_word_parser_file_Previous() {
        memoization_state.note_globally_cached_function($sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_);
        memoization_state.note_globally_cached_function(PARSE_COMPLEX_WORD_STRING);
        declare_defglobal($mwp_initializedP$);
        sunit_external.define_test_category($$$Morphological_Word_Parser, UNPROVIDED);
        sunit_external.define_test_suite($str44$Morphological_Word_Parser_Test_Su, $list45, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_morphological_word_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_morphological_word_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_morphological_word_parser_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("WORD-UNIT"));

    static private final SubLList $list_alt2 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("WORD-UNIT"));

    static private final SubLList $list_alt7 = list(makeSymbol("&KEY"), makeSymbol("BASE"), makeSymbol("AFFIX"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list_alt8 = list($BASE, makeKeyword("AFFIX"), makeKeyword("WORD-POS-PRED"));

    static private final SubLList $list_alt11 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("SEM-PRED"));

    static private final SubLList $list_alt12 = list(makeKeyword("WORD-DENOT"), makeKeyword("SEM-PRED"));

    static private final SubLList $list_alt14 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("SEM-PRED"));

    static private final SubLList $list_alt15 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("SEM-PRED"));

    static private final SubLList $list_alt18 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"));

    static private final SubLList $list_alt19 = list(makeKeyword("WORD-UNIT"));

    static private final SubLList $list_alt20 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list_alt21 = list(makeKeyword("WORD-UNIT"), makeKeyword("WORD-POS-PRED"));

    static private final SubLList $list_alt22 = list(makeSymbol("&KEY"), makeSymbol("WORD-UNIT"), makeSymbol("WORD-POS-PRED"), makeSymbol("SEM-PRED"));

    static private final SubLList $list_alt23 = list(makeKeyword("WORD-UNIT"), makeKeyword("WORD-POS-PRED"), makeKeyword("SEM-PRED"));

    static private final SubLList $list_alt28 = list(makeSymbol("&KEY"), makeSymbol("WORD-POS-PRED"));

    static private final SubLList $list_alt29 = list(makeKeyword("WORD-POS-PRED"));

    public static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol MORPHOLOGICAL_PARSING_TEST_CASE = makeSymbol("MORPHOLOGICAL-PARSING-TEST-CASE");

    static private final SubLList $list_alt47 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-MORPHOLOGICAL-PARSING"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-CLASS");

    static private final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_MORPHOLOGICAL_PARSING_TEST_CASE_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MORPHOLOGICAL-PARSING-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt62$morphological_word_parser = makeString("morphological-word-parser");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt64 = list(makeString("Morphological Word Parser"));

    private static final SubLSymbol TEST_MORPHOLOGICAL_PARSING = makeSymbol("TEST-MORPHOLOGICAL-PARSING");

    static private final SubLString $str_alt66$Morphological_Word_Parser_Test_Su = makeString("Morphological Word Parser Test Suite");
}

/**
 * Total time: 268 ms
 */
