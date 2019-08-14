/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_list_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.possibly_fo_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-PHRASE-RESOLUTION
 * source file: /cyc/top/cycl/pph-phrase-resolution.lisp
 * created:     2019/07/03 17:38:19
 */
public final class pph_phrase_resolution extends SubLTranslatedFile implements V12 {
    public static final SubLObject sanity_check_one_arg_position_mapping(SubLObject from_prefix, SubLObject to_prefix, SubLObject target_formula, SubLObject reference_formula, SubLObject reference_formula_el, SubLObject reference_map) {
        {
            SubLObject okP = NIL;
            SubLObject target_formula_arg = (NIL != from_prefix) ? ((SubLObject) (cycl_utilities.formula_arg_position(target_formula, from_prefix, UNPROVIDED))) : target_formula;
            SubLObject target_formula_arg_el = cycl_utilities.hl_to_el(target_formula_arg);
            if (NIL == target_formula) {
                okP = T;
            } else {
                if (NIL == target_formula_arg) {
                    okP = T;
                } else {
                    if ((NIL == to_prefix) && target_formula_arg.equal(pph_utilities.pph_resolve_formula_arg_nauts(reference_formula, UNPROVIDED))) {
                        okP = T;
                    } else {
                        if ((NIL == from_prefix) && pph_utilities.pph_arg_position_lookup(NIL, reference_map).equal(to_prefix)) {
                            okP = T;
                        } else {
                            if ((NIL == cycl_utilities.expression_find(target_formula_arg, reference_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && last(to_prefix, UNPROVIDED).equal($list_alt73)) {
                                okP = T;
                            } else {
                                if (NIL != pph_utilities.pph_nl_tagP(target_formula)) {
                                    okP = T;
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject all_positions = union(pph_utilities.pph_formula_positions(target_formula_arg_el, reference_formula_el, symbol_function(EQUAL)), pph_utilities.pph_formula_positions(target_formula_arg, reference_formula, symbol_function(EQUAL)), symbol_function(EQUAL), UNPROVIDED);
                SubLObject global_positions = NIL;
                if (NIL == okP) {
                    {
                        SubLObject csome_list_var = all_positions;
                        SubLObject position = NIL;
                        for (position = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , position = csome_list_var.first()) {
                            {
                                SubLObject global_position = pph_utilities.pph_arg_position_lookup(position, reference_map);
                                global_positions = cons(global_position, global_positions);
                                if (global_position.equal(to_prefix)) {
                                    okP = T;
                                }
                            }
                        }
                    }
                }
                if (NIL == okP) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt107$__New_map_says__S_has_arg_positio) });
                        pph_error.pph_handle_error(new_format_string, list(target_formula_arg, to_prefix, global_positions));
                    }
                }
            }
            return okP;
        }
    }

    public static final SubLObject sanity_check_one_arg_position_map(SubLObject reference_formula, SubLObject reference_map, SubLObject target_formula, SubLObject target_map) {
        {
            SubLObject okP = makeBoolean(((NIL != pph_utilities.pph_empty_map_p(target_map)) || (NIL != pph_utilities.formula_arg_nautP(target_formula))) || (NIL != at_admitted.generic_arg_p(target_formula)));
            SubLObject reference_formula_el = cycl_utilities.hl_to_el(reference_formula);
            SubLObject rest = NIL;
            for (rest = target_map; !((NIL != okP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject cons = rest.first();
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject from_prefix = NIL;
                    SubLObject to_prefix = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    from_prefix = current.first();
                    current = current.rest();
                    to_prefix = current;
                    okP = com.cyc.cycjava.cycl.pph_phrase_resolution.sanity_check_one_arg_position_mapping(from_prefix, to_prefix, target_formula, reference_formula, reference_formula_el, reference_map);
                }
            }
            return okP;
        }
    }

    public static final SubLObject sanity_check_arg_position_map(SubLObject old_formula, SubLObject old_map, SubLObject new_formula, SubLObject new_map) {
        {
            SubLObject okP = makeBoolean(((NIL != pph_error.pph_sanity_checking_suspendedP()) || (NIL != pph_phrase.pph_unknown_cycl_p(old_formula))) || (NIL != pph_phrase.pph_unknown_cycl_p(new_formula)));
            if (NIL != okP) {
            } else {
                if (old_formula.equal(new_formula)) {
                    okP = T;
                    if (NIL == list_utilities.alist_E(old_map, new_map, symbol_function(EQUAL), symbol_function(EQUAL))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            Errors.warn($str_alt102$PPH_possible_arg_position_map_pro, new SubLObject[]{ old_formula, old_map, new_formula, new_map });
                        }
                    }
                } else {
                    okP = com.cyc.cycjava.cycl.pph_phrase_resolution.sanity_check_one_arg_position_map(old_formula, old_map, new_formula, new_map);
                }
            }
            if (NIL == okP) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt103$PPH_arg_position_map_problem____O) });
                    pph_error.pph_handle_error(new_format_string, list(old_formula, old_map, new_formula, new_map));
                }
            }
            return NIL != okP ? ((SubLObject) ($OK)) : $ERROR;
        }
    }

    public static final SubLObject pph_phrase_sanity_check_arg_position_map(SubLObject phrase, SubLObject old_formula, SubLObject old_map) {
        if ((NIL != pph_utilities.pph_empty_map_p(old_map)) && (NIL == pph_utilities.pph_empty_map_p(pph_phrase.pph_phrase_arg_position_map(phrase)))) {
            {
                SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt101$Something_from_nothing__Non_empty) });
                pph_error.pph_handle_error(new_format_string, list(pph_phrase.pph_phrase_arg_position_map(phrase)));
            }
        }
        {
            SubLObject new_formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject new_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            return com.cyc.cycjava.cycl.pph_phrase_resolution.sanity_check_arg_position_map(old_formula, old_map, new_formula, new_map);
        }
    }

    /**
     * Update the output list of MOTHER based on its daughters' output lists.
     */
    @LispMethod(comment = "Update the output list of MOTHER based on its daughters\' output lists.")
    public static final SubLObject pph_phrase_recompute_output_list_from_dtrs(SubLObject mother) {
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(mother);
        return pph_phrase.pph_phrase_output_list(mother);
    }

    /**
     * If appropriate, recursively update the output list of the mother of PHRASE, its
     * mother, and so on, based on their daughters' output lists.
     */
    @LispMethod(comment = "If appropriate, recursively update the output list of the mother of PHRASE, its\r\nmother, and so on, based on their daughters\' output lists.\nIf appropriate, recursively update the output list of the mother of PHRASE, its\nmother, and so on, based on their daughters\' output lists.")
    public static final SubLObject pph_phrase_maybe_recompute_mothers_output_list_from_dtrs(SubLObject phrase) {
        {
            SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
            if ((NIL != pph_phrase.pph_phrase_p(mother, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(mother))) {
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_recompute_output_list_from_dtrs(mother);
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_maybe_recompute_mothers_output_list_from_dtrs(mother);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    static private final SubLString $str_alt58$ = makeString("");

    public static final SubLFile me = new pph_phrase_resolution();

 public static final String myName = "com.cyc.cycjava.cycl.pph_phrase_resolution";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_phrase_get_string_depth$ = makeSymbol("*PPH-PHRASE-GET-STRING-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_phrase_get_string_max_depth$ = makeSymbol("*PPH-PHRASE-GET-STRING-MAX-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_repeated_phrase_lists$ = makeSymbol("*PPH-REPEATED-PHRASE-LISTS*");

    // defparameter
    // Holder for the phrase whose nth daughters are used to resolve indexicals
    /**
     * Holder for the phrase whose nth daughters are used to resolve indexicals
     */
    @LispMethod(comment = "Holder for the phrase whose nth daughters are used to resolve indexicals\ndefparameter")
    private static final SubLSymbol $pph_phrase_transform_nth_reference_phrase$ = makeSymbol("*PPH-PHRASE-TRANSFORM-NTH-REFERENCE-PHRASE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_symbol_phrase_stack$ = makeSymbol("*PPH-SYMBOL-PHRASE-STACK*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $pph_coordination_phrase_nesting$ = makeSymbol("*PPH-COORDINATION-PHRASE-NESTING*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_coordination_phrase_nesting_max$ = makeSymbol("*PPH-COORDINATION-PHRASE-NESTING-MAX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_english_lexical_indefinites$ = makeSymbol("*PPH-ENGLISH-LEXICAL-INDEFINITES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Unable_to_finish = makeString("Unable to finish");

    static private final SubLString $str1$___A__S__ = makeString("~&~A ~S~%");

    static private final SubLString $$$Unfinished_dtr = makeString("Unfinished dtr");

    private static final SubLInteger $int$99 = makeInteger(99);

    static private final SubLString $str5$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str6$__ = makeString(") ");

    static private final SubLString $str7$__Exceeded_PPH_PHRASE_GET_STRING_ = makeString("~&Exceeded PPH-PHRASE-GET-STRING max depth of ~S.~% Phrase: ~S~%");

    private static final SubLString $str8$__Resolved_conditional_phrase_to_ = makeString("~&Resolved conditional phrase to ~S ~S.");

    private static final SubLString $str9$Tried_to_generating_CycL_phrase_w = makeString("Tried to generating CycL phrase with unknown CycL. Trying again as regular phrase:~% ~S");

    private static final SubLString $str10$Resolved_formerly_CycL_phrase_wit = makeString("Resolved formerly CycL phrase with unknown CycL to ~S");

    private static final SubLString $str11$__Using_CycL_for_object___S___ = makeString("~&Using CycL for object: ~S.~%");

    private static final SubLString $str12$__Doing_anaphor_paraphrase_with_f = makeString("~&Doing anaphor paraphrase with formula ~S.~%");

    private static final SubLString $str13$__Doing_coordination_paraphrase_w = makeString("~&Doing coordination paraphrase with formula ~S.~%");

    private static final SubLString $str14$__Suspending_bullet_use_for____S_ = makeString("~&Suspending bullet use for~% ~S~%");

    private static final SubLString $str15$__Turning_bullet_use_back_on___ = makeString("~&Turning bullet use back on.~%");

    private static final SubLString $str16$__Doing_chemical_formula_from_lis = makeString("~&Doing chemical-formula-from-lists paraphrase.~%");

    private static final SubLString $str17$__Doing_percent_paraphrase___ = makeString("~&Doing percent paraphrase.~%");

    private static final SubLString $str18$__Generating_symbol_paraphrase_of = makeString("~&Generating symbol paraphrase of ~S.~%");

    private static final SubLString $str19$__Using_quoted_string_for_string_ = makeString("~&Using quoted string for string: ~S.~%");

    private static final SubLString $str20$__Using_terse_paraphrase_for__S__ = makeString("~&Using terse paraphrase for ~S~%");

    private static final SubLString $str21$__Using_precise_paraphrase_for__S = makeString("~&Using precise paraphrase for ~S~%");

    private static final SubLString $str23$__Unknown_cycl_for__S___ = makeString("~&Unknown cycl for ~S.~%");

    private static final SubLString $str24$__Using_precision__S__ = makeString("~&Using precision ~S~%");

    private static final SubLString $str25$__Using_quoted_paraphrase_for_ter = makeString("~&Using quoted paraphrase for term.~%");

    private static final SubLString $str26$Using__S_for_quoted_paraphrase_of = makeString("Using ~S for quoted paraphrase of ~S");

    private static final SubLString $str27$__Using_nospace_paraphrase_for__S = makeString("~&Using nospace paraphrase for ~S~%");

    private static final SubLList $list28 = list(makeSymbol("TARGET-TERM"), makeSymbol("TARGET-STRING"), makeSymbol("TARGET-PREDS"));

    private static final SubLSymbol $PPH_HL_SUPPORTS_FOUND = makeKeyword("PPH-HL-SUPPORTS-FOUND");



    private static final SubLString $str32$Couldn_t_resolve_repeated_dtrs_fo = makeString("Couldn't resolve repeated dtrs for ~S");

    private static final SubLString $str33$__Starting_dtr_resolution_for_phr = makeString("~&Starting dtr resolution for phrase ~D");

    private static final SubLString $str34$___D_of__D_daughters_unfinished_ = makeString("~&~D of ~D daughters unfinished.");

    private static final SubLString $str35$Can_t_resolve_mother_due_to_impos = makeString("Can't resolve mother due to impossible dtr:~% ~S");

    private static final SubLString $str36$__Finished__S_iteration_s____D_of = makeString("~&Finished ~S iteration(s): ~D of ~D daughters unfinished.");

    private static final SubLString $str37$Couldn_t_finish__S___because_of_u = makeString("Couldn't finish ~S~% because of unfinished dtrs:~% ~S~%");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    private static final SubLString $str40$Problem_expanding_repeated_phrase = makeString("Problem expanding repeated phrase~% ~S");

    private static final SubLString $str41$PPH_REPEATED_PHRASE_EXPANSION_got = makeString("PPH-REPEATED-PHRASE-EXPANSION got non-formula ~S");

    private static final SubLSymbol $sym42$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str43$Repeating_phrase__S = makeString("Repeating phrase ~S");

    private static final SubLString $str44$__etc_ = makeString(", etc.");

    private static final SubLString $str45$Can_t_get_current_list_item_from_ = makeString("Can't get current list item from ~S");

    private static final SubLList $list47 = cons(reader_make_constant_shell("TheList"), makeKeyword("ANYTHING"));

    private static final SubLString $str48$Updating__S_to____S____Result___S = makeString("Updating ~S to~% ~S.~% Result: ~S~%");

    private static final SubLSymbol PPH_CURRENT_LIST_ITEM_FORMULA_P = makeSymbol("PPH-CURRENT-LIST-ITEM-FORMULA-P");

    private static final SubLSymbol PPH_CURRENT_LIST_ITEM_FORMULA_ITEM = makeSymbol("PPH-CURRENT-LIST-ITEM-FORMULA-ITEM");

    private static final SubLList $list51 = list(reader_make_constant_shell("CurrentListItemFn"), list($TEST, makeSymbol("PPH-EXTENSIONAL-LIST-P")), list($TEST, makeSymbol("NON-NEGATIVE-INTEGER-P")));

    static private final SubLList $list52 = list(makeSymbol("LIST-EXPRESSION"), makeSymbol("OFFSET"));

    private static final SubLString $str53$__Resolving__S_to__S__ = makeString("~&Resolving ~S to ~S~%");

    private static final SubLList $list54 = cons(makeSymbol("LIST-EXPRESSION"), makeSymbol("INDEX"));

    private static final SubLString $str55$ = makeString("");

    private static final SubLString $str56$__Phrase_agr___S__ = makeString("~&Phrase agr: ~S~%");

    private static final SubLString $str57$___Dtr__D_category_is__S___ = makeString("~& Dtr ~D category is ~S.~%");

    private static final SubLString $str58$___Dtr__D_agr_is__S___ = makeString("~& Dtr ~D agr is ~S.~%");

    private static final SubLString $str59$__Set_agr_of_dtr___D_to__S___ = makeString("~&Set agr of dtr #~D to ~S.~%");

    private static final SubLString $str60$___Set_head_agr_to__S___ = makeString("~& Set head agr to ~S.~%");

    private static final SubLString $str61$__Finished__S____with__D_dtrs____ = makeString("~&Finished ~S~% (with ~D dtrs).~%");

    private static final SubLString $str62$___Set_phrase_agr_to__S_based_on_ = makeString("~& Set phrase agr to ~S based on head dtr.~%");

    private static final SubLString $str63$___Dtrs_left_unfinished___D___ = makeString("~& Dtrs left unfinished: ~D.~%");

    private static final SubLString $str65$__Agr_target__mother__not_resolve = makeString("~&Agr target (mother) not resolved: ~S.~%");

    private static final SubLString $str66$__Phrase_agrees_with_itself_____ = makeString("~&Phrase agrees with itself(!)~%");

    private static final SubLString $str67$__Agr_target_not_resolved___S___ = makeString("~&Agr target not resolved: ~S.~%");

    private static final SubLString $str68$_ = makeString("\"");

    private static final SubLString $str69$Setting_mother_s_output_list_from = makeString("Setting mother's output list from unfinished dtr with CycL ~S:~% ~S~%");

    private static final SubLString $str70$_Dth_dtr_output_list___S = makeString("~Dth dtr output list: ~S");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_EMPTY_P = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-EMPTY-P");

    private static final SubLList $list72 = list(ZERO_INTEGER);

    private static final SubLSymbol INCOMPLETE_PPH_PHRASE_P = makeSymbol("INCOMPLETE-PPH-PHRASE-P");

    private static final SubLString $str74$__Test_has_unresolved_indexical_p = makeString("~&Test has unresolved indexical phrases. Postponing: ~S.~%");

    private static final SubLString $str75$__Ran_conditional_test_____S___Re = makeString("~&Ran conditional test:~% ~S~% Result: ~S.~%");

    private static final SubLString $$$Pass = makeString("Pass");

    private static final SubLString $$$Fail = makeString("Fail");

    private static final SubLString $str78$___Initial_winning_phrase_____S__ = makeString("~& Initial winning phrase:~% ~S~% with agr preds ~S");

    private static final SubLString $str79$___New_phrase___S___with_agr_pred = makeString("~& New phrase: ~S~% with agr preds ~S");

    private static final SubLString $str80$___Phrase_has__D_daughters___ = makeString("~& Phrase has ~D daughters.~%");

    private static final SubLSymbol PPH_NTH_PHRASE_NAUT_P = makeSymbol("PPH-NTH-PHRASE-NAUT-P");

    private static final SubLList $list82 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("SententialConstituent"), makeKeyword("ANYTHING"));

    private static final SubLSymbol PPH_PHRASE_TRANSFORM_NTH = makeSymbol("PPH-PHRASE-TRANSFORM-NTH");

    private static final SubLString $str84$Adding_alternatives_for_agr_targe = makeString("Adding alternatives for agr target~% ~S~% to ~S");

    private static final SubLString $str85$Done__S_alternatives_of__S = makeString("Done ~S alternatives of ~S");

    private static final SubLString $str86$Added__D_alternatives_ = makeString("Added ~D alternatives.");

    private static final SubLString $str91$__Paraphrasing__S_with_agreement_ = makeString("~&Paraphrasing ~S with agreement ~S.~%");

    private static final SubLString $str92$___Output_list_is____S___ = makeString("~& Output list is~% ~S.~%");

    private static final SubLString $str93$___Arg_position_map_is__S___ = makeString("~& Arg-position map is ~S.~%");

    private static final SubLString $str94$___SUID_is__S___ = makeString("~& SUID is ~S.~%");

    private static final SubLString $str95$_____of_dtrs___S___ = makeString("~& # of dtrs: ~S.~%");

    private static final SubLString $str96$Can_t_resolve_string_of__S = makeString("Can't resolve string of ~S");

    private static final SubLString $str98$Sanity_check_failed__rm_cycl__S_i = makeString("Sanity check failed: rm cycl ~S is not equal to phrase cycl ~S");

    private static final SubLString $str99$Must_use_reflexive_for____S___due = makeString("Must use reflexive for~% ~S~% due to~% ~S");

    private static final SubLString $str101$__Using_arg0_for__S_with_formula_ = makeString("~&Using arg0 for ~S with formula ~S~%");

    private static final SubLString $str103$Supposedly___S_isn_t_part_of_old_ = makeString("Supposedly, ~S isn't part of old CycL.");

    private static final SubLString $str104$Updated_conditional_test_to__S__ = makeString("Updated conditional test to ~S~%");

    private static final SubLString $str105$Updated_test_to____S_using_non_te = makeString("Updated test to~% ~S using non-template~% ~S~%");

    private static final SubLString $str106$Updated_variable_bindings_query_t = makeString("Updated variable bindings query-template to ~S~%");

    private static final SubLString $str107$Updated_variable_bindings_query_t = makeString("Updated variable bindings query-template to~% ~S using non-template~% ~S~%");

    private static final SubLString $str108$__Replacing__S_with__S___ = makeString("~&Replacing ~S with ~S.~%");

    private static final SubLList $list109 = list(TWO_INTEGER);

    private static final SubLString $str110$Can_t_reconcile__S_and__S_ = makeString("Can't reconcile ~S and ~S.");

    private static final SubLString $str112$No_current_arg0_to_reserve_for__S = makeString("No current arg0 to reserve for ~S");

    private static final SubLSymbol $NO_CURRENT_ARG0 = makeKeyword("NO-CURRENT-ARG0");

    private static final SubLSymbol $RESERVED_FOR_MATRIX_ARG0 = makeKeyword("RESERVED-FOR-MATRIX-ARG0");

    private static final SubLSymbol $sym116$_SYMBOL = makeSymbol("?SYMBOL");



    private static final SubLList $list118 = list(makeSymbol("?SYMBOL"));



    private static final SubLList $list121 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    private static final SubLSymbol $sym122$_CODE = makeSymbol("?CODE");



    private static final SubLList $list124 = list(makeSymbol("?CODE"));





    private static final SubLString $str131$_ = makeString(".");

    private static final SubLString $str132$_ = makeString("?");

    private static final SubLSymbol ALPHANUMERIC_CHAR_P = makeSymbol("ALPHANUMERIC-CHAR-P");

    private static final SubLList $list135 = cons(makeSymbol("LAST-NON-EMPTY-ITEM"), makeSymbol("TRAILING-ITEMS"));

    private static final SubLString $str138$Using_significant_digits_cutoff_o = makeString("Using significant digits cutoff of ~S for ~S");

    private static final SubLString $str139$_ = makeString("%");

    private static final SubLList $list140 = list(CHAR_0);

    private static final SubLString $str142$__Recursion_limit___S__exceeded_i = makeString("~&Recursion limit (~S) exceeded in PPH-COORDINATION-PHRASE-GET-STRING.");

    private static final SubLList $list143 = list(makeSymbol("COORD-KEYWORD"), makeSymbol("LIST-TYPE-ID-STRING"));

    private static final SubLString $str145$Changing_coordination_to__OR__bas = makeString("Changing coordination to :OR, based on :NO determiner");

    private static final SubLString $str147$Inserting_dummy_phrase__S = makeString("Inserting dummy phrase ~S");



    private static final SubLObject $$plural_Generic = reader_make_constant_shell("plural-Generic");

    private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");

    private static final SubLString $str151$__Setting_conjunctive_agr_of__S_t = makeString("~&Setting conjunctive agr of ~S to ~S");

    private static final SubLObject $$No_NLAttr = reader_make_constant_shell("No-NLAttr");



    private static final SubLString $str154$Removed_det_sister_from_mother_ = makeString("Removed det-sister from mother.");

    private static final SubLString $str155$subject_pointer_is_nth_phrase___S = makeString("subject pointer is nth phrase: ~S");

    private static final SubLString $str156$__Not_setting_subject_verb_agreem = makeString("~&Not setting subject verb agreement because subject dtr is not finished.~%");



    private static final SubLString $str159$__Using_internal_constraints___S_ = makeString("~&Using internal constraints: ~S~%");

    private static final SubLString $str160$___filtered_from__S___ = makeString("...filtered from ~S.~%");

    private static final SubLString $str161$__Setting_verb_agreement_to__S___ = makeString("~&Setting verb agreement to ~S.~%");

    private static final SubLString $str162$Using_default_verb_form___S_ = makeString("Using default verb form: ~S.");







    private static final SubLString $str166$__This_phrase_s_agr_pred_is__S_bu = makeString("~&This phrase's agr-pred is ~S but its category is ~S:~%~S");

    private static final SubLString $str167$__Set_adjective_peer_agreement_to = makeString("~&Set adjective peer agreement to ~S.~%");



    private static final SubLString $str169$__Set_untensed_peer_agreement_to_ = makeString("~&Set untensed peer agreement to ~S.~%");

    private static final SubLString $str170$__Set_peer_agreement_to__S___ = makeString("~&Set peer agreement to ~S.~%");

    private static final SubLString $str171$__Set_peer_agreement_to_default__ = makeString("~&Set peer agreement to default: ~S.~%");



    private static final SubLString $str173$__Incorporating_tense_agreement__ = makeString("~&Incorporating tense agreement ~S.~%");

    private static final SubLString $str174$_S = makeString("~S");

    private static final SubLString $str175$__Using_daughter__D_as_agreement_ = makeString("~&Using daughter ~D as agreement target:~% ~S");

    private static final SubLObject $$BareForm_NLAttr = reader_make_constant_shell("BareForm-NLAttr");

    private static final SubLString $str177$__Using_hard_coded_null_determine = makeString("~&Using hard-coded null determiner hack for #$BareForm-NLAttr.~%");

    private static final SubLObject $$PossessivePronoun_Pre = reader_make_constant_shell("PossessivePronoun-Pre");

    private static final SubLString $str180$__Setting_det_nbar_agreement_for_ = makeString("~&Setting det-nbar agreement for possessive.~%");

    private static final SubLString $str181$__Using_null_determiner_for_posse = makeString("~&Using null determiner for possessive nbar.~%");

    private static final SubLString $str182$__Setting_det_nbar_agreement_for_ = makeString("~&Setting det-nbar agreement for ranged phrase.~%");

    private static final SubLString $str183$__Setting_determiner_s_agr_pred_f = makeString("~&Setting determiner's agr-pred from nbar to ~S.");

    private static final SubLString $str184$__Setting_agr_pred_from_determine = makeString("~&Setting agr-pred from determiner to ~S.");

    private static final SubLSymbol $sym185$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLString $str186$__Setting_determiner_nbar_agreeme = makeString("~&Setting determiner-nbar agreement based on variable determiner.");

    private static final SubLObject $$nonSingular_Generic = reader_make_constant_shell("nonSingular-Generic");

    private static final SubLString $str188$__Setting_determiner_nbar_agreeme = makeString("~&Setting determiner-nbar agreement to ~S based on number-denoting determiner.");

    private static final SubLString $str189$Couldn_t_determine_agreement_info = makeString("Couldn't determine agreement information: ~S~% DET-HEAD-CYCL: ~S~%");

    private static final SubLString $str190$PPH_PHRASE_DTR_NESTED_WITHIN__loo = makeString("PPH-PHRASE-DTR-NESTED-WITHIN? looking for dtr ~S in non-PPH-PHRASE ~S~%");

    private static final SubLString $$$some = makeString("some");

    private static final SubLString $str192$__Nbar_is_now__S__ = makeString("~&Nbar is now ~S~%");



    private static final SubLString $str194$__Using_English_specific_indefini = makeString("~&Using English-specific indefinite determiner hack: ~S with Nbar ~S.~%");

    private static final SubLList $list195 = list(cons(reader_make_constant_shell("Thing"), makeString("something")), cons(reader_make_constant_shell("Person"), makeString("someone")), cons(reader_make_constant_shell("Place"), makeString("someplace")));

    private static final SubLList $list196 = list(reader_make_constant_shell("singular"));

    private static final SubLList $list197 = cons(makeSymbol("TYPE"), makeSymbol("STRING"));

    private static final SubLString $str198$Nbar_string_is__S__Output_list___ = makeString("Nbar string is ~S. Output list: ~S");



    private static final SubLList $list200 = list(makeKeyword("A"), NIL);





    private static final SubLSymbol $sym204$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLObject $$singularVerb_Generic = reader_make_constant_shell("singularVerb-Generic");

    private static final SubLString $str206$__Subject_agr___S__ = makeString("~&Subject agr: ~S~%");

    private static final SubLObject $$SecondPerson_NLAttr = reader_make_constant_shell("SecondPerson-NLAttr");

    private static final SubLObject $$secondPersonSg_Generic = reader_make_constant_shell("secondPersonSg-Generic");

    private static final SubLObject $$secondPersonSg_Present = reader_make_constant_shell("secondPersonSg-Present");

    private static final SubLObject $$FirstPerson_NLAttr = reader_make_constant_shell("FirstPerson-NLAttr");

    private static final SubLObject $$firstPersonSg_Generic = reader_make_constant_shell("firstPersonSg-Generic");

    private static final SubLObject $$firstPersonSg_Present = reader_make_constant_shell("firstPersonSg-Present");

    private static final SubLString $str213$__Using_tenses__S__ = makeString("~&Using tenses ~S~%");

    private static final SubLSymbol $sym214$PPH_FINITE_VERB_PRED_ = makeSymbol("PPH-FINITE-VERB-PRED?");

    private static final SubLSymbol $sym215$PPH_NON_PLURAL_NOUN_PRED_ = makeSymbol("PPH-NON-PLURAL-NOUN-PRED?");

    private static final SubLSymbol $sym216$PPH_PLURAL_NOUN_PRED_ = makeSymbol("PPH-PLURAL-NOUN-PRED?");

    private static final SubLSymbol $sym217$PPH_PLURAL_VERB_PRED_ = makeSymbol("PPH-PLURAL-VERB-PRED?");

    private static final SubLString $str218$__Using_tense__S__ = makeString("~&Using tense ~S~%");

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell("nonPlural-Generic");

    private static final SubLObject $$pluralVerb_Generic = reader_make_constant_shell("pluralVerb-Generic");

    private static final SubLObject $$thirdPersonSg_Generic = reader_make_constant_shell("thirdPersonSg-Generic");

    private static final SubLString $str222$__Unifying__S_and__S_to__S___ = makeString("~&Unifying ~S and ~S to ~S.~%");

    private static final SubLString $str223$Using_agr_preds__S_from_done_head = makeString("Using agr preds ~S from done head dtr~% ~S~% for ~S.");

    private static final SubLString $str224$Couldn_t_unify__S_and__S___ = makeString("Couldn't unify ~S and ~S.~%");

    private static final SubLString $str225$__AGRs_are_now____S_and____S___ = makeString("~&AGRs are now~% ~S and~% ~S.~%");

    private static final SubLSymbol PPH_DETP_NART_CACHED = makeSymbol("PPH-DETP-NART-CACHED");

    private static final SubLList $list227 = list(reader_make_constant_shell("PhraseFn"), reader_make_constant_shell("Determiner"));

    private static final SubLSymbol $pph_detp_nart_cached_caching_state$ = makeSymbol("*PPH-DETP-NART-CACHED-CACHING-STATE*");

    private static final SubLString $str229$__Switching_arg1_and_arg2_in__S__ = makeString("~&Switching arg1 and arg2 in ~S~%");

    private static final SubLString $str231$Can_t_switch_arg1_and_arg2_in_rep = makeString("Can't switch arg1 and arg2 in repeated phrase~S");

    // Definitions
    public static final SubLObject pph_note_unfinished_phrase_alt(SubLObject phrase, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Unable_to_finish;
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_note_unfinished_dtrs(phrase);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format(T, $str_alt1$___A__S__, message, phrase);
        }
        return NIL;
    }

    // Definitions
    public static SubLObject pph_note_unfinished_phrase(final SubLObject phrase, SubLObject message) {
        if (message == UNPROVIDED) {
            message = $$$Unable_to_finish;
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            pph_phrase_note_unfinished_dtrs(phrase);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str1$___A__S__, message, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject pph_phrase_note_unfinished_dtrs_alt(SubLObject phrase) {
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
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_note_unfinished_dtrs(dtr);
                    if (NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(dtr, $$$Unfinished_dtr);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_note_unfinished_dtrs(final SubLObject phrase) {
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
                pph_phrase_note_unfinished_dtrs(dtr);
                if (NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                    pph_note_unfinished_phrase(dtr, $$$Unfinished_dtr);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }

    /**
     *
     *
     * @param PHRASE;
    PPH-PHRASE-P
     * 		
     * @param CYCL;
     * 		The top-level cycl we're paraphrasing.
     * @param MATRIX-PHRASE;
     * 		PPH-PHRASE-P - the mother of PHRASE.
     * @unknown STRINGP; the best string value we can make for PHRASE.
     * @unknown PPH-PHRASE; the updated version of PHRASE.
     */
    @LispMethod(comment = "@param PHRASE;\nPPH-PHRASE-P\r\n\t\t\r\n@param CYCL;\r\n\t\tThe top-level cycl we\'re paraphrasing.\r\n@param MATRIX-PHRASE;\r\n\t\tPPH-PHRASE-P - the mother of PHRASE.\r\n@unknown STRINGP; the best string value we can make for PHRASE.\r\n@unknown PPH-PHRASE; the updated version of PHRASE.")
    public static final SubLObject pph_phrase_get_string_alt(SubLObject phrase, SubLObject cycl, SubLObject matrix_phrase) {
        if (cycl == UNPROVIDED) {
            cycl = $PHRASE_CYCL;
        }
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $pph_phrase_get_string_depth$.currentBinding(thread);
                try {
                    $pph_phrase_get_string_depth$.bind(number_utilities.f_1X($pph_phrase_get_string_depth$.getDynamicValue(thread)), thread);
                    if ($pph_phrase_get_string_depth$.getDynamicValue(thread).numG($pph_phrase_get_string_max_depth$.getDynamicValue(thread))) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt7$__Exceeded_PPH_PHRASE_GET_STRING_) });
                            pph_error.pph_handle_error(new_format_string, list($pph_phrase_get_string_max_depth$.getDynamicValue(thread), phrase));
                        }
                    }
                    if ($PHRASE_CYCL == cycl) {
                        cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    }
                    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                        }
                    }
                    pph_phrase.pph_phrase_check_impossible(phrase, UNPROVIDED);
                    pph_phrase.pph_phrase_sanity_check_output_list_cycl(phrase);
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                    } else {
                        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_condition(phrase, cycl, matrix_phrase);
                            if (NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
                                {
                                    SubLObject string = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(phrase, cycl, matrix_phrase);
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt10$__Resolved_conditional_phrase_to_, string, pph_phrase.pph_phrase_agr(phrase));
                                    }
                                }
                            }
                        } else {
                            if (NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
                                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(phrase, UNPROVIDED);
                            } else {
                                if (NIL != pph_phrase.pph_cycl_phrase_p(phrase)) {
                                    {
                                        SubLObject cycl_1 = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                        if (NIL != pph_phrase.pph_unknown_cycl_p(cycl_1)) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                Errors.warn($str_alt11$Tried_to_generating_CycL_phrase_w, phrase);
                                            }
                                            pph_phrase.pph_phrase_clear_special_type(phrase);
                                            {
                                                SubLObject string = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(phrase, cycl_1, matrix_phrase);
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt12$Resolved_formerly_CycL_phrase_wit, string);
                                                }
                                            }
                                        } else {
                                            if (NIL != cycl_variables.el_varP(cycl_1)) {
                                                {
                                                    SubLObject olist = pph_methods.pph_paraphrase_var_as_var(cycl_1, NIL, phrase);
                                                    pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                                    pph_variable_handling.pph_register_var_paraphrase(cycl_1, phrase);
                                                    pph_phrase.pph_phrase_note_done(phrase);
                                                }
                                            } else {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt13$__Using_CycL_for_object___S___, cycl_1);
                                                }
                                                pph_phrase.pph_phrase_set_string(phrase, prin1_to_string(function_terms.nart_to_naut(cycl_1)));
                                                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.anaphor_needed_for_phraseP(phrase)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format(T, $str_alt14$__Doing_anaphor_paraphrase_with_f, cycl);
                                        }
                                        if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.reflexive_needed_for_phraseP(phrase)) {
                                            pph_phrase.pph_phrase_set_string(phrase, pph_methods_lexicon.pph_introduce_reflexive(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                                        } else {
                                            pph_methods_lexicon.pph_generate_pronoun(phrase);
                                        }
                                    } else {
                                        if (NIL != pph_phrase.pph_coordination_phrase_p(phrase)) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format(T, $str_alt15$__Doing_coordination_paraphrase_w, cycl);
                                            }
                                            {
                                                SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
                                                SubLObject bullets_okP = makeBoolean((NIL != pph_phrase.pph_phrase_p(mother, UNPROVIDED)) || pph_vars.current_generation_level().numG(pph_vars.$pph_use_bulleted_lists_min_level$.getDynamicValue(thread)));
                                                SubLObject suspendP = makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL == bullets_okP));
                                                {
                                                    SubLObject _prev_bind_0_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                                    try {
                                                        pph_vars.$pph_use_bulleted_listsP$.bind(makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL != bullets_okP)), thread);
                                                        if (NIL != suspendP) {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt16$__Suspending_bullet_use_for____S_, phrase);
                                                            }
                                                        }
                                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_coordination_phrase_get_string(phrase, cycl);
                                                        if (NIL != suspendP) {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt17$__Turning_bullet_use_back_on___);
                                                            }
                                                        }
                                                    } finally {
                                                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != pph_phrase.pph_chemical_formula_from_lists_phrase_p(phrase)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt18$__Doing_chemical_formula_from_lis);
                                                }
                                                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_chemical_formula_from_lists_phrase_get_string(phrase);
                                            } else {
                                                if (NIL != pph_phrase.pph_percent_phrase_p(phrase)) {
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                        format(T, $str_alt19$__Doing_percent_paraphrase___);
                                                    }
                                                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_percent_phrase_get_string(phrase, cycl);
                                                } else {
                                                    if (NIL != pph_phrase.pph_symbol_phrase_p(phrase)) {
                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                            format(T, $str_alt20$__Generating_symbol_paraphrase_of, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                                        }
                                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_symbol_phrase_get_string(phrase);
                                                    } else {
                                                        if ((NIL != pph_phrase.pph_string_mention_phrase_p(phrase)) && pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED).isString()) {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                format(T, $str_alt21$__Using_quoted_string_for_string_, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                                            }
                                                            pph_phrase.pph_phrase_set_string(phrase, format_nil.format_nil_s(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                                                        } else {
                                                            if (NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(phrase)) {
                                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                    format(T, $str_alt22$__Using_quoted_paraphrase_for_ter);
                                                                }
                                                                {
                                                                    SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                    SubLObject cycl_3 = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                                                                    SubLObject agr_preds = pph_utilities.pph_default_nl_preds_for_term(cycl_3);
                                                                    pph_phrase.pph_phrase_set_agr_preds(dtr, agr_preds, UNPROVIDED);
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        format(T, $str_alt23$Using__S_for_quoted_paraphrase_of, agr_preds, cycl_3);
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_4 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_type_level_violations$.bind(NIL, thread);
                                                                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(dtr, cycl_3, matrix_phrase);
                                                                            if ((NIL != pph_phrase.pph_phrase_doneP(dtr)) && (NIL == string_utilities.starts_with(pph_phrase.pph_phrase_string(dtr, NIL), constant_reader.constant_reader_prefix()))) {
                                                                                {
                                                                                    SubLObject force = pph_utilities.pph_default_force_for_term(cycl_3);
                                                                                    SubLObject olist = pph_phrase.pph_phrase_output_list(dtr);
                                                                                    SubLObject string = pph_phrase.pph_phrase_output_list_string(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, force), NIL);
                                                                                    pph_phrase.pph_phrase_set_string(phrase, format_nil.format_nil_s(string));
                                                                                }
                                                                                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_type_level_violations$.rebind(_prev_bind_0_4, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        format(T, $str_alt24$__Using_nospace_paraphrase_for__S, phrase);
                                                                    }
                                                                    {
                                                                        SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(dtr, cycl, matrix_phrase);
                                                                        pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
                                                                        pph_phrase.pph_phrase_set_string(phrase, pph_phrase.pph_phrase_string(dtr, UNPROVIDED));
                                                                        pph_phrase.pph_phrase_set_output_list(phrase, com.cyc.cycjava.cycl.pph_phrase_resolution.pph_nospace_phrase_output_list_from_dtr(dtr), UNPROVIDED);
                                                                        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                                        pph_phrase.pph_phrase_note_done(phrase);
                                                                    }
                                                                } else {
                                                                    if (NIL != pph_phrase.pph_terse_phrase_p(phrase)) {
                                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                            format(T, $str_alt25$__Using_terse_paraphrase_for__S__, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                                                        }
                                                                        {
                                                                            SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                            {
                                                                                SubLObject _prev_bind_0_5 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                                                                                try {
                                                                                    pph_vars.$pph_terse_modeP$.bind(T, thread);
                                                                                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(dtr, cycl, matrix_phrase);
                                                                                } finally {
                                                                                    pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_5, thread);
                                                                                }
                                                                            }
                                                                            pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
                                                                            pph_phrase.pph_phrase_set_string(phrase, pph_phrase.pph_phrase_string(dtr, UNPROVIDED));
                                                                            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                                        }
                                                                    } else {
                                                                        if (NIL != pph_phrase.pph_precise_phrase_p(phrase)) {
                                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                format(T, $str_alt26$__Using_precise_paraphrase_for__S, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                                                            }
                                                                            {
                                                                                SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                                SubLTrampolineFile.checkType(T, PPH_PRECISION_P);
                                                                                {
                                                                                    SubLObject _prev_bind_0_6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                                                    try {
                                                                                        pph_vars.$paraphrase_precision$.bind(T, thread);
                                                                                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? ((SubLObject) (pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(dtr, cycl, matrix_phrase);
                                                                                    } finally {
                                                                                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_1, thread);
                                                                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_6, thread);
                                                                                    }
                                                                                }
                                                                                pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
                                                                                pph_phrase.pph_phrase_set_string(phrase, pph_phrase.pph_phrase_string(dtr, UNPROVIDED));
                                                                                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                                            }
                                                                        } else {
                                                                            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                                                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string_from_dtrs(phrase, cycl);
                                                                            } else {
                                                                                if (NIL != pph_phrase.pph_unknown_cycl_p(cycl)) {
                                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                        Errors.warn($str_alt28$__Unknown_cycl_for__S___, phrase);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject argnum = ((NIL != el_formula_p(cycl)) && (NIL == pph_utilities.pph_formula_with_dotsP(cycl))) ? ((SubLObject) (position(function_terms.nart_to_naut(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)), cycl, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                                                                                    SubLTrampolineFile.checkType(pph_utilities.paraphrase_precision_for_arg(argnum, cycl), PPH_PRECISION_P);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_7 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(argnum, cycl), thread);
                                                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                                format(T, $str_alt29$__Using_precision__S__, pph_utilities.pph_current_precision());
                                                                                            }
                                                                                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_string(phrase, matrix_phrase);
                                                                                        } finally {
                                                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_7, thread);
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
                            }
                        }
                    }
                } finally {
                    $pph_phrase_get_string_depth$.rebind(_prev_bind_0, thread);
                }
            }
            pph_drs.pph_possibly_update_np_index(phrase);
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_maybe_throw_hl_supports(phrase);
            return values(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), phrase);
        }
    }

    /**
     *
     *
     * @param PHRASE;
    PPH-PHRASE-P
     * 		
     * @param CYCL;
     * 		The top-level cycl we're paraphrasing.
     * @param MATRIX-PHRASE;
     * 		PPH-PHRASE-P - the mother of PHRASE.
     * @unknown STRINGP; the best string value we can make for PHRASE.
     * @unknown PPH-PHRASE; the updated version of PHRASE.
     */
    @LispMethod(comment = "@param PHRASE;\nPPH-PHRASE-P\r\n\t\t\r\n@param CYCL;\r\n\t\tThe top-level cycl we\'re paraphrasing.\r\n@param MATRIX-PHRASE;\r\n\t\tPPH-PHRASE-P - the mother of PHRASE.\r\n@unknown STRINGP; the best string value we can make for PHRASE.\r\n@unknown PPH-PHRASE; the updated version of PHRASE.")
    public static SubLObject pph_phrase_get_string(final SubLObject phrase, SubLObject cycl, SubLObject matrix_phrase) {
        if (cycl == UNPROVIDED) {
            cycl = $PHRASE_CYCL;
        }
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $pph_phrase_get_string_depth$.currentBinding(thread);
        try {
            $pph_phrase_get_string_depth$.bind(number_utilities.f_1X($pph_phrase_get_string_depth$.getDynamicValue(thread)), thread);
            if ($pph_phrase_get_string_depth$.getDynamicValue(thread).numG($pph_phrase_get_string_max_depth$.getDynamicValue(thread))) {
                final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str7$__Exceeded_PPH_PHRASE_GET_STRING_) });
                pph_error.pph_handle_error(new_format_string, list($pph_phrase_get_string_max_depth$.getDynamicValue(thread), phrase));
            }
            if ($PHRASE_CYCL == cycl) {
                cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            }
            pph_phrase.pph_phrase_check_impossible(phrase, UNPROVIDED);
            if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                    pph_phrase_resolve_condition(phrase, cycl, matrix_phrase);
                    if (NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
                        final SubLObject string = pph_phrase_get_string(phrase, cycl, matrix_phrase);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str8$__Resolved_conditional_phrase_to_, string, pph_phrase.pph_phrase_agr(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                } else
                    if (NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
                        pph_note_unfinished_phrase(phrase, UNPROVIDED);
                    } else
                        if (NIL != pph_phrase.pph_cycl_phrase_p(phrase)) {
                            final SubLObject cycl_$1 = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                            if (NIL != pph_phrase.pph_unknown_cycl_p(cycl_$1)) {
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str9$Tried_to_generating_CycL_phrase_w, phrase);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                pph_phrase.pph_phrase_clear_special_type(phrase);
                                final SubLObject string2 = pph_phrase_get_string(phrase, cycl_$1, matrix_phrase);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str10$Resolved_formerly_CycL_phrase_wit, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else
                                if (NIL != cycl_variables.el_varP(cycl_$1)) {
                                    final SubLObject olist = pph_methods.pph_paraphrase_var_as_var(cycl_$1, NIL, phrase);
                                    pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                    pph_phrase.pph_phrase_note_done(phrase);
                                } else {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str11$__Using_CycL_for_object___S___, cycl_$1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    pph_phrase.pph_phrase_set_string(phrase, prin1_to_string(function_terms.nart_to_naut(cycl_$1)));
                                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                }

                        } else
                            if (NIL != anaphor_needed_for_phraseP(phrase)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str12$__Doing_anaphor_paraphrase_with_f, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != reflexive_needed_for_phraseP(phrase)) {
                                    pph_phrase.pph_phrase_set_string(phrase, pph_methods_lexicon.pph_introduce_reflexive(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                                } else {
                                    pph_methods_lexicon.pph_generate_pronoun(phrase);
                                }
                            } else
                                if (NIL != pph_phrase.pph_coordination_phrase_p(phrase)) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str13$__Doing_coordination_paraphrase_w, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
                                    final SubLObject bullets_okP = makeBoolean((NIL != pph_phrase.pph_phrase_p(mother, UNPROVIDED)) || pph_vars.current_generation_level().numG(pph_vars.$pph_use_bulleted_lists_min_level$.getDynamicValue(thread)));
                                    final SubLObject suspendP = makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL == bullets_okP));
                                    final SubLObject _prev_bind_0_$2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_use_bulleted_listsP$.bind(makeBoolean((NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) && (NIL != bullets_okP)), thread);
                                        if ((NIL != suspendP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                            format_nil.force_format(T, $str14$__Suspending_bullet_use_for____S_, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        pph_coordination_phrase_get_string(phrase, cycl);
                                        if ((NIL != suspendP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                            format_nil.force_format(T, $str15$__Turning_bullet_use_back_on___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$2, thread);
                                    }
                                } else
                                    if (NIL != pph_phrase.pph_chemical_formula_from_lists_phrase_p(phrase)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format_nil.force_format(T, $str16$__Doing_chemical_formula_from_lis, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        pph_chemical_formula_from_lists_phrase_get_string(phrase);
                                    } else
                                        if (NIL != pph_phrase.pph_percent_phrase_p(phrase)) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str17$__Doing_percent_paraphrase___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pph_percent_phrase_get_string(phrase, cycl);
                                        } else
                                            if (NIL != pph_phrase.pph_symbol_phrase_p(phrase)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format_nil.force_format(T, $str18$__Generating_symbol_paraphrase_of, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                pph_symbol_phrase_get_string(phrase);
                                            } else
                                                if ((NIL != pph_phrase.pph_string_mention_phrase_p(phrase)) && (NIL != pph_string.pph_string_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)))) {
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                        format_nil.force_format(T, $str19$__Using_quoted_string_for_string_, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    pph_phrase.pph_phrase_set_string(pph_phrase.pph_phrase_head_dtr(phrase), format_nil.format_nil_a(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)));
                                                } else
                                                    if (NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(phrase)) {
                                                        pph_quoted_phrase_get_string(phrase, matrix_phrase);
                                                    } else
                                                        if (NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
                                                            pph_nospace_phrase_get_string(phrase, cycl, matrix_phrase);
                                                        } else
                                                            if (NIL != pph_phrase.pph_terse_phrase_p(phrase)) {
                                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                    format_nil.force_format(T, $str20$__Using_terse_paraphrase_for__S__, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                final SubLObject _prev_bind_0_$3 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
                                                                try {
                                                                    pph_vars.$pph_terse_modeP$.bind(T, thread);
                                                                    pph_phrase_get_string(dtr, cycl, matrix_phrase);
                                                                } finally {
                                                                    pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0_$3, thread);
                                                                }
                                                                pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
                                                                pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), UNPROVIDED);
                                                                pph_phrase.pph_phrase_note_done(phrase);
                                                                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                            } else
                                                                if (NIL != pph_phrase.pph_precise_phrase_p(phrase)) {
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                        format_nil.force_format(T, $str21$__Using_precise_paraphrase_for__S, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                                                    assert NIL != pph_utilities.pph_precision_p(T) : "! pph_utilities.pph_precision_p( .T) " + ("pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) ") + T;
                                                                    final SubLObject _prev_bind_0_$4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$paraphrase_precision$.bind(T, thread);
                                                                        pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
                                                                        pph_phrase_get_string(dtr, cycl, matrix_phrase);
                                                                    } finally {
                                                                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                                                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$4, thread);
                                                                    }
                                                                    pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
                                                                    pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), UNPROVIDED);
                                                                    pph_phrase.pph_phrase_note_done(phrase);
                                                                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                                                                } else
                                                                    if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                                                        pph_phrase_get_string_from_dtrs(phrase, cycl);
                                                                    } else {
                                                                        if (((NIL != pph_phrase.pph_unknown_cycl_p(cycl)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                                            Errors.warn($str23$__Unknown_cycl_for__S___, phrase);
                                                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                                        }
                                                                        final SubLObject argnum = ((NIL != el_formula_p(cycl)) && (NIL == pph_utilities.pph_formula_with_dotsP(cycl))) ? position(function_terms.nart_to_naut(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED)), cycl, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                                        assert NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(argnum, cycl)) : "! pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(argnum, cycl)) " + ("pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(argnum, cycl)) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(argnum, cycl)) ") + pph_utilities.paraphrase_precision_for_arg(argnum, cycl);
                                                                        final SubLObject _prev_bind_0_$5 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(argnum, cycl), thread);
                                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                                format_nil.force_format(T, $str24$__Using_precision__S__, pph_utilities.pph_current_precision(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                            pph_phrase_resolve_string(phrase, matrix_phrase);
                                                                        } finally {
                                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$5, thread);
                                                                        }
                                                                    }













            }
        } finally {
            $pph_phrase_get_string_depth$.rebind(_prev_bind_0, thread);
        }
        pph_drs.pph_possibly_update_np_index(phrase);
        pph_phrase_maybe_throw_hl_supports(phrase);
        return values(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), phrase);
    }

    public static SubLObject pph_quoted_phrase_get_string(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str25$__Using_quoted_paraphrase_for_ter, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
        final SubLObject agr_preds = pph_utilities.pph_default_nl_preds_for_term(cycl);
        pph_phrase.pph_phrase_set_agr_preds(dtr, agr_preds, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str26$Using__S_for_quoted_paraphrase_of, agr_preds, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_type_level_violations$.currentBinding(thread);
        try {
            pph_vars.$pph_type_level_violations$.bind(NIL, thread);
            pph_phrase_get_string(dtr, cycl, matrix_phrase);
            if ((NIL != pph_phrase.pph_phrase_doneP(dtr)) && (NIL == string_utilities.starts_with(pph_phrase.pph_phrase_string(dtr, NIL), constant_reader.constant_reader_prefix()))) {
                final SubLObject force = pph_utilities.pph_default_force_for_term(cycl);
                final SubLObject olist = pph_phrase.pph_phrase_output_list(dtr);
                final SubLObject string = pph_phrase.pph_phrase_output_list_string(pph_phrase_output_list_add_sentential_force(olist, force), NIL);
                pph_phrase.pph_phrase_set_string(dtr, string);
                pph_phrase_set_output_list_from_finished_dtrs(phrase);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        } finally {
            pph_vars.$pph_type_level_violations$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject pph_nospace_phrase_get_string(final SubLObject phrase, final SubLObject cycl, final SubLObject matrix_phrase) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str27$__Using_nospace_paraphrase_for__S, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        pph_phrase_get_string(dtr, cycl, matrix_phrase);
        pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), NIL);
        pph_phrase.pph_phrase_set_output_list(phrase, pph_phrase.pph_phrase_output_list(dtr), UNPROVIDED);
        pph_phrase.pph_phrase_note_done(phrase);
        pph_phrase.pph_phrase_set_output_list(phrase, pph_nospace_phrase_output_list_from_dtr(dtr), UNPROVIDED);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
        pph_phrase.pph_phrase_note_done(phrase);
        return phrase;
    }

    public static final SubLObject pph_phrase_maybe_throw_hl_supports_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) && (NIL != pph_phrase.pph_phrase_doneP(phrase))) {
                {
                    SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_strings(phrase, NIL);
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.maybe_throw_pph_hl_supports(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), string, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), pph_phrase.pph_phrase_gather_supports(phrase));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject pph_phrase_maybe_throw_hl_supports(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) && (NIL != pph_phrase.pph_phrase_doneP(phrase))) {
            SubLObject cdolist_list_var = pph_phrase.pph_phrase_all_strings(phrase, NIL);
            SubLObject string = NIL;
            string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                maybe_throw_pph_hl_supports(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), string, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), pph_phrase.pph_phrase_gather_supports(phrase));
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject maybe_throw_pph_hl_supports_alt(SubLObject v_term, SubLObject string, SubLObject agr_preds, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != list_utilities.non_empty_list_p(supports)) && (NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread)))) {
                {
                    SubLObject datum = pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread);
                    SubLObject current = datum;
                    SubLObject target_term = NIL;
                    SubLObject target_string = NIL;
                    SubLObject target_preds = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    target_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    target_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    target_preds = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((string.equal(target_string) && v_term.equal(target_term)) && (NIL != pph_utilities.pph_filter_preds(target_preds, agr_preds, UNPROVIDED))) {
                            sublisp_throw($PPH_HL_SUPPORTS_FOUND, supports);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject maybe_throw_pph_hl_supports(final SubLObject v_term, final SubLObject string, final SubLObject agr_preds, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != list_utilities.non_empty_list_p(supports)) && (NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread)))) {
            SubLObject current;
            final SubLObject datum = current = pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread);
            SubLObject target_term = NIL;
            SubLObject target_string = NIL;
            SubLObject target_preds = NIL;
            destructuring_bind_must_consp(current, datum, $list28);
            target_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list28);
            target_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list28);
            target_preds = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((string.equal(target_string) && (NIL != czer_utilities.equals_elP(v_term, target_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != pph_utilities.pph_filter_preds(target_preds, agr_preds, UNPROVIDED))) {
                    sublisp_throw($PPH_HL_SUPPORTS_FOUND, supports);
                }
            } else {
                cdestructuring_bind_error(datum, $list28);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return PPH-OUTPUT-LIST-P; without adding spaces between the strings for the
    daughters of DTR, the daughter of a PPH-NOSPACE-PHRASE-P.
     */
    @LispMethod(comment = "@return PPH-OUTPUT-LIST-P; without adding spaces between the strings for the\r\ndaughters of DTR, the daughter of a PPH-NOSPACE-PHRASE-P.")
    public static final SubLObject pph_nospace_phrase_output_list_from_dtr_alt(SubLObject dtr) {
        {
            SubLObject gdtr_olists = NIL;
            SubLObject gdtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(dtr);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject gdtr = aref(vector_var, element_num);
                    gdtr_olists = cons(pph_phrase.pph_phrase_output_list(gdtr), gdtr_olists);
                    gdtr_num = add(gdtr_num, ONE_INTEGER);
                }
            }
            return list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(nreverse(gdtr_olists)));
        }
    }

    /**
     *
     *
     * @return PPH-OUTPUT-LIST-P; without adding spaces between the strings for the
    daughters of DTR, the daughter of a PPH-NOSPACE-PHRASE-P.
     */
    @LispMethod(comment = "@return PPH-OUTPUT-LIST-P; without adding spaces between the strings for the\r\ndaughters of DTR, the daughter of a PPH-NOSPACE-PHRASE-P.")
    public static SubLObject pph_nospace_phrase_output_list_from_dtr(final SubLObject dtr) {
        SubLObject gdtr_olists = NIL;
        SubLObject gdtr_num = ZERO_INTEGER;
        if (document.sign_constituents(dtr).isVector()) {
            final SubLObject vector_var = document.sign_constituents(dtr);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject gdtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                gdtr = aref(vector_var, element_num);
                gdtr_olists = cons(pph_phrase.pph_phrase_output_list(gdtr), gdtr_olists);
                gdtr_num = add(gdtr_num, ONE_INTEGER);
            }
        }
        return list(pph_data_structures.new_pph_phrase_output_item_nospace_group_from_olists(nreverse(gdtr_olists)));
    }

    /**
     * Resolve the string of PHRASE, whose generic args correspond to the arguments
     * in FORMULA, by getting the strings of its daughters and concatenating them.
     *
     * @param PHRASE;
    PPH-PHRASE-P
     * 		
     * @param FORMULA;
     * 		The top-level formula we're paraphrasing.
     * @unknown STRINGP or NIL; the best string value we can make for PHRASE.
     * @unknown PPH-PHRASE; the updated version of PHRASE.
     */
    @LispMethod(comment = "Resolve the string of PHRASE, whose generic args correspond to the arguments\r\nin FORMULA, by getting the strings of its daughters and concatenating them.\r\n\r\n@param PHRASE;\nPPH-PHRASE-P\r\n\t\t\r\n@param FORMULA;\r\n\t\tThe top-level formula we\'re paraphrasing.\r\n@unknown STRINGP or NIL; the best string value we can make for PHRASE.\r\n@unknown PPH-PHRASE; the updated version of PHRASE.\nResolve the string of PHRASE, whose generic args correspond to the arguments\nin FORMULA, by getting the strings of its daughters and concatenating them.")
    public static final SubLObject pph_phrase_get_string_from_dtrs_alt(SubLObject phrase, SubLObject formula) {
        pph_phrase.pph_phrase_set_subject_case(phrase);
        {
            SubLObject the_pred = pph_phrase.pph_agr_pred_from_coordinated_np_number(phrase);
            if (NIL != the_pred) {
                pph_phrase.pph_phrase_add_agr_pred(phrase, the_pred);
            }
        }
        {
            SubLObject resolvedP = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_try_to_resolve_dtr_strings(phrase, formula);
            if (resolvedP == $RESOLVED) {
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                if (pph_phrase.pph_phrase_category(phrase, UNPROVIDED) == $$PossessivePhrase) {
                    pph_main.possessivize_pph_phrase(phrase);
                }
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return values(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), phrase);
    }

    /**
     * Resolve the string of PHRASE, whose generic args correspond to the arguments
     * in FORMULA, by getting the strings of its daughters and concatenating them.
     *
     * @param PHRASE;
    		PPH-PHRASE-P
     * 		
     * @param FORMULA;
     * 		The top-level formula we're paraphrasing.
     * @unknown STRINGP or NIL; the best string value we can make for PHRASE.
     * @unknown PPH-PHRASE; the updated version of PHRASE.
     */
    @LispMethod(comment = "Resolve the string of PHRASE, whose generic args correspond to the arguments\r\nin FORMULA, by getting the strings of its daughters and concatenating them.\r\n\r\n@param PHRASE;\n\t\tPPH-PHRASE-P\r\n\t\t\r\n@param FORMULA;\r\n\t\tThe top-level formula we\'re paraphrasing.\r\n@unknown STRINGP or NIL; the best string value we can make for PHRASE.\r\n@unknown PPH-PHRASE; the updated version of PHRASE.\nResolve the string of PHRASE, whose generic args correspond to the arguments\nin FORMULA, by getting the strings of its daughters and concatenating them.")
    public static SubLObject pph_phrase_get_string_from_dtrs(final SubLObject phrase, final SubLObject formula) {
        pph_phrase.pph_phrase_set_subject_case(phrase);
        final SubLObject the_pred = pph_phrase.pph_agr_pred_from_coordinated_np_number(phrase);
        if (NIL != the_pred) {
            pph_phrase.pph_phrase_add_agr_pred(phrase, the_pred);
        }
        final SubLObject resolvedP = pph_phrase_try_to_resolve_dtr_strings(phrase, formula);
        if (resolvedP == $RESOLVED) {
            pph_phrase_set_output_list_from_finished_dtrs(phrase);
            if (pph_phrase.pph_phrase_category(phrase, UNPROVIDED).eql($$PossessivePhrase)) {
                pph_main.possessivize_pph_phrase(phrase);
            }
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return values(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), phrase);
    }

    /**
     *
     *
     * @return KEYWORDP; Either :RESOLVED or :NOT-RESOLVED
     */
    @LispMethod(comment = "@return KEYWORDP; Either :RESOLVED or :NOT-RESOLVED")
    public static final SubLObject pph_phrase_try_to_resolve_dtr_strings_alt(SubLObject phrase, SubLObject formula) {
        {
            SubLObject abortP = NIL;
            SubLObject successP = NIL;
            SubLObject repeated_phrase_dtrs_resolvedP = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_repeated_phrase_dtrs(phrase, formula);
            if (NIL == repeated_phrase_dtrs_resolvedP) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    Errors.warn($str_alt34$Couldn_t_resolve_repeated_dtrs_fo, phrase);
                }
                abortP = T;
            }
            if (NIL == abortP) {
                {
                    SubLObject unfinished_dtr_count = NIL;
                    SubLObject iteration_count = ZERO_INTEGER;
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt35$Starting_dtr_resolution_for_phras, pph_phrase.pph_phrase_suid(phrase));
                    }
                    {
                        SubLObject new_unfinished_count = NIL;
                        for (new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase); !(((NIL != abortP) || new_unfinished_count.isZero()) || unfinished_dtr_count.eql(new_unfinished_count)); new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase)) {
                            unfinished_dtr_count = new_unfinished_count;
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format(T, $str_alt36$___D_of__D_daughters_unfinished_, unfinished_dtr_count, pph_phrase.pph_phrase_dtr_count(phrase));
                            }
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
                                        if (NIL != abortP) {
                                        } else {
                                            if (NIL != pph_phrase.pph_phrase_impossible_p(dtr, UNPROVIDED)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    Errors.warn($str_alt37$Can_t_resolve_mother_due_to_impos, dtr);
                                                }
                                                abortP = T;
                                            } else {
                                                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_try_to_resolve_dtr_string(dtr, dtr_num, formula, phrase);
                                            }
                                        }
                                        dtr_num = add(dtr_num, ONE_INTEGER);
                                    }
                                }
                            }
                            iteration_count = add(iteration_count, ONE_INTEGER);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format(T, $str_alt38$Finished__S_iteration_s____D_of__, new SubLObject[]{ iteration_count, unfinished_dtr_count, pph_phrase.pph_phrase_dtr_count(phrase) });
                            }
                        }
                        successP = zerop(new_unfinished_count);
                    }
                }
                if (NIL == successP) {
                    {
                        SubLObject unfinished_dtrs = NIL;
                        SubLObject dtr_num = ZERO_INTEGER;
                        SubLObject vector_var = document.sign_constituents(phrase);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject dtr = aref(vector_var, element_num);
                                if (NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                                    unfinished_dtrs = cons(dtr, unfinished_dtrs);
                                }
                                dtr_num = add(dtr_num, ONE_INTEGER);
                            }
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            Errors.warn($str_alt39$Couldn_t_finish__S___because_of_u, phrase, unfinished_dtrs);
                        }
                    }
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(phrase, UNPROVIDED);
                }
            }
            if (NIL != successP) {
                return $RESOLVED;
            } else {
                return $NOT_RESOLVED;
            }
        }
    }

    /**
     *
     *
     * @return KEYWORDP; Either :RESOLVED or :NOT-RESOLVED
     */
    @LispMethod(comment = "@return KEYWORDP; Either :RESOLVED or :NOT-RESOLVED")
    public static SubLObject pph_phrase_try_to_resolve_dtr_strings(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = NIL;
        SubLObject successP = NIL;
        final SubLObject repeated_phrase_dtrs_resolvedP = pph_phrase_resolve_repeated_phrase_dtrs(phrase, formula);
        if (NIL == repeated_phrase_dtrs_resolvedP) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str32$Couldn_t_resolve_repeated_dtrs_fo, phrase);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            abortP = T;
        }
        if (NIL == abortP) {
            SubLObject unfinished_dtr_count = NIL;
            SubLObject iteration_count = ZERO_INTEGER;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str33$__Starting_dtr_resolution_for_phr, pph_phrase.pph_phrase_suid(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            SubLObject new_unfinished_count;
            SubLObject dtr_num;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (new_unfinished_count = NIL, new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase); ((NIL == abortP) && (!new_unfinished_count.isZero())) && (!unfinished_dtr_count.eql(new_unfinished_count)); new_unfinished_count = pph_phrase.pph_phrase_unfinished_dtr_count(phrase)) {
                unfinished_dtr_count = new_unfinished_count;
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str34$___D_of__D_daughters_unfinished_, unfinished_dtr_count, pph_phrase.pph_phrase_dtr_count(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    vector_var = document.sign_constituents(phrase);
                    backwardP_var = NIL;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        if (NIL == abortP) {
                            if (NIL != pph_phrase.pph_phrase_impossible_p(dtr, UNPROVIDED)) {
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str35$Can_t_resolve_mother_due_to_impos, dtr);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                abortP = T;
                            } else {
                                pph_phrase_try_to_resolve_dtr_string(dtr, dtr_num, formula, phrase);
                            }
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
                iteration_count = add(iteration_count, ONE_INTEGER);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str36$__Finished__S_iteration_s____D_of, iteration_count, pph_phrase.pph_phrase_unfinished_dtr_count(phrase), pph_phrase.pph_phrase_dtr_count(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            successP = zerop(new_unfinished_count);
            if (NIL == successP) {
                SubLObject unfinished_dtrs = NIL;
                SubLObject dtr_num2 = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var2 = document.sign_constituents(phrase);
                    final SubLObject backwardP_var2 = NIL;
                    SubLObject length2;
                    SubLObject v_iteration2;
                    SubLObject element_num2;
                    SubLObject dtr2;
                    for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                        element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                        dtr2 = aref(vector_var2, element_num2);
                        if (NIL == pph_phrase.pph_phrase_doneP(dtr2)) {
                            unfinished_dtrs = cons(dtr2, unfinished_dtrs);
                        }
                        dtr_num2 = add(dtr_num2, ONE_INTEGER);
                    }
                }
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str37$Couldn_t_finish__S___because_of_u, phrase, unfinished_dtrs);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                pph_note_unfinished_phrase(phrase, UNPROVIDED);
            }
        }
        if (NIL != successP) {
            return $RESOLVED;
        }
        return $NOT_RESOLVED;
    }

    /**
     * Given PHRASE, resolve any of its daughters that are PPH repeated phrases into
     * the sequence of phrases they stand for.
     *
     * @return BOOLEANP; Did everything go okay?
     */
    @LispMethod(comment = "Given PHRASE, resolve any of its daughters that are PPH repeated phrases into\r\nthe sequence of phrases they stand for.\r\n\r\n@return BOOLEANP; Did everything go okay?\nGiven PHRASE, resolve any of its daughters that are PPH repeated phrases into\nthe sequence of phrases they stand for.")
    public static final SubLObject pph_phrase_resolve_repeated_phrase_dtrs_alt(SubLObject phrase, SubLObject formula) {
        {
            SubLObject new_dtrs = NIL;
            SubLObject found_repeated_phrase_dtrP = NIL;
            SubLObject problemP = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL != problemP) {
                    } else {
                        if (NIL == pph_phrase.pph_repeated_phrase_p(dtr)) {
                            new_dtrs = cons(dtr, new_dtrs);
                        } else {
                            found_repeated_phrase_dtrP = T;
                            pph_phrase.pph_phrase_set_arg_position_map(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                            {
                                SubLObject expansion = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_repeated_phrase_expansion(dtr, formula);
                                if (NIL != list_utilities.non_empty_list_of_type_p(PPH_PHRASE_P, expansion)) {
                                    {
                                        SubLObject cdolist_list_var = expansion;
                                        SubLObject new_dtr = NIL;
                                        for (new_dtr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_dtr = cdolist_list_var.first()) {
                                            new_dtrs = cons(new_dtr, new_dtrs);
                                        }
                                    }
                                } else {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        Errors.warn($str_alt41$Problem_expanding_repeated_phrase, dtr);
                                    }
                                    problemP = T;
                                }
                            }
                        }
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            if (NIL != found_repeated_phrase_dtrP) {
                pph_phrase.set_pph_phrase_dtrs_from_list(phrase, nreverse(new_dtrs), UNPROVIDED);
            }
            return makeBoolean(NIL == problemP);
        }
    }

    /**
     * Given PHRASE, resolve any of its daughters that are PPH repeated phrases into
     * the sequence of phrases they stand for.
     *
     * @return BOOLEANP; Did everything go okay?
     */
    @LispMethod(comment = "Given PHRASE, resolve any of its daughters that are PPH repeated phrases into\r\nthe sequence of phrases they stand for.\r\n\r\n@return BOOLEANP; Did everything go okay?\nGiven PHRASE, resolve any of its daughters that are PPH repeated phrases into\nthe sequence of phrases they stand for.")
    public static SubLObject pph_phrase_resolve_repeated_phrase_dtrs(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dtrs = NIL;
        SubLObject found_repeated_phrase_dtrP = NIL;
        SubLObject problemP = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject expansion;
            SubLObject cdolist_list_var;
            SubLObject new_dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL == problemP) {
                    if (NIL == pph_phrase.pph_repeated_phrase_p(dtr)) {
                        new_dtrs = cons(dtr, new_dtrs);
                    } else {
                        found_repeated_phrase_dtrP = T;
                        pph_phrase.pph_phrase_set_arg_position_map(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                        expansion = pph_repeated_phrase_expansion(dtr, formula);
                        if (NIL != list_utilities.non_empty_list_of_type_p(PPH_PHRASE_P, expansion)) {
                            cdolist_list_var = expansion;
                            new_dtr = NIL;
                            new_dtr = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                new_dtrs = cons(new_dtr, new_dtrs);
                                cdolist_list_var = cdolist_list_var.rest();
                                new_dtr = cdolist_list_var.first();
                            } 
                        } else {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str40$Problem_expanding_repeated_phrase, dtr);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            problemP = T;
                        }
                    }
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        if (NIL != found_repeated_phrase_dtrP) {
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, nreverse(new_dtrs), UNPROVIDED);
        }
        return makeBoolean(NIL == problemP);
    }

    /**
     *
     *
     * @return LISTP of PPH-PHRASE-P objects, expanded from REPEATED-PHRASE.
     * @unknown We need FORMULA to know how many phrases to expand REPEATED-PHRASE into,
    and to get the real CycL for each of them.
     */
    @LispMethod(comment = "@return LISTP of PPH-PHRASE-P objects, expanded from REPEATED-PHRASE.\r\n@unknown We need FORMULA to know how many phrases to expand REPEATED-PHRASE into,\r\nand to get the real CycL for each of them.")
    public static final SubLObject pph_repeated_phrase_expansion_alt(SubLObject repeated_phrase, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_repeated_phrase_p(repeated_phrase)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(repeated_phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_REPEATED_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL == el_formula_p(formula)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    Errors.warn($str_alt43$PPH_REPEATED_PHRASE_EXPANSION_got, formula);
                }
                return list(repeated_phrase);
            }
            {
                SubLObject first_phrase = pph_phrase.pph_phrase_nth_dtr(repeated_phrase, ZERO_INTEGER);
                SubLObject first_cycl = pph_phrase.pph_phrase_cycl(first_phrase, UNPROVIDED);
                SubLObject make_generic_arg_sequenceP = makeBoolean((NIL != pph_phrase.pph_phrase_doneP(first_phrase)) && (NIL != pph_utilities.pph_arg_position_specifierP(first_cycl)));
                SubLObject all_phrases = NIL;
                if (NIL != make_generic_arg_sequenceP) {
                    all_phrases = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_generic_arg_sequence(first_phrase, formula);
                } else {
                    {
                        SubLObject _prev_bind_0 = $pph_repeated_phrase_lists$.currentBinding(thread);
                        try {
                            $pph_repeated_phrase_lists$.bind(NIL, thread);
                            {
                                SubLObject first_arg_position = pph_phrase.pph_repeated_phrase_first_arg_position(repeated_phrase);
                                SubLObject first_arg_num = list_utilities.last_one(first_arg_position);
                                SubLObject first_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(first_arg_position);
                                SubLObject sub_formula = cycl_utilities.hl_to_el(NIL != list_utilities.lengthG(first_arg_position, ONE_INTEGER, UNPROVIDED) ? ((SubLObject) (cycl_utilities.formula_arg_position(formula, butlast(first_arg_position, UNPROVIDED), UNPROVIDED))) : formula);
                                SubLObject formula_arity = formula_arity(sub_formula, UNPROVIDED);
                                if (!formula_arity.isInteger()) {
                                    all_phrases = cons(first_phrase, all_phrases);
                                } else {
                                    if (first_arg_num.numLE(formula_arity)) {
                                        all_phrases = cons(first_phrase, all_phrases);
                                        {
                                            SubLObject curr_arg_num = NIL;
                                            for (curr_arg_num = number_utilities.f_1X(first_arg_num); !curr_arg_num.numG(formula_arity); curr_arg_num = number_utilities.f_1X(curr_arg_num)) {
                                                {
                                                    SubLObject curr_arg_phrase = pph_phrase.pph_phrase_copy(first_phrase, UNPROVIDED, UNPROVIDED);
                                                    SubLObject curr_arg_position = list_utilities.replace_last(first_arg_position, curr_arg_num);
                                                    SubLObject curr_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(curr_arg_position);
                                                    pph_phrase.pph_phrase_cycl_subst(curr_cycl_template, first_cycl_template, curr_arg_phrase, symbol_function(EQUAL), UNPROVIDED);
                                                    if (pph_phrase.pph_phrase_cycl(curr_arg_phrase, UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(first_phrase, UNPROVIDED))) {
                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                            Errors.warn($str_alt44$Repeating_phrase__S, curr_arg_phrase);
                                                        }
                                                    }
                                                    all_phrases = cons(curr_arg_phrase, all_phrases);
                                                }
                                            }
                                        }
                                        all_phrases = nreverse(all_phrases);
                                    }
                                }
                                {
                                    SubLObject cdolist_list_var = all_phrases;
                                    SubLObject phrase = NIL;
                                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                        {
                                            SubLObject _prev_bind_0_8 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_keep_generic_argsP$.bind(T, thread);
                                                {
                                                    SubLObject map = pph_phrase.pph_phrase_arg_position_map(repeated_phrase);
                                                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_replace_generic_args(phrase, formula, map);
                                                }
                                            } finally {
                                                pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_current_list_items(phrase);
                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_repeated_phrase_increment();
                                    }
                                }
                            }
                        } finally {
                            $pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return all_phrases;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PPH-PHRASE-P objects, expanded from REPEATED-PHRASE.
     * @unknown We need FORMULA to know how many phrases to expand REPEATED-PHRASE into,
    and to get the real CycL for each of them.
     */
    @LispMethod(comment = "@return LISTP of PPH-PHRASE-P objects, expanded from REPEATED-PHRASE.\r\n@unknown We need FORMULA to know how many phrases to expand REPEATED-PHRASE into,\r\nand to get the real CycL for each of them.")
    public static SubLObject pph_repeated_phrase_expansion(final SubLObject repeated_phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(formula)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str41$PPH_REPEATED_PHRASE_EXPANSION_got, formula);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return list(repeated_phrase);
        }
        final SubLObject first_phrase = pph_phrase.pph_phrase_nth_dtr(repeated_phrase, ZERO_INTEGER);
        final SubLObject first_cycl = pph_phrase.pph_phrase_cycl(first_phrase, UNPROVIDED);
        final SubLObject make_generic_arg_sequenceP = makeBoolean((NIL != pph_phrase.pph_phrase_doneP(first_phrase)) && (NIL != pph_utilities.pph_arg_position_specifierP(first_cycl)));
        return NIL != make_generic_arg_sequenceP ? pph_generic_arg_sequence(first_phrase, formula) : pph_repeated_phrase_expansion_internal(repeated_phrase, first_phrase, formula);
    }

    public static SubLObject pph_repeated_phrase_expansion_internal(final SubLObject repeated_phrase, final SubLObject first_phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $pph_repeated_phrase_lists$.currentBinding(thread);
        try {
            $pph_repeated_phrase_lists$.bind(NIL, thread);
            final SubLObject first_arg_position = pph_phrase.pph_repeated_phrase_first_arg_position(repeated_phrase);
            final SubLObject first_arg_num = list_utilities.last_one(first_arg_position);
            final SubLObject first_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(first_arg_position);
            final SubLObject sub_formula = cycl_utilities.hl_to_el(NIL != list_utilities.lengthG(first_arg_position, ONE_INTEGER, UNPROVIDED) ? cycl_utilities.formula_arg_position(formula, butlast(first_arg_position, UNPROVIDED), UNPROVIDED) : formula);
            final SubLObject formula_arity = formula_arity(sub_formula, UNPROVIDED);
            SubLObject all_phrases = NIL;
            if (!formula_arity.isInteger()) {
                all_phrases = cons(first_phrase, all_phrases);
            } else
                if (first_arg_num.numLE(formula_arity)) {
                    all_phrases = cons(first_phrase, all_phrases);
                    SubLObject curr_arg_num;
                    for (curr_arg_num = NIL, curr_arg_num = number_utilities.f_1X(first_arg_num); !curr_arg_num.numG(formula_arity); curr_arg_num = number_utilities.f_1X(curr_arg_num)) {
                        all_phrases = cons(pph_one_repeated_phrase(first_phrase, first_arg_position, first_cycl_template, curr_arg_num), all_phrases);
                    }
                    all_phrases = nreverse(all_phrases);
                }

            SubLObject cdolist_list_var = all_phrases;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$6 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_keep_generic_argsP$.bind(T, thread);
                    final SubLObject map = pph_phrase.pph_phrase_arg_position_map(repeated_phrase);
                    pph_phrase_replace_generic_args(phrase, formula, map);
                } finally {
                    pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0_$6, thread);
                }
                pph_phrase_resolve_current_list_items(phrase);
                pph_phrase.pph_phrase_try_to_resolve_binding_phrases(phrase, UNPROVIDED);
                pph_repeated_phrase_increment();
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
            return all_phrases;
        } finally {
            $pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_one_repeated_phrase(final SubLObject first_phrase, final SubLObject first_arg_position, final SubLObject first_cycl_template, final SubLObject curr_arg_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_arg_phrase = pph_phrase.pph_phrase_copy(first_phrase, UNPROVIDED, UNPROVIDED);
        final SubLObject curr_arg_position = list_utilities.replace_last(first_arg_position, curr_arg_num);
        final SubLObject curr_cycl_template = pph_utilities.pph_cycl_template_from_arg_position(curr_arg_position);
        pph_phrase.pph_phrase_cycl_subst(curr_cycl_template, first_cycl_template, curr_arg_phrase, symbol_function(EQUAL), UNPROVIDED);
        if ((pph_phrase.pph_phrase_cycl(curr_arg_phrase, UNPROVIDED).equal(pph_phrase.pph_phrase_cycl(first_phrase, UNPROVIDED)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str43$Repeating_phrase__S, curr_arg_phrase);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return curr_arg_phrase;
    }

    public static final SubLObject pph_generic_arg_sequence_alt(SubLObject first_phrase, SubLObject formula) {
        {
            SubLObject all_phrases = NIL;
            pph_phrase.pph_phrase_set_string(first_phrase, cconcatenate(pph_phrase.pph_phrase_string(first_phrase, NIL), $str_alt45$__etc_));
            all_phrases = cons(first_phrase, all_phrases);
            return all_phrases;
        }
    }

    public static SubLObject pph_generic_arg_sequence(final SubLObject first_phrase, final SubLObject formula) {
        SubLObject all_phrases = NIL;
        pph_phrase.pph_phrase_set_string(first_phrase, cconcatenate(pph_phrase.pph_phrase_string(first_phrase, NIL), $str44$__etc_));
        all_phrases = cons(first_phrase, all_phrases);
        return all_phrases;
    }

    public static final SubLObject pph_current_list_item_alt(SubLObject list_expression, SubLObject offset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.pph_phrase_resolution.pph_extensional_list_p(list_expression)) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt46$Can_t_get_current_list_item_from_) });
                    pph_error.pph_handle_error(new_format_string, list(list_expression));
                }
                return NIL;
            }
            {
                SubLObject first_index = ZERO_INTEGER;
                SubLObject index = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_lookup_current_list_item(list_expression);
                if ($UNSPECIFIED == index) {
                    index = first_index;
                    $pph_repeated_phrase_lists$.setDynamicValue(list_utilities.alist_enter($pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, index, UNPROVIDED), thread);
                }
                return nth(add(index, offset), cycl_utilities.formula_args(list_expression, UNPROVIDED));
            }
        }
    }

    public static SubLObject pph_current_list_item(final SubLObject list_expression, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_extensional_list_p(list_expression)) {
            final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str45$Can_t_get_current_list_item_from_) });
            pph_error.pph_handle_error(new_format_string, list(list_expression));
            return NIL;
        }
        final SubLObject first_index = ZERO_INTEGER;
        SubLObject index = pph_lookup_current_list_item(list_expression);
        if ($UNSPECIFIED == index) {
            index = first_index;
            $pph_repeated_phrase_lists$.setDynamicValue(list_utilities.alist_enter($pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, index, UNPROVIDED), thread);
        }
        return nth(add(index, offset), cycl_utilities.formula_args(list_expression, UNPROVIDED));
    }

    public static final SubLObject pph_lookup_current_list_item_alt(SubLObject list_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.alist_lookup($pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, symbol_function(EQUAL), $UNSPECIFIED);
        }
    }

    public static SubLObject pph_lookup_current_list_item(final SubLObject list_expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup($pph_repeated_phrase_lists$.getDynamicValue(thread), list_expression, symbol_function(EQUAL), $UNSPECIFIED);
    }

    public static final SubLObject pph_extensional_list_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list_alt48)));
    }

    public static SubLObject pph_extensional_list_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list47)));
    }

    /**
     * Resolve any resolvable current-list items inside PHRASE.
     *
     * @unknown - Any inside a repeated phrase get dealt with separately.
     */
    @LispMethod(comment = "Resolve any resolvable current-list items inside PHRASE.\r\n\r\n@unknown - Any inside a repeated phrase get dealt with separately.")
    public static final SubLObject pph_phrase_resolve_current_list_items_alt(SubLObject phrase) {
        if (!((NIL != pph_phrase.pph_phrase_doneP(phrase)) || (NIL != pph_phrase.pph_repeated_phrase_p(phrase)))) {
            {
                SubLObject old_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject new_cycl = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_resolve_current_list_items(old_cycl);
                pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
                pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
            }
            if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                {
                    SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
                    SubLObject new_test = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_resolve_current_list_items(old_test);
                    pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
                    if (!old_test.equal(new_test)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt49$Updating__S_to____S____Result___S, new SubLObject[]{ old_test, new_test, pph_phrase.pph_conditional_phrase_test(phrase) });
                        }
                    }
                }
            }
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
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
                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_current_list_items(dtr);
                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return phrase;
    }

    /**
     * Resolve any resolvable current-list items inside PHRASE.
     *
     * @unknown - Any inside a repeated phrase get dealt with separately.
     */
    @LispMethod(comment = "Resolve any resolvable current-list items inside PHRASE.\r\n\r\n@unknown - Any inside a repeated phrase get dealt with separately.")
    public static SubLObject pph_phrase_resolve_current_list_items(final SubLObject phrase) {
        if ((NIL == pph_phrase.pph_phrase_doneP(phrase)) && (NIL == pph_phrase.pph_repeated_phrase_p(phrase))) {
            final SubLObject old_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            final SubLObject new_cycl = pph_resolve_current_list_items(old_cycl);
            pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
            if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                final SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
                final SubLObject new_test = pph_resolve_current_list_items(old_test);
                pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
                if ((!old_test.equal(new_test)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str48$Updating__S_to____S____Result___S, old_test, new_test, pph_phrase.pph_conditional_phrase_test(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
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
                        pph_phrase_resolve_current_list_items(dtr);
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
        }
        return phrase;
    }

    public static final SubLObject pph_resolve_current_list_items_alt(SubLObject expression) {
        return cycl_utilities.expression_transform(expression, PPH_CURRENT_LIST_ITEM_FORMULA_P, PPH_CURRENT_LIST_ITEM_FORMULA_ITEM, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_resolve_current_list_items(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, PPH_CURRENT_LIST_ITEM_FORMULA_P, PPH_CURRENT_LIST_ITEM_FORMULA_ITEM, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_current_list_item_formula_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list_alt52)));
    }

    public static SubLObject pph_current_list_item_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list51)));
    }

    public static final SubLObject pph_current_list_item_formula_item_alt(SubLObject cli_formula) {
        {
            SubLObject ans = NIL;
            SubLObject datum = cycl_utilities.nat_args(cli_formula, UNPROVIDED);
            SubLObject current = datum;
            SubLObject list_expression = NIL;
            SubLObject offset = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            list_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt53);
            offset = current.first();
            current = current.rest();
            if (NIL == current) {
                ans = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_current_list_item(list_expression, offset);
            } else {
                cdestructuring_bind_error(datum, $list_alt53);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt54$__Resolving__S_to__S__, cli_formula, ans);
            }
            return ans;
        }
    }

    public static SubLObject pph_current_list_item_formula_item(final SubLObject cli_formula) {
        SubLObject ans = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args(cli_formula, UNPROVIDED);
        SubLObject list_expression = NIL;
        SubLObject offset = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        list_expression = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        offset = current.first();
        current = current.rest();
        if (NIL == current) {
            ans = pph_current_list_item(list_expression, offset);
        } else {
            cdestructuring_bind_error(datum, $list52);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str53$__Resolving__S_to__S__, cli_formula, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return ans;
    }

    public static final SubLObject pph_repeated_phrase_increment_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_alist = NIL;
                SubLObject cdolist_list_var = $pph_repeated_phrase_lists$.getDynamicValue(thread);
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject list_expression = NIL;
                        SubLObject index = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt55);
                        list_expression = current.first();
                        current = current.rest();
                        index = current;
                        new_alist = list_utilities.alist_enter(new_alist, list_expression, number_utilities.f_1X(index), UNPROVIDED);
                    }
                }
                $pph_repeated_phrase_lists$.setDynamicValue(new_alist, thread);
            }
            return $pph_repeated_phrase_lists$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_repeated_phrase_increment() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_alist = NIL;
        SubLObject cdolist_list_var = $pph_repeated_phrase_lists$.getDynamicValue(thread);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject list_expression = NIL;
            SubLObject index = NIL;
            destructuring_bind_must_consp(current, datum, $list54);
            list_expression = current.first();
            current = index = current.rest();
            new_alist = list_utilities.alist_enter(new_alist, list_expression, number_utilities.f_1X(index), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        $pph_repeated_phrase_lists$.setDynamicValue(new_alist, thread);
        return $pph_repeated_phrase_lists$.getDynamicValue(thread);
    }

    public static final SubLObject pph_phrase_try_to_resolve_dtr_string_alt(SubLObject dtr, SubLObject dtr_num, SubLObject formula, SubLObject phrase) {
        if (NIL != pph_phrase.pph_conditional_phrase_p(dtr)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_condition(dtr, formula, phrase);
        }
        if (NIL == pph_phrase.pph_conditional_phrase_p(dtr)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_dtr_relative_agr(dtr, dtr_num, phrase);
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_phraseXdtr_agr(dtr, dtr_num, phrase);
            if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(dtr, $CLARIFYING)) {
                format(T, $str_alt57$pph_phrase_try_to_resolve_dtr_str, dtr, phrase);
                if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_clarifying_dtr(dtr, dtr_num, phrase, formula);
                } else {
                    pph_phrase.pph_phrase_note_not_done(dtr);
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(dtr, UNPROVIDED);
                }
            } else {
                if (NIL != pph_phrase.pph_phrase_doneP(dtr)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
                    if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_unify_pos_preds(phrase, dtr);
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_dtr(dtr, dtr_num, phrase, formula);
                    } else {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(dtr, UNPROVIDED);
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    public static SubLObject pph_phrase_try_to_resolve_dtr_string(final SubLObject dtr, final SubLObject dtr_num, final SubLObject formula, final SubLObject phrase) {
        if (NIL != pph_phrase.pph_conditional_phrase_p(dtr)) {
            pph_phrase_resolve_condition(dtr, formula, phrase);
        }
        if (NIL == pph_phrase.pph_conditional_phrase_p(dtr)) {
            pph_phrase_set_dtr_relative_agr(dtr, dtr_num, phrase);
            pph_note_phraseXdtr_agr(dtr, dtr_num, phrase);
            if (NIL != pph_phrase.pph_clarifying_phrase_p(dtr)) {
                if (NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
                    pph_phrase_resolve_clarifying_dtr(dtr, dtr_num, phrase, formula);
                } else {
                    pph_phrase.pph_phrase_note_not_done(dtr);
                    pph_note_unfinished_phrase(dtr, UNPROVIDED);
                }
            } else
                if (NIL != pph_phrase.pph_phrase_doneP(dtr)) {
                    pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
                    if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                        pph_phrase_unify_pos_preds(phrase, dtr);
                    }
                } else
                    if (NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
                        pph_phrase_resolve_dtr(dtr, dtr_num, phrase, formula);
                    } else {
                        pph_note_unfinished_phrase(dtr, UNPROVIDED);
                    }


        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    public static final SubLObject pph_phrase_resolve_clarifying_dtr_alt(SubLObject dtr, SubLObject dtr_num, SubLObject phrase, SubLObject formula) {
        {
            SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(dtr, phrase);
            SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, UNPROVIDED);
            SubLObject target_string = pph_phrase.pph_phrase_string(target, UNPROVIDED);
            if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.uninformative_paraphrase_p(target_string, target_cycl)) {
                pph_phrase.pph_phrase_note_done(dtr);
            } else {
                pph_phrase.pph_phrase_set_string(dtr, $str_alt58$);
            }
            return dtr;
        }
    }

    public static SubLObject pph_phrase_resolve_clarifying_dtr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase, final SubLObject formula) {
        final SubLObject target = pph_phrase_agr_target_phrase(dtr, phrase);
        final SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, UNPROVIDED);
        final SubLObject target_string = pph_phrase.pph_phrase_string(target, UNPROVIDED);
        if (NIL != uninformative_paraphrase_p(target_string, target_cycl)) {
            pph_phrase.pph_phrase_note_done(dtr);
        } else {
            pph_phrase.pph_phrase_set_string(dtr, $str55$);
        }
        return dtr;
    }

    public static final SubLObject pph_note_phraseXdtr_agr_alt(SubLObject dtr, SubLObject dtr_num, SubLObject phrase) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format(T, $str_alt59$__Phrase_agr___S__, pph_phrase.pph_phrase_agr(phrase));
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format(T, $str_alt60$___Dtr__D_category_is__S___, dtr_num, pph_phrase.pph_phrase_category(dtr, UNPROVIDED));
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format(T, $str_alt61$___Dtr__D_agr_is__S___, dtr_num, pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject pph_note_phraseXdtr_agr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str56$__Phrase_agr___S__, pph_phrase.pph_phrase_agr(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str57$___Dtr__D_category_is__S___, dtr_num, pph_phrase.pph_phrase_category(dtr, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str58$___Dtr__D_agr_is__S___, dtr_num, pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject pph_phrase_set_dtr_relative_agr_alt(SubLObject dtr, SubLObject dtr_num, SubLObject phrase) {
        {
            SubLObject dtr_agr = pph_phrase.pph_phrase_agr(dtr);
            SubLObject relative_agr_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(dtr_agr);
            SubLObject relative_constraint_type = (NIL != pph_utilities.pph_agr_constraint_p(relative_agr_constraint)) ? ((SubLObject) (pph_utilities.pph_agr_constraint_type(relative_agr_constraint))) : NIL;
            SubLObject old_target = (NIL != pph_utilities.pph_agr_constraint_typeP(relative_constraint_type)) ? ((SubLObject) (pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type))) : NIL;
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_relative_agr(dtr, phrase);
            if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
                if (!((NIL == old_target) || pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type).equal(old_target))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt62$__Set_agr_of_dtr___D_to__S___, dtr_num, pph_phrase.pph_phrase_agr_constraint_of_type(dtr, relative_constraint_type));
                    }
                }
                if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_unify_pos_preds(phrase, dtr);
                    if (!((NIL == old_target) || old_target.equal(pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type)))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt63$___Set_head_agr_to__S___, pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type));
                        }
                    }
                }
            }
        }
        return dtr;
    }

    public static SubLObject pph_phrase_set_dtr_relative_agr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase) {
        final SubLObject dtr_agr = pph_phrase.pph_phrase_agr(dtr);
        final SubLObject relative_agr_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(dtr_agr);
        final SubLObject relative_constraint_type = (NIL != pph_utilities.pph_agr_constraint_p(relative_agr_constraint)) ? pph_utilities.pph_agr_constraint_type(relative_agr_constraint) : NIL;
        final SubLObject old_target = (NIL != pph_utilities.pph_agr_constraint_typeP(relative_constraint_type)) ? pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type) : NIL;
        pph_phrase_set_relative_agr(dtr, phrase);
        if (NIL != pph_phrase_agr_target_resolvedP(dtr, phrase, UNPROVIDED)) {
            if (((NIL != old_target) && (!pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type).equal(old_target))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str59$__Set_agr_of_dtr___D_to__S___, dtr_num, pph_phrase.pph_phrase_agr_constraint_of_type(dtr, relative_constraint_type), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                pph_phrase_unify_pos_preds(phrase, dtr);
                if (((NIL != old_target) && (!old_target.equal(pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type)))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                    format_nil.force_format(T, $str60$___Set_head_agr_to__S___, pph_phrase.pph_phrase_agr_target_of_type(dtr, relative_constraint_type), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return dtr;
    }

    /**
     * Try to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,
     * whose generic args correspond to FORMULA
     */
    @LispMethod(comment = "Try to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,\r\nwhose generic args correspond to FORMULA\nTry to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,\nwhose generic args correspond to FORMULA")
    public static final SubLObject pph_phrase_resolve_dtr_alt(SubLObject dtr, SubLObject dtr_num, SubLObject phrase, SubLObject formula) {
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(dtr, formula, phrase);
        if (NIL != pph_phrase.pph_phrase_doneP(dtr)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt64$__Finished__S____with__D_dtrs____, dtr, pph_phrase.pph_phrase_dtr_count(dtr));
            }
            if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt65$___Set_phrase_agr_to__S_based_on_, pph_phrase.pph_phrase_agr(phrase));
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt66$___Dtrs_left_unfinished___D___, pph_phrase.pph_phrase_unfinished_dtr_count(phrase));
            }
        } else {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_note_unfinished_phrase(dtr, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     * Try to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,
     * whose generic args correspond to FORMULA
     */
    @LispMethod(comment = "Try to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,\r\nwhose generic args correspond to FORMULA\nTry to come up with a string for DTR, the DTR-NUMth dtr of PHRASE,\nwhose generic args correspond to FORMULA")
    public static SubLObject pph_phrase_resolve_dtr(final SubLObject dtr, final SubLObject dtr_num, final SubLObject phrase, final SubLObject formula) {
        pph_phrase_get_string(dtr, formula, phrase);
        if (NIL != pph_phrase.pph_phrase_doneP(dtr)) {
            pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str61$__Finished__S____with__D_dtrs____, dtr, pph_phrase.pph_phrase_dtr_count(dtr), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                pph_phrase.pph_phrase_set_agr(phrase, pph_phrase.pph_phrase_agr(dtr), UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str62$___Set_phrase_agr_to__S_based_on_, pph_phrase.pph_phrase_agr(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str63$___Dtrs_left_unfinished___D___, pph_phrase.pph_phrase_unfinished_dtr_count(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else {
            pph_note_unfinished_phrase(dtr, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     * Convert PHRASE and any of its daughters, if so reserved, to arg0 semantics.
     */
    @LispMethod(comment = "Convert PHRASE and any of its daughters, if so reserved, to arg0 semantics.")
    public static final SubLObject pph_phrase_set_arg0_items_alt(SubLObject phrase, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_maybe_make_arg0_item(phrase, arg_position_map);
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
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
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
        }
        return phrase;
    }

    /**
     * Convert PHRASE and any of its daughters, if so reserved, to arg0 semantics.
     */
    @LispMethod(comment = "Convert PHRASE and any of its daughters, if so reserved, to arg0 semantics.")
    public static SubLObject pph_phrase_set_arg0_items(final SubLObject phrase, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        pph_phrase_maybe_make_arg0_item(phrase, arg_position_map);
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
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
                    pph_phrase_set_arg0_items(dtr, pph_phrase.pph_phrase_arg_position_map(phrase));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    /**
     * Convert DTR, if so reserved, to arg0 semantics.
     */
    @LispMethod(comment = "Convert DTR, if so reserved, to arg0 semantics.")
    public static final SubLObject pph_phrase_maybe_make_arg0_item_alt(SubLObject dtr, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (((NIL != pph_phrase.pph_phrase_doneP(dtr)) && (NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P())) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_ok_for_arg0P(dtr))) {
            {
                SubLObject arg0 = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0(dtr);
                SubLObject arg0_position = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0_position(dtr);
                SubLObject global_arg0_position = pph_utilities.pph_arg_position_lookup(arg0_position, arg_position_map);
                if (NIL != pph_utilities.pph_unknown_arg_position_p(global_arg0_position)) {
                    global_arg0_position = pph_phrase.pph_current_arg0_position();
                }
                if ((NIL != pph_utilities.pph_arg_position_p(global_arg0_position)) && (NIL == pph_phrase.pph_unknown_cycl_p(arg0))) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_make_arg0_item(dtr, arg0, global_arg0_position);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     * Convert DTR, if so reserved, to arg0 semantics.
     */
    @LispMethod(comment = "Convert DTR, if so reserved, to arg0 semantics.")
    public static SubLObject pph_phrase_maybe_make_arg0_item(final SubLObject dtr, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (((NIL != pph_phrase.pph_phrase_doneP(dtr)) && (NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P())) && (NIL != pph_phrase_ok_for_arg0P(dtr))) {
            final SubLObject arg0 = pph_phrase_reserved_arg0(dtr);
            final SubLObject arg0_position = pph_phrase_reserved_arg0_position(dtr);
            SubLObject global_arg0_position = pph_utilities.pph_arg_position_lookup(arg0_position, arg_position_map);
            if (NIL != pph_utilities.pph_unknown_arg_position_p(global_arg0_position)) {
                global_arg0_position = pph_phrase.pph_current_arg0_position();
            }
            if ((NIL != pph_utilities.pph_arg_position_p(global_arg0_position)) && (NIL == pph_phrase.pph_unknown_cycl_p(arg0))) {
                pph_phrase_make_arg0_item(dtr, arg0, global_arg0_position);
            }
        }
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     * Convert DTR to link to arg0 semantics.
     */
    @LispMethod(comment = "Convert DTR to link to arg0 semantics.")
    public static final SubLObject pph_phrase_make_arg0_item_alt(SubLObject dtr, SubLObject arg0, SubLObject global_arg_position) {
        pph_phrase.pph_phrase_set_arg_position(dtr, global_arg_position);
        if (NIL == pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED)) {
            pph_phrase.pph_phrase_set_cycl(dtr, arg0);
        }
        pph_phrase.pph_phrase_set_link_cycl(dtr, arg0);
        pph_phrase.pph_phrase_set_output_list_cycl(dtr, arg0);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_maybe_recompute_mothers_output_list_from_dtrs(dtr);
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     * Convert DTR to link to arg0 semantics.
     */
    @LispMethod(comment = "Convert DTR to link to arg0 semantics.")
    public static SubLObject pph_phrase_make_arg0_item(final SubLObject dtr, final SubLObject arg0, final SubLObject global_arg_position) {
        pph_phrase.pph_phrase_set_arg_position(dtr, global_arg_position);
        if (NIL == pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED)) {
            pph_phrase.pph_phrase_set_cycl(dtr, arg0);
        }
        pph_phrase.pph_phrase_set_link_cycl(dtr, arg0);
        pph_phrase.pph_phrase_set_output_list_cycl(dtr, arg0);
        pph_phrase.pph_phrase_maybe_add_anchor_tags(dtr);
        return pph_phrase.pph_phrase_output_list(dtr);
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE not constrained to agree with another phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE not constrained to agree with another phrase?")
    public static final SubLObject pph_phrase_independent_phraseP_alt(SubLObject phrase) {
        return sublisp_null(pph_data_structures.pph_phrase_agr_relative_constraint(pph_phrase.pph_phrase_agr(phrase)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE not constrained to agree with another phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE not constrained to agree with another phrase?")
    public static SubLObject pph_phrase_independent_phraseP(final SubLObject phrase) {
        return sublisp_null(pph_data_structures.pph_phrase_agr_relative_constraint(pph_phrase.pph_phrase_agr(phrase)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is the agr target of PHRASE resolved?
     */
    @LispMethod(comment = "@return BOOLEAN; Is the agr target of PHRASE resolved?")
    public static final SubLObject pph_phrase_agr_target_resolvedP_alt(SubLObject phrase, SubLObject mother, SubLObject mother_must_be_doneP) {
        if (mother_must_be_doneP == UNPROVIDED) {
            mother_must_be_doneP = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_independent_phraseP(phrase)) {
            return T;
        }
        {
            SubLObject agr_target_phrase = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, mother);
            if (NIL != pph_phrase.pph_phrase_doneP(agr_target_phrase)) {
                return T;
            } else {
                if (agr_target_phrase == $MOTHER) {
                    if (NIL != mother_must_be_doneP) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt68$__Agr_target__mother__not_resolve, agr_target_phrase);
                        }
                        return NIL;
                    } else {
                        return T;
                    }
                } else {
                    if (phrase == agr_target_phrase) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            Errors.warn($str_alt69$__Phrase_agrees_with_itself_____);
                        }
                        return T;
                    } else {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt70$__Agr_target_not_resolved___S___, agr_target_phrase);
                        }
                        return NIL;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is the agr target of PHRASE resolved?
     */
    @LispMethod(comment = "@return BOOLEAN; Is the agr target of PHRASE resolved?")
    public static SubLObject pph_phrase_agr_target_resolvedP(final SubLObject phrase, final SubLObject mother, SubLObject mother_must_be_doneP) {
        if (mother_must_be_doneP == UNPROVIDED) {
            mother_must_be_doneP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase_independent_phraseP(phrase)) {
            return T;
        }
        final SubLObject agr_target_phrase = pph_phrase_agr_target_phrase(phrase, mother);
        if (NIL != pph_phrase.pph_phrase_doneP(agr_target_phrase)) {
            return T;
        }
        if (agr_target_phrase == $MOTHER) {
            if (NIL != mother_must_be_doneP) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str65$__Agr_target__mother__not_resolve, agr_target_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return NIL;
            }
            return T;
        } else {
            if (phrase.eql(agr_target_phrase)) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str66$__Phrase_agrees_with_itself_____);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return T;
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str67$__Agr_target_not_resolved___S___, agr_target_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Set the OUTPUT-LIST slot of PHRASE from its daughters, all of which have strings.
     */
    @LispMethod(comment = "Set the OUTPUT-LIST slot of PHRASE from its daughters, all of which have strings.")
    public static final SubLObject pph_phrase_set_output_list_from_finished_dtrs_alt(SubLObject phrase) {
        {
            SubLObject output_items = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt71$Setting_mother_s_output_list_from) });
                            pph_error.pph_handle_error(new_format_string, list(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED), dtr));
                        }
                    }
                    {
                        SubLObject dtr_output_list = pph_phrase.pph_phrase_output_list(dtr);
                        SubLObject cdolist_list_var = dtr_output_list;
                        SubLObject dtr_item = NIL;
                        for (dtr_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dtr_item = cdolist_list_var.first()) {
                            if (((NIL != output_items) && (NIL != pph_utilities.pph_final_punctuation_string_p(pph_data_structures.pph_phrase_output_item_string(dtr_item)))) && (NIL != pph_utilities.pph_bulleted_list_end_itemP(output_items.first()))) {
                                {
                                    SubLObject insert_position = (NIL != pph_utilities.pph_bulleted_list_item_end_itemP(second(output_items))) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
                                    output_items = list_utilities.ninsert_by_position(dtr_item, output_items, insert_position);
                                }
                            } else {
                                output_items = cons(dtr_item, output_items);
                            }
                        }
                    }
                    if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                        pph_phrase.pph_phrase_set_agr_preds(phrase, pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED), UNPROVIDED);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            pph_phrase.pph_phrase_set_output_list(phrase, nreverse(delete_if(PPH_PHRASE_OUTPUT_ITEM_EMPTY_P, output_items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    /**
     * Set the OUTPUT-LIST slot of PHRASE from its daughters, all of which have strings.
     */
    @LispMethod(comment = "Set the OUTPUT-LIST slot of PHRASE from its daughters, all of which have strings.")
    public static SubLObject pph_phrase_set_output_list_from_finished_dtrs(final SubLObject phrase) {
        if (NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
            pph_phrase.pph_phrase_set_output_list(phrase, pph_nospace_phrase_output_list_from_dtr(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER)), UNPROVIDED);
        } else
            if (NIL != pph_phrase.pph_quoted_paraphrase_phrase_p(phrase)) {
                final SubLObject nospace_olist = pph_nospace_phrase_output_list_from_dtr(phrase);
                final SubLObject nospace_item = list_utilities.only_one(nospace_olist);
                final SubLObject old_items = pph_data_structures.pph_phrase_output_item_nospace_group_items(nospace_item);
                final SubLObject new_items = cons(list(pph_data_structures.new_pph_phrase_output_item($str68$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), list_utilities.add_to_end(list(pph_data_structures.new_pph_phrase_output_item($str68$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), old_items));
                pph_data_structures.pph_phrase_output_item_nospace_group_set_items(nospace_item, new_items);
                pph_phrase.pph_phrase_set_output_list(phrase, list(nospace_item), UNPROVIDED);
            } else {
                SubLObject output_items = NIL;
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject new_format_string;
                    SubLObject dtr_output_list;
                    SubLObject cdolist_list_var;
                    SubLObject dtr_item;
                    SubLObject insert_position;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        if (NIL == pph_phrase.pph_phrase_doneP(dtr)) {
                            new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str69$Setting_mother_s_output_list_from) });
                            pph_error.pph_handle_error(new_format_string, list(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED), dtr));
                        }
                        dtr_output_list = pph_phrase.pph_phrase_output_list(dtr);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str70$_Dth_dtr_output_list___S, dtr_num, dtr_output_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cdolist_list_var = dtr_output_list;
                        dtr_item = NIL;
                        dtr_item = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (((NIL != output_items) && (NIL != pph_utilities.pph_final_punctuation_string_p(pph_data_structures.pph_phrase_output_item_string(dtr_item)))) && (NIL != pph_utilities.pph_bulleted_list_end_itemP(output_items.first()))) {
                                insert_position = (NIL != pph_utilities.pph_bulleted_list_item_end_itemP(second(output_items))) ? TWO_INTEGER : ONE_INTEGER;
                                output_items = list_utilities.ninsert_by_position(dtr_item, output_items, insert_position);
                            } else {
                                output_items = cons(dtr_item, output_items);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dtr_item = cdolist_list_var.first();
                        } 
                        if (NIL != pph_phrase.pph_phrase_head_dtr_numP(phrase, dtr_num)) {
                            pph_phrase.pph_phrase_set_agr_preds(phrase, pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED), UNPROVIDED);
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
                pph_phrase.pph_phrase_set_output_list(phrase, nreverse(delete_if(PPH_PHRASE_OUTPUT_ITEM_EMPTY_P, output_items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }

        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_phrase_output_item_empty_p_alt(SubLObject item) {
        return makeBoolean((((NIL != string_utilities.empty_string_p(pph_data_structures.pph_phrase_output_item_string(item))) && (NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_open_tag(item)))) && (NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_close_tag(item)))) && (NIL == pph_phrase.pph_known_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item))));
    }

    public static SubLObject pph_phrase_output_item_empty_p(final SubLObject item) {
        return makeBoolean((((NIL != list_utilities.lengthE(pph_data_structures.pph_phrase_output_item_string(item), ZERO_INTEGER, UNPROVIDED)) && (NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_open_tag(item)))) && (NIL == string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_html_close_tag(item)))) && (NIL == pph_phrase.pph_known_cycl_p(pph_data_structures.pph_phrase_output_item_cycl(item))));
    }

    public static final SubLObject pph_phrase_arg0_item_alt(SubLObject arg0, SubLObject arg0_strings, SubLObject arg0_position) {
        if (arg0_position == UNPROVIDED) {
            arg0_position = $list_alt73;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject open_tag = NIL;
                SubLObject close_tag = NIL;
                if (((NIL != arg0_position) && (NIL != pph_vars.$pph_link_arg0P$.getDynamicValue(thread))) && (NIL != pph_html.pph_use_anchor_tags_for_termP(arg0))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject open_tag_9 = pph_html.pph_anchor_tags_for_term(arg0);
                        SubLObject close_tag_10 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        open_tag = open_tag_9;
                        close_tag = close_tag_10;
                    }
                }
                {
                    SubLObject arg0_item = pph_data_structures.new_pph_phrase_output_item(pph_utilities.clean_bunge_nreverse(arg0_strings, UNPROVIDED), arg0_position, arg0, open_tag, close_tag, UNPROVIDED);
                    return arg0_item;
                }
            }
        }
    }

    public static SubLObject pph_phrase_arg0_item(final SubLObject arg0, final SubLObject arg0_strings, SubLObject arg0_position) {
        if (arg0_position == UNPROVIDED) {
            arg0_position = $list72;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject open_tag = NIL;
        SubLObject close_tag = NIL;
        if (((NIL != arg0_position) && (NIL != pph_vars.$pph_link_arg0P$.getDynamicValue(thread))) && (NIL != pph_html.pph_use_anchor_tags_for_termP(arg0))) {
            thread.resetMultipleValues();
            final SubLObject open_tag_$7 = pph_html.pph_anchor_tags_for_term(arg0);
            final SubLObject close_tag_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            open_tag = open_tag_$7;
            close_tag = close_tag_$8;
        }
        final SubLObject arg0_item = pph_data_structures.new_pph_phrase_output_item(pph_utilities.clean_bunge_nreverse(arg0_strings, UNPROVIDED), arg0_position, arg0, open_tag, close_tag, UNPROVIDED);
        return arg0_item;
    }

    public static final SubLObject reverse_string_list_term_anchor_alt(SubLObject strings, SubLObject v_term) {
        return pph_html.string_term_anchor(pph_utilities.clean_bunge_nreverse(strings, UNPROVIDED), v_term);
    }

    public static SubLObject reverse_string_list_term_anchor(final SubLObject strings, final SubLObject v_term) {
        return pph_html.string_term_anchor(pph_utilities.clean_bunge_nreverse(strings, UNPROVIDED), v_term);
    }

    /**
     *
     *
     * @return LISTP; of daughters of PHRASE that contain semantics
     */
    @LispMethod(comment = "@return LISTP; of daughters of PHRASE that contain semantics")
    public static final SubLObject pph_phrase_arg_dtrs_alt(SubLObject phrase) {
        {
            SubLObject arg_dtrs = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_arg_phraseP(dtr)) {
                        arg_dtrs = cons(dtr_num, arg_dtrs);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return nreverse(arg_dtrs);
        }
    }

    /**
     *
     *
     * @return LISTP; of daughters of PHRASE that contain semantics
     */
    @LispMethod(comment = "@return LISTP; of daughters of PHRASE that contain semantics")
    public static SubLObject pph_phrase_arg_dtrs(final SubLObject phrase) {
        SubLObject arg_dtrs = NIL;
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
                if (NIL != pph_phrase_arg_phraseP(dtr)) {
                    arg_dtrs = cons(dtr_num, arg_dtrs);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return nreverse(arg_dtrs);
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE contain semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE contain semantics?")
    public static final SubLObject pph_phrase_arg_phraseP_alt(SubLObject phrase) {
        {
            SubLObject arg_phraseP = NIL;
            if (NIL == arg_phraseP) {
                {
                    SubLObject csome_list_var = pph_phrase.pph_phrase_output_list(phrase);
                    SubLObject item = NIL;
                    for (item = csome_list_var.first(); !((NIL != arg_phraseP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                        {
                            SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                            arg_phraseP = makeBoolean((NIL != arg_position) && (!arg_position.equal($list_alt73)));
                        }
                    }
                }
            }
            if (NIL != arg_phraseP) {
                return T;
            } else {
                if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    {
                        SubLObject ans = NIL;
                        SubLObject dtr_num = ZERO_INTEGER;
                        SubLObject vector_var = document.sign_constituents(phrase);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject dtr = aref(vector_var, element_num);
                                ans = makeBoolean((NIL != ans) || (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_arg_phraseP(dtr)));
                                dtr_num = add(dtr_num, ONE_INTEGER);
                            }
                        }
                        return ans;
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE contain semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE contain semantics?")
    public static SubLObject pph_phrase_arg_phraseP(final SubLObject phrase) {
        SubLObject arg_phraseP = NIL;
        if (NIL == arg_phraseP) {
            SubLObject csome_list_var = pph_phrase.pph_phrase_output_list(phrase);
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == arg_phraseP) && (NIL != csome_list_var)) {
                final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                arg_phraseP = makeBoolean((NIL != arg_position) && (!arg_position.equal($list72)));
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        if (NIL != arg_phraseP) {
            return T;
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject ans = NIL;
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
                    ans = makeBoolean((NIL != ans) || (NIL != pph_phrase_arg_phraseP(dtr)));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return ans;
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE contain semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE contain semantics?")
    public static final SubLObject pph_phrase_arg0_phraseP_alt(SubLObject phrase) {
        {
            SubLObject arg_phraseP = NIL;
            if (NIL == arg_phraseP) {
                {
                    SubLObject csome_list_var = pph_phrase.pph_phrase_output_list(phrase);
                    SubLObject item = NIL;
                    for (item = csome_list_var.first(); !((NIL != arg_phraseP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                        arg_phraseP = equal($list_alt73, pph_data_structures.pph_phrase_output_item_arg_position(item));
                    }
                }
            }
            if (NIL != arg_phraseP) {
                return T;
            } else {
                if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    {
                        SubLObject ans = NIL;
                        SubLObject dtr_num = ZERO_INTEGER;
                        SubLObject vector_var = document.sign_constituents(phrase);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject dtr = aref(vector_var, element_num);
                                ans = makeBoolean((NIL != ans) || (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_arg0_phraseP(dtr)));
                                dtr_num = add(dtr_num, ONE_INTEGER);
                            }
                        }
                        return ans;
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE contain semantics?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE contain semantics?")
    public static SubLObject pph_phrase_arg0_phraseP(final SubLObject phrase) {
        SubLObject arg_phraseP = NIL;
        if (NIL == arg_phraseP) {
            SubLObject csome_list_var;
            SubLObject item;
            for (csome_list_var = pph_phrase.pph_phrase_output_list(phrase), item = NIL, item = csome_list_var.first(); (NIL == arg_phraseP) && (NIL != csome_list_var); arg_phraseP = equal($list72, pph_data_structures.pph_phrase_output_item_arg_position(item)) , csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
            }
        }
        if (NIL != arg_phraseP) {
            return T;
        }
        if (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject ans = NIL;
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
                    ans = makeBoolean((NIL != ans) || (NIL != pph_phrase_arg0_phraseP(dtr)));
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return ans;
        }
        return NIL;
    }

    /**
     * Resolve the conditional phrase PHRASE into one of its possible values,
     * based on whether its test is true, with arguments from FORMULA substituted
     * for its generic keyword args.
     *
     * @return PPH-PHRASE-P; possibly destructively modified PHRASE.
     */
    @LispMethod(comment = "Resolve the conditional phrase PHRASE into one of its possible values,\r\nbased on whether its test is true, with arguments from FORMULA substituted\r\nfor its generic keyword args.\r\n\r\n@return PPH-PHRASE-P; possibly destructively modified PHRASE.\nResolve the conditional phrase PHRASE into one of its possible values,\nbased on whether its test is true, with arguments from FORMULA substituted\nfor its generic keyword args.")
    public static final SubLObject pph_phrase_resolve_condition_alt(SubLObject phrase, SubLObject formula, SubLObject matrix_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_template = pph_phrase.pph_conditional_phrase_test(phrase);
                SubLObject test = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_indexicals_in_test(test_template, formula, matrix_phrase);
                if (NIL != cycl_utilities.expression_find_if(INCOMPLETE_PPH_PHRASE_P, test, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt75$__Test_has_unresolved_indexical_p, test);
                    }
                    return phrase;
                }
                {
                    SubLObject successP = pph_utilities.pph_ask_boolean(test, UNPROVIDED, UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt76$__Ran_conditional_test_____S___Re, test, NIL != successP ? ((SubLObject) ($$$Pass)) : $$$Fail);
                    }
                    {
                        SubLObject resolved_phrase = (NIL != successP) ? ((SubLObject) (pph_phrase.pph_conditional_phrase_values(phrase).first())) : second(pph_phrase.pph_conditional_phrase_values(phrase));
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt79$___Initial_winning_phrase_____S__, resolved_phrase, pph_phrase.pph_phrase_agr_preds(resolved_phrase, UNPROVIDED));
                        }
                        if (NIL != pph_phrase.pph_conditional_phrase_p(resolved_phrase)) {
                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_condition(resolved_phrase, formula, matrix_phrase);
                        }
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_retain_original_relative_targetsP$.bind(T, thread);
                                {
                                    SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
                                    pph_phrase.pph_phrase_copy(resolved_phrase, phrase, UNPROVIDED);
                                    pph_phrase.pph_phrase_set_mother(phrase, mother);
                                }
                            } finally {
                                pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt80$___New_phrase___S___with_agr_pred, phrase, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED));
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt81$___Phrase_has__D_daughters___, pph_phrase.pph_phrase_dtr_count(phrase));
            }
            return phrase;
        }
    }

    /**
     * Resolve the conditional phrase PHRASE into one of its possible values,
     * based on whether its test is true, with arguments from FORMULA substituted
     * for its generic keyword args.
     *
     * @return PPH-PHRASE-P; possibly destructively modified PHRASE.
     */
    @LispMethod(comment = "Resolve the conditional phrase PHRASE into one of its possible values,\r\nbased on whether its test is true, with arguments from FORMULA substituted\r\nfor its generic keyword args.\r\n\r\n@return PPH-PHRASE-P; possibly destructively modified PHRASE.\nResolve the conditional phrase PHRASE into one of its possible values,\nbased on whether its test is true, with arguments from FORMULA substituted\nfor its generic keyword args.")
    public static SubLObject pph_phrase_resolve_condition(final SubLObject phrase, final SubLObject formula, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_template = pph_phrase.pph_conditional_phrase_test(phrase);
        final SubLObject test = pph_phrase_resolve_indexicals_in_test(test_template, formula, matrix_phrase);
        if (NIL != cycl_utilities.expression_find_if(INCOMPLETE_PPH_PHRASE_P, test, UNPROVIDED, UNPROVIDED)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str74$__Test_has_unresolved_indexical_p, test);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return phrase;
        }
        final SubLObject successP = pph_utilities.pph_ask_boolean(test, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str75$__Ran_conditional_test_____S___Re, test, NIL != successP ? $$$Pass : $$$Fail, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject resolved_phrase = (NIL != successP) ? pph_phrase.pph_conditional_phrase_values(phrase).first() : second(pph_phrase.pph_conditional_phrase_values(phrase));
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str78$___Initial_winning_phrase_____S__, resolved_phrase, pph_phrase.pph_phrase_agr_preds(resolved_phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(resolved_phrase)) {
            pph_phrase_resolve_condition(resolved_phrase, formula, matrix_phrase);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind(T, thread);
            final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
            final SubLObject just = pph_phrase.pph_phrase_justification(phrase);
            pph_phrase.pph_phrase_copy(resolved_phrase, phrase, UNPROVIDED);
            pph_phrase.pph_phrase_set_mother(phrase, mother);
            SubLObject cdolist_list_var = just;
            SubLObject justification = NIL;
            justification = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_phrase.pph_phrase_add_justification(phrase, justification);
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
            } 
        } finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str79$___New_phrase___S___with_agr_pred, phrase, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str80$___Phrase_has__D_daughters___, pph_phrase.pph_phrase_dtr_count(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return phrase;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an incomplete pph phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an incomplete pph phrase?")
    public static final SubLObject incomplete_pph_phrase_p_alt(SubLObject obj) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(obj, UNPROVIDED)) && (NIL == pph_phrase.pph_phrase_doneP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ an incomplete pph phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ an incomplete pph phrase?")
    public static SubLObject incomplete_pph_phrase_p(final SubLObject obj) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(obj, UNPROVIDED)) && (NIL == pph_phrase.pph_phrase_doneP(obj)));
    }

    /**
     * Replace indexical expressions in DNF-TEMPLATE with values taken from FORMULA and PHRASE.
     */
    @LispMethod(comment = "Replace indexical expressions in DNF-TEMPLATE with values taken from FORMULA and PHRASE.")
    public static final SubLObject pph_phrase_resolve_indexicals_in_test_alt(SubLObject dnf_template, SubLObject formula, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != el_formula_p(formula)) && (NIL != pph_utilities.pph_cycl_template_p(dnf_template))) {
                dnf_template = pph_utilities.pph_apply_template(dnf_template, formula);
            }
            dnf_template = pph_utilities.pph_resolve_indexicals(dnf_template, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = $pph_repeated_phrase_lists$.currentBinding(thread);
                try {
                    $pph_repeated_phrase_lists$.bind(NIL, thread);
                    dnf_template = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_resolve_current_list_items(dnf_template);
                } finally {
                    $pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != cycl_utilities.expression_find_if(PPH_NTH_PHRASE_NAUT_P, dnf_template, UNPROVIDED, UNPROVIDED)) {
                dnf_template = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_nth_phrases(dnf_template, phrase);
            }
            return dnf_template;
        }
    }

    /**
     * Replace indexical expressions in DNF-TEMPLATE with values taken from FORMULA and PHRASE.
     */
    @LispMethod(comment = "Replace indexical expressions in DNF-TEMPLATE with values taken from FORMULA and PHRASE.")
    public static SubLObject pph_phrase_resolve_indexicals_in_test(SubLObject dnf_template, final SubLObject formula, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_formula_p(formula)) && (NIL != pph_utilities.pph_cycl_template_p(dnf_template))) {
            dnf_template = pph_utilities.pph_apply_template(dnf_template, formula);
        }
        dnf_template = pph_utilities.pph_resolve_indexicals(dnf_template, UNPROVIDED);
        final SubLObject _prev_bind_0 = $pph_repeated_phrase_lists$.currentBinding(thread);
        try {
            $pph_repeated_phrase_lists$.bind(NIL, thread);
            dnf_template = pph_resolve_current_list_items(dnf_template);
        } finally {
            $pph_repeated_phrase_lists$.rebind(_prev_bind_0, thread);
        }
        if (NIL != cycl_utilities.expression_find_if(PPH_NTH_PHRASE_NAUT_P, dnf_template, UNPROVIDED, UNPROVIDED)) {
            dnf_template = pph_phrase_resolve_nth_phrases(dnf_template, phrase);
        }
        return dnf_template;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a NAUT that denotes an indexical nth-phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a NAUT that denotes an indexical nth-phrase?")
    public static final SubLObject pph_nth_phrase_naut_p_alt(SubLObject obj) {
        if (NIL != possibly_fo_naut_p(obj)) {
            {
                SubLObject expanded = pph_templates.pph_expand_phrase_nauts(obj);
                return formula_pattern_match.formula_matches_pattern(expanded, $list_alt83);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a NAUT that denotes an indexical nth-phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a NAUT that denotes an indexical nth-phrase?")
    public static SubLObject pph_nth_phrase_naut_p(final SubLObject obj) {
        if (NIL != possibly_fo_naut_p(obj)) {
            final SubLObject expanded = pph_templates.pph_expand_phrase_nauts(obj);
            return formula_pattern_match.formula_matches_pattern(expanded, $list82);
        }
        return NIL;
    }

    /**
     * Replace any nth-phrase nauts in DNF-TEMPLATE with values from PHRASE
     */
    @LispMethod(comment = "Replace any nth-phrase nauts in DNF-TEMPLATE with values from PHRASE")
    public static final SubLObject pph_phrase_resolve_nth_phrases_alt(SubLObject dnf_template, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $pph_phrase_transform_nth_reference_phrase$.currentBinding(thread);
                    try {
                        $pph_phrase_transform_nth_reference_phrase$.bind(phrase, thread);
                        ans = cycl_utilities.expression_transform(dnf_template, PPH_NTH_PHRASE_NAUT_P, PPH_PHRASE_TRANSFORM_NTH, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $pph_phrase_transform_nth_reference_phrase$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Replace any nth-phrase nauts in DNF-TEMPLATE with values from PHRASE
     */
    @LispMethod(comment = "Replace any nth-phrase nauts in DNF-TEMPLATE with values from PHRASE")
    public static SubLObject pph_phrase_resolve_nth_phrases(final SubLObject dnf_template, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $pph_phrase_transform_nth_reference_phrase$.currentBinding(thread);
        try {
            $pph_phrase_transform_nth_reference_phrase$.bind(phrase, thread);
            ans = cycl_utilities.expression_transform(dnf_template, PPH_NTH_PHRASE_NAUT_P, PPH_PHRASE_TRANSFORM_NTH, UNPROVIDED, UNPROVIDED);
        } finally {
            $pph_phrase_transform_nth_reference_phrase$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @return PPH-PHRASE-P; The dtr of the reference phrase corresponding to NTH-PHRASE-NAUT.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; The dtr of the reference phrase corresponding to NTH-PHRASE-NAUT.")
    public static final SubLObject pph_phrase_transform_nth_alt(SubLObject nth_phrase_naut) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expanded = pph_templates.pph_expand_phrase_nauts(nth_phrase_naut);
                SubLObject n = cycl_utilities.nat_arg2(expanded, UNPROVIDED);
                SubLObject dtr_num = number_utilities.f_1_(n);
                return pph_phrase.pph_phrase_dtr_count($pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread)).numG(dtr_num) ? ((SubLObject) (pph_phrase.pph_phrase_nth_dtr($pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread), dtr_num))) : NIL;
            }
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-P; The dtr of the reference phrase corresponding to NTH-PHRASE-NAUT.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; The dtr of the reference phrase corresponding to NTH-PHRASE-NAUT.")
    public static SubLObject pph_phrase_transform_nth(final SubLObject nth_phrase_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expanded = pph_templates.pph_expand_phrase_nauts(nth_phrase_naut);
        final SubLObject n = cycl_utilities.nat_arg2(expanded, UNPROVIDED);
        final SubLObject dtr_num = number_utilities.f_1_(n);
        return pph_phrase.pph_phrase_dtr_count($pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread)).numG(dtr_num) ? pph_phrase.pph_phrase_nth_dtr($pph_phrase_transform_nth_reference_phrase$.getDynamicValue(thread), dtr_num) : NIL;
    }

    public static final SubLObject pph_phrase_set_relative_agr_alt(SubLObject phrase, SubLObject matrix_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, matrix_phrase);
                SubLObject number_added = ZERO_INTEGER;
                if (((NIL != pph_phrase.pph_phrase_p(target, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(target))) && (NIL != list_utilities.empty_list_p(pph_phrase.pph_phrase_local_alternatives(phrase)))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt85$Adding_alternatives_for_agr_targe, target, phrase);
                    }
                    {
                        SubLObject queue = queues.create_queue();
                        SubLObject done_count = ZERO_INTEGER;
                        queues.enqueue(target, queue);
                        while (NIL == queues.queue_empty_p(queue)) {
                            {
                                SubLObject ignore_me = queues.dequeue(queue);
                                SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                                SubLObject alternative_target = NIL;
                                for (alternative_target = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , alternative_target = cdolist_list_var.first()) {
                                    {
                                        SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(phrase, NIL, NIL);
                                        pph_phrase.pph_phrase_set_relative_agr_target(alternative_phrase, alternative_target);
                                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_relative_agr_internal(alternative_phrase, matrix_phrase);
                                        pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                                        number_added = add(number_added, ONE_INTEGER);
                                    }
                                    done_count = add(done_count, ONE_INTEGER);
                                    if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                        {
                                            SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt86$Done__S_alternatives_of__S) });
                                            pph_error.pph_handle_error(new_format_string, list(done_count, target));
                                        }
                                    }
                                    queues.enqueue(alternative_target, queue);
                                }
                            }
                        } 
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt87$Added__D_alternatives_, number_added);
                    }
                }
            }
            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_relative_agr_internal(phrase, matrix_phrase);
        }
    }

    public static SubLObject pph_phrase_set_relative_agr(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        SubLObject number_added = ZERO_INTEGER;
        if (((NIL != pph_phrase.pph_phrase_p(target, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(target))) && (NIL != list_utilities.empty_list_p(pph_phrase.pph_phrase_local_alternatives(phrase)))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str84$Adding_alternatives_for_agr_targe, target, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject queue = queues.create_queue(UNPROVIDED);
            SubLObject done_count = ZERO_INTEGER;
            queues.enqueue(target, queue);
            while (NIL == queues.queue_empty_p(queue)) {
                final SubLObject ignore_me = queues.dequeue(queue);
                SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                SubLObject alternative_target = NIL;
                alternative_target = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject alternative_phrase = pph_phrase.pph_phrase_copy(phrase, NIL, NIL);
                    pph_phrase.pph_phrase_set_relative_agr_target(alternative_phrase, alternative_target);
                    pph_phrase_set_relative_agr_internal(alternative_phrase, matrix_phrase);
                    pph_phrase.pph_phrase_add_alternative(phrase, alternative_phrase);
                    number_added = add(number_added, ONE_INTEGER);
                    done_count = add(done_count, ONE_INTEGER);
                    if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                        final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str85$Done__S_alternatives_of__S) });
                        pph_error.pph_handle_error(new_format_string, list(done_count, target));
                    }
                    queues.enqueue(alternative_target, queue);
                    cdolist_list_var = cdolist_list_var.rest();
                    alternative_target = cdolist_list_var.first();
                } 
            } 
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str86$Added__D_alternatives_, number_added, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return pph_phrase_set_relative_agr_internal(phrase, matrix_phrase);
    }

    public static final SubLObject pph_phrase_set_relative_agr_internal_alt(SubLObject phrase, SubLObject matrix_phrase) {
        if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $SUBJECT_VERB)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_subject_verb_agreement(phrase, matrix_phrase);
        } else {
            if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $DET_NBAR)) {
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_det_nbar_agreement(phrase, matrix_phrase);
            } else {
                if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $PEER)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_peer_agreement(phrase, matrix_phrase);
                } else {
                    if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $TENSE)) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_tense_agreement(phrase, matrix_phrase);
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_agr(phrase);
    }

    public static SubLObject pph_phrase_set_relative_agr_internal(final SubLObject phrase, final SubLObject matrix_phrase) {
        if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $SUBJECT_VERB)) {
            pph_phrase_set_subject_verb_agreement(phrase, matrix_phrase);
        } else
            if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $DET_NBAR)) {
                pph_phrase_set_det_nbar_agreement(phrase, matrix_phrase);
            } else
                if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $PEER)) {
                    pph_phrase_set_peer_agreement(phrase, matrix_phrase);
                } else
                    if (NIL != pph_phrase.pph_phrase_has_agr_constraint_type_p(phrase, $TENSE)) {
                        pph_phrase_set_tense_agreement(phrase, matrix_phrase);
                    }



        return pph_phrase.pph_phrase_agr(phrase);
    }

    /**
     * Workhorse for @xref PPH-PHRASE-GET-STRING, for the case
     * where we need to compute a string from PHRASE itself, not its daughters.
     *
     * @unknown destructively modifies PHRASE.
     */
    @LispMethod(comment = "Workhorse for @xref PPH-PHRASE-GET-STRING, for the case\r\nwhere we need to compute a string from PHRASE itself, not its daughters.\r\n\r\n@unknown destructively modifies PHRASE.\nWorkhorse for @xref PPH-PHRASE-GET-STRING, for the case\nwhere we need to compute a string from PHRASE itself, not its daughters.")
    public static final SubLObject pph_phrase_resolve_string_alt(SubLObject phrase, SubLObject matrix_phrase) {
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_relative_agr(phrase, matrix_phrase);
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
        } else {
            if (NIL != pph_types.pph_lexical_wordP(pph_phrase.pph_phrase_wu(phrase, UNPROVIDED))) {
                pph_methods_lexicon.pph_phrase_resolve_string_from_word(phrase, UNPROVIDED);
            } else {
                if (NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
                    pph_utilities.pph_possibly_nartify_phrase(phrase);
                    pph_utilities.pph_phrase_rephrase_cycl(phrase, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                        if (NIL != cycl_grammar.el_variable_p(cycl)) {
                            pph_methods_formulas.maybe_register_var_by_arg_constraints(cycl, UNPROVIDED);
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt92$__Paraphrasing__S_with_agreement_, cycl, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED));
                        }
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt93$___Output_list_is____S___, pph_phrase.pph_phrase_output_list(phrase));
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt94$___Arg_position_map_is__S___, pph_phrase.pph_phrase_arg_position_map(phrase));
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt95$___SUID_is__S___, pph_phrase.pph_phrase_suid(phrase));
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt96$_____of_dtrs___S___, pph_phrase.pph_phrase_dtr_count(phrase));
                    }
                    pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt97$Can_t_resolve_string_of__S, phrase);
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Workhorse for @xref PPH-PHRASE-GET-STRING, for the case
     * where we need to compute a string from PHRASE itself, not its daughters.
     *
     * @unknown destructively modifies PHRASE.
     */
    @LispMethod(comment = "Workhorse for @xref PPH-PHRASE-GET-STRING, for the case\r\nwhere we need to compute a string from PHRASE itself, not its daughters.\r\n\r\n@unknown destructively modifies PHRASE.\nWorkhorse for @xref PPH-PHRASE-GET-STRING, for the case\nwhere we need to compute a string from PHRASE itself, not its daughters.")
    public static SubLObject pph_phrase_resolve_string(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase_set_relative_agr(phrase, matrix_phrase);
        if (NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (NIL != pph_types.pph_lexical_wordP(pph_phrase.pph_phrase_wu(phrase, UNPROVIDED))) {
                pph_methods_lexicon.pph_phrase_resolve_string_from_word(phrase, UNPROVIDED);
            } else
                if (NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
                    pph_utilities.pph_possibly_nartify_phrase(phrase);
                    pph_utilities.pph_phrase_rephrase_cycl(phrase, UNPROVIDED, UNPROVIDED);
                    final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                    if (NIL != cycl_grammar.el_variable_p(cycl)) {
                        pph_methods_formulas.maybe_register_var_by_arg_constraints(cycl, UNPROVIDED);
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str91$__Paraphrasing__S_with_agreement_, cycl, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str92$___Output_list_is____S___, pph_phrase.pph_phrase_output_list(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str93$___Arg_position_map_is__S___, pph_phrase.pph_phrase_arg_position_map(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str94$___SUID_is__S___, pph_phrase.pph_phrase_suid(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str95$_____of_dtrs___S___, pph_phrase.pph_phrase_dtr_count(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str96$Can_t_resolve_string_of__S, phrase);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }


        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    /**
     * Should we use a backward-referring pronoun to paraphrase PHRASE?
     */
    @LispMethod(comment = "Should we use a backward-referring pronoun to paraphrase PHRASE?")
    public static final SubLObject anaphor_needed_for_phraseP_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                if (((NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) && (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase))) {
                    {
                        SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                        v_answer = makeBoolean((((((NIL != pph_drs.pph_discourse_referentP(phrase_cycl)) && ((NIL == cycl_variables.el_varP(phrase_cycl)) || (NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP(phrase_cycl)))) && (NIL != pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, T))) && (NIL != pph_drs.pph_anaphoric_to_backward_looking_centerP(phrase_cycl))) && (NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP(phrase_cycl))) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_category_ok_for_anaphorP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))));
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Should we use a backward-referring pronoun to paraphrase PHRASE?
     */
    @LispMethod(comment = "Should we use a backward-referring pronoun to paraphrase PHRASE?")
    public static SubLObject anaphor_needed_for_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if ((((NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) && (NIL == pph_vars.pph_generate_alternative_phrasesP())) && (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase))) {
            final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            v_answer = makeBoolean((((((((NIL != pph_drs.pph_discourse_referentP(phrase_cycl)) && (NIL == pph_macros.pph_mapped_string_for_term(phrase_cycl))) && ((NIL == cycl_variables.el_varP(phrase_cycl)) || (NIL == pph_variable_handling.pph_var_paraphrased_explicitlyP(phrase_cycl)))) && (NIL != pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, T))) && (NIL != pph_drs.pph_anaphoric_to_backward_looking_centerP(phrase))) && ((NIL == pph_phrase.pph_phrase_has_ancestor_of_categoryP(phrase, pph_utilities.pph_np_category())) || $$PossessivePhrase.eql(pph_phrase.pph_phrase_category(phrase, UNPROVIDED)))) && (NIL == pph_methods_lexicon.pph_maybe_ambiguous_pronounP(phrase_cycl))) && (NIL != pph_category_ok_for_anaphorP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))));
        }
        return v_answer;
    }

    /**
     * Is CATEGORY such that we could possibly replace a phrase with that category with an anaphor?
     */
    @LispMethod(comment = "Is CATEGORY such that we could possibly replace a phrase with that category with an anaphor?")
    public static final SubLObject pph_category_ok_for_anaphorP_alt(SubLObject category) {
        return makeBoolean(($CYCL_PHRASE == category) || (NIL != pph_utilities.pph_npP(category)));
    }

    /**
     * Is CATEGORY such that we could possibly replace a phrase with that category with an anaphor?
     */
    @LispMethod(comment = "Is CATEGORY such that we could possibly replace a phrase with that category with an anaphor?")
    public static SubLObject pph_category_ok_for_anaphorP(final SubLObject category) {
        return makeBoolean((($CYCL_PHRASE == category) || (NIL != pph_utilities.pph_npP(category))) || $$PossessivePhrase.eql(category));
    }

    /**
     * Should we use a reflexive to paraphrase PHRASE?
     *
     * @unknown assumes (ANAPHOR-NEEDED-FOR-PHRASE PHRASE) -> T.
     */
    @LispMethod(comment = "Should we use a reflexive to paraphrase PHRASE?\r\n\r\n@unknown assumes (ANAPHOR-NEEDED-FOR-PHRASE PHRASE) -> T.")
    public static final SubLObject reflexive_needed_for_phraseP_alt(SubLObject phrase) {
        if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
            {
                SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                if (NIL == pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, T)) {
                    return NIL;
                }
                {
                    SubLObject rm = pph_drs.pph_discourse_rm_lookup(phrase_cycl);
                    SubLObject rm_phrases = pph_drs.pph_rm_phrases(rm);
                    SubLObject subject_domain = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_subject_domain(phrase);
                    SubLObject cdolist_list_var = rm_phrases;
                    SubLObject rm_phrase = NIL;
                    for (rm_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm_phrase = cdolist_list_var.first()) {
                        if (!((NIL != pph_phrase.pph_phrase_p(rm_phrase, UNPROVIDED)) && pph_phrase.pph_phrase_cycl(rm_phrase, UNPROVIDED).equal(phrase_cycl))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                Errors.warn($str_alt99$Sanity_check_failed__rm_cycl__S_i, pph_phrase.pph_phrase_cycl(rm_phrase, UNPROVIDED), phrase_cycl);
                            }
                        }
                        if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_dtr_nested_withinP(rm_phrase, subject_domain)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Should we use a reflexive to paraphrase PHRASE?
     *
     * @unknown assumes (ANAPHOR-NEEDED-FOR-PHRASE PHRASE) -> T.
     */
    @LispMethod(comment = "Should we use a reflexive to paraphrase PHRASE?\r\n\r\n@unknown assumes (ANAPHOR-NEEDED-FOR-PHRASE PHRASE) -> T.")
    public static SubLObject reflexive_needed_for_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) {
            final SubLObject phrase_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            if (NIL == pph_utilities.pph_possible_pronoun_denotP(phrase_cycl, T)) {
                return NIL;
            }
            if ($$PossessivePhrase.eql(pph_phrase.pph_phrase_category(phrase, UNPROVIDED))) {
                return NIL;
            }
            final SubLObject rm_phrases = pph_drs.pph_discourse_phrases_for_cycl(phrase_cycl);
            final SubLObject subject_domain = pph_phrase_subject_domain(phrase);
            SubLObject cdolist_list_var = rm_phrases;
            SubLObject rm_phrase = NIL;
            rm_phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((!phrase.eql(rm_phrase)) && (NIL != pph_data_structures.valid_pph_phrase_p(rm_phrase))) {
                    if ((((NIL == pph_phrase.pph_phrase_p(rm_phrase, UNPROVIDED)) || (!pph_phrase.pph_phrase_cycl(rm_phrase, UNPROVIDED).equal(phrase_cycl))) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str98$Sanity_check_failed__rm_cycl__S_i, pph_phrase.pph_phrase_cycl(rm_phrase, UNPROVIDED), phrase_cycl);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    if (NIL != pph_phrase_dtr_nested_withinP(rm_phrase, subject_domain)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str99$Must_use_reflexive_for____S___due, phrase, rm_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        return T;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                rm_phrase = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject pph_phrase_source_pos_alt(SubLObject phrase, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return pph_data_structures.pph_phrase_info_lookup(phrase, $SOURCE_POS, v_default);
    }

    public static SubLObject pph_phrase_source_pos(final SubLObject phrase, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return pph_data_structures.pph_phrase_info_lookup(phrase, $SOURCE_POS, v_default);
    }

    public static final SubLObject pph_phrase_set_source_pos_alt(SubLObject phrase, SubLObject pos) {
        return pph_data_structures.pph_phrase_info_set(phrase, $SOURCE_POS, pos);
    }

    public static SubLObject pph_phrase_set_source_pos(final SubLObject phrase, final SubLObject pos) {
        return pph_data_structures.pph_phrase_info_set(phrase, $SOURCE_POS, pos);
    }

    /**
     * Replace any generic arg keywords in cycl of PHRASE
     * with the corresponding arguments in FORMULA.
     *
     * @return PHRASE with its cycl modified.
     */
    @LispMethod(comment = "Replace any generic arg keywords in cycl of PHRASE\r\nwith the corresponding arguments in FORMULA.\r\n\r\n@return PHRASE with its cycl modified.\nReplace any generic arg keywords in cycl of PHRASE\nwith the corresponding arguments in FORMULA.")
    public static final SubLObject pph_phrase_replace_generic_args_alt(SubLObject phrase, SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = NIL;
        }
        if (NIL != pph_phrase.pph_repeated_phrase_p(phrase)) {
        } else {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_replace_generic_args_top_level(phrase, formula, arg_position_map);
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_replace_generic_args_recursive(phrase, formula, arg_position_map);
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_sanity_check_arg_position_map(phrase, formula, arg_position_map);
            pph_phrase.pph_phrase_sanity_check_cycl(phrase);
        }
        return pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
    }

    /**
     * Replace any generic arg keywords in cycl of PHRASE
     * with the corresponding arguments in FORMULA.
     *
     * @return PHRASE with its cycl modified.
     */
    @LispMethod(comment = "Replace any generic arg keywords in cycl of PHRASE\r\nwith the corresponding arguments in FORMULA.\r\n\r\n@return PHRASE with its cycl modified.\nReplace any generic arg keywords in cycl of PHRASE\nwith the corresponding arguments in FORMULA.")
    public static SubLObject pph_phrase_replace_generic_args(final SubLObject phrase, final SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (NIL == pph_phrase.pph_repeated_phrase_p(phrase)) {
            pph_phrase_replace_generic_args_top_level(phrase, formula, arg_position_map);
            pph_phrase_replace_generic_args_recursive(phrase, formula, arg_position_map);
        }
        return pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
    }

    public static final SubLObject pph_phrase_replace_generic_args_top_level_alt(SubLObject phrase, SubLObject formula, SubLObject arg_position_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl_template = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject apply_templateP = makeBoolean((!cycl_template.equal(formula)) && (NIL != pph_utilities.pph_cycl_template_p(cycl_template)));
                SubLObject new_cycl = cycl_template;
                if (NIL != apply_templateP) {
                    new_cycl = pph_utilities.pph_apply_template(cycl_template, formula);
                }
                if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_update_generic_args_in_conditional_test(phrase, formula);
                } else {
                    if (NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
                        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_update_generic_args_in_variable_binding_query(phrase, formula);
                    }
                }
                if ((NIL != pph_utilities.pph_arg_position_specifierP(cycl_template)) && (NIL == com.cyc.cycjava.cycl.pph_phrase_resolution.pph_kept_generic_arg_phrase_p(phrase))) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_replace_generic_arg_simple(phrase, cycl_template, new_cycl, arg_position_map);
                } else {
                    if ((NIL != pph_utilities.pph_cycl_template_p(cycl_template)) && ((NIL == pph_vars.$pph_keep_generic_argsP$.getDynamicValue(thread)) || (NIL == pph_utilities.pph_cycl_template_p(formula)))) {
                        pph_phrase.pph_phrase_register_local_arg_positions(phrase, arg_position_map);
                    } else {
                        if (((NIL != pph_utilities.pph_known_arg_position_p(pph_utilities.pph_arg_position_lookup($list_alt73, arg_position_map))) && (NIL != pph_phrase.pph_unknown_cycl_p(cycl_template))) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_ok_for_arg0P(phrase))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format(T, $str_alt108$__Using_arg0_for__S_with_formula_, phrase, pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread));
                            }
                            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != el_formula_p(pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread))))) {
                                {
                                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread)), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(EL_FORMULA_P) })) });
                                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                                }
                            }
                            {
                                SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup($list_alt73, arg_position_map);
                                SubLObject formula_to_use = pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread);
                                SubLObject arg0 = cycl_utilities.formula_arg0(formula_to_use);
                                pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
                                pph_phrase.pph_phrase_set_cycl(phrase, arg0);
                                pph_phrase.pph_phrase_set_output_list_cycl(phrase, arg0);
                                {
                                    SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG0);
                                    pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
                                }
                            }
                        } else {
                            if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                                pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
                            } else {
                                if (NIL != pph_utilities.pph_identity_map_p(pph_phrase.pph_phrase_arg_position_map(phrase))) {
                                    pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
                                }
                            }
                        }
                    }
                }
                if (!((NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_kept_generic_arg_phrase_p(phrase)) || (NIL != pph_phrase.pph_unknown_cycl_p(cycl_template)))) {
                    pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
                }
            }
            pph_phrase.pph_phrase_sanity_check_cycl(phrase);
            pph_phrase.pph_phrase_sanity_check_output_list_cycl(phrase);
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_sanity_check_arg_position_map(phrase, formula, arg_position_map);
            return values(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), pph_phrase.pph_phrase_arg_position_map(phrase));
        }
    }

    public static SubLObject pph_phrase_replace_generic_args_top_level(final SubLObject phrase, final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_template = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject apply_templateP = makeBoolean((!cycl_template.equal(formula)) && (NIL != pph_utilities.pph_cycl_template_p(cycl_template)));
        SubLObject new_cycl = cycl_template;
        if (NIL != apply_templateP) {
            new_cycl = pph_utilities.pph_apply_template(cycl_template, formula);
        }
        if (NIL != pph_utilities.pph_cycl_template_p(pph_phrase.pph_phrase_wu(phrase, UNPROVIDED))) {
            pph_phrase.pph_phrase_set_wu(phrase, pph_utilities.pph_apply_template(pph_phrase.pph_phrase_wu(phrase, UNPROVIDED), formula));
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_update_generic_args_in_conditional_test(phrase, formula);
        } else
            if (NIL != pph_phrase.pph_variable_binding_phrase_p(phrase)) {
                pph_phrase_update_generic_args_in_variable_binding_query(phrase, formula);
            }

        if ((NIL != pph_utilities.pph_arg_position_specifierP(cycl_template)) && (NIL == pph_kept_generic_arg_phrase_p(phrase))) {
            pph_phrase_replace_generic_arg_simple(phrase, cycl_template, new_cycl, arg_position_map);
        } else
            if ((NIL != pph_utilities.pph_cycl_template_p(cycl_template)) && ((NIL == pph_vars.$pph_keep_generic_argsP$.getDynamicValue(thread)) || (NIL == pph_utilities.pph_cycl_template_p(formula)))) {
                pph_phrase.pph_phrase_register_local_arg_positions(phrase, arg_position_map);
            } else
                if (((NIL != pph_utilities.pph_known_arg_position_p(pph_utilities.pph_arg_position_lookup($list72, arg_position_map))) && (NIL != pph_phrase.pph_unknown_cycl_p(cycl_template))) && (NIL != pph_phrase_ok_for_arg0P(phrase))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str101$__Using_arg0_for__S_with_formula_, phrase, pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup($list72, arg_position_map);
                    final SubLObject formula_to_use = pph_vars.$pph_formula_for_generic_arg_replacement$.getDynamicValue(thread);
                    final SubLObject arg0 = cycl_utilities.formula_arg0(formula_to_use);
                    pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
                    pph_phrase.pph_phrase_set_cycl(phrase, arg0);
                    pph_phrase.pph_phrase_set_output_list_cycl(phrase, arg0);
                    final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG0);
                    pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
                } else
                    if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str103$Supposedly___S_isn_t_part_of_old_, cycl_template);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        pph_phrase.pph_phrase_set_arg_position_map(phrase, pph_utilities.pph_new_empty_map());
                    } else
                        if (NIL != pph_utilities.pph_identity_map_p(pph_phrase.pph_phrase_arg_position_map(phrase))) {
                            pph_phrase.pph_phrase_set_arg_position_map(phrase, arg_position_map);
                        }




        if ((NIL == pph_kept_generic_arg_phrase_p(phrase)) && (NIL == pph_phrase.pph_unknown_cycl_p(cycl_template))) {
            pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
        }
        pph_phrase.pph_phrase_sanity_check_cycl(phrase);
        return values(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), pph_phrase.pph_phrase_output_list(phrase), pph_phrase.pph_phrase_arg_position_map(phrase));
    }

    public static final SubLObject pph_phrase_update_generic_args_in_conditional_test_alt(SubLObject phrase, SubLObject formula) {
        {
            SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
            SubLObject new_test = pph_utilities.pph_apply_template(old_test, formula);
            if (!old_test.equal(new_test)) {
                pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt111$Updated_conditional_test_to__S__, pph_phrase.pph_conditional_phrase_test(phrase));
                }
                if (NIL == pph_utilities.pph_cycl_template_p(formula)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt112$Updated_test_to____S_using_non_te, pph_phrase.pph_conditional_phrase_test(phrase), formula);
                    }
                }
            }
            return new_test;
        }
    }

    public static SubLObject pph_phrase_update_generic_args_in_conditional_test(final SubLObject phrase, final SubLObject formula) {
        final SubLObject old_test = pph_phrase.pph_conditional_phrase_test(phrase);
        final SubLObject new_test = pph_utilities.pph_apply_template(old_test, formula);
        if (!old_test.equal(new_test)) {
            pph_phrase.pph_conditional_phrase_set_test(phrase, new_test);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str104$Updated_conditional_test_to__S__, pph_phrase.pph_conditional_phrase_test(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL == pph_utilities.pph_cycl_template_p(formula)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str105$Updated_test_to____S_using_non_te, pph_phrase.pph_conditional_phrase_test(phrase), formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return new_test;
    }

    public static final SubLObject pph_phrase_update_generic_args_in_variable_binding_query_alt(SubLObject phrase, SubLObject formula) {
        {
            SubLObject old_query_template = pph_phrase.pph_variable_binding_phrase_query_template(phrase);
            SubLObject new_query_template = pph_utilities.pph_apply_template(old_query_template, formula);
            if (!old_query_template.equal(new_query_template)) {
                pph_phrase.pph_variable_binding_phrase_set_query_template(phrase, new_query_template);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt113$Updated_variable_bindings_query_t, new_query_template);
                }
                if (NIL == pph_utilities.pph_cycl_template_p(formula)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt114$Updated_variable_bindings_query_t, new_query_template, formula);
                    }
                }
            }
            return new_query_template;
        }
    }

    public static SubLObject pph_phrase_update_generic_args_in_variable_binding_query(final SubLObject phrase, final SubLObject formula) {
        final SubLObject old_query_template = pph_phrase.pph_variable_binding_phrase_query_template(phrase);
        final SubLObject new_query_template = pph_utilities.pph_apply_template(old_query_template, formula);
        if (!old_query_template.equal(new_query_template)) {
            pph_phrase.pph_variable_binding_phrase_set_query_template(phrase, new_query_template);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str106$Updated_variable_bindings_query_t, new_query_template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL == pph_utilities.pph_cycl_template_p(formula)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                format_nil.force_format(T, $str107$Updated_variable_bindings_query_t, new_query_template, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return new_query_template;
    }

    public static final SubLObject pph_phrase_replace_generic_arg_simple_alt(SubLObject phrase, SubLObject cycl_template, SubLObject new_cycl, SubLObject arg_position_map) {
        {
            SubLObject local_arg_position = pph_utilities.pph_arg_position_from_template(cycl_template);
            SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt115$__Replacing__S_with__S___, cycl_template, new_cycl);
            }
            pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
            pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
            pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
            {
                SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, cycl_template);
                pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
                return new_map;
            }
        }
    }

    public static SubLObject pph_phrase_replace_generic_arg_simple(final SubLObject phrase, final SubLObject cycl_template, final SubLObject new_cycl, final SubLObject arg_position_map) {
        final SubLObject local_arg_position = pph_utilities.pph_arg_position_from_template(cycl_template);
        final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str108$__Replacing__S_with__S___, cycl_template, new_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        pph_phrase.pph_phrase_set_arg_position(phrase, global_arg_position);
        pph_phrase.pph_phrase_set_cycl(phrase, new_cycl);
        pph_phrase.pph_phrase_set_output_list_cycl(phrase, new_cycl);
        final SubLObject new_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, cycl_template);
        pph_phrase.pph_phrase_set_arg_position_map(phrase, new_map);
        return new_map;
    }

    public static final SubLObject pph_kept_generic_arg_phrase_p_alt(SubLObject phrase) {
        {
            SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            return makeBoolean((NIL != at_admitted.generic_arg_p(cycl)) && pph_phrase.pph_phrase_string(phrase, NIL).equal(pph_utilities.add_quotes_smart(cycl)));
        }
    }

    public static SubLObject pph_kept_generic_arg_phrase_p(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        return makeBoolean((NIL != at_admitted.generic_arg_p(cycl)) && pph_phrase.pph_phrase_string(phrase, NIL).equal(pph_utilities.add_quotes_smart(cycl)));
    }

    /**
     *
     *
     * @return BOOLEAN; Might PHRASE be associated with the arg0 of the current formula?
     */
    @LispMethod(comment = "@return BOOLEAN; Might PHRASE be associated with the arg0 of the current formula?")
    public static final SubLObject pph_phrase_ok_for_arg0P_alt(SubLObject phrase) {
        {
            SubLObject result = makeBoolean(((((NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_for_arg0_p(phrase)) && ((NIL != pph_phrase.pph_unknown_cycl_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) || (NIL != parsing_utilities.nl_tagP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED)))) && (NIL != pph_utilities.pph_unknown_arg_position_p(pph_phrase.pph_phrase_arg_position(phrase)))) && (NIL != list_utilities.lengthL(pph_phrase.pph_phrase_output_list(phrase), TWO_INTEGER, UNPROVIDED))) && ((NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) || ((NIL != string_utilities.non_empty_stringP(pph_phrase.pph_phrase_string(phrase, UNPROVIDED))) && (NIL == pph_utilities.pph_final_punctuation_string_p(pph_phrase.pph_phrase_string(phrase, UNPROVIDED))))));
            return result;
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Might PHRASE be associated with the arg0 of the current formula?
     */
    @LispMethod(comment = "@return BOOLEAN; Might PHRASE be associated with the arg0 of the current formula?")
    public static SubLObject pph_phrase_ok_for_arg0P(final SubLObject phrase) {
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
        final SubLObject result = makeBoolean((((NIL != pph_phrase_reserved_for_arg0_p(phrase)) && (NIL != pph_utilities.pph_unknown_arg_position_p(pph_phrase.pph_phrase_arg_position(phrase)))) && (NIL != list_utilities.lengthL(pph_phrase.pph_phrase_output_list(phrase), TWO_INTEGER, UNPROVIDED))) && ((NIL != pph_phrase.pph_phrase_wu(phrase, UNPROVIDED)) || ((NIL != pph_string.non_empty_pph_stringP(string)) && (NIL == pph_utilities.pph_final_punctuation_string_p(string)))));
        return result;
    }

    public static final SubLObject pph_phrase_replace_generic_args_recursive_alt(SubLObject phrase, SubLObject formula, SubLObject arg_position_map) {
        {
            SubLObject old_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject new_cycl = old_cycl;
            if (NIL != pph_types.pph_phrase_nautP(new_cycl)) {
                {
                    SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
                    SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                    SubLObject local_arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    if (NIL != agr_pred) {
                        new_cycl = list($$PhraseFormFn, agr_pred, new_cycl);
                        local_arg_position_map = pph_utilities.pph_contextualize_map($list_alt117, local_arg_position_map);
                    }
                    if (NIL != category) {
                        new_cycl = list($$PhraseFormFn, category, new_cycl);
                        local_arg_position_map = pph_utilities.pph_contextualize_map($list_alt117, local_arg_position_map);
                    }
                    {
                        SubLObject best_phrase = pph_phrase.new_pph_phrase_for_cycl(new_cycl, local_arg_position_map, UNPROVIDED);
                        if (NIL != pph_phrase.pph_phrase_p(best_phrase, UNPROVIDED)) {
                            pph_phrase.pph_phrase_copy(best_phrase, phrase, UNPROVIDED);
                        }
                    }
                    if (category.eql($$PossessivePhrase) && (NIL != pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED)))) {
                        pph_phrase.pph_phrase_set_category(phrase, category, UNPROVIDED);
                    } else {
                        if ((NIL != category) && (NIL == pph_phrase.pph_phrase_reconcile_categories(category, pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED))) {
                            {
                                SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt118$Can_t_reconcile__S_and__S_) });
                                pph_error.pph_handle_error(new_format_string, list(category, pph_phrase.pph_phrase_category(phrase, UNPROVIDED)));
                            }
                        }
                    }
                }
            } else {
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
                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_replace_generic_args(dtr, formula, arg_position_map);
                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                }
            }
        }
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_sanity_check_arg_position_map(phrase, formula, arg_position_map);
        return values(NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase) ? ((SubLObject) (pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) : pph_phrase.pph_phrase_category(phrase, UNPROVIDED), pph_phrase.pph_phrase_arg_position_map(phrase));
    }

    public static SubLObject pph_phrase_replace_generic_args_recursive(final SubLObject phrase, final SubLObject formula, final SubLObject arg_position_map) {
        SubLObject new_cycl;
        final SubLObject old_cycl = new_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (NIL != pph_types.pph_phrase_nautP(new_cycl)) {
            final SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
            final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            SubLObject local_arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            if (NIL != agr_pred) {
                new_cycl = list(pph_functions.phraseformfn(), agr_pred, new_cycl);
                local_arg_position_map = pph_utilities.pph_contextualize_map($list109, local_arg_position_map);
            }
            if (NIL != category) {
                new_cycl = list(pph_functions.phraseformfn(), category, new_cycl);
                local_arg_position_map = pph_utilities.pph_contextualize_map($list109, local_arg_position_map);
            }
            final SubLObject best_phrase = pph_phrase.new_pph_phrase_for_cycl(new_cycl, local_arg_position_map, UNPROVIDED);
            if (NIL != pph_phrase.pph_phrase_p(best_phrase, UNPROVIDED)) {
                pph_phrase.pph_phrase_copy(best_phrase, phrase, UNPROVIDED);
            }
            if (category.eql($$PossessivePhrase) && (NIL != pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED)))) {
                pph_phrase.pph_phrase_set_category(phrase, category, UNPROVIDED);
            } else
                if ((NIL != category) && (NIL == pph_phrase.pph_phrase_reconcile_categories(category, pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED))) {
                    final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str110$Can_t_reconcile__S_and__S_) });
                    pph_error.pph_handle_error(new_format_string, list(category, pph_phrase.pph_phrase_category(phrase, UNPROVIDED)));
                }

        } else {
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
                    pph_phrase_replace_generic_args(dtr, formula, arg_position_map);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return values(NIL != pph_phrase.pph_phrase_has_known_cyclP(phrase) ? pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED) : pph_phrase.pph_phrase_category(phrase, UNPROVIDED), pph_phrase.pph_phrase_arg_position_map(phrase));
    }

    public static final SubLObject pph_phrase_reserve_matrix_arg0_cycl_alt(SubLObject phrase) {
        {
            SubLObject current_arg0 = pph_phrase.pph_current_arg0();
            SubLObject current_arg0_position = pph_phrase.pph_current_arg0_position();
            SubLObject result = $NO_ACTION;
            if (NIL != pph_phrase.pph_unknown_cycl_p(current_arg0)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    Errors.warn($str_alt120$No_current_arg0_to_reserve_for__S, phrase);
                }
                result = $NO_CURRENT_ARG0;
            } else {
                result = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserve_arg0(phrase, current_arg0, current_arg0_position);
            }
            return result;
        }
    }

    public static SubLObject pph_phrase_reserve_matrix_arg0_cycl(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_arg0 = pph_phrase.pph_current_arg0();
        final SubLObject current_arg0_position = pph_phrase.pph_current_arg0_position();
        SubLObject result = $NO_ACTION;
        if (NIL != pph_phrase.pph_unknown_cycl_p(current_arg0)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str112$No_current_arg0_to_reserve_for__S, phrase);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            result = $NO_CURRENT_ARG0;
        } else {
            result = pph_phrase_reserve_arg0(phrase, current_arg0, current_arg0_position);
        }
        return result;
    }

    /**
     * Replace reservations for OUT with reservations for IN.
     *
     * @unknown destructive.
     */
    @LispMethod(comment = "Replace reservations for OUT with reservations for IN.\r\n\r\n@unknown destructive.")
    public static final SubLObject pph_phrase_reset_arg0_reservations_alt(SubLObject phrase, SubLObject out, SubLObject in, SubLObject arg_position_map) {
        com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reset_arg0_reservations_int(phrase, out, in, arg_position_map);
        return phrase;
    }

    @LispMethod(comment = "Replace reservations for OUT with reservations for IN.\r\n\r\n@unknown destructive.")
    public static SubLObject pph_phrase_reset_arg0_reservations(final SubLObject phrase, final SubLObject out, final SubLObject in, final SubLObject arg_position_map) {
        pph_phrase_reset_arg0_reservations_int(phrase, out, in, arg_position_map);
        return phrase;
    }

    public static final SubLObject pph_phrase_reset_arg0_reservations_int_alt(SubLObject phrase, SubLObject out, SubLObject in, SubLObject arg_position_map) {
        if (com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0(phrase).equal(out)) {
            {
                SubLObject local_arg_position = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0_position(phrase);
                SubLObject arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserve_arg0(phrase, in, arg_position);
            }
        }
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
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reset_arg0_reservations_int(dtr, out, in, arg_position_map);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return phrase;
    }

    public static SubLObject pph_phrase_reset_arg0_reservations_int(final SubLObject phrase, final SubLObject out, final SubLObject in, final SubLObject arg_position_map) {
        if (pph_phrase_reserved_arg0(phrase).equal(out)) {
            final SubLObject local_arg_position = pph_phrase_reserved_arg0_position(phrase);
            final SubLObject arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            pph_phrase_reserve_arg0(phrase, in, arg_position);
        }
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
                pph_phrase_reset_arg0_reservations_int(dtr, out, in, arg_position_map);
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }

    public static final SubLObject pph_phrase_reserve_arg0_alt(SubLObject phrase, SubLObject arg0, SubLObject arg0_position) {
        {
            SubLObject result = cons(arg0, arg0_position);
            pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $RESERVED_FOR_MATRIX_ARG0, ONE_INTEGER, result);
            return result;
        }
    }

    public static SubLObject pph_phrase_reserve_arg0(final SubLObject phrase, final SubLObject arg0, final SubLObject arg0_position) {
        final SubLObject result = cons(arg0, arg0_position);
        pph_data_structures.pph_phrase_info_set_by_keyword_or_integer(phrase, $RESERVED_FOR_MATRIX_ARG0, ONE_INTEGER, result);
        return result;
    }

    public static final SubLObject pph_phrase_reserved_arg0_alt(SubLObject phrase) {
        {
            SubLObject pair = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0_low(phrase);
            return pair.isCons() ? ((SubLObject) (pair.first())) : pph_phrase.pph_unknown_cycl();
        }
    }

    public static SubLObject pph_phrase_reserved_arg0(final SubLObject phrase) {
        final SubLObject pair = pph_phrase_reserved_arg0_low(phrase);
        return pair.isCons() ? pair.first() : pph_phrase.pph_unknown_cycl();
    }

    public static final SubLObject pph_phrase_reserved_arg0_low_alt(SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $RESERVED_FOR_MATRIX_ARG0, ONE_INTEGER, NIL);
    }

    public static SubLObject pph_phrase_reserved_arg0_low(final SubLObject phrase) {
        return pph_data_structures.pph_phrase_info_lookup_by_keyword_or_integer(phrase, $RESERVED_FOR_MATRIX_ARG0, ONE_INTEGER, NIL);
    }

    public static final SubLObject pph_phrase_reserved_arg0_position_alt(SubLObject phrase) {
        {
            SubLObject pair = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0_low(phrase);
            return pair.isCons() ? ((SubLObject) (pair.rest())) : pph_utilities.pph_unknown_arg_position();
        }
    }

    public static SubLObject pph_phrase_reserved_arg0_position(final SubLObject phrase) {
        final SubLObject pair = pph_phrase_reserved_arg0_low(phrase);
        return pair.isCons() ? pair.rest() : pph_utilities.pph_unknown_arg_position();
    }

    public static final SubLObject pph_phrase_reserved_for_arg0_p_alt(SubLObject phrase) {
        return makeBoolean(NIL == pph_phrase.pph_unknown_cycl_p(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_reserved_arg0(phrase)));
    }

    public static SubLObject pph_phrase_reserved_for_arg0_p(final SubLObject phrase) {
        return makeBoolean(NIL == pph_phrase.pph_unknown_cycl_p(pph_phrase_reserved_arg0(phrase)));
    }

    public static final SubLObject pph_chemical_formula_from_lists_phrase_get_string_alt(SubLObject phrase) {
        {
            SubLObject element_list = NIL;
            SubLObject quantity_list = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(phrase);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    SubLObject pcase_var = dtr_num;
                    if (pcase_var.eql(ZERO_INTEGER)) {
                        element_list = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                    } else {
                        if (pcase_var.eql(ONE_INTEGER)) {
                            quantity_list = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                        }
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            {
                SubLObject item = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_output_item_from_atomic_composition_lists(element_list, quantity_list);
                pph_phrase.pph_phrase_set_output_list(phrase, list(item), UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static SubLObject pph_chemical_formula_from_lists_phrase_get_string(final SubLObject phrase) {
        SubLObject element_list = NIL;
        SubLObject quantity_list = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject pcase_var;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                pcase_var = dtr_num;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    element_list = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        quantity_list = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                    }

                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        final SubLObject item = pph_output_item_from_atomic_composition_lists(element_list, quantity_list);
        pph_phrase.pph_phrase_set_output_list(phrase, list(item), UNPROVIDED);
        pph_phrase.pph_phrase_note_done(phrase);
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_output_item_from_atomic_composition_lists_alt(SubLObject element_list, SubLObject quantity_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_items = NIL;
                SubLObject abortP = makeBoolean(((NIL == el_list_p(element_list)) || (NIL == el_list_p(quantity_list))) || (NIL == list_utilities.same_length_p(el_list_items(element_list), el_list_items(quantity_list))));
                if (NIL == abortP) {
                    {
                        SubLObject element = NIL;
                        SubLObject element_11 = NIL;
                        SubLObject quantity = NIL;
                        SubLObject quantity_12 = NIL;
                        for (element = cycl_utilities.formula_args(element_list, UNPROVIDED), element_11 = element.first(), quantity = cycl_utilities.formula_args(quantity_list, UNPROVIDED), quantity_12 = quantity.first(); !((NIL != abortP) || ((NIL == quantity) && (NIL == element))); element = element.rest() , element_11 = element.first() , quantity = quantity.rest() , quantity_12 = quantity.first()) {
                            {
                                SubLObject atomic_symbol = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_atomic_symbol(element_11);
                                if (atomic_symbol.isString()) {
                                    output_items = cons(pph_data_structures.new_pph_phrase_output_item(atomic_symbol, NIL, element_11, UNPROVIDED, UNPROVIDED, UNPROVIDED), output_items);
                                } else {
                                    abortP = T;
                                }
                                if (quantity_12.isInteger() && quantity_12.numG(ONE_INTEGER)) {
                                    {
                                        SubLObject quantity_item = pph_data_structures.new_pph_phrase_output_item(princ_to_string(quantity_12), NIL, quantity_12, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                                            pph_html.pph_phrase_output_item_subscript(quantity_item);
                                        }
                                        output_items = cons(quantity_item, output_items);
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL != abortP ? ((SubLObject) (NIL)) : pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(output_items));
            }
        }
    }

    public static SubLObject pph_output_item_from_atomic_composition_lists(final SubLObject element_list, final SubLObject quantity_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_items = NIL;
        SubLObject abortP = makeBoolean(((NIL == el_list_p(element_list)) || (NIL == el_list_p(quantity_list))) || (NIL == list_utilities.same_length_p(el_list_items(element_list), el_list_items(quantity_list))));
        if (NIL == abortP) {
            SubLObject element = NIL;
            SubLObject element_$9 = NIL;
            SubLObject quantity = NIL;
            SubLObject quantity_$10 = NIL;
            element = cycl_utilities.formula_args(element_list, UNPROVIDED);
            element_$9 = element.first();
            quantity = cycl_utilities.formula_args(quantity_list, UNPROVIDED);
            quantity_$10 = quantity.first();
            while ((NIL == abortP) && ((NIL != quantity) || (NIL != element))) {
                final SubLObject atomic_symbol = pph_atomic_symbol(element_$9);
                if (atomic_symbol.isString()) {
                    output_items = cons(pph_data_structures.new_pph_phrase_output_item(atomic_symbol, NIL, element_$9, UNPROVIDED, UNPROVIDED, UNPROVIDED), output_items);
                } else {
                    abortP = T;
                }
                if (quantity_$10.isInteger() && quantity_$10.numG(ONE_INTEGER)) {
                    final SubLObject quantity_item = pph_data_structures.new_pph_phrase_output_item(princ_to_string(quantity_$10), NIL, quantity_$10, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) {
                        pph_html.pph_phrase_output_item_subscript(quantity_item);
                    }
                    output_items = cons(quantity_item, output_items);
                }
                element = element.rest();
                element_$9 = element.first();
                quantity = quantity.rest();
                quantity_$10 = quantity.first();
            } 
        }
        return NIL != abortP ? NIL : pph_data_structures.new_pph_phrase_output_item_nospace_group(nreverse(output_items));
    }

    public static final SubLObject pph_atomic_symbol_alt(SubLObject element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_ask_variable($sym124$_SYMBOL, listS($$atomicSymbol, element, $list_alt126), pph_vars.$pph_language_mt$.getDynamicValue(thread), NIL, ONE_INTEGER).first();
        }
    }

    public static SubLObject pph_atomic_symbol(final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_ask_variable($sym116$_SYMBOL, listS($$atomicSymbol, element, $list118), pph_vars.$pph_language_mt$.getDynamicValue(thread), NIL, ONE_INTEGER).first();
    }

    public static final SubLObject pph_symbol_phrase_get_string_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_symbol_phrase_p(phrase)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_SYMBOL_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject symbol = pph_data_structures.pph_phrase_info_lookup(phrase, $SYMBOL, UNPROVIDED);
                SubLObject string = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_symbol_string(symbol);
                if (string.isString()) {
                    pph_phrase.pph_phrase_set_string(phrase, string);
                    pph_phrase.pph_phrase_set_agr_pred(phrase, $$nameString, UNPROVIDED);
                } else {
                    if (NIL != subl_promotions.memberP(phrase, $pph_symbol_phrase_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                        pph_methods.generate_princ(phrase);
                    } else {
                        {
                            SubLObject _prev_bind_0 = $pph_symbol_phrase_stack$.currentBinding(thread);
                            try {
                                $pph_symbol_phrase_stack$.bind(cons(phrase, $pph_symbol_phrase_stack$.getDynamicValue(thread)), thread);
                                pph_phrase.pph_phrase_set_category(phrase, $list_alt130, NIL);
                                pph_phrase.pph_phrase_set_cycl(phrase, symbol);
                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                $pph_symbol_phrase_stack$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject pph_symbol_phrase_get_string(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject symbol = pph_data_structures.pph_phrase_info_lookup(phrase, $SYMBOL, UNPROVIDED);
        final SubLObject string = pph_symbol_string(symbol);
        if (NIL != pph_string.pph_string_p(string)) {
            pph_phrase.pph_phrase_set_string(phrase, string);
            pph_phrase.pph_phrase_set_agr_pred(phrase, $$nameString, UNPROVIDED);
        } else
            if (NIL != subl_promotions.memberP(phrase, $pph_symbol_phrase_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                pph_methods.generate_princ(phrase);
            } else {
                final SubLObject _prev_bind_0 = $pph_symbol_phrase_stack$.currentBinding(thread);
                try {
                    $pph_symbol_phrase_stack$.bind(cons(phrase, $pph_symbol_phrase_stack$.getDynamicValue(thread)), thread);
                    pph_phrase.pph_phrase_set_category(phrase, $list121, NIL);
                    pph_phrase.pph_phrase_set_cycl(phrase, symbol);
                    pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    $pph_symbol_phrase_stack$.rebind(_prev_bind_0, thread);
                }
            }

        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_symbol_string_alt(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                if (NIL == indexed_term_p(symbol)) {
                    return pph_main.generate_phrase_no_checks(symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if ($HTML == pph_vars.$paraphrase_mode$.getDynamicValue(thread)) {
                        string = pph_utilities.pph_ask_variable($sym131$_CODE, listS($$htmlGlyphCode, symbol, $list_alt133), pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
                        if (!string.isString()) {
                            string = pph_utilities.pph_ask_variable($sym131$_CODE, listS($$htmlStringVersionOfCharacter, symbol, $list_alt133), pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
                        }
                    }
                }
                if (!string.isString()) {
                    string = pph_methods_lexicon.some_name_for_term(symbol, $$termStrings, pph_vars.$pph_language_mt$.getDynamicValue(thread));
                }
                return string;
            }
        }
    }

    public static SubLObject pph_symbol_string(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == indexed_term_p(symbol)) {
            return pph_main.generate_phrase_no_checks(symbol, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject string = pph_utilities.pph_ask_variable($sym122$_CODE, listS($$htmlGlyphCode, symbol, $list124), pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
        if (!string.isString()) {
            string = pph_utilities.pph_ask_variable($sym122$_CODE, listS($$htmlStringVersionOfCharacter, symbol, $list124), pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).first();
        }
        if (!string.isString()) {
            string = pph_methods_lexicon.some_name_for_term(symbol, $$termStrings, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
        if (string.isString() && (NIL != string_utilities.html_escaped_string_p(string))) {
            return unicode_strings.html_escaped_to_unicode_vector(string);
        }
        return pph_string.pph_string_from_cycl_string(string);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static final SubLObject pph_phrase_output_list_add_sentential_force_alt(SubLObject olist, SubLObject force) {
        {
            SubLObject pcase_var = force;
            if (pcase_var.eql($DECLARATIVE)) {
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_upcase_leading_smart(olist);
                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_period_smart(olist);
            } else {
                if (pcase_var.eql($INTERROGATIVE) || pcase_var.eql($QUESTION)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_upcase_leading_smart(olist);
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_question_mark_smart(olist);
                }
            }
        }
        return olist;
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static SubLObject pph_phrase_output_list_add_sentential_force(final SubLObject olist, final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            pph_phrase_output_list_upcase_leading_smart(olist);
            pph_phrase_output_list_add_period_smart(olist);
        } else
            if (force.eql($INTERROGATIVE) || force.eql($QUESTION)) {
                pph_phrase_output_list_upcase_leading_smart(olist);
                pph_phrase_output_list_add_question_mark_smart(olist);
            }

        return olist;
    }

    public static SubLObject pph_phrase_add_sentential_force(final SubLObject phrase, SubLObject force) {
        if ($DEFAULT == force) {
            force = pph_utilities.pph_default_force_for_term(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        }
        final SubLObject olist = pph_phrase.pph_phrase_output_list(phrase);
        pph_phrase_output_list_add_sentential_force(olist, force);
        pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
        return phrase;
    }

    public static SubLObject pph_string_add_sentence_initial_force(final SubLObject string, final SubLObject force) {
        if ((force.eql($DECLARATIVE) || force.eql($INTERROGATIVE)) || force.eql($QUESTION)) {
            return pph_utilities.upcase_leading_smart(string);
        }
        return string;
    }

    public static SubLObject pph_string_add_sentence_final_force(final SubLObject string, final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            return pph_string_add_punctuation_smart(string, $str131$_);
        }
        if (force.eql($INTERROGATIVE) || force.eql($QUESTION)) {
            return pph_string_add_punctuation_smart(string, $str132$_);
        }
        return string;
    }

    public static SubLObject pph_phrase_output_list_has_sentential_forceP(final SubLObject olist, final SubLObject force) {
        final SubLObject string = pph_phrase.pph_phrase_output_list_string(olist, NIL);
        if (force.eql($DECLARATIVE)) {
            return makeBoolean((NIL != upcased_leading_smartP(string)) && (NIL != ends_with_period_smartP(string)));
        }
        if (force.eql($INTERROGATIVE) || force.eql($QUESTION)) {
            return makeBoolean((NIL != upcased_leading_smartP(string)) && (NIL != ends_with_question_mark_smartP(string)));
        }
        if (force.eql($NONE)) {
            return makeBoolean(NIL == upcased_leading_smartP(string));
        }
        return NIL;
    }

    public static SubLObject pph_string_has_sentential_forceP(final SubLObject string, final SubLObject force) {
        return makeBoolean((NIL != pph_string_has_sentence_initial_forceP(string, force)) && (NIL != pph_string_has_sentence_final_forceP(string, force)));
    }

    public static SubLObject pph_string_has_sentence_initial_forceP(final SubLObject string, final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            return upcased_leading_smartP(string);
        }
        if (force.eql($INTERROGATIVE) || force.eql($QUESTION)) {
            return upcased_leading_smartP(string);
        }
        if (force.eql($NONE)) {
            return makeBoolean(NIL == upcased_leading_smartP(string));
        }
        return NIL;
    }

    public static SubLObject pph_string_has_sentence_final_forceP(final SubLObject string, final SubLObject force) {
        if (force.eql($DECLARATIVE)) {
            return ends_with_period_smartP(string);
        }
        if (force.eql($INTERROGATIVE) || force.eql($QUESTION)) {
            return ends_with_question_mark_smartP(string);
        }
        if (force.eql($NONE)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static final SubLObject pph_phrase_output_list_upcase_leading_smart_alt(SubLObject olist) {
        if (NIL == olist) {
            return olist;
        }
        {
            SubLObject first_stringy_item = find_if($sym139$NON_EMPTY_STRING_, olist, PPH_PHRASE_OUTPUT_ITEM_STRING, UNPROVIDED, UNPROVIDED);
            SubLObject new_car = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_item_upcase_leading_smart(first_stringy_item);
            SubLObject position = position(first_stringy_item, olist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            list_utilities.nreplace_nth(position, new_car, olist);
        }
        return olist;
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static SubLObject pph_phrase_output_list_upcase_leading_smart(final SubLObject olist) {
        if (NIL == olist) {
            return values(olist, NIL);
        }
        SubLObject cdolist_list_var = olist;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = pph_data_structures.pph_phrase_output_item_string(item);
            if ((NIL != pph_string.non_empty_pph_stringP(string)) && (NIL != pph_string.pph_string_find_if(ALPHANUMERIC_CHAR_P, string))) {
                final SubLObject new_car = pph_phrase_output_item_upcase_leading_smart(item);
                final SubLObject position = position(item, olist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                list_utilities.nreplace_nth(position, new_car, olist);
                return values(olist, T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return values(olist, NIL);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; ITEM with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; ITEM with modifications")
    public static final SubLObject pph_phrase_output_item_upcase_leading_smart_alt(SubLObject item) {
        if (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item)) {
            {
                SubLObject olists = pph_data_structures.pph_phrase_output_item_nospace_group_items(item);
                SubLObject first_olist = olists.first();
                SubLObject new_first_olist = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_upcase_leading_smart(first_olist);
                SubLObject new_olists = cons(new_first_olist, olists.rest());
                pph_data_structures.pph_phrase_output_item_nospace_group_set_items(item, new_olists);
                return item;
            }
        } else {
            {
                SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(item);
                SubLObject item_string = string_utilities.copy_string(pph_data_structures.pph_phrase_output_item_string(new_item));
                SubLObject new_item_string = pph_utilities.upcase_leading_smart(item_string);
                pph_data_structures.pph_phrase_output_item_set_string(new_item, new_item_string);
                return new_item;
            }
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; ITEM with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; ITEM with modifications")
    public static SubLObject pph_phrase_output_item_upcase_leading_smart(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_data_structures.pph_phrase_output_item_nospace_group_p(item)) {
            final SubLObject olists = pph_data_structures.pph_phrase_output_item_nospace_group_items(item);
            SubLObject new_olists = NIL;
            SubLObject new_nth_olist = NIL;
            SubLObject n = ZERO_INTEGER;
            SubLObject upcased_n = NIL;
            if (NIL == upcased_n) {
                SubLObject csome_list_var = olists;
                SubLObject olist = NIL;
                olist = csome_list_var.first();
                while ((NIL == upcased_n) && (NIL != csome_list_var)) {
                    thread.resetMultipleValues();
                    final SubLObject new_olist = pph_phrase_output_list_upcase_leading_smart(olist);
                    final SubLObject upcasedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != upcasedP) {
                        new_nth_olist = new_olist;
                        upcased_n = n;
                    }
                    n = add(n, ONE_INTEGER);
                    csome_list_var = csome_list_var.rest();
                    olist = csome_list_var.first();
                } 
            }
            if (NIL != upcased_n) {
                new_olists = list_utilities.replace_nth(upcased_n, new_nth_olist, olists);
                pph_data_structures.pph_phrase_output_item_nospace_group_set_items(item, new_olists);
            }
            return item;
        }
        final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(item);
        final SubLObject item_string = pph_string.pph_string_copy(pph_data_structures.pph_phrase_output_item_string(new_item));
        final SubLObject new_item_string = pph_utilities.upcase_leading_smart(item_string);
        pph_data_structures.pph_phrase_output_item_set_string(new_item, new_item_string);
        return new_item;
    }

    public static SubLObject upcased_leading_smartP(final SubLObject string) {
        if (NIL != upper_case_p(pph_string.pph_string_char(string, ZERO_INTEGER))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject ends_with_period_smartP(final SubLObject string) {
        return ends_with_punctuation_smartP(string, $str131$_);
    }

    public static SubLObject ends_with_question_mark_smartP(final SubLObject string) {
        return ends_with_punctuation_smartP(string, $str132$_);
    }

    public static SubLObject ends_with_punctuation_smartP(final SubLObject string, final SubLObject punc_string) {
        if (NIL != pph_string.pph_string_ends_with(string, punc_string, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static final SubLObject pph_phrase_output_list_add_period_smart_alt(SubLObject olist) {
        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_punctuation_smart(olist, $str_alt141$_);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static SubLObject pph_phrase_output_list_add_period_smart(final SubLObject olist) {
        return pph_phrase_output_list_add_punctuation_smart(olist, $str131$_);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static final SubLObject pph_phrase_output_list_add_question_mark_smart_alt(SubLObject olist) {
        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_punctuation_smart(olist, $str_alt142$_);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static SubLObject pph_phrase_output_list_add_question_mark_smart(final SubLObject olist) {
        return pph_phrase_output_list_add_punctuation_smart(olist, $str132$_);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static final SubLObject pph_phrase_output_list_add_punctuation_smart_alt(SubLObject olist, SubLObject punc_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_utilities.pph_final_punctuation_string_p(punc_string)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(punc_string), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_FINAL_PUNCTUATION_STRING_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject tail = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_output_list_nonempty_tail(olist);
                if (NIL != tail) {
                    {
                        SubLObject datum = tail;
                        SubLObject current = datum;
                        SubLObject last_non_empty_item = NIL;
                        SubLObject trailing_items = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt144);
                        last_non_empty_item = current.first();
                        current = current.rest();
                        trailing_items = current;
                        {
                            SubLObject last_string = pph_data_structures.pph_phrase_output_item_string(last_non_empty_item);
                            if (NIL != pph_utilities.pph_punctuation_ok_after_stringP(last_string, punc_string)) {
                                {
                                    SubLObject new_item = pph_question.new_pph_phrase_filler_item(punc_string);
                                    rplacd(tail, cons(new_item, trailing_items));
                                }
                            }
                        }
                    }
                }
            }
            return olist;
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; OLIST with modifications")
    public static SubLObject pph_phrase_output_list_add_punctuation_smart(final SubLObject olist, final SubLObject punc_string) {
        final SubLObject tail = pph_output_list_nonempty_tail(olist);
        if (NIL != tail) {
            SubLObject current;
            final SubLObject datum = current = tail;
            SubLObject last_non_empty_item = NIL;
            SubLObject trailing_items = NIL;
            destructuring_bind_must_consp(current, datum, $list135);
            last_non_empty_item = current.first();
            current = trailing_items = current.rest();
            final SubLObject last_string = pph_data_structures.pph_phrase_output_item_string(last_non_empty_item);
            if (NIL != pph_utilities.pph_punctuation_ok_after_stringP(last_string, punc_string)) {
                final SubLObject new_item = pph_question.new_pph_phrase_filler_item(punc_string);
                rplacd(tail, cons(new_item, trailing_items));
            }
        }
        return olist;
    }

    public static SubLObject pph_string_add_punctuation_smart(final SubLObject string, final SubLObject punc_string) {
        if (NIL != pph_utilities.pph_punctuation_ok_after_stringP(string, punc_string)) {
            return pph_string.pph_string_concatenate(string, punc_string);
        }
        return string;
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; trailing sublist of OLIST that contains
    the last item with a non-empty string.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; trailing sublist of OLIST that contains\r\nthe last item with a non-empty string.")
    public static final SubLObject pph_output_list_nonempty_tail_alt(SubLObject olist) {
        {
            SubLObject ans = NIL;
            if (NIL == ans) {
                {
                    SubLObject end_var = number_utilities.f_1X(length(olist));
                    SubLObject n = NIL;
                    for (n = ONE_INTEGER; !((NIL != ans) || n.numGE(end_var)); n = number_utilities.f_1X(n)) {
                        {
                            SubLObject tail = last(olist, n);
                            if (NIL != string_utilities.non_empty_stringP(pph_data_structures.pph_phrase_output_item_string(tail.first()))) {
                                ans = tail;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-LIST-P; trailing sublist of OLIST that contains
    the last item with a non-empty string.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-LIST-P; trailing sublist of OLIST that contains\r\nthe last item with a non-empty string.")
    public static SubLObject pph_output_list_nonempty_tail(final SubLObject olist) {
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject end_var;
            SubLObject n;
            SubLObject tail;
            for (end_var = number_utilities.f_1X(length(olist)), n = NIL, n = ONE_INTEGER; (NIL == ans) && (!n.numGE(end_var)); n = number_utilities.f_1X(n)) {
                tail = last(olist, n);
                if (NIL != pph_string.non_empty_pph_stringP(pph_data_structures.pph_phrase_output_item_string(tail.first()))) {
                    ans = tail;
                }
            }
        }
        return ans;
    }

    public static final SubLObject pph_percent_phrase_get_string_alt(SubLObject phrase, SubLObject top_level_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_percent_phrase_p(phrase)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PERCENT_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject percent_as_decimal = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                if (percent_as_decimal.isNumber()) {
                    pph_phrase.pph_phrase_set_cycl(phrase, multiply($int$100, percent_as_decimal));
                    {
                        SubLObject cutoff = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_float_precision(percent_as_decimal);
                        SubLObject candidates = list_utilities.remove_if_not(POSITIVE_INTEGER_P, list(cutoff, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                            try {
                                pph_vars.$pph_significant_digits_cutoff$.bind(NIL != candidates ? ((SubLObject) (number_utilities.minimum(candidates, UNPROVIDED))) : NIL, thread);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt148$Using_significant_digits_cutoff_o, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread), pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                }
                                pph_methods.generate_float(phrase);
                            } finally {
                                pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    {
                        SubLObject bare_number_olist = pph_phrase.pph_phrase_output_list(phrase);
                        SubLObject new_olist = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_output_list_add_punctuation_smart(bare_number_olist, $str_alt149$_);
                        pph_phrase.pph_phrase_set_output_list(phrase, new_olist, UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                } else {
                    pph_phrase.pph_phrase_clear_special_type(phrase);
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_get_string(phrase, top_level_cycl, pph_phrase.pph_phrase_logical_mother(phrase));
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject pph_percent_phrase_get_string(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject percent_as_decimal = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if (percent_as_decimal.isNumber()) {
            pph_phrase.pph_phrase_set_cycl(phrase, multiply($int$100, percent_as_decimal));
            final SubLObject cutoff = pph_float_precision(percent_as_decimal);
            final SubLObject candidates = list_utilities.remove_if_not(POSITIVE_INTEGER_P, list(cutoff, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
            try {
                pph_vars.$pph_significant_digits_cutoff$.bind(NIL != candidates ? number_utilities.minimum(candidates, UNPROVIDED) : NIL, thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str138$Using_significant_digits_cutoff_o, pph_vars.$pph_significant_digits_cutoff$.getDynamicValue(thread), pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_methods.generate_float(phrase);
            } finally {
                pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_0, thread);
            }
            final SubLObject bare_number_olist = pph_phrase.pph_phrase_output_list(phrase);
            final SubLObject new_olist = pph_phrase_output_list_add_punctuation_smart(bare_number_olist, $str139$_);
            pph_phrase.pph_phrase_set_output_list(phrase, new_olist, UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        } else {
            pph_phrase.pph_phrase_clear_special_type(phrase);
            pph_phrase_get_string(phrase, top_level_cycl, pph_phrase.pph_phrase_logical_mother(phrase));
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }

    public static final SubLObject pph_float_precision_alt(SubLObject v_float) {
        {
            SubLObject float_string = princ_to_string(v_float);
            SubLObject no_dot = remove(CHAR_period, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject trimmed = Strings.string_left_trim($list_alt150, no_dot);
            SubLObject first_alpha_position = position_if(ALPHA_CHAR_P, trimmed, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cutoff = (NIL != first_alpha_position) ? ((SubLObject) (first_alpha_position)) : length(trimmed);
            return NIL != subl_promotions.positive_integer_p(cutoff) ? ((SubLObject) (cutoff)) : NIL;
        }
    }

    public static SubLObject pph_float_precision(final SubLObject v_float) {
        final SubLObject float_string = princ_to_string(v_float);
        final SubLObject no_dot = remove(CHAR_period, float_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject trimmed = Strings.string_left_trim($list140, no_dot);
        final SubLObject first_alpha_position = position_if(ALPHA_CHAR_P, trimmed, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject cutoff = (NIL != first_alpha_position) ? first_alpha_position : length(trimmed);
        return NIL != subl_promotions.positive_integer_p(cutoff) ? cutoff : NIL;
    }

    public static final SubLObject pph_coordination_phrase_get_string_alt(SubLObject phrase, SubLObject top_level_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_coordination_phrase_p(phrase)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_COORDINATION_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject abortP = NIL;
                if (((NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_nbar_coordination_phrase_p(phrase)) && (NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(pph_phrase.pph_phrase_mother(phrase)), UNPROVIDED))) {
                    {
                        SubLObject determiner_distributed_okP = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_nbar_coordination_phrase_distribute_determiner(phrase, top_level_cycl);
                        if (NIL == determiner_distributed_okP) {
                            abortP = T;
                        }
                    }
                }
                if (NIL == abortP) {
                    {
                        SubLObject _prev_bind_0 = $pph_coordination_phrase_nesting$.currentBinding(thread);
                        try {
                            $pph_coordination_phrase_nesting$.bind(number_utilities.f_1X($pph_coordination_phrase_nesting$.getDynamicValue(thread)), thread);
                            if ($pph_coordination_phrase_nesting$.getDynamicValue(thread).numG($pph_coordination_phrase_nesting_max$.getDynamicValue(thread))) {
                                {
                                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt153$__Recursion_limit___S__exceeded_i) });
                                    pph_error.pph_handle_error(new_format_string, list($pph_coordination_phrase_nesting_max$.getDynamicValue(thread)));
                                }
                            } else {
                                com.cyc.cycjava.cycl.pph_phrase_resolution.pph_coordination_phrase_get_string_internal(phrase, top_level_cycl);
                            }
                        } finally {
                            $pph_coordination_phrase_nesting$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return pph_phrase.pph_phrase_output_list(phrase);
        }
    }

    public static SubLObject pph_coordination_phrase_get_string(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = NIL;
        if (((NIL != pph_nbar_coordination_phrase_p(phrase)) && (NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), UNPROVIDED))) && (NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(pph_phrase.pph_phrase_mother(phrase)), UNPROVIDED))) {
            final SubLObject determiner_distributed_okP = pph_nbar_coordination_phrase_distribute_determiner(phrase, top_level_cycl);
            if (NIL == determiner_distributed_okP) {
                abortP = T;
            }
        }
        if (NIL == abortP) {
            final SubLObject _prev_bind_0 = $pph_coordination_phrase_nesting$.currentBinding(thread);
            try {
                $pph_coordination_phrase_nesting$.bind(number_utilities.f_1X($pph_coordination_phrase_nesting$.getDynamicValue(thread)), thread);
                if ($pph_coordination_phrase_nesting$.getDynamicValue(thread).numG($pph_coordination_phrase_nesting_max$.getDynamicValue(thread))) {
                    final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str142$__Recursion_limit___S__exceeded_i) });
                    pph_error.pph_handle_error(new_format_string, list($pph_coordination_phrase_nesting_max$.getDynamicValue(thread)));
                } else {
                    pph_coordination_phrase_get_string_internal(phrase, top_level_cycl);
                }
            } finally {
                $pph_coordination_phrase_nesting$.rebind(_prev_bind_0, thread);
            }
        }
        return phrase;
    }

    public static final SubLObject pph_coordination_phrase_get_string_internal_alt(SubLObject phrase, SubLObject top_level_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dtrs_resolvedP = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_try_to_resolve_dtr_strings(phrase, top_level_cycl);
                if (dtrs_resolvedP == $RESOLVED) {
                    if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_coordination_phrase_p(phrase)))) {
                        {
                            SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_COORDINATION_PHRASE_P) })) });
                            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                        }
                    }
                    {
                        SubLObject datum = pph_phrase.pph_phrase_category(phrase, NIL).rest();
                        SubLObject current = datum;
                        SubLObject coord_keyword = NIL;
                        SubLObject list_type_id_string = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt154);
                        coord_keyword = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt154);
                        list_type_id_string = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (coord_keyword.eql($AND) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agrees_with_no_quantified_phrase_p(pph_phrase.pph_phrase_maximal_projection(phrase)))) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt156$Changing_coordination_to__OR__bas);
                                }
                                coord_keyword = $OR;
                            }
                            {
                                SubLObject opr_item = (NIL != pph_phrase.pph_unknown_cycl_p(top_level_cycl)) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.pph_phrase_resolution.pph_coordination_phrase_operator_item(phrase, top_level_cycl);
                                SubLObject dtr_olists = pph_phrase.pph_phrase_dtr_output_lists(phrase);
                                SubLObject olist = pph_methods_formulas.pph_junct_olist_from_olists(dtr_olists, coord_keyword, opr_item, list_type_id_string);
                                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                                pph_phrase.pph_phrase_note_done(phrase);
                            }
                            pph_phrase.pph_phrase_set_category(phrase, pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED), NIL);
                            pph_phrase.pph_phrase_set_agr(phrase, pph_data_structures.pph_phrase_agr_copy(pph_phrase.pph_phrase_agr(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER)), UNPROVIDED), UNPROVIDED);
                            if (($AND == coord_keyword) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED), UNPROVIDED), $$Noun, UNPROVIDED))) {
                                {
                                    SubLObject agr_pred = (pph_phrase.pph_phrase_dtr_count(phrase).numG(ONE_INTEGER)) ? ((SubLObject) ($$plural_Generic)) : $$singular_Generic;
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt161$__Setting_conjunctive_agr_of__S_t, pph_phrase.pph_phrase_string(phrase, NIL), agr_pred);
                                    }
                                    pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt154);
                        }
                    }
                }
            }
            return phrase;
        }
    }

    public static SubLObject pph_coordination_phrase_get_string_internal(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject dtrs_resolvedP = pph_phrase_try_to_resolve_dtr_strings(phrase, top_level_cycl);
        if (dtrs_resolvedP == $RESOLVED) {
            SubLObject current;
            final SubLObject datum = current = pph_phrase.pph_phrase_category(phrase, NIL).rest();
            SubLObject coord_keyword = NIL;
            SubLObject list_type_id_string = NIL;
            destructuring_bind_must_consp(current, datum, $list143);
            coord_keyword = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list143);
            list_type_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                if (coord_keyword.eql($AND) && (NIL != pph_phrase_agrees_with_no_quantified_phrase_p(pph_phrase.pph_phrase_maximal_projection(phrase)))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str145$Changing_coordination_to__OR__bas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    coord_keyword = $OR;
                }
                final SubLObject opr_item = (NIL != pph_phrase.pph_unknown_cycl_p(top_level_cycl)) ? NIL : pph_coordination_phrase_operator_item(phrase, top_level_cycl);
                final SubLObject dtr_olists = pph_phrase.pph_phrase_dtr_output_lists(phrase);
                final SubLObject olist = pph_methods_formulas.pph_junct_olist_from_olists(dtr_olists, coord_keyword, opr_item, list_type_id_string);
                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                SubLObject idx = ZERO_INTEGER;
                SubLObject new_dtrs = NIL;
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject dtr_olist;
                    SubLObject pos;
                    SubLObject dummy_olist;
                    SubLObject dummy_phrase;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        dtr = aref(vector_var, element_num);
                        dtr_olist = pph_phrase.pph_phrase_output_list(dtr);
                        pos = find_dtr_olist_in_olist(dtr_olist, olist, idx);
                        if ((NIL != pos) && pos.numG(idx)) {
                            dummy_olist = subseq(olist, idx, pos);
                            dummy_phrase = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            pph_phrase.pph_phrase_set_output_list(dummy_phrase, dummy_olist, UNPROVIDED);
                            pph_phrase_get_string(dummy_phrase, UNPROVIDED, UNPROVIDED);
                            pph_phrase.pph_phrase_note_done(dummy_phrase);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str147$Inserting_dummy_phrase__S, dummy_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            idx = add(idx, length(dummy_olist));
                            new_dtrs = cons(dummy_phrase, new_dtrs);
                        }
                        idx = add(idx, length(dtr_olist));
                        new_dtrs = cons(dtr, new_dtrs);
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
                pph_phrase.set_pph_phrase_dtrs_from_list(phrase, nreverse(new_dtrs), UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
                pph_phrase.pph_phrase_set_category(phrase, pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED), NIL);
                pph_phrase.pph_phrase_set_agr(phrase, pph_data_structures.pph_phrase_agr_copy(pph_phrase.pph_phrase_agr(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER)), UNPROVIDED), UNPROVIDED);
                if (($AND == coord_keyword) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER), UNPROVIDED), UNPROVIDED), $$Noun, UNPROVIDED))) {
                    final SubLObject agr_pred = (pph_phrase.pph_phrase_dtr_count(phrase).numG(ONE_INTEGER)) ? $$plural_Generic : $$singular_Generic;
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str151$__Setting_conjunctive_agr_of__S_t, pph_phrase.pph_phrase_string(phrase, NIL), agr_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list143);
            }
        }
        return phrase;
    }

    public static SubLObject find_dtr_olist_in_olist(final SubLObject dtr_olist, final SubLObject olist, final SubLObject idx) {
        return search(dtr_olist, olist, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, idx, UNPROVIDED);
    }

    public static final SubLObject pph_phrase_agrees_with_no_quantified_phrase_p_alt(SubLObject phrase) {
        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_no_quantified_det_nbar_phrase_p(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, pph_phrase.pph_phrase_logical_mother(phrase)));
    }

    public static SubLObject pph_phrase_agrees_with_no_quantified_phrase_p(final SubLObject phrase) {
        return pph_no_quantified_det_nbar_phrase_p(pph_phrase_agr_target_phrase(phrase, pph_phrase.pph_phrase_logical_mother(phrase)));
    }

    /**
     *
     *
     * @return booleanp -- non-NIL iff PHRASE is a det-nbar whose determiner introduces :NO quantification.
     */
    @LispMethod(comment = "@return booleanp -- non-NIL iff PHRASE is a det-nbar whose determiner introduces :NO quantification.")
    public static final SubLObject pph_no_quantified_det_nbar_phrase_p_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != pph_phrase.pph_phrase_p(v_object, NIL)) && (NIL != pph_phrase.pph_phrase_npP(v_object))) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(v_object))) && ((NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_detpP(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER))) || (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_determinerP(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER))))) && $$No_NLAttr.eql(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_lexical_head_cycl(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER), UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp -- non-NIL iff PHRASE is a det-nbar whose determiner introduces :NO quantification.
     */
    @LispMethod(comment = "@return booleanp -- non-NIL iff PHRASE is a det-nbar whose determiner introduces :NO quantification.")
    public static SubLObject pph_no_quantified_det_nbar_phrase_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != pph_phrase.pph_phrase_p(v_object, NIL)) && (NIL != pph_phrase.pph_phrase_npP(v_object))) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(v_object))) && ((NIL != pph_phrase_detpP(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER))) || (NIL != pph_phrase_determinerP(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER))))) && $$No_NLAttr.eql(pph_phrase_lexical_head_cycl(pph_phrase.pph_phrase_nth_dtr(v_object, ZERO_INTEGER), UNPROVIDED)));
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for the arg0 of TOP-LEVEL-CYCL, the operator
    of a coordinate phrase.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for the arg0 of TOP-LEVEL-CYCL, the operator\r\nof a coordinate phrase.")
    public static final SubLObject pph_coordination_phrase_operator_item_alt(SubLObject phrase, SubLObject top_level_cycl) {
        {
            SubLObject opr = cycl_utilities.formula_arg0(top_level_cycl);
            SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject opr_arg_position = pph_utilities.pph_arg_position_lookup($list_alt73, map);
            SubLObject opr_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), opr_arg_position, opr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(opr_item, opr);
            return opr_item;
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for the arg0 of TOP-LEVEL-CYCL, the operator
    of a coordinate phrase.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for the arg0 of TOP-LEVEL-CYCL, the operator\r\nof a coordinate phrase.")
    public static SubLObject pph_coordination_phrase_operator_item(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject opr = cycl_utilities.formula_arg0(top_level_cycl);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject opr_arg_position = pph_utilities.pph_arg_position_lookup($list72, map);
        final SubLObject opr_item = pph_data_structures.new_pph_phrase_output_item(string_utilities.$empty_string$.getGlobalValue(), opr_arg_position, opr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(opr_item, opr);
        return opr_item;
    }

    public static final SubLObject pph_nbar_coordination_phrase_p_alt(SubLObject phrase) {
        return pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(phrase, T));
    }

    public static SubLObject pph_nbar_coordination_phrase_p(final SubLObject phrase) {
        return pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(phrase, T));
    }

    /**
     *
     *
     * @return BOOLEANP; Everything go okay?
     */
    @LispMethod(comment = "@return BOOLEANP; Everything go okay?")
    public static final SubLObject pph_nbar_coordination_phrase_distribute_determiner_alt(SubLObject phrase, SubLObject top_level_cycl) {
        {
            SubLObject mother_nbar = pph_phrase.pph_phrase_mother(phrase);
            SubLObject mother_np = pph_phrase.pph_phrase_mother(mother_nbar);
            SubLObject problemP = makeBoolean((NIL == pph_phrase.pph_phrase_nbarP(mother_nbar)) || (NIL == pph_phrase.pph_phrase_npP(mother_np)));
            SubLObject det_sister = (NIL != problemP) ? ((SubLObject) (NIL)) : pph_phrase.pph_phrase_nth_dtr(mother_np, ZERO_INTEGER);
            if (((NIL == problemP) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(mother_np))) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(det_sister, UNPROVIDED), UNPROVIDED), $$Determiner, UNPROVIDED))) {
                pph_phrase.pph_phrase_set_only_dtr(mother_np, phrase);
                pph_phrase.pph_phrase_set_head_dtr_num(mother_np, ZERO_INTEGER);
                {
                    SubLObject repeated_phrase_dtrs_resolvedP = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_repeated_phrase_dtrs(phrase, top_level_cycl);
                    if (NIL != repeated_phrase_dtrs_resolvedP) {
                        {
                            SubLObject dtr_num = ZERO_INTEGER;
                            SubLObject vector_var = document.sign_constituents(phrase);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject nbar_conjunct = aref(vector_var, element_num);
                                    SubLObject new_np_conjunct = pph_phrase.pph_phrase_copy(nbar_conjunct, UNPROVIDED, UNPROVIDED);
                                    SubLObject det_sister_copy = pph_phrase.pph_phrase_copy(det_sister, UNPROVIDED, UNPROVIDED);
                                    SubLObject nbar_conjunct_copy = pph_phrase.pph_phrase_copy(nbar_conjunct, UNPROVIDED, UNPROVIDED);
                                    pph_phrase.pph_phrase_set_relative_agr_target(det_sister_copy, nbar_conjunct_copy);
                                    pph_phrase.pph_phrase_set_category_to_np(new_np_conjunct);
                                    pph_phrase.set_pph_phrase_dtrs_from_list(new_np_conjunct, list(det_sister_copy, nbar_conjunct_copy), UNPROVIDED);
                                    pph_phrase.pph_phrase_set_nth_dtr(phrase, dtr_num, new_np_conjunct);
                                    dtr_num = add(dtr_num, ONE_INTEGER);
                                }
                            }
                        }
                    } else {
                        problemP = T;
                    }
                }
            }
            return makeBoolean(NIL == problemP);
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Everything go okay?
     */
    @LispMethod(comment = "@return BOOLEANP; Everything go okay?")
    public static SubLObject pph_nbar_coordination_phrase_distribute_determiner(final SubLObject phrase, final SubLObject top_level_cycl) {
        final SubLObject mother = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject mother_np = (NIL != pph_phrase.pph_phrase_npP(mother)) ? mother : pph_phrase.pph_phrase_mother(mother);
        SubLObject problemP = makeBoolean(NIL == pph_phrase.pph_phrase_npP(mother_np));
        final SubLObject det_sister = (NIL != problemP) ? NIL : pph_phrase.pph_phrase_nth_dtr(mother_np, ZERO_INTEGER);
        if (((NIL == problemP) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(mother_np))) && (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(det_sister, UNPROVIDED), UNPROVIDED), $$Determiner, UNPROVIDED))) {
            pph_phrase.pph_phrase_set_only_dtr(mother_np, phrase);
            pph_phrase.pph_phrase_set_head_dtr_num(mother_np, ZERO_INTEGER);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str154$Removed_det_sister_from_mother_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject repeated_phrase_dtrs_resolvedP = pph_phrase_resolve_repeated_phrase_dtrs(phrase, top_level_cycl);
            if (NIL != repeated_phrase_dtrs_resolvedP) {
                SubLObject dtr_num = ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject nbar_conjunct;
                    SubLObject new_np_conjunct;
                    SubLObject det_sister_copy;
                    SubLObject nbar_conjunct_copy;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nbar_conjunct = aref(vector_var, element_num);
                        new_np_conjunct = pph_phrase.pph_phrase_copy(nbar_conjunct, UNPROVIDED, UNPROVIDED);
                        det_sister_copy = pph_phrase.pph_phrase_copy(det_sister, UNPROVIDED, UNPROVIDED);
                        nbar_conjunct_copy = pph_phrase.pph_phrase_copy(nbar_conjunct, UNPROVIDED, UNPROVIDED);
                        pph_phrase.pph_phrase_set_relative_agr_target(det_sister_copy, nbar_conjunct_copy);
                        pph_phrase.pph_phrase_set_category_to_np(new_np_conjunct);
                        pph_phrase.set_pph_phrase_dtrs_from_list(new_np_conjunct, list(det_sister_copy, nbar_conjunct_copy), UNPROVIDED);
                        pph_phrase.pph_phrase_set_nth_dtr(phrase, dtr_num, new_np_conjunct);
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            } else {
                problemP = T;
            }
        }
        return values(makeBoolean(NIL == problemP), NIL != problemP ? NIL : mother_np);
    }

    /**
     *
     *
     * @param VERBAL-PHRASE;
     * 		a verbal PPH-PHRASE with its AGR slot set to a phrase (its subject).
     * @param MATRIX-PHRASE;
     * 		Mother of VERBAL-PHRASE, one of whose dtrs might be VERBAL-PHRASE's subject.
     * @return VERBAL-PHRASE, with its AGR slot set to a pos-pred instead of a phrase.
     */
    @LispMethod(comment = "@param VERBAL-PHRASE;\r\n\t\ta verbal PPH-PHRASE with its AGR slot set to a phrase (its subject).\r\n@param MATRIX-PHRASE;\r\n\t\tMother of VERBAL-PHRASE, one of whose dtrs might be VERBAL-PHRASE\'s subject.\r\n@return VERBAL-PHRASE, with its AGR slot set to a pos-pred instead of a phrase.")
    public static final SubLObject pph_phrase_set_subject_verb_agreement_alt(SubLObject verbal_phrase, SubLObject matrix_phrase) {
        {
            SubLObject subject_pointer = pph_phrase.pph_phrase_agr_target_of_type(verbal_phrase, $SUBJECT_VERB);
            SubLObject subject_is_nth_phraseP = pph_utilities.pph_nth_phrase_p(subject_pointer);
            SubLObject subject_phrase = (NIL != subject_is_nth_phraseP) ? ((SubLObject) (NIL)) : subject_pointer;
            if (NIL != subject_is_nth_phraseP) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy($str_alt164$subject_pointer_is_nth_phrase___S) });
                    pph_error.pph_handle_error(new_format_string, list(subject_pointer));
                }
                subject_phrase = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, pph_utilities.pph_nth_phrase_num(subject_pointer));
            }
            if (NIL == pph_phrase.pph_phrase_doneP(subject_phrase)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt165$__Not_setting_subject_verb_agreem);
                }
                return verbal_phrase;
            }
            {
                SubLObject matrix_constraints = (NIL != pph_phrase.pph_phrase_head_dtrP(verbal_phrase, matrix_phrase)) ? ((SubLObject) (pph_phrase.pph_phrase_absolute_agr_preds(matrix_phrase))) : $ANY;
                SubLObject verbs_constraints = pph_utilities.pph_filter_preds(matrix_constraints, pph_phrase.pph_phrase_absolute_agr_preds(verbal_phrase), UNPROVIDED);
                SubLObject filtered_constraints = pph_utilities.pph_filter_preds(verbs_constraints, lexicon_accessors.max_preds_of_pos($$Verb), UNPROVIDED);
                SubLObject verb_preds = NIL;
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt168$__Using_internal_constraints___S_, filtered_constraints);
                }
                if (!filtered_constraints.equal(verbs_constraints)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt169$___filtered_from__S___, verbs_constraints);
                    }
                }
                verb_preds = com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject(subject_phrase, filtered_constraints);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt170$__Setting_verb_agreement_to__S___, verb_preds);
                }
                pph_phrase.pph_phrase_set_agr_preds(verbal_phrase, verb_preds, UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_agr_preds(verbal_phrase, UNPROVIDED);
    }

    /**
     *
     *
     * @param VERBAL-PHRASE;
     * 		a verbal PPH-PHRASE with its AGR slot set to a phrase (its subject).
     * @param MATRIX-PHRASE;
     * 		Mother of VERBAL-PHRASE, one of whose dtrs might be VERBAL-PHRASE's subject.
     * @return VERBAL-PHRASE, with its AGR slot set to a pos-pred instead of a phrase.
     */
    @LispMethod(comment = "@param VERBAL-PHRASE;\r\n\t\ta verbal PPH-PHRASE with its AGR slot set to a phrase (its subject).\r\n@param MATRIX-PHRASE;\r\n\t\tMother of VERBAL-PHRASE, one of whose dtrs might be VERBAL-PHRASE\'s subject.\r\n@return VERBAL-PHRASE, with its AGR slot set to a pos-pred instead of a phrase.")
    public static SubLObject pph_phrase_set_subject_verb_agreement(final SubLObject verbal_phrase, final SubLObject matrix_phrase) {
        final SubLObject subject_pointer = pph_phrase.pph_phrase_agr_target_of_type(verbal_phrase, $SUBJECT_VERB);
        final SubLObject subject_is_nth_phraseP = pph_utilities.pph_nth_phrase_p(subject_pointer);
        SubLObject subject_phrase = (NIL != subject_is_nth_phraseP) ? NIL : subject_pointer;
        if (NIL != subject_is_nth_phraseP) {
            final SubLObject new_format_string = cconcatenate($str5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str6$__, format_nil.format_nil_a_no_copy($str155$subject_pointer_is_nth_phrase___S) });
            pph_error.pph_handle_error(new_format_string, list(subject_pointer));
            subject_phrase = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, pph_utilities.pph_nth_phrase_num(subject_pointer));
        }
        if (NIL == pph_phrase.pph_phrase_doneP(subject_phrase)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str156$__Not_setting_subject_verb_agreem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return verbal_phrase;
        }
        final SubLObject matrix_constraints = (NIL != pph_phrase.pph_phrase_head_dtrP(verbal_phrase, matrix_phrase)) ? pph_phrase.pph_phrase_absolute_agr_preds(matrix_phrase) : $ANY;
        final SubLObject verbs_constraints = pph_utilities.pph_filter_preds(matrix_constraints, pph_phrase.pph_phrase_absolute_agr_preds(verbal_phrase), UNPROVIDED);
        final SubLObject filtered_constraints = pph_utilities.pph_filter_preds(verbs_constraints, lexicon_accessors.max_preds_of_pos($$Verb), UNPROVIDED);
        SubLObject verb_preds = NIL;
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str159$__Using_internal_constraints___S_, filtered_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((!filtered_constraints.equal(verbs_constraints)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str160$___filtered_from__S___, verbs_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        verb_preds = verb_preds_for_subject(subject_phrase, filtered_constraints);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str161$__Setting_verb_agreement_to__S___, verb_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        pph_phrase.pph_phrase_set_agr_preds(verbal_phrase, verb_preds, UNPROVIDED);
        return pph_phrase.pph_phrase_agr_preds(verbal_phrase, UNPROVIDED);
    }

    public static final SubLObject pph_phrase_default_verb_pred_alt() {
        {
            SubLObject default_form = com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt171$Using_default_verb_form___S_, default_form);
            }
            return default_form;
        }
    }

    public static SubLObject pph_phrase_default_verb_pred() {
        final SubLObject default_form = verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str162$Using_default_verb_form___S_, default_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return default_form;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		Mother of PHRASE, one of whose dtrs might be what PHRASE agrees with.
     * @return PHRASE, with its absolute agreement slot set to a pos pred.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tMother of PHRASE, one of whose dtrs might be what PHRASE agrees with.\r\n@return PHRASE, with its absolute agreement slot set to a pos pred.")
    public static final SubLObject pph_phrase_set_peer_agreement_alt(SubLObject phrase, SubLObject matrix_phrase) {
        {
            SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, matrix_phrase);
            SubLObject target_agr_pred = pph_phrase.pph_phrase_agr_pred(target);
            if (((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_utilities.pph_speech_part_predP(pph_phrase.pph_phrase_agr_pred(phrase)))) && (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), $$adjStrings, UNPROVIDED))) {
                if (NIL == pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), $$Adjective, UNPROVIDED)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt174$__This_phrase_s_agr_pred_is__S_bu, pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase.pph_phrase_category(phrase, UNPROVIDED), phrase);
                    }
                }
                pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt175$__Set_adjective_peer_agreement_to, pph_phrase.pph_phrase_agr_pred(phrase));
                }
            } else {
                if (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), $$untensed, UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format(T, $str_alt177$__Set_untensed_peer_agreement_to_, pph_phrase.pph_phrase_agr_pred(phrase));
                    }
                } else {
                    if (NIL != target_agr_pred) {
                        pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.pph_peer_agr_for_pred(target_agr_pred, UNPROVIDED), UNPROVIDED);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt178$__Set_peer_agreement_to__S___, pph_phrase.pph_phrase_agr_pred(phrase));
                        }
                    } else {
                        pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), UNPROVIDED);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt179$__Set_peer_agreement_to_default__, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue());
                        }
                    }
                }
            }
        }
        return phrase;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		Mother of PHRASE, one of whose dtrs might be what PHRASE agrees with.
     * @return PHRASE, with its absolute agreement slot set to a pos pred.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tMother of PHRASE, one of whose dtrs might be what PHRASE agrees with.\r\n@return PHRASE, with its absolute agreement slot set to a pos pred.")
    public static SubLObject pph_phrase_set_peer_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        SubLObject target_agr_pred = pph_phrase.pph_phrase_agr_pred(target);
        if (NIL != pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(target, UNPROVIDED), $$MeasurableQuantity, UNPROVIDED)) {
            target_agr_pred = $$singular_Generic;
        }
        if (((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_utilities.pph_speech_part_predP(pph_phrase.pph_phrase_agr_pred(phrase)))) && (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), $$adjStrings, UNPROVIDED))) {
            if (((NIL == pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), $$Adjective, UNPROVIDED)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str166$__This_phrase_s_agr_pred_is__S_bu, pph_phrase.pph_phrase_agr_pred(phrase), pph_phrase.pph_phrase_category(phrase, UNPROVIDED), phrase);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str167$__Set_adjective_peer_agreement_to, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), $$untensed, UNPROVIDED)) {
                pph_phrase.pph_phrase_set_agr_pred(phrase, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str169$__Set_untensed_peer_agreement_to_, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != target_agr_pred) {
                    pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.pph_peer_agr_for_pred(target_agr_pred, UNPROVIDED), UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str170$__Set_peer_agreement_to__S___, pph_phrase.pph_phrase_agr_pred(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    pph_phrase.pph_phrase_set_agr_pred(phrase, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str171$__Set_peer_agreement_to_default__, pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }


        return phrase;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		the one whose tense is to be absorbed, typically the mother phrase
     * @return PHRASE; with its absolute agreement slot set to a pos pred
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tthe one whose tense is to be absorbed, typically the mother phrase\r\n@return PHRASE; with its absolute agreement slot set to a pos pred")
    public static final SubLObject pph_phrase_set_tense_agreement_alt(SubLObject phrase, SubLObject matrix_phrase) {
        {
            SubLObject agr_preds = $ANY;
            SubLObject matrix_preds = pph_phrase.pph_phrase_agr_preds(matrix_phrase.eql($MOTHER) ? ((SubLObject) (pph_phrase.pph_phrase_mother(phrase))) : matrix_phrase, UNPROVIDED);
            if (NIL != pph_utilities.pph_nl_pred_listP(matrix_preds)) {
                {
                    SubLObject cdolist_list_var = matrix_preds;
                    SubLObject matrix_pred = NIL;
                    for (matrix_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , matrix_pred = cdolist_list_var.first()) {
                        if (NIL != pph_utilities.pph_genl_pos_predP(matrix_pred, $$tensed, UNPROVIDED)) {
                            agr_preds = pph_utilities.pph_filter_preds(agr_preds, list(matrix_pred), UNPROVIDED);
                        }
                    }
                }
            }
            if (NIL != pph_utilities.pph_nl_pred_listP(agr_preds)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt181$__Incorporating_tense_agreement__, agr_preds);
                }
                pph_phrase.pph_phrase_set_agr_preds(phrase, pph_utilities.pph_filter_preds(agr_preds, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED), UNPROVIDED);
            }
            return phrase;
        }
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		the one whose tense is to be absorbed, typically the mother phrase
     * @return PHRASE; with its absolute agreement slot set to a pos pred
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tthe one whose tense is to be absorbed, typically the mother phrase\r\n@return PHRASE; with its absolute agreement slot set to a pos pred")
    public static SubLObject pph_phrase_set_tense_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        SubLObject agr_preds = $ANY;
        final SubLObject matrix_preds = pph_phrase.pph_phrase_agr_preds(matrix_phrase.eql($MOTHER) ? pph_phrase.pph_phrase_mother(phrase) : matrix_phrase, UNPROVIDED);
        if (NIL != pph_utilities.pph_nl_pred_listP(matrix_preds)) {
            SubLObject cdolist_list_var = matrix_preds;
            SubLObject matrix_pred = NIL;
            matrix_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_utilities.pph_genl_pos_predP(matrix_pred, $$tensed, UNPROVIDED)) {
                    agr_preds = pph_utilities.pph_filter_preds(agr_preds, list(matrix_pred), UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                matrix_pred = cdolist_list_var.first();
            } 
        }
        if (NIL != pph_utilities.pph_nl_pred_listP(agr_preds)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str173$__Incorporating_tense_agreement__, agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_agr_preds(phrase, pph_utilities.pph_filter_preds(agr_preds, pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED), UNPROVIDED), UNPROVIDED);
        }
        return phrase;
    }

    public static final SubLObject pph_phrase_set_clarifying_agreement_alt(SubLObject phrase, SubLObject matrix_phrase) {
        {
            SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, matrix_phrase);
            SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, UNPROVIDED);
            SubLObject target_string = pph_phrase.pph_phrase_string(target, UNPROVIDED);
            if ((NIL != cycl_grammar.cycl_variable_p(target_cycl)) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.uninformative_paraphrase_p(target_string, target_cycl))) {
                pph_phrase.pph_phrase_set_string(phrase, $str_alt58$);
            } else {
                pph_phrase.pph_phrase_note_done(phrase);
            }
            return phrase;
        }
    }

    public static SubLObject pph_phrase_set_clarifying_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        final SubLObject target_cycl = pph_phrase.pph_phrase_cycl(target, UNPROVIDED);
        final SubLObject target_string = pph_phrase.pph_phrase_string(target, UNPROVIDED);
        if ((NIL != cycl_grammar.cycl_variable_p(target_cycl)) && (NIL != uninformative_paraphrase_p(target_string, target_cycl))) {
            pph_phrase.pph_phrase_set_string(phrase, $str55$);
        } else {
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return phrase;
    }

    public static final SubLObject uninformative_paraphrase_p_alt(SubLObject string, SubLObject cycl) {
        return makeBoolean(string.equal(princ(cycl, UNPROVIDED)) || string.equal(pph_vars.$pph_blank_string$.getGlobalValue()));
    }

    public static SubLObject uninformative_paraphrase_p(final SubLObject string, final SubLObject cycl) {
        return makeBoolean(string.equal(format(NIL, $str174$_S, cycl)) || string.equal(pph_vars.$pph_blank_string$.getGlobalValue()));
    }

    /**
     *
     *
     * @return PPH-PHRASE-P; The phrase that PHRASE agrees with, located in MATRIX-PHRASE
    if necessary.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; The phrase that PHRASE agrees with, located in MATRIX-PHRASE\r\nif necessary.")
    public static final SubLObject pph_phrase_agr_target_phrase_alt(SubLObject phrase, SubLObject matrix_phrase) {
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
                {
                    SubLObject badP = NIL;
                    SubLObject first_agr = NIL;
                    SubLObject dtr_num = ZERO_INTEGER;
                    SubLObject vector_var = document.sign_constituents(phrase);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject dtr = aref(vector_var, element_num);
                            if (NIL == first_agr) {
                                first_agr = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(dtr, matrix_phrase);
                            } else {
                                if (!first_agr.equal(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(dtr, matrix_phrase))) {
                                    badP = T;
                                }
                            }
                            dtr_num = add(dtr_num, ONE_INTEGER);
                        }
                    }
                    return NIL != badP ? ((SubLObject) (NIL)) : first_agr;
                }
            } else {
                if (NIL != pph_phrase.pph_phrase_p(matrix_phrase, NIL)) {
                    {
                        SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_relative_agr_target(phrase);
                        if (NIL != pph_utilities.pph_nth_phrase_p(target)) {
                            {
                                SubLObject dtr_num = pph_utilities.pph_nth_phrase_num(target);
                                target = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, dtr_num);
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt182$__Using_daughter__D_as_agreement_, dtr_num, target);
                                }
                            }
                        }
                        return target;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-P; The phrase that PHRASE agrees with, located in MATRIX-PHRASE
    if necessary.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; The phrase that PHRASE agrees with, located in MATRIX-PHRASE\r\nif necessary.")
    public static SubLObject pph_phrase_agr_target_phrase(final SubLObject phrase, SubLObject matrix_phrase) {
        if (matrix_phrase == UNPROVIDED) {
            matrix_phrase = NIL;
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            SubLObject badP = NIL;
            SubLObject first_agr = NIL;
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
                    if (NIL == first_agr) {
                        first_agr = pph_phrase_agr_target_phrase(dtr, matrix_phrase);
                    } else
                        if (!first_agr.equal(pph_phrase_agr_target_phrase(dtr, matrix_phrase))) {
                            badP = T;
                        }

                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            return NIL != badP ? NIL : first_agr;
        }
        if (NIL != pph_phrase.pph_phrase_p(matrix_phrase, NIL)) {
            SubLObject target = pph_phrase_relative_agr_target(phrase);
            if (NIL != pph_utilities.pph_nth_phrase_p(target)) {
                final SubLObject dtr_num2 = pph_utilities.pph_nth_phrase_num(target);
                target = pph_phrase.pph_phrase_nth_dtr(matrix_phrase, dtr_num2);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str175$__Using_daughter__D_as_agreement_, dtr_num2, target, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return target;
        }
        return NIL;
    }

    public static final SubLObject pph_phrase_relative_agr_target_alt(SubLObject phrase) {
        {
            SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
            SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
            SubLObject target = (NIL != relative_constraint) ? ((SubLObject) (pph_utilities.pph_agr_constraint_target(relative_constraint))) : NIL;
            return target;
        }
    }

    public static SubLObject pph_phrase_relative_agr_target(final SubLObject phrase) {
        final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
        final SubLObject relative_constraint = pph_data_structures.pph_phrase_agr_relative_constraint(phrase_agr);
        final SubLObject target = (NIL != relative_constraint) ? pph_utilities.pph_agr_constraint_target(relative_constraint) : NIL;
        return target;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE (either a det or an nbar) with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		Mother of PHRASE, one of whose dtrs might be what PHRASE agrees with.
     * @return PHRASE, with its AGR slot set to a pos-pred instead of a phrase.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE (either a det or an nbar) with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tMother of PHRASE, one of whose dtrs might be what PHRASE agrees with.\r\n@return PHRASE, with its AGR slot set to a pos-pred instead of a phrase.")
    public static final SubLObject pph_phrase_set_det_nbar_agreement_alt(SubLObject phrase, SubLObject matrix_phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject target = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_agr_target_phrase(phrase, matrix_phrase);
                SubLObject phrase_is_detP = eq(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED), $$Determiner);
                SubLObject det = (NIL != phrase_is_detP) ? ((SubLObject) (phrase)) : target;
                SubLObject nbar = (NIL != phrase_is_detP) ? ((SubLObject) (target)) : phrase;
                SubLObject nbar_agr_pred = ((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) ? ((SubLObject) (pph_phrase.pph_phrase_agr_pred(nbar))) : NIL;
                SubLObject det_agr_pred = ((NIL == phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(det))) ? ((SubLObject) (pph_phrase.pph_phrase_agr_pred(det))) : NIL;
                SubLObject det_wu = pph_phrase.pph_phrase_wu(det, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                        {
                            SubLObject matrix_formula = (NIL != pph_phrase.pph_phrase_p(matrix_phrase, UNPROVIDED)) ? ((SubLObject) (pph_phrase.pph_phrase_cycl(matrix_phrase, UNPROVIDED))) : pph_phrase.pph_unknown_cycl();
                            SubLObject det_head_cycl = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_lexical_head_cycl(det, matrix_formula);
                            if ((NIL != phrase_is_detP) && (pph_phrase.pph_phrase_cycl(det, UNPROVIDED) == $$BareForm_NLAttr)) {
                                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt184$__Using_hard_coded_null_determine);
                                }
                            } else {
                                if ((((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (NIL != pph_phrase.pph_phrase_indefinite_articleP(det))) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_english_indefinite_article(det, nbar);
                                } else {
                                    if (((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (NIL != pph_variable_handling.pph_string_is_posP(string_utilities.string_tokenize(pph_phrase.pph_phrase_string(nbar, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first(), $$PossessivePronoun_Pre, $NEVER, UNPROVIDED))) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format(T, $str_alt187$__Setting_det_nbar_agreement_for_);
                                        }
                                        pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format(T, $str_alt188$__Using_null_determiner_for_posse);
                                        }
                                    } else {
                                        if ((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_ranged_det_phrase_p(phrase, UNPROVIDED))) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format(T, $str_alt189$__Setting_det_nbar_agreement_for_);
                                            }
                                            pph_phrase.pph_phrase_set_agr_pred(nbar, $$plural_Generic, UNPROVIDED);
                                        } else {
                                            if ((NIL != phrase_is_detP) && (NIL != nbar_agr_pred)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt190$__Setting_determiner_s_agr_pred_f, nbar_agr_pred);
                                                }
                                                pph_phrase.pph_phrase_set_agr_pred(det, nbar_agr_pred, UNPROVIDED);
                                            } else {
                                                if ((NIL == phrase_is_detP) && (NIL != lexicon_accessors.agreement_lookup(det_wu))) {
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                        format(T, $str_alt191$__Setting_agr_pred_from_determine, det_agr_pred);
                                                    }
                                                    pph_phrase.pph_phrase_set_agr_pred(nbar, lexicon_accessors.agreement_lookup(det_wu), UNPROVIDED);
                                                } else {
                                                    if (NIL != cycl_utilities.expression_find_if($sym192$EL_VAR_, det_head_cycl, UNPROVIDED, UNPROVIDED)) {
                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                            format(T, $str_alt193$__Setting_determiner_nbar_agreeme);
                                                        }
                                                        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nonSingular_Generic, UNPROVIDED);
                                                        if (NIL == pph_phrase.pph_phrase_doneP(target)) {
                                                            pph_phrase.pph_phrase_set_agr_pred(target, pph_utilities.numeric_det_agr_pred(det_head_cycl), UNPROVIDED);
                                                        }
                                                    } else {
                                                        if (NIL != pph_utilities.pph_numeric_det_cyclP(det_head_cycl)) {
                                                            {
                                                                SubLObject numeric_agr_pred = pph_utilities.numeric_det_agr_pred(det_head_cycl);
                                                                if (NIL != numeric_agr_pred) {
                                                                    {
                                                                        SubLObject filtered = pph_utilities.pph_filter_preds(list(numeric_agr_pred), pph_phrase.pph_phrase_agr_preds(nbar, UNPROVIDED), UNPROVIDED);
                                                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                            format(T, $str_alt195$__Setting_determiner_nbar_agreeme, filtered);
                                                                        }
                                                                        pph_phrase.pph_phrase_set_agr_preds(phrase, filtered, UNPROVIDED);
                                                                        if (NIL == pph_phrase.pph_phrase_doneP(target)) {
                                                                            pph_phrase.pph_phrase_set_agr_preds(target, filtered, UNPROVIDED);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                                Errors.warn($str_alt196$Couldn_t_determine_agreement_info, phrase, det_head_cycl);
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
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return phrase;
        }
    }

    /**
     *
     *
     * @param PHRASE;
     * 		a PPH-PHRASE (either a det or an nbar) with its AGR slot set to a phrase.
     * @param MATRIX-PHRASE;
     * 		Mother of PHRASE, one of whose dtrs might be what PHRASE agrees with.
     * @return PHRASE, with its AGR slot set to a pos-pred instead of a phrase.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\ta PPH-PHRASE (either a det or an nbar) with its AGR slot set to a phrase.\r\n@param MATRIX-PHRASE;\r\n\t\tMother of PHRASE, one of whose dtrs might be what PHRASE agrees with.\r\n@return PHRASE, with its AGR slot set to a pos-pred instead of a phrase.")
    public static SubLObject pph_phrase_set_det_nbar_agreement(final SubLObject phrase, final SubLObject matrix_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = pph_phrase_agr_target_phrase(phrase, matrix_phrase);
        final SubLObject phrase_is_detP = eq(pph_utilities.pph_pos_of_category(pph_phrase.pph_phrase_category(phrase, UNPROVIDED), UNPROVIDED), $$Determiner);
        final SubLObject det = (NIL != phrase_is_detP) ? phrase : target;
        final SubLObject nbar = (NIL != phrase_is_detP) ? target : phrase;
        final SubLObject nbar_agr_pred = ((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) ? pph_phrase.pph_phrase_agr_pred(nbar) : NIL;
        final SubLObject det_agr_pred = ((NIL == phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(det))) ? pph_phrase.pph_phrase_agr_pred(det) : NIL;
        final SubLObject det_wu = pph_phrase.pph_phrase_wu(det, UNPROVIDED);
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            final SubLObject matrix_formula = (NIL != pph_phrase.pph_phrase_p(matrix_phrase, UNPROVIDED)) ? pph_phrase.pph_phrase_cycl(matrix_phrase, UNPROVIDED) : pph_phrase.pph_unknown_cycl();
            final SubLObject det_head_cycl = pph_phrase_lexical_head_cycl(det, matrix_formula);
            if ((NIL != phrase_is_detP) && pph_phrase.pph_phrase_cycl(det, UNPROVIDED).eql($$BareForm_NLAttr)) {
                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str177$__Using_hard_coded_null_determine, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if ((((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (NIL != pph_phrase.pph_phrase_indefinite_articleP(det))) && (NIL != pph_utilities.pph_english_contextP(UNPROVIDED))) {
                    pph_phrase_english_indefinite_article(det, nbar);
                } else
                    if (((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (NIL != pph_variable_handling.pph_string_is_posP(string_utilities.string_tokenize(pph_string.pph_string_to_display(pph_phrase.pph_phrase_string(nbar, NIL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first(), $$PossessivePronoun_Pre, $NEVER, UNPROVIDED))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str180$__Setting_det_nbar_agreement_for_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str181$__Using_null_determiner_for_posse, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else
                        if ((NIL != phrase_is_detP) && (NIL != pph_phrase.pph_ranged_det_phrase_p(phrase, UNPROVIDED))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format_nil.force_format(T, $str182$__Setting_det_nbar_agreement_for_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            pph_phrase.pph_phrase_set_agr_pred(nbar, $$plural_Generic, UNPROVIDED);
                        } else
                            if ((NIL != phrase_is_detP) && (NIL != nbar_agr_pred)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str183$__Setting_determiner_s_agr_pred_f, nbar_agr_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_phrase.pph_phrase_set_agr_pred(det, nbar_agr_pred, UNPROVIDED);
                            } else
                                if ((NIL == phrase_is_detP) && (NIL != lexicon_accessors.agreement_lookup(det_wu))) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format_nil.force_format(T, $str184$__Setting_agr_pred_from_determine, det_agr_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    pph_phrase.pph_phrase_set_agr_pred(nbar, lexicon_accessors.agreement_lookup(det_wu), UNPROVIDED);
                                } else
                                    if (NIL != cycl_utilities.expression_find_if($sym185$EL_VAR_, det_head_cycl, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                            format_nil.force_format(T, $str186$__Setting_determiner_nbar_agreeme, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        pph_phrase.pph_phrase_set_agr_pred(phrase, $$nonSingular_Generic, UNPROVIDED);
                                        if (NIL == pph_phrase.pph_phrase_doneP(target)) {
                                            pph_phrase.pph_phrase_set_agr_pred(target, pph_utilities.numeric_det_agr_pred(det_head_cycl), UNPROVIDED);
                                        }
                                    } else
                                        if (NIL != pph_utilities.pph_numeric_det_cyclP(det_head_cycl)) {
                                            final SubLObject numeric_agr_pred = pph_utilities.numeric_det_agr_pred(det_head_cycl);
                                            if (NIL != numeric_agr_pred) {
                                                final SubLObject filtered = pph_utilities.pph_filter_preds(list(numeric_agr_pred), pph_phrase.pph_phrase_agr_preds(nbar, UNPROVIDED), UNPROVIDED);
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format_nil.force_format(T, $str188$__Setting_determiner_nbar_agreeme, filtered, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                pph_phrase.pph_phrase_set_agr_preds(phrase, filtered, UNPROVIDED);
                                                if (NIL == pph_phrase.pph_phrase_doneP(target)) {
                                                    pph_phrase.pph_phrase_set_agr_preds(target, filtered, UNPROVIDED);
                                                }
                                            }
                                        } else
                                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                Errors.warn($str189$Couldn_t_determine_agreement_info, phrase, det_head_cycl);
                                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                            }








        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    /**
     *
     *
     * @unknown the lowest-level head CycL of PHRASE we can find.
     */
    @LispMethod(comment = "@unknown the lowest-level head CycL of PHRASE we can find.")
    public static final SubLObject pph_phrase_lexical_head_cycl_alt(SubLObject phrase, SubLObject matrix_formula) {
        if (matrix_formula == UNPROVIDED) {
            matrix_formula = NIL;
        }
        {
            SubLObject lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(phrase);
            if (NIL != el_formula_p(matrix_formula)) {
                while (NIL != pph_phrase.pph_conditional_phrase_p(lexical_head)) {
                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_resolve_condition(lexical_head, matrix_formula, pph_phrase.pph_phrase_mother(lexical_head));
                    lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(lexical_head);
                } 
            }
            return pph_phrase.pph_phrase_cycl(lexical_head, matrix_formula);
        }
    }

    /**
     *
     *
     * @unknown the lowest-level head CycL of PHRASE we can find.
     */
    @LispMethod(comment = "@unknown the lowest-level head CycL of PHRASE we can find.")
    public static SubLObject pph_phrase_lexical_head_cycl(final SubLObject phrase, SubLObject matrix_formula) {
        if (matrix_formula == UNPROVIDED) {
            matrix_formula = NIL;
        }
        SubLObject lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(phrase);
        if (NIL != el_formula_p(matrix_formula)) {
            while (NIL != pph_phrase.pph_conditional_phrase_p(lexical_head)) {
                pph_phrase_resolve_condition(lexical_head, matrix_formula, pph_phrase.pph_phrase_mother(lexical_head));
                lexical_head = pph_phrase.pph_phrase_lexical_head_dtr(lexical_head);
            } 
        }
        return pph_phrase.pph_phrase_cycl(lexical_head, matrix_formula);
    }

    /**
     *
     *
     * @param PPH-PHRASE-P;
     * 		to search for
     * @param PPH-PHRASE-P;
     * 		the potential ancestor
     * 		Recursively returns true if the sought-after phrase is somewhere under the ancestor
     */
    @LispMethod(comment = "@param PPH-PHRASE-P;\r\n\t\tto search for\r\n@param PPH-PHRASE-P;\r\n\t\tthe potential ancestor\r\n\t\tRecursively returns true if the sought-after phrase is somewhere under the ancestor")
    public static final SubLObject pph_phrase_dtr_nested_withinP_alt(SubLObject search_for, SubLObject ancestor) {
        if (NIL != subl_promotions.memberP(search_for, pph_phrase.pph_phrase_dtr_list(ancestor), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        {
            SubLObject dtr_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(ancestor);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_dtr_nested_withinP(dtr, search_for);
                    }
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PPH-PHRASE-P;
     * 		to search for
     * @param PPH-PHRASE-P;
     * 		the potential ancestor
     * 		Recursively returns true if the sought-after phrase is somewhere under the ancestor
     */
    @LispMethod(comment = "@param PPH-PHRASE-P;\r\n\t\tto search for\r\n@param PPH-PHRASE-P;\r\n\t\tthe potential ancestor\r\n\t\tRecursively returns true if the sought-after phrase is somewhere under the ancestor")
    public static SubLObject pph_phrase_dtr_nested_withinP(final SubLObject search_for, final SubLObject ancestor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(search_for, pph_phrase.pph_phrase_dtr_list(ancestor), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL == pph_phrase.pph_phrase_p(ancestor, UNPROVIDED)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str190$PPH_PHRASE_DTR_NESTED_WITHIN__loo, search_for, ancestor);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return NIL;
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(ancestor).isVector()) {
            final SubLObject vector_var = document.sign_constituents(ancestor);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    return pph_phrase_dtr_nested_withinP(search_for, dtr);
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    /**
     * Find the subject of the phrase's clause and return it. Could be the phrase itself.
     */
    @LispMethod(comment = "Find the subject of the phrase\'s clause and return it. Could be the phrase itself.")
    public static final SubLObject pph_phrase_subject_of_clause_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
                SubLObject the_subject = (NIL != the_ancestor) ? ((SubLObject) (pph_phrase.pph_phrase_subject_dtr(the_ancestor))) : NIL;
                if (NIL == the_ancestor) {
                    return NIL;
                } else {
                    if (NIL == the_subject) {
                        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_subject_of_clause(the_ancestor);
                    } else {
                        return the_subject;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Find the subject of the phrase\'s clause and return it. Could be the phrase itself.")
    public static SubLObject pph_phrase_subject_of_clause(final SubLObject phrase) {
        final SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject the_subject = (NIL != the_ancestor) ? pph_phrase.pph_phrase_subject_dtr(the_ancestor) : NIL;
        if (NIL == the_ancestor) {
            return NIL;
        }
        if (NIL == the_subject) {
            return pph_phrase_subject_of_clause(the_ancestor);
        }
        return the_subject;
    }

    /**
     * Find the subject of the phrase's clause and return it. Could be the phrase itself.
     */
    @LispMethod(comment = "Find the subject of the phrase\'s clause and return it. Could be the phrase itself.")
    public static final SubLObject pph_phrase_subject_domain_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
                SubLObject the_subject = (NIL != the_ancestor) ? ((SubLObject) (pph_phrase.pph_phrase_subject_dtr(the_ancestor))) : NIL;
                if (NIL == the_ancestor) {
                    return phrase;
                } else {
                    if (NIL == the_subject) {
                        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_subject_domain(the_ancestor);
                    } else {
                        if (NIL == pph_drs.pph_discourse_rm_lookup(pph_phrase.pph_phrase_cycl(the_subject, UNPROVIDED))) {
                            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_subject_domain(the_ancestor);
                        } else {
                            return the_ancestor;
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Find the subject of the phrase\'s clause and return it. Could be the phrase itself.")
    public static SubLObject pph_phrase_subject_domain(final SubLObject phrase) {
        final SubLObject the_ancestor = pph_phrase.pph_phrase_mother(phrase);
        final SubLObject the_subject = (NIL != the_ancestor) ? pph_phrase.pph_phrase_subject_dtr(the_ancestor) : NIL;
        if (NIL == the_ancestor) {
            return phrase;
        }
        if (NIL != pph_phrase.pph_phrase_sP(the_ancestor)) {
            return the_ancestor;
        }
        if (NIL == the_subject) {
            return pph_phrase_subject_domain(the_ancestor);
        }
        if (NIL == pph_drs.pph_discourse_rm_lookup(pph_phrase.pph_phrase_cycl(the_subject, UNPROVIDED))) {
            return pph_phrase_subject_domain(the_ancestor);
        }
        return the_ancestor;
    }

    /**
     * Recursive function which gathers maximal NP's which could bind the position for which
     * the function is originally called. Checks for subjects and/or others as requested.
     * Stops when it hits the root, or (if just-this-clause is T) when a subject is found.
     */
    @LispMethod(comment = "Recursive function which gathers maximal NP\'s which could bind the position for which\r\nthe function is originally called. Checks for subjects and/or others as requested.\r\nStops when it hits the root, or (if just-this-clause is T) when a subject is found.\nRecursive function which gathers maximal NP\'s which could bind the position for which\nthe function is originally called. Checks for subjects and/or others as requested.\nStops when it hits the root, or (if just-this-clause is T) when a subject is found.")
    public static final SubLObject pph_phrase_find_potential_binders_alt(SubLObject phrase, SubLObject subjects, SubLObject others, SubLObject just_this_clause) {
        if (subjects == UNPROVIDED) {
            subjects = T;
        }
        if (others == UNPROVIDED) {
            others = NIL;
        }
        if (just_this_clause == UNPROVIDED) {
            just_this_clause = T;
        }
        {
            SubLObject mom = pph_phrase.pph_phrase_mother(phrase);
            return NIL != mom ? ((SubLObject) (com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_find_potential_binders_int(phrase, mom, phrase, subjects, others, just_this_clause))) : NIL;
        }
    }

    @LispMethod(comment = "Recursive function which gathers maximal NP\'s which could bind the position for which\r\nthe function is originally called. Checks for subjects and/or others as requested.\r\nStops when it hits the root, or (if just-this-clause is T) when a subject is found.\nRecursive function which gathers maximal NP\'s which could bind the position for which\nthe function is originally called. Checks for subjects and/or others as requested.\nStops when it hits the root, or (if just-this-clause is T) when a subject is found.")
    public static SubLObject pph_phrase_find_potential_binders(final SubLObject phrase, SubLObject subjects, SubLObject others, SubLObject just_this_clause) {
        if (subjects == UNPROVIDED) {
            subjects = T;
        }
        if (others == UNPROVIDED) {
            others = NIL;
        }
        if (just_this_clause == UNPROVIDED) {
            just_this_clause = T;
        }
        final SubLObject mom = pph_phrase.pph_phrase_mother(phrase);
        return NIL != mom ? pph_phrase_find_potential_binders_int(phrase, mom, phrase, subjects, others, just_this_clause) : NIL;
    }

    public static final SubLObject pph_phrase_find_potential_binders_int_alt(SubLObject phrase, SubLObject look_in, SubLObject calling_phrase, SubLObject subjects, SubLObject others, SubLObject embedded_only) {
        if (NIL == pph_phrase.pph_phrase_p(look_in, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject the_subject = pph_phrase.pph_phrase_subject_dtr(look_in);
            SubLObject potentials = NIL;
            SubLObject do_num = ZERO_INTEGER;
            SubLObject vector_var = document.sign_constituents(look_in);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject dtr = aref(vector_var, element_num);
                    if (dtr.eql(calling_phrase)) {
                    } else {
                        if (dtr.eql(the_subject)) {
                            if (NIL != subjects) {
                                potentials = cons(dtr, potentials);
                            }
                        } else {
                            if (NIL != pph_phrase.pph_phrase_npP(dtr)) {
                                if (NIL != others) {
                                    potentials = cons(dtr, potentials);
                                }
                            }
                        }
                    }
                    do_num = add(do_num, ONE_INTEGER);
                }
            }
            if ((NIL != the_subject) && (NIL != embedded_only)) {
                return potentials;
            }
            {
                SubLObject next_level = pph_phrase.pph_phrase_mother(look_in);
                SubLObject recursed = (NIL != next_level) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_find_potential_binders_int(phrase, next_level, look_in, subjects, others, embedded_only))) : NIL;
                if ((NIL != potentials) && (NIL != recursed)) {
                    return list_utilities.flatten(list(potentials, recursed));
                }
                return NIL != recursed ? ((SubLObject) (recursed)) : potentials;
            }
        }
    }

    public static SubLObject pph_phrase_find_potential_binders_int(final SubLObject phrase, final SubLObject look_in, final SubLObject calling_phrase, final SubLObject subjects, final SubLObject others, final SubLObject embedded_only) {
        if (NIL == pph_phrase.pph_phrase_p(look_in, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject the_subject = pph_phrase.pph_phrase_subject_dtr(look_in);
        SubLObject potentials = NIL;
        SubLObject do_num = ZERO_INTEGER;
        if (document.sign_constituents(look_in).isVector()) {
            final SubLObject vector_var = document.sign_constituents(look_in);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (!dtr.eql(calling_phrase)) {
                    if (dtr.eql(the_subject)) {
                        if (NIL != subjects) {
                            potentials = cons(dtr, potentials);
                        }
                    } else
                        if ((NIL != pph_phrase.pph_phrase_npP(dtr)) && (NIL != others)) {
                            potentials = cons(dtr, potentials);
                        }

                }
                do_num = add(do_num, ONE_INTEGER);
            }
        }
        if ((NIL != the_subject) && (NIL != embedded_only)) {
            return potentials;
        }
        final SubLObject next_level = pph_phrase.pph_phrase_mother(look_in);
        final SubLObject recursed = (NIL != next_level) ? pph_phrase_find_potential_binders_int(phrase, next_level, look_in, subjects, others, embedded_only) : NIL;
        if ((NIL != potentials) && (NIL != recursed)) {
            return list_utilities.flatten(list(potentials, recursed));
        }
        return NIL != recursed ? recursed : potentials;
    }

    /**
     * Find all the (maximal) NP's which could bind a possessive pronoun in phrase's position.
     * Presently not limited to the phrase's clause, though that should perhaps depend
     * on whether the paraphrase is intended to be precise.
     */
    @LispMethod(comment = "Find all the (maximal) NP\'s which could bind a possessive pronoun in phrase\'s position.\r\nPresently not limited to the phrase\'s clause, though that should perhaps depend\r\non whether the paraphrase is intended to be precise.\nFind all the (maximal) NP\'s which could bind a possessive pronoun in phrase\'s position.\nPresently not limited to the phrase\'s clause, though that should perhaps depend\non whether the paraphrase is intended to be precise.")
    public static final SubLObject pph_phrase_could_bind_possessive_here_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_find_potential_binders(phrase, T, T, NIL);
        }
    }

    @LispMethod(comment = "Find all the (maximal) NP\'s which could bind a possessive pronoun in phrase\'s position.\r\nPresently not limited to the phrase\'s clause, though that should perhaps depend\r\non whether the paraphrase is intended to be precise.\nFind all the (maximal) NP\'s which could bind a possessive pronoun in phrase\'s position.\nPresently not limited to the phrase\'s clause, though that should perhaps depend\non whether the paraphrase is intended to be precise.")
    public static SubLObject pph_phrase_could_bind_possessive_here(final SubLObject phrase) {
        return pph_phrase_find_potential_binders(phrase, T, T, NIL);
    }

    /**
     * Find all the (maximal) NP's which could bind a reflexive pronoun in phrase's position.
     * Presently hardcoded for English, meaning, e.g., it's limited to the phrase's clause.
     */
    @LispMethod(comment = "Find all the (maximal) NP\'s which could bind a reflexive pronoun in phrase\'s position.\r\nPresently hardcoded for English, meaning, e.g., it\'s limited to the phrase\'s clause.\nFind all the (maximal) NP\'s which could bind a reflexive pronoun in phrase\'s position.\nPresently hardcoded for English, meaning, e.g., it\'s limited to the phrase\'s clause.")
    public static final SubLObject pph_phrase_could_bind_reflexive_here_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_find_potential_binders(phrase, T, T, T);
        }
    }

    @LispMethod(comment = "Find all the (maximal) NP\'s which could bind a reflexive pronoun in phrase\'s position.\r\nPresently hardcoded for English, meaning, e.g., it\'s limited to the phrase\'s clause.\nFind all the (maximal) NP\'s which could bind a reflexive pronoun in phrase\'s position.\nPresently hardcoded for English, meaning, e.g., it\'s limited to the phrase\'s clause.")
    public static SubLObject pph_phrase_could_bind_reflexive_here(final SubLObject phrase) {
        return pph_phrase_find_potential_binders(phrase, T, T, T);
    }

    /**
     *
     *
     * @unknown for a/an/null-determiner agreement in English
     */
    @LispMethod(comment = "@unknown for a/an/null-determiner agreement in English")
    public static final SubLObject pph_phrase_english_indefinite_article_alt(SubLObject det, SubLObject nbar) {
        {
            SubLObject nbar_pos_pred = pph_phrase.pph_phrase_agr_pred(nbar);
            SubLObject nbar_string = pph_phrase.pph_phrase_string(nbar, UNPROVIDED);
            SubLObject already_indefiniteP = string_utilities.starts_with(nbar_string, $$$some);
            SubLObject sing_nbarP = (NIL != nbar_pos_pred) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_noun_predP(nbar_pos_pred))) : NIL;
            if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_english_indefinite_np(det, nbar)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format(T, $str_alt198$__Nbar_is_now__S__, nbar);
                }
            } else {
                if (pph_phrase.pph_phrase_agr_pred(det) == pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()) {
                    pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                } else {
                    if (NIL != already_indefiniteP) {
                        pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                    } else {
                        if (NIL != sing_nbarP) {
                            pph_phrase.pph_phrase_set_string(det, com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_determiner_string(nbar_string));
                        } else {
                            if (((NIL != list_utilities.lengthG(nbar_string, TWO_INTEGER, UNPROVIDED)) && (NIL != string_utilities.starts_with(nbar_string, constant_reader.constant_reader_prefix()))) && (!((NIL != fort_types_interface.collection_p(pph_phrase.pph_phrase_cycl(nbar, UNPROVIDED))) && (NIL != pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(nbar, UNPROVIDED), $$ExistingStuffType, UNPROVIDED))))) {
                                pph_phrase.pph_phrase_set_string(det, com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_determiner_string(string_utilities.substring(nbar_string, TWO_INTEGER, UNPROVIDED)));
                            } else {
                                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                            }
                        }
                    }
                }
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt200$__Using_English_specific_indefini, pph_phrase.pph_phrase_string(det, NIL));
            }
        }
        return pph_phrase.pph_phrase_output_list(det);
    }

    /**
     *
     *
     * @unknown for a/an/null-determiner agreement in English
     */
    @LispMethod(comment = "@unknown for a/an/null-determiner agreement in English")
    public static SubLObject pph_phrase_english_indefinite_article(final SubLObject det, final SubLObject nbar) {
        final SubLObject nbar_pos_pred = pph_phrase.pph_phrase_agr_pred(nbar);
        final SubLObject nbar_string = pph_phrase.pph_phrase_string(nbar, UNPROVIDED);
        final SubLObject already_indefiniteP = pph_string.pph_string_starts_with(nbar_string, $$$some, UNPROVIDED);
        final SubLObject sing_nbarP = (NIL != nbar_pos_pred) ? pph_singular_noun_predP(nbar_pos_pred) : NIL;
        if (NIL != pph_phrase_english_indefinite_np(det, nbar)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str192$__Nbar_is_now__S__, nbar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (pph_phrase.pph_phrase_agr_pred(det).eql(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue())) {
                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
            } else
                if (NIL != already_indefiniteP) {
                    pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                } else
                    if (NIL != sing_nbarP) {
                        pph_phrase.pph_phrase_set_string(det, pph_singular_determiner_string(nbar_string));
                    } else
                        if (((NIL != list_utilities.lengthG(nbar_string, TWO_INTEGER, UNPROVIDED)) && (NIL != pph_string.pph_string_starts_with(nbar_string, constant_reader.constant_reader_prefix(), UNPROVIDED))) && ((NIL == fort_types_interface.collection_p(pph_phrase.pph_phrase_cycl(nbar, UNPROVIDED))) || (NIL == pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(nbar, UNPROVIDED), $$ExistingStuffType, UNPROVIDED)))) {
                            pph_phrase.pph_phrase_set_string(det, pph_singular_determiner_string(pph_string.pph_substring(nbar_string, TWO_INTEGER, UNPROVIDED)));
                        } else {
                            pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                        }




        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str194$__Using_English_specific_indefini, pph_phrase.pph_phrase_string(det, NIL), pph_phrase.pph_phrase_string(nbar, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(det);
    }

    /**
     * Try to use a lexicalized indefinite NP for DET and NBAR.
     */
    @LispMethod(comment = "Try to use a lexicalized indefinite NP for DET and NBAR.")
    public static final SubLObject pph_phrase_english_indefinite_np_alt(SubLObject det, SubLObject nbar) {
        {
            SubLObject nbar_head = (NIL != pph_phrase.pph_phrase_has_dtrsP(nbar)) ? ((SubLObject) (pph_phrase.pph_phrase_head_dtr(nbar))) : nbar;
            SubLObject doneP = NIL;
            if (((NIL != pph_phrase.pph_phrase_p(nbar_head, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (!((NIL != pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(nbar), UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_copular_complementP(pph_phrase.pph_phrase_mother(nbar)))))) {
                {
                    SubLObject nbar_head_cycl = pph_phrase.pph_phrase_cycl(nbar_head, UNPROVIDED);
                    SubLObject rest = NIL;
                    for (rest = $pph_english_lexical_indefinites$.getGlobalValue(); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject cons = rest.first();
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject type = NIL;
                            SubLObject string = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt202);
                            type = current.first();
                            current = current.rest();
                            string = current;
                            if (nbar_head_cycl == type) {
                                pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                                pph_phrase.pph_phrase_set_string(nbar_head, string);
                                if (nbar != nbar_head) {
                                    com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(nbar);
                                }
                                doneP = T;
                            }
                        }
                    }
                }
            }
            return doneP;
        }
    }

    /**
     * Try to use a lexicalized indefinite NP for DET and NBAR.
     */
    @LispMethod(comment = "Try to use a lexicalized indefinite NP for DET and NBAR.")
    public static SubLObject pph_phrase_english_indefinite_np(final SubLObject det, final SubLObject nbar) {
        final SubLObject nbar_head = (NIL != pph_phrase.pph_phrase_has_dtrsP(nbar)) ? pph_phrase.pph_phrase_head_dtr(nbar) : nbar;
        SubLObject doneP = NIL;
        if (((((NIL != pph_phrase.pph_phrase_p(nbar_head, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_doneP(nbar))) && (NIL != pph_phrase.pph_phrase_compatible_with_predsP(nbar, $list196))) && (NIL == pph_phrase.pph_cycl_phrase_p(nbar))) && ((NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(nbar), UNPROVIDED)) || (NIL == pph_copular_complementP(pph_phrase.pph_phrase_mother(nbar))))) {
            final SubLObject nbar_head_cycl = pph_phrase.pph_phrase_cycl(nbar_head, UNPROVIDED);
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject type;
            SubLObject string;
            for (rest = NIL, rest = $pph_english_lexical_indefinites$.getGlobalValue(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                cons = rest.first();
                datum = current = cons;
                type = NIL;
                string = NIL;
                destructuring_bind_must_consp(current, datum, $list197);
                type = current.first();
                current = string = current.rest();
                if (nbar_head_cycl.eql(type)) {
                    pph_phrase.pph_phrase_set_string(det, string_utilities.$empty_string$.getGlobalValue());
                    pph_phrase.pph_phrase_set_string(nbar_head, string);
                    pph_phrase.pph_phrase_set_agr_preds(nbar_head, $list196, UNPROVIDED);
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str198$Nbar_string_is__S__Output_list___, pph_phrase.pph_phrase_string(nbar, NIL), pph_phrase.pph_phrase_output_list(nbar), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (!nbar.eql(nbar_head)) {
                        pph_phrase_set_output_list_from_finished_dtrs(nbar);
                    }
                    doneP = T;
                }
            }
        }
        return doneP;
    }

    public static final SubLObject pph_copular_complementP_alt(SubLObject np) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject s = (NIL != pph_phrase.pph_phrase_npP(np)) ? ((SubLObject) (pph_phrase.pph_phrase_mother(np))) : NIL;
                SubLObject v_answer = NIL;
                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_npP(np)))) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(np), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy($sym203$PPH_PHRASE_NP_) })) });
                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    }
                }
                if (((NIL != pph_phrase.pph_phrase_p(s, UNPROVIDED)) && np.eql(pph_phrase.pph_phrase_nth_dtr(s, TWO_INTEGER))) && (NIL != pph_phrase.pph_copula_phraseP(pph_phrase.pph_phrase_nth_dtr(s, ONE_INTEGER)))) {
                    v_answer = T;
                }
                return v_answer;
            }
        }
    }

    public static SubLObject pph_copular_complementP(final SubLObject np) {
        final SubLObject s = (NIL != pph_phrase.pph_phrase_npP(np)) ? pph_phrase.pph_phrase_mother(np) : NIL;
        SubLObject v_answer = NIL;
        if (((NIL != pph_phrase.pph_phrase_p(s, UNPROVIDED)) && np.eql(pph_phrase.pph_phrase_nth_dtr(s, TWO_INTEGER))) && (NIL != pph_phrase.pph_copula_phraseP(pph_phrase.pph_phrase_nth_dtr(s, ONE_INTEGER)))) {
            v_answer = T;
        }
        return v_answer;
    }

    public static final SubLObject pph_noun_predP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return pph_utilities.pph_genl_pos_predP(pred, $$nounStrings, mt);
    }

    public static SubLObject pph_noun_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return pph_utilities.pph_genl_pos_predP(pred, $$nounStrings, mt);
    }

    public static final SubLObject pph_singular_noun_predP_alt(SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, $$singular_Generic, UNPROVIDED);
    }

    public static SubLObject pph_singular_noun_predP(final SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, $$singular_Generic, UNPROVIDED);
    }

    public static final SubLObject pph_non_singular_noun_predP_alt(SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, $$nonSingular_Generic, UNPROVIDED);
    }

    public static SubLObject pph_non_singular_noun_predP(final SubLObject pred) {
        return pph_utilities.pph_genl_pos_predP(pred, $$nonSingular_Generic, UNPROVIDED);
    }

    public static final SubLObject pph_singular_determiner_string_alt(SubLObject target_string) {
        return pph_utilities.select_determiner_string($list_alt205, target_string, $$singular_Generic);
    }

    public static SubLObject pph_singular_determiner_string(final SubLObject target_string) {
        return pph_utilities.select_determiner_string($list200, target_string, $$singular_Generic);
    }

    /**
     *
     *
     * @param PREDS;
     * 		LISTP of speech part preds.
     * @return a list of speech part preds (should never be empty) that have tense information and are compatible with PREDS.
     */
    @LispMethod(comment = "@param PREDS;\r\n\t\tLISTP of speech part preds.\r\n@return a list of speech part preds (should never be empty) that have tense information and are compatible with PREDS.")
    public static final SubLObject tense_preds_for_constraints_alt(SubLObject preds) {
        if ((NIL == preds) || (preds == $ANY)) {
            return pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect();
        } else {
            return pph_utilities.pph_filter_preds(pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect(), preds, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param PREDS;
     * 		LISTP of speech part preds.
     * @return a list of speech part preds (should never be empty) that have tense information and are compatible with PREDS.
     */
    @LispMethod(comment = "@param PREDS;\r\n\t\tLISTP of speech part preds.\r\n@return a list of speech part preds (should never be empty) that have tense information and are compatible with PREDS.")
    public static SubLObject tense_preds_for_constraints(final SubLObject preds) {
        if ((NIL == preds) || (preds == $ANY)) {
            return pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect();
        }
        return pph_utilities.pph_filter_preds(pph_utilities.pph_generic_speech_part_preds_with_tense_and_aspect(), preds, UNPROVIDED);
    }

    /**
     *
     *
     * @param PREDS;
     * 		LISTP of speech part preds.
     * @return a speech part pred (should never be nil) that has tense information.
     */
    @LispMethod(comment = "@param PREDS;\r\n\t\tLISTP of speech part preds.\r\n@return a speech part pred (should never be nil) that has tense information.")
    public static final SubLObject tense_pred_for_constraints_alt(SubLObject preds) {
        if ((NIL == preds) || (preds == $ANY)) {
            return pph_utilities.pph_present_tense_pred();
        } else {
            {
                SubLObject unified = pph_utilities.pph_unify_speech_part_preds(preds);
                SubLObject result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_present_tense_pred()));
                if (NIL == result) {
                    result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_past_tense_pred()));
                }
                if (NIL == result) {
                    result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_future_tense_pred()));
                }
                return NIL != result ? ((SubLObject) (result)) : unified;
            }
        }
    }

    /**
     *
     *
     * @param PREDS;
     * 		LISTP of speech part preds.
     * @return a speech part pred (should never be nil) that has tense information.
     */
    @LispMethod(comment = "@param PREDS;\r\n\t\tLISTP of speech part preds.\r\n@return a speech part pred (should never be nil) that has tense information.")
    public static SubLObject tense_pred_for_constraints(final SubLObject preds) {
        if ((NIL == preds) || (preds == $ANY)) {
            return pph_utilities.pph_present_tense_pred();
        }
        final SubLObject unified = pph_utilities.pph_unify_speech_part_preds(preds);
        SubLObject result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_present_tense_pred()));
        if (NIL == result) {
            result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_past_tense_pred()));
        }
        if (NIL == result) {
            result = pph_utilities.pph_unify_speech_part_preds(list(unified, pph_utilities.pph_future_tense_pred()));
        }
        return NIL != result ? result : unified;
    }

    public static final SubLObject verb_pred_for_subject_preds_alt(SubLObject subj_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preds = com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_preds(subj_preds, UNPROVIDED);
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject ceilings = genl_predicates.min_ceiling_predicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            ans = (NIL != ceilings) ? ((SubLObject) (ceilings.first())) : preds.first();
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject verb_pred_for_subject_preds(final SubLObject subj_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = verb_preds_for_subject_preds(subj_preds, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject ceilings = genl_predicates.min_ceiling_predicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            ans = (NIL != ceilings) ? ceilings.first() : preds.first();
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    /**
     *
     *
     * @return speech-part preds for verb agreeing with SUBJECT-PHRASE
    and INTERNAL-CONSTRAINTS
     */
    @LispMethod(comment = "@return speech-part preds for verb agreeing with SUBJECT-PHRASE\r\nand INTERNAL-CONSTRAINTS")
    public static final SubLObject verb_preds_for_subject_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        internal_constraints = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_strengthen_verb_constraints(internal_constraints);
        {
            SubLObject index = pph_data_structures.pph_phrase_info_lookup(subject_phrase, $INDEX, UNPROVIDED);
            if (NIL != pph_methods_lexicon.pph_pronoun_agr_p(index)) {
                return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_pronoun(subject_phrase, internal_constraints);
            } else {
                return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_int(subject_phrase, internal_constraints);
            }
        }
    }

    /**
     *
     *
     * @return speech-part preds for verb agreeing with SUBJECT-PHRASE
    and INTERNAL-CONSTRAINTS
     */
    @LispMethod(comment = "@return speech-part preds for verb agreeing with SUBJECT-PHRASE\r\nand INTERNAL-CONSTRAINTS")
    public static SubLObject verb_preds_for_subject(final SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        internal_constraints = pph_strengthen_verb_constraints(internal_constraints);
        final SubLObject index = pph_data_structures.pph_phrase_info_lookup(subject_phrase, $INDEX, UNPROVIDED);
        if (NIL != pph_methods_lexicon.pph_pronoun_agr_p(index)) {
            return verb_preds_for_subject_pronoun(subject_phrase, internal_constraints);
        }
        return verb_preds_for_subject_int(subject_phrase, internal_constraints);
    }

    /**
     *
     *
     * @return speech-part pred for verb agreeing with SUBJECT-PHRASE
    and INTERNAL-CONSTRAINTS
     */
    @LispMethod(comment = "@return speech-part pred for verb agreeing with SUBJECT-PHRASE\r\nand INTERNAL-CONSTRAINTS")
    public static final SubLObject verb_pred_for_subject_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        internal_constraints = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_strengthen_verb_constraints(internal_constraints);
        if (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(subject_phrase, UNPROVIDED), $$Pronoun, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_pronoun(subject_phrase, internal_constraints);
        } else {
            return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_int(subject_phrase, internal_constraints);
        }
    }

    /**
     *
     *
     * @return speech-part pred for verb agreeing with SUBJECT-PHRASE
    and INTERNAL-CONSTRAINTS
     */
    @LispMethod(comment = "@return speech-part pred for verb agreeing with SUBJECT-PHRASE\r\nand INTERNAL-CONSTRAINTS")
    public static SubLObject verb_pred_for_subject(final SubLObject subject_phrase, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        internal_constraints = pph_strengthen_verb_constraints(internal_constraints);
        if (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(subject_phrase, UNPROVIDED), $$Pronoun, UNPROVIDED)) {
            return verb_pred_for_subject_pronoun(subject_phrase, internal_constraints);
        }
        return verb_pred_for_subject_int(subject_phrase, internal_constraints);
    }

    /**
     * Tighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and
     * requiring present tense if nothing else is specified.
     */
    @LispMethod(comment = "Tighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and\r\nrequiring present tense if nothing else is specified.\nTighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and\nrequiring present tense if nothing else is specified.")
    public static final SubLObject pph_strengthen_verb_constraints_alt(SubLObject internal_constraints) {
        {
            SubLObject constraints = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_remove_weak_verb_constraints(internal_constraints);
            if ((NIL == pph_vars.pph_generate_morphological_alternativesP()) && ((!constraints.isList()) || (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_verb_constraints_could_be_present_tenseP(list(constraints.first()))))) {
                constraints = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_verb_constraints_ensure_present_tense(constraints);
            }
            return constraints;
        }
    }

    @LispMethod(comment = "Tighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and\r\nrequiring present tense if nothing else is specified.\nTighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and\nrequiring present tense if nothing else is specified.")
    public static SubLObject pph_strengthen_verb_constraints(final SubLObject internal_constraints) {
        SubLObject constraints = pph_remove_weak_verb_constraints(internal_constraints);
        if ((NIL == pph_vars.pph_generate_morphological_alternativesP()) && ((!constraints.isList()) || (NIL != pph_verb_constraints_could_be_present_tenseP(list(constraints.first()))))) {
            constraints = pph_verb_constraints_ensure_present_tense(constraints);
        }
        return constraints;
    }/**
     * Tighten up INTERNAL-CONSTRAINTS by removing any meaningless constraints, and
     * requiring present tense if nothing else is specified.
     */


    /**
     *
     *
     * @return BOOLEANP; Do CONSTRAINTS permit present-tense generation?
     */
    @LispMethod(comment = "@return BOOLEANP; Do CONSTRAINTS permit present-tense generation?")
    public static final SubLObject pph_verb_constraints_could_be_present_tenseP_alt(SubLObject constraints) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_verb_constraints_ensure_present_tense(constraints));
    }

    /**
     *
     *
     * @return BOOLEANP; Do CONSTRAINTS permit present-tense generation?
     */
    @LispMethod(comment = "@return BOOLEANP; Do CONSTRAINTS permit present-tense generation?")
    public static SubLObject pph_verb_constraints_could_be_present_tenseP(final SubLObject constraints) {
        return list_utilities.sublisp_boolean(pph_verb_constraints_ensure_present_tense(constraints));
    }

    /**
     *
     *
     * @return LISTP; CONSTRAINTS plus the further constraint that the generated
    verb form be present tense.
     */
    @LispMethod(comment = "@return LISTP; CONSTRAINTS plus the further constraint that the generated\r\nverb form be present tense.")
    public static final SubLObject pph_verb_constraints_ensure_present_tense_alt(SubLObject constraints) {
        return pph_utilities.pph_filter_preds(constraints, list(pph_utilities.pph_present_tense_pred()), UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP; CONSTRAINTS plus the further constraint that the generated
    verb form be present tense.
     */
    @LispMethod(comment = "@return LISTP; CONSTRAINTS plus the further constraint that the generated\r\nverb form be present tense.")
    public static SubLObject pph_verb_constraints_ensure_present_tense(final SubLObject constraints) {
        return pph_utilities.pph_filter_preds(constraints, list(pph_utilities.pph_present_tense_pred()), UNPROVIDED);
    }

    public static final SubLObject pph_remove_weak_verb_constraints_alt(SubLObject internal_constraints) {
        {
            SubLObject remaining = remove($$verbStrings, internal_constraints, $sym209$GENL_POS_PRED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != remaining ? ((SubLObject) (remaining)) : $ANY;
        }
    }

    public static SubLObject pph_remove_weak_verb_constraints(final SubLObject internal_constraints) {
        final SubLObject remaining = remove($$verbStrings, internal_constraints, $sym204$GENL_POS_PRED_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != remaining ? remaining : $ANY;
    }

    public static final SubLObject verb_preds_for_subject_int_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        {
            SubLObject verb_preds = NIL;
            SubLObject subject_agr_preds = pph_phrase.pph_phrase_agr_preds(subject_phrase, UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt210$__Subject_agr___S__, subject_agr_preds);
            }
            verb_preds = com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_preds(subject_agr_preds, internal_constraints);
            return NIL != verb_preds ? ((SubLObject) (verb_preds)) : list(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_default_verb_pred());
        }
    }

    public static SubLObject verb_preds_for_subject_int(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        if (NIL != pph_utilities.pph_isaP(pph_phrase.pph_phrase_cycl(subject_phrase, UNPROVIDED), $$MeasurableQuantity, UNPROVIDED)) {
            return list($$singularVerb_Generic);
        }
        SubLObject verb_preds = NIL;
        final SubLObject subject_agr_preds = pph_phrase.pph_phrase_agr_preds(subject_phrase, UNPROVIDED);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str206$__Subject_agr___S__, subject_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        verb_preds = verb_preds_for_subject_preds(subject_agr_preds, internal_constraints);
        return NIL != verb_preds ? verb_preds : list(pph_phrase_default_verb_pred());
    }

    public static final SubLObject verb_pred_for_subject_int_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        {
            SubLObject verb_pred = NIL;
            SubLObject subject_agr_pred = pph_phrase.pph_phrase_agr_pred(subject_phrase);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt210$__Subject_agr___S__, subject_agr_pred);
            }
            verb_pred = com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_pred(subject_agr_pred, internal_constraints);
            return NIL != verb_pred ? ((SubLObject) (verb_pred)) : com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_default_verb_pred();
        }
    }

    public static SubLObject verb_pred_for_subject_int(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        SubLObject verb_pred = NIL;
        final SubLObject subject_agr_pred = pph_phrase.pph_phrase_agr_pred(subject_phrase);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str206$__Subject_agr___S__, subject_agr_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        verb_pred = verb_pred_for_subject_pred(subject_agr_pred, internal_constraints);
        return NIL != verb_pred ? verb_pred : pph_phrase_default_verb_pred();
    }

    public static final SubLObject verb_preds_for_subject_pronoun_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        {
            SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, UNPROVIDED);
            if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
                return NIL;
            } else {
                if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$SecondPerson_NLAttr)) {
                    {
                        SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$secondPersonSg_Generic), UNPROVIDED);
                        return NIL != good_preds ? ((SubLObject) (good_preds)) : list($$secondPersonSg_Present);
                    }
                } else {
                    if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$FirstPerson_NLAttr)) {
                        {
                            SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$firstPersonSg_Generic), UNPROVIDED);
                            return NIL != good_preds ? ((SubLObject) (good_preds)) : list($$firstPersonSg_Present);
                        }
                    } else {
                        return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_int(subject_phrase, internal_constraints);
                    }
                }
            }
        }
    }

    public static SubLObject verb_preds_for_subject_pronoun(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        final SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, UNPROVIDED);
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$SecondPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$secondPersonSg_Generic), UNPROVIDED);
            return NIL != good_preds ? good_preds : list($$secondPersonSg_Present);
        }
        if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$FirstPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$firstPersonSg_Generic), UNPROVIDED);
            return NIL != good_preds ? good_preds : list($$firstPersonSg_Present);
        }
        return verb_preds_for_subject_int(subject_phrase, internal_constraints);
    }

    public static final SubLObject verb_pred_for_subject_pronoun_alt(SubLObject subject_phrase, SubLObject internal_constraints) {
        {
            SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, UNPROVIDED);
            if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
                return NIL;
            } else {
                if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$SecondPerson_NLAttr)) {
                    {
                        SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$secondPersonSg_Generic), UNPROVIDED);
                        return NIL != good_preds ? ((SubLObject) (good_preds.first())) : $$secondPersonSg_Present;
                    }
                } else {
                    if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$FirstPerson_NLAttr)) {
                        {
                            SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$firstPersonSg_Generic), UNPROVIDED);
                            return NIL != good_preds ? ((SubLObject) (good_preds.first())) : $$firstPersonSg_Present;
                        }
                    } else {
                        return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_int(subject_phrase, internal_constraints);
                    }
                }
            }
        }
    }

    public static SubLObject verb_pred_for_subject_pronoun(final SubLObject subject_phrase, final SubLObject internal_constraints) {
        final SubLObject referent = pph_phrase.pph_phrase_cycl(subject_phrase, UNPROVIDED);
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$SecondPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$secondPersonSg_Generic), UNPROVIDED);
            return NIL != good_preds ? good_preds.first() : $$secondPersonSg_Present;
        }
        if ((NIL != pph_drs.pph_discourse_referentP(referent)) && pph_drs.pph_discourse_person_for_cycl(referent).eql($$FirstPerson_NLAttr)) {
            final SubLObject good_preds = pph_utilities.pph_filter_preds(internal_constraints, list($$firstPersonSg_Generic), UNPROVIDED);
            return NIL != good_preds ? good_preds.first() : $$firstPersonSg_Present;
        }
        return verb_pred_for_subject_int(subject_phrase, internal_constraints);
    }

    /**
     *
     *
     * @return speech-part preds for verb agreeing with a subject whose
    speech-part preds are SUBJ-PREDS.
     */
    @LispMethod(comment = "@return speech-part preds for verb agreeing with a subject whose\r\nspeech-part preds are SUBJ-PREDS.")
    public static final SubLObject verb_preds_for_subject_preds_alt(SubLObject subj_preds, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        {
            SubLObject tenses = com.cyc.cycjava.cycl.pph_phrase_resolution.tense_preds_for_constraints(internal_constraints);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt217$__Using_tenses__S__, tenses);
            }
            {
                SubLObject subj_agr_preds = pph_utilities.pph_peer_agr_for_preds(subj_preds, UNPROVIDED);
                if (NIL != list_utilities.empty_list_p(subj_preds)) {
                    return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_preds_for_tenses(tenses);
                } else {
                    if (NIL != list_utilities.empty_list_p(find_if(symbol_function($sym218$PPH_FINITE_VERB_PRED_), tenses, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        return tenses;
                    } else {
                        if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym219$PPH_NON_PLURAL_NOUN_PRED_), subj_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_preds_for_tenses(tenses);
                        } else {
                            if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym220$PPH_PLURAL_NOUN_PRED_), subj_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_plural_verb_preds_for_tenses(tenses);
                            } else {
                                if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym221$PPH_PLURAL_VERB_PRED_), tenses, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    return tenses;
                                } else {
                                    if (subj_preds.equal(list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()))) {
                                        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_preds_for_tenses(tenses);
                                    } else {
                                        return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_preds_for_subject_preds(list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()), tenses);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return speech-part preds for verb agreeing with a subject whose
    speech-part preds are SUBJ-PREDS.
     */
    @LispMethod(comment = "@return speech-part preds for verb agreeing with a subject whose\r\nspeech-part preds are SUBJ-PREDS.")
    public static SubLObject verb_preds_for_subject_preds(final SubLObject subj_preds, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        final SubLObject tenses = tense_preds_for_constraints(internal_constraints);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str213$__Using_tenses__S__, tenses, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject subj_agr_preds = pph_utilities.pph_peer_agr_for_preds(subj_preds, UNPROVIDED);
        if (NIL != list_utilities.empty_list_p(subj_preds)) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        if (NIL != list_utilities.empty_list_p(find_if(symbol_function($sym214$PPH_FINITE_VERB_PRED_), tenses, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return tenses;
        }
        if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym215$PPH_NON_PLURAL_NOUN_PRED_), subj_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym216$PPH_PLURAL_NOUN_PRED_), subj_agr_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return pph_plural_verb_preds_for_tenses(tenses);
        }
        if (NIL != list_utilities.empty_list_p(list_utilities.find_if_not(symbol_function($sym217$PPH_PLURAL_VERB_PRED_), tenses, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return tenses;
        }
        if (subj_preds.equal(list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()))) {
            return pph_singular_verb_preds_for_tenses(tenses);
        }
        return verb_preds_for_subject_preds(list(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()), tenses);
    }

    /**
     *
     *
     * @return speech-part pred for verb agreeing with a subject whose
    speech-part pred is SUBJ-PRED.
     */
    @LispMethod(comment = "@return speech-part pred for verb agreeing with a subject whose\r\nspeech-part pred is SUBJ-PRED.")
    public static final SubLObject verb_pred_for_subject_pred_alt(SubLObject subj_pred, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        {
            SubLObject tense = com.cyc.cycjava.cycl.pph_phrase_resolution.tense_pred_for_constraints(internal_constraints);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt222$__Using_tense__S__, tense);
            }
            {
                SubLObject subj_agr_pred = pph_utilities.pph_peer_agr_for_pred(subj_pred, UNPROVIDED);
                if (NIL == subj_pred) {
                    return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_pred_for_tense(tense);
                } else {
                    if (NIL == com.cyc.cycjava.cycl.pph_phrase_resolution.pph_finite_verb_predP(tense)) {
                        return tense;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_non_plural_noun_predP(subj_agr_pred)) {
                            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_pred_for_tense(tense);
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_plural_noun_predP(subj_agr_pred)) {
                                return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_plural_verb_pred_for_tense(tense);
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_plural_verb_predP(tense)) {
                                    return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_plural_verb_pred_for_tense(tense);
                                } else {
                                    if (subj_pred == pph_utilities.$pph_default_np_agr_pred$.getGlobalValue()) {
                                        return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_singular_verb_pred_for_tense(tense);
                                    } else {
                                        return com.cyc.cycjava.cycl.pph_phrase_resolution.verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), list(tense));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return speech-part pred for verb agreeing with a subject whose
    speech-part pred is SUBJ-PRED.
     */
    @LispMethod(comment = "@return speech-part pred for verb agreeing with a subject whose\r\nspeech-part pred is SUBJ-PRED.")
    public static SubLObject verb_pred_for_subject_pred(final SubLObject subj_pred, SubLObject internal_constraints) {
        if (internal_constraints == UNPROVIDED) {
            internal_constraints = NIL;
        }
        final SubLObject tense = tense_pred_for_constraints(internal_constraints);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str218$__Using_tense__S__, tense, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject subj_agr_pred = pph_utilities.pph_peer_agr_for_pred(subj_pred, UNPROVIDED);
        if (NIL == subj_pred) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        if (NIL == pph_finite_verb_predP(tense)) {
            return tense;
        }
        if (NIL != pph_non_plural_noun_predP(subj_agr_pred)) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        if (NIL != pph_plural_noun_predP(subj_agr_pred)) {
            return pph_plural_verb_pred_for_tense(tense);
        }
        if (NIL != pph_plural_verb_predP(tense)) {
            return pph_plural_verb_pred_for_tense(tense);
        }
        if (subj_pred.eql(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue())) {
            return pph_singular_verb_pred_for_tense(tense);
        }
        return verb_pred_for_subject_pred(pph_utilities.$pph_default_np_agr_pred$.getGlobalValue(), list(tense));
    }

    public static final SubLObject pph_finite_verb_predP_alt(SubLObject pos_pred) {
        return pph_utilities.pph_genl_pos_predP(pos_pred, $$tensed, UNPROVIDED);
    }

    public static SubLObject pph_finite_verb_predP(final SubLObject pos_pred) {
        return pph_utilities.pph_genl_pos_predP(pos_pred, $$tensed, UNPROVIDED);
    }

    public static final SubLObject pph_non_plural_noun_predP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_pos_predP(pred, $$nonPlural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_non_plural_noun_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, $$nonPlural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }

    public static final SubLObject pph_plural_noun_predP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_pos_predP(pred, $$plural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_plural_noun_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, $$plural_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }

    public static final SubLObject pph_plural_verb_predP_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_pos_predP(pred, $$pluralVerb_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_plural_verb_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_pos_predP(pred, $$pluralVerb_Generic, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }

    public static final SubLObject pph_singular_verb_preds_for_tenses_alt(SubLObject tenses) {
        return pph_utilities.pph_filter_preds(list($$thirdPersonSg_Generic), tenses, UNPROVIDED);
    }

    public static SubLObject pph_singular_verb_preds_for_tenses(final SubLObject tenses) {
        return pph_utilities.pph_filter_preds(list($$thirdPersonSg_Generic), tenses, UNPROVIDED);
    }

    public static final SubLObject pph_singular_verb_pred_for_tense_alt(SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose($$thirdPersonSg_Generic, tense);
    }

    public static SubLObject pph_singular_verb_pred_for_tense(final SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose($$thirdPersonSg_Generic, tense);
    }

    public static final SubLObject pph_plural_verb_preds_for_tenses_alt(SubLObject tenses) {
        return pph_utilities.pph_filter_preds(list($$pluralVerb_Generic), tenses, UNPROVIDED);
    }

    public static SubLObject pph_plural_verb_preds_for_tenses(final SubLObject tenses) {
        return pph_utilities.pph_filter_preds(list($$pluralVerb_Generic), tenses, UNPROVIDED);
    }

    public static final SubLObject pph_plural_verb_pred_for_tense_alt(SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose($$pluralVerb_Generic, tense);
    }

    public static SubLObject pph_plural_verb_pred_for_tense(final SubLObject tense) {
        return pph_utilities.pph_unify_speech_part_preds_or_choose($$pluralVerb_Generic, tense);
    }

    /**
     * Set the pos preds of PHRASE1 and PHRASE2 to whichever is more specific.
     */
    @LispMethod(comment = "Set the pos preds of PHRASE1 and PHRASE2 to whichever is more specific.")
    public static final SubLObject pph_phrase_unify_pos_preds_alt(SubLObject phrase1, SubLObject phrase2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject p1_preds = pph_phrase.pph_phrase_agr_preds(phrase1, UNPROVIDED);
                SubLObject p2_preds = pph_phrase.pph_phrase_agr_preds(phrase2, UNPROVIDED);
                if (!p1_preds.equal(p2_preds)) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject new_preds = pph_utilities.pph_filter_preds(p1_preds, p2_preds, UNPROVIDED);
                                    if (NIL != new_preds) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                            format(T, $str_alt226$__Unifying__S_and__S_to__S___, new SubLObject[]{ p1_preds, p2_preds, new_preds });
                                        }
                                        pph_phrase.pph_phrase_update_agr_preds(phrase1, p2_preds, UNPROVIDED);
                                        pph_phrase.pph_phrase_update_agr_preds(phrase2, p1_preds, UNPROVIDED);
                                    } else {
                                        if ((NIL != pph_phrase.pph_phrase_doneP(phrase1)) && (NIL != pph_phrase.pph_phrase_head_dtrP(phrase1, phrase2))) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                Errors.warn($str_alt227$Using_agr_preds__S_from_done_head, p1_preds, phrase1, phrase2);
                                            }
                                            pph_phrase.pph_phrase_set_agr_preds(phrase2, p1_preds, UNPROVIDED);
                                        } else {
                                            if ((NIL != pph_phrase.pph_phrase_doneP(phrase2)) && (NIL != pph_phrase.pph_phrase_head_dtrP(phrase2, phrase1))) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    Errors.warn($str_alt227$Using_agr_preds__S_from_done_head, p2_preds, phrase2, phrase1);
                                                }
                                                pph_phrase.pph_phrase_set_agr_preds(phrase1, p2_preds, UNPROVIDED);
                                            } else {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    Errors.warn($str_alt228$Couldn_t_unify__S_and__S___, p1_preds, p2_preds);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format(T, $str_alt229$__AGRs_are_now____S_and____S___, pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2));
                    }
                }
            }
            return values(pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2));
        }
    }

    @LispMethod(comment = "Set the pos preds of PHRASE1 and PHRASE2 to whichever is more specific.")
    public static SubLObject pph_phrase_unify_pos_preds(final SubLObject phrase1, final SubLObject phrase2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject p1_preds = pph_phrase.pph_phrase_agr_preds(phrase1, UNPROVIDED);
        final SubLObject p2_preds = pph_phrase.pph_phrase_agr_preds(phrase2, UNPROVIDED);
        if (!p1_preds.equal(p2_preds)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject new_preds = pph_utilities.pph_filter_preds(p1_preds, p2_preds, UNPROVIDED);
                if (NIL != new_preds) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str222$__Unifying__S_and__S_to__S___, p1_preds, p2_preds, new_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_update_agr_preds(phrase1, p2_preds, UNPROVIDED);
                    pph_phrase.pph_phrase_update_agr_preds(phrase2, p1_preds, UNPROVIDED);
                } else
                    if ((NIL != pph_phrase.pph_phrase_doneP(phrase1)) && (NIL != pph_phrase.pph_phrase_head_dtrP(phrase1, phrase2))) {
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str223$Using_agr_preds__S_from_done_head, p1_preds, phrase1, phrase2);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        pph_phrase.pph_phrase_set_agr_preds(phrase2, p1_preds, UNPROVIDED);
                    } else
                        if ((NIL != pph_phrase.pph_phrase_doneP(phrase2)) && (NIL != pph_phrase.pph_phrase_head_dtrP(phrase2, phrase1))) {
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str223$Using_agr_preds__S_from_done_head, p2_preds, phrase2, phrase1);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }
                            pph_phrase.pph_phrase_set_agr_preds(phrase1, p2_preds, UNPROVIDED);
                        } else
                            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn($str224$Couldn_t_unify__S_and__S___, p1_preds, p2_preds);
                                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                            }



            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str225$__AGRs_are_now____S_and____S___, pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return values(pph_phrase.pph_phrase_agr(phrase1), pph_phrase.pph_phrase_agr(phrase2));
    }/**
     * Set the pos preds of PHRASE1 and PHRASE2 to whichever is more specific.
     */


    /**
     *
     *
     * @return BOOLEAN; Does PHRASE begin with a determiner phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE begin with a determiner phrase?")
    public static final SubLObject pph_phrase_starts_with_detpP_alt(SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        {
            SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_detpP(left_dtr);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE begin with a determiner phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE begin with a determiner phrase?")
    public static SubLObject pph_phrase_starts_with_detpP(final SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        final SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        return pph_phrase_detpP(left_dtr);
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE begin with a determiner phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE begin with a determiner phrase?")
    public static final SubLObject pph_phrase_starts_with_detP_alt(SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        {
            SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
            return com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_determinerP(left_dtr);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Does PHRASE begin with a determiner phrase?
     */
    @LispMethod(comment = "@return BOOLEAN; Does PHRASE begin with a determiner phrase?")
    public static SubLObject pph_phrase_starts_with_detP(final SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        final SubLObject left_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        return pph_phrase_determinerP(left_dtr);
    }

    /**
     * Is PHRASE a determiner?
     */
    @LispMethod(comment = "Is PHRASE a determiner?")
    public static final SubLObject pph_phrase_determinerP_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, T), $$Determiner, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Is PHRASE a determiner?")
    public static SubLObject pph_phrase_determinerP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, T), $$Determiner, pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }/**
     * Is PHRASE a determiner?
     */


    /**
     * Is PHRASE a determiner phrase?
     */
    @LispMethod(comment = "Is PHRASE a determiner phrase?")
    public static final SubLObject pph_phrase_detpP_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_utilities.pph_genl_categoryP(pph_phrase.pph_phrase_category(phrase, T), com.cyc.cycjava.cycl.pph_phrase_resolution.pph_detp_nart(), pph_vars.$pph_language_mt$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Is PHRASE a determiner phrase?")
    public static SubLObject pph_phrase_detpP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_utilities.pph_genl_categoryP(pph_phrase.pph_phrase_category(phrase, T), pph_detp_nart(), pph_vars.$pph_language_mt$.getDynamicValue(thread));
    }/**
     * Is PHRASE a determiner phrase?
     */


    public static final SubLObject pph_detp_nart_alt() {
        {
            SubLObject nart = com.cyc.cycjava.cycl.pph_phrase_resolution.pph_detp_nart_cached();
            if (NIL == nart_handles.nart_p(nart)) {
                com.cyc.cycjava.cycl.pph_phrase_resolution.clear_pph_detp_nart_cached();
            }
            return nart;
        }
    }

    public static SubLObject pph_detp_nart() {
        final SubLObject nart = pph_detp_nart_cached();
        if (NIL == nart_handles.nart_p(nart)) {
            clear_pph_detp_nart_cached();
        }
        return nart;
    }

    public static final SubLObject clear_pph_detp_nart_cached_alt() {
        {
            SubLObject cs = $pph_detp_nart_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_pph_detp_nart_cached() {
        final SubLObject cs = $pph_detp_nart_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_pph_detp_nart_cached_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($pph_detp_nart_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_pph_detp_nart_cached() {
        return memoization_state.caching_state_remove_function_results_with_args($pph_detp_nart_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_detp_nart_cached_internal_alt() {
        return narts_high.find_nart($list_alt231);
    }

    public static SubLObject pph_detp_nart_cached_internal() {
        return narts_high.find_nart($list227);
    }

    public static final SubLObject pph_detp_nart_cached_alt() {
        {
            SubLObject caching_state = $pph_detp_nart_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PPH_DETP_NART_CACHED, $pph_detp_nart_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw233$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_phrase_resolution.pph_detp_nart_cached_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject pph_detp_nart_cached() {
        SubLObject caching_state = $pph_detp_nart_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PPH_DETP_NART_CACHED, $pph_detp_nart_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pph_detp_nart_cached_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject pph_wordify_sem_free_noun_alt(SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_wordify_noun(phrase);
        }
        return phrase;
    }

    public static SubLObject pph_wordify_sem_free_noun(final SubLObject phrase) {
        if (NIL == pph_phrase.pph_phrase_has_known_cyclP(phrase)) {
            pph_wordify_noun(phrase);
        }
        return phrase;
    }

    /**
     * If PHRASE can be reliably determined to represent a noun, modify PHRASE to
     * reflect that fact.
     *
     * @param PHRASE
    pph-phrase
     * 		
     * @return pph-phrase
     */
    @LispMethod(comment = "If PHRASE can be reliably determined to represent a noun, modify PHRASE to\r\nreflect that fact.\r\n\r\n@param PHRASE\npph-phrase\r\n\t\t\r\n@return pph-phrase\nIf PHRASE can be reliably determined to represent a noun, modify PHRASE to\nreflect that fact.")
    public static final SubLObject pph_wordify_noun_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
                if (((NIL != string) && (NIL != com.cyc.cycjava.cycl.pph_phrase_resolution.pph_noun_stringP(string))) && (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED))) {
                    {
                        SubLObject wu = lexicon_accessors.best_wu_for_string(string, $$Noun);
                        if (NIL != wu) {
                            {
                                SubLObject pos = lexicon_accessors.best_pos_for_stringXwuXpos(string, wu, $$Noun);
                                pph_phrase.pph_phrase_set_wu(phrase, wu);
                                pph_phrase.pph_phrase_set_category(phrase, pos, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return phrase;
        }
    }

    @LispMethod(comment = "If PHRASE can be reliably determined to represent a noun, modify PHRASE to\r\nreflect that fact.\r\n\r\n@param PHRASE\n\t\tpph-phrase\r\n\t\t\r\n@return pph-phrase\nIf PHRASE can be reliably determined to represent a noun, modify PHRASE to\nreflect that fact.")
    public static SubLObject pph_wordify_noun(final SubLObject phrase) {
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
        if (((NIL != string) && (NIL != pph_noun_stringP(string))) && (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED))) {
            final SubLObject wu = lexicon_accessors.best_wu_for_string(string, $$Noun);
            if (NIL != wu) {
                final SubLObject pos = lexicon_accessors.best_pos_for_stringXwuXpos(string, wu, $$Noun);
                pph_phrase.pph_phrase_set_wu(phrase, wu);
                pph_phrase.pph_phrase_set_category(phrase, pos, UNPROVIDED);
            }
        }
        return phrase;
    }/**
     * If PHRASE can be reliably determined to represent a noun, modify PHRASE to
     * reflect that fact.
     *
     * @param PHRASE
    		pph-phrase
     * 		
     * @return pph-phrase
     */


    /**
     *
     *
     * @return BOOLEAN; Is STRING a noun?
     * @unknown Method used depends on features available.
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a noun?\r\n@unknown Method used depends on features available.")
    public static final SubLObject pph_noun_stringP_alt(SubLObject string) {
        return rkf_string_weeders.rkf_noun_stringP(string, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a noun?
     * @unknown Method used depends on features available.
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a noun?\r\n@unknown Method used depends on features available.")
    public static SubLObject pph_noun_stringP(final SubLObject string) {
        return rkf_string_weeders.rkf_noun_stringP(string, UNPROVIDED);
    }

    /**
     * Switch :ARG1 and :ARG2 in the semantics of PHRASE.
     *
     * @unknown recurses into the semantics of PHRASE's daughters.
     */
    @LispMethod(comment = "Switch :ARG1 and :ARG2 in the semantics of PHRASE.\r\n\r\n@unknown recurses into the semantics of PHRASE\'s daughters.")
    public static final SubLObject pph_phrase_switch_arg1_and_arg2_in_dtrs_alt(SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt234$__Switching_arg1_and_arg2_in__S__, phrase);
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt5$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt6$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt8$_is_not_a_, format_nil.format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
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
                        if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                            com.cyc.cycjava.cycl.pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(dtr);
                        } else {
                            pph_phrase.pph_phrase_set_cycl(dtr, pph_utilities.pph_switch_arg1_and_arg2(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED)));
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
            return phrase;
        }
    }

    @LispMethod(comment = "Switch :ARG1 and :ARG2 in the semantics of PHRASE.\r\n\r\n@unknown recurses into the semantics of PHRASE\'s daughters.")
    public static SubLObject pph_phrase_switch_arg1_and_arg2_in_dtrs(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str229$__Switching_arg1_and_arg2_in__S__, phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject successP;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if ((NIL != pph_phrase.pph_repeated_phrase_p(dtr)) && (NIL != pph_phrase.pph_repeated_phrase_references_argP(dtr, $ARG2))) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str231$Can_t_switch_arg1_and_arg2_in_rep, dtr);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    return NIL;
                }
                if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                    successP = pph_phrase_switch_arg1_and_arg2_in_dtrs(dtr);
                    if (NIL == successP) {
                        return NIL;
                    }
                } else {
                    pph_phrase.pph_phrase_set_cycl(dtr, pph_utilities.pph_switch_arg1_and_arg2(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED)));
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return phrase;
    }/**
     * Switch :ARG1 and :ARG2 in the semantics of PHRASE.
     *
     * @unknown recurses into the semantics of PHRASE's daughters.
     */


    public static final SubLObject declare_pph_phrase_resolution_file_alt() {
        declareFunction("pph_note_unfinished_phrase", "PPH-NOTE-UNFINISHED-PHRASE", 1, 1, false);
        declareFunction("pph_phrase_note_unfinished_dtrs", "PPH-PHRASE-NOTE-UNFINISHED-DTRS", 1, 0, false);
        declareFunction("pph_phrase_get_string", "PPH-PHRASE-GET-STRING", 1, 2, false);
        declareFunction("pph_phrase_maybe_throw_hl_supports", "PPH-PHRASE-MAYBE-THROW-HL-SUPPORTS", 1, 0, false);
        declareFunction("maybe_throw_pph_hl_supports", "MAYBE-THROW-PPH-HL-SUPPORTS", 4, 0, false);
        declareFunction("pph_nospace_phrase_output_list_from_dtr", "PPH-NOSPACE-PHRASE-OUTPUT-LIST-FROM-DTR", 1, 0, false);
        declareFunction("pph_phrase_get_string_from_dtrs", "PPH-PHRASE-GET-STRING-FROM-DTRS", 2, 0, false);
        declareFunction("pph_phrase_try_to_resolve_dtr_strings", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRINGS", 2, 0, false);
        declareFunction("pph_phrase_resolve_repeated_phrase_dtrs", "PPH-PHRASE-RESOLVE-REPEATED-PHRASE-DTRS", 2, 0, false);
        declareFunction("pph_repeated_phrase_expansion", "PPH-REPEATED-PHRASE-EXPANSION", 2, 0, false);
        declareFunction("pph_generic_arg_sequence", "PPH-GENERIC-ARG-SEQUENCE", 2, 0, false);
        declareFunction("pph_current_list_item", "PPH-CURRENT-LIST-ITEM", 2, 0, false);
        declareFunction("pph_lookup_current_list_item", "PPH-LOOKUP-CURRENT-LIST-ITEM", 1, 0, false);
        declareFunction("pph_extensional_list_p", "PPH-EXTENSIONAL-LIST-P", 1, 0, false);
        declareFunction("pph_phrase_resolve_current_list_items", "PPH-PHRASE-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        declareFunction("pph_resolve_current_list_items", "PPH-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        declareFunction("pph_current_list_item_formula_p", "PPH-CURRENT-LIST-ITEM-FORMULA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_phrase_resolution.$pph_current_list_item_formula_p$UnaryFunction();
        declareFunction("pph_current_list_item_formula_item", "PPH-CURRENT-LIST-ITEM-FORMULA-ITEM", 1, 0, false);
        declareFunction("pph_repeated_phrase_increment", "PPH-REPEATED-PHRASE-INCREMENT", 0, 0, false);
        declareFunction("pph_phrase_try_to_resolve_dtr_string", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRING", 4, 0, false);
        declareFunction("pph_phrase_resolve_clarifying_dtr", "PPH-PHRASE-RESOLVE-CLARIFYING-DTR", 4, 0, false);
        declareFunction("pph_note_phraseXdtr_agr", "PPH-NOTE-PHRASE&DTR-AGR", 3, 0, false);
        declareFunction("pph_phrase_set_dtr_relative_agr", "PPH-PHRASE-SET-DTR-RELATIVE-AGR", 3, 0, false);
        declareFunction("pph_phrase_resolve_dtr", "PPH-PHRASE-RESOLVE-DTR", 4, 0, false);
        declareFunction("pph_phrase_set_arg0_items", "PPH-PHRASE-SET-ARG0-ITEMS", 1, 1, false);
        declareFunction("pph_phrase_maybe_make_arg0_item", "PPH-PHRASE-MAYBE-MAKE-ARG0-ITEM", 1, 1, false);
        declareFunction("pph_phrase_make_arg0_item", "PPH-PHRASE-MAKE-ARG0-ITEM", 3, 0, false);
        declareFunction("pph_phrase_maybe_recompute_mothers_output_list_from_dtrs", "PPH-PHRASE-MAYBE-RECOMPUTE-MOTHERS-OUTPUT-LIST-FROM-DTRS", 1, 0, false);
        declareFunction("pph_phrase_recompute_output_list_from_dtrs", "PPH-PHRASE-RECOMPUTE-OUTPUT-LIST-FROM-DTRS", 1, 0, false);
        declareFunction("pph_phrase_independent_phraseP", "PPH-PHRASE-INDEPENDENT-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_agr_target_resolvedP", "PPH-PHRASE-AGR-TARGET-RESOLVED?", 2, 1, false);
        declareFunction("pph_phrase_set_output_list_from_finished_dtrs", "PPH-PHRASE-SET-OUTPUT-LIST-FROM-FINISHED-DTRS", 1, 0, false);
        declareFunction("pph_phrase_output_item_empty_p", "PPH-PHRASE-OUTPUT-ITEM-EMPTY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_phrase_resolution.$pph_phrase_output_item_empty_p$UnaryFunction();
        declareFunction("pph_phrase_arg0_item", "PPH-PHRASE-ARG0-ITEM", 2, 1, false);
        declareFunction("reverse_string_list_term_anchor", "REVERSE-STRING-LIST-TERM-ANCHOR", 2, 0, false);
        declareFunction("pph_phrase_arg_dtrs", "PPH-PHRASE-ARG-DTRS", 1, 0, false);
        declareFunction("pph_phrase_arg_phraseP", "PPH-PHRASE-ARG-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_arg0_phraseP", "PPH-PHRASE-ARG0-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_resolve_condition", "PPH-PHRASE-RESOLVE-CONDITION", 3, 0, false);
        declareFunction("incomplete_pph_phrase_p", "INCOMPLETE-PPH-PHRASE-P", 1, 0, false);
        declareFunction("pph_phrase_resolve_indexicals_in_test", "PPH-PHRASE-RESOLVE-INDEXICALS-IN-TEST", 3, 0, false);
        declareFunction("pph_nth_phrase_naut_p", "PPH-NTH-PHRASE-NAUT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_phrase_resolution.$pph_nth_phrase_naut_p$UnaryFunction();
        declareFunction("pph_phrase_resolve_nth_phrases", "PPH-PHRASE-RESOLVE-NTH-PHRASES", 2, 0, false);
        declareFunction("pph_phrase_transform_nth", "PPH-PHRASE-TRANSFORM-NTH", 1, 0, false);
        declareFunction("pph_phrase_set_relative_agr", "PPH-PHRASE-SET-RELATIVE-AGR", 2, 0, false);
        declareFunction("pph_phrase_set_relative_agr_internal", "PPH-PHRASE-SET-RELATIVE-AGR-INTERNAL", 2, 0, false);
        declareFunction("pph_phrase_resolve_string", "PPH-PHRASE-RESOLVE-STRING", 2, 0, false);
        declareFunction("anaphor_needed_for_phraseP", "ANAPHOR-NEEDED-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_category_ok_for_anaphorP", "PPH-CATEGORY-OK-FOR-ANAPHOR?", 1, 0, false);
        declareFunction("reflexive_needed_for_phraseP", "REFLEXIVE-NEEDED-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_source_pos", "PPH-PHRASE-SOURCE-POS", 1, 1, false);
        declareFunction("pph_phrase_set_source_pos", "PPH-PHRASE-SET-SOURCE-POS", 2, 0, false);
        declareFunction("pph_phrase_replace_generic_args", "PPH-PHRASE-REPLACE-GENERIC-ARGS", 2, 1, false);
        declareFunction("pph_phrase_sanity_check_arg_position_map", "PPH-PHRASE-SANITY-CHECK-ARG-POSITION-MAP", 3, 0, false);
        declareFunction("sanity_check_arg_position_map", "SANITY-CHECK-ARG-POSITION-MAP", 4, 0, false);
        declareFunction("sanity_check_one_arg_position_map", "SANITY-CHECK-ONE-ARG-POSITION-MAP", 4, 0, false);
        declareFunction("sanity_check_one_arg_position_mapping", "SANITY-CHECK-ONE-ARG-POSITION-MAPPING", 6, 0, false);
        declareFunction("pph_phrase_replace_generic_args_top_level", "PPH-PHRASE-REPLACE-GENERIC-ARGS-TOP-LEVEL", 3, 0, false);
        declareFunction("pph_phrase_update_generic_args_in_conditional_test", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-CONDITIONAL-TEST", 2, 0, false);
        declareFunction("pph_phrase_update_generic_args_in_variable_binding_query", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-VARIABLE-BINDING-QUERY", 2, 0, false);
        declareFunction("pph_phrase_replace_generic_arg_simple", "PPH-PHRASE-REPLACE-GENERIC-ARG-SIMPLE", 4, 0, false);
        declareFunction("pph_kept_generic_arg_phrase_p", "PPH-KEPT-GENERIC-ARG-PHRASE-P", 1, 0, false);
        declareFunction("pph_phrase_ok_for_arg0P", "PPH-PHRASE-OK-FOR-ARG0?", 1, 0, false);
        declareFunction("pph_phrase_replace_generic_args_recursive", "PPH-PHRASE-REPLACE-GENERIC-ARGS-RECURSIVE", 3, 0, false);
        declareFunction("pph_phrase_reserve_matrix_arg0_cycl", "PPH-PHRASE-RESERVE-MATRIX-ARG0-CYCL", 1, 0, false);
        declareFunction("pph_phrase_reset_arg0_reservations", "PPH-PHRASE-RESET-ARG0-RESERVATIONS", 4, 0, false);
        declareFunction("pph_phrase_reset_arg0_reservations_int", "PPH-PHRASE-RESET-ARG0-RESERVATIONS-INT", 4, 0, false);
        declareFunction("pph_phrase_reserve_arg0", "PPH-PHRASE-RESERVE-ARG0", 3, 0, false);
        declareFunction("pph_phrase_reserved_arg0", "PPH-PHRASE-RESERVED-ARG0", 1, 0, false);
        declareFunction("pph_phrase_reserved_arg0_low", "PPH-PHRASE-RESERVED-ARG0-LOW", 1, 0, false);
        declareFunction("pph_phrase_reserved_arg0_position", "PPH-PHRASE-RESERVED-ARG0-POSITION", 1, 0, false);
        declareFunction("pph_phrase_reserved_for_arg0_p", "PPH-PHRASE-RESERVED-FOR-ARG0-P", 1, 0, false);
        declareFunction("pph_chemical_formula_from_lists_phrase_get_string", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-GET-STRING", 1, 0, false);
        declareFunction("pph_output_item_from_atomic_composition_lists", "PPH-OUTPUT-ITEM-FROM-ATOMIC-COMPOSITION-LISTS", 2, 0, false);
        declareFunction("pph_atomic_symbol", "PPH-ATOMIC-SYMBOL", 1, 0, false);
        declareFunction("pph_symbol_phrase_get_string", "PPH-SYMBOL-PHRASE-GET-STRING", 1, 0, false);
        declareFunction("pph_symbol_string", "PPH-SYMBOL-STRING", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_sentential_force", "PPH-PHRASE-OUTPUT-LIST-ADD-SENTENTIAL-FORCE", 2, 0, false);
        declareFunction("pph_phrase_output_list_upcase_leading_smart", "PPH-PHRASE-OUTPUT-LIST-UPCASE-LEADING-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_item_upcase_leading_smart", "PPH-PHRASE-OUTPUT-ITEM-UPCASE-LEADING-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_period_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PERIOD-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_question_mark_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-QUESTION-MARK-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_punctuation_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PUNCTUATION-SMART", 2, 0, false);
        declareFunction("pph_output_list_nonempty_tail", "PPH-OUTPUT-LIST-NONEMPTY-TAIL", 1, 0, false);
        declareFunction("pph_percent_phrase_get_string", "PPH-PERCENT-PHRASE-GET-STRING", 2, 0, false);
        declareFunction("pph_float_precision", "PPH-FLOAT-PRECISION", 1, 0, false);
        declareFunction("pph_coordination_phrase_get_string", "PPH-COORDINATION-PHRASE-GET-STRING", 2, 0, false);
        declareFunction("pph_coordination_phrase_get_string_internal", "PPH-COORDINATION-PHRASE-GET-STRING-INTERNAL", 2, 0, false);
        declareFunction("pph_phrase_agrees_with_no_quantified_phrase_p", "PPH-PHRASE-AGREES-WITH-NO-QUANTIFIED-PHRASE-P", 1, 0, false);
        declareFunction("pph_no_quantified_det_nbar_phrase_p", "PPH-NO-QUANTIFIED-DET-NBAR-PHRASE-P", 1, 0, false);
        declareFunction("pph_coordination_phrase_operator_item", "PPH-COORDINATION-PHRASE-OPERATOR-ITEM", 2, 0, false);
        declareFunction("pph_nbar_coordination_phrase_p", "PPH-NBAR-COORDINATION-PHRASE-P", 1, 0, false);
        declareFunction("pph_nbar_coordination_phrase_distribute_determiner", "PPH-NBAR-COORDINATION-PHRASE-DISTRIBUTE-DETERMINER", 2, 0, false);
        declareFunction("pph_phrase_set_subject_verb_agreement", "PPH-PHRASE-SET-SUBJECT-VERB-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_default_verb_pred", "PPH-PHRASE-DEFAULT-VERB-PRED", 0, 0, false);
        declareFunction("pph_phrase_set_peer_agreement", "PPH-PHRASE-SET-PEER-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_set_tense_agreement", "PPH-PHRASE-SET-TENSE-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_set_clarifying_agreement", "PPH-PHRASE-SET-CLARIFYING-AGREEMENT", 2, 0, false);
        declareFunction("uninformative_paraphrase_p", "UNINFORMATIVE-PARAPHRASE-P", 2, 0, false);
        declareFunction("pph_phrase_agr_target_phrase", "PPH-PHRASE-AGR-TARGET-PHRASE", 1, 1, false);
        declareFunction("pph_phrase_relative_agr_target", "PPH-PHRASE-RELATIVE-AGR-TARGET", 1, 0, false);
        declareFunction("pph_phrase_set_det_nbar_agreement", "PPH-PHRASE-SET-DET-NBAR-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_lexical_head_cycl", "PPH-PHRASE-LEXICAL-HEAD-CYCL", 1, 1, false);
        declareFunction("pph_phrase_dtr_nested_withinP", "PPH-PHRASE-DTR-NESTED-WITHIN?", 2, 0, false);
        declareFunction("pph_phrase_subject_of_clause", "PPH-PHRASE-SUBJECT-OF-CLAUSE", 1, 0, false);
        declareFunction("pph_phrase_subject_domain", "PPH-PHRASE-SUBJECT-DOMAIN", 1, 0, false);
        declareFunction("pph_phrase_find_potential_binders", "PPH-PHRASE-FIND-POTENTIAL-BINDERS", 1, 3, false);
        declareFunction("pph_phrase_find_potential_binders_int", "PPH-PHRASE-FIND-POTENTIAL-BINDERS-INT", 6, 0, false);
        declareFunction("pph_phrase_could_bind_possessive_here", "PPH-PHRASE-COULD-BIND-POSSESSIVE-HERE", 1, 0, false);
        declareFunction("pph_phrase_could_bind_reflexive_here", "PPH-PHRASE-COULD-BIND-REFLEXIVE-HERE", 1, 0, false);
        declareFunction("pph_phrase_english_indefinite_article", "PPH-PHRASE-ENGLISH-INDEFINITE-ARTICLE", 2, 0, false);
        declareFunction("pph_phrase_english_indefinite_np", "PPH-PHRASE-ENGLISH-INDEFINITE-NP", 2, 0, false);
        declareFunction("pph_copular_complementP", "PPH-COPULAR-COMPLEMENT?", 1, 0, false);
        declareFunction("pph_noun_predP", "PPH-NOUN-PRED?", 1, 1, false);
        declareFunction("pph_singular_noun_predP", "PPH-SINGULAR-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_non_singular_noun_predP", "PPH-NON-SINGULAR-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_singular_determiner_string", "PPH-SINGULAR-DETERMINER-STRING", 1, 0, false);
        declareFunction("tense_preds_for_constraints", "TENSE-PREDS-FOR-CONSTRAINTS", 1, 0, false);
        declareFunction("tense_pred_for_constraints", "TENSE-PRED-FOR-CONSTRAINTS", 1, 0, false);
        declareFunction("verb_pred_for_subject_preds", "VERB-PRED-FOR-SUBJECT-PREDS", 1, 0, false);
        declareFunction("verb_preds_for_subject", "VERB-PREDS-FOR-SUBJECT", 1, 1, false);
        declareFunction("verb_pred_for_subject", "VERB-PRED-FOR-SUBJECT", 1, 1, false);
        declareFunction("pph_strengthen_verb_constraints", "PPH-STRENGTHEN-VERB-CONSTRAINTS", 1, 0, false);
        declareFunction("pph_verb_constraints_could_be_present_tenseP", "PPH-VERB-CONSTRAINTS-COULD-BE-PRESENT-TENSE?", 1, 0, false);
        declareFunction("pph_verb_constraints_ensure_present_tense", "PPH-VERB-CONSTRAINTS-ENSURE-PRESENT-TENSE", 1, 0, false);
        declareFunction("pph_remove_weak_verb_constraints", "PPH-REMOVE-WEAK-VERB-CONSTRAINTS", 1, 0, false);
        declareFunction("verb_preds_for_subject_int", "VERB-PREDS-FOR-SUBJECT-INT", 2, 0, false);
        declareFunction("verb_pred_for_subject_int", "VERB-PRED-FOR-SUBJECT-INT", 2, 0, false);
        declareFunction("verb_preds_for_subject_pronoun", "VERB-PREDS-FOR-SUBJECT-PRONOUN", 2, 0, false);
        declareFunction("verb_pred_for_subject_pronoun", "VERB-PRED-FOR-SUBJECT-PRONOUN", 2, 0, false);
        declareFunction("verb_preds_for_subject_preds", "VERB-PREDS-FOR-SUBJECT-PREDS", 1, 1, false);
        declareFunction("verb_pred_for_subject_pred", "VERB-PRED-FOR-SUBJECT-PRED", 1, 1, false);
        declareFunction("pph_finite_verb_predP", "PPH-FINITE-VERB-PRED?", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_phrase_resolution.$pph_finite_verb_predP$UnaryFunction();
        declareFunction("pph_non_plural_noun_predP", "PPH-NON-PLURAL-NOUN-PRED?", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_phrase_resolution.$pph_non_plural_noun_predP$UnaryFunction();
        declareFunction("pph_plural_noun_predP", "PPH-PLURAL-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_plural_verb_predP", "PPH-PLURAL-VERB-PRED?", 1, 0, false);
        declareFunction("pph_singular_verb_preds_for_tenses", "PPH-SINGULAR-VERB-PREDS-FOR-TENSES", 1, 0, false);
        declareFunction("pph_singular_verb_pred_for_tense", "PPH-SINGULAR-VERB-PRED-FOR-TENSE", 1, 0, false);
        declareFunction("pph_plural_verb_preds_for_tenses", "PPH-PLURAL-VERB-PREDS-FOR-TENSES", 1, 0, false);
        declareFunction("pph_plural_verb_pred_for_tense", "PPH-PLURAL-VERB-PRED-FOR-TENSE", 1, 0, false);
        declareFunction("pph_phrase_unify_pos_preds", "PPH-PHRASE-UNIFY-POS-PREDS", 2, 0, false);
        declareFunction("pph_phrase_starts_with_detpP", "PPH-PHRASE-STARTS-WITH-DETP?", 1, 0, false);
        declareFunction("pph_phrase_starts_with_detP", "PPH-PHRASE-STARTS-WITH-DET?", 1, 0, false);
        declareFunction("pph_phrase_determinerP", "PPH-PHRASE-DETERMINER?", 1, 0, false);
        declareFunction("pph_phrase_detpP", "PPH-PHRASE-DETP?", 1, 0, false);
        declareFunction("pph_detp_nart", "PPH-DETP-NART", 0, 0, false);
        declareFunction("clear_pph_detp_nart_cached", "CLEAR-PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("remove_pph_detp_nart_cached", "REMOVE-PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("pph_detp_nart_cached_internal", "PPH-DETP-NART-CACHED-INTERNAL", 0, 0, false);
        declareFunction("pph_detp_nart_cached", "PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("pph_wordify_sem_free_noun", "PPH-WORDIFY-SEM-FREE-NOUN", 1, 0, false);
        declareFunction("pph_wordify_noun", "PPH-WORDIFY-NOUN", 1, 0, false);
        declareFunction("pph_noun_stringP", "PPH-NOUN-STRING?", 1, 0, false);
        declareFunction("pph_phrase_switch_arg1_and_arg2_in_dtrs", "PPH-PHRASE-SWITCH-ARG1-AND-ARG2-IN-DTRS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_pph_phrase_resolution_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("pph_note_unfinished_phrase", "PPH-NOTE-UNFINISHED-PHRASE", 1, 1, false);
            declareFunction("pph_phrase_note_unfinished_dtrs", "PPH-PHRASE-NOTE-UNFINISHED-DTRS", 1, 0, false);
            declareFunction("pph_phrase_get_string", "PPH-PHRASE-GET-STRING", 1, 2, false);
            declareFunction("pph_quoted_phrase_get_string", "PPH-QUOTED-PHRASE-GET-STRING", 2, 0, false);
            declareFunction("pph_nospace_phrase_get_string", "PPH-NOSPACE-PHRASE-GET-STRING", 3, 0, false);
            declareFunction("pph_phrase_maybe_throw_hl_supports", "PPH-PHRASE-MAYBE-THROW-HL-SUPPORTS", 1, 0, false);
            declareFunction("maybe_throw_pph_hl_supports", "MAYBE-THROW-PPH-HL-SUPPORTS", 4, 0, false);
            declareFunction("pph_nospace_phrase_output_list_from_dtr", "PPH-NOSPACE-PHRASE-OUTPUT-LIST-FROM-DTR", 1, 0, false);
            declareFunction("pph_phrase_get_string_from_dtrs", "PPH-PHRASE-GET-STRING-FROM-DTRS", 2, 0, false);
            declareFunction("pph_phrase_try_to_resolve_dtr_strings", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRINGS", 2, 0, false);
            declareFunction("pph_phrase_resolve_repeated_phrase_dtrs", "PPH-PHRASE-RESOLVE-REPEATED-PHRASE-DTRS", 2, 0, false);
            declareFunction("pph_repeated_phrase_expansion", "PPH-REPEATED-PHRASE-EXPANSION", 2, 0, false);
            declareFunction("pph_repeated_phrase_expansion_internal", "PPH-REPEATED-PHRASE-EXPANSION-INTERNAL", 3, 0, false);
            declareFunction("pph_one_repeated_phrase", "PPH-ONE-REPEATED-PHRASE", 4, 0, false);
            declareFunction("pph_generic_arg_sequence", "PPH-GENERIC-ARG-SEQUENCE", 2, 0, false);
            declareFunction("pph_current_list_item", "PPH-CURRENT-LIST-ITEM", 2, 0, false);
            declareFunction("pph_lookup_current_list_item", "PPH-LOOKUP-CURRENT-LIST-ITEM", 1, 0, false);
            declareFunction("pph_extensional_list_p", "PPH-EXTENSIONAL-LIST-P", 1, 0, false);
            declareFunction("pph_phrase_resolve_current_list_items", "PPH-PHRASE-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
            declareFunction("pph_resolve_current_list_items", "PPH-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
            declareFunction("pph_current_list_item_formula_p", "PPH-CURRENT-LIST-ITEM-FORMULA-P", 1, 0, false);
            new pph_phrase_resolution.$pph_current_list_item_formula_p$UnaryFunction();
            declareFunction("pph_current_list_item_formula_item", "PPH-CURRENT-LIST-ITEM-FORMULA-ITEM", 1, 0, false);
            declareFunction("pph_repeated_phrase_increment", "PPH-REPEATED-PHRASE-INCREMENT", 0, 0, false);
            declareFunction("pph_phrase_try_to_resolve_dtr_string", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRING", 4, 0, false);
            declareFunction("pph_phrase_resolve_clarifying_dtr", "PPH-PHRASE-RESOLVE-CLARIFYING-DTR", 4, 0, false);
            declareFunction("pph_note_phraseXdtr_agr", "PPH-NOTE-PHRASE&DTR-AGR", 3, 0, false);
            declareFunction("pph_phrase_set_dtr_relative_agr", "PPH-PHRASE-SET-DTR-RELATIVE-AGR", 3, 0, false);
            declareFunction("pph_phrase_resolve_dtr", "PPH-PHRASE-RESOLVE-DTR", 4, 0, false);
            declareFunction("pph_phrase_set_arg0_items", "PPH-PHRASE-SET-ARG0-ITEMS", 1, 1, false);
            declareFunction("pph_phrase_maybe_make_arg0_item", "PPH-PHRASE-MAYBE-MAKE-ARG0-ITEM", 1, 1, false);
            declareFunction("pph_phrase_make_arg0_item", "PPH-PHRASE-MAKE-ARG0-ITEM", 3, 0, false);
            declareFunction("pph_phrase_independent_phraseP", "PPH-PHRASE-INDEPENDENT-PHRASE?", 1, 0, false);
            declareFunction("pph_phrase_agr_target_resolvedP", "PPH-PHRASE-AGR-TARGET-RESOLVED?", 2, 1, false);
            declareFunction("pph_phrase_set_output_list_from_finished_dtrs", "PPH-PHRASE-SET-OUTPUT-LIST-FROM-FINISHED-DTRS", 1, 0, false);
            declareFunction("pph_phrase_output_item_empty_p", "PPH-PHRASE-OUTPUT-ITEM-EMPTY-P", 1, 0, false);
            new pph_phrase_resolution.$pph_phrase_output_item_empty_p$UnaryFunction();
            declareFunction("pph_phrase_arg0_item", "PPH-PHRASE-ARG0-ITEM", 2, 1, false);
            declareFunction("reverse_string_list_term_anchor", "REVERSE-STRING-LIST-TERM-ANCHOR", 2, 0, false);
            declareFunction("pph_phrase_arg_dtrs", "PPH-PHRASE-ARG-DTRS", 1, 0, false);
            declareFunction("pph_phrase_arg_phraseP", "PPH-PHRASE-ARG-PHRASE?", 1, 0, false);
            declareFunction("pph_phrase_arg0_phraseP", "PPH-PHRASE-ARG0-PHRASE?", 1, 0, false);
            declareFunction("pph_phrase_resolve_condition", "PPH-PHRASE-RESOLVE-CONDITION", 3, 0, false);
            declareFunction("incomplete_pph_phrase_p", "INCOMPLETE-PPH-PHRASE-P", 1, 0, false);
            declareFunction("pph_phrase_resolve_indexicals_in_test", "PPH-PHRASE-RESOLVE-INDEXICALS-IN-TEST", 3, 0, false);
            declareFunction("pph_nth_phrase_naut_p", "PPH-NTH-PHRASE-NAUT-P", 1, 0, false);
            new pph_phrase_resolution.$pph_nth_phrase_naut_p$UnaryFunction();
            declareFunction("pph_phrase_resolve_nth_phrases", "PPH-PHRASE-RESOLVE-NTH-PHRASES", 2, 0, false);
            declareFunction("pph_phrase_transform_nth", "PPH-PHRASE-TRANSFORM-NTH", 1, 0, false);
            declareFunction("pph_phrase_set_relative_agr", "PPH-PHRASE-SET-RELATIVE-AGR", 2, 0, false);
            declareFunction("pph_phrase_set_relative_agr_internal", "PPH-PHRASE-SET-RELATIVE-AGR-INTERNAL", 2, 0, false);
            declareFunction("pph_phrase_resolve_string", "PPH-PHRASE-RESOLVE-STRING", 2, 0, false);
            declareFunction("anaphor_needed_for_phraseP", "ANAPHOR-NEEDED-FOR-PHRASE?", 1, 0, false);
            declareFunction("pph_category_ok_for_anaphorP", "PPH-CATEGORY-OK-FOR-ANAPHOR?", 1, 0, false);
            declareFunction("reflexive_needed_for_phraseP", "REFLEXIVE-NEEDED-FOR-PHRASE?", 1, 0, false);
            declareFunction("pph_phrase_source_pos", "PPH-PHRASE-SOURCE-POS", 1, 1, false);
            declareFunction("pph_phrase_set_source_pos", "PPH-PHRASE-SET-SOURCE-POS", 2, 0, false);
            declareFunction("pph_phrase_replace_generic_args", "PPH-PHRASE-REPLACE-GENERIC-ARGS", 2, 1, false);
            declareFunction("pph_phrase_replace_generic_args_top_level", "PPH-PHRASE-REPLACE-GENERIC-ARGS-TOP-LEVEL", 3, 0, false);
            declareFunction("pph_phrase_update_generic_args_in_conditional_test", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-CONDITIONAL-TEST", 2, 0, false);
            declareFunction("pph_phrase_update_generic_args_in_variable_binding_query", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-VARIABLE-BINDING-QUERY", 2, 0, false);
            declareFunction("pph_phrase_replace_generic_arg_simple", "PPH-PHRASE-REPLACE-GENERIC-ARG-SIMPLE", 4, 0, false);
            declareFunction("pph_kept_generic_arg_phrase_p", "PPH-KEPT-GENERIC-ARG-PHRASE-P", 1, 0, false);
            declareFunction("pph_phrase_ok_for_arg0P", "PPH-PHRASE-OK-FOR-ARG0?", 1, 0, false);
            declareFunction("pph_phrase_replace_generic_args_recursive", "PPH-PHRASE-REPLACE-GENERIC-ARGS-RECURSIVE", 3, 0, false);
            declareFunction("pph_phrase_reserve_matrix_arg0_cycl", "PPH-PHRASE-RESERVE-MATRIX-ARG0-CYCL", 1, 0, false);
            declareFunction("pph_phrase_reset_arg0_reservations", "PPH-PHRASE-RESET-ARG0-RESERVATIONS", 4, 0, false);
            declareFunction("pph_phrase_reset_arg0_reservations_int", "PPH-PHRASE-RESET-ARG0-RESERVATIONS-INT", 4, 0, false);
            declareFunction("pph_phrase_reserve_arg0", "PPH-PHRASE-RESERVE-ARG0", 3, 0, false);
            declareFunction("pph_phrase_reserved_arg0", "PPH-PHRASE-RESERVED-ARG0", 1, 0, false);
            declareFunction("pph_phrase_reserved_arg0_low", "PPH-PHRASE-RESERVED-ARG0-LOW", 1, 0, false);
            declareFunction("pph_phrase_reserved_arg0_position", "PPH-PHRASE-RESERVED-ARG0-POSITION", 1, 0, false);
            declareFunction("pph_phrase_reserved_for_arg0_p", "PPH-PHRASE-RESERVED-FOR-ARG0-P", 1, 0, false);
            declareFunction("pph_chemical_formula_from_lists_phrase_get_string", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-GET-STRING", 1, 0, false);
            declareFunction("pph_output_item_from_atomic_composition_lists", "PPH-OUTPUT-ITEM-FROM-ATOMIC-COMPOSITION-LISTS", 2, 0, false);
            declareFunction("pph_atomic_symbol", "PPH-ATOMIC-SYMBOL", 1, 0, false);
            declareFunction("pph_symbol_phrase_get_string", "PPH-SYMBOL-PHRASE-GET-STRING", 1, 0, false);
            declareFunction("pph_symbol_string", "PPH-SYMBOL-STRING", 1, 0, false);
            declareFunction("pph_phrase_output_list_add_sentential_force", "PPH-PHRASE-OUTPUT-LIST-ADD-SENTENTIAL-FORCE", 2, 0, false);
            declareFunction("pph_phrase_add_sentential_force", "PPH-PHRASE-ADD-SENTENTIAL-FORCE", 2, 0, false);
            declareFunction("pph_string_add_sentence_initial_force", "PPH-STRING-ADD-SENTENCE-INITIAL-FORCE", 2, 0, false);
            declareFunction("pph_string_add_sentence_final_force", "PPH-STRING-ADD-SENTENCE-FINAL-FORCE", 2, 0, false);
            declareFunction("pph_phrase_output_list_has_sentential_forceP", "PPH-PHRASE-OUTPUT-LIST-HAS-SENTENTIAL-FORCE?", 2, 0, false);
            declareFunction("pph_string_has_sentential_forceP", "PPH-STRING-HAS-SENTENTIAL-FORCE?", 2, 0, false);
            declareFunction("pph_string_has_sentence_initial_forceP", "PPH-STRING-HAS-SENTENCE-INITIAL-FORCE?", 2, 0, false);
            declareFunction("pph_string_has_sentence_final_forceP", "PPH-STRING-HAS-SENTENCE-FINAL-FORCE?", 2, 0, false);
            declareFunction("pph_phrase_output_list_upcase_leading_smart", "PPH-PHRASE-OUTPUT-LIST-UPCASE-LEADING-SMART", 1, 0, false);
            declareFunction("pph_phrase_output_item_upcase_leading_smart", "PPH-PHRASE-OUTPUT-ITEM-UPCASE-LEADING-SMART", 1, 0, false);
            declareFunction("upcased_leading_smartP", "UPCASED-LEADING-SMART?", 1, 0, false);
            declareFunction("ends_with_period_smartP", "ENDS-WITH-PERIOD-SMART?", 1, 0, false);
            declareFunction("ends_with_question_mark_smartP", "ENDS-WITH-QUESTION-MARK-SMART?", 1, 0, false);
            declareFunction("ends_with_punctuation_smartP", "ENDS-WITH-PUNCTUATION-SMART?", 2, 0, false);
            declareFunction("pph_phrase_output_list_add_period_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PERIOD-SMART", 1, 0, false);
            declareFunction("pph_phrase_output_list_add_question_mark_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-QUESTION-MARK-SMART", 1, 0, false);
            declareFunction("pph_phrase_output_list_add_punctuation_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PUNCTUATION-SMART", 2, 0, false);
            declareFunction("pph_string_add_punctuation_smart", "PPH-STRING-ADD-PUNCTUATION-SMART", 2, 0, false);
            declareFunction("pph_output_list_nonempty_tail", "PPH-OUTPUT-LIST-NONEMPTY-TAIL", 1, 0, false);
            declareFunction("pph_percent_phrase_get_string", "PPH-PERCENT-PHRASE-GET-STRING", 2, 0, false);
            declareFunction("pph_float_precision", "PPH-FLOAT-PRECISION", 1, 0, false);
            declareFunction("pph_coordination_phrase_get_string", "PPH-COORDINATION-PHRASE-GET-STRING", 2, 0, false);
            declareFunction("pph_coordination_phrase_get_string_internal", "PPH-COORDINATION-PHRASE-GET-STRING-INTERNAL", 2, 0, false);
            declareFunction("find_dtr_olist_in_olist", "FIND-DTR-OLIST-IN-OLIST", 3, 0, false);
            declareFunction("pph_phrase_agrees_with_no_quantified_phrase_p", "PPH-PHRASE-AGREES-WITH-NO-QUANTIFIED-PHRASE-P", 1, 0, false);
            declareFunction("pph_no_quantified_det_nbar_phrase_p", "PPH-NO-QUANTIFIED-DET-NBAR-PHRASE-P", 1, 0, false);
            declareFunction("pph_coordination_phrase_operator_item", "PPH-COORDINATION-PHRASE-OPERATOR-ITEM", 2, 0, false);
            declareFunction("pph_nbar_coordination_phrase_p", "PPH-NBAR-COORDINATION-PHRASE-P", 1, 0, false);
            declareFunction("pph_nbar_coordination_phrase_distribute_determiner", "PPH-NBAR-COORDINATION-PHRASE-DISTRIBUTE-DETERMINER", 2, 0, false);
            declareFunction("pph_phrase_set_subject_verb_agreement", "PPH-PHRASE-SET-SUBJECT-VERB-AGREEMENT", 2, 0, false);
            declareFunction("pph_phrase_default_verb_pred", "PPH-PHRASE-DEFAULT-VERB-PRED", 0, 0, false);
            declareFunction("pph_phrase_set_peer_agreement", "PPH-PHRASE-SET-PEER-AGREEMENT", 2, 0, false);
            declareFunction("pph_phrase_set_tense_agreement", "PPH-PHRASE-SET-TENSE-AGREEMENT", 2, 0, false);
            declareFunction("pph_phrase_set_clarifying_agreement", "PPH-PHRASE-SET-CLARIFYING-AGREEMENT", 2, 0, false);
            declareFunction("uninformative_paraphrase_p", "UNINFORMATIVE-PARAPHRASE-P", 2, 0, false);
            declareFunction("pph_phrase_agr_target_phrase", "PPH-PHRASE-AGR-TARGET-PHRASE", 1, 1, false);
            declareFunction("pph_phrase_relative_agr_target", "PPH-PHRASE-RELATIVE-AGR-TARGET", 1, 0, false);
            declareFunction("pph_phrase_set_det_nbar_agreement", "PPH-PHRASE-SET-DET-NBAR-AGREEMENT", 2, 0, false);
            declareFunction("pph_phrase_lexical_head_cycl", "PPH-PHRASE-LEXICAL-HEAD-CYCL", 1, 1, false);
            declareFunction("pph_phrase_dtr_nested_withinP", "PPH-PHRASE-DTR-NESTED-WITHIN?", 2, 0, false);
            declareFunction("pph_phrase_subject_of_clause", "PPH-PHRASE-SUBJECT-OF-CLAUSE", 1, 0, false);
            declareFunction("pph_phrase_subject_domain", "PPH-PHRASE-SUBJECT-DOMAIN", 1, 0, false);
            declareFunction("pph_phrase_find_potential_binders", "PPH-PHRASE-FIND-POTENTIAL-BINDERS", 1, 3, false);
            declareFunction("pph_phrase_find_potential_binders_int", "PPH-PHRASE-FIND-POTENTIAL-BINDERS-INT", 6, 0, false);
            declareFunction("pph_phrase_could_bind_possessive_here", "PPH-PHRASE-COULD-BIND-POSSESSIVE-HERE", 1, 0, false);
            declareFunction("pph_phrase_could_bind_reflexive_here", "PPH-PHRASE-COULD-BIND-REFLEXIVE-HERE", 1, 0, false);
            declareFunction("pph_phrase_english_indefinite_article", "PPH-PHRASE-ENGLISH-INDEFINITE-ARTICLE", 2, 0, false);
            declareFunction("pph_phrase_english_indefinite_np", "PPH-PHRASE-ENGLISH-INDEFINITE-NP", 2, 0, false);
            declareFunction("pph_copular_complementP", "PPH-COPULAR-COMPLEMENT?", 1, 0, false);
            declareFunction("pph_noun_predP", "PPH-NOUN-PRED?", 1, 1, false);
            declareFunction("pph_singular_noun_predP", "PPH-SINGULAR-NOUN-PRED?", 1, 0, false);
            declareFunction("pph_non_singular_noun_predP", "PPH-NON-SINGULAR-NOUN-PRED?", 1, 0, false);
            declareFunction("pph_singular_determiner_string", "PPH-SINGULAR-DETERMINER-STRING", 1, 0, false);
            declareFunction("tense_preds_for_constraints", "TENSE-PREDS-FOR-CONSTRAINTS", 1, 0, false);
            declareFunction("tense_pred_for_constraints", "TENSE-PRED-FOR-CONSTRAINTS", 1, 0, false);
            declareFunction("verb_pred_for_subject_preds", "VERB-PRED-FOR-SUBJECT-PREDS", 1, 0, false);
            declareFunction("verb_preds_for_subject", "VERB-PREDS-FOR-SUBJECT", 1, 1, false);
            declareFunction("verb_pred_for_subject", "VERB-PRED-FOR-SUBJECT", 1, 1, false);
            declareFunction("pph_strengthen_verb_constraints", "PPH-STRENGTHEN-VERB-CONSTRAINTS", 1, 0, false);
            declareFunction("pph_verb_constraints_could_be_present_tenseP", "PPH-VERB-CONSTRAINTS-COULD-BE-PRESENT-TENSE?", 1, 0, false);
            declareFunction("pph_verb_constraints_ensure_present_tense", "PPH-VERB-CONSTRAINTS-ENSURE-PRESENT-TENSE", 1, 0, false);
            declareFunction("pph_remove_weak_verb_constraints", "PPH-REMOVE-WEAK-VERB-CONSTRAINTS", 1, 0, false);
            declareFunction("verb_preds_for_subject_int", "VERB-PREDS-FOR-SUBJECT-INT", 2, 0, false);
            declareFunction("verb_pred_for_subject_int", "VERB-PRED-FOR-SUBJECT-INT", 2, 0, false);
            declareFunction("verb_preds_for_subject_pronoun", "VERB-PREDS-FOR-SUBJECT-PRONOUN", 2, 0, false);
            declareFunction("verb_pred_for_subject_pronoun", "VERB-PRED-FOR-SUBJECT-PRONOUN", 2, 0, false);
            declareFunction("verb_preds_for_subject_preds", "VERB-PREDS-FOR-SUBJECT-PREDS", 1, 1, false);
            declareFunction("verb_pred_for_subject_pred", "VERB-PRED-FOR-SUBJECT-PRED", 1, 1, false);
            declareFunction("pph_finite_verb_predP", "PPH-FINITE-VERB-PRED?", 1, 0, false);
            new pph_phrase_resolution.$pph_finite_verb_predP$UnaryFunction();
            declareFunction("pph_non_plural_noun_predP", "PPH-NON-PLURAL-NOUN-PRED?", 1, 0, false);
            new pph_phrase_resolution.$pph_non_plural_noun_predP$UnaryFunction();
            declareFunction("pph_plural_noun_predP", "PPH-PLURAL-NOUN-PRED?", 1, 0, false);
            declareFunction("pph_plural_verb_predP", "PPH-PLURAL-VERB-PRED?", 1, 0, false);
            declareFunction("pph_singular_verb_preds_for_tenses", "PPH-SINGULAR-VERB-PREDS-FOR-TENSES", 1, 0, false);
            declareFunction("pph_singular_verb_pred_for_tense", "PPH-SINGULAR-VERB-PRED-FOR-TENSE", 1, 0, false);
            declareFunction("pph_plural_verb_preds_for_tenses", "PPH-PLURAL-VERB-PREDS-FOR-TENSES", 1, 0, false);
            declareFunction("pph_plural_verb_pred_for_tense", "PPH-PLURAL-VERB-PRED-FOR-TENSE", 1, 0, false);
            declareFunction("pph_phrase_unify_pos_preds", "PPH-PHRASE-UNIFY-POS-PREDS", 2, 0, false);
            declareFunction("pph_phrase_starts_with_detpP", "PPH-PHRASE-STARTS-WITH-DETP?", 1, 0, false);
            declareFunction("pph_phrase_starts_with_detP", "PPH-PHRASE-STARTS-WITH-DET?", 1, 0, false);
            declareFunction("pph_phrase_determinerP", "PPH-PHRASE-DETERMINER?", 1, 0, false);
            declareFunction("pph_phrase_detpP", "PPH-PHRASE-DETP?", 1, 0, false);
            declareFunction("pph_detp_nart", "PPH-DETP-NART", 0, 0, false);
            declareFunction("clear_pph_detp_nart_cached", "CLEAR-PPH-DETP-NART-CACHED", 0, 0, false);
            declareFunction("remove_pph_detp_nart_cached", "REMOVE-PPH-DETP-NART-CACHED", 0, 0, false);
            declareFunction("pph_detp_nart_cached_internal", "PPH-DETP-NART-CACHED-INTERNAL", 0, 0, false);
            declareFunction("pph_detp_nart_cached", "PPH-DETP-NART-CACHED", 0, 0, false);
            declareFunction("pph_wordify_sem_free_noun", "PPH-WORDIFY-SEM-FREE-NOUN", 1, 0, false);
            declareFunction("pph_wordify_noun", "PPH-WORDIFY-NOUN", 1, 0, false);
            declareFunction("pph_noun_stringP", "PPH-NOUN-STRING?", 1, 0, false);
            declareFunction("pph_phrase_switch_arg1_and_arg2_in_dtrs", "PPH-PHRASE-SWITCH-ARG1-AND-ARG2-IN-DTRS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("pph_phrase_maybe_recompute_mothers_output_list_from_dtrs", "PPH-PHRASE-MAYBE-RECOMPUTE-MOTHERS-OUTPUT-LIST-FROM-DTRS", 1, 0, false);
            declareFunction("pph_phrase_recompute_output_list_from_dtrs", "PPH-PHRASE-RECOMPUTE-OUTPUT-LIST-FROM-DTRS", 1, 0, false);
            declareFunction("pph_phrase_sanity_check_arg_position_map", "PPH-PHRASE-SANITY-CHECK-ARG-POSITION-MAP", 3, 0, false);
            declareFunction("sanity_check_arg_position_map", "SANITY-CHECK-ARG-POSITION-MAP", 4, 0, false);
            declareFunction("sanity_check_one_arg_position_map", "SANITY-CHECK-ONE-ARG-POSITION-MAP", 4, 0, false);
            declareFunction("sanity_check_one_arg_position_mapping", "SANITY-CHECK-ONE-ARG-POSITION-MAPPING", 6, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_pph_phrase_resolution_file_Previous() {
        declareFunction("pph_note_unfinished_phrase", "PPH-NOTE-UNFINISHED-PHRASE", 1, 1, false);
        declareFunction("pph_phrase_note_unfinished_dtrs", "PPH-PHRASE-NOTE-UNFINISHED-DTRS", 1, 0, false);
        declareFunction("pph_phrase_get_string", "PPH-PHRASE-GET-STRING", 1, 2, false);
        declareFunction("pph_quoted_phrase_get_string", "PPH-QUOTED-PHRASE-GET-STRING", 2, 0, false);
        declareFunction("pph_nospace_phrase_get_string", "PPH-NOSPACE-PHRASE-GET-STRING", 3, 0, false);
        declareFunction("pph_phrase_maybe_throw_hl_supports", "PPH-PHRASE-MAYBE-THROW-HL-SUPPORTS", 1, 0, false);
        declareFunction("maybe_throw_pph_hl_supports", "MAYBE-THROW-PPH-HL-SUPPORTS", 4, 0, false);
        declareFunction("pph_nospace_phrase_output_list_from_dtr", "PPH-NOSPACE-PHRASE-OUTPUT-LIST-FROM-DTR", 1, 0, false);
        declareFunction("pph_phrase_get_string_from_dtrs", "PPH-PHRASE-GET-STRING-FROM-DTRS", 2, 0, false);
        declareFunction("pph_phrase_try_to_resolve_dtr_strings", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRINGS", 2, 0, false);
        declareFunction("pph_phrase_resolve_repeated_phrase_dtrs", "PPH-PHRASE-RESOLVE-REPEATED-PHRASE-DTRS", 2, 0, false);
        declareFunction("pph_repeated_phrase_expansion", "PPH-REPEATED-PHRASE-EXPANSION", 2, 0, false);
        declareFunction("pph_repeated_phrase_expansion_internal", "PPH-REPEATED-PHRASE-EXPANSION-INTERNAL", 3, 0, false);
        declareFunction("pph_one_repeated_phrase", "PPH-ONE-REPEATED-PHRASE", 4, 0, false);
        declareFunction("pph_generic_arg_sequence", "PPH-GENERIC-ARG-SEQUENCE", 2, 0, false);
        declareFunction("pph_current_list_item", "PPH-CURRENT-LIST-ITEM", 2, 0, false);
        declareFunction("pph_lookup_current_list_item", "PPH-LOOKUP-CURRENT-LIST-ITEM", 1, 0, false);
        declareFunction("pph_extensional_list_p", "PPH-EXTENSIONAL-LIST-P", 1, 0, false);
        declareFunction("pph_phrase_resolve_current_list_items", "PPH-PHRASE-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        declareFunction("pph_resolve_current_list_items", "PPH-RESOLVE-CURRENT-LIST-ITEMS", 1, 0, false);
        declareFunction("pph_current_list_item_formula_p", "PPH-CURRENT-LIST-ITEM-FORMULA-P", 1, 0, false);
        new pph_phrase_resolution.$pph_current_list_item_formula_p$UnaryFunction();
        declareFunction("pph_current_list_item_formula_item", "PPH-CURRENT-LIST-ITEM-FORMULA-ITEM", 1, 0, false);
        declareFunction("pph_repeated_phrase_increment", "PPH-REPEATED-PHRASE-INCREMENT", 0, 0, false);
        declareFunction("pph_phrase_try_to_resolve_dtr_string", "PPH-PHRASE-TRY-TO-RESOLVE-DTR-STRING", 4, 0, false);
        declareFunction("pph_phrase_resolve_clarifying_dtr", "PPH-PHRASE-RESOLVE-CLARIFYING-DTR", 4, 0, false);
        declareFunction("pph_note_phraseXdtr_agr", "PPH-NOTE-PHRASE&DTR-AGR", 3, 0, false);
        declareFunction("pph_phrase_set_dtr_relative_agr", "PPH-PHRASE-SET-DTR-RELATIVE-AGR", 3, 0, false);
        declareFunction("pph_phrase_resolve_dtr", "PPH-PHRASE-RESOLVE-DTR", 4, 0, false);
        declareFunction("pph_phrase_set_arg0_items", "PPH-PHRASE-SET-ARG0-ITEMS", 1, 1, false);
        declareFunction("pph_phrase_maybe_make_arg0_item", "PPH-PHRASE-MAYBE-MAKE-ARG0-ITEM", 1, 1, false);
        declareFunction("pph_phrase_make_arg0_item", "PPH-PHRASE-MAKE-ARG0-ITEM", 3, 0, false);
        declareFunction("pph_phrase_independent_phraseP", "PPH-PHRASE-INDEPENDENT-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_agr_target_resolvedP", "PPH-PHRASE-AGR-TARGET-RESOLVED?", 2, 1, false);
        declareFunction("pph_phrase_set_output_list_from_finished_dtrs", "PPH-PHRASE-SET-OUTPUT-LIST-FROM-FINISHED-DTRS", 1, 0, false);
        declareFunction("pph_phrase_output_item_empty_p", "PPH-PHRASE-OUTPUT-ITEM-EMPTY-P", 1, 0, false);
        new pph_phrase_resolution.$pph_phrase_output_item_empty_p$UnaryFunction();
        declareFunction("pph_phrase_arg0_item", "PPH-PHRASE-ARG0-ITEM", 2, 1, false);
        declareFunction("reverse_string_list_term_anchor", "REVERSE-STRING-LIST-TERM-ANCHOR", 2, 0, false);
        declareFunction("pph_phrase_arg_dtrs", "PPH-PHRASE-ARG-DTRS", 1, 0, false);
        declareFunction("pph_phrase_arg_phraseP", "PPH-PHRASE-ARG-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_arg0_phraseP", "PPH-PHRASE-ARG0-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_resolve_condition", "PPH-PHRASE-RESOLVE-CONDITION", 3, 0, false);
        declareFunction("incomplete_pph_phrase_p", "INCOMPLETE-PPH-PHRASE-P", 1, 0, false);
        declareFunction("pph_phrase_resolve_indexicals_in_test", "PPH-PHRASE-RESOLVE-INDEXICALS-IN-TEST", 3, 0, false);
        declareFunction("pph_nth_phrase_naut_p", "PPH-NTH-PHRASE-NAUT-P", 1, 0, false);
        new pph_phrase_resolution.$pph_nth_phrase_naut_p$UnaryFunction();
        declareFunction("pph_phrase_resolve_nth_phrases", "PPH-PHRASE-RESOLVE-NTH-PHRASES", 2, 0, false);
        declareFunction("pph_phrase_transform_nth", "PPH-PHRASE-TRANSFORM-NTH", 1, 0, false);
        declareFunction("pph_phrase_set_relative_agr", "PPH-PHRASE-SET-RELATIVE-AGR", 2, 0, false);
        declareFunction("pph_phrase_set_relative_agr_internal", "PPH-PHRASE-SET-RELATIVE-AGR-INTERNAL", 2, 0, false);
        declareFunction("pph_phrase_resolve_string", "PPH-PHRASE-RESOLVE-STRING", 2, 0, false);
        declareFunction("anaphor_needed_for_phraseP", "ANAPHOR-NEEDED-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_category_ok_for_anaphorP", "PPH-CATEGORY-OK-FOR-ANAPHOR?", 1, 0, false);
        declareFunction("reflexive_needed_for_phraseP", "REFLEXIVE-NEEDED-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_source_pos", "PPH-PHRASE-SOURCE-POS", 1, 1, false);
        declareFunction("pph_phrase_set_source_pos", "PPH-PHRASE-SET-SOURCE-POS", 2, 0, false);
        declareFunction("pph_phrase_replace_generic_args", "PPH-PHRASE-REPLACE-GENERIC-ARGS", 2, 1, false);
        declareFunction("pph_phrase_replace_generic_args_top_level", "PPH-PHRASE-REPLACE-GENERIC-ARGS-TOP-LEVEL", 3, 0, false);
        declareFunction("pph_phrase_update_generic_args_in_conditional_test", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-CONDITIONAL-TEST", 2, 0, false);
        declareFunction("pph_phrase_update_generic_args_in_variable_binding_query", "PPH-PHRASE-UPDATE-GENERIC-ARGS-IN-VARIABLE-BINDING-QUERY", 2, 0, false);
        declareFunction("pph_phrase_replace_generic_arg_simple", "PPH-PHRASE-REPLACE-GENERIC-ARG-SIMPLE", 4, 0, false);
        declareFunction("pph_kept_generic_arg_phrase_p", "PPH-KEPT-GENERIC-ARG-PHRASE-P", 1, 0, false);
        declareFunction("pph_phrase_ok_for_arg0P", "PPH-PHRASE-OK-FOR-ARG0?", 1, 0, false);
        declareFunction("pph_phrase_replace_generic_args_recursive", "PPH-PHRASE-REPLACE-GENERIC-ARGS-RECURSIVE", 3, 0, false);
        declareFunction("pph_phrase_reserve_matrix_arg0_cycl", "PPH-PHRASE-RESERVE-MATRIX-ARG0-CYCL", 1, 0, false);
        declareFunction("pph_phrase_reset_arg0_reservations", "PPH-PHRASE-RESET-ARG0-RESERVATIONS", 4, 0, false);
        declareFunction("pph_phrase_reset_arg0_reservations_int", "PPH-PHRASE-RESET-ARG0-RESERVATIONS-INT", 4, 0, false);
        declareFunction("pph_phrase_reserve_arg0", "PPH-PHRASE-RESERVE-ARG0", 3, 0, false);
        declareFunction("pph_phrase_reserved_arg0", "PPH-PHRASE-RESERVED-ARG0", 1, 0, false);
        declareFunction("pph_phrase_reserved_arg0_low", "PPH-PHRASE-RESERVED-ARG0-LOW", 1, 0, false);
        declareFunction("pph_phrase_reserved_arg0_position", "PPH-PHRASE-RESERVED-ARG0-POSITION", 1, 0, false);
        declareFunction("pph_phrase_reserved_for_arg0_p", "PPH-PHRASE-RESERVED-FOR-ARG0-P", 1, 0, false);
        declareFunction("pph_chemical_formula_from_lists_phrase_get_string", "PPH-CHEMICAL-FORMULA-FROM-LISTS-PHRASE-GET-STRING", 1, 0, false);
        declareFunction("pph_output_item_from_atomic_composition_lists", "PPH-OUTPUT-ITEM-FROM-ATOMIC-COMPOSITION-LISTS", 2, 0, false);
        declareFunction("pph_atomic_symbol", "PPH-ATOMIC-SYMBOL", 1, 0, false);
        declareFunction("pph_symbol_phrase_get_string", "PPH-SYMBOL-PHRASE-GET-STRING", 1, 0, false);
        declareFunction("pph_symbol_string", "PPH-SYMBOL-STRING", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_sentential_force", "PPH-PHRASE-OUTPUT-LIST-ADD-SENTENTIAL-FORCE", 2, 0, false);
        declareFunction("pph_phrase_add_sentential_force", "PPH-PHRASE-ADD-SENTENTIAL-FORCE", 2, 0, false);
        declareFunction("pph_string_add_sentence_initial_force", "PPH-STRING-ADD-SENTENCE-INITIAL-FORCE", 2, 0, false);
        declareFunction("pph_string_add_sentence_final_force", "PPH-STRING-ADD-SENTENCE-FINAL-FORCE", 2, 0, false);
        declareFunction("pph_phrase_output_list_has_sentential_forceP", "PPH-PHRASE-OUTPUT-LIST-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_has_sentential_forceP", "PPH-STRING-HAS-SENTENTIAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_has_sentence_initial_forceP", "PPH-STRING-HAS-SENTENCE-INITIAL-FORCE?", 2, 0, false);
        declareFunction("pph_string_has_sentence_final_forceP", "PPH-STRING-HAS-SENTENCE-FINAL-FORCE?", 2, 0, false);
        declareFunction("pph_phrase_output_list_upcase_leading_smart", "PPH-PHRASE-OUTPUT-LIST-UPCASE-LEADING-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_item_upcase_leading_smart", "PPH-PHRASE-OUTPUT-ITEM-UPCASE-LEADING-SMART", 1, 0, false);
        declareFunction("upcased_leading_smartP", "UPCASED-LEADING-SMART?", 1, 0, false);
        declareFunction("ends_with_period_smartP", "ENDS-WITH-PERIOD-SMART?", 1, 0, false);
        declareFunction("ends_with_question_mark_smartP", "ENDS-WITH-QUESTION-MARK-SMART?", 1, 0, false);
        declareFunction("ends_with_punctuation_smartP", "ENDS-WITH-PUNCTUATION-SMART?", 2, 0, false);
        declareFunction("pph_phrase_output_list_add_period_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PERIOD-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_question_mark_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-QUESTION-MARK-SMART", 1, 0, false);
        declareFunction("pph_phrase_output_list_add_punctuation_smart", "PPH-PHRASE-OUTPUT-LIST-ADD-PUNCTUATION-SMART", 2, 0, false);
        declareFunction("pph_string_add_punctuation_smart", "PPH-STRING-ADD-PUNCTUATION-SMART", 2, 0, false);
        declareFunction("pph_output_list_nonempty_tail", "PPH-OUTPUT-LIST-NONEMPTY-TAIL", 1, 0, false);
        declareFunction("pph_percent_phrase_get_string", "PPH-PERCENT-PHRASE-GET-STRING", 2, 0, false);
        declareFunction("pph_float_precision", "PPH-FLOAT-PRECISION", 1, 0, false);
        declareFunction("pph_coordination_phrase_get_string", "PPH-COORDINATION-PHRASE-GET-STRING", 2, 0, false);
        declareFunction("pph_coordination_phrase_get_string_internal", "PPH-COORDINATION-PHRASE-GET-STRING-INTERNAL", 2, 0, false);
        declareFunction("find_dtr_olist_in_olist", "FIND-DTR-OLIST-IN-OLIST", 3, 0, false);
        declareFunction("pph_phrase_agrees_with_no_quantified_phrase_p", "PPH-PHRASE-AGREES-WITH-NO-QUANTIFIED-PHRASE-P", 1, 0, false);
        declareFunction("pph_no_quantified_det_nbar_phrase_p", "PPH-NO-QUANTIFIED-DET-NBAR-PHRASE-P", 1, 0, false);
        declareFunction("pph_coordination_phrase_operator_item", "PPH-COORDINATION-PHRASE-OPERATOR-ITEM", 2, 0, false);
        declareFunction("pph_nbar_coordination_phrase_p", "PPH-NBAR-COORDINATION-PHRASE-P", 1, 0, false);
        declareFunction("pph_nbar_coordination_phrase_distribute_determiner", "PPH-NBAR-COORDINATION-PHRASE-DISTRIBUTE-DETERMINER", 2, 0, false);
        declareFunction("pph_phrase_set_subject_verb_agreement", "PPH-PHRASE-SET-SUBJECT-VERB-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_default_verb_pred", "PPH-PHRASE-DEFAULT-VERB-PRED", 0, 0, false);
        declareFunction("pph_phrase_set_peer_agreement", "PPH-PHRASE-SET-PEER-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_set_tense_agreement", "PPH-PHRASE-SET-TENSE-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_set_clarifying_agreement", "PPH-PHRASE-SET-CLARIFYING-AGREEMENT", 2, 0, false);
        declareFunction("uninformative_paraphrase_p", "UNINFORMATIVE-PARAPHRASE-P", 2, 0, false);
        declareFunction("pph_phrase_agr_target_phrase", "PPH-PHRASE-AGR-TARGET-PHRASE", 1, 1, false);
        declareFunction("pph_phrase_relative_agr_target", "PPH-PHRASE-RELATIVE-AGR-TARGET", 1, 0, false);
        declareFunction("pph_phrase_set_det_nbar_agreement", "PPH-PHRASE-SET-DET-NBAR-AGREEMENT", 2, 0, false);
        declareFunction("pph_phrase_lexical_head_cycl", "PPH-PHRASE-LEXICAL-HEAD-CYCL", 1, 1, false);
        declareFunction("pph_phrase_dtr_nested_withinP", "PPH-PHRASE-DTR-NESTED-WITHIN?", 2, 0, false);
        declareFunction("pph_phrase_subject_of_clause", "PPH-PHRASE-SUBJECT-OF-CLAUSE", 1, 0, false);
        declareFunction("pph_phrase_subject_domain", "PPH-PHRASE-SUBJECT-DOMAIN", 1, 0, false);
        declareFunction("pph_phrase_find_potential_binders", "PPH-PHRASE-FIND-POTENTIAL-BINDERS", 1, 3, false);
        declareFunction("pph_phrase_find_potential_binders_int", "PPH-PHRASE-FIND-POTENTIAL-BINDERS-INT", 6, 0, false);
        declareFunction("pph_phrase_could_bind_possessive_here", "PPH-PHRASE-COULD-BIND-POSSESSIVE-HERE", 1, 0, false);
        declareFunction("pph_phrase_could_bind_reflexive_here", "PPH-PHRASE-COULD-BIND-REFLEXIVE-HERE", 1, 0, false);
        declareFunction("pph_phrase_english_indefinite_article", "PPH-PHRASE-ENGLISH-INDEFINITE-ARTICLE", 2, 0, false);
        declareFunction("pph_phrase_english_indefinite_np", "PPH-PHRASE-ENGLISH-INDEFINITE-NP", 2, 0, false);
        declareFunction("pph_copular_complementP", "PPH-COPULAR-COMPLEMENT?", 1, 0, false);
        declareFunction("pph_noun_predP", "PPH-NOUN-PRED?", 1, 1, false);
        declareFunction("pph_singular_noun_predP", "PPH-SINGULAR-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_non_singular_noun_predP", "PPH-NON-SINGULAR-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_singular_determiner_string", "PPH-SINGULAR-DETERMINER-STRING", 1, 0, false);
        declareFunction("tense_preds_for_constraints", "TENSE-PREDS-FOR-CONSTRAINTS", 1, 0, false);
        declareFunction("tense_pred_for_constraints", "TENSE-PRED-FOR-CONSTRAINTS", 1, 0, false);
        declareFunction("verb_pred_for_subject_preds", "VERB-PRED-FOR-SUBJECT-PREDS", 1, 0, false);
        declareFunction("verb_preds_for_subject", "VERB-PREDS-FOR-SUBJECT", 1, 1, false);
        declareFunction("verb_pred_for_subject", "VERB-PRED-FOR-SUBJECT", 1, 1, false);
        declareFunction("pph_strengthen_verb_constraints", "PPH-STRENGTHEN-VERB-CONSTRAINTS", 1, 0, false);
        declareFunction("pph_verb_constraints_could_be_present_tenseP", "PPH-VERB-CONSTRAINTS-COULD-BE-PRESENT-TENSE?", 1, 0, false);
        declareFunction("pph_verb_constraints_ensure_present_tense", "PPH-VERB-CONSTRAINTS-ENSURE-PRESENT-TENSE", 1, 0, false);
        declareFunction("pph_remove_weak_verb_constraints", "PPH-REMOVE-WEAK-VERB-CONSTRAINTS", 1, 0, false);
        declareFunction("verb_preds_for_subject_int", "VERB-PREDS-FOR-SUBJECT-INT", 2, 0, false);
        declareFunction("verb_pred_for_subject_int", "VERB-PRED-FOR-SUBJECT-INT", 2, 0, false);
        declareFunction("verb_preds_for_subject_pronoun", "VERB-PREDS-FOR-SUBJECT-PRONOUN", 2, 0, false);
        declareFunction("verb_pred_for_subject_pronoun", "VERB-PRED-FOR-SUBJECT-PRONOUN", 2, 0, false);
        declareFunction("verb_preds_for_subject_preds", "VERB-PREDS-FOR-SUBJECT-PREDS", 1, 1, false);
        declareFunction("verb_pred_for_subject_pred", "VERB-PRED-FOR-SUBJECT-PRED", 1, 1, false);
        declareFunction("pph_finite_verb_predP", "PPH-FINITE-VERB-PRED?", 1, 0, false);
        new pph_phrase_resolution.$pph_finite_verb_predP$UnaryFunction();
        declareFunction("pph_non_plural_noun_predP", "PPH-NON-PLURAL-NOUN-PRED?", 1, 0, false);
        new pph_phrase_resolution.$pph_non_plural_noun_predP$UnaryFunction();
        declareFunction("pph_plural_noun_predP", "PPH-PLURAL-NOUN-PRED?", 1, 0, false);
        declareFunction("pph_plural_verb_predP", "PPH-PLURAL-VERB-PRED?", 1, 0, false);
        declareFunction("pph_singular_verb_preds_for_tenses", "PPH-SINGULAR-VERB-PREDS-FOR-TENSES", 1, 0, false);
        declareFunction("pph_singular_verb_pred_for_tense", "PPH-SINGULAR-VERB-PRED-FOR-TENSE", 1, 0, false);
        declareFunction("pph_plural_verb_preds_for_tenses", "PPH-PLURAL-VERB-PREDS-FOR-TENSES", 1, 0, false);
        declareFunction("pph_plural_verb_pred_for_tense", "PPH-PLURAL-VERB-PRED-FOR-TENSE", 1, 0, false);
        declareFunction("pph_phrase_unify_pos_preds", "PPH-PHRASE-UNIFY-POS-PREDS", 2, 0, false);
        declareFunction("pph_phrase_starts_with_detpP", "PPH-PHRASE-STARTS-WITH-DETP?", 1, 0, false);
        declareFunction("pph_phrase_starts_with_detP", "PPH-PHRASE-STARTS-WITH-DET?", 1, 0, false);
        declareFunction("pph_phrase_determinerP", "PPH-PHRASE-DETERMINER?", 1, 0, false);
        declareFunction("pph_phrase_detpP", "PPH-PHRASE-DETP?", 1, 0, false);
        declareFunction("pph_detp_nart", "PPH-DETP-NART", 0, 0, false);
        declareFunction("clear_pph_detp_nart_cached", "CLEAR-PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("remove_pph_detp_nart_cached", "REMOVE-PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("pph_detp_nart_cached_internal", "PPH-DETP-NART-CACHED-INTERNAL", 0, 0, false);
        declareFunction("pph_detp_nart_cached", "PPH-DETP-NART-CACHED", 0, 0, false);
        declareFunction("pph_wordify_sem_free_noun", "PPH-WORDIFY-SEM-FREE-NOUN", 1, 0, false);
        declareFunction("pph_wordify_noun", "PPH-WORDIFY-NOUN", 1, 0, false);
        declareFunction("pph_noun_stringP", "PPH-NOUN-STRING?", 1, 0, false);
        declareFunction("pph_phrase_switch_arg1_and_arg2_in_dtrs", "PPH-PHRASE-SWITCH-ARG1-AND-ARG2-IN-DTRS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_pph_phrase_resolution_file_alt() {
        defparameter("*PPH-PHRASE-GET-STRING-DEPTH*", ZERO_INTEGER);
        defparameter("*PPH-PHRASE-GET-STRING-MAX-DEPTH*", $int$99);
        defparameter("*PPH-REPEATED-PHRASE-LISTS*", NIL);
        defparameter("*PPH-PHRASE-TRANSFORM-NTH-REFERENCE-PHRASE*", NIL);
        defparameter("*PPH-SYMBOL-PHRASE-STACK*", NIL);
        defvar("*PPH-COORDINATION-PHRASE-NESTING*", ZERO_INTEGER);
        defparameter("*PPH-COORDINATION-PHRASE-NESTING-MAX*", TEN_INTEGER);
        deflexical("*PPH-ENGLISH-LEXICAL-INDEFINITES*", $list_alt201);
        deflexical("*PPH-DETP-NART-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_pph_phrase_resolution_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*PPH-PHRASE-GET-STRING-DEPTH*", ZERO_INTEGER);
            defparameter("*PPH-PHRASE-GET-STRING-MAX-DEPTH*", $int$99);
            defparameter("*PPH-REPEATED-PHRASE-LISTS*", NIL);
            defparameter("*PPH-PHRASE-TRANSFORM-NTH-REFERENCE-PHRASE*", NIL);
            defparameter("*PPH-SYMBOL-PHRASE-STACK*", NIL);
            defvar("*PPH-COORDINATION-PHRASE-NESTING*", ZERO_INTEGER);
            defparameter("*PPH-COORDINATION-PHRASE-NESTING-MAX*", TEN_INTEGER);
            deflexical("*PPH-ENGLISH-LEXICAL-INDEFINITES*", $list195);
            deflexical("*PPH-DETP-NART-CACHED-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PPH-ENGLISH-LEXICAL-INDEFINITES*", $list_alt201);
        }
        return NIL;
    }

    public static SubLObject init_pph_phrase_resolution_file_Previous() {
        defparameter("*PPH-PHRASE-GET-STRING-DEPTH*", ZERO_INTEGER);
        defparameter("*PPH-PHRASE-GET-STRING-MAX-DEPTH*", $int$99);
        defparameter("*PPH-REPEATED-PHRASE-LISTS*", NIL);
        defparameter("*PPH-PHRASE-TRANSFORM-NTH-REFERENCE-PHRASE*", NIL);
        defparameter("*PPH-SYMBOL-PHRASE-STACK*", NIL);
        defvar("*PPH-COORDINATION-PHRASE-NESTING*", ZERO_INTEGER);
        defparameter("*PPH-COORDINATION-PHRASE-NESTING-MAX*", TEN_INTEGER);
        deflexical("*PPH-ENGLISH-LEXICAL-INDEFINITES*", $list195);
        deflexical("*PPH-DETP-NART-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_phrase_resolution_file() {
        memoization_state.note_globally_cached_function(PPH_DETP_NART_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_phrase_resolution_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_phrase_resolution_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_phrase_resolution_file();
    }

    static {
    }

    public static final class $pph_current_list_item_formula_p$UnaryFunction extends UnaryFunction {
        public $pph_current_list_item_formula_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-CURRENT-LIST-ITEM-FORMULA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_current_list_item_formula_p(arg1);
        }
    }

    public static final class $pph_phrase_output_item_empty_p$UnaryFunction extends UnaryFunction {
        public $pph_phrase_output_item_empty_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-PHRASE-OUTPUT-ITEM-EMPTY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_phrase_output_item_empty_p(arg1);
        }
    }

    public static final class $pph_nth_phrase_naut_p$UnaryFunction extends UnaryFunction {
        public $pph_nth_phrase_naut_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-NTH-PHRASE-NAUT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_nth_phrase_naut_p(arg1);
        }
    }

    public static final class $pph_finite_verb_predP$UnaryFunction extends UnaryFunction {
        public $pph_finite_verb_predP$UnaryFunction() {
            super(extractFunctionNamed("PPH-FINITE-VERB-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_finite_verb_predP(arg1);
        }
    }

    public static final class $pph_non_plural_noun_predP$UnaryFunction extends UnaryFunction {
        public $pph_non_plural_noun_predP$UnaryFunction() {
            super(extractFunctionNamed("PPH-NON-PLURAL-NOUN-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_non_plural_noun_predP(arg1);
        }
    }

    static private final SubLString $str_alt1$___A__S__ = makeString("~&~A ~S~%");

    static private final SubLString $str_alt5$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt6$__ = makeString(") ");

    static private final SubLString $str_alt7$__Exceeded_PPH_PHRASE_GET_STRING_ = makeString("~&Exceeded PPH-PHRASE-GET-STRING max depth of ~S.~% Phrase: ~S~%");

    static private final SubLString $str_alt8$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt10$__Resolved_conditional_phrase_to_ = makeString("~&Resolved conditional phrase to ~S ~S.");

    static private final SubLString $str_alt11$Tried_to_generating_CycL_phrase_w = makeString("Tried to generating CycL phrase with unknown CycL. Trying again as regular phrase:~% ~S");

    static private final SubLString $str_alt12$Resolved_formerly_CycL_phrase_wit = makeString("Resolved formerly CycL phrase with unknown CycL to ~S");

    static private final SubLString $str_alt13$__Using_CycL_for_object___S___ = makeString("~&Using CycL for object: ~S.~%");

    static private final SubLString $str_alt14$__Doing_anaphor_paraphrase_with_f = makeString("~&Doing anaphor paraphrase with formula ~S.~%");

    static private final SubLString $str_alt15$__Doing_coordination_paraphrase_w = makeString("~&Doing coordination paraphrase with formula ~S.~%");

    static private final SubLString $str_alt16$__Suspending_bullet_use_for____S_ = makeString("~&Suspending bullet use for~% ~S~%");

    static private final SubLString $str_alt17$__Turning_bullet_use_back_on___ = makeString("~&Turning bullet use back on.~%");

    static private final SubLString $str_alt18$__Doing_chemical_formula_from_lis = makeString("~&Doing chemical-formula-from-lists paraphrase.~%");

    static private final SubLString $str_alt19$__Doing_percent_paraphrase___ = makeString("~&Doing percent paraphrase.~%");

    static private final SubLString $str_alt20$__Generating_symbol_paraphrase_of = makeString("~&Generating symbol paraphrase of ~S.~%");

    static private final SubLString $str_alt21$__Using_quoted_string_for_string_ = makeString("~&Using quoted string for string: ~S.~%");

    static private final SubLString $str_alt22$__Using_quoted_paraphrase_for_ter = makeString("~&Using quoted paraphrase for term.~%");

    static private final SubLString $str_alt23$Using__S_for_quoted_paraphrase_of = makeString("Using ~S for quoted paraphrase of ~S");

    static private final SubLString $str_alt24$__Using_nospace_paraphrase_for__S = makeString("~&Using nospace paraphrase for ~S~%");

    static private final SubLString $str_alt25$__Using_terse_paraphrase_for__S__ = makeString("~&Using terse paraphrase for ~S~%");

    static private final SubLString $str_alt26$__Using_precise_paraphrase_for__S = makeString("~&Using precise paraphrase for ~S~%");

    static private final SubLString $str_alt28$__Unknown_cycl_for__S___ = makeString("~&Unknown cycl for ~S.~%");

    static private final SubLString $str_alt29$__Using_precision__S__ = makeString("~&Using precision ~S~%");

    static private final SubLList $list_alt30 = list(makeSymbol("TARGET-TERM"), makeSymbol("TARGET-STRING"), makeSymbol("TARGET-PREDS"));

    static private final SubLString $str_alt34$Couldn_t_resolve_repeated_dtrs_fo = makeString("Couldn't resolve repeated dtrs for ~S");

    static private final SubLString $str_alt35$Starting_dtr_resolution_for_phras = makeString("Starting dtr resolution for phrase ~D");

    static private final SubLString $str_alt36$___D_of__D_daughters_unfinished_ = makeString("~&~D of ~D daughters unfinished.");

    static private final SubLString $str_alt37$Can_t_resolve_mother_due_to_impos = makeString("Can't resolve mother due to impossible dtr:~% ~S");

    static private final SubLString $str_alt38$Finished__S_iteration_s____D_of__ = makeString("Finished ~S iteration(s): ~D of ~D daughters unfinished.");

    static private final SubLString $str_alt39$Couldn_t_finish__S___because_of_u = makeString("Couldn't finish ~S~% because of unfinished dtrs:~% ~S~%");

    static private final SubLString $str_alt41$Problem_expanding_repeated_phrase = makeString("Problem expanding repeated phrase~% ~S");

    private static final SubLSymbol PPH_REPEATED_PHRASE_P = makeSymbol("PPH-REPEATED-PHRASE-P");

    static private final SubLString $str_alt43$PPH_REPEATED_PHRASE_EXPANSION_got = makeString("PPH-REPEATED-PHRASE-EXPANSION got non-formula ~S");

    static private final SubLString $str_alt44$Repeating_phrase__S = makeString("Repeating phrase ~S");

    static private final SubLString $str_alt45$__etc_ = makeString(", etc.");

    static private final SubLString $str_alt46$Can_t_get_current_list_item_from_ = makeString("Can't get current list item from ~S");

    static private final SubLList $list_alt48 = cons(reader_make_constant_shell("TheList"), makeKeyword("ANYTHING"));

    static private final SubLString $str_alt49$Updating__S_to____S____Result___S = makeString("Updating ~S to~% ~S.~% Result: ~S~%");

    static private final SubLList $list_alt52 = list(reader_make_constant_shell("CurrentListItemFn"), list($TEST, makeSymbol("PPH-EXTENSIONAL-LIST-P")), list($TEST, makeSymbol("NON-NEGATIVE-INTEGER-P")));

    static private final SubLList $list_alt53 = list(makeSymbol("LIST-EXPRESSION"), makeSymbol("OFFSET"));

    static private final SubLString $str_alt54$__Resolving__S_to__S__ = makeString("~&Resolving ~S to ~S~%");

    static private final SubLList $list_alt55 = cons(makeSymbol("LIST-EXPRESSION"), makeSymbol("INDEX"));

    static private final SubLString $str_alt57$pph_phrase_try_to_resolve_dtr_str = makeString("pph-phrase-try-to-resolve-dtr-string: clarifying agr for ~S; phrase is ~S~%");

    static private final SubLString $str_alt59$__Phrase_agr___S__ = makeString("~&Phrase agr: ~S~%");

    static private final SubLString $str_alt60$___Dtr__D_category_is__S___ = makeString("~& Dtr ~D category is ~S.~%");

    static private final SubLString $str_alt61$___Dtr__D_agr_is__S___ = makeString("~& Dtr ~D agr is ~S.~%");

    static private final SubLString $str_alt62$__Set_agr_of_dtr___D_to__S___ = makeString("~&Set agr of dtr #~D to ~S.~%");

    static private final SubLString $str_alt63$___Set_head_agr_to__S___ = makeString("~& Set head agr to ~S.~%");

    static private final SubLString $str_alt64$__Finished__S____with__D_dtrs____ = makeString("~&Finished ~S~% (with ~D dtrs).~%");

    static private final SubLString $str_alt65$___Set_phrase_agr_to__S_based_on_ = makeString("~& Set phrase agr to ~S based on head dtr.~%");

    static private final SubLString $str_alt66$___Dtrs_left_unfinished___D___ = makeString("~& Dtrs left unfinished: ~D.~%");

    static private final SubLString $str_alt68$__Agr_target__mother__not_resolve = makeString("~&Agr target (mother) not resolved: ~S.~%");

    static private final SubLString $str_alt69$__Phrase_agrees_with_itself_____ = makeString("~&Phrase agrees with itself(!)~%");

    static private final SubLString $str_alt70$__Agr_target_not_resolved___S___ = makeString("~&Agr target not resolved: ~S.~%");

    static private final SubLString $str_alt71$Setting_mother_s_output_list_from = makeString("Setting mother's output list from unfinished dtr with CycL ~S:~% ~S~%");

    static private final SubLList $list_alt73 = list(ZERO_INTEGER);

    static private final SubLString $str_alt75$__Test_has_unresolved_indexical_p = makeString("~&Test has unresolved indexical phrases. Postponing: ~S.~%");

    static private final SubLString $str_alt76$__Ran_conditional_test_____S___Re = makeString("~&Ran conditional test:~% ~S~% Result: ~S.~%");

    static private final SubLString $str_alt79$___Initial_winning_phrase_____S__ = makeString("~& Initial winning phrase:~% ~S~% with agr preds ~S");

    static private final SubLString $str_alt80$___New_phrase___S___with_agr_pred = makeString("~& New phrase: ~S~% with agr preds ~S");

    static private final SubLString $str_alt81$___Phrase_has__D_daughters___ = makeString("~& Phrase has ~D daughters.~%");

    static private final SubLList $list_alt83 = list(reader_make_constant_shell("TheNthFn"), reader_make_constant_shell("SententialConstituent"), makeKeyword("ANYTHING"));

    static private final SubLString $str_alt85$Adding_alternatives_for_agr_targe = makeString("Adding alternatives for agr target~% ~S~% to ~S");

    static private final SubLString $str_alt86$Done__S_alternatives_of__S = makeString("Done ~S alternatives of ~S");

    static private final SubLString $str_alt87$Added__D_alternatives_ = makeString("Added ~D alternatives.");

    static private final SubLString $str_alt92$__Paraphrasing__S_with_agreement_ = makeString("~&Paraphrasing ~S with agreement ~S.~%");

    static private final SubLString $str_alt93$___Output_list_is____S___ = makeString("~& Output list is~% ~S.~%");

    static private final SubLString $str_alt94$___Arg_position_map_is__S___ = makeString("~& Arg-position map is ~S.~%");

    static private final SubLString $str_alt95$___SUID_is__S___ = makeString("~& SUID is ~S.~%");

    static private final SubLString $str_alt96$_____of_dtrs___S___ = makeString("~& # of dtrs: ~S.~%");

    static private final SubLString $str_alt97$Can_t_resolve_string_of__S = makeString("Can't resolve string of ~S");

    static private final SubLString $str_alt99$Sanity_check_failed__rm_cycl__S_i = makeString("Sanity check failed: rm cycl ~S is not equal to phrase cycl ~S");

    static private final SubLString $str_alt101$Something_from_nothing__Non_empty = makeString("Something from nothing: Non-empty map ~S in empty-map context");

    static private final SubLString $str_alt102$PPH_possible_arg_position_map_pro = makeString("PPH possible arg-position map problem.~% Old formula ~S~% Old map: ~S~% New formula: ~S~% New Map: ~S.");

    static private final SubLString $str_alt103$PPH_arg_position_map_problem____O = makeString("PPH arg-position map problem.~% Old formula ~S~% Old map: ~S~% New formula: ~S~% New Map: ~S.");

    static private final SubLList $list_alt106 = cons(makeSymbol("FROM-PREFIX"), makeSymbol("TO-PREFIX"));

    static private final SubLString $str_alt107$__New_map_says__S_has_arg_positio = makeString("~&New map says ~S has arg-position ~S.~%Old map says it must be one of ~S");

    static private final SubLString $str_alt108$__Using_arg0_for__S_with_formula_ = makeString("~&Using arg0 for ~S with formula ~S~%");

    static private final SubLString $str_alt111$Updated_conditional_test_to__S__ = makeString("Updated conditional test to ~S~%");

    static private final SubLString $str_alt112$Updated_test_to____S_using_non_te = makeString("Updated test to~% ~S using non-template~% ~S~%");

    static private final SubLString $str_alt113$Updated_variable_bindings_query_t = makeString("Updated variable bindings query-template to ~S~%");

    static private final SubLString $str_alt114$Updated_variable_bindings_query_t = makeString("Updated variable bindings query-template to~% ~S using non-template~% ~S~%");

    static private final SubLString $str_alt115$__Replacing__S_with__S___ = makeString("~&Replacing ~S with ~S.~%");



    static private final SubLList $list_alt117 = list(TWO_INTEGER);

    static private final SubLString $str_alt118$Can_t_reconcile__S_and__S_ = makeString("Can't reconcile ~S and ~S.");

    static private final SubLString $str_alt120$No_current_arg0_to_reserve_for__S = makeString("No current arg0 to reserve for ~S");

    static private final SubLSymbol $sym124$_SYMBOL = makeSymbol("?SYMBOL");

    static private final SubLList $list_alt126 = list(makeSymbol("?SYMBOL"));

    private static final SubLSymbol PPH_SYMBOL_PHRASE_P = makeSymbol("PPH-SYMBOL-PHRASE-P");

    static private final SubLList $list_alt130 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    static private final SubLSymbol $sym131$_CODE = makeSymbol("?CODE");

    static private final SubLList $list_alt133 = list(makeSymbol("?CODE"));

    static private final SubLSymbol $sym139$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_ITEM_STRING = makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");

    static private final SubLString $str_alt141$_ = makeString(".");

    static private final SubLString $str_alt142$_ = makeString("?");

    private static final SubLSymbol PPH_FINAL_PUNCTUATION_STRING_P = makeSymbol("PPH-FINAL-PUNCTUATION-STRING-P");

    static private final SubLList $list_alt144 = cons(makeSymbol("LAST-NON-EMPTY-ITEM"), makeSymbol("TRAILING-ITEMS"));

    private static final SubLSymbol PPH_PERCENT_PHRASE_P = makeSymbol("PPH-PERCENT-PHRASE-P");

    static private final SubLString $str_alt148$Using_significant_digits_cutoff_o = makeString("Using significant digits cutoff of ~S for ~S");

    static private final SubLString $str_alt149$_ = makeString("%");

    static private final SubLList $list_alt150 = list(CHAR_0);

    private static final SubLSymbol PPH_COORDINATION_PHRASE_P = makeSymbol("PPH-COORDINATION-PHRASE-P");

    static private final SubLString $str_alt153$__Recursion_limit___S__exceeded_i = makeString("~&Recursion limit (~S) exceeded in PPH-COORDINATION-PHRASE-GET-STRING.");

    static private final SubLList $list_alt154 = list(makeSymbol("COORD-KEYWORD"), makeSymbol("LIST-TYPE-ID-STRING"));

    static private final SubLString $str_alt156$Changing_coordination_to__OR__bas = makeString("Changing coordination to :OR, based on :NO determiner");

    static private final SubLString $str_alt161$__Setting_conjunctive_agr_of__S_t = makeString("~&Setting conjunctive agr of ~S to ~S");

    static private final SubLString $str_alt164$subject_pointer_is_nth_phrase___S = makeString("subject pointer is nth phrase: ~S");

    static private final SubLString $str_alt165$__Not_setting_subject_verb_agreem = makeString("~&Not setting subject verb agreement because subject dtr is not finished.~%");

    static private final SubLString $str_alt168$__Using_internal_constraints___S_ = makeString("~&Using internal constraints: ~S~%");

    static private final SubLString $str_alt169$___filtered_from__S___ = makeString("...filtered from ~S.~%");

    static private final SubLString $str_alt170$__Setting_verb_agreement_to__S___ = makeString("~&Setting verb agreement to ~S.~%");

    static private final SubLString $str_alt171$Using_default_verb_form___S_ = makeString("Using default verb form: ~S.");

    static private final SubLString $str_alt174$__This_phrase_s_agr_pred_is__S_bu = makeString("~&This phrase's agr-pred is ~S but its category is ~S:~%~S");

    static private final SubLString $str_alt175$__Set_adjective_peer_agreement_to = makeString("~&Set adjective peer agreement to ~S.~%");

    static private final SubLString $str_alt177$__Set_untensed_peer_agreement_to_ = makeString("~&Set untensed peer agreement to ~S.~%");

    static private final SubLString $str_alt178$__Set_peer_agreement_to__S___ = makeString("~&Set peer agreement to ~S.~%");

    static private final SubLString $str_alt179$__Set_peer_agreement_to_default__ = makeString("~&Set peer agreement to default: ~S.~%");

    static private final SubLString $str_alt181$__Incorporating_tense_agreement__ = makeString("~&Incorporating tense agreement ~S.~%");

    static private final SubLString $str_alt182$__Using_daughter__D_as_agreement_ = makeString("~&Using daughter ~D as agreement target:~% ~S");

    static private final SubLString $str_alt184$__Using_hard_coded_null_determine = makeString("~&Using hard-coded null determiner hack for #$BareForm-NLAttr.~%");

    static private final SubLString $str_alt187$__Setting_det_nbar_agreement_for_ = makeString("~&Setting det-nbar agreement for possessive.~%");

    static private final SubLString $str_alt188$__Using_null_determiner_for_posse = makeString("~&Using null determiner for possessive nbar.~%");

    static private final SubLString $str_alt189$__Setting_det_nbar_agreement_for_ = makeString("~&Setting det-nbar agreement for ranged phrase.~%");

    static private final SubLString $str_alt190$__Setting_determiner_s_agr_pred_f = makeString("~&Setting determiner's agr-pred from nbar to ~S.");

    static private final SubLString $str_alt191$__Setting_agr_pred_from_determine = makeString("~&Setting agr-pred from determiner to ~S.");

    static private final SubLSymbol $sym192$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str_alt193$__Setting_determiner_nbar_agreeme = makeString("~&Setting determiner-nbar agreement based on variable determiner.");

    static private final SubLString $str_alt195$__Setting_determiner_nbar_agreeme = makeString("~&Setting determiner-nbar agreement to ~S based on number-denoting determiner.");

    static private final SubLString $str_alt196$Couldn_t_determine_agreement_info = makeString("Couldn't determine agreement information: ~S~% DET-HEAD-CYCL: ~S~%");

    static private final SubLString $str_alt198$__Nbar_is_now__S__ = makeString("~&Nbar is now ~S~%");

    static private final SubLString $str_alt200$__Using_English_specific_indefini = makeString("~&Using English-specific indefinite determiner hack: ~S.~%");

    static private final SubLList $list_alt201 = list(cons(reader_make_constant_shell("Thing"), makeString("something")), cons(reader_make_constant_shell("Person"), makeString("someone")), cons(reader_make_constant_shell("Place"), makeString("someplace")));

    static private final SubLList $list_alt202 = cons(makeSymbol("TYPE"), makeSymbol("STRING"));

    static private final SubLSymbol $sym203$PPH_PHRASE_NP_ = makeSymbol("PPH-PHRASE-NP?");

    static private final SubLList $list_alt205 = list(makeKeyword("A"), NIL);

    static private final SubLSymbol $sym209$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    static private final SubLString $str_alt210$__Subject_agr___S__ = makeString("~&Subject agr: ~S~%");

    static private final SubLString $str_alt217$__Using_tenses__S__ = makeString("~&Using tenses ~S~%");

    static private final SubLSymbol $sym218$PPH_FINITE_VERB_PRED_ = makeSymbol("PPH-FINITE-VERB-PRED?");

    static private final SubLSymbol $sym219$PPH_NON_PLURAL_NOUN_PRED_ = makeSymbol("PPH-NON-PLURAL-NOUN-PRED?");

    static private final SubLSymbol $sym220$PPH_PLURAL_NOUN_PRED_ = makeSymbol("PPH-PLURAL-NOUN-PRED?");

    static private final SubLSymbol $sym221$PPH_PLURAL_VERB_PRED_ = makeSymbol("PPH-PLURAL-VERB-PRED?");

    static private final SubLString $str_alt222$__Using_tense__S__ = makeString("~&Using tense ~S~%");

    static private final SubLString $str_alt226$__Unifying__S_and__S_to__S___ = makeString("~&Unifying ~S and ~S to ~S.~%");

    static private final SubLString $str_alt227$Using_agr_preds__S_from_done_head = makeString("Using agr preds ~S from done head dtr~% ~S~% for ~S.");

    static private final SubLString $str_alt228$Couldn_t_unify__S_and__S___ = makeString("Couldn't unify ~S and ~S.~%");

    static private final SubLString $str_alt229$__AGRs_are_now____S_and____S___ = makeString("~&AGRs are now~% ~S and~% ~S.~%");

    static private final SubLList $list_alt231 = list(reader_make_constant_shell("PhraseFn"), reader_make_constant_shell("Determiner"));

    public static final SubLSymbol $kw233$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt234$__Switching_arg1_and_arg2_in__S__ = makeString("~&Switching arg1 and arg2 in ~S~%");
}

/**
 * Total time: 1206 ms
 */
