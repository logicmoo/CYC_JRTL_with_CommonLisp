/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_dollar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      STANDARD-TOKENIZATION
 * source file: /cyc/top/cycl/standard-tokenization.lisp
 * created:     2019/07/03 17:38:23
 */
public final class standard_tokenization extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new standard_tokenization();

 public static final String myName = "com.cyc.cycjava.cycl.standard_tokenization";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $standard_punctuation_chars$ = makeSymbol("*STANDARD-PUNCTUATION-CHARS*");

    // deflexical
    // chars that are only punctuation if they are word-
    @LispMethod(comment = "chars that are only punctuation if they are word-final\ndeflexical")
    /**
     * chars that are only punctuation if they are word-final
     */
    private static final SubLSymbol $standard_word_final_punctuation_chars$ = makeSymbol("*STANDARD-WORD-FINAL-PUNCTUATION-CHARS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $standard_white_space_chars$ = makeSymbol("*STANDARD-WHITE-SPACE-CHARS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_dot_analysis$ = makeSymbol("*DTP-DOT-ANALYSIS*");

    static private final SubLList $list1 = list(new SubLObject[]{ CHAR_semicolon, CHAR_comma, CHAR_colon, CHAR_quotation, CHAR_quote, CHAR_exclamation, CHAR_question, CHAR_lparen, CHAR_rparen, CHAR_percent, CHAR_dollar, CHAR_hyphen, CHAR_caret, CHAR_asterisk });

    static private final SubLList $list2 = list(CHAR_period);

    private static final SubLSymbol $WORD_FINAL_PUNCTUATION = makeKeyword("WORD-FINAL-PUNCTUATION");

    private static final SubLSymbol DOT_ANALYSIS = makeSymbol("DOT-ANALYSIS");

    private static final SubLSymbol DOT_ANALYSIS_P = makeSymbol("DOT-ANALYSIS-P");

    static private final SubLList $list11 = list(makeSymbol("FOUND"), makeSymbol("REMAINS"), makeSymbol("ACCUMULATOR"), makeSymbol("STATE"));

    static private final SubLList $list12 = list(makeKeyword("FOUND"), makeKeyword("REMAINS"), makeKeyword("ACCUMULATOR"), makeKeyword("STATE"));

    static private final SubLList $list13 = list(makeSymbol("DOT-ANALYSIS-FOUND"), makeSymbol("DOT-ANALYSIS-REMAINS"), makeSymbol("DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("DOT-ANALYSIS-STATE"));

    static private final SubLList $list14 = list(makeSymbol("_CSETF-DOT-ANALYSIS-FOUND"), makeSymbol("_CSETF-DOT-ANALYSIS-REMAINS"), makeSymbol("_CSETF-DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("_CSETF-DOT-ANALYSIS-STATE"));

    private static final SubLSymbol PPRINT_DOT_ANALYSIS = makeSymbol("PPRINT-DOT-ANALYSIS");

    private static final SubLSymbol DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DOT-ANALYSIS-P"));

    private static final SubLSymbol DOT_ANALYSIS_FOUND = makeSymbol("DOT-ANALYSIS-FOUND");

    private static final SubLSymbol _CSETF_DOT_ANALYSIS_FOUND = makeSymbol("_CSETF-DOT-ANALYSIS-FOUND");

    private static final SubLSymbol DOT_ANALYSIS_REMAINS = makeSymbol("DOT-ANALYSIS-REMAINS");

    private static final SubLSymbol _CSETF_DOT_ANALYSIS_REMAINS = makeSymbol("_CSETF-DOT-ANALYSIS-REMAINS");

    private static final SubLSymbol DOT_ANALYSIS_ACCUMULATOR = makeSymbol("DOT-ANALYSIS-ACCUMULATOR");

    private static final SubLSymbol _CSETF_DOT_ANALYSIS_ACCUMULATOR = makeSymbol("_CSETF-DOT-ANALYSIS-ACCUMULATOR");

    private static final SubLSymbol DOT_ANALYSIS_STATE = makeSymbol("DOT-ANALYSIS-STATE");

    private static final SubLSymbol _CSETF_DOT_ANALYSIS_STATE = makeSymbol("_CSETF-DOT-ANALYSIS-STATE");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_DOT_ANALYSIS = makeSymbol("MAKE-DOT-ANALYSIS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DOT_ANALYSIS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOT-ANALYSIS-METHOD");

    private static final SubLString $str36$__AP_Found_________S__ = makeString("#<AP:Found        ~S~%");

    private static final SubLString $str37$_____Remains_______S__ = makeString("     Remains      ~S~%");

    private static final SubLString $str38$_____Accumulator___S__ = makeString("     Accumulator  ~S~%");

    private static final SubLString $str39$_____State_________S___ = makeString("     State        ~S>~%");

    private static final SubLString $str40$_ = makeString(".");

    private static final SubLSymbol $DOT_STRING_WANTED = makeKeyword("DOT-STRING-WANTED");

    private static final SubLSymbol $DOT_INTEGER_WANTED = makeKeyword("DOT-INTEGER-WANTED");

    private static final SubLString $str52$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");

    private static final SubLSymbol INTERVAL_TOKEN_P = makeSymbol("INTERVAL-TOKEN-P");

    // Definitions
    /**
     * Compute the unique raw tokenization of STRING into a list of STRING tokens
     */
    @LispMethod(comment = "Compute the unique raw tokenization of STRING into a list of STRING tokens")
    public static final SubLObject standard_raw_tokenization_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        return tokenize_sentence(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    /**
     * Compute the unique raw tokenization of STRING into a list of STRING tokens
     */
    @LispMethod(comment = "Compute the unique raw tokenization of STRING into a list of STRING tokens")
    public static SubLObject standard_raw_tokenization(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return tokenize_sentence(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the unique token chunking of the RAW-TOKENIZATION.
     */
    @LispMethod(comment = "Return the unique token chunking of the RAW-TOKENIZATION.")
    public static final SubLObject standard_token_chunker_alt(SubLObject raw_tokenization) {
        return perform_dot_analysis(raw_tokenization);
    }

    /**
     * Return the unique token chunking of the RAW-TOKENIZATION.
     */
    @LispMethod(comment = "Return the unique token chunking of the RAW-TOKENIZATION.")
    public static SubLObject standard_token_chunker(final SubLObject raw_tokenization) {
        return perform_dot_analysis(raw_tokenization);
    }

    /**
     * Take a string and return the usable subpieces according to the
     * default rules.
     */
    @LispMethod(comment = "Take a string and return the usable subpieces according to the\r\ndefault rules.\nTake a string and return the usable subpieces according to the\ndefault rules.")
    public static final SubLObject standard_string_tokenize_alt(SubLObject string) {
        {
            SubLObject raw_tokenization = standard_raw_tokenization(string);
            return standard_token_chunker(raw_tokenization);
        }
    }

    /**
     * Take a string and return the usable subpieces according to the
     * default rules.
     */
    @LispMethod(comment = "Take a string and return the usable subpieces according to the\r\ndefault rules.\nTake a string and return the usable subpieces according to the\ndefault rules.")
    public static SubLObject standard_string_tokenize(final SubLObject string) {
        final SubLObject raw_tokenization = standard_raw_tokenization(string);
        return standard_token_chunker(raw_tokenization);
    }

    public static final SubLObject standard_punctuation_chars_alt() {
        return copy_list($standard_punctuation_chars$.getGlobalValue());
    }

    public static SubLObject standard_punctuation_chars() {
        return copy_list($standard_punctuation_chars$.getGlobalValue());
    }

    public static final SubLObject standard_white_space_chars_alt() {
        return copy_list($standard_white_space_chars$.getGlobalValue());
    }

    public static SubLObject standard_white_space_chars() {
        return copy_list($standard_white_space_chars$.getGlobalValue());
    }

    /**
     * This function uses a FSM to tokenize an input sentence based on the definition of
     * white space and punctuation characters passed in. White space is removed,
     * punctuation is returned as individual strings with only the punctuation sign in it.
     * Characters in the OK-Inside-Word set are a permissable subclass of the punctuation
     * characters only; they are only treated as punctuation when preceeded or followed
     * by a white-space.
     *
     * @return List; individual tokens recognized
     */
    @LispMethod(comment = "This function uses a FSM to tokenize an input sentence based on the definition of\r\nwhite space and punctuation characters passed in. White space is removed,\r\npunctuation is returned as individual strings with only the punctuation sign in it.\r\nCharacters in the OK-Inside-Word set are a permissable subclass of the punctuation\r\ncharacters only; they are only treated as punctuation when preceeded or followed\r\nby a white-space.\r\n\r\n@return List; individual tokens recognized\nThis function uses a FSM to tokenize an input sentence based on the definition of\nwhite space and punctuation characters passed in. White space is removed,\npunctuation is returned as individual strings with only the punctuation sign in it.\nCharacters in the OK-Inside-Word set are a permissable subclass of the punctuation\ncharacters only; they are only treated as punctuation when preceeded or followed\nby a white-space.")
    public static final SubLObject tokenize_sentence_alt(SubLObject sentence, SubLObject white_space, SubLObject punctuation, SubLObject word_final_punctuation) {
        if (white_space == UNPROVIDED) {
            white_space = $standard_white_space_chars$.getGlobalValue();
        }
        if (punctuation == UNPROVIDED) {
            punctuation = $standard_punctuation_chars$.getGlobalValue();
        }
        if (word_final_punctuation == UNPROVIDED) {
            word_final_punctuation = $standard_word_final_punctuation_chars$.getGlobalValue();
        }
        {
            SubLObject state = $GOBBLE_WS;
            SubLObject words = NIL;
            SubLObject start = NIL;
            SubLObject end = NIL;
            SubLObject cdotimes_end_var = length(sentence);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject curr = aref(sentence, i);
                    SubLObject v_class = scanner_char_classify(curr, white_space, punctuation, word_final_punctuation);
                    SubLObject pcase_var = v_class;
                    if (pcase_var.eql($WHITE_SPACE)) {
                        {
                            SubLObject pcase_var_1 = state;
                            if (pcase_var_1.eql($IN_WORD)) {
                                end = i;
                                words = cons(subseq(sentence, start, end), words);
                                start = NIL;
                                end = NIL;
                                state = $GOBBLE_WS;
                            }
                        }
                    } else {
                        if (pcase_var.eql($WORD_FINAL_PUNCTUATION)) {
                            {
                                SubLObject pcase_var_2 = state;
                                if (pcase_var_2.eql($IN_WORD)) {
                                    end = i;
                                    words = cons(subseq(sentence, start, end), words);
                                    start = NIL;
                                    end = NIL;
                                    words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                                    state = $GOBBLE_WS;
                                } else {
                                    if (pcase_var_2.eql($GOBBLE_WS)) {
                                        start = i;
                                        state = $IN_WORD;
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($PUNCTUATION)) {
                                {
                                    SubLObject pcase_var_3 = state;
                                    if (pcase_var_3.eql($IN_WORD)) {
                                        end = i;
                                        words = cons(subseq(sentence, start, end), words);
                                        start = NIL;
                                        end = NIL;
                                        words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                                        state = $GOBBLE_WS;
                                    } else {
                                        if (pcase_var_3.eql($GOBBLE_WS)) {
                                            words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                                        }
                                    }
                                }
                            } else {
                                if (pcase_var.eql($GENERIC)) {
                                    {
                                        SubLObject pcase_var_4 = state;
                                        if (pcase_var_4.eql($GOBBLE_WS)) {
                                            start = i;
                                            state = $IN_WORD;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = state;
                if (pcase_var.eql($IN_WORD)) {
                    words = cons(subseq(sentence, start, UNPROVIDED), words);
                }
            }
            return nreverse(words);
        }
    }

    /**
     * This function uses a FSM to tokenize an input sentence based on the definition of
     * white space and punctuation characters passed in. White space is removed,
     * punctuation is returned as individual strings with only the punctuation sign in it.
     * Characters in the OK-Inside-Word set are a permissable subclass of the punctuation
     * characters only; they are only treated as punctuation when preceeded or followed
     * by a white-space.
     *
     * @return List; individual tokens recognized
     */
    @LispMethod(comment = "This function uses a FSM to tokenize an input sentence based on the definition of\r\nwhite space and punctuation characters passed in. White space is removed,\r\npunctuation is returned as individual strings with only the punctuation sign in it.\r\nCharacters in the OK-Inside-Word set are a permissable subclass of the punctuation\r\ncharacters only; they are only treated as punctuation when preceeded or followed\r\nby a white-space.\r\n\r\n@return List; individual tokens recognized\nThis function uses a FSM to tokenize an input sentence based on the definition of\nwhite space and punctuation characters passed in. White space is removed,\npunctuation is returned as individual strings with only the punctuation sign in it.\nCharacters in the OK-Inside-Word set are a permissable subclass of the punctuation\ncharacters only; they are only treated as punctuation when preceeded or followed\nby a white-space.")
    public static SubLObject tokenize_sentence(final SubLObject sentence, SubLObject white_space, SubLObject punctuation, SubLObject word_final_punctuation) {
        if (white_space == UNPROVIDED) {
            white_space = $standard_white_space_chars$.getGlobalValue();
        }
        if (punctuation == UNPROVIDED) {
            punctuation = $standard_punctuation_chars$.getGlobalValue();
        }
        if (word_final_punctuation == UNPROVIDED) {
            word_final_punctuation = $standard_word_final_punctuation_chars$.getGlobalValue();
        }
        SubLObject state = $GOBBLE_WS;
        SubLObject words = NIL;
        SubLObject start = NIL;
        SubLObject end = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject curr;
        SubLObject pcase_var;
        SubLObject v_class;
        SubLObject pcase_var_$1;
        SubLObject pcase_var_$2;
        SubLObject pcase_var_$3;
        SubLObject pcase_var_$4;
        for (cdotimes_end_var = length(sentence), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            curr = aref(sentence, i);
            v_class = pcase_var = scanner_char_classify(curr, white_space, punctuation, word_final_punctuation);
            if (pcase_var.eql($WHITE_SPACE)) {
                pcase_var_$1 = state;
                if (pcase_var_$1.eql($IN_WORD)) {
                    end = i;
                    words = cons(subseq(sentence, start, end), words);
                    start = NIL;
                    end = NIL;
                    state = $GOBBLE_WS;
                }
            } else
                if (pcase_var.eql($WORD_FINAL_PUNCTUATION)) {
                    pcase_var_$2 = state;
                    if (pcase_var_$2.eql($IN_WORD)) {
                        end = i;
                        words = cons(subseq(sentence, start, end), words);
                        start = NIL;
                        end = NIL;
                        words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                        state = $GOBBLE_WS;
                    } else
                        if (pcase_var_$2.eql($GOBBLE_WS)) {
                            start = i;
                            state = $IN_WORD;
                        }

                } else
                    if (pcase_var.eql($PUNCTUATION)) {
                        pcase_var_$3 = state;
                        if (pcase_var_$3.eql($IN_WORD)) {
                            end = i;
                            words = cons(subseq(sentence, start, end), words);
                            start = NIL;
                            end = NIL;
                            words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                            state = $GOBBLE_WS;
                        } else
                            if (pcase_var_$3.eql($GOBBLE_WS)) {
                                words = cons(subseq(sentence, i, add(i, ONE_INTEGER)), words);
                            }

                    } else
                        if (pcase_var.eql($GENERIC)) {
                            pcase_var_$4 = state;
                            if (pcase_var_$4.eql($GOBBLE_WS)) {
                                start = i;
                                state = $IN_WORD;
                            }
                        }



        }
        final SubLObject pcase_var2 = state;
        if (pcase_var2.eql($IN_WORD)) {
            words = cons(subseq(sentence, start, UNPROVIDED), words);
        }
        return nreverse(words);
    }

    public static final SubLObject scanner_char_classify_alt(SubLObject v_char, SubLObject white_space, SubLObject punctuation, SubLObject word_final_punctuation) {
        if (NIL != subl_promotions.memberP(v_char, white_space, UNPROVIDED, UNPROVIDED)) {
            return $WHITE_SPACE;
        } else {
            if (NIL != subl_promotions.memberP(v_char, word_final_punctuation, UNPROVIDED, UNPROVIDED)) {
                return $WORD_FINAL_PUNCTUATION;
            } else {
                if (NIL != subl_promotions.memberP(v_char, punctuation, UNPROVIDED, UNPROVIDED)) {
                    return $PUNCTUATION;
                } else {
                    return $GENERIC;
                }
            }
        }
    }

    public static SubLObject scanner_char_classify(final SubLObject v_char, final SubLObject white_space, final SubLObject punctuation, final SubLObject word_final_punctuation) {
        if (NIL != subl_promotions.memberP(v_char, white_space, UNPROVIDED, UNPROVIDED)) {
            return $WHITE_SPACE;
        }
        if (NIL != subl_promotions.memberP(v_char, word_final_punctuation, UNPROVIDED, UNPROVIDED)) {
            return $WORD_FINAL_PUNCTUATION;
        }
        if (NIL != subl_promotions.memberP(v_char, punctuation, UNPROVIDED, UNPROVIDED)) {
            return $PUNCTUATION;
        }
        return $GENERIC;
    }

    public static final SubLObject dot_analysis_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_dot_analysis(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject dot_analysis_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_dot_analysis(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject dot_analysis_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.standard_tokenization.$dot_analysis_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject dot_analysis_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.standard_tokenization.$dot_analysis_native.class ? T : NIL;
    }

    public static final SubLObject dot_analysis_found_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.getField2();
    }

    public static SubLObject dot_analysis_found(final SubLObject v_object) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject dot_analysis_remains_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.getField3();
    }

    public static SubLObject dot_analysis_remains(final SubLObject v_object) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject dot_analysis_accumulator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.getField4();
    }

    public static SubLObject dot_analysis_accumulator(final SubLObject v_object) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject dot_analysis_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.getField5();
    }

    public static SubLObject dot_analysis_state(final SubLObject v_object) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_dot_analysis_found_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_dot_analysis_found(final SubLObject v_object, final SubLObject value) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_dot_analysis_remains_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_dot_analysis_remains(final SubLObject v_object, final SubLObject value) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_dot_analysis_accumulator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_dot_analysis_accumulator(final SubLObject v_object, final SubLObject value) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_dot_analysis_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, DOT_ANALYSIS_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_dot_analysis_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != dot_analysis_p(v_object) : "! standard_tokenization.dot_analysis_p(v_object) " + "standard_tokenization.dot_analysis_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_dot_analysis_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.standard_tokenization.$dot_analysis_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FOUND)) {
                        _csetf_dot_analysis_found(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REMAINS)) {
                            _csetf_dot_analysis_remains(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ACCUMULATOR)) {
                                _csetf_dot_analysis_accumulator(v_new, current_value);
                            } else {
                                if (pcase_var.eql($STATE)) {
                                    _csetf_dot_analysis_state(v_new, current_value);
                                } else {
                                    Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_dot_analysis(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.standard_tokenization.$dot_analysis_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FOUND)) {
                _csetf_dot_analysis_found(v_new, current_value);
            } else
                if (pcase_var.eql($REMAINS)) {
                    _csetf_dot_analysis_remains(v_new, current_value);
                } else
                    if (pcase_var.eql($ACCUMULATOR)) {
                        _csetf_dot_analysis_accumulator(v_new, current_value);
                    } else
                        if (pcase_var.eql($STATE)) {
                            _csetf_dot_analysis_state(v_new, current_value);
                        } else {
                            Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_dot_analysis(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DOT_ANALYSIS, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FOUND, dot_analysis_found(obj));
        funcall(visitor_fn, obj, $SLOT, $REMAINS, dot_analysis_remains(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCUMULATOR, dot_analysis_accumulator(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, dot_analysis_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_DOT_ANALYSIS, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_dot_analysis_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_dot_analysis(obj, visitor_fn);
    }

    public static final SubLObject pprint_dot_analysis_alt(SubLObject d_analysis, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt30$__AP_Found_________S__, dot_analysis_found(d_analysis));
        format(stream, $str_alt31$_____Remains_______S__, dot_analysis_remains(d_analysis));
        format(stream, $str_alt32$_____Accumulator___S__, dot_analysis_accumulator(d_analysis));
        format(stream, $str_alt33$_____State_________S___, dot_analysis_state(d_analysis));
        return d_analysis;
    }

    public static SubLObject pprint_dot_analysis(final SubLObject d_analysis, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$__AP_Found_________S__, dot_analysis_found(d_analysis));
        format(stream, $str37$_____Remains_______S__, dot_analysis_remains(d_analysis));
        format(stream, $str38$_____Accumulator___S__, dot_analysis_accumulator(d_analysis));
        format(stream, $str39$_____State_________S___, dot_analysis_state(d_analysis));
        return d_analysis;
    }

    public static final SubLObject perform_dot_analysis_alt(SubLObject list_of_strings) {
        if (NIL == list_of_strings) {
            return NIL;
        }
        {
            SubLObject last_string = last(list_of_strings, UNPROVIDED).first();
            if ($str_alt34$_.equal(last_string)) {
                {
                    SubLObject list_argument = butlast(list_of_strings, UNPROVIDED);
                    SubLObject d_analysis = init_dot_analysis(list_argument);
                    SubLObject result = dot_analysis_dfa(d_analysis);
                    return append(result, list($str_alt34$_));
                }
            } else {
                {
                    SubLObject d_analysis = init_dot_analysis(list_of_strings);
                    return dot_analysis_dfa(d_analysis);
                }
            }
        }
    }

    public static SubLObject perform_dot_analysis(final SubLObject list_of_strings) {
        if (NIL == list_of_strings) {
            return NIL;
        }
        final SubLObject last_string = last(list_of_strings, UNPROVIDED).first();
        if ($str40$_.equal(last_string)) {
            final SubLObject list_argument = butlast(list_of_strings, UNPROVIDED);
            final SubLObject d_analysis = init_dot_analysis(list_argument);
            final SubLObject result = dot_analysis_dfa(d_analysis);
            return append(result, list($str40$_));
        }
        final SubLObject d_analysis2 = init_dot_analysis(list_of_strings);
        return dot_analysis_dfa(d_analysis2);
    }

    public static final SubLObject init_dot_analysis_alt(SubLObject list_of_strings) {
        {
            SubLObject d_analysis = make_dot_analysis(UNPROVIDED);
            _csetf_dot_analysis_found(d_analysis, NIL);
            _csetf_dot_analysis_remains(d_analysis, list_of_strings);
            _csetf_dot_analysis_accumulator(d_analysis, NIL);
            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            return d_analysis;
        }
    }

    public static SubLObject init_dot_analysis(final SubLObject list_of_strings) {
        final SubLObject d_analysis = make_dot_analysis(UNPROVIDED);
        _csetf_dot_analysis_found(d_analysis, NIL);
        _csetf_dot_analysis_remains(d_analysis, list_of_strings);
        _csetf_dot_analysis_accumulator(d_analysis, NIL);
        _csetf_dot_analysis_state(d_analysis, $DEFAULT);
        return d_analysis;
    }

    public static final SubLObject find_current_dot_type_alt(SubLObject string) {
        if (string.equal($str_alt34$_)) {
            return $DOT;
        } else {
            if (NIL != string_utilities.digit_stringP(string)) {
                return $NUM;
            } else {
                if (ONE_INTEGER.numE(length(string))) {
                    if (NIL != alpha_char_p(Strings.sublisp_char(string, ZERO_INTEGER))) {
                        return $STRING;
                    } else {
                        return $PUNCT;
                    }
                } else {
                    return $STRING;
                }
            }
        }
    }

    public static SubLObject find_current_dot_type(final SubLObject string) {
        if (string.equal($str40$_)) {
            return $DOT;
        }
        if (NIL != string_utilities.digit_stringP(string)) {
            return $NUM;
        }
        if (!ONE_INTEGER.numE(length(string))) {
            return $STRING;
        }
        if (NIL != alpha_char_p(Strings.sublisp_char(string, ZERO_INTEGER))) {
            return $STRING;
        }
        return $PUNCT;
    }

    public static final SubLObject dot_analysis_dfa_alt(SubLObject d_analysis) {
        if (($DEFAULT == dot_analysis_state(d_analysis)) && (NIL == dot_analysis_remains(d_analysis))) {
            return nreverse(dot_analysis_found(d_analysis));
        } else {
            {
                SubLObject state = dot_analysis_state(d_analysis);
                SubLObject pcase_var = state;
                if (pcase_var.eql($DEFAULT)) {
                    dot_analysis_default(d_analysis);
                } else {
                    if (pcase_var.eql($DOT_STRING_WANTED)) {
                        dot_analysis_dot_string(d_analysis);
                    } else {
                        if (pcase_var.eql($STRING_WANTED)) {
                            dot_analysis_string(d_analysis);
                        } else {
                            if (pcase_var.eql($DOT_INTEGER_WANTED)) {
                                dot_analysis_dot_integer(d_analysis);
                            } else {
                                if (pcase_var.eql($INTEGER_WANTED)) {
                                    dot_analysis_integer(d_analysis);
                                }
                            }
                        }
                    }
                }
                return dot_analysis_dfa(d_analysis);
            }
        }
    }

    public static SubLObject dot_analysis_dfa(final SubLObject d_analysis) {
        if (($DEFAULT == dot_analysis_state(d_analysis)) && (NIL == dot_analysis_remains(d_analysis))) {
            return nreverse(dot_analysis_found(d_analysis));
        }
        final SubLObject pcase_var;
        final SubLObject state = pcase_var = dot_analysis_state(d_analysis);
        if (pcase_var.eql($DEFAULT)) {
            dot_analysis_default(d_analysis);
        } else
            if (pcase_var.eql($DOT_STRING_WANTED)) {
                dot_analysis_dot_string(d_analysis);
            } else
                if (pcase_var.eql($STRING_WANTED)) {
                    dot_analysis_string(d_analysis);
                } else
                    if (pcase_var.eql($DOT_INTEGER_WANTED)) {
                        dot_analysis_dot_integer(d_analysis);
                    } else
                        if (pcase_var.eql($INTEGER_WANTED)) {
                            dot_analysis_integer(d_analysis);
                        }




        return dot_analysis_dfa(d_analysis);
    }

    public static final SubLObject dot_analysis_default_alt(SubLObject d_analysis) {
        {
            SubLObject current = dot_analysis_remains(d_analysis).first();
            SubLObject current_type = find_current_dot_type(current);
            _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
            {
                SubLObject pcase_var = current_type;
                if (pcase_var.eql($DOT)) {
                    _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                } else {
                    if (pcase_var.eql($PUNCT)) {
                        _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                    } else {
                        if (pcase_var.eql($NUM)) {
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                        } else {
                            if (pcase_var.eql($STRING)) {
                                _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                            }
                        }
                    }
                }
            }
            return d_analysis;
        }
    }

    public static SubLObject dot_analysis_default(final SubLObject d_analysis) {
        final SubLObject current = dot_analysis_remains(d_analysis).first();
        final SubLObject current_type = find_current_dot_type(current);
        _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
        final SubLObject pcase_var = current_type;
        if (pcase_var.eql($DOT)) {
            _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
        } else
            if (pcase_var.eql($PUNCT)) {
                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
            } else
                if (pcase_var.eql($NUM)) {
                    _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                    _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                } else
                    if (pcase_var.eql($STRING)) {
                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                        _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                    }



        return d_analysis;
    }

    public static final SubLObject dot_analysis_dot_string_alt(SubLObject d_analysis) {
        {
            SubLObject current = dot_analysis_remains(d_analysis).first();
            if (NIL != current) {
                {
                    SubLObject current_type = find_current_dot_type(current);
                    _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
                    {
                        SubLObject pcase_var = current_type;
                        if (pcase_var.eql($DOT)) {
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $STRING_WANTED);
                        } else {
                            if (pcase_var.eql($PUNCT)) {
                                clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                            } else {
                                if (pcase_var.eql($NUM)) {
                                    clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                                    _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                    _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                                } else {
                                    if (pcase_var.eql($STRING)) {
                                        clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                        _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            }
        }
        return d_analysis;
    }

    public static SubLObject dot_analysis_dot_string(final SubLObject d_analysis) {
        final SubLObject current = dot_analysis_remains(d_analysis).first();
        if (NIL != current) {
            final SubLObject current_type = find_current_dot_type(current);
            _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
            final SubLObject pcase_var = current_type;
            if (pcase_var.eql($DOT)) {
                _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                _csetf_dot_analysis_state(d_analysis, $STRING_WANTED);
            } else
                if (pcase_var.eql($PUNCT)) {
                    clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                    _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                } else
                    if (pcase_var.eql($NUM)) {
                        clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                        _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                    } else
                        if (pcase_var.eql($STRING)) {
                            clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                        }



        } else {
            clean_dot_accumulator(d_analysis, $DOT_STRING_WANTED);
            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
        }
        return d_analysis;
    }

    public static final SubLObject dot_analysis_string_alt(SubLObject d_analysis) {
        {
            SubLObject current = dot_analysis_remains(d_analysis).first();
            if (NIL != current) {
                {
                    SubLObject current_type = find_current_dot_type(current);
                    _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
                    {
                        SubLObject pcase_var = current_type;
                        if (pcase_var.eql($DOT)) {
                            clean_dot_accumulator(d_analysis, $STRING_WANTED);
                            _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                        } else {
                            if (pcase_var.eql($PUNCT)) {
                                clean_dot_accumulator(d_analysis, $STRING_WANTED);
                                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                            } else {
                                if (pcase_var.eql($NUM)) {
                                    clean_dot_accumulator(d_analysis, $STRING_WANTED);
                                    _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                    _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                                } else {
                                    if (pcase_var.eql($STRING)) {
                                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                        _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                clean_dot_accumulator(d_analysis, $STRING_WANTED);
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            }
        }
        return d_analysis;
    }

    public static SubLObject dot_analysis_string(final SubLObject d_analysis) {
        final SubLObject current = dot_analysis_remains(d_analysis).first();
        if (NIL != current) {
            final SubLObject current_type = find_current_dot_type(current);
            _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
            final SubLObject pcase_var = current_type;
            if (pcase_var.eql($DOT)) {
                clean_dot_accumulator(d_analysis, $STRING_WANTED);
                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            } else
                if (pcase_var.eql($PUNCT)) {
                    clean_dot_accumulator(d_analysis, $STRING_WANTED);
                    _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                } else
                    if (pcase_var.eql($NUM)) {
                        clean_dot_accumulator(d_analysis, $STRING_WANTED);
                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                        _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                    } else
                        if (pcase_var.eql($STRING)) {
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                        }



        } else {
            clean_dot_accumulator(d_analysis, $STRING_WANTED);
            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
        }
        return d_analysis;
    }

    public static final SubLObject dot_analysis_dot_integer_alt(SubLObject d_analysis) {
        {
            SubLObject current = dot_analysis_remains(d_analysis).first();
            if (NIL != current) {
                {
                    SubLObject current_type = find_current_dot_type(current);
                    _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
                    {
                        SubLObject pcase_var = current_type;
                        if (pcase_var.eql($DOT)) {
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $INTEGER_WANTED);
                        } else {
                            if (pcase_var.eql($PUNCT)) {
                                clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                            } else {
                                if (pcase_var.eql($NUM)) {
                                    clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                                    _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                    _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                                } else {
                                    if (pcase_var.eql($STRING)) {
                                        clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                        _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            }
        }
        return d_analysis;
    }

    public static SubLObject dot_analysis_dot_integer(final SubLObject d_analysis) {
        final SubLObject current = dot_analysis_remains(d_analysis).first();
        if (NIL != current) {
            final SubLObject current_type = find_current_dot_type(current);
            _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
            final SubLObject pcase_var = current_type;
            if (pcase_var.eql($DOT)) {
                _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                _csetf_dot_analysis_state(d_analysis, $INTEGER_WANTED);
            } else
                if (pcase_var.eql($PUNCT)) {
                    clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                    _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                } else
                    if (pcase_var.eql($NUM)) {
                        clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                        _csetf_dot_analysis_state(d_analysis, $DOT_INTEGER_WANTED);
                    } else
                        if (pcase_var.eql($STRING)) {
                            clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                        }



        } else {
            clean_dot_accumulator(d_analysis, $DOT_INTEGER_WANTED);
            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
        }
        return d_analysis;
    }

    public static final SubLObject dot_analysis_integer_alt(SubLObject d_analysis) {
        {
            SubLObject current = dot_analysis_remains(d_analysis).first();
            if (NIL != current) {
                {
                    SubLObject current_type = find_current_dot_type(current);
                    _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
                    {
                        SubLObject pcase_var = current_type;
                        if (pcase_var.eql($DOT)) {
                            clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                            _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                        } else {
                            if (pcase_var.eql($PUNCT)) {
                                clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                            } else {
                                if (pcase_var.eql($NUM)) {
                                    {
                                        SubLObject all = cons(current, dot_analysis_accumulator(d_analysis));
                                        SubLObject compact = apply(symbol_function(CCONCATENATE), nreverse(all));
                                        _csetf_dot_analysis_found(d_analysis, cons(compact, dot_analysis_found(d_analysis)));
                                    }
                                    _csetf_dot_analysis_accumulator(d_analysis, NIL);
                                    _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                                } else {
                                    if (pcase_var.eql($STRING)) {
                                        clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                                        _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                                        _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            }
        }
        return d_analysis;
    }

    public static SubLObject dot_analysis_integer(final SubLObject d_analysis) {
        final SubLObject current = dot_analysis_remains(d_analysis).first();
        if (NIL != current) {
            final SubLObject current_type = find_current_dot_type(current);
            _csetf_dot_analysis_remains(d_analysis, dot_analysis_remains(d_analysis).rest());
            final SubLObject pcase_var = current_type;
            if (pcase_var.eql($DOT)) {
                clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                _csetf_dot_analysis_state(d_analysis, $DEFAULT);
            } else
                if (pcase_var.eql($PUNCT)) {
                    clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                    _csetf_dot_analysis_found(d_analysis, cons(current, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                } else
                    if (pcase_var.eql($NUM)) {
                        final SubLObject all = cons(current, dot_analysis_accumulator(d_analysis));
                        final SubLObject compact = apply(symbol_function(CCONCATENATE), nreverse(all));
                        _csetf_dot_analysis_found(d_analysis, cons(compact, dot_analysis_found(d_analysis)));
                        _csetf_dot_analysis_accumulator(d_analysis, NIL);
                        _csetf_dot_analysis_state(d_analysis, $DEFAULT);
                    } else
                        if (pcase_var.eql($STRING)) {
                            clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
                            _csetf_dot_analysis_accumulator(d_analysis, cons(current, dot_analysis_accumulator(d_analysis)));
                            _csetf_dot_analysis_state(d_analysis, $DOT_STRING_WANTED);
                        }



        } else {
            clean_dot_accumulator(d_analysis, $INTEGER_WANTED);
            _csetf_dot_analysis_state(d_analysis, $DEFAULT);
        }
        return d_analysis;
    }

    public static final SubLObject clean_dot_accumulator_alt(SubLObject d_analysis, SubLObject state) {
        {
            SubLObject pcase_var = state;
            if (pcase_var.eql($DOT_STRING_WANTED)) {
                {
                    SubLObject incomplete = dot_analysis_accumulator(d_analysis).first();
                    SubLObject complete = dot_analysis_accumulator(d_analysis).rest();
                    SubLObject compact = (NIL != complete) ? ((SubLObject) (apply(symbol_function(CCONCATENATE), nreverse(complete)))) : NIL;
                    SubLObject all = (NIL != compact) ? ((SubLObject) (cons(incomplete, list(compact)))) : list(incomplete);
                    _csetf_dot_analysis_found(d_analysis, append(all, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_accumulator(d_analysis, NIL);
                }
            } else {
                if (pcase_var.eql($STRING_WANTED)) {
                    _csetf_dot_analysis_found(d_analysis, cons(apply(symbol_function(CCONCATENATE), nreverse(dot_analysis_accumulator(d_analysis))), dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_accumulator(d_analysis, NIL);
                } else {
                    if (pcase_var.eql($DOT_INTEGER_WANTED)) {
                        {
                            SubLObject integer = dot_analysis_accumulator(d_analysis).first();
                            _csetf_dot_analysis_found(d_analysis, cons(integer, dot_analysis_found(d_analysis)));
                            _csetf_dot_analysis_accumulator(d_analysis, NIL);
                        }
                    } else {
                        if (pcase_var.eql($INTEGER_WANTED)) {
                            _csetf_dot_analysis_found(d_analysis, cons(apply(symbol_function(CCONCATENATE), nreverse(dot_analysis_accumulator(d_analysis))), dot_analysis_found(d_analysis)));
                            _csetf_dot_analysis_accumulator(d_analysis, NIL);
                        }
                    }
                }
            }
        }
        return d_analysis;
    }

    public static SubLObject clean_dot_accumulator(final SubLObject d_analysis, final SubLObject state) {
        if (state.eql($DOT_STRING_WANTED)) {
            final SubLObject incomplete = dot_analysis_accumulator(d_analysis).first();
            final SubLObject complete = dot_analysis_accumulator(d_analysis).rest();
            final SubLObject compact = (NIL != complete) ? apply(symbol_function(CCONCATENATE), nreverse(complete)) : NIL;
            final SubLObject all = (NIL != compact) ? cons(incomplete, list(compact)) : list(incomplete);
            _csetf_dot_analysis_found(d_analysis, append(all, dot_analysis_found(d_analysis)));
            _csetf_dot_analysis_accumulator(d_analysis, NIL);
        } else
            if (state.eql($STRING_WANTED)) {
                _csetf_dot_analysis_found(d_analysis, cons(apply(symbol_function(CCONCATENATE), nreverse(dot_analysis_accumulator(d_analysis))), dot_analysis_found(d_analysis)));
                _csetf_dot_analysis_accumulator(d_analysis, NIL);
            } else
                if (state.eql($DOT_INTEGER_WANTED)) {
                    final SubLObject integer = dot_analysis_accumulator(d_analysis).first();
                    _csetf_dot_analysis_found(d_analysis, cons(integer, dot_analysis_found(d_analysis)));
                    _csetf_dot_analysis_accumulator(d_analysis, NIL);
                } else
                    if (state.eql($INTEGER_WANTED)) {
                        _csetf_dot_analysis_found(d_analysis, cons(apply(symbol_function(CCONCATENATE), nreverse(dot_analysis_accumulator(d_analysis))), dot_analysis_found(d_analysis)));
                        _csetf_dot_analysis_accumulator(d_analysis, NIL);
                    }



        return d_analysis;
    }

    /**
     *
     *
     * @return vector; an interval token with starting at START, ending at END and having
    value VALUE
     * @param START
    integer
     * 		
     * @param END
    integer
     * 		
     * @unknown VALUE object
     */
    @LispMethod(comment = "@return vector; an interval token with starting at START, ending at END and having\r\nvalue VALUE\r\n@param START\ninteger\r\n\t\t\r\n@param END\ninteger\r\n\t\t\r\n@unknown VALUE object")
    public static final SubLObject new_interval_token_alt(SubLObject start, SubLObject end, SubLObject value) {
        if (start == UNPROVIDED) {
            start = NIL;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (value == UNPROVIDED) {
            value = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(start, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(end, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!end.numGE(start)) {
                    Errors.error($str_alt46$_a_is_not_greater_than_or_equal_t, end, start);
                }
            }
            {
                SubLObject itoken = make_vector(THREE_INTEGER, UNPROVIDED);
                set_aref(itoken, ZERO_INTEGER, start);
                set_aref(itoken, ONE_INTEGER, end);
                set_aref(itoken, TWO_INTEGER, value);
                return itoken;
            }
        }
    }

    /**
     *
     *
     * @return vector; an interval token with starting at START, ending at END and having
    value VALUE
     * @param START
    integer
     * 		
     * @param END
    integer
     * 		
     * @unknown VALUE object
     */
    @LispMethod(comment = "@return vector; an interval token with starting at START, ending at END and having\r\nvalue VALUE\r\n@param START\ninteger\r\n\t\t\r\n@param END\ninteger\r\n\t\t\r\n@unknown VALUE object")
    public static SubLObject new_interval_token(SubLObject start, SubLObject end, SubLObject value) {
        if (start == UNPROVIDED) {
            start = NIL;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (value == UNPROVIDED) {
            value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(start) : "! subl_promotions.non_negative_integer_p(start) " + ("subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) ") + start;
        assert NIL != subl_promotions.non_negative_integer_p(end) : "! subl_promotions.non_negative_integer_p(end) " + ("subl_promotions.non_negative_integer_p(end) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(end) ") + end;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!end.numGE(start))) {
            Errors.error($str52$_a_is_not_greater_than_or_equal_t, end, start);
        }
        final SubLObject itoken = make_vector(THREE_INTEGER, UNPROVIDED);
        set_aref(itoken, ZERO_INTEGER, start);
        set_aref(itoken, ONE_INTEGER, end);
        set_aref(itoken, TWO_INTEGER, value);
        return itoken;
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is an interval-token, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is an interval-token, nil otherwise")
    public static final SubLObject interval_token_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isVector() && length(v_object).eql(THREE_INTEGER));
    }

    /**
     *
     *
     * @return boolean; non-nil if OBJECT is an interval-token, nil otherwise
     */
    @LispMethod(comment = "@return boolean; non-nil if OBJECT is an interval-token, nil otherwise")
    public static SubLObject interval_token_p(final SubLObject v_object) {
        return makeBoolean(v_object.isVector() && length(v_object).eql(THREE_INTEGER));
    }

    /**
     *
     *
     * @return integer; the start position of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the start position of ITOKEN\r\n@param ITOKEN\nvector")
    public static final SubLObject interval_token_start_alt(SubLObject itoken) {
        SubLTrampolineFile.checkType(itoken, INTERVAL_TOKEN_P);
        return aref(itoken, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return integer; the start position of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the start position of ITOKEN\r\n@param ITOKEN\nvector")
    public static SubLObject interval_token_start(final SubLObject itoken) {
        assert NIL != interval_token_p(itoken) : "! standard_tokenization.interval_token_p(itoken) " + ("standard_tokenization.interval_token_p(itoken) " + "CommonSymbols.NIL != standard_tokenization.interval_token_p(itoken) ") + itoken;
        return aref(itoken, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return integer; the end position of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the end position of ITOKEN\r\n@param ITOKEN\nvector")
    public static final SubLObject interval_token_end_alt(SubLObject itoken) {
        SubLTrampolineFile.checkType(itoken, INTERVAL_TOKEN_P);
        return aref(itoken, ONE_INTEGER);
    }

    /**
     *
     *
     * @return integer; the end position of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the end position of ITOKEN\r\n@param ITOKEN\nvector")
    public static SubLObject interval_token_end(final SubLObject itoken) {
        assert NIL != interval_token_p(itoken) : "! standard_tokenization.interval_token_p(itoken) " + ("standard_tokenization.interval_token_p(itoken) " + "CommonSymbols.NIL != standard_tokenization.interval_token_p(itoken) ") + itoken;
        return aref(itoken, ONE_INTEGER);
    }

    /**
     *
     *
     * @return integer; the number of words of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the number of words of ITOKEN\r\n@param ITOKEN\nvector")
    public static final SubLObject interval_token_length_alt(SubLObject itoken) {
        SubLTrampolineFile.checkType(itoken, INTERVAL_TOKEN_P);
        return subtract(interval_token_end(itoken), interval_token_start(itoken));
    }

    /**
     *
     *
     * @return integer; the number of words of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the number of words of ITOKEN\r\n@param ITOKEN\nvector")
    public static SubLObject interval_token_length(final SubLObject itoken) {
        assert NIL != interval_token_p(itoken) : "! standard_tokenization.interval_token_p(itoken) " + ("standard_tokenization.interval_token_p(itoken) " + "CommonSymbols.NIL != standard_tokenization.interval_token_p(itoken) ") + itoken;
        return subtract(interval_token_end(itoken), interval_token_start(itoken));
    }

    /**
     *
     *
     * @return object; the value of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return object; the value of ITOKEN\r\n@param ITOKEN\nvector")
    public static final SubLObject interval_token_value_alt(SubLObject itoken) {
        SubLTrampolineFile.checkType(itoken, INTERVAL_TOKEN_P);
        return aref(itoken, TWO_INTEGER);
    }

    /**
     *
     *
     * @return object; the value of ITOKEN
     * @param ITOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return object; the value of ITOKEN\r\n@param ITOKEN\nvector")
    public static SubLObject interval_token_value(final SubLObject itoken) {
        assert NIL != interval_token_p(itoken) : "! standard_tokenization.interval_token_p(itoken) " + ("standard_tokenization.interval_token_p(itoken) " + "CommonSymbols.NIL != standard_tokenization.interval_token_p(itoken) ") + itoken;
        return aref(itoken, TWO_INTEGER);
    }

    /**
     *
     *
     * @param ITOKEN
    vector;
     * 		
     * @param VALUE
    object;
     * 		
     * @return object;
     * @unknown destructively modifies the value slot of ITOKEN
     */
    @LispMethod(comment = "@param ITOKEN\nvector;\r\n\t\t\r\n@param VALUE\nobject;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the value slot of ITOKEN")
    public static final SubLObject interval_token_value_set_alt(SubLObject itoken, SubLObject value) {
        SubLTrampolineFile.checkType(itoken, INTERVAL_TOKEN_P);
        set_aref(itoken, TWO_INTEGER, value);
        return value;
    }

    /**
     *
     *
     * @param ITOKEN
    vector;
     * 		
     * @param VALUE
    object;
     * 		
     * @return object;
     * @unknown destructively modifies the value slot of ITOKEN
     */
    @LispMethod(comment = "@param ITOKEN\nvector;\r\n\t\t\r\n@param VALUE\nobject;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the value slot of ITOKEN")
    public static SubLObject interval_token_value_set(final SubLObject itoken, final SubLObject value) {
        assert NIL != interval_token_p(itoken) : "! standard_tokenization.interval_token_p(itoken) " + ("standard_tokenization.interval_token_p(itoken) " + "CommonSymbols.NIL != standard_tokenization.interval_token_p(itoken) ") + itoken;
        set_aref(itoken, TWO_INTEGER, value);
        return value;
    }

    public static final SubLObject string_token_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && v_object.first().isString());
    }

    public static SubLObject string_token_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && v_object.first().isString());
    }

    /**
     *
     *
     * @return vector; a string token with string STRING and value VALUE.
     * @param STRING
    stringp
     * 		
     * @unknown VALUE object
     */
    @LispMethod(comment = "@return vector; a string token with string STRING and value VALUE.\r\n@param STRING\nstringp\r\n\t\t\r\n@unknown VALUE object")
    public static final SubLObject new_string_token_alt(SubLObject string, SubLObject value) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (value == UNPROVIDED) {
            value = NIL;
        }
        return cons(string, value);
    }

    /**
     *
     *
     * @return vector; a string token with string STRING and value VALUE.
     * @param STRING
    stringp
     * 		
     * @unknown VALUE object
     */
    @LispMethod(comment = "@return vector; a string token with string STRING and value VALUE.\r\n@param STRING\nstringp\r\n\t\t\r\n@unknown VALUE object")
    public static SubLObject new_string_token(SubLObject string, SubLObject value) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (value == UNPROVIDED) {
            value = NIL;
        }
        return cons(string, value);
    }

    /**
     *
     *
     * @return integer; the string of STOKEN
     * @param STOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the string of STOKEN\r\n@param STOKEN\nvector")
    public static final SubLObject string_token_string_alt(SubLObject stoken) {
        return stoken.first();
    }

    /**
     *
     *
     * @return integer; the string of STOKEN
     * @param STOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return integer; the string of STOKEN\r\n@param STOKEN\nvector")
    public static SubLObject string_token_string(final SubLObject stoken) {
        return stoken.first();
    }

    /**
     *
     *
     * @return object; the value of STOKEN
     * @param STOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return object; the value of STOKEN\r\n@param STOKEN\nvector")
    public static final SubLObject string_token_value_alt(SubLObject stoken) {
        return stoken.rest();
    }

    /**
     *
     *
     * @return object; the value of STOKEN
     * @param STOKEN
    vector
     * 		
     */
    @LispMethod(comment = "@return object; the value of STOKEN\r\n@param STOKEN\nvector")
    public static SubLObject string_token_value(final SubLObject stoken) {
        return stoken.rest();
    }

    public static final SubLObject copy_string_token_alt(SubLObject stoken) {
        return new_string_token(string_token_string(stoken), string_token_value(stoken));
    }

    public static SubLObject copy_string_token(final SubLObject stoken) {
        return new_string_token(string_token_string(stoken), string_token_value(stoken));
    }

    /**
     *
     *
     * @param STOKEN
    vector;
     * 		
     * @param STRING
    string;
     * 		
     * @return object;
     * @unknown destructively modifies the string slot of STOKEN
     */
    @LispMethod(comment = "@param STOKEN\nvector;\r\n\t\t\r\n@param STRING\nstring;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the string slot of STOKEN")
    public static final SubLObject string_token_string_set_alt(SubLObject stoken, SubLObject string) {
        return rplaca(stoken, string);
    }

    /**
     *
     *
     * @param STOKEN
    vector;
     * 		
     * @param STRING
    string;
     * 		
     * @return object;
     * @unknown destructively modifies the string slot of STOKEN
     */
    @LispMethod(comment = "@param STOKEN\nvector;\r\n\t\t\r\n@param STRING\nstring;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the string slot of STOKEN")
    public static SubLObject string_token_string_set(final SubLObject stoken, final SubLObject string) {
        return rplaca(stoken, string);
    }

    /**
     *
     *
     * @param STOKEN
    vector;
     * 		
     * @param VALUE
    object;
     * 		
     * @return object;
     * @unknown destructively modifies the value slot of STOKEN
     */
    @LispMethod(comment = "@param STOKEN\nvector;\r\n\t\t\r\n@param VALUE\nobject;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the value slot of STOKEN")
    public static final SubLObject string_token_value_set_alt(SubLObject stoken, SubLObject value) {
        return rplacd(stoken, value);
    }

    /**
     *
     *
     * @param STOKEN
    vector;
     * 		
     * @param VALUE
    object;
     * 		
     * @return object;
     * @unknown destructively modifies the value slot of STOKEN
     */
    @LispMethod(comment = "@param STOKEN\nvector;\r\n\t\t\r\n@param VALUE\nobject;\r\n\t\t\r\n@return object;\r\n@unknown destructively modifies the value slot of STOKEN")
    public static SubLObject string_token_value_set(final SubLObject stoken, final SubLObject value) {
        return rplacd(stoken, value);
    }

    public static SubLObject declare_standard_tokenization_file() {
        declareFunction("standard_raw_tokenization", "STANDARD-RAW-TOKENIZATION", 1, 0, false);
        declareFunction("standard_token_chunker", "STANDARD-TOKEN-CHUNKER", 1, 0, false);
        declareFunction("standard_string_tokenize", "STANDARD-STRING-TOKENIZE", 1, 0, false);
        declareFunction("standard_punctuation_chars", "STANDARD-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction("standard_white_space_chars", "STANDARD-WHITE-SPACE-CHARS", 0, 0, false);
        declareFunction("tokenize_sentence", "TOKENIZE-SENTENCE", 1, 3, false);
        declareFunction("scanner_char_classify", "SCANNER-CHAR-CLASSIFY", 4, 0, false);
        declareFunction("dot_analysis_print_function_trampoline", "DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("dot_analysis_p", "DOT-ANALYSIS-P", 1, 0, false);
        new standard_tokenization.$dot_analysis_p$UnaryFunction();
        declareFunction("dot_analysis_found", "DOT-ANALYSIS-FOUND", 1, 0, false);
        declareFunction("dot_analysis_remains", "DOT-ANALYSIS-REMAINS", 1, 0, false);
        declareFunction("dot_analysis_accumulator", "DOT-ANALYSIS-ACCUMULATOR", 1, 0, false);
        declareFunction("dot_analysis_state", "DOT-ANALYSIS-STATE", 1, 0, false);
        declareFunction("_csetf_dot_analysis_found", "_CSETF-DOT-ANALYSIS-FOUND", 2, 0, false);
        declareFunction("_csetf_dot_analysis_remains", "_CSETF-DOT-ANALYSIS-REMAINS", 2, 0, false);
        declareFunction("_csetf_dot_analysis_accumulator", "_CSETF-DOT-ANALYSIS-ACCUMULATOR", 2, 0, false);
        declareFunction("_csetf_dot_analysis_state", "_CSETF-DOT-ANALYSIS-STATE", 2, 0, false);
        declareFunction("make_dot_analysis", "MAKE-DOT-ANALYSIS", 0, 1, false);
        declareFunction("visit_defstruct_dot_analysis", "VISIT-DEFSTRUCT-DOT-ANALYSIS", 2, 0, false);
        declareFunction("visit_defstruct_object_dot_analysis_method", "VISIT-DEFSTRUCT-OBJECT-DOT-ANALYSIS-METHOD", 2, 0, false);
        declareFunction("pprint_dot_analysis", "PPRINT-DOT-ANALYSIS", 3, 0, false);
        declareFunction("perform_dot_analysis", "PERFORM-DOT-ANALYSIS", 1, 0, false);
        declareFunction("init_dot_analysis", "INIT-DOT-ANALYSIS", 1, 0, false);
        declareFunction("find_current_dot_type", "FIND-CURRENT-DOT-TYPE", 1, 0, false);
        declareFunction("dot_analysis_dfa", "DOT-ANALYSIS-DFA", 1, 0, false);
        declareFunction("dot_analysis_default", "DOT-ANALYSIS-DEFAULT", 1, 0, false);
        declareFunction("dot_analysis_dot_string", "DOT-ANALYSIS-DOT-STRING", 1, 0, false);
        declareFunction("dot_analysis_string", "DOT-ANALYSIS-STRING", 1, 0, false);
        declareFunction("dot_analysis_dot_integer", "DOT-ANALYSIS-DOT-INTEGER", 1, 0, false);
        declareFunction("dot_analysis_integer", "DOT-ANALYSIS-INTEGER", 1, 0, false);
        declareFunction("clean_dot_accumulator", "CLEAN-DOT-ACCUMULATOR", 2, 0, false);
        declareFunction("new_interval_token", "NEW-INTERVAL-TOKEN", 0, 3, false);
        declareFunction("interval_token_p", "INTERVAL-TOKEN-P", 1, 0, false);
        declareFunction("interval_token_start", "INTERVAL-TOKEN-START", 1, 0, false);
        declareFunction("interval_token_end", "INTERVAL-TOKEN-END", 1, 0, false);
        declareFunction("interval_token_length", "INTERVAL-TOKEN-LENGTH", 1, 0, false);
        declareFunction("interval_token_value", "INTERVAL-TOKEN-VALUE", 1, 0, false);
        declareFunction("interval_token_value_set", "INTERVAL-TOKEN-VALUE-SET", 2, 0, false);
        declareFunction("string_token_p", "STRING-TOKEN-P", 1, 0, false);
        declareFunction("new_string_token", "NEW-STRING-TOKEN", 0, 2, false);
        declareFunction("string_token_string", "STRING-TOKEN-STRING", 1, 0, false);
        declareFunction("string_token_value", "STRING-TOKEN-VALUE", 1, 0, false);
        declareFunction("copy_string_token", "COPY-STRING-TOKEN", 1, 0, false);
        declareFunction("string_token_string_set", "STRING-TOKEN-STRING-SET", 2, 0, false);
        declareFunction("string_token_value_set", "STRING-TOKEN-VALUE-SET", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_standard_tokenization_file() {
        deflexical("*STANDARD-PUNCTUATION-CHARS*", $list1);
        deflexical("*STANDARD-WORD-FINAL-PUNCTUATION-CHARS*", $list2);
        deflexical("*STANDARD-WHITE-SPACE-CHARS*", string_utilities.whitespace_chars());
        defconstant("*DTP-DOT-ANALYSIS*", DOT_ANALYSIS);
        return NIL;
    }

    public static SubLObject setup_standard_tokenization_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_dot_analysis$.getGlobalValue(), symbol_function(DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list17);
        def_csetf(DOT_ANALYSIS_FOUND, _CSETF_DOT_ANALYSIS_FOUND);
        def_csetf(DOT_ANALYSIS_REMAINS, _CSETF_DOT_ANALYSIS_REMAINS);
        def_csetf(DOT_ANALYSIS_ACCUMULATOR, _CSETF_DOT_ANALYSIS_ACCUMULATOR);
        def_csetf(DOT_ANALYSIS_STATE, _CSETF_DOT_ANALYSIS_STATE);
        identity(DOT_ANALYSIS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_dot_analysis$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DOT_ANALYSIS_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_standard_tokenization_file();
    }

    @Override
    public void initializeVariables() {
        init_standard_tokenization_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_standard_tokenization_file();
    }

    static {
    }

    public static final class $dot_analysis_native extends SubLStructNative {
        public SubLObject $found;

        public SubLObject $remains;

        public SubLObject $accumulator;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $dot_analysis_native() {
            standard_tokenization.$dot_analysis_native.this.$found = Lisp.NIL;
            standard_tokenization.$dot_analysis_native.this.$remains = Lisp.NIL;
            standard_tokenization.$dot_analysis_native.this.$accumulator = Lisp.NIL;
            standard_tokenization.$dot_analysis_native.this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return standard_tokenization.$dot_analysis_native.this.$found;
        }

        @Override
        public SubLObject getField3() {
            return standard_tokenization.$dot_analysis_native.this.$remains;
        }

        @Override
        public SubLObject getField4() {
            return standard_tokenization.$dot_analysis_native.this.$accumulator;
        }

        @Override
        public SubLObject getField5() {
            return standard_tokenization.$dot_analysis_native.this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return standard_tokenization.$dot_analysis_native.this.$found = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return standard_tokenization.$dot_analysis_native.this.$remains = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return standard_tokenization.$dot_analysis_native.this.$accumulator = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return standard_tokenization.$dot_analysis_native.this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.standard_tokenization.$dot_analysis_native.class, DOT_ANALYSIS, DOT_ANALYSIS_P, $list11, $list12, new String[]{ "$found", "$remains", "$accumulator", "$state" }, $list13, $list14, PPRINT_DOT_ANALYSIS);
        }
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ CHAR_semicolon, CHAR_comma, CHAR_colon, CHAR_quotation, CHAR_quote, CHAR_exclamation, CHAR_question, CHAR_lparen, CHAR_rparen, CHAR_percent, CHAR_dollar, CHAR_hyphen, CHAR_caret, CHAR_asterisk });

    static private final SubLList $list_alt2 = list(CHAR_period);

    public static final class $dot_analysis_p$UnaryFunction extends UnaryFunction {
        public $dot_analysis_p$UnaryFunction() {
            super(extractFunctionNamed("DOT-ANALYSIS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return dot_analysis_p(arg1);
        }
    }

    static private final SubLList $list_alt11 = list(makeSymbol("FOUND"), makeSymbol("REMAINS"), makeSymbol("ACCUMULATOR"), makeSymbol("STATE"));

    static private final SubLList $list_alt12 = list(makeKeyword("FOUND"), makeKeyword("REMAINS"), makeKeyword("ACCUMULATOR"), makeKeyword("STATE"));

    static private final SubLList $list_alt13 = list(makeSymbol("DOT-ANALYSIS-FOUND"), makeSymbol("DOT-ANALYSIS-REMAINS"), makeSymbol("DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("DOT-ANALYSIS-STATE"));

    static private final SubLList $list_alt14 = list(makeSymbol("_CSETF-DOT-ANALYSIS-FOUND"), makeSymbol("_CSETF-DOT-ANALYSIS-REMAINS"), makeSymbol("_CSETF-DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("_CSETF-DOT-ANALYSIS-STATE"));

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__AP_Found_________S__ = makeString("#<AP:Found        ~S~%");

    static private final SubLString $str_alt31$_____Remains_______S__ = makeString("     Remains      ~S~%");

    static private final SubLString $str_alt32$_____Accumulator___S__ = makeString("     Accumulator  ~S~%");

    static private final SubLString $str_alt33$_____State_________S___ = makeString("     State        ~S>~%");

    static private final SubLString $str_alt34$_ = makeString(".");

    static private final SubLString $str_alt46$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");
}

/**
 * Total time: 200 ms
 */
