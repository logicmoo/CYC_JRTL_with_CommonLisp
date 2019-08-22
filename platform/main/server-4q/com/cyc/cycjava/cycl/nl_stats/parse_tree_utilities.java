package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parse_tree_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new parse_tree_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities";

    public static final String myFingerPrint = "990bbcc4faf1827edd531dd6a1754f0acbc5cff82fea5e75706b4188c46435e0";



    // defparameter
    private static final SubLSymbol $parse_tree_utilities_parser_constructor$ = makeSymbol("*PARSE-TREE-UTILITIES-PARSER-CONSTRUCTOR*");

    // defparameter
    private static final SubLSymbol $tolerate_phraseless_charniak_heads$ = makeSymbol("*TOLERATE-PHRASELESS-CHARNIAK-HEADS*");

    // Internal Constants
    public static final SubLSymbol NEW_CHARNIAK_PARSER = makeSymbol("NEW-CHARNIAK-PARSER");

    public static final SubLList $list1 = list(makeSymbol("PARSER"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $parse_tree_utilities_use_this_parser$ = makeSymbol("*PARSE-TREE-UTILITIES-USE-THIS-PARSER*");



    public static final SubLList $list5 = list(makeKeyword("NEW"));

    public static final SubLList $list6 = list(makeSymbol("NEW-PARSE-TREE-UTILITIES-PARSER"));

    public static final SubLList $list7 = list(list(makeSymbol("*TOLERATE-PHRASELESS-CHARNIAK-HEADS*"), T));













    public static final SubLString $$$of = makeString("of");





    public static final SubLString $str17$_A__A = makeString("~A_~A");



    public static final SubLString $str19$ = makeString("");









    public static final SubLSymbol COORDINATE_WORD_TREE_P = makeSymbol("COORDINATE-WORD-TREE-P");





    public static final SubLSymbol DETERMINER_WORD_TREE_P = makeSymbol("DETERMINER-WORD-TREE-P");

    public static final SubLSymbol CARDINAL_WORD_TREE_P = makeSymbol("CARDINAL-WORD-TREE-P");

    public static final SubLList $list29 = list(makeSymbol("THE-STRINGS"), makeSymbol("THE-HEAD"));



    public static final SubLSymbol FIND_ALL = makeSymbol("FIND-ALL");

    public static final SubLSymbol NP_TREE_P = makeSymbol("NP-TREE-P");





    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));







    public static final SubLString $str39$extract_verbal_match_from_source_ = makeString("extract-verbal-match-from-source-int returned ~S");

    public static final SubLString $str40$don_t_know_what_to_do_with__S__sk = makeString("don't know what to do with ~S, skipping");

    public static final SubLSymbol CHARNIAK_PARSER_P = makeSymbol("CHARNIAK-PARSER-P");

    public static final SubLString $str42$_S_is_neither_a_STRINGP_nor_a_PAR = makeString("~S is neither a STRINGP nor a PARSE-TREE-P.");

    public static final SubLString $str43$Role__S_not_understood = makeString("Role ~S not understood");

    public static final SubLSymbol VP_TREE_P = makeSymbol("VP-TREE-P");

    public static final SubLSymbol DUMMY_TO_P = makeSymbol("DUMMY-TO-P");

















    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));



    public static final SubLList $list56 = list(makeSymbol("THE-HEAD"), makeSymbol("ALL-STRINGS"), makeSymbol("THE-DET"));

    public static final SubLSymbol PRT_TREE_P = makeSymbol("PRT-TREE-P");

    public static final SubLString $str58$_A_A_VB = makeString("~A~A_VB");



    public static final SubLString $str60$__A = makeString("_~A");

    public static final SubLList $list61 = list(makeSymbol("THE-STRING"), makeSymbol("THE-CAT"));

    public static final SubLString $$$P = makeString("P");

    public static final SubLString $str63$_A_NP = makeString("~A_NP");

    public static final SubLString $str64$_A_NN = makeString("~A_NN");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLList $list67 = list(makeKeyword("NP"), makeKeyword("VP"));





    public static final SubLString $str70$_S_is_not_one_of__S = makeString("~S is not one of ~S");



    public static SubLObject new_parse_tree_utilities_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return funcall($parse_tree_utilities_parser_constructor$.getDynamicValue(thread));
    }

    public static SubLObject get_parse_tree_utilities_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $parse_tree_utilities_use_this_parser$.getDynamicValue(thread) ? $parse_tree_utilities_use_this_parser$.getDynamicValue(thread) : new_parse_tree_utilities_parser();
    }

    public static SubLObject with_parse_tree_utilities_parser(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_parser = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        v_parser = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($parse_tree_utilities_use_this_parser$, list(FIF, listS(EQL, v_parser, $list5), $list6, v_parser))), append(body, NIL));
    }

    public static SubLObject while_tolerating_phraseless_heads(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list7, append(body, NIL));
    }

    public static SubLObject get_complex_noun_from_phrase_tree(final SubLObject the_tree, SubLObject skip_downcaseP) {
        if (skip_downcaseP == UNPROVIDED) {
            skip_downcaseP = NIL;
        }
        assert NIL != parse_tree.nominal_phrase_tree_p(the_tree) : "parse_tree.nominal_phrase_tree_p(the_tree) " + "CommonSymbols.NIL != parse_tree.nominal_phrase_tree_p(the_tree) " + the_tree;
        final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, GET_HEAD);
        if (NIL == the_head) {
            return NIL;
        }
        final SubLObject possible_pp = methods.funcall_instance_method_with_1_args(the_tree, GET_DAUGHTER, number_utilities.f_1_(methods.funcall_instance_method_with_0_args(the_tree, DAUGHTER_COUNT)));
        final SubLObject pp_head = (NIL != parse_tree.prepositional_phrase_tree_p(possible_pp)) ? methods.funcall_instance_method_with_0_args(possible_pp, GET_HEAD) : NIL;
        SubLObject the_compound = list(methods.funcall_instance_method_with_0_args(the_head, GET_STRING));
        SubLObject lefty;
        for (lefty = NIL, lefty = methods.funcall_instance_method_with_1_args(the_head, GET_SISTER, MINUS_ONE_INTEGER); (NIL != lefty) && ((NIL != word_tree.adjectival_word_tree_p(lefty)) || (NIL != word_tree.nominal_word_tree_p(lefty))); lefty = methods.funcall_instance_method_with_1_args(lefty, GET_SISTER, MINUS_ONE_INTEGER)) {
            if ((NIL != word_tree.adjectival_word_tree_p(lefty)) || (NIL != word_tree.nominal_word_tree_p(lefty))) {
                the_compound = cons(methods.funcall_instance_method_with_0_args(lefty, GET_STRING), the_compound);
            }
        }
        if ((NIL != pp_head) && (NIL != Strings.string_equal(methods.funcall_instance_method_with_0_args(pp_head, GET_STRING), $$$of, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            the_compound = append(the_compound, list(methods.funcall_instance_method_with_0_args(possible_pp, GET_STRING)));
        }
        if (length(the_compound).numL(TWO_INTEGER)) {
            return NIL;
        }
        if (NIL != skip_downcaseP) {
            return the_compound;
        }
        if (NIL != word_tree.name_word_tree_p(the_head)) {
            return the_compound;
        }
        return Mapping.mapcar(symbol_function(STRING_DOWNCASE), the_compound);
    }

    public static SubLObject combine_head_string_and_category(final SubLObject the_tree, SubLObject normalizeP) {
        if (normalizeP == UNPROVIDED) {
            normalizeP = NIL;
        }
        if (NIL != parse_tree.phrase_tree_p(the_tree)) {
            final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, GET_HEAD);
            return NIL != the_head ? combine_head_string_and_category(the_head, normalizeP) : NIL;
        }
        assert NIL != word_tree.word_tree_p(the_tree) : "word_tree.word_tree_p(the_tree) " + "CommonSymbols.NIL != word_tree.word_tree_p(the_tree) " + the_tree;
        return format(NIL, $str17$_A__A, NIL != normalizeP ? get_normalized_head_string(the_tree) : methods.funcall_instance_method_with_0_args(the_tree, GET_STRING), methods.funcall_instance_method_with_0_args(the_tree, GET_CATEGORY));
    }

    public static SubLObject get_normalized_head_string(final SubLObject the_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == the_tree) {
            return NIL;
        }
        final SubLObject head_element = methods.funcall_instance_method_with_0_args(the_tree, GET_HEAD);
        if (NIL == head_element) {
            return $str19$;
        }
        if (NIL != word_tree.nominal_word_tree_p(head_element)) {
            if (NIL == word_tree.name_word_tree_p(head_element)) {
                return lexification_utilities.singularize_word(methods.funcall_instance_method_with_0_args(head_element, GET_STRING), UNPROVIDED);
            }
            final SubLObject pcase_var = methods.funcall_instance_method_with_0_args(head_element, GET_CATEGORY);
            if (pcase_var.eql($NPS) || pcase_var.eql($NNPS)) {
                SubLObject word = NIL;
                final SubLObject _prev_bind_0 = morphology.$preserve_case_in_singular_regP$.currentBinding(thread);
                try {
                    morphology.$preserve_case_in_singular_regP$.bind(T, thread);
                    word = lexification_utilities.singularize_word(methods.funcall_instance_method_with_0_args(head_element, GET_STRING), UNPROVIDED);
                } finally {
                    morphology.$preserve_case_in_singular_regP$.rebind(_prev_bind_0, thread);
                }
                return word;
            }
            return methods.funcall_instance_method_with_0_args(head_element, GET_STRING);
        } else {
            if (NIL != parse_tree.nominal_phrase_tree_p(the_tree)) {
                return get_normalized_head_string(head_element);
            }
            if (NIL != word_tree.verbal_word_tree_p(head_element)) {
                return morphology.get_root(methods.funcall_instance_method_with_0_args(head_element, GET_STRING), UNPROVIDED);
            }
            if (NIL != parse_tree.verbal_phrase_tree_p(the_tree)) {
                return get_normalized_head_string(head_element);
            }
            return methods.funcall_instance_method_with_0_args(head_element, GET_STRING);
        }
    }

    public static SubLObject get_head_string_if_any(final SubLObject the_tree, SubLObject normalizeP) {
        if (normalizeP == UNPROVIDED) {
            normalizeP = NIL;
        }
        final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, GET_HEAD);
        if (NIL == the_head) {
            return $str19$;
        }
        if (NIL != normalizeP) {
            return get_normalized_head_string(the_head);
        }
        return methods.funcall_instance_method_with_0_args(the_head, GET_STRING);
    }

    public static SubLObject get_nominal_head_strings(final SubLObject the_nominal, SubLObject with_posP, SubLObject normalizeP) {
        if (with_posP == UNPROVIDED) {
            with_posP = NIL;
        }
        if (normalizeP == UNPROVIDED) {
            normalizeP = with_posP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $tolerate_phraseless_charniak_heads$.getDynamicValue(thread)) && (NIL != word_tree.nominal_word_tree_p(the_nominal))) {
            return values(list(list(NIL != with_posP ? combine_head_string_and_category(the_nominal, normalizeP) : get_head_string_if_any(the_nominal, normalizeP), methods.funcall_instance_method_with_0_args(the_nominal, GET_STRING), $str19$)), $PHRASELESS);
        }
        assert NIL != parse_tree.nominal_phrase_tree_p(the_nominal) : "parse_tree.nominal_phrase_tree_p(the_nominal) " + "CommonSymbols.NIL != parse_tree.nominal_phrase_tree_p(the_nominal) " + the_nominal;
        final SubLObject det_string = get_nominal_tree_determiner_string(the_nominal);
        if (NIL != methods.funcall_instance_method_with_1_args(the_nominal, FIND_LAST, COORDINATE_WORD_TREE_P)) {
            SubLObject the_results = NIL;
            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(the_nominal);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject this_daughter;
            SubLObject this_det_string;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                this_daughter = aref(vector_var, element_num);
                if (NIL != word_tree.nominal_word_tree_p(this_daughter)) {
                    the_results = cons(list(NIL != with_posP ? combine_head_string_and_category(this_daughter, normalizeP) : get_head_string_if_any(this_daughter, normalizeP), methods.funcall_instance_method_with_0_args(this_daughter, GET_STRING), det_string), the_results);
                } else
                    if (NIL != parse_tree.nominal_phrase_tree_p(this_daughter)) {
                        this_det_string = (NIL != string_utilities.empty_string_p(det_string)) ? NIL != get_nominal_tree_determiner_string(this_daughter) ? get_nominal_tree_determiner_string(this_daughter) : $str19$ : det_string;
                        the_results = cons(list(NIL != with_posP ? combine_head_string_and_category(this_daughter, normalizeP) : get_head_string_if_any(this_daughter, normalizeP), get_longest_nominal_string(this_daughter), this_det_string), the_results);
                    }

            }
            return values(reverse(the_results), NIL);
        }
        final SubLObject complex_string = get_longest_nominal_string(the_nominal);
        final SubLObject head_string = (NIL != with_posP) ? combine_head_string_and_category(the_nominal, normalizeP) : get_head_string_if_any(the_nominal, normalizeP);
        return values(list(list(head_string, complex_string, det_string)), NIL);
    }

    public static SubLObject get_nominal_tree_determiner_string(final SubLObject the_nominal) {
        assert NIL != parse_tree.nominal_phrase_tree_p(the_nominal) : "parse_tree.nominal_phrase_tree_p(the_nominal) " + "CommonSymbols.NIL != parse_tree.nominal_phrase_tree_p(the_nominal) " + the_nominal;
        final SubLObject true_head = methods.funcall_instance_method_with_0_args(the_nominal, GET_HEAD_DAUGHTER);
        if (NIL != parse_tree.nominal_phrase_tree_p(true_head)) {
            final SubLObject the_det = get_nominal_tree_determiner_string(true_head);
            if (NIL == string_utilities.empty_string_p(the_det)) {
                return the_det;
            }
        }
        final SubLObject the_det = (NIL != methods.funcall_instance_method_with_1_args(the_nominal, FIND_FIRST, DETERMINER_WORD_TREE_P)) ? methods.funcall_instance_method_with_1_args(the_nominal, FIND_FIRST, DETERMINER_WORD_TREE_P) : methods.funcall_instance_method_with_1_args(the_nominal, FIND_FIRST, CARDINAL_WORD_TREE_P);
        return NIL != the_det ? Strings.string_downcase(methods.funcall_instance_method_with_0_args(the_det, GET_STRING), UNPROVIDED, UNPROVIDED) : $str19$;
    }

    public static SubLObject get_longest_nominal_string(final SubLObject the_tree) {
        final SubLObject head_dtr = methods.funcall_instance_method_with_0_args(the_tree, GET_HEAD_DAUGHTER);
        if (NIL == head_dtr) {
            return $str19$;
        }
        if (NIL != parse_tree.qp_tree_p(head_dtr)) {
            return NIL;
        }
        return NIL != get_complex_noun_from_phrase_tree(the_tree, T) ? get_complex_noun_from_phrase_tree(the_tree, T) : NIL != word_tree.word_tree_p(head_dtr) ? get_head_string_if_any(the_tree, UNPROVIDED) : get_longest_nominal_string(head_dtr);
    }

    public static SubLObject extract_all_complex_nouns_from_text(final SubLObject the_text, SubLObject key_string, SubLObject mergeP) {
        if (key_string == UNPROVIDED) {
            key_string = $str19$;
        }
        if (mergeP == UNPROVIDED) {
            mergeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == key_string) {
            key_string = $str19$;
        }
        thread.resetMultipleValues();
        final SubLObject headed = extract_matching_complex_nouns_from_text(the_text, key_string);
        final SubLObject unheaded = thread.secondMultipleValue();
        final SubLObject the_parse = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject head_matches = NIL;
        SubLObject nonhead_matches = NIL;
        SubLObject cdolist_list_var = headed;
        SubLObject this_pair = NIL;
        this_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_pair;
            SubLObject the_strings = NIL;
            SubLObject the_head = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            the_strings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            the_head = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != mergeP) {
                    head_matches = cons(list(string_utilities.bunge(the_strings, UNPROVIDED), the_head), head_matches);
                } else {
                    head_matches = cons(the_strings, head_matches);
                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pair = cdolist_list_var.first();
        } 
        cdolist_list_var = unheaded;
        this_pair = NIL;
        this_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_pair;
            SubLObject the_strings = NIL;
            SubLObject the_head = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            the_strings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            the_head = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != mergeP) {
                    head_matches = cons(list(string_utilities.bunge(the_strings, UNPROVIDED), the_head), head_matches);
                } else {
                    nonhead_matches = cons(the_strings, nonhead_matches);
                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pair = cdolist_list_var.first();
        } 
        return NIL != mergeP ? values(head_matches, the_parse) : values(head_matches, nonhead_matches, the_parse);
    }

    public static SubLObject extract_matching_complex_nouns_from_text(final SubLObject the_text, final SubLObject key_string) {
        final SubLObject my_parser = get_parse_tree_utilities_parser();
        final SubLObject the_parse = methods.funcall_instance_method_with_1_args(my_parser, PARSE, the_text);
        final SubLObject the_nps = (NIL != the_parse) ? methods.funcall_instance_method_with_1_args(the_parse, FIND_ALL, NP_TREE_P) : NIL;
        SubLObject headed_matches = NIL;
        SubLObject other_matches = NIL;
        if (NIL == the_nps) {
            return NIL;
        }
        SubLObject cdolist_list_var = the_nps;
        SubLObject this_np = NIL;
        this_np = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject the_strings = get_complex_noun_from_phrase_tree(this_np, UNPROVIDED);
            final SubLObject head_string = get_head_string_if_any(this_np, UNPROVIDED);
            if (NIL != the_strings) {
                if (NIL != string_utilities.empty_string_p(key_string)) {
                    headed_matches = cons(list(the_strings, head_string), headed_matches);
                } else {
                    final SubLObject variants = acceptable_variations_for_extraction(key_string, $NOUN, this_np);
                    SubLObject doneP = NIL;
                    if (NIL != subl_promotions.memberP(head_string, variants, symbol_function(STRING_EQUAL), UNPROVIDED)) {
                        headed_matches = cons(list(the_strings, head_string), headed_matches);
                    } else
                        if (NIL == doneP) {
                            SubLObject csome_list_var = variants;
                            SubLObject this_variant = NIL;
                            this_variant = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL == doneP) {
                                    SubLObject csome_list_var_$1 = the_strings;
                                    SubLObject this_string = NIL;
                                    this_string = csome_list_var_$1.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var_$1)) {
                                        if (NIL != Strings.string_equal(this_string, this_variant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            other_matches = cons(list(the_strings, head_string), other_matches);
                                            doneP = T;
                                        }
                                        csome_list_var_$1 = csome_list_var_$1.rest();
                                        this_string = csome_list_var_$1.first();
                                    } 
                                }
                                csome_list_var = csome_list_var.rest();
                                this_variant = csome_list_var.first();
                            } 
                        }

                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_np = cdolist_list_var.first();
        } 
        return values(headed_matches, other_matches, the_parse);
    }

    public static SubLObject acceptable_variations_for_extraction(final SubLObject base_string, final SubLObject pos, SubLObject tree) {
        if (tree == UNPROVIDED) {
            tree = NIL;
        }
        if (!pos.eql($NOUN)) {
            return NIL;
        }
        if ((NIL != tree) && (NIL != word_tree.name_word_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_HEAD)))) {
            return list(base_string, lexification_utilities.singularize_word(base_string, UNPROVIDED), lexification_utilities.pluralize_word(base_string, UNPROVIDED));
        }
        if (NIL != subl_promotions.memberP($$CountNoun, lexicon_accessors.pos_of_string(base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            return lexicon_utilities.word_variants(base_string, $NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return list(lexification_utilities.singularize_word(base_string, UNPROVIDED), lexification_utilities.pluralize_word(base_string, UNPROVIDED));
    }

    public static SubLObject extract_verbal_matches_from_source(final SubLObject the_source, SubLObject list_of_roles) {
        if (list_of_roles == UNPROVIDED) {
            list_of_roles = list($SUBJECT, $OBJECT);
        }
        assert NIL != listp(list_of_roles) : "Types.listp(list_of_roles) " + "CommonSymbols.NIL != Types.listp(list_of_roles) " + list_of_roles;
        SubLObject the_lists = NIL;
        final SubLObject v_parser = (the_source.isString()) ? get_parse_tree_utilities_parser() : NIL;
        final SubLObject the_parse = (NIL != v_parser) ? methods.funcall_instance_method_with_1_args(v_parser, PARSE, the_source) : the_source;
        SubLObject cdolist_list_var = list_of_roles;
        SubLObject this_role = NIL;
        this_role = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ret_value = extract_verbal_matches_from_source_int(the_parse, this_role);
            if (ret_value.isList()) {
                the_lists = cons(ret_value, the_lists);
            } else
                if (ret_value.isString()) {
                    Errors.error($str39$extract_verbal_match_from_source_, ret_value);
                } else
                    if (NIL == ret_value) {
                        Errors.warn($str40$don_t_know_what_to_do_with__S__sk, ret_value);
                    } else {
                        the_lists = cons(NIL, the_lists);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            this_role = cdolist_list_var.first();
        } 
        return reverse(the_lists);
    }

    public static SubLObject extract_verbal_matches_downcase_first_word(final SubLObject sentence_or_parse_tree, SubLObject v_parser) {
        if (v_parser == UNPROVIDED) {
            v_parser = NIL;
        }
        SubLObject sentence = NIL;
        SubLObject v_parse_tree = NIL;
        if (sentence_or_parse_tree.isString()) {
            if (NIL != v_parser) {
                assert NIL != parser.charniak_parser_p(v_parser) : "parser.charniak_parser_p(v_parser) " + "CommonSymbols.NIL != parser.charniak_parser_p(v_parser) " + v_parser;
            } else {
                v_parser = parser.new_charniak_parser(UNPROVIDED, UNPROVIDED);
            }
            sentence = sentence_or_parse_tree;
            v_parse_tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, sentence);
        } else
            if (NIL != parse_tree.parse_tree_p(sentence_or_parse_tree)) {
                v_parse_tree = sentence_or_parse_tree;
                sentence = methods.funcall_instance_method_with_0_args(v_parse_tree, GET_STRING);
            } else {
                Errors.error($str42$_S_is_neither_a_STRINGP_nor_a_PAR, sentence_or_parse_tree);
            }

        final SubLObject first_word = string_utilities.first_word(sentence, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject matches = cdolist_list_var = extract_verbal_matches_from_source(v_parse_tree, UNPROVIDED);
        SubLObject matches_for_role = NIL;
        matches_for_role = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = matches_for_role;
            SubLObject match = NIL;
            match = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject whole_noun = nth(TWO_INTEGER, match);
                if (whole_noun.equal(first_word)) {
                    set_nth(TWO_INTEGER, match, Strings.string_downcase(whole_noun, UNPROVIDED, UNPROVIDED));
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                match = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            matches_for_role = cdolist_list_var.first();
        } 
        return matches;
    }

    public static SubLObject extract_verbal_matches_from_source_int(final SubLObject the_source, final SubLObject the_role) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!the_source.isString()) && (NIL == parse_tree.phrase_tree_p(the_source))) {
            return NIL;
        }
        if (NIL == subl_promotions.memberP(the_role, list($SUBJECT, $OBJECT), UNPROVIDED, UNPROVIDED)) {
            return format(NIL, $str43$Role__S_not_understood, the_role);
        }
        final SubLObject my_parser = (the_source.isString()) ? get_parse_tree_utilities_parser() : NIL;
        final SubLObject the_parse = (NIL != my_parser) ? methods.funcall_instance_method_with_1_args(my_parser, PARSE, the_source) : the_source;
        final SubLObject the_vps = (NIL != the_parse) ? methods.funcall_instance_method_with_1_args(the_parse, FIND_ALL, VP_TREE_P) : NIL;
        SubLObject the_matches = NIL;
        SubLObject this_subject = NIL;
        SubLObject preserve_subject = NIL;
        if (NIL == the_vps) {
            return NIL;
        }
        SubLObject cdolist_list_var = the_vps;
        SubLObject this_vp = NIL;
        this_vp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL == methods.funcall_instance_method_with_0_args(this_vp, DUMMY_TO_P)) && (NIL != methods.funcall_instance_method_with_0_args(this_vp, GET_HEAD))) && ((NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(this_vp, GET_HEAD))) || (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(this_vp, GET_HEAD), COPULA_P)))) && (NIL == methods.funcall_instance_method_with_1_args(this_vp, FIND_FIRST, COORDINATE_WORD_TREE_P))) {
                if (the_role.eql($SUBJECT)) {
                    this_subject = (NIL != methods.funcall_instance_method_with_0_args(this_vp, GET_SEMANTIC_SUBJECT)) ? methods.funcall_instance_method_with_0_args(this_vp, GET_SEMANTIC_SUBJECT) : NIL != methods.funcall_instance_method_with_0_args(this_vp, GET_SUBJECT) ? NIL : preserve_subject;
                    if (NIL != (preserve_subject = this_subject)) {
                        final SubLObject _prev_bind_0 = $tolerate_phraseless_charniak_heads$.currentBinding(thread);
                        try {
                            $tolerate_phraseless_charniak_heads$.bind(T, thread);
                            thread.resetMultipleValues();
                            final SubLObject the_strings = get_nominal_head_strings(this_subject, T, UNPROVIDED);
                            final SubLObject problemP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var_$3 = extract_verbal_matches_get_triples(this_vp, the_strings);
                            SubLObject this_match = NIL;
                            this_match = cdolist_list_var_$3.first();
                            while (NIL != cdolist_list_var_$3) {
                                the_matches = cons(list_utilities.flatten(list(this_match, NIL != problemP ? $PROBLEM : $SUBJ)), the_matches);
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                this_match = cdolist_list_var_$3.first();
                            } 
                        } finally {
                            $tolerate_phraseless_charniak_heads$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else
                    if (the_role.eql($OBJECT)) {
                        final SubLObject all_objects = punt_date_adjuncts(methods.funcall_instance_method_with_0_args(this_vp, GET_SEMANTIC_OBJECTS));
                        final SubLObject subcat_frame = (length(all_objects).numG(ONE_INTEGER)) ? $DOUBLE : $SINGLE;
                        final SubLObject key_object = all_objects.first();
                        if (NIL != key_object) {
                            final SubLObject _prev_bind_2 = $tolerate_phraseless_charniak_heads$.currentBinding(thread);
                            try {
                                $tolerate_phraseless_charniak_heads$.bind(T, thread);
                                thread.resetMultipleValues();
                                final SubLObject the_strings2 = get_nominal_head_strings(key_object, T, UNPROVIDED);
                                final SubLObject problemP2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject cdolist_list_var_$4 = extract_verbal_matches_get_triples(this_vp, the_strings2);
                                SubLObject this_match2 = NIL;
                                this_match2 = cdolist_list_var_$4.first();
                                while (NIL != cdolist_list_var_$4) {
                                    the_matches = cons(list_utilities.flatten(list(this_match2, keyword_for_verbal_triple(subcat_frame, problemP2, key_object))), the_matches);
                                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                    this_match2 = cdolist_list_var_$4.first();
                                } 
                            } finally {
                                $tolerate_phraseless_charniak_heads$.rebind(_prev_bind_2, thread);
                            }
                        }
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            this_vp = cdolist_list_var.first();
        } 
        return reverse(the_matches);
    }

    public static SubLObject punt_date_adjuncts(final SubLObject the_objects) {
        SubLObject not_dates = NIL;
        SubLObject cdolist_list_var = the_objects;
        SubLObject this_object = NIL;
        this_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject the_head = get_head_string_if_any(this_object, UNPROVIDED);
            SubLObject dateP = NIL;
            if (NIL != the_head) {
                if (NIL == dateP) {
                    SubLObject csome_list_var;
                    SubLObject this_denot;
                    for (csome_list_var = lexicon_accessors.denots_of_string(the_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), this_denot = NIL, this_denot = csome_list_var.first(); (NIL == dateP) && (NIL != csome_list_var); dateP = makeBoolean((NIL != pph_utilities.pph_genlP(this_denot, $$Date, UNPROVIDED)) || (NIL != pph_utilities.pph_isaP(this_denot, $$Date, UNPROVIDED))) , csome_list_var = csome_list_var.rest() , this_denot = csome_list_var.first()) {
                    }
                }
                if (NIL == dateP) {
                    not_dates = cons(this_object, not_dates);
                } else
                    if (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(this_object, GET_DAUGHTER, ZERO_INTEGER))) {
                        not_dates = cons(methods.funcall_instance_method_with_1_args(this_object, GET_DAUGHTER, ZERO_INTEGER), not_dates);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            this_object = cdolist_list_var.first();
        } 
        return reverse(not_dates);
    }

    public static SubLObject keyword_for_verbal_triple(final SubLObject preferred, final SubLObject problemP, SubLObject check_tree) {
        if (check_tree == UNPROVIDED) {
            check_tree = NIL;
        }
        final SubLObject its_dtr = (NIL != parse_tree.phrase_tree_p(check_tree)) ? methods.funcall_instance_method_with_0_args(check_tree, GET_HEAD_DAUGHTER) : NIL;
        return NIL != (NIL != problemP ? problemP.isKeyword() ? problemP : $PROBLEM : NIL) ? NIL != problemP ? problemP.isKeyword() ? problemP : $PROBLEM : NIL : NIL != (NIL != parse_tree.phrase_tree_p(its_dtr) ? keyword_for_verbal_triple(preferred, problemP, its_dtr) : NIL) ? NIL != parse_tree.phrase_tree_p(its_dtr) ? keyword_for_verbal_triple(preferred, problemP, its_dtr) : NIL : NIL != (NIL != parse_tree.qp_tree_p(check_tree) ? $QP_TREE : NIL) ? NIL != parse_tree.qp_tree_p(check_tree) ? $QP_TREE : NIL : preferred;
    }

    public static SubLObject extract_verbal_matches_get_triples(final SubLObject vp, final SubLObject the_nps) {
        SubLObject the_triples = NIL;
        SubLObject cdolist_list_var = the_nps;
        SubLObject this_np = NIL;
        this_np = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_np;
            SubLObject the_head = NIL;
            SubLObject all_strings = NIL;
            SubLObject the_det = NIL;
            destructuring_bind_must_consp(current, datum, $list56);
            the_head = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            all_strings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            the_det = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != the_head) {
                    final SubLObject head_suf = just_the_nn_or_np_suffix(the_head);
                    final SubLObject vstring = get_head_string_if_any(vp, UNPROVIDED);
                    final SubLObject the_particle = methods.funcall_instance_method_with_1_args(vp, FIND_FIRST, PRT_TREE_P);
                    the_triples = cons(list(head_suf.isList() ? head_suf.first() : head_suf, format(NIL, $str58$_A_A_VB, morphology.get_root_of_head(vstring, $VERB), NIL != the_particle ? format(NIL, $str60$__A, methods.funcall_instance_method_with_0_args(the_particle, GET_STRING)) : $str19$), all_strings.isList() ? string_utilities.bunge(all_strings, UNPROVIDED) : all_strings, the_det), the_triples);
                }
            } else {
                cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_np = cdolist_list_var.first();
        } 
        return reverse(the_triples);
    }

    public static SubLObject just_the_nn_or_np_suffix(final SubLObject string_cat) {
        SubLObject current;
        final SubLObject datum = current = string_utilities.split_string(string_cat, list(CHAR_underbar));
        SubLObject the_string = NIL;
        SubLObject the_cat = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        the_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        the_cat = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list61);
            return NIL;
        }
        if (NIL != string_utilities.substringP($$$P, the_cat, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return format(NIL, $str63$_A_NP, the_string);
        }
        return format(NIL, $str64$_A_NN, Strings.string_downcase(the_string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject syntactic_xps(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == parser.stanford_parser_availableP(UNPROVIDED)) {
            return NIL;
        }
        SubLObject xps = NIL;
        final SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, string);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject categories_var = $list67;
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = $DFR2L;
                    final SubLObject possible_orders = list($DFL2R, $DFR2L);
                    SubLObject daughter = NIL;
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
                        Errors.error($str70$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(tree, stack);
                    while (NIL == stacks.stack_empty_p(stack)) {
                        daughter = stacks.stack_pop(stack);
                        if ((categories_var == $ALL) || (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(daughter, GET_CATEGORY), categories_var, UNPROVIDED, UNPROVIDED))) {
                            xps = cons(daughter, xps);
                        }
                        if (NIL != parse_tree.phrase_tree_p(daughter)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(daughter);
                            final SubLObject backwardP_var = eq(order_var, $DFL2R);
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject daughter_$5;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                daughter_$5 = aref(vector_var, element_num);
                                stacks.stack_push(daughter_$5, stack);
                            }
                        }
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(xps, tree);
    }

    public static SubLObject parse_tree_string(final SubLObject tree) {
        return methods.funcall_instance_method_with_0_args(tree, GET_STRING);
    }

    public static SubLObject declare_parse_tree_utilities_file() {
        declareFunction(me, "new_parse_tree_utilities_parser", "NEW-PARSE-TREE-UTILITIES-PARSER", 0, 0, false);
        declareFunction(me, "get_parse_tree_utilities_parser", "GET-PARSE-TREE-UTILITIES-PARSER", 0, 0, false);
        declareMacro(me, "with_parse_tree_utilities_parser", "WITH-PARSE-TREE-UTILITIES-PARSER");
        declareMacro(me, "while_tolerating_phraseless_heads", "WHILE-TOLERATING-PHRASELESS-HEADS");
        declareFunction(me, "get_complex_noun_from_phrase_tree", "GET-COMPLEX-NOUN-FROM-PHRASE-TREE", 1, 1, false);
        declareFunction(me, "combine_head_string_and_category", "COMBINE-HEAD-STRING-AND-CATEGORY", 1, 1, false);
        declareFunction(me, "get_normalized_head_string", "GET-NORMALIZED-HEAD-STRING", 1, 0, false);
        declareFunction(me, "get_head_string_if_any", "GET-HEAD-STRING-IF-ANY", 1, 1, false);
        declareFunction(me, "get_nominal_head_strings", "GET-NOMINAL-HEAD-STRINGS", 1, 2, false);
        declareFunction(me, "get_nominal_tree_determiner_string", "GET-NOMINAL-TREE-DETERMINER-STRING", 1, 0, false);
        declareFunction(me, "get_longest_nominal_string", "GET-LONGEST-NOMINAL-STRING", 1, 0, false);
        declareFunction(me, "extract_all_complex_nouns_from_text", "EXTRACT-ALL-COMPLEX-NOUNS-FROM-TEXT", 1, 2, false);
        declareFunction(me, "extract_matching_complex_nouns_from_text", "EXTRACT-MATCHING-COMPLEX-NOUNS-FROM-TEXT", 2, 0, false);
        declareFunction(me, "acceptable_variations_for_extraction", "ACCEPTABLE-VARIATIONS-FOR-EXTRACTION", 2, 1, false);
        declareFunction(me, "extract_verbal_matches_from_source", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE", 1, 1, false);
        declareFunction(me, "extract_verbal_matches_downcase_first_word", "EXTRACT-VERBAL-MATCHES-DOWNCASE-FIRST-WORD", 1, 1, false);
        declareFunction(me, "extract_verbal_matches_from_source_int", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE-INT", 2, 0, false);
        declareFunction(me, "punt_date_adjuncts", "PUNT-DATE-ADJUNCTS", 1, 0, false);
        declareFunction(me, "keyword_for_verbal_triple", "KEYWORD-FOR-VERBAL-TRIPLE", 2, 1, false);
        declareFunction(me, "extract_verbal_matches_get_triples", "EXTRACT-VERBAL-MATCHES-GET-TRIPLES", 2, 0, false);
        declareFunction(me, "just_the_nn_or_np_suffix", "JUST-THE-NN-OR-NP-SUFFIX", 1, 0, false);
        declareFunction(me, "syntactic_xps", "SYNTACTIC-XPS", 1, 0, false);
        declareFunction(me, "parse_tree_string", "PARSE-TREE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_parse_tree_utilities_file() {
        defparameter("*PARSE-TREE-UTILITIES-USE-THIS-PARSER*", NIL);
        defparameter("*PARSE-TREE-UTILITIES-PARSER-CONSTRUCTOR*", symbol_function(NEW_CHARNIAK_PARSER));
        defparameter("*TOLERATE-PHRASELESS-CHARNIAK-HEADS*", NIL);
        return NIL;
    }

    public static SubLObject setup_parse_tree_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parse_tree_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_parse_tree_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parse_tree_utilities_file();
    }

    
}

/**
 * Total time: 201 ms
 */
