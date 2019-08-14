/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_with_sequence_termP;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.pph_drs.new_pph_discourse_context;
import static com.cyc.cycjava.cycl.pph_drs.pph_ensure_discourse_participant_rms;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_true;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-QUESTION
 * source file: /cyc/top/cycl/pph-question.lisp
 * created:     2019/07/03 17:38:21
 */
public final class pph_question extends SubLTranslatedFile implements V12 {
    public static final SubLObject question_phrase_candidate_passes_filterP(SubLObject dtr, SubLObject filter) {
        return makeBoolean((!filter.isFunctionSpec()) || ($PASS == com.cyc.cycjava.cycl.pph_question.pph_try_question_phrase_filter(filter, dtr)));
    }

    public static final SubLObject pph_try_question_phrase_filter(SubLObject filter, SubLObject dtr) {
        return NIL != funcall(filter, dtr) ? ((SubLObject) ($PASS)) : $FAIL;
    }

    public static final SubLFile me = new pph_question();

 public static final String myName = "com.cyc.cycjava.cycl.pph_question";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_default_question_preds$ = makeSymbol("*PPH-DEFAULT-QUESTION-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $past_tense_formP_caching_state$ = makeSymbol("*PAST-TENSE-FORM?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pph_use_gtqsP$ = makeSymbol("*PPH-USE-GTQS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $gen_template_query_sentence_index$ = makeSymbol("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $gen_template_query_sentence_index_lock$ = makeSymbol("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*");

    // defparameter
    // Should we try permutations of arg lists?
    /**
     * Should we try permutations of arg lists?
     */
    @LispMethod(comment = "Should we try permutations of arg lists?\ndefparameter")
    private static final SubLSymbol $pph_unify_try_arg_permutationsP$ = makeSymbol("*PPH-UNIFY-TRY-ARG-PERMUTATIONS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_unify_recursion_limit$ = makeSymbol("*PPH-UNIFY-RECURSION-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_unify_recursion_depth$ = makeSymbol("*PPH-UNIFY-RECURSION-DEPTH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_arglist_permutations_max_arity$ = makeSymbol("*PPH-ARGLIST-PERMUTATIONS-MAX-ARITY*");

    static private final SubLSymbol $sym2$VALID_EXTERNAL_PPH_NL_PREDS_ = makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?");

    private static final SubLString $str7$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLSymbol GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P = makeSymbol("GEN-TEMPLATE-QUERY-SENTENCE-ASSERTION-P");

    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    static private final SubLList $list11 = list(reader_make_constant_shell("tensed"));

    private static final SubLSymbol PPH_QUESTION_CLAUSE_MEMOIZED = makeSymbol("PPH-QUESTION-CLAUSE-MEMOIZED");

    private static final SubLList $list13 = list(makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"), makeSymbol("GENERATE-QUESTION-BF"));

    private static final SubLList $list15 = list(makeSymbol("GENERATE-QUESTION-BF"));

    private static final SubLSymbol GENERATE_QUESTION_FROM_QUERY_TEMPLATE = makeSymbol("GENERATE-QUESTION-FROM-QUERY-TEMPLATE");

    private static final SubLString $str17$__Entering_PPH_POSSIBLY_BINDING_V = makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");

    private static final SubLString $str18$Failed_to_paraphrase__givens____S = makeString("Failed to paraphrase 'givens': ~S");

    static private final SubLString $str19$__Leaving_PPH_POSSIBLY_BINDING_VA = makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");

    static private final SubLString $str20$______and__pph_var_types__are_now = makeString("~&... and *pph-var-types* are now ~S~%");



    private static final SubLSymbol $sym22$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $$$if = makeString("if");

    static private final SubLList $list27 = list(ZERO_INTEGER);



    static private final SubLList $list29 = list(makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"));

    static private final SubLSymbol $sym30$PAST_TENSE_FORM_ = makeSymbol("PAST-TENSE-FORM?");

    private static final SubLObject $$pastTense_Generic = reader_make_constant_shell("pastTense-Generic");

    static private final SubLSymbol $sym32$_PAST_TENSE_FORM__CACHING_STATE_ = makeSymbol("*PAST-TENSE-FORM?-CACHING-STATE*");



    static private final SubLString $str37$__Trying____S = makeString("~&Trying~% ~S");

    private static final SubLString $str38$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str39$__ = makeString(") ");

    private static final SubLString $str40$Done__S_alternatives_of__S = makeString("Done ~S alternatives of ~S");

    private static final SubLString $str42$genTemplate_QuerySentence_index = makeString("genTemplate-QuerySentence index");

    private static final SubLSymbol ADD_GEN_TEMPLATE_QUERY_SENTENCE = makeSymbol("ADD-GEN-TEMPLATE-QUERY-SENTENCE");

    private static final SubLSymbol REMOVE_GEN_TEMPLATE_QUERY_SENTENCE = makeSymbol("REMOVE-GEN-TEMPLATE-QUERY-SENTENCE");



    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell("genTemplate-QuerySentence");

    private static final SubLSymbol $sym49$PPH_VISIBLE_LEXICAL_ASSERTION_ = makeSymbol("PPH-VISIBLE-LEXICAL-ASSERTION?");

    private static final SubLSymbol $sym51$_ = makeSymbol(">");

    private static final SubLSymbol GTQS_ASSERTION_CONSTANT_COUNT = makeSymbol("GTQS-ASSERTION-CONSTANT-COUNT");

    private static final SubLSymbol GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE = makeSymbol("GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE");

    private static final SubLString $str55$unexpected_result_from__UNIFY__S_ = makeString("unexpected result from (UNIFY ~S ~S):~% ~S~%");

    private static final SubLSymbol $sym56$PPH_ARG_POSITION_SPECIFIER_ = makeSymbol("PPH-ARG-POSITION-SPECIFIER?");

    private static final SubLList $list57 = cons(makeSymbol("TEMPLATE-TERM"), makeSymbol("SENTENCE-TERM"));

    private static final SubLString $str58$Failed_to_match__S_to_var_in_sent = makeString("Failed to match ~S to var in sentence. Got ~S~%");

    private static final SubLString $str59$Failed_to_match__S_to_var_in_temp = makeString("Failed to match ~S to var in template Got ~S~%");

    private static final SubLString $str60$Couldn_t_get_arg_position_for__S_ = makeString("Couldn't get arg position for ~S in ~S");

    private static final SubLString $str61$_S_doesn_t_match__S_of__S = makeString("~S doesn't match ~S of ~S");

    private static final SubLSymbol $sym63$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");

    private static final SubLSymbol $sym65$EL_VAR_NAME_ = makeSymbol("EL-VAR-NAME?");

    private static final SubLSymbol MAKE_EL_VAR = makeSymbol("MAKE-EL-VAR");

    private static final SubLSymbol PPH_UNIFY_POSSIBLE_FORMULA = makeSymbol("PPH-UNIFY-POSSIBLE-FORMULA");

    private static final SubLSymbol PPH_UNIFY_POSSIBLE_ARGS = makeSymbol("PPH-UNIFY-POSSIBLE-ARGS");



    private static final SubLString $str70$Exceeded_PPH_unify_recursion_dept = makeString("Exceeded PPH unify recursion depth of ~S.~%");

    private static final SubLSymbol PPH_UNIFY_FORMULA_TEMPLATE = makeSymbol("PPH-UNIFY-FORMULA-TEMPLATE");

    private static final SubLSymbol PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED = makeSymbol("PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED");

    private static final SubLString $str73$Not_in_unify_multiple_mode_ = makeString("Not in unify-multiple mode.");

    private static final SubLString $str74$Couldn_t_unify____S____S______giv = makeString("Couldn't unify~% ~S~% ~S~% ...given ~S~%");

    private static final SubLString $str75$Found_multiple_bindings_for____S_ = makeString("Found multiple bindings for~% ~S~% ~S ...given ~S~% ~S~%");

    private static final SubLSymbol PPH_UNIFY_ARGS_MEMOIZED = makeSymbol("PPH-UNIFY-ARGS-MEMOIZED");

    private static final SubLString $str77$Skipping_permutations_for_templat = makeString("Skipping permutations for template of length ~D ~% ~S~% ~S");

    private static final SubLString $str78$Lost_assumed_bindings________S__ = makeString("Lost assumed bindings(?).~% ~S~%");

    private static final SubLString $str79$__GTQS_Bindings___S___Map___S = makeString("~%GTQS Bindings: ~S~% Map: ~S");

    private static final SubLList $list80 = cons(makeSymbol("TEMPLATE-TERM"), makeSymbol("LOCAL-ARG-POSITION"));

    private static final SubLString $str81$GTQS__Couldn_t_find__S_in____S__ = makeString("GTQS: Couldn't find ~S in~% ~S~%");

    private static final SubLString $str82$__GTQS__Replacing__S_with__S__S__ = makeString("~&GTQS: Replacing ~S with ~S ~S~%");

    private static final SubLString $str83$GTQS__Couldn_t_replace__S_for__S_ = makeString("GTQS: Couldn't replace ~S for ~S in ~S");



    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell("InstanceNamedFn-Ternary");

    private static final SubLString $$$example = makeString("example");



    private static final SubLString $str88$Checking___genTemplate_QuerySente = makeString("Checking #$genTemplate-QuerySentence assertions...");

    private static final SubLString $str89$__Matched__S_of__S___genTemplate_ = makeString("~&Matched ~S of ~S #$genTemplate-QuerySentence assertions.~% Time: ~S seconds.~%");

    private static final SubLString $str90$Timed_out_after__S_seconds_on____ = makeString("Timed out after ~S seconds on~% ~S");

    private static final SubLString $str91$Didn_t_find_gtqs_in_matches_____S = makeString("Didn't find gtqs in matches:~% ~S~%");

    private static final SubLSymbol PPH_QUERY_VAR_P = makeSymbol("PPH-QUERY-VAR-P");

    private static final SubLList $list93 = list(makeKeyword("BLANKS"), $VARS);



    private static final SubLString $$$was_ = makeString("was ");

    private static final SubLString $$$is_ = makeString("is ");

    private static final SubLString $$$it_ = makeString("it ");

    private static final SubLString $$$that = makeString("that");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$FALSE = makeString("FALSE");

    private static final SubLString $$$false = makeString("false");

    private static final SubLString $$$were = makeString("were");

    private static final SubLString $$$are = makeString("are");

    private static final SubLString $$$_there_such_that = makeString(" there such that");

    private static final SubLList $list108 = list(reader_make_constant_shell("plural-Generic"));

    private static final SubLString $$$what_values_of = makeString("what values of");

    private static final SubLString $str111$__Setting_arg_position_of__S_to__ = makeString("~&Setting arg-position of ~S to ~S from ~S.~%");

    private static final SubLSymbol $sym112$PPH_VAR_REGISTERED_AS_DEFAULT_ = makeSymbol("PPH-VAR-REGISTERED-AS-DEFAULT?");

    private static final SubLSymbol PPH_EXCEPTIONAL_VAR_P = makeSymbol("PPH-EXCEPTIONAL-VAR-P");





    private static final SubLSymbol $sym117$QUESTION_ROP_FORMULA_ = makeSymbol("QUESTION-ROP-FORMULA?");









    private static final SubLSymbol $sym123$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLString $str124$___S_determined_to_be_a_number_va = makeString("~&~S determined to be a number var in ~S~%");

    private static final SubLString $str125$No_number_vars_in__S__ = makeString("No number vars in ~S~%");

    private static final SubLString $str126$__Trying_to_generate__S_using_sub = makeString("~&Trying to generate ~S using subject-auxiliary inversion.~%");

    private static final SubLString $str127$__Made_question_template__S = makeString("~&Made question template ~S");

    private static final SubLString $str128$_X_such_that = makeString("?X such that");

    private static final SubLString $str129$in_generate_phrase_with_subj_aux_ = makeString("in generate-phrase-with-subj-aux-inversion string is ~S; trying again~%");

    private static final SubLString $str130$__Not_subject_head_verb_initial__ = makeString("~&Not subject-head-verb-initial:~% ~S");

    private static final SubLSymbol $sym131$PPH_TENSE_PRED_ = makeSymbol("PPH-TENSE-PRED?");



    private static final SubLString $str133$__Couldn_t_find_question_subphras = makeString("~&Couldn't find question subphrase:~% ~S");

    private static final SubLString $str134$__Subject_dtr_of__S_is_a_wh_phras = makeString("~&Subject dtr of ~S is a wh-phrase; returning template as is.~%");

    private static final SubLString $str135$___S_has_no_head_verb__MAKE_QUEST = makeString("~&~S has no head verb; MAKE-QUESTION-TEMPLATE returning NIL.~%");

    private static final SubLString $str136$__Head_dtr__S_is_a_copula__placin = makeString("~&Head dtr ~S is a copula; placing it in front of the subject.~%");

    private static final SubLString $str137$__Head_dtr__S_is_an_auxiliary__pl = makeString("~&Head dtr ~S is an auxiliary; placing it in front of the subject.~%");

    private static final SubLString $str138$___S_may_be_a_modal_verb__MAKE_QU = makeString("~&~S may be a modal verb; MAKE-QUESTION-TEMPLATE returning NIL~%");

    private static final SubLString $str139$__Adding_do_support_to_template__ = makeString("~&Adding do support to template ~S");

    private static final SubLString $str140$Fronting__S = makeString("Fronting ~S");

    private static final SubLObject $$Have_TheWord = reader_make_constant_shell("Have-TheWord");

    private static final SubLObject $$pastPerfect_Generic = reader_make_constant_shell("pastPerfect-Generic");

    private static final SubLObject $$presentTense_Generic = reader_make_constant_shell("presentTense-Generic");

    private static final SubLString $str144$De_perfectiving_agr_from__S_to__S = makeString("De-perfectiving agr from ~S to ~S");



    private static final SubLSymbol $sym149$ROP_FORMULA_ = makeSymbol("ROP-FORMULA?");

    private static final SubLString $str150$Found_question_phrase___S = makeString("Found question phrase: ~S");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell("Agent-Generic");



    private static final SubLString $str155$in_STRING_FOR_VAR_IN_QUESTION_PHR = makeString("in STRING-FOR-VAR-IN-QUESTION-PHRASE: var is ~S~%");

    private static final SubLString $str156$pph_var_type_for__S___S__ = makeString("pph-var-type for ~S: ~S~%");

    private static final SubLString $$$how_many = makeString("how many");

    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell("nonPlural-Generic");

    private static final SubLObject $$nonSingular_Generic = reader_make_constant_shell("nonSingular-Generic");



    private static final SubLString $$$what = makeString("what");

    private static final SubLString $$$whom = makeString("whom");

    private static final SubLString $$$who = makeString("who");

    private static final SubLString $$$_or_what = makeString(" or what");

    private static final SubLString $$$when = makeString("when");



    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str175$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str180$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");







    private static final SubLString $str184$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str185$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str186$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol MODAL_STRINGS = makeSymbol("MODAL-STRINGS");





    private static final SubLSymbol $modal_strings_caching_state$ = makeSymbol("*MODAL-STRINGS-CACHING-STATE*");

    private static final SubLSymbol MODAL_WORDS = makeSymbol("MODAL-WORDS");

    private static final SubLSymbol $modal_words_caching_state$ = makeSymbol("*MODAL-WORDS-CACHING-STATE*");

    // Definitions
    /**
     * given an atomic formula, generates a question.  If there are
     * variables or keywords in the formula, they will be questioned. If
     * there are no variables or keywords, a yes/no question will be returned.
     *
     * @param FORMULA
     * 		formula; the formula to be turned into a question
     * @param mt;
     * 		the Mt in which to look for generation assertions
     * @return 0 string; the string corresponding to formula.
     * @return 1 pred
     * @return 2 justification
     * @return 3 pph-output-list-p
     */
    @LispMethod(comment = "given an atomic formula, generates a question.  If there are\r\nvariables or keywords in the formula, they will be questioned. If\r\nthere are no variables or keywords, a yes/no question will be returned.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to be turned into a question\r\n@param mt;\r\n\t\tthe Mt in which to look for generation assertions\r\n@return 0 string; the string corresponding to formula.\r\n@return 1 pred\r\n@return 2 justification\r\n@return 3 pph-output-list-p\ngiven an atomic formula, generates a question.  If there are\nvariables or keywords in the formula, they will be questioned. If\nthere are no variables or keywords, a yes/no question will be returned.")
    public static final SubLObject generate_question_alt(SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject nl_preds) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(nl_preds, $sym2$VALID_EXTERNAL_PPH_NL_PREDS_);
            if ($DEFAULT == nl_preds) {
                nl_preds = pph_utilities.pph_default_nl_preds(formula, $INTERROGATIVE, language_mt, domain_mt);
            }
            {
                SubLObject string = NIL;
                SubLObject pred = NIL;
                SubLObject just = NIL;
                SubLObject olist = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                    try {
                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                        pph_vars.$paraphrase_mode$.bind(mode, thread);
                        {
                            SubLObject error_message = NIL;
                            {
                                SubLObject _prev_bind_0_1 = Errors.$continue_cerrorP$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                                try {
                                    Errors.$continue_cerrorP$.bind(NIL, thread);
                                    pph_error.$pph_error_handling_onP$.bind(T, thread);
                                    if (NIL != pph_error.pph_break_on_errorP()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject _prev_bind_0_3 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                {
                                                    SubLObject reuseP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    try {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_4 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                {
                                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                            {
                                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                {
                                                                                    SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                                            Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_7 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                                                                    try {
                                                                                                        pph_vars.$pph_cycls$.bind(cons(cycl_utilities.hl_to_el(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject string_8 = com.cyc.cycjava.cycl.pph_question.pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, com.cyc.cycjava.cycl.pph_question.pph_default_question_preds(), UNPROVIDED));
                                                                                                            SubLObject pred_9 = thread.secondMultipleValue();
                                                                                                            SubLObject just_10 = thread.thirdMultipleValue();
                                                                                                            SubLObject olist_11 = thread.fourthMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            string = string_8;
                                                                                                            pred = pred_9;
                                                                                                            just = just_10;
                                                                                                            olist = olist_11;
                                                                                                        }
                                                                                                        if (string.isString()) {
                                                                                                            olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, $INTERROGATIVE);
                                                                                                            string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        pph_vars.$pph_cycls$.rebind(_prev_bind_0_7, thread);
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_6, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_5, thread);
                                                                        }
                                                                    }
                                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL == reuseP) {
                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    } else {
                                        try {
                                            {
                                                SubLObject _prev_bind_0_14 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject _prev_bind_0_15 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                                            try {
                                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                                {
                                                                    SubLObject reuseP = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    try {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject _prev_bind_0_16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                                            try {
                                                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                                                {
                                                                                    SubLObject new_or_reused = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject _prev_bind_0_17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                                                        try {
                                                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                                                            {
                                                                                                SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_18 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                                                            Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_19 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        pph_vars.$pph_cycls$.bind(cons(cycl_utilities.hl_to_el(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject string_20 = com.cyc.cycjava.cycl.pph_question.pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, com.cyc.cycjava.cycl.pph_question.pph_default_question_preds(), UNPROVIDED));
                                                                                                                            SubLObject pred_21 = thread.secondMultipleValue();
                                                                                                                            SubLObject just_22 = thread.thirdMultipleValue();
                                                                                                                            SubLObject olist_23 = thread.fourthMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            string = string_20;
                                                                                                                            pred = pred_21;
                                                                                                                            just = just_22;
                                                                                                                            olist = olist_23;
                                                                                                                        }
                                                                                                                        if (string.isString()) {
                                                                                                                            olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, $INTERROGATIVE);
                                                                                                                            string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        pph_vars.$pph_cycls$.rebind(_prev_bind_0_19, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_18, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_17, thread);
                                                                                        }
                                                                                    }
                                                                                    if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_16, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL == reuseP) {
                                                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                        }
                                        if (error_message.isString()) {
                                            Errors.warn(error_message);
                                        }
                                    }
                                } finally {
                                    pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_2, thread);
                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                    try {
                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, just, UNPROVIDED, UNPROVIDED, UNPROVIDED))), thread);
                        olist = pph_main.pph_sanitize_output_list(olist, formula);
                    } finally {
                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(string, pred, just, olist);
            }
        }
    }

    // Definitions
    /**
     * given an atomic formula, generates a question.  If there are
     * variables or keywords in the formula, they will be questioned. If
     * there are no variables or keywords, a yes/no question will be returned.
     *
     * @param FORMULA
     * 		formula; the formula to be turned into a question
     * @param mt;
     * 		the Mt in which to look for generation assertions
     * @return 0 string; the string corresponding to formula.
     * @return 1 pred
     * @return 2 justification
     * @return 3 pph-output-list-p
     */
    @LispMethod(comment = "given an atomic formula, generates a question.  If there are\r\nvariables or keywords in the formula, they will be questioned. If\r\nthere are no variables or keywords, a yes/no question will be returned.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to be turned into a question\r\n@param mt;\r\n\t\tthe Mt in which to look for generation assertions\r\n@return 0 string; the string corresponding to formula.\r\n@return 1 pred\r\n@return 2 justification\r\n@return 3 pph-output-list-p\ngiven an atomic formula, generates a question.  If there are\nvariables or keywords in the formula, they will be questioned. If\nthere are no variables or keywords, a yes/no question will be returned.")
    public static SubLObject generate_question(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject nl_preds) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_utilities.valid_external_pph_nl_predsP(nl_preds) : "! pph_utilities.valid_external_pph_nl_predsP(nl_preds) " + ("pph_utilities.valid_external_pph_nl_predsP(nl_preds) " + "CommonSymbols.NIL != pph_utilities.valid_external_pph_nl_predsP(nl_preds) ") + nl_preds;
        if ($DEFAULT == nl_preds) {
            nl_preds = pph_utilities.pph_default_nl_preds(formula, $INTERROGATIVE, language_mt, domain_mt);
        }
        SubLObject string = NIL;
        SubLObject pred = NIL;
        SubLObject just = NIL;
        SubLObject olist = NIL;
        SubLObject demerits = NIL;
        SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind(makeBoolean(NIL != pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)), thread);
            pph_vars.$paraphrase_mode$.bind(mode, thread);
            SubLObject error_message = NIL;
            final SubLObject _prev_bind_0_$1 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                pph_macros.herald_new_discourse_context();
                try {
                    pph_drs.pph_ensure_discourse_participant_rms();
                    final SubLObject _prev_bind_0_$2 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind(NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                        if (NIL != pph_error.pph_break_on_errorP()) {
                            final SubLObject _prev_bind_0_$3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                            try {
                                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$4 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                    final SubLObject reuseP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    try {
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$5 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            final SubLObject new_or_reused = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$6 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                    try {
                                                        final SubLObject _prev_bind_0_$8 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_cycls$.bind(cons(pph_standardize_query_sentence(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                            thread.resetMultipleValues();
                                                            final SubLObject string_$10 = pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, pph_default_question_preds(), UNPROVIDED));
                                                            final SubLObject pred_$11 = thread.secondMultipleValue();
                                                            final SubLObject just_$12 = thread.thirdMultipleValue();
                                                            final SubLObject olist_$13 = thread.fourthMultipleValue();
                                                            final SubLObject demerits_$14 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            string = string_$10;
                                                            pred = pred_$11;
                                                            just = just_$12;
                                                            olist = olist_$13;
                                                            demerits = demerits_$14;
                                                            if (NIL != pph_string.pph_string_p(string)) {
                                                                olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, $INTERROGATIVE);
                                                                string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                                            }
                                                        } finally {
                                                            pph_vars.$pph_cycls$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            } finally {
                                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$6, thread);
                                            }
                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                } finally {
                                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$4, thread);
                                }
                            } finally {
                                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$12 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                        try {
                                            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$13 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                                final SubLObject reuseP2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                try {
                                                    thread.resetMultipleValues();
                                                    final SubLObject _prev_bind_0_$14 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                        final SubLObject new_or_reused2 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        final SubLObject _prev_bind_0_$15 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                        try {
                                                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                            final SubLObject local_state2 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            final SubLObject _prev_bind_0_$16 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state2, thread);
                                                                final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                                                try {
                                                                    final SubLObject _prev_bind_0_$17 = pph_vars.$pph_cycls$.currentBinding(thread);
                                                                    try {
                                                                        pph_vars.$pph_cycls$.bind(cons(pph_standardize_query_sentence(formula), pph_vars.$pph_cycls$.getDynamicValue(thread)), thread);
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject string_$11 = pph_question_clause(formula, pph_utilities.pph_filter_preds(nl_preds, pph_default_question_preds(), UNPROVIDED));
                                                                        final SubLObject pred_$12 = thread.secondMultipleValue();
                                                                        final SubLObject just_$13 = thread.thirdMultipleValue();
                                                                        final SubLObject olist_$14 = thread.fourthMultipleValue();
                                                                        final SubLObject demerits_$15 = thread.fifthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        string = string_$11;
                                                                        pred = pred_$12;
                                                                        just = just_$13;
                                                                        olist = olist_$14;
                                                                        demerits = demerits_$15;
                                                                        if (NIL != pph_string.pph_string_p(string)) {
                                                                            olist = pph_phrase_resolution.pph_phrase_output_list_add_sentential_force(olist, $INTERROGATIVE);
                                                                            string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                                                        }
                                                                    } finally {
                                                                        pph_vars.$pph_cycls$.rebind(_prev_bind_0_$17, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values3 = getValuesAsVector();
                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                                                        restoreValuesFromVector(_values3);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                        } finally {
                                                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        if ((new_or_reused2 == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values4 = getValuesAsVector();
                                                        if (NIL == reuseP2) {
                                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                        }
                                                        restoreValuesFromVector(_values4);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                    }
                                                }
                                            } finally {
                                                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        } finally {
                                            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str7$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                            }
                        }
                    } finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$3, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
        try {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(makeBoolean((NIL != pph_vars.pph_link_unlinked_phrases_to_matrix_arg0P()) && (NIL == find_if(GEN_TEMPLATE_QUERY_SENTENCE_ASSERTION_P, just, UNPROVIDED, UNPROVIDED, UNPROVIDED))), thread);
            olist = pph_main.pph_sanitize_output_list(olist, formula);
        } finally {
            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
        }
        return values(pph_string.pph_string_if_non_null_to_output_format(string, mode), pred, just, olist, demerits);
    }

    public static SubLObject pph_standardize_query_sentence(final SubLObject query_sentence) {
        return cycl_utilities.expression_transform(query_sentence, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_standardize_query_term(final SubLObject query_term) {
        return cycl_utilities.expression_transform(query_term, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_default_question_preds_alt() {
        return copy_list($pph_default_question_preds$.getGlobalValue());
    }

    public static SubLObject pph_default_question_preds() {
        return copy_list($pph_default_question_preds$.getGlobalValue());
    }

    /**
     * Paraphrase FORMULA as a question using NL-PREDS for agreement, but don't
     * add capitalization or punctuation.
     */
    @LispMethod(comment = "Paraphrase FORMULA as a question using NL-PREDS for agreement, but don\'t\r\nadd capitalization or punctuation.\nParaphrase FORMULA as a question using NL-PREDS for agreement, but don\'t\nadd capitalization or punctuation.")
    public static final SubLObject pph_question_clause_alt(SubLObject formula, SubLObject nl_preds) {
        return com.cyc.cycjava.cycl.pph_question.pph_question_clause_memoized(formula, nl_preds, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Paraphrase FORMULA as a question using NL-PREDS for agreement, but don't
     * add capitalization or punctuation.
     */
    @LispMethod(comment = "Paraphrase FORMULA as a question using NL-PREDS for agreement, but don\'t\r\nadd capitalization or punctuation.\nParaphrase FORMULA as a question using NL-PREDS for agreement, but don\'t\nadd capitalization or punctuation.")
    public static SubLObject pph_question_clause(final SubLObject formula, final SubLObject nl_preds) {
        return pph_question_clause_memoized(formula, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_question_clause_memoized_internal(SubLObject formula, SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff) {
        if (blanksP == UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ordered_gen_fun_list = $list_alt11;
                SubLObject successful_fn = NIL;
                SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
                SubLObject string = NIL;
                SubLObject pred = NIL;
                SubLObject just = NIL;
                SubLObject olist = NIL;
                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(demerit_cutoff)))) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt12$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt13$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(demerit_cutoff), new SubLObject[]{ $str_alt14$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    }
                }
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
                        {
                            SubLObject arg0 = cycl_utilities.formula_arg0(formula);
                            {
                                SubLObject _prev_bind_0_26 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                                SubLObject _prev_bind_1 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                                SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                                SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_current_arg0$.bind(NIL != pph_macros.pph_ok_arg0_for_linkingP(arg0) ? ((SubLObject) (arg0)) : $UNSPECIFIED, thread);
                                    pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                    pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                    pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                    try {
                                        if (NIL != blanksP) {
                                            ordered_gen_fun_list = $list_alt17;
                                        } else {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject string_27 = com.cyc.cycjava.cycl.pph_question.generate_question_from_query_template(formula, nl_preds, arg_position_map);
                                                SubLObject pred_28 = thread.secondMultipleValue();
                                                SubLObject just_29 = thread.thirdMultipleValue();
                                                SubLObject olist_30 = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                string = string_27;
                                                pred = pred_28;
                                                just = just_29;
                                                olist = olist_30;
                                            }
                                        }
                                        if (string.isString()) {
                                        } else {
                                            if (NIL == el_formula_p(formula)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject string_31 = com.cyc.cycjava.cycl.pph_question.generate_question_non_propositional(formula, nl_preds);
                                                    SubLObject pred_32 = thread.secondMultipleValue();
                                                    SubLObject just_33 = thread.thirdMultipleValue();
                                                    SubLObject olist_34 = thread.fourthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    string = string_31;
                                                    pred = pred_32;
                                                    just = just_33;
                                                    olist = olist_34;
                                                }
                                            } else {
                                                {
                                                    SubLObject _prev_bind_0_35 = pph_vars.$pph_var_types$.currentBinding(thread);
                                                    try {
                                                        pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_var_types$.getDynamicValue(thread))) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                                                        {
                                                            SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                                                            {
                                                                SubLObject _prev_bind_0_36 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_37 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_38 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                                                try {
                                                                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                                                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                                                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                        format(T, $str_alt18$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)));
                                                                    }
                                                                    try {
                                                                        pph_variable_handling.pph_register_query_vars(formula);
                                                                        {
                                                                            SubLObject _prev_bind_0_39 = pph_vars.$generation_level$.currentBinding(thread);
                                                                            try {
                                                                                pph_vars.$generation_level$.bind(number_utilities.f_1X(pph_vars.current_generation_level()), thread);
                                                                                {
                                                                                    SubLObject hyp_string = NIL;
                                                                                    SubLObject hyp_pred = NIL;
                                                                                    SubLObject hyp_just = NIL;
                                                                                    SubLObject hyp_olist = NIL;
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject query_formula = com.cyc.cycjava.cycl.pph_question.pph_remove_hypothetical(formula, arg_position_map);
                                                                                        SubLObject query_map = thread.secondMultipleValue();
                                                                                        SubLObject hypothetical = thread.thirdMultipleValue();
                                                                                        SubLObject hypothetical_map = thread.fourthMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != el_formula_p(hypothetical)) {
                                                                                            com.cyc.cycjava.cycl.pph_question.pph_question_register_hypothetical_vars(hypothetical);
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject hyp_string_40 = com.cyc.cycjava.cycl.pph_question.pph_question_declarative_string(hypothetical, $ANY, hypothetical_map, UNPROVIDED, UNPROVIDED);
                                                                                                SubLObject hyp_pred_41 = thread.secondMultipleValue();
                                                                                                SubLObject hyp_just_42 = thread.thirdMultipleValue();
                                                                                                SubLObject hyp_olist_43 = thread.fourthMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                hyp_string = hyp_string_40;
                                                                                                hyp_pred = hyp_pred_41;
                                                                                                hyp_just = hyp_just_42;
                                                                                                hyp_olist = hyp_olist_43;
                                                                                            }
                                                                                        }
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(query_formula);
                                                                                            SubLObject rephrase_template = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            query_map = pph_utilities.pph_figure_new_arg_position_map(query_map, rephrase_template);
                                                                                            if (NIL == string) {
                                                                                                {
                                                                                                    SubLObject csome_list_var = ordered_gen_fun_list;
                                                                                                    SubLObject function = NIL;
                                                                                                    for (function = csome_list_var.first(); !((NIL != string) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , function = csome_list_var.first()) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject string_44 = funcall(function, rephrased_formula, nl_preds, query_map);
                                                                                                            SubLObject pred_45 = thread.secondMultipleValue();
                                                                                                            SubLObject just_46 = thread.thirdMultipleValue();
                                                                                                            SubLObject olist_47 = thread.fourthMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            string = string_44;
                                                                                                            pred = pred_45;
                                                                                                            just = just_46;
                                                                                                            olist = olist_47;
                                                                                                        }
                                                                                                        if (string.isString()) {
                                                                                                            successful_fn = function;
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject string_48 = com.cyc.cycjava.cycl.pph_question.pph_add_hypothetical_paraphrase(string, pred, just, olist, hyp_just, hyp_olist);
                                                                                                                SubLObject pred_49 = thread.secondMultipleValue();
                                                                                                                SubLObject just_50 = thread.thirdMultipleValue();
                                                                                                                SubLObject olist_51 = thread.fourthMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                string = string_48;
                                                                                                                pred = pred_49;
                                                                                                                just = just_50;
                                                                                                                olist = olist_51;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                pph_vars.$generation_level$.rebind(_prev_bind_0_39, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                {
                                                                                    SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                                        format(T, $str_alt19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars());
                                                                                    }
                                                                                    pph_macros.pph_handle_local_vars(local_vars);
                                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                                        format(T, $str_alt20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars());
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_2_38, thread);
                                                                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_1_37, thread);
                                                                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_36, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_vars.$pph_var_types$.rebind(_prev_bind_0_35, thread);
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != successful_fn) {
                                            just = cons(pph_phrase.pph_code_justification(successful_fn, UNPROVIDED), just);
                                            if (NIL == pred) {
                                                pred = $$tensed;
                                            }
                                            if (NIL == olist) {
                                                olist = list(pph_data_structures.new_pph_phrase_output_item(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                pph_macros.destroy_new_pph_phrases();
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_53, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                                    pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                                    pph_macros.$new_pph_phrases$.rebind(_prev_bind_1, thread);
                                    pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(string, pred, just, olist);
            }
        }
    }

    public static SubLObject pph_question_clause_memoized_internal(final SubLObject formula, final SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff, SubLObject v_pph_sentence) {
        if (blanksP == UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        if (v_pph_sentence == UNPROVIDED) {
            v_pph_sentence = pph_vars.$pph_sentence$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_sentence$.currentBinding(thread);
        try {
            pph_vars.$pph_sentence$.bind(v_pph_sentence, thread);
            SubLObject ordered_gen_fun_list = $list13;
            SubLObject successful_fn = NIL;
            final SubLObject arg_position_map = pph_utilities.pph_new_identity_map();
            SubLObject string = NIL;
            SubLObject pred = NIL;
            SubLObject just = NIL;
            SubLObject olist = NIL;
            SubLObject demerits = NIL;
            final SubLObject _prev_bind_0_$32 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind(demerit_cutoff, thread);
                final SubLObject arg0 = cycl_utilities.formula_arg0(formula);
                final SubLObject _prev_bind_0_$33 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                try {
                    pph_macros.$destroy_new_pph_phrasesP$.bind(makeBoolean((NIL != pph_macros.$destroy_new_pph_phrasesP$.getDynamicValue(thread)) || (NIL != misc_utilities.uninitialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread)))), thread);
                    pph_vars.$pph_current_arg0$.bind(NIL != pph_macros.pph_ok_arg0_for_linkingP(arg0) ? arg0 : $UNSPECIFIED, thread);
                    final SubLObject matrix_new_pph_phrases = pph_macros.$new_pph_phrases$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$34 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$35 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                    try {
                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                        SubLObject destroy_new_phrasesP = NIL;
                        try {
                            if (NIL != blanksP) {
                                ordered_gen_fun_list = $list15;
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject string_$36 = generate_question_from_query_template(formula, nl_preds, arg_position_map);
                                final SubLObject pred_$37 = thread.secondMultipleValue();
                                final SubLObject just_$38 = thread.thirdMultipleValue();
                                final SubLObject olist_$39 = thread.fourthMultipleValue();
                                final SubLObject demerits_$40 = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                string = string_$36;
                                pred = pred_$37;
                                just = just_$38;
                                olist = olist_$39;
                                demerits = demerits_$40;
                            }
                            if (NIL != pph_string.pph_string_p(string)) {
                                successful_fn = GENERATE_QUESTION_FROM_QUERY_TEMPLATE;
                            } else
                                if (NIL == el_formula_p(formula)) {
                                    thread.resetMultipleValues();
                                    final SubLObject string_$37 = generate_question_non_propositional(formula, nl_preds);
                                    final SubLObject pred_$38 = thread.secondMultipleValue();
                                    final SubLObject just_$39 = thread.thirdMultipleValue();
                                    final SubLObject olist_$40 = thread.fourthMultipleValue();
                                    final SubLObject demerits_$41 = thread.fifthMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_$37;
                                    pred = pred_$38;
                                    just = just_$39;
                                    olist = olist_$40;
                                    demerits = demerits_$41;
                                } else {
                                    final SubLObject _prev_bind_0_$35 = pph_vars.$pph_var_types$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                                        final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                                        final SubLObject _prev_bind_0_$36 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$36 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                        final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                        try {
                                            pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                            pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                            pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str17$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            try {
                                                pph_variable_handling.pph_register_query_vars(formula);
                                                final SubLObject _prev_bind_0_$37 = pph_vars.$generation_level$.currentBinding(thread);
                                                try {
                                                    pph_vars.$generation_level$.bind(number_utilities.f_1X(pph_vars.current_generation_level()), thread);
                                                    SubLObject hyp_string = NIL;
                                                    SubLObject hyp_pred = NIL;
                                                    SubLObject hyp_just = NIL;
                                                    SubLObject hyp_olist = NIL;
                                                    SubLObject abortP = NIL;
                                                    thread.resetMultipleValues();
                                                    final SubLObject query_formula = pph_remove_hypothetical(formula, arg_position_map);
                                                    SubLObject query_map = thread.secondMultipleValue();
                                                    final SubLObject hypothetical = thread.thirdMultipleValue();
                                                    final SubLObject hypothetical_map = thread.fourthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != el_formula_p(hypothetical)) {
                                                        pph_question_register_hypothetical_vars(hypothetical);
                                                        final SubLObject _prev_bind_0_$38 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_use_smart_variable_replacementP$.bind(NIL != pph_vars.$pph_handle_hypotheticalsP$.getDynamicValue(thread) ? NIL : pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread), thread);
                                                            thread.resetMultipleValues();
                                                            final SubLObject hyp_string_$51 = pph_question_declarative_string(hypothetical, $ANY, hypothetical_map, UNPROVIDED, UNPROVIDED);
                                                            final SubLObject hyp_pred_$52 = thread.secondMultipleValue();
                                                            final SubLObject hyp_just_$53 = thread.thirdMultipleValue();
                                                            final SubLObject hyp_olist_$54 = thread.fourthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            hyp_string = hyp_string_$51;
                                                            hyp_pred = hyp_pred_$52;
                                                            hyp_just = hyp_just_$53;
                                                            hyp_olist = hyp_olist_$54;
                                                            if (NIL == hyp_string) {
                                                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                                                    Errors.warn($str18$Failed_to_paraphrase__givens____S, hypothetical);
                                                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                                                }
                                                                abortP = T;
                                                            }
                                                        } finally {
                                                            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0_$38, thread);
                                                        }
                                                    }
                                                    if (NIL == abortP) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(query_formula);
                                                        final SubLObject rephrase_template = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        query_map = pph_utilities.pph_figure_new_arg_position_map(query_map, rephrase_template);
                                                        if (NIL == string) {
                                                            SubLObject csome_list_var = ordered_gen_fun_list;
                                                            SubLObject function = NIL;
                                                            function = csome_list_var.first();
                                                            while ((NIL == string) && (NIL != csome_list_var)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject string_$38 = funcall(function, rephrased_formula, nl_preds, query_map);
                                                                final SubLObject pred_$39 = thread.secondMultipleValue();
                                                                final SubLObject just_$40 = thread.thirdMultipleValue();
                                                                final SubLObject olist_$41 = thread.fourthMultipleValue();
                                                                final SubLObject demerits_$42 = thread.fifthMultipleValue();
                                                                thread.resetMultipleValues();
                                                                string = string_$38;
                                                                pred = pred_$39;
                                                                just = just_$40;
                                                                olist = olist_$41;
                                                                demerits = demerits_$42;
                                                                if (NIL != pph_string.pph_string_p(string)) {
                                                                    successful_fn = function;
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject string_$39 = pph_add_hypothetical_paraphrase(string, pred, just, olist, demerits, hyp_just, hyp_olist);
                                                                    final SubLObject pred_$40 = thread.secondMultipleValue();
                                                                    final SubLObject just_$41 = thread.thirdMultipleValue();
                                                                    final SubLObject olist_$42 = thread.fourthMultipleValue();
                                                                    final SubLObject demerits_$43 = thread.fifthMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    string = string_$39;
                                                                    pred = pred_$40;
                                                                    just = just_$41;
                                                                    olist = olist_$42;
                                                                    demerits = demerits_$43;
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                function = csome_list_var.first();
                                                            } 
                                                        }
                                                    }
                                                } finally {
                                                    pph_vars.$generation_level$.rebind(_prev_bind_0_$37, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format_nil.force_format(T, $str19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    pph_macros.pph_handle_local_vars(local_vars);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format_nil.force_format(T, $str20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                                }
                                            }
                                        } finally {
                                            pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                                            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_1_$36, thread);
                                            pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$36, thread);
                                        }
                                    } finally {
                                        pph_vars.$pph_var_types$.rebind(_prev_bind_0_$35, thread);
                                    }
                                }

                            if (NIL != successful_fn) {
                                just = cons(pph_phrase.pph_code_justification(successful_fn, UNPROVIDED), just);
                                if (NIL == pred) {
                                    pred = $$tensed;
                                }
                                if (NIL == olist) {
                                    olist = list(pph_data_structures.new_pph_phrase_output_item(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                }
                            }
                            destroy_new_phrasesP = makeBoolean((NIL != misc_utilities.uninitialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) || (NIL == successful_fn));
                        } finally {
                            final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != destroy_new_phrasesP) {
                                    pph_macros.destroy_new_pph_phrases();
                                } else {
                                    SubLObject cdolist_list_var = stacks.do_stack_elements_stack_elements(pph_macros.$new_pph_phrases$.getDynamicValue(thread));
                                    SubLObject phrase = NIL;
                                    phrase = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        stacks.stack_push(phrase, matrix_new_pph_phrases);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        phrase = cdolist_list_var.first();
                                    } 
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                    } finally {
                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_1_$35, thread);
                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_0_$34, thread);
                    }
                } finally {
                    pph_vars.$pph_current_arg0$.rebind(_prev_bind_2, thread);
                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_0_$33, thread);
                }
            } finally {
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$32, thread);
            }
            return values(string, pred, just, olist, demerits);
        } finally {
            pph_vars.$pph_sentence$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject pph_question_clause_memoized(SubLObject formula, SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff) {
        if (blanksP == UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_question.pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_QUESTION_CLAUSE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_QUESTION_CLAUSE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_QUESTION_CLAUSE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(formula, nl_preds, blanksP, demerit_cutoff);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (formula.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (nl_preds.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (blanksP.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && demerit_cutoff.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(formula, nl_preds, blanksP, demerit_cutoff));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_question_clause_memoized(final SubLObject formula, final SubLObject nl_preds, SubLObject blanksP, SubLObject demerit_cutoff, SubLObject v_pph_sentence) {
        if (blanksP == UNPROVIDED) {
            blanksP = pph_vars.$pph_blanks_for_varsP$.getDynamicValue();
        }
        if (demerit_cutoff == UNPROVIDED) {
            demerit_cutoff = pph_vars.$pph_demerit_cutoff$.getDynamicValue();
        }
        if (v_pph_sentence == UNPROVIDED) {
            v_pph_sentence = pph_vars.$pph_sentence$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_QUESTION_CLAUSE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_QUESTION_CLAUSE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_QUESTION_CLAUSE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (nl_preds.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (blanksP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (demerit_cutoff.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_pph_sentence.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_question_clause_memoized_internal(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, nl_preds, blanksP, demerit_cutoff, v_pph_sentence));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject pph_remove_hypothetical_alt(SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (NIL != com.cyc.cycjava.cycl.pph_question.pph_hypothesize_antecedent_varsP(formula)) {
            {
                SubLObject hypothetical_template = $ARG1;
                SubLObject hypothetical_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, hypothetical_template);
                SubLObject hypothetical = pph_utilities.pph_apply_template(hypothetical_template, formula);
                SubLObject query_template = $ARG2;
                SubLObject query_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, query_template);
                SubLObject query = pph_utilities.pph_apply_template(query_template, formula);
                return values(query, query_map, hypothetical, hypothetical_map);
            }
        } else {
            return values(formula, arg_position_map);
        }
    }

    public static SubLObject pph_remove_hypothetical(final SubLObject formula, SubLObject arg_position_map) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (NIL != pph_hypothesize_antecedent_varsP(formula)) {
            final SubLObject hypothetical_template = $ARG1;
            final SubLObject hypothetical_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, hypothetical_template);
            final SubLObject hypothetical = pph_utilities.pph_apply_template(hypothetical_template, formula);
            final SubLObject query_template = $ARG2;
            final SubLObject query_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, query_template);
            final SubLObject query = pph_utilities.pph_apply_template(query_template, formula);
            return values(query, query_map, hypothetical, hypothetical_map);
        }
        return values(formula, arg_position_map);
    }

    public static final SubLObject pph_hypothesize_antecedent_varsP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != pph_vars.$pph_query_antecedents_are_hypothesizedP$.getDynamicValue(thread)) && (NIL != el_implication_p(formula)));
        }
    }

    public static SubLObject pph_hypothesize_antecedent_varsP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pph_vars.$pph_query_antecedents_are_hypothesizedP$.getDynamicValue(thread)) && (NIL != el_implication_p(formula)));
    }

    public static final SubLObject pph_question_register_hypothetical_vars_alt(SubLObject hypothetical) {
        {
            SubLObject vars = NIL;
            SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(hypothetical);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                pph_variable_handling.pph_register_var_quantifier(var, $EXISTENTIAL);
                vars = cons(var, vars);
            }
            return vars;
        }
    }

    public static SubLObject pph_question_register_hypothetical_vars(final SubLObject hypothetical) {
        SubLObject vars = NIL;
        SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(hypothetical);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_variable_handling.pph_register_var_quantifier(var, $EXISTENTIAL);
            vars = cons(var, vars);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return vars;
    }

    public static final SubLObject pph_add_hypothetical_paraphrase(SubLObject string, SubLObject pred, SubLObject just, SubLObject olist, SubLObject hyp_just, SubLObject hyp_olist) {
        if (NIL != hyp_olist) {
            {
                SubLObject implies_item = pph_data_structures.new_pph_phrase_output_item($$$if, $list_alt27, $$implies, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(implies_item, $$implies);
                hyp_olist = cons(implies_item, hyp_olist);
            }
            hyp_olist = pph_methods_formulas.pph_phrase_output_list_add_comma(hyp_olist);
            olist = append(hyp_olist, olist);
            just = append(hyp_just, just);
            string = pph_phrase.pph_phrase_output_list_string(olist, T);
        }
        return values(string, pred, just, olist);
    }

    public static SubLObject pph_add_hypothetical_paraphrase(SubLObject string, final SubLObject pred, SubLObject just, SubLObject olist, final SubLObject demerits, final SubLObject hyp_just, SubLObject hyp_olist) {
        if (NIL != hyp_olist) {
            final SubLObject implies_item = pph_data_structures.new_pph_phrase_output_item($$$if, $list27, $$implies, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(implies_item, $$implies);
            hyp_olist = cons(implies_item, hyp_olist);
            hyp_olist = pph_methods_formulas.pph_phrase_output_list_add_comma(hyp_olist);
            olist = append(hyp_olist, olist);
            just = append(hyp_just, just);
            string = pph_phrase.pph_phrase_output_list_string(olist, T);
        }
        return values(string, pred, just, olist, demerits);
    }

    /**
     * Paraphrase the non-propositional term OBJECT with interrogative force.
     */
    @LispMethod(comment = "Paraphrase the non-propositional term OBJECT with interrogative force.")
    public static final SubLObject generate_question_non_propositional_alt(SubLObject v_object, SubLObject nl_preds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject string = com.cyc.cycjava.cycl.pph_question.pph_question_declarative_string(v_object, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pred = thread.secondMultipleValue();
                SubLObject just = thread.thirdMultipleValue();
                SubLObject olist = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return values(string, pred, just, olist);
            }
        }
    }

    /**
     * Paraphrase the non-propositional term OBJECT with interrogative force.
     */
    @LispMethod(comment = "Paraphrase the non-propositional term OBJECT with interrogative force.")
    public static SubLObject generate_question_non_propositional(final SubLObject v_object, final SubLObject nl_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject string = pph_question_declarative_string(v_object, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject just = thread.thirdMultipleValue();
        final SubLObject olist = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(string, pred, just, olist);
    }

    /**
     * Is non-brute-force question paraphrase available for FORMULA?
     */
    @LispMethod(comment = "Is non-brute-force question paraphrase available for FORMULA?")
    public static final SubLObject question_paraphrase_availableP_alt(SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject nl_preds) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ordered_gen_fun_list = $list_alt29;
                SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(formula);
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                    try {
                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var = ordered_gen_fun_list;
                                SubLObject function = NIL;
                                for (function = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , function = csome_list_var.first()) {
                                    ans = list_utilities.sublisp_boolean(funcall(function, rephrased_formula, nl_preds));
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Is non-brute-force question paraphrase available for FORMULA?
     */
    @LispMethod(comment = "Is non-brute-force question paraphrase available for FORMULA?")
    public static SubLObject question_paraphrase_availableP(final SubLObject formula, SubLObject language_mt, SubLObject domain_mt, SubLObject nl_preds) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordered_gen_fun_list = $list29;
        final SubLObject rephrased_formula = pph_utilities.pph_rephrase_cycl(formula);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject function;
                for (csome_list_var = ordered_gen_fun_list, function = NIL, function = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = list_utilities.sublisp_boolean(funcall(function, rephrased_formula, nl_preds)) , csome_list_var = csome_list_var.rest() , function = csome_list_var.first()) {
                }
            }
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject clear_past_tense_formP_alt() {
        {
            SubLObject cs = $past_tense_formP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_past_tense_formP() {
        final SubLObject cs = $past_tense_formP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_past_tense_formP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($past_tense_formP_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_past_tense_formP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($past_tense_formP_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Is PRED a past-tense form?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PRED a past-tense form?")
    public static final SubLObject past_tense_formP_internal_alt(SubLObject pred, SubLObject mt) {
        return pph_utilities.pph_genl_predicateP(pred, $$pastTense_Generic, mt);
    }

    /**
     *
     *
     * @return BOOLEAN; Is PRED a past-tense form?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PRED a past-tense form?")
    public static SubLObject past_tense_formP_internal(final SubLObject pred, final SubLObject mt) {
        return pph_utilities.pph_genl_predicateP(pred, $$pastTense_Generic, mt);
    }

    public static final SubLObject past_tense_formP_alt(SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $past_tense_formP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym30$PAST_TENSE_FORM_, $sym32$_PAST_TENSE_FORM__CACHING_STATE_, NIL, EQ, TWO_INTEGER, SIXTEEN_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pred == cached_args.first()) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && (mt == cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.past_tense_formP_internal(pred, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject past_tense_formP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject caching_state = $past_tense_formP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym30$PAST_TENSE_FORM_, $sym32$_PAST_TENSE_FORM__CACHING_STATE_, NIL, EQ, TWO_INTEGER, SIXTEEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(past_tense_formP_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * Should we generate a question using a past-tense form?
     */
    @LispMethod(comment = "Should we generate a question using a past-tense form?")
    public static final SubLObject prefer_past_tense_formP_alt(SubLObject preds) {
        if (preds == $ANY) {
            return NIL;
        }
        return makeBoolean((NIL != preds) && (NIL == list_utilities.find_if_not($sym30$PAST_TENSE_FORM_, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Should we generate a question using a past-tense form?
     */
    @LispMethod(comment = "Should we generate a question using a past-tense form?")
    public static SubLObject prefer_past_tense_formP(final SubLObject preds) {
        if (preds == $ANY) {
            return NIL;
        }
        return makeBoolean((NIL != preds) && (NIL == list_utilities.find_if_not($sym30$PAST_TENSE_FORM_, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Given an atomic formula as input, generate and return an English
     * string based on the genQuestion assertion for the predicate.
     *
     * @param FORMULA
     * 		formula; the formula to be used to ask a question
     * @return string:  a string corresponding to a question for the
    formula, or nil if there is no appropriate genQuestion assertion
     */
    @LispMethod(comment = "Given an atomic formula as input, generate and return an English\r\nstring based on the genQuestion assertion for the predicate.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to be used to ask a question\r\n@return string:  a string corresponding to a question for the\r\nformula, or nil if there is no appropriate genQuestion assertion\nGiven an atomic formula as input, generate and return an English\nstring based on the genQuestion assertion for the predicate.")
    public static final SubLObject generate_question_from_genquestion_alt(SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = com.cyc.cycjava.cycl.pph_question.pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject agr_pred = NIL;
                SubLObject justification = NIL;
                SubLObject olist = NIL;
                if (!((NIL == el_formula_p(formula)) || (NIL != com.cyc.cycjava.cycl.pph_question.prefer_past_tense_formP(nl_preds)))) {
                    {
                        SubLObject pred = cycl_utilities.formula_operator(formula);
                        SubLObject q_arg = com.cyc.cycjava.cycl.pph_question.pph_question_arg(formula);
                        SubLObject format_formula = com.cyc.cycjava.cycl.pph_question.get_genquestion_formula(pred, q_arg);
                        if (NIL != format_formula) {
                            thread.resetMultipleValues();
                            {
                                SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list_from_formula(format_formula);
                                SubLObject arg_order_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                olist = pph_methods_formulas.generate_atomic_formula_from_format_string_and_arg_order_list(formula, format_string, arg_order_list, arg_position_map, UNPROVIDED);
                                agr_pred = $$tensed;
                                justification = NIL;
                                string = pph_phrase.pph_phrase_output_list_string(olist, T);
                            }
                        }
                    }
                }
                return values(string, agr_pred, justification, olist);
            }
        }
    }

    /**
     * Given an atomic formula as input, generate and return an English
     * string based on the genQuestion assertion for the predicate.
     *
     * @param FORMULA
     * 		formula; the formula to be used to ask a question
     * @return string:  a string corresponding to a question for the
    formula, or nil if there is no appropriate genQuestion assertion
     */
    @LispMethod(comment = "Given an atomic formula as input, generate and return an English\r\nstring based on the genQuestion assertion for the predicate.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to be used to ask a question\r\n@return string:  a string corresponding to a question for the\r\nformula, or nil if there is no appropriate genQuestion assertion\nGiven an atomic formula as input, generate and return an English\nstring based on the genQuestion assertion for the predicate.")
    public static SubLObject generate_question_from_genquestion(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject olist = NIL;
        final SubLObject demerits = TWO_INTEGER;
        if ((NIL != el_formula_p(formula)) && (NIL == prefer_past_tense_formP(nl_preds))) {
            final SubLObject pred = cycl_utilities.formula_operator(formula);
            final SubLObject q_arg = pph_question_arg(formula);
            final SubLObject format_formula = get_genquestion_formula(pred, q_arg);
            if (NIL != format_formula) {
                thread.resetMultipleValues();
                final SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list_from_formula(format_formula);
                final SubLObject arg_order_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                olist = pph_methods_formulas.generate_atomic_formula_from_format_string_and_arg_order_list(formula, format_string, arg_order_list, arg_position_map, UNPROVIDED);
                agr_pred = $$tensed;
                justification = NIL;
                string = pph_phrase.pph_phrase_output_list_string(olist, T);
            }
        }
        return values(string, agr_pred, justification, olist, demerits);
    }

    public static final SubLObject pph_question_arg_alt(SubLObject formula) {
        {
            SubLObject q_arg = NIL;
            SubLObject arg_num = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject rest = NIL;
            for (rest = args; !((NIL != q_arg) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject arg = rest.first();
                    arg_num = add(arg_num, ONE_INTEGER);
                    if ((NIL != cycl_variables.el_variable_or_keyword_p(arg)) && (NIL != pph_variable_handling.pph_query_var_p(arg))) {
                        q_arg = arg_num;
                    }
                }
            }
            return q_arg;
        }
    }

    public static SubLObject pph_question_arg(final SubLObject formula) {
        SubLObject q_arg = NIL;
        SubLObject arg_num = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == q_arg) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            arg_num = add(arg_num, ONE_INTEGER);
            if ((NIL != cycl_variables.el_variable_or_keyword_p(arg)) && (NIL != pph_variable_handling.pph_query_var_p(arg))) {
                q_arg = arg_num;
            }
        }
        return q_arg;
    }

    /**
     * Get the #$genQuestion formula for the operator
     * RELATION with the q-arg from *pph-language-mt*.
     * The assumption is that operators (relations) may have
     * more than one #$genQuestion template, but there will be
     * no more than one per operator/q-arg pair in each mt.  That is, the
     * various templates for an operator will be distributed
     * in different mts.  This allows generation to vary by
     * changing the value of *pph-language-mt*.
     *
     * @param relation
     * 		--a CYC predicate
     * @param q-arg
     * 		--the arg-num of the argument to be questioned.
     * @return string --a string containing a question on the Q-ARG of RELATION
     */
    @LispMethod(comment = "Get the #$genQuestion formula for the operator\r\nRELATION with the q-arg from *pph-language-mt*.\r\nThe assumption is that operators (relations) may have\r\nmore than one #$genQuestion template, but there will be\r\nno more than one per operator/q-arg pair in each mt.  That is, the\r\nvarious templates for an operator will be distributed\r\nin different mts.  This allows generation to vary by\r\nchanging the value of *pph-language-mt*.\r\n\r\n@param relation\r\n\t\t--a CYC predicate\r\n@param q-arg\r\n\t\t--the arg-num of the argument to be questioned.\r\n@return string --a string containing a question on the Q-ARG of RELATION\nGet the #$genQuestion formula for the operator\nRELATION with the q-arg from *pph-language-mt*.\nThe assumption is that operators (relations) may have\nmore than one #$genQuestion template, but there will be\nno more than one per operator/q-arg pair in each mt.  That is, the\nvarious templates for an operator will be distributed\nin different mts.  This allows generation to vary by\nchanging the value of *pph-language-mt*.")
    public static final SubLObject get_genquestion_formula_alt(SubLObject relation, SubLObject q_arg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gen_q_formula = NIL;
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
                            SubLObject pred_var = $$genQuestion;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, NIL, pred_var);
                                    SubLObject done_var = gen_q_formula;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                        {
                                                            SubLObject done_var_54 = gen_q_formula;
                                                            SubLObject token_var_55 = NIL;
                                                            while (NIL == done_var_54) {
                                                                {
                                                                    SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_55);
                                                                    SubLObject valid_56 = makeBoolean(token_var_55 != as);
                                                                    if (NIL != valid_56) {
                                                                        if (assertions_high.gaf_arg2(as).eql(q_arg)) {
                                                                            gen_q_formula = assertions_high.gaf_formula(as);
                                                                        }
                                                                    }
                                                                    done_var_54 = makeBoolean((NIL == valid_56) || (NIL != gen_q_formula));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != gen_q_formula));
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
                return gen_q_formula;
            }
        }
    }

    /**
     * Get the #$genQuestion formula for the operator
     * RELATION with the q-arg from *pph-language-mt*.
     * The assumption is that operators (relations) may have
     * more than one #$genQuestion template, but there will be
     * no more than one per operator/q-arg pair in each mt.  That is, the
     * various templates for an operator will be distributed
     * in different mts.  This allows generation to vary by
     * changing the value of *pph-language-mt*.
     *
     * @param relation
     * 		--a CYC predicate
     * @param q-arg
     * 		--the arg-num of the argument to be questioned.
     * @return string --a string containing a question on the Q-ARG of RELATION
     */
    @LispMethod(comment = "Get the #$genQuestion formula for the operator\r\nRELATION with the q-arg from *pph-language-mt*.\r\nThe assumption is that operators (relations) may have\r\nmore than one #$genQuestion template, but there will be\r\nno more than one per operator/q-arg pair in each mt.  That is, the\r\nvarious templates for an operator will be distributed\r\nin different mts.  This allows generation to vary by\r\nchanging the value of *pph-language-mt*.\r\n\r\n@param relation\r\n\t\t--a CYC predicate\r\n@param q-arg\r\n\t\t--the arg-num of the argument to be questioned.\r\n@return string --a string containing a question on the Q-ARG of RELATION\nGet the #$genQuestion formula for the operator\nRELATION with the q-arg from *pph-language-mt*.\nThe assumption is that operators (relations) may have\nmore than one #$genQuestion template, but there will be\nno more than one per operator/q-arg pair in each mt.  That is, the\nvarious templates for an operator will be distributed\nin different mts.  This allows generation to vary by\nchanging the value of *pph-language-mt*.")
    public static SubLObject get_genquestion_formula(final SubLObject relation, final SubLObject q_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gen_q_formula = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$genQuestion;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, NIL, pred_var);
                SubLObject done_var = gen_q_formula;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$67 = gen_q_formula;
                            final SubLObject token_var_$68 = NIL;
                            while (NIL == done_var_$67) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$68);
                                final SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(as));
                                if ((NIL != valid_$69) && assertions_high.gaf_arg2(as).eql(q_arg)) {
                                    gen_q_formula = assertions_high.gaf_formula(as);
                                }
                                done_var_$67 = makeBoolean((NIL == valid_$69) || (NIL != gen_q_formula));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != gen_q_formula));
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gen_q_formula;
    }

    public static final SubLObject get_genq_bindings_alt(SubLObject v_bindings) {
        {
            SubLObject tuple = list(bindings.variable_lookup(variables.get_variable(ZERO_INTEGER), v_bindings), bindings.variable_lookup(variables.get_variable(ONE_INTEGER), v_bindings));
            return NIL != tuple.first() ? ((SubLObject) (tuple)) : NIL;
        }
    }

    public static SubLObject get_genq_bindings(final SubLObject v_bindings) {
        final SubLObject tuple = list(bindings.variable_lookup(variables.get_variable(ZERO_INTEGER), v_bindings), bindings.variable_lookup(variables.get_variable(ONE_INTEGER), v_bindings));
        return NIL != tuple.first() ? tuple : NIL;
    }

    /**
     * How many blanks are in STRING?
     */
    @LispMethod(comment = "How many blanks are in STRING?")
    public static final SubLObject pph_blank_count_alt(SubLObject string) {
        return length(string_utilities.search_all(pph_vars.$pph_blank_string$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED));
    }

    /**
     * How many blanks are in STRING?
     */
    @LispMethod(comment = "How many blanks are in STRING?")
    public static SubLObject pph_blank_count(final SubLObject string) {
        return length(string_utilities.search_all(pph_vars.$pph_blank_string$.getGlobalValue(), string, UNPROVIDED, UNPROVIDED));
    }

    /**
     * Given an atomic query-sentence as input, generate and return an English
     * string based on matching #$genTemplate-QuerySentence assertions.
     *
     * @param QUERY-SENTENCE
     * 		query-sentence; the query-sentence to be used to ask a question
     * @return 0 string:  a string corresponding to a question for the
    query-sentence, or nil if there is no appropriate genQuestion assertion
     */
    @LispMethod(comment = "Given an atomic query-sentence as input, generate and return an English\r\nstring based on matching #$genTemplate-QuerySentence assertions.\r\n\r\n@param QUERY-SENTENCE\r\n\t\tquery-sentence; the query-sentence to be used to ask a question\r\n@return 0 string:  a string corresponding to a question for the\r\nquery-sentence, or nil if there is no appropriate genQuestion assertion\nGiven an atomic query-sentence as input, generate and return an English\nstring based on matching #$genTemplate-QuerySentence assertions.")
    public static final SubLObject generate_question_from_query_template_alt(SubLObject query_sentence, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = com.cyc.cycjava.cycl.pph_question.pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject agr_pred = NIL;
                SubLObject justification = NIL;
                SubLObject olist = NIL;
                if (NIL != $pph_use_gtqsP$.getDynamicValue(thread)) {
                    if (NIL == string) {
                        {
                            SubLObject csome_list_var = com.cyc.cycjava.cycl.pph_question.gtqs_assertions_for_query_sentence(query_sentence, nl_preds);
                            SubLObject gtqs_as = NIL;
                            for (gtqs_as = csome_list_var.first(); !((NIL != string) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , gtqs_as = csome_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(atomic_sentenceP(query_sentence), thread);
                                        {
                                            SubLObject phrase = com.cyc.cycjava.cycl.pph_question.pph_phrase_for_query_sentence_from_gtqs_as(gtqs_as, query_sentence, arg_position_map);
                                            if (NIL != com.cyc.cycjava.cycl.pph_question.pph_phrase_ok_for_gtqsP(phrase, query_sentence)) {
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                    format(T, $str_alt37$__Trying____S, gtqs_as);
                                                }
                                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                    pph_phrase.pph_phrase_add_justification(phrase, gtqs_as);
                                                    string = pph_phrase.pph_phrase_string(phrase, T);
                                                    agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                                                    justification = pph_phrase.pph_phrase_justification(phrase);
                                                    olist = pph_phrase.pph_phrase_output_list(phrase);
                                                }
                                            }
                                        }
                                    } finally {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(string, agr_pred, justification, olist);
            }
        }
    }

    /**
     * Given an atomic query-sentence as input, generate and return an English
     * string based on matching #$genTemplate-QuerySentence assertions.
     *
     * @param QUERY-SENTENCE
     * 		query-sentence; the query-sentence to be used to ask a question
     * @return 0 string:  a string corresponding to a question for the
    query-sentence, or nil if there is no appropriate genQuestion assertion
     */
    @LispMethod(comment = "Given an atomic query-sentence as input, generate and return an English\r\nstring based on matching #$genTemplate-QuerySentence assertions.\r\n\r\n@param QUERY-SENTENCE\r\n\t\tquery-sentence; the query-sentence to be used to ask a question\r\n@return 0 string:  a string corresponding to a question for the\r\nquery-sentence, or nil if there is no appropriate genQuestion assertion\nGiven an atomic query-sentence as input, generate and return an English\nstring based on matching #$genTemplate-QuerySentence assertions.")
    public static SubLObject generate_question_from_query_template(final SubLObject query_sentence, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject olist = NIL;
        SubLObject doneP = NIL;
        if ((NIL != $pph_use_gtqsP$.getDynamicValue(thread)) && (NIL == doneP)) {
            SubLObject csome_list_var = gtqs_assertions_for_query_sentence(query_sentence, nl_preds);
            SubLObject gtqs_as = NIL;
            gtqs_as = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                SubLObject error_message = NIL;
                final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind(NIL, thread);
                    pph_error.$pph_error_handling_onP$.bind(T, thread);
                    if (NIL != pph_error.pph_break_on_errorP()) {
                        final SubLObject _prev_bind_0_$71 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                        try {
                            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(atomic_sentenceP(query_sentence), thread);
                            final SubLObject phrase = pph_phrase_for_query_sentence_from_gtqs_as(gtqs_as, query_sentence, arg_position_map);
                            if (NIL != pph_phrase_ok_for_gtqsP(phrase, query_sentence)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format_nil.force_format(T, $str37$__Trying____S, gtqs_as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                    pph_phrase.pph_phrase_add_justification(phrase, gtqs_as);
                                    string = pph_phrase.pph_phrase_string(phrase, T);
                                    agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                                    justification = pph_phrase.pph_phrase_justification(phrase);
                                    olist = pph_phrase.pph_phrase_output_list(phrase);
                                    if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                        doneP = T;
                                    }
                                    if (NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                                        pph_sentence.pph_sentence_add_alternative(phrase);
                                        final SubLObject queue = queues.create_queue(UNPROVIDED);
                                        SubLObject done_count = ZERO_INTEGER;
                                        queues.enqueue(phrase, queue);
                                        while (NIL == queues.queue_empty_p(queue)) {
                                            final SubLObject ignore_me = queues.dequeue(queue);
                                            SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                                            SubLObject alternative = NIL;
                                            alternative = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                pph_sentence.pph_sentence_add_alternative(alternative);
                                                done_count = add(done_count, ONE_INTEGER);
                                                if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                                    final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str40$Done__S_alternatives_of__S) });
                                                    pph_error.pph_handle_error(new_format_string, list(done_count, phrase));
                                                }
                                                queues.enqueue(alternative, queue);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                alternative = cdolist_list_var.first();
                                            } 
                                        } 
                                    }
                                }
                            }
                        } finally {
                            pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$71, thread);
                        }
                    } else {
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$72 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    final SubLObject _prev_bind_0_$73 = pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.bind(atomic_sentenceP(query_sentence), thread);
                                        final SubLObject phrase2 = pph_phrase_for_query_sentence_from_gtqs_as(gtqs_as, query_sentence, arg_position_map);
                                        if (NIL != pph_phrase_ok_for_gtqsP(phrase2, query_sentence)) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                                format_nil.force_format(T, $str37$__Trying____S, gtqs_as, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            pph_main.pph_phrase_generate(phrase2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != pph_phrase.pph_phrase_doneP(phrase2)) {
                                                pph_phrase.pph_phrase_add_justification(phrase2, gtqs_as);
                                                string = pph_phrase.pph_phrase_string(phrase2, T);
                                                agr_pred = pph_phrase.pph_phrase_agr_pred(phrase2);
                                                justification = pph_phrase.pph_phrase_justification(phrase2);
                                                olist = pph_phrase.pph_phrase_output_list(phrase2);
                                                if (NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                                    doneP = T;
                                                }
                                                if (NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                                                    pph_sentence.pph_sentence_add_alternative(phrase2);
                                                    final SubLObject queue2 = queues.create_queue(UNPROVIDED);
                                                    SubLObject done_count2 = ZERO_INTEGER;
                                                    queues.enqueue(phrase2, queue2);
                                                    while (NIL == queues.queue_empty_p(queue2)) {
                                                        final SubLObject ignore_me2 = queues.dequeue(queue2);
                                                        SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_local_alternatives(ignore_me2);
                                                        SubLObject alternative2 = NIL;
                                                        alternative2 = cdolist_list_var2.first();
                                                        while (NIL != cdolist_list_var2) {
                                                            pph_sentence.pph_sentence_add_alternative(alternative2);
                                                            done_count2 = add(done_count2, ONE_INTEGER);
                                                            if (done_count2.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                                                final SubLObject new_format_string2 = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str40$Done__S_alternatives_of__S) });
                                                                pph_error.pph_handle_error(new_format_string2, list(done_count2, phrase2));
                                                            }
                                                            queues.enqueue(alternative2, queue2);
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            alternative2 = cdolist_list_var2.first();
                                                        } 
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        pph_vars.$pph_link_unlinked_phrases_to_matrix_arg0P$.rebind(_prev_bind_0_$73, thread);
                                    }
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$72, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str7$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                        }
                    }
                } finally {
                    pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                }
                if (NIL != error_message) {
                    Errors.warn(error_message);
                }
                csome_list_var = csome_list_var.rest();
                gtqs_as = csome_list_var.first();
            } 
        }
        return values(string, agr_pred, justification, olist);
    }

    public static final SubLObject pph_phrase_ok_for_gtqsP_alt(SubLObject phrase, SubLObject formula) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) && (NIL != pph_templates.pph_phrase_references_precise_argsP(phrase, formula)));
    }

    public static SubLObject pph_phrase_ok_for_gtqsP(final SubLObject phrase, final SubLObject formula) {
        return makeBoolean((NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)) && (NIL != pph_templates.pph_phrase_references_precise_argsP(phrase, formula)));
    }

    public static final SubLObject clear_gen_template_query_sentence_index_alt() {
        if (NIL != dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue())) {
            dictionary.clear_dictionary($gen_template_query_sentence_index$.getGlobalValue());
        }
        $gen_template_query_sentence_index$.setGlobalValue($UNINITIALIZED);
        return $gen_template_query_sentence_index$.getGlobalValue();
    }

    public static SubLObject clear_gen_template_query_sentence_index() {
        if (NIL != dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue())) {
            dictionary.clear_dictionary($gen_template_query_sentence_index$.getGlobalValue());
        }
        $gen_template_query_sentence_index$.setGlobalValue($UNINITIALIZED);
        return $gen_template_query_sentence_index$.getGlobalValue();
    }

    public static final SubLObject add_gen_template_query_sentence_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.pph_question.clear_gen_template_query_sentence_index();
    }

    public static SubLObject add_gen_template_query_sentence(final SubLObject argument, final SubLObject assertion) {
        return clear_gen_template_query_sentence_index();
    }

    public static final SubLObject remove_gen_template_query_sentence_alt(SubLObject argument, SubLObject assertion) {
        return com.cyc.cycjava.cycl.pph_question.clear_gen_template_query_sentence_index();
    }

    public static SubLObject remove_gen_template_query_sentence(final SubLObject argument, final SubLObject assertion) {
        return clear_gen_template_query_sentence_index();
    }

    public static final SubLObject initialize_gen_template_query_sentence_index_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject lock = $gen_template_query_sentence_index_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue())) {
                        dictionary.clear_dictionary($gen_template_query_sentence_index$.getGlobalValue());
                    } else {
                        $gen_template_query_sentence_index$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
                    }
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = $$genTemplate_QuerySentence;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            {
                                                                SubLObject done_var_58 = NIL;
                                                                SubLObject token_var_59 = NIL;
                                                                while (NIL == done_var_58) {
                                                                    {
                                                                        SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_59);
                                                                        SubLObject valid_60 = makeBoolean(token_var_59 != as);
                                                                        if (NIL != valid_60) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            {
                                                                                SubLObject cdolist_list_var = cycl_utilities.expression_gather(assertions_high.gaf_arg1(as), symbol_function(INDEXED_TERM_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                SubLObject v_term = NIL;
                                                                                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                                    dictionary_utilities.dictionary_push($gen_template_query_sentence_index$.getGlobalValue(), v_term, as);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_58 = makeBoolean(NIL == valid_60);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_61, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject unhelpful_keys = NIL;
                        SubLObject threshold = integerDivide(count, THREE_INTEGER);
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($gen_template_query_sentence_index$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject assertions = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != list_utilities.lengthG(assertions, threshold, UNPROVIDED)) {
                                    unhelpful_keys = cons(v_term, unhelpful_keys);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        {
                            SubLObject cdolist_list_var = unhelpful_keys;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                dictionary.dictionary_remove($gen_template_query_sentence_index$.getGlobalValue(), v_term);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject initialize_gen_template_query_sentence_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject release = NIL;
        try {
            release = seize_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            if (NIL != dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue())) {
                dictionary.clear_dictionary($gen_template_query_sentence_index$.getGlobalValue());
            } else {
                $gen_template_query_sentence_index$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            }
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = $$genTemplate_QuerySentence;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$74 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$75 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$76 = NIL;
                                    final SubLObject token_var_$77 = NIL;
                                    while (NIL == done_var_$76) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$77);
                                        final SubLObject valid_$78 = makeBoolean(!token_var_$77.eql(as));
                                        if (NIL != valid_$78) {
                                            count = add(count, ONE_INTEGER);
                                            SubLObject cdolist_list_var = cycl_utilities.expression_gather(assertions_high.gaf_arg1(as), symbol_function(INDEXED_TERM_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject v_term = NIL;
                                            v_term = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                dictionary_utilities.dictionary_push($gen_template_query_sentence_index$.getGlobalValue(), v_term, as);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_term = cdolist_list_var.first();
                                            } 
                                        }
                                        done_var_$76 = makeBoolean(NIL == valid_$78);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$75, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$74, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            final SubLObject threshold = integerDivide(count, THREE_INTEGER);
            SubLObject common_keys = NIL;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($gen_template_query_sentence_index$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject assertions = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != list_utilities.lengthG(assertions, threshold, UNPROVIDED)) {
                    common_keys = cons(v_term2, common_keys);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            SubLObject cdolist_list_var2 = common_keys;
            SubLObject v_term3 = NIL;
            v_term3 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$80 = dictionary.dictionary_lookup_without_values($gen_template_query_sentence_index$.getGlobalValue(), v_term3, UNPROVIDED);
                SubLObject as2 = NIL;
                as2 = cdolist_list_var_$80.first();
                while (NIL != cdolist_list_var_$80) {
                    if (NIL == list_utilities.singletonP(cycl_utilities.expression_gather(assertions_high.gaf_arg1(as2), symbol_function(INDEXED_TERM_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        dictionary_utilities.dictionary_remove_from_value($gen_template_query_sentence_index$.getGlobalValue(), v_term3, as2, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                    as2 = cdolist_list_var_$80.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term3 = cdolist_list_var2.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        return count;
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions in which TERM appears
    in the arg1.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions in which TERM appears\r\nin the arg1.")
    public static final SubLObject gen_template_query_sentence_lookup_alt(SubLObject v_term) {
        {
            SubLObject initializedP = NIL;
            SubLObject lock = $gen_template_query_sentence_index_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                initializedP = dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL == initializedP) {
                com.cyc.cycjava.cycl.pph_question.initialize_gen_template_query_sentence_index();
            }
        }
        {
            SubLObject gtqs_assertions = NIL;
            SubLObject lock = $gen_template_query_sentence_index_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                gtqs_assertions = dictionary.dictionary_lookup($gen_template_query_sentence_index$.getGlobalValue(), v_term, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return list_utilities.remove_if_not($sym46$PPH_VISIBLE_LEXICAL_ASSERTION_, gtqs_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions in which TERM appears
    in the arg1.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions in which TERM appears\r\nin the arg1.")
    public static SubLObject gen_template_query_sentence_lookup(final SubLObject v_term) {
        SubLObject initializedP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            initializedP = dictionary.dictionary_p($gen_template_query_sentence_index$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        if (NIL == initializedP) {
            initialize_gen_template_query_sentence_index();
        }
        SubLObject gtqs_assertions = NIL;
        release = NIL;
        try {
            release = seize_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            gtqs_assertions = dictionary.dictionary_lookup($gen_template_query_sentence_index$.getGlobalValue(), v_term, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($gen_template_query_sentence_index_lock$.getGlobalValue());
            }
        }
        return list_utilities.remove_if_not($sym49$PPH_VISIBLE_LEXICAL_ASSERTION_, gtqs_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_visible_lexical_assertionP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) && (NIL != pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), assertions_high.assertion_mt(assertion))));
        }
    }

    public static SubLObject pph_visible_lexical_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) && (NIL != pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), assertions_high.assertion_mt(assertion))));
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions in which some term
    from QUERY-SENTENCE appears in the arg1.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions in which some term\r\nfrom QUERY-SENTENCE appears in the arg1.")
    public static final SubLObject gen_template_query_sentence_candidates_alt(SubLObject query_sentence) {
        {
            SubLObject counts = dictionary.new_dictionary(symbol_function(EQ), TWENTY_INTEGER);
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(query_sentence, INDEXED_TERM_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_62 = com.cyc.cycjava.cycl.pph_question.gen_template_query_sentence_lookup(v_term);
                    SubLObject gtqs_as = NIL;
                    for (gtqs_as = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , gtqs_as = cdolist_list_var_62.first()) {
                        dictionary_utilities.dictionary_increment(counts, gtqs_as, UNPROVIDED);
                    }
                }
            }
            return Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(counts, symbol_function($sym48$_)));
        }
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions in which some term
    from QUERY-SENTENCE appears in the arg1.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions in which some term\r\nfrom QUERY-SENTENCE appears in the arg1.")
    public static SubLObject gen_template_query_sentence_candidates(final SubLObject query_sentence) {
        final SubLObject counts = dictionary.new_dictionary(symbol_function(EQ), TWENTY_INTEGER);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(query_sentence, INDEXED_TERM_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$81 = gen_template_query_sentence_lookup(v_term);
            SubLObject gtqs_as = NIL;
            gtqs_as = cdolist_list_var_$81.first();
            while (NIL != cdolist_list_var_$81) {
                dictionary_utilities.dictionary_increment(counts, gtqs_as, UNPROVIDED);
                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                gtqs_as = cdolist_list_var_$81.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(counts, symbol_function($sym51$_)));
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions whose arg1 matches
    QUERY-SENTENCE and NL-PREDS.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions whose arg1 matches\r\nQUERY-SENTENCE and NL-PREDS.")
    public static final SubLObject gtqs_assertions_for_query_sentence_alt(SubLObject query_sentence, SubLObject nl_preds) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.pph_question.gen_template_query_sentence_candidates(query_sentence);
            SubLObject gtqs_as = NIL;
            for (gtqs_as = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gtqs_as = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.pph_question.gtqs_assertion_matches_query_sentenceP(gtqs_as, query_sentence, nl_preds)) {
                    ans = cons(gtqs_as, ans);
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP; of genTemplate-QuerySentence assertions whose arg1 matches
    QUERY-SENTENCE and NL-PREDS.
     */
    @LispMethod(comment = "@return LISTP; of genTemplate-QuerySentence assertions whose arg1 matches\r\nQUERY-SENTENCE and NL-PREDS.")
    public static SubLObject gtqs_assertions_for_query_sentence(final SubLObject query_sentence, final SubLObject nl_preds) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = gen_template_query_sentence_candidates(query_sentence);
        SubLObject gtqs_as = NIL;
        gtqs_as = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != gtqs_assertion_matches_query_sentenceP(gtqs_as, query_sentence, nl_preds)) {
                ans = cons(gtqs_as, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gtqs_as = cdolist_list_var.first();
        } 
        return Sort.stable_sort(pph_utilities.pph_sort_assertions(ans, UNPROVIDED, UNPROVIDED), symbol_function($sym51$_), GTQS_ASSERTION_CONSTANT_COUNT);
    }

    public static SubLObject gtqs_assertion_constant_count(final SubLObject gtqs_as) {
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        return length(cycl_utilities.expression_gather(query_sentence_template, CONSTANT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject gtqs_assertion_matches_query_sentenceP_alt(SubLObject gtqs_as, SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), com.cyc.cycjava.cycl.pph_question.gtqs_assertion_bindings_for_query_sentence(gtqs_as, cycl_utilities.hl_to_el(query_sentence), nl_preds));
    }

    public static SubLObject gtqs_assertion_matches_query_sentenceP(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), gtqs_assertion_bindings_for_query_sentence(gtqs_as, pph_standardize_query_sentence(query_sentence), nl_preds));
    }

    /**
     *
     *
     * @return 0 ALIST-P; of (<template-term> -> <arg-pos>) bindings.
     * @return 1 BOOLEANP; Did unification suceed?
     */
    @LispMethod(comment = "@return 0 ALIST-P; of (<template-term> -> <arg-pos>) bindings.\r\n@return 1 BOOLEANP; Did unification suceed?")
    public static final SubLObject gtqs_assertion_bindings_for_query_sentence_internal_alt(SubLObject gtqs_as, SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
                thread.resetMultipleValues();
                {
                    SubLObject query_sentence_template_wX_hl_vars = com.cyc.cycjava.cycl.pph_question.hlify_gtqs_template_variables(query_sentence_template);
                    SubLObject hl_var_to_el_var_or_keyword_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject unification_result = com.cyc.cycjava.cycl.pph_question.pph_question_template_unify(query_sentence_template_wX_hl_vars, query_sentence);
                        if (NIL == unification_result) {
                            return values(NIL, NIL);
                        } else {
                            if (NIL != bindings.unification_success_token_p(unification_result)) {
                                return values(NIL, T);
                            } else {
                                if (NIL != bindings.bindings_p(unification_result)) {
                                    return com.cyc.cycjava.cycl.pph_question.gtqs_bindings_from_unification_bindings(unification_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
                                } else {
                                    if (NIL != set.set_p(unification_result)) {
                                        {
                                            SubLObject set_contents_var = set.do_set_internal(unification_result);
                                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                            SubLObject state = NIL;
                                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                {
                                                    SubLObject one_result = set_contents.do_set_contents_next(basis_object, state);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state, one_result)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject v_bindings = com.cyc.cycjava.cycl.pph_question.gtqs_bindings_from_unification_bindings(one_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
                                                            SubLObject successP = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != successP) {
                                                                return values(v_bindings, successP);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return values(NIL, NIL);
                                    } else {
                                        Errors.error($str_alt50$unexpected_result_from__UNIFY__S_, query_sentence_template_wX_hl_vars, query_sentence, unification_result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return 0 ALIST-P; of (<template-term> -> <arg-pos>) bindings.
     * @return 1 BOOLEANP; Did unification suceed?
     */
    @LispMethod(comment = "@return 0 ALIST-P; of (<template-term> -> <arg-pos>) bindings.\r\n@return 1 BOOLEANP; Did unification suceed?")
    public static SubLObject gtqs_assertion_bindings_for_query_sentence_internal(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        thread.resetMultipleValues();
        final SubLObject query_sentence_template_wX_hl_vars = hlify_gtqs_template_variables(query_sentence_template);
        final SubLObject hl_var_to_el_var_or_keyword_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject unification_result = pph_question_template_unify(query_sentence_template_wX_hl_vars, query_sentence);
        if (NIL == unification_result) {
            return values(NIL, NIL);
        }
        if (NIL != bindings.unification_success_token_p(unification_result)) {
            return values(NIL, T);
        }
        if (NIL != bindings.bindings_p(unification_result)) {
            return gtqs_bindings_from_unification_bindings(unification_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
        }
        if (NIL != set.set_p(unification_result)) {
            final SubLObject set_contents_var = set.do_set_internal(unification_result);
            SubLObject basis_object;
            SubLObject state;
            SubLObject one_result;
            SubLObject v_bindings;
            SubLObject successP;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                one_result = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, one_result)) {
                    thread.resetMultipleValues();
                    v_bindings = gtqs_bindings_from_unification_bindings(one_result, hl_var_to_el_var_or_keyword_bindings, gtqs_as, query_sentence);
                    successP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        return values(v_bindings, successP);
                    }
                }
            }
            return values(NIL, NIL);
        }
        Errors.error($str55$unexpected_result_from__UNIFY__S_, query_sentence_template_wX_hl_vars, query_sentence, unification_result);
        return NIL;
    }

    public static final SubLObject gtqs_assertion_bindings_for_query_sentence_alt(SubLObject gtqs_as, SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_question.gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(gtqs_as, query_sentence, nl_preds);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (gtqs_as.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (query_sentence.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_preds.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(gtqs_as, query_sentence, nl_preds));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject gtqs_assertion_bindings_for_query_sentence(final SubLObject gtqs_as, final SubLObject query_sentence, SubLObject nl_preds) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(gtqs_as, query_sentence, nl_preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (gtqs_as.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (query_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_preds.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(gtqs_assertion_bindings_for_query_sentence_internal(gtqs_as, query_sentence, nl_preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(gtqs_as, query_sentence, nl_preds));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject hlify_gtqs_template_variables_alt(SubLObject query_sentence_template) {
        {
            SubLObject keywords = com.cyc.cycjava.cycl.pph_question.pph_query_sentence_template_keywords(query_sentence_template);
            SubLObject el_vars = com.cyc.cycjava.cycl.pph_question.pph_query_sentence_template_vars(query_sentence_template);
            SubLObject query_sentence_template_wX_hl_vars = copy_expression(query_sentence_template);
            SubLObject hl_var_to_el_var_or_keyword_bindings = NIL;
            SubLObject list_var = NIL;
            SubLObject el_var_or_keyword = NIL;
            SubLObject hl_var_num = NIL;
            for (list_var = append(keywords, el_vars), el_var_or_keyword = list_var.first(), hl_var_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var_or_keyword = list_var.first() , hl_var_num = add(ONE_INTEGER, hl_var_num)) {
                {
                    SubLObject hl_var = variables.get_variable(hl_var_num);
                    query_sentence_template_wX_hl_vars = cycl_utilities.expression_subst(hl_var, el_var_or_keyword, query_sentence_template_wX_hl_vars, UNPROVIDED, UNPROVIDED);
                    hl_var_to_el_var_or_keyword_bindings = cons(bindings.make_variable_binding(hl_var, el_var_or_keyword), hl_var_to_el_var_or_keyword_bindings);
                }
            }
            return values(query_sentence_template_wX_hl_vars, hl_var_to_el_var_or_keyword_bindings);
        }
    }

    public static SubLObject hlify_gtqs_template_variables(final SubLObject query_sentence_template) {
        final SubLObject keywords = pph_query_sentence_template_keywords(query_sentence_template);
        final SubLObject el_vars = pph_query_sentence_template_vars(query_sentence_template);
        SubLObject query_sentence_template_wX_hl_vars = copy_expression(query_sentence_template);
        SubLObject hl_var_to_el_var_or_keyword_bindings = NIL;
        SubLObject list_var = NIL;
        SubLObject el_var_or_keyword = NIL;
        SubLObject hl_var_num = NIL;
        list_var = append(keywords, el_vars);
        el_var_or_keyword = list_var.first();
        for (hl_var_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var_or_keyword = list_var.first() , hl_var_num = add(ONE_INTEGER, hl_var_num)) {
            final SubLObject hl_var = variables.get_variable(hl_var_num);
            query_sentence_template_wX_hl_vars = cycl_utilities.expression_subst(hl_var, el_var_or_keyword, query_sentence_template_wX_hl_vars, UNPROVIDED, UNPROVIDED);
            hl_var_to_el_var_or_keyword_bindings = cons(bindings.make_variable_binding(hl_var, el_var_or_keyword), hl_var_to_el_var_or_keyword_bindings);
        }
        return values(query_sentence_template_wX_hl_vars, hl_var_to_el_var_or_keyword_bindings);
    }

    public static SubLObject non_hypothesized_el_varP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == subl_promotions.memberP(obj, pph_variable_handling.$pph_hypothesized_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return ALIST-P mapping EL vars and templates to arg-positions in QUERY-SENTENCE.
     */
    @LispMethod(comment = "@return ALIST-P mapping EL vars and templates to arg-positions in QUERY-SENTENCE.")
    public static final SubLObject gtqs_bindings_from_unification_bindings_alt(SubLObject unification_result, SubLObject hl_var_to_el_var_or_keyword_bindings, SubLObject gtqs_as, SubLObject query_sentence) {
        unification_result = com.cyc.cycjava.cycl.pph_question.pph_unhide_el_vars(unification_result);
        {
            SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
            SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
            SubLObject query_sentence_template_terms_to_query_sentence_terms = bindings.apply_bindings(hl_var_to_el_var_or_keyword_bindings, unification_result);
            SubLObject arg_position_specifiers = cycl_utilities.expression_gather(phrase_naut, $sym51$PPH_ARG_POSITION_SPECIFIER_, NIL, symbol_function(EQUAL), symbol_function(IDENTITY), NIL);
            {
                SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject template_term = NIL;
                        SubLObject sentence_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt52);
                        template_term = current.first();
                        current = current.rest();
                        sentence_term = current;
                        if ((NIL != cycl_variables.el_varP(template_term)) && (NIL == cycl_variables.el_varP(sentence_term))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                Errors.warn($str_alt53$Failed_to_match__S_to_var_in_sent, template_term, sentence_term);
                            }
                            return values(NIL, NIL);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = arg_position_specifiers;
                SubLObject arg_position_specifier = NIL;
                for (arg_position_specifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_position_specifier = cdolist_list_var.first()) {
                    {
                        SubLObject specified_arg = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence);
                        if (NIL != com.cyc.cycjava.cycl.pph_question.gtqs_specified_arg_matchesP(specified_arg, arg_position_specifier, query_sentence_template, query_sentence_template_terms_to_query_sentence_terms)) {
                            query_sentence_template_terms_to_query_sentence_terms = list_utilities.alist_enter(query_sentence_template_terms_to_query_sentence_terms, arg_position_specifier, specified_arg, UNPROVIDED);
                        }
                    }
                }
            }
            {
                SubLObject query_sentence_template_terms_to_arg_positions = NIL;
                SubLObject el_query_sentence = cycl_utilities.transform_hl_to_el(query_sentence);
                SubLObject failP = NIL;
                SubLObject rest = NIL;
                for (rest = query_sentence_template_terms_to_query_sentence_terms; !((NIL != failP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject cons = rest.first();
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject template_term = NIL;
                        SubLObject sentence_term = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt52);
                        template_term = current.first();
                        current = current.rest();
                        sentence_term = current;
                        {
                            SubLObject arg_position = com.cyc.cycjava.cycl.pph_question.gtqs_one_arg_position(sentence_term, el_query_sentence);
                            if (NIL == pph_utilities.pph_known_arg_position_p(arg_position)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    Errors.warn($str_alt54$Couldn_t_get_arg_position_for__S_, sentence_term, query_sentence);
                                }
                                failP = T;
                            }
                            if (NIL != pph_utilities.pph_known_arg_position_p(arg_position)) {
                                query_sentence_template_terms_to_arg_positions = list_utilities.alist_enter(query_sentence_template_terms_to_arg_positions, template_term, arg_position, UNPROVIDED);
                            }
                        }
                    }
                }
                return values(query_sentence_template_terms_to_arg_positions, makeBoolean(NIL == failP));
            }
        }
    }

    /**
     *
     *
     * @return ALIST-P mapping EL vars and templates to arg-positions in QUERY-SENTENCE.
     */
    @LispMethod(comment = "@return ALIST-P mapping EL vars and templates to arg-positions in QUERY-SENTENCE.")
    public static SubLObject gtqs_bindings_from_unification_bindings(SubLObject unification_result, final SubLObject hl_var_to_el_var_or_keyword_bindings, final SubLObject gtqs_as, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        unification_result = pph_unhide_el_vars(unification_result);
        final SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
        final SubLObject query_sentence_template = assertions_high.gaf_arg1(gtqs_as);
        SubLObject query_sentence_template_terms_to_query_sentence_terms = bindings.apply_bindings(hl_var_to_el_var_or_keyword_bindings, unification_result);
        final SubLObject arg_position_specifiers = cycl_utilities.expression_gather(phrase_naut, $sym56$PPH_ARG_POSITION_SPECIFIER_, NIL, symbol_function(EQUAL), symbol_function(IDENTITY), NIL);
        SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject template_term = NIL;
            SubLObject sentence_term = NIL;
            destructuring_bind_must_consp(current, datum, $list57);
            template_term = current.first();
            current = sentence_term = current.rest();
            if ((NIL != non_hypothesized_el_varP(template_term)) && (NIL == non_hypothesized_el_varP(sentence_term))) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str58$Failed_to_match__S_to_var_in_sent, template_term, sentence_term);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return values(NIL, NIL);
            }
            if ((NIL != non_hypothesized_el_varP(sentence_term)) && (NIL == non_hypothesized_el_varP(template_term))) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str59$Failed_to_match__S_to_var_in_temp, sentence_term, template_term);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                return values(NIL, NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = arg_position_specifiers;
        SubLObject arg_position_specifier = NIL;
        arg_position_specifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject specified_arg = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence);
            if (NIL != gtqs_specified_arg_matchesP(specified_arg, arg_position_specifier, query_sentence_template, query_sentence_template_terms_to_query_sentence_terms)) {
                query_sentence_template_terms_to_query_sentence_terms = list_utilities.alist_enter(query_sentence_template_terms_to_query_sentence_terms, arg_position_specifier, specified_arg, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_position_specifier = cdolist_list_var.first();
        } 
        SubLObject query_sentence_template_terms_to_arg_positions = NIL;
        final SubLObject standardized_query_sentence = pph_standardize_query_sentence(query_sentence);
        SubLObject failP;
        SubLObject rest;
        SubLObject cons2;
        SubLObject current2;
        SubLObject datum2;
        SubLObject template_term2;
        SubLObject sentence_term2;
        SubLObject arg_position;
        for (failP = NIL, rest = NIL, rest = query_sentence_template_terms_to_query_sentence_terms; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
            cons2 = rest.first();
            datum2 = current2 = cons2;
            template_term2 = NIL;
            sentence_term2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list57);
            template_term2 = current2.first();
            current2 = sentence_term2 = current2.rest();
            arg_position = gtqs_one_arg_position(sentence_term2, standardized_query_sentence);
            if (NIL == pph_utilities.pph_known_arg_position_p(arg_position)) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str60$Couldn_t_get_arg_position_for__S_, sentence_term2, query_sentence);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                failP = T;
            }
            if (NIL != pph_utilities.pph_known_arg_position_p(arg_position)) {
                query_sentence_template_terms_to_arg_positions = list_utilities.alist_enter(query_sentence_template_terms_to_arg_positions, template_term2, arg_position, UNPROVIDED);
            }
        }
        return values(query_sentence_template_terms_to_arg_positions, makeBoolean(NIL == failP));
    }

    public static final SubLObject gtqs_one_arg_position_alt(SubLObject sentence_term, SubLObject query_sentence) {
        {
            SubLObject arg_positions = cycl_utilities.arg_positions_bfs(cycl_utilities.hl_to_el(sentence_term), query_sentence, symbol_function(EQUAL));
            return NIL != arg_positions ? ((SubLObject) (arg_positions.first())) : pph_utilities.pph_unknown_arg_position();
        }
    }

    public static SubLObject gtqs_one_arg_position(final SubLObject sentence_term, final SubLObject query_sentence) {
        final SubLObject arg_positions = cycl_utilities.arg_positions_bfs(pph_standardize_query_term(sentence_term), query_sentence, symbol_function(EQUAL));
        return NIL != arg_positions ? arg_positions.first() : pph_utilities.pph_unknown_arg_position();
    }

    public static final SubLObject gtqs_specified_arg_matchesP_alt(SubLObject specified_arg, SubLObject arg_position_specifier, SubLObject query_sentence_template, SubLObject map) {
        {
            SubLObject specified_template_term = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence_template);
            if (specified_template_term.equal(specified_arg)) {
                return T;
            } else {
                if (specified_arg.equal(list_utilities.alist_lookup(map, specified_template_term, symbol_function(EQUAL), UNPROVIDED))) {
                    return T;
                } else {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        Errors.warn($str_alt55$_S_doesn_t_match__S_of__S, specified_arg, arg_position_specifier, query_sentence_template);
                    }
                    return NIL;
                }
            }
        }
    }

    public static SubLObject gtqs_specified_arg_matchesP(final SubLObject specified_arg, final SubLObject arg_position_specifier, final SubLObject query_sentence_template, final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject specified_template_term = pph_utilities.pph_apply_template(arg_position_specifier, query_sentence_template);
        if (specified_template_term.equal(specified_arg)) {
            return T;
        }
        if (specified_arg.equal(list_utilities.alist_lookup(map, specified_template_term, symbol_function(EQUAL), UNPROVIDED))) {
            return T;
        }
        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str61$_S_doesn_t_match__S_of__S, specified_arg, arg_position_specifier, query_sentence_template);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject pph_query_sentence_template_keywords_alt(SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, symbol_function(KEYWORDP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_query_sentence_template_keywords(final SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, symbol_function(KEYWORDP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_query_sentence_template_vars_alt(SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, $sym57$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_query_sentence_template_vars(final SubLObject query_sentence_template) {
        return cycl_utilities.expression_gather(query_sentence_template, $sym63$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_question_template_unify_alt(SubLObject template, SubLObject query_sentence) {
        {
            SubLObject query_sentence_sans_el_vars = com.cyc.cycjava.cycl.pph_question.pph_hide_el_vars(query_sentence);
            SubLObject unification_result = com.cyc.cycjava.cycl.pph_question.pph_unify_gtqs(template, query_sentence_sans_el_vars);
            return unification_result;
        }
    }

    public static SubLObject pph_question_template_unify(final SubLObject template, final SubLObject query_sentence) {
        final SubLObject query_sentence_sans_el_vars = pph_hide_el_vars(query_sentence);
        final SubLObject unification_result = pph_unify_gtqs(template, query_sentence_sans_el_vars);
        return unification_result;
    }

    public static final SubLObject pph_hide_el_vars_alt(SubLObject expression) {
        return cycl_utilities.expression_transform(expression, $sym57$EL_VAR_, EL_VAR_NAME, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_hide_el_vars(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, $sym63$EL_VAR_, EL_VAR_NAME, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject pph_unhide_el_vars_alt(SubLObject expression) {
        return transform_list_utilities.transform(expression, $sym59$EL_VAR_NAME_, MAKE_EL_VAR, UNPROVIDED);
    }

    public static SubLObject pph_unhide_el_vars(final SubLObject expression) {
        return transform_list_utilities.transform(expression, $sym65$EL_VAR_NAME_, MAKE_EL_VAR, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEANP; non-NIL iff we can't quickly rule out unifying FORMULA1 and FORMULA2.
     */
    @LispMethod(comment = "@return BOOLEANP; non-NIL iff we can\'t quickly rule out unifying FORMULA1 and FORMULA2.")
    public static final SubLObject pph_unify_possible_formula_alt(SubLObject formula1, SubLObject formula2) {
        return makeBoolean((NIL != unification.unify_possible(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2))) && (NIL != com.cyc.cycjava.cycl.pph_question.pph_unify_possible_args(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED))));
    }

    /**
     *
     *
     * @return BOOLEANP; non-NIL iff we can't quickly rule out unifying FORMULA1 and FORMULA2.
     */
    @LispMethod(comment = "@return BOOLEANP; non-NIL iff we can\'t quickly rule out unifying FORMULA1 and FORMULA2.")
    public static SubLObject pph_unify_possible_formula(final SubLObject formula1, final SubLObject formula2) {
        return makeBoolean((NIL != unification.unify_possible(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2))) && (NIL != pph_unify_possible_args(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED))));
    }

    /**
     *
     *
     * @return BOOLEANP; non-NIL iff we can't quickly rule out unifying ARGS1 and ARGS2.
     */
    @LispMethod(comment = "@return BOOLEANP; non-NIL iff we can\'t quickly rule out unifying ARGS1 and ARGS2.")
    public static final SubLObject pph_unify_possible_args_alt(SubLObject args1, SubLObject args2) {
        if (args1.isAtom()) {
            return unification.unify_possible(args1, args2);
        } else {
            if (NIL != list_utilities.dotted_list_p(args1)) {
                return unification.unify_possible(args1, args2);
            } else {
                if ((args1.isList() && args2.isList()) && (NIL != list_utilities.same_length_p(args1, args2))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; non-NIL iff we can't quickly rule out unifying ARGS1 and ARGS2.
     */
    @LispMethod(comment = "@return BOOLEANP; non-NIL iff we can\'t quickly rule out unifying ARGS1 and ARGS2.")
    public static SubLObject pph_unify_possible_args(final SubLObject args1, final SubLObject args2) {
        if (args1.isAtom()) {
            return unification.unify_possible(args1, args2);
        }
        if (NIL != list_utilities.dotted_list_p(args1)) {
            return unification.unify_possible(args1, args2);
        }
        if ((args1.isList() && args2.isList()) && (NIL != list_utilities.same_length_p(args1, args2))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject pph_unify_check_recursion_depth_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($pph_unify_recursion_depth$.getDynamicValue(thread).numG($pph_unify_recursion_limit$.getGlobalValue())) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt12$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt13$__, format_nil.format_nil_a_no_copy($str_alt64$Exceeded_PPH_unify_recursion_dept) });
                    pph_error.pph_handle_error(new_format_string, list($pph_unify_recursion_limit$.getGlobalValue()));
                }
            }
            return NIL;
        }
    }

    public static SubLObject pph_unify_check_recursion_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($pph_unify_recursion_depth$.getDynamicValue(thread).numG($pph_unify_recursion_limit$.getGlobalValue())) {
            final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str70$Exceeded_PPH_unify_recursion_dept) });
            pph_error.pph_handle_error(new_format_string, list($pph_unify_recursion_limit$.getGlobalValue()));
        }
        return NIL;
    }

    public static final SubLObject pph_commutative_functor_p_alt(SubLObject functor) {
        return makeBoolean((NIL != forts.fort_p(functor)) && (NIL != fort_types_interface.commutative_relation_p(functor)));
    }

    public static SubLObject pph_commutative_functor_p(final SubLObject functor) {
        return makeBoolean((NIL != forts.fort_p(functor)) && (NIL != fort_types_interface.commutative_relation_p(functor)));
    }

    /**
     * Try to unify TEMPLATE and FORMULA.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA.")
    public static final SubLObject pph_unify_gtqs_alt(SubLObject template, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject result_bindings = NIL;
                {
                    SubLObject _prev_bind_0 = unification.$unify_cons_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = unification.$unify_possible_cons_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = unification.$unify_multipleP$.currentBinding(thread);
                    try {
                        unification.$unify_cons_function$.bind(symbol_function(PPH_UNIFY_FORMULA_TEMPLATE), thread);
                        unification.$unify_possible_cons_function$.bind(symbol_function(PPH_UNIFY_POSSIBLE_FORMULA), thread);
                        unification.$unify_multipleP$.bind(T, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result = unification.unify(template, formula, T, UNPROVIDED);
                            SubLObject justification = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != result) {
                                result_bindings = (NIL != bindings.unification_success_token_p(result)) ? ((SubLObject) (NIL)) : result;
                                successP = T;
                            }
                        }
                    } finally {
                        unification.$unify_multipleP$.rebind(_prev_bind_2, thread);
                        unification.$unify_possible_cons_function$.rebind(_prev_bind_1, thread);
                        unification.$unify_cons_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result_bindings, successP);
            }
        }
    }

    /**
     * Try to unify TEMPLATE and FORMULA.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA.")
    public static SubLObject pph_unify_gtqs(final SubLObject template, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject result_bindings = NIL;
        final SubLObject _prev_bind_0 = unification.$unify_cons_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = unification.$unify_possible_cons_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = unification.$unify_multipleP$.currentBinding(thread);
        try {
            unification.$unify_cons_function$.bind(symbol_function(PPH_UNIFY_FORMULA_TEMPLATE), thread);
            unification.$unify_possible_cons_function$.bind(symbol_function(PPH_UNIFY_POSSIBLE_FORMULA), thread);
            unification.$unify_multipleP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject result = unification.unify(template, formula, T, UNPROVIDED);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                result_bindings = (NIL != bindings.unification_success_token_p(result)) ? NIL : result;
                successP = T;
            }
        } finally {
            unification.$unify_multipleP$.rebind(_prev_bind_3, thread);
            unification.$unify_possible_cons_function$.rebind(_prev_bind_2, thread);
            unification.$unify_cons_function$.rebind(_prev_bind_0, thread);
        }
        return values(result_bindings, successP);
    }

    /**
     * Try to unify TEMPLATE and FORMULA assuming BINDINGS.
     *
     * @unknown - funcalled inside UNIFY.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA assuming BINDINGS.\r\n\r\n@unknown - funcalled inside UNIFY.")
    public static final SubLObject pph_unify_formula_template_alt(SubLObject template, SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_bindings = NIL;
                com.cyc.cycjava.cycl.pph_question.pph_unify_check_recursion_depth();
                {
                    SubLObject _prev_bind_0 = $pph_unify_recursion_depth$.currentBinding(thread);
                    try {
                        $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
                        new_bindings = com.cyc.cycjava.cycl.pph_question.pph_unify_formula_template_memoized(template, formula, v_bindings);
                    } finally {
                        $pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != new_bindings ? ((SubLObject) (new_bindings)) : unification.unify_failure(template, formula);
            }
        }
    }

    /**
     * Try to unify TEMPLATE and FORMULA assuming BINDINGS.
     *
     * @unknown - funcalled inside UNIFY.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA assuming BINDINGS.\r\n\r\n@unknown - funcalled inside UNIFY.")
    public static SubLObject pph_unify_formula_template(final SubLObject template, final SubLObject formula, SubLObject v_bindings) {
        if (v_bindings == UNPROVIDED) {
            v_bindings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_bindings = NIL;
        pph_unify_check_recursion_depth();
        final SubLObject _prev_bind_0 = $pph_unify_recursion_depth$.currentBinding(thread);
        try {
            $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
            new_bindings = pph_unify_formula_template_memoized(template, formula, v_bindings);
        } finally {
            $pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL != new_bindings ? new_bindings : unification.unify_failure(template, formula);
    }

    /**
     * Try to unify TEMPLATE and FORMULA assuming BINDINGS.
     *
     * @unknown - funcalled inside UNIFY.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA assuming BINDINGS.\r\n\r\n@unknown - funcalled inside UNIFY.")
    public static final SubLObject pph_unify_formula_template_memoized_internal_alt(SubLObject template, SubLObject formula, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == unification.$unify_multipleP$.getDynamicValue(thread)) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt12$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt13$__, format_nil.format_nil_a_no_copy($str_alt67$Not_in_unify_multiple_mode_) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject new_bindings = NIL;
                SubLObject template_functor = cycl_utilities.formula_arg0(template);
                SubLObject formula_functor = cycl_utilities.formula_arg0(formula);
                SubLObject functor_result = unification.unify_assuming_bindings(template_functor, formula_functor, T, v_bindings, UNPROVIDED);
                SubLObject functor_bindings = com.cyc.cycjava.cycl.pph_question.unification_bindings_from_result(functor_result);
                SubLObject traceP = NIL;
                if (NIL != list_utilities.sublisp_boolean(functor_result)) {
                    {
                        SubLObject template_args = cycl_utilities.formula_args(template, UNPROVIDED);
                        SubLObject formula_args = cycl_utilities.formula_args(formula, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = $pph_unify_try_arg_permutationsP$.currentBinding(thread);
                            SubLObject _prev_bind_1 = unification.$unify_possible_cons_function$.currentBinding(thread);
                            try {
                                $pph_unify_try_arg_permutationsP$.bind(makeBoolean((template_args.isList() && formula_args.isList()) && ((NIL != com.cyc.cycjava.cycl.pph_question.pph_commutative_functor_p(template_functor)) || (NIL != com.cyc.cycjava.cycl.pph_question.pph_commutative_functor_p(formula_functor)))), thread);
                                unification.$unify_possible_cons_function$.bind(symbol_function(PPH_UNIFY_POSSIBLE_FORMULA), thread);
                                new_bindings = com.cyc.cycjava.cycl.pph_question.pph_unify_args(template_args, formula_args, functor_bindings);
                            } finally {
                                unification.$unify_possible_cons_function$.rebind(_prev_bind_1, thread);
                                $pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                if (NIL != traceP) {
                    if (NIL == new_bindings) {
                        Errors.warn($str_alt68$Couldn_t_unify____S____S______giv, template, formula, v_bindings);
                    }
                    if (NIL != set.set_p(new_bindings)) {
                        Errors.warn($str_alt69$Found_multiple_bindings_for____S_, new SubLObject[]{ template, formula, v_bindings, set.set_element_list(new_bindings) });
                    }
                }
                return new_bindings;
            }
        }
    }

    /**
     * Try to unify TEMPLATE and FORMULA assuming BINDINGS.
     *
     * @unknown - funcalled inside UNIFY.
     */
    @LispMethod(comment = "Try to unify TEMPLATE and FORMULA assuming BINDINGS.\r\n\r\n@unknown - funcalled inside UNIFY.")
    public static SubLObject pph_unify_formula_template_memoized_internal(final SubLObject template, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == unification.$unify_multipleP$.getDynamicValue(thread)) {
            final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str73$Not_in_unify_multiple_mode_) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject new_bindings = NIL;
        final SubLObject template_functor = cycl_utilities.formula_arg0(template);
        final SubLObject formula_functor = cycl_utilities.formula_arg0(formula);
        final SubLObject functor_result = unification.unify_assuming_bindings(template_functor, formula_functor, T, v_bindings, UNPROVIDED);
        final SubLObject functor_bindings = unification_bindings_from_result(functor_result);
        final SubLObject traceP = NIL;
        if (NIL != list_utilities.sublisp_boolean(functor_result)) {
            final SubLObject template_args = cycl_utilities.formula_args(template, UNPROVIDED);
            final SubLObject formula_args = cycl_utilities.formula_args(formula, UNPROVIDED);
            final SubLObject _prev_bind_0 = $pph_unify_try_arg_permutationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = unification.$unify_possible_cons_function$.currentBinding(thread);
            try {
                $pph_unify_try_arg_permutationsP$.bind(makeBoolean((template_args.isList() && formula_args.isList()) && ((NIL != pph_commutative_functor_p(template_functor)) || (NIL != pph_commutative_functor_p(formula_functor)))), thread);
                unification.$unify_possible_cons_function$.bind(symbol_function(PPH_UNIFY_POSSIBLE_FORMULA), thread);
                new_bindings = pph_unify_args(template_args, formula_args, functor_bindings);
            } finally {
                unification.$unify_possible_cons_function$.rebind(_prev_bind_2, thread);
                $pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != traceP) {
            if (NIL == new_bindings) {
                Errors.warn($str74$Couldn_t_unify____S____S______giv, template, formula, v_bindings);
            }
            if (NIL != set.set_p(new_bindings)) {
                Errors.warn($str75$Found_multiple_bindings_for____S_, new SubLObject[]{ template, formula, v_bindings, set.set_element_list(new_bindings) });
            }
        }
        return new_bindings;
    }

    public static final SubLObject pph_unify_formula_template_memoized_alt(SubLObject template, SubLObject formula, SubLObject v_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_question.pph_unify_formula_template_memoized_internal(template, formula, v_bindings);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(template, formula, v_bindings);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (formula.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_bindings.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.pph_unify_formula_template_memoized_internal(template, formula, v_bindings)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, formula, v_bindings));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_unify_formula_template_memoized(final SubLObject template, final SubLObject formula, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_unify_formula_template_memoized_internal(template, formula, v_bindings);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, formula, v_bindings);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_bindings.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_unify_formula_template_memoized_internal(template, formula, v_bindings)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, formula, v_bindings));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject unification_bindings_from_result_alt(SubLObject unification_result) {
        return NIL != bindings.unification_success_token_p(unification_result) ? ((SubLObject) (NIL)) : unification_result;
    }

    public static SubLObject unification_bindings_from_result(final SubLObject unification_result) {
        return NIL != bindings.unification_success_token_p(unification_result) ? NIL : unification_result;
    }

    /**
     * Try to unify the args of a template with the args of a formula.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula.")
    public static final SubLObject pph_unify_args_alt(SubLObject template_args, SubLObject formula_args, SubLObject functor_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.pph_question.pph_unify_check_recursion_depth();
            return com.cyc.cycjava.cycl.pph_question.pph_unify_args_memoized(template_args, formula_args, functor_bindings, $pph_unify_try_arg_permutationsP$.getDynamicValue(thread));
        }
    }

    /**
     * Try to unify the args of a template with the args of a formula.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula.")
    public static SubLObject pph_unify_args(final SubLObject template_args, final SubLObject formula_args, final SubLObject functor_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        return pph_unify_args_memoized(template_args, formula_args, functor_bindings, $pph_unify_try_arg_permutationsP$.getDynamicValue(thread));
    }

    public static final SubLObject pph_unify_args_memoized_internal_alt(SubLObject template_args, SubLObject formula_args, SubLObject assumed_bindings, SubLObject try_permutationsP) {
        {
            SubLObject unification_result = NIL;
            if (NIL == template_args) {
                unification_result = unification.unify_assuming_bindings(template_args, formula_args, T, assumed_bindings, UNPROVIDED);
            } else {
                if (NIL != try_permutationsP) {
                    unification_result = com.cyc.cycjava.cycl.pph_question.pph_unify_args_permutations(template_args, formula_args, assumed_bindings);
                } else {
                    unification_result = com.cyc.cycjava.cycl.pph_question.pph_unify_ordered_args(template_args, formula_args, assumed_bindings);
                }
            }
            return unification_result;
        }
    }

    public static SubLObject pph_unify_args_memoized_internal(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings, final SubLObject try_permutationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unification_result = NIL;
        if (NIL == template_args) {
            unification_result = unification.unify_assuming_bindings(template_args, formula_args, T, assumed_bindings, UNPROVIDED);
        } else
            if ((NIL != try_permutationsP) && (NIL != list_utilities.lengthLE(template_args, $pph_arglist_permutations_max_arity$.getGlobalValue(), UNPROVIDED))) {
                unification_result = pph_unify_args_permutations(template_args, formula_args, assumed_bindings);
            } else {
                if (NIL != try_permutationsP) {
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str77$Skipping_permutations_for_templat, length(template_args), template_args, formula_args);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    return pph_unify_args_memoized(template_args, formula_args, assumed_bindings, NIL);
                }
                unification_result = pph_unify_ordered_args(template_args, formula_args, assumed_bindings);
            }

        return unification_result;
    }

    public static final SubLObject pph_unify_args_memoized_alt(SubLObject template_args, SubLObject formula_args, SubLObject assumed_bindings, SubLObject try_permutationsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.pph_question.pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_UNIFY_ARGS_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_UNIFY_ARGS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PPH_UNIFY_ARGS_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(template_args, formula_args, assumed_bindings, try_permutationsP);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (template_args.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (formula_args.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (assumed_bindings.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && try_permutationsP.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template_args, formula_args, assumed_bindings, try_permutationsP));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject pph_unify_args_memoized(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings, final SubLObject try_permutationsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_UNIFY_ARGS_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_UNIFY_ARGS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_UNIFY_ARGS_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(template_args, formula_args, assumed_bindings, try_permutationsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template_args.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula_args.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (assumed_bindings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && try_permutationsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_unify_args_memoized_internal(template_args, formula_args, assumed_bindings, try_permutationsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template_args, formula_args, assumed_bindings, try_permutationsP));
        return memoization_state.caching_results(results3);
    }

    /**
     * Try to unify the args of a template with the args of a formula in the order they're in.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula in the order they\'re in.")
    public static final SubLObject pph_unify_ordered_args_alt(SubLObject template_args, SubLObject formula_args, SubLObject assumed_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.pph_question.pph_unify_check_recursion_depth();
            {
                SubLObject arg1_result = unification.unify_assuming_bindings(template_args.first(), formula_args.first(), T, assumed_bindings, UNPROVIDED);
                SubLObject arg1_bindings = (NIL != bindings.unification_success_token_p(arg1_result)) ? ((SubLObject) (assumed_bindings)) : arg1_result;
                SubLObject v_bindings = NIL;
                if ((NIL != assumed_bindings) && (NIL != bindings.unification_success_token_p(arg1_result))) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt12$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt13$__, format_nil.format_nil_a_no_copy($str_alt71$Lost_assumed_bindings________S__) });
                        pph_error.pph_handle_error(new_format_string, list(NIL != set.set_p(assumed_bindings) ? ((SubLObject) (set.set_element_list(assumed_bindings))) : assumed_bindings));
                    }
                }
                if (NIL != list_utilities.sublisp_boolean(arg1_result)) {
                    {
                        SubLObject _prev_bind_0 = $pph_unify_try_arg_permutationsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $pph_unify_recursion_depth$.currentBinding(thread);
                        try {
                            $pph_unify_try_arg_permutationsP$.bind(NIL, thread);
                            $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
                            v_bindings = com.cyc.cycjava.cycl.pph_question.pph_unify_args(template_args.rest(), formula_args.rest(), arg1_bindings);
                        } finally {
                            $pph_unify_recursion_depth$.rebind(_prev_bind_1, thread);
                            $pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_bindings;
            }
        }
    }

    /**
     * Try to unify the args of a template with the args of a formula in the order they're in.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula in the order they\'re in.")
    public static SubLObject pph_unify_ordered_args(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        final SubLObject arg1_result = unification.unify_assuming_bindings(template_args.first(), formula_args.first(), T, assumed_bindings, UNPROVIDED);
        final SubLObject arg1_bindings = (NIL != bindings.unification_success_token_p(arg1_result)) ? assumed_bindings : arg1_result;
        SubLObject v_bindings = NIL;
        if ((NIL != assumed_bindings) && (NIL != bindings.unification_success_token_p(arg1_result))) {
            final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str78$Lost_assumed_bindings________S__) });
            pph_error.pph_handle_error(new_format_string, list(NIL != set.set_p(assumed_bindings) ? set.set_element_list(assumed_bindings) : assumed_bindings));
        }
        if (NIL != list_utilities.sublisp_boolean(arg1_result)) {
            final SubLObject _prev_bind_0 = $pph_unify_try_arg_permutationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $pph_unify_recursion_depth$.currentBinding(thread);
            try {
                $pph_unify_try_arg_permutationsP$.bind(NIL, thread);
                $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
                v_bindings = pph_unify_args(template_args.rest(), formula_args.rest(), arg1_bindings);
            } finally {
                $pph_unify_recursion_depth$.rebind(_prev_bind_2, thread);
                $pph_unify_try_arg_permutationsP$.rebind(_prev_bind_0, thread);
            }
        }
        return v_bindings;
    }

    /**
     * Try to unify the args of a template with the args of a formula in any order.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula in any order.")
    public static final SubLObject pph_unify_args_permutations_alt(SubLObject template_args, SubLObject formula_args, SubLObject assumed_bindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.pph_question.pph_unify_check_recursion_depth();
            {
                SubLObject v_bindings = NIL;
                SubLObject permutations = com.cyc.cycjava.cycl.pph_question.pph_arglist_permutations(template_args);
                SubLObject tried_count = ZERO_INTEGER;
                SubLObject impossible_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $pph_unify_recursion_depth$.currentBinding(thread);
                    try {
                        $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
                        {
                            SubLObject cdolist_list_var = permutations;
                            SubLObject template_arg_permutation = NIL;
                            for (template_arg_permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_arg_permutation = cdolist_list_var.first()) {
                                {
                                    SubLObject possibleP = unification.unify_possible(template_arg_permutation, formula_args);
                                    SubLObject this_bindings = (NIL != possibleP) ? ((SubLObject) (com.cyc.cycjava.cycl.pph_question.pph_unify_ordered_args(template_arg_permutation, formula_args, assumed_bindings))) : NIL;
                                    if (NIL == possibleP) {
                                        impossible_count = add(impossible_count, ONE_INTEGER);
                                    } else {
                                        if (NIL == this_bindings) {
                                        } else {
                                            if (NIL == v_bindings) {
                                                v_bindings = this_bindings;
                                            } else {
                                                if (NIL != set.set_p(v_bindings)) {
                                                    set.set_add(this_bindings, v_bindings);
                                                } else {
                                                    v_bindings = set_utilities.new_singleton_set(v_bindings, symbol_function(EQUAL));
                                                    set.set_add(this_bindings, v_bindings);
                                                }
                                            }
                                        }
                                    }
                                }
                                tried_count = add(tried_count, ONE_INTEGER);
                            }
                        }
                    } finally {
                        $pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_bindings;
            }
        }
    }

    /**
     * Try to unify the args of a template with the args of a formula in any order.
     */
    @LispMethod(comment = "Try to unify the args of a template with the args of a formula in any order.")
    public static SubLObject pph_unify_args_permutations(final SubLObject template_args, final SubLObject formula_args, final SubLObject assumed_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_unify_check_recursion_depth();
        SubLObject v_bindings = NIL;
        final SubLObject permutations = pph_arglist_permutations(template_args);
        SubLObject tried_count = ZERO_INTEGER;
        SubLObject impossible_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $pph_unify_recursion_depth$.currentBinding(thread);
        try {
            $pph_unify_recursion_depth$.bind(number_utilities.f_1X($pph_unify_recursion_depth$.getDynamicValue(thread)), thread);
            SubLObject cdolist_list_var = permutations;
            SubLObject template_arg_permutation = NIL;
            template_arg_permutation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject possibleP = unification.unify_possible(template_arg_permutation, formula_args);
                final SubLObject this_bindings = (NIL != possibleP) ? pph_unify_ordered_args(template_arg_permutation, formula_args, assumed_bindings) : NIL;
                if (NIL == possibleP) {
                    impossible_count = add(impossible_count, ONE_INTEGER);
                } else
                    if (NIL != this_bindings) {
                        if (NIL == v_bindings) {
                            v_bindings = this_bindings;
                        } else
                            if (NIL != set.set_p(v_bindings)) {
                                set.set_add(this_bindings, v_bindings);
                            } else {
                                v_bindings = set_utilities.new_singleton_set(v_bindings, symbol_function(EQUAL));
                                set.set_add(this_bindings, v_bindings);
                            }

                    }

                tried_count = add(tried_count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                template_arg_permutation = cdolist_list_var.first();
            } 
        } finally {
            $pph_unify_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return v_bindings;
    }

    /**
     *
     *
     * @return LISTP of permutations of ARGLIST.
     */
    @LispMethod(comment = "@return LISTP of permutations of ARGLIST.")
    public static final SubLObject pph_arglist_permutations_alt(SubLObject arglist) {
        {
            SubLObject argnum_list = list_utilities.num_list(length(arglist), UNPROVIDED);
            SubLObject argnum_permutations = list_utilities.permute_list(argnum_list, NIL);
            SubLObject arglist_permutations = NIL;
            SubLObject cdolist_list_var = argnum_permutations;
            SubLObject argnum_permutation = NIL;
            for (argnum_permutation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum_permutation = cdolist_list_var.first()) {
                {
                    SubLObject this_arglist_perm = NIL;
                    SubLObject cdolist_list_var_63 = argnum_permutation;
                    SubLObject argnum = NIL;
                    for (argnum = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , argnum = cdolist_list_var_63.first()) {
                        this_arglist_perm = cons(nth(argnum, arglist), this_arglist_perm);
                    }
                    arglist_permutations = cons(this_arglist_perm, arglist_permutations);
                }
            }
            return arglist_permutations;
        }
    }

    /**
     *
     *
     * @return LISTP of permutations of ARGLIST.
     */
    @LispMethod(comment = "@return LISTP of permutations of ARGLIST.")
    public static SubLObject pph_arglist_permutations(final SubLObject arglist) {
        final SubLObject argnum_list = list_utilities.num_list(length(arglist), UNPROVIDED);
        final SubLObject argnum_permutations = list_utilities.permute_list(argnum_list, NIL);
        SubLObject arglist_permutations = NIL;
        SubLObject cdolist_list_var = argnum_permutations;
        SubLObject argnum_permutation = NIL;
        argnum_permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject this_arglist_perm = NIL;
            SubLObject cdolist_list_var_$82 = argnum_permutation;
            SubLObject argnum = NIL;
            argnum = cdolist_list_var_$82.first();
            while (NIL != cdolist_list_var_$82) {
                this_arglist_perm = cons(nth(argnum, arglist), this_arglist_perm);
                cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                argnum = cdolist_list_var_$82.first();
            } 
            arglist_permutations = cons(this_arglist_perm, arglist_permutations);
            cdolist_list_var = cdolist_list_var.rest();
            argnum_permutation = cdolist_list_var.first();
        } 
        return arglist_permutations;
    }

    public static final SubLObject pph_phrase_for_query_sentence_from_gtqs_as_alt(SubLObject gtqs_as, SubLObject query_sentence, SubLObject arg_position_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
                SubLObject v_pph_phrase = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_keep_generic_argsP$.bind(NIL, thread);
                        v_pph_phrase = pph_templates.pph_phrasify_phrase_naut(phrase_naut, pph_utilities.pph_new_empty_map());
                    } finally {
                        pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject query_sentence_template_terms_to_query_sentence_terms = com.cyc.cycjava.cycl.pph_question.gtqs_assertion_bindings_for_query_sentence(gtqs_as, query_sentence, UNPROVIDED);
                    if (NIL != query_sentence_template_terms_to_query_sentence_terms) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt72$__GTQS_Bindings___S___Map___S, query_sentence_template_terms_to_query_sentence_terms, arg_position_map);
                        }
                    }
                    {
                        SubLObject el_query_sentence = cycl_utilities.transform_hl_to_el(query_sentence);
                        SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject template_term = NIL;
                                SubLObject local_arg_position = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt73);
                                template_term = current.first();
                                current = current.rest();
                                local_arg_position = current;
                                thread.resetMultipleValues();
                                {
                                    SubLObject sentence_term = pph_utilities.pph_dereference_arg_position(el_query_sentence, local_arg_position);
                                    SubLObject problemP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != problemP) {
                                        {
                                            SubLObject new_format_string = cconcatenate($str_alt12$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt13$__, format_nil.format_nil_a_no_copy($str_alt74$GTQS__Couldn_t_find__S_in____S__) });
                                            pph_error.pph_handle_error(new_format_string, list(local_arg_position, query_sentence));
                                        }
                                    }
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                        format(T, $str_alt75$GTQS__Replacing__S_with__S__S, new SubLObject[]{ template_term, sentence_term, pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map) });
                                    }
                                    {
                                        SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
                                        SubLObject replacedP = pph_phrase.pph_phrase_cycl_subst(sentence_term, template_term, v_pph_phrase, symbol_function(EQUAL), global_arg_position);
                                        if (NIL == replacedP) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                Errors.warn($str_alt76$GTQS__Couldn_t_replace__S_for__S_, sentence_term, template_term, v_pph_phrase);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                pph_phrase.pph_phrase_try_to_resolve_binding_phrases(v_pph_phrase);
                return v_pph_phrase;
            }
        }
    }

    public static SubLObject pph_phrase_for_query_sentence_from_gtqs_as(final SubLObject gtqs_as, final SubLObject query_sentence, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject phrase_naut = assertions_high.gaf_arg2(gtqs_as);
        SubLObject v_pph_phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_keep_generic_argsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_resolve_bindings_phrasesP$.currentBinding(thread);
        try {
            pph_vars.$pph_keep_generic_argsP$.bind(NIL, thread);
            pph_vars.$pph_resolve_bindings_phrasesP$.bind(NIL, thread);
            v_pph_phrase = pph_templates.pph_phrasify_phrase_naut(phrase_naut, pph_utilities.pph_new_empty_map());
        } finally {
            pph_vars.$pph_resolve_bindings_phrasesP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_keep_generic_argsP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject query_sentence_template_terms_to_query_sentence_terms = gtqs_assertion_bindings_for_query_sentence(gtqs_as, query_sentence, UNPROVIDED);
        if (NIL == query_sentence_template_terms_to_query_sentence_terms) {
            return NIL;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str79$__GTQS_Bindings___S___Map___S, query_sentence_template_terms_to_query_sentence_terms, arg_position_map, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        replace_gtqs_template_terms(query_sentence, v_pph_phrase, query_sentence_template_terms_to_query_sentence_terms, arg_position_map);
        pph_phrase.pph_phrase_try_to_resolve_binding_phrases(v_pph_phrase, UNPROVIDED);
        return v_pph_phrase;
    }

    public static SubLObject replace_gtqs_template_terms(final SubLObject query_sentence, final SubLObject v_pph_phrase, final SubLObject query_sentence_template_terms_to_query_sentence_terms, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject standardized_query_sentence = pph_standardize_query_sentence(query_sentence);
        SubLObject cdolist_list_var = query_sentence_template_terms_to_query_sentence_terms;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject template_term = NIL;
            SubLObject local_arg_position = NIL;
            destructuring_bind_must_consp(current, datum, $list80);
            template_term = current.first();
            current = local_arg_position = current.rest();
            thread.resetMultipleValues();
            final SubLObject sentence_term = pph_utilities.pph_dereference_arg_position(standardized_query_sentence, local_arg_position);
            final SubLObject problemP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != problemP) {
                final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str81$GTQS__Couldn_t_find__S_in____S__) });
                pph_error.pph_handle_error(new_format_string, list(local_arg_position, query_sentence));
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str82$__GTQS__Replacing__S_with__S__S__, template_term, sentence_term, pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (!template_term.equal(sentence_term)) {
                final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
                SubLObject replacedP = pph_phrase.pph_phrase_cycl_subst(sentence_term, template_term, v_pph_phrase, symbol_function(EQUAL), global_arg_position);
                if ((NIL != pph_phrase.pph_variable_binding_phrase_p(v_pph_phrase)) && (NIL != pph_phrase.pph_variable_binding_phrase_phrase_naut_subst(v_pph_phrase, template_term, sentence_term))) {
                    replacedP = T;
                }
                if (((NIL == replacedP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str83$GTQS__Couldn_t_replace__S_for__S_, sentence_term, template_term, v_pph_phrase);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return v_pph_phrase;
    }

    public static final SubLObject dummy_query_sentence_for_gtqs_assertion_alt(SubLObject gtqs_as) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_sentence = copy_expression(assertions_high.gaf_arg1(gtqs_as));
                SubLObject keywords = com.cyc.cycjava.cycl.pph_question.pph_query_sentence_template_keywords(query_sentence);
                SubLObject cdolist_list_var = keywords;
                SubLObject keyword = NIL;
                for (keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyword = cdolist_list_var.first()) {
                    {
                        SubLObject constraint_col = pph_variable_handling.pph_variable_isa_constraints(keyword, query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                        SubLObject col = (NIL != constraint_col) ? ((SubLObject) (constraint_col)) : $$Thing;
                        SubLObject instance = make_ternary_formula($$InstanceNamedFn_Ternary, $$$example, col, Guids.guid_to_string(Guids.new_guid()));
                        query_sentence = cycl_utilities.expression_subst(instance, keyword, query_sentence, UNPROVIDED, UNPROVIDED);
                    }
                }
                return narts_high.nart_expand(czer_main.canonicalize_term(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread)));
            }
        }
    }

    public static SubLObject dummy_query_sentence_for_gtqs_assertion(final SubLObject gtqs_as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_sentence = copy_expression(assertions_high.gaf_arg1(gtqs_as));
        SubLObject cdolist_list_var;
        final SubLObject keywords = cdolist_list_var = pph_query_sentence_template_keywords(query_sentence);
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constraint_col = pph_variable_handling.pph_variable_isa_constraints(keyword, query_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
            final SubLObject col = (NIL != constraint_col) ? constraint_col : $$Thing;
            final SubLObject instance = make_ternary_formula($$InstanceNamedFn_Ternary, $$$example, col, Guids.guid_to_string(Guids.new_guid()));
            query_sentence = cycl_utilities.expression_subst(instance, keyword, query_sentence, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        return narts_high.nart_expand(czer_main.canonicalize_term(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread)));
    }

    public static final SubLObject verify_all_gtqs_assertions_alt(SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $int$30;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    thread.resetMultipleValues();
                    {
                        SubLObject _prev_bind_0_64 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            {
                                SubLObject reuseP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                try {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject _prev_bind_0_65 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                        try {
                                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                            {
                                                SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject _prev_bind_0_66 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                    try {
                                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                        {
                                                            SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                            {
                                                                SubLObject _prev_bind_0_67 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                                        Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            {
                                                                                SubLObject total = kb_indexing.num_predicate_extent_index($$genTemplate_QuerySentence, UNPROVIDED);
                                                                                SubLObject sofar = ZERO_INTEGER;
                                                                                SubLObject matched = ZERO_INTEGER;
                                                                                SubLObject time = NIL;
                                                                                SubLObject time_var = get_internal_real_time();
                                                                                {
                                                                                    SubLObject _prev_bind_0_68 = $last_percent_progress_index$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_69 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                                                    try {
                                                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                                                        $within_noting_percent_progress$.bind(T, thread);
                                                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                                        noting_percent_progress_preamble($str_alt81$Checking___genTemplate_QuerySente);
                                                                                        {
                                                                                            SubLObject pred_var = $$genTemplate_QuerySentence;
                                                                                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                                                                {
                                                                                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                                                                    SubLObject done_var = NIL;
                                                                                                    SubLObject token_var = NIL;
                                                                                                    while (NIL == done_var) {
                                                                                                        {
                                                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                                            if (NIL != valid) {
                                                                                                                {
                                                                                                                    SubLObject final_index_iterator = NIL;
                                                                                                                    try {
                                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                        {
                                                                                                                            SubLObject done_var_70 = NIL;
                                                                                                                            SubLObject token_var_71 = NIL;
                                                                                                                            while (NIL == done_var_70) {
                                                                                                                                {
                                                                                                                                    SubLObject gtqs_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_71);
                                                                                                                                    SubLObject valid_72 = makeBoolean(token_var_71 != gtqs_as);
                                                                                                                                    if (NIL != valid_72) {
                                                                                                                                        {
                                                                                                                                            SubLObject okP = com.cyc.cycjava.cycl.pph_question.verify_one_gtqs_assertion(gtqs_as, cutoff);
                                                                                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                                                                                            if (NIL != okP) {
                                                                                                                                                matched = add(matched, ONE_INTEGER);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        note_percent_progress(sofar, total);
                                                                                                                                    }
                                                                                                                                    done_var_70 = makeBoolean(NIL == valid_72);
                                                                                                                                }
                                                                                                                            } 
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_73, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            done_var = makeBoolean(NIL == valid);
                                                                                                        }
                                                                                                    } 
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        noting_percent_progress_postamble();
                                                                                    } finally {
                                                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_69, thread);
                                                                                        $last_percent_progress_index$.rebind(_prev_bind_0_68, thread);
                                                                                    }
                                                                                }
                                                                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                format(T, $str_alt82$__Matched__S_of__S___genTemplate_, new SubLObject[]{ matched, total, time });
                                                                            }
                                                                        } finally {
                                                                            {
                                                                                SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                    }
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_67, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_66, thread);
                                                    }
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_65, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL == reuseP) {
                                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_75, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_64, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject verify_all_gtqs_assertions(SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $int$30;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$83 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$84 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$85 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$86 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject total = kb_indexing.num_predicate_extent_index($$genTemplate_QuerySentence, UNPROVIDED);
                                    SubLObject sofar = ZERO_INTEGER;
                                    SubLObject matched = ZERO_INTEGER;
                                    SubLObject time = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    final SubLObject _prev_bind_0_$87 = $last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$88 = $last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$89 = $within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        try {
                                            noting_percent_progress_preamble($str88$Checking___genTemplate_QuerySente);
                                            final SubLObject pred_var = $$genTemplate_QuerySentence;
                                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                                final SubLObject str = NIL;
                                                final SubLObject _prev_bind_0_$88 = $progress_start_time$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$89 = $progress_last_pacification_time$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$90 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                                final SubLObject _prev_bind_3_$93 = $progress_notification_count$.currentBinding(thread);
                                                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                                                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                                                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                                                try {
                                                    $progress_start_time$.bind(get_universal_time(), thread);
                                                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                                    $progress_count$.bind(ZERO_INTEGER, thread);
                                                    $is_noting_progressP$.bind(T, thread);
                                                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                                    noting_progress_preamble(str);
                                                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                                    SubLObject done_var = NIL;
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            note_progress();
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                SubLObject done_var_$94 = NIL;
                                                                final SubLObject token_var_$95 = NIL;
                                                                while (NIL == done_var_$94) {
                                                                    final SubLObject gtqs_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$95);
                                                                    final SubLObject valid_$96 = makeBoolean(!token_var_$95.eql(gtqs_as));
                                                                    if (NIL != valid_$96) {
                                                                        final SubLObject okP = verify_one_gtqs_assertion(gtqs_as, cutoff);
                                                                        sofar = add(sofar, ONE_INTEGER);
                                                                        if (NIL != okP) {
                                                                            matched = add(matched, ONE_INTEGER);
                                                                        }
                                                                        note_percent_progress(sofar, total);
                                                                    }
                                                                    done_var_$94 = makeBoolean(NIL == valid_$96);
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    } 
                                                    noting_progress_postamble();
                                                } finally {
                                                    $silent_progressP$.rebind(_prev_bind_8, thread);
                                                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                                    $progress_count$.rebind(_prev_bind_6, thread);
                                                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                                    $progress_notification_count$.rebind(_prev_bind_3_$93, thread);
                                                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$90, thread);
                                                    $progress_last_pacification_time$.rebind(_prev_bind_1_$89, thread);
                                                    $progress_start_time$.rebind(_prev_bind_0_$88, thread);
                                                }
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                noting_percent_progress_postamble();
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                                            }
                                        }
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2_$89, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$88, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_$87, thread);
                                    }
                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    format(T, $str89$__Matched__S_of__S___genTemplate_, new SubLObject[]{ matched, total, time });
                                } finally {
                                    final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$86, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$85, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$84, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$83, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject verify_one_gtqs_assertion_alt(SubLObject gtqs_as, SubLObject cutoff) {
        {
            SubLObject query_sentence = com.cyc.cycjava.cycl.pph_question.dummy_query_sentence_for_gtqs_assertion(gtqs_as);
            return com.cyc.cycjava.cycl.pph_question.verify_one_gtqs_assertion_with_query_sentence(gtqs_as, cutoff, query_sentence);
        }
    }

    public static SubLObject verify_one_gtqs_assertion(final SubLObject gtqs_as, final SubLObject cutoff) {
        final SubLObject query_sentence = dummy_query_sentence_for_gtqs_assertion(gtqs_as);
        return verify_one_gtqs_assertion_with_query_sentence(gtqs_as, cutoff, query_sentence);
    }

    public static final SubLObject verify_one_gtqs_assertion_with_query_sentence_alt(SubLObject gtqs_as, SubLObject cutoff, SubLObject query_sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                SubLObject found_assertions = NIL;
                SubLObject timed_outP = NIL;
                SubLObject tag = with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_76 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(cutoff, tag);
                                            found_assertions = com.cyc.cycjava.cycl.pph_question.gtqs_assertions_for_query_sentence(query_sentence, $ANY);
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_76, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_77, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                if (NIL != timed_outP) {
                    Errors.warn($str_alt83$Timed_out_after__S_seconds_on____, cutoff, gtqs_as);
                } else {
                    if (NIL == memberP(gtqs_as, found_assertions, UNPROVIDED, UNPROVIDED)) {
                        Errors.warn($str_alt84$Didn_t_find_gtqs_in_matches_____S, gtqs_as);
                    } else {
                        okP = T;
                    }
                }
                return okP;
            }
        }
    }

    public static SubLObject verify_one_gtqs_assertion_with_query_sentence(final SubLObject gtqs_as, final SubLObject cutoff, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        SubLObject found_assertions = NIL;
        SubLObject timed_outP = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$101 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(cutoff, tag);
                        found_assertions = gtqs_assertions_for_query_sentence(query_sentence, $ANY);
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$101, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != timed_outP) {
            Errors.warn($str90$Timed_out_after__S_seconds_on____, cutoff, gtqs_as);
        } else
            if (NIL == subl_promotions.memberP(gtqs_as, found_assertions, UNPROVIDED, UNPROVIDED)) {
                Errors.warn($str91$Didn_t_find_gtqs_in_matches_____S, gtqs_as);
            } else {
                okP = T;
            }

        return okP;
    }

    /**
     * The brute-force way of generating a question for a formula, used as a last resort.
     * Resulting strings read like quiz questions from a logic textbook.
     *
     * @param FORMULA
     * 		formula; the formula to paraphrase as a question
     * @param NL-PREDS;
     * 		LISTP of agreement preds.
     * @param TYPE
     * 		keyword; :VARS = Print variables, :BLANKS = Print blanks.
     * @return string; a string asking the question
     */
    @LispMethod(comment = "The brute-force way of generating a question for a formula, used as a last resort.\r\nResulting strings read like quiz questions from a logic textbook.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to paraphrase as a question\r\n@param NL-PREDS;\r\n\t\tLISTP of agreement preds.\r\n@param TYPE\r\n\t\tkeyword; :VARS = Print variables, :BLANKS = Print blanks.\r\n@return string; a string asking the question\nThe brute-force way of generating a question for a formula, used as a last resort.\nResulting strings read like quiz questions from a logic textbook.")
    public static final SubLObject generate_question_bf_alt(SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject type) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = com.cyc.cycjava.cycl.pph_question.pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_vars = list_utilities.remove_if_not(PPH_QUERY_VAR_P, pph_variable_handling.pph_formula_free_variables(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject negationP = NIL;
                SubLObject not_arg_position = pph_utilities.pph_unknown_arg_position();
                SubLObject duplicate_varsP = NIL;
                SubLObject pastP = com.cyc.cycjava.cycl.pph_question.prefer_past_tense_formP(nl_preds);
                SubLObject string = NIL;
                SubLObject pred = NIL;
                SubLObject just = NIL;
                SubLObject olist = NIL;
                if (NIL == duplicate_varsP) {
                    {
                        SubLObject csome_list_var = query_vars;
                        SubLObject var = NIL;
                        for (var = csome_list_var.first(); !((NIL != duplicate_varsP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var = csome_list_var.first()) {
                            duplicate_varsP = list_utilities.tree_countG(var, formula, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                if (NIL == query_vars) {
                    while (NIL != el_negation_p(formula)) {
                        formula = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                        not_arg_position = pph_utilities.pph_arg_position_lookup($list_alt27, arg_position_map);
                        arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG1);
                        negationP = makeBoolean(NIL == negationP);
                    } 
                }
                if (NIL == memberP(type, $list_alt86, UNPROVIDED, UNPROVIDED)) {
                    type = (NIL != pph_vars.$pph_blanks_for_varsP$.getDynamicValue(thread)) ? ((SubLObject) ($BLANKS)) : $VARS;
                }
                if (type == $BLANKS) {
                    {
                        SubLObject map = NIL;
                        SubLObject cdolist_list_var = obsolete.formula_variables(formula, UNPROVIDED, UNPROVIDED);
                        SubLObject var = NIL;
                        for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                            map = list_utilities.alist_enter(map, var, pph_vars.$pph_blank_string$.getGlobalValue(), UNPROVIDED);
                        }
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
                            try {
                                pph_vars.$pph_term_paraphrase_map$.bind(map, thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject string_78 = pph_main.generate_text(formula, nl_preds, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                                    SubLObject pred_79 = thread.secondMultipleValue();
                                    SubLObject just_80 = thread.thirdMultipleValue();
                                    SubLObject olist_81 = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_78;
                                    pred = pred_79;
                                    just = just_80;
                                    olist = olist_81;
                                }
                            } finally {
                                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.pph_question.question_rop_formulaP(formula)) {
                        {
                            SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                                thread.resetMultipleValues();
                                {
                                    SubLObject string_82 = com.cyc.cycjava.cycl.pph_question.pph_question_declarative_string(formula, nl_preds, arg_position_map, UNPROVIDED, UNPROVIDED);
                                    SubLObject pred_83 = thread.secondMultipleValue();
                                    SubLObject just_84 = thread.thirdMultipleValue();
                                    SubLObject olist_85 = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    string = string_82;
                                    pred = pred_83;
                                    just = just_84;
                                    olist = olist_85;
                                }
                            } finally {
                                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (NIL == query_vars) {
                            {
                                SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                                    {
                                        SubLObject preambles = com.cyc.cycjava.cycl.pph_question.pph_brute_force_yes_no_preamble_strings(negationP, pastP);
                                        SubLObject preamble_items = com.cyc.cycjava.cycl.pph_question.new_pph_phrase_filler_items(preambles);
                                        if (NIL != negationP) {
                                            pph_data_structures.pph_phrase_output_item_set_cycl(preamble_items.first(), $$not);
                                            pph_data_structures.pph_phrase_output_item_set_arg_position(preamble_items.first(), not_arg_position);
                                            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(preamble_items.first(), $$not);
                                        }
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject declarative_paraphrase = com.cyc.cycjava.cycl.pph_question.pph_question_declarative_string(formula, nl_preds, arg_position_map, T, query_vars);
                                            SubLObject declarative_pred = thread.secondMultipleValue();
                                            SubLObject declarative_just = thread.thirdMultipleValue();
                                            SubLObject declarative_olist = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            pred = declarative_pred;
                                            olist = declarative_olist;
                                            just = declarative_just;
                                        }
                                        {
                                            SubLObject cdolist_list_var = reverse(preamble_items);
                                            SubLObject item = NIL;
                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                olist = cons(item, olist);
                                            }
                                        }
                                        string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                    }
                                } finally {
                                    pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = query_vars;
                                SubLObject query_var = NIL;
                                for (query_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_var = cdolist_list_var.first()) {
                                    pph_methods_formulas.maybe_register_var_by_arg_constraints(query_var, formula);
                                }
                            }
                            {
                                SubLObject lexify_varsP = com.cyc.cycjava.cycl.pph_question.pph_brute_force_wh_lexify_query_varsP(query_vars, formula);
                                SubLObject remove_var_typing_clausesP = lexify_varsP;
                                SubLObject preamble_olist = com.cyc.cycjava.cycl.pph_question.pph_brute_force_wh_preamble_olist(query_vars, pastP, formula, arg_position_map, lexify_varsP);
                                thread.resetMultipleValues();
                                {
                                    SubLObject declarative_paraphrase = com.cyc.cycjava.cycl.pph_question.pph_question_declarative_string(formula, nl_preds, arg_position_map, remove_var_typing_clausesP, query_vars);
                                    SubLObject declarative_pred = thread.secondMultipleValue();
                                    SubLObject declarative_just = thread.thirdMultipleValue();
                                    SubLObject declarative_olist = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (declarative_paraphrase.isString()) {
                                        pred = declarative_pred;
                                        just = declarative_just;
                                        olist = nconc(preamble_olist, declarative_olist);
                                        string = pph_phrase.pph_phrase_output_list_string(olist, T);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(string, pred, just, olist);
            }
        }
    }

    /**
     * The brute-force way of generating a question for a formula, used as a last resort.
     * Resulting strings read like quiz questions from a logic textbook.
     *
     * @param FORMULA
     * 		formula; the formula to paraphrase as a question
     * @param NL-PREDS;
     * 		LISTP of agreement preds.
     * @param TYPE
     * 		keyword; :VARS = Print variables, :BLANKS = Print blanks.
     * @return string; a string asking the question
     */
    @LispMethod(comment = "The brute-force way of generating a question for a formula, used as a last resort.\r\nResulting strings read like quiz questions from a logic textbook.\r\n\r\n@param FORMULA\r\n\t\tformula; the formula to paraphrase as a question\r\n@param NL-PREDS;\r\n\t\tLISTP of agreement preds.\r\n@param TYPE\r\n\t\tkeyword; :VARS = Print variables, :BLANKS = Print blanks.\r\n@return string; a string asking the question\nThe brute-force way of generating a question for a formula, used as a last resort.\nResulting strings read like quiz questions from a logic textbook.")
    public static SubLObject generate_question_bf(SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject type) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_vars = pph_utilities.pph_sort_variables(list_utilities.remove_if_not(PPH_QUERY_VAR_P, pph_variable_handling.pph_formula_free_variables(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject negationP = NIL;
        SubLObject not_arg_position = pph_utilities.pph_unknown_arg_position();
        SubLObject duplicate_varsP = NIL;
        final SubLObject pastP = prefer_past_tense_formP(nl_preds);
        SubLObject string = NIL;
        SubLObject pred = NIL;
        SubLObject just = NIL;
        SubLObject olist = NIL;
        SubLObject demerits = NIL;
        if (NIL == duplicate_varsP) {
            SubLObject csome_list_var;
            SubLObject var;
            for (csome_list_var = query_vars, var = NIL, var = csome_list_var.first(); (NIL == duplicate_varsP) && (NIL != csome_list_var); duplicate_varsP = list_utilities.tree_countG(var, formula, ONE_INTEGER, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , var = csome_list_var.first()) {
            }
        }
        if (NIL == subl_promotions.memberP(type, $list93, UNPROVIDED, UNPROVIDED)) {
            type = (NIL != pph_vars.$pph_blanks_for_varsP$.getDynamicValue(thread)) ? $BLANKS : $VARS;
        }
        if ((NIL == query_vars) && (type == $VARS)) {
            while (NIL != el_negation_p(formula)) {
                formula = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                not_arg_position = pph_utilities.pph_arg_position_lookup($list27, arg_position_map);
                arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, $ARG1);
                negationP = makeBoolean(NIL == negationP);
            } 
        }
        if (type == $BLANKS) {
            SubLObject map = NIL;
            SubLObject cdolist_list_var = obsolete.formula_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject var2 = NIL;
            var2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                map = list_utilities.alist_enter(map, var2, pph_vars.$pph_blank_string$.getGlobalValue(), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            } 
            SubLTrampolineFile.enforceType(map, ALIST_P);
            final SubLObject _prev_bind_0 = pph_vars.$pph_term_paraphrase_map$.currentBinding(thread);
            try {
                pph_vars.$pph_term_paraphrase_map$.bind(map, thread);
                thread.resetMultipleValues();
                final SubLObject string_$103 = pph_main.generate_text(formula, nl_preds, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), pph_vars.$paraphrase_mode$.getDynamicValue(thread), UNPROVIDED);
                final SubLObject pred_$104 = thread.secondMultipleValue();
                final SubLObject just_$105 = thread.thirdMultipleValue();
                final SubLObject olist_$106 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                string = string_$103;
                pred = pred_$104;
                just = just_$105;
                olist = olist_$106;
                if (NIL != cycl_string.cycl_string_p(string)) {
                    string = pph_string.pph_string_from_cycl_string(string);
                }
            } finally {
                pph_vars.$pph_term_paraphrase_map$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != question_rop_formulaP(formula)) {
                final SubLObject _prev_bind_2 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                try {
                    pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject string_$104 = pph_question_declarative_string(formula, nl_preds, arg_position_map, UNPROVIDED, UNPROVIDED);
                    final SubLObject pred_$105 = thread.secondMultipleValue();
                    final SubLObject just_$106 = thread.thirdMultipleValue();
                    final SubLObject olist_$107 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    string = string_$104;
                    pred = pred_$105;
                    just = just_$106;
                    olist = olist_$107;
                } finally {
                    pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_2, thread);
                }
            } else
                if (NIL == query_vars) {
                    final SubLObject _prev_bind_2 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                        final SubLObject preambles = pph_brute_force_yes_no_preamble_strings(negationP, pastP);
                        final SubLObject preamble_items = new_pph_phrase_filler_items(preambles);
                        if (NIL != negationP) {
                            pph_data_structures.pph_phrase_output_item_set_cycl(preamble_items.first(), $$not);
                            pph_data_structures.pph_phrase_output_item_set_arg_position(preamble_items.first(), not_arg_position);
                            pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(preamble_items.first(), $$not);
                        }
                        thread.resetMultipleValues();
                        final SubLObject declarative_paraphrase = pph_question_declarative_string(formula, nl_preds, arg_position_map, T, query_vars);
                        final SubLObject declarative_pred = thread.secondMultipleValue();
                        final SubLObject declarative_just = thread.thirdMultipleValue();
                        final SubLObject declarative_olist = thread.fourthMultipleValue();
                        final SubLObject declarative_demerits = thread.fifthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != declarative_paraphrase) {
                            pred = declarative_pred;
                            olist = declarative_olist;
                            just = declarative_just;
                            demerits = declarative_demerits;
                        }
                        if (NIL != list_utilities.non_empty_list_p(olist)) {
                            SubLObject cdolist_list_var2 = reverse(preamble_items);
                            SubLObject item = NIL;
                            item = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                olist = cons(item, olist);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                item = cdolist_list_var2.first();
                            } 
                            string = pph_phrase.pph_phrase_output_list_string(olist, T);
                        }
                    } finally {
                        pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_2, thread);
                    }
                } else {
                    SubLObject cdolist_list_var3 = query_vars;
                    SubLObject query_var = NIL;
                    query_var = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        pph_methods_formulas.maybe_register_var_by_arg_constraints(query_var, formula);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        query_var = cdolist_list_var3.first();
                    } 
                    final SubLObject remove_var_typing_clausesP;
                    final SubLObject lexify_varsP = remove_var_typing_clausesP = pph_brute_force_wh_lexify_query_varsP(query_vars, formula);
                    final SubLObject preamble_olist = pph_brute_force_wh_preamble_olist(query_vars, pastP, formula, arg_position_map, lexify_varsP);
                    thread.resetMultipleValues();
                    final SubLObject declarative_paraphrase = pph_question_declarative_string(formula, nl_preds, arg_position_map, remove_var_typing_clausesP, query_vars);
                    final SubLObject declarative_pred = thread.secondMultipleValue();
                    final SubLObject declarative_just = thread.thirdMultipleValue();
                    final SubLObject declarative_olist = thread.fourthMultipleValue();
                    final SubLObject declarative_demerits = thread.fifthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pph_string.pph_string_p(declarative_paraphrase)) {
                        pred = declarative_pred;
                        just = declarative_just;
                        olist = nconc(preamble_olist, declarative_olist);
                        string = pph_phrase.pph_phrase_output_list_string(olist, T);
                        demerits = declarative_demerits;
                    }
                }


        return values(string, pred, just, olist, demerits);
    }

    public static final SubLObject pph_brute_force_yes_no_preamble_strings_alt(SubLObject negationP, SubLObject pastP) {
        if (negationP == UNPROVIDED) {
            negationP = NIL;
        }
        if (pastP == UNPROVIDED) {
            pastP = NIL;
        }
        {
            SubLObject aux = (NIL != pastP) ? ((SubLObject) ($str_alt90$was_)) : $str_alt91$is_;
            SubLObject true_or_false_string = com.cyc.cycjava.cycl.pph_question.pph_brute_force_true_or_false_string(negationP);
            SubLObject preamble = cconcatenate(aux, cconcatenate($str_alt92$it_, format_nil.format_nil_a_no_copy(true_or_false_string)));
            return list(preamble, $$$that);
        }
    }

    public static SubLObject pph_brute_force_yes_no_preamble_strings(SubLObject negationP, SubLObject pastP) {
        if (negationP == UNPROVIDED) {
            negationP = NIL;
        }
        if (pastP == UNPROVIDED) {
            pastP = NIL;
        }
        final SubLObject aux = (NIL != pastP) ? $$$was_ : $$$is_;
        final SubLObject true_or_false_string = pph_brute_force_true_or_false_string(negationP);
        final SubLObject preamble = cconcatenate(aux, cconcatenate($$$it_, format_nil.format_nil_a_no_copy(true_or_false_string)));
        return list(preamble, $$$that);
    }

    public static final SubLObject pph_brute_force_true_or_false_string_alt(SubLObject negationP) {
        return NIL != negationP ? ((SubLObject) (com.cyc.cycjava.cycl.pph_question.pph_brute_force_false_string())) : $$$true;
    }

    public static SubLObject pph_brute_force_true_or_false_string(final SubLObject negationP) {
        return NIL != negationP ? pph_brute_force_false_string() : $$$true;
    }

    public static final SubLObject pph_brute_force_false_string_alt() {
        return NIL != com.cyc.cycjava.cycl.pph_question.pph_brute_force_capitalize_false_string_p() ? ((SubLObject) ($$$FALSE)) : $$$false;
    }

    public static SubLObject pph_brute_force_false_string() {
        return NIL != pph_brute_force_capitalize_false_string_p() ? $$$FALSE : $$$false;
    }

    /**
     * Should we capitalize FALSE in 'Is it false that...' to make it more obvious?
     */
    @LispMethod(comment = "Should we capitalize FALSE in \'Is it false that...\' to make it more obvious?")
    public static final SubLObject pph_brute_force_capitalize_false_string_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(pph_vars.$pph_capitalize_false_stringP$.getDynamicValue(thread));
        }
    }

    /**
     * Should we capitalize FALSE in 'Is it false that...' to make it more obvious?
     */
    @LispMethod(comment = "Should we capitalize FALSE in \'Is it false that...\' to make it more obvious?")
    public static SubLObject pph_brute_force_capitalize_false_string_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_vars.$pph_capitalize_false_stringP$.getDynamicValue(thread));
    }/**
     * Should we capitalize FALSE in 'Is it false that...' to make it more obvious?
     */


    public static final SubLObject pph_brute_force_wh_preamble_olist_alt(SubLObject unscoped_vars, SubLObject pastP, SubLObject formula, SubLObject arg_position_map, SubLObject lexify_varsP) {
        {
            SubLObject preamble_1_olist = com.cyc.cycjava.cycl.pph_question.pph_brute_force_wh_phrase_olist(unscoped_vars, formula, arg_position_map, lexify_varsP);
            SubLObject preamble_2 = cconcatenate(NIL != pastP ? ((SubLObject) ($$$were)) : $$$are, $str_alt99$_there_such_that);
            SubLObject preamble_2_olist = list(com.cyc.cycjava.cycl.pph_question.new_pph_phrase_filler_item(preamble_2));
            return nconc(preamble_1_olist, preamble_2_olist);
        }
    }

    public static SubLObject pph_brute_force_wh_preamble_olist(final SubLObject unscoped_vars, final SubLObject pastP, final SubLObject formula, final SubLObject arg_position_map, final SubLObject lexify_varsP) {
        final SubLObject preamble_1_olist = pph_brute_force_wh_phrase_olist(unscoped_vars, formula, arg_position_map, lexify_varsP);
        final SubLObject preamble_2 = cconcatenate(NIL != pastP ? $$$were : $$$are, $$$_there_such_that);
        final SubLObject preamble_2_olist = list(new_pph_phrase_filler_item(preamble_2));
        return nconc(preamble_1_olist, preamble_2_olist);
    }

    /**
     * Generate a PPH-OUTPUT-LIST-P for the 'wh' phrase.
     */
    @LispMethod(comment = "Generate a PPH-OUTPUT-LIST-P for the \'wh\' phrase.")
    public static final SubLObject pph_brute_force_wh_phrase_olist_alt(SubLObject query_vars, SubLObject formula, SubLObject arg_position_map, SubLObject lexify_varsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject olist = NIL;
                if (NIL != lexify_varsP) {
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_use_wh_for_query_varsP$.bind(T, thread);
                            {
                                SubLObject raw_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, $list_alt100, $AND, UNPROVIDED);
                                olist = com.cyc.cycjava.cycl.pph_question.pph_brute_force_olist_set_arg_positions(raw_olist, formula, arg_position_map);
                            }
                        } finally {
                            pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                            pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                            {
                                SubLObject preamble_1a = $$$what_values_of;
                                SubLObject preamble_1b_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, NIL, $AND, UNPROVIDED);
                                olist = com.cyc.cycjava.cycl.pph_question.pph_brute_force_olist_set_arg_positions(preamble_1b_olist, formula, arg_position_map);
                                olist = cons(com.cyc.cycjava.cycl.pph_question.new_pph_phrase_filler_item(preamble_1a), olist);
                            }
                        } finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_1, thread);
                            pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return olist;
            }
        }
    }

    /**
     * Generate a PPH-OUTPUT-LIST-P for the 'wh' phrase.
     */
    @LispMethod(comment = "Generate a PPH-OUTPUT-LIST-P for the \'wh\' phrase.")
    public static SubLObject pph_brute_force_wh_phrase_olist(final SubLObject query_vars, final SubLObject formula, final SubLObject arg_position_map, final SubLObject lexify_varsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = NIL;
        if (NIL != lexify_varsP) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind(T, thread);
                final SubLObject raw_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, $list108, $AND, UNPROVIDED);
                olist = pph_brute_force_olist_set_arg_positions(raw_olist, formula, arg_position_map);
            } finally {
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_wh_for_query_varsP$.bind(NIL, thread);
                pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                final SubLObject preamble_1a = $$$what_values_of;
                final SubLObject preamble_1b_olist = pph_methods_formulas.generate_juncts_output_list(query_vars, NIL, $AND, UNPROVIDED);
                olist = pph_brute_force_olist_set_arg_positions(preamble_1b_olist, formula, arg_position_map);
                olist = cons(new_pph_phrase_filler_item(preamble_1a), olist);
            } finally {
                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0, thread);
            }
        }
        return olist;
    }/**
     * Generate a PPH-OUTPUT-LIST-P for the 'wh' phrase.
     */


    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn't directly correspond to
    anything in the input formula.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn\'t directly correspond to\r\nanything in the input formula.")
    public static final SubLObject new_pph_phrase_filler_item_alt(SubLObject string) {
        return pph_data_structures.new_pph_phrase_output_item(string, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn't directly correspond to
    anything in the input formula.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn\'t directly correspond to\r\nanything in the input formula.")
    public static SubLObject new_pph_phrase_filler_item(final SubLObject string) {
        return pph_data_structures.new_pph_phrase_output_item(string, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn't directly correspond to
    anything in the input formula.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn\'t directly correspond to\r\nanything in the input formula.")
    public static final SubLObject new_pph_phrase_filler_items_alt(SubLObject strings) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject str = NIL;
            for (str = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , str = cdolist_list_var.first()) {
                ans = cons(pph_data_structures.new_pph_phrase_output_item(str, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            }
            return reverse(ans);
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn't directly correspond to
    anything in the input formula.
     */
    @LispMethod(comment = "@return PPH-PHRASE-OUTPUT-ITEM-P; for STRING, which doesn\'t directly correspond to\r\nanything in the input formula.")
    public static SubLObject new_pph_phrase_filler_items(final SubLObject strings) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject str = NIL;
        str = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(pph_data_structures.new_pph_phrase_output_item(str, pph_utilities.pph_unknown_arg_position(), pph_phrase.pph_empty_cycl(), UNPROVIDED, UNPROVIDED, UNPROVIDED), ans);
            cdolist_list_var = cdolist_list_var.rest();
            str = cdolist_list_var.first();
        } 
        return reverse(ans);
    }

    /**
     * Set the arg-positions in RAW-OLIST using FORMULA and ARG-POSITION-MAP.
     */
    @LispMethod(comment = "Set the arg-positions in RAW-OLIST using FORMULA and ARG-POSITION-MAP.")
    public static final SubLObject pph_brute_force_olist_set_arg_positions_alt(SubLObject raw_olist, SubLObject formula, SubLObject arg_position_map) {
        {
            SubLObject olist = NIL;
            SubLObject cdolist_list_var = nreverse(raw_olist);
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                {
                    SubLObject cycl = pph_data_structures.pph_phrase_output_item_cycl(item);
                    SubLObject arg_positions = cycl_utilities.arg_positions_dfs(cycl, formula, UNPROVIDED);
                    SubLObject local_arg_position = (NIL != arg_positions) ? ((SubLObject) (arg_positions.first())) : pph_utilities.pph_unknown_arg_position();
                    SubLObject old_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
                    SubLObject new_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
                    if (!new_arg_position.equal(old_arg_position)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt103$__Setting_arg_position_of__S_to__, new SubLObject[]{ cycl, new_arg_position, old_arg_position });
                        }
                        pph_data_structures.pph_phrase_output_item_set_arg_position(item, new_arg_position);
                    }
                }
                olist = cons(item, olist);
            }
            return olist;
        }
    }

    /**
     * Set the arg-positions in RAW-OLIST using FORMULA and ARG-POSITION-MAP.
     */
    @LispMethod(comment = "Set the arg-positions in RAW-OLIST using FORMULA and ARG-POSITION-MAP.")
    public static SubLObject pph_brute_force_olist_set_arg_positions(final SubLObject raw_olist, final SubLObject formula, final SubLObject arg_position_map) {
        SubLObject olist = NIL;
        SubLObject cdolist_list_var = nreverse(raw_olist);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject arg_positions = cycl_utilities.arg_positions_dfs(cycl, formula, UNPROVIDED);
            final SubLObject local_arg_position = (NIL != arg_positions) ? arg_positions.first() : pph_utilities.pph_unknown_arg_position();
            final SubLObject old_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(item);
            final SubLObject new_arg_position = pph_utilities.pph_arg_position_lookup(local_arg_position, arg_position_map);
            if (!new_arg_position.equal(old_arg_position)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str111$__Setting_arg_position_of__S_to__, cycl, new_arg_position, old_arg_position, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, new_arg_position);
            }
            olist = cons(item, olist);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return olist;
    }/**
     * Set the arg-positions in RAW-OLIST using FORMULA and ARG-POSITION-MAP.
     */


    public static final SubLObject pph_brute_force_wh_lexify_query_varsP_alt(SubLObject query_vars, SubLObject query_formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max = ONE_INTEGER;
                return makeBoolean(!(((((((NIL != sublisp_true()) || (NIL != list_utilities.lengthG(query_vars, max, UNPROVIDED))) || (NIL != pph_vars.pph_maximize_linksP())) || (NIL == pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread))) || (NIL != el_existential_p(query_formula))) || (NIL != find_if($sym104$PPH_VAR_REGISTERED_AS_DEFAULT_, query_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != find_if(PPH_EXCEPTIONAL_VAR_P, query_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
            }
        }
    }

    public static SubLObject pph_brute_force_wh_lexify_query_varsP(final SubLObject query_vars, final SubLObject query_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max = ONE_INTEGER;
        return makeBoolean(((((((NIL == sublisp_true()) && (NIL == list_utilities.lengthG(query_vars, max, UNPROVIDED))) && (NIL == pph_vars.pph_maximize_linksP())) && (NIL != pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread))) && (NIL == el_existential_p(query_formula))) && (NIL == find_if($sym112$PPH_VAR_REGISTERED_AS_DEFAULT_, query_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == find_if(PPH_EXCEPTIONAL_VAR_P, query_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return STRINGP; A paraphrase of QUERY-FORMULA as a declarative statement, sans final
    punctuation and initial capitalization
     */
    @LispMethod(comment = "@return STRINGP; A paraphrase of QUERY-FORMULA as a declarative statement, sans final\r\npunctuation and initial capitalization")
    public static final SubLObject pph_question_declarative_string_alt(SubLObject query_formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject remove_redundant_var_typing_clausesP, SubLObject query_vars) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (remove_redundant_var_typing_clausesP == UNPROVIDED) {
            remove_redundant_var_typing_clausesP = NIL;
        }
        if (query_vars == UNPROVIDED) {
            query_vars = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = NIL;
                SubLObject agr_pred = NIL;
                SubLObject justification = NIL;
                SubLObject olist = NIL;
                if (NIL != remove_redundant_var_typing_clausesP) {
                    {
                        SubLObject template = com.cyc.cycjava.cycl.pph_question.pph_remove_redundant_query_var_typing_clauses(query_formula, query_vars, arg_position_map);
                        if (NIL == pph_utilities.pph_identity_template_p(template)) {
                            query_formula = pph_utilities.pph_apply_template(template, query_formula);
                            arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, template);
                        }
                    }
                }
                {
                    SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(query_formula, arg_position_map, UNPROVIDED);
                    if (NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
                        pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
                    }
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_hide_explicit_universalsP$.bind(makeBoolean((NIL != pph_vars.$pph_hide_explicit_universalsP$.getDynamicValue(thread)) && (NIL == pph_vars.pph_maximize_linksP())), thread);
                            {
                                SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                                try {
                                    pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            pph_vars.$pph_hide_explicit_universalsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
                        agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                        justification = pph_phrase.pph_phrase_justification(phrase);
                        olist = pph_phrase.pph_phrase_output_list(phrase);
                    }
                }
                return values(string, agr_pred, justification, olist);
            }
        }
    }

    /**
     *
     *
     * @return STRINGP; A paraphrase of QUERY-FORMULA as a declarative statement, sans final
    punctuation and initial capitalization
     */
    @LispMethod(comment = "@return STRINGP; A paraphrase of QUERY-FORMULA as a declarative statement, sans final\r\npunctuation and initial capitalization")
    public static SubLObject pph_question_declarative_string(SubLObject query_formula, final SubLObject nl_preds, SubLObject arg_position_map, SubLObject remove_redundant_var_typing_clausesP, SubLObject query_vars) {
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        if (remove_redundant_var_typing_clausesP == UNPROVIDED) {
            remove_redundant_var_typing_clausesP = NIL;
        }
        if (query_vars == UNPROVIDED) {
            query_vars = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject olist = NIL;
        SubLObject demerits = NIL;
        if (NIL != remove_redundant_var_typing_clausesP) {
            final SubLObject template = pph_remove_redundant_query_var_typing_clauses(query_formula, query_vars, arg_position_map);
            if (NIL == pph_utilities.pph_identity_template_p(template)) {
                query_formula = pph_utilities.pph_apply_template(template, query_formula);
                arg_position_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, template);
            }
        }
        final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(query_formula, arg_position_map, UNPROVIDED);
        if (NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
            pph_phrase.pph_phrase_set_agr_preds(phrase, nl_preds, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding(thread);
        try {
            pph_vars.$pph_hide_explicit_universalsP$.bind(makeBoolean((NIL != pph_vars.$pph_hide_explicit_universalsP$.getDynamicValue(thread)) && (NIL == pph_vars.pph_maximize_linksP())), thread);
            final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
            try {
                pph_main.pph_phrase_generate(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                }
            }
        } finally {
            pph_vars.$pph_hide_explicit_universalsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
            agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            justification = pph_phrase.pph_phrase_justification(phrase);
            olist = pph_phrase.pph_phrase_output_list(phrase);
            demerits = pph_phrase.pph_phrase_demerits(phrase);
        }
        return values(string, agr_pred, justification, olist, demerits);
    }

    public static final SubLObject pph_remove_redundant_query_var_typing_clauses_alt(SubLObject query_formula, SubLObject query_vars, SubLObject arg_position_map) {
        {
            SubLObject template = pph_methods_formulas.remove_var_typing_clauses(query_formula, query_vars, arg_position_map, UNPROVIDED);
            return $ERROR == template ? ((SubLObject) (pph_utilities.pph_identity_template())) : template;
        }
    }

    public static SubLObject pph_remove_redundant_query_var_typing_clauses(final SubLObject query_formula, final SubLObject query_vars, final SubLObject arg_position_map) {
        final SubLObject template = pph_methods_formulas.remove_var_typing_clauses(query_formula, query_vars, arg_position_map, UNPROVIDED);
        return $ERROR == template ? pph_utilities.pph_identity_template() : template;
    }

    /**
     *
     *
     * @return BOOLEAN; Is FORMULA, or does it contain, a #$TheResultOfParsing expression
    starting with a question word?
     */
    @LispMethod(comment = "@return BOOLEAN; Is FORMULA, or does it contain, a #$TheResultOfParsing expression\r\nstarting with a question word?")
    public static final SubLObject question_rop_formulaP_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == el_formula_p(formula)) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.pph_question.rop_formulaP(formula)) {
                    {
                        SubLObject string = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                        SubLObject ans = NIL;
                        {
                            SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                            try {
                                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                                {
                                    SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                                    {
                                        SubLObject _prev_bind_0_87 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                Errors.error($str_alt5$Invalid_attempt_to_reuse_memoizat);
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    if (NIL == ans) {
                                                        {
                                                            SubLObject csome_list_var = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            SubLObject word = NIL;
                                                            for (word = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                                                                ans = makeBoolean((NIL != lexicon_accessors.closed_lexical_class_stringP(word, UNPROVIDED)) && ((NIL != lexicon_accessors.string_is_posP(word, $$WHWord, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != lexicon_accessors.string_is_posP(word, $$AuxVerb, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_88, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_87, thread);
                                        }
                                    }
                                }
                            } finally {
                                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return ans;
                    }
                } else {
                    if (NIL != formula_with_sequence_termP(formula)) {
                        return NIL;
                    } else {
                        if (NIL != term.nautP(formula, UNPROVIDED)) {
                            return find_if($sym109$QUESTION_ROP_FORMULA_, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is FORMULA, or does it contain, a #$TheResultOfParsing expression
    starting with a question word?
     */
    @LispMethod(comment = "@return BOOLEAN; Is FORMULA, or does it contain, a #$TheResultOfParsing expression\r\nstarting with a question word?")
    public static SubLObject question_rop_formulaP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == el_formula_p(formula)) {
            return NIL;
        }
        if (NIL != rop_formulaP(formula)) {
            final SubLObject string = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            SubLObject ans = NIL;
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
                final SubLObject _prev_bind_0_$112 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (NIL == ans) {
                            SubLObject csome_list_var;
                            SubLObject word;
                            for (csome_list_var = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), word = NIL, word = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = makeBoolean((NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP(word, UNPROVIDED)) && ((NIL != lexicon_accessors.string_is_posP(word, $$WHWord, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != lexicon_accessors.string_is_posP(word, $$AuxVerb, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) , csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$112, thread);
                }
            } finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        if (NIL != formula_with_sequence_termP(formula)) {
            return NIL;
        }
        if (NIL != term.nautP(formula, UNPROVIDED)) {
            return find_if($sym117$QUESTION_ROP_FORMULA_, cycl_utilities.formula_args(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject rop_formulaP_alt(SubLObject obj) {
        return el_formula_with_operator_p(obj, $$TheResultOfParsing);
    }

    public static SubLObject rop_formulaP(final SubLObject obj) {
        return el_formula_with_operator_p(obj, $$TheResultOfParsing);
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE an NP whose semantics is, or contains, an EL variable
    for which bindings are desired?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE an NP whose semantics is, or contains, an EL variable\r\nfor which bindings are desired?")
    public static final SubLObject question_var_npP_alt(SubLObject phrase) {
        if (NIL == pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, T))) {
            return NIL;
        } else {
            if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
                return pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
            } else {
                if (NIL != com.cyc.cycjava.cycl.pph_question.el_var_det_nbarP(phrase)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE an NP whose semantics is, or contains, an EL variable
    for which bindings are desired?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE an NP whose semantics is, or contains, an EL variable\r\nfor which bindings are desired?")
    public static SubLObject question_var_npP(final SubLObject phrase) {
        if (NIL == pph_phrase_maybe_npP(phrase)) {
            return NIL;
        }
        if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
            return pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
        }
        if (NIL != el_var_det_nbarP(phrase)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_phrase_maybe_npP(final SubLObject phrase) {
        if (NIL != pph_utilities.pph_npP(pph_phrase.pph_phrase_category(phrase, T))) {
            return T;
        }
        if (NIL == pph_phrase.pph_phrase_category_unknown_p(phrase)) {
            return NIL;
        }
        final SubLObject agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        if ((NIL != agr_pred) && ((NIL != pph_utilities.pph_genl_pos_predP($$nounStrings, agr_pred, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_pos_predP(agr_pred, $$nounStrings, UNPROVIDED)))) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE an NP whose det or nbar daughter's semantics is an EL variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE an NP whose det or nbar daughter\'s semantics is an EL variable?")
    public static final SubLObject el_var_det_nbarP_alt(SubLObject phrase) {
        if (NIL == list_utilities.lengthE(pph_phrase.pph_phrase_dtrs(phrase), TWO_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        {
            SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
            SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER);
            if ((((NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(nbar_dtr, UNPROVIDED))) && (NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(nbar_dtr, UNPROVIDED)))) && ((NIL != pph_phrase.pph_phrase_definite_articleP(det_dtr)) || (NIL != pph_phrase.pph_phrase_indefinite_articleP(det_dtr)))) && (NIL != pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(nbar_dtr, UNPROVIDED)))) {
                return T;
            } else {
                if (((NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(det_dtr, UNPROVIDED))) && (NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(det_dtr, UNPROVIDED)))) && (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(det_dtr, UNPROVIDED), $$Determiner, UNPROVIDED))) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is PHRASE an NP whose det or nbar daughter's semantics is an EL variable?
     */
    @LispMethod(comment = "@return BOOLEAN; Is PHRASE an NP whose det or nbar daughter\'s semantics is an EL variable?")
    public static SubLObject el_var_det_nbarP(final SubLObject phrase) {
        if (NIL == list_utilities.lengthE(pph_phrase.pph_phrase_dtrs(phrase), TWO_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
        final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER);
        if ((((NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(nbar_dtr, UNPROVIDED))) && (NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(nbar_dtr, UNPROVIDED)))) && ((NIL != pph_phrase.pph_phrase_definite_articleP(det_dtr)) || (NIL != pph_phrase.pph_phrase_indefinite_articleP(det_dtr)))) && (NIL != pph_utilities.pph_nbarP(pph_phrase.pph_phrase_category(nbar_dtr, UNPROVIDED)))) {
            return T;
        }
        if (((NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(det_dtr, UNPROVIDED))) && (NIL != pph_variable_handling.pph_query_var_p(pph_phrase.pph_phrase_cycl(det_dtr, UNPROVIDED)))) && (NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(det_dtr, UNPROVIDED), $$Determiner, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return EL-VAR?
     */
    @LispMethod(comment = "@return EL-VAR?")
    public static final SubLObject el_var_np_var_alt(SubLObject phrase) {
        if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
            return pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
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
                        if (!dtr_num.numG(ONE_INTEGER)) {
                            {
                                SubLObject ans = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                                if (NIL != cycl_variables.el_varP(ans)) {
                                    return ans;
                                }
                            }
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return EL-VAR?
     */
    @LispMethod(comment = "@return EL-VAR?")
    public static SubLObject el_var_np_var(final SubLObject phrase) {
        if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) {
            return pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        }
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject ans;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (!dtr_num.numG(ONE_INTEGER)) {
                    ans = pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED);
                    if (NIL != cycl_variables.el_varP(ans)) {
                        return ans;
                    }
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; iff the VAR is constrained in FORMULA to be an #$Integer.
     */
    @LispMethod(comment = "@return BOOLEAN; iff the VAR is constrained in FORMULA to be an #$Integer.")
    public static final SubLObject number_varP_alt(SubLObject var, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constraints = pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, T, symbol_function(TRUE));
                return list_utilities.sublisp_boolean(find($$Integer, constraints, $sym114$PPH_SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; iff the VAR is constrained in FORMULA to be an #$Integer.
     */
    @LispMethod(comment = "@return BOOLEAN; iff the VAR is constrained in FORMULA to be an #$Integer.")
    public static SubLObject number_varP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constraints = pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, T, symbol_function(TRUE));
        return list_utilities.sublisp_boolean(find($$Integer, constraints, $sym123$PPH_SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return BOOLEAN; iff no var in VARS is a @xref NUMBER-VAR? in FORMULA.
     */
    @LispMethod(comment = "@return BOOLEAN; iff no var in VARS is a @xref NUMBER-VAR? in FORMULA.")
    public static final SubLObject no_number_varsP_alt(SubLObject vars, SubLObject formula) {
        {
            SubLObject numP = NIL;
            if (NIL == numP) {
                {
                    SubLObject csome_list_var = vars;
                    SubLObject var = NIL;
                    for (var = csome_list_var.first(); !((NIL != numP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , var = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.pph_question.number_varP(var, formula)) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format(T, $str_alt115$___S_determined_to_be_a_number_va, var, formula);
                            }
                            numP = T;
                        }
                    }
                }
            }
            if (NIL == numP) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt116$No_number_vars_in__S__, formula);
                }
            }
            return makeBoolean(NIL == numP);
        }
    }

    /**
     *
     *
     * @return BOOLEAN; iff no var in VARS is a @xref NUMBER-VAR? in FORMULA.
     */
    @LispMethod(comment = "@return BOOLEAN; iff no var in VARS is a @xref NUMBER-VAR? in FORMULA.")
    public static SubLObject no_number_varsP(final SubLObject vars, final SubLObject formula) {
        SubLObject numP = NIL;
        if (NIL == numP) {
            SubLObject csome_list_var = vars;
            SubLObject var = NIL;
            var = csome_list_var.first();
            while ((NIL == numP) && (NIL != csome_list_var)) {
                if (NIL != number_varP(var, formula)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str124$___S_determined_to_be_a_number_va, var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    numP = T;
                }
                csome_list_var = csome_list_var.rest();
                var = csome_list_var.first();
            } 
        }
        if ((NIL == numP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER))) {
            format_nil.force_format(T, $str125$No_number_vars_in__S__, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return makeBoolean(NIL == numP);
    }

    public static final SubLObject formula_ok_for_subj_aux_inversionP_alt(SubLObject formula) {
        {
            SubLObject conservative_with_varsP = NIL;
            SubLObject vars = obsolete.formula_variables(formula, UNPROVIDED, UNPROVIDED);
            SubLObject query_varsP = find_if(PPH_QUERY_VAR_P, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
                return NIL;
            } else {
                if ((NIL != pph_vars.pph_maximize_linksP()) && (NIL != query_varsP)) {
                    return NIL;
                } else {
                    if ((NIL != conservative_with_varsP) && (NIL != list_utilities.lengthGE(vars, TWO_INTEGER, UNPROVIDED))) {
                        return NIL;
                    } else {
                        return T;
                    }
                }
            }
        }
    }

    public static SubLObject formula_ok_for_subj_aux_inversionP(final SubLObject formula) {
        final SubLObject conservative_with_varsP = T;
        final SubLObject vars = obsolete.formula_variables(formula, UNPROVIDED, UNPROVIDED);
        final SubLObject query_varsP = find_if(PPH_QUERY_VAR_P, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return NIL;
        }
        if ((NIL != pph_vars.pph_maximize_linksP()) && (NIL != query_varsP)) {
            return NIL;
        }
        if ((NIL != conservative_with_varsP) && (NIL != list_utilities.lengthGE(vars, THREE_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        return T;
    }

    /**
     * Template for transforming FORMULA, if a rule-macro formula, into an atomic sentence in intermediate cycl.
     *
     * @return 0 PPH-CYCL-TEMPLATE-P
     * @return 1 INTEGERP or NIL if operator doesn't specify wide scope for one of its args.
     */
    @LispMethod(comment = "Template for transforming FORMULA, if a rule-macro formula, into an atomic sentence in intermediate cycl.\r\n\r\n@return 0 PPH-CYCL-TEMPLATE-P\r\n@return 1 INTEGERP or NIL if operator doesn\'t specify wide scope for one of its args.")
    public static final SubLObject rmp_formula_to_intermediate_cycl_alt(SubLObject formula) {
        {
            SubLObject op = cycl_utilities.formula_operator(formula);
            SubLObject template = pph_utilities.pph_identity_template();
            SubLObject wide_scope_arg = NIL;
            if (NIL != com.cyc.cycjava.cycl.pph_question.op_ok_for_i_cyclP(op)) {
                wide_scope_arg = pph_methods_formulas.wide_scope_arg_in_pred(op);
                template = pph_methods_formulas.intermediate_cycl_template_for_rmp_formula(formula);
            }
            return values(template, wide_scope_arg);
        }
    }

    /**
     * Template for transforming FORMULA, if a rule-macro formula, into an atomic sentence in intermediate cycl.
     *
     * @return 0 PPH-CYCL-TEMPLATE-P
     * @return 1 INTEGERP or NIL if operator doesn't specify wide scope for one of its args.
     */
    @LispMethod(comment = "Template for transforming FORMULA, if a rule-macro formula, into an atomic sentence in intermediate cycl.\r\n\r\n@return 0 PPH-CYCL-TEMPLATE-P\r\n@return 1 INTEGERP or NIL if operator doesn\'t specify wide scope for one of its args.")
    public static SubLObject rmp_formula_to_intermediate_cycl(final SubLObject formula) {
        final SubLObject op = cycl_utilities.formula_operator(formula);
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject wide_scope_arg = NIL;
        if (NIL != op_ok_for_i_cyclP(op)) {
            wide_scope_arg = pph_methods_formulas.wide_scope_arg_in_pred(op);
            template = pph_methods_formulas.intermediate_cycl_template_for_rmp_formula(formula);
        }
        return values(template, wide_scope_arg);
    }/**
     * Template for transforming FORMULA, if a rule-macro formula, into an atomic sentence in intermediate cycl.
     *
     * @return 0 PPH-CYCL-TEMPLATE-P
     * @return 1 INTEGERP or NIL if operator doesn't specify wide scope for one of its args.
     */


    /**
     *
     *
     * @return BOOLEAN; Does it look like we can generate an iCycL alternative for
    a formula whose arg0 is OP?
     */
    @LispMethod(comment = "@return BOOLEAN; Does it look like we can generate an iCycL alternative for\r\na formula whose arg0 is OP?")
    public static final SubLObject op_ok_for_i_cyclP_alt(SubLObject op) {
        return makeBoolean((NIL != indexed_term_p(op)) && (NIL != pph_methods_formulas.quant_over_arg_tuples(op)));
    }

    /**
     *
     *
     * @return BOOLEAN; Does it look like we can generate an iCycL alternative for
    a formula whose arg0 is OP?
     */
    @LispMethod(comment = "@return BOOLEAN; Does it look like we can generate an iCycL alternative for\r\na formula whose arg0 is OP?")
    public static SubLObject op_ok_for_i_cyclP(final SubLObject op) {
        return makeBoolean((NIL != indexed_term_p(op)) && (NIL != pph_methods_formulas.quant_over_arg_tuples(op)));
    }

    public static final SubLObject remove_var_typing_clauses_from_question_phrase_alt(SubLObject phrase) {
        {
            SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            if (!((NIL == formula) || (NIL != pph_utilities.pph_var_typing_clauseP(formula, UNPROVIDED, UNPROVIDED)))) {
                {
                    SubLObject template = pph_methods_formulas.remove_var_typing_clauses(formula, NIL, map, UNPROVIDED);
                    if ((NIL != pph_utilities.pph_cycl_template_p(template)) && (NIL == pph_utilities.pph_identity_template_p(template))) {
                        pph_phrase.pph_phrase_reset_cycl(phrase, template);
                    }
                }
            }
        }
        return phrase;
    }

    public static SubLObject remove_var_typing_clauses_from_question_phrase(final SubLObject phrase) {
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        if ((NIL != formula) && (NIL == pph_utilities.pph_var_typing_clauseP(formula, UNPROVIDED, UNPROVIDED))) {
            final SubLObject template = pph_methods_formulas.remove_var_typing_clauses(formula, NIL, map, UNPROVIDED);
            if ((NIL != pph_utilities.pph_cycl_template_p(template)) && (NIL == pph_utilities.pph_identity_template_p(template))) {
                pph_phrase.pph_phrase_reset_cycl(phrase, template);
            }
        }
        return phrase;
    }

    /**
     * Make a yes-no question from FORMULA with subject-aux inversion
     *
     * @unknown '(#$isa #$Muffet #$Emu) --> 'Is Muffet an emu?'
     */
    @LispMethod(comment = "Make a yes-no question from FORMULA with subject-aux inversion\r\n\r\n@unknown \'(#$isa #$Muffet #$Emu) --> \'Is Muffet an emu?\'")
    public static final SubLObject generate_with_subj_aux_inversion_alt(SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = com.cyc.cycjava.cycl.pph_question.pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.pph_question.formula_ok_for_subj_aux_inversionP(formula)) {
                return NIL;
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format(T, $str_alt117$__Trying_to_generate__S_using_sub, formula);
            }
            {
                SubLObject phrase = (NIL != pph_types.pph_phrase_nautP(formula)) ? ((SubLObject) (pph_templates.pph_phrasify_phrase_naut(formula, arg_position_map))) : pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(formula, arg_position_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject string = NIL;
                SubLObject result_agr_pred = NIL;
                SubLObject justification = NIL;
                SubLObject output_list = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
                    try {
                        pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_var_types$.getDynamicValue(thread))) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                            {
                                SubLObject _prev_bind_0_89 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                SubLObject _prev_bind_1 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                SubLObject _prev_bind_2 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                try {
                                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                    pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? ((SubLObject) (pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                        format(T, $str_alt18$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)));
                                    }
                                    try {
                                        {
                                            SubLObject _prev_bind_0_90 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_discourse_context$.bind(new_pph_discourse_context(), thread);
                                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                    format(T, $str_alt118$__Entering_WITHIN_NEW_PPH_DISCOUR, pph_vars.$pph_discourse_context$.getDynamicValue(thread));
                                                }
                                                try {
                                                    pph_ensure_discourse_participant_rms();
                                                    if (NIL != el_existential_p(formula)) {
                                                        {
                                                            SubLObject template = pph_methods_formulas.pph_reformulate_existential_with_thecollectionof(formula, UNPROVIDED);
                                                            if (NIL == pph_utilities.pph_impossible_template_p(template)) {
                                                                pph_phrase.pph_phrase_reset_cycl(phrase, template);
                                                            }
                                                        }
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject new_template = pph_methods_formulas.remove_var_typing_clauses_from_existential(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), arg_position_map);
                                                            SubLObject new_justification = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            pph_phrase.pph_phrase_reset_cycl(phrase, new_template);
                                                            if (NIL != new_justification) {
                                                                pph_phrase.pph_phrase_add_justification(phrase, new_justification);
                                                            }
                                                        }
                                                    }
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject template = com.cyc.cycjava.cycl.pph_question.rmp_formula_to_intermediate_cycl(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                                        SubLObject wide_scope_arg = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL == pph_utilities.pph_identity_template_p(template)) {
                                                            pph_phrase.pph_phrase_reset_cycl(phrase, template);
                                                        }
                                                        {
                                                            SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                                                            try {
                                                                nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                                                                com.cyc.cycjava.cycl.pph_question.remove_var_typing_clauses_from_question_phrase(phrase);
                                                                {
                                                                    SubLObject new_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                                                    SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                                                                    SubLObject query_vars = cycl_utilities.expression_gather(new_cycl, PPH_QUERY_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_91 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                                                                        try {
                                                                            pph_vars.$pph_use_wh_for_query_varsP$.bind(T, thread);
                                                                            {
                                                                                SubLObject doneP = NIL;
                                                                                SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(new_cycl, wide_scope_arg, cycl_utilities.formula_arg0(new_cycl), nl_preds, NIL, UNPROVIDED);
                                                                                while (!((NIL != doneP) || (NIL != pph_data_structures.pph_phrase_template_generator_done_p(generator)))) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject phrase_template = pph_templates.pph_phrase_template_generator_next(generator);
                                                                                        SubLObject ignore_me = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != pph_phrase.pph_phrase_p(phrase_template, UNPROVIDED)) {
                                                                                            if (NIL != pph_phrase.pph_conditional_phrase_p(phrase_template)) {
                                                                                                pph_phrase_resolution.pph_phrase_resolve_condition(phrase_template, formula, NIL);
                                                                                            }
                                                                                            {
                                                                                                SubLObject _prev_bind_0_92 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                                                                                                try {
                                                                                                    pph_vars.$pph_current_arg0$.bind(NIL != pph_macros.pph_ok_arg0_for_linkingP(cycl_utilities.formula_arg0(formula)) ? ((SubLObject) (cycl_utilities.formula_arg0(formula))) : $UNSPECIFIED, thread);
                                                                                                    pph_templates.pph_template_phrase_set_cycl(phrase_template, new_cycl, map, UNPROVIDED);
                                                                                                } finally {
                                                                                                    pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_92, thread);
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject question_template = com.cyc.cycjava.cycl.pph_question.make_question_template(phrase_template, query_vars, nl_preds);
                                                                                                if (NIL != pph_phrase.pph_phrase_p(question_template, UNPROVIDED)) {
                                                                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                                                        format(T, $str_alt119$__Made_question_template__S, question_template);
                                                                                                    }
                                                                                                    if (NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
                                                                                                        pph_phrase.pph_phrase_add_agr_preds(question_template, nl_preds, UNPROVIDED);
                                                                                                    }
                                                                                                    pph_main.pph_phrase_generate(question_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    if (NIL != pph_phrase.pph_phrase_doneP(question_template)) {
                                                                                                        doneP = T;
                                                                                                        pph_phrase.pph_phrase_copy(question_template, phrase, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } 
                                                                                pph_data_structures.free_pph_phrase_template_generator(generator);
                                                                            }
                                                                        } finally {
                                                                            pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0_91, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_93 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_93, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                                format(T, $str_alt120$__Leaving_WITHIN_NEW_PPH_DISCOURS, pph_vars.$pph_discourse_context$.getDynamicValue(thread));
                                                            }
                                                            pph_macros.clear_pph_discourse_context();
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_90, thread);
                                            }
                                        }
                                        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                            string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
                                            result_agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                                            justification = pph_phrase.pph_phrase_justification(phrase);
                                            output_list = pph_phrase.pph_phrase_output_list(phrase);
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                {
                                                    SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format(T, $str_alt19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars());
                                                    }
                                                    pph_macros.pph_handle_local_vars(local_vars);
                                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                        format(T, $str_alt20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars());
                                                    }
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_95, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_2, thread);
                                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_1, thread);
                                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_89, thread);
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(string, result_agr_pred, justification, output_list);
            }
        }
    }

    /**
     * Make a yes-no question from FORMULA with subject-aux inversion
     *
     * @unknown '(#$isa #$Muffet #$Emu) --> 'Is Muffet an emu?'
     */
    @LispMethod(comment = "Make a yes-no question from FORMULA with subject-aux inversion\r\n\r\n@unknown \'(#$isa #$Muffet #$Emu) --> \'Is Muffet an emu?\'")
    public static SubLObject generate_with_subj_aux_inversion(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = pph_default_question_preds();
        }
        if (arg_position_map == UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == formula_ok_for_subj_aux_inversionP(formula)) {
            return NIL;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str126$__Trying_to_generate__S_using_sub, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject phrase = (NIL != pph_types.pph_phrase_nautP(formula)) ? pph_templates.pph_phrasify_phrase_naut(formula, arg_position_map) : pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(formula, arg_position_map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject string = NIL;
        SubLObject result_agr_pred = NIL;
        SubLObject justification = NIL;
        SubLObject output_list = NIL;
        SubLObject demerits = NIL;
        generate_phrase_with_subj_aux_inversion(phrase, formula, nl_preds, arg_position_map, UNPROVIDED);
        if (NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            string = pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
            result_agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            justification = pph_phrase.pph_phrase_justification(phrase);
            output_list = pph_phrase.pph_phrase_output_list(phrase);
            demerits = pph_phrase.pph_phrase_demerits(phrase);
            if (NIL != misc_utilities.initialized_p(pph_vars.$pph_sentence$.getDynamicValue(thread))) {
                final SubLObject queue = queues.create_queue(UNPROVIDED);
                SubLObject done_count = ZERO_INTEGER;
                queues.enqueue(phrase, queue);
                while (NIL == queues.queue_empty_p(queue)) {
                    final SubLObject ignore_me = queues.dequeue(queue);
                    SubLObject cdolist_list_var = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                    SubLObject alternative = NIL;
                    alternative = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        pph_sentence.pph_sentence_add_alternative(alternative);
                        done_count = add(done_count, ONE_INTEGER);
                        if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                            final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str40$Done__S_alternatives_of__S) });
                            pph_error.pph_handle_error(new_format_string, list(done_count, phrase));
                        }
                        queues.enqueue(alternative, queue);
                        cdolist_list_var = cdolist_list_var.rest();
                        alternative = cdolist_list_var.first();
                    } 
                } 
            }
        }
        return values(string, result_agr_pred, justification, output_list, demerits);
    }/**
     * Make a yes-no question from FORMULA with subject-aux inversion
     *
     * @unknown '(#$isa #$Muffet #$Emu) --> 'Is Muffet an emu?'
     */


    public static SubLObject generate_phrase_with_subj_aux_inversion(final SubLObject phrase, final SubLObject formula, SubLObject nl_preds, final SubLObject arg_position_map, SubLObject reformulateP) {
        if (reformulateP == UNPROVIDED) {
            reformulateP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject orig_phrase = pph_phrase.pph_phrase_copy(phrase, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
        try {
            pph_vars.$pph_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
            final SubLObject _prev_bind_0_$114 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
            try {
                pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                pph_vars.$pph_noted_var_types$.bind(NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread)) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQL), SIXTEEN_INTEGER), thread);
                pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str17$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                try {
                    final SubLObject _prev_bind_0_$115 = pph_vars.$pph_discourse_context$.currentBinding(thread);
                    try {
                        pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                        pph_macros.herald_new_discourse_context();
                        try {
                            pph_drs.pph_ensure_discourse_participant_rms();
                            if (NIL != el_existential_p(formula)) {
                                final SubLObject template = pph_methods_formulas.pph_reformulate_existential_with_thecollectionof(formula, UNPROVIDED);
                                if (NIL == pph_utilities.pph_impossible_template_p(template)) {
                                    pph_phrase.pph_phrase_reset_cycl(phrase, template);
                                }
                                thread.resetMultipleValues();
                                final SubLObject new_template = pph_methods_formulas.remove_var_typing_clauses_from_existential(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), arg_position_map);
                                final SubLObject new_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_template);
                                if (NIL != new_justification) {
                                    pph_phrase.pph_phrase_add_justification(phrase, new_justification);
                                }
                            }
                            thread.resetMultipleValues();
                            final SubLObject template = rmp_formula_to_intermediate_cycl(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                            final SubLObject wide_scope_arg = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == pph_utilities.pph_identity_template_p(template)) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, template);
                            }
                            final SubLObject save_cycl = pph_macros.pph_phrase_restrict_cycl_to_mt_scope(phrase);
                            try {
                                nl_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
                                if (NIL != reformulateP) {
                                    SubLObject cdolist_list_var = obsolete.formula_free_variables(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject var = NIL;
                                    var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject var_path = pph_utilities.pph_template_for_cycl_variable(var, pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED));
                                        final SubLObject new_template2 = pph_methods_formulas.pph_reformulate_conjunction_with_thecollectionof(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), var, pph_utilities.pph_identity_template(), pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED), var_path, NIL);
                                        if (((NIL == list_utilities.tree_find(new_template2, $ERROR, UNPROVIDED, UNPROVIDED)) && (NIL == pph_utilities.pph_impossible_template_p(new_template2))) && (NIL == pph_utilities.pph_identity_template_p(new_template2))) {
                                            pph_phrase.pph_phrase_reset_cycl(phrase, new_template2);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        var = cdolist_list_var.first();
                                    } 
                                }
                                remove_var_typing_clauses_from_question_phrase(phrase);
                                final SubLObject new_cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                                final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
                                final SubLObject query_vars = cycl_utilities.expression_gather(new_cycl, PPH_QUERY_VAR_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject _prev_bind_0_$116 = pph_vars.$pph_use_wh_for_query_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_use_wh_for_query_varsP$.bind(T, thread);
                                    SubLObject doneP = NIL;
                                    final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(new_cycl, wide_scope_arg, cycl_utilities.formula_arg0(new_cycl), nl_preds, NIL, UNPROVIDED);
                                    while ((NIL == doneP) && (NIL == pph_data_structures.pph_phrase_template_generator_done_p(generator))) {
                                        thread.resetMultipleValues();
                                        final SubLObject phrase_template = pph_templates.pph_phrase_template_generator_next(generator);
                                        final SubLObject ignore_me = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != pph_phrase.pph_phrase_p(phrase_template, UNPROVIDED)) {
                                            if (NIL != pph_phrase.pph_conditional_phrase_p(phrase_template)) {
                                                pph_phrase_resolution.pph_phrase_resolve_condition(phrase_template, formula, NIL);
                                            }
                                            final SubLObject _prev_bind_0_$117 = pph_vars.$pph_current_arg0$.currentBinding(thread);
                                            try {
                                                pph_vars.$pph_current_arg0$.bind(NIL != pph_macros.pph_ok_arg0_for_linkingP(cycl_utilities.formula_arg0(formula)) ? cycl_utilities.formula_arg0(formula) : $UNSPECIFIED, thread);
                                                pph_templates.pph_template_phrase_set_cycl(phrase_template, new_cycl, map, UNPROVIDED);
                                            } finally {
                                                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            final SubLObject clause = find_head_clause(phrase_template);
                                            if (NIL == make_question_template(clause, query_vars, nl_preds, pph_phrase.pph_phrase_cycl(phrase_template, UNPROVIDED))) {
                                                continue;
                                            }
                                            final SubLObject question_template = phrase_template;
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format_nil.force_format(T, $str127$__Made_question_template__S, question_template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            if (NIL != pph_utilities.pph_nl_pred_listP(nl_preds)) {
                                                pph_phrase.pph_phrase_add_agr_preds(question_template, nl_preds, UNPROVIDED);
                                            }
                                            pph_main.pph_phrase_generate(question_template, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if ((NIL != pph_phrase.pph_phrase_doneP(question_template)) && (NIL == pph_phrase.pph_phrase_doneP(phrase))) {
                                                pph_phrase.pph_phrase_copy(question_template, phrase, UNPROVIDED);
                                                if (NIL != pph_vars.pph_generate_alternative_phrasesP()) {
                                                    continue;
                                                }
                                                doneP = T;
                                            } else {
                                                if (NIL == pph_phrase.pph_phrase_doneP(question_template)) {
                                                    continue;
                                                }
                                                pph_phrase.pph_phrase_add_alternative(phrase, question_template);
                                            }
                                        }
                                    } 
                                    pph_data_structures.free_pph_phrase_template_generator(generator);
                                } finally {
                                    pph_vars.$pph_use_wh_for_query_varsP$.rebind(_prev_bind_0_$116, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    pph_macros.pph_phrase_restore_and_rephrase_cycl_if_mt_scoped(phrase, save_cycl, UNPROVIDED);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                pph_macros.herald_end_of_discourse_context();
                                pph_macros.clear_pph_discourse_context();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                            }
                        }
                    } finally {
                        pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$115, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        final SubLObject local_vars = set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, UNPROVIDED, UNPROVIDED);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str19$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_macros.pph_handle_local_vars(local_vars);
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format_nil.force_format(T, $str20$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                    }
                }
            } finally {
                pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$114, thread);
            }
        } finally {
            pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != pph_phrase.pph_phrase_doneP(phrase)) && (NIL != string_utilities.substringP($str128$_X_such_that, pph_phrase.pph_phrase_string(phrase, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            format(T, $str129$in_generate_phrase_with_subj_aux_, pph_phrase.pph_phrase_string(phrase, UNPROVIDED));
            generate_phrase_with_subj_aux_inversion(orig_phrase, formula, arg_position_map, NIL, UNPROVIDED);
            pph_phrase.pph_phrase_copy(orig_phrase, phrase, UNPROVIDED);
        }
        return phrase;
    }

    public static SubLObject find_head_clause(final SubLObject phrase_template) {
        SubLObject head_clause;
        for (head_clause = phrase_template; ((NIL != pph_phrase.pph_phrase_has_dtrsP(head_clause)) && (NIL != pph_phrase.pph_phrase_head_dtr_num(head_clause))) && (NIL != pph_phrase.pph_phrase_sP(pph_phrase.pph_phrase_head_dtr(head_clause))); head_clause = pph_phrase.pph_phrase_head_dtr(head_clause)) {
        }
        return head_clause;
    }

    /**
     *
     *
     * @param TEMPLATE;
     * 		possibly :gen-format but we only deal with it if it's PPH-PHRASE-P.
     * @return NIL or PPH-PHRASE-P.
     */
    @LispMethod(comment = "@param TEMPLATE;\r\n\t\tpossibly :gen-format but we only deal with it if it\'s PPH-PHRASE-P.\r\n@return NIL or PPH-PHRASE-P.")
    public static final SubLObject make_question_template(SubLObject template, SubLObject query_vars, SubLObject matrix_agr) {
        if (matrix_agr == UNPROVIDED) {
            matrix_agr = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_phrase.pph_phrase_p(template, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.pph_question.pph_phrase_subject_head_verb_initialP(template)))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format(T, $str_alt121$__Not_subject_head_verb_initial__, template);
                }
                return NIL;
            }
            if (NIL != pph_utilities.pph_nl_pred_listP(matrix_agr)) {
                {
                    SubLObject dtr = pph_phrase.pph_phrase_head_dtr(template);
                    SubLObject dtr_agr_preds = pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED);
                    SubLObject dtr_tense_preds = (dtr_agr_preds.isList()) ? ((SubLObject) (list_utilities.find_all_if($sym122$PPH_TENSE_PRED_, dtr_agr_preds, UNPROVIDED))) : NIL;
                    if (NIL != pph_utilities.pph_genlP(pph_phrase.pph_phrase_category(dtr, UNPROVIDED), $$Verb, UNPROVIDED)) {
                        pph_phrase.pph_phrase_set_agr_preds(dtr, pph_utilities.pph_filter_preds(matrix_agr, NIL != dtr_tense_preds ? ((SubLObject) (dtr_tense_preds)) : $ANY, UNPROVIDED), UNPROVIDED);
                    }
                }
            }
            {
                SubLObject head_dtr = pph_phrase.pph_phrase_head_dtr(template);
                SubLObject template_cycl = pph_phrase.pph_phrase_cycl(template, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject question_subphrase_path = com.cyc.cycjava.cycl.pph_question.find_question_subphrase(template);
                    SubLObject question_subphrase = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != query_vars) && (NIL == com.cyc.cycjava.cycl.pph_question.pph_subphrase_path_p(question_subphrase_path))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format(T, $str_alt124$__Couldn_t_find_question_subphras, template);
                        }
                        return NIL;
                    } else {
                        if (question_subphrase == pph_phrase.pph_phrase_subject_dtr(template)) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format(T, $str_alt125$__Subject_dtr_of__S_is_a_wh_phras, template);
                            }
                            com.cyc.cycjava.cycl.pph_question.string_for_var_in_question_phrase(question_subphrase, template_cycl);
                            return template;
                        } else {
                            if (NIL == head_dtr) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                    format(T, $str_alt126$___S_has_no_head_dtr__MAKE_QUESTI, template);
                                }
                                return NIL;
                            } else {
                                if (NIL != pph_phrase.pph_copula_phraseP(head_dtr)) {
                                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                        format(T, $str_alt127$__Head_dtr__S_is_a_copula__placin, head_dtr);
                                    }
                                    if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                                        com.cyc.cycjava.cycl.pph_question.string_for_var_in_question_phrase(question_subphrase, template_cycl);
                                    }
                                    pph_phrase.pph_phrase_front_head_dtr(template);
                                } else {
                                    if (NIL != pph_phrase.pph_aux_verb_phraseP(head_dtr)) {
                                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                            format(T, $str_alt128$__Head_dtr__S_is_an_auxiliary__pl, head_dtr);
                                        }
                                        if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                                            com.cyc.cycjava.cycl.pph_question.string_for_var_in_question_phrase(question_subphrase, template_cycl);
                                        }
                                        pph_phrase.pph_phrase_front_head_dtr(template);
                                    } else {
                                        if (NIL != pph_phrase.possibly_modal_verb_phraseP(head_dtr)) {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format(T, $str_alt129$___S_may_be_a_modal_verb__MAKE_QU, head_dtr);
                                            }
                                            return NIL;
                                        } else {
                                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                                format(T, $str_alt130$__Adding_do_support_to_template__, template);
                                            }
                                            if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                                                com.cyc.cycjava.cycl.pph_question.string_for_var_in_question_phrase(question_subphrase, template_cycl);
                                            }
                                            com.cyc.cycjava.cycl.pph_question.pph_phrase_add_do_supportXinvert(template);
                                            if (NIL != com.cyc.cycjava.cycl.pph_question.pph_subphrase_path_p(question_subphrase_path)) {
                                                rplaca(question_subphrase_path, number_utilities.f_1X(question_subphrase_path.first()));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.pph_question.pph_subphrase_path_p(question_subphrase_path)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format(T, $str_alt131$Fronting__S, question_subphrase);
                        }
                        pph_phrase.pph_phrase_front_subphrase(question_subphrase_path, question_subphrase, template);
                    }
                }
            }
            return template;
        }
    }

    public static SubLObject make_question_template(final SubLObject template, final SubLObject query_vars, SubLObject matrix_agr, SubLObject template_cycl) {
        if (matrix_agr == UNPROVIDED) {
            matrix_agr = NIL;
        }
        if (template_cycl == UNPROVIDED) {
            template_cycl = pph_phrase.pph_phrase_cycl(template, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == pph_phrase.pph_phrase_p(template, UNPROVIDED)) || (NIL == pph_phrase_subject_head_verb_initialP(template))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str130$__Not_subject_head_verb_initial__, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
        if (NIL != pph_utilities.pph_nl_pred_listP(matrix_agr)) {
            final SubLObject dtr = pph_phrase.pph_phrase_head_dtr(template);
            final SubLObject dtr_agr_preds = pph_phrase.pph_phrase_agr_preds(dtr, UNPROVIDED);
            final SubLObject dtr_tense_preds = (dtr_agr_preds.isList()) ? list_utilities.find_all_if($sym131$PPH_TENSE_PRED_, dtr_agr_preds, UNPROVIDED) : NIL;
            if (NIL != pph_utilities.pph_genlP(pph_phrase.pph_phrase_category(dtr, UNPROVIDED), $$Verb, UNPROVIDED)) {
                pph_phrase.pph_phrase_set_agr_preds(dtr, pph_utilities.pph_filter_preds(matrix_agr, NIL != dtr_tense_preds ? dtr_tense_preds : $ANY, UNPROVIDED), UNPROVIDED);
            }
        }
        thread.resetMultipleValues();
        SubLObject question_subphrase_path = find_question_subphrase(template);
        final SubLObject question_subphrase = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject head_verb = pph_phrase.pph_phrase_head_dtr(template);
        SubLObject head_verb_path = list(pph_phrase.pph_phrase_head_dtr_num(template));
        SubLObject structure_changedP = NIL;
        while (((NIL != pph_phrase.pph_phrase_p(head_verb, UNPROVIDED)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(head_verb))) && (NIL != pph_phrase.pph_phrase_head_dtr_num(head_verb))) {
            head_verb_path = list_utilities.snoc(pph_phrase.pph_phrase_head_dtr_num(head_verb), head_verb_path);
            head_verb = pph_phrase.pph_phrase_head_dtr(head_verb);
        } 
        if ((NIL != query_vars) && (NIL == pph_subphrase_path_p(question_subphrase_path))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str133$__Couldn_t_find_question_subphras, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
        if (question_subphrase.eql(pph_phrase.pph_phrase_subject_dtr(template))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str134$__Subject_dtr_of__S_is_a_wh_phras, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            string_for_var_in_question_phrase(question_subphrase, template_cycl);
            return template;
        }
        if (NIL == head_verb) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str135$___S_has_no_head_verb__MAKE_QUEST, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
        if (NIL != pph_phrase.pph_copula_phraseP(head_verb)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str136$__Head_dtr__S_is_a_copula__placin, head_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                string_for_var_in_question_phrase(question_subphrase, template_cycl);
            }
            pph_phrase.pph_phrase_front_subphrase(head_verb_path, head_verb, template);
            structure_changedP = T;
        } else
            if (NIL != pph_phrase.pph_aux_verb_phraseP(head_verb)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str137$__Head_dtr__S_is_an_auxiliary__pl, head_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                    string_for_var_in_question_phrase(question_subphrase, template_cycl);
                }
                pph_phrase.pph_phrase_front_subphrase(head_verb_path, head_verb, template);
                structure_changedP = T;
            } else {
                if (NIL != pph_phrase.possibly_modal_verb_phraseP(head_verb)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str138$___S_may_be_a_modal_verb__MAKE_QU, head_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return NIL;
                }
                if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && ((NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(template), lexicon_cache.perfect_aspect_pred(), UNPROVIDED)) || (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(head_verb), lexicon_cache.perfect_aspect_pred(), UNPROVIDED)))) {
                    final SubLObject have_dtr_num = make_multi_word_perfect_verb(template);
                    pph_phrase.pph_phrase_front_subphrase(list(have_dtr_num), pph_phrase.pph_phrase_nth_dtr(template, have_dtr_num), template);
                    structure_changedP = T;
                } else {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                        format_nil.force_format(T, $str139$__Adding_do_support_to_template__, template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != pph_phrase.pph_phrase_p(question_subphrase, UNPROVIDED)) {
                        string_for_var_in_question_phrase(question_subphrase, template_cycl);
                    }
                    pph_phrase_add_do_supportXinvert(template);
                    structure_changedP = T;
                }
            }

        if (NIL != pph_subphrase_path_p(question_subphrase_path)) {
            if (NIL != structure_changedP) {
                question_subphrase_path = pph_phrase.pph_phrase_find_nested_dtr_path(template, question_subphrase, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str140$Fronting__S, question_subphrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_front_subphrase(question_subphrase_path, question_subphrase, template);
        }
        return template;
    }

    /**
     *
     *
     * @return PPH-PHRASE-P or NIL
     * @unknown assumes the PPH-PHRASE-hood of (pph-phrase-head-dtr phrase)
     */
    @LispMethod(comment = "@return PPH-PHRASE-P or NIL\r\n@unknown assumes the PPH-PHRASE-hood of (pph-phrase-head-dtr phrase)")
    public static final SubLObject pph_phrase_add_do_supportXinvert_alt(SubLObject phrase) {
        pph_utilities.pph_phrase_add_do_support(phrase);
        pph_phrase.pph_phrase_front_head_dtr(phrase);
        return phrase;
    }

    /**
     *
     *
     * @return PPH-PHRASE-P or NIL
     * @unknown assumes the PPH-PHRASE-hood of (pph-phrase-head-dtr phrase)
     */
    @LispMethod(comment = "@return PPH-PHRASE-P or NIL\r\n@unknown assumes the PPH-PHRASE-hood of (pph-phrase-head-dtr phrase)")
    public static SubLObject pph_phrase_add_do_supportXinvert(final SubLObject phrase) {
        pph_utilities.pph_phrase_add_do_support(phrase);
        pph_phrase.pph_phrase_front_head_dtr(phrase);
        return phrase;
    }

    public static SubLObject make_multi_word_perfect_verb(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(phrase);
        final SubLObject head_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, head_dtr_num);
        final SubLObject _prev_bind_0 = pph_vars.$pph_retain_original_relative_targetsP$.currentBinding(thread);
        try {
            pph_vars.$pph_retain_original_relative_targetsP$.bind(T, thread);
            final SubLObject have_dtr = pph_phrase.pph_phrase_copy(head_dtr, UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(have_dtr, $$Have_TheWord);
            final SubLObject old_head_agr_pred = pph_phrase.pph_phrase_agr_pred(phrase);
            final SubLObject new_agr_pred = (NIL != pph_utilities.pph_genl_pos_predP(old_head_agr_pred, $$pastPerfect_Generic, UNPROVIDED)) ? $$pastTense_Generic : $$presentTense_Generic;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str144$De_perfectiving_agr_from__S_to__S, old_head_agr_pred, new_agr_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_agr_pred(have_dtr, new_agr_pred, UNPROVIDED);
            pph_phrase.pph_phrase_set_head_dtr_num(phrase, NIL);
            pph_phrase.pph_phrase_set_agr(head_dtr, pph_data_structures.new_pph_phrase_agr(pph_utilities.new_pph_agr_constraint($POS_PRED, $$perfect), UNPROVIDED), UNPROVIDED);
            pph_phrase.pph_phrase_insert_dtr(phrase, have_dtr, head_dtr_num);
            return head_dtr_num;
        } finally {
            pph_vars.$pph_retain_original_relative_targetsP$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * Is the CycL of PHRASE a [+wh] daughter?
     */
    @LispMethod(comment = "Is the CycL of PHRASE a [+wh] daughter?")
    public static final SubLObject question_phraseP_alt(SubLObject phrase, SubLObject matrix_cycl, SubLObject matrix_phrase) {
        if (NIL != com.cyc.cycjava.cycl.pph_question.pph_temporal_location_var_phraseP(phrase)) {
            return T;
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, matrix_cycl, matrix_phrase);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.pph_question.question_rop_formulaP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) || (NIL != com.cyc.cycjava.cycl.pph_question.question_var_npP(phrase)));
    }

    /**
     * Is the CycL of PHRASE a [+wh] daughter?
     */
    @LispMethod(comment = "Is the CycL of PHRASE a [+wh] daughter?")
    public static SubLObject question_phraseP(final SubLObject phrase, final SubLObject matrix_cycl, final SubLObject matrix_phrase) {
        if (NIL != pph_temporal_location_var_phraseP(phrase)) {
            return T;
        }
        if (NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, matrix_cycl, matrix_phrase);
        }
        return makeBoolean((NIL != question_rop_formulaP(pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED))) || (NIL != question_var_npP(phrase)));
    }/**
     * Is the CycL of PHRASE a [+wh] daughter?
     */


    public static final SubLObject pph_temporal_location_var_phraseP_alt(SubLObject phrase) {
        if ((($TRUE == pph_data_structures.pph_phrase_info_lookup(phrase, $TEMPORAL_LOCATION, $FALSE)) && (NIL == pph_phrase.pph_phrase_cycl_find_if(phrase, $sym134$ROP_FORMULA_))) && (NIL != pph_phrase.pph_phrase_cycl_find_if(phrase, $sym57$EL_VAR_))) {
            return T;
        } else {
            return NIL;
        }
    }

    public static SubLObject pph_temporal_location_var_phraseP(final SubLObject phrase) {
        if ((($TRUE == pph_data_structures.pph_phrase_info_lookup(phrase, $TEMPORAL_LOCATION, $FALSE)) && (NIL == pph_phrase.pph_phrase_cycl_find_if(phrase, $sym149$ROP_FORMULA_))) && (NIL != pph_phrase.pph_phrase_cycl_find_if(phrase, $sym63$EL_VAR_))) {
            return T;
        }
        return NIL;
    }

    /**
     * Find a [+wh] daughter in PHRASE
     *
     * @return PPH-SUBPHRASE-PATH-P or :not-found
     */
    @LispMethod(comment = "Find a [+wh] daughter in PHRASE\r\n\r\n@return PPH-SUBPHRASE-PATH-P or :not-found")
    public static final SubLObject find_question_subphrase_alt(SubLObject phrase) {
        return com.cyc.cycjava.cycl.pph_question.find_question_subphrase_int(phrase, NIL, UNPROVIDED);
    }

    /**
     * Find a [+wh] daughter in PHRASE
     *
     * @return PPH-SUBPHRASE-PATH-P or :not-found
     */
    @LispMethod(comment = "Find a [+wh] daughter in PHRASE\r\n\r\n@return PPH-SUBPHRASE-PATH-P or :not-found")
    public static SubLObject find_question_subphrase(final SubLObject phrase) {
        return find_question_subphrase_int(phrase, NIL);
    }/**
     * Find a [+wh] daughter in PHRASE
     *
     * @return PPH-SUBPHRASE-PATH-P or :not-found
     */


    public static final SubLObject find_question_subphrase_int(SubLObject phrase, SubLObject current_path, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
                SubLObject dtr_num = ZERO_INTEGER;
                SubLObject vector_var = document.sign_constituents(phrase);
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject dtr = aref(vector_var, element_num);
                        SubLObject dtr_path = list_utilities.snoc(dtr_num, current_path);
                        if (NIL == com.cyc.cycjava.cycl.pph_question.question_phrase_candidate_passes_filterP(dtr, filter)) {
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.pph_question.question_phraseP(dtr, cycl, phrase)) {
                                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                    format(T, $str_alt135$Found_question_phrase___S, dtr);
                                }
                                return values(dtr_path, dtr);
                            } else {
                                if (NIL != pph_phrase.pph_phrase_ppP(dtr)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject nested_path = com.cyc.cycjava.cycl.pph_question.find_question_subphrase_int(dtr, dtr_path, $sym136$PPH_PHRASE_NP_);
                                        SubLObject nested_subphrase = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != com.cyc.cycjava.cycl.pph_question.pph_subphrase_path_p(nested_path)) {
                                            return values(nested_path, nested_subphrase);
                                        }
                                    }
                                }
                            }
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
            return values($NOT_FOUND, NIL);
        }
    }

    public static SubLObject find_question_subphrase_int(final SubLObject phrase, final SubLObject current_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_path;
            SubLObject nested_path;
            SubLObject nested_subphrase;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                dtr_path = list_utilities.snoc(dtr_num, current_path);
                if (NIL != question_phraseP(dtr, cycl, phrase)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str150$Found_question_phrase___S, dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return values(dtr_path, dtr);
                }
                if (((NIL != pph_phrase.pph_phrase_ppP(dtr)) || (NIL != pph_phrase.pph_phrase_sP(dtr))) || (NIL != pph_phrase.pph_phrase_category_unknown_p(dtr))) {
                    thread.resetMultipleValues();
                    nested_path = find_question_subphrase_int(dtr, dtr_path);
                    nested_subphrase = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pph_subphrase_path_p(nested_path)) {
                        return values(nested_path, nested_subphrase);
                    }
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        return values($NOT_FOUND, NIL);
    }

    public static final SubLObject pph_subphrase_path_p_alt(SubLObject v_object) {
        return pph_utilities.pph_list_ofP(symbol_function(INTEGERP), v_object);
    }

    public static SubLObject pph_subphrase_path_p(final SubLObject v_object) {
        return pph_utilities.pph_list_ofP(symbol_function(INTEGERP), v_object);
    }

    /**
     * Whether or not to use the word `who' to question VAR, based on FORMULA.
     *
     * @return T or NIL.
     */
    @LispMethod(comment = "Whether or not to use the word `who\' to question VAR, based on FORMULA.\r\n\r\n@return T or NIL.")
    public static final SubLObject pph_use_who_for_var_in_formulaP_alt(SubLObject var, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
            {
                SubLObject cols = cons(pph_variable_handling.pph_var_type(var), pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, T, UNPROVIDED));
                SubLObject use_whoP = NIL;
                SubLObject include_non_personsP = NIL;
                SubLObject doneP = NIL;
                if (NIL != pph_utilities.pph_genlP(pph_variable_handling.pph_var_type(var), $$Agent_Generic, UNPROVIDED)) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = cols;
                                        SubLObject col = NIL;
                                        for (col = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                            if (NIL == pph_utilities.pph_genlP($$Person, col, UNPROVIDED)) {
                                                use_whoP = NIL;
                                                doneP = T;
                                            } else {
                                                if (NIL != pph_utilities.pph_genlP(col, $$Person, UNPROVIDED)) {
                                                    use_whoP = T;
                                                } else {
                                                    use_whoP = T;
                                                    include_non_personsP = T;
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
                }
                return values(use_whoP, include_non_personsP);
            }
        }
    }

    /**
     * Whether or not to use the word `who' to question VAR, based on FORMULA.
     *
     * @return T or NIL.
     */
    @LispMethod(comment = "Whether or not to use the word `who\' to question VAR, based on FORMULA.\r\n\r\n@return T or NIL.")
    public static SubLObject pph_use_who_for_var_in_formulaP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_var_type = pph_variable_handling.pph_var_type(var);
        pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
        final SubLObject cols = cons(pph_variable_handling.pph_var_type(var), pph_variable_handling.pph_variable_isa_constraints(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), T, T, UNPROVIDED));
        SubLObject use_whoP = NIL;
        SubLObject include_non_personsP = NIL;
        SubLObject doneP = NIL;
        if (NIL != pph_utilities.pph_genlP(pph_variable_handling.pph_var_type(var), $$Agent_Generic, UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == doneP) {
                    SubLObject csome_list_var = cols;
                    SubLObject col = NIL;
                    col = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL == pph_utilities.pph_genlP($$Person, col, UNPROVIDED)) {
                            use_whoP = NIL;
                            doneP = T;
                        } else
                            if (NIL != pph_utilities.pph_genlP(col, $$Person, UNPROVIDED)) {
                                use_whoP = T;
                            } else {
                                use_whoP = T;
                                include_non_personsP = T;
                            }

                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        pph_variable_handling.pph_update_var_type(var, old_var_type);
        return values(use_whoP, include_non_personsP);
    }/**
     * Whether or not to use the word `who' to question VAR, based on FORMULA.
     *
     * @return T or NIL.
     */


    /**
     * Whether or not to use the word `when' to question the variable in PHRASE.
     *
     * @return T or NIL.
     */
    @LispMethod(comment = "Whether or not to use the word `when\' to question the variable in PHRASE.\r\n\r\n@return T or NIL.")
    public static final SubLObject pph_use_when_for_phraseP_alt(SubLObject phrase) {
        return com.cyc.cycjava.cycl.pph_question.pph_temporal_location_var_phraseP(phrase);
    }

    /**
     * Whether or not to use the word `when' to question the variable in PHRASE.
     *
     * @return T or NIL.
     */
    @LispMethod(comment = "Whether or not to use the word `when\' to question the variable in PHRASE.\r\n\r\n@return T or NIL.")
    public static SubLObject pph_use_when_for_phraseP(final SubLObject phrase) {
        return pph_temporal_location_var_phraseP(phrase);
    }/**
     * Whether or not to use the word `when' to question the variable in PHRASE.
     *
     * @return T or NIL.
     */


    /**
     * Set the string for PHRASE to a question string, if PHRASE's CycL
     * is a variable.
     */
    @LispMethod(comment = "Set the string for PHRASE to a question string, if PHRASE\'s CycL\r\nis a variable.\nSet the string for PHRASE to a question string, if PHRASE\'s CycL\nis a variable.")
    public static final SubLObject string_for_var_in_question_phrase_alt(SubLObject phrase, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject olist = NIL;
                SubLObject pred = NIL;
                if (NIL != com.cyc.cycjava.cycl.pph_question.question_var_npP(phrase)) {
                    {
                        SubLObject var = com.cyc.cycjava.cycl.pph_question.el_var_np_var(phrase);
                        SubLObject explicitly_arg_type_query_varsP = NIL;
                        if (NIL != explicitly_arg_type_query_varsP) {
                            pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                            format(T, $str_alt143$in_STRING_FOR_VAR_IN_QUESTION_PHR, var);
                        }
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format(T, $str_alt144$pph_var_type_for__S___S__, var, pph_variable_handling.pph_var_type(var));
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject use_whoP = com.cyc.cycjava.cycl.pph_question.pph_use_who_for_var_in_formulaP(var, formula);
                            SubLObject include_non_personsP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != use_whoP) {
                                com.cyc.cycjava.cycl.pph_question.pph_phrase_set_who_or_whom(phrase, include_non_personsP);
                                olist = pph_phrase.pph_phrase_output_list(phrase);
                            } else {
                                if ((NIL != com.cyc.cycjava.cycl.pph_question.number_varP(var, formula)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase))) {
                                    {
                                        SubLObject number_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                                        pph_phrase.pph_phrase_set_string(number_dtr, $$$how_many);
                                    }
                                    return phrase;
                                } else {
                                    if ((NIL != pph_methods.pph_var_ok_for_lexifyingP(var, NIL)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(var))) {
                                        {
                                            SubLObject single_valueP = com.cyc.cycjava.cycl.pph_question.pph_single_entry_varP(var, formula);
                                            SubLObject phrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                                            SubLObject agr_pred = ((NIL != phrase_pred) && ((NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, $$nonPlural_Generic, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, $$nonSingular_Generic, UNPROVIDED)))) ? ((SubLObject) (phrase_pred)) : NIL != single_valueP ? ((SubLObject) ($$nonPlural_Generic)) : $$nonSingular_Generic;
                                            pph_phrase.pph_phrase_copy(pph_methods.pph_lexify_var(var, $WHAT, $$NounPhrase, agr_pred, pph_phrase.pph_phrase_arg_position_map(phrase), UNPROVIDED), phrase, UNPROVIDED);
                                        }
                                    } else {
                                        pph_phrase.pph_phrase_set_string(phrase, $$$what);
                                        olist = pph_phrase.pph_phrase_output_list(phrase);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                        pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                    pph_phrase.pph_phrase_set_agr_pred_unless_nil(phrase, pred);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.pph_question.pph_use_when_for_phraseP(phrase)) {
                        pph_phrase.pph_phrase_copy(com.cyc.cycjava.cycl.pph_question.pph_new_when_phrase_from_phrase(phrase), phrase, UNPROVIDED);
                        olist = pph_phrase.pph_phrase_output_list(phrase);
                    }
                }
                return values(olist, pred);
            }
        }
    }

    /**
     * Set the string for PHRASE to a question string, if PHRASE's CycL
     * is a variable.
     */
    @LispMethod(comment = "Set the string for PHRASE to a question string, if PHRASE\'s CycL\r\nis a variable.\nSet the string for PHRASE to a question string, if PHRASE\'s CycL\nis a variable.")
    public static SubLObject string_for_var_in_question_phrase(final SubLObject phrase, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = NIL;
        final SubLObject pred = NIL;
        if (NIL != question_var_npP(phrase)) {
            final SubLObject var = el_var_np_var(phrase);
            final SubLObject explicitly_arg_type_query_varsP = NIL;
            if (NIL != explicitly_arg_type_query_varsP) {
                pph_methods_formulas.maybe_register_var_by_arg_constraints(var, formula);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format_nil.force_format(T, $str155$in_STRING_FOR_VAR_IN_QUESTION_PHR, var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str156$pph_var_type_for__S___S__, var, pph_variable_handling.pph_var_type(var), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject use_whoP = pph_use_who_for_var_in_formulaP(var, formula);
            final SubLObject include_non_personsP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != use_whoP) {
                pph_phrase_set_who_or_whom(phrase, include_non_personsP);
                olist = pph_phrase.pph_phrase_output_list(phrase);
            } else {
                if ((NIL != number_varP(var, formula)) && (NIL != pph_phrase.pph_phrase_has_dtrsP(phrase))) {
                    final SubLObject number_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER);
                    pph_phrase.pph_phrase_set_string(number_dtr, $$$how_many);
                    return phrase;
                }
                if ((NIL != pph_methods.pph_var_ok_for_lexifyingP(var, NIL)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(var))) {
                    final SubLObject single_valueP = pph_single_entry_varP(var, formula);
                    final SubLObject phrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
                    final SubLObject agr_pred = ((NIL != phrase_pred) && ((NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, $$nonPlural_Generic, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_pos_predP(phrase_pred, $$nonSingular_Generic, UNPROVIDED)))) ? phrase_pred : NIL != single_valueP ? $$nonPlural_Generic : $$nonSingular_Generic;
                    pph_phrase.pph_phrase_copy(pph_methods.pph_lexify_var(var, $WHAT, $$NounPhrase, agr_pred, pph_phrase.pph_phrase_arg_position_map(phrase), UNPROVIDED), phrase, UNPROVIDED);
                } else {
                    pph_phrase.pph_phrase_set_string(phrase, $$$what);
                    olist = pph_phrase.pph_phrase_output_list(phrase);
                }
            }
            if (NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
            pph_phrase.pph_phrase_set_agr_pred_unless_nil(phrase, pred);
        } else
            if (NIL != pph_use_when_for_phraseP(phrase)) {
                pph_phrase.pph_phrase_copy(pph_new_when_phrase_from_phrase(phrase), phrase, UNPROVIDED);
                olist = pph_phrase.pph_phrase_output_list(phrase);
            }

        return values(olist, pred);
    }/**
     * Set the string for PHRASE to a question string, if PHRASE's CycL
     * is a variable.
     */


    /**
     *
     *
     * @return BOOLEANP; Should we use 'whom' where we think it is appropriate?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we use \'whom\' where we think it is appropriate?")
    public static final SubLObject pph_use_whomP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean(pph_vars.$pph_use_whomP$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Should we use 'whom' where we think it is appropriate?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we use \'whom\' where we think it is appropriate?")
    public static SubLObject pph_use_whomP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_vars.$pph_use_whomP$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @return BOOLEANP; Should we use 'whom' for PHRASE?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we use \'whom\' for PHRASE?")
    public static final SubLObject pph_use_whom_for_phraseP_alt(SubLObject phrase) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.pph_question.pph_use_whomP()) && ($ACCUSATIVE == pph_phrase.pph_phrase_case(phrase)));
    }

    /**
     *
     *
     * @return BOOLEANP; Should we use 'whom' for PHRASE?
     */
    @LispMethod(comment = "@return BOOLEANP; Should we use \'whom\' for PHRASE?")
    public static SubLObject pph_use_whom_for_phraseP(final SubLObject phrase) {
        return makeBoolean((NIL != pph_use_whomP()) && ($ACCUSATIVE == pph_phrase.pph_phrase_case(phrase)));
    }

    /**
     * Set the string of PHRASE to 'who' or 'whom'.
     */
    @LispMethod(comment = "Set the string of PHRASE to \'who\' or \'whom\'.")
    public static final SubLObject pph_phrase_set_who_or_whom_alt(SubLObject phrase, SubLObject include_non_personsP) {
        if (include_non_personsP == UNPROVIDED) {
            include_non_personsP = NIL;
        }
        {
            SubLObject who_string = (NIL != com.cyc.cycjava.cycl.pph_question.pph_use_whom_for_phraseP(phrase)) ? ((SubLObject) ($$$whom)) : $$$who;
            if (NIL != include_non_personsP) {
                who_string = cconcatenate(who_string, $str_alt154$_or_what);
            }
            pph_phrase.pph_phrase_set_string(phrase, who_string);
        }
        return pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
    }

    @LispMethod(comment = "Set the string of PHRASE to \'who\' or \'whom\'.")
    public static SubLObject pph_phrase_set_who_or_whom(final SubLObject phrase, SubLObject include_non_personsP) {
        if (include_non_personsP == UNPROVIDED) {
            include_non_personsP = NIL;
        }
        SubLObject who_string = (NIL != pph_use_whom_for_phraseP(phrase)) ? $$$whom : $$$who;
        if (NIL != include_non_personsP) {
            who_string = cconcatenate(who_string, $$$_or_what);
        }
        pph_phrase.pph_phrase_set_string(phrase, who_string);
        return pph_phrase.pph_phrase_string(phrase, UNPROVIDED);
    }/**
     * Set the string of PHRASE to 'who' or 'whom'.
     */


    /**
     *
     *
     * @return PPH-PHRASE-P; with string 'when' and CycL of PHRASE.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; with string \'when\' and CycL of PHRASE.")
    public static final SubLObject pph_new_when_phrase_from_phrase_alt(SubLObject phrase) {
        {
            SubLObject var_dtr = com.cyc.cycjava.cycl.pph_question.pph_find_temporal_location_var_dtr(phrase);
            SubLObject map = pph_phrase.pph_phrase_arg_position_map(var_dtr);
            SubLObject var = pph_phrase.pph_phrase_cycl(var_dtr, UNPROVIDED);
            SubLObject new_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(var, map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            pph_phrase.pph_phrase_set_string(new_phrase, $$$when);
            return new_phrase;
        }
    }

    /**
     *
     *
     * @return PPH-PHRASE-P; with string 'when' and CycL of PHRASE.
     */
    @LispMethod(comment = "@return PPH-PHRASE-P; with string \'when\' and CycL of PHRASE.")
    public static SubLObject pph_new_when_phrase_from_phrase(final SubLObject phrase) {
        final SubLObject var_dtr = pph_find_temporal_location_var_dtr(phrase);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(var_dtr);
        final SubLObject var = pph_phrase.pph_phrase_cycl(var_dtr, UNPROVIDED);
        final SubLObject new_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(var, map, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        pph_phrase.pph_phrase_set_string(new_phrase, $$$when);
        return new_phrase;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		pph-phrase-p that is a temporal-location phrase.
     * @return PPH-PHRASE-P or NIL; the (grand-)*daughter of PHRASE whose CycL is an EL variable.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\tpph-phrase-p that is a temporal-location phrase.\r\n@return PPH-PHRASE-P or NIL; the (grand-)*daughter of PHRASE whose CycL is an EL variable.")
    public static final SubLObject pph_find_temporal_location_var_dtr_alt(SubLObject phrase) {
        if (NIL != com.cyc.cycjava.cycl.pph_question.pph_temporal_location_var_phraseP(phrase)) {
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
                        if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED))) {
                            return dtr;
                        } else {
                            if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                                {
                                    SubLObject grand_dtr = com.cyc.cycjava.cycl.pph_question.pph_find_temporal_location_var_dtr(dtr);
                                    if (NIL != grand_dtr) {
                                        return grand_dtr;
                                    }
                                }
                            }
                        }
                        dtr_num = add(dtr_num, ONE_INTEGER);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PHRASE;
     * 		pph-phrase-p that is a temporal-location phrase.
     * @return PPH-PHRASE-P or NIL; the (grand-)*daughter of PHRASE whose CycL is an EL variable.
     */
    @LispMethod(comment = "@param PHRASE;\r\n\t\tpph-phrase-p that is a temporal-location phrase.\r\n@return PPH-PHRASE-P or NIL; the (grand-)*daughter of PHRASE whose CycL is an EL variable.")
    public static SubLObject pph_find_temporal_location_var_dtr(final SubLObject phrase) {
        if (NIL != pph_temporal_location_var_phraseP(phrase)) {
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject grand_dtr;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    dtr = aref(vector_var, element_num);
                    if (NIL != cycl_variables.el_varP(pph_phrase.pph_phrase_cycl(dtr, UNPROVIDED))) {
                        return dtr;
                    }
                    if (NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                        grand_dtr = pph_find_temporal_location_var_dtr(dtr);
                        if (NIL != grand_dtr) {
                            return grand_dtr;
                        }
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
     * @return BOOLEAN; Is VAR single-entry format in FORMULA?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR single-entry format in FORMULA?")
    public static final SubLObject pph_single_entry_varP_alt(SubLObject var, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject var_position = position(var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pred = cycl_utilities.formula_arg0(formula);
                SubLObject single_entryP = makeBoolean((NIL != kb_accessors.arg_n_single_entry_formatP(pred, var_position, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) || (NIL != com.cyc.cycjava.cycl.pph_question.pph_disjoint_meta_isa_formulaP(var, formula)));
                return single_entryP;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is VAR single-entry format in FORMULA?
     */
    @LispMethod(comment = "@return BOOLEAN; Is VAR single-entry format in FORMULA?")
    public static SubLObject pph_single_entry_varP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_position = position(var, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        final SubLObject single_entryP = makeBoolean((NIL != kb_accessors.arg_n_single_entry_formatP(pred, var_position, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) || (NIL != pph_disjoint_meta_isa_formulaP(var, formula)));
        return single_entryP;
    }

    /**
     *
     *
     * @return BOOLEANP; Does FORMULA constrain VAR to be an instance of some disjoint
    collection type - implying there is at most one binding for VAR?
    Cf. bugs 12965 and 13135
     */
    @LispMethod(comment = "@return BOOLEANP; Does FORMULA constrain VAR to be an instance of some disjoint\r\ncollection type - implying there is at most one binding for VAR?\r\nCf. bugs 12965 and 13135")
    public static final SubLObject pph_disjoint_meta_isa_formulaP_alt(SubLObject var, SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != formula_pattern_match.formula_matches_pattern(formula, list($$isa, $ANYTHING, var))) {
                    {
                        SubLObject var_type = pph_variable_handling.pph_var_type(var);
                        if (NIL != cycl_utilities.reified_term_p(var_type)) {
                            if (NIL == ans) {
                                {
                                    SubLObject node_var = var_type;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject mt_var = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
                                                {
                                                    SubLObject _prev_bind_0_96 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                        {
                                                            SubLObject tv_var = $$True_JustificationTruth;
                                                            {
                                                                SubLObject _prev_bind_0_97 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_98 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt168$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_99 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_100 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_101 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(var_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                        while ((NIL != node_var) && (NIL == ans)) {
                                                                                            {
                                                                                                SubLObject genl = node_var;
                                                                                                ans = makeBoolean((NIL != pph_utilities.pph_isaP(genl, $$FacetingCollectionType, UNPROVIDED)) || (NIL != pph_utilities.pph_isaP(genl, $$DisjointCollectionType, UNPROVIDED)));
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                SubLObject rest = NIL;
                                                                                                for (rest = accessible_modules; !((NIL != ans) || (NIL == rest)); rest = rest.rest()) {
                                                                                                    {
                                                                                                        SubLObject module_var = rest.first();
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_105 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            SubLObject _prev_bind_1_106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                {
                                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                        {
                                                                                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != d_link) {
                                                                                                                                {
                                                                                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != mt_links) {
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                            while (!((NIL != ans) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_107 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject iteration_state_108 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                    while (!((NIL != ans) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_108)))) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_108);
                                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_109 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                            SubLObject rest_110 = NIL;
                                                                                                                                                                                            for (rest_110 = new_list; !((NIL != ans) || (NIL == rest_110)); rest_110 = rest_110.rest()) {
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject node_vars_link_node = rest_110.first();
                                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_109, thread);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            iteration_state_108 = dictionary_contents.do_dictionary_contents_next(iteration_state_108);
                                                                                                                                                                        }
                                                                                                                                                                    } 
                                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_108);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_107, thread);
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
                                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt172$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                SubLObject rest_111 = NIL;
                                                                                                                                for (rest_111 = new_list; !((NIL != ans) || (NIL == rest_111)); rest_111 = rest_111.rest()) {
                                                                                                                                    {
                                                                                                                                        SubLObject generating_fn = rest_111.first();
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_112 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                    SubLObject new_list_113 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                    SubLObject rest_114 = NIL;
                                                                                                                                                    for (rest_114 = new_list_113; !((NIL != ans) || (NIL == rest_114)); rest_114 = rest_114.rest()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject node_vars_link_node = rest_114.first();
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_112, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } finally {
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_106, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_105, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_104, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_103, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_102, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt173$Node__a_does_not_pass_sbhl_type_t, var_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_101, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_100, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_99, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_98, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_97, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_96, thread);
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
                        }
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Does FORMULA constrain VAR to be an instance of some disjoint
    collection type - implying there is at most one binding for VAR?
    Cf. bugs 12965 and 13135
     */
    @LispMethod(comment = "@return BOOLEANP; Does FORMULA constrain VAR to be an instance of some disjoint\r\ncollection type - implying there is at most one binding for VAR?\r\nCf. bugs 12965 and 13135")
    public static SubLObject pph_disjoint_meta_isa_formulaP(final SubLObject var, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != formula_pattern_match.formula_matches_pattern(formula, list($$isa, $ANYTHING, var))) {
            final SubLObject var_type = pph_variable_handling.pph_var_type(var);
            if ((NIL != cycl_utilities.reified_term_p(var_type)) && (NIL == ans)) {
                SubLObject node_var = var_type;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$121 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = $$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str180$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str175$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$126 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(var_type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$125 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while ((NIL != node_var) && (NIL == ans)) {
                                                final SubLObject genl = node_var;
                                                ans = makeBoolean((NIL != pph_utilities.pph_isaP(genl, $$FacetingCollectionType, UNPROVIDED)) || (NIL != pph_utilities.pph_isaP(genl, $$DisjointCollectionType, UNPROVIDED)));
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$125;
                                                SubLObject _prev_bind_1_$126;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$126;
                                                SubLObject iteration_state_$133;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$127;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$135;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$128;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == ans) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$125 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == ans) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$126 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == ans) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133)); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == ans) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == ans) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str184$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$127, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$133);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$126, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str185$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$135 = NIL, rest_$135 = new_list; (NIL == ans) && (NIL != rest_$135); rest_$135 = rest_$135.rest()) {
                                                                    generating_fn = rest_$135.first();
                                                                    _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == ans) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == ans) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str184$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$128, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$126, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$125, thread);
                                                    }
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$127, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$125, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$124, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str186$Node__a_does_not_pass_sbhl_type_t, var_type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$126, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$124, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$123, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$123, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$122, thread);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$121, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }

    /**
     *
     *
     * @param PHRASE;
    PPH-PHRASE-P.
     * 		
     * @return BOOLEAN; whether or not the first two dtrs of PHRASE are its subject and head verb.
     */
    @LispMethod(comment = "@param PHRASE;\nPPH-PHRASE-P.\r\n\t\t\r\n@return BOOLEAN; whether or not the first two dtrs of PHRASE are its subject and head verb.")
    public static final SubLObject pph_phrase_subject_head_verb_initialP_alt(SubLObject phrase) {
        return makeBoolean((((NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) && document.sign_length(phrase).numG(ONE_INTEGER)) && pph_phrase.pph_phrase_head_dtr_num(phrase).eql(ONE_INTEGER)) && (NIL != pph_phrase.pph_phrase_head_verbP(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER))));
    }

    /**
     *
     *
     * @param PHRASE;
    PPH-PHRASE-P.
     * 		
     * @return BOOLEAN; whether or not the first two dtrs of PHRASE are its subject and head verb.
     */
    @LispMethod(comment = "@param PHRASE;\nPPH-PHRASE-P.\r\n\t\t\r\n@return BOOLEAN; whether or not the first two dtrs of PHRASE are its subject and head verb.")
    public static SubLObject pph_phrase_subject_head_verb_initialP(final SubLObject phrase) {
        if ((pph_phrase.pph_phrase_dtr_count(phrase).numG(ONE_INTEGER) && pph_phrase.pph_phrase_head_dtr_num(phrase).eql(ONE_INTEGER)) && (NIL != pph_phrase.pph_phrase_head_verbP(pph_phrase.pph_phrase_nth_dtr(phrase, ONE_INTEGER)))) {
            return T;
        }
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return NIL;
        }
        if (NIL != pph_phrase_subject_head_verb_initialP(pph_phrase.pph_phrase_nth_dtr(phrase, ZERO_INTEGER))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject clear_modal_strings_alt() {
        {
            SubLObject cs = $modal_strings_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_modal_strings() {
        final SubLObject cs = $modal_strings_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_modal_strings_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($modal_strings_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_modal_strings() {
        return memoization_state.caching_state_remove_function_results_with_args($modal_strings_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject modal_strings_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strings = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        strings = kb_mapping_utilities.pred_values($$Modal, $$partOfSpeech, TWO_INTEGER, THREE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return strings;
            }
        }
    }

    public static SubLObject modal_strings_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            strings = kb_mapping_utilities.pred_values($$Modal, $$partOfSpeech, TWO_INTEGER, THREE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return strings;
    }

    public static final SubLObject modal_strings_alt() {
        {
            SubLObject caching_state = $modal_strings_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MODAL_STRINGS, $modal_strings_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.modal_strings_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject modal_strings() {
        SubLObject caching_state = $modal_strings_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MODAL_STRINGS, $modal_strings_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(modal_strings_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_modal_words_alt() {
        {
            SubLObject cs = $modal_words_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_modal_words() {
        final SubLObject cs = $modal_words_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_modal_words_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($modal_words_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_modal_words() {
        return memoization_state.caching_state_remove_function_results_with_args($modal_words_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject modal_words_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject words = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        words = kb_mapping_utilities.pred_values($$Modal, $$partOfSpeech, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return words;
            }
        }
    }

    public static SubLObject modal_words_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            words = kb_mapping_utilities.pred_values($$Modal, $$partOfSpeech, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return words;
    }

    public static final SubLObject modal_words_alt() {
        {
            SubLObject caching_state = $modal_words_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(MODAL_WORDS, $modal_words_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw22$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.pph_question.modal_words_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject modal_words() {
        SubLObject caching_state = $modal_words_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MODAL_WORDS, $modal_words_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(modal_words_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject declare_pph_question_file_alt() {
        declareFunction("generate_question", "GENERATE-QUESTION", 1, 4, false);
        declareFunction("pph_default_question_preds", "PPH-DEFAULT-QUESTION-PREDS", 0, 0, false);
        declareFunction("pph_question_clause", "PPH-QUESTION-CLAUSE", 2, 0, false);
        declareFunction("pph_question_clause_memoized_internal", "PPH-QUESTION-CLAUSE-MEMOIZED-INTERNAL", 2, 2, false);
        declareFunction("pph_question_clause_memoized", "PPH-QUESTION-CLAUSE-MEMOIZED", 2, 2, false);
        declareFunction("pph_remove_hypothetical", "PPH-REMOVE-HYPOTHETICAL", 1, 1, false);
        declareFunction("pph_hypothesize_antecedent_varsP", "PPH-HYPOTHESIZE-ANTECEDENT-VARS?", 1, 0, false);
        declareFunction("pph_question_register_hypothetical_vars", "PPH-QUESTION-REGISTER-HYPOTHETICAL-VARS", 1, 0, false);
        declareFunction("pph_add_hypothetical_paraphrase", "PPH-ADD-HYPOTHETICAL-PARAPHRASE", 6, 0, false);
        declareFunction("generate_question_non_propositional", "GENERATE-QUESTION-NON-PROPOSITIONAL", 2, 0, false);
        declareFunction("question_paraphrase_availableP", "QUESTION-PARAPHRASE-AVAILABLE?", 1, 3, false);
        declareFunction("clear_past_tense_formP", "CLEAR-PAST-TENSE-FORM?", 0, 0, false);
        declareFunction("remove_past_tense_formP", "REMOVE-PAST-TENSE-FORM?", 1, 1, false);
        declareFunction("past_tense_formP_internal", "PAST-TENSE-FORM?-INTERNAL", 2, 0, false);
        declareFunction("past_tense_formP", "PAST-TENSE-FORM?", 1, 1, false);
        declareFunction("prefer_past_tense_formP", "PREFER-PAST-TENSE-FORM?", 1, 0, false);
        declareFunction("generate_question_from_genquestion", "GENERATE-QUESTION-FROM-GENQUESTION", 1, 2, false);
        declareFunction("pph_question_arg", "PPH-QUESTION-ARG", 1, 0, false);
        declareFunction("get_genquestion_formula", "GET-GENQUESTION-FORMULA", 2, 0, false);
        declareFunction("get_genq_bindings", "GET-GENQ-BINDINGS", 1, 0, false);
        declareFunction("pph_blank_count", "PPH-BLANK-COUNT", 1, 0, false);
        declareFunction("generate_question_from_query_template", "GENERATE-QUESTION-FROM-QUERY-TEMPLATE", 1, 2, false);
        declareFunction("pph_phrase_ok_for_gtqsP", "PPH-PHRASE-OK-FOR-GTQS?", 2, 0, false);
        declareFunction("clear_gen_template_query_sentence_index", "CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        declareFunction("add_gen_template_query_sentence", "ADD-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        declareFunction("remove_gen_template_query_sentence", "REMOVE-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        declareFunction("initialize_gen_template_query_sentence_index", "INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        declareFunction("gen_template_query_sentence_lookup", "GEN-TEMPLATE-QUERY-SENTENCE-LOOKUP", 1, 0, false);
        declareFunction("pph_visible_lexical_assertionP", "PPH-VISIBLE-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction("gen_template_query_sentence_candidates", "GEN-TEMPLATE-QUERY-SENTENCE-CANDIDATES", 1, 0, false);
        declareFunction("gtqs_assertions_for_query_sentence", "GTQS-ASSERTIONS-FOR-QUERY-SENTENCE", 2, 0, false);
        declareFunction("gtqs_assertion_matches_query_sentenceP", "GTQS-ASSERTION-MATCHES-QUERY-SENTENCE?", 2, 1, false);
        declareFunction("gtqs_assertion_bindings_for_query_sentence_internal", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE-INTERNAL", 2, 1, false);
        declareFunction("gtqs_assertion_bindings_for_query_sentence", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE", 2, 1, false);
        declareFunction("hlify_gtqs_template_variables", "HLIFY-GTQS-TEMPLATE-VARIABLES", 1, 0, false);
        declareFunction("gtqs_bindings_from_unification_bindings", "GTQS-BINDINGS-FROM-UNIFICATION-BINDINGS", 4, 0, false);
        declareFunction("gtqs_one_arg_position", "GTQS-ONE-ARG-POSITION", 2, 0, false);
        declareFunction("gtqs_specified_arg_matchesP", "GTQS-SPECIFIED-ARG-MATCHES?", 4, 0, false);
        declareFunction("pph_query_sentence_template_keywords", "PPH-QUERY-SENTENCE-TEMPLATE-KEYWORDS", 1, 0, false);
        declareFunction("pph_query_sentence_template_vars", "PPH-QUERY-SENTENCE-TEMPLATE-VARS", 1, 0, false);
        declareFunction("pph_question_template_unify", "PPH-QUESTION-TEMPLATE-UNIFY", 2, 0, false);
        declareFunction("pph_hide_el_vars", "PPH-HIDE-EL-VARS", 1, 0, false);
        declareFunction("pph_unhide_el_vars", "PPH-UNHIDE-EL-VARS", 1, 0, false);
        declareFunction("pph_unify_possible_formula", "PPH-UNIFY-POSSIBLE-FORMULA", 2, 0, false);
        declareFunction("pph_unify_possible_args", "PPH-UNIFY-POSSIBLE-ARGS", 2, 0, false);
        declareFunction("pph_unify_check_recursion_depth", "PPH-UNIFY-CHECK-RECURSION-DEPTH", 0, 0, false);
        declareFunction("pph_commutative_functor_p", "PPH-COMMUTATIVE-FUNCTOR-P", 1, 0, false);
        declareFunction("pph_unify_gtqs", "PPH-UNIFY-GTQS", 2, 0, false);
        declareFunction("pph_unify_formula_template", "PPH-UNIFY-FORMULA-TEMPLATE", 2, 1, false);
        declareFunction("pph_unify_formula_template_memoized_internal", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("pph_unify_formula_template_memoized", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED", 3, 0, false);
        declareFunction("unification_bindings_from_result", "UNIFICATION-BINDINGS-FROM-RESULT", 1, 0, false);
        declareFunction("pph_unify_args", "PPH-UNIFY-ARGS", 3, 0, false);
        declareFunction("pph_unify_args_memoized_internal", "PPH-UNIFY-ARGS-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction("pph_unify_args_memoized", "PPH-UNIFY-ARGS-MEMOIZED", 4, 0, false);
        declareFunction("pph_unify_ordered_args", "PPH-UNIFY-ORDERED-ARGS", 3, 0, false);
        declareFunction("pph_unify_args_permutations", "PPH-UNIFY-ARGS-PERMUTATIONS", 3, 0, false);
        declareFunction("pph_arglist_permutations", "PPH-ARGLIST-PERMUTATIONS", 1, 0, false);
        declareFunction("pph_phrase_for_query_sentence_from_gtqs_as", "PPH-PHRASE-FOR-QUERY-SENTENCE-FROM-GTQS-AS", 3, 0, false);
        declareFunction("dummy_query_sentence_for_gtqs_assertion", "DUMMY-QUERY-SENTENCE-FOR-GTQS-ASSERTION", 1, 0, false);
        declareFunction("verify_all_gtqs_assertions", "VERIFY-ALL-GTQS-ASSERTIONS", 0, 1, false);
        declareFunction("verify_one_gtqs_assertion", "VERIFY-ONE-GTQS-ASSERTION", 2, 0, false);
        declareFunction("verify_one_gtqs_assertion_with_query_sentence", "VERIFY-ONE-GTQS-ASSERTION-WITH-QUERY-SENTENCE", 3, 0, false);
        declareFunction("generate_question_bf", "GENERATE-QUESTION-BF", 1, 3, false);
        declareFunction("pph_brute_force_yes_no_preamble_strings", "PPH-BRUTE-FORCE-YES-NO-PREAMBLE-STRINGS", 0, 2, false);
        declareFunction("pph_brute_force_true_or_false_string", "PPH-BRUTE-FORCE-TRUE-OR-FALSE-STRING", 1, 0, false);
        declareFunction("pph_brute_force_false_string", "PPH-BRUTE-FORCE-FALSE-STRING", 0, 0, false);
        declareFunction("pph_brute_force_capitalize_false_string_p", "PPH-BRUTE-FORCE-CAPITALIZE-FALSE-STRING-P", 0, 0, false);
        declareFunction("pph_brute_force_wh_preamble_olist", "PPH-BRUTE-FORCE-WH-PREAMBLE-OLIST", 5, 0, false);
        declareFunction("pph_brute_force_wh_phrase_olist", "PPH-BRUTE-FORCE-WH-PHRASE-OLIST", 4, 0, false);
        declareFunction("new_pph_phrase_filler_item", "NEW-PPH-PHRASE-FILLER-ITEM", 1, 0, false);
        declareFunction("new_pph_phrase_filler_items", "NEW-PPH-PHRASE-FILLER-ITEMS", 1, 0, false);
        declareFunction("pph_brute_force_olist_set_arg_positions", "PPH-BRUTE-FORCE-OLIST-SET-ARG-POSITIONS", 3, 0, false);
        declareFunction("pph_brute_force_wh_lexify_query_varsP", "PPH-BRUTE-FORCE-WH-LEXIFY-QUERY-VARS?", 2, 0, false);
        declareFunction("pph_question_declarative_string", "PPH-QUESTION-DECLARATIVE-STRING", 2, 3, false);
        declareFunction("pph_remove_redundant_query_var_typing_clauses", "PPH-REMOVE-REDUNDANT-QUERY-VAR-TYPING-CLAUSES", 3, 0, false);
        declareFunction("question_rop_formulaP", "QUESTION-ROP-FORMULA?", 1, 0, false);
        declareFunction("rop_formulaP", "ROP-FORMULA?", 1, 0, false);
        declareFunction("question_var_npP", "QUESTION-VAR-NP?", 1, 0, false);
        declareFunction("el_var_det_nbarP", "EL-VAR-DET-NBAR?", 1, 0, false);
        declareFunction("el_var_np_var", "EL-VAR-NP-VAR", 1, 0, false);
        declareFunction("number_varP", "NUMBER-VAR?", 2, 0, false);
        declareFunction("no_number_varsP", "NO-NUMBER-VARS?", 2, 0, false);
        declareFunction("formula_ok_for_subj_aux_inversionP", "FORMULA-OK-FOR-SUBJ-AUX-INVERSION?", 1, 0, false);
        declareFunction("rmp_formula_to_intermediate_cycl", "RMP-FORMULA-TO-INTERMEDIATE-CYCL", 1, 0, false);
        declareFunction("op_ok_for_i_cyclP", "OP-OK-FOR-I-CYCL?", 1, 0, false);
        declareFunction("remove_var_typing_clauses_from_question_phrase", "REMOVE-VAR-TYPING-CLAUSES-FROM-QUESTION-PHRASE", 1, 0, false);
        declareFunction("generate_with_subj_aux_inversion", "GENERATE-WITH-SUBJ-AUX-INVERSION", 1, 2, false);
        declareFunction("make_question_template", "MAKE-QUESTION-TEMPLATE", 2, 1, false);
        declareFunction("pph_phrase_add_do_supportXinvert", "PPH-PHRASE-ADD-DO-SUPPORT&INVERT", 1, 0, false);
        declareFunction("question_phraseP", "QUESTION-PHRASE?", 3, 0, false);
        declareFunction("pph_temporal_location_var_phraseP", "PPH-TEMPORAL-LOCATION-VAR-PHRASE?", 1, 0, false);
        declareFunction("find_question_subphrase", "FIND-QUESTION-SUBPHRASE", 1, 0, false);
        declareFunction("find_question_subphrase_int", "FIND-QUESTION-SUBPHRASE-INT", 2, 1, false);
        declareFunction("pph_subphrase_path_p", "PPH-SUBPHRASE-PATH-P", 1, 0, false);
        declareFunction("question_phrase_candidate_passes_filterP", "QUESTION-PHRASE-CANDIDATE-PASSES-FILTER?", 2, 0, false);
        declareFunction("pph_try_question_phrase_filter", "PPH-TRY-QUESTION-PHRASE-FILTER", 2, 0, false);
        declareFunction("pph_use_who_for_var_in_formulaP", "PPH-USE-WHO-FOR-VAR-IN-FORMULA?", 2, 0, false);
        declareFunction("pph_use_when_for_phraseP", "PPH-USE-WHEN-FOR-PHRASE?", 1, 0, false);
        declareFunction("string_for_var_in_question_phrase", "STRING-FOR-VAR-IN-QUESTION-PHRASE", 2, 0, false);
        declareFunction("pph_use_whomP", "PPH-USE-WHOM?", 0, 0, false);
        declareFunction("pph_use_whom_for_phraseP", "PPH-USE-WHOM-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_set_who_or_whom", "PPH-PHRASE-SET-WHO-OR-WHOM", 1, 1, false);
        declareFunction("pph_new_when_phrase_from_phrase", "PPH-NEW-WHEN-PHRASE-FROM-PHRASE", 1, 0, false);
        declareFunction("pph_find_temporal_location_var_dtr", "PPH-FIND-TEMPORAL-LOCATION-VAR-DTR", 1, 0, false);
        declareFunction("pph_single_entry_varP", "PPH-SINGLE-ENTRY-VAR?", 2, 0, false);
        declareFunction("pph_disjoint_meta_isa_formulaP", "PPH-DISJOINT-META-ISA-FORMULA?", 2, 0, false);
        declareFunction("pph_phrase_subject_head_verb_initialP", "PPH-PHRASE-SUBJECT-HEAD-VERB-INITIAL?", 1, 0, false);
        declareFunction("clear_modal_strings", "CLEAR-MODAL-STRINGS", 0, 0, false);
        declareFunction("remove_modal_strings", "REMOVE-MODAL-STRINGS", 0, 0, false);
        declareFunction("modal_strings_internal", "MODAL-STRINGS-INTERNAL", 0, 0, false);
        declareFunction("modal_strings", "MODAL-STRINGS", 0, 0, false);
        declareFunction("clear_modal_words", "CLEAR-MODAL-WORDS", 0, 0, false);
        declareFunction("remove_modal_words", "REMOVE-MODAL-WORDS", 0, 0, false);
        declareFunction("modal_words_internal", "MODAL-WORDS-INTERNAL", 0, 0, false);
        declareFunction("modal_words", "MODAL-WORDS", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_pph_question_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("generate_question", "GENERATE-QUESTION", 1, 4, false);
            declareFunction("pph_standardize_query_sentence", "PPH-STANDARDIZE-QUERY-SENTENCE", 1, 0, false);
            declareFunction("pph_standardize_query_term", "PPH-STANDARDIZE-QUERY-TERM", 1, 0, false);
            declareFunction("pph_default_question_preds", "PPH-DEFAULT-QUESTION-PREDS", 0, 0, false);
            declareFunction("pph_question_clause", "PPH-QUESTION-CLAUSE", 2, 0, false);
            declareFunction("pph_question_clause_memoized_internal", "PPH-QUESTION-CLAUSE-MEMOIZED-INTERNAL", 2, 3, false);
            declareFunction("pph_question_clause_memoized", "PPH-QUESTION-CLAUSE-MEMOIZED", 2, 3, false);
            declareFunction("pph_remove_hypothetical", "PPH-REMOVE-HYPOTHETICAL", 1, 1, false);
            declareFunction("pph_hypothesize_antecedent_varsP", "PPH-HYPOTHESIZE-ANTECEDENT-VARS?", 1, 0, false);
            declareFunction("pph_question_register_hypothetical_vars", "PPH-QUESTION-REGISTER-HYPOTHETICAL-VARS", 1, 0, false);
            declareFunction("pph_add_hypothetical_paraphrase", "PPH-ADD-HYPOTHETICAL-PARAPHRASE", 7, 0, false);
            declareFunction("generate_question_non_propositional", "GENERATE-QUESTION-NON-PROPOSITIONAL", 2, 0, false);
            declareFunction("question_paraphrase_availableP", "QUESTION-PARAPHRASE-AVAILABLE?", 1, 3, false);
            declareFunction("clear_past_tense_formP", "CLEAR-PAST-TENSE-FORM?", 0, 0, false);
            declareFunction("remove_past_tense_formP", "REMOVE-PAST-TENSE-FORM?", 1, 1, false);
            declareFunction("past_tense_formP_internal", "PAST-TENSE-FORM?-INTERNAL", 2, 0, false);
            declareFunction("past_tense_formP", "PAST-TENSE-FORM?", 1, 1, false);
            declareFunction("prefer_past_tense_formP", "PREFER-PAST-TENSE-FORM?", 1, 0, false);
            declareFunction("generate_question_from_genquestion", "GENERATE-QUESTION-FROM-GENQUESTION", 1, 2, false);
            declareFunction("pph_question_arg", "PPH-QUESTION-ARG", 1, 0, false);
            declareFunction("get_genquestion_formula", "GET-GENQUESTION-FORMULA", 2, 0, false);
            declareFunction("get_genq_bindings", "GET-GENQ-BINDINGS", 1, 0, false);
            declareFunction("pph_blank_count", "PPH-BLANK-COUNT", 1, 0, false);
            declareFunction("generate_question_from_query_template", "GENERATE-QUESTION-FROM-QUERY-TEMPLATE", 1, 2, false);
            declareFunction("pph_phrase_ok_for_gtqsP", "PPH-PHRASE-OK-FOR-GTQS?", 2, 0, false);
            declareFunction("clear_gen_template_query_sentence_index", "CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
            declareFunction("add_gen_template_query_sentence", "ADD-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
            declareFunction("remove_gen_template_query_sentence", "REMOVE-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
            declareFunction("initialize_gen_template_query_sentence_index", "INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
            declareFunction("gen_template_query_sentence_lookup", "GEN-TEMPLATE-QUERY-SENTENCE-LOOKUP", 1, 0, false);
            declareFunction("pph_visible_lexical_assertionP", "PPH-VISIBLE-LEXICAL-ASSERTION?", 1, 0, false);
            declareFunction("gen_template_query_sentence_candidates", "GEN-TEMPLATE-QUERY-SENTENCE-CANDIDATES", 1, 0, false);
            declareFunction("gtqs_assertions_for_query_sentence", "GTQS-ASSERTIONS-FOR-QUERY-SENTENCE", 2, 0, false);
            declareFunction("gtqs_assertion_constant_count", "GTQS-ASSERTION-CONSTANT-COUNT", 1, 0, false);
            declareFunction("gtqs_assertion_matches_query_sentenceP", "GTQS-ASSERTION-MATCHES-QUERY-SENTENCE?", 2, 1, false);
            declareFunction("gtqs_assertion_bindings_for_query_sentence_internal", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE-INTERNAL", 2, 1, false);
            declareFunction("gtqs_assertion_bindings_for_query_sentence", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE", 2, 1, false);
            declareFunction("hlify_gtqs_template_variables", "HLIFY-GTQS-TEMPLATE-VARIABLES", 1, 0, false);
            declareFunction("non_hypothesized_el_varP", "NON-HYPOTHESIZED-EL-VAR?", 1, 0, false);
            declareFunction("gtqs_bindings_from_unification_bindings", "GTQS-BINDINGS-FROM-UNIFICATION-BINDINGS", 4, 0, false);
            declareFunction("gtqs_one_arg_position", "GTQS-ONE-ARG-POSITION", 2, 0, false);
            declareFunction("gtqs_specified_arg_matchesP", "GTQS-SPECIFIED-ARG-MATCHES?", 4, 0, false);
            declareFunction("pph_query_sentence_template_keywords", "PPH-QUERY-SENTENCE-TEMPLATE-KEYWORDS", 1, 0, false);
            declareFunction("pph_query_sentence_template_vars", "PPH-QUERY-SENTENCE-TEMPLATE-VARS", 1, 0, false);
            declareFunction("pph_question_template_unify", "PPH-QUESTION-TEMPLATE-UNIFY", 2, 0, false);
            declareFunction("pph_hide_el_vars", "PPH-HIDE-EL-VARS", 1, 0, false);
            declareFunction("pph_unhide_el_vars", "PPH-UNHIDE-EL-VARS", 1, 0, false);
            declareFunction("pph_unify_possible_formula", "PPH-UNIFY-POSSIBLE-FORMULA", 2, 0, false);
            declareFunction("pph_unify_possible_args", "PPH-UNIFY-POSSIBLE-ARGS", 2, 0, false);
            declareFunction("pph_unify_check_recursion_depth", "PPH-UNIFY-CHECK-RECURSION-DEPTH", 0, 0, false);
            declareFunction("pph_commutative_functor_p", "PPH-COMMUTATIVE-FUNCTOR-P", 1, 0, false);
            declareFunction("pph_unify_gtqs", "PPH-UNIFY-GTQS", 2, 0, false);
            declareFunction("pph_unify_formula_template", "PPH-UNIFY-FORMULA-TEMPLATE", 2, 1, false);
            declareFunction("pph_unify_formula_template_memoized_internal", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED-INTERNAL", 3, 0, false);
            declareFunction("pph_unify_formula_template_memoized", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED", 3, 0, false);
            declareFunction("unification_bindings_from_result", "UNIFICATION-BINDINGS-FROM-RESULT", 1, 0, false);
            declareFunction("pph_unify_args", "PPH-UNIFY-ARGS", 3, 0, false);
            declareFunction("pph_unify_args_memoized_internal", "PPH-UNIFY-ARGS-MEMOIZED-INTERNAL", 4, 0, false);
            declareFunction("pph_unify_args_memoized", "PPH-UNIFY-ARGS-MEMOIZED", 4, 0, false);
            declareFunction("pph_unify_ordered_args", "PPH-UNIFY-ORDERED-ARGS", 3, 0, false);
            declareFunction("pph_unify_args_permutations", "PPH-UNIFY-ARGS-PERMUTATIONS", 3, 0, false);
            declareFunction("pph_arglist_permutations", "PPH-ARGLIST-PERMUTATIONS", 1, 0, false);
            declareFunction("pph_phrase_for_query_sentence_from_gtqs_as", "PPH-PHRASE-FOR-QUERY-SENTENCE-FROM-GTQS-AS", 3, 0, false);
            declareFunction("replace_gtqs_template_terms", "REPLACE-GTQS-TEMPLATE-TERMS", 4, 0, false);
            declareFunction("dummy_query_sentence_for_gtqs_assertion", "DUMMY-QUERY-SENTENCE-FOR-GTQS-ASSERTION", 1, 0, false);
            declareFunction("verify_all_gtqs_assertions", "VERIFY-ALL-GTQS-ASSERTIONS", 0, 1, false);
            declareFunction("verify_one_gtqs_assertion", "VERIFY-ONE-GTQS-ASSERTION", 2, 0, false);
            declareFunction("verify_one_gtqs_assertion_with_query_sentence", "VERIFY-ONE-GTQS-ASSERTION-WITH-QUERY-SENTENCE", 3, 0, false);
            declareFunction("generate_question_bf", "GENERATE-QUESTION-BF", 1, 3, false);
            declareFunction("pph_brute_force_yes_no_preamble_strings", "PPH-BRUTE-FORCE-YES-NO-PREAMBLE-STRINGS", 0, 2, false);
            declareFunction("pph_brute_force_true_or_false_string", "PPH-BRUTE-FORCE-TRUE-OR-FALSE-STRING", 1, 0, false);
            declareFunction("pph_brute_force_false_string", "PPH-BRUTE-FORCE-FALSE-STRING", 0, 0, false);
            declareFunction("pph_brute_force_capitalize_false_string_p", "PPH-BRUTE-FORCE-CAPITALIZE-FALSE-STRING-P", 0, 0, false);
            declareFunction("pph_brute_force_wh_preamble_olist", "PPH-BRUTE-FORCE-WH-PREAMBLE-OLIST", 5, 0, false);
            declareFunction("pph_brute_force_wh_phrase_olist", "PPH-BRUTE-FORCE-WH-PHRASE-OLIST", 4, 0, false);
            declareFunction("new_pph_phrase_filler_item", "NEW-PPH-PHRASE-FILLER-ITEM", 1, 0, false);
            declareFunction("new_pph_phrase_filler_items", "NEW-PPH-PHRASE-FILLER-ITEMS", 1, 0, false);
            declareFunction("pph_brute_force_olist_set_arg_positions", "PPH-BRUTE-FORCE-OLIST-SET-ARG-POSITIONS", 3, 0, false);
            declareFunction("pph_brute_force_wh_lexify_query_varsP", "PPH-BRUTE-FORCE-WH-LEXIFY-QUERY-VARS?", 2, 0, false);
            declareFunction("pph_question_declarative_string", "PPH-QUESTION-DECLARATIVE-STRING", 2, 3, false);
            declareFunction("pph_remove_redundant_query_var_typing_clauses", "PPH-REMOVE-REDUNDANT-QUERY-VAR-TYPING-CLAUSES", 3, 0, false);
            declareFunction("question_rop_formulaP", "QUESTION-ROP-FORMULA?", 1, 0, false);
            declareFunction("rop_formulaP", "ROP-FORMULA?", 1, 0, false);
            declareFunction("question_var_npP", "QUESTION-VAR-NP?", 1, 0, false);
            declareFunction("pph_phrase_maybe_npP", "PPH-PHRASE-MAYBE-NP?", 1, 0, false);
            declareFunction("el_var_det_nbarP", "EL-VAR-DET-NBAR?", 1, 0, false);
            declareFunction("el_var_np_var", "EL-VAR-NP-VAR", 1, 0, false);
            declareFunction("number_varP", "NUMBER-VAR?", 2, 0, false);
            declareFunction("no_number_varsP", "NO-NUMBER-VARS?", 2, 0, false);
            declareFunction("formula_ok_for_subj_aux_inversionP", "FORMULA-OK-FOR-SUBJ-AUX-INVERSION?", 1, 0, false);
            declareFunction("rmp_formula_to_intermediate_cycl", "RMP-FORMULA-TO-INTERMEDIATE-CYCL", 1, 0, false);
            declareFunction("op_ok_for_i_cyclP", "OP-OK-FOR-I-CYCL?", 1, 0, false);
            declareFunction("remove_var_typing_clauses_from_question_phrase", "REMOVE-VAR-TYPING-CLAUSES-FROM-QUESTION-PHRASE", 1, 0, false);
            declareFunction("generate_with_subj_aux_inversion", "GENERATE-WITH-SUBJ-AUX-INVERSION", 1, 2, false);
            declareFunction("generate_phrase_with_subj_aux_inversion", "GENERATE-PHRASE-WITH-SUBJ-AUX-INVERSION", 4, 1, false);
            declareFunction("find_head_clause", "FIND-HEAD-CLAUSE", 1, 0, false);
            declareFunction("make_question_template", "MAKE-QUESTION-TEMPLATE", 2, 2, false);
            declareFunction("pph_phrase_add_do_supportXinvert", "PPH-PHRASE-ADD-DO-SUPPORT&INVERT", 1, 0, false);
            declareFunction("make_multi_word_perfect_verb", "MAKE-MULTI-WORD-PERFECT-VERB", 1, 0, false);
            declareFunction("question_phraseP", "QUESTION-PHRASE?", 3, 0, false);
            declareFunction("pph_temporal_location_var_phraseP", "PPH-TEMPORAL-LOCATION-VAR-PHRASE?", 1, 0, false);
            declareFunction("find_question_subphrase", "FIND-QUESTION-SUBPHRASE", 1, 0, false);
            declareFunction("find_question_subphrase_int", "FIND-QUESTION-SUBPHRASE-INT", 2, 0, false);
            declareFunction("pph_subphrase_path_p", "PPH-SUBPHRASE-PATH-P", 1, 0, false);
            declareFunction("pph_use_who_for_var_in_formulaP", "PPH-USE-WHO-FOR-VAR-IN-FORMULA?", 2, 0, false);
            declareFunction("pph_use_when_for_phraseP", "PPH-USE-WHEN-FOR-PHRASE?", 1, 0, false);
            declareFunction("string_for_var_in_question_phrase", "STRING-FOR-VAR-IN-QUESTION-PHRASE", 2, 0, false);
            declareFunction("pph_use_whomP", "PPH-USE-WHOM?", 0, 0, false);
            declareFunction("pph_use_whom_for_phraseP", "PPH-USE-WHOM-FOR-PHRASE?", 1, 0, false);
            declareFunction("pph_phrase_set_who_or_whom", "PPH-PHRASE-SET-WHO-OR-WHOM", 1, 1, false);
            declareFunction("pph_new_when_phrase_from_phrase", "PPH-NEW-WHEN-PHRASE-FROM-PHRASE", 1, 0, false);
            declareFunction("pph_find_temporal_location_var_dtr", "PPH-FIND-TEMPORAL-LOCATION-VAR-DTR", 1, 0, false);
            declareFunction("pph_single_entry_varP", "PPH-SINGLE-ENTRY-VAR?", 2, 0, false);
            declareFunction("pph_disjoint_meta_isa_formulaP", "PPH-DISJOINT-META-ISA-FORMULA?", 2, 0, false);
            declareFunction("pph_phrase_subject_head_verb_initialP", "PPH-PHRASE-SUBJECT-HEAD-VERB-INITIAL?", 1, 0, false);
            declareFunction("clear_modal_strings", "CLEAR-MODAL-STRINGS", 0, 0, false);
            declareFunction("remove_modal_strings", "REMOVE-MODAL-STRINGS", 0, 0, false);
            declareFunction("modal_strings_internal", "MODAL-STRINGS-INTERNAL", 0, 0, false);
            declareFunction("modal_strings", "MODAL-STRINGS", 0, 0, false);
            declareFunction("clear_modal_words", "CLEAR-MODAL-WORDS", 0, 0, false);
            declareFunction("remove_modal_words", "REMOVE-MODAL-WORDS", 0, 0, false);
            declareFunction("modal_words_internal", "MODAL-WORDS-INTERNAL", 0, 0, false);
            declareFunction("modal_words", "MODAL-WORDS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("pph_question_clause_memoized_internal", "PPH-QUESTION-CLAUSE-MEMOIZED-INTERNAL", 2, 2, false);
            declareFunction("pph_question_clause_memoized", "PPH-QUESTION-CLAUSE-MEMOIZED", 2, 2, false);
            declareFunction("pph_add_hypothetical_paraphrase", "PPH-ADD-HYPOTHETICAL-PARAPHRASE", 6, 0, false);
            declareFunction("make_question_template", "MAKE-QUESTION-TEMPLATE", 2, 1, false);
            declareFunction("find_question_subphrase_int", "FIND-QUESTION-SUBPHRASE-INT", 2, 1, false);
            declareFunction("question_phrase_candidate_passes_filterP", "QUESTION-PHRASE-CANDIDATE-PASSES-FILTER?", 2, 0, false);
            declareFunction("pph_try_question_phrase_filter", "PPH-TRY-QUESTION-PHRASE-FILTER", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_pph_question_file_Previous() {
        declareFunction("generate_question", "GENERATE-QUESTION", 1, 4, false);
        declareFunction("pph_standardize_query_sentence", "PPH-STANDARDIZE-QUERY-SENTENCE", 1, 0, false);
        declareFunction("pph_standardize_query_term", "PPH-STANDARDIZE-QUERY-TERM", 1, 0, false);
        declareFunction("pph_default_question_preds", "PPH-DEFAULT-QUESTION-PREDS", 0, 0, false);
        declareFunction("pph_question_clause", "PPH-QUESTION-CLAUSE", 2, 0, false);
        declareFunction("pph_question_clause_memoized_internal", "PPH-QUESTION-CLAUSE-MEMOIZED-INTERNAL", 2, 3, false);
        declareFunction("pph_question_clause_memoized", "PPH-QUESTION-CLAUSE-MEMOIZED", 2, 3, false);
        declareFunction("pph_remove_hypothetical", "PPH-REMOVE-HYPOTHETICAL", 1, 1, false);
        declareFunction("pph_hypothesize_antecedent_varsP", "PPH-HYPOTHESIZE-ANTECEDENT-VARS?", 1, 0, false);
        declareFunction("pph_question_register_hypothetical_vars", "PPH-QUESTION-REGISTER-HYPOTHETICAL-VARS", 1, 0, false);
        declareFunction("pph_add_hypothetical_paraphrase", "PPH-ADD-HYPOTHETICAL-PARAPHRASE", 7, 0, false);
        declareFunction("generate_question_non_propositional", "GENERATE-QUESTION-NON-PROPOSITIONAL", 2, 0, false);
        declareFunction("question_paraphrase_availableP", "QUESTION-PARAPHRASE-AVAILABLE?", 1, 3, false);
        declareFunction("clear_past_tense_formP", "CLEAR-PAST-TENSE-FORM?", 0, 0, false);
        declareFunction("remove_past_tense_formP", "REMOVE-PAST-TENSE-FORM?", 1, 1, false);
        declareFunction("past_tense_formP_internal", "PAST-TENSE-FORM?-INTERNAL", 2, 0, false);
        declareFunction("past_tense_formP", "PAST-TENSE-FORM?", 1, 1, false);
        declareFunction("prefer_past_tense_formP", "PREFER-PAST-TENSE-FORM?", 1, 0, false);
        declareFunction("generate_question_from_genquestion", "GENERATE-QUESTION-FROM-GENQUESTION", 1, 2, false);
        declareFunction("pph_question_arg", "PPH-QUESTION-ARG", 1, 0, false);
        declareFunction("get_genquestion_formula", "GET-GENQUESTION-FORMULA", 2, 0, false);
        declareFunction("get_genq_bindings", "GET-GENQ-BINDINGS", 1, 0, false);
        declareFunction("pph_blank_count", "PPH-BLANK-COUNT", 1, 0, false);
        declareFunction("generate_question_from_query_template", "GENERATE-QUESTION-FROM-QUERY-TEMPLATE", 1, 2, false);
        declareFunction("pph_phrase_ok_for_gtqsP", "PPH-PHRASE-OK-FOR-GTQS?", 2, 0, false);
        declareFunction("clear_gen_template_query_sentence_index", "CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        declareFunction("add_gen_template_query_sentence", "ADD-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        declareFunction("remove_gen_template_query_sentence", "REMOVE-GEN-TEMPLATE-QUERY-SENTENCE", 2, 0, false);
        declareFunction("initialize_gen_template_query_sentence_index", "INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX", 0, 0, false);
        declareFunction("gen_template_query_sentence_lookup", "GEN-TEMPLATE-QUERY-SENTENCE-LOOKUP", 1, 0, false);
        declareFunction("pph_visible_lexical_assertionP", "PPH-VISIBLE-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction("gen_template_query_sentence_candidates", "GEN-TEMPLATE-QUERY-SENTENCE-CANDIDATES", 1, 0, false);
        declareFunction("gtqs_assertions_for_query_sentence", "GTQS-ASSERTIONS-FOR-QUERY-SENTENCE", 2, 0, false);
        declareFunction("gtqs_assertion_constant_count", "GTQS-ASSERTION-CONSTANT-COUNT", 1, 0, false);
        declareFunction("gtqs_assertion_matches_query_sentenceP", "GTQS-ASSERTION-MATCHES-QUERY-SENTENCE?", 2, 1, false);
        declareFunction("gtqs_assertion_bindings_for_query_sentence_internal", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE-INTERNAL", 2, 1, false);
        declareFunction("gtqs_assertion_bindings_for_query_sentence", "GTQS-ASSERTION-BINDINGS-FOR-QUERY-SENTENCE", 2, 1, false);
        declareFunction("hlify_gtqs_template_variables", "HLIFY-GTQS-TEMPLATE-VARIABLES", 1, 0, false);
        declareFunction("non_hypothesized_el_varP", "NON-HYPOTHESIZED-EL-VAR?", 1, 0, false);
        declareFunction("gtqs_bindings_from_unification_bindings", "GTQS-BINDINGS-FROM-UNIFICATION-BINDINGS", 4, 0, false);
        declareFunction("gtqs_one_arg_position", "GTQS-ONE-ARG-POSITION", 2, 0, false);
        declareFunction("gtqs_specified_arg_matchesP", "GTQS-SPECIFIED-ARG-MATCHES?", 4, 0, false);
        declareFunction("pph_query_sentence_template_keywords", "PPH-QUERY-SENTENCE-TEMPLATE-KEYWORDS", 1, 0, false);
        declareFunction("pph_query_sentence_template_vars", "PPH-QUERY-SENTENCE-TEMPLATE-VARS", 1, 0, false);
        declareFunction("pph_question_template_unify", "PPH-QUESTION-TEMPLATE-UNIFY", 2, 0, false);
        declareFunction("pph_hide_el_vars", "PPH-HIDE-EL-VARS", 1, 0, false);
        declareFunction("pph_unhide_el_vars", "PPH-UNHIDE-EL-VARS", 1, 0, false);
        declareFunction("pph_unify_possible_formula", "PPH-UNIFY-POSSIBLE-FORMULA", 2, 0, false);
        declareFunction("pph_unify_possible_args", "PPH-UNIFY-POSSIBLE-ARGS", 2, 0, false);
        declareFunction("pph_unify_check_recursion_depth", "PPH-UNIFY-CHECK-RECURSION-DEPTH", 0, 0, false);
        declareFunction("pph_commutative_functor_p", "PPH-COMMUTATIVE-FUNCTOR-P", 1, 0, false);
        declareFunction("pph_unify_gtqs", "PPH-UNIFY-GTQS", 2, 0, false);
        declareFunction("pph_unify_formula_template", "PPH-UNIFY-FORMULA-TEMPLATE", 2, 1, false);
        declareFunction("pph_unify_formula_template_memoized_internal", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction("pph_unify_formula_template_memoized", "PPH-UNIFY-FORMULA-TEMPLATE-MEMOIZED", 3, 0, false);
        declareFunction("unification_bindings_from_result", "UNIFICATION-BINDINGS-FROM-RESULT", 1, 0, false);
        declareFunction("pph_unify_args", "PPH-UNIFY-ARGS", 3, 0, false);
        declareFunction("pph_unify_args_memoized_internal", "PPH-UNIFY-ARGS-MEMOIZED-INTERNAL", 4, 0, false);
        declareFunction("pph_unify_args_memoized", "PPH-UNIFY-ARGS-MEMOIZED", 4, 0, false);
        declareFunction("pph_unify_ordered_args", "PPH-UNIFY-ORDERED-ARGS", 3, 0, false);
        declareFunction("pph_unify_args_permutations", "PPH-UNIFY-ARGS-PERMUTATIONS", 3, 0, false);
        declareFunction("pph_arglist_permutations", "PPH-ARGLIST-PERMUTATIONS", 1, 0, false);
        declareFunction("pph_phrase_for_query_sentence_from_gtqs_as", "PPH-PHRASE-FOR-QUERY-SENTENCE-FROM-GTQS-AS", 3, 0, false);
        declareFunction("replace_gtqs_template_terms", "REPLACE-GTQS-TEMPLATE-TERMS", 4, 0, false);
        declareFunction("dummy_query_sentence_for_gtqs_assertion", "DUMMY-QUERY-SENTENCE-FOR-GTQS-ASSERTION", 1, 0, false);
        declareFunction("verify_all_gtqs_assertions", "VERIFY-ALL-GTQS-ASSERTIONS", 0, 1, false);
        declareFunction("verify_one_gtqs_assertion", "VERIFY-ONE-GTQS-ASSERTION", 2, 0, false);
        declareFunction("verify_one_gtqs_assertion_with_query_sentence", "VERIFY-ONE-GTQS-ASSERTION-WITH-QUERY-SENTENCE", 3, 0, false);
        declareFunction("generate_question_bf", "GENERATE-QUESTION-BF", 1, 3, false);
        declareFunction("pph_brute_force_yes_no_preamble_strings", "PPH-BRUTE-FORCE-YES-NO-PREAMBLE-STRINGS", 0, 2, false);
        declareFunction("pph_brute_force_true_or_false_string", "PPH-BRUTE-FORCE-TRUE-OR-FALSE-STRING", 1, 0, false);
        declareFunction("pph_brute_force_false_string", "PPH-BRUTE-FORCE-FALSE-STRING", 0, 0, false);
        declareFunction("pph_brute_force_capitalize_false_string_p", "PPH-BRUTE-FORCE-CAPITALIZE-FALSE-STRING-P", 0, 0, false);
        declareFunction("pph_brute_force_wh_preamble_olist", "PPH-BRUTE-FORCE-WH-PREAMBLE-OLIST", 5, 0, false);
        declareFunction("pph_brute_force_wh_phrase_olist", "PPH-BRUTE-FORCE-WH-PHRASE-OLIST", 4, 0, false);
        declareFunction("new_pph_phrase_filler_item", "NEW-PPH-PHRASE-FILLER-ITEM", 1, 0, false);
        declareFunction("new_pph_phrase_filler_items", "NEW-PPH-PHRASE-FILLER-ITEMS", 1, 0, false);
        declareFunction("pph_brute_force_olist_set_arg_positions", "PPH-BRUTE-FORCE-OLIST-SET-ARG-POSITIONS", 3, 0, false);
        declareFunction("pph_brute_force_wh_lexify_query_varsP", "PPH-BRUTE-FORCE-WH-LEXIFY-QUERY-VARS?", 2, 0, false);
        declareFunction("pph_question_declarative_string", "PPH-QUESTION-DECLARATIVE-STRING", 2, 3, false);
        declareFunction("pph_remove_redundant_query_var_typing_clauses", "PPH-REMOVE-REDUNDANT-QUERY-VAR-TYPING-CLAUSES", 3, 0, false);
        declareFunction("question_rop_formulaP", "QUESTION-ROP-FORMULA?", 1, 0, false);
        declareFunction("rop_formulaP", "ROP-FORMULA?", 1, 0, false);
        declareFunction("question_var_npP", "QUESTION-VAR-NP?", 1, 0, false);
        declareFunction("pph_phrase_maybe_npP", "PPH-PHRASE-MAYBE-NP?", 1, 0, false);
        declareFunction("el_var_det_nbarP", "EL-VAR-DET-NBAR?", 1, 0, false);
        declareFunction("el_var_np_var", "EL-VAR-NP-VAR", 1, 0, false);
        declareFunction("number_varP", "NUMBER-VAR?", 2, 0, false);
        declareFunction("no_number_varsP", "NO-NUMBER-VARS?", 2, 0, false);
        declareFunction("formula_ok_for_subj_aux_inversionP", "FORMULA-OK-FOR-SUBJ-AUX-INVERSION?", 1, 0, false);
        declareFunction("rmp_formula_to_intermediate_cycl", "RMP-FORMULA-TO-INTERMEDIATE-CYCL", 1, 0, false);
        declareFunction("op_ok_for_i_cyclP", "OP-OK-FOR-I-CYCL?", 1, 0, false);
        declareFunction("remove_var_typing_clauses_from_question_phrase", "REMOVE-VAR-TYPING-CLAUSES-FROM-QUESTION-PHRASE", 1, 0, false);
        declareFunction("generate_with_subj_aux_inversion", "GENERATE-WITH-SUBJ-AUX-INVERSION", 1, 2, false);
        declareFunction("generate_phrase_with_subj_aux_inversion", "GENERATE-PHRASE-WITH-SUBJ-AUX-INVERSION", 4, 1, false);
        declareFunction("find_head_clause", "FIND-HEAD-CLAUSE", 1, 0, false);
        declareFunction("make_question_template", "MAKE-QUESTION-TEMPLATE", 2, 2, false);
        declareFunction("pph_phrase_add_do_supportXinvert", "PPH-PHRASE-ADD-DO-SUPPORT&INVERT", 1, 0, false);
        declareFunction("make_multi_word_perfect_verb", "MAKE-MULTI-WORD-PERFECT-VERB", 1, 0, false);
        declareFunction("question_phraseP", "QUESTION-PHRASE?", 3, 0, false);
        declareFunction("pph_temporal_location_var_phraseP", "PPH-TEMPORAL-LOCATION-VAR-PHRASE?", 1, 0, false);
        declareFunction("find_question_subphrase", "FIND-QUESTION-SUBPHRASE", 1, 0, false);
        declareFunction("find_question_subphrase_int", "FIND-QUESTION-SUBPHRASE-INT", 2, 0, false);
        declareFunction("pph_subphrase_path_p", "PPH-SUBPHRASE-PATH-P", 1, 0, false);
        declareFunction("pph_use_who_for_var_in_formulaP", "PPH-USE-WHO-FOR-VAR-IN-FORMULA?", 2, 0, false);
        declareFunction("pph_use_when_for_phraseP", "PPH-USE-WHEN-FOR-PHRASE?", 1, 0, false);
        declareFunction("string_for_var_in_question_phrase", "STRING-FOR-VAR-IN-QUESTION-PHRASE", 2, 0, false);
        declareFunction("pph_use_whomP", "PPH-USE-WHOM?", 0, 0, false);
        declareFunction("pph_use_whom_for_phraseP", "PPH-USE-WHOM-FOR-PHRASE?", 1, 0, false);
        declareFunction("pph_phrase_set_who_or_whom", "PPH-PHRASE-SET-WHO-OR-WHOM", 1, 1, false);
        declareFunction("pph_new_when_phrase_from_phrase", "PPH-NEW-WHEN-PHRASE-FROM-PHRASE", 1, 0, false);
        declareFunction("pph_find_temporal_location_var_dtr", "PPH-FIND-TEMPORAL-LOCATION-VAR-DTR", 1, 0, false);
        declareFunction("pph_single_entry_varP", "PPH-SINGLE-ENTRY-VAR?", 2, 0, false);
        declareFunction("pph_disjoint_meta_isa_formulaP", "PPH-DISJOINT-META-ISA-FORMULA?", 2, 0, false);
        declareFunction("pph_phrase_subject_head_verb_initialP", "PPH-PHRASE-SUBJECT-HEAD-VERB-INITIAL?", 1, 0, false);
        declareFunction("clear_modal_strings", "CLEAR-MODAL-STRINGS", 0, 0, false);
        declareFunction("remove_modal_strings", "REMOVE-MODAL-STRINGS", 0, 0, false);
        declareFunction("modal_strings_internal", "MODAL-STRINGS-INTERNAL", 0, 0, false);
        declareFunction("modal_strings", "MODAL-STRINGS", 0, 0, false);
        declareFunction("clear_modal_words", "CLEAR-MODAL-WORDS", 0, 0, false);
        declareFunction("remove_modal_words", "REMOVE-MODAL-WORDS", 0, 0, false);
        declareFunction("modal_words_internal", "MODAL-WORDS-INTERNAL", 0, 0, false);
        declareFunction("modal_words", "MODAL-WORDS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_pph_question_file_alt() {
        deflexical("*PPH-DEFAULT-QUESTION-PREDS*", $list_alt9);
        deflexical("*PAST-TENSE-FORM?-CACHING-STATE*", NIL);
        defparameter("*PPH-USE-GTQS?*", T);
        deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX*", $UNINITIALIZED);
        deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*", make_lock($str_alt39$genTemplate_QuerySentence_index));
        defparameter("*PPH-UNIFY-TRY-ARG-PERMUTATIONS?*", NIL);
        deflexical("*PPH-UNIFY-RECURSION-LIMIT*", $int$40);
        defparameter("*PPH-UNIFY-RECURSION-DEPTH*", ZERO_INTEGER);
        deflexical("*MODAL-STRINGS-CACHING-STATE*", NIL);
        deflexical("*MODAL-WORDS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_pph_question_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*PPH-DEFAULT-QUESTION-PREDS*", $list11);
            deflexical("*PAST-TENSE-FORM?-CACHING-STATE*", NIL);
            defparameter("*PPH-USE-GTQS?*", T);
            deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX*", $UNINITIALIZED);
            deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*", make_lock($str42$genTemplate_QuerySentence_index));
            defparameter("*PPH-UNIFY-TRY-ARG-PERMUTATIONS?*", NIL);
            deflexical("*PPH-UNIFY-RECURSION-LIMIT*", $int$40);
            defparameter("*PPH-UNIFY-RECURSION-DEPTH*", ZERO_INTEGER);
            deflexical("*PPH-ARGLIST-PERMUTATIONS-MAX-ARITY*", SEVEN_INTEGER);
            deflexical("*MODAL-STRINGS-CACHING-STATE*", NIL);
            deflexical("*MODAL-WORDS-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PPH-DEFAULT-QUESTION-PREDS*", $list_alt9);
            deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*", make_lock($str_alt39$genTemplate_QuerySentence_index));
        }
        return NIL;
    }

    public static SubLObject init_pph_question_file_Previous() {
        deflexical("*PPH-DEFAULT-QUESTION-PREDS*", $list11);
        deflexical("*PAST-TENSE-FORM?-CACHING-STATE*", NIL);
        defparameter("*PPH-USE-GTQS?*", T);
        deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX*", $UNINITIALIZED);
        deflexical("*GEN-TEMPLATE-QUERY-SENTENCE-INDEX-LOCK*", make_lock($str42$genTemplate_QuerySentence_index));
        defparameter("*PPH-UNIFY-TRY-ARG-PERMUTATIONS?*", NIL);
        deflexical("*PPH-UNIFY-RECURSION-LIMIT*", $int$40);
        defparameter("*PPH-UNIFY-RECURSION-DEPTH*", ZERO_INTEGER);
        deflexical("*PPH-ARGLIST-PERMUTATIONS-MAX-ARITY*", SEVEN_INTEGER);
        deflexical("*MODAL-STRINGS-CACHING-STATE*", NIL);
        deflexical("*MODAL-WORDS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_question_file() {
        memoization_state.note_memoized_function(PPH_QUESTION_CLAUSE_MEMOIZED);
        memoization_state.note_globally_cached_function($sym30$PAST_TENSE_FORM_);
        register_kb_function(ADD_GEN_TEMPLATE_QUERY_SENTENCE);
        register_kb_function(REMOVE_GEN_TEMPLATE_QUERY_SENTENCE);
        memoization_state.note_memoized_function(GTQS_ASSERTION_BINDINGS_FOR_QUERY_SENTENCE);
        note_funcall_helper_function(PPH_UNIFY_POSSIBLE_FORMULA);
        note_funcall_helper_function(PPH_UNIFY_POSSIBLE_ARGS);
        note_funcall_helper_function(PPH_UNIFY_FORMULA_TEMPLATE);
        memoization_state.note_memoized_function(PPH_UNIFY_FORMULA_TEMPLATE_MEMOIZED);
        memoization_state.note_memoized_function(PPH_UNIFY_ARGS_MEMOIZED);
        memoization_state.note_globally_cached_function(MODAL_STRINGS);
        memoization_state.note_globally_cached_function(MODAL_WORDS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_question_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_question_file();
    }

    static {
    }

    static private final SubLString $str_alt5$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("tensed"));

    static private final SubLList $list_alt11 = list(makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"), makeSymbol("GENERATE-QUESTION-BF"));

    static private final SubLString $str_alt12$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt13$__ = makeString(") ");

    static private final SubLString $str_alt14$_is_not_a_ = makeString(" is not a ");

    static private final SubLList $list_alt17 = list(makeSymbol("GENERATE-QUESTION-BF"));

    static private final SubLString $str_alt18$__Entering_PPH_POSSIBLY_BINDING_V = makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");

    static private final SubLString $str_alt19$__Leaving_PPH_POSSIBLY_BINDING_VA = makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");

    static private final SubLString $str_alt20$______and__pph_var_types__are_now = makeString("~&... and *pph-var-types* are now ~S~%");

    public static final SubLSymbol $kw22$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt27 = list(ZERO_INTEGER);

    static private final SubLList $list_alt29 = list(makeSymbol("GENERATE-QUESTION-FROM-GENQUESTION"), makeSymbol("GENERATE-WITH-SUBJ-AUX-INVERSION"));

    static private final SubLString $str_alt37$__Trying____S = makeString("~&Trying~% ~S");

    static private final SubLString $str_alt39$genTemplate_QuerySentence_index = makeString("genTemplate-QuerySentence index");

    static private final SubLSymbol $sym46$PPH_VISIBLE_LEXICAL_ASSERTION_ = makeSymbol("PPH-VISIBLE-LEXICAL-ASSERTION?");

    static private final SubLSymbol $sym48$_ = makeSymbol(">");

    static private final SubLString $str_alt50$unexpected_result_from__UNIFY__S_ = makeString("unexpected result from (UNIFY ~S ~S):~% ~S~%");

    static private final SubLSymbol $sym51$PPH_ARG_POSITION_SPECIFIER_ = makeSymbol("PPH-ARG-POSITION-SPECIFIER?");

    static private final SubLList $list_alt52 = cons(makeSymbol("TEMPLATE-TERM"), makeSymbol("SENTENCE-TERM"));

    static private final SubLString $str_alt53$Failed_to_match__S_to_var_in_sent = makeString("Failed to match ~S to var in sentence. Got ~S~%");

    static private final SubLString $str_alt54$Couldn_t_get_arg_position_for__S_ = makeString("Couldn't get arg position for ~S in ~S");

    static private final SubLString $str_alt55$_S_doesn_t_match__S_of__S = makeString("~S doesn't match ~S of ~S");

    static private final SubLSymbol $sym57$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym59$EL_VAR_NAME_ = makeSymbol("EL-VAR-NAME?");

    static private final SubLString $str_alt64$Exceeded_PPH_unify_recursion_dept = makeString("Exceeded PPH unify recursion depth of ~S.~%");

    static private final SubLString $str_alt67$Not_in_unify_multiple_mode_ = makeString("Not in unify-multiple mode.");

    static private final SubLString $str_alt68$Couldn_t_unify____S____S______giv = makeString("Couldn't unify~% ~S~% ~S~% ...given ~S~%");

    static private final SubLString $str_alt69$Found_multiple_bindings_for____S_ = makeString("Found multiple bindings for~% ~S~% ~S ...given ~S~% ~S~%");

    static private final SubLString $str_alt71$Lost_assumed_bindings________S__ = makeString("Lost assumed bindings(?).~% ~S~%");

    static private final SubLString $str_alt72$__GTQS_Bindings___S___Map___S = makeString("~%GTQS Bindings: ~S~% Map: ~S");

    static private final SubLList $list_alt73 = cons(makeSymbol("TEMPLATE-TERM"), makeSymbol("LOCAL-ARG-POSITION"));

    static private final SubLString $str_alt74$GTQS__Couldn_t_find__S_in____S__ = makeString("GTQS: Couldn't find ~S in~% ~S~%");

    static private final SubLString $str_alt75$GTQS__Replacing__S_with__S__S = makeString("GTQS: Replacing ~S with ~S ~S");

    static private final SubLString $str_alt76$GTQS__Couldn_t_replace__S_for__S_ = makeString("GTQS: Couldn't replace ~S for ~S in ~S");

    static private final SubLString $str_alt81$Checking___genTemplate_QuerySente = makeString("Checking #$genTemplate-QuerySentence assertions...");

    static private final SubLString $str_alt82$__Matched__S_of__S___genTemplate_ = makeString("~&Matched ~S of ~S #$genTemplate-QuerySentence assertions.~% Time: ~S seconds.~%");

    static private final SubLString $str_alt83$Timed_out_after__S_seconds_on____ = makeString("Timed out after ~S seconds on~% ~S");

    static private final SubLString $str_alt84$Didn_t_find_gtqs_in_matches_____S = makeString("Didn't find gtqs in matches:~% ~S~%");

    static private final SubLList $list_alt86 = list(makeKeyword("BLANKS"), $VARS);

    static private final SubLString $str_alt90$was_ = makeString("was ");

    static private final SubLString $str_alt91$is_ = makeString("is ");

    static private final SubLString $str_alt92$it_ = makeString("it ");

    static private final SubLString $str_alt99$_there_such_that = makeString(" there such that");

    static private final SubLList $list_alt100 = list(reader_make_constant_shell("plural-Generic"));

    static private final SubLString $str_alt103$__Setting_arg_position_of__S_to__ = makeString("~&Setting arg-position of ~S to ~S from ~S.~%");

    static private final SubLSymbol $sym104$PPH_VAR_REGISTERED_AS_DEFAULT_ = makeSymbol("PPH-VAR-REGISTERED-AS-DEFAULT?");

    static private final SubLSymbol $sym109$QUESTION_ROP_FORMULA_ = makeSymbol("QUESTION-ROP-FORMULA?");

    static private final SubLSymbol $sym114$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    static private final SubLString $str_alt115$___S_determined_to_be_a_number_va = makeString("~&~S determined to be a number var in ~S~%");

    static private final SubLString $str_alt116$No_number_vars_in__S__ = makeString("No number vars in ~S~%");

    static private final SubLString $str_alt117$__Trying_to_generate__S_using_sub = makeString("~&Trying to generate ~S using subject-auxiliary inversion.~%");

    static private final SubLString $str_alt118$__Entering_WITHIN_NEW_PPH_DISCOUR = makeString("~&Entering WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");

    static private final SubLString $str_alt119$__Made_question_template__S = makeString("~&Made question template ~S");

    static private final SubLString $str_alt120$__Leaving_WITHIN_NEW_PPH_DISCOURS = makeString("~&Leaving WITHIN-NEW-PPH-DISCOURSE-CONTEXT, *pph-discourse-context* is~% ~S~%");

    static private final SubLString $str_alt121$__Not_subject_head_verb_initial__ = makeString("~&Not subject-head-verb-initial:~% ~S");

    static private final SubLSymbol $sym122$PPH_TENSE_PRED_ = makeSymbol("PPH-TENSE-PRED?");

    static private final SubLString $str_alt124$__Couldn_t_find_question_subphras = makeString("~&Couldn't find question subphrase:~% ~S");

    static private final SubLString $str_alt125$__Subject_dtr_of__S_is_a_wh_phras = makeString("~&Subject dtr of ~S is a wh-phrase; returning template as is.~%");

    static private final SubLString $str_alt126$___S_has_no_head_dtr__MAKE_QUESTI = makeString("~&~S has no head dtr; MAKE-QUESTION-TEMPLATE returning NIL.~%");

    static private final SubLString $str_alt127$__Head_dtr__S_is_a_copula__placin = makeString("~&Head dtr ~S is a copula; placing it in front of the subject.~%");

    static private final SubLString $str_alt128$__Head_dtr__S_is_an_auxiliary__pl = makeString("~&Head dtr ~S is an auxiliary; placing it in front of the subject.~%");

    static private final SubLString $str_alt129$___S_may_be_a_modal_verb__MAKE_QU = makeString("~&~S may be a modal verb; MAKE-QUESTION-TEMPLATE returning NIL~%");

    static private final SubLString $str_alt130$__Adding_do_support_to_template__ = makeString("~&Adding do support to template ~S");

    static private final SubLString $str_alt131$Fronting__S = makeString("Fronting ~S");

    static private final SubLSymbol $sym134$ROP_FORMULA_ = makeSymbol("ROP-FORMULA?");

    static private final SubLString $str_alt135$Found_question_phrase___S = makeString("Found question phrase: ~S");

    static private final SubLSymbol $sym136$PPH_PHRASE_NP_ = makeSymbol("PPH-PHRASE-NP?");

    static private final SubLString $str_alt143$in_STRING_FOR_VAR_IN_QUESTION_PHR = makeString("in STRING-FOR-VAR-IN-QUESTION-PHRASE: var is ~S~%");

    static private final SubLString $str_alt144$pph_var_type_for__S___S__ = makeString("pph-var-type for ~S: ~S~%");

    static private final SubLString $str_alt154$_or_what = makeString(" or what");

    static private final SubLString $str_alt163$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt168$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt172$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt173$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
}

/**
 * Total time: 2379 ms
 */
