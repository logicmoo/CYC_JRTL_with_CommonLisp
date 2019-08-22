/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backquote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RELATION-LEXIFIER
 * source file: /cyc/top/cycl/relation-lexifier.lisp
 * created:     2019/07/03 17:38:22
 */
public final class relation_lexifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new relation_lexifier();

 public static final String myName = "com.cyc.cycjava.cycl.relation_lexifier";


    // defparameter
    /**
     * listp; a variable used to temporarily hold a list of keywords that are
     * substitutable in a parsing template
     */
    @LispMethod(comment = "listp; a variable used to temporarily hold a list of keywords that are\r\nsubstitutable in a parsing template\ndefparameter\nlistp; a variable used to temporarily hold a list of keywords that are\nsubstitutable in a parsing template")
    private static final SubLSymbol $qsl_keywords_used$ = makeSymbol("*QSL-KEYWORDS-USED*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $pos_template_mappings$ = makeSymbol("*POS-TEMPLATE-MAPPINGS*");

    static private final SubLString $str1$__ = makeString("''");

    static private final SubLString $str2$_ = makeString("'");

    static private final SubLString $str3$__ = makeString("``");

    static private final SubLString $str4$_a = makeString("~a");

    static private final SubLString $str5$_ = makeString("`");

    static private final SubLSymbol $sym7$PPH_DETERMINER_ = makeSymbol("PPH-DETERMINER?");

    static private final SubLSymbol $sym8$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    static private final SubLSymbol $sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_ = makeSymbol("HANDLABLE-ARG-ORDER-SUBLIST-ELEMENT?");

    static private final SubLString $str10$Can_t_handle__S_in__S = makeString("Can't handle ~S in ~S");

    static private final SubLString $str11$_S_references_arg_S____which_is_g = makeString("~S references arg~S,~% which is greater than the min-arity of ~S");

    static private final SubLString $str12$Multiple_slots_for_arg_S_in____S = makeString("Multiple slots for arg~S in~% ~S");

    static private final SubLString $str13$Failed_to_exhaust_arg_order_list_ = makeString("Failed to exhaust arg-order list for ~S.~% Remainder: ~S~%");

    static private final SubLString $str14$Couldn_t_find_twiddle_for_ARG_S_i = makeString("Couldn't find twiddle for ARG~S in ~S");

    static private final SubLString $str15$_S_must_be_the_same_length_as__S = makeString("~S must be the same length as ~S");

    static private final SubLSymbol $sym16$SPEECH_PART_ = makeSymbol("SPEECH-PART?");

    static private final SubLList $list19 = list(makeSymbol("START"), makeSymbol("END"));



    static private final SubLSymbol $sym21$_ = makeSymbol(">");

    private static final SubLSymbol REL_PHRASE_START = makeSymbol("REL-PHRASE-START");



    static private final SubLList $list26 = list(makeKeyword("CAT"));





    static private final SubLList $list29 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    private static final SubLObject $$Indefinite_NLAttr = reader_make_constant_shell("Indefinite-NLAttr");

    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell("Definite-NLAttr");



    private static final SubLSymbol $A_THE_WORD = makeKeyword("A-THE-WORD");

    private static final SubLSymbol $THE_THE_WORD = makeKeyword("THE-THE-WORD");

    static private final SubLString $str36$Can_t_determine_definiteness_of__ = makeString("Can't determine definiteness of ~S");

    private static final SubLSymbol CLOSE_QUOTE_STRING_P = makeSymbol("CLOSE-QUOTE-STRING-P");

    private static final SubLSymbol PPH_PHRASE_STRING = makeSymbol("PPH-PHRASE-STRING");







    static private final SubLString $str45$guess_more_info_not_doing_anythin = makeString("guess-more-info not doing anything with ~s~%");

    private static final SubLObject $$pastTense_Generic = reader_make_constant_shell("pastTense-Generic");

    private static final SubLObject $$presentTense_Generic = reader_make_constant_shell("presentTense-Generic");

    private static final SubLSymbol GENERALIZE_SPEECH_PART_PRED = makeSymbol("GENERALIZE-SPEECH-PART-PRED");

    public static final SubLSymbol $generalize_speech_part_pred_caching_state$ = makeSymbol("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*");





    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str59$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str64$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str65$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    static private final SubLString $str66$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str67$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");







    static private final SubLSymbol $sym71$SPEC_PRED_ = makeSymbol("SPEC-PRED?");

    static private final SubLSymbol $sym73$GENERIC_ARG_ = makeSymbol("GENERIC-ARG?");

    static private final SubLSymbol $sym74$_ = makeSymbol("<");

    private static final SubLSymbol GENERIC_ARG_NUM = makeSymbol("GENERIC-ARG-NUM");

    private static final SubLObject $$NLPattern_Template = reader_make_constant_shell("NLPattern-Template");



    private static final SubLObject $$NLPattern_Word = reader_make_constant_shell("NLPattern-Word");

    private static final SubLObject $$NLPattern_Exact = reader_make_constant_shell("NLPattern-Exact");



    static private final SubLString $str82$unusable_phrase_sent_to_PPH_PHRAS = makeString("unusable phrase sent to PPH-PHRASE-TO-TEMPLATE-SYNTAX: ~%~S~%");

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");

    private static final SubLObject $$termTemplate_Reln = reader_make_constant_shell("termTemplate-Reln");

    private static final SubLObject $$assertTemplate_Reln = reader_make_constant_shell("assertTemplate-Reln");





    static private final SubLString $str89$Sent_non_relation__S_to_DETERMINE = makeString("Sent non-relation ~S to DETERMINE-TEMPLATE-CATEGORY");







    private static final SubLSymbol $PPH_UNKNOWN_CYCL = makeKeyword("PPH-UNKNOWN-CYCL");





    static private final SubLString $$$_ = makeString(" ");





    /**
     *
     *
     * @return EL-FORMULA-P or NIL; A #$genTemplate formula roughly equivalent to AS.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; A #$genTemplate formula roughly equivalent to AS.")
    public static final SubLObject gen_format_assertion_to_gen_template_alt(SubLObject as) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list(as);
                SubLObject arg_order_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format_string = string_utilities.replace_substring(string_utilities.replace_substring(format_string, $str_alt1$__, $str_alt2$_), $str_alt3$__, $str_alt2$_);
                {
                    SubLObject reln = assertions_high.gaf_arg1(as);
                    SubLObject v_arity = arity.min_arity(reln);
                    SubLObject twiddle_string = $str_alt4$_a;
                    SubLObject break_list = list(twiddle_string, Strings.string_upcase(twiddle_string, UNPROVIDED, UNPROVIDED), $str_alt2$_, $str_alt5$_);
                    SubLObject tokenized_original = com.cyc.cycjava.cycl.relation_lexifier.massage_lexification_tokenization(string_utilities.string_tokenize(format_string, break_list, NIL, T, T, UNPROVIDED, UNPROVIDED));
                    SubLObject arg_location_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    SubLObject arg_location_list = NIL;
                    SubLObject arg_speech_part_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    SubLObject arg_speech_part_preds = NIL;
                    SubLObject arg_determiner_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                    SubLObject arg_determiners = NIL;
                    arg_order_list = pph_methods_formulas.regularize_genformat_arglist(arg_order_list, v_arity);
                    {
                        SubLObject list_var = NIL;
                        SubLObject token = NIL;
                        SubLObject start = NIL;
                        for (list_var = tokenized_original, token = list_var.first(), start = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , start = add(ONE_INTEGER, start)) {
                            if (token.equalp(twiddle_string)) {
                                {
                                    SubLObject keyword_arg_order_sublist = arg_order_list.first();
                                    SubLObject arg_order_sublist = pph_utilities.constants_from_keys(keyword_arg_order_sublist);
                                    SubLObject argnum = find_if(symbol_function(INTEGERP), arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject determiner = find_if($sym7$PPH_DETERMINER_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject agr_preds = com.cyc.cycjava.cycl.relation_lexifier.generalize_speech_part_preds(list_utilities.find_all_if($sym8$SPEECH_PART_PRED_, arg_order_sublist, UNPROVIDED));
                                    if (NIL != list_utilities.find_if_not($sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        Errors.warn($str_alt10$Can_t_handle__S_in__S, list_utilities.find_if_not($sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED), keyword_arg_order_sublist);
                                        return NIL;
                                    } else {
                                        if (argnum.isInteger() && argnum.numG(v_arity)) {
                                            Errors.warn($str_alt11$_S_references_arg_S____which_is_g, as, argnum, reln);
                                            return NIL;
                                        } else {
                                            if (NIL != dictionary.dictionary_lookup(arg_location_table, argnum, UNPROVIDED)) {
                                                Errors.warn($str_alt12$Multiple_slots_for_arg_S_in____S, argnum, as);
                                                return NIL;
                                            } else {
                                                dictionary.dictionary_enter(arg_location_table, argnum, start);
                                                dictionary.dictionary_enter(arg_speech_part_table, argnum, agr_preds);
                                                dictionary.dictionary_enter(arg_determiner_table, argnum, determiner);
                                            }
                                        }
                                    }
                                    arg_order_list = arg_order_list.rest();
                                }
                            }
                        }
                    }
                    if (NIL != arg_order_list) {
                        Errors.warn($str_alt13$Failed_to_exhaust_arg_order_list_, as, arg_order_list);
                        return NIL;
                    }
                    {
                        SubLObject end_var = ZERO_INTEGER;
                        SubLObject argnum = NIL;
                        for (argnum = v_arity; !argnum.numLE(end_var); argnum = add(argnum, MINUS_ONE_INTEGER)) {
                            {
                                SubLObject start = dictionary.dictionary_lookup(arg_location_table, argnum, UNPROVIDED);
                                SubLObject agr_preds = dictionary.dictionary_lookup(arg_speech_part_table, argnum, UNPROVIDED);
                                SubLObject determiner = dictionary.dictionary_lookup(arg_determiner_table, argnum, UNPROVIDED);
                                if (!start.isInteger()) {
                                    Errors.warn($str_alt14$Couldn_t_find_twiddle_for_ARG_S_i, argnum, format_string);
                                    return NIL;
                                }
                                arg_location_list = cons(list(start, number_utilities.f_1X(start)), arg_location_list);
                                arg_speech_part_preds = cons(agr_preds, arg_speech_part_preds);
                                arg_determiners = cons(determiner, arg_determiners);
                            }
                        }
                    }
                    return nth_value_step_2(nth_value_step_1(ONE_INTEGER), com.cyc.cycjava.cycl.relation_lexifier.lexify_relation(reln, arg_location_list, tokenized_original, NIL, arg_speech_part_preds, arg_determiners));
                }
            }
        }
    }

    /**
     *
     *
     * @return EL-FORMULA-P or NIL; A #$genTemplate formula roughly equivalent to AS.
     */
    @LispMethod(comment = "@return EL-FORMULA-P or NIL; A #$genTemplate formula roughly equivalent to AS.")
    public static SubLObject gen_format_assertion_to_gen_template(final SubLObject as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list(as);
        SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format_string = string_utilities.replace_substring(string_utilities.replace_substring(format_string, $str1$__, $str2$_), $str3$__, $str2$_);
        final SubLObject reln = assertions_high.gaf_arg1(as);
        final SubLObject v_arity = arity.min_arity(reln);
        final SubLObject twiddle_string = $str4$_a;
        final SubLObject break_list = list(twiddle_string, Strings.string_upcase(twiddle_string, UNPROVIDED, UNPROVIDED), $str2$_, $str5$_);
        final SubLObject tokenized_original = massage_lexification_tokenization(string_utilities.string_tokenize(format_string, break_list, NIL, T, T, UNPROVIDED, UNPROVIDED));
        final SubLObject arg_location_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject arg_location_list = NIL;
        final SubLObject arg_speech_part_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject arg_speech_part_preds = NIL;
        final SubLObject arg_determiner_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject arg_determiners = NIL;
        arg_order_list = pph_methods_formulas.regularize_genformat_arglist(arg_order_list, v_arity);
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject start = NIL;
        list_var = tokenized_original;
        token = list_var.first();
        for (start = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , start = add(ONE_INTEGER, start)) {
            if (token.equalp(twiddle_string)) {
                final SubLObject arg_order_sublist;
                final SubLObject keyword_arg_order_sublist = arg_order_sublist = arg_order_list.first();
                final SubLObject argnum = find_if(symbol_function(INTEGERP), arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject determiner = find_if($sym7$PPH_DETERMINER_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject agr_preds = generalize_speech_part_preds(list_utilities.find_all_if($sym8$SPEECH_PART_PRED_, arg_order_sublist, UNPROVIDED));
                if (NIL != list_utilities.find_if_not($sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    Errors.warn($str10$Can_t_handle__S_in__S, list_utilities.find_if_not($sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, UNPROVIDED, UNPROVIDED, UNPROVIDED), keyword_arg_order_sublist);
                    return NIL;
                }
                if (argnum.isInteger() && argnum.numG(v_arity)) {
                    Errors.warn($str11$_S_references_arg_S____which_is_g, as, argnum, reln);
                    return NIL;
                }
                if (NIL != dictionary.dictionary_lookup(arg_location_table, argnum, UNPROVIDED)) {
                    Errors.warn($str12$Multiple_slots_for_arg_S_in____S, argnum, as);
                    return NIL;
                }
                dictionary.dictionary_enter(arg_location_table, argnum, start);
                dictionary.dictionary_enter(arg_speech_part_table, argnum, agr_preds);
                dictionary.dictionary_enter(arg_determiner_table, argnum, determiner);
                arg_order_list = arg_order_list.rest();
            }
        }
        if (NIL != arg_order_list) {
            Errors.warn($str13$Failed_to_exhaust_arg_order_list_, as, arg_order_list);
            return NIL;
        }
        SubLObject end_var;
        SubLObject argnum2;
        SubLObject agr_preds2;
        SubLObject determiner2;
        for (end_var = ZERO_INTEGER, argnum2 = NIL, argnum2 = v_arity; !argnum2.numLE(end_var); argnum2 = add(argnum2, MINUS_ONE_INTEGER)) {
            start = dictionary.dictionary_lookup(arg_location_table, argnum2, UNPROVIDED);
            agr_preds2 = dictionary.dictionary_lookup(arg_speech_part_table, argnum2, UNPROVIDED);
            determiner2 = dictionary.dictionary_lookup(arg_determiner_table, argnum2, UNPROVIDED);
            if (!start.isInteger()) {
                Errors.warn($str14$Couldn_t_find_twiddle_for_ARG_S_i, argnum2, format_string);
                return NIL;
            }
            arg_location_list = cons(list(start, number_utilities.f_1X(start)), arg_location_list);
            arg_speech_part_preds = cons(agr_preds2, arg_speech_part_preds);
            arg_determiners = cons(determiner2, arg_determiners);
        }
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), lexify_relation(reln, arg_location_list, tokenized_original, NIL, arg_speech_part_preds, arg_determiners));
    }

    public static final SubLObject handlable_arg_order_sublist_elementP_alt(SubLObject element) {
        if (element.isInteger()) {
            return T;
        } else {
            if (element.isKeyword() && (NIL != lexicon_accessors.speech_part_predP(pph_utilities.constant_from_key(element), UNPROVIDED))) {
                return T;
            } else {
                if (element.isKeyword() && (NIL != pph_utilities.pph_determinerP(element))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject handlable_arg_order_sublist_elementP(final SubLObject element) {
        if (element.isInteger()) {
            return T;
        }
        if (element.isKeyword() && (NIL != pph_utilities.pph_determinerP(element))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject massage_lexification_tokenization_alt(SubLObject strings) {
        {
            SubLObject new_strings = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject new_string = string_utilities.trim_whitespace(string);
                    SubLObject pos = position(CHAR_space, new_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != pos) {
                        new_strings = cons(string_utilities.substring(new_string, ZERO_INTEGER, pos), new_strings);
                        new_strings = cons(string_utilities.substring(new_string, number_utilities.f_1X(pos), UNPROVIDED), new_strings);
                    } else {
                        new_strings = cons(new_string, new_strings);
                    }
                }
            }
            return nreverse(new_strings);
        }
    }

    public static SubLObject massage_lexification_tokenization(final SubLObject strings) {
        SubLObject new_strings = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_string = string_utilities.trim_whitespace(string);
            final SubLObject pos = position(CHAR_space, new_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != pos) {
                new_strings = cons(string_utilities.substring(new_string, ZERO_INTEGER, pos), new_strings);
                new_strings = cons(string_utilities.substring(new_string, number_utilities.f_1X(pos), UNPROVIDED), new_strings);
            } else {
                new_strings = cons(new_string, new_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return nreverse(new_strings);
    }

    /**
     *
     *
     * @param REL
     * 		relation; the relation that is being lexified
     * @param ARG-LOCATION-LIST
     * 		list; the spans (as pairs) in TOKENIZED-ORIGINAL corresponding to the arguments to the relations
     * @param TOKENIZED-ORIGINAL
     * 		list; a tokenized phrase that corresponds to a use of REL with arguments in ARG-LOCATION-LIST
     * @param ARG-SPEECH-PARTS
     * 		list; the optional SpeechPart's for each of the arguments
     * 		returns NIL NIL NIL if any of the strings in ARG-LOCATION-LIST are not in TOKENIZED-ORIGINAL
     * @return formula; a parsing template formula
     * @return formula; a genTemplate formula
     * @return formula; a genFormat formula
     */
    @LispMethod(comment = "@param REL\r\n\t\trelation; the relation that is being lexified\r\n@param ARG-LOCATION-LIST\r\n\t\tlist; the spans (as pairs) in TOKENIZED-ORIGINAL corresponding to the arguments to the relations\r\n@param TOKENIZED-ORIGINAL\r\n\t\tlist; a tokenized phrase that corresponds to a use of REL with arguments in ARG-LOCATION-LIST\r\n@param ARG-SPEECH-PARTS\r\n\t\tlist; the optional SpeechPart\'s for each of the arguments\r\n\t\treturns NIL NIL NIL if any of the strings in ARG-LOCATION-LIST are not in TOKENIZED-ORIGINAL\r\n@return formula; a parsing template formula\r\n@return formula; a genTemplate formula\r\n@return formula; a genFormat formula")
    public static final SubLObject lexify_relation_alt(SubLObject rel, SubLObject arg_location_list, SubLObject tokenized_original, SubLObject arg_speech_parts, SubLObject arg_speech_part_preds, SubLObject arg_determiners) {
        if (arg_speech_parts == UNPROVIDED) {
            arg_speech_parts = NIL;
        }
        if (arg_speech_part_preds == UNPROVIDED) {
            arg_speech_part_preds = NIL;
        }
        if (arg_determiners == UNPROVIDED) {
            arg_determiners = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != arg_speech_parts) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.same_length_p(arg_speech_parts, arg_location_list)) {
                        Errors.error($str_alt15$_S_must_be_the_same_length_as__S, arg_speech_parts, arg_location_list);
                    }
                }
                {
                    SubLObject cdolist_list_var = arg_speech_parts;
                    SubLObject speech_part = NIL;
                    for (speech_part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , speech_part = cdolist_list_var.first()) {
                        if (NIL != speech_part) {
                            SubLTrampolineFile.checkType(speech_part, $sym16$SPEECH_PART_);
                        }
                    }
                }
            }
            if (NIL != arg_speech_part_preds) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.same_length_p(arg_speech_part_preds, arg_location_list)) {
                        Errors.error($str_alt15$_S_must_be_the_same_length_as__S, arg_speech_part_preds, arg_location_list);
                    }
                }
                {
                    SubLObject cdolist_list_var = arg_speech_part_preds;
                    SubLObject speech_part_pred = NIL;
                    for (speech_part_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , speech_part_pred = cdolist_list_var.first()) {
                        if (NIL != speech_part_pred) {
                            SubLTrampolineFile.checkType(speech_part_pred, LISTP);
                        }
                    }
                }
            }
            if (NIL != arg_determiners) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.same_length_p(arg_determiners, arg_location_list)) {
                        Errors.error($str_alt15$_S_must_be_the_same_length_as__S, arg_determiners, arg_location_list);
                    }
                }
                {
                    SubLObject cdolist_list_var = arg_determiners;
                    SubLObject determiner = NIL;
                    for (determiner = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , determiner = cdolist_list_var.first()) {
                        if (NIL != determiner) {
                            SubLTrampolineFile.checkType(determiner, KEYWORDP);
                        }
                    }
                }
            }
            {
                SubLObject parsetemplate = NIL;
                SubLObject gentemplate_phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                    try {
                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                        pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                        try {
                            {
                                SubLObject result = NIL;
                                SubLObject pph_phrases = NIL;
                                SubLObject rel_phrases = NIL;
                                SubLObject list_var = NIL;
                                SubLObject arg_location = NIL;
                                SubLObject i = NIL;
                                for (list_var = arg_location_list, arg_location = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_location = list_var.first() , i = add(ONE_INTEGER, i)) {
                                    {
                                        SubLObject datum = arg_location;
                                        SubLObject current = datum;
                                        SubLObject start = NIL;
                                        SubLObject end = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt19);
                                        start = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt19);
                                        end = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject principled_cat = com.cyc.cycjava.cycl.relation_lexifier.phrasal_cat_for_pos(arg_speech_parts.first());
                                                SubLObject agr_preds = arg_speech_part_preds.first();
                                                SubLObject determiner = arg_determiners.first();
                                                SubLObject cat = (NIL != principled_cat) ? ((SubLObject) (principled_cat)) : $$NounPhrase;
                                                SubLObject argnum = number_utilities.f_1X(i);
                                                SubLObject cycl = at_utilities.get_generic_arg(argnum);
                                                SubLObject phrase_string = string_utilities.bunge(subseq(tokenized_original, start, end), UNPROVIDED);
                                                SubLObject v_pph_phrase = com.cyc.cycjava.cycl.relation_lexifier.lexifier_pph_phrase(phrase_string, cycl, cat, agr_preds, determiner);
                                                rel_phrases = cons(com.cyc.cycjava.cycl.relation_lexifier.new_rel_phrase(start, end, v_pph_phrase, tokenized_original), rel_phrases);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt19);
                                        }
                                    }
                                    arg_speech_parts = arg_speech_parts.rest();
                                    arg_speech_part_preds = arg_speech_part_preds.rest();
                                    arg_determiners = arg_determiners.rest();
                                }
                                rel_phrases = Sort.sort(rel_phrases, $sym21$_, REL_PHRASE_START);
                                {
                                    SubLObject start_of_last = length(tokenized_original);
                                    SubLObject cdolist_list_var = rel_phrases;
                                    SubLObject rel_phrase = NIL;
                                    for (rel_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_phrase = cdolist_list_var.first()) {
                                        if (!start_of_last.numE(com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_end(rel_phrase))) {
                                            pph_phrases = com.cyc.cycjava.cycl.relation_lexifier.push_phrase(tokenized_original, com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_end(rel_phrase), start_of_last, pph_phrases);
                                        }
                                        pph_phrases = cons(com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_pph_phrase(rel_phrase), pph_phrases);
                                        start_of_last = com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_start(rel_phrase);
                                    }
                                    if (!start_of_last.numE(ZERO_INTEGER)) {
                                        pph_phrases = com.cyc.cycjava.cycl.relation_lexifier.push_phrase(tokenized_original, ZERO_INTEGER, start_of_last, pph_phrases);
                                    }
                                    {
                                        SubLObject mother_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        pph_phrase.set_pph_phrase_dtrs_from_list(mother_phrase, pph_phrases, UNPROVIDED);
                                        result = mother_phrase;
                                    }
                                }
                                com.cyc.cycjava.cycl.relation_lexifier.rel_lex_guess_more_info(result);
                                com.cyc.cycjava.cycl.relation_lexifier.rel_lex_revert_generic_arg_phrases(result);
                                parsetemplate = com.cyc.cycjava.cycl.relation_lexifier.parse_template_from_pph_phrase(rel, result);
                                com.cyc.cycjava.cycl.relation_lexifier.rel_lex_merge_strings(result);
                                gentemplate_phrase = pph_templates.gentemplate_phrase_from_pph_phrase(rel, result);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    pph_macros.destroy_new_pph_phrases();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_2, thread);
                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1, thread);
                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(parsetemplate, gentemplate_phrase, $NOT_YET);
            }
        }
    }

    /**
     *
     *
     * @param REL
     * 		relation; the relation that is being lexified
     * @param ARG-LOCATION-LIST
     * 		list; the spans (as pairs) in TOKENIZED-ORIGINAL corresponding to the arguments to the relations
     * @param TOKENIZED-ORIGINAL
     * 		list; a tokenized phrase that corresponds to a use of REL with arguments in ARG-LOCATION-LIST
     * @param ARG-SPEECH-PARTS
     * 		list; the optional SpeechPart's for each of the arguments
     * 		returns NIL NIL NIL if any of the strings in ARG-LOCATION-LIST are not in TOKENIZED-ORIGINAL
     * @return formula; a parsing template formula
     * @return formula; a genTemplate formula
     * @return formula; a genFormat formula
     */
    @LispMethod(comment = "@param REL\r\n\t\trelation; the relation that is being lexified\r\n@param ARG-LOCATION-LIST\r\n\t\tlist; the spans (as pairs) in TOKENIZED-ORIGINAL corresponding to the arguments to the relations\r\n@param TOKENIZED-ORIGINAL\r\n\t\tlist; a tokenized phrase that corresponds to a use of REL with arguments in ARG-LOCATION-LIST\r\n@param ARG-SPEECH-PARTS\r\n\t\tlist; the optional SpeechPart\'s for each of the arguments\r\n\t\treturns NIL NIL NIL if any of the strings in ARG-LOCATION-LIST are not in TOKENIZED-ORIGINAL\r\n@return formula; a parsing template formula\r\n@return formula; a genTemplate formula\r\n@return formula; a genFormat formula")
    public static SubLObject lexify_relation(final SubLObject rel, final SubLObject arg_location_list, final SubLObject tokenized_original, SubLObject arg_speech_parts, SubLObject arg_speech_part_preds, SubLObject arg_determiners) {
        if (arg_speech_parts == UNPROVIDED) {
            arg_speech_parts = NIL;
        }
        if (arg_speech_part_preds == UNPROVIDED) {
            arg_speech_part_preds = NIL;
        }
        if (arg_determiners == UNPROVIDED) {
            arg_determiners = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arg_speech_parts) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.same_length_p(arg_speech_parts, arg_location_list))) {
                Errors.error($str15$_S_must_be_the_same_length_as__S, arg_speech_parts, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_speech_parts;
            SubLObject speech_part = NIL;
            speech_part = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != speech_part) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == lexicon_accessors.speech_partP(speech_part, UNPROVIDED))) {
                    throw new AssertionError(speech_part);
                }
                cdolist_list_var = cdolist_list_var.rest();
                speech_part = cdolist_list_var.first();
            } 
        }
        if (NIL != arg_speech_part_preds) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.same_length_p(arg_speech_part_preds, arg_location_list))) {
                Errors.error($str15$_S_must_be_the_same_length_as__S, arg_speech_part_preds, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_speech_part_preds;
            SubLObject speech_part_pred = NIL;
            speech_part_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != speech_part_pred) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(speech_part_pred))) {
                    throw new AssertionError(speech_part_pred);
                }
                cdolist_list_var = cdolist_list_var.rest();
                speech_part_pred = cdolist_list_var.first();
            } 
        }
        if (NIL != arg_determiners) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.same_length_p(arg_determiners, arg_location_list))) {
                Errors.error($str15$_S_must_be_the_same_length_as__S, arg_determiners, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_determiners;
            SubLObject determiner = NIL;
            determiner = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL != determiner) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == keywordp(determiner))) {
                    throw new AssertionError(determiner);
                }
                cdolist_list_var = cdolist_list_var.rest();
                determiner = cdolist_list_var.first();
            } 
        }
        final SubLObject parsetemplate = NIL;
        SubLObject gentemplate_phrase = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                SubLObject result = NIL;
                SubLObject pph_phrases = NIL;
                SubLObject rel_phrases = NIL;
                SubLObject list_var = NIL;
                SubLObject arg_location = NIL;
                SubLObject i = NIL;
                list_var = arg_location_list;
                arg_location = list_var.first();
                for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg_location = list_var.first() , i = add(ONE_INTEGER, i)) {
                    SubLObject current;
                    final SubLObject datum = current = arg_location;
                    SubLObject start = NIL;
                    SubLObject end = NIL;
                    destructuring_bind_must_consp(current, datum, $list19);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list19);
                    end = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject principled_cat = phrasal_cat_for_pos(arg_speech_parts.first());
                        final SubLObject agr_preds = arg_speech_part_preds.first();
                        final SubLObject determiner2 = arg_determiners.first();
                        final SubLObject cat = (NIL != principled_cat) ? principled_cat : $$NounPhrase;
                        final SubLObject argnum = number_utilities.f_1X(i);
                        final SubLObject cycl = at_utilities.get_generic_arg(argnum);
                        final SubLObject phrase_string = string_utilities.bunge(subseq(tokenized_original, start, end), UNPROVIDED);
                        final SubLObject v_pph_phrase = lexifier_pph_phrase(phrase_string, cycl, cat, agr_preds, determiner2);
                        rel_phrases = cons(new_rel_phrase(start, end, v_pph_phrase, tokenized_original), rel_phrases);
                    } else {
                        cdestructuring_bind_error(datum, $list19);
                    }
                    arg_speech_parts = arg_speech_parts.rest();
                    arg_speech_part_preds = arg_speech_part_preds.rest();
                    arg_determiners = arg_determiners.rest();
                }
                rel_phrases = Sort.sort(rel_phrases, $sym21$_, REL_PHRASE_START);
                SubLObject start_of_last = length(tokenized_original);
                SubLObject cdolist_list_var2 = rel_phrases;
                SubLObject rel_phrase = NIL;
                rel_phrase = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (!start_of_last.numE(rel_phrase_end(rel_phrase))) {
                        pph_phrases = push_phrase(tokenized_original, rel_phrase_end(rel_phrase), start_of_last, pph_phrases);
                    }
                    pph_phrases = cons(rel_phrase_pph_phrase(rel_phrase), pph_phrases);
                    start_of_last = rel_phrase_start(rel_phrase);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    rel_phrase = cdolist_list_var2.first();
                } 
                if (!start_of_last.numE(ZERO_INTEGER)) {
                    pph_phrases = push_phrase(tokenized_original, ZERO_INTEGER, start_of_last, pph_phrases);
                }
                final SubLObject mother_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.set_pph_phrase_dtrs_from_list(mother_phrase, pph_phrases, UNPROVIDED);
                result = mother_phrase;
                rel_lex_guess_more_info(result);
                rel_lex_revert_generic_arg_phrases(result);
                rel_lex_merge_strings(result);
                gentemplate_phrase = pph_templates.gentemplate_phrase_from_pph_phrase(rel, result);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return values(parsetemplate, gentemplate_phrase, $NOT_YET);
    }

    public static final SubLObject phrasal_cat_for_pos_alt(SubLObject pos) {
        {
            SubLObject cat = ask_utilities.ask_variable($CAT, listS($$headsPhraseOfType, pos, $list_alt26), $$GeneralLexiconMt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            return NIL != cat ? ((SubLObject) (reformulator_hub.reformulate_cycl(list($$PhraseFn, cat), $$GeneralLexiconMt, UNPROVIDED))) : NIL;
        }
    }

    public static SubLObject phrasal_cat_for_pos(final SubLObject pos) {
        final SubLObject cat = ask_utilities.ask_variable($CAT, listS($$headsPhraseOfType, pos, $list26), $$GeneralLexiconMt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
        return NIL != cat ? reformulator_hub.reformulate_cycl(list($$PhraseFn, cat), $$GeneralLexiconMt, UNPROVIDED) : NIL;
    }

    public static final SubLObject lexifier_pph_phrase_alt(SubLObject phrase_string, SubLObject cycl, SubLObject cat, SubLObject agr_preds, SubLObject determiner) {
        if (agr_preds == UNPROVIDED) {
            agr_preds = NIL;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (NIL != determiner) {
            cat = $$NounPhrase;
        }
        {
            SubLObject v_pph_phrase = (NIL != determiner) ? ((SubLObject) (com.cyc.cycjava.cycl.relation_lexifier.lexifier_np(phrase_string, cycl, agr_preds, determiner))) : pph_data_structures.new_pph_phrase(phrase_string, cycl, UNPROVIDED);
            pph_phrase.pph_phrase_set_category(v_pph_phrase, cat, UNPROVIDED);
            if (NIL != agr_preds) {
                pph_phrase.pph_phrase_set_agr_preds(v_pph_phrase, agr_preds, UNPROVIDED);
            } else {
                pph_phrase.pph_phrase_set_absolute_agr_from_phrase(v_pph_phrase);
            }
            return v_pph_phrase;
        }
    }

    public static SubLObject lexifier_pph_phrase(final SubLObject phrase_string, final SubLObject cycl, SubLObject cat, SubLObject agr_preds, SubLObject determiner) {
        if (agr_preds == UNPROVIDED) {
            agr_preds = NIL;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (NIL != determiner) {
            cat = $$NounPhrase;
        }
        final SubLObject v_pph_phrase = (NIL != determiner) ? lexifier_np(phrase_string, cycl, agr_preds, determiner) : pph_data_structures.new_pph_phrase(phrase_string, cycl, UNPROVIDED);
        pph_phrase.pph_phrase_set_category(v_pph_phrase, cat, UNPROVIDED);
        if (NIL != agr_preds) {
            pph_phrase.pph_phrase_set_agr_preds(v_pph_phrase, agr_preds, UNPROVIDED);
        } else {
            pph_phrase.pph_phrase_set_absolute_agr_from_phrase(v_pph_phrase);
        }
        return v_pph_phrase;
    }

    public static final SubLObject lexifier_np_alt(SubLObject phrase_string, SubLObject cycl, SubLObject agr_preds, SubLObject determiner) {
        {
            SubLObject nbar_dtr = com.cyc.cycjava.cycl.relation_lexifier.lexifier_pph_phrase(phrase_string, cycl, $list_alt29, agr_preds, NIL);
            SubLObject det_dtr = com.cyc.cycjava.cycl.relation_lexifier.lexifier_det_phrase(determiner);
            SubLObject np_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_category_to_np(np_phrase);
            pph_phrase.pph_phrase_set_head_dtr_num(np_phrase, ONE_INTEGER);
            pph_phrase.set_pph_phrase_dtrs_from_list(np_phrase, list(det_dtr, nbar_dtr), UNPROVIDED);
            return np_phrase;
        }
    }

    public static SubLObject lexifier_np(final SubLObject phrase_string, final SubLObject cycl, final SubLObject agr_preds, final SubLObject determiner) {
        final SubLObject nbar_dtr = lexifier_pph_phrase(phrase_string, cycl, $list29, agr_preds, NIL);
        final SubLObject det_dtr = lexifier_det_phrase(determiner);
        final SubLObject np_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_set_category_to_np(np_phrase);
        pph_phrase.pph_phrase_set_head_dtr_num(np_phrase, ONE_INTEGER);
        pph_phrase.set_pph_phrase_dtrs_from_list(np_phrase, list(det_dtr, nbar_dtr), UNPROVIDED);
        return np_phrase;
    }

    public static final SubLObject lexifier_det_phrase_alt(SubLObject determiner) {
        {
            SubLObject determiner_attribute = (NIL != com.cyc.cycjava.cycl.relation_lexifier.lexifier_indefinite_determiner_p(determiner)) ? ((SubLObject) ($$Indefinite_NLAttr)) : $$Definite_NLAttr;
            return com.cyc.cycjava.cycl.relation_lexifier.lexifier_pph_phrase(NIL, determiner_attribute, $$Determiner, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject lexifier_det_phrase(final SubLObject determiner) {
        final SubLObject determiner_attribute = (NIL != lexifier_indefinite_determiner_p(determiner)) ? $$Indefinite_NLAttr : $$Definite_NLAttr;
        return lexifier_pph_phrase(NIL, determiner_attribute, $$Determiner, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject lexifier_indefinite_determiner_p_alt(SubLObject determiner) {
        {
            SubLObject pcase_var = determiner;
            if (pcase_var.eql($A_THE_WORD) || pcase_var.eql($SOME)) {
                return T;
            } else {
                if (pcase_var.eql($THE_THE_WORD)) {
                    return NIL;
                } else {
                    Errors.sublisp_break($str_alt36$Can_t_determine_definiteness_of__, new SubLObject[]{ determiner });
                }
            }
        }
        return NIL;
    }

    public static SubLObject lexifier_indefinite_determiner_p(final SubLObject determiner) {
        if (determiner.eql($A_THE_WORD) || determiner.eql($SOME)) {
            return T;
        }
        if (determiner.eql($THE_THE_WORD)) {
            return NIL;
        }
        Errors.sublisp_break($str36$Can_t_determine_definiteness_of__, new SubLObject[]{ determiner });
        return NIL;
    }

    /**
     * push the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto
     * EXISTING-PHRASES, and return it.
     *
     * @param ORIGINAL
     * 		list; the original sentence as a list of strings
     * @param START
     * 		integer; the index of the start of the phrase to be pushed
     * @param END
     * 		integer; the index of the end of the phrase to be pushed
     * @param EXISTING-PHRASES
     * 		list; the list we're pushing onto
     * @return list; EXISTING-PHRASES plus the new item we just pushed
     */
    @LispMethod(comment = "push the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto\r\nEXISTING-PHRASES, and return it.\r\n\r\n@param ORIGINAL\r\n\t\tlist; the original sentence as a list of strings\r\n@param START\r\n\t\tinteger; the index of the start of the phrase to be pushed\r\n@param END\r\n\t\tinteger; the index of the end of the phrase to be pushed\r\n@param EXISTING-PHRASES\r\n\t\tlist; the list we\'re pushing onto\r\n@return list; EXISTING-PHRASES plus the new item we just pushed\npush the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto\nEXISTING-PHRASES, and return it.")
    public static final SubLObject push_phrase_alt(SubLObject original, SubLObject start, SubLObject end, SubLObject existing_phrases) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = existing_phrases;
                SubLObject close_quote_phrase = find_if(CLOSE_QUOTE_STRING_P, result, PPH_PHRASE_STRING, UNPROVIDED, UNPROVIDED);
                SubLObject word_strings = subseq(original, start, end);
                SubLObject cdolist_list_var = nreverse(word_strings);
                SubLObject word_string = NIL;
                for (word_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_string = cdolist_list_var.first()) {
                    if (NIL != string_utilities.empty_string_p(word_string)) {
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.relation_lexifier.open_quote_string_p(word_string)) && (NIL != close_quote_phrase)) {
                            {
                                SubLObject close_quote_position = position(close_quote_phrase, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                thread.resetMultipleValues();
                                {
                                    SubLObject phrases_to_quote = list_utilities.split_list(result, close_quote_position);
                                    SubLObject rest = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject phrase_to_quote = (NIL != list_utilities.singletonP(phrases_to_quote)) ? ((SubLObject) (phrases_to_quote.first())) : pph_phrase.new_pph_phrase_with_dtr_list(phrases_to_quote);
                                        SubLObject quoted_phrase = pph_phrase.quote_pph_phrase(phrase_to_quote);
                                        result = cons(quoted_phrase, remove(close_quote_phrase, rest, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        close_quote_phrase = find_if(CLOSE_QUOTE_STRING_P, result, PPH_PHRASE_STRING, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.relation_lexifier.close_quote_string_p(word_string)) {
                                close_quote_phrase = pph_data_structures.new_pph_phrase(word_string, UNPROVIDED, UNPROVIDED);
                                result = cons(close_quote_phrase, result);
                            } else {
                                result = cons(pph_data_structures.new_pph_phrase(word_string, UNPROVIDED, UNPROVIDED), result);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * push the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto
     * EXISTING-PHRASES, and return it.
     *
     * @param ORIGINAL
     * 		list; the original sentence as a list of strings
     * @param START
     * 		integer; the index of the start of the phrase to be pushed
     * @param END
     * 		integer; the index of the end of the phrase to be pushed
     * @param EXISTING-PHRASES
     * 		list; the list we're pushing onto
     * @return list; EXISTING-PHRASES plus the new item we just pushed
     */
    @LispMethod(comment = "push the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto\r\nEXISTING-PHRASES, and return it.\r\n\r\n@param ORIGINAL\r\n\t\tlist; the original sentence as a list of strings\r\n@param START\r\n\t\tinteger; the index of the start of the phrase to be pushed\r\n@param END\r\n\t\tinteger; the index of the end of the phrase to be pushed\r\n@param EXISTING-PHRASES\r\n\t\tlist; the list we\'re pushing onto\r\n@return list; EXISTING-PHRASES plus the new item we just pushed\npush the simplest form of the pph-phrase defined by ORIGINAL, START, and END onto\nEXISTING-PHRASES, and return it.")
    public static SubLObject push_phrase(final SubLObject original, final SubLObject start, final SubLObject end, final SubLObject existing_phrases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = existing_phrases;
        SubLObject close_quote_phrase = find_if(CLOSE_QUOTE_STRING_P, result, PPH_PHRASE_STRING, UNPROVIDED, UNPROVIDED);
        final SubLObject word_strings = subseq(original, start, end);
        SubLObject cdolist_list_var = nreverse(word_strings);
        SubLObject word_string = NIL;
        word_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == string_utilities.empty_string_p(word_string)) {
                if ((NIL != open_quote_string_p(word_string)) && (NIL != close_quote_phrase)) {
                    final SubLObject close_quote_position = position(close_quote_phrase, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject phrases_to_quote = list_utilities.split_list(result, close_quote_position);
                    final SubLObject rest = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject phrase_to_quote = (NIL != list_utilities.singletonP(phrases_to_quote)) ? phrases_to_quote.first() : pph_phrase.new_pph_phrase_with_dtr_list(phrases_to_quote);
                    final SubLObject quoted_phrase = pph_phrase.quote_pph_phrase(phrase_to_quote);
                    result = cons(quoted_phrase, remove(close_quote_phrase, rest, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    close_quote_phrase = find_if(CLOSE_QUOTE_STRING_P, result, PPH_PHRASE_STRING, UNPROVIDED, UNPROVIDED);
                } else
                    if (NIL != close_quote_string_p(word_string)) {
                        close_quote_phrase = pph_data_structures.new_pph_phrase(word_string, UNPROVIDED, UNPROVIDED);
                        result = cons(close_quote_phrase, result);
                    } else {
                        result = cons(pph_data_structures.new_pph_phrase(word_string, UNPROVIDED, UNPROVIDED), result);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            word_string = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject open_quote_string_p_alt(SubLObject string) {
        return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.relation_lexifier.open_quote_p(Strings.sublisp_char(string, ZERO_INTEGER))));
    }

    public static SubLObject open_quote_string_p(final SubLObject string) {
        return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != open_quote_p(Strings.sublisp_char(string, ZERO_INTEGER))));
    }

    public static final SubLObject open_quote_p_alt(SubLObject v_char) {
        return makeBoolean(v_char.isChar() && ((v_char == CHAR_quote) || (v_char == CHAR_backquote)));
    }

    public static SubLObject open_quote_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (v_char.eql(CHAR_quote) || v_char.eql(CHAR_backquote)));
    }

    public static final SubLObject close_quote_string_p_alt(SubLObject string) {
        return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.relation_lexifier.close_quote_p(Strings.sublisp_char(string, ZERO_INTEGER))));
    }

    public static SubLObject close_quote_string_p(final SubLObject string) {
        return makeBoolean((string.isString() && (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED))) && (NIL != close_quote_p(Strings.sublisp_char(string, ZERO_INTEGER))));
    }

    public static final SubLObject close_quote_p_alt(SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (v_char == CHAR_quote));
    }

    public static SubLObject close_quote_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && v_char.eql(CHAR_quote));
    }

    /**
     *
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @return pph-phrase
     * @unknown destructively modifies PHRASE
    working from the bare-bones information in PHRASE, attempt to make it more
    detailed and complete
     */
    @LispMethod(comment = "@param PHRASE\npph-phrase\r\n\t\t\r\n@return pph-phrase\r\n@unknown destructively modifies PHRASE\r\nworking from the bare-bones information in PHRASE, attempt to make it more\r\ndetailed and complete")
    public static final SubLObject rel_lex_guess_more_info_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                    {
                        SubLObject subj_dtr_num = NIL;
                        SubLObject found_head_verbP = NIL;
                        SubLObject dtr_num = ZERO_INTEGER;
                        SubLObject vector_var = document.sign_constituents(phrase);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject dtr = aref(vector_var, element_num);
                                thread.resetMultipleValues();
                                {
                                    SubLObject subj_dtr_num_2 = com.cyc.cycjava.cycl.relation_lexifier.guess_more_info_for_dtr(dtr, phrase, dtr_num, subj_dtr_num, found_head_verbP);
                                    SubLObject found_head_verbP_3 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    subj_dtr_num = subj_dtr_num_2;
                                    found_head_verbP = found_head_verbP_3;
                                }
                                dtr_num = add(dtr_num, ONE_INTEGER);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return phrase;
        }
    }

    /**
     *
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @return pph-phrase
     * @unknown destructively modifies PHRASE
    working from the bare-bones information in PHRASE, attempt to make it more
    detailed and complete
     */
    @LispMethod(comment = "@param PHRASE\npph-phrase\r\n\t\t\r\n@return pph-phrase\r\n@unknown destructively modifies PHRASE\r\nworking from the bare-bones information in PHRASE, attempt to make it more\r\ndetailed and complete")
    public static SubLObject rel_lex_guess_more_info(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            SubLObject subj_dtr_num = NIL;
            SubLObject found_head_verbP = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject subj_dtr_num_$2;
                SubLObject found_head_verbP_$3;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    thread.resetMultipleValues();
                    subj_dtr_num_$2 = guess_more_info_for_dtr(dtr, phrase, dtr_num, subj_dtr_num, found_head_verbP);
                    found_head_verbP_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    subj_dtr_num = subj_dtr_num_$2;
                    found_head_verbP = found_head_verbP_$3;
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static final SubLObject guess_more_info_for_dtr_alt(SubLObject dtr, SubLObject phrase, SubLObject dtr_num, SubLObject subj_dtr_num, SubLObject found_head_verbP) {
        if (((NIL != subj_dtr_num) && (NIL == found_head_verbP)) && (NIL != com.cyc.cycjava.cycl.relation_lexifier.tensed_verb_lacking_agreement_infoP(dtr))) {
            found_head_verbP = com.cyc.cycjava.cycl.relation_lexifier.maybe_make_head_verb(dtr, phrase, subj_dtr_num);
        } else {
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                if ((NIL == subj_dtr_num) && (NIL != pph_phrase.pph_phrase_npP(dtr))) {
                    subj_dtr_num = dtr_num;
                }
            } else {
                if ((NIL != pph_phrase.pph_phrase_npP(pph_phrase_resolution.pph_wordify_sem_free_noun(dtr))) || ((pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))) == $POS_PRED) && (NIL != genl_predicates.genl_predP(pph_utilities.pph_agr_constraint_target(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))), $$nounStrings, UNPROVIDED, UNPROVIDED)))) {
                    com.cyc.cycjava.cycl.relation_lexifier.make_np_dtr(dtr);
                    if (NIL == subj_dtr_num) {
                        subj_dtr_num = dtr_num;
                    }
                }
            }
        }
        return values(subj_dtr_num, found_head_verbP);
    }

    public static SubLObject guess_more_info_for_dtr(final SubLObject dtr, final SubLObject phrase, final SubLObject dtr_num, SubLObject subj_dtr_num, SubLObject found_head_verbP) {
        if (((NIL != subj_dtr_num) && (NIL == found_head_verbP)) && (NIL != tensed_verb_lacking_agreement_infoP(dtr))) {
            found_head_verbP = maybe_make_head_verb(dtr, phrase, subj_dtr_num);
        } else
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                if ((NIL == subj_dtr_num) && (NIL != pph_phrase.pph_phrase_npP(dtr))) {
                    subj_dtr_num = dtr_num;
                }
            } else
                if ((NIL != pph_phrase.pph_phrase_npP(pph_phrase_resolution.pph_wordify_sem_free_noun(dtr))) || ((pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))) == $POS_PRED) && (NIL != genl_predicates.genl_predP(pph_utilities.pph_agr_constraint_target(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))), $$nounStrings, UNPROVIDED, UNPROVIDED)))) {
                    make_np_dtr(dtr);
                    if (NIL == subj_dtr_num) {
                        subj_dtr_num = dtr_num;
                    }
                }


        return values(subj_dtr_num, found_head_verbP);
    }

    public static final SubLObject maybe_make_head_verb_alt(SubLObject dtr, SubLObject phrase, SubLObject subj_dtr_num) {
        {
            SubLObject subj_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, subj_dtr_num);
            SubLObject verb_string = pph_phrase.pph_phrase_string(dtr, UNPROVIDED);
            SubLObject verb_agr_pred = NIL;
            SubLObject wu = NIL;
            SubLObject found_head_verbP = NIL;
            if (NIL == wu) {
                {
                    SubLObject csome_list_var = lexicon_utilities.preds_of_string(verb_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject verb_pred = NIL;
                    for (verb_pred = csome_list_var.first(); !((NIL != wu) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , verb_pred = csome_list_var.first()) {
                        if (NIL != lexicon_accessors.genl_pos_predP(verb_pred, $$tensed, UNPROVIDED)) {
                            {
                                SubLObject required_verb_pred = pph_phrase_resolution.verb_pred_for_subject(subj_dtr, list(verb_pred));
                                wu = lexicon_accessors.words_of_stringXpred(pph_phrase.pph_phrase_string(dtr, UNPROVIDED), required_verb_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                                if (NIL != wu) {
                                    verb_agr_pred = verb_pred;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != wu) {
                pph_phrase.pph_phrase_set_agr(dtr, pph_data_structures.new_pph_phrase_agr(NIL, pph_utilities.new_pph_agr_constraint($SUBJECT_VERB, subj_dtr)), UNPROVIDED);
                pph_phrase.pph_phrase_set_wu(dtr, wu);
                pph_phrase.pph_phrase_set_category(dtr, $$Verb, UNPROVIDED);
                if (NIL != verb_agr_pred) {
                    verb_agr_pred = com.cyc.cycjava.cycl.relation_lexifier.remove_number_agreement(verb_agr_pred);
                    pph_phrase.pph_phrase_set_agr_pred(dtr, verb_agr_pred, UNPROVIDED);
                }
                pph_phrase.pph_phrase_set_string(dtr, NIL);
                found_head_verbP = T;
            }
            return found_head_verbP;
        }
    }

    public static SubLObject maybe_make_head_verb(final SubLObject dtr, final SubLObject phrase, final SubLObject subj_dtr_num) {
        final SubLObject subj_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, subj_dtr_num);
        final SubLObject verb_string = pph_phrase.pph_phrase_string(dtr, UNPROVIDED);
        SubLObject verb_agr_pred = NIL;
        SubLObject wu = NIL;
        SubLObject found_head_verbP = NIL;
        if (NIL == wu) {
            SubLObject csome_list_var = lexicon_utilities.preds_of_string(verb_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject verb_pred = NIL;
            verb_pred = csome_list_var.first();
            while ((NIL == wu) && (NIL != csome_list_var)) {
                if (NIL != lexicon_accessors.genl_pos_predP(verb_pred, $$tensed, UNPROVIDED)) {
                    final SubLObject required_verb_pred = pph_phrase_resolution.verb_pred_for_subject(subj_dtr, list(verb_pred));
                    wu = lexicon_accessors.words_of_stringXpred(pph_phrase.pph_phrase_string(dtr, UNPROVIDED), required_verb_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                    if (NIL != wu) {
                        verb_agr_pred = verb_pred;
                    }
                }
                csome_list_var = csome_list_var.rest();
                verb_pred = csome_list_var.first();
            } 
        }
        if (NIL != wu) {
            pph_phrase.pph_phrase_set_agr(dtr, pph_data_structures.new_pph_phrase_agr(NIL, pph_utilities.new_pph_agr_constraint($SUBJECT_VERB, subj_dtr)), UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(dtr, wu);
            pph_phrase.pph_phrase_set_category(dtr, $$Verb, UNPROVIDED);
            if (NIL != verb_agr_pred) {
                verb_agr_pred = remove_number_agreement(verb_agr_pred);
                pph_phrase.pph_phrase_set_agr_pred(dtr, verb_agr_pred, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_string(dtr, NIL);
            found_head_verbP = T;
        }
        return found_head_verbP;
    }

    public static final SubLObject make_np_dtr_alt(SubLObject dtr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject np_parse = psp_main.best_ps_parse_for_np(pph_phrase.pph_phrase_string(dtr, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                if (NIL == np_parse) {
                    com.cyc.cycjava.cycl.relation_lexifier.attach_less_principled_information(dtr);
                } else {
                    if (NIL != pph_phrase_resolution.pph_phrase_starts_with_detpP(np_parse)) {
                        pph_phrase.pph_phrase_set_cycl(np_parse, pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED));
                        pph_phrase.pph_phrase_copy(np_parse, dtr, UNPROVIDED);
                    } else {
                        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt45$guess_more_info_not_doing_anythin, pph_phrase.pph_phrase_string(dtr, UNPROVIDED));
                            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                        }
                    }
                }
            }
            return dtr;
        }
    }

    public static SubLObject make_np_dtr(final SubLObject dtr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject np_parse = psp_main.best_ps_parse_for_np(pph_phrase.pph_phrase_string(dtr, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if (NIL == np_parse) {
            attach_less_principled_information(dtr);
        } else
            if (NIL != pph_phrase_resolution.pph_phrase_starts_with_detpP(np_parse)) {
                pph_phrase.pph_phrase_set_cycl(np_parse, pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED));
                pph_phrase.pph_phrase_copy(np_parse, dtr, UNPROVIDED);
            } else
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str45$guess_more_info_not_doing_anythin, pph_phrase.pph_phrase_string(dtr, UNPROVIDED));
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }


        return dtr;
    }

    public static final SubLObject remove_number_agreement_alt(SubLObject verb_agr_pred) {
        if (NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, $$pastTense_Generic, UNPROVIDED)) {
            return $$pastTense_Generic;
        } else {
            if (NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, $$presentTense_Generic, UNPROVIDED)) {
                return $$presentTense_Generic;
            } else {
                return verb_agr_pred;
            }
        }
    }

    public static SubLObject remove_number_agreement(final SubLObject verb_agr_pred) {
        if (NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, $$pastTense_Generic, UNPROVIDED)) {
            return $$pastTense_Generic;
        }
        if (NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, $$presentTense_Generic, UNPROVIDED)) {
            return $$presentTense_Generic;
        }
        return verb_agr_pred;
    }

    public static final SubLObject generalize_speech_part_preds_alt(SubLObject preds) {
        return Mapping.mapcar(GENERALIZE_SPEECH_PART_PRED, preds);
    }

    public static SubLObject generalize_speech_part_preds(final SubLObject preds) {
        return Mapping.mapcar(GENERALIZE_SPEECH_PART_PRED, preds);
    }

    public static final SubLObject clear_generalize_speech_part_pred_alt() {
        {
            SubLObject cs = $generalize_speech_part_pred_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_generalize_speech_part_pred() {
        final SubLObject cs = $generalize_speech_part_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_generalize_speech_part_pred_alt(SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($generalize_speech_part_pred_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_generalize_speech_part_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($generalize_speech_part_pred_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generalize_speech_part_pred_internal_alt(SubLObject pred) {
        {
            SubLObject general_pred = (NIL != com.cyc.cycjava.cycl.relation_lexifier.general_speech_part_predP(pred)) ? ((SubLObject) (pred)) : com.cyc.cycjava.cycl.relation_lexifier.generalize_speech_part_pred_int(pred, set_utilities.new_singleton_set(pred, UNPROVIDED));
            return NIL != general_pred ? ((SubLObject) (general_pred)) : pred;
        }
    }

    public static SubLObject generalize_speech_part_pred_internal(final SubLObject pred) {
        final SubLObject general_pred = (NIL != general_speech_part_predP(pred)) ? pred : generalize_speech_part_pred_int(pred, set_utilities.new_singleton_set(pred, UNPROVIDED));
        return NIL != general_pred ? general_pred : pred;
    }

    public static final SubLObject generalize_speech_part_pred_alt(SubLObject pred) {
        {
            SubLObject caching_state = $generalize_speech_part_pred_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GENERALIZE_SPEECH_PART_PRED, $generalize_speech_part_pred_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, $kw50$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.relation_lexifier.generalize_speech_part_pred_internal(pred)));
                    memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject generalize_speech_part_pred(final SubLObject pred) {
        SubLObject caching_state = $generalize_speech_part_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERALIZE_SPEECH_PART_PRED, $generalize_speech_part_pred_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(generalize_speech_part_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject generalize_speech_part_pred_int_alt(SubLObject pred, SubLObject done_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject general_pred = (NIL != com.cyc.cycjava.cycl.relation_lexifier.general_speech_part_predP(pred)) ? ((SubLObject) (pred)) : NIL;
                if (NIL == general_pred) {
                    {
                        SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
                        SubLObject node_var = pred;
                        SubLObject deck_type = ($BREADTH == $DEPTH) ? ((SubLObject) ($STACK)) : $QUEUE;
                        SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = NIL;
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject mt_var = $$BaseKB;
                                    {
                                        SubLObject _prev_bind_0_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject tv_var = $$True_JustificationTruth;
                                                {
                                                    SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                            while ((NIL != node_and_predicate_mode) && (NIL == general_pred)) {
                                                                                {
                                                                                    SubLObject node_var_13 = node_and_predicate_mode.first();
                                                                                    SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                    SubLObject genl_pred = node_var_13;
                                                                                    {
                                                                                        SubLObject _prev_bind_0_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                            {
                                                                                                SubLObject inverseP = predicate_mode;
                                                                                                if (!(((NIL != inverseP) || (genl_pred == pred)) || (NIL != set.set_memberP(genl_pred, done_preds)))) {
                                                                                                    set.set_add(genl_pred, done_preds);
                                                                                                    if (NIL != lexicon_accessors.speech_part_predP(genl_pred, UNPROVIDED)) {
                                                                                                        general_pred = com.cyc.cycjava.cycl.relation_lexifier.generalize_speech_part_pred_int(genl_pred, done_preds);
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                                                                    SubLObject rest = NIL;
                                                                                                    for (rest = accessible_modules; !((NIL != general_pred) || (NIL == rest)); rest = rest.rest()) {
                                                                                                        {
                                                                                                            SubLObject module_var = rest.first();
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                    {
                                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_13);
                                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                            {
                                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != d_link) {
                                                                                                                                    {
                                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        if (NIL != mt_links) {
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                while (!((NIL != general_pred) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                        while (!((NIL != general_pred) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)))) {
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                        try {
                                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                SubLObject rest_20 = NIL;
                                                                                                                                                                                                for (rest_20 = new_list; !((NIL != general_pred) || (NIL == rest_20)); rest_20 = rest_20.rest()) {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject node_vars_link_node = rest_20.first();
                                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        } finally {
                                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_19, thread);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                                                                                                                            }
                                                                                                                                                                        } 
                                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_17, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt66$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                {
                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    SubLObject rest_21 = NIL;
                                                                                                                                    for (rest_21 = new_list; !((NIL != general_pred) || (NIL == rest_21)); rest_21 = rest_21.rest()) {
                                                                                                                                        {
                                                                                                                                            SubLObject generating_fn = rest_21.first();
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                        SubLObject new_list_23 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject rest_24 = NIL;
                                                                                                                                                        for (rest_24 = new_list_23; !((NIL != general_pred) || (NIL == rest_24)); rest_24 = rest_24.rest()) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject node_vars_link_node = rest_24.first();
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_22, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_16, thread);
                                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_15, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_14, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_12, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_11, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt67$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_9, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_8, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return general_pred;
            }
        }
    }

    public static SubLObject generalize_speech_part_pred_int(final SubLObject pred, final SubLObject done_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject general_pred = (NIL != general_speech_part_predP(pred)) ? pred : NIL;
        if (NIL == general_pred) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
            final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = $$BaseKB;
                    final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == general_pred); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$13 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$13;
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (((NIL == inverseP) && (!genl_pred.eql(pred))) && (NIL == set.set_memberP(genl_pred, done_preds))) {
                                                    set.set_add(genl_pred, done_preds);
                                                    if (NIL != lexicon_accessors.speech_part_predP(genl_pred, UNPROVIDED)) {
                                                        general_pred = generalize_speech_part_pred_int(genl_pred, done_preds);
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$9;
                                                SubLObject _prev_bind_1_$9;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$10;
                                                SubLObject iteration_state_$18;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$11;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$20;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$12;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == general_pred) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$13);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == general_pred) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == general_pred) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18)); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == general_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == general_pred) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == general_pred) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str65$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str66$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$20 = NIL, rest_$20 = new_list; (NIL == general_pred) && (NIL != rest_$20); rest_$20 = rest_$20.rest()) {
                                                                    generating_fn = rest_$20.first();
                                                                    _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == general_pred) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == general_pred) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == general_pred) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str65$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$7, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str67$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$5, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return general_pred;
    }

    public static final SubLObject general_speech_part_predP_alt(SubLObject pred) {
        if (pred == $$gerund) {
            return T;
        } else {
            if (NIL != lexicon_accessors.genl_pos_predP(pred, $$agentiveNounStrings, UNPROVIDED)) {
                return T;
            } else {
                if (NIL != isa.isaP(pred, $$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject general_speech_part_predP(final SubLObject pred) {
        if (pred.eql($$gerund)) {
            return T;
        }
        if (NIL != lexicon_accessors.genl_pos_predP(pred, $$agentiveNounStrings, UNPROVIDED)) {
            return T;
        }
        if (NIL != isa.isaP(pred, $$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject tensed_verb_lacking_agreement_infoP_alt(SubLObject phrase) {
        return makeBoolean((NIL != pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase.pph_phrase_agr(phrase))) && (NIL != member($$tensed, nl_trie_accessors.nl_trie_preds_of_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym71$SPEC_PRED_, UNPROVIDED)));
    }

    public static SubLObject tensed_verb_lacking_agreement_infoP(final SubLObject phrase) {
        return makeBoolean((NIL != pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase.pph_phrase_agr(phrase))) && (NIL != member($$tensed, nl_trie_accessors.nl_trie_preds_of_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym71$SPEC_PRED_, UNPROVIDED)));
    }

    /**
     * Remove from daughters of PHRASE that correspond to arguments information specific
     * to the strings supplied for lexification.
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */
    @LispMethod(comment = "Remove from daughters of PHRASE that correspond to arguments information specific\r\nto the strings supplied for lexification.\r\n\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return PHRASE pph-phrase\r\n@unknown destructively modifies phrase\nRemove from daughters of PHRASE that correspond to arguments information specific\nto the strings supplied for lexification.")
    public static final SubLObject rel_lex_revert_generic_arg_phrases_alt(SubLObject phrase) {
        {
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL != at_utilities.generic_argP(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED))) {
                        pph_phrase.pph_phrase_set_string(dtr, string_utilities.$empty_string$.getGlobalValue());
                        pph_phrase.set_pph_phrase_dtrs_from_list(dtr, NIL, UNPROVIDED);
                        pph_phrase.pph_phrase_set_agr_preds(dtr, $ANY, UNPROVIDED);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    /**
     * Remove from daughters of PHRASE that correspond to arguments information specific
     * to the strings supplied for lexification.
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */
    @LispMethod(comment = "Remove from daughters of PHRASE that correspond to arguments information specific\r\nto the strings supplied for lexification.\r\n\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@return PHRASE pph-phrase\r\n@unknown destructively modifies phrase\nRemove from daughters of PHRASE that correspond to arguments information specific\nto the strings supplied for lexification.")
    public static SubLObject rel_lex_revert_generic_arg_phrases(final SubLObject phrase) {
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
                if (NIL != at_utilities.generic_argP(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED))) {
                    pph_phrase.pph_phrase_set_string(dtr, string_utilities.$empty_string$.getGlobalValue());
                    pph_phrase.set_pph_phrase_dtrs_from_list(dtr, NIL, UNPROVIDED);
                    pph_phrase.pph_phrase_set_agr_preds(dtr, $ANY, UNPROVIDED);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }/**
     * Remove from daughters of PHRASE that correspond to arguments information specific
     * to the strings supplied for lexification.
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */


    /**
     * Merge adjacent bare-string daughters of PHRASE.
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */
    @LispMethod(comment = "Merge adjacent bare-string daughters of PHRASE.\r\n\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return PHRASE pph-phrase\r\n@unknown destructively modifies phrase")
    public static final SubLObject rel_lex_merge_strings_alt(SubLObject phrase) {
        {
            SubLObject new_dtrs = NIL;
            SubLObject bare_string_dtrs = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL != pph_phrase.pph_bare_string_phrase_p(dtr)) {
                        bare_string_dtrs = cons(dtr, bare_string_dtrs);
                    } else {
                        new_dtrs = com.cyc.cycjava.cycl.relation_lexifier.add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
                        bare_string_dtrs = NIL;
                        new_dtrs = cons(dtr, new_dtrs);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            if (NIL != bare_string_dtrs) {
                new_dtrs = com.cyc.cycjava.cycl.relation_lexifier.add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
            }
            {
                SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(phrase);
                pph_phrase.set_pph_phrase_dtrs_from_list(phrase, nreverse(new_dtrs), head_dtr_num);
            }
        }
        return phrase;
    }

    /**
     * Merge adjacent bare-string daughters of PHRASE.
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */
    @LispMethod(comment = "Merge adjacent bare-string daughters of PHRASE.\r\n\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@return PHRASE pph-phrase\r\n@unknown destructively modifies phrase")
    public static SubLObject rel_lex_merge_strings(final SubLObject phrase) {
        SubLObject new_dtrs = NIL;
        SubLObject bare_string_dtrs = NIL;
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
                if (NIL != pph_phrase.pph_bare_string_phrase_p(dtr)) {
                    bare_string_dtrs = cons(dtr, bare_string_dtrs);
                } else {
                    new_dtrs = add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
                    bare_string_dtrs = NIL;
                    new_dtrs = cons(dtr, new_dtrs);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        if (NIL != bare_string_dtrs) {
            new_dtrs = add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
        }
        final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(phrase);
        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, nreverse(new_dtrs), head_dtr_num);
        return phrase;
    }/**
     * Merge adjacent bare-string daughters of PHRASE.
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @return PHRASE pph-phrase
     * @unknown destructively modifies phrase
     */


    public static final SubLObject add_bare_string_dtrs_alt(SubLObject bare_string_dtrs, SubLObject new_dtrs) {
        if (NIL != list_utilities.singletonP(bare_string_dtrs)) {
            new_dtrs = cons(bare_string_dtrs.first(), new_dtrs);
        } else {
            if (NIL != bare_string_dtrs) {
                {
                    SubLObject strings = Mapping.mapcar(PPH_PHRASE_STRING, bare_string_dtrs);
                    SubLObject string = pph_utilities.clean_bunge_nreverse(strings, UNPROVIDED);
                    SubLObject new_bare_string_dtr = pph_data_structures.new_pph_phrase(string, UNPROVIDED, UNPROVIDED);
                    new_dtrs = cons(new_bare_string_dtr, new_dtrs);
                }
            }
        }
        return new_dtrs;
    }

    public static SubLObject add_bare_string_dtrs(final SubLObject bare_string_dtrs, SubLObject new_dtrs) {
        if (NIL != list_utilities.singletonP(bare_string_dtrs)) {
            new_dtrs = cons(bare_string_dtrs.first(), new_dtrs);
        } else
            if (NIL != bare_string_dtrs) {
                final SubLObject strings = Mapping.mapcar(PPH_PHRASE_STRING, bare_string_dtrs);
                final SubLObject string = pph_utilities.clean_bunge_nreverse(strings, UNPROVIDED);
                final SubLObject new_bare_string_dtr = pph_data_structures.new_pph_phrase(string, UNPROVIDED, UNPROVIDED);
                new_dtrs = cons(new_bare_string_dtr, new_dtrs);
            }

        return new_dtrs;
    }

    /**
     *
     *
     * @param NP-PARSE
    pph-phrase
     * 		
     * @param PHRASE
    pph-phrase
     * 		
     * @return pph-phrase
    Given an NP-parse, modify PHRASE so that it mirrors the structure of the np-parse
     * @unknown assumes that all NP's are parsed into binary structures by the NP-parser
     */
    @LispMethod(comment = "@param NP-PARSE\npph-phrase\r\n\t\t\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return pph-phrase\r\nGiven an NP-parse, modify PHRASE so that it mirrors the structure of the np-parse\r\n@unknown assumes that all NP\'s are parsed into binary structures by the NP-parser")
    public static final SubLObject build_pph_np_from_np_parse_alt(SubLObject np_parse, SubLObject phrase) {
        {
            SubLObject dtrs = make_vector(TWO_INTEGER, UNPROVIDED);
            SubLObject detp_dtr = pph_phrase.pph_phrase_nth_dtr(ZERO_INTEGER, np_parse);
            SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(ONE_INTEGER, np_parse);
            pph_phrase.pph_phrase_set_dtrs(phrase, dtrs);
            pph_phrase.pph_phrase_set_nth_dtr(ZERO_INTEGER, phrase, detp_dtr);
            pph_phrase.pph_phrase_set_nth_dtr(ONE_INTEGER, phrase, nbar_dtr);
        }
        return phrase;
    }

    /**
     *
     *
     * @param NP-PARSE
    pph-phrase
     * 		
     * @param PHRASE
    pph-phrase
     * 		
     * @return pph-phrase
    Given an NP-parse, modify PHRASE so that it mirrors the structure of the np-parse
     * @unknown assumes that all NP's are parsed into binary structures by the NP-parser
     */
    @LispMethod(comment = "@param NP-PARSE\npph-phrase\r\n\t\t\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return pph-phrase\r\nGiven an NP-parse, modify PHRASE so that it mirrors the structure of the np-parse\r\n@unknown assumes that all NP\'s are parsed into binary structures by the NP-parser")
    public static SubLObject build_pph_np_from_np_parse(final SubLObject np_parse, final SubLObject phrase) {
        final SubLObject dtrs = make_vector(TWO_INTEGER, UNPROVIDED);
        final SubLObject detp_dtr = pph_phrase.pph_phrase_nth_dtr(ZERO_INTEGER, np_parse);
        final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(ONE_INTEGER, np_parse);
        pph_phrase.pph_phrase_set_dtrs(phrase, dtrs);
        pph_phrase.pph_phrase_set_nth_dtr(ZERO_INTEGER, phrase, detp_dtr);
        pph_phrase.pph_phrase_set_nth_dtr(ONE_INTEGER, phrase, nbar_dtr);
        return phrase;
    }

    /**
     * convert a pph-phrase to a template-parser template
     *
     * @param REL
    relation
     * 		
     * @param PHRASE
    pph-phrase
     * 		
     * @return formula
     */
    @LispMethod(comment = "convert a pph-phrase to a template-parser template\r\n\r\n@param REL\nrelation\r\n\t\t\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return formula")
    public static final SubLObject parse_template_from_pph_phrase_alt(SubLObject rel, SubLObject phrase) {
        {
            SubLObject template_pred = com.cyc.cycjava.cycl.relation_lexifier.determine_template_pred(rel, phrase);
            SubLObject template_category = com.cyc.cycjava.cycl.relation_lexifier.determine_template_category(rel, phrase);
            SubLObject template_syntax = NIL;
            SubLObject template_sem = NIL;
            template_syntax = com.cyc.cycjava.cycl.relation_lexifier.pph_phrase_to_template_syntax(phrase, rel);
            template_sem = com.cyc.cycjava.cycl.relation_lexifier.template_sem_from_template_syntax(template_syntax, rel);
            return list(template_pred, template_category, rel, template_syntax, template_sem);
        }
    }

    /**
     * convert a pph-phrase to a template-parser template
     *
     * @param REL
    		relation
     * 		
     * @param PHRASE
    		pph-phrase
     * 		
     * @return formula
     */
    @LispMethod(comment = "convert a pph-phrase to a template-parser template\r\n\r\n@param REL\n\t\trelation\r\n\t\t\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@return formula")
    public static SubLObject parse_template_from_pph_phrase(final SubLObject rel, final SubLObject phrase) {
        final SubLObject template_pred = determine_template_pred(rel, phrase);
        final SubLObject template_category = determine_template_category(rel, phrase);
        SubLObject template_syntax = NIL;
        SubLObject template_sem = NIL;
        template_syntax = pph_phrase_to_template_syntax(phrase, rel);
        template_sem = template_sem_from_template_syntax(template_syntax, rel);
        return list(template_pred, template_category, rel, template_syntax, template_sem);
    }/**
     * convert a pph-phrase to a template-parser template
     *
     * @param REL
    		relation
     * 		
     * @param PHRASE
    		pph-phrase
     * 		
     * @return formula
     */


    /**
     * given the syntax of a template, find the semantics of it
     *
     * @unknown assumes that the semantics can be found from all of the keywords, and further
    assumes that the keywords can be sorted into the correct order for the semantics
     * @param SYNTAX
    list;
     * 		
     * @param REL
    relatio
     * 		
     * @return formula; a keyword variable template
     */
    @LispMethod(comment = "given the syntax of a template, find the semantics of it\r\n\r\n@unknown assumes that the semantics can be found from all of the keywords, and further\r\nassumes that the keywords can be sorted into the correct order for the semantics\r\n@param SYNTAX\nlist;\r\n\t\t\r\n@param REL\nrelatio\r\n\t\t\r\n@return formula; a keyword variable template")
    public static final SubLObject template_sem_from_template_syntax_alt(SubLObject syntax, SubLObject rel) {
        {
            SubLObject keywords = list_utilities.tree_gather(syntax, $sym73$GENERIC_ARG_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return cons(rel, Sort.sort(keywords, symbol_function($sym74$_), GENERIC_ARG_NUM));
        }
    }

    /**
     * given the syntax of a template, find the semantics of it
     *
     * @unknown assumes that the semantics can be found from all of the keywords, and further
    assumes that the keywords can be sorted into the correct order for the semantics
     * @param SYNTAX
    		list;
     * 		
     * @param REL
    		relatio
     * 		
     * @return formula; a keyword variable template
     */
    @LispMethod(comment = "given the syntax of a template, find the semantics of it\r\n\r\n@unknown assumes that the semantics can be found from all of the keywords, and further\r\nassumes that the keywords can be sorted into the correct order for the semantics\r\n@param SYNTAX\n\t\tlist;\r\n\t\t\r\n@param REL\n\t\trelatio\r\n\t\t\r\n@return formula; a keyword variable template")
    public static SubLObject template_sem_from_template_syntax(final SubLObject syntax, final SubLObject rel) {
        final SubLObject keywords = list_utilities.tree_gather(syntax, $sym73$GENERIC_ARG_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cons(rel, Sort.sort(keywords, symbol_function($sym74$_), GENERIC_ARG_NUM));
    }/**
     * given the syntax of a template, find the semantics of it
     *
     * @unknown assumes that the semantics can be found from all of the keywords, and further
    assumes that the keywords can be sorted into the correct order for the semantics
     * @param SYNTAX
    		list;
     * 		
     * @param REL
    		relatio
     * 		
     * @return formula; a keyword variable template
     */


    /**
     * convert a pph-phrase to the syntactic part of a template-parser template
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @param REL
    cyc-relation
     * 		
     * @return list
     */
    @LispMethod(comment = "convert a pph-phrase to the syntactic part of a template-parser template\r\n\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@param REL\ncyc-relation\r\n\t\t\r\n@return list")
    public static final SubLObject pph_phrase_to_template_syntax_alt(SubLObject phrase, SubLObject rel) {
        if (NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
            return make_binary_formula($$NLPattern_Template, $$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        } else {
            if (NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
                return make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), $$Verb);
            } else {
                if (NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) {
                    return make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                } else {
                    if (NIL != pph_phrase.pph_phrase_string(phrase, UNPROVIDED)) {
                        return make_unary_formula($$NLPattern_Exact, pph_phrase.pph_phrase_string(phrase, UNPROVIDED));
                    } else {
                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                            {
                                SubLObject result = NIL;
                                SubLObject dtr_num = ZERO_INTEGER;
                                SubLObject vector_var = document.sign_constituents(phrase);
                                SubLObject backwardP_var = NIL;
                                SubLObject length = length(vector_var);
                                SubLObject v_iteration = NIL;
                                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    {
                                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                        SubLObject dtr = aref(vector_var, element_num);
                                        result = cons(com.cyc.cycjava.cycl.relation_lexifier.pph_phrase_to_template_syntax(dtr, rel), result);
                                        dtr_num = add(dtr_num, ONE_INTEGER);
                                    }
                                }
                                result = reverse(result);
                                return make_el_formula($$NLPatternList, result, UNPROVIDED);
                            }
                        } else {
                            if (pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) {
                                {
                                    SubLObject template_category = $$NPTemplate;
                                    if (NIL != pph_phrase.pph_phrase_agr(phrase)) {
                                        {
                                            SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                                            SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                                            SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                                            if (pcase_var.eql($POS_PRED)) {
                                                template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                                            } else {
                                                if (pcase_var.eql($NL_PREDS)) {
                                                    template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != indexed_term_p(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
                                            template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                                        }
                                    }
                                    return make_binary_formula($$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                }
                            } else {
                                Errors.warn($str_alt82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * convert a pph-phrase to the syntactic part of a template-parser template
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @param REL
    		cyc-relation
     * 		
     * @return list
     */
    @LispMethod(comment = "convert a pph-phrase to the syntactic part of a template-parser template\r\n\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@param REL\n\t\tcyc-relation\r\n\t\t\r\n@return list")
    public static SubLObject pph_phrase_to_template_syntax(final SubLObject phrase, final SubLObject rel) {
        if (NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
            return make_binary_formula($$NLPattern_Template, $$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        }
        if (NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
            return make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), $$Verb);
        }
        if (NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) {
            return make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
        }
        if (NIL != pph_phrase.pph_phrase_string(phrase, UNPROVIDED)) {
            return make_unary_formula($$NLPattern_Exact, pph_phrase.pph_phrase_string(phrase, UNPROVIDED));
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject result = NIL;
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
                    result = cons(pph_phrase_to_template_syntax(dtr, rel), result);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            result = reverse(result);
            return make_el_formula($$NLPatternList, result, UNPROVIDED);
        }
        if (pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) {
            SubLObject template_category = $$NPTemplate;
            if (NIL != pph_phrase.pph_phrase_agr(phrase)) {
                final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                if (pcase_var.eql($POS_PRED)) {
                    template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                } else
                    if (pcase_var.eql($NL_PREDS)) {
                        template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                    }

            } else
                if (NIL != indexed_term_p(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
                    template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                }

            return make_binary_formula($$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        }
        Errors.warn($str82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
        return NIL;
    }/**
     * convert a pph-phrase to the syntactic part of a template-parser template
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @param REL
    		cyc-relation
     * 		
     * @return list
     */


    /**
     *
     *
     * @unknown should look to see if the phrase is a question or not
     */
    @LispMethod(comment = "@unknown should look to see if the phrase is a question or not")
    public static final SubLObject determine_template_pred_alt(SubLObject rel, SubLObject phrase) {
        return NIL != isa.isa_in_any_mtP(rel, $$Function_Denotational) ? ((SubLObject) ($$termTemplate_Reln)) : $$assertTemplate_Reln;
    }

    /**
     *
     *
     * @unknown should look to see if the phrase is a question or not
     */
    @LispMethod(comment = "@unknown should look to see if the phrase is a question or not")
    public static SubLObject determine_template_pred(final SubLObject rel, final SubLObject phrase) {
        return NIL != isa.isa_in_any_mtP(rel, $$Function_Denotational) ? $$termTemplate_Reln : $$assertTemplate_Reln;
    }

    /**
     *
     *
     * @param REL
     * 		instance of #$Relation
     * @param PHRASE
    pph-phrase
     * 		
     * @return spec of #$ParsingTemplateCategory
     */
    @LispMethod(comment = "@param REL\r\n\t\tinstance of #$Relation\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return spec of #$ParsingTemplateCategory")
    public static final SubLObject determine_template_category_alt(SubLObject rel, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL != fort_types_interface.isa_functionP(rel, UNPROVIDED)) {
                            result = $$NPTemplate;
                        } else {
                            if (NIL != fort_types_interface.predicate_p(rel)) {
                                result = $$STemplate;
                            } else {
                                Errors.warn($str_alt89$Sent_non_relation__S_to_DETERMINE, rel);
                                result = NIL;
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param REL
     * 		instance of #$Relation
     * @param PHRASE
    pph-phrase
     * 		
     * @return spec of #$ParsingTemplateCategory
     */
    @LispMethod(comment = "@param REL\r\n\t\tinstance of #$Relation\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return spec of #$ParsingTemplateCategory")
    public static SubLObject determine_template_category(final SubLObject rel, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != fort_types_interface.isa_functionP(rel, UNPROVIDED)) {
                result = $$NPTemplate;
            } else
                if (NIL != fort_types_interface.predicate_p(rel)) {
                    result = $$STemplate;
                } else {
                    Errors.warn($str89$Sent_non_relation__S_to_DETERMINE, rel);
                    result = NIL;
                }

        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * convert a pph-phrase to a template-parser template
     *
     * @param SEMANTICS
     * 		cycl-sentence-p; a CycL sentence with keyword variable that correspond to holes in the phrase
     * @param PHRASE
    pph-phrase
     * 		
     * @param FORCE
     * 		pph-force-p (either :interrogative or :declarative)
     * @return formula
     */
    @LispMethod(comment = "convert a pph-phrase to a template-parser template\r\n\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; a CycL sentence with keyword variable that correspond to holes in the phrase\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@param FORCE\r\n\t\tpph-force-p (either :interrogative or :declarative)\r\n@return formula")
    public static final SubLObject qsl_parse_template_from_pph_phrase_alt(SubLObject base_semantics, SubLObject phrase, SubLObject semantics_with_keywords, SubLObject force) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_pred = (force == $INTERROGATIVE) ? ((SubLObject) ($$queryTemplate)) : $$assertTemplate;
                SubLObject template_category = com.cyc.cycjava.cycl.relation_lexifier.qsl_determine_template_category(force);
                SubLObject template_syntax = NIL;
                SubLObject keywords_in_syntax = NIL;
                SubLObject template_semantics = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject template_syntax_25 = com.cyc.cycjava.cycl.relation_lexifier.qsl_pph_phrase_to_template_syntax(phrase, base_semantics);
                    SubLObject keywords_in_syntax_26 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    template_syntax = template_syntax_25;
                    keywords_in_syntax = keywords_in_syntax_26;
                }
                template_semantics = com.cyc.cycjava.cycl.relation_lexifier.compute_qsl_parse_template_semantics(base_semantics, semantics_with_keywords, keywords_in_syntax);
                return make_ternary_formula(template_pred, template_category, template_syntax, template_semantics);
            }
        }
    }

    @LispMethod(comment = "convert a pph-phrase to a template-parser template\r\n\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; a CycL sentence with keyword variable that correspond to holes in the phrase\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@param FORCE\r\n\t\tpph-force-p (either :interrogative or :declarative)\r\n@return formula")
    public static SubLObject qsl_parse_template_from_pph_phrase(final SubLObject base_semantics, final SubLObject phrase, final SubLObject semantics_with_keywords, final SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_pred = (force == $INTERROGATIVE) ? $$queryTemplate : $$assertTemplate;
        final SubLObject template_category = qsl_determine_template_category(force);
        SubLObject template_syntax = NIL;
        SubLObject keywords_in_syntax = NIL;
        SubLObject template_semantics = NIL;
        thread.resetMultipleValues();
        final SubLObject template_syntax_$23 = qsl_pph_phrase_to_template_syntax(phrase, base_semantics);
        final SubLObject keywords_in_syntax_$24 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        template_syntax = template_syntax_$23;
        keywords_in_syntax = keywords_in_syntax_$24;
        template_semantics = compute_qsl_parse_template_semantics(base_semantics, semantics_with_keywords, keywords_in_syntax);
        return make_ternary_formula(template_pred, template_category, template_syntax, template_semantics);
    }/**
     * convert a pph-phrase to a template-parser template
     *
     * @param SEMANTICS
     * 		cycl-sentence-p; a CycL sentence with keyword variable that correspond to holes in the phrase
     * @param PHRASE
    		pph-phrase
     * 		
     * @param FORCE
     * 		pph-force-p (either :interrogative or :declarative)
     * @return formula
     */


    /**
     * substitute each keyword in KEYWORDS-IN-SYNTAX into a copy of BASE-SEMANTICS
     *
     * @param BASE-SEMANTICS
     * 		cycl-sentence-p; the semantics of the original English sentence
     * @param SEMANTICS-WITH-KEYWORDS
     * 		cycl-sentence-p; BASE-SEMANTICS with keywords inserted everywhere something might be substitutable
     * @param KEYWORDS-IN-SYNTAX
     * 		listp; a list of keywords that are actually substitutable in the parsing-template for BASE-SEMANTICS
     * @return cycl-sentence-p; a copy of BASE-SEMANTICS that has just the keywords in it that are actually substitutable in the parsing
    template
     */
    @LispMethod(comment = "substitute each keyword in KEYWORDS-IN-SYNTAX into a copy of BASE-SEMANTICS\r\n\r\n@param BASE-SEMANTICS\r\n\t\tcycl-sentence-p; the semantics of the original English sentence\r\n@param SEMANTICS-WITH-KEYWORDS\r\n\t\tcycl-sentence-p; BASE-SEMANTICS with keywords inserted everywhere something might be substitutable\r\n@param KEYWORDS-IN-SYNTAX\r\n\t\tlistp; a list of keywords that are actually substitutable in the parsing-template for BASE-SEMANTICS\r\n@return cycl-sentence-p; a copy of BASE-SEMANTICS that has just the keywords in it that are actually substitutable in the parsing\r\ntemplate")
    public static final SubLObject compute_qsl_parse_template_semantics_alt(SubLObject base_semantics, SubLObject semantics_with_keywords, SubLObject keywords_in_syntax) {
        {
            SubLObject result_semantics = copy_list(base_semantics);
            SubLObject cdolist_list_var = keywords_in_syntax;
            SubLObject keyword = NIL;
            for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                {
                    SubLObject position = cycl_utilities.arg_positions_bfs(keyword, semantics_with_keywords, UNPROVIDED).first();
                    SubLObject corresponding_semantics = cycl_utilities.formula_arg_position(base_semantics, position, UNPROVIDED);
                    result_semantics = cycl_utilities.expression_subst(keyword, corresponding_semantics, result_semantics, EQUAL, UNPROVIDED);
                }
            }
            return result_semantics;
        }
    }

    @LispMethod(comment = "substitute each keyword in KEYWORDS-IN-SYNTAX into a copy of BASE-SEMANTICS\r\n\r\n@param BASE-SEMANTICS\r\n\t\tcycl-sentence-p; the semantics of the original English sentence\r\n@param SEMANTICS-WITH-KEYWORDS\r\n\t\tcycl-sentence-p; BASE-SEMANTICS with keywords inserted everywhere something might be substitutable\r\n@param KEYWORDS-IN-SYNTAX\r\n\t\tlistp; a list of keywords that are actually substitutable in the parsing-template for BASE-SEMANTICS\r\n@return cycl-sentence-p; a copy of BASE-SEMANTICS that has just the keywords in it that are actually substitutable in the parsing\r\ntemplate")
    public static SubLObject compute_qsl_parse_template_semantics(final SubLObject base_semantics, final SubLObject semantics_with_keywords, final SubLObject keywords_in_syntax) {
        SubLObject result_semantics = copy_list(base_semantics);
        SubLObject cdolist_list_var = keywords_in_syntax;
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject position = cycl_utilities.arg_positions_bfs(keyword, semantics_with_keywords, UNPROVIDED).first();
            final SubLObject corresponding_semantics = cycl_utilities.formula_arg_position(base_semantics, position, UNPROVIDED);
            result_semantics = cycl_utilities.expression_subst(keyword, corresponding_semantics, result_semantics, EQUAL, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        return result_semantics;
    }/**
     * substitute each keyword in KEYWORDS-IN-SYNTAX into a copy of BASE-SEMANTICS
     *
     * @param BASE-SEMANTICS
     * 		cycl-sentence-p; the semantics of the original English sentence
     * @param SEMANTICS-WITH-KEYWORDS
     * 		cycl-sentence-p; BASE-SEMANTICS with keywords inserted everywhere something might be substitutable
     * @param KEYWORDS-IN-SYNTAX
     * 		listp; a list of keywords that are actually substitutable in the parsing-template for BASE-SEMANTICS
     * @return cycl-sentence-p; a copy of BASE-SEMANTICS that has just the keywords in it that are actually substitutable in the parsing
    template
     */


    public static final SubLObject qsl_determine_template_category_alt(SubLObject force) {
        return force == $INTERROGATIVE ? ((SubLObject) ($$QuestionTemplate)) : $$STemplate;
    }

    public static SubLObject qsl_determine_template_category(final SubLObject force) {
        return force == $INTERROGATIVE ? $$QuestionTemplate : $$STemplate;
    }

    /**
     *
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @param SEMANTICS
     * 		cycl-sentence-p; the CycL sentence that corresponds to PHRASE
     * @unknown listp; the syntactic portion of a parse-template
     * @unknown listp; list of keywords substitutable in the parse template (return0)
     */
    @LispMethod(comment = "@param PHRASE\npph-phrase\r\n\t\t\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; the CycL sentence that corresponds to PHRASE\r\n@unknown listp; the syntactic portion of a parse-template\r\n@unknown listp; list of keywords substitutable in the parse template (return0)")
    public static final SubLObject qsl_pph_phrase_to_template_syntax_alt(SubLObject phrase, SubLObject semantics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject keywords = NIL;
                SubLObject template_syntax = NIL;
                {
                    SubLObject _prev_bind_0 = $qsl_keywords_used$.currentBinding(thread);
                    try {
                        $qsl_keywords_used$.bind(NIL, thread);
                        template_syntax = make_formula($$NLPatternList, com.cyc.cycjava.cycl.relation_lexifier.qsl_pph_phrase_to_template_syntax_int(phrase, semantics), UNPROVIDED);
                        keywords = $qsl_keywords_used$.getDynamicValue(thread);
                    } finally {
                        $qsl_keywords_used$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(template_syntax, keywords);
            }
        }
    }

    /**
     *
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @param SEMANTICS
     * 		cycl-sentence-p; the CycL sentence that corresponds to PHRASE
     * @unknown listp; the syntactic portion of a parse-template
     * @unknown listp; list of keywords substitutable in the parse template (return0)
     */
    @LispMethod(comment = "@param PHRASE\npph-phrase\r\n\t\t\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; the CycL sentence that corresponds to PHRASE\r\n@unknown listp; the syntactic portion of a parse-template\r\n@unknown listp; list of keywords substitutable in the parse template (return0)")
    public static SubLObject qsl_pph_phrase_to_template_syntax(final SubLObject phrase, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keywords = NIL;
        SubLObject template_syntax = NIL;
        final SubLObject _prev_bind_0 = $qsl_keywords_used$.currentBinding(thread);
        try {
            $qsl_keywords_used$.bind(NIL, thread);
            template_syntax = make_formula($$NLPatternList, qsl_pph_phrase_to_template_syntax_int(phrase, semantics), UNPROVIDED);
            keywords = $qsl_keywords_used$.getDynamicValue(thread);
        } finally {
            $qsl_keywords_used$.rebind(_prev_bind_0, thread);
        }
        return values(template_syntax, keywords);
    }

    /**
     * convert a pph-phrase to the syntactic part of a template-parser template
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @param SEMANTICS
     * 		cycl-sentence-p; the CycL sentence that corresponds to PHRASE
     * @return list
     */
    @LispMethod(comment = "convert a pph-phrase to the syntactic part of a template-parser template\r\n\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; the CycL sentence that corresponds to PHRASE\r\n@return list")
    public static final SubLObject qsl_pph_phrase_to_template_syntax_int_alt(SubLObject phrase, SubLObject semantics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((((NIL == com.cyc.cycjava.cycl.relation_lexifier.qsl_trees_availableP()) || (NIL != pph_phrase.pph_phrase_nominalP(phrase))) && ($PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) {
                $qsl_keywords_used$.setDynamicValue(cons(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), $qsl_keywords_used$.getDynamicValue(thread)), thread);
                if (NIL != pph_phrase.pph_phrase_nbarP(phrase)) {
                    return list(make_binary_formula($$NLPattern_Template, $$NBarTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                }
                return list(make_binary_formula($$NLPattern_Template, $$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
            } else {
                if (((((NIL == com.cyc.cycjava.cycl.relation_lexifier.qsl_trees_availableP()) || pph_phrase.pph_phrase_category(phrase, UNPROVIDED).equal($$Determiner)) && ($PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) && numeral_parser.string_to_interval(pph_phrase.pph_phrase_string(phrase, UNPROVIDED)).isNumber()) {
                    $qsl_keywords_used$.setDynamicValue(cons(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), $qsl_keywords_used$.getDynamicValue(thread)), thread);
                    return list(make_binary_formula($$NLPattern_Template, $$NumberTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                } else {
                    if ((NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) && ((NIL == pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)) || $PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
                        {
                            SubLObject result = NIL;
                            SubLObject num = ZERO_INTEGER;
                            SubLObject vector_var = document.sign_constituents(phrase);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject daughter = aref(vector_var, element_num);
                                    result = cconcatenate(result, com.cyc.cycjava.cycl.relation_lexifier.qsl_pph_phrase_to_template_syntax_int(daughter, semantics));
                                    num = add(num, ONE_INTEGER);
                                }
                            }
                            if (NIL != result) {
                                return result;
                            }
                            {
                                SubLObject cdolist_list_var = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED);
                                SubLObject word = NIL;
                                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                    result = cons(make_unary_formula($$NLPattern_Exact, word), result);
                                }
                            }
                            return nreverse(result);
                        }
                    } else {
                        if (NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
                            return list(make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), $$Verb));
                        } else {
                            if (NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) {
                                return list(make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), pph_phrase.pph_phrase_category(phrase, UNPROVIDED)));
                            } else {
                                if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                    {
                                        SubLObject result = NIL;
                                        SubLObject dtr_num = ZERO_INTEGER;
                                        SubLObject vector_var = document.sign_constituents(phrase);
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject dtr = aref(vector_var, element_num);
                                                result = cconcatenate(result, com.cyc.cycjava.cycl.relation_lexifier.qsl_pph_phrase_to_template_syntax_int(dtr, semantics));
                                                dtr_num = add(dtr_num, ONE_INTEGER);
                                            }
                                        }
                                        return result;
                                    }
                                } else {
                                    if (NIL != pph_phrase.pph_phrase_string(phrase, UNPROVIDED)) {
                                        {
                                            SubLObject ret_value = NIL;
                                            SubLObject cdolist_list_var = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED);
                                            SubLObject word = NIL;
                                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                                ret_value = cons(make_unary_formula($$NLPattern_Exact, word), ret_value);
                                            }
                                            return nreverse(ret_value);
                                        }
                                    } else {
                                        if ((pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword() && (!$PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL != pph_phrase.pph_phrase_nominalP(phrase))) {
                                            {
                                                SubLObject template_category = $$NPTemplate;
                                                if (NIL != pph_phrase.pph_phrase_agr(phrase)) {
                                                    {
                                                        SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                                                        SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                                                        SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                                                        if (pcase_var.eql($POS_PRED)) {
                                                            template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                                                        } else {
                                                            if (pcase_var.eql($NL_PREDS)) {
                                                                template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (NIL != indexed_term_p(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
                                                        template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                                                    }
                                                }
                                                return list(make_binary_formula($$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                                            }
                                        } else {
                                            Errors.warn($str_alt82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
                                            return NIL;
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

    @LispMethod(comment = "convert a pph-phrase to the syntactic part of a template-parser template\r\n\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@param SEMANTICS\r\n\t\tcycl-sentence-p; the CycL sentence that corresponds to PHRASE\r\n@return list")
    public static SubLObject qsl_pph_phrase_to_template_syntax_int(final SubLObject phrase, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL == qsl_trees_availableP()) || (NIL != pph_phrase.pph_phrase_nominalP(phrase))) && ($PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) {
            $qsl_keywords_used$.setDynamicValue(cons(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), $qsl_keywords_used$.getDynamicValue(thread)), thread);
            if (NIL != pph_phrase.pph_phrase_nbarP(phrase)) {
                return list(make_binary_formula($$NLPattern_Template, $$NBarTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
            }
            return list(make_binary_formula($$NLPattern_Template, $$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
        } else {
            if (((((NIL == qsl_trees_availableP()) || pph_phrase.pph_phrase_category(phrase, UNPROVIDED).equal($$Determiner)) && ($PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) && pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword()) && numeral_parser.string_to_interval(pph_phrase.pph_phrase_string(phrase, UNPROVIDED)).isNumber()) {
                $qsl_keywords_used$.setDynamicValue(cons(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), $qsl_keywords_used$.getDynamicValue(thread)), thread);
                return list(make_binary_formula($$NLPattern_Template, $$NumberTemplate, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
            }
            if ((NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) && ((NIL == pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)) || $PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
                SubLObject result = NIL;
                SubLObject num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject daughter;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        daughter = aref(vector_var, element_num);
                        result = cconcatenate(result, qsl_pph_phrase_to_template_syntax_int(daughter, semantics));
                        num = add(num, ONE_INTEGER);
                    }
                }
                if (NIL != result) {
                    return result;
                }
                SubLObject cdolist_list_var = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED);
                SubLObject word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result = cons(make_unary_formula($$NLPattern_Exact, word), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                return nreverse(result);
            } else {
                if (NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
                    return list(make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), $$Verb));
                }
                if (NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) {
                    return list(make_binary_formula($$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), pph_phrase.pph_phrase_category(phrase, UNPROVIDED)));
                }
                if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    SubLObject result = NIL;
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
                            result = cconcatenate(result, qsl_pph_phrase_to_template_syntax_int(dtr, semantics));
                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                    return result;
                }
                if (NIL != pph_phrase.pph_phrase_string(phrase, UNPROVIDED)) {
                    SubLObject ret_value = NIL;
                    SubLObject cdolist_list_var2 = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED);
                    SubLObject word2 = NIL;
                    word2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        ret_value = cons(make_unary_formula($$NLPattern_Exact, word2), ret_value);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        word2 = cdolist_list_var2.first();
                    } 
                    return nreverse(ret_value);
                }
                if ((pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isKeyword() && (!$PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) && (NIL != pph_phrase.pph_phrase_nominalP(phrase))) {
                    SubLObject template_category = $$NPTemplate;
                    if (NIL != pph_phrase.pph_phrase_agr(phrase)) {
                        final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                        final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                        final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                        if (pcase_var.eql($POS_PRED)) {
                            template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                        } else
                            if (pcase_var.eql($NL_PREDS)) {
                                template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                            }

                    } else
                        if (NIL != indexed_term_p(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
                            template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, UNPROVIDED));
                        }

                    return list(make_binary_formula($$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                }
                Errors.warn($str82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
                return NIL;
            }
        }
    }/**
     * convert a pph-phrase to the syntactic part of a template-parser template
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @param SEMANTICS
     * 		cycl-sentence-p; the CycL sentence that corresponds to PHRASE
     * @return list
     */


    public static final SubLObject qsl_trees_availableP_alt() {
        return parser.charniak_parser_availableP(UNPROVIDED);
    }

    public static SubLObject qsl_trees_availableP() {
        return parser.charniak_parser_availableP(UNPROVIDED);
    }

    public static final SubLObject print_words_from_rel_phrases_alt(SubLObject rel_phrases) {
        {
            SubLObject cdolist_list_var = rel_phrases;
            SubLObject rel_phrase = NIL;
            for (rel_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_phrase = cdolist_list_var.first()) {
                princ(pph_phrase_resolution.pph_phrase_get_string(com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_pph_phrase(rel_phrase), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                princ($str_alt97$_, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject print_words_from_rel_phrases(final SubLObject rel_phrases) {
        SubLObject cdolist_list_var = rel_phrases;
        SubLObject rel_phrase = NIL;
        rel_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ(pph_phrase_resolution.pph_phrase_get_string(rel_phrase_pph_phrase(rel_phrase), UNPROVIDED, UNPROVIDED), UNPROVIDED);
            princ($$$_, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rel_phrase = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject attach_less_principled_information_alt(SubLObject dtr) {
        return dtr;
    }

    public static SubLObject attach_less_principled_information(final SubLObject dtr) {
        return dtr;
    }

    public static final SubLObject new_rel_phrase_alt(SubLObject start, SubLObject end, SubLObject v_pph_phrase, SubLObject tokenized_original) {
        return list(start, end, v_pph_phrase, tokenized_original);
    }

    public static SubLObject new_rel_phrase(final SubLObject start, final SubLObject end, final SubLObject v_pph_phrase, final SubLObject tokenized_original) {
        return list(start, end, v_pph_phrase, tokenized_original);
    }

    public static final SubLObject rel_phrase_end_alt(SubLObject phrase) {
        return second(phrase);
    }

    public static SubLObject rel_phrase_end(final SubLObject phrase) {
        return second(phrase);
    }

    public static final SubLObject rel_phrase_start_alt(SubLObject phrase) {
        return phrase.first();
    }

    public static SubLObject rel_phrase_start(final SubLObject phrase) {
        return phrase.first();
    }

    public static final SubLObject rel_phrase_pph_phrase_alt(SubLObject phrase) {
        return third(phrase);
    }

    public static SubLObject rel_phrase_pph_phrase(final SubLObject phrase) {
        return third(phrase);
    }

    public static final SubLObject rel_phrase_original_alt(SubLObject phrase) {
        return fourth(phrase);
    }

    public static SubLObject rel_phrase_original(final SubLObject phrase) {
        return fourth(phrase);
    }

    public static final SubLObject rel_phrase_words_alt(SubLObject phrase) {
        return subseq(com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_original(phrase), com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_start(phrase), com.cyc.cycjava.cycl.relation_lexifier.rel_phrase_end(phrase));
    }

    public static SubLObject rel_phrase_words(final SubLObject phrase) {
        return subseq(rel_phrase_original(phrase), rel_phrase_start(phrase), rel_phrase_end(phrase));
    }

    /**
     * Given a list of speech parts, return a list containing just those speech-parts
     * that are related to template-parser template-categories.  For example, since both
     * #$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their
     * common genl #$Noun, it is sufficient to return #$Noun instead of the other two.
     *
     * @param SPEECH-PARTS
     * 		list; a list of speech-parts
     * @return list; a list of speech-parts
     */
    @LispMethod(comment = "Given a list of speech parts, return a list containing just those speech-parts\r\nthat are related to template-parser template-categories.  For example, since both\r\n#$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their\r\ncommon genl #$Noun, it is sufficient to return #$Noun instead of the other two.\r\n\r\n@param SPEECH-PARTS\r\n\t\tlist; a list of speech-parts\r\n@return list; a list of speech-parts\nGiven a list of speech parts, return a list containing just those speech-parts\nthat are related to template-parser template-categories.  For example, since both\n#$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their\ncommon genl #$Noun, it is sufficient to return #$Noun instead of the other two.")
    public static final SubLObject get_rtp_useful_speech_parts_alt(SubLObject speech_parts) {
        com.cyc.cycjava.cycl.relation_lexifier.ensure_pos_template_mappings_initialized();
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = speech_parts;
            SubLObject speech_part = NIL;
            for (speech_part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , speech_part = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_27 = $pos_template_mappings$.getGlobalValue();
                    SubLObject map = NIL;
                    for (map = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , map = cdolist_list_var_27.first()) {
                        if (NIL != genls.genl_in_any_mtP(speech_part, map.first())) {
                            result = cons(map.first(), result);
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Given a list of speech parts, return a list containing just those speech-parts\r\nthat are related to template-parser template-categories.  For example, since both\r\n#$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their\r\ncommon genl #$Noun, it is sufficient to return #$Noun instead of the other two.\r\n\r\n@param SPEECH-PARTS\r\n\t\tlist; a list of speech-parts\r\n@return list; a list of speech-parts\nGiven a list of speech parts, return a list containing just those speech-parts\nthat are related to template-parser template-categories.  For example, since both\n#$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their\ncommon genl #$Noun, it is sufficient to return #$Noun instead of the other two.")
    public static SubLObject get_rtp_useful_speech_parts(final SubLObject speech_parts) {
        ensure_pos_template_mappings_initialized();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = speech_parts;
        SubLObject speech_part = NIL;
        speech_part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$25 = $pos_template_mappings$.getGlobalValue();
            SubLObject map = NIL;
            map = cdolist_list_var_$25.first();
            while (NIL != cdolist_list_var_$25) {
                if (NIL != genls.genl_in_any_mtP(speech_part, map.first())) {
                    result = cons(map.first(), result);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                map = cdolist_list_var_$25.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            speech_part = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Given a list of speech parts, return a list containing just those speech-parts
     * that are related to template-parser template-categories.  For example, since both
     * #$CountNoun and #$MassNoun are related to #$NPTemplateCategory through their
     * common genl #$Noun, it is sufficient to return #$Noun instead of the other two.
     *
     * @param SPEECH-PARTS
     * 		list; a list of speech-parts
     * @return list; a list of speech-parts
     */


    public static final SubLObject ensure_pos_template_mappings_initialized_alt() {
        if (NIL == $pos_template_mappings$.getGlobalValue()) {
            com.cyc.cycjava.cycl.relation_lexifier.initialize_pos_template_mappings();
        }
        return $pos_template_mappings$.getGlobalValue();
    }

    public static SubLObject ensure_pos_template_mappings_initialized() {
        if (NIL == $pos_template_mappings$.getGlobalValue()) {
            initialize_pos_template_mappings();
        }
        return $pos_template_mappings$.getGlobalValue();
    }

    public static final SubLObject initialize_pos_template_mappings_alt() {
        $pos_template_mappings$.setGlobalValue(NIL);
        {
            SubLObject assertion_list = kb_mapping.gather_predicate_extent_index($$posForTemplateCategory, $$TemplateParsingMt, UNPROVIDED);
            SubLObject cdolist_list_var = assertion_list;
            SubLObject v_assert = NIL;
            for (v_assert = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_assert = cdolist_list_var.first()) {
                $pos_template_mappings$.setGlobalValue(cons(list(cycl_utilities.formula_arg1(assertions_high.assertion_formula(v_assert), UNPROVIDED), cycl_utilities.formula_arg2(assertions_high.assertion_formula(v_assert), UNPROVIDED)), $pos_template_mappings$.getGlobalValue()));
            }
        }
        return $pos_template_mappings$.getGlobalValue();
    }

    public static SubLObject initialize_pos_template_mappings() {
        $pos_template_mappings$.setGlobalValue(NIL);
        SubLObject cdolist_list_var;
        final SubLObject assertion_list = cdolist_list_var = kb_mapping.gather_predicate_extent_index($$posForTemplateCategory, $$TemplateParsingMt, UNPROVIDED);
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $pos_template_mappings$.setGlobalValue(cons(list(cycl_utilities.formula_arg1(assertions_high.assertion_formula(v_assert), UNPROVIDED), cycl_utilities.formula_arg2(assertions_high.assertion_formula(v_assert), UNPROVIDED)), $pos_template_mappings$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        } 
        return $pos_template_mappings$.getGlobalValue();
    }

    public static SubLObject declare_relation_lexifier_file() {
        declareFunction("gen_format_assertion_to_gen_template", "GEN-FORMAT-ASSERTION-TO-GEN-TEMPLATE", 1, 0, false);
        declareFunction("handlable_arg_order_sublist_elementP", "HANDLABLE-ARG-ORDER-SUBLIST-ELEMENT?", 1, 0, false);
        declareFunction("massage_lexification_tokenization", "MASSAGE-LEXIFICATION-TOKENIZATION", 1, 0, false);
        declareFunction("lexify_relation", "LEXIFY-RELATION", 3, 3, false);
        declareFunction("phrasal_cat_for_pos", "PHRASAL-CAT-FOR-POS", 1, 0, false);
        declareFunction("lexifier_pph_phrase", "LEXIFIER-PPH-PHRASE", 3, 2, false);
        declareFunction("lexifier_np", "LEXIFIER-NP", 4, 0, false);
        declareFunction("lexifier_det_phrase", "LEXIFIER-DET-PHRASE", 1, 0, false);
        declareFunction("lexifier_indefinite_determiner_p", "LEXIFIER-INDEFINITE-DETERMINER-P", 1, 0, false);
        declareFunction("push_phrase", "PUSH-PHRASE", 4, 0, false);
        declareFunction("open_quote_string_p", "OPEN-QUOTE-STRING-P", 1, 0, false);
        declareFunction("open_quote_p", "OPEN-QUOTE-P", 1, 0, false);
        declareFunction("close_quote_string_p", "CLOSE-QUOTE-STRING-P", 1, 0, false);
        declareFunction("close_quote_p", "CLOSE-QUOTE-P", 1, 0, false);
        declareFunction("rel_lex_guess_more_info", "REL-LEX-GUESS-MORE-INFO", 1, 0, false);
        declareFunction("guess_more_info_for_dtr", "GUESS-MORE-INFO-FOR-DTR", 5, 0, false);
        declareFunction("maybe_make_head_verb", "MAYBE-MAKE-HEAD-VERB", 3, 0, false);
        declareFunction("make_np_dtr", "MAKE-NP-DTR", 1, 0, false);
        declareFunction("remove_number_agreement", "REMOVE-NUMBER-AGREEMENT", 1, 0, false);
        declareFunction("generalize_speech_part_preds", "GENERALIZE-SPEECH-PART-PREDS", 1, 0, false);
        declareFunction("clear_generalize_speech_part_pred", "CLEAR-GENERALIZE-SPEECH-PART-PRED", 0, 0, false);
        declareFunction("remove_generalize_speech_part_pred", "REMOVE-GENERALIZE-SPEECH-PART-PRED", 1, 0, false);
        declareFunction("generalize_speech_part_pred_internal", "GENERALIZE-SPEECH-PART-PRED-INTERNAL", 1, 0, false);
        declareFunction("generalize_speech_part_pred", "GENERALIZE-SPEECH-PART-PRED", 1, 0, false);
        declareFunction("generalize_speech_part_pred_int", "GENERALIZE-SPEECH-PART-PRED-INT", 2, 0, false);
        declareFunction("general_speech_part_predP", "GENERAL-SPEECH-PART-PRED?", 1, 0, false);
        declareFunction("tensed_verb_lacking_agreement_infoP", "TENSED-VERB-LACKING-AGREEMENT-INFO?", 1, 0, false);
        declareFunction("rel_lex_revert_generic_arg_phrases", "REL-LEX-REVERT-GENERIC-ARG-PHRASES", 1, 0, false);
        declareFunction("rel_lex_merge_strings", "REL-LEX-MERGE-STRINGS", 1, 0, false);
        declareFunction("add_bare_string_dtrs", "ADD-BARE-STRING-DTRS", 2, 0, false);
        declareFunction("build_pph_np_from_np_parse", "BUILD-PPH-NP-FROM-NP-PARSE", 2, 0, false);
        declareFunction("parse_template_from_pph_phrase", "PARSE-TEMPLATE-FROM-PPH-PHRASE", 2, 0, false);
        declareFunction("template_sem_from_template_syntax", "TEMPLATE-SEM-FROM-TEMPLATE-SYNTAX", 2, 0, false);
        declareFunction("pph_phrase_to_template_syntax", "PPH-PHRASE-TO-TEMPLATE-SYNTAX", 2, 0, false);
        declareFunction("determine_template_pred", "DETERMINE-TEMPLATE-PRED", 2, 0, false);
        declareFunction("determine_template_category", "DETERMINE-TEMPLATE-CATEGORY", 2, 0, false);
        declareFunction("qsl_parse_template_from_pph_phrase", "QSL-PARSE-TEMPLATE-FROM-PPH-PHRASE", 4, 0, false);
        declareFunction("compute_qsl_parse_template_semantics", "COMPUTE-QSL-PARSE-TEMPLATE-SEMANTICS", 3, 0, false);
        declareFunction("qsl_determine_template_category", "QSL-DETERMINE-TEMPLATE-CATEGORY", 1, 0, false);
        declareFunction("qsl_pph_phrase_to_template_syntax", "QSL-PPH-PHRASE-TO-TEMPLATE-SYNTAX", 2, 0, false);
        declareFunction("qsl_pph_phrase_to_template_syntax_int", "QSL-PPH-PHRASE-TO-TEMPLATE-SYNTAX-INT", 2, 0, false);
        declareFunction("qsl_trees_availableP", "QSL-TREES-AVAILABLE?", 0, 0, false);
        declareFunction("print_words_from_rel_phrases", "PRINT-WORDS-FROM-REL-PHRASES", 1, 0, false);
        declareFunction("attach_less_principled_information", "ATTACH-LESS-PRINCIPLED-INFORMATION", 1, 0, false);
        declareFunction("new_rel_phrase", "NEW-REL-PHRASE", 4, 0, false);
        declareFunction("rel_phrase_end", "REL-PHRASE-END", 1, 0, false);
        declareFunction("rel_phrase_start", "REL-PHRASE-START", 1, 0, false);
        declareFunction("rel_phrase_pph_phrase", "REL-PHRASE-PPH-PHRASE", 1, 0, false);
        declareFunction("rel_phrase_original", "REL-PHRASE-ORIGINAL", 1, 0, false);
        declareFunction("rel_phrase_words", "REL-PHRASE-WORDS", 1, 0, false);
        declareFunction("get_rtp_useful_speech_parts", "GET-RTP-USEFUL-SPEECH-PARTS", 1, 0, false);
        declareFunction("ensure_pos_template_mappings_initialized", "ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED", 0, 0, false);
        declareFunction("initialize_pos_template_mappings", "INITIALIZE-POS-TEMPLATE-MAPPINGS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_relation_lexifier_file_alt() {
        deflexical("*POS-TEMPLATE-MAPPINGS*", NIL != boundp($pos_template_mappings$) ? ((SubLObject) ($pos_template_mappings$.getGlobalValue())) : NIL);
        deflexical("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*", NIL);
        defparameter("*QSL-KEYWORDS-USED*", NIL);
        return NIL;
    }

    public static SubLObject init_relation_lexifier_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*POS-TEMPLATE-MAPPINGS*", SubLTrampolineFile.maybeDefault($pos_template_mappings$, $pos_template_mappings$, NIL));
            deflexical("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*", NIL);
            defparameter("*QSL-KEYWORDS-USED*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*POS-TEMPLATE-MAPPINGS*", NIL != boundp($pos_template_mappings$) ? ((SubLObject) ($pos_template_mappings$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_relation_lexifier_file_Previous() {
        deflexical("*POS-TEMPLATE-MAPPINGS*", SubLTrampolineFile.maybeDefault($pos_template_mappings$, $pos_template_mappings$, NIL));
        deflexical("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*", NIL);
        defparameter("*QSL-KEYWORDS-USED*", NIL);
        return NIL;
    }

    public static SubLObject setup_relation_lexifier_file() {
        declare_defglobal($pos_template_mappings$);
        memoization_state.note_globally_cached_function(GENERALIZE_SPEECH_PART_PRED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_relation_lexifier_file();
    }

    @Override
    public void initializeVariables() {
        init_relation_lexifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_relation_lexifier_file();
    }

    

    static private final SubLString $str_alt1$__ = makeString("''");

    static private final SubLString $str_alt2$_ = makeString("'");

    static private final SubLString $str_alt3$__ = makeString("``");

    static private final SubLString $str_alt4$_a = makeString("~a");

    static private final SubLString $str_alt5$_ = makeString("`");

    static private final SubLString $str_alt10$Can_t_handle__S_in__S = makeString("Can't handle ~S in ~S");

    static private final SubLString $str_alt11$_S_references_arg_S____which_is_g = makeString("~S references arg~S,~% which is greater than the min-arity of ~S");

    static private final SubLString $str_alt12$Multiple_slots_for_arg_S_in____S = makeString("Multiple slots for arg~S in~% ~S");

    static private final SubLString $str_alt13$Failed_to_exhaust_arg_order_list_ = makeString("Failed to exhaust arg-order list for ~S.~% Remainder: ~S~%");

    static private final SubLString $str_alt14$Couldn_t_find_twiddle_for_ARG_S_i = makeString("Couldn't find twiddle for ARG~S in ~S");

    static private final SubLString $str_alt15$_S_must_be_the_same_length_as__S = makeString("~S must be the same length as ~S");

    static private final SubLList $list_alt19 = list(makeSymbol("START"), makeSymbol("END"));

    static private final SubLList $list_alt26 = list(makeKeyword("CAT"));

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    static private final SubLString $str_alt36$Can_t_determine_definiteness_of__ = makeString("Can't determine definiteness of ~S");

    static private final SubLString $str_alt45$guess_more_info_not_doing_anythin = makeString("guess-more-info not doing anything with ~s~%");

    public static final SubLSymbol $kw50$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt60$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt65$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt66$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt67$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt82$unusable_phrase_sent_to_PPH_PHRAS = makeString("unusable phrase sent to PPH-PHRASE-TO-TEMPLATE-SYNTAX: ~%~S~%");

    static private final SubLString $str_alt89$Sent_non_relation__S_to_DETERMINE = makeString("Sent non-relation ~S to DETERMINE-TEMPLATE-CATEGORY");

    static private final SubLString $str_alt97$_ = makeString(" ");
}

/**
 * Total time: 659 ms synthetic
 */
