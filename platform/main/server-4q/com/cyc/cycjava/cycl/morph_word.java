/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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


public final class morph_word extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new morph_word();

 public static final String myName = "com.cyc.cycjava.cycl.morph_word";


    private static final SubLSymbol MORPH_WORD_P = makeSymbol("MORPH-WORD-P");

    static private final SubLList $list6 = list(list(makeSymbol("PARSE"), makeSymbol("MORPH-WORD"), makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("COMPLEX-ONLY?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list($TYPE, makeKeyword("COMPLEX-ONLY?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $kw10$COMPLEX_ONLY_ = makeKeyword("COMPLEX-ONLY?");

    private static final SubLSymbol MORPH_WORD_PARSES = makeSymbol("MORPH-WORD-PARSES");

    private static final SubLSymbol MWP_PARSE_TYPE = makeSymbol("MWP-PARSE-TYPE");

    private static final SubLSymbol MWP_PARSE_COMPLEX_P = makeSymbol("MWP-PARSE-COMPLEX-P");

    private static final SubLSymbol MORPH_WORD_DO_PARSES = makeSymbol("MORPH-WORD-DO-PARSES");

    static private final SubLString $str20$__Parses_for__S___ = makeString("~&Parses for ~S:~%");

    private static final SubLSymbol MWP_TRIE_BASE_WORDS_BY_LOOKUP = makeSymbol("MWP-TRIE-BASE-WORDS-BY-LOOKUP");

    private static final SubLString $$$ence = makeString("ence");

    private static final SubLString $$$ent = makeString("ent");

    private static final SubLString $$$ily = makeString("ily");

    private static final SubLString $$$ey = makeString("ey");

    private static final SubLString $$$ic = makeString("ic");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$y = makeString("y");

    private static final SubLString $$$l = makeString("l");

    private static final SubLString $$$e = makeString("e");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $$$is = makeString("is");

    private static final SubLString $$$ion = makeString("ion");

    private static final SubLString $$$ide = makeString("ide");

    private static final SubLString $$$u = makeString("u");

    private static final SubLString $$$i = makeString("i");

    private static final SubLString $$$cept = makeString("cept");

    private static final SubLString $$$ive = makeString("ive");

    private static final SubLSymbol MWP_PREFIX_LOOKUP = makeSymbol("MWP-PREFIX-LOOKUP");

    private static final SubLList $list51 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("BASE"));

    private static final SubLList $list52 = list($RULE, $BASE);

    private static final SubLSymbol $BASE_POS_PRED = makeKeyword("BASE-POS-PRED");

    private static final SubLSymbol DERIVED_NL_TRIE_WORDS_INT = makeSymbol("DERIVED-NL-TRIE-WORDS-INT");

    private static final SubLList $list61 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("WORD-UNIT"), makeSymbol("MT"));

    private static final SubLList $list62 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("WORD-UNIT"), makeKeyword("MT"));

    private static final SubLSymbol $WORD_POS_PRED = makeKeyword("WORD-POS-PRED");

    private static final SubLSymbol MWP_SEMANTIC_CONSTRAINT_P = makeSymbol("MWP-SEMANTIC-CONSTRAINT-P");

    private static final SubLList $list65 = list($GENL, makeKeyword("ISA"));

    private static final SubLList $list69 = list(makeSymbol("TYPE"), makeSymbol("TARGET"));

    private static final SubLSymbol MWP_BASE_PRED_OF_POS = makeSymbol("MWP-BASE-PRED-OF-POS");

    private static final SubLSymbol $sym75$_PRED = makeSymbol("?PRED");



    private static final SubLList $list77 = list(makeSymbol("?PRED"));

    private static final SubLSymbol $mwp_base_pred_of_pos_caching_state$ = makeSymbol("*MWP-BASE-PRED-OF-POS-CACHING-STATE*");

    static private final SubLList $list79 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("BASE-DENOT"), makeSymbol("WORD-UNIT"), makeSymbol("BASE-POS-PRED"), makeSymbol("AFFIX-TYPE"));

    private static final SubLList $list80 = list($RULE, makeKeyword("BASE-DENOT"), makeKeyword("WORD-UNIT"), makeKeyword("BASE-POS-PRED"), makeKeyword("AFFIX-TYPE"));

    static private final SubLList $list81 = list(makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("DERIVED-WORD-UNIT"));

    // Definitions
    public static final SubLObject morph_word_p_alt(SubLObject obj) {
        return makeBoolean((NIL != document.word_p(obj)) && document.word_info(obj).isList());
    }

    // Definitions
    public static SubLObject morph_word_p(final SubLObject obj) {
        return makeBoolean((NIL != document.word_p(obj)) && document.word_info(obj).isList());
    }

    /**
     *
     *
     * @return MORPH-WORD-P with string slot initialized to STRING.
     */
    @LispMethod(comment = "@return MORPH-WORD-P with string slot initialized to STRING.")
    public static final SubLObject new_morph_word_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject word = document.new_word(list($STRING, string));
            com.cyc.cycjava.cycl.morph_word.morph_word_info_set(word, $PARSES, mwp_parse.new_mwp_parse_set());
            return word;
        }
    }

    /**
     *
     *
     * @return MORPH-WORD-P with string slot initialized to STRING.
     */
    @LispMethod(comment = "@return MORPH-WORD-P with string slot initialized to STRING.")
    public static SubLObject new_morph_word(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject word = document.new_word(list($STRING, string));
        morph_word_info_set(word, $PARSES, mwp_parse.new_mwp_parse_set());
        return word;
    }

    /**
     *
     *
     * @return STRINGP
     */
    @LispMethod(comment = "@return STRINGP")
    public static final SubLObject morph_word_string_alt(SubLObject v_morph_word) {
        SubLTrampolineFile.checkType(v_morph_word, MORPH_WORD_P);
        return document.word_string(v_morph_word);
    }

    /**
     *
     *
     * @return STRINGP
     */
    @LispMethod(comment = "@return STRINGP")
    public static SubLObject morph_word_string(final SubLObject v_morph_word) {
        assert NIL != morph_word_p(v_morph_word) : "! morph_word.morph_word_p(v_morph_word) " + ("morph_word.morph_word_p(v_morph_word) " + "CommonSymbols.NIL != morph_word.morph_word_p(v_morph_word) ") + v_morph_word;
        return document.word_string(v_morph_word);
    }

    /**
     *
     *
     * @return MWP-PARSE-SET-P
     */
    @LispMethod(comment = "@return MWP-PARSE-SET-P")
    public static final SubLObject morph_word_parses_alt(SubLObject v_morph_word) {
        SubLTrampolineFile.checkType(v_morph_word, MORPH_WORD_P);
        return com.cyc.cycjava.cycl.morph_word.morph_word_info_lookup(v_morph_word, $PARSES);
    }

    /**
     *
     *
     * @return MWP-PARSE-SET-P
     */
    @LispMethod(comment = "@return MWP-PARSE-SET-P")
    public static SubLObject morph_word_parses(final SubLObject v_morph_word) {
        assert NIL != morph_word_p(v_morph_word) : "! morph_word.morph_word_p(v_morph_word) " + ("morph_word.morph_word_p(v_morph_word) " + "CommonSymbols.NIL != morph_word.morph_word_p(v_morph_word) ") + v_morph_word;
        return morph_word_info_lookup(v_morph_word, $PARSES);
    }

    /**
     * Add PARSE to the PARSES slot of MORPH-WORD.
     *
     * @return KEYWORDP; :ADDED if new, :ALREADY-THERE if not.
     */
    @LispMethod(comment = "Add PARSE to the PARSES slot of MORPH-WORD.\r\n\r\n@return KEYWORDP; :ADDED if new, :ALREADY-THERE if not.")
    public static final SubLObject morph_word_add_parse_alt(SubLObject v_morph_word, SubLObject parse) {
        {
            SubLObject parses = com.cyc.cycjava.cycl.morph_word.morph_word_info_lookup(v_morph_word, $PARSES);
            SubLObject new_elementP = mwp_parse.mwp_parse_set_add(parses, parse);
            return NIL != new_elementP ? ((SubLObject) ($ADDED)) : $ALREADY_THERE;
        }
    }

    /**
     * Add PARSE to the PARSES slot of MORPH-WORD.
     *
     * @return KEYWORDP; :ADDED if new, :ALREADY-THERE if not.
     */
    @LispMethod(comment = "Add PARSE to the PARSES slot of MORPH-WORD.\r\n\r\n@return KEYWORDP; :ADDED if new, :ALREADY-THERE if not.")
    public static SubLObject morph_word_add_parse(final SubLObject v_morph_word, final SubLObject parse) {
        final SubLObject parses = morph_word_info_lookup(v_morph_word, $PARSES);
        final SubLObject new_elementP = mwp_parse.mwp_parse_set_add(parses, parse);
        return NIL != new_elementP ? $ADDED : $ALREADY_THERE;
    }

    /**
     * Set the PARSES slot of MORPH-WORD to be PARSES.
     */
    @LispMethod(comment = "Set the PARSES slot of MORPH-WORD to be PARSES.")
    public static final SubLObject morph_word_parses_set_alt(SubLObject v_morph_word, SubLObject parses) {
        return com.cyc.cycjava.cycl.morph_word.morph_word_info_set(v_morph_word, $PARSES, parses);
    }

    /**
     * Set the PARSES slot of MORPH-WORD to be PARSES.
     */
    @LispMethod(comment = "Set the PARSES slot of MORPH-WORD to be PARSES.")
    public static SubLObject morph_word_parses_set(final SubLObject v_morph_word, final SubLObject parses) {
        return morph_word_info_set(v_morph_word, $PARSES, parses);
    }

    /**
     * Evaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.
     * If TYPE is non-nil, then parses not of TYPE are skipped.
     *
     * @param TYPE
     * 		nil or nl-affix-type-p
     */
    @LispMethod(comment = "Evaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.\r\nIf TYPE is non-nil, then parses not of TYPE are skipped.\r\n\r\n@param TYPE\r\n\t\tnil or nl-affix-type-p\nEvaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.\nIf TYPE is non-nil, then parses not of TYPE are skipped.")
    public static final SubLObject morph_word_do_parses_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject parse = NIL;
                    SubLObject v_morph_word = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    parse = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    v_morph_word = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_1, $list_alt7, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject type_tail = property_list_member($TYPE, current);
                            SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                            SubLObject complex_onlyP_tail = property_list_member($kw10$COMPLEX_ONLY_, current);
                            SubLObject complex_onlyP = (NIL != complex_onlyP_tail) ? ((SubLObject) (cadr(complex_onlyP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != type) {
                                    return list(DO_SET, list(parse, list(MORPH_WORD_PARSES, v_morph_word)), listS(PWHEN, list(CAND, list(EQ, list(MWP_PARSE_TYPE, parse), type), list(FIMPLIES, complex_onlyP, list(MWP_PARSE_COMPLEX_P, parse))), append(body, NIL)));
                                } else {
                                    return list(DO_SET, list(parse, list(MORPH_WORD_PARSES, v_morph_word)), listS(PWHEN, list(FIMPLIES, complex_onlyP, list(MWP_PARSE_COMPLEX_P, parse)), append(body, NIL)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Evaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.
     * If TYPE is non-nil, then parses not of TYPE are skipped.
     *
     * @param TYPE
     * 		nil or nl-affix-type-p
     */
    @LispMethod(comment = "Evaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.\r\nIf TYPE is non-nil, then parses not of TYPE are skipped.\r\n\r\n@param TYPE\r\n\t\tnil or nl-affix-type-p\nEvaluate BODY with PARSE iteratively bound to each parse of MORPH-WORD.\nIf TYPE is non-nil, then parses not of TYPE are skipped.")
    public static SubLObject morph_word_do_parses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject parse = NIL;
        SubLObject v_morph_word = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        parse = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        v_morph_word = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$1, $list7, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject complex_onlyP_tail = property_list_member($kw10$COMPLEX_ONLY_, current);
        final SubLObject complex_onlyP = (NIL != complex_onlyP_tail) ? cadr(complex_onlyP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != type) {
            return list(DO_SET, list(parse, list(MORPH_WORD_PARSES, v_morph_word)), listS(PWHEN, list(CAND, list(EQL, list(MWP_PARSE_TYPE, parse), type), list(FIMPLIES, complex_onlyP, list(MWP_PARSE_COMPLEX_P, parse))), append(body, NIL)));
        }
        return list(DO_SET, list(parse, list(MORPH_WORD_PARSES, v_morph_word)), listS(PWHEN, list(FIMPLIES, complex_onlyP, list(MWP_PARSE_COMPLEX_P, parse)), append(body, NIL)));
    }

    public static final SubLObject mwp_parse_complex_p_alt(SubLObject parse) {
        return com.cyc.cycjava.cycl.morph_word.word_complex_p(mwp_parse.mwp_parse_lookup(parse, $WORD_UNIT));
    }

    public static SubLObject mwp_parse_complex_p(final SubLObject parse) {
        return word_complex_p(mwp_parse.mwp_parse_lookup(parse, $WORD_UNIT));
    }

    public static final SubLObject word_complex_p_alt(SubLObject word) {
        return makeBoolean(NIL == constant_p(word));
    }

    public static SubLObject word_complex_p(final SubLObject word) {
        return makeBoolean(NIL == constant_p(word));
    }

    public static final SubLObject morph_word_print_parses_alt(SubLObject v_morph_word) {
        format(T, $str_alt20$__Parses_for__S___, com.cyc.cycjava.cycl.morph_word.morph_word_string(v_morph_word));
        {
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        com.cyc.cycjava.cycl.morph_word.morph_word_print_parse(parse);
                    }
                }
            }
        }
        return v_morph_word;
    }

    public static SubLObject morph_word_print_parses(final SubLObject v_morph_word) {
        format(T, $str20$__Parses_for__S___, morph_word_string(v_morph_word));
        final SubLObject set_var = morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                morph_word_print_parse(parse);
            }
        }
        return v_morph_word;
    }

    public static final SubLObject morph_word_print_parse_alt(SubLObject parse) {
        misc_utilities.print_n_per_line(parse.rest().rest(), TWO_INTEGER, CHAR_tab);
        terpri(UNPROVIDED);
        return parse;
    }

    public static SubLObject morph_word_print_parse(final SubLObject parse) {
        misc_utilities.print_n_per_line(parse.rest().rest(), TWO_INTEGER, CHAR_tab);
        terpri(UNPROVIDED);
        return parse;
    }

    /**
     *
     *
     * @param DERIVATIONAL-ONLY?
     * 		booleanp; Should we skip inflectional affixes?
     */
    @LispMethod(comment = "@param DERIVATIONAL-ONLY?\r\n\t\tbooleanp; Should we skip inflectional affixes?")
    public static final SubLObject morph_word_parse_affixes_alt(SubLObject v_morph_word, SubLObject derivational_onlyP) {
        if (derivational_onlyP == UNPROVIDED) {
            derivational_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_morph_word, MORPH_WORD_P);
            {
                SubLObject parse_sets = NIL;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt21$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
                                    SubLObject affix_type = NIL;
                                    for (affix_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , affix_type = cdolist_list_var.first()) {
                                        if ((NIL == derivational_onlyP) || (affix_type == $DERIV)) {
                                            com.cyc.cycjava.cycl.morph_word.morph_word_parse_affixes_int(v_morph_word, affix_type);
                                            parse_sets = cons(mwp_parse.mwp_parse_set_copy(com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word)), parse_sets);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                com.cyc.cycjava.cycl.morph_word.morph_word_parses_set(v_morph_word, mwp_parse.mwp_parse_set_union(parse_sets));
            }
            return v_morph_word;
        }
    }

    /**
     *
     *
     * @param DERIVATIONAL-ONLY?
     * 		booleanp; Should we skip inflectional affixes?
     */
    @LispMethod(comment = "@param DERIVATIONAL-ONLY?\r\n\t\tbooleanp; Should we skip inflectional affixes?")
    public static SubLObject morph_word_parse_affixes(final SubLObject v_morph_word, SubLObject derivational_onlyP) {
        if (derivational_onlyP == UNPROVIDED) {
            derivational_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != morph_word_p(v_morph_word) : "! morph_word.morph_word_p(v_morph_word) " + ("morph_word.morph_word_p(v_morph_word) " + "CommonSymbols.NIL != morph_word.morph_word_p(v_morph_word) ") + v_morph_word;
        SubLObject parse_sets = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
                SubLObject affix_type = NIL;
                affix_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == derivational_onlyP) || (affix_type == $DERIV)) {
                        morph_word_parse_affixes_int(v_morph_word, affix_type);
                        parse_sets = cons(mwp_parse.mwp_parse_set_copy(morph_word_parses(v_morph_word)), parse_sets);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    affix_type = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        morph_word_parses_set(v_morph_word, mwp_parse.mwp_parse_set_union(parse_sets));
        return v_morph_word;
    }

    public static final SubLObject morph_word_parse_affixes_int_alt(SubLObject v_morph_word, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.morph_word.morph_word_find_affixes(v_morph_word, type);
            com.cyc.cycjava.cycl.morph_word.morph_word_find_bases(v_morph_word, type);
            com.cyc.cycjava.cycl.morph_word.morph_word_apply_rules(v_morph_word, type);
            if (NIL != lexicon_vars.$mwp_reformulate_resultsP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.morph_word.morph_word_reformulate_parses(v_morph_word);
            }
            if (NIL != lexicon_vars.$mwp_triefy_resultsP$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.morph_word.morph_word_triefy(v_morph_word);
            }
            return v_morph_word;
        }
    }

    public static SubLObject morph_word_parse_affixes_int(final SubLObject v_morph_word, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        morph_word_find_affixes(v_morph_word, type);
        morph_word_find_bases(v_morph_word, type);
        morph_word_apply_rules(v_morph_word, type);
        if (NIL != lexicon_vars.$mwp_reformulate_resultsP$.getDynamicValue(thread)) {
            morph_word_reformulate_parses(v_morph_word);
        }
        if (NIL != lexicon_vars.$mwp_triefy_resultsP$.getDynamicValue(thread)) {
            morph_word_triefy(v_morph_word);
        }
        return v_morph_word;
    }

    public static final SubLObject mwp_trie_base_words_by_lookup_internal_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject words = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind(T, thread);
                        {
                            SubLObject entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
                            if (entries.isList()) {
                                {
                                    SubLObject cdolist_list_var = entries;
                                    SubLObject entry = NIL;
                                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.morph_word.nl_trie_entry_ok_for_mwp_base_wordP(entry)) {
                                            words = cons(entry, words);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return words;
            }
        }
    }

    public static SubLObject mwp_trie_base_words_by_lookup_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind(T, thread);
            final SubLObject entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            if (entries.isList()) {
                SubLObject cdolist_list_var = entries;
                SubLObject entry = NIL;
                entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != nl_trie_entry_ok_for_mwp_base_wordP(entry)) {
                        words = cons(entry, words);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                } 
            }
        } finally {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
        }
        return words;
    }

    public static final SubLObject mwp_trie_base_words_by_lookup_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.morph_word.mwp_trie_base_words_by_lookup_internal(string);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MWP_TRIE_BASE_WORDS_BY_LOOKUP, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MWP_TRIE_BASE_WORDS_BY_LOOKUP, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MWP_TRIE_BASE_WORDS_BY_LOOKUP, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw24$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morph_word.mwp_trie_base_words_by_lookup_internal(string)));
                        memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mwp_trie_base_words_by_lookup(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return mwp_trie_base_words_by_lookup_internal(string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MWP_TRIE_BASE_WORDS_BY_LOOKUP, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MWP_TRIE_BASE_WORDS_BY_LOOKUP, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MWP_TRIE_BASE_WORDS_BY_LOOKUP, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(mwp_trie_base_words_by_lookup_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject nl_trie_entry_ok_for_mwp_base_wordP_alt(SubLObject entry) {
        {
            SubLObject okP = NIL;
            if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                {
                    SubLObject denot_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                    if ((NIL == member(denot_pred, lexicon_accessors.determine_denotation_preds($ANY), UNPROVIDED, UNPROVIDED)) || (NIL != member(denot_pred, lexicon_accessors.determine_denotation_preds($DENOT), UNPROVIDED, UNPROVIDED))) {
                        okP = T;
                    }
                }
            }
            return okP;
        }
    }

    public static SubLObject nl_trie_entry_ok_for_mwp_base_wordP(final SubLObject entry) {
        SubLObject okP = NIL;
        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
            final SubLObject denot_pred = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
            if ((NIL == member(denot_pred, lexicon_accessors.determine_denotation_preds($ANY), UNPROVIDED, UNPROVIDED)) || (NIL != member(denot_pred, lexicon_accessors.determine_denotation_preds($DENOT), UNPROVIDED, UNPROVIDED))) {
                okP = T;
            }
        }
        return okP;
    }

    public static final SubLObject morph_word_triefy_alt(SubLObject v_morph_word) {
        return v_morph_word;
    }

    public static SubLObject morph_word_triefy(final SubLObject v_morph_word) {
        return v_morph_word;
    }

    public static final SubLObject morph_word_reformulate_parses_alt(SubLObject v_morph_word) {
        {
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        {
                            SubLObject denot = mwp_parse.mwp_parse_lookup(parse, $WORD_DENOT);
                            if (NIL != denot) {
                                {
                                    SubLObject new_denot = nl_reformulator.nl_reformulate(denot, UNPROVIDED);
                                    parse = putf(parse, $WORD_DENOT, new_denot);
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_morph_word;
    }

    public static SubLObject morph_word_reformulate_parses(final SubLObject v_morph_word) {
        final SubLObject set_var = morph_word_parses(v_morph_word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject parse;
        SubLObject denot;
        SubLObject new_denot;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                denot = mwp_parse.mwp_parse_lookup(parse, $WORD_DENOT);
                if (NIL != denot) {
                    new_denot = nl_reformulator.nl_reformulate(denot, UNPROVIDED);
                    parse = putf(parse, $WORD_DENOT, new_denot);
                }
            }
        }
        return v_morph_word;
    }

    /**
     * Find affixes of TYPE that could be part of MORPH-WORD, and determine
     * what the base that they attach to would be.
     *
     * @param MORPH-WORD
    morph-word-p
     * 		
     * @param TYPE
    nl-affix-type-p.
     * 		
     */
    @LispMethod(comment = "Find affixes of TYPE that could be part of MORPH-WORD, and determine\r\nwhat the base that they attach to would be.\r\n\r\n@param MORPH-WORD\nmorph-word-p\r\n\t\t\r\n@param TYPE\nnl-affix-type-p.\nFind affixes of TYPE that could be part of MORPH-WORD, and determine\nwhat the base that they attach to would be.")
    public static final SubLObject morph_word_find_affixes_alt(SubLObject v_morph_word, SubLObject type) {
        com.cyc.cycjava.cycl.morph_word.morph_word_find_suffixes(v_morph_word, type);
        com.cyc.cycjava.cycl.morph_word.morph_word_find_prefixes(v_morph_word, type);
        return v_morph_word;
    }

    /**
     * Find affixes of TYPE that could be part of MORPH-WORD, and determine
     * what the base that they attach to would be.
     *
     * @param MORPH-WORD
    		morph-word-p
     * 		
     * @param TYPE
    		nl-affix-type-p.
     * 		
     */
    @LispMethod(comment = "Find affixes of TYPE that could be part of MORPH-WORD, and determine\r\nwhat the base that they attach to would be.\r\n\r\n@param MORPH-WORD\n\t\tmorph-word-p\r\n\t\t\r\n@param TYPE\n\t\tnl-affix-type-p.\nFind affixes of TYPE that could be part of MORPH-WORD, and determine\nwhat the base that they attach to would be.")
    public static SubLObject morph_word_find_affixes(final SubLObject v_morph_word, final SubLObject type) {
        morph_word_find_suffixes(v_morph_word, type);
        morph_word_find_prefixes(v_morph_word, type);
        return v_morph_word;
    }

    /**
     *
     *
     * @param MORPH-WORD
     * 		morph-word-p; an inflected or uninflected word.
     * @param TYPE
    nl-affix-type-p
     * 		
     */
    @LispMethod(comment = "@param MORPH-WORD\r\n\t\tmorph-word-p; an inflected or uninflected word.\r\n@param TYPE\nnl-affix-type-p")
    public static final SubLObject morph_word_find_suffixes_alt(SubLObject v_morph_word, SubLObject type) {
        {
            SubLObject word_string = com.cyc.cycjava.cycl.morph_word.morph_word_string(v_morph_word);
            SubLObject parses = com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.morph_word.mwp_suffix_lookup(type, word_string);
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject suffix_string = standard_tokenization.string_token_string(result);
                    SubLObject rules = standard_tokenization.string_token_value(result);
                    SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.morph_word.mwp_bases_for_word_string_with_suffix(word_string, suffix_string);
                    SubLObject base = NIL;
                    for (base = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , base = cdolist_list_var_3.first()) {
                        {
                            SubLObject cdolist_list_var_4 = rules;
                            SubLObject rule = NIL;
                            for (rule = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , rule = cdolist_list_var_4.first()) {
                                {
                                    SubLObject new_parse = mwp_parse.new_mwp_parse();
                                    new_parse = putf(new_parse, $TYPE, type);
                                    new_parse = putf(new_parse, $BASE, base);
                                    new_parse = putf(new_parse, $AFFIX, suffix_string);
                                    new_parse = putf(new_parse, $AFFIX_TYPE, $SUFFIX);
                                    if (type == $DERIV) {
                                        new_parse = putf(new_parse, $AFFIX_UNIT, rule);
                                    }
                                    new_parse = putf(new_parse, $RULE, rule);
                                    mwp_parse.mwp_parse_set_add(parses, new_parse);
                                }
                            }
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.morph_word.morph_word_parses_set(v_morph_word, parses);
        }
        return v_morph_word;
    }

    /**
     *
     *
     * @param MORPH-WORD
     * 		morph-word-p; an inflected or uninflected word.
     * @param TYPE
    nl-affix-type-p
     * 		
     */
    @LispMethod(comment = "@param MORPH-WORD\r\n\t\tmorph-word-p; an inflected or uninflected word.\r\n@param TYPE\nnl-affix-type-p")
    public static SubLObject morph_word_find_suffixes(final SubLObject v_morph_word, final SubLObject type) {
        final SubLObject word_string = morph_word_string(v_morph_word);
        final SubLObject parses = morph_word_parses(v_morph_word);
        SubLObject cdolist_list_var = mwp_suffix_lookup(type, word_string);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject suffix_string = standard_tokenization.string_token_string(result);
            final SubLObject rules = standard_tokenization.string_token_value(result);
            SubLObject cdolist_list_var_$3 = mwp_bases_for_word_string_with_suffix(word_string, suffix_string);
            SubLObject base = NIL;
            base = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                SubLObject cdolist_list_var_$4 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    SubLObject new_parse = mwp_parse.new_mwp_parse();
                    new_parse = putf(new_parse, $TYPE, type);
                    new_parse = putf(new_parse, $BASE, base);
                    new_parse = putf(new_parse, $AFFIX, suffix_string);
                    new_parse = putf(new_parse, $AFFIX_TYPE, $SUFFIX);
                    if (type == $DERIV) {
                        new_parse = putf(new_parse, $AFFIX_UNIT, rule);
                    }
                    new_parse = putf(new_parse, $RULE, rule);
                    mwp_parse.mwp_parse_set_add(parses, new_parse);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    rule = cdolist_list_var_$4.first();
                } 
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                base = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        morph_word_parses_set(v_morph_word, parses);
        return v_morph_word;
    }

    /**
     * Given WORD-STRING ending in SUFFIX, return list of possible bases.
     */
    @LispMethod(comment = "Given WORD-STRING ending in SUFFIX, return list of possible bases.")
    public static final SubLObject mwp_bases_for_word_string_with_suffix_alt(SubLObject word_string, SubLObject suffix) {
        {
            SubLObject base = string_utilities.substring(word_string, ZERO_INTEGER, subtract(length(word_string), length(suffix)));
            if (suffix.equalp($$$ence)) {
                return list(cconcatenate(base, $$$ent));
            } else {
                if (suffix.equalp($$$ily) && (NIL != string_utilities.ends_with(base, $$$ey, UNPROVIDED))) {
                    return list(string_utilities.post_remove(base, $$$ey, UNPROVIDED));
                } else {
                    if ((NIL != string_utilities.ends_with(base, $$$ic, UNPROVIDED)) && suffix.equalp($$$al)) {
                        return list(cconcatenate(string_utilities.post_remove(base, $$$ic, UNPROVIDED), $$$y));
                    } else {
                        if (((NIL != string_utilities.ends_in_geminateP(base)) && (NIL != morphology.ends_with_doublerP(base))) && (NIL != string_utilities.non_empty_string_p(suffix))) {
                            {
                                SubLObject ans = list(string_utilities.strip_final(base, UNPROVIDED));
                                if (NIL != string_utilities.ends_with(base, $$$l, UNPROVIDED)) {
                                    ans = cons(base, ans);
                                }
                                return ans;
                            }
                        } else {
                            if ((NIL != string_utilities.ends_with(base, $$$e, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$s))) {
                                {
                                    SubLObject ans = list(base);
                                    SubLObject stripped = string_utilities.strip_final(base, UNPROVIDED);
                                    if (NIL != morphology.ends_with_sibilantP(stripped)) {
                                        ans = cons(stripped, ans);
                                    }
                                    return ans;
                                }
                            } else {
                                if ((NIL != string_utilities.ends_with(base, $$$is, symbol_function(EQUALP))) && suffix.equalp($$$ion)) {
                                    return list(cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$ide));
                                } else {
                                    if (NIL != string_utilities.ends_with(base, $$$is, symbol_function(EQUALP))) {
                                        return list(cconcatenate(base, $$$e));
                                    } else {
                                        if ((NIL != morphology.starts_with_vowelP(suffix)) && ((NIL != morphology.single_c_codaP(base)) || (NIL != string_utilities.ends_with(base, $$$u, UNPROVIDED)))) {
                                            return list(cconcatenate(base, $$$e), base);
                                        } else {
                                            if (NIL != string_utilities.ends_with(base, $$$i, symbol_function(EQUALP))) {
                                                if (!suffix.equalp($$$ence)) {
                                                    return list(cconcatenate(string_utilities.strip_final(base, UNPROVIDED), $$$y));
                                                }
                                            } else {
                                                if (suffix.equalp($$$ion) && (NIL != string_utilities.ends_with(base, $$$cept, symbol_function(EQUALP)))) {
                                                    return list(cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$ive));
                                                } else {
                                                    return list(base);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Given WORD-STRING ending in SUFFIX, return list of possible bases.
     */
    @LispMethod(comment = "Given WORD-STRING ending in SUFFIX, return list of possible bases.")
    public static SubLObject mwp_bases_for_word_string_with_suffix(final SubLObject word_string, final SubLObject suffix) {
        final SubLObject base = string_utilities.substring(word_string, ZERO_INTEGER, subtract(length(word_string), length(suffix)));
        SubLObject bases = NIL;
        if (suffix.equalp($$$ence)) {
            bases = list(cconcatenate(base, $$$ent));
        } else
            if (suffix.equalp($$$ily) && (NIL != string_utilities.ends_with(base, $$$ey, UNPROVIDED))) {
                bases = list(string_utilities.post_remove(base, $$$ey, UNPROVIDED));
            } else
                if ((NIL != string_utilities.ends_with(base, $$$ic, UNPROVIDED)) && suffix.equalp($$$al)) {
                    bases = list(cconcatenate(string_utilities.post_remove(base, $$$ic, UNPROVIDED), $$$y));
                } else
                    if (((NIL != string_utilities.ends_in_geminateP(base)) && (NIL != morphology.ends_with_doublerP(base))) && (NIL != string_utilities.non_empty_string_p(suffix))) {
                        SubLObject ans = list(string_utilities.strip_final(base, UNPROVIDED));
                        if (NIL != string_utilities.ends_with(base, $$$l, UNPROVIDED)) {
                            ans = cons(base, ans);
                        }
                        bases = ans;
                    } else
                        if ((NIL != string_utilities.ends_with(base, $$$e, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$s))) {
                            SubLObject ans = list(base);
                            final SubLObject stripped = string_utilities.strip_final(base, UNPROVIDED);
                            if (NIL != morphology.ends_with_sibilantP(stripped)) {
                                ans = cons(stripped, ans);
                            }
                            bases = ans;
                        } else
                            if ((NIL != string_utilities.ends_with(base, $$$is, symbol_function(EQUALP))) && suffix.equalp($$$ion)) {
                                bases = list(cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$ide));
                            } else
                                if (NIL != string_utilities.ends_with(base, $$$is, symbol_function(EQUALP))) {
                                    bases = list(cconcatenate(base, $$$e));
                                } else
                                    if ((NIL != morphology.starts_with_vowelP(suffix)) && ((NIL != morphology.single_c_codaP(base)) || (NIL != string_utilities.ends_with(base, $$$u, UNPROVIDED)))) {
                                        bases = list(cconcatenate(base, $$$e), base);
                                    } else
                                        if (NIL != string_utilities.ends_with(base, $$$i, symbol_function(EQUALP))) {
                                            if (!suffix.equalp($$$ence)) {
                                                bases = list(cconcatenate(string_utilities.strip_final(base, UNPROVIDED), $$$y));
                                            }
                                        } else
                                            if (suffix.equalp($$$ion) && (NIL != string_utilities.ends_with(base, $$$cept, symbol_function(EQUALP)))) {
                                                bases = list(cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$ive));
                                            } else {
                                                bases = list(base);
                                            }









        return filter_base_candidates_against_generation(bases, suffix, word_string);
    }

    public static SubLObject filter_base_candidates_against_generation(final SubLObject bases, final SubLObject suffix, final SubLObject word_string) {
        SubLObject gen_bases = NIL;
        SubLObject cdolist_list_var = bases;
        SubLObject one_base = NIL;
        one_base = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (morphology.add_english_suffix(one_base, suffix).equalp(word_string)) {
                gen_bases = cons(one_base, gen_bases);
            }
            cdolist_list_var = cdolist_list_var.rest();
            one_base = cdolist_list_var.first();
        } 
        return gen_bases;
    }

    /**
     *
     *
     * @return LISTP of STRING-TOKEN-P (( <suffix> . (<rule>) )*)
     */
    @LispMethod(comment = "@return LISTP of STRING-TOKEN-P (( <suffix> . (<rule>) )*)")
    public static final SubLObject mwp_suffix_lookup_alt(SubLObject type, SubLObject word_string) {
        {
            SubLObject suffix_matcher = mwp_affix_matcher.mwp_suffix_matcher(type);
            return mwp_affix_matcher.mwp_suffix_matcher_find_matches(suffix_matcher, word_string);
        }
    }

    /**
     *
     *
     * @return LISTP of STRING-TOKEN-P (( <suffix> . (<rule>) )*)
     */
    @LispMethod(comment = "@return LISTP of STRING-TOKEN-P (( <suffix> . (<rule>) )*)")
    public static SubLObject mwp_suffix_lookup(final SubLObject type, final SubLObject word_string) {
        final SubLObject suffix_matcher = mwp_affix_matcher.mwp_suffix_matcher(type);
        return mwp_affix_matcher.mwp_suffix_matcher_find_matches(suffix_matcher, word_string);
    }

    /**
     *
     *
     * @param MORPH-WORD
     * 		morph-word-p; an inflected or uninflected word.
     * @param TYPE
    nl-affix-type-p
     * 		
     */
    @LispMethod(comment = "@param MORPH-WORD\r\n\t\tmorph-word-p; an inflected or uninflected word.\r\n@param TYPE\nnl-affix-type-p")
    public static final SubLObject morph_word_find_prefixes_alt(SubLObject v_morph_word, SubLObject type) {
        {
            SubLObject word_string = com.cyc.cycjava.cycl.morph_word.morph_word_string(v_morph_word);
            SubLObject parses = com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.morph_word.mwp_prefix_lookup(type, word_string);
            SubLObject result = NIL;
            for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                {
                    SubLObject prefix_string = standard_tokenization.string_token_string(result);
                    SubLObject rules = standard_tokenization.string_token_value(result);
                    SubLObject cdolist_list_var_5 = com.cyc.cycjava.cycl.morph_word.mwp_bases_for_word_string_with_prefix(word_string, prefix_string);
                    SubLObject base = NIL;
                    for (base = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , base = cdolist_list_var_5.first()) {
                        {
                            SubLObject cdolist_list_var_6 = rules;
                            SubLObject rule = NIL;
                            for (rule = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , rule = cdolist_list_var_6.first()) {
                                {
                                    SubLObject new_parse = mwp_parse.new_mwp_parse();
                                    new_parse = putf(new_parse, $TYPE, type);
                                    new_parse = putf(new_parse, $BASE, base);
                                    new_parse = putf(new_parse, $AFFIX, prefix_string);
                                    new_parse = putf(new_parse, $AFFIX_TYPE, $PREFIX);
                                    if (type == $DERIV) {
                                        new_parse = putf(new_parse, $AFFIX_UNIT, rule);
                                    }
                                    new_parse = putf(new_parse, $RULE, rule);
                                    mwp_parse.mwp_parse_set_add(parses, new_parse);
                                }
                            }
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.morph_word.morph_word_parses_set(v_morph_word, parses);
        }
        return v_morph_word;
    }

    /**
     *
     *
     * @param MORPH-WORD
     * 		morph-word-p; an inflected or uninflected word.
     * @param TYPE
    nl-affix-type-p
     * 		
     */
    @LispMethod(comment = "@param MORPH-WORD\r\n\t\tmorph-word-p; an inflected or uninflected word.\r\n@param TYPE\nnl-affix-type-p")
    public static SubLObject morph_word_find_prefixes(final SubLObject v_morph_word, final SubLObject type) {
        final SubLObject word_string = morph_word_string(v_morph_word);
        final SubLObject parses = morph_word_parses(v_morph_word);
        SubLObject cdolist_list_var = mwp_prefix_lookup(type, word_string);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject prefix_string = standard_tokenization.string_token_string(result);
            final SubLObject rules = standard_tokenization.string_token_value(result);
            SubLObject cdolist_list_var_$5 = mwp_bases_for_word_string_with_prefix(word_string, prefix_string);
            SubLObject base = NIL;
            base = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                SubLObject cdolist_list_var_$6 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    SubLObject new_parse = mwp_parse.new_mwp_parse();
                    new_parse = putf(new_parse, $TYPE, type);
                    new_parse = putf(new_parse, $BASE, base);
                    new_parse = putf(new_parse, $AFFIX, prefix_string);
                    new_parse = putf(new_parse, $AFFIX_TYPE, $PREFIX);
                    if (type == $DERIV) {
                        new_parse = putf(new_parse, $AFFIX_UNIT, rule);
                    }
                    new_parse = putf(new_parse, $RULE, rule);
                    mwp_parse.mwp_parse_set_add(parses, new_parse);
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    rule = cdolist_list_var_$6.first();
                } 
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                base = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        morph_word_parses_set(v_morph_word, parses);
        return v_morph_word;
    }

    /**
     * Given WORD-STRING beginning with PREFIX, return list of possible bases.
     */
    @LispMethod(comment = "Given WORD-STRING beginning with PREFIX, return list of possible bases.")
    public static final SubLObject mwp_bases_for_word_string_with_prefix_alt(SubLObject word_string, SubLObject prefix) {
        {
            SubLObject base = string_utilities.substring(word_string, length(prefix), UNPROVIDED);
            return list(base);
        }
    }

    /**
     * Given WORD-STRING beginning with PREFIX, return list of possible bases.
     */
    @LispMethod(comment = "Given WORD-STRING beginning with PREFIX, return list of possible bases.")
    public static SubLObject mwp_bases_for_word_string_with_prefix(final SubLObject word_string, final SubLObject prefix) {
        final SubLObject base = string_utilities.substring(word_string, length(prefix), UNPROVIDED);
        return list(base);
    }/**
     * Given WORD-STRING beginning with PREFIX, return list of possible bases.
     */


    /**
     *
     *
     * @return LISTP of STRING-TOKEN-P (( <prefix> . (<rule>) )*)
     */
    @LispMethod(comment = "@return LISTP of STRING-TOKEN-P (( <prefix> . (<rule>) )*)")
    public static final SubLObject mwp_prefix_lookup_internal_alt(SubLObject type, SubLObject word_string) {
        {
            SubLObject prefix_matcher = mwp_affix_matcher.mwp_prefix_matcher(type);
            return mwp_affix_matcher.mwp_prefix_matcher_find_matches(prefix_matcher, word_string);
        }
    }

    /**
     *
     *
     * @return LISTP of STRING-TOKEN-P (( <prefix> . (<rule>) )*)
     */
    @LispMethod(comment = "@return LISTP of STRING-TOKEN-P (( <prefix> . (<rule>) )*)")
    public static SubLObject mwp_prefix_lookup_internal(final SubLObject type, final SubLObject word_string) {
        final SubLObject prefix_matcher = mwp_affix_matcher.mwp_prefix_matcher(type);
        return mwp_affix_matcher.mwp_prefix_matcher_find_matches(prefix_matcher, word_string);
    }

    public static final SubLObject mwp_prefix_lookup_alt(SubLObject type, SubLObject word_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.morph_word.mwp_prefix_lookup_internal(type, word_string);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MWP_PREFIX_LOOKUP, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MWP_PREFIX_LOOKUP, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MWP_PREFIX_LOOKUP, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(type, word_string);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (type.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && word_string.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morph_word.mwp_prefix_lookup_internal(type, word_string)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(type, word_string));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject mwp_prefix_lookup(final SubLObject type, final SubLObject word_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return mwp_prefix_lookup_internal(type, word_string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MWP_PREFIX_LOOKUP, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MWP_PREFIX_LOOKUP, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MWP_PREFIX_LOOKUP, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type, word_string);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && word_string.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(mwp_prefix_lookup_internal(type, word_string)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type, word_string));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject morph_word_find_bases_alt(SubLObject v_morph_word, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_string = com.cyc.cycjava.cycl.morph_word.morph_word_string(v_morph_word);
                SubLObject new_parses = mwp_parse.new_mwp_parse_set();
                SubLObject base_word_table = NIL;
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                            if (mwp_parse.mwp_parse_type(parse) == type) {
                                {
                                    SubLObject datum = parse;
                                    SubLObject current = datum;
                                    SubLObject allow_other_keys_p = NIL;
                                    SubLObject rest = current;
                                    SubLObject bad = NIL;
                                    SubLObject current_7 = NIL;
                                    for (; NIL != rest;) {
                                        destructuring_bind_must_consp(rest, datum, $list_alt53);
                                        current_7 = rest.first();
                                        rest = rest.rest();
                                        destructuring_bind_must_consp(rest, datum, $list_alt53);
                                        if (NIL == member(current_7, $list_alt54, UNPROVIDED, UNPROVIDED)) {
                                            bad = T;
                                        }
                                        if (current_7 == $ALLOW_OTHER_KEYS) {
                                            allow_other_keys_p = rest.first();
                                        }
                                        rest = rest.rest();
                                    }
                                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                        cdestructuring_bind_error(datum, $list_alt53);
                                    }
                                    {
                                        SubLObject rule_tail = property_list_member($RULE, current);
                                        SubLObject rule = (NIL != rule_tail) ? ((SubLObject) (cadr(rule_tail))) : NIL;
                                        SubLObject base_tail = property_list_member($BASE, current);
                                        SubLObject base = (NIL != base_tail) ? ((SubLObject) (cadr(base_tail))) : NIL;
                                        if ((NIL != rule) && (NIL != base)) {
                                            {
                                                SubLObject zero_affixP = Strings.stringE(base, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject base_words = list_utilities.alist_lookup_without_values(base_word_table, base, symbol_function(EQUAL), $NEW);
                                                if (base_words == $NEW) {
                                                    base_words = com.cyc.cycjava.cycl.morph_word.mwp_trie_base_words_by_lookup(base);
                                                    if (!(((NIL != zero_affixP) && (type == $DERIV)) || (NIL != lexicon_vars.$mwp_suppress_recursive_analysisP$.getDynamicValue(thread)))) {
                                                        base_words = append(base_words, com.cyc.cycjava.cycl.morph_word.derived_nl_trie_words_int(base, T));
                                                    }
                                                    base_word_table = list_utilities.alist_enter(base_word_table, base, base_words, symbol_function(EQUAL));
                                                }
                                                {
                                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.morph_word.mwp_find_base_trie_words(rule, base, type, base_words);
                                                    SubLObject trie_word = NIL;
                                                    for (trie_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trie_word = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject cdolist_list_var_8 = com.cyc.cycjava.cycl.morph_word.mwp_nl_trie_word_denots(trie_word);
                                                            SubLObject base_denot = NIL;
                                                            for (base_denot = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , base_denot = cdolist_list_var_8.first()) {
                                                                {
                                                                    SubLObject cdolist_list_var_9 = nl_trie.nl_trie_word_pos_preds(trie_word);
                                                                    SubLObject base_pos_pred = NIL;
                                                                    for (base_pos_pred = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , base_pos_pred = cdolist_list_var_9.first()) {
                                                                        {
                                                                            SubLObject new_parse = mwp_parse.mwp_parse_copy(parse);
                                                                            new_parse = putf(new_parse, $BASE_DENOT, base_denot);
                                                                            new_parse = putf(new_parse, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(trie_word, UNPROVIDED));
                                                                            new_parse = putf(new_parse, $PRAGMATICS, nl_trie.nl_trie_entry_pragmatics(trie_word));
                                                                            new_parse = putf(new_parse, $MT, nl_trie.nl_trie_entry_mt(trie_word));
                                                                            new_parse = putf(new_parse, $SEM_PRED, nl_trie.nl_trie_entry_semantic_pred(trie_word, UNPROVIDED));
                                                                            new_parse = putf(new_parse, $BASE_POS_PRED, base_pos_pred);
                                                                            mwp_parse.mwp_parse_set_add(new_parses, new_parse);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.cyc.cycjava.cycl.morph_word.morph_word_parses_set(v_morph_word, new_parses);
            }
            return v_morph_word;
        }
    }

    public static SubLObject morph_word_find_bases(final SubLObject v_morph_word, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_string = morph_word_string(v_morph_word);
        final SubLObject new_parses = mwp_parse.new_mwp_parse_set();
        SubLObject base_word_table = NIL;
        final SubLObject set_var = morph_word_parses(v_morph_word);
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
        SubLObject rule_tail;
        SubLObject rule;
        SubLObject base_tail;
        SubLObject base;
        SubLObject zero_affixP;
        SubLObject base_words;
        SubLObject cdolist_list_var;
        SubLObject trie_word;
        SubLObject cdolist_list_var_$8;
        SubLObject base_denot;
        SubLObject cdolist_list_var_$9;
        SubLObject base_pos_pred;
        SubLObject new_parse;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && mwp_parse.mwp_parse_type(parse).eql(type)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$7 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list51);
                    current_$7 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list51);
                    if (NIL == member(current_$7, $list52, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$7 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list51);
                }
                rule_tail = property_list_member($RULE, current);
                rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
                base_tail = property_list_member($BASE, current);
                base = (NIL != base_tail) ? cadr(base_tail) : NIL;
                if ((NIL != rule) && (NIL != base)) {
                    zero_affixP = Strings.stringE(base, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    base_words = list_utilities.alist_lookup_without_values(base_word_table, base, symbol_function(EQUAL), $NEW);
                    if (base_words == $NEW) {
                        base_words = mwp_trie_base_words_by_lookup(base);
                        if (((NIL == zero_affixP) || (type != $DERIV)) && (NIL == lexicon_vars.$mwp_suppress_recursive_analysisP$.getDynamicValue(thread))) {
                            base_words = append(base_words, derived_nl_trie_words_int(base, T));
                        }
                        base_word_table = list_utilities.alist_enter(base_word_table, base, base_words, symbol_function(EQUAL));
                    }
                    cdolist_list_var = mwp_find_base_trie_words(rule, base, type, base_words);
                    trie_word = NIL;
                    trie_word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cdolist_list_var_$8 = mwp_nl_trie_word_denots(trie_word);
                        base_denot = NIL;
                        base_denot = cdolist_list_var_$8.first();
                        while (NIL != cdolist_list_var_$8) {
                            cdolist_list_var_$9 = nl_trie.nl_trie_word_pos_preds(trie_word);
                            base_pos_pred = NIL;
                            base_pos_pred = cdolist_list_var_$9.first();
                            while (NIL != cdolist_list_var_$9) {
                                new_parse = mwp_parse.mwp_parse_copy(parse);
                                new_parse = putf(new_parse, $BASE_DENOT, base_denot);
                                new_parse = putf(new_parse, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(trie_word, UNPROVIDED));
                                new_parse = putf(new_parse, $PRAGMATICS, nl_trie.nl_trie_entry_pragmatics(trie_word));
                                new_parse = putf(new_parse, $MT, nl_trie.nl_trie_entry_mt(trie_word));
                                new_parse = putf(new_parse, $SEM_PRED, nl_trie.nl_trie_entry_semantic_pred(trie_word, UNPROVIDED));
                                new_parse = putf(new_parse, $BASE_POS_PRED, base_pos_pred);
                                mwp_parse.mwp_parse_set_add(new_parses, new_parse);
                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                base_pos_pred = cdolist_list_var_$9.first();
                            } 
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            base_denot = cdolist_list_var_$8.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        trie_word = cdolist_list_var.first();
                    } 
                }
            }
        }
        morph_word_parses_set(v_morph_word, new_parses);
        return v_morph_word;
    }

    public static final SubLObject mwp_nl_trie_word_denots_alt(SubLObject trie_word) {
        {
            SubLObject entry_denots = nl_trie.nl_trie_entry_denots(trie_word);
            SubLObject word_unit = nl_trie.nl_trie_word_word_unit(trie_word, UNPROVIDED);
            return NIL != word_unit ? ((SubLObject) (cons(list($DENOT_OF, word_unit), entry_denots))) : entry_denots;
        }
    }

    public static SubLObject mwp_nl_trie_word_denots(final SubLObject trie_word) {
        final SubLObject entry_denots = nl_trie.nl_trie_entry_denots(trie_word);
        final SubLObject word_unit = nl_trie.nl_trie_word_word_unit(trie_word, UNPROVIDED);
        return NIL != word_unit ? cons(list($DENOT_OF, word_unit), entry_denots) : entry_denots;
    }

    /**
     *
     *
     * @return LISTP of applicable NL trie words, derived from lexical lookup,
    morphological analysis, or unknown word construction of BASE.
     */
    @LispMethod(comment = "@return LISTP of applicable NL trie words, derived from lexical lookup,\r\nmorphological analysis, or unknown word construction of BASE.")
    public static final SubLObject mwp_find_base_trie_words_alt(SubLObject rule, SubLObject base, SubLObject type, SubLObject words_from_lookup) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = mwp_rule.mwp_rule_constraints(rule, type);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = words_from_lookup;
                SubLObject trie_word = NIL;
                for (trie_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trie_word = cdolist_list_var.first()) {
                    {
                        SubLObject filtered_trie_word = com.cyc.cycjava.cycl.morph_word.mwp_filter_trie_word(trie_word, constraints);
                        if (NIL != nl_trie.nl_trie_word_pos_preds(filtered_trie_word)) {
                            ans = cons(filtered_trie_word, ans);
                        }
                    }
                }
                if (!((NIL != ans) || (NIL == lexicon_vars.$mwp_make_up_basesP$.getDynamicValue(thread)))) {
                    ans = com.cyc.cycjava.cycl.morph_word.mwp_unknown_base_plist(rule, base, type);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of applicable NL trie words, derived from lexical lookup,
    morphological analysis, or unknown word construction of BASE.
     */
    @LispMethod(comment = "@return LISTP of applicable NL trie words, derived from lexical lookup,\r\nmorphological analysis, or unknown word construction of BASE.")
    public static SubLObject mwp_find_base_trie_words(final SubLObject rule, final SubLObject base, final SubLObject type, final SubLObject words_from_lookup) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = mwp_rule.mwp_rule_constraints(rule, type);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = words_from_lookup;
        SubLObject trie_word = NIL;
        trie_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject filtered_trie_word = mwp_filter_trie_word(trie_word, constraints);
            if (NIL != nl_trie.nl_trie_word_pos_preds(filtered_trie_word)) {
                ans = cons(filtered_trie_word, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_word = cdolist_list_var.first();
        } 
        if ((NIL == ans) && (NIL != lexicon_vars.$mwp_make_up_basesP$.getDynamicValue(thread))) {
            ans = mwp_unknown_base_plist(rule, base, type);
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
    public static final SubLObject derived_nl_trie_words_int_internal_alt(SubLObject word_string, SubLObject derivational_onlyP) {
        SubLTrampolineFile.checkType(word_string, STRINGP);
        morphological_word_parser.mwp_check_initializations();
        {
            SubLObject word = com.cyc.cycjava.cycl.morph_word.new_morph_word(word_string);
            SubLObject ans = NIL;
            com.cyc.cycjava.cycl.morph_word.morph_word_parse_affixes(word, derivational_onlyP);
            {
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.morph_word.morph_word_parses(word));
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
                                SubLObject current_10 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt63);
                                    current_10 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt63);
                                    if (NIL == member(current_10, $list_alt64, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_10 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt63);
                                }
                                {
                                    SubLObject word_denot_tail = property_list_member($WORD_DENOT, current);
                                    SubLObject word_denot = (NIL != word_denot_tail) ? ((SubLObject) (cadr(word_denot_tail))) : NIL;
                                    SubLObject word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                                    SubLObject word_pos_pred = (NIL != word_pos_pred_tail) ? ((SubLObject) (cadr(word_pos_pred_tail))) : NIL;
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject mt_tail = property_list_member($MT, current);
                                    SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                                    if (((NIL != word_denot) || (NIL != word_pos_pred)) || (NIL != word_unit)) {
                                        {
                                            SubLObject syn_support_sentence = make_binary_formula(word_pos_pred, word_unit, word_string);
                                            SubLObject syn_support = nl_trie.new_nl_trie_word_hl_syn_support(syn_support_sentence, mt);
                                            SubLObject sem_support = nl_trie.new_nl_trie_word_hl_sem_support(set_utilities.new_singleton_set(word_denot, symbol_function(EQUALP)), mt);
                                            SubLObject new_word = nl_trie.new_nl_trie_word(set_utilities.new_singleton_set(syn_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(sem_support, symbol_function(EQUALP)));
                                            SubLObject verify_pragmaticsP = T;
                                            SubLObject addedP = NIL;
                                            if (NIL == addedP) {
                                                {
                                                    SubLObject csome_list_var = ans;
                                                    SubLObject existing_word = NIL;
                                                    for (existing_word = csome_list_var.first(); !((NIL != addedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_word = csome_list_var.first()) {
                                                        if (NIL != nl_trie.unifiable_word_entriesP(existing_word, new_word, verify_pragmaticsP)) {
                                                            nl_trie.nl_trie_augment_word(existing_word, new_word, T);
                                                            addedP = T;
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == addedP) {
                                                ans = cons(new_word, ans);
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
     * Parse WORD-STRING using all known applicable affixes.
     *
     * @param WORD-STRING
     * 		stringp; a word-string, which can be used surrounded by whitespace in a sentence.
     * @return LISTP of NL-TRIE-WORD-P objects
     */
    @LispMethod(comment = "Parse WORD-STRING using all known applicable affixes.\r\n\r\n@param WORD-STRING\r\n\t\tstringp; a word-string, which can be used surrounded by whitespace in a sentence.\r\n@return LISTP of NL-TRIE-WORD-P objects")
    public static SubLObject derived_nl_trie_words_int_internal(final SubLObject word_string, final SubLObject derivational_onlyP) {
        assert NIL != stringp(word_string) : "! stringp(word_string) " + ("Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) ") + word_string;
        morphological_word_parser.mwp_check_initializations();
        final SubLObject word = new_morph_word(word_string);
        SubLObject ans = NIL;
        morph_word_parse_affixes(word, derivational_onlyP);
        final SubLObject set_var = morph_word_parses(word);
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
        SubLObject word_denot_tail;
        SubLObject word_denot;
        SubLObject word_pos_pred_tail;
        SubLObject word_pos_pred;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject mt_tail;
        SubLObject mt;
        SubLObject syn_support_sentence;
        SubLObject syn_support;
        SubLObject sem_support;
        SubLObject new_word;
        SubLObject verify_pragmaticsP;
        SubLObject addedP;
        SubLObject csome_list_var;
        SubLObject existing_word;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$10 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list61);
                    current_$10 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list61);
                    if (NIL == member(current_$10, $list62, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$10 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list61);
                }
                word_denot_tail = property_list_member($WORD_DENOT, current);
                word_denot = (NIL != word_denot_tail) ? cadr(word_denot_tail) : NIL;
                word_pos_pred_tail = property_list_member($WORD_POS_PRED, current);
                word_pos_pred = (NIL != word_pos_pred_tail) ? cadr(word_pos_pred_tail) : NIL;
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                mt_tail = property_list_member($MT, current);
                mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
                if (((NIL != word_denot) || (NIL != word_pos_pred)) || (NIL != word_unit)) {
                    syn_support_sentence = make_binary_formula(word_pos_pred, word_unit, word_string);
                    syn_support = nl_trie.new_nl_trie_word_hl_syn_support(syn_support_sentence, mt);
                    sem_support = nl_trie.new_nl_trie_word_hl_sem_support(set_utilities.new_singleton_set(word_denot, symbol_function(EQUALP)), mt);
                    new_word = nl_trie.new_nl_trie_word(set_utilities.new_singleton_set(syn_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(sem_support, symbol_function(EQUALP)));
                    verify_pragmaticsP = T;
                    addedP = NIL;
                    if (NIL == addedP) {
                        csome_list_var = ans;
                        existing_word = NIL;
                        existing_word = csome_list_var.first();
                        while ((NIL == addedP) && (NIL != csome_list_var)) {
                            if (NIL != nl_trie.unifiable_word_entriesP(existing_word, new_word, verify_pragmaticsP)) {
                                nl_trie.nl_trie_augment_word(existing_word, new_word, T);
                                addedP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            existing_word = csome_list_var.first();
                        } 
                    }
                    if (NIL == addedP) {
                        ans = cons(new_word, ans);
                    }
                }
            }
        }
        return ans;
    }

    public static final SubLObject derived_nl_trie_words_int_alt(SubLObject word_string, SubLObject derivational_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.morph_word.derived_nl_trie_words_int_internal(word_string, derivational_onlyP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DERIVED_NL_TRIE_WORDS_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DERIVED_NL_TRIE_WORDS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, DERIVED_NL_TRIE_WORDS_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, derivational_onlyP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (word_string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && derivational_onlyP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morph_word.derived_nl_trie_words_int_internal(word_string, derivational_onlyP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(word_string, derivational_onlyP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject derived_nl_trie_words_int(final SubLObject word_string, final SubLObject derivational_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return derived_nl_trie_words_int_internal(word_string, derivational_onlyP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DERIVED_NL_TRIE_WORDS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DERIVED_NL_TRIE_WORDS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DERIVED_NL_TRIE_WORDS_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, derivational_onlyP);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && derivational_onlyP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(derived_nl_trie_words_int_internal(word_string, derivational_onlyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_string, derivational_onlyP));
        return memoization_state.caching_results(results3);
    }

    /**
     * Construct a semantics and POS pred for an unknown word whose spelling is BASE,
     * incorporating the result pos pred specification from RULE.
     *
     * @return LISTP; containing a single (<DENOT> <PRED> <WORD-UNIT>) list.
     * @unknown We need to find a way to incorporate the constraints from RULE.
     */
    @LispMethod(comment = "Construct a semantics and POS pred for an unknown word whose spelling is BASE,\r\nincorporating the result pos pred specification from RULE.\r\n\r\n@return LISTP; containing a single (<DENOT> <PRED> <WORD-UNIT>) list.\r\n@unknown We need to find a way to incorporate the constraints from RULE.\nConstruct a semantics and POS pred for an unknown word whose spelling is BASE,\nincorporating the result pos pred specification from RULE.")
    public static final SubLObject mwp_unknown_base_plist_alt(SubLObject rule, SubLObject base, SubLObject type) {
        return NIL;
    }

    /**
     * Construct a semantics and POS pred for an unknown word whose spelling is BASE,
     * incorporating the result pos pred specification from RULE.
     *
     * @return LISTP; containing a single (<DENOT> <PRED> <WORD-UNIT>) list.
     * @unknown We need to find a way to incorporate the constraints from RULE.
     */
    @LispMethod(comment = "Construct a semantics and POS pred for an unknown word whose spelling is BASE,\r\nincorporating the result pos pred specification from RULE.\r\n\r\n@return LISTP; containing a single (<DENOT> <PRED> <WORD-UNIT>) list.\r\n@unknown We need to find a way to incorporate the constraints from RULE.\nConstruct a semantics and POS pred for an unknown word whose spelling is BASE,\nincorporating the result pos pred specification from RULE.")
    public static SubLObject mwp_unknown_base_plist(final SubLObject rule, final SubLObject base, final SubLObject type) {
        return NIL;
    }/**
     * Construct a semantics and POS pred for an unknown word whose spelling is BASE,
     * incorporating the result pos pred specification from RULE.
     *
     * @return LISTP; containing a single (<DENOT> <PRED> <WORD-UNIT>) list.
     * @unknown We need to find a way to incorporate the constraints from RULE.
     */


    /**
     * Remove any denots or pos-preds on TRIE-WORD that don't pass at least one of CONSTRAINTS
     */
    @LispMethod(comment = "Remove any denots or pos-preds on TRIE-WORD that don\'t pass at least one of CONSTRAINTS")
    public static final SubLObject mwp_filter_trie_word_alt(SubLObject trie_word, SubLObject constraints) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sem_supports = nl_trie.nl_trie_word_semantic_support_set(trie_word);
                SubLObject syn_supports = nl_trie.nl_trie_word_syntactic_support_set(trie_word);
                SubLObject sem_pred = nl_trie.nl_trie_word_sem_pred(trie_word, UNPROVIDED);
                SubLObject denot_arg = (NIL != indexed_term_p(sem_pred)) ? ((SubLObject) (lexicon_utilities.denotatum_arg_of_pred_cached(sem_pred))) : NIL;
                thread.resetMultipleValues();
                {
                    SubLObject sem_constraints = list_utilities.partition_list(constraints, symbol_function(MWP_SEMANTIC_CONSTRAINT_P));
                    SubLObject syn_constraints = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject filtered_sem_supports = ((NIL != sem_constraints) && denot_arg.isInteger()) ? ((SubLObject) (com.cyc.cycjava.cycl.morph_word.mwp_filter_semantic_supports(sem_supports, sem_constraints, denot_arg))) : sem_supports;
                        SubLObject filtered_syn_supports = (NIL != syn_constraints) ? ((SubLObject) (com.cyc.cycjava.cycl.morph_word.mwp_filter_syntactic_supports(syn_supports, syn_constraints))) : syn_supports;
                        if (!((NIL != set_utilities.sets_coextensionalP(filtered_sem_supports, sem_supports)) && (NIL != set_utilities.sets_coextensionalP(filtered_syn_supports, syn_supports)))) {
                            trie_word = nl_trie.new_nl_trie_word(filtered_syn_supports, filtered_sem_supports);
                        }
                    }
                }
            }
            return trie_word;
        }
    }

    @LispMethod(comment = "Remove any denots or pos-preds on TRIE-WORD that don\'t pass at least one of CONSTRAINTS")
    public static SubLObject mwp_filter_trie_word(SubLObject trie_word, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sem_supports = nl_trie.nl_trie_word_semantic_support_set(trie_word);
        final SubLObject syn_supports = nl_trie.nl_trie_word_syntactic_support_set(trie_word);
        final SubLObject sem_pred = nl_trie.nl_trie_word_sem_pred(trie_word, UNPROVIDED);
        final SubLObject denot_arg = (NIL != indexed_term_p(sem_pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(sem_pred) : NIL;
        thread.resetMultipleValues();
        final SubLObject sem_constraints = list_utilities.partition_list(constraints, symbol_function(MWP_SEMANTIC_CONSTRAINT_P));
        final SubLObject syn_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject filtered_sem_supports = ((NIL != sem_constraints) && denot_arg.isInteger()) ? mwp_filter_semantic_supports(sem_supports, sem_constraints, denot_arg) : sem_supports;
        final SubLObject filtered_syn_supports = (NIL != syn_constraints) ? mwp_filter_syntactic_supports(syn_supports, syn_constraints) : syn_supports;
        if ((NIL == set_utilities.sets_coextensionalP(filtered_sem_supports, sem_supports)) || (NIL == set_utilities.sets_coextensionalP(filtered_syn_supports, syn_supports))) {
            trie_word = nl_trie.new_nl_trie_word(filtered_syn_supports, filtered_sem_supports);
        }
        return trie_word;
    }/**
     * Remove any denots or pos-preds on TRIE-WORD that don't pass at least one of CONSTRAINTS
     */


    public static final SubLObject mwp_semantic_support_passes_constraintP_alt(SubLObject sem_support, SubLObject constraint, SubLObject denot_arg) {
        {
            SubLObject denot = cycl_utilities.atomic_sentence_arg(nl_trie.nl_trie_word_support_sentence(sem_support), denot_arg, UNPROVIDED);
            return com.cyc.cycjava.cycl.morph_word.mwp_denot_passes_constraintP(denot, constraint);
        }
    }

    public static SubLObject mwp_semantic_support_passes_constraintP(final SubLObject sem_support, final SubLObject constraint, final SubLObject denot_arg) {
        final SubLObject denot = cycl_utilities.atomic_sentence_arg(nl_trie.nl_trie_word_support_sentence(sem_support), denot_arg, UNPROVIDED);
        return mwp_denot_passes_constraintP(denot, constraint);
    }

    public static final SubLObject mwp_syntactic_support_passes_constraintP_alt(SubLObject syn_support, SubLObject constraint) {
        {
            SubLObject failP = nl_trie.nl_trie_word_syntactic_support_abbreviation_p(syn_support);
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(syn_support);
                    SubLObject pos_pred = NIL;
                    for (pos_pred = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos_pred = csome_list_var.first()) {
                        if (NIL == com.cyc.cycjava.cycl.morph_word.mwp_pos_pred_passes_constraintP(pos_pred, constraint)) {
                            failP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject mwp_syntactic_support_passes_constraintP(final SubLObject syn_support, final SubLObject constraint) {
        SubLObject failP = nl_trie.nl_trie_word_syntactic_support_abbreviation_p(syn_support);
        if (NIL == failP) {
            SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds(syn_support);
            SubLObject pos_pred = NIL;
            pos_pred = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL == mwp_pos_pred_passes_constraintP(pos_pred, constraint)) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                pos_pred = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static final SubLObject mwp_semantic_constraint_p_alt(SubLObject constraint) {
        return subl_promotions.memberP(constraint.first(), $list_alt67, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mwp_semantic_constraint_p(final SubLObject constraint) {
        return subl_promotions.memberP(constraint.first(), $list65, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Remove any element of SEM-SUPPORTS that doesn't pass all of SEM-CONSTRAINTS
     */
    @LispMethod(comment = "Remove any element of SEM-SUPPORTS that doesn\'t pass all of SEM-CONSTRAINTS")
    public static final SubLObject mwp_filter_semantic_supports_alt(SubLObject sem_supports, SubLObject sem_constraints, SubLObject denot_arg) {
        SubLTrampolineFile.checkType(sem_supports, SET_P);
        SubLTrampolineFile.checkType(sem_constraints, PROPER_LIST_P);
        SubLTrampolineFile.checkType(denot_arg, INTEGERP);
        {
            SubLObject result = set.new_set(symbol_function(EQUALP), UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(sem_supports);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject sem_support = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                        {
                            SubLObject rejectedP = NIL;
                            if (NIL == rejectedP) {
                                {
                                    SubLObject csome_list_var = sem_constraints;
                                    SubLObject sem_constraint = NIL;
                                    for (sem_constraint = csome_list_var.first(); !((NIL != rejectedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sem_constraint = csome_list_var.first()) {
                                        if (NIL == com.cyc.cycjava.cycl.morph_word.mwp_semantic_support_passes_constraintP(sem_support, sem_constraint, denot_arg)) {
                                            rejectedP = T;
                                        }
                                    }
                                }
                            }
                            if (NIL == rejectedP) {
                                set.set_add(sem_support, result);
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Remove any element of SEM-SUPPORTS that doesn\'t pass all of SEM-CONSTRAINTS")
    public static SubLObject mwp_filter_semantic_supports(final SubLObject sem_supports, final SubLObject sem_constraints, final SubLObject denot_arg) {
        assert NIL != set.set_p(sem_supports) : "! set.set_p(sem_supports) " + ("set.set_p(sem_supports) " + "CommonSymbols.NIL != set.set_p(sem_supports) ") + sem_supports;
        assert NIL != list_utilities.proper_list_p(sem_constraints) : "! list_utilities.proper_list_p(sem_constraints) " + ("list_utilities.proper_list_p(sem_constraints) " + "CommonSymbols.NIL != list_utilities.proper_list_p(sem_constraints) ") + sem_constraints;
        assert NIL != integerp(denot_arg) : "! integerp(denot_arg) " + ("Types.integerp(denot_arg) " + "CommonSymbols.NIL != Types.integerp(denot_arg) ") + denot_arg;
        final SubLObject result = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(sem_supports);
        SubLObject basis_object;
        SubLObject state;
        SubLObject sem_support;
        SubLObject rejectedP;
        SubLObject csome_list_var;
        SubLObject sem_constraint;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sem_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                rejectedP = NIL;
                if (NIL == rejectedP) {
                    csome_list_var = sem_constraints;
                    sem_constraint = NIL;
                    sem_constraint = csome_list_var.first();
                    while ((NIL == rejectedP) && (NIL != csome_list_var)) {
                        if (NIL == mwp_semantic_support_passes_constraintP(sem_support, sem_constraint, denot_arg)) {
                            rejectedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        sem_constraint = csome_list_var.first();
                    } 
                }
                if (NIL == rejectedP) {
                    set.set_add(sem_support, result);
                }
            }
        }
        return result;
    }/**
     * Remove any element of SEM-SUPPORTS that doesn't pass all of SEM-CONSTRAINTS
     */


    /**
     * Remove any element of SYN-SUPPORTS that doesn't pass at least one of SYN-CONSTRAINTS
     */
    @LispMethod(comment = "Remove any element of SYN-SUPPORTS that doesn\'t pass at least one of SYN-CONSTRAINTS")
    public static final SubLObject mwp_filter_syntactic_supports_alt(SubLObject syn_supports, SubLObject syn_constraints) {
        SubLTrampolineFile.checkType(syn_supports, SET_P);
        SubLTrampolineFile.checkType(syn_constraints, PROPER_LIST_P);
        {
            SubLObject result = set.new_set(symbol_function(EQUALP), UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(syn_supports);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject syn_support = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                        {
                            SubLObject acceptedP = NIL;
                            if (NIL == acceptedP) {
                                {
                                    SubLObject csome_list_var = syn_constraints;
                                    SubLObject syn_constraint = NIL;
                                    for (syn_constraint = csome_list_var.first(); !((NIL != acceptedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , syn_constraint = csome_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.morph_word.mwp_syntactic_support_passes_constraintP(syn_support, syn_constraint)) {
                                            set.set_add(syn_support, result);
                                            acceptedP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Remove any element of SYN-SUPPORTS that doesn\'t pass at least one of SYN-CONSTRAINTS")
    public static SubLObject mwp_filter_syntactic_supports(final SubLObject syn_supports, final SubLObject syn_constraints) {
        assert NIL != set.set_p(syn_supports) : "! set.set_p(syn_supports) " + ("set.set_p(syn_supports) " + "CommonSymbols.NIL != set.set_p(syn_supports) ") + syn_supports;
        assert NIL != list_utilities.proper_list_p(syn_constraints) : "! list_utilities.proper_list_p(syn_constraints) " + ("list_utilities.proper_list_p(syn_constraints) " + "CommonSymbols.NIL != list_utilities.proper_list_p(syn_constraints) ") + syn_constraints;
        final SubLObject result = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(syn_supports);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syn_support;
        SubLObject acceptedP;
        SubLObject csome_list_var;
        SubLObject syn_constraint;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syn_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                acceptedP = NIL;
                if (NIL == acceptedP) {
                    csome_list_var = syn_constraints;
                    syn_constraint = NIL;
                    syn_constraint = csome_list_var.first();
                    while ((NIL == acceptedP) && (NIL != csome_list_var)) {
                        if (NIL != mwp_syntactic_support_passes_constraintP(syn_support, syn_constraint)) {
                            set.set_add(syn_support, result);
                            acceptedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        syn_constraint = csome_list_var.first();
                    } 
                }
            }
        }
        return result;
    }/**
     * Remove any element of SYN-SUPPORTS that doesn't pass at least one of SYN-CONSTRAINTS
     */


    public static final SubLObject mwp_denot_passes_constraintP_alt(SubLObject denot, SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = constraint;
                SubLObject current = datum;
                SubLObject type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt71);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt71);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($GENL)) {
                            return makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != genls.genlP(denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue(thread), UNPROVIDED)));
                        } else {
                            if (pcase_var.eql($ISA)) {
                                return makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != isa.isaP(denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue(thread), UNPROVIDED)));
                            } else {
                                return NIL;
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt71);
                }
            }
            return NIL;
        }
    }

    public static SubLObject mwp_denot_passes_constraintP(final SubLObject denot, final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list69);
        type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list69);
        target = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(constraint, $list69);
            return NIL;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($GENL)) {
            return makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != genls.genlP(denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue(thread), UNPROVIDED)));
        }
        if (pcase_var.eql($ISA)) {
            return makeBoolean((NIL != term.el_fort_p(denot)) && (NIL != isa.isaP(denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue(thread), UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject mwp_pos_pred_passes_constraintP_alt(SubLObject pos_pred, SubLObject constraint) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = constraint;
                SubLObject current = datum;
                SubLObject type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt71);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt71);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = type;
                        if (pcase_var.eql($PRED)) {
                            return lexicon_accessors.genl_pos_predP(pos_pred, target, lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue(thread));
                        } else {
                            if (pcase_var.eql($POS)) {
                                return com.cyc.cycjava.cycl.morph_word.mwp_pred_meets_pos_constraintP(pos_pred, target);
                            } else {
                                return NIL;
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt71);
                }
            }
            return NIL;
        }
    }

    public static SubLObject mwp_pos_pred_passes_constraintP(final SubLObject pos_pred, final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list69);
        type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list69);
        target = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(constraint, $list69);
            return NIL;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql($PRED)) {
            return lexicon_accessors.genl_pos_predP(pos_pred, target, lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue(thread));
        }
        if (pcase_var.eql($POS)) {
            return mwp_pred_meets_pos_constraintP(pos_pred, target);
        }
        return NIL;
    }

    public static final SubLObject mwp_pred_meets_pos_constraintP_alt(SubLObject pred, SubLObject target) {
        return lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), target, UNPROVIDED);
    }

    public static SubLObject mwp_pred_meets_pos_constraintP(final SubLObject pred, final SubLObject target) {
        return lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), target, UNPROVIDED);
    }

    public static final SubLObject clear_mwp_base_pred_of_pos_alt() {
        {
            SubLObject cs = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_mwp_base_pred_of_pos() {
        final SubLObject cs = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_mwp_base_pred_of_pos_alt(SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_base_pred_of_pos_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_mwp_base_pred_of_pos(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($mwp_base_pred_of_pos_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mwp_base_pred_of_pos_internal_alt(SubLObject pos, SubLObject mt) {
        return ask_utilities.ask_variable($sym77$_PRED, listS($$basicSpeechPartPred, pos, $list_alt79), mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject mwp_base_pred_of_pos_internal(final SubLObject pos, final SubLObject mt) {
        return ask_utilities.ask_variable($sym75$_PRED, listS($$basicSpeechPartPred, pos, $list77), mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject mwp_base_pred_of_pos_alt(SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MWP_BASE_PRED_OF_POS, $mwp_base_pred_of_pos_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(pos, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pos.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.morph_word.mwp_base_pred_of_pos_internal(pos, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pos, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject mwp_base_pred_of_pos(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
        }
        SubLObject caching_state = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MWP_BASE_PRED_OF_POS, $mwp_base_pred_of_pos_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(mwp_base_pred_of_pos_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject morph_word_apply_rules_alt(SubLObject v_morph_word, SubLObject type) {
        {
            SubLObject new_parses = mwp_parse.new_mwp_parse_set();
            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.morph_word.morph_word_parses(v_morph_word));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject parse = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parse)) {
                        if (mwp_parse.mwp_parse_type(parse) == type) {
                            {
                                SubLObject datum = parse;
                                SubLObject current = datum;
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_11 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt81);
                                    current_11 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt81);
                                    if (NIL == member(current_11, $list_alt82, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_11 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt81);
                                }
                                {
                                    SubLObject rule_tail = property_list_member($RULE, current);
                                    SubLObject rule = (NIL != rule_tail) ? ((SubLObject) (cadr(rule_tail))) : NIL;
                                    SubLObject base_denot_tail = property_list_member($BASE_DENOT, current);
                                    SubLObject base_denot = (NIL != base_denot_tail) ? ((SubLObject) (cadr(base_denot_tail))) : NIL;
                                    SubLObject word_unit_tail = property_list_member($WORD_UNIT, current);
                                    SubLObject word_unit = (NIL != word_unit_tail) ? ((SubLObject) (cadr(word_unit_tail))) : NIL;
                                    SubLObject base_pos_pred_tail = property_list_member($BASE_POS_PRED, current);
                                    SubLObject base_pos_pred = (NIL != base_pos_pred_tail) ? ((SubLObject) (cadr(base_pos_pred_tail))) : NIL;
                                    SubLObject affix_type_tail = property_list_member($AFFIX_TYPE, current);
                                    SubLObject affix_type = (NIL != affix_type_tail) ? ((SubLObject) (cadr(affix_type_tail))) : NIL;
                                    if ((((NIL != base_denot) && (NIL != base_pos_pred)) && (NIL != word_unit)) && (NIL != rule)) {
                                        {
                                            SubLObject base_dpw = list(base_denot, base_pos_pred, word_unit);
                                            SubLObject word_dpw = mwp_rule.mwp_rule_apply(base_dpw, rule, type, affix_type);
                                            if (word_dpw.isList()) {
                                                {
                                                    SubLObject datum_12 = word_dpw;
                                                    SubLObject current_13 = datum_12;
                                                    SubLObject word_denot = NIL;
                                                    SubLObject word_pos_pred = NIL;
                                                    SubLObject derived_word_unit = NIL;
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt83);
                                                    word_denot = current_13.first();
                                                    current_13 = current_13.rest();
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt83);
                                                    word_pos_pred = current_13.first();
                                                    current_13 = current_13.rest();
                                                    destructuring_bind_must_consp(current_13, datum_12, $list_alt83);
                                                    derived_word_unit = current_13.first();
                                                    current_13 = current_13.rest();
                                                    if (NIL == current_13) {
                                                        {
                                                            SubLObject new_parse = mwp_parse.mwp_parse_copy(parse);
                                                            new_parse = putf(new_parse, $WORD_DENOT, word_denot);
                                                            new_parse = putf(new_parse, $WORD_POS_PRED, word_pos_pred);
                                                            new_parse = putf(new_parse, $WORD_UNIT, derived_word_unit);
                                                            mwp_parse.mwp_parse_set_add(new_parses, new_parse);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum_12, $list_alt83);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.morph_word.morph_word_parses_set(v_morph_word, new_parses);
        }
        return v_morph_word;
    }

    public static SubLObject morph_word_apply_rules(final SubLObject v_morph_word, final SubLObject type) {
        final SubLObject new_parses = mwp_parse.new_mwp_parse_set();
        final SubLObject set_var = morph_word_parses(v_morph_word);
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
        SubLObject rule_tail;
        SubLObject rule;
        SubLObject base_denot_tail;
        SubLObject base_denot;
        SubLObject word_unit_tail;
        SubLObject word_unit;
        SubLObject base_pos_pred_tail;
        SubLObject base_pos_pred;
        SubLObject affix_type_tail;
        SubLObject affix_type;
        SubLObject base_dpw;
        SubLObject word_dpw;
        SubLObject current_$12;
        SubLObject datum_$12;
        SubLObject word_denot;
        SubLObject word_pos_pred;
        SubLObject derived_word_unit;
        SubLObject new_parse;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            parse = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, parse)) && mwp_parse.mwp_parse_type(parse).eql(type)) {
                datum = current = parse;
                allow_other_keys_p = NIL;
                rest = current;
                bad = NIL;
                current_$11 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum, $list79);
                    current_$11 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list79);
                    if (NIL == member(current_$11, $list80, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$11 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list79);
                }
                rule_tail = property_list_member($RULE, current);
                rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
                base_denot_tail = property_list_member($BASE_DENOT, current);
                base_denot = (NIL != base_denot_tail) ? cadr(base_denot_tail) : NIL;
                word_unit_tail = property_list_member($WORD_UNIT, current);
                word_unit = (NIL != word_unit_tail) ? cadr(word_unit_tail) : NIL;
                base_pos_pred_tail = property_list_member($BASE_POS_PRED, current);
                base_pos_pred = (NIL != base_pos_pred_tail) ? cadr(base_pos_pred_tail) : NIL;
                affix_type_tail = property_list_member($AFFIX_TYPE, current);
                affix_type = (NIL != affix_type_tail) ? cadr(affix_type_tail) : NIL;
                if ((((NIL != base_denot) && (NIL != base_pos_pred)) && (NIL != word_unit)) && (NIL != rule)) {
                    base_dpw = list(base_denot, base_pos_pred, word_unit);
                    word_dpw = mwp_rule.mwp_rule_apply(base_dpw, rule, type, affix_type);
                    if (word_dpw.isList()) {
                        datum_$12 = current_$12 = word_dpw;
                        word_denot = NIL;
                        word_pos_pred = NIL;
                        derived_word_unit = NIL;
                        destructuring_bind_must_consp(current_$12, datum_$12, $list81);
                        word_denot = current_$12.first();
                        current_$12 = current_$12.rest();
                        destructuring_bind_must_consp(current_$12, datum_$12, $list81);
                        word_pos_pred = current_$12.first();
                        current_$12 = current_$12.rest();
                        destructuring_bind_must_consp(current_$12, datum_$12, $list81);
                        derived_word_unit = current_$12.first();
                        current_$12 = current_$12.rest();
                        if (NIL == current_$12) {
                            new_parse = mwp_parse.mwp_parse_copy(parse);
                            new_parse = putf(new_parse, $WORD_DENOT, word_denot);
                            new_parse = putf(new_parse, $WORD_POS_PRED, word_pos_pred);
                            new_parse = putf(new_parse, $WORD_UNIT, derived_word_unit);
                            mwp_parse.mwp_parse_set_add(new_parses, new_parse);
                        } else {
                            cdestructuring_bind_error(datum_$12, $list81);
                        }
                    }
                }
            }
        }
        morph_word_parses_set(v_morph_word, new_parses);
        return v_morph_word;
    }

    public static final SubLObject morph_word_info_lookup_alt(SubLObject v_morph_word, SubLObject info_key) {
        {
            SubLObject info = document.word_info(v_morph_word);
            return list_utilities.alist_lookup(info, info_key, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject morph_word_info_lookup(final SubLObject v_morph_word, final SubLObject info_key) {
        final SubLObject info = document.word_info(v_morph_word);
        return list_utilities.alist_lookup(info, info_key, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject morph_word_info_set_alt(SubLObject v_morph_word, SubLObject info_key, SubLObject value) {
        {
            SubLObject info = document.word_info(v_morph_word);
            SubLObject new_info = list_utilities.alist_enter(info, info_key, value, UNPROVIDED);
            document.word_update(v_morph_word, list($INFO, new_info));
            return new_info;
        }
    }

    public static SubLObject morph_word_info_set(final SubLObject v_morph_word, final SubLObject info_key, final SubLObject value) {
        final SubLObject info = document.word_info(v_morph_word);
        final SubLObject new_info = list_utilities.alist_enter(info, info_key, value, UNPROVIDED);
        document.word_update(v_morph_word, list($INFO, new_info));
        return new_info;
    }

    public static SubLObject declare_morph_word_file() {
        declareFunction("morph_word_p", "MORPH-WORD-P", 1, 0, false);
        declareFunction("new_morph_word", "NEW-MORPH-WORD", 1, 0, false);
        declareFunction("morph_word_string", "MORPH-WORD-STRING", 1, 0, false);
        declareFunction("morph_word_parses", "MORPH-WORD-PARSES", 1, 0, false);
        declareFunction("morph_word_add_parse", "MORPH-WORD-ADD-PARSE", 2, 0, false);
        declareFunction("morph_word_parses_set", "MORPH-WORD-PARSES-SET", 2, 0, false);
        declareMacro("morph_word_do_parses", "MORPH-WORD-DO-PARSES");
        declareFunction("mwp_parse_complex_p", "MWP-PARSE-COMPLEX-P", 1, 0, false);
        declareFunction("word_complex_p", "WORD-COMPLEX-P", 1, 0, false);
        declareFunction("morph_word_print_parses", "MORPH-WORD-PRINT-PARSES", 1, 0, false);
        declareFunction("morph_word_print_parse", "MORPH-WORD-PRINT-PARSE", 1, 0, false);
        declareFunction("morph_word_parse_affixes", "MORPH-WORD-PARSE-AFFIXES", 1, 1, false);
        declareFunction("morph_word_parse_affixes_int", "MORPH-WORD-PARSE-AFFIXES-INT", 2, 0, false);
        declareFunction("mwp_trie_base_words_by_lookup_internal", "MWP-TRIE-BASE-WORDS-BY-LOOKUP-INTERNAL", 1, 0, false);
        declareFunction("mwp_trie_base_words_by_lookup", "MWP-TRIE-BASE-WORDS-BY-LOOKUP", 1, 0, false);
        declareFunction("nl_trie_entry_ok_for_mwp_base_wordP", "NL-TRIE-ENTRY-OK-FOR-MWP-BASE-WORD?", 1, 0, false);
        declareFunction("morph_word_triefy", "MORPH-WORD-TRIEFY", 1, 0, false);
        declareFunction("morph_word_reformulate_parses", "MORPH-WORD-REFORMULATE-PARSES", 1, 0, false);
        declareFunction("morph_word_find_affixes", "MORPH-WORD-FIND-AFFIXES", 2, 0, false);
        declareFunction("morph_word_find_suffixes", "MORPH-WORD-FIND-SUFFIXES", 2, 0, false);
        declareFunction("mwp_bases_for_word_string_with_suffix", "MWP-BASES-FOR-WORD-STRING-WITH-SUFFIX", 2, 0, false);
        declareFunction("filter_base_candidates_against_generation", "FILTER-BASE-CANDIDATES-AGAINST-GENERATION", 3, 0, false);
        declareFunction("mwp_suffix_lookup", "MWP-SUFFIX-LOOKUP", 2, 0, false);
        declareFunction("morph_word_find_prefixes", "MORPH-WORD-FIND-PREFIXES", 2, 0, false);
        declareFunction("mwp_bases_for_word_string_with_prefix", "MWP-BASES-FOR-WORD-STRING-WITH-PREFIX", 2, 0, false);
        declareFunction("mwp_prefix_lookup_internal", "MWP-PREFIX-LOOKUP-INTERNAL", 2, 0, false);
        declareFunction("mwp_prefix_lookup", "MWP-PREFIX-LOOKUP", 2, 0, false);
        declareFunction("morph_word_find_bases", "MORPH-WORD-FIND-BASES", 2, 0, false);
        declareFunction("mwp_nl_trie_word_denots", "MWP-NL-TRIE-WORD-DENOTS", 1, 0, false);
        declareFunction("mwp_find_base_trie_words", "MWP-FIND-BASE-TRIE-WORDS", 4, 0, false);
        declareFunction("derived_nl_trie_words_int_internal", "DERIVED-NL-TRIE-WORDS-INT-INTERNAL", 2, 0, false);
        declareFunction("derived_nl_trie_words_int", "DERIVED-NL-TRIE-WORDS-INT", 2, 0, false);
        declareFunction("mwp_unknown_base_plist", "MWP-UNKNOWN-BASE-PLIST", 3, 0, false);
        declareFunction("mwp_filter_trie_word", "MWP-FILTER-TRIE-WORD", 2, 0, false);
        declareFunction("mwp_semantic_support_passes_constraintP", "MWP-SEMANTIC-SUPPORT-PASSES-CONSTRAINT?", 3, 0, false);
        declareFunction("mwp_syntactic_support_passes_constraintP", "MWP-SYNTACTIC-SUPPORT-PASSES-CONSTRAINT?", 2, 0, false);
        declareFunction("mwp_semantic_constraint_p", "MWP-SEMANTIC-CONSTRAINT-P", 1, 0, false);
        declareFunction("mwp_filter_semantic_supports", "MWP-FILTER-SEMANTIC-SUPPORTS", 3, 0, false);
        declareFunction("mwp_filter_syntactic_supports", "MWP-FILTER-SYNTACTIC-SUPPORTS", 2, 0, false);
        declareFunction("mwp_denot_passes_constraintP", "MWP-DENOT-PASSES-CONSTRAINT?", 2, 0, false);
        declareFunction("mwp_pos_pred_passes_constraintP", "MWP-POS-PRED-PASSES-CONSTRAINT?", 2, 0, false);
        declareFunction("mwp_pred_meets_pos_constraintP", "MWP-PRED-MEETS-POS-CONSTRAINT?", 2, 0, false);
        declareFunction("clear_mwp_base_pred_of_pos", "CLEAR-MWP-BASE-PRED-OF-POS", 0, 0, false);
        declareFunction("remove_mwp_base_pred_of_pos", "REMOVE-MWP-BASE-PRED-OF-POS", 1, 1, false);
        declareFunction("mwp_base_pred_of_pos_internal", "MWP-BASE-PRED-OF-POS-INTERNAL", 2, 0, false);
        declareFunction("mwp_base_pred_of_pos", "MWP-BASE-PRED-OF-POS", 1, 1, false);
        declareFunction("morph_word_apply_rules", "MORPH-WORD-APPLY-RULES", 2, 0, false);
        declareFunction("morph_word_info_lookup", "MORPH-WORD-INFO-LOOKUP", 2, 0, false);
        declareFunction("morph_word_info_set", "MORPH-WORD-INFO-SET", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_morph_word_file() {
        deflexical("*MWP-BASE-PRED-OF-POS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_morph_word_file() {
        register_macro_helper(MWP_PARSE_COMPLEX_P, MORPH_WORD_DO_PARSES);
        memoization_state.note_memoized_function(MWP_TRIE_BASE_WORDS_BY_LOOKUP);
        memoization_state.note_memoized_function(MWP_PREFIX_LOOKUP);
        memoization_state.note_memoized_function(DERIVED_NL_TRIE_WORDS_INT);
        memoization_state.note_globally_cached_function(MWP_BASE_PRED_OF_POS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_morph_word_file();
    }

    @Override
    public void initializeVariables() {
        init_morph_word_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_morph_word_file();
    }

    static {
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("PARSE"), makeSymbol("MORPH-WORD"), makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("COMPLEX-ONLY?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list($TYPE, makeKeyword("COMPLEX-ONLY?"));

    static private final SubLString $str_alt20$__Parses_for__S___ = makeString("~&Parses for ~S:~%");

    static private final SubLString $str_alt21$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw24$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt53 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("BASE"));

    static private final SubLList $list_alt54 = list($RULE, $BASE);

    static private final SubLList $list_alt63 = list(makeSymbol("&KEY"), makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("WORD-UNIT"), makeSymbol("MT"));

    static private final SubLList $list_alt64 = list(makeKeyword("WORD-DENOT"), makeKeyword("WORD-POS-PRED"), makeKeyword("WORD-UNIT"), makeKeyword("MT"));

    static private final SubLList $list_alt67 = list($GENL, makeKeyword("ISA"));

    static private final SubLList $list_alt71 = list(makeSymbol("TYPE"), makeSymbol("TARGET"));

    static private final SubLSymbol $sym77$_PRED = makeSymbol("?PRED");

    static private final SubLList $list_alt79 = list(makeSymbol("?PRED"));

    static private final SubLList $list_alt81 = list(makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("BASE-DENOT"), makeSymbol("WORD-UNIT"), makeSymbol("BASE-POS-PRED"), makeSymbol("AFFIX-TYPE"));

    static private final SubLList $list_alt82 = list($RULE, makeKeyword("BASE-DENOT"), makeKeyword("WORD-UNIT"), makeKeyword("BASE-POS-PRED"), makeKeyword("AFFIX-TYPE"));

    static private final SubLList $list_alt83 = list(makeSymbol("WORD-DENOT"), makeSymbol("WORD-POS-PRED"), makeSymbol("DERIVED-WORD-UNIT"));
}

/**
 * Total time: 276 ms
 */
