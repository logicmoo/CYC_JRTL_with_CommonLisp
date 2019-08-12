/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RECOGNITION
 * source file: /cyc/top/cycl/rtp/recognition.lisp
 * created:     2019/07/03 17:38:39
 */
public final class recognition extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt67$ = makeString("");

    public static final SubLFile me = new recognition();

 public static final String myName = "com.cyc.cycjava.cycl.rtp.recognition";


    // defparameter
    // Definitions
    // should the parser use cached functions?
    /**
     * should the parser use cached functions?
     */
    @LispMethod(comment = "should the parser use cached functions?\ndefparameter")
    public static final SubLSymbol $rtp_use_caches$ = makeSymbol("*RTP-USE-CACHES*");

    // deflexical
    // should the parser return before trying to parse subconstituents?
    /**
     * should the parser return before trying to parse subconstituents?
     */
    @LispMethod(comment = "should the parser return before trying to parse subconstituents?\ndeflexical")
    public static final SubLSymbol $return_early$ = makeSymbol("*RETURN-EARLY*");

    // deflexical
    /**
     * should the parser eat up all possible *'ed items, or also return parses where
     * those are not eaten?
     */
    @LispMethod(comment = "should the parser eat up all possible *\'ed items, or also return parses where\r\nthose are not eaten?\ndeflexical\nshould the parser eat up all possible *\'ed items, or also return parses where\nthose are not eaten?")
    public static final SubLSymbol $greedy_kleene$ = makeSymbol("*GREEDY-KLEENE*");

    // deflexical
    /**
     * should semantic tests be performed internally by the parser, or externally,
     * by another mechanism
     */
    @LispMethod(comment = "should semantic tests be performed internally by the parser, or externally,\r\nby another mechanism\ndeflexical\nshould semantic tests be performed internally by the parser, or externally,\nby another mechanism")
    public static final SubLSymbol $rtp_perform_semantic_tests$ = makeSymbol("*RTP-PERFORM-SEMANTIC-TESTS*");

    // defparameter
    /**
     * should the parser require that an entire string be matched for it to return
     * an answer?
     */
    @LispMethod(comment = "should the parser require that an entire string be matched for it to return\r\nan answer?\ndefparameter\nshould the parser require that an entire string be matched for it to return\nan answer?")
    public static final SubLSymbol $parse_entire_string$ = makeSymbol("*PARSE-ENTIRE-STRING*");

    // defconstant
    /**
     * the word list to be used in chart-entries when the words have been exhausted
     */
    @LispMethod(comment = "the word list to be used in chart-entries when the words have been exhausted\ndefconstant")
    public static final SubLSymbol $completed_words_list$ = makeSymbol("*COMPLETED-WORDS-LIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $perform_template_component_join$ = makeSymbol("*PERFORM-TEMPLATE-COMPONENT-JOIN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $template_parse_includes_template_categories$ = makeSymbol("*TEMPLATE-PARSE-INCLUDES-TEMPLATE-CATEGORIES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $counted_template_set$ = makeSymbol("*COUNTED-TEMPLATE-SET*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rtp_display_filter_rules$ = makeSymbol("*RTP-DISPLAY-FILTER-RULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_best_templates_first$ = makeSymbol("*USE-BEST-TEMPLATES-FIRST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $partial_orders_hash$ = makeSymbol("*PARTIAL-ORDERS-HASH*");

    static private final SubLList $list1 = list(makeKeyword("COMPLETE"));

    static private final SubLList $list2 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    static private final SubLSymbol $sym4$__ = makeSymbol(">=");

    public static final SubLSymbol $rtp_trace_level$ = makeSymbol("*RTP-TRACE-LEVEL*");

    private static final SubLSymbol RTP_TRACER_OUTPUT = makeSymbol("RTP-TRACER-OUTPUT");







    private static final SubLSymbol FILTER_SEMANTIC_TESTS = makeSymbol("FILTER-SEMANTIC-TESTS");

    static private final SubLSymbol $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_ = makeSymbol("JOINABLE-TEMPLATE-COMPONENT-FORMULA?");

    private static final SubLSymbol TRANSFORM_JOINTEMPLATECOMPONENTS = makeSymbol("TRANSFORM-JOINTEMPLATECOMPONENTS");





    static private final SubLList $list19 = list(reader_make_constant_shell("TheList"), reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("VPTemplate"));

    private static final SubLSymbol $S_NP_VP = makeKeyword("S-NP-VP");

    private static final SubLSymbol $SBAR_WHNP_S = makeKeyword("SBAR-WHNP-S");





    static private final SubLString $str25$results_of_first_pass____S__ = makeString("results of first pass:~&~S~&");

    static private final SubLString $str26$working_on_entry1___S__ = makeString("working on entry1: ~S~&");

    static private final SubLString $str27$fully_bound_entries____S__ = makeString("fully-bound entries = ~S~&");

    static private final SubLString $str28$unbound_entries____S__ = makeString("unbound-entries = ~S~&");

    static private final SubLString $str29$recurring_on___S__ = makeString("recurring on: ~S~&");

    static private final SubLString $str32$FILTER_RULES___S__ = makeString("FILTER-RULES: ~S~%");



    static private final SubLSymbol $sym34$_ = makeSymbol(">");

    private static final SubLSymbol GET_COUNTED_SETHASH_ENTRY_COUNT = makeSymbol("GET-COUNTED-SETHASH-ENTRY-COUNT");

    static private final SubLString $str36$_2_words___a_2_ = makeString("~2%words: ~a~2%");

    static private final SubLString $str37$rule___a__transformation___a_2_ = makeString("rule: ~a~%transformation: ~a~2%");

    static private final SubLString $str38$_2_ = makeString("~2%");

    private static final SubLSymbol TEMPLATE_RULE_ASSERTION = makeSymbol("TEMPLATE-RULE-ASSERTION");

    private static final SubLSymbol TEMPLATE_CAN_PRECEDE = makeSymbol("TEMPLATE-CAN-PRECEDE");





    static private final SubLString $str46$split_sentence____S__ = makeString("split-sentence = ~S~&");

    static private final SubLString $str47$at_top_of_cdolist__current_entrie = makeString("at top of cdolist, current-entries = ~S~&");

    static private final SubLString $str48$top_entry____S__ = makeString("top entry = ~S~&");

    static private final SubLString $str49$template_item____S__ = makeString("template-item = ~S~&");

    static private final SubLString $str50$RTP_Chart_Entry_is_empty___ = makeString("RTP Chart Entry is empty.~&");

    static private final SubLString $str51$Equal_to_completed_word_list__ = makeString("Equal to completed word list~&");

    static private final SubLString $str52$No_hits_for_template_item__S__ = makeString("No hits for template item ~S~&");

    static private final SubLString $str53$current_entries____S__ = makeString("current-entries = ~S~&");

    static private final SubLString $str54$_________COMPLETED_ENTRIES_______ = makeString("~%~%***  COMPLETED ENTRIES  ***~%");

    static private final SubLList $list56 = list(makeSymbol("DENOT"), makeSymbol("WORDS-EATEN"));

    static private final SubLString $str57$adding_some_subconstits_for__S__ = makeString("adding some subconstits for ~S~&");

    static private final SubLString $str58$____split_out____S_____template_r = makeString("*** split-out = ~S***~&template-rest = ~S~&");

    static private final SubLString $str59$____splits____S_____ = makeString("*** splits = ~S***~&");

    static private final SubLString $str60$lyst__S__ = makeString("lyst=~S~&");

    static private final SubLString $str61$used_words____S__ = makeString("used-words = ~S~&");

    static private final SubLString $str62$length_of_used_words____S__ = makeString("length of used-words = ~S~&");

    static private final SubLString $str63$just_ate__S_words__ = makeString("just ate ~S words~&");

    static private final SubLString $str64$words_in_entry____S__ = makeString("words in entry = ~S~&");

    static private final SubLString $str65$subconstit_eaten____S__ = makeString("subconstit eaten = ~S~&");

    static private final SubLString $str66$subconstit_is__A_recursive__ = makeString("subconstit is ~A recursive~&");

    static private final SubLString $str67$ = makeString("");

    static private final SubLString $$$not_ = makeString("not ");

    static private final SubLString $str69$pushing_a_new_subconstit___S__ = makeString("pushing a new subconstit: ~S~&");

    static private final SubLString $str70$new_entry____A__ = makeString("new-entry = ~A~&");

    static private final SubLString $str71$after_eating_subconstit__new_entr = makeString("after eating subconstit, new entry = ~S~&");

    static private final SubLString $str72$failed_template____A__ = makeString("failed-template = ~A~&");

    static private final SubLString $str73$new_entry__end_of_recursive_item_ = makeString("new entry (end of recursive-item?) = ~S~&");

    static private final SubLString $str74$pushing_entry_at_end_of_recursive = makeString("pushing entry at end of recursive item~%");



    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLString $str77$sent_invalid_args___S__S__to_MATC = makeString("sent invalid args (~S ~S) to MATCH-TEMPLATE-ITEM");

    static private final SubLString $str78$template_remainder____S__stop_ite = makeString("template-remainder = ~S~&stop-item = ~S~& stop-index = ~S~&stop-index-template = ~S~&");

    static private final SubLString $str79$stop_remainder____S__template_unu = makeString("stop-remainder = ~S~&template-unused=~S~&words=~S~&words-before-stop = ~S~&kleene-removed-lists = ~S~&");

    static private final SubLString $str80$item____S__original_words____S__ = makeString("item = ~S~&original-words = ~S~&");

    static private final SubLString $str81$single_const_lists____S__ = makeString("single-const-lists = ~S~&");

    static private final SubLString $str82$lyst____S__result____S__ = makeString("lyst = ~S~&result = ~S~%");

    private static final SubLSymbol EXPAND_WORD_ITEMS_IN_LIST = makeSymbol("EXPAND-WORD-ITEMS-IN-LIST");

    static private final SubLString $str84$incomplete_states____S__ = makeString("incomplete-states = ~S~%");

    static private final SubLString $str85$present_state____S__ = makeString("present-state = ~S~%");

    static private final SubLString $str86$call_to_compute_matches_with_an_e = makeString("call to compute-matches with an empty match-list");

    static private final SubLString $$$cond1 = makeString("cond1");

    static private final SubLString $$$cond2 = makeString("cond2");

    static private final SubLString $$$cond6 = makeString("cond6");

    static private final SubLString $$$cond3 = makeString("cond3");

    static private final SubLString $$$cond4 = makeString("cond4");

    static private final SubLString $$$cond5 = makeString("cond5");

    static private final SubLString $str93$x____S__ = makeString("x = ~S~%");

    static private final SubLString $str94$intermed_words____S__first_first_ = makeString("intermed-words = ~S~%first-first = ~S~%");

    static private final SubLString $str95$sent_an_unexpanded_item___S__to_f = makeString("sent an unexpanded item (~S) to find-rtp-matches");

    static private final SubLString $str96$sent_invalid_item__S_to_find_rtp_ = makeString("sent invalid item ~S to find-rtp-matches");

    static private final SubLString $str98$entered_remove_kleene_words_with_ = makeString("entered remove-kleene-words with no words~&");

    static private final SubLString $str99$removed_list____S__ = makeString("removed-list = ~S~&");

    static private final SubLString $str100$_word_list__S____template__S____f = makeString("<word-list ~S>~&<template ~S>~&<first-item ~S>~&");

    static private final SubLString $str101$words_________S__ = makeString("words     =  ~S~&");

    static private final SubLString $str102$sem___________S__ = makeString("sem       =  ~S~&");

    static private final SubLString $str103$bindings______S__ = makeString("bindings  =  ~S~&");

    static private final SubLString $str104$subconsts_____S__ = makeString("subconsts =  ~S~&");

    private static final SubLSymbol GET_STRINGS_OF_TYPE_CACHED = makeSymbol("GET-STRINGS-OF-TYPE-CACHED");

    private static final SubLSymbol EXPAND_WORD_ITEMS_IN_LIST_INT = makeSymbol("EXPAND-WORD-ITEMS-IN-LIST-INT");



    public static final SubLSymbol $expand_word_items_in_list_int_caching_state$ = makeSymbol("*EXPAND-WORD-ITEMS-IN-LIST-INT-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLString $str112$RTP__sent_in_a_non_function_to_RE = makeString("RTP: sent in a non-function to REMOVE-OPTIONAL-STRINGS");









    private static final SubLString $str119$word_list____S____words____S__ = makeString("word-list = ~S~&*-words = ~S~&");

    private static final SubLString $str121$subconstit____S__ = makeString("subconstit = ~S~&");

    private static final SubLString $str122$present_subconstit____S__ = makeString("present-subconstit = ~S~&");

    private static final SubLString $str123$entry_list____S__ = makeString("entry-list = ~S~&");

    private static final SubLString $str124$inside_template_category__ = makeString("inside template-category~&");

    private static final SubLString $str125$int_result____S__ = makeString("int-result = ~S~&");

    private static final SubLString $$$inside_the_T = makeString("inside the T");

    private static final SubLString $str127$entries____S__ = makeString("entries = ~S~%");

    private static final SubLString $str128$push_sem_from__S__ = makeString("push sem from ~S~&");

    private static final SubLString $str129$pushing__S__ = makeString("pushing ~S~&");

    /**
     * sends a message to the user if LEVEL is <= *RTP-TRACE-LEVEL*
     */
    @LispMethod(comment = "sends a message to the user if LEVEL is <= *RTP-TRACE-LEVEL*")
    public static final SubLObject rtp_trace_out_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            level = current.first();
            current = current.rest();
            {
                SubLObject options = current;
                return list(PWHEN, list($sym4$__, $rtp_trace_level$, level), list(RTP_TRACER_OUTPUT, level, bq_cons(LIST, append(options, NIL))));
            }
        }
    }

    /**
     * sends a message to the user if LEVEL is <= *RTP-TRACE-LEVEL*
     */
    @LispMethod(comment = "sends a message to the user if LEVEL is <= *RTP-TRACE-LEVEL*")
    public static SubLObject rtp_trace_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        level = current.first();
        final SubLObject options;
        current = options = current.rest();
        return list(PWHEN, list($sym4$__, $rtp_trace_level$, level), list(RTP_TRACER_OUTPUT, level, bq_cons(LIST, append(options, NIL))));
    }

    /**
     *
     *
     * @param LEVEL
     * 		integer; the trace level required for TRACE-OUTPUT to be sent to user
     * @param TRACE-OUTPUT
     * 		string; the string to be show to the user
     * @return string; the output
     */
    @LispMethod(comment = "@param LEVEL\r\n\t\tinteger; the trace level required for TRACE-OUTPUT to be sent to user\r\n@param TRACE-OUTPUT\r\n\t\tstring; the string to be show to the user\r\n@return string; the output")
    public static final SubLObject rtp_tracer_output_alt(SubLObject level, SubLObject format_control) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            apply(symbol_function(FORMAT), cons(T, format_control));
            return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @param LEVEL
     * 		integer; the trace level required for TRACE-OUTPUT to be sent to user
     * @param TRACE-OUTPUT
     * 		string; the string to be show to the user
     * @return string; the output
     */
    @LispMethod(comment = "@param LEVEL\r\n\t\tinteger; the trace level required for TRACE-OUTPUT to be sent to user\r\n@param TRACE-OUTPUT\r\n\t\tstring; the string to be show to the user\r\n@return string; the output")
    public static SubLObject rtp_tracer_output(final SubLObject level, final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        apply(symbol_function(FORMAT), cons(T, format_control));
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param LEVEL
    integer
     * 		
     * @return integer; the present rtp trace-level
     */
    @LispMethod(comment = "@param LEVEL\ninteger\r\n\t\t\r\n@return integer; the present rtp trace-level")
    public static final SubLObject rtp_trace_alt(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            rtp_vars.$rtp_trace_level$.setDynamicValue(level, thread);
            return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @param LEVEL
    integer
     * 		
     * @return integer; the present rtp trace-level
     */
    @LispMethod(comment = "@param LEVEL\ninteger\r\n\t\t\r\n@return integer; the present rtp trace-level")
    public static SubLObject rtp_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        rtp_vars.$rtp_trace_level$.setDynamicValue(level, thread);
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }

    public static final SubLObject ensure_sem_parse_initialized_alt() {
        com.cyc.cycjava.cycl.rtp.recognition.clear_match_recursive_template_item();
        return NIL;
    }

    public static SubLObject ensure_sem_parse_initialized() {
        clear_match_recursive_template_item();
        return NIL;
    }

    /**
     * Parses like sem-parse, but returns a different return structure.
     */
    @LispMethod(comment = "Parses like sem-parse, but returns a different return structure.")
    public static final SubLObject template_parse_alt(SubLObject sentence, SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.rtp.recognition.ensure_sem_parse_initialized();
            {
                SubLObject raw_tokenized_input = rkf_concept_harvester.rkf_ch_string_tokenize(sentence);
                SubLObject tokenized_input = standard_tokenization.perform_dot_analysis(raw_tokenized_input);
                SubLObject start = ZERO_INTEGER;
                SubLObject end = length(tokenized_input);
                SubLObject span = NIL;
                SubLObject depth = ZERO_INTEGER;
                SubLObject entries = NIL;
                SubLObject parses = NIL;
                entries = com.cyc.cycjava.cycl.rtp.recognition.rec_parse(cat, tokenized_input, start, end, depth, mt);
                if (NIL != entries) {
                    {
                        SubLObject cdolist_list_var = delete_if(NULL, Mapping.mapcar(FILTER_SEMANTIC_TESTS, entries), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject entry = NIL;
                        for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject result = rtp_datastructures.convert_rtp_entry_to_parse_result(entry);
                                SubLObject assertion = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ($$Simply == cycl_utilities.formula_arg0(result)) {
                                    result = second(result);
                                }
                                if ((NIL != $perform_template_component_join$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($$joinTemplateComponents, result, UNPROVIDED, UNPROVIDED))) {
                                    result = com.cyc.cycjava.cycl.rtp.recognition.reformulate_jointemplatecomponents(result);
                                }
                                if (NIL != $template_parse_includes_template_categories$.getDynamicValue(thread)) {
                                    {
                                        SubLObject item_var = list(result, assertion);
                                        if (NIL == member(item_var, parses, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                            parses = cons(item_var, parses);
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject item_var = result;
                                        if (NIL == member(item_var, parses, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                            parses = cons(item_var, parses);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
                            span = cons(i, span);
                        }
                    }
                    return list(list(nreverse(span), parses));
                }
            }
            return NIL;
        }
    }

    /**
     * Parses like sem-parse, but returns a different return structure.
     */
    @LispMethod(comment = "Parses like sem-parse, but returns a different return structure.")
    public static SubLObject template_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_sem_parse_initialized();
        final SubLObject raw_tokenized_input = rkf_concept_harvester.rkf_ch_string_tokenize(sentence);
        final SubLObject tokenized_input = standard_tokenization.perform_dot_analysis(raw_tokenized_input);
        final SubLObject start = ZERO_INTEGER;
        final SubLObject end = length(tokenized_input);
        SubLObject span = NIL;
        final SubLObject depth = ZERO_INTEGER;
        SubLObject entries = NIL;
        SubLObject parses = NIL;
        entries = rec_parse(cat, tokenized_input, start, end, depth, mt);
        if (NIL != entries) {
            SubLObject cdolist_list_var = delete_if(NULL, Mapping.mapcar(FILTER_SEMANTIC_TESTS, entries), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject result = rtp_datastructures.convert_rtp_entry_to_parse_result(entry);
                final SubLObject assertion = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ($$Simply.eql(cycl_utilities.formula_arg0(result))) {
                    result = second(result);
                }
                if ((NIL != $perform_template_component_join$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($$joinTemplateComponents, result, UNPROVIDED, UNPROVIDED))) {
                    result = reformulate_jointemplatecomponents(result);
                }
                if (NIL != $template_parse_includes_template_categories$.getDynamicValue(thread)) {
                    final SubLObject item_var = list(result, assertion);
                    if (NIL == member(item_var, parses, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        parses = cons(item_var, parses);
                    }
                } else {
                    final SubLObject item_var = result;
                    if (NIL == member(item_var, parses, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        parses = cons(item_var, parses);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
                span = cons(i, span);
            }
            return list(list(nreverse(span), parses));
        }
        return NIL;
    }

    public static final SubLObject categorizing_template_parse_alt(SubLObject sentence, SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $template_parse_includes_template_categories$.currentBinding(thread);
                    try {
                        $template_parse_includes_template_categories$.bind(T, thread);
                        result = com.cyc.cycjava.cycl.rtp.recognition.template_parse(sentence, mt, cat, complete_parses_only);
                    } finally {
                        $template_parse_includes_template_categories$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject categorizing_template_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $template_parse_includes_template_categories$.currentBinding(thread);
        try {
            $template_parse_includes_template_categories$.bind(T, thread);
            result = template_parse(sentence, mt, cat, complete_parses_only);
        } finally {
            $template_parse_includes_template_categories$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject reformulate_jointemplatecomponents_alt(SubLObject cycl) {
        return transform_list_utilities.transform(cycl, $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_, TRANSFORM_JOINTEMPLATECOMPONENTS, UNPROVIDED);
    }

    public static SubLObject reformulate_jointemplatecomponents(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_, TRANSFORM_JOINTEMPLATECOMPONENTS, UNPROVIDED);
    }

    public static final SubLObject joinable_template_component_formulaP_alt(SubLObject cycl) {
        return makeBoolean((cycl.isList() && (cycl.first() == $$joinTemplateComponents)) && (!cycl.equal(com.cyc.cycjava.cycl.rtp.recognition.transform_jointemplatecomponents(cycl))));
    }

    public static SubLObject joinable_template_component_formulaP(final SubLObject cycl) {
        return makeBoolean((cycl.isList() && cycl.first().eql($$joinTemplateComponents)) && (!cycl.equal(transform_jointemplatecomponents(cycl))));
    }

    public static final SubLObject transform_rewrite_sequence_alt(SubLObject formula) {
        {
            SubLObject transformations = NIL;
            SubLObject cdolist_list_var = formula.rest();
            SubLObject assemble_phrase = NIL;
            for (assemble_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assemble_phrase = cdolist_list_var.first()) {
                {
                    SubLObject rewrite = com.cyc.cycjava.cycl.rtp.recognition.rewrite_assemble_phrase(assemble_phrase);
                    transformations = cons(rewrite, transformations);
                }
            }
            transformations = nreverse(transformations);
            transformations = cons($$RewriteSequenceFn, transformations);
            return transformations;
        }
    }

    public static SubLObject transform_rewrite_sequence(final SubLObject formula) {
        SubLObject transformations = NIL;
        SubLObject cdolist_list_var = formula.rest();
        SubLObject assemble_phrase = NIL;
        assemble_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rewrite = rewrite_assemble_phrase(assemble_phrase);
            transformations = cons(rewrite, transformations);
            cdolist_list_var = cdolist_list_var.rest();
            assemble_phrase = cdolist_list_var.first();
        } 
        transformations = nreverse(transformations);
        transformations = cons($$RewriteSequenceFn, transformations);
        return transformations;
    }

    /**
     * This function rewrites an #$AssemblePhraseFn expression
     * into the canonical, strings only form.
     */
    @LispMethod(comment = "This function rewrites an #$AssemblePhraseFn expression\r\ninto the canonical, strings only form.\nThis function rewrites an #$AssemblePhraseFn expression\ninto the canonical, strings only form.")
    public static final SubLObject rewrite_assemble_phrase_alt(SubLObject assemble_phrase) {
        {
            SubLObject strings = NIL;
            SubLObject cdolist_list_var = assemble_phrase.rest();
            SubLObject parse_result = NIL;
            for (parse_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse_result = cdolist_list_var.first()) {
                if (parse_result.isString()) {
                    strings = cons(parse_result, strings);
                } else {
                    if (NIL != parsing_utilities.result_of_parsing_formulaP(parse_result)) {
                        strings = cons(parsing_utilities.result_of_parsing_words(parse_result), strings);
                    } else {
                        if (parse_result.isList() && ($$AssemblePhraseFn == parse_result.first())) {
                            {
                                SubLObject subphrase = com.cyc.cycjava.cycl.rtp.recognition.rewrite_assemble_phrase(parse_result);
                                SubLObject cdolist_list_var_1 = subphrase.rest();
                                SubLObject string = NIL;
                                for (string = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , string = cdolist_list_var_1.first()) {
                                    strings = cons(string, strings);
                                }
                            }
                        }
                    }
                }
            }
            return cons($$AssemblePhraseFn, nreverse(strings));
        }
    }

    /**
     * This function rewrites an #$AssemblePhraseFn expression
     * into the canonical, strings only form.
     */
    @LispMethod(comment = "This function rewrites an #$AssemblePhraseFn expression\r\ninto the canonical, strings only form.\nThis function rewrites an #$AssemblePhraseFn expression\ninto the canonical, strings only form.")
    public static SubLObject rewrite_assemble_phrase(final SubLObject assemble_phrase) {
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = assemble_phrase.rest();
        SubLObject parse_result = NIL;
        parse_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (parse_result.isString()) {
                strings = cons(parse_result, strings);
            } else
                if (NIL != parsing_utilities.result_of_parsing_formulaP(parse_result)) {
                    strings = cons(parsing_utilities.result_of_parsing_words(parse_result), strings);
                } else
                    if (parse_result.isList() && $$AssemblePhraseFn.eql(parse_result.first())) {
                        final SubLObject subphrase = rewrite_assemble_phrase(parse_result);
                        SubLObject cdolist_list_var_$1 = subphrase.rest();
                        SubLObject string = NIL;
                        string = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            strings = cons(string, strings);
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            string = cdolist_list_var_$1.first();
                        } 
                    }


            cdolist_list_var = cdolist_list_var.rest();
            parse_result = cdolist_list_var.first();
        } 
        return cons($$AssemblePhraseFn, nreverse(strings));
    }

    /**
     * Given that either term or new-expression are rewrite sequences, transform
     * the expression into something that is completely a rewrite sequence and
     * returned that transformed answer.
     */
    @LispMethod(comment = "Given that either term or new-expression are rewrite sequences, transform\r\nthe expression into something that is completely a rewrite sequence and\r\nreturned that transformed answer.\nGiven that either term or new-expression are rewrite sequences, transform\nthe expression into something that is completely a rewrite sequence and\nreturned that transformed answer.")
    public static final SubLObject join_tcomponents_and_rewrite_sequence_alt(SubLObject v_term, SubLObject rewrite, SubLObject order) {
        {
            SubLObject transformations = NIL;
            SubLObject cdolist_list_var = rewrite.rest();
            SubLObject assemble_phrase = NIL;
            for (assemble_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assemble_phrase = cdolist_list_var.first()) {
                {
                    SubLObject refactored = (order == $LEADING) ? ((SubLObject) (list($$AssemblePhraseFn, v_term, assemble_phrase))) : list($$AssemblePhraseFn, assemble_phrase, v_term);
                    transformations = cons(refactored, transformations);
                }
            }
            return com.cyc.cycjava.cycl.rtp.recognition.transform_rewrite_sequence(cons($$RewriteSequenceFn, nreverse(transformations)));
        }
    }

    /**
     * Given that either term or new-expression are rewrite sequences, transform
     * the expression into something that is completely a rewrite sequence and
     * returned that transformed answer.
     */
    @LispMethod(comment = "Given that either term or new-expression are rewrite sequences, transform\r\nthe expression into something that is completely a rewrite sequence and\r\nreturned that transformed answer.\nGiven that either term or new-expression are rewrite sequences, transform\nthe expression into something that is completely a rewrite sequence and\nreturned that transformed answer.")
    public static SubLObject join_tcomponents_and_rewrite_sequence(final SubLObject v_term, final SubLObject rewrite, final SubLObject order) {
        SubLObject transformations = NIL;
        SubLObject cdolist_list_var = rewrite.rest();
        SubLObject assemble_phrase = NIL;
        assemble_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject refactored = (order == $LEADING) ? list($$AssemblePhraseFn, v_term, assemble_phrase) : list($$AssemblePhraseFn, assemble_phrase, v_term);
            transformations = cons(refactored, transformations);
            cdolist_list_var = cdolist_list_var.rest();
            assemble_phrase = cdolist_list_var.first();
        } 
        return transform_rewrite_sequence(cons($$RewriteSequenceFn, nreverse(transformations)));
    }

    /**
     *
     *
     * @param PATTERN
     * 		expression; a CycL expression starting with #$TheList
     * @return keyword; a keyword indicating which join-pattern is exemplified in PATTERN
     */
    @LispMethod(comment = "@param PATTERN\r\n\t\texpression; a CycL expression starting with #$TheList\r\n@return keyword; a keyword indicating which join-pattern is exemplified in PATTERN")
    public static final SubLObject jointemplate_pattern_type_alt(SubLObject pattern) {
        {
            SubLObject result = NIL;
            if (pattern.equal($list_alt19)) {
                result = $S_NP_VP;
            } else {
                result = $SBAR_WHNP_S;
            }
            return result;
        }
    }

    /**
     *
     *
     * @param PATTERN
     * 		expression; a CycL expression starting with #$TheList
     * @return keyword; a keyword indicating which join-pattern is exemplified in PATTERN
     */
    @LispMethod(comment = "@param PATTERN\r\n\t\texpression; a CycL expression starting with #$TheList\r\n@return keyword; a keyword indicating which join-pattern is exemplified in PATTERN")
    public static SubLObject jointemplate_pattern_type(final SubLObject pattern) {
        SubLObject result = NIL;
        if (pattern.equal($list19)) {
            result = $S_NP_VP;
        } else {
            result = $SBAR_WHNP_S;
        }
        return result;
    }

    public static final SubLObject transform_jointemplatecomponents_alt(SubLObject expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = expression.first();
                SubLObject pattern = second(expression);
                SubLObject formula = third(expression);
                SubLObject pattern_type = com.cyc.cycjava.cycl.rtp.recognition.jointemplate_pattern_type(pattern);
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject donor_formula = com.cyc.cycjava.cycl.rtp.recognition.expressions_for_pattern_transform(pattern_type, formula);
                    SubLObject target_formula = thread.secondMultipleValue();
                    SubLObject recipient_formula = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != list_utilities.tree_find($$TheSentenceSubject, recipient_formula, UNPROVIDED, UNPROVIDED)) {
                        if (donor_formula.isKeyword()) {
                            result = NIL;
                        }
                        if (NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula)) {
                            {
                                SubLObject span = parsing_utilities.result_of_parsing_span(donor_formula);
                                SubLObject offset = add(ONE_INTEGER, last(span, UNPROVIDED).first());
                                SubLObject transformed_expression = iterative_template_parser.transform_nl_quant_forms(recipient_formula, offset);
                                result = subst(donor_formula, target_formula, transformed_expression, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            result = subst(donor_formula, target_formula, recipient_formula, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        if ((donor_formula.first() == $$RewriteSequenceFn) && (NIL != parsing_utilities.result_of_parsing_formulaP(recipient_formula))) {
                            result = com.cyc.cycjava.cycl.rtp.recognition.join_tcomponents_and_rewrite_sequence(recipient_formula, donor_formula, $TRAILING);
                        } else {
                            if ((recipient_formula.first() == $$RewriteSequenceFn) && (NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula))) {
                                result = com.cyc.cycjava.cycl.rtp.recognition.join_tcomponents_and_rewrite_sequence(donor_formula, recipient_formula, $LEADING);
                            } else {
                                result = expression;
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject transform_jointemplatecomponents(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = expression.first();
        final SubLObject pattern = second(expression);
        final SubLObject formula = third(expression);
        final SubLObject pattern_type = jointemplate_pattern_type(pattern);
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject donor_formula = expressions_for_pattern_transform(pattern_type, formula);
        final SubLObject target_formula = thread.secondMultipleValue();
        final SubLObject recipient_formula = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.tree_find($$TheSentenceSubject, recipient_formula, UNPROVIDED, UNPROVIDED)) {
            if (donor_formula.isKeyword()) {
                result = NIL;
            }
            if (NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula)) {
                final SubLObject span = parsing_utilities.result_of_parsing_span(donor_formula);
                final SubLObject offset = add(ONE_INTEGER, last(span, UNPROVIDED).first());
                final SubLObject transformed_expression = iterative_template_parser.transform_nl_quant_forms(recipient_formula, offset);
                result = subst(donor_formula, target_formula, transformed_expression, UNPROVIDED, UNPROVIDED);
            } else {
                result = subst(donor_formula, target_formula, recipient_formula, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (donor_formula.first().eql($$RewriteSequenceFn) && (NIL != parsing_utilities.result_of_parsing_formulaP(recipient_formula))) {
                result = join_tcomponents_and_rewrite_sequence(recipient_formula, donor_formula, $TRAILING);
            } else
                if (recipient_formula.first().eql($$RewriteSequenceFn) && (NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula))) {
                    result = join_tcomponents_and_rewrite_sequence(donor_formula, recipient_formula, $LEADING);
                } else {
                    result = expression;
                }


        return result;
    }

    public static final SubLObject expressions_for_pattern_transform_alt(SubLObject pattern_type, SubLObject formula) {
        {
            SubLObject donor_formula = NIL;
            SubLObject target_formula = NIL;
            SubLObject recipient_formula = NIL;
            if (pattern_type == $S_NP_VP) {
                donor_formula = nth(ONE_INTEGER, formula);
                recipient_formula = nth(TWO_INTEGER, formula);
                target_formula = $$TheSentenceSubject;
            } else {
                if (pattern_type == $SBAR_WHNP_S) {
                    donor_formula = nth(ONE_INTEGER, formula);
                    recipient_formula = nth(TWO_INTEGER, formula);
                    target_formula = $$TheGappedTerm;
                } else {
                    return NIL;
                }
            }
            return values(donor_formula, target_formula, recipient_formula);
        }
    }

    public static SubLObject expressions_for_pattern_transform(final SubLObject pattern_type, final SubLObject formula) {
        SubLObject donor_formula = NIL;
        SubLObject target_formula = NIL;
        SubLObject recipient_formula = NIL;
        if (pattern_type == $S_NP_VP) {
            donor_formula = nth(ONE_INTEGER, formula);
            recipient_formula = nth(TWO_INTEGER, formula);
            target_formula = $$TheSentenceSubject;
        } else {
            if (pattern_type != $SBAR_WHNP_S) {
                return NIL;
            }
            donor_formula = nth(ONE_INTEGER, formula);
            recipient_formula = nth(TWO_INTEGER, formula);
            target_formula = $$TheGappedTerm;
        }
        return values(donor_formula, target_formula, recipient_formula);
    }

    public static final SubLObject rec_parse_alt(SubLObject cat, SubLObject sentence, SubLObject start, SubLObject end, SubLObject depth, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
                    try {
                        rtp_vars.$rtp_syntactic_mt$.bind(mt, thread);
                        result = com.cyc.cycjava.cycl.rtp.recognition.rec_parse_int(cat, sentence, start, end, depth, mt);
                    } finally {
                        rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject rec_parse(final SubLObject cat, final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
        try {
            rtp_vars.$rtp_syntactic_mt$.bind(mt, thread);
            result = rec_parse_int(cat, sentence, start, end, depth, mt);
        } finally {
            rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * parse recursively, return a list of chart-entries
     *
     * @param CAT
     * 		Cyc constant; a spec of #$ParsingTemplateCategory
     * @param SENTENCE
     * 		list; the words to be parsed (as strings)
     */
    @LispMethod(comment = "parse recursively, return a list of chart-entries\r\n\r\n@param CAT\r\n\t\tCyc constant; a spec of #$ParsingTemplateCategory\r\n@param SENTENCE\r\n\t\tlist; the words to be parsed (as strings)")
    public static final SubLObject rec_parse_int_alt(SubLObject cat, SubLObject sentence, SubLObject start, SubLObject end, SubLObject depth, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules = com.cyc.cycjava.cycl.rtp.recognition.filter_rules(rtp_datastructures.$rtp_rules$.getGlobalValue(), sentence, mt, cat, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject temp_result = NIL;
                SubLObject fully_bound_entries = NIL;
                SubLObject unbound_entries = NIL;
                {
                    SubLObject cdolist_list_var = rules;
                    SubLObject rule = NIL;
                    for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                        if (rtp_datastructures.rule_cat(rule).equal(cat)) {
                            temp_result = com.cyc.cycjava.cycl.rtp.recognition.tp_match_template(rule, sentence, start, end, depth);
                        } else {
                            temp_result = NIL;
                        }
                        if (NIL != temp_result) {
                            {
                                SubLObject cdolist_list_var_2 = temp_result;
                                SubLObject entry = NIL;
                                for (entry = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , entry = cdolist_list_var_2.first()) {
                                    result = cons(rtp_datastructures.copy_rtp_entry(entry), result);
                                }
                            }
                        }
                    }
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt25$results_of_first_pass____S__, result));
                }
                {
                    SubLObject cdolist_list_var = result;
                    SubLObject entry = NIL;
                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt26$working_on_entry1___S__, entry));
                        }
                        if ((NIL != com.cyc.cycjava.cycl.rtp.recognition.fully_bound_entryP(entry)) && (!((rtp_datastructures.rtp_chart_entry_words(entry) != $completed_words_list$.getGlobalValue()) && (NIL != rtp_datastructures.rtp_chart_entry_words(entry))))) {
                            fully_bound_entries = cons(entry, fully_bound_entries);
                        } else {
                            unbound_entries = cons(entry, unbound_entries);
                        }
                    }
                }
                if (NIL != $return_early$.getGlobalValue()) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt27$fully_bound_entries____S__, fully_bound_entries));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt28$unbound_entries____S__, unbound_entries));
                    }
                    return nconc(fully_bound_entries, unbound_entries);
                }
                while (NIL != unbound_entries) {
                    {
                        SubLObject first_entry = unbound_entries.first();
                        SubLObject new_entries = com.cyc.cycjava.cycl.rtp.recognition.parse_subconstit_list(first_entry, depth, mt);
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt29$recurring_on___S__, first_entry));
                        }
                        unbound_entries = unbound_entries.rest();
                        {
                            SubLObject cdolist_list_var = new_entries;
                            SubLObject new_entry = NIL;
                            for (new_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_entry = cdolist_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.fully_bound_entryP(new_entry)) {
                                    fully_bound_entries = cons(new_entry, fully_bound_entries);
                                }
                            }
                        }
                    }
                } 
                return fully_bound_entries;
            }
        }
    }

    /**
     * parse recursively, return a list of chart-entries
     *
     * @param CAT
     * 		Cyc constant; a spec of #$ParsingTemplateCategory
     * @param SENTENCE
     * 		list; the words to be parsed (as strings)
     */
    @LispMethod(comment = "parse recursively, return a list of chart-entries\r\n\r\n@param CAT\r\n\t\tCyc constant; a spec of #$ParsingTemplateCategory\r\n@param SENTENCE\r\n\t\tlist; the words to be parsed (as strings)")
    public static SubLObject rec_parse_int(final SubLObject cat, final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = filter_rules(rtp_datastructures.$rtp_rules$.getGlobalValue(), sentence, mt, cat, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject temp_result = NIL;
        SubLObject fully_bound_entries = NIL;
        SubLObject unbound_entries = NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rtp_datastructures.rule_cat(rule).equal(cat)) {
                temp_result = tp_match_template(rule, sentence, start, end, depth);
            } else {
                temp_result = NIL;
            }
            if (NIL != temp_result) {
                SubLObject cdolist_list_var_$2 = temp_result;
                SubLObject entry = NIL;
                entry = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    result = cons(rtp_datastructures.copy_rtp_entry(entry), result);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    entry = cdolist_list_var_$2.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str25$results_of_first_pass____S__, result));
        }
        cdolist_list_var = result;
        SubLObject entry2 = NIL;
        entry2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str26$working_on_entry1___S__, entry2));
            }
            if ((NIL != fully_bound_entryP(entry2)) && (rtp_datastructures.rtp_chart_entry_words(entry2).eql($completed_words_list$.getGlobalValue()) || (NIL == rtp_datastructures.rtp_chart_entry_words(entry2)))) {
                fully_bound_entries = cons(entry2, fully_bound_entries);
            } else {
                unbound_entries = cons(entry2, unbound_entries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry2 = cdolist_list_var.first();
        } 
        if (NIL != $return_early$.getGlobalValue()) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str27$fully_bound_entries____S__, fully_bound_entries));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str28$unbound_entries____S__, unbound_entries));
            }
            return nconc(fully_bound_entries, unbound_entries);
        }
        while (NIL != unbound_entries) {
            final SubLObject first_entry = unbound_entries.first();
            final SubLObject new_entries = parse_subconstit_list(first_entry, depth, mt);
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str29$recurring_on___S__, first_entry));
            }
            unbound_entries = unbound_entries.rest();
            SubLObject cdolist_list_var2 = new_entries;
            SubLObject new_entry = NIL;
            new_entry = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != fully_bound_entryP(new_entry)) {
                    fully_bound_entries = cons(new_entry, fully_bound_entries);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                new_entry = cdolist_list_var2.first();
            } 
        } 
        return fully_bound_entries;
    }

    public static final SubLObject filter_semantic_tests_alt(SubLObject entry, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = rtp_vars.$rtp_semantic_mt$.getDynamicValue();
        }
        return entry;
    }

    public static SubLObject filter_semantic_tests(final SubLObject entry, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = rtp_vars.$rtp_semantic_mt$.getDynamicValue();
        }
        return entry;
    }

    /**
     * ignoring the list of rules, return the templates best matched
     * to the category and the sentence
     *
     * @param RULE-LIST
     * 		list; a list of rtp-rules (ignored)
     * @param SENTENCE
     * 		list; a list of strings found in the sentence
     * @param CAT
     * 		fort-p; a category of parse templates
     * @param WHICH
     * 		keyword; one of :ALL, :SPECIFIC, :GENERIC
     * @return list; a list of rules that meet the criteria for parsing SENTENCE
     */
    @LispMethod(comment = "ignoring the list of rules, return the templates best matched\r\nto the category and the sentence\r\n\r\n@param RULE-LIST\r\n\t\tlist; a list of rtp-rules (ignored)\r\n@param SENTENCE\r\n\t\tlist; a list of strings found in the sentence\r\n@param CAT\r\n\t\tfort-p; a category of parse templates\r\n@param WHICH\r\n\t\tkeyword; one of :ALL, :SPECIFIC, :GENERIC\r\n@return list; a list of rules that meet the criteria for parsing SENTENCE\nignoring the list of rules, return the templates best matched\nto the category and the sentence")
    public static final SubLObject filter_rules_alt(SubLObject rule_list, SubLObject sentence, SubLObject mt, SubLObject cat, SubLObject which) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        if (which == UNPROVIDED) {
            which = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (which == $GENERIC) {
                {
                    SubLObject generics = rtp_datastructures.get_generic_templates_for_category(mt, cat);
                    if (NIL != $rtp_display_filter_rules$.getGlobalValue()) {
                        format(T, $str_alt32$FILTER_RULES___S__, generics);
                    }
                    return generics;
                }
            }
            {
                SubLObject templates = make_hash_table($int$30, symbol_function(EQ), UNPROVIDED);
                SubLObject specifics = NIL;
                SubLObject result = NIL;
                if (NIL != $use_best_templates_first$.getDynamicValue(thread)) {
                    {
                        SubLObject cdolist_list_var = sentence;
                        SubLObject word = NIL;
                        for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                            {
                                SubLObject tp_rules = rtp_datastructures.get_best_templates_for_terminal(mt, cat, word);
                                SubLObject cdolist_list_var_3 = tp_rules;
                                SubLObject tp_rule = NIL;
                                for (tp_rule = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , tp_rule = cdolist_list_var_3.first()) {
                                    if (NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, sentence)) {
                                        com.cyc.cycjava.cycl.rtp.recognition.counted_sethash(tp_rule, templates);
                                    }
                                }
                            }
                        }
                    }
                }
                if (hash_table_count(templates).isZero()) {
                    templates = com.cyc.cycjava.cycl.rtp.recognition.templates_potentially_applicable_to_word_list(sentence, mt, cat);
                }
                {
                    SubLObject tp_rule = NIL;
                    SubLObject value = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(templates);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                tp_rule = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                specifics = cons(tp_rule, specifics);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = $counted_template_set$.currentBinding(thread);
                    try {
                        $counted_template_set$.bind(templates, thread);
                        specifics = Sort.sort(specifics, symbol_function($sym34$_), symbol_function(GET_COUNTED_SETHASH_ENTRY_COUNT));
                    } finally {
                        $counted_template_set$.rebind(_prev_bind_0, thread);
                    }
                }
                if (which == $ALL) {
                    result = nconc(specifics, rtp_datastructures.get_generic_templates_for_category(mt, cat));
                } else {
                    result = specifics;
                }
                if (NIL != $rtp_display_filter_rules$.getGlobalValue()) {
                    format(T, $str_alt32$FILTER_RULES___S__, result);
                    format(T, $str_alt36$_2_words___a_2_, sentence);
                    {
                        SubLObject cdolist_list_var = result;
                        SubLObject r = NIL;
                        for (r = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , r = cdolist_list_var.first()) {
                            format(T, $str_alt37$rule___a__transformation___a_2_, rtp_datastructures.template_rule_template(r), rtp_datastructures.template_rule_transformation(r));
                        }
                    }
                    format(T, $str_alt38$_2_);
                }
                return com.cyc.cycjava.cycl.rtp.recognition.check_partial_ordering(list_utilities.delete_if_not(VALID_ASSERTION, result, TEMPLATE_RULE_ASSERTION, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
            }
        }
    }

    /**
     * ignoring the list of rules, return the templates best matched
     * to the category and the sentence
     *
     * @param RULE-LIST
     * 		list; a list of rtp-rules (ignored)
     * @param SENTENCE
     * 		list; a list of strings found in the sentence
     * @param CAT
     * 		fort-p; a category of parse templates
     * @param WHICH
     * 		keyword; one of :ALL, :SPECIFIC, :GENERIC
     * @return list; a list of rules that meet the criteria for parsing SENTENCE
     */
    @LispMethod(comment = "ignoring the list of rules, return the templates best matched\r\nto the category and the sentence\r\n\r\n@param RULE-LIST\r\n\t\tlist; a list of rtp-rules (ignored)\r\n@param SENTENCE\r\n\t\tlist; a list of strings found in the sentence\r\n@param CAT\r\n\t\tfort-p; a category of parse templates\r\n@param WHICH\r\n\t\tkeyword; one of :ALL, :SPECIFIC, :GENERIC\r\n@return list; a list of rules that meet the criteria for parsing SENTENCE\nignoring the list of rules, return the templates best matched\nto the category and the sentence")
    public static SubLObject filter_rules(final SubLObject rule_list, final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject which) {
        if (cat == UNPROVIDED) {
            cat = NIL;
        }
        if (which == UNPROVIDED) {
            which = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (which == $GENERIC) {
            final SubLObject generics = rtp_datastructures.get_generic_templates_for_category(mt, cat);
            if (NIL != $rtp_display_filter_rules$.getGlobalValue()) {
                format(T, $str32$FILTER_RULES___S__, generics);
            }
            return generics;
        }
        SubLObject templates = make_hash_table($int$30, symbol_function(EQ), UNPROVIDED);
        SubLObject specifics = NIL;
        SubLObject result = NIL;
        if (NIL != $use_best_templates_first$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = sentence;
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3;
                final SubLObject tp_rules = cdolist_list_var_$3 = rtp_datastructures.get_best_templates_for_terminal(mt, cat, word);
                SubLObject tp_rule = NIL;
                tp_rule = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    if (NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, sentence)) {
                        counted_sethash(tp_rule, templates);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    tp_rule = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        if (hash_table_count(templates).isZero()) {
            templates = templates_potentially_applicable_to_word_list(sentence, mt, cat);
        }
        SubLObject tp_rule2 = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(templates);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                tp_rule2 = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                specifics = cons(tp_rule2, specifics);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject _prev_bind_0 = $counted_template_set$.currentBinding(thread);
        try {
            $counted_template_set$.bind(templates, thread);
            specifics = Sort.sort(specifics, symbol_function($sym34$_), symbol_function(GET_COUNTED_SETHASH_ENTRY_COUNT));
        } finally {
            $counted_template_set$.rebind(_prev_bind_0, thread);
        }
        if (which == $ALL) {
            result = nconc(specifics, rtp_datastructures.get_generic_templates_for_category(mt, cat));
        } else {
            result = specifics;
        }
        if (NIL != $rtp_display_filter_rules$.getGlobalValue()) {
            format(T, $str32$FILTER_RULES___S__, result);
            format(T, $str36$_2_words___a_2_, sentence);
            SubLObject cdolist_list_var = result;
            SubLObject r = NIL;
            r = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str37$rule___a__transformation___a_2_, rtp_datastructures.template_rule_template(r), rtp_datastructures.template_rule_transformation(r));
                cdolist_list_var = cdolist_list_var.rest();
                r = cdolist_list_var.first();
            } 
            format(T, $str38$_2_);
        }
        return check_partial_ordering(list_utilities.delete_if_not(VALID_ASSERTION, result, TEMPLATE_RULE_ASSERTION, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt);
    }

    public static final SubLObject templates_potentially_applicable_to_word_list_alt(SubLObject word_list, SubLObject mt, SubLObject cat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject template_hash = make_hash_table(FOUR_INTEGER, symbol_function(EQ), UNPROVIDED);
                {
                    SubLObject cdolist_list_var = word_list;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        dictionary_utilities.dictionary_increment(word_dict, word, UNPROVIDED);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(word_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject word = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject frequency = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = rtp_datastructures.get_templates_for_terminal(mt, cat, word);
                                SubLObject tp_rule = NIL;
                                for (tp_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tp_rule = cdolist_list_var.first()) {
                                    {
                                        SubLObject already_matched = gethash_without_values(tp_rule, template_hash, UNPROVIDED);
                                        if (NIL != already_matched) {
                                            hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, UNPROVIDED);
                                        } else {
                                            if (NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, word_list)) {
                                                hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return template_hash;
            }
        }
    }

    public static SubLObject templates_potentially_applicable_to_word_list(final SubLObject word_list, final SubLObject mt, final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject template_hash = make_hash_table(FOUR_INTEGER, symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var = word_list;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_increment(word_dict, word, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(word_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            word = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject frequency = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = rtp_datastructures.get_templates_for_terminal(mt, cat, word);
            SubLObject tp_rule = NIL;
            tp_rule = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject already_matched = gethash_without_values(tp_rule, template_hash, UNPROVIDED);
                if (NIL != already_matched) {
                    hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, UNPROVIDED);
                } else
                    if (NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, word_list)) {
                        hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, UNPROVIDED);
                    }

                cdolist_list_var2 = cdolist_list_var2.rest();
                tp_rule = cdolist_list_var2.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return template_hash;
    }

    public static final SubLObject check_partial_ordering_alt(SubLObject l, SubLObject mt) {
        return com.cyc.cycjava.cycl.rtp.recognition.remove_mt_from_results(Sort.sort(com.cyc.cycjava.cycl.rtp.recognition.add_mt_to_results(l, mt), symbol_function(TEMPLATE_CAN_PRECEDE), UNPROVIDED));
    }

    public static SubLObject check_partial_ordering(final SubLObject l, final SubLObject mt) {
        return remove_mt_from_results(Sort.sort(add_mt_to_results(l, mt), symbol_function(TEMPLATE_CAN_PRECEDE), UNPROVIDED));
    }

    public static final SubLObject remove_mt_from_results_alt(SubLObject l) {
        return Mapping.mapcar(symbol_function(CAR), l);
    }

    public static SubLObject remove_mt_from_results(final SubLObject l) {
        return Mapping.mapcar(symbol_function(CAR), l);
    }

    public static final SubLObject add_mt_to_results_alt(SubLObject results, SubLObject mt) {
        {
            SubLObject answers = NIL;
            SubLObject cdolist_list_var = results;
            SubLObject x = NIL;
            for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                answers = cons(cons(x, mt), answers);
            }
            return nreverse(answers);
        }
    }

    public static SubLObject add_mt_to_results(final SubLObject results, final SubLObject mt) {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            answers = cons(cons(x, mt), answers);
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return nreverse(answers);
    }

    public static final SubLObject template_can_precede_alt(SubLObject a, SubLObject b) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == hash_table_utilities.hash_table_empty_p($partial_orders_hash$.getDynamicValue(thread))) {
                {
                    SubLObject mt = a.rest();
                    SubLObject x = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(a.first()));
                    SubLObject y = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(b.first()));
                    return makeBoolean(NIL == gethash(list(mt, y, x), $partial_orders_hash$.getDynamicValue(thread), UNPROVIDED));
                }
            }
            return T;
        }
    }

    public static SubLObject template_can_precede(final SubLObject a, final SubLObject b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == hash_table_utilities.hash_table_empty_p($partial_orders_hash$.getDynamicValue(thread))) {
            final SubLObject mt = a.rest();
            final SubLObject x = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(a.first()));
            final SubLObject y = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(b.first()));
            return makeBoolean(NIL == gethash(list(mt, y, x), $partial_orders_hash$.getDynamicValue(thread), UNPROVIDED));
        }
        return T;
    }

    public static final SubLObject initialize_partial_orders_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject temp = kb_mapping.gather_predicate_extent_index($$templatePrecedes, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = temp;
                        SubLObject current = NIL;
                        for (current = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current = cdolist_list_var.first()) {
                            {
                                SubLObject mt = assertions_high.assertion_mt(current);
                                SubLObject arg1 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, ONE_INTEGER));
                                SubLObject arg2 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, TWO_INTEGER));
                                sethash(list(mt, arg1, arg2), $partial_orders_hash$.getDynamicValue(thread), T);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $partial_orders_hash$.getDynamicValue(thread);
        }
    }

    public static SubLObject initialize_partial_orders_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject temp = cdolist_list_var = kb_mapping.gather_predicate_extent_index($$templatePrecedes, UNPROVIDED, UNPROVIDED);
            SubLObject current = NIL;
            current = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject mt = assertions_high.assertion_mt(current);
                final SubLObject arg1 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, ONE_INTEGER));
                final SubLObject arg2 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, TWO_INTEGER));
                sethash(list(mt, arg1, arg2), $partial_orders_hash$.getDynamicValue(thread), T);
                cdolist_list_var = cdolist_list_var.rest();
                current = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $partial_orders_hash$.getDynamicValue(thread);
    }

    /**
     * Use the value slot to compute how often this template did occur.
     */
    @LispMethod(comment = "Use the value slot to compute how often this template did occur.")
    public static final SubLObject counted_sethash_alt(SubLObject key, SubLObject table) {
        {
            SubLObject value = gethash(key, table, ZERO_INTEGER);
            value = add(value, ONE_INTEGER);
            sethash(key, table, value);
        }
        return key;
    }

    /**
     * Use the value slot to compute how often this template did occur.
     */
    @LispMethod(comment = "Use the value slot to compute how often this template did occur.")
    public static SubLObject counted_sethash(final SubLObject key, final SubLObject table) {
        SubLObject value = gethash(key, table, ZERO_INTEGER);
        value = add(value, ONE_INTEGER);
        sethash(key, table, value);
        return key;
    }

    public static final SubLObject get_counted_sethash_entry_count_alt(SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(key, $counted_template_set$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject get_counted_sethash_entry_count(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(key, $counted_template_set$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return list or atom; the first template item for ENTRY that has not
    yet been parsed
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list or atom; the first template item for ENTRY that has not\r\nyet been parsed")
    public static final SubLObject template_item_from_rtp_entry_alt(SubLObject entry) {
        return nth(rtp_datastructures.rtp_chart_entry_template_index(entry), rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry)));
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return list or atom; the first template item for ENTRY that has not
    yet been parsed
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list or atom; the first template item for ENTRY that has not\r\nyet been parsed")
    public static SubLObject template_item_from_rtp_entry(final SubLObject entry) {
        return nth(rtp_datastructures.rtp_chart_entry_template_index(entry), rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry)));
    }

    /**
     * Mark the present template item as used, and advance pointer to the next item
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return integer; the new index for the template item in entry
     * @unknown modifies the value of the template-index on ENTRY
     */
    @LispMethod(comment = "Mark the present template item as used, and advance pointer to the next item\r\n\r\n@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return integer; the new index for the template item in entry\r\n@unknown modifies the value of the template-index on ENTRY")
    public static final SubLObject eat_a_template_item_alt(SubLObject entry) {
        if (NIL != rtp_datastructures.rtp_chart_entry_template_index(entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, add(ONE_INTEGER, rtp_datastructures.rtp_chart_entry_template_index(entry)));
        }
        return rtp_datastructures.rtp_chart_entry_template_index(entry);
    }

    /**
     * Mark the present template item as used, and advance pointer to the next item
     *
     * @param ENTRY
    		rtp-chart-entry
     * 		
     * @return integer; the new index for the template item in entry
     * @unknown modifies the value of the template-index on ENTRY
     */
    @LispMethod(comment = "Mark the present template item as used, and advance pointer to the next item\r\n\r\n@param ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return integer; the new index for the template item in entry\r\n@unknown modifies the value of the template-index on ENTRY")
    public static SubLObject eat_a_template_item(final SubLObject entry) {
        if (NIL != rtp_datastructures.rtp_chart_entry_template_index(entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, add(ONE_INTEGER, rtp_datastructures.rtp_chart_entry_template_index(entry)));
        }
        return rtp_datastructures.rtp_chart_entry_template_index(entry);
    }

    /**
     * check to see if a sentence (WORD-LIST) matches a particular RULE.
     *
     * @param RULE
     * 		list; a template/rule
     * @param WORD-LIST
     * 		list; a list of strings for the words to be matched to the template
     * @param START
     * 		integer; the index of the first word in WORD-LIST
     * @param END
     * 		integer; the index following the last word in WORD-LIST
     * @param DEPTH
     * 		integer; how deep in the tree are we?
     * @return COMPLETED-ENTRIES list; a list of completed chart-entrys (note that 'completed'
    doesn't mean that all the subconstituents are parsed, merely that they have all been
    identified and are included in the subconstits list for the entry).
     */
    @LispMethod(comment = "check to see if a sentence (WORD-LIST) matches a particular RULE.\r\n\r\n@param RULE\r\n\t\tlist; a template/rule\r\n@param WORD-LIST\r\n\t\tlist; a list of strings for the words to be matched to the template\r\n@param START\r\n\t\tinteger; the index of the first word in WORD-LIST\r\n@param END\r\n\t\tinteger; the index following the last word in WORD-LIST\r\n@param DEPTH\r\n\t\tinteger; how deep in the tree are we?\r\n@return COMPLETED-ENTRIES list; a list of completed chart-entrys (note that \'completed\'\r\ndoesn\'t mean that all the subconstituents are parsed, merely that they have all been\r\nidentified and are included in the subconstits list for the entry).")
    public static final SubLObject tp_match_template_alt(SubLObject rule, SubLObject word_list, SubLObject start, SubLObject end, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt46$split_sentence____S__, word_list));
            }
            {
                SubLObject sem = narts_high.nart_expand(rtp_datastructures.rule_sem(rule));
                SubLObject new_current_entries = list(rtp_datastructures.make_new_rtp_entry(word_list, start, end, sem, rule));
                SubLObject current_entries = new_current_entries;
                SubLObject matched_entries = NIL;
                while (NIL != current_entries) {
                    new_current_entries = NIL;
                    {
                        SubLObject cdolist_list_var = current_entries;
                        SubLObject current_entry = NIL;
                        for (current_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_entry = cdolist_list_var.first()) {
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt47$at_top_of_cdolist__current_entrie, current_entries));
                            }
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt48$top_entry____S__, current_entry));
                            }
                            {
                                SubLObject template_item = com.cyc.cycjava.cycl.rtp.recognition.template_item_from_rtp_entry(current_entry);
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt49$template_item____S__, template_item));
                                }
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt50$RTP_Chart_Entry_is_empty___));
                                            }
                                        } else {
                                            if (NIL != rtp_type_checkers.optional_template_item(template_item)) {
                                                new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_optional_template_item(template_item, current_entry), new_current_entries);
                                            } else {
                                                if (rtp_datastructures.rtp_chart_entry_words(current_entry) == $completed_words_list$.getGlobalValue()) {
                                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt51$Equal_to_completed_word_list__));
                                                    }
                                                } else {
                                                    if (template_item.isString()) {
                                                        new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_string_template_item(template_item, current_entry), new_current_entries);
                                                    } else {
                                                        if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
                                                            new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_wu_template_item(template_item, current_entry), new_current_entries);
                                                        } else {
                                                            if (NIL != rtp_type_checkers.rtp_token_itemP(template_item)) {
                                                                new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_token_template_item(template_item, current_entry), new_current_entries);
                                                            } else {
                                                                if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
                                                                    new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_nl_agr_pred_template_item(template_item, current_entry), new_current_entries);
                                                                } else {
                                                                    if (NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
                                                                        new_current_entries = cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.match_speech_part_template_item(template_item, current_entry), new_current_entries);
                                                                    } else {
                                                                        if (NIL != rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                                                                            if (NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                                                                                new_current_entries = cconcatenate(new_current_entries, com.cyc.cycjava.cycl.rtp.recognition.match_recursive_template_item(template_item, current_entry));
                                                                            }
                                                                        } else {
                                                                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt52$No_hits_for_template_item__S__, template_item));
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
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                    current_entries = NIL;
                    {
                        SubLObject cdolist_list_var = new_current_entries;
                        SubLObject entry = NIL;
                        for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                            if (NIL != com.cyc.cycjava.cycl.rtp.recognition.completed_entryP(entry, depth)) {
                                matched_entries = cons(entry, matched_entries);
                            } else {
                                current_entries = cons(entry, current_entries);
                            }
                        }
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str_alt53$current_entries____S__, current_entries)));
                    }
                    new_current_entries = NIL;
                } 
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt54$_________COMPLETED_ENTRIES_______));
                }
                if (!rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.print_entries(com.cyc.cycjava.cycl.rtp.recognition.completed_entries(cconcatenate(current_entries, new_current_entries), depth));
                }
                return com.cyc.cycjava.cycl.rtp.recognition.filter_sem_tests(matched_entries);
            }
        }
    }

    /**
     * check to see if a sentence (WORD-LIST) matches a particular RULE.
     *
     * @param RULE
     * 		list; a template/rule
     * @param WORD-LIST
     * 		list; a list of strings for the words to be matched to the template
     * @param START
     * 		integer; the index of the first word in WORD-LIST
     * @param END
     * 		integer; the index following the last word in WORD-LIST
     * @param DEPTH
     * 		integer; how deep in the tree are we?
     * @return COMPLETED-ENTRIES list; a list of completed chart-entrys (note that 'completed'
    doesn't mean that all the subconstituents are parsed, merely that they have all been
    identified and are included in the subconstits list for the entry).
     */
    @LispMethod(comment = "check to see if a sentence (WORD-LIST) matches a particular RULE.\r\n\r\n@param RULE\r\n\t\tlist; a template/rule\r\n@param WORD-LIST\r\n\t\tlist; a list of strings for the words to be matched to the template\r\n@param START\r\n\t\tinteger; the index of the first word in WORD-LIST\r\n@param END\r\n\t\tinteger; the index following the last word in WORD-LIST\r\n@param DEPTH\r\n\t\tinteger; how deep in the tree are we?\r\n@return COMPLETED-ENTRIES list; a list of completed chart-entrys (note that \'completed\'\r\ndoesn\'t mean that all the subconstituents are parsed, merely that they have all been\r\nidentified and are included in the subconstits list for the entry).")
    public static SubLObject tp_match_template(final SubLObject rule, final SubLObject word_list, final SubLObject start, final SubLObject end, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
            rtp_tracer_output(TWO_INTEGER, list($str46$split_sentence____S__, word_list));
        }
        final SubLObject sem = narts_high.nart_expand(rtp_datastructures.rule_sem(rule));
        SubLObject current_entries;
        SubLObject new_current_entries = current_entries = list(rtp_datastructures.make_new_rtp_entry(word_list, start, end, sem, rule));
        SubLObject matched_entries = NIL;
        while (NIL != current_entries) {
            new_current_entries = NIL;
            SubLObject cdolist_list_var = current_entries;
            SubLObject current_entry = NIL;
            current_entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    rtp_tracer_output(ONE_INTEGER, list($str47$at_top_of_cdolist__current_entrie, current_entries));
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    rtp_tracer_output(ONE_INTEGER, list($str48$top_entry____S__, current_entry));
                }
                final SubLObject template_item = template_item_from_rtp_entry(current_entry);
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    rtp_tracer_output(ONE_INTEGER, list($str49$template_item____S__, template_item));
                }
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                            rtp_tracer_output(TWO_INTEGER, list($str50$RTP_Chart_Entry_is_empty___));
                        }
                    } else
                        if (NIL != rtp_type_checkers.optional_template_item(template_item)) {
                            new_current_entries = cconcatenate(match_optional_template_item(template_item, current_entry), new_current_entries);
                        } else
                            if (rtp_datastructures.rtp_chart_entry_words(current_entry).eql($completed_words_list$.getGlobalValue())) {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    rtp_tracer_output(TWO_INTEGER, list($str51$Equal_to_completed_word_list__));
                                }
                            } else
                                if (template_item.isString()) {
                                    new_current_entries = cconcatenate(match_string_template_item(template_item, current_entry), new_current_entries);
                                } else
                                    if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
                                        new_current_entries = cconcatenate(match_wu_template_item(template_item, current_entry), new_current_entries);
                                    } else
                                        if (NIL != rtp_type_checkers.rtp_token_itemP(template_item)) {
                                            new_current_entries = cconcatenate(match_token_template_item(template_item, current_entry), new_current_entries);
                                        } else
                                            if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
                                                new_current_entries = cconcatenate(match_nl_agr_pred_template_item(template_item, current_entry), new_current_entries);
                                            } else
                                                if (NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
                                                    new_current_entries = cconcatenate(match_speech_part_template_item(template_item, current_entry), new_current_entries);
                                                } else
                                                    if (NIL != rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                                                        if (NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                                                            new_current_entries = cconcatenate(new_current_entries, match_recursive_template_item(template_item, current_entry));
                                                        }
                                                    } else
                                                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                            rtp_tracer_output(ONE_INTEGER, list($str52$No_hits_for_template_item__S__, template_item));
                                                        }









                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                current_entry = cdolist_list_var.first();
            } 
            current_entries = NIL;
            cdolist_list_var = new_current_entries;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != completed_entryP(entry, depth)) {
                    matched_entries = cons(entry, matched_entries);
                } else {
                    current_entries = cons(entry, current_entries);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str53$current_entries____S__, current_entries)));
            }
            new_current_entries = NIL;
        } 
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str54$_________COMPLETED_ENTRIES_______));
        }
        if (!rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numE(ZERO_INTEGER)) {
            print_entries(completed_entries(cconcatenate(current_entries, new_current_entries), depth));
        }
        return filter_sem_tests(matched_entries);
    }

    /**
     * filter out any parses that don't meet the semantic constraints imposed on the rule
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entrys
     * @return list; a list of rtp-chart-entrys
     * @unknown stub waiting for code
     */
    @LispMethod(comment = "filter out any parses that don\'t meet the semantic constraints imposed on the rule\r\n\r\n@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entrys\r\n@return list; a list of rtp-chart-entrys\r\n@unknown stub waiting for code")
    public static final SubLObject filter_sem_tests_alt(SubLObject entries) {
        if ($rtp_perform_semantic_tests$.getGlobalValue() == $INTERNAL) {
            return entries;
        } else {
            return entries;
        }
    }

    /**
     * filter out any parses that don't meet the semantic constraints imposed on the rule
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entrys
     * @return list; a list of rtp-chart-entrys
     * @unknown stub waiting for code
     */
    @LispMethod(comment = "filter out any parses that don\'t meet the semantic constraints imposed on the rule\r\n\r\n@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entrys\r\n@return list; a list of rtp-chart-entrys\r\n@unknown stub waiting for code")
    public static SubLObject filter_sem_tests(final SubLObject entries) {
        if ($rtp_perform_semantic_tests$.getGlobalValue() == $INTERNAL) {
            return entries;
        }
        return entries;
    }

    /**
     * check to see if a string matches the current entry.  If so, return the new entry,otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		string; a string to match
     * @param CURRENT-ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list containing one rtp-chart-entry
     */
    @LispMethod(comment = "check to see if a string matches the current entry.  If so, return the new entry,otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tstring; a string to match\r\n@param CURRENT-ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list containing one rtp-chart-entry")
    public static final SubLObject match_string_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        if (NIL == com.cyc.cycjava.cycl.rtp.recognition.tp_match_tokenP(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry).first())) {
            return NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), ONE_INTEGER));
        com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, $completed_words_list$.getGlobalValue());
        }
        return list(current_entry);
    }

    /**
     * check to see if a string matches the current entry.  If so, return the new entry,otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		string; a string to match
     * @param CURRENT-ENTRY
    		rtp-chart-entry
     * 		
     * @return list; a list containing one rtp-chart-entry
     */
    @LispMethod(comment = "check to see if a string matches the current entry.  If so, return the new entry,otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tstring; a string to match\r\n@param CURRENT-ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return list; a list containing one rtp-chart-entry")
    public static SubLObject match_string_template_item(final SubLObject template_item, final SubLObject current_entry) {
        if (NIL == tp_match_tokenP(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry).first())) {
            return NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), ONE_INTEGER));
        eat_a_template_item(current_entry);
        if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, $completed_words_list$.getGlobalValue());
        }
        return list(current_entry);
    }

    /**
     * check to see if a word-unit matches the current entry.  If so, return the new entry,otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		list; a template item list containing a word-unit
     * @param CURRENT-ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list containing one rtp-chart-entry
     */
    @LispMethod(comment = "check to see if a word-unit matches the current entry.  If so, return the new entry,otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item list containing a word-unit\r\n@param CURRENT-ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list containing one rtp-chart-entry")
    public static final SubLObject match_wu_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        if (!((NIL != com.cyc.cycjava.cycl.rtp.recognition.tp_match_wordXpos(template_item, current_entry)) || (NIL != com.cyc.cycjava.cycl.rtp.recognition.tp_match_wordXpred(template_item, current_entry)))) {
            return NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), ONE_INTEGER));
        if (NIL != rtp_datastructures.rtp_chart_entry_template_index(current_entry)) {
            com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        }
        if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, $completed_words_list$.getGlobalValue());
        }
        return list(current_entry);
    }

    /**
     * check to see if a word-unit matches the current entry.  If so, return the new entry,otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		list; a template item list containing a word-unit
     * @param CURRENT-ENTRY
    		rtp-chart-entry
     * 		
     * @return list; a list containing one rtp-chart-entry
     */
    @LispMethod(comment = "check to see if a word-unit matches the current entry.  If so, return the new entry,otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item list containing a word-unit\r\n@param CURRENT-ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return list; a list containing one rtp-chart-entry")
    public static SubLObject match_wu_template_item(final SubLObject template_item, final SubLObject current_entry) {
        if ((NIL == tp_match_wordXpos(template_item, current_entry)) && (NIL == tp_match_wordXpred(template_item, current_entry))) {
            return NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), ONE_INTEGER));
        if (NIL != rtp_datastructures.rtp_chart_entry_template_index(current_entry)) {
            eat_a_template_item(current_entry);
        }
        if (NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, $completed_words_list$.getGlobalValue());
        }
        return list(current_entry);
    }

    public static final SubLObject match_token_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        {
            SubLObject new_bindings = com.cyc.cycjava.cycl.rtp.recognition.tp_match_token(template_item.first(), rtp_datastructures.rtp_chart_entry_words(current_entry));
            SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
            SubLObject result = NIL;
            if (NIL != new_bindings) {
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL == rtp_datastructures.rtp_chart_entry_words(current_entry).rest() ? ((SubLObject) ($completed_words_list$.getGlobalValue())) : rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), ONE_INTEGER));
                rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), new_bindings), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                result = cons(new_entry, result);
            }
            return result;
        }
    }

    public static SubLObject match_token_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_token(template_item.first(), rtp_datastructures.rtp_chart_entry_words(current_entry));
        final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
        SubLObject result = NIL;
        if (NIL != new_bindings) {
            rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL == rtp_datastructures.rtp_chart_entry_words(current_entry).rest() ? $completed_words_list$.getGlobalValue() : rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
            rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), ONE_INTEGER));
            rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), new_bindings), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
            result = cons(new_entry, result);
        }
        return result;
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; with a pos-pred as its first item
     * @param CURRENT-ENTRY
    rtp-entry
     * 		
     * @return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each
    returned entry will be similar to CURRENT-ENTRY but will have the words corresponding
    to template-item stripped and will have the appropriate bindings for the stripped
    item added to the binding-list
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; with a pos-pred as its first item\r\n@param CURRENT-ENTRY\nrtp-entry\r\n\t\t\r\n@return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each\r\nreturned entry will be similar to CURRENT-ENTRY but will have the words corresponding\r\nto template-item stripped and will have the appropriate bindings for the stripped\r\nitem added to the binding-list")
    public static final SubLObject match_nl_agr_pred_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        {
            SubLObject new_bindings = com.cyc.cycjava.cycl.rtp.recognition.tp_match_pred(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
            SubLObject result = NIL;
            SubLObject cdolist_list_var = new_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject denot = NIL;
                    SubLObject words_eaten = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    denot = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    words_eaten = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                        {
                            SubLObject leftover_words = nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                            rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL != leftover_words ? ((SubLObject) (leftover_words)) : $completed_words_list$.getGlobalValue());
                        }
                        rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                        result = cons(new_entry, result);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt56);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; with a pos-pred as its first item
     * @param CURRENT-ENTRY
    rtp-entry
     * 		
     * @return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each
    returned entry will be similar to CURRENT-ENTRY but will have the words corresponding
    to template-item stripped and will have the appropriate bindings for the stripped
    item added to the binding-list
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; with a pos-pred as its first item\r\n@param CURRENT-ENTRY\nrtp-entry\r\n\t\t\r\n@return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each\r\nreturned entry will be similar to CURRENT-ENTRY but will have the words corresponding\r\nto template-item stripped and will have the appropriate bindings for the stripped\r\nitem added to the binding-list")
    public static SubLObject match_nl_agr_pred_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_pred(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = new_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject denot = NIL;
            SubLObject words_eaten = NIL;
            destructuring_bind_must_consp(current, datum, $list56);
            denot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            words_eaten = current.first();
            current = current.rest();
            if (NIL == current) {
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                final SubLObject leftover_words = nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL != leftover_words ? leftover_words : $completed_words_list$.getGlobalValue());
                rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                result = cons(new_entry, result);
            } else {
                cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; with a pos as its first item
     * @param CURRENT-ENTRY
    rtp-entry
     * 		
     * @return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each
    returned entry will be similar to CURRENT-ENTRY but will have the words corresponding
    to template-item stripped and will have the appropriate bindings for the stripped
    item added to the binding-list
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; with a pos as its first item\r\n@param CURRENT-ENTRY\nrtp-entry\r\n\t\t\r\n@return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each\r\nreturned entry will be similar to CURRENT-ENTRY but will have the words corresponding\r\nto template-item stripped and will have the appropriate bindings for the stripped\r\nitem added to the binding-list")
    public static final SubLObject match_speech_part_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        {
            SubLObject new_bindings = com.cyc.cycjava.cycl.rtp.recognition.tp_match_pos(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
            SubLObject result = NIL;
            SubLObject cdolist_list_var = new_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject denot = NIL;
                    SubLObject words_eaten = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    denot = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    words_eaten = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                        {
                            SubLObject leftover_words = nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                            rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL != leftover_words ? ((SubLObject) (leftover_words)) : $completed_words_list$.getGlobalValue());
                        }
                        rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                        result = cons(new_entry, result);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt56);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		template-item; with a pos as its first item
     * @param CURRENT-ENTRY
    rtp-entry
     * 		
     * @return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each
    returned entry will be similar to CURRENT-ENTRY but will have the words corresponding
    to template-item stripped and will have the appropriate bindings for the stripped
    item added to the binding-list
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ttemplate-item; with a pos as its first item\r\n@param CURRENT-ENTRY\nrtp-entry\r\n\t\t\r\n@return list; a list of rtp-entrys that have matched TEMPLATE-ITEM.  Each\r\nreturned entry will be similar to CURRENT-ENTRY but will have the words corresponding\r\nto template-item stripped and will have the appropriate bindings for the stripped\r\nitem added to the binding-list")
    public static SubLObject match_speech_part_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_pos(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = new_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject denot = NIL;
            SubLObject words_eaten = NIL;
            destructuring_bind_must_consp(current, datum, $list56);
            denot = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            words_eaten = current.first();
            current = current.rest();
            if (NIL == current) {
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                final SubLObject leftover_words = nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, NIL != leftover_words ? leftover_words : $completed_words_list$.getGlobalValue());
                rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, cons(rtp_datastructures.rtp_make_binding(second(template_item), list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                result = cons(new_entry, result);
            } else {
                cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @param ITEMS
     * 		list; a list of lists of words and their spans
     * @return list; a list from which the spans have been stripped.
     */
    @LispMethod(comment = "@param ITEMS\r\n\t\tlist; a list of lists of words and their spans\r\n@return list; a list from which the spans have been stripped.")
    public static final SubLObject words_from_word_spans_alt(SubLObject items) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                result = cons(item.first(), result);
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @param ITEMS
     * 		list; a list of lists of words and their spans
     * @return list; a list from which the spans have been stripped.
     */
    @LispMethod(comment = "@param ITEMS\r\n\t\tlist; a list of lists of words and their spans\r\n@return list; a list from which the spans have been stripped.")
    public static SubLObject words_from_word_spans(final SubLObject items) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(item.first(), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * check to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.
     * If a match, return all possible RTP-CHART-ENTRYs that result from the match.
     *
     * @param TEMPLATE-ITEM
     * 		list; an item that passes OPTIONAL-TEMPLATE-ITEM
     * @param CURRENT-ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list of new RTP-CHART-ENTRYs that result from matching TEMPLATE-ITEM
     */
    @LispMethod(comment = "check to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.\r\nIf a match, return all possible RTP-CHART-ENTRYs that result from the match.\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; an item that passes OPTIONAL-TEMPLATE-ITEM\r\n@param CURRENT-ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list of new RTP-CHART-ENTRYs that result from matching TEMPLATE-ITEM\ncheck to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.\nIf a match, return all possible RTP-CHART-ENTRYs that result from the match.")
    public static final SubLObject match_optional_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        com.cyc.cycjava.cycl.rtp.recognition.eat_a_template_item(current_entry);
        if (NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            {
                SubLObject current_words = rtp_datastructures.rtp_chart_entry_words(current_entry);
                SubLObject current_start = rtp_datastructures.rtp_chart_entry_start(current_entry);
                SubLObject current_end = rtp_datastructures.rtp_chart_entry_end(current_entry);
                SubLObject new_words = com.cyc.cycjava.cycl.rtp.recognition.words_from_word_spans(com.cyc.cycjava.cycl.rtp.recognition.remove_optional_strings(template_item, list(current_words, current_start, current_end), UNPROVIDED));
                SubLObject existing_length = length(current_words);
                SubLObject new_entries = NIL;
                SubLObject cdolist_list_var = new_words;
                SubLObject word_list = NIL;
                for (word_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word_list = cdolist_list_var.first()) {
                    {
                        SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                        rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, word_list);
                        rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), subtract(existing_length, length(word_list))));
                        new_entries = cons(new_entry, new_entries);
                    }
                }
                return new_entries;
            }
        }
        return NIL;
    }

    /**
     * check to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.
     * If a match, return all possible RTP-CHART-ENTRYs that result from the match.
     *
     * @param TEMPLATE-ITEM
     * 		list; an item that passes OPTIONAL-TEMPLATE-ITEM
     * @param CURRENT-ENTRY
    		rtp-chart-entry
     * 		
     * @return list; a list of new RTP-CHART-ENTRYs that result from matching TEMPLATE-ITEM
     */
    @LispMethod(comment = "check to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.\r\nIf a match, return all possible RTP-CHART-ENTRYs that result from the match.\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; an item that passes OPTIONAL-TEMPLATE-ITEM\r\n@param CURRENT-ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return list; a list of new RTP-CHART-ENTRYs that result from matching TEMPLATE-ITEM\ncheck to see if the OPTIONAL-TEMPLATE-ITEM TEMPLATE-ITEM matches CURRENT-ENTRY.\nIf a match, return all possible RTP-CHART-ENTRYs that result from the match.")
    public static SubLObject match_optional_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        if (NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            final SubLObject current_words = rtp_datastructures.rtp_chart_entry_words(current_entry);
            final SubLObject current_start = rtp_datastructures.rtp_chart_entry_start(current_entry);
            final SubLObject current_end = rtp_datastructures.rtp_chart_entry_end(current_entry);
            final SubLObject new_words = words_from_word_spans(remove_optional_strings(template_item, list(current_words, current_start, current_end), UNPROVIDED));
            final SubLObject existing_length = length(current_words);
            SubLObject new_entries = NIL;
            SubLObject cdolist_list_var = new_words;
            SubLObject word_list = NIL;
            word_list = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, word_list);
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(current_entry), subtract(existing_length, length(word_list))));
                new_entries = cons(new_entry, new_entries);
                cdolist_list_var = cdolist_list_var.rest();
                word_list = cdolist_list_var.first();
            } 
            return new_entries;
        }
        return NIL;
    }

    public static final SubLObject clear_match_recursive_template_item_alt() {
        return NIL;
    }

    public static SubLObject clear_match_recursive_template_item() {
        return NIL;
    }

    /**
     * Check to see if a recursive item matches the beginning words of CURRENT-ENTRY.
     * If so, return the new entry(s),otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		list; a template item list containing a recursive item
     * 		(e.g. #$ParsingTemplateCategory category)
     * @param CURRENT-ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list containing rtp-chart-entrys after matching the *'ed items
     */
    @LispMethod(comment = "Check to see if a recursive item matches the beginning words of CURRENT-ENTRY.\r\nIf so, return the new entry(s),otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item list containing a recursive item\r\n\t\t(e.g. #$ParsingTemplateCategory category)\r\n@param CURRENT-ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list containing rtp-chart-entrys after matching the *\'ed items\nCheck to see if a recursive item matches the beginning words of CURRENT-ENTRY.\nIf so, return the new entry(s),otherwise return nil")
    public static final SubLObject match_recursive_template_item_alt(SubLObject template_item, SubLObject current_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt57$adding_some_subconstits_for__S__, template_item.first()));
            }
            {
                SubLObject split_out = com.cyc.cycjava.cycl.rtp.recognition.tp_split(template_item, rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(current_entry)), copy_list(rtp_datastructures.rtp_chart_entry_words(current_entry)), rtp_datastructures.rtp_chart_entry_start(current_entry), rtp_datastructures.rtp_chart_entry_end(current_entry));
                SubLObject splits = second(split_out);
                SubLObject template_rest = split_out.first();
                SubLObject new_entries = NIL;
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt58$____split_out____S_____template_r, split_out, template_rest));
                }
                current_entry = rtp_datastructures.set_rtp_entry_remaining_template(current_entry, template_rest);
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt59$____splits____S_____, splits));
                }
                {
                    SubLObject cdolist_list_var = splits;
                    SubLObject lyst = NIL;
                    for (lyst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lyst = cdolist_list_var.first()) {
                        {
                            SubLObject used_words = second(lyst);
                            SubLObject subconsts = lyst.first();
                            SubLObject used_word_length = length(used_words);
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt60$lyst__S__, lyst));
                            }
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt61$used_words____S__, used_words));
                            }
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt62$length_of_used_words____S__, used_word_length));
                            }
                            if (NIL != subconsts.first()) {
                                {
                                    SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                                    SubLObject failed_template = NIL;
                                    rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), used_word_length));
                                    rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, nthcdr(used_word_length, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                                    {
                                        SubLObject cdolist_list_var_4 = subconsts;
                                        SubLObject subconst = NIL;
                                        for (subconst = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , subconst = cdolist_list_var_4.first()) {
                                            {
                                                SubLObject subconst_template_item = second(subconst);
                                                SubLObject subconst_words = subconst.first();
                                                SubLObject subconst_start = third(subconst);
                                                SubLObject subconst_end = fourth(subconst);
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt63$just_ate__S_words__, used_word_length));
                                                }
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt64$words_in_entry____S__, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                                                }
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt65$subconstit_eaten____S__, subconst));
                                                }
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt66$subconstit_is__A_recursive__, NIL != rtp_type_checkers.rtp_recursive_itemP(second(subconst)) ? ((SubLObject) ($str_alt67$)) : $str_alt68$not_));
                                                }
                                                if (((NIL != rtp_type_checkers.rtp_recursive_itemP(subconst_template_item)) || (NIL != rtp_type_checkers.rtp_speech_part_itemP(subconst_template_item))) || (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(subconst_template_item))) {
                                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt69$pushing_a_new_subconstit___S__, subconst_template_item));
                                                    }
                                                    rtp_datastructures._csetf_rtp_chart_entry_subconstits(new_entry, cons(rtp_datastructures.make_new_subconstit(subconst_template_item.first(), subconst_words, second(subconst_template_item), subconst_start, subconst_end, com.cyc.cycjava.cycl.rtp.recognition.get_sem_test_for_var(second(subconst_template_item), rtp_datastructures.rtp_chart_entry_rule(current_entry))), rtp_datastructures.rtp_chart_entry_subconstits(new_entry)));
                                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt70$new_entry____A__, new_entry));
                                                    }
                                                }
                                                failed_template = com.cyc.cycjava.cycl.rtp.recognition.failed_subconst_item(subconst_template_item, subconst_words, subconst_start, subconst_end);
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt71$after_eating_subconstit__new_entr, new_entry));
                                                }
                                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt72$failed_template____A__, failed_template));
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == rtp_datastructures.rtp_chart_entry_words(new_entry)) {
                                        rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, $completed_words_list$.getGlobalValue());
                                    }
                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt73$new_entry__end_of_recursive_item_, new_entry));
                                    }
                                    if (NIL == failed_template) {
                                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt74$pushing_entry_at_end_of_recursive));
                                        }
                                        new_entries = cons(new_entry, new_entries);
                                    }
                                }
                            }
                        }
                    }
                }
                return new_entries;
            }
        }
    }

    /**
     * Check to see if a recursive item matches the beginning words of CURRENT-ENTRY.
     * If so, return the new entry(s),otherwise return nil
     *
     * @param TEMPLATE-ITEM
     * 		list; a template item list containing a recursive item
     * 		(e.g. #$ParsingTemplateCategory category)
     * @param CURRENT-ENTRY
    		rtp-chart-entry
     * 		
     * @return list; a list containing rtp-chart-entrys after matching the *'ed items
     */
    @LispMethod(comment = "Check to see if a recursive item matches the beginning words of CURRENT-ENTRY.\r\nIf so, return the new entry(s),otherwise return nil\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item list containing a recursive item\r\n\t\t(e.g. #$ParsingTemplateCategory category)\r\n@param CURRENT-ENTRY\n\t\trtp-chart-entry\r\n\t\t\r\n@return list; a list containing rtp-chart-entrys after matching the *\'ed items\nCheck to see if a recursive item matches the beginning words of CURRENT-ENTRY.\nIf so, return the new entry(s),otherwise return nil")
    public static SubLObject match_recursive_template_item(final SubLObject template_item, SubLObject current_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str57$adding_some_subconstits_for__S__, template_item.first()));
        }
        final SubLObject split_out = tp_split(template_item, rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(current_entry)), copy_list(rtp_datastructures.rtp_chart_entry_words(current_entry)), rtp_datastructures.rtp_chart_entry_start(current_entry), rtp_datastructures.rtp_chart_entry_end(current_entry));
        final SubLObject splits = second(split_out);
        final SubLObject template_rest = split_out.first();
        SubLObject new_entries = NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str58$____split_out____S_____template_r, split_out, template_rest));
        }
        current_entry = rtp_datastructures.set_rtp_entry_remaining_template(current_entry, template_rest);
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
            rtp_tracer_output(TWO_INTEGER, list($str59$____splits____S_____, splits));
        }
        SubLObject cdolist_list_var = splits;
        SubLObject lyst = NIL;
        lyst = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject used_words = second(lyst);
            final SubLObject subconsts = lyst.first();
            final SubLObject used_word_length = length(used_words);
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str60$lyst__S__, lyst));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str61$used_words____S__, used_words));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str62$length_of_used_words____S__, used_word_length));
            }
            if (NIL != subconsts.first()) {
                final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                SubLObject failed_template = NIL;
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, add(rtp_datastructures.rtp_chart_entry_start(new_entry), used_word_length));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, nthcdr(used_word_length, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                SubLObject cdolist_list_var_$4 = subconsts;
                SubLObject subconst = NIL;
                subconst = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    final SubLObject subconst_template_item = second(subconst);
                    final SubLObject subconst_words = subconst.first();
                    final SubLObject subconst_start = third(subconst);
                    final SubLObject subconst_end = fourth(subconst);
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str63$just_ate__S_words__, used_word_length));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str64$words_in_entry____S__, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str65$subconstit_eaten____S__, subconst));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str66$subconstit_is__A_recursive__, NIL != rtp_type_checkers.rtp_recursive_itemP(second(subconst)) ? $str67$ : $$$not_));
                    }
                    if (((NIL != rtp_type_checkers.rtp_recursive_itemP(subconst_template_item)) || (NIL != rtp_type_checkers.rtp_speech_part_itemP(subconst_template_item))) || (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(subconst_template_item))) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            rtp_tracer_output(ONE_INTEGER, list($str69$pushing_a_new_subconstit___S__, subconst_template_item));
                        }
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(new_entry, cons(rtp_datastructures.make_new_subconstit(subconst_template_item.first(), subconst_words, second(subconst_template_item), subconst_start, subconst_end, get_sem_test_for_var(second(subconst_template_item), rtp_datastructures.rtp_chart_entry_rule(current_entry))), rtp_datastructures.rtp_chart_entry_subconstits(new_entry)));
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            rtp_tracer_output(ONE_INTEGER, list($str70$new_entry____A__, new_entry));
                        }
                    }
                    failed_template = failed_subconst_item(subconst_template_item, subconst_words, subconst_start, subconst_end);
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str71$after_eating_subconstit__new_entr, new_entry));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str72$failed_template____A__, failed_template));
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    subconst = cdolist_list_var_$4.first();
                } 
                if (NIL == rtp_datastructures.rtp_chart_entry_words(new_entry)) {
                    rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, $completed_words_list$.getGlobalValue());
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    rtp_tracer_output(ONE_INTEGER, list($str73$new_entry__end_of_recursive_item_, new_entry));
                }
                if (NIL == failed_template) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str74$pushing_entry_at_end_of_recursive));
                    }
                    new_entries = cons(new_entry, new_entries);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lyst = cdolist_list_var.first();
        } 
        return new_entries;
    }

    /**
     * given a particular RULE, see if there is a semantic test for VAR.
     * If so, return the test, otherwise return nil
     *
     * @param VAR
    keyword
     * 		
     * @param RULE
    template-rule
     * 		
     * @return formula; a CycL formula
     */
    @LispMethod(comment = "given a particular RULE, see if there is a semantic test for VAR.\r\nIf so, return the test, otherwise return nil\r\n\r\n@param VAR\nkeyword\r\n\t\t\r\n@param RULE\ntemplate-rule\r\n\t\t\r\n@return formula; a CycL formula\ngiven a particular RULE, see if there is a semantic test for VAR.\nIf so, return the test, otherwise return nil")
    public static final SubLObject get_sem_test_for_var_alt(SubLObject var, SubLObject rule) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.recognition.get_sem_test_for_var_from_formula(var, rtp_datastructures.template_rule_sem_test(rule));
            return result;
        }
    }

    @LispMethod(comment = "given a particular RULE, see if there is a semantic test for VAR.\r\nIf so, return the test, otherwise return nil\r\n\r\n@param VAR\n\t\tkeyword\r\n\t\t\r\n@param RULE\n\t\ttemplate-rule\r\n\t\t\r\n@return formula; a CycL formula\ngiven a particular RULE, see if there is a semantic test for VAR.\nIf so, return the test, otherwise return nil")
    public static SubLObject get_sem_test_for_var(final SubLObject var, final SubLObject rule) {
        final SubLObject result = get_sem_test_for_var_from_formula(var, rtp_datastructures.template_rule_sem_test(rule));
        return result;
    }/**
     * given a particular RULE, see if there is a semantic test for VAR.
     * If so, return the test, otherwise return nil
     *
     * @param VAR
    		keyword
     * 		
     * @param RULE
    		template-rule
     * 		
     * @return formula; a CycL formula
     */


    /**
     * given a particular RULE, see if there is a semantic test for VAR.
     * If so, return the test, otherwise return nil
     *
     * @param VAR
    keyword
     * 		
     * @param RULE
    formula
     * 		
     * @return formula; a CycL formula
     */
    @LispMethod(comment = "given a particular RULE, see if there is a semantic test for VAR.\r\nIf so, return the test, otherwise return nil\r\n\r\n@param VAR\nkeyword\r\n\t\t\r\n@param RULE\nformula\r\n\t\t\r\n@return formula; a CycL formula\ngiven a particular RULE, see if there is a semantic test for VAR.\nIf so, return the test, otherwise return nil")
    public static final SubLObject get_sem_test_for_var_from_formula_alt(SubLObject var, SubLObject formula) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.recognition.get_sem_test_for_var_from_formula_int(var, formula);
            if (NIL != list_utilities.lengthG(result, ONE_INTEGER, UNPROVIDED)) {
                return cons($$and, result);
            } else {
                return result;
            }
        }
    }

    @LispMethod(comment = "given a particular RULE, see if there is a semantic test for VAR.\r\nIf so, return the test, otherwise return nil\r\n\r\n@param VAR\n\t\tkeyword\r\n\t\t\r\n@param RULE\n\t\tformula\r\n\t\t\r\n@return formula; a CycL formula\ngiven a particular RULE, see if there is a semantic test for VAR.\nIf so, return the test, otherwise return nil")
    public static SubLObject get_sem_test_for_var_from_formula(final SubLObject var, final SubLObject formula) {
        final SubLObject result = get_sem_test_for_var_from_formula_int(var, formula);
        if (NIL != list_utilities.lengthG(result, ONE_INTEGER, UNPROVIDED)) {
            return cons($$and, result);
        }
        return result;
    }/**
     * given a particular RULE, see if there is a semantic test for VAR.
     * If so, return the test, otherwise return nil
     *
     * @param VAR
    		keyword
     * 		
     * @param RULE
    		formula
     * 		
     * @return formula; a CycL formula
     */


    public static final SubLObject get_sem_test_for_var_from_formula_int_alt(SubLObject var, SubLObject formula) {
        if (formula.isAtom()) {
            return NIL;
        } else {
            if ((NIL != rtp_datastructures.rtp_sem_testP(formula)) && (rtp_datastructures.rtp_sem_test_var(formula) == var)) {
                return list(rtp_datastructures.rtp_sem_test_constraint(formula));
            } else {
                if (NIL != rtp_datastructures.rtp_sem_testP(formula)) {
                    return NIL;
                } else {
                    return cconcatenate(com.cyc.cycjava.cycl.rtp.recognition.get_sem_test_for_var_from_formula_int(var, formula.first()), com.cyc.cycjava.cycl.rtp.recognition.get_sem_test_for_var_from_formula_int(var, formula.rest()));
                }
            }
        }
    }

    public static SubLObject get_sem_test_for_var_from_formula_int(final SubLObject var, final SubLObject formula) {
        if (formula.isAtom()) {
            return NIL;
        }
        if ((NIL != rtp_datastructures.rtp_sem_testP(formula)) && rtp_datastructures.rtp_sem_test_var(formula).eql(var)) {
            return list(rtp_datastructures.rtp_sem_test_constraint(formula));
        }
        if (NIL != rtp_datastructures.rtp_sem_testP(formula)) {
            return NIL;
        }
        return cconcatenate(get_sem_test_for_var_from_formula_int(var, formula.first()), get_sem_test_for_var_from_formula_int(var, formula.rest()));
    }

    /**
     * for items that can be easily checked based on the strings, determine if any have failed
     */
    @LispMethod(comment = "for items that can be easily checked based on the strings, determine if any have failed")
    public static final SubLObject failed_subconst_item_alt(SubLObject subconst_template_item, SubLObject subconst_words, SubLObject subconst_start, SubLObject subconst_end) {
        if (NIL != rtp_type_checkers.rtp_word_itemP(subconst_template_item)) {
            {
                SubLObject v_answer = com.cyc.cycjava.cycl.rtp.recognition.match_wu_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, UNPROVIDED, UNPROVIDED)).first();
                if (!((NIL != v_answer) && (rtp_datastructures.rtp_chart_entry_words(v_answer) == $completed_words_list$.getGlobalValue()))) {
                    return T;
                }
            }
        } else {
            if (NIL != rtp_type_checkers.optional_template_item(subconst_template_item)) {
                {
                    SubLObject v_answer = com.cyc.cycjava.cycl.rtp.recognition.match_optional_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, UNPROVIDED, UNPROVIDED)).first();
                    if (!((NIL != v_answer) && (rtp_datastructures.rtp_chart_entry_words(v_answer) == $completed_words_list$.getGlobalValue()))) {
                        return T;
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "for items that can be easily checked based on the strings, determine if any have failed")
    public static SubLObject failed_subconst_item(final SubLObject subconst_template_item, final SubLObject subconst_words, final SubLObject subconst_start, final SubLObject subconst_end) {
        if (NIL != rtp_type_checkers.rtp_word_itemP(subconst_template_item)) {
            final SubLObject v_answer = match_wu_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, UNPROVIDED, UNPROVIDED)).first();
            if ((NIL == v_answer) || (!rtp_datastructures.rtp_chart_entry_words(v_answer).eql($completed_words_list$.getGlobalValue()))) {
                return T;
            }
        } else {
            if (NIL == rtp_type_checkers.optional_template_item(subconst_template_item)) {
                return NIL;
            }
            final SubLObject v_answer = match_optional_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, UNPROVIDED, UNPROVIDED)).first();
            if ((NIL == v_answer) || (!rtp_datastructures.rtp_chart_entry_words(v_answer).eql($completed_words_list$.getGlobalValue()))) {
                return T;
            }
        }
        return NIL;
    }/**
     * for items that can be easily checked based on the strings, determine if any have failed
     */


    /**
     *
     *
     * @param STOP-ITEM
     * 		template item (should be string, pos-pred or pos item);
     * 		the item to find prefixes of
     * @param WORDS
     * 		list; a list of words
     * @return list; a list of lists of words, each of which is a prefix of WORDS
    before an instance of STOP-WORD
     */
    @LispMethod(comment = "@param STOP-ITEM\r\n\t\ttemplate item (should be string, pos-pred or pos item);\r\n\t\tthe item to find prefixes of\r\n@param WORDS\r\n\t\tlist; a list of words\r\n@return list; a list of lists of words, each of which is a prefix of WORDS\r\nbefore an instance of STOP-WORD")
    public static final SubLObject prefixes_before_item_alt(SubLObject stop_item, SubLObject words, SubLObject start, SubLObject end) {
        {
            SubLObject word_list = reverse(words);
            SubLObject result = NIL;
            while (NIL != word_list) {
                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.match_template_item(stop_item, word_list)) {
                    {
                        SubLObject re_reversed_words = reverse(word_list.rest());
                        SubLObject stop_index = add(start, length(re_reversed_words));
                        result = cons(list(re_reversed_words, start, stop_index), result);
                    }
                }
                word_list = word_list.rest();
            } 
            return result;
        }
    }

    /**
     *
     *
     * @param STOP-ITEM
     * 		template item (should be string, pos-pred or pos item);
     * 		the item to find prefixes of
     * @param WORDS
     * 		list; a list of words
     * @return list; a list of lists of words, each of which is a prefix of WORDS
    before an instance of STOP-WORD
     */
    @LispMethod(comment = "@param STOP-ITEM\r\n\t\ttemplate item (should be string, pos-pred or pos item);\r\n\t\tthe item to find prefixes of\r\n@param WORDS\r\n\t\tlist; a list of words\r\n@return list; a list of lists of words, each of which is a prefix of WORDS\r\nbefore an instance of STOP-WORD")
    public static SubLObject prefixes_before_item(final SubLObject stop_item, final SubLObject words, final SubLObject start, final SubLObject end) {
        SubLObject word_list = reverse(words);
        SubLObject result = NIL;
        while (NIL != word_list) {
            if (NIL != match_template_item(stop_item, word_list)) {
                final SubLObject re_reversed_words = reverse(word_list.rest());
                final SubLObject stop_index = add(start, length(re_reversed_words));
                result = cons(list(re_reversed_words, start, stop_index), result);
            }
            word_list = word_list.rest();
        } 
        return result;
    }

    /**
     * return a boolean for whether on not the template item matches at the beginning of
     * the words
     */
    @LispMethod(comment = "return a boolean for whether on not the template item matches at the beginning of\r\nthe words\nreturn a boolean for whether on not the template item matches at the beginning of\nthe words")
    public static final SubLObject match_template_item_alt(SubLObject item, SubLObject words) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
                return funcall(rtp_vars.$tp_equal$.getGlobalValue(), item, words.first());
            } else {
                if (NIL != rtp_type_checkers.rtp_speech_part_itemP(item)) {
                    return lexicon_accessors.string_is_posP(words.first(), item.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item)) {
                        {
                            SubLObject doneP = NIL;
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var = lexicon_utilities.preds_of_string(words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject pos = NIL;
                                    for (pos = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
                                        if (NIL != lexicon_accessors.genl_pos_predP(pos, item.first(), UNPROVIDED)) {
                                            doneP = T;
                                        }
                                    }
                                }
                            }
                            return doneP;
                        }
                    } else {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE($float$0_5)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output($float$0_5, list($str_alt77$sent_invalid_args___S__S__to_MATC, item, words));
                        }
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "return a boolean for whether on not the template item matches at the beginning of\r\nthe words\nreturn a boolean for whether on not the template item matches at the beginning of\nthe words")
    public static SubLObject match_template_item(final SubLObject item, final SubLObject words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
            return funcall(rtp_vars.$tp_equal$.getGlobalValue(), item, words.first());
        }
        if (NIL != rtp_type_checkers.rtp_speech_part_itemP(item)) {
            return lexicon_accessors.string_is_posP(words.first(), item.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item)) {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_string(words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pos = NIL;
                pos = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != lexicon_accessors.genl_pos_predP(pos, item.first(), UNPROVIDED)) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos = csome_list_var.first();
                } 
            }
            return doneP;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE($float$0_5)) {
            rtp_tracer_output($float$0_5, list($str77$sent_invalid_args___S__S__to_MATC, item, words));
        }
        return NIL;
    }/**
     * return a boolean for whether on not the template item matches at the beginning of
     * the words
     */


    /**
     *
     *
     * @param TEMPLATE
     * 		list; a list of template-items
     * @return template-item; the first template item that can function as a stop--
    something that absolutely must be present in input
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; a list of template-items\r\n@return template-item; the first template item that can function as a stop--\r\nsomething that absolutely must be present in input")
    public static final SubLObject find_stop_item_alt(SubLObject template) {
        {
            SubLObject stop_item = NIL;
            if (NIL == stop_item) {
                {
                    SubLObject csome_list_var = template;
                    SubLObject item = NIL;
                    for (item = csome_list_var.first(); !((NIL != stop_item) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                        if (((NIL != rtp_type_checkers.rtp_rule_terminalP(item)) || (NIL != rtp_type_checkers.rtp_speech_part_itemP(item))) || (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item))) {
                            stop_item = item;
                        }
                    }
                }
            }
            return stop_item;
        }
    }

    /**
     *
     *
     * @param TEMPLATE
     * 		list; a list of template-items
     * @return template-item; the first template item that can function as a stop--
    something that absolutely must be present in input
     */
    @LispMethod(comment = "@param TEMPLATE\r\n\t\tlist; a list of template-items\r\n@return template-item; the first template item that can function as a stop--\r\nsomething that absolutely must be present in input")
    public static SubLObject find_stop_item(final SubLObject template) {
        SubLObject stop_item = NIL;
        if (NIL == stop_item) {
            SubLObject csome_list_var = template;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == stop_item) && (NIL != csome_list_var)) {
                if (((NIL != rtp_type_checkers.rtp_rule_terminalP(item)) || (NIL != rtp_type_checkers.rtp_speech_part_itemP(item))) || (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item))) {
                    stop_item = item;
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return stop_item;
    }

    /**
     *
     *
     * @unknown presently requires that a stop-item be present.  Doesn't pay any attention to + words
     * @param TEMPLATE-ITEM
     * 		list; a template item, corresponding to the first item in TEMPLATE that
     * 		hasn't already been parsed.
     * @param TEMPLATE
     * 		list; the template portion of a rule
     * @param CURRENT-WORDS
     * 		list; a list of strings; the part of the sentence that hasn't been parsed yet.
     * @return list; a list containing two elements.  The first is the portion of the template that wasn't used, e.g.
    ('see' (* 'sleeping') (#$NPTemplate :Y))
    The second is a list of possible parses (along with all words that were used to get there, e.g.
    '((((('cat') (#$NPTemplate :X) 2 3) (('dog') (#$NPTemplate :Y) 0 1)) '('dogs' 'hate' 'cats'))
    (((('cat') (#$STemplate :X) 2 3) (('dog') (#$NPTemplate :Y) 0 1)) '('dogs' 'hate' 'cats' 'alot')))
     */
    @LispMethod(comment = "@unknown presently requires that a stop-item be present.  Doesn\'t pay any attention to + words\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item, corresponding to the first item in TEMPLATE that\r\n\t\thasn\'t already been parsed.\r\n@param TEMPLATE\r\n\t\tlist; the template portion of a rule\r\n@param CURRENT-WORDS\r\n\t\tlist; a list of strings; the part of the sentence that hasn\'t been parsed yet.\r\n@return list; a list containing two elements.  The first is the portion of the template that wasn\'t used, e.g.\r\n(\'see\' (* \'sleeping\') (#$NPTemplate :Y))\r\nThe second is a list of possible parses (along with all words that were used to get there, e.g.\r\n\'(((((\'cat\') (#$NPTemplate :X) 2 3) ((\'dog\') (#$NPTemplate :Y) 0 1)) \'(\'dogs\' \'hate\' \'cats\'))\r\n((((\'cat\') (#$STemplate :X) 2 3) ((\'dog\') (#$NPTemplate :Y) 0 1)) \'(\'dogs\' \'hate\' \'cats\' \'alot\')))")
    public static final SubLObject tp_split_alt(SubLObject template_item, SubLObject template, SubLObject current_words, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_remainder = member(template_item, template, symbol_function(EQUAL), UNPROVIDED);
                SubLObject stop_item = com.cyc.cycjava.cycl.rtp.recognition.find_stop_item(template_remainder);
                SubLObject stop_item_index_template_position = position(stop_item, template_remainder, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject stop_item_index_template = (NIL != stop_item_index_template_position) ? ((SubLObject) (stop_item_index_template_position)) : length(template_remainder);
                SubLObject stop_remainder_template = subseq(template_remainder, ZERO_INTEGER, stop_item_index_template);
                SubLObject template_unused = subseq(template_remainder, stop_item_index_template, UNPROVIDED);
                SubLObject words = current_words;
                SubLObject word_lists_before_stop = (NIL != stop_item) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.recognition.prefixes_before_item(stop_item, words, start, end))) : list(list(words, start, end));
                SubLObject kleene_removed_lists = com.cyc.cycjava.cycl.rtp.recognition.remove_kleene_words(word_lists_before_stop, stop_remainder_template);
                SubLObject result = NIL;
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt78$template_remainder____S__stop_ite, template_remainder, stop_item, stop_item_index_template_position, stop_item_index_template));
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt79$stop_remainder____S__template_unu, stop_remainder_template, template_unused, words, word_lists_before_stop, kleene_removed_lists));
                }
                force_output(T);
                {
                    SubLObject cdolist_list_var = kleene_removed_lists;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        if (!item.first().equal($completed_words_list$.getGlobalValue())) {
                            {
                                SubLObject left_over_words = item.first();
                                SubLObject template_5 = second(item);
                                SubLObject original_words = third(item);
                                SubLObject start_index = fourth(item);
                                SubLObject end_index = fifth(item);
                                SubLObject single_const_lists = nreverse(com.cyc.cycjava.cycl.rtp.recognition.rtp_compute_permutations(left_over_words, template_5, start_index));
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str_alt80$item____S__original_words____S__, item, original_words)));
                                }
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str_alt81$single_const_lists____S__, single_const_lists)));
                                }
                                {
                                    SubLObject cdolist_list_var_6 = single_const_lists;
                                    SubLObject lyst = NIL;
                                    for (lyst = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , lyst = cdolist_list_var_6.first()) {
                                        if (fourth(last(lyst, UNPROVIDED).first()).numE(end_index)) {
                                            result = cons(list(lyst, original_words), result);
                                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt82$lyst____S__result____S__, lyst));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return list(template_unused, result);
            }
        }
    }

    /**
     *
     *
     * @unknown presently requires that a stop-item be present.  Doesn't pay any attention to + words
     * @param TEMPLATE-ITEM
     * 		list; a template item, corresponding to the first item in TEMPLATE that
     * 		hasn't already been parsed.
     * @param TEMPLATE
     * 		list; the template portion of a rule
     * @param CURRENT-WORDS
     * 		list; a list of strings; the part of the sentence that hasn't been parsed yet.
     * @return list; a list containing two elements.  The first is the portion of the template that wasn't used, e.g.
    ('see' (* 'sleeping') (#$NPTemplate :Y))
    The second is a list of possible parses (along with all words that were used to get there, e.g.
    '((((('cat') (#$NPTemplate :X) 2 3) (('dog') (#$NPTemplate :Y) 0 1)) '('dogs' 'hate' 'cats'))
    (((('cat') (#$STemplate :X) 2 3) (('dog') (#$NPTemplate :Y) 0 1)) '('dogs' 'hate' 'cats' 'alot')))
     */
    @LispMethod(comment = "@unknown presently requires that a stop-item be present.  Doesn\'t pay any attention to + words\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a template item, corresponding to the first item in TEMPLATE that\r\n\t\thasn\'t already been parsed.\r\n@param TEMPLATE\r\n\t\tlist; the template portion of a rule\r\n@param CURRENT-WORDS\r\n\t\tlist; a list of strings; the part of the sentence that hasn\'t been parsed yet.\r\n@return list; a list containing two elements.  The first is the portion of the template that wasn\'t used, e.g.\r\n(\'see\' (* \'sleeping\') (#$NPTemplate :Y))\r\nThe second is a list of possible parses (along with all words that were used to get there, e.g.\r\n\'(((((\'cat\') (#$NPTemplate :X) 2 3) ((\'dog\') (#$NPTemplate :Y) 0 1)) \'(\'dogs\' \'hate\' \'cats\'))\r\n((((\'cat\') (#$STemplate :X) 2 3) ((\'dog\') (#$NPTemplate :Y) 0 1)) \'(\'dogs\' \'hate\' \'cats\' \'alot\')))")
    public static SubLObject tp_split(final SubLObject template_item, final SubLObject template, final SubLObject current_words, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_remainder = member(template_item, template, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject stop_item = find_stop_item(template_remainder);
        final SubLObject stop_item_index_template_position = position(stop_item, template_remainder, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject stop_item_index_template = (NIL != stop_item_index_template_position) ? stop_item_index_template_position : length(template_remainder);
        final SubLObject stop_remainder_template = subseq(template_remainder, ZERO_INTEGER, stop_item_index_template);
        final SubLObject template_unused = subseq(template_remainder, stop_item_index_template, UNPROVIDED);
        final SubLObject word_lists_before_stop = (NIL != stop_item) ? prefixes_before_item(stop_item, current_words, start, end) : list(list(current_words, start, end));
        final SubLObject kleene_removed_lists = remove_kleene_words(word_lists_before_stop, stop_remainder_template);
        SubLObject result = NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str78$template_remainder____S__stop_ite, template_remainder, stop_item, stop_item_index_template_position, stop_item_index_template));
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str79$stop_remainder____S__template_unu, stop_remainder_template, template_unused, current_words, word_lists_before_stop, kleene_removed_lists));
        }
        force_output(T);
        SubLObject cdolist_list_var = kleene_removed_lists;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.first().equal($completed_words_list$.getGlobalValue())) {
                final SubLObject left_over_words = item.first();
                final SubLObject template_$5 = second(item);
                final SubLObject original_words = third(item);
                final SubLObject start_index = fourth(item);
                final SubLObject end_index = fifth(item);
                final SubLObject single_const_lists = nreverse(rtp_compute_permutations(left_over_words, template_$5, start_index));
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str80$item____S__original_words____S__, item, original_words)));
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str81$single_const_lists____S__, single_const_lists)));
                }
                SubLObject cdolist_list_var_$6 = single_const_lists;
                SubLObject lyst = NIL;
                lyst = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    if (fourth(last(lyst, UNPROVIDED).first()).numE(end_index)) {
                        result = cons(list(lyst, original_words), result);
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                            rtp_tracer_output(TWO_INTEGER, list($str82$lyst____S__result____S__, lyst));
                        }
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    lyst = cdolist_list_var_$6.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return list(template_unused, result);
    }

    /**
     *
     *
     * @param WORDS
     * 		list; a list of strings representing the words that are part of this parse
     * @param TEMPLATE-ITEMS
     * 		list; a list of template-items to match up with WORDS
     * @param OFFSET
     * 		integer; the index of the first word in WORDS.
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlist; a list of strings representing the words that are part of this parse\r\n@param TEMPLATE-ITEMS\r\n\t\tlist; a list of template-items to match up with WORDS\r\n@param OFFSET\r\n\t\tinteger; the index of the first word in WORDS.")
    public static final SubLObject rtp_compute_permutations_alt(SubLObject words, SubLObject template_items, SubLObject offset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject expanded_template = Mapping.mapcar(symbol_function(EXPAND_WORD_ITEMS_IN_LIST), template_items);
                SubLObject incomplete_states = list(com.cyc.cycjava.cycl.rtp.recognition.make_rtp_perm_state(words, expanded_template, NIL, offset));
                SubLObject complete_states = NIL;
                SubLObject present_state = NIL;
                SubLObject search_past_startP = NIL;
                SubLObject result = NIL;
                while (NIL != incomplete_states) {
                    present_state = incomplete_states.first();
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str_alt84$incomplete_states____S__, incomplete_states)));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str_alt85$present_state____S__, present_state)));
                    }
                    incomplete_states = incomplete_states.rest();
                    if (NIL != com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_completeP(present_state)) {
                        complete_states = cons(present_state, complete_states);
                    } else {
                        if (NIL != rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_first_unused_template_item(present_state))) {
                            if (NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(present_state)) {
                                complete_states = cons(com.cyc.cycjava.cycl.rtp.recognition.process_perm_recursive(present_state), complete_states);
                            } else {
                                incomplete_states = cons(com.cyc.cycjava.cycl.rtp.recognition.process_perm_recursive(present_state), incomplete_states);
                            }
                            search_past_startP = T;
                        } else {
                            {
                                SubLObject new_states = com.cyc.cycjava.cycl.rtp.recognition.process_perm_non_recursive(present_state, search_past_startP);
                                search_past_startP = rtp_type_checkers.rtp_optional_template_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_first_unused_template_item(present_state));
                                {
                                    SubLObject cdolist_list_var = new_states;
                                    SubLObject state = NIL;
                                    for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                                        if ((NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(state)) && (NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_wordsP(state))) {
                                            complete_states = cons(state, complete_states);
                                        } else {
                                            if (NIL == com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(state)) {
                                                incomplete_states = cons(state, incomplete_states);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
                incomplete_states = complete_states;
                complete_states = NIL;
                {
                    SubLObject cdolist_list_var = incomplete_states;
                    SubLObject present_state_7 = NIL;
                    for (present_state_7 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , present_state_7 = cdolist_list_var.first()) {
                        complete_states = cconcatenate(complete_states, com.cyc.cycjava.cycl.rtp.recognition.rtp_compute_recursive_locations(present_state_7, words, offset));
                    }
                }
                {
                    SubLObject partial_parse = NIL;
                    SubLObject cdolist_list_var = complete_states;
                    SubLObject state = NIL;
                    for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_8 = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state);
                            SubLObject match = NIL;
                            for (match = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , match = cdolist_list_var_8.first()) {
                                partial_parse = cons(list(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_words(match), com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(match), com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_start(match), com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_end(match)), partial_parse);
                            }
                        }
                        result = cons(nreverse(partial_parse), result);
                        partial_parse = NIL;
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param WORDS
     * 		list; a list of strings representing the words that are part of this parse
     * @param TEMPLATE-ITEMS
     * 		list; a list of template-items to match up with WORDS
     * @param OFFSET
     * 		integer; the index of the first word in WORDS.
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlist; a list of strings representing the words that are part of this parse\r\n@param TEMPLATE-ITEMS\r\n\t\tlist; a list of template-items to match up with WORDS\r\n@param OFFSET\r\n\t\tinteger; the index of the first word in WORDS.")
    public static SubLObject rtp_compute_permutations(final SubLObject words, final SubLObject template_items, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expanded_template = Mapping.mapcar(symbol_function(EXPAND_WORD_ITEMS_IN_LIST), template_items);
        SubLObject incomplete_states = list(make_rtp_perm_state(words, expanded_template, NIL, offset));
        SubLObject complete_states = NIL;
        SubLObject present_state = NIL;
        SubLObject search_past_startP = NIL;
        SubLObject result = NIL;
        while (NIL != incomplete_states) {
            present_state = incomplete_states.first();
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str84$incomplete_states____S__, incomplete_states)));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str85$present_state____S__, present_state)));
            }
            incomplete_states = incomplete_states.rest();
            if (NIL != rtp_perm_state_completeP(present_state)) {
                complete_states = cons(present_state, complete_states);
            } else
                if (NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_perm_state_first_unused_template_item(present_state))) {
                    if (NIL != no_unused_template_itemsP(present_state)) {
                        complete_states = cons(process_perm_recursive(present_state), complete_states);
                    } else {
                        incomplete_states = cons(process_perm_recursive(present_state), incomplete_states);
                    }
                    search_past_startP = T;
                } else {
                    final SubLObject new_states = process_perm_non_recursive(present_state, search_past_startP);
                    search_past_startP = rtp_type_checkers.rtp_optional_template_itemP(rtp_perm_state_first_unused_template_item(present_state));
                    SubLObject cdolist_list_var = new_states;
                    SubLObject state = NIL;
                    state = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != no_unused_template_itemsP(state)) && (NIL != no_unused_wordsP(state))) {
                            complete_states = cons(state, complete_states);
                        } else
                            if (NIL == no_unused_template_itemsP(state)) {
                                incomplete_states = cons(state, incomplete_states);
                            }

                        cdolist_list_var = cdolist_list_var.rest();
                        state = cdolist_list_var.first();
                    } 
                }

        } 
        incomplete_states = complete_states;
        complete_states = NIL;
        SubLObject cdolist_list_var2 = incomplete_states;
        SubLObject present_state_$7 = NIL;
        present_state_$7 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            complete_states = cconcatenate(complete_states, rtp_compute_recursive_locations(present_state_$7, words, offset));
            cdolist_list_var2 = cdolist_list_var2.rest();
            present_state_$7 = cdolist_list_var2.first();
        } 
        SubLObject partial_parse = NIL;
        SubLObject cdolist_list_var = complete_states;
        SubLObject state = NIL;
        state = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = rtp_perm_state_matched(state);
            SubLObject match = NIL;
            match = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                partial_parse = cons(list(rtp_matched_constit_words(match), rtp_matched_constit_template(match), rtp_matched_constit_start(match), rtp_matched_constit_end(match)), partial_parse);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                match = cdolist_list_var_$8.first();
            } 
            result = cons(nreverse(partial_parse), result);
            partial_parse = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            state = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state;
     * 		
     * @param WORDS
     * 		list; the words for the entire sentence (as strings)
     * @param OFFSET
     * 		integer; the start index for WORDS
     * @return list; a list of rtp-perm-states wherein all constituents have locations.
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state;\r\n\t\t\r\n@param WORDS\r\n\t\tlist; the words for the entire sentence (as strings)\r\n@param OFFSET\r\n\t\tinteger; the start index for WORDS\r\n@return list; a list of rtp-perm-states wherein all constituents have locations.")
    public static final SubLObject rtp_compute_recursive_locations_alt(SubLObject state, SubLObject words, SubLObject offset) {
        {
            SubLObject start_index = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_start_index(state);
            SubLObject located_matches = com.cyc.cycjava.cycl.rtp.recognition.compute_matches(com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state), offset, NIL, words, offset);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = located_matches;
            SubLObject parse = NIL;
            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.rtp.recognition.make_rtp_perm_state(words, NIL, parse, start_index), result);
            }
            return result;
        }
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state;
     * 		
     * @param WORDS
     * 		list; the words for the entire sentence (as strings)
     * @param OFFSET
     * 		integer; the start index for WORDS
     * @return list; a list of rtp-perm-states wherein all constituents have locations.
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state;\r\n\t\t\r\n@param WORDS\r\n\t\tlist; the words for the entire sentence (as strings)\r\n@param OFFSET\r\n\t\tinteger; the start index for WORDS\r\n@return list; a list of rtp-perm-states wherein all constituents have locations.")
    public static SubLObject rtp_compute_recursive_locations(final SubLObject state, final SubLObject words, final SubLObject offset) {
        final SubLObject start_index = rtp_perm_state_start_index(state);
        final SubLObject located_matches = compute_matches(rtp_perm_state_matched(state), offset, NIL, words, offset);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = located_matches;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(make_rtp_perm_state(words, NIL, parse, start_index), result);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * do all the matches, and then check to make sure that they are reasonable. see @xref compute-matches-int for real work-horse
     */
    @LispMethod(comment = "do all the matches, and then check to make sure that they are reasonable. see @xref compute-matches-int for real work-horse")
    public static final SubLObject compute_matches_alt(SubLObject match_list, SubLObject start_index, SubLObject unmatched, SubLObject words, SubLObject offset) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.recognition.compute_matches_int(match_list, start_index, unmatched, words, offset);
            SubLObject match = NIL;
            for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.valid_constits_p(match, UNPROVIDED)) {
                    result = cons(reverse(match), result);
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "do all the matches, and then check to make sure that they are reasonable. see @xref compute-matches-int for real work-horse")
    public static SubLObject compute_matches(final SubLObject match_list, final SubLObject start_index, final SubLObject unmatched, final SubLObject words, final SubLObject offset) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = compute_matches_int(match_list, start_index, unmatched, words, offset);
        SubLObject match = NIL;
        match = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != valid_constits_p(match, UNPROVIDED)) {
                result = cons(reverse(match), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        } 
        return result;
    }/**
     * do all the matches, and then check to make sure that they are reasonable. see @xref compute-matches-int for real work-horse
     */


    public static final SubLObject valid_constits_p_alt(SubLObject matches, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject start = com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_end(matches.first());
                SubLObject failedP = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        if (NIL == failedP) {
                            {
                                SubLObject csome_list_var = matches;
                                SubLObject match = NIL;
                                for (match = csome_list_var.first(); !((NIL != failedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , match = csome_list_var.first()) {
                                    if (!(start.numE(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_end(match)) && (NIL != rtp_constituent_weeders.tp_possible_constitP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(match), com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_words(match), UNPROVIDED)))) {
                                        failedP = T;
                                    }
                                    start = com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_start(match);
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != failedP) {
                    return NIL;
                }
                return T;
            }
        }
    }

    public static SubLObject valid_constits_p(final SubLObject matches, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = rtp_matched_constit_end(matches.first());
        SubLObject failedP = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            if (NIL == failedP) {
                SubLObject csome_list_var = matches;
                SubLObject match = NIL;
                match = csome_list_var.first();
                while ((NIL == failedP) && (NIL != csome_list_var)) {
                    if ((!start.numE(rtp_matched_constit_end(match))) || (NIL == rtp_constituent_weeders.tp_possible_constitP(rtp_matched_constit_template(match), rtp_matched_constit_words(match), UNPROVIDED))) {
                        failedP = T;
                    }
                    start = rtp_matched_constit_start(match);
                    csome_list_var = csome_list_var.rest();
                    match = csome_list_var.first();
                } 
            }
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != failedP) {
            return NIL;
        }
        return T;
    }

    /**
     *
     *
     * @param MATCH-LIST
     * 		list, a list of rtp-matched-constits that may or may not yet have locations
     * @param START-INDEX
     * 		integer; the index of the end of the last constituent with a location
     * 		; already has the offset taken into account (e.g. it doesn't assume that (First words) is at 0)
     * @param UNMATCHED
     * 		list; a list of already-seen, but not-yet-located rtp-matched-constits
     * @param WORDS
     * 		list; the words that will be used in this call
     * @param OFFSET
    integer
     * 		
     */
    @LispMethod(comment = "@param MATCH-LIST\r\n\t\tlist, a list of rtp-matched-constits that may or may not yet have locations\r\n@param START-INDEX\r\n\t\tinteger; the index of the end of the last constituent with a location\r\n\t\t; already has the offset taken into account (e.g. it doesn\'t assume that (First words) is at 0)\r\n@param UNMATCHED\r\n\t\tlist; a list of already-seen, but not-yet-located rtp-matched-constits\r\n@param WORDS\r\n\t\tlist; the words that will be used in this call\r\n@param OFFSET\ninteger")
    public static final SubLObject compute_matches_int_alt(SubLObject match_list, SubLObject start_index, SubLObject unmatched, SubLObject words, SubLObject offset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_match = match_list.first();
                SubLObject other_matches = match_list.rest();
                SubLObject result = NIL;
                if (NIL == first_match) {
                    Errors.warn($str_alt86$call_to_compute_matches_with_an_e);
                }
                if (((NIL == other_matches) && (NIL == unmatched)) && (NIL == rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match)))) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond1));
                    }
                    result = list(list(first_match));
                } else {
                    if ((NIL == other_matches) && (NIL == rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match)))) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond2));
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.recognition.compute_constit_locations(start_index, com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_start(first_match), length(unmatched));
                            SubLObject parse = NIL;
                            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                {
                                    SubLObject temp_result = com.cyc.cycjava.cycl.rtp.recognition.build_located_matches(parse, unmatched, words, offset);
                                    temp_result = cons(first_match, temp_result);
                                    result = cons(temp_result, result);
                                }
                            }
                        }
                    } else {
                        if ((NIL == rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match))) && (NIL == unmatched)) {
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond6));
                            }
                            {
                                SubLObject temp_result = list(first_match);
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.recognition.compute_matches_int(other_matches, com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_end(first_match), NIL, words, offset);
                                SubLObject rest_parse = NIL;
                                for (rest_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rest_parse = cdolist_list_var.first()) {
                                    result = cons(cconcatenate(rest_parse, temp_result), result);
                                }
                            }
                        } else {
                            if (NIL == rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match))) {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond3));
                                }
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.recognition.compute_constit_locations(start_index, com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_start(first_match), length(unmatched));
                                    SubLObject parse = NIL;
                                    for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                        {
                                            SubLObject temp_result = com.cyc.cycjava.cycl.rtp.recognition.build_located_matches(parse, unmatched, words, offset);
                                            temp_result = cons(first_match, temp_result);
                                            {
                                                SubLObject cdolist_list_var_9 = com.cyc.cycjava.cycl.rtp.recognition.compute_matches_int(other_matches, com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_end(first_match), NIL, words, offset);
                                                SubLObject rest_parse = NIL;
                                                for (rest_parse = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , rest_parse = cdolist_list_var_9.first()) {
                                                    result = cons(cconcatenate(rest_parse, temp_result), result);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ((NIL != other_matches) && (NIL != rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match)))) {
                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond4));
                                    }
                                    result = com.cyc.cycjava.cycl.rtp.recognition.compute_matches_int(other_matches, start_index, list_utilities.snoc(first_match, unmatched), words, offset);
                                } else {
                                    if ((NIL == other_matches) && (NIL != rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(first_match)))) {
                                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$cond5));
                                        }
                                        unmatched = cconcatenate(unmatched, list(first_match));
                                        {
                                            SubLObject parses = com.cyc.cycjava.cycl.rtp.recognition.compute_constit_locations(start_index, add(offset, length(words)), length(unmatched));
                                            SubLObject cdolist_list_var = parses;
                                            SubLObject parse = NIL;
                                            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                                                result = cons(com.cyc.cycjava.cycl.rtp.recognition.build_located_matches(parse, unmatched, words, offset), result);
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
    }

    /**
     *
     *
     * @param MATCH-LIST
     * 		list, a list of rtp-matched-constits that may or may not yet have locations
     * @param START-INDEX
     * 		integer; the index of the end of the last constituent with a location
     * 		; already has the offset taken into account (e.g. it doesn't assume that (First words) is at 0)
     * @param UNMATCHED
     * 		list; a list of already-seen, but not-yet-located rtp-matched-constits
     * @param WORDS
     * 		list; the words that will be used in this call
     * @param OFFSET
    integer
     * 		
     */
    @LispMethod(comment = "@param MATCH-LIST\r\n\t\tlist, a list of rtp-matched-constits that may or may not yet have locations\r\n@param START-INDEX\r\n\t\tinteger; the index of the end of the last constituent with a location\r\n\t\t; already has the offset taken into account (e.g. it doesn\'t assume that (First words) is at 0)\r\n@param UNMATCHED\r\n\t\tlist; a list of already-seen, but not-yet-located rtp-matched-constits\r\n@param WORDS\r\n\t\tlist; the words that will be used in this call\r\n@param OFFSET\ninteger")
    public static SubLObject compute_matches_int(final SubLObject match_list, final SubLObject start_index, SubLObject unmatched, final SubLObject words, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_match = match_list.first();
        final SubLObject other_matches = match_list.rest();
        SubLObject result = NIL;
        if (NIL == first_match) {
            Errors.warn($str86$call_to_compute_matches_with_an_e);
        }
        if (((NIL == other_matches) && (NIL == unmatched)) && (NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match)))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($$$cond1));
            }
            result = list(list(first_match));
        } else
            if ((NIL == other_matches) && (NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match)))) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    rtp_tracer_output(ONE_INTEGER, list($$$cond2));
                }
                SubLObject cdolist_list_var = compute_constit_locations(start_index, rtp_matched_constit_start(first_match), length(unmatched));
                SubLObject parse = NIL;
                parse = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject temp_result = build_located_matches(parse, unmatched, words, offset);
                    temp_result = cons(first_match, temp_result);
                    result = cons(temp_result, result);
                    cdolist_list_var = cdolist_list_var.rest();
                    parse = cdolist_list_var.first();
                } 
            } else
                if ((NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) && (NIL == unmatched)) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($$$cond6));
                    }
                    final SubLObject temp_result2 = list(first_match);
                    SubLObject cdolist_list_var2 = compute_matches_int(other_matches, rtp_matched_constit_end(first_match), NIL, words, offset);
                    SubLObject rest_parse = NIL;
                    rest_parse = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        result = cons(cconcatenate(rest_parse, temp_result2), result);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        rest_parse = cdolist_list_var2.first();
                    } 
                } else
                    if (NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            rtp_tracer_output(ONE_INTEGER, list($$$cond3));
                        }
                        SubLObject cdolist_list_var = compute_constit_locations(start_index, rtp_matched_constit_start(first_match), length(unmatched));
                        SubLObject parse = NIL;
                        parse = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject temp_result = build_located_matches(parse, unmatched, words, offset);
                            temp_result = cons(first_match, temp_result);
                            SubLObject cdolist_list_var_$9 = compute_matches_int(other_matches, rtp_matched_constit_end(first_match), NIL, words, offset);
                            SubLObject rest_parse2 = NIL;
                            rest_parse2 = cdolist_list_var_$9.first();
                            while (NIL != cdolist_list_var_$9) {
                                result = cons(cconcatenate(rest_parse2, temp_result), result);
                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                rest_parse2 = cdolist_list_var_$9.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            parse = cdolist_list_var.first();
                        } 
                    } else
                        if ((NIL != other_matches) && (NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match)))) {
                            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                rtp_tracer_output(ONE_INTEGER, list($$$cond4));
                            }
                            result = compute_matches_int(other_matches, start_index, list_utilities.snoc(first_match, unmatched), words, offset);
                        } else
                            if ((NIL == other_matches) && (NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match)))) {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                    rtp_tracer_output(ONE_INTEGER, list($$$cond5));
                                }
                                unmatched = cconcatenate(unmatched, list(first_match));
                                SubLObject cdolist_list_var2;
                                final SubLObject parses = cdolist_list_var2 = compute_constit_locations(start_index, add(offset, length(words)), length(unmatched));
                                SubLObject parse2 = NIL;
                                parse2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    result = cons(build_located_matches(parse2, unmatched, words, offset), result);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    parse2 = cdolist_list_var2.first();
                                } 
                            }





        return result;
    }

    /**
     *
     *
     * @param PARSE
     * 		list; a list of two-element lists, where each sublist represents the
     * 		location of a particular constituent
     * @param UNMATCHED
     * 		list; a list of unlocated RTP-MATCHED-CONSTITS
     * @param WORDS
     * 		list; a list of the words (as strings) used in the sentence
     * @return list; a list of RTP-MATCHED-CONSTITS with their locations and words added in
     */
    @LispMethod(comment = "@param PARSE\r\n\t\tlist; a list of two-element lists, where each sublist represents the\r\n\t\tlocation of a particular constituent\r\n@param UNMATCHED\r\n\t\tlist; a list of unlocated RTP-MATCHED-CONSTITS\r\n@param WORDS\r\n\t\tlist; a list of the words (as strings) used in the sentence\r\n@return list; a list of RTP-MATCHED-CONSTITS with their locations and words added in")
    public static final SubLObject build_located_matches_alt(SubLObject parse, SubLObject unlocated, SubLObject words, SubLObject offset) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = parse;
            SubLObject constit = NIL;
            for (constit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constit = cdolist_list_var.first()) {
                result = cons(com.cyc.cycjava.cycl.rtp.recognition.make_rtp_matched_constit(subseq(words, subtract(constit.first(), offset), subtract(second(constit), offset)), com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(unlocated.first()), constit.first(), second(constit)), result);
                unlocated = unlocated.rest();
            }
            return result;
        }
    }

    /**
     *
     *
     * @param PARSE
     * 		list; a list of two-element lists, where each sublist represents the
     * 		location of a particular constituent
     * @param UNMATCHED
     * 		list; a list of unlocated RTP-MATCHED-CONSTITS
     * @param WORDS
     * 		list; a list of the words (as strings) used in the sentence
     * @return list; a list of RTP-MATCHED-CONSTITS with their locations and words added in
     */
    @LispMethod(comment = "@param PARSE\r\n\t\tlist; a list of two-element lists, where each sublist represents the\r\n\t\tlocation of a particular constituent\r\n@param UNMATCHED\r\n\t\tlist; a list of unlocated RTP-MATCHED-CONSTITS\r\n@param WORDS\r\n\t\tlist; a list of the words (as strings) used in the sentence\r\n@return list; a list of RTP-MATCHED-CONSTITS with their locations and words added in")
    public static SubLObject build_located_matches(final SubLObject parse, SubLObject unlocated, final SubLObject words, final SubLObject offset) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = parse;
        SubLObject constit = NIL;
        constit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(make_rtp_matched_constit(subseq(words, subtract(constit.first(), offset), subtract(second(constit), offset)), rtp_matched_constit_template(unlocated.first()), constit.first(), second(constit)), result);
            unlocated = unlocated.rest();
            cdolist_list_var = cdolist_list_var.rest();
            constit = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * Given START and END, determine all the possible ways of combining the numbers between
     * them into CONSTIT-COUNT groups
     *
     * @param START
    integer
     * 		
     * @param END
    integer
     * 		
     * @param CONSTIT-COUNT
    integer
     * 		
     * @return list; a list of lists of pairs, where each list corresponds to a parse,
    and each pair is the start and end positions of a particular constituent
     */
    @LispMethod(comment = "Given START and END, determine all the possible ways of combining the numbers between\r\nthem into CONSTIT-COUNT groups\r\n\r\n@param START\ninteger\r\n\t\t\r\n@param END\ninteger\r\n\t\t\r\n@param CONSTIT-COUNT\ninteger\r\n\t\t\r\n@return list; a list of lists of pairs, where each list corresponds to a parse,\r\nand each pair is the start and end positions of a particular constituent\nGiven START and END, determine all the possible ways of combining the numbers between\nthem into CONSTIT-COUNT groups")
    public static final SubLObject compute_constit_locations_alt(SubLObject start, SubLObject end, SubLObject constit_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (ONE_INTEGER.numG(constit_count)) {
                return NIL;
            }
            if (!end.numG(start)) {
                return NIL;
            }
            {
                SubLObject result = NIL;
                if (constit_count.numE(ONE_INTEGER)) {
                    return list(list(list(start, end)));
                }
                {
                    SubLObject cdotimes_end_var = add(ONE_INTEGER, subtract(end, start, constit_count));
                    SubLObject x = NIL;
                    for (x = ZERO_INTEGER; x.numL(cdotimes_end_var); x = add(x, ONE_INTEGER)) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str_alt93$x____S__, x)));
                        }
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.recognition.compute_constit_locations(add(start, x, ONE_INTEGER), end, subtract(constit_count, ONE_INTEGER));
                            SubLObject v_answer = NIL;
                            for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                                result = cons(cons(list(start, add(start, x, ONE_INTEGER)), v_answer), result);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Given START and END, determine all the possible ways of combining the numbers between\r\nthem into CONSTIT-COUNT groups\r\n\r\n@param START\n\t\tinteger\r\n\t\t\r\n@param END\n\t\tinteger\r\n\t\t\r\n@param CONSTIT-COUNT\n\t\tinteger\r\n\t\t\r\n@return list; a list of lists of pairs, where each list corresponds to a parse,\r\nand each pair is the start and end positions of a particular constituent\nGiven START and END, determine all the possible ways of combining the numbers between\nthem into CONSTIT-COUNT groups")
    public static SubLObject compute_constit_locations(final SubLObject start, final SubLObject end, final SubLObject constit_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ONE_INTEGER.numG(constit_count)) {
            return NIL;
        }
        if (!end.numG(start)) {
            return NIL;
        }
        SubLObject result = NIL;
        if (constit_count.numE(ONE_INTEGER)) {
            return list(list(list(start, end)));
        }
        SubLObject cdotimes_end_var;
        SubLObject x;
        SubLObject cdolist_list_var;
        SubLObject v_answer;
        for (cdotimes_end_var = add(ONE_INTEGER, subtract(end, start, constit_count)), x = NIL, x = ZERO_INTEGER; x.numL(cdotimes_end_var); x = add(x, ONE_INTEGER)) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str93$x____S__, x)));
            }
            cdolist_list_var = compute_constit_locations(add(start, x, ONE_INTEGER), end, subtract(constit_count, ONE_INTEGER));
            v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(cons(list(start, add(start, x, ONE_INTEGER)), v_answer), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            } 
        }
        return result;
    }/**
     * Given START and END, determine all the possible ways of combining the numbers between
     * them into CONSTIT-COUNT groups
     *
     * @param START
    		integer
     * 		
     * @param END
    		integer
     * 		
     * @param CONSTIT-COUNT
    		integer
     * 		
     * @return list; a list of lists of pairs, where each list corresponds to a parse,
    and each pair is the start and end positions of a particular constituent
     */


    /**
     * given a state, determine whether or not the next template item in the state can be matched to
     * the words that are left.  If no match can be found, return nil.  Otherwise, return a list of
     * new states with the template item in question and the matched words moved to the matched part
     * of the state
     *
     * @param SEARCH-PAST-START?
     * 		boolean; should the search cease once the first word has been checked?
     * @return list; a list of rtp-perm-states
     */
    @LispMethod(comment = "given a state, determine whether or not the next template item in the state can be matched to\r\nthe words that are left.  If no match can be found, return nil.  Otherwise, return a list of\r\nnew states with the template item in question and the matched words moved to the matched part\r\nof the state\r\n\r\n@param SEARCH-PAST-START?\r\n\t\tboolean; should the search cease once the first word has been checked?\r\n@return list; a list of rtp-perm-states\ngiven a state, determine whether or not the next template item in the state can be matched to\nthe words that are left.  If no match can be found, return nil.  Otherwise, return a list of\nnew states with the template item in question and the matched words moved to the matched part\nof the state")
    public static final SubLObject process_perm_non_recursive_alt(SubLObject state, SubLObject search_past_startP) {
        {
            SubLObject template_item = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_first_unused_template_item(state);
            SubLObject words = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_words(state);
            SubLObject index = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_start_index(state);
            SubLObject found_matches = com.cyc.cycjava.cycl.rtp.recognition.find_rtp_matches(template_item, words, index, search_past_startP);
            SubLObject new_match = NIL;
            SubLObject iter_result = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = found_matches;
            SubLObject match = NIL;
            for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                new_match = com.cyc.cycjava.cycl.rtp.recognition.make_rtp_matched_constit(subseq(words, subtract(match.first(), index), subtract(second(match), index)), template_item, match.first(), second(match));
                iter_result = com.cyc.cycjava.cycl.rtp.recognition.make_rtp_perm_state(subseq(words, subtract(second(match), index), UNPROVIDED), com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_template(state).rest(), list_utilities.snoc(new_match, com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state)), second(match));
                result = cons(iter_result, result);
            }
            if ((NIL == result) && (NIL != rtp_type_checkers.rtp_optional_template_itemP(template_item))) {
                return list(com.cyc.cycjava.cycl.rtp.recognition.make_rtp_perm_state(words, com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_template(state).rest(), com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state), com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_start_index(state)));
            }
            return result;
        }
    }

    @LispMethod(comment = "given a state, determine whether or not the next template item in the state can be matched to\r\nthe words that are left.  If no match can be found, return nil.  Otherwise, return a list of\r\nnew states with the template item in question and the matched words moved to the matched part\r\nof the state\r\n\r\n@param SEARCH-PAST-START?\r\n\t\tboolean; should the search cease once the first word has been checked?\r\n@return list; a list of rtp-perm-states\ngiven a state, determine whether or not the next template item in the state can be matched to\nthe words that are left.  If no match can be found, return nil.  Otherwise, return a list of\nnew states with the template item in question and the matched words moved to the matched part\nof the state")
    public static SubLObject process_perm_non_recursive(final SubLObject state, final SubLObject search_past_startP) {
        final SubLObject template_item = rtp_perm_state_first_unused_template_item(state);
        final SubLObject words = rtp_perm_state_unused_words(state);
        final SubLObject index = rtp_perm_state_start_index(state);
        final SubLObject found_matches = find_rtp_matches(template_item, words, index, search_past_startP);
        SubLObject new_match = NIL;
        SubLObject iter_result = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = found_matches;
        SubLObject match = NIL;
        match = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_match = make_rtp_matched_constit(subseq(words, subtract(match.first(), index), subtract(second(match), index)), template_item, match.first(), second(match));
            iter_result = make_rtp_perm_state(subseq(words, subtract(second(match), index), UNPROVIDED), rtp_perm_state_unused_template(state).rest(), list_utilities.snoc(new_match, rtp_perm_state_matched(state)), second(match));
            result = cons(iter_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        } 
        if ((NIL == result) && (NIL != rtp_type_checkers.rtp_optional_template_itemP(template_item))) {
            return list(make_rtp_perm_state(words, rtp_perm_state_unused_template(state).rest(), rtp_perm_state_matched(state), rtp_perm_state_start_index(state)));
        }
        return result;
    }/**
     * given a state, determine whether or not the next template item in the state can be matched to
     * the words that are left.  If no match can be found, return nil.  Otherwise, return a list of
     * new states with the template item in question and the matched words moved to the matched part
     * of the state
     *
     * @param SEARCH-PAST-START?
     * 		boolean; should the search cease once the first word has been checked?
     * @return list; a list of rtp-perm-states
     */


    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		rtp-template-item; not a recursive template item
     * @param WORDS
     * 		list; a list of words
     * @param INDEX
     * 		integer; the index of the first word in words
     * @param SEARCH-PAST-START?
     * 		boolean; should the search cease once the first word has been checked?
     * @return list; a list of index-pairs for the words that template-item matches
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\trtp-template-item; not a recursive template item\r\n@param WORDS\r\n\t\tlist; a list of words\r\n@param INDEX\r\n\t\tinteger; the index of the first word in words\r\n@param SEARCH-PAST-START?\r\n\t\tboolean; should the search cease once the first word has been checked?\r\n@return list; a list of index-pairs for the words that template-item matches")
    public static final SubLObject find_rtp_matches_alt(SubLObject template_item, SubLObject words, SubLObject index, SubLObject search_past_startP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intermed_words = words;
                SubLObject intermed_start = index;
                SubLObject result = NIL;
                if (NIL != rtp_type_checkers.optional_template_item(template_item)) {
                    while (NIL != intermed_words) {
                        {
                            SubLObject intermed_end = add(intermed_start, length(intermed_words));
                            SubLObject temp_result = com.cyc.cycjava.cycl.rtp.recognition.remove_optional_strings(template_item, list(intermed_words, intermed_start, intermed_end), UNPROVIDED);
                            SubLObject cdolist_list_var = temp_result;
                            SubLObject temp = NIL;
                            for (temp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , temp = cdolist_list_var.first()) {
                                if (!intermed_words.equalp(temp.first())) {
                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str_alt94$intermed_words____S__first_first_, intermed_words, temp.first())));
                                    }
                                    result = cons(list(intermed_start, add(intermed_start, subtract(intermed_end, third(temp)))), result);
                                }
                            }
                            if (NIL == search_past_startP) {
                                return result;
                            }
                            intermed_words = intermed_words.rest();
                            intermed_start = add(intermed_start, ONE_INTEGER);
                        }
                    } 
                } else {
                    if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
                        Errors.warn($str_alt95$sent_an_unexpanded_item___S__to_f, template_item);
                        while (NIL != intermed_words) {
                            if (NIL != com.cyc.cycjava.cycl.rtp.recognition.tp_match_wordXpos_wXwords(template_item, intermed_words)) {
                                result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                            }
                            if (NIL == search_past_startP) {
                                return result;
                            }
                            intermed_words = intermed_words.rest();
                            intermed_start = add(intermed_start, ONE_INTEGER);
                        } 
                    } else {
                        if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
                            while (NIL != intermed_words) {
                                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.tp_match_pred(template_item, intermed_words.first())) {
                                    result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                                }
                                if (NIL == search_past_startP) {
                                    return result;
                                }
                                intermed_words = intermed_words.rest();
                                intermed_start = add(intermed_start, ONE_INTEGER);
                            } 
                        } else {
                            if (NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
                                while (NIL != intermed_words) {
                                    if (NIL != com.cyc.cycjava.cycl.rtp.recognition.tp_match_pos(template_item, intermed_words)) {
                                        result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                                    }
                                    if (NIL == search_past_startP) {
                                        return result;
                                    }
                                    intermed_words = intermed_words.rest();
                                    intermed_start = add(intermed_start, ONE_INTEGER);
                                } 
                            } else {
                                Errors.warn($str_alt96$sent_invalid_item__S_to_find_rtp_, template_item);
                                result = NIL;
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		rtp-template-item; not a recursive template item
     * @param WORDS
     * 		list; a list of words
     * @param INDEX
     * 		integer; the index of the first word in words
     * @param SEARCH-PAST-START?
     * 		boolean; should the search cease once the first word has been checked?
     * @return list; a list of index-pairs for the words that template-item matches
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\trtp-template-item; not a recursive template item\r\n@param WORDS\r\n\t\tlist; a list of words\r\n@param INDEX\r\n\t\tinteger; the index of the first word in words\r\n@param SEARCH-PAST-START?\r\n\t\tboolean; should the search cease once the first word has been checked?\r\n@return list; a list of index-pairs for the words that template-item matches")
    public static SubLObject find_rtp_matches(final SubLObject template_item, final SubLObject words, final SubLObject index, final SubLObject search_past_startP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject intermed_words = words;
        SubLObject intermed_start = index;
        SubLObject result = NIL;
        if (NIL != rtp_type_checkers.optional_template_item(template_item)) {
            while (NIL != intermed_words) {
                final SubLObject intermed_end = add(intermed_start, length(intermed_words));
                SubLObject cdolist_list_var;
                final SubLObject temp_result = cdolist_list_var = remove_optional_strings(template_item, list(intermed_words, intermed_start, intermed_end), UNPROVIDED);
                SubLObject temp = NIL;
                temp = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!intermed_words.equalp(temp.first())) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            rtp_tracer_output(ONE_INTEGER, list(format(NIL, $str94$intermed_words____S__first_first_, intermed_words, temp.first())));
                        }
                        result = cons(list(intermed_start, add(intermed_start, subtract(intermed_end, third(temp)))), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    temp = cdolist_list_var.first();
                } 
                if (NIL == search_past_startP) {
                    return result;
                }
                intermed_words = intermed_words.rest();
                intermed_start = add(intermed_start, ONE_INTEGER);
            } 
        } else
            if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
                Errors.warn($str95$sent_an_unexpanded_item___S__to_f, template_item);
                while (NIL != intermed_words) {
                    if (NIL != tp_match_wordXpos_wXwords(template_item, intermed_words)) {
                        result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                    }
                    if (NIL == search_past_startP) {
                        return result;
                    }
                    intermed_words = intermed_words.rest();
                    intermed_start = add(intermed_start, ONE_INTEGER);
                } 
            } else
                if (NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
                    while (NIL != intermed_words) {
                        if (NIL != tp_match_pred(template_item, intermed_words.first())) {
                            result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                        }
                        if (NIL == search_past_startP) {
                            return result;
                        }
                        intermed_words = intermed_words.rest();
                        intermed_start = add(intermed_start, ONE_INTEGER);
                    } 
                } else
                    if (NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
                        while (NIL != intermed_words) {
                            if (NIL != tp_match_pos(template_item, intermed_words)) {
                                result = cons(list(intermed_start, add(ONE_INTEGER, intermed_start)), result);
                            }
                            if (NIL == search_past_startP) {
                                return result;
                            }
                            intermed_words = intermed_words.rest();
                            intermed_start = add(intermed_start, ONE_INTEGER);
                        } 
                    } else {
                        Errors.warn($str96$sent_invalid_item__S_to_find_rtp_, template_item);
                        result = NIL;
                    }



        return result;
    }

    public static final SubLObject process_perm_recursive_alt(SubLObject state) {
        {
            SubLObject this_item = com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_first_unused_template_item(state);
            com.cyc.cycjava.cycl.rtp.recognition.push_to_end_rtp_matched_constit(state, com.cyc.cycjava.cycl.rtp.recognition.make_unlocated_rtp_matched_constit(this_item));
            if (NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(state)) {
                com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_unused_words(state, $completed_words_list$.getGlobalValue());
            }
            com.cyc.cycjava.cycl.rtp.recognition.pop_rtp_perm_state_unused_template(state);
            return state;
        }
    }

    public static SubLObject process_perm_recursive(final SubLObject state) {
        final SubLObject this_item = rtp_perm_state_first_unused_template_item(state);
        push_to_end_rtp_matched_constit(state, make_unlocated_rtp_matched_constit(this_item));
        if (NIL != no_unused_template_itemsP(state)) {
            set_rtp_perm_state_unused_words(state, $completed_words_list$.getGlobalValue());
        }
        pop_rtp_perm_state_unused_template(state);
        return state;
    }

    public static final SubLObject new_rtp_perm_state_alt() {
        return make_vector(FOUR_INTEGER, UNPROVIDED);
    }

    public static SubLObject new_rtp_perm_state() {
        return make_vector(FOUR_INTEGER, UNPROVIDED);
    }

    /**
     *
     *
     * @param WORDS
     * 		list; a list of strings
     * @param TEMPLATE
     * 		list; a list of rtp-template-items
     * @param MATCHES
     * 		list; a list of rtp-matched-constits
     * @param START
     * 		integer; the sentence-relative index of the initial string in WORDS
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlist; a list of strings\r\n@param TEMPLATE\r\n\t\tlist; a list of rtp-template-items\r\n@param MATCHES\r\n\t\tlist; a list of rtp-matched-constits\r\n@param START\r\n\t\tinteger; the sentence-relative index of the initial string in WORDS")
    public static final SubLObject make_rtp_perm_state_alt(SubLObject words, SubLObject template, SubLObject matches, SubLObject start) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.recognition.new_rtp_perm_state();
            com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_unused_words(result, words);
            com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_unused_template(result, template);
            com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_matched(result, matches);
            com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_start_index(result, start);
            return result;
        }
    }

    /**
     *
     *
     * @param WORDS
     * 		list; a list of strings
     * @param TEMPLATE
     * 		list; a list of rtp-template-items
     * @param MATCHES
     * 		list; a list of rtp-matched-constits
     * @param START
     * 		integer; the sentence-relative index of the initial string in WORDS
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlist; a list of strings\r\n@param TEMPLATE\r\n\t\tlist; a list of rtp-template-items\r\n@param MATCHES\r\n\t\tlist; a list of rtp-matched-constits\r\n@param START\r\n\t\tinteger; the sentence-relative index of the initial string in WORDS")
    public static SubLObject make_rtp_perm_state(final SubLObject words, final SubLObject template, final SubLObject matches, final SubLObject start) {
        final SubLObject result = new_rtp_perm_state();
        set_rtp_perm_state_unused_words(result, words);
        set_rtp_perm_state_unused_template(result, template);
        set_rtp_perm_state_matched(result, matches);
        set_rtp_perm_state_start_index(result, start);
        return result;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_unused_words_alt(SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_unused_words(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static final SubLObject set_rtp_perm_state_unused_words_alt(SubLObject state, SubLObject words) {
        set_aref(state, ZERO_INTEGER, words);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static SubLObject set_rtp_perm_state_unused_words(final SubLObject state, final SubLObject words) {
        set_aref(state, ZERO_INTEGER, words);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject pop_rtp_perm_state_unused_words_alt(SubLObject state) {
        com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_unused_words(state, com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_words(state).rest());
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject pop_rtp_perm_state_unused_words(final SubLObject state) {
        set_rtp_perm_state_unused_words(state, rtp_perm_state_unused_words(state).rest());
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_unused_template_alt(SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_unused_template(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject pop_rtp_perm_state_unused_template_alt(SubLObject state) {
        com.cyc.cycjava.cycl.rtp.recognition.set_rtp_perm_state_unused_template(state, com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_template(state).rest());
        return com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_template(state);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject pop_rtp_perm_state_unused_template(final SubLObject state) {
        set_rtp_perm_state_unused_template(state, rtp_perm_state_unused_template(state).rest());
        return rtp_perm_state_unused_template(state);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param TEMPLATE
     * 		list; a list of rtp-template-items
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param TEMPLATE\r\n\t\tlist; a list of rtp-template-items")
    public static final SubLObject set_rtp_perm_state_unused_template_alt(SubLObject state, SubLObject template) {
        set_aref(state, ONE_INTEGER, template);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param TEMPLATE
     * 		list; a list of rtp-template-items
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param TEMPLATE\r\n\t\tlist; a list of rtp-template-items")
    public static SubLObject set_rtp_perm_state_unused_template(final SubLObject state, final SubLObject template) {
        set_aref(state, ONE_INTEGER, template);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_first_unused_template_item_alt(SubLObject state) {
        return aref(state, ONE_INTEGER).first();
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_first_unused_template_item(final SubLObject state) {
        return aref(state, ONE_INTEGER).first();
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param MATCHED
     * 		list; a list of rtp-perm-states
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param MATCHED\r\n\t\tlist; a list of rtp-perm-states")
    public static final SubLObject set_rtp_perm_state_matched_alt(SubLObject state, SubLObject matched) {
        set_aref(state, TWO_INTEGER, matched);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param MATCHED
     * 		list; a list of rtp-perm-states
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param MATCHED\r\n\t\tlist; a list of rtp-perm-states")
    public static SubLObject set_rtp_perm_state_matched(final SubLObject state, final SubLObject matched) {
        set_aref(state, TWO_INTEGER, matched);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_matched_alt(SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_matched(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param CONSTIT
    rtp-template-item
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param CONSTIT\nrtp-template-item")
    public static final SubLObject push_to_end_rtp_matched_constit_alt(SubLObject state, SubLObject constit) {
        set_aref(state, TWO_INTEGER, list_utilities.snoc(constit, com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state)));
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param CONSTIT
    rtp-template-item
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param CONSTIT\nrtp-template-item")
    public static SubLObject push_to_end_rtp_matched_constit(final SubLObject state, final SubLObject constit) {
        set_aref(state, TWO_INTEGER, list_utilities.snoc(constit, rtp_perm_state_matched(state)));
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_start_index_alt(SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_start_index(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param INDEX
    integer
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param INDEX\ninteger")
    public static final SubLObject set_rtp_perm_state_start_index_alt(SubLObject state, SubLObject index) {
        set_aref(state, THREE_INTEGER, index);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     * @param INDEX
    integer
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state\r\n\t\t\r\n@param INDEX\ninteger")
    public static SubLObject set_rtp_perm_state_start_index(final SubLObject state, final SubLObject index) {
        set_aref(state, THREE_INTEGER, index);
        return state;
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject rtp_perm_state_completeP_alt(SubLObject state) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_wordsP(state)) && (NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(state))) || ((NIL != com.cyc.cycjava.cycl.rtp.recognition.no_unused_template_itemsP(state)) && (NIL != rtp_type_checkers.rtp_recursive_itemP(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_template(last(com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_matched(state), UNPROVIDED).first())))));
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject rtp_perm_state_completeP(final SubLObject state) {
        return makeBoolean(((NIL != no_unused_wordsP(state)) && (NIL != no_unused_template_itemsP(state))) || ((NIL != no_unused_template_itemsP(state)) && (NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(last(rtp_perm_state_matched(state), UNPROVIDED).first())))));
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject no_unused_wordsP_alt(SubLObject state) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_words(state));
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject no_unused_wordsP(final SubLObject state) {
        return makeBoolean(NIL == rtp_perm_state_unused_words(state));
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static final SubLObject no_unused_template_itemsP_alt(SubLObject state) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.rtp.recognition.rtp_perm_state_unused_template(state));
    }

    /**
     *
     *
     * @param STATE
    rtp-perm-state
     * 		
     */
    @LispMethod(comment = "@param STATE\nrtp-perm-state")
    public static SubLObject no_unused_template_itemsP(final SubLObject state) {
        return makeBoolean(NIL == rtp_perm_state_unused_template(state));
    }

    /**
     * an rtp-matched-item that doesn't yet have a location (e.g. a recursive item for which the location can only be determined after everything else has been positively located)
     *
     * @param TEMPLATE
     * 		list/string; an rtp template-item
     * @return rtp-matched-constit
     */
    @LispMethod(comment = "an rtp-matched-item that doesn\'t yet have a location (e.g. a recursive item for which the location can only be determined after everything else has been positively located)\r\n\r\n@param TEMPLATE\r\n\t\tlist/string; an rtp template-item\r\n@return rtp-matched-constit")
    public static final SubLObject make_unlocated_rtp_matched_constit_alt(SubLObject template) {
        return com.cyc.cycjava.cycl.rtp.recognition.make_rtp_matched_constit($UNLOCATED, template, NIL, NIL);
    }

    @LispMethod(comment = "an rtp-matched-item that doesn\'t yet have a location (e.g. a recursive item for which the location can only be determined after everything else has been positively located)\r\n\r\n@param TEMPLATE\r\n\t\tlist/string; an rtp template-item\r\n@return rtp-matched-constit")
    public static SubLObject make_unlocated_rtp_matched_constit(final SubLObject template) {
        return make_rtp_matched_constit($UNLOCATED, template, NIL, NIL);
    }/**
     * an rtp-matched-item that doesn't yet have a location (e.g. a recursive item for which the location can only be determined after everything else has been positively located)
     *
     * @param TEMPLATE
     * 		list/string; an rtp template-item
     * @return rtp-matched-constit
     */


    /**
     *
     *
     * @param MATCH
    rtp-matched-constit
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param MATCH\nrtp-matched-constit\r\n\t\t\r\n@return boolean")
    public static final SubLObject unlocated_rtp_matched_constitP_alt(SubLObject match) {
        return eq(com.cyc.cycjava.cycl.rtp.recognition.rtp_matched_constit_words(match), $UNLOCATED);
    }

    /**
     *
     *
     * @param MATCH
    rtp-matched-constit
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param MATCH\nrtp-matched-constit\r\n\t\t\r\n@return boolean")
    public static SubLObject unlocated_rtp_matched_constitP(final SubLObject match) {
        return eq(rtp_matched_constit_words(match), $UNLOCATED);
    }

    /**
     * a data structure intended to keep track of words that have matched a particular template item
     *
     * @param WORDS
     * 		list; a list of strings that the constit matches
     * @param TEMPLATE
     * 		list/string; an rtp-template-item
     * @param START
     * 		integer; the sentence-relative index of the first element of WORDS
     * @param END
     * 		integer; the sentence-relative index of the last element of WORDS
     * @return rtp-matched-constit
     */
    @LispMethod(comment = "a data structure intended to keep track of words that have matched a particular template item\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings that the constit matches\r\n@param TEMPLATE\r\n\t\tlist/string; an rtp-template-item\r\n@param START\r\n\t\tinteger; the sentence-relative index of the first element of WORDS\r\n@param END\r\n\t\tinteger; the sentence-relative index of the last element of WORDS\r\n@return rtp-matched-constit")
    public static final SubLObject make_rtp_matched_constit_alt(SubLObject words, SubLObject template, SubLObject start, SubLObject end) {
        {
            SubLObject result = make_vector(FOUR_INTEGER, UNPROVIDED);
            set_aref(result, ZERO_INTEGER, words);
            set_aref(result, ONE_INTEGER, template);
            set_aref(result, TWO_INTEGER, start);
            set_aref(result, THREE_INTEGER, end);
            return result;
        }
    }

    @LispMethod(comment = "a data structure intended to keep track of words that have matched a particular template item\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings that the constit matches\r\n@param TEMPLATE\r\n\t\tlist/string; an rtp-template-item\r\n@param START\r\n\t\tinteger; the sentence-relative index of the first element of WORDS\r\n@param END\r\n\t\tinteger; the sentence-relative index of the last element of WORDS\r\n@return rtp-matched-constit")
    public static SubLObject make_rtp_matched_constit(final SubLObject words, final SubLObject template, final SubLObject start, final SubLObject end) {
        final SubLObject result = make_vector(FOUR_INTEGER, UNPROVIDED);
        set_aref(result, ZERO_INTEGER, words);
        set_aref(result, ONE_INTEGER, template);
        set_aref(result, TWO_INTEGER, start);
        set_aref(result, THREE_INTEGER, end);
        return result;
    }/**
     * a data structure intended to keep track of words that have matched a particular template item
     *
     * @param WORDS
     * 		list; a list of strings that the constit matches
     * @param TEMPLATE
     * 		list/string; an rtp-template-item
     * @param START
     * 		integer; the sentence-relative index of the first element of WORDS
     * @param END
     * 		integer; the sentence-relative index of the last element of WORDS
     * @return rtp-matched-constit
     */


    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static final SubLObject rtp_matched_constit_words_alt(SubLObject constit) {
        return aref(constit, ZERO_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static SubLObject rtp_matched_constit_words(final SubLObject constit) {
        return aref(constit, ZERO_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static final SubLObject set_rtp_matched_constit_words_alt(SubLObject constit, SubLObject words) {
        set_aref(constit, ZERO_INTEGER, words);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static SubLObject set_rtp_matched_constit_words(final SubLObject constit, final SubLObject words) {
        set_aref(constit, ZERO_INTEGER, words);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static final SubLObject rtp_matched_constit_template_alt(SubLObject constit) {
        return aref(constit, ONE_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static SubLObject rtp_matched_constit_template(final SubLObject constit) {
        return aref(constit, ONE_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param TEMPLATE
    rtp-template-item
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param TEMPLATE\nrtp-template-item")
    public static final SubLObject set_rtp_matched_constit_template_alt(SubLObject constit, SubLObject template) {
        set_aref(constit, ONE_INTEGER, template);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param TEMPLATE
    rtp-template-item
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param TEMPLATE\nrtp-template-item")
    public static SubLObject set_rtp_matched_constit_template(final SubLObject constit, final SubLObject template) {
        set_aref(constit, ONE_INTEGER, template);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static final SubLObject rtp_matched_constit_start_alt(SubLObject constit) {
        return aref(constit, TWO_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static SubLObject rtp_matched_constit_start(final SubLObject constit) {
        return aref(constit, TWO_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param START
    integer
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param START\ninteger")
    public static final SubLObject set_rtp_matched_constit_start_alt(SubLObject constit, SubLObject start) {
        set_aref(constit, TWO_INTEGER, start);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param START
    integer
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param START\ninteger")
    public static SubLObject set_rtp_matched_constit_start(final SubLObject constit, final SubLObject start) {
        set_aref(constit, TWO_INTEGER, start);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static final SubLObject rtp_matched_constit_end_alt(SubLObject constit) {
        return aref(constit, THREE_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit")
    public static SubLObject rtp_matched_constit_end(final SubLObject constit) {
        return aref(constit, THREE_INTEGER);
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param END
    integer
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param END\ninteger")
    public static final SubLObject set_rtp_matched_constit_end_alt(SubLObject constit, SubLObject end) {
        set_aref(constit, THREE_INTEGER, end);
        return constit;
    }

    /**
     *
     *
     * @param CONSTIT
    rtp-matched-constit
     * 		
     * @param END
    integer
     * 		
     */
    @LispMethod(comment = "@param CONSTIT\nrtp-matched-constit\r\n\t\t\r\n@param END\ninteger")
    public static SubLObject set_rtp_matched_constit_end(final SubLObject constit, final SubLObject end) {
        set_aref(constit, THREE_INTEGER, end);
        return constit;
    }

    /**
     * given a list of STRING-LISTS and a TEMPLATE, return a list of lists,
     * each of which contains a reversed string-list, a reversed version
     * of TEMPLATE, the original string, and the start and end indexes for
     * the string (the indices aren't reversed or anything else)
     *
     * @param STRING-LISTS
     * 		list; a list of lists, each of which contains a
     * 		list of strings, the start of the string, and the end index of the string
     * @param TEMPLATE
     * 		list; a template (not the entire rule, just the template)
     * @return list; described above
     */
    @LispMethod(comment = "given a list of STRING-LISTS and a TEMPLATE, return a list of lists,\r\neach of which contains a reversed string-list, a reversed version\r\nof TEMPLATE, the original string, and the start and end indexes for\r\nthe string (the indices aren\'t reversed or anything else)\r\n\r\n@param STRING-LISTS\r\n\t\tlist; a list of lists, each of which contains a\r\n\t\tlist of strings, the start of the string, and the end index of the string\r\n@param TEMPLATE\r\n\t\tlist; a template (not the entire rule, just the template)\r\n@return list; described above\ngiven a list of STRING-LISTS and a TEMPLATE, return a list of lists,\neach of which contains a reversed string-list, a reversed version\nof TEMPLATE, the original string, and the start and end indexes for\nthe string (the indices aren\'t reversed or anything else)")
    public static final SubLObject reverse_and_add_template_alt(SubLObject string_lists, SubLObject template) {
        {
            SubLObject rev_template = reverse(template);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = string_lists;
            SubLObject string_list = NIL;
            for (string_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string_list = cdolist_list_var.first()) {
                result = cons(list(reverse(string_list.first()), rev_template, string_list, second(string_list), third(string_list)), result);
            }
            return result;
        }
    }

    @LispMethod(comment = "given a list of STRING-LISTS and a TEMPLATE, return a list of lists,\r\neach of which contains a reversed string-list, a reversed version\r\nof TEMPLATE, the original string, and the start and end indexes for\r\nthe string (the indices aren\'t reversed or anything else)\r\n\r\n@param STRING-LISTS\r\n\t\tlist; a list of lists, each of which contains a\r\n\t\tlist of strings, the start of the string, and the end index of the string\r\n@param TEMPLATE\r\n\t\tlist; a template (not the entire rule, just the template)\r\n@return list; described above\ngiven a list of STRING-LISTS and a TEMPLATE, return a list of lists,\neach of which contains a reversed string-list, a reversed version\nof TEMPLATE, the original string, and the start and end indexes for\nthe string (the indices aren\'t reversed or anything else)")
    public static SubLObject reverse_and_add_template(final SubLObject string_lists, final SubLObject template) {
        final SubLObject rev_template = reverse(template);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = string_lists;
        SubLObject string_list = NIL;
        string_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(reverse(string_list.first()), rev_template, string_list, second(string_list), third(string_list)), result);
            cdolist_list_var = cdolist_list_var.rest();
            string_list = cdolist_list_var.first();
        } 
        return result;
    }/**
     * given a list of STRING-LISTS and a TEMPLATE, return a list of lists,
     * each of which contains a reversed string-list, a reversed version
     * of TEMPLATE, the original string, and the start and end indexes for
     * the string (the indices aren't reversed or anything else)
     *
     * @param STRING-LISTS
     * 		list; a list of lists, each of which contains a
     * 		list of strings, the start of the string, and the end index of the string
     * @param TEMPLATE
     * 		list; a template (not the entire rule, just the template)
     * @return list; described above
     */


    /**
     * given a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,
     * remove all of the optional words at the end of the template
     *
     * @param ORIGINAL-WORD-LISTS
     * 		list; a list of lists, each list
     * 		containing a list of words (usually part of a sentence), followed by
     * 		the start position and end position of those words
     * @param TEMPLATE
     * 		list; a template (not a whole rule)
     * @return list; a list of all sentence/template/original-sentence/start/end 5-tuples.
    Here's the form of the list: ((''word1'' ... ''word6'')
    ((Template-item-1) (template-item-2) ...) (''word1'' ... 'word8') 0 6)
     */
    @LispMethod(comment = "given a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,\r\nremove all of the optional words at the end of the template\r\n\r\n@param ORIGINAL-WORD-LISTS\r\n\t\tlist; a list of lists, each list\r\n\t\tcontaining a list of words (usually part of a sentence), followed by\r\n\t\tthe start position and end position of those words\r\n@param TEMPLATE\r\n\t\tlist; a template (not a whole rule)\r\n@return list; a list of all sentence/template/original-sentence/start/end 5-tuples.\r\nHere\'s the form of the list: ((\'\'word1\'\' ... \'\'word6\'\')\r\n((Template-item-1) (template-item-2) ...) (\'\'word1\'\' ... \'word8\') 0 6)\ngiven a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,\nremove all of the optional words at the end of the template")
    public static final SubLObject remove_kleene_words_alt(SubLObject original_word_lists, SubLObject template) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == original_word_lists) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt98$entered_remove_kleene_words_with_));
                }
                return NIL;
            }
            {
                SubLObject lists = com.cyc.cycjava.cycl.rtp.recognition.reverse_and_add_template(original_word_lists, template);
                SubLObject rev_lists = com.cyc.cycjava.cycl.rtp.recognition.remove_kleene_words_int(lists);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = rev_lists;
                SubLObject lyst = NIL;
                for (lyst = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lyst = cdolist_list_var.first()) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str_alt99$removed_list____S__, lyst)));
                    }
                    {
                        SubLObject word_list = reverse(lyst.first());
                        SubLObject template_10 = reverse(second(lyst));
                        SubLObject original_words = third(lyst).first();
                        SubLObject start_index = fourth(lyst);
                        SubLObject end_index = fifth(lyst);
                        result = cons(list(word_list, template_10, original_words, start_index, end_index), result);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "given a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,\r\nremove all of the optional words at the end of the template\r\n\r\n@param ORIGINAL-WORD-LISTS\r\n\t\tlist; a list of lists, each list\r\n\t\tcontaining a list of words (usually part of a sentence), followed by\r\n\t\tthe start position and end position of those words\r\n@param TEMPLATE\r\n\t\tlist; a template (not a whole rule)\r\n@return list; a list of all sentence/template/original-sentence/start/end 5-tuples.\r\nHere\'s the form of the list: ((\'\'word1\'\' ... \'\'word6\'\')\r\n((Template-item-1) (template-item-2) ...) (\'\'word1\'\' ... \'word8\') 0 6)\ngiven a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,\nremove all of the optional words at the end of the template")
    public static SubLObject remove_kleene_words(final SubLObject original_word_lists, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == original_word_lists) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                rtp_tracer_output(ONE_INTEGER, list($str98$entered_remove_kleene_words_with_));
            }
            return NIL;
        }
        final SubLObject lists = reverse_and_add_template(original_word_lists, template);
        final SubLObject rev_lists = remove_kleene_words_int(lists);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = rev_lists;
        SubLObject lyst = NIL;
        lyst = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list(format(NIL, $str99$removed_list____S__, lyst)));
            }
            final SubLObject word_list = reverse(lyst.first());
            final SubLObject template_$10 = reverse(second(lyst));
            final SubLObject original_words = third(lyst).first();
            final SubLObject start_index = fourth(lyst);
            final SubLObject end_index = fifth(lyst);
            result = cons(list(word_list, template_$10, original_words, start_index, end_index), result);
            cdolist_list_var = cdolist_list_var.rest();
            lyst = cdolist_list_var.first();
        } 
        return result;
    }/**
     * given a list of lists of words (part of a sentence) and the portion of a template that is intended to match the template,
     * remove all of the optional words at the end of the template
     *
     * @param ORIGINAL-WORD-LISTS
     * 		list; a list of lists, each list
     * 		containing a list of words (usually part of a sentence), followed by
     * 		the start position and end position of those words
     * @param TEMPLATE
     * 		list; a template (not a whole rule)
     * @return list; a list of all sentence/template/original-sentence/start/end 5-tuples.
    Here's the form of the list: ((''word1'' ... ''word6'')
    ((Template-item-1) (template-item-2) ...) (''word1'' ... 'word8') 0 6)
     */


    /**
     * given a list of 5-tuples, each consisting of a list of strings (the 'sentence'),
     * a template (not the entire rule), and the original words, the start
     * index and the end index, remove all possible *'ed and +'ed items,
     * returning a list of 'sentence'/template/original-sentence triples
     *
     * @param LISTS
    list
     * 		
     * @return list; a list of 'sentence'/template/original-sentence/start/end 5-tuples, with all possible *'ed and +'ed
    items removed from the front
     * @unknown normally called with both the 'sentences' and the templates
    reversed.  For this reason, when a word is removed from the front of
    the sentence, the end-index is decremented.
     */
    @LispMethod(comment = "given a list of 5-tuples, each consisting of a list of strings (the \'sentence\'),\r\na template (not the entire rule), and the original words, the start\r\nindex and the end index, remove all possible *\'ed and +\'ed items,\r\nreturning a list of \'sentence\'/template/original-sentence triples\r\n\r\n@param LISTS\nlist\r\n\t\t\r\n@return list; a list of \'sentence\'/template/original-sentence/start/end 5-tuples, with all possible *\'ed and +\'ed\r\nitems removed from the front\r\n@unknown normally called with both the \'sentences\' and the templates\r\nreversed.  For this reason, when a word is removed from the front of\r\nthe sentence, the end-index is decremented.\ngiven a list of 5-tuples, each consisting of a list of strings (the \'sentence\'),\na template (not the entire rule), and the original words, the start\nindex and the end index, remove all possible *\'ed and +\'ed items,\nreturning a list of \'sentence\'/template/original-sentence triples")
    public static final SubLObject remove_kleene_words_int_alt(SubLObject lists) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (lists.isList()) {
                    {
                        SubLObject cdolist_list_var = lists;
                        SubLObject five_tuple = NIL;
                        for (five_tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , five_tuple = cdolist_list_var.first()) {
                            {
                                SubLObject word_list = five_tuple.first();
                                SubLObject template = second(five_tuple);
                                SubLObject original_words = third(five_tuple);
                                SubLObject start_index = fourth(five_tuple);
                                SubLObject end_index = fifth(five_tuple);
                                SubLObject first_item = template.first();
                                if (!(word_list.equal($completed_words_list$.getGlobalValue()) || (NIL == word_list))) {
                                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt100$_word_list__S____template__S____f, word_list, template, first_item));
                                    }
                                    if (NIL != rtp_type_checkers.optional_template_item(first_item)) {
                                        {
                                            SubLObject word_lists = com.cyc.cycjava.cycl.rtp.recognition.remove_optional_strings(first_item, list(word_list, start_index, end_index), T);
                                            SubLObject temp_template = template.rest();
                                            SubLObject temp_result = NIL;
                                            SubLObject cdolist_list_var_11 = word_lists;
                                            SubLObject removed_word_list = NIL;
                                            for (removed_word_list = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , removed_word_list = cdolist_list_var_11.first()) {
                                                temp_result = cons(list(removed_word_list.first(), temp_template, original_words, second(removed_word_list), third(removed_word_list)), temp_result);
                                            }
                                            result = cconcatenate(result, com.cyc.cycjava.cycl.rtp.recognition.remove_kleene_words_int(temp_result));
                                        }
                                    } else {
                                        result = cons(five_tuple, result);
                                    }
                                }
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "given a list of 5-tuples, each consisting of a list of strings (the \'sentence\'),\r\na template (not the entire rule), and the original words, the start\r\nindex and the end index, remove all possible *\'ed and +\'ed items,\r\nreturning a list of \'sentence\'/template/original-sentence triples\r\n\r\n@param LISTS\n\t\tlist\r\n\t\t\r\n@return list; a list of \'sentence\'/template/original-sentence/start/end 5-tuples, with all possible *\'ed and +\'ed\r\nitems removed from the front\r\n@unknown normally called with both the \'sentences\' and the templates\r\nreversed.  For this reason, when a word is removed from the front of\r\nthe sentence, the end-index is decremented.\ngiven a list of 5-tuples, each consisting of a list of strings (the \'sentence\'),\na template (not the entire rule), and the original words, the start\nindex and the end index, remove all possible *\'ed and +\'ed items,\nreturning a list of \'sentence\'/template/original-sentence triples")
    public static SubLObject remove_kleene_words_int(final SubLObject lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (lists.isList()) {
            SubLObject cdolist_list_var = lists;
            SubLObject five_tuple = NIL;
            five_tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject word_list = five_tuple.first();
                final SubLObject template = second(five_tuple);
                final SubLObject original_words = third(five_tuple);
                final SubLObject start_index = fourth(five_tuple);
                final SubLObject end_index = fifth(five_tuple);
                final SubLObject first_item = template.first();
                if ((!word_list.equal($completed_words_list$.getGlobalValue())) && (NIL != word_list)) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str100$_word_list__S____template__S____f, word_list, template, first_item));
                    }
                    if (NIL != rtp_type_checkers.optional_template_item(first_item)) {
                        final SubLObject word_lists = remove_optional_strings(first_item, list(word_list, start_index, end_index), T);
                        final SubLObject temp_template = template.rest();
                        SubLObject temp_result = NIL;
                        SubLObject cdolist_list_var_$11 = word_lists;
                        SubLObject removed_word_list = NIL;
                        removed_word_list = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            temp_result = cons(list(removed_word_list.first(), temp_template, original_words, second(removed_word_list), third(removed_word_list)), temp_result);
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            removed_word_list = cdolist_list_var_$11.first();
                        } 
                        result = cconcatenate(result, remove_kleene_words_int(temp_result));
                    } else {
                        result = cons(five_tuple, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                five_tuple = cdolist_list_var.first();
            } 
        }
        return result;
    }/**
     * given a list of 5-tuples, each consisting of a list of strings (the 'sentence'),
     * a template (not the entire rule), and the original words, the start
     * index and the end index, remove all possible *'ed and +'ed items,
     * returning a list of 'sentence'/template/original-sentence triples
     *
     * @param LISTS
    		list
     * 		
     * @return list; a list of 'sentence'/template/original-sentence/start/end 5-tuples, with all possible *'ed and +'ed
    items removed from the front
     * @unknown normally called with both the 'sentences' and the templates
    reversed.  For this reason, when a word is removed from the front of
    the sentence, the end-index is decremented.
     */


    /**
     *
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entries
     * @param DEPTH
     * 		integer; the depth of these entries in the tree
     * @return list; chart entries that have no words left un-parsed (though there may
    still be unparsed subconstituents
     */
    @LispMethod(comment = "@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entries\r\n@param DEPTH\r\n\t\tinteger; the depth of these entries in the tree\r\n@return list; chart entries that have no words left un-parsed (though there may\r\nstill be unparsed subconstituents")
    public static final SubLObject completed_entries_alt(SubLObject entries, SubLObject depth) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.completed_entryP(entry, depth)) {
                    result = cons(entry, result);
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entries
     * @param DEPTH
     * 		integer; the depth of these entries in the tree
     * @return list; chart entries that have no words left un-parsed (though there may
    still be unparsed subconstituents
     */
    @LispMethod(comment = "@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entries\r\n@param DEPTH\r\n\t\tinteger; the depth of these entries in the tree\r\n@return list; chart entries that have no words left un-parsed (though there may\r\nstill be unparsed subconstituents")
    public static SubLObject completed_entries(final SubLObject entries, final SubLObject depth) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != completed_entryP(entry, depth)) {
                result = cons(entry, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject completed_entryP_alt(SubLObject entry, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $parse_entire_string$.getDynamicValue(thread)) || depth.numG(ZERO_INTEGER)) {
                return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)) && rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()));
            } else {
                return makeBoolean(rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()) || length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)));
            }
        }
    }

    public static SubLObject completed_entryP(final SubLObject entry, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $parse_entire_string$.getDynamicValue(thread)) || depth.numG(ZERO_INTEGER)) {
            return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)) && rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()));
        }
        return makeBoolean(rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()) || length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)));
    }

    /**
     *
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entries
     */
    @LispMethod(comment = "@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entries")
    public static final SubLObject print_entries_alt(SubLObject entries) {
        {
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                format(T, $str_alt101$words_________S__, rtp_datastructures.rtp_chart_entry_words(entry));
                format(T, $str_alt102$sem___________S__, rtp_datastructures.rtp_chart_entry_sem(entry));
                format(T, $str_alt103$bindings______S__, rtp_datastructures.rtp_chart_entry_bindings(entry));
                format(T, $str_alt104$subconsts_____S__, rtp_datastructures.rtp_chart_entry_subconstits(entry));
            }
        }
        return T;
    }

    /**
     *
     *
     * @param ENTRIES
     * 		list; a list of rtp-chart-entries
     */
    @LispMethod(comment = "@param ENTRIES\r\n\t\tlist; a list of rtp-chart-entries")
    public static SubLObject print_entries(final SubLObject entries) {
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str101$words_________S__, rtp_datastructures.rtp_chart_entry_words(entry));
            format(T, $str102$sem___________S__, rtp_datastructures.rtp_chart_entry_sem(entry));
            format(T, $str103$bindings______S__, rtp_datastructures.rtp_chart_entry_bindings(entry));
            format(T, $str104$subconsts_____S__, rtp_datastructures.rtp_chart_entry_subconstits(entry));
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @param template-item
     * 		list, a template item starting with a word-unit, ending with a part of speech
     * @param current-entry
    rtp-chart-entry;
     * 		
     */
    @LispMethod(comment = "@param template-item\r\n\t\tlist, a template item starting with a word-unit, ending with a part of speech\r\n@param current-entry\nrtp-chart-entry;")
    public static final SubLObject tp_match_wordXpos_alt(SubLObject template_item, SubLObject current_entry) {
        return com.cyc.cycjava.cycl.rtp.recognition.tp_match_wordXpos_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }

    /**
     *
     *
     * @param template-item
     * 		list, a template item starting with a word-unit, ending with a part of speech
     * @param current-entry
    rtp-chart-entry;
     * 		
     */
    @LispMethod(comment = "@param template-item\r\n\t\tlist, a template item starting with a word-unit, ending with a part of speech\r\n@param current-entry\nrtp-chart-entry;")
    public static SubLObject tp_match_wordXpos(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpos_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }

    public static final SubLObject tp_match_wordXpos_wXwords_alt(SubLObject template_item, SubLObject words) {
        if (NIL == rtp_type_checkers.rtp_word_pos_itemP(template_item)) {
            return NIL;
        }
        {
            SubLObject word = words.first();
            SubLObject wu = template_item.first();
            SubLObject pos = second(template_item);
            return com.cyc.cycjava.cycl.rtp.recognition.rtp_string_is_pos_on_wuP(word, wu, pos);
        }
    }

    public static SubLObject tp_match_wordXpos_wXwords(final SubLObject template_item, final SubLObject words) {
        if (NIL == rtp_type_checkers.rtp_word_pos_itemP(template_item)) {
            return NIL;
        }
        final SubLObject word = words.first();
        final SubLObject wu = template_item.first();
        final SubLObject pos = second(template_item);
        return rtp_string_is_pos_on_wuP(word, wu, pos);
    }

    public static final SubLObject rtp_string_is_pos_on_wuP_alt(SubLObject word, SubLObject wu, SubLObject pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return lexicon_accessors.string_is_pos_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), GET_STRINGS_OF_TYPE_CACHED, UNPROVIDED);
        }
    }

    public static SubLObject rtp_string_is_pos_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pos_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), GET_STRINGS_OF_TYPE_CACHED, UNPROVIDED);
    }

    /**
     * similar to @xref tp-match-word&pos
     *
     * @param template-item
     * 		list, a template item starting with a word-unit,
     * 		ending with a #$SpeechPartPredicate
     * @param current-entry
    rtp-chart-entry
     * 		
     */
    @LispMethod(comment = "similar to @xref tp-match-word&pos\r\n\r\n@param template-item\r\n\t\tlist, a template item starting with a word-unit,\r\n\t\tending with a #$SpeechPartPredicate\r\n@param current-entry\nrtp-chart-entry")
    public static final SubLObject tp_match_wordXpred_alt(SubLObject template_item, SubLObject current_entry) {
        return com.cyc.cycjava.cycl.rtp.recognition.tp_match_wordXpred_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }

    @LispMethod(comment = "similar to @xref tp-match-word&pos\r\n\r\n@param template-item\r\n\t\tlist, a template item starting with a word-unit,\r\n\t\tending with a #$SpeechPartPredicate\r\n@param current-entry\n\t\trtp-chart-entry")
    public static SubLObject tp_match_wordXpred(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpred_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }/**
     * similar to @xref tp-match-word&pos
     *
     * @param template-item
     * 		list, a template item starting with a word-unit,
     * 		ending with a #$SpeechPartPredicate
     * @param current-entry
    		rtp-chart-entry
     * 		
     */


    public static final SubLObject tp_match_wordXpred_wXwords_alt(SubLObject template_item, SubLObject words) {
        if (NIL == rtp_type_checkers.rtp_word_pos_pred_itemP(template_item)) {
            return NIL;
        }
        {
            SubLObject word = words.first();
            SubLObject wu = template_item.first();
            SubLObject pred = second(template_item);
            return com.cyc.cycjava.cycl.rtp.recognition.rtp_string_is_pred_on_wuP(word, wu, pred);
        }
    }

    public static SubLObject tp_match_wordXpred_wXwords(final SubLObject template_item, final SubLObject words) {
        if (NIL == rtp_type_checkers.rtp_word_pos_pred_itemP(template_item)) {
            return NIL;
        }
        final SubLObject word = words.first();
        final SubLObject wu = template_item.first();
        final SubLObject pred = second(template_item);
        return rtp_string_is_pred_on_wuP(word, wu, pred);
    }

    public static final SubLObject rtp_string_is_pred_on_wuP_alt(SubLObject word, SubLObject wu, SubLObject pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return lexicon_accessors.string_is_pred_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject rtp_string_is_pred_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pred_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * check to see if the first word in the input string matches the one in the template
     *
     * @param TEMPLATE-ITEM
    string
     * 		
     * @param CURRENT-WORD
    string
     * 		
     */
    @LispMethod(comment = "check to see if the first word in the input string matches the one in the template\r\n\r\n@param TEMPLATE-ITEM\nstring\r\n\t\t\r\n@param CURRENT-WORD\nstring")
    public static final SubLObject tp_match_tokenP_alt(SubLObject template_item, SubLObject current_word) {
        return Strings.string_equal(template_item, current_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "check to see if the first word in the input string matches the one in the template\r\n\r\n@param TEMPLATE-ITEM\n\t\tstring\r\n\t\t\r\n@param CURRENT-WORD\n\t\tstring")
    public static SubLObject tp_match_tokenP(final SubLObject template_item, final SubLObject current_word) {
        return Strings.string_equal(template_item, current_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * check to see if the first word in the input string matches the one in the template
     *
     * @param TEMPLATE-ITEM
    		string
     * 		
     * @param CURRENT-WORD
    		string
     * 		
     */


    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		a list (headed by an asterisk) of strings that could
     * 		be eaten.
     * @param CURRENT-WORDS
     * 		list of the unparsed words (strings) in order
     * @return list; a list of possible current-words (lists) after eating up anything
    that can be eaten
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ta list (headed by an asterisk) of strings that could\r\n\t\tbe eaten.\r\n@param CURRENT-WORDS\r\n\t\tlist of the unparsed words (strings) in order\r\n@return list; a list of possible current-words (lists) after eating up anything\r\nthat can be eaten")
    public static final SubLObject tp_optional_words_alt(SubLObject template_item, SubLObject current_words) {
        if (NIL == current_words) {
            return list($completed_words_list$.getGlobalValue());
        }
        {
            SubLObject result = list(current_words);
            SubLObject kleene_words = com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(template_item).rest();
            while ((current_words.isList() && current_words.first().isString()) && (NIL != member(current_words.first(), kleene_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED))) {
                current_words = current_words.rest();
                if (NIL == current_words) {
                    result = cons($completed_words_list$.getGlobalValue(), result);
                } else {
                    result = cons(current_words, result);
                }
            } 
            return result;
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		a list (headed by an asterisk) of strings that could
     * 		be eaten.
     * @param CURRENT-WORDS
     * 		list of the unparsed words (strings) in order
     * @return list; a list of possible current-words (lists) after eating up anything
    that can be eaten
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ta list (headed by an asterisk) of strings that could\r\n\t\tbe eaten.\r\n@param CURRENT-WORDS\r\n\t\tlist of the unparsed words (strings) in order\r\n@return list; a list of possible current-words (lists) after eating up anything\r\nthat can be eaten")
    public static SubLObject tp_optional_words(final SubLObject template_item, SubLObject current_words) {
        if (NIL == current_words) {
            return list($completed_words_list$.getGlobalValue());
        }
        SubLObject result = list(current_words);
        final SubLObject kleene_words = expand_word_items_in_list(template_item).rest();
        while ((current_words.isList() && current_words.first().isString()) && (NIL != member(current_words.first(), kleene_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED))) {
            current_words = current_words.rest();
            if (NIL == current_words) {
                result = cons($completed_words_list$.getGlobalValue(), result);
            } else {
                result = cons(current_words, result);
            }
        } 
        return result;
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		a list (headed by a plus sign) of strings that could
     * 		be eaten.
     * @param CURRENT-WORDS
     * 		list of the unparsed words (strings) in order
     * @return list; a list of possible current-words after eating up anything
    that can be eaten; returns nil if nothing can be eaten
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ta list (headed by a plus sign) of strings that could\r\n\t\tbe eaten.\r\n@param CURRENT-WORDS\r\n\t\tlist of the unparsed words (strings) in order\r\n@return list; a list of possible current-words after eating up anything\r\nthat can be eaten; returns nil if nothing can be eaten")
    public static final SubLObject tp_require_some_alt(SubLObject template_item, SubLObject current_words) {
        if (NIL != subl_promotions.memberP(current_words.first(), com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(template_item).rest(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return com.cyc.cycjava.cycl.rtp.recognition.tp_optional_words(template_item, current_words.rest());
        } else {
            return NIL;
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM
     * 		a list (headed by a plus sign) of strings that could
     * 		be eaten.
     * @param CURRENT-WORDS
     * 		list of the unparsed words (strings) in order
     * @return list; a list of possible current-words after eating up anything
    that can be eaten; returns nil if nothing can be eaten
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM\r\n\t\ta list (headed by a plus sign) of strings that could\r\n\t\tbe eaten.\r\n@param CURRENT-WORDS\r\n\t\tlist of the unparsed words (strings) in order\r\n@return list; a list of possible current-words after eating up anything\r\nthat can be eaten; returns nil if nothing can be eaten")
    public static SubLObject tp_require_some(final SubLObject template_item, final SubLObject current_words) {
        if (NIL != subl_promotions.memberP(current_words.first(), expand_word_items_in_list(template_item).rest(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return tp_optional_words(template_item, current_words.rest());
        }
        return NIL;
    }

    public static final SubLObject tp_match_token_alt(SubLObject template_item, SubLObject current_words) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return lexicon_accessors.denots_of_string(current_words.first(), NIL, $DENOT, T, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject tp_match_token(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.denots_of_string(current_words.first(), NIL, $DENOT, T, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM,
     * 		a list, hopefully corresponding to a template-item
     * @param CURRENT-WORDS
     * 		list of strings or *COMPLETED-WORDS-LIST*
     * @return list; a list of (denotatum string-length) pairs, where string-length is
    the number of words from CURRENT-WORDS that were used to match the part-of-speech
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM,\r\n\t\ta list, hopefully corresponding to a template-item\r\n@param CURRENT-WORDS\r\n\t\tlist of strings or *COMPLETED-WORDS-LIST*\r\n@return list; a list of (denotatum string-length) pairs, where string-length is\r\nthe number of words from CURRENT-WORDS that were used to match the part-of-speech")
    public static final SubLObject tp_match_pos_alt(SubLObject template_item, SubLObject current_words) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cat = template_item.first();
                SubLObject denots = NIL;
                SubLObject result = NIL;
                SubLObject cdotimes_end_var = length(current_words);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                    denots = lexicon_accessors.denots_of_stringXspeech_part(string_utilities.bunge(subseq(current_words, ZERO_INTEGER, add(ONE_INTEGER, index)), UNPROVIDED), cat, NIL, $DENOT, T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = denots;
                        SubLObject denot = NIL;
                        for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                            result = cons(list(narts_high.nart_expand(denot), add(ONE_INTEGER, index)), result);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM,
     * 		a list, hopefully corresponding to a template-item
     * @param CURRENT-WORDS
     * 		list of strings or *COMPLETED-WORDS-LIST*
     * @return list; a list of (denotatum string-length) pairs, where string-length is
    the number of words from CURRENT-WORDS that were used to match the part-of-speech
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM,\r\n\t\ta list, hopefully corresponding to a template-item\r\n@param CURRENT-WORDS\r\n\t\tlist of strings or *COMPLETED-WORDS-LIST*\r\n@return list; a list of (denotatum string-length) pairs, where string-length is\r\nthe number of words from CURRENT-WORDS that were used to match the part-of-speech")
    public static SubLObject tp_match_pos(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cat = template_item.first();
        SubLObject denots = NIL;
        SubLObject result = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject denot;
        for (cdotimes_end_var = length(current_words), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            denots = cdolist_list_var = lexicon_accessors.denots_of_stringXspeech_part(string_utilities.bunge(subseq(current_words, ZERO_INTEGER, add(ONE_INTEGER, index)), UNPROVIDED), cat, NIL, $DENOT, T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
            denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(list(narts_high.nart_expand(denot), add(ONE_INTEGER, index)), result);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            } 
        }
        return result;
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM,
     * 		a list, hopefully corresponding to a template-item
     * 		(with a speech-part-predicate as its first item)
     * @param CURRENT-WORDS
     * 		list of strings or *COMPLETED-WORDS-LIST*
     * @return list; list of (denotatum string-length) pairs, where string-length is
    the number of words from CURRENT-WORDS that were used to match the speech-part-pred
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM,\r\n\t\ta list, hopefully corresponding to a template-item\r\n\t\t(with a speech-part-predicate as its first item)\r\n@param CURRENT-WORDS\r\n\t\tlist of strings or *COMPLETED-WORDS-LIST*\r\n@return list; list of (denotatum string-length) pairs, where string-length is\r\nthe number of words from CURRENT-WORDS that were used to match the speech-part-pred")
    public static final SubLObject tp_match_pred_alt(SubLObject template_item, SubLObject current_words) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = template_item.first();
                SubLObject denots = NIL;
                SubLObject result = NIL;
                SubLObject cdotimes_end_var = length(current_words);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                    denots = lexicon_accessors.denots_of_stringXpred(string_utilities.bunge(subseq(current_words, ZERO_INTEGER, add(ONE_INTEGER, index)), UNPROVIDED), pred, NIL, $DENOT, T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = denots;
                        SubLObject denot = NIL;
                        for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                            result = cons(list(narts_high.nart_expand(denot), add(ONE_INTEGER, index)), result);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param TEMPLATE-ITEM,
     * 		a list, hopefully corresponding to a template-item
     * 		(with a speech-part-predicate as its first item)
     * @param CURRENT-WORDS
     * 		list of strings or *COMPLETED-WORDS-LIST*
     * @return list; list of (denotatum string-length) pairs, where string-length is
    the number of words from CURRENT-WORDS that were used to match the speech-part-pred
     */
    @LispMethod(comment = "@param TEMPLATE-ITEM,\r\n\t\ta list, hopefully corresponding to a template-item\r\n\t\t(with a speech-part-predicate as its first item)\r\n@param CURRENT-WORDS\r\n\t\tlist of strings or *COMPLETED-WORDS-LIST*\r\n@return list; list of (denotatum string-length) pairs, where string-length is\r\nthe number of words from CURRENT-WORDS that were used to match the speech-part-pred")
    public static SubLObject tp_match_pred(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = template_item.first();
        SubLObject denots = NIL;
        SubLObject result = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject denot;
        for (cdotimes_end_var = length(current_words), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            denots = cdolist_list_var = lexicon_accessors.denots_of_stringXpred(string_utilities.bunge(subseq(current_words, ZERO_INTEGER, add(ONE_INTEGER, index)), UNPROVIDED), pred, NIL, $DENOT, T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(list(narts_high.nart_expand(denot), add(ONE_INTEGER, index)), result);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static final SubLObject expand_word_items_in_list_alt(SubLObject template_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $rtp_use_caches$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.rtp.recognition.clear_expand_word_items_in_list_int();
            }
            return com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list_int(template_item);
        }
    }

    public static SubLObject expand_word_items_in_list(final SubLObject template_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $rtp_use_caches$.getDynamicValue(thread)) {
            clear_expand_word_items_in_list_int();
        }
        return expand_word_items_in_list_int(template_item);
    }

    public static final SubLObject clear_expand_word_items_in_list_int_alt() {
        {
            SubLObject cs = $expand_word_items_in_list_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_expand_word_items_in_list_int() {
        final SubLObject cs = $expand_word_items_in_list_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_expand_word_items_in_list_int_alt(SubLObject template_item) {
        return memoization_state.caching_state_remove_function_results_with_args($expand_word_items_in_list_int_caching_state$.getGlobalValue(), list(template_item), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_expand_word_items_in_list_int(final SubLObject template_item) {
        return memoization_state.caching_state_remove_function_results_with_args($expand_word_items_in_list_int_caching_state$.getGlobalValue(), list(template_item), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject expand_word_items_in_list_int_internal_alt(SubLObject template_item) {
        if (!template_item.isList()) {
            return template_item;
        }
        if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
            return cons($$RequireOne, rtp_datastructures.compute_strings_of_type(template_item));
        }
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = template_item;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL != rtp_type_checkers.rtp_word_itemP(item)) {
                    result = cconcatenate(rtp_datastructures.compute_strings_of_type(item), result);
                } else {
                    result = cons(item, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject expand_word_items_in_list_int_internal(final SubLObject template_item) {
        if (!template_item.isList()) {
            return template_item;
        }
        if (NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
            return cons($$RequireOne, rtp_datastructures.compute_strings_of_type(template_item));
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = template_item;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rtp_type_checkers.rtp_word_itemP(item)) {
                result = cconcatenate(rtp_datastructures.compute_strings_of_type(item), result);
            } else {
                result = cons(item, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject expand_word_items_in_list_int_alt(SubLObject template_item) {
        {
            SubLObject caching_state = $expand_word_items_in_list_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(EXPAND_WORD_ITEMS_IN_LIST_INT, $expand_word_items_in_list_int_caching_state$, $int$2048, EQUAL, ONE_INTEGER, $int$256);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, template_item, $kw112$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw112$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list_int_internal(template_item)));
                    memoization_state.caching_state_put(caching_state, template_item, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject expand_word_items_in_list_int(final SubLObject template_item) {
        SubLObject caching_state = $expand_word_items_in_list_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(EXPAND_WORD_ITEMS_IN_LIST_INT, $expand_word_items_in_list_int_caching_state$, $int$2048, EQUAL, ONE_INTEGER, $int$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, template_item, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(expand_word_items_in_list_int_internal(template_item)));
            memoization_state.caching_state_put(caching_state, template_item, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * given a template item, remove all possible words associated with that template
     *
     * @param TEMPLATE-ITEM
     * 		list, a list starting with an optional-function
     * @param WORD-LIST
     * 		list, a triple containing a list of strings corresponding the words left
     * 		in the sentence, the start-index, and the end-index of the string
     * @return list; if the string doesn't contain any required words, return nil, otherwise return a list
    of triples containing all possible sentences with the appropriate number of words
    in TEMPLATE-ITEM stripped from the front of word-list.
     */
    @LispMethod(comment = "given a template item, remove all possible words associated with that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist, a list starting with an optional-function\r\n@param WORD-LIST\r\n\t\tlist, a triple containing a list of strings corresponding the words left\r\n\t\tin the sentence, the start-index, and the end-index of the string\r\n@return list; if the string doesn\'t contain any required words, return nil, otherwise return a list\r\nof triples containing all possible sentences with the appropriate number of words\r\nin TEMPLATE-ITEM stripped from the front of word-list.")
    public static final SubLObject remove_optional_strings_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        {
            SubLObject optional_funct = rtp_type_checkers.optional_template_item(template_item);
            if (NIL == optional_funct) {
                Errors.error($str_alt113$RTP__sent_in_a_non_function_to_RE);
            }
            {
                SubLObject pcase_var = optional_funct;
                if (pcase_var.eql($$RequireSome)) {
                    return com.cyc.cycjava.cycl.rtp.recognition.remove_X_words(template_item, word_list, word_list_reversed);
                } else {
                    if (pcase_var.eql($$RequireOne)) {
                        return com.cyc.cycjava.cycl.rtp.recognition.remove_require_one(template_item, word_list, word_list_reversed);
                    } else {
                        if (pcase_var.eql($$OptionalSome)) {
                            return com.cyc.cycjava.cycl.rtp.recognition.remove_optional_words(template_item, word_list, word_list_reversed);
                        } else {
                            if (pcase_var.eql($$OptionalOne)) {
                                return com.cyc.cycjava.cycl.rtp.recognition.remove_optional_one(template_item, word_list, word_list_reversed);
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "given a template item, remove all possible words associated with that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist, a list starting with an optional-function\r\n@param WORD-LIST\r\n\t\tlist, a triple containing a list of strings corresponding the words left\r\n\t\tin the sentence, the start-index, and the end-index of the string\r\n@return list; if the string doesn\'t contain any required words, return nil, otherwise return a list\r\nof triples containing all possible sentences with the appropriate number of words\r\nin TEMPLATE-ITEM stripped from the front of word-list.")
    public static SubLObject remove_optional_strings(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        final SubLObject optional_funct = rtp_type_checkers.optional_template_item(template_item);
        if (NIL == optional_funct) {
            Errors.error($str112$RTP__sent_in_a_non_function_to_RE);
        }
        final SubLObject pcase_var = optional_funct;
        if (pcase_var.eql($$RequireSome)) {
            return remove_X_words(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql($$RequireOne)) {
            return remove_require_one(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql($$OptionalSome)) {
            return remove_optional_words(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql($$OptionalOne)) {
            return remove_optional_one(template_item, word_list, word_list_reversed);
        }
        return NIL;
    }/**
     * given a template item, remove all possible words associated with that template
     *
     * @param TEMPLATE-ITEM
     * 		list, a list starting with an optional-function
     * @param WORD-LIST
     * 		list, a triple containing a list of strings corresponding the words left
     * 		in the sentence, the start-index, and the end-index of the string
     * @return list; if the string doesn't contain any required words, return nil, otherwise return a list
    of triples containing all possible sentences with the appropriate number of words
    in TEMPLATE-ITEM stripped from the front of word-list.
     */


    /**
     * given a template already proved to be a kleene-+ template, remove all possible words associated
     * with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with +, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		; corresponding to the words left in the
     * 		; sentence, the start index and the end index
     * 		; of the string
     * @return list; if no items in the template item were found in WORD-LIST, return nil, otherwise
    return a list of triples containing all possible sentence with at least one word in
    TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start-index and end-index of each string.
     */
    @LispMethod(comment = "given a template already proved to be a kleene-+ template, remove all possible words associated\r\nwith that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with +, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\t; corresponding to the words left in the\r\n\t\t; sentence, the start index and the end index\r\n\t\t; of the string\r\n@return list; if no items in the template item were found in WORD-LIST, return nil, otherwise\r\nreturn a list of triples containing all possible sentence with at least one word in\r\nTEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start-index and end-index of each string.\ngiven a template already proved to be a kleene-+ template, remove all possible words associated\nwith that template")
    public static final SubLObject remove_X_words_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        {
            SubLObject X_words = com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(template_item).rest();
            SubLObject result = NIL;
            SubLObject start_index = second(word_list);
            SubLObject end_index = third(word_list);
            SubLObject words = word_list.first();
            while ((NIL != words.first()) && (NIL != member(words.first(), X_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED))) {
                end_index = subtract(end_index, ONE_INTEGER);
                result = cons(list(words.rest(), start_index, end_index), result);
                words = words.rest();
            } 
            return result;
        }
    }

    @LispMethod(comment = "given a template already proved to be a kleene-+ template, remove all possible words associated\r\nwith that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with +, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\t; corresponding to the words left in the\r\n\t\t; sentence, the start index and the end index\r\n\t\t; of the string\r\n@return list; if no items in the template item were found in WORD-LIST, return nil, otherwise\r\nreturn a list of triples containing all possible sentence with at least one word in\r\nTEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start-index and end-index of each string.\ngiven a template already proved to be a kleene-+ template, remove all possible words associated\nwith that template")
    public static SubLObject remove_X_words(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        final SubLObject X_words = expand_word_items_in_list(template_item).rest();
        SubLObject result = NIL;
        final SubLObject start_index = second(word_list);
        SubLObject end_index = third(word_list);
        for (SubLObject words = word_list.first(); (NIL != words.first()) && (NIL != member(words.first(), X_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)); words = words.rest()) {
            end_index = subtract(end_index, ONE_INTEGER);
            result = cons(list(words.rest(), start_index, end_index), result);
        }
        return result;
    }/**
     * given a template already proved to be a kleene-+ template, remove all possible words associated
     * with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with +, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		; corresponding to the words left in the
     * 		; sentence, the start index and the end index
     * 		; of the string
     * @return list; if no items in the template item were found in WORD-LIST, return nil, otherwise
    return a list of triples containing all possible sentence with at least one word in
    TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start-index and end-index of each string.
     */


    /**
     *
     *
     * @param GROUP
     * 		list; a list of items (or an individual item) that need to match
     * @param WORD-LIST
     * 		list; a list of words (as strings)
     * @return list; the string that is left are matching the group.  NIL if the group doesn't match.
     */
    @LispMethod(comment = "@param GROUP\r\n\t\tlist; a list of items (or an individual item) that need to match\r\n@param WORD-LIST\r\n\t\tlist; a list of words (as strings)\r\n@return list; the string that is left are matching the group.  NIL if the group doesn\'t match.")
    public static final SubLObject remove_a_group_alt(SubLObject group, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        if (group.isList() && ((group.first() == $$WordSequence) || (group.first() == $SEQUENCE))) {
            group = group.rest();
        }
        {
            SubLObject temp_group = (NIL != word_list_reversed) ? ((SubLObject) (group.isList() ? ((SubLObject) (reverse(group))) : group)) : group;
            if (temp_group.isString()) {
                return com.cyc.cycjava.cycl.rtp.recognition.word_match(temp_group, word_list);
            } else {
                if (NIL != rtp_type_checkers.rtp_word_itemP(temp_group)) {
                    return com.cyc.cycjava.cycl.rtp.recognition.word_match(temp_group, word_list);
                } else {
                    {
                        SubLObject cdolist_list_var = temp_group;
                        SubLObject word = NIL;
                        for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                            {
                                SubLObject new_words = com.cyc.cycjava.cycl.rtp.recognition.word_match(word, word_list);
                                if (NIL != new_words) {
                                    word_list = new_words;
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                    return word_list;
                }
            }
        }
    }

    /**
     *
     *
     * @param GROUP
     * 		list; a list of items (or an individual item) that need to match
     * @param WORD-LIST
     * 		list; a list of words (as strings)
     * @return list; the string that is left are matching the group.  NIL if the group doesn't match.
     */
    @LispMethod(comment = "@param GROUP\r\n\t\tlist; a list of items (or an individual item) that need to match\r\n@param WORD-LIST\r\n\t\tlist; a list of words (as strings)\r\n@return list; the string that is left are matching the group.  NIL if the group doesn\'t match.")
    public static SubLObject remove_a_group(SubLObject group, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        if (group.isList() && (group.first().eql($$WordSequence) || (group.first() == $SEQUENCE))) {
            group = group.rest();
        }
        final SubLObject temp_group = (NIL != word_list_reversed) ? group.isList() ? reverse(group) : group : group;
        if (temp_group.isString()) {
            return word_match(temp_group, word_list);
        }
        if (NIL != rtp_type_checkers.rtp_word_itemP(temp_group)) {
            return word_match(temp_group, word_list);
        }
        SubLObject cdolist_list_var = temp_group;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_words = word_match(word, word_list);
            if (NIL == new_words) {
                return NIL;
            }
            word_list = new_words;
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return word_list;
    }

    /**
     *
     *
     * @param WORD-ITEM
     * 		something that passes rtp-word-item?
     * @param WORDS
     * 		list; a list of strings
     * @return list; words left over after removing WORD-ITEM from the front of WORDS.  If
    WORD-ITEM isn't at the front of WORDS, returns nil
     */
    @LispMethod(comment = "@param WORD-ITEM\r\n\t\tsomething that passes rtp-word-item?\r\n@param WORDS\r\n\t\tlist; a list of strings\r\n@return list; words left over after removing WORD-ITEM from the front of WORDS.  If\r\nWORD-ITEM isn\'t at the front of WORDS, returns nil")
    public static final SubLObject word_match_alt(SubLObject word_item, SubLObject words) {
        if (!((NIL != words) && (!list($COMPLETE).equal(words)))) {
            return NIL;
        }
        if (word_item.isString()) {
            if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word_item, words.first())) {
                return NIL != words.rest() ? ((SubLObject) (words.rest())) : $completed_words_list$.getGlobalValue();
            } else {
                return NIL;
            }
        } else {
            if (NIL != rtp_type_checkers.rtp_word_itemP(word_item)) {
                if (NIL != com.cyc.cycjava.cycl.rtp.recognition.rtp_string_is_pos_on_wuP(words.first(), rtp_datastructures.template_item_wu(word_item), rtp_datastructures.template_item_pos(word_item))) {
                    return NIL != words.rest() ? ((SubLObject) (words.rest())) : $completed_words_list$.getGlobalValue();
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param WORD-ITEM
     * 		something that passes rtp-word-item?
     * @param WORDS
     * 		list; a list of strings
     * @return list; words left over after removing WORD-ITEM from the front of WORDS.  If
    WORD-ITEM isn't at the front of WORDS, returns nil
     */
    @LispMethod(comment = "@param WORD-ITEM\r\n\t\tsomething that passes rtp-word-item?\r\n@param WORDS\r\n\t\tlist; a list of strings\r\n@return list; words left over after removing WORD-ITEM from the front of WORDS.  If\r\nWORD-ITEM isn\'t at the front of WORDS, returns nil")
    public static SubLObject word_match(final SubLObject word_item, final SubLObject words) {
        if ((NIL == words) || list($COMPLETE).equal(words)) {
            return NIL;
        }
        if (word_item.isString()) {
            if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word_item, words.first())) {
                return NIL != words.rest() ? words.rest() : $completed_words_list$.getGlobalValue();
            }
            return NIL;
        } else {
            if (NIL == rtp_type_checkers.rtp_word_itemP(word_item)) {
                return NIL;
            }
            if (NIL != rtp_string_is_pos_on_wuP(words.first(), rtp_datastructures.template_item_wu(word_item), rtp_datastructures.template_item_pos(word_item))) {
                return NIL != words.rest() ? words.rest() : $completed_words_list$.getGlobalValue();
            }
            return NIL;
        }
    }

    public static final SubLObject remove_optional_one_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        {
            SubLObject removed_list = com.cyc.cycjava.cycl.rtp.recognition.remove_one(template_item, word_list, word_list_reversed);
            if (NIL != removed_list) {
                return removed_list;
            } else {
                return list(word_list);
            }
        }
    }

    public static SubLObject remove_optional_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        final SubLObject removed_list = remove_one(template_item, word_list, word_list_reversed);
        if (NIL != removed_list) {
            return removed_list;
        }
        return list(word_list);
    }

    public static final SubLObject remove_require_one_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        return com.cyc.cycjava.cycl.rtp.recognition.remove_one(template_item, word_list, word_list_reversed);
    }

    public static SubLObject remove_require_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        return remove_one(template_item, word_list, word_list_reversed);
    }

    /**
     * given a template already proved to be a kleene-+ template, remove all possible words
     * associated with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with +, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		; corresponding to the words left in the
     * 		; sentence, the start index and the end index
     * 		; of the string
     * @return list; if no items in the template item were found in WORD-LIST, return nil,
    otherwise return a list of triples containing all possible sentence with
    at least one word in TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start-index and end-index of each string.
     */
    @LispMethod(comment = "given a template already proved to be a kleene-+ template, remove all possible words\r\nassociated with that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with +, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\t; corresponding to the words left in the\r\n\t\t; sentence, the start index and the end index\r\n\t\t; of the string\r\n@return list; if no items in the template item were found in WORD-LIST, return nil,\r\notherwise return a list of triples containing all possible sentence with\r\nat least one word in TEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start-index and end-index of each string.\ngiven a template already proved to be a kleene-+ template, remove all possible words\nassociated with that template")
    public static final SubLObject remove_one_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        {
            SubLObject X_words = com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(template_item).rest();
            SubLObject start_index = second(word_list);
            SubLObject words = word_list.first();
            SubLObject iter_result = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = X_words;
            SubLObject group = NIL;
            for (group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , group = cdolist_list_var.first()) {
                iter_result = com.cyc.cycjava.cycl.rtp.recognition.remove_a_group(group, words, word_list_reversed);
                if (NIL != iter_result) {
                    if (iter_result == $completed_words_list$.getGlobalValue()) {
                        result = cons(list(iter_result, start_index, start_index), result);
                    } else {
                        result = cons(list(iter_result, start_index, add(start_index, length(iter_result))), result);
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "given a template already proved to be a kleene-+ template, remove all possible words\r\nassociated with that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with +, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\t; corresponding to the words left in the\r\n\t\t; sentence, the start index and the end index\r\n\t\t; of the string\r\n@return list; if no items in the template item were found in WORD-LIST, return nil,\r\notherwise return a list of triples containing all possible sentence with\r\nat least one word in TEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start-index and end-index of each string.\ngiven a template already proved to be a kleene-+ template, remove all possible words\nassociated with that template")
    public static SubLObject remove_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        final SubLObject X_words = expand_word_items_in_list(template_item).rest();
        final SubLObject start_index = second(word_list);
        final SubLObject words = word_list.first();
        SubLObject iter_result = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = X_words;
        SubLObject group = NIL;
        group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            iter_result = remove_a_group(group, words, word_list_reversed);
            if (NIL != iter_result) {
                if (iter_result.eql($completed_words_list$.getGlobalValue())) {
                    result = cons(list(iter_result, start_index, start_index), result);
                } else {
                    result = cons(list(iter_result, start_index, add(start_index, length(iter_result))), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            group = cdolist_list_var.first();
        } 
        return result;
    }/**
     * given a template already proved to be a kleene-+ template, remove all possible words
     * associated with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with +, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		; corresponding to the words left in the
     * 		; sentence, the start index and the end index
     * 		; of the string
     * @return list; if no items in the template item were found in WORD-LIST, return nil,
    otherwise return a list of triples containing all possible sentence with
    at least one word in TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start-index and end-index of each string.
     */


    /**
     * given a template already proved to be a kleene-* template, remove all possible words associated
     * with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with *, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		corresponding to the words left in the sentence, the start index of
     * 		the string and the end index of the string.
     * @return list; returns a list of triples lists containing all possible sentences with zero or more words in
    TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start and end indexes for the new strings.
     */
    @LispMethod(comment = "given a template already proved to be a kleene-* template, remove all possible words associated\r\nwith that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with *, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\tcorresponding to the words left in the sentence, the start index of\r\n\t\tthe string and the end index of the string.\r\n@return list; returns a list of triples lists containing all possible sentences with zero or more words in\r\nTEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start and end indexes for the new strings.\ngiven a template already proved to be a kleene-* template, remove all possible words associated\nwith that template")
    public static final SubLObject remove_optional_words_alt(SubLObject template_item, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_optional_words = com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(template_item).rest();
                SubLObject result = list(word_list);
                SubLObject words = word_list.first();
                SubLObject start_index = second(word_list);
                SubLObject end_index = third(word_list);
                SubLObject optional_words = com.cyc.cycjava.cycl.rtp.recognition.expand_word_items_in_list(original_optional_words);
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt120$word_list____S____words____S__, word_list, original_optional_words));
                }
                while ((NIL != words) && (NIL != member(words.first(), optional_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED))) {
                    end_index = subtract(end_index, ONE_INTEGER);
                    result = cons(list(words.rest(), start_index, end_index), result);
                    words = words.rest();
                } 
                return NIL != $greedy_kleene$.getGlobalValue() ? ((SubLObject) (list(result.first()))) : result;
            }
        }
    }

    @LispMethod(comment = "given a template already proved to be a kleene-* template, remove all possible words associated\r\nwith that template\r\n\r\n@param TEMPLATE-ITEM\r\n\t\tlist; a list starting with *, otherwise containing strings\r\n@param WORD-LIST\r\n\t\tlist; a triple containing a list of strings\r\n\t\tcorresponding to the words left in the sentence, the start index of\r\n\t\tthe string and the end index of the string.\r\n@return list; returns a list of triples lists containing all possible sentences with zero or more words in\r\nTEMPLATE-ITEM stripped from the front of WORD-LIST\r\nalong with the start and end indexes for the new strings.\ngiven a template already proved to be a kleene-* template, remove all possible words associated\nwith that template")
    public static SubLObject remove_optional_words(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_optional_words = expand_word_items_in_list(template_item).rest();
        SubLObject result = list(word_list);
        SubLObject words = word_list.first();
        final SubLObject start_index = second(word_list);
        SubLObject end_index = third(word_list);
        final SubLObject optional_words = expand_word_items_in_list(original_optional_words);
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            rtp_tracer_output(ONE_INTEGER, list($str119$word_list____S____words____S__, word_list, original_optional_words));
        }
        while ((NIL != words) && (NIL != member(words.first(), optional_words, rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED))) {
            end_index = subtract(end_index, ONE_INTEGER);
            result = cons(list(words.rest(), start_index, end_index), result);
            words = words.rest();
        } 
        return NIL != $greedy_kleene$.getGlobalValue() ? list(result.first()) : result;
    }/**
     * given a template already proved to be a kleene-* template, remove all possible words associated
     * with that template
     *
     * @param TEMPLATE-ITEM
     * 		list; a list starting with *, otherwise containing strings
     * @param WORD-LIST
     * 		list; a triple containing a list of strings
     * 		corresponding to the words left in the sentence, the start index of
     * 		the string and the end index of the string.
     * @return list; returns a list of triples lists containing all possible sentences with zero or more words in
    TEMPLATE-ITEM stripped from the front of WORD-LIST
    along with the start and end indexes for the new strings.
     */


    /**
     *
     *
     * @param ENTRY;
     * 		an rtp-chart-entry
     * 		does the chart entry have any bindings that still need to be completed?
     */
    @LispMethod(comment = "@param ENTRY;\r\n\t\tan rtp-chart-entry\r\n\t\tdoes the chart entry have any bindings that still need to be completed?")
    public static final SubLObject fully_bound_entryP_alt(SubLObject entry) {
        return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).numE(rtp_datastructures.rtp_chart_entry_template_index(entry)) && (NIL == rtp_datastructures.rtp_chart_entry_subconstits(entry)));
    }

    /**
     *
     *
     * @param ENTRY;
     * 		an rtp-chart-entry
     * 		does the chart entry have any bindings that still need to be completed?
     */
    @LispMethod(comment = "@param ENTRY;\r\n\t\tan rtp-chart-entry\r\n\t\tdoes the chart entry have any bindings that still need to be completed?")
    public static SubLObject fully_bound_entryP(final SubLObject entry) {
        return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).numE(rtp_datastructures.rtp_chart_entry_template_index(entry)) && (NIL == rtp_datastructures.rtp_chart_entry_subconstits(entry)));
    }

    public static final SubLObject reset_all_recognizer_caches_alt() {
        com.cyc.cycjava.cycl.rtp.recognition.clear_match_recursive_template_item();
        com.cyc.cycjava.cycl.rtp.recognition.clear_expand_word_items_in_list_int();
        rtp_type_checkers.clear_rtp_template_categoryP();
        lexicon_accessors.clear_get_strings_of_type_cached();
        parsing_utilities.clear_nl_tags();
        rtp_constituent_weeders.clear_tp_valid_quantity_p();
        iterative_template_parser.clear_nominal_categoryP();
        iterative_template_parser.clear_verbal_template_categoryP();
        iterative_template_parser.clear_adjectival_categoryP();
        return $RESET;
    }

    public static SubLObject reset_all_recognizer_caches() {
        clear_match_recursive_template_item();
        clear_expand_word_items_in_list_int();
        rtp_type_checkers.clear_rtp_template_categoryP();
        lexicon_accessors.clear_get_strings_of_type_cached();
        parsing_utilities.clear_nl_tags();
        rtp_constituent_weeders.clear_tp_valid_quantity_p();
        iterative_template_parser.clear_nominal_categoryP();
        iterative_template_parser.clear_verbal_template_categoryP();
        iterative_template_parser.clear_adjectival_categoryP();
        return $RESET;
    }

    /**
     * given an entry, parse its subconstits, and return all of the resulting chart-entries.
     * Each of the entries returned will have an empty subconstits list and will have appropriate
     * bindings added to the bindings list.
     *
     * @param ENTRY
     * 		chart-entry; the chart entry of which these subconstits are a part
     * @return list; a list of entries with empty subconstit lists
     * @unknown assumes that anything being parsed at this level is at depth 1
     */
    @LispMethod(comment = "given an entry, parse its subconstits, and return all of the resulting chart-entries.\r\nEach of the entries returned will have an empty subconstits list and will have appropriate\r\nbindings added to the bindings list.\r\n\r\n@param ENTRY\r\n\t\tchart-entry; the chart entry of which these subconstits are a part\r\n@return list; a list of entries with empty subconstit lists\r\n@unknown assumes that anything being parsed at this level is at depth 1\ngiven an entry, parse its subconstits, and return all of the resulting chart-entries.\nEach of the entries returned will have an empty subconstits list and will have appropriate\nbindings added to the bindings list.")
    public static final SubLObject parse_subconstit_list_alt(SubLObject entry, SubLObject depth, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subconstits = rtp_datastructures.rtp_chart_entry_subconstits(entry);
                SubLObject entry_list = list(entry);
                SubLObject int_result = NIL;
                SubLObject cdolist_list_var = subconstits;
                SubLObject subconstit = NIL;
                for (subconstit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subconstit = cdolist_list_var.first()) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt122$subconstit____S__, subconstit));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt123$present_subconstit____S__, subconstit));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt124$entry_list____S__, entry_list));
                    }
                    {
                        SubLObject cdolist_list_var_12 = entry_list;
                        SubLObject iter_entry = NIL;
                        for (iter_entry = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , iter_entry = cdolist_list_var_12.first()) {
                            if (NIL != rtp_type_checkers.rtp_template_categoryP(rtp_datastructures.subconstit_cat(subconstit), UNPROVIDED)) {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt125$inside_template_category__));
                                }
                                {
                                    SubLObject cat = rtp_datastructures.subconstit_cat(subconstit);
                                    SubLObject stryng = rtp_datastructures.subconstit_string(subconstit);
                                    SubLObject var = rtp_datastructures.subconstit_binding_var(subconstit);
                                    SubLObject start = rtp_datastructures.subconstit_start(subconstit);
                                    SubLObject end = rtp_datastructures.subconstit_end(subconstit);
                                    SubLObject sub_parses = com.cyc.cycjava.cycl.rtp.recognition.sem_parse_int(stryng, start, end, mt, cat, add(depth, ONE_INTEGER), UNPROVIDED);
                                    SubLObject temp_entry = NIL;
                                    SubLObject cdolist_list_var_13 = sub_parses;
                                    SubLObject parse = NIL;
                                    for (parse = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , parse = cdolist_list_var_13.first()) {
                                        temp_entry = rtp_datastructures.copy_rtp_entry(iter_entry);
                                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry).rest());
                                        rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry, cons(rtp_datastructures.rtp_make_binding(var, parse), rtp_datastructures.rtp_chart_entry_bindings(temp_entry)));
                                        int_result = cons(temp_entry, int_result);
                                    }
                                }
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt126$int_result____S__, int_result));
                                }
                            } else {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(ONE_INTEGER, list($$$inside_the_T));
                                }
                                {
                                    SubLObject template = rtp_datastructures.make_rtp_rule(rtp_datastructures.subconstit_cat(subconstit), list(list(rtp_datastructures.subconstit_cat(subconstit), rtp_datastructures.subconstit_binding_var(subconstit))), rtp_datastructures.subconstit_binding_var(subconstit));
                                    SubLObject sub_parses = com.cyc.cycjava.cycl.rtp.recognition.tp_match_template(template, rtp_datastructures.subconstit_string(subconstit), rtp_datastructures.subconstit_start(subconstit), rtp_datastructures.subconstit_end(subconstit), add(depth, ONE_INTEGER));
                                    SubLObject temp_entry = NIL;
                                    SubLObject cdolist_list_var_14 = sub_parses;
                                    SubLObject parse = NIL;
                                    for (parse = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , parse = cdolist_list_var_14.first()) {
                                        temp_entry = rtp_datastructures.copy_rtp_entry(iter_entry);
                                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry).rest());
                                        {
                                            SubLObject cdolist_list_var_15 = rtp_datastructures.rtp_chart_entry_bindings(parse);
                                            SubLObject binding = NIL;
                                            for (binding = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , binding = cdolist_list_var_15.first()) {
                                                rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry, cons(binding, rtp_datastructures.rtp_chart_entry_bindings(temp_entry)));
                                            }
                                        }
                                        int_result = cons(temp_entry, int_result);
                                    }
                                }
                            }
                        }
                    }
                    entry_list = int_result;
                    int_result = NIL;
                }
                return entry_list;
            }
        }
    }

    @LispMethod(comment = "given an entry, parse its subconstits, and return all of the resulting chart-entries.\r\nEach of the entries returned will have an empty subconstits list and will have appropriate\r\nbindings added to the bindings list.\r\n\r\n@param ENTRY\r\n\t\tchart-entry; the chart entry of which these subconstits are a part\r\n@return list; a list of entries with empty subconstit lists\r\n@unknown assumes that anything being parsed at this level is at depth 1\ngiven an entry, parse its subconstits, and return all of the resulting chart-entries.\nEach of the entries returned will have an empty subconstits list and will have appropriate\nbindings added to the bindings list.")
    public static SubLObject parse_subconstit_list(final SubLObject entry, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subconstits = rtp_datastructures.rtp_chart_entry_subconstits(entry);
        SubLObject entry_list = list(entry);
        SubLObject int_result = NIL;
        SubLObject cdolist_list_var = subconstits;
        SubLObject subconstit = NIL;
        subconstit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list($str121$subconstit____S__, subconstit));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list($str122$present_subconstit____S__, subconstit));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list($str123$entry_list____S__, entry_list));
            }
            SubLObject cdolist_list_var_$12 = entry_list;
            SubLObject iter_entry = NIL;
            iter_entry = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                if (NIL != rtp_type_checkers.rtp_template_categoryP(rtp_datastructures.subconstit_cat(subconstit), UNPROVIDED)) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($str124$inside_template_category__));
                    }
                    final SubLObject cat = rtp_datastructures.subconstit_cat(subconstit);
                    final SubLObject stryng = rtp_datastructures.subconstit_string(subconstit);
                    final SubLObject var = rtp_datastructures.subconstit_binding_var(subconstit);
                    final SubLObject start = rtp_datastructures.subconstit_start(subconstit);
                    final SubLObject end = rtp_datastructures.subconstit_end(subconstit);
                    final SubLObject sub_parses = sem_parse_int(stryng, start, end, mt, cat, add(depth, ONE_INTEGER), UNPROVIDED);
                    SubLObject temp_entry = NIL;
                    SubLObject cdolist_list_var_$13 = sub_parses;
                    SubLObject parse = NIL;
                    parse = cdolist_list_var_$13.first();
                    while (NIL != cdolist_list_var_$13) {
                        temp_entry = rtp_datastructures.copy_rtp_entry(iter_entry);
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry).rest());
                        rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry, cons(rtp_datastructures.rtp_make_binding(var, parse), rtp_datastructures.rtp_chart_entry_bindings(temp_entry)));
                        int_result = cons(temp_entry, int_result);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        parse = cdolist_list_var_$13.first();
                    } 
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        rtp_tracer_output(TWO_INTEGER, list($str125$int_result____S__, int_result));
                    }
                } else {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        rtp_tracer_output(ONE_INTEGER, list($$$inside_the_T));
                    }
                    final SubLObject template = rtp_datastructures.make_rtp_rule(rtp_datastructures.subconstit_cat(subconstit), list(list(rtp_datastructures.subconstit_cat(subconstit), rtp_datastructures.subconstit_binding_var(subconstit))), rtp_datastructures.subconstit_binding_var(subconstit));
                    final SubLObject sub_parses2 = tp_match_template(template, rtp_datastructures.subconstit_string(subconstit), rtp_datastructures.subconstit_start(subconstit), rtp_datastructures.subconstit_end(subconstit), add(depth, ONE_INTEGER));
                    SubLObject temp_entry2 = NIL;
                    SubLObject cdolist_list_var_$14 = sub_parses2;
                    SubLObject parse2 = NIL;
                    parse2 = cdolist_list_var_$14.first();
                    while (NIL != cdolist_list_var_$14) {
                        temp_entry2 = rtp_datastructures.copy_rtp_entry(iter_entry);
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry2, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry2).rest());
                        SubLObject cdolist_list_var_$15 = rtp_datastructures.rtp_chart_entry_bindings(parse2);
                        SubLObject binding = NIL;
                        binding = cdolist_list_var_$15.first();
                        while (NIL != cdolist_list_var_$15) {
                            rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry2, cons(binding, rtp_datastructures.rtp_chart_entry_bindings(temp_entry2)));
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            binding = cdolist_list_var_$15.first();
                        } 
                        int_result = cons(temp_entry2, int_result);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        parse2 = cdolist_list_var_$14.first();
                    } 
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                iter_entry = cdolist_list_var_$12.first();
            } 
            entry_list = int_result;
            int_result = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            subconstit = cdolist_list_var.first();
        } 
        return entry_list;
    }/**
     * given an entry, parse its subconstits, and return all of the resulting chart-entries.
     * Each of the entries returned will have an empty subconstits list and will have appropriate
     * bindings added to the bindings list.
     *
     * @param ENTRY
     * 		chart-entry; the chart entry of which these subconstits are a part
     * @return list; a list of entries with empty subconstit lists
     * @unknown assumes that anything being parsed at this level is at depth 1
     */


    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list of cycl-formulas corresponding to all possible permutations of the
    bindings specified in ENTRY.
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list of cycl-formulas corresponding to all possible permutations of the\r\nbindings specified in ENTRY.")
    public static final SubLObject tp_bind_entry_alt(SubLObject entry) {
        {
            SubLObject init_sem = rtp_datastructures.rtp_chart_entry_sem(entry);
            SubLObject init_bindings = rtp_datastructures.rtp_chart_entry_bindings(entry);
            SubLObject results = NIL;
            if (NIL == init_bindings) {
                return list(init_sem);
            } else {
                {
                    SubLObject new_entry = rtp_datastructures.copy_rtp_entry(entry);
                    SubLObject binding = rtp_datastructures.rtp_chart_entry_bindings(new_entry).first();
                    SubLObject binding_var = rtp_datastructures.rtp_binding_var(binding);
                    SubLObject binding_val = rtp_datastructures.rtp_binding_vals(binding);
                    rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, rtp_datastructures.rtp_chart_entry_bindings(new_entry).rest());
                    if (binding_val.isAtom()) {
                        binding_val = list(binding_val);
                    }
                    {
                        SubLObject cdolist_list_var = binding_val;
                        SubLObject val = NIL;
                        for (val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , val = cdolist_list_var.first()) {
                            {
                                SubLObject bound_entry = rtp_datastructures.copy_rtp_entry(new_entry);
                                rtp_datastructures._csetf_rtp_chart_entry_sem(bound_entry, com.cyc.cycjava.cycl.rtp.recognition.substitute_bindings(val, binding_var, init_sem));
                                results = append(com.cyc.cycjava.cycl.rtp.recognition.tp_bind_entry(bound_entry), results);
                            }
                        }
                    }
                }
                return results;
            }
        }
    }

    /**
     *
     *
     * @param ENTRY
    rtp-chart-entry
     * 		
     * @return list; a list of cycl-formulas corresponding to all possible permutations of the
    bindings specified in ENTRY.
     */
    @LispMethod(comment = "@param ENTRY\nrtp-chart-entry\r\n\t\t\r\n@return list; a list of cycl-formulas corresponding to all possible permutations of the\r\nbindings specified in ENTRY.")
    public static SubLObject tp_bind_entry(final SubLObject entry) {
        final SubLObject init_sem = rtp_datastructures.rtp_chart_entry_sem(entry);
        final SubLObject init_bindings = rtp_datastructures.rtp_chart_entry_bindings(entry);
        SubLObject results = NIL;
        if (NIL == init_bindings) {
            return list(init_sem);
        }
        final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(entry);
        final SubLObject binding = rtp_datastructures.rtp_chart_entry_bindings(new_entry).first();
        final SubLObject binding_var = rtp_datastructures.rtp_binding_var(binding);
        SubLObject binding_val = rtp_datastructures.rtp_binding_vals(binding);
        rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, rtp_datastructures.rtp_chart_entry_bindings(new_entry).rest());
        if (binding_val.isAtom()) {
            binding_val = list(binding_val);
        }
        SubLObject cdolist_list_var = binding_val;
        SubLObject val = NIL;
        val = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject bound_entry = rtp_datastructures.copy_rtp_entry(new_entry);
            rtp_datastructures._csetf_rtp_chart_entry_sem(bound_entry, substitute_bindings(val, binding_var, init_sem));
            results = append(tp_bind_entry(bound_entry), results);
            cdolist_list_var = cdolist_list_var.rest();
            val = cdolist_list_var.first();
        } 
        return results;
    }

    /**
     * handle substitution of variable bindings, including the case where the semantics is not a list.
     *
     * @param VAL
     * 		atom; the value to be substituted into the semantics
     * @param BINDING-VAR
     * 		atom; the variable which will be replaced in the semantics
     * @param SEM
     * 		atom or list; the semantics which will undergo the substitution
     * @return atom or list; the result of substitution of VAL into SEM
     */
    @LispMethod(comment = "handle substitution of variable bindings, including the case where the semantics is not a list.\r\n\r\n@param VAL\r\n\t\tatom; the value to be substituted into the semantics\r\n@param BINDING-VAR\r\n\t\tatom; the variable which will be replaced in the semantics\r\n@param SEM\r\n\t\tatom or list; the semantics which will undergo the substitution\r\n@return atom or list; the result of substitution of VAL into SEM")
    public static final SubLObject substitute_bindings_alt(SubLObject val, SubLObject binding_var, SubLObject sem) {
        if (sem.isList()) {
            return subst(val, binding_var, sem, UNPROVIDED, UNPROVIDED);
        } else {
            if (sem.equal(binding_var)) {
                return val;
            } else {
                return sem;
            }
        }
    }

    @LispMethod(comment = "handle substitution of variable bindings, including the case where the semantics is not a list.\r\n\r\n@param VAL\r\n\t\tatom; the value to be substituted into the semantics\r\n@param BINDING-VAR\r\n\t\tatom; the variable which will be replaced in the semantics\r\n@param SEM\r\n\t\tatom or list; the semantics which will undergo the substitution\r\n@return atom or list; the result of substitution of VAL into SEM")
    public static SubLObject substitute_bindings(final SubLObject val, final SubLObject binding_var, final SubLObject sem) {
        if (sem.isList()) {
            return subst(val, binding_var, sem, UNPROVIDED, UNPROVIDED);
        }
        if (sem.equal(binding_var)) {
            return val;
        }
        return sem;
    }/**
     * handle substitution of variable bindings, including the case where the semantics is not a list.
     *
     * @param VAL
     * 		atom; the value to be substituted into the semantics
     * @param BINDING-VAR
     * 		atom; the variable which will be replaced in the semantics
     * @param SEM
     * 		atom or list; the semantics which will undergo the substitution
     * @return atom or list; the result of substitution of VAL into SEM
     */


    /**
     * The main public entrance into the template parser
     *
     * @param SENTENCE
     * 		string; the sentence to be parsed
     * @param CAT
     * 		Cyc term; a spec of #$ParsingTemplateCategory
     * @param COMPLETE-PARSES-ONLY
     * 		boolean; do we want anything beside complete parses?
     * @return list; a list of cycl expressions parsed from SENTENCE
     */
    @LispMethod(comment = "The main public entrance into the template parser\r\n\r\n@param SENTENCE\r\n\t\tstring; the sentence to be parsed\r\n@param CAT\r\n\t\tCyc term; a spec of #$ParsingTemplateCategory\r\n@param COMPLETE-PARSES-ONLY\r\n\t\tboolean; do we want anything beside complete parses?\r\n@return list; a list of cycl expressions parsed from SENTENCE")
    public static final SubLObject sem_parse_alt(SubLObject sentence, SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        com.cyc.cycjava.cycl.rtp.recognition.ensure_sem_parse_initialized();
        {
            SubLObject tokenized_string = string_utilities.split_string(sentence, UNPROVIDED);
            SubLObject start = ZERO_INTEGER;
            SubLObject end = length(tokenized_string);
            return remove_duplicates(com.cyc.cycjava.cycl.rtp.recognition.sem_parse_int(tokenized_string, start, end, mt, cat, ZERO_INTEGER, complete_parses_only), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "The main public entrance into the template parser\r\n\r\n@param SENTENCE\r\n\t\tstring; the sentence to be parsed\r\n@param CAT\r\n\t\tCyc term; a spec of #$ParsingTemplateCategory\r\n@param COMPLETE-PARSES-ONLY\r\n\t\tboolean; do we want anything beside complete parses?\r\n@return list; a list of cycl expressions parsed from SENTENCE")
    public static SubLObject sem_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        ensure_sem_parse_initialized();
        final SubLObject tokenized_string = string_utilities.split_string(sentence, UNPROVIDED);
        final SubLObject start = ZERO_INTEGER;
        final SubLObject end = length(tokenized_string);
        return remove_duplicates(sem_parse_int(tokenized_string, start, end, mt, cat, ZERO_INTEGER, complete_parses_only), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * The main public entrance into the template parser
     *
     * @param SENTENCE
     * 		string; the sentence to be parsed
     * @param CAT
     * 		Cyc term; a spec of #$ParsingTemplateCategory
     * @param COMPLETE-PARSES-ONLY
     * 		boolean; do we want anything beside complete parses?
     * @return list; a list of cycl expressions parsed from SENTENCE
     */


    /**
     *
     *
     * @param SENTENCE
     * 		list; a list of strings containing the words of the sentence to be parsed
     * @param CAT
     * 		Cyc term; a spec of #$ParsingTemplateCategory
     * @param COMPLETE-PARSES-ONLY
     * 		boolean; do we want anything beside complete parses?
     * @return list; a list of cycl expressions parsed from SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tlist; a list of strings containing the words of the sentence to be parsed\r\n@param CAT\r\n\t\tCyc term; a spec of #$ParsingTemplateCategory\r\n@param COMPLETE-PARSES-ONLY\r\n\t\tboolean; do we want anything beside complete parses?\r\n@return list; a list of cycl expressions parsed from SENTENCE")
    public static final SubLObject sem_parse_int_alt(SubLObject sentence, SubLObject start, SubLObject end, SubLObject mt, SubLObject cat, SubLObject depth, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entries = com.cyc.cycjava.cycl.rtp.recognition.rec_parse(cat, sentence, start, end, depth, mt);
                SubLObject sem = NIL;
                SubLObject result = NIL;
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt128$entries____S__, entries));
                }
                {
                    SubLObject cdolist_list_var = entries;
                    SubLObject entry = NIL;
                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                            com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt129$push_sem_from__S__));
                        }
                        sem = com.cyc.cycjava.cycl.rtp.recognition.tp_bind_entry(entry);
                        {
                            SubLObject cdolist_list_var_16 = sem;
                            SubLObject sem_temp = NIL;
                            for (sem_temp = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , sem_temp = cdolist_list_var_16.first()) {
                                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                                    com.cyc.cycjava.cycl.rtp.recognition.rtp_tracer_output(TWO_INTEGER, list($str_alt130$pushing__S__, sem));
                                }
                                result = cons(sem_temp, result);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param SENTENCE
     * 		list; a list of strings containing the words of the sentence to be parsed
     * @param CAT
     * 		Cyc term; a spec of #$ParsingTemplateCategory
     * @param COMPLETE-PARSES-ONLY
     * 		boolean; do we want anything beside complete parses?
     * @return list; a list of cycl expressions parsed from SENTENCE
     */
    @LispMethod(comment = "@param SENTENCE\r\n\t\tlist; a list of strings containing the words of the sentence to be parsed\r\n@param CAT\r\n\t\tCyc term; a spec of #$ParsingTemplateCategory\r\n@param COMPLETE-PARSES-ONLY\r\n\t\tboolean; do we want anything beside complete parses?\r\n@return list; a list of cycl expressions parsed from SENTENCE")
    public static SubLObject sem_parse_int(final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject mt, SubLObject cat, SubLObject depth, SubLObject complete_parses_only) {
        if (cat == UNPROVIDED) {
            cat = $$STemplate;
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (complete_parses_only == UNPROVIDED) {
            complete_parses_only = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entries = rec_parse(cat, sentence, start, end, depth, mt);
        SubLObject sem = NIL;
        SubLObject result = NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
            rtp_tracer_output(TWO_INTEGER, list($str127$entries____S__, entries));
        }
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                rtp_tracer_output(TWO_INTEGER, list($str128$push_sem_from__S__));
            }
            SubLObject cdolist_list_var_$16;
            sem = cdolist_list_var_$16 = tp_bind_entry(entry);
            SubLObject sem_temp = NIL;
            sem_temp = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    rtp_tracer_output(TWO_INTEGER, list($str129$pushing__S__, sem));
                }
                result = cons(sem_temp, result);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                sem_temp = cdolist_list_var_$16.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject declare_recognition_file() {
        declareMacro("rtp_trace_out", "RTP-TRACE-OUT");
        declareFunction("rtp_tracer_output", "RTP-TRACER-OUTPUT", 2, 0, false);
        declareFunction("rtp_trace", "RTP-TRACE", 0, 1, false);
        declareFunction("ensure_sem_parse_initialized", "ENSURE-SEM-PARSE-INITIALIZED", 0, 0, false);
        declareFunction("template_parse", "TEMPLATE-PARSE", 2, 2, false);
        declareFunction("categorizing_template_parse", "CATEGORIZING-TEMPLATE-PARSE", 2, 2, false);
        declareFunction("reformulate_jointemplatecomponents", "REFORMULATE-JOINTEMPLATECOMPONENTS", 1, 0, false);
        declareFunction("joinable_template_component_formulaP", "JOINABLE-TEMPLATE-COMPONENT-FORMULA?", 1, 0, false);
        declareFunction("transform_rewrite_sequence", "TRANSFORM-REWRITE-SEQUENCE", 1, 0, false);
        declareFunction("rewrite_assemble_phrase", "REWRITE-ASSEMBLE-PHRASE", 1, 0, false);
        declareFunction("join_tcomponents_and_rewrite_sequence", "JOIN-TCOMPONENTS-AND-REWRITE-SEQUENCE", 3, 0, false);
        declareFunction("jointemplate_pattern_type", "JOINTEMPLATE-PATTERN-TYPE", 1, 0, false);
        declareFunction("transform_jointemplatecomponents", "TRANSFORM-JOINTEMPLATECOMPONENTS", 1, 0, false);
        declareFunction("expressions_for_pattern_transform", "EXPRESSIONS-FOR-PATTERN-TRANSFORM", 2, 0, false);
        declareFunction("rec_parse", "REC-PARSE", 6, 0, false);
        declareFunction("rec_parse_int", "REC-PARSE-INT", 6, 0, false);
        declareFunction("filter_semantic_tests", "FILTER-SEMANTIC-TESTS", 1, 1, false);
        declareFunction("filter_rules", "FILTER-RULES", 3, 2, false);
        declareFunction("templates_potentially_applicable_to_word_list", "TEMPLATES-POTENTIALLY-APPLICABLE-TO-WORD-LIST", 3, 0, false);
        declareFunction("check_partial_ordering", "CHECK-PARTIAL-ORDERING", 2, 0, false);
        declareFunction("remove_mt_from_results", "REMOVE-MT-FROM-RESULTS", 1, 0, false);
        declareFunction("add_mt_to_results", "ADD-MT-TO-RESULTS", 2, 0, false);
        declareFunction("template_can_precede", "TEMPLATE-CAN-PRECEDE", 2, 0, false);
        declareFunction("initialize_partial_orders_hash", "INITIALIZE-PARTIAL-ORDERS-HASH", 0, 0, false);
        declareFunction("counted_sethash", "COUNTED-SETHASH", 2, 0, false);
        declareFunction("get_counted_sethash_entry_count", "GET-COUNTED-SETHASH-ENTRY-COUNT", 1, 0, false);
        declareFunction("template_item_from_rtp_entry", "TEMPLATE-ITEM-FROM-RTP-ENTRY", 1, 0, false);
        declareFunction("eat_a_template_item", "EAT-A-TEMPLATE-ITEM", 1, 0, false);
        declareFunction("tp_match_template", "TP-MATCH-TEMPLATE", 5, 0, false);
        declareFunction("filter_sem_tests", "FILTER-SEM-TESTS", 1, 0, false);
        declareFunction("match_string_template_item", "MATCH-STRING-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("match_wu_template_item", "MATCH-WU-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("match_token_template_item", "MATCH-TOKEN-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("match_nl_agr_pred_template_item", "MATCH-NL-AGR-PRED-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("match_speech_part_template_item", "MATCH-SPEECH-PART-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("words_from_word_spans", "WORDS-FROM-WORD-SPANS", 1, 0, false);
        declareFunction("match_optional_template_item", "MATCH-OPTIONAL-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("clear_match_recursive_template_item", "CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM", 0, 0, false);
        declareFunction("match_recursive_template_item", "MATCH-RECURSIVE-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("get_sem_test_for_var", "GET-SEM-TEST-FOR-VAR", 2, 0, false);
        declareFunction("get_sem_test_for_var_from_formula", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA", 2, 0, false);
        declareFunction("get_sem_test_for_var_from_formula_int", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA-INT", 2, 0, false);
        declareFunction("failed_subconst_item", "FAILED-SUBCONST-ITEM", 4, 0, false);
        declareFunction("prefixes_before_item", "PREFIXES-BEFORE-ITEM", 4, 0, false);
        declareFunction("match_template_item", "MATCH-TEMPLATE-ITEM", 2, 0, false);
        declareFunction("find_stop_item", "FIND-STOP-ITEM", 1, 0, false);
        declareFunction("tp_split", "TP-SPLIT", 5, 0, false);
        declareFunction("rtp_compute_permutations", "RTP-COMPUTE-PERMUTATIONS", 3, 0, false);
        declareFunction("rtp_compute_recursive_locations", "RTP-COMPUTE-RECURSIVE-LOCATIONS", 3, 0, false);
        declareFunction("compute_matches", "COMPUTE-MATCHES", 5, 0, false);
        declareFunction("valid_constits_p", "VALID-CONSTITS-P", 1, 1, false);
        declareFunction("compute_matches_int", "COMPUTE-MATCHES-INT", 5, 0, false);
        declareFunction("build_located_matches", "BUILD-LOCATED-MATCHES", 4, 0, false);
        declareFunction("compute_constit_locations", "COMPUTE-CONSTIT-LOCATIONS", 3, 0, false);
        declareFunction("process_perm_non_recursive", "PROCESS-PERM-NON-RECURSIVE", 2, 0, false);
        declareFunction("find_rtp_matches", "FIND-RTP-MATCHES", 4, 0, false);
        declareFunction("process_perm_recursive", "PROCESS-PERM-RECURSIVE", 1, 0, false);
        declareFunction("new_rtp_perm_state", "NEW-RTP-PERM-STATE", 0, 0, false);
        declareFunction("make_rtp_perm_state", "MAKE-RTP-PERM-STATE", 4, 0, false);
        declareFunction("rtp_perm_state_unused_words", "RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        declareFunction("set_rtp_perm_state_unused_words", "SET-RTP-PERM-STATE-UNUSED-WORDS", 2, 0, false);
        declareFunction("pop_rtp_perm_state_unused_words", "POP-RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        declareFunction("rtp_perm_state_unused_template", "RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        declareFunction("pop_rtp_perm_state_unused_template", "POP-RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        declareFunction("set_rtp_perm_state_unused_template", "SET-RTP-PERM-STATE-UNUSED-TEMPLATE", 2, 0, false);
        declareFunction("rtp_perm_state_first_unused_template_item", "RTP-PERM-STATE-FIRST-UNUSED-TEMPLATE-ITEM", 1, 0, false);
        declareFunction("set_rtp_perm_state_matched", "SET-RTP-PERM-STATE-MATCHED", 2, 0, false);
        declareFunction("rtp_perm_state_matched", "RTP-PERM-STATE-MATCHED", 1, 0, false);
        declareFunction("push_to_end_rtp_matched_constit", "PUSH-TO-END-RTP-MATCHED-CONSTIT", 2, 0, false);
        declareFunction("rtp_perm_state_start_index", "RTP-PERM-STATE-START-INDEX", 1, 0, false);
        declareFunction("set_rtp_perm_state_start_index", "SET-RTP-PERM-STATE-START-INDEX", 2, 0, false);
        declareFunction("rtp_perm_state_completeP", "RTP-PERM-STATE-COMPLETE?", 1, 0, false);
        declareFunction("no_unused_wordsP", "NO-UNUSED-WORDS?", 1, 0, false);
        declareFunction("no_unused_template_itemsP", "NO-UNUSED-TEMPLATE-ITEMS?", 1, 0, false);
        declareFunction("make_unlocated_rtp_matched_constit", "MAKE-UNLOCATED-RTP-MATCHED-CONSTIT", 1, 0, false);
        declareFunction("unlocated_rtp_matched_constitP", "UNLOCATED-RTP-MATCHED-CONSTIT?", 1, 0, false);
        declareFunction("make_rtp_matched_constit", "MAKE-RTP-MATCHED-CONSTIT", 4, 0, false);
        declareFunction("rtp_matched_constit_words", "RTP-MATCHED-CONSTIT-WORDS", 1, 0, false);
        declareFunction("set_rtp_matched_constit_words", "SET-RTP-MATCHED-CONSTIT-WORDS", 2, 0, false);
        declareFunction("rtp_matched_constit_template", "RTP-MATCHED-CONSTIT-TEMPLATE", 1, 0, false);
        declareFunction("set_rtp_matched_constit_template", "SET-RTP-MATCHED-CONSTIT-TEMPLATE", 2, 0, false);
        declareFunction("rtp_matched_constit_start", "RTP-MATCHED-CONSTIT-START", 1, 0, false);
        declareFunction("set_rtp_matched_constit_start", "SET-RTP-MATCHED-CONSTIT-START", 2, 0, false);
        declareFunction("rtp_matched_constit_end", "RTP-MATCHED-CONSTIT-END", 1, 0, false);
        declareFunction("set_rtp_matched_constit_end", "SET-RTP-MATCHED-CONSTIT-END", 2, 0, false);
        declareFunction("reverse_and_add_template", "REVERSE-AND-ADD-TEMPLATE", 2, 0, false);
        declareFunction("remove_kleene_words", "REMOVE-KLEENE-WORDS", 2, 0, false);
        declareFunction("remove_kleene_words_int", "REMOVE-KLEENE-WORDS-INT", 1, 0, false);
        declareFunction("completed_entries", "COMPLETED-ENTRIES", 2, 0, false);
        declareFunction("completed_entryP", "COMPLETED-ENTRY?", 2, 0, false);
        declareFunction("print_entries", "PRINT-ENTRIES", 1, 0, false);
        declareFunction("tp_match_wordXpos", "TP-MATCH-WORD&POS", 2, 0, false);
        declareFunction("tp_match_wordXpos_wXwords", "TP-MATCH-WORD&POS-W/WORDS", 2, 0, false);
        declareFunction("rtp_string_is_pos_on_wuP", "RTP-STRING-IS-POS-ON-WU?", 3, 0, false);
        declareFunction("tp_match_wordXpred", "TP-MATCH-WORD&PRED", 2, 0, false);
        declareFunction("tp_match_wordXpred_wXwords", "TP-MATCH-WORD&PRED-W/WORDS", 2, 0, false);
        declareFunction("rtp_string_is_pred_on_wuP", "RTP-STRING-IS-PRED-ON-WU?", 3, 0, false);
        declareFunction("tp_match_tokenP", "TP-MATCH-TOKEN?", 2, 0, false);
        declareFunction("tp_optional_words", "TP-OPTIONAL-WORDS", 2, 0, false);
        declareFunction("tp_require_some", "TP-REQUIRE-SOME", 2, 0, false);
        declareFunction("tp_match_token", "TP-MATCH-TOKEN", 2, 0, false);
        declareFunction("tp_match_pos", "TP-MATCH-POS", 2, 0, false);
        declareFunction("tp_match_pred", "TP-MATCH-PRED", 2, 0, false);
        declareFunction("expand_word_items_in_list", "EXPAND-WORD-ITEMS-IN-LIST", 1, 0, false);
        declareFunction("clear_expand_word_items_in_list_int", "CLEAR-EXPAND-WORD-ITEMS-IN-LIST-INT", 0, 0, false);
        declareFunction("remove_expand_word_items_in_list_int", "REMOVE-EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        declareFunction("expand_word_items_in_list_int_internal", "EXPAND-WORD-ITEMS-IN-LIST-INT-INTERNAL", 1, 0, false);
        declareFunction("expand_word_items_in_list_int", "EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        declareFunction("remove_optional_strings", "REMOVE-OPTIONAL-STRINGS", 2, 1, false);
        declareFunction("remove_X_words", "REMOVE-+-WORDS", 2, 1, false);
        declareFunction("remove_a_group", "REMOVE-A-GROUP", 2, 1, false);
        declareFunction("word_match", "WORD-MATCH", 2, 0, false);
        declareFunction("remove_optional_one", "REMOVE-OPTIONAL-ONE", 2, 1, false);
        declareFunction("remove_require_one", "REMOVE-REQUIRE-ONE", 2, 1, false);
        declareFunction("remove_one", "REMOVE-ONE", 2, 1, false);
        declareFunction("remove_optional_words", "REMOVE-OPTIONAL-WORDS", 2, 1, false);
        declareFunction("fully_bound_entryP", "FULLY-BOUND-ENTRY?", 1, 0, false);
        declareFunction("reset_all_recognizer_caches", "RESET-ALL-RECOGNIZER-CACHES", 0, 0, false);
        declareFunction("parse_subconstit_list", "PARSE-SUBCONSTIT-LIST", 3, 0, false);
        declareFunction("tp_bind_entry", "TP-BIND-ENTRY", 1, 0, false);
        declareFunction("substitute_bindings", "SUBSTITUTE-BINDINGS", 3, 0, false);
        declareFunction("sem_parse", "SEM-PARSE", 2, 2, false);
        declareFunction("sem_parse_int", "SEM-PARSE-INT", 4, 3, false);
        return NIL;
    }

    public static SubLObject init_recognition_file() {
        defparameter("*RTP-USE-CACHES*", T);
        deflexical("*RETURN-EARLY*", T);
        deflexical("*GREEDY-KLEENE*", T);
        deflexical("*RTP-PERFORM-SEMANTIC-TESTS*", $EXTERNAL);
        defparameter("*PARSE-ENTIRE-STRING*", T);
        defconstant("*COMPLETED-WORDS-LIST*", $list1);
        defparameter("*PERFORM-TEMPLATE-COMPONENT-JOIN*", T);
        defparameter("*TEMPLATE-PARSE-INCLUDES-TEMPLATE-CATEGORIES*", NIL);
        defparameter("*COUNTED-TEMPLATE-SET*", NIL);
        deflexical("*RTP-DISPLAY-FILTER-RULES*", NIL);
        defparameter("*USE-BEST-TEMPLATES-FIRST*", NIL);
        defparameter("*PARTIAL-ORDERS-HASH*", make_hash_table(TWENTY_INTEGER, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*EXPAND-WORD-ITEMS-IN-LIST-INT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_recognition_file() {
        memoization_state.note_globally_cached_function(EXPAND_WORD_ITEMS_IN_LIST_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_recognition_file();
    }

    @Override
    public void initializeVariables() {
        init_recognition_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_recognition_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(makeKeyword("COMPLETE"));

    static private final SubLList $list_alt2 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));

    static private final SubLList $list_alt19 = list(reader_make_constant_shell("TheList"), reader_make_constant_shell("NPTemplate"), reader_make_constant_shell("VPTemplate"));

    static private final SubLString $str_alt25$results_of_first_pass____S__ = makeString("results of first pass:~&~S~&");

    static private final SubLString $str_alt26$working_on_entry1___S__ = makeString("working on entry1: ~S~&");

    static private final SubLString $str_alt27$fully_bound_entries____S__ = makeString("fully-bound entries = ~S~&");

    static private final SubLString $str_alt28$unbound_entries____S__ = makeString("unbound-entries = ~S~&");

    static private final SubLString $str_alt29$recurring_on___S__ = makeString("recurring on: ~S~&");

    static private final SubLString $str_alt32$FILTER_RULES___S__ = makeString("FILTER-RULES: ~S~%");

    static private final SubLString $str_alt36$_2_words___a_2_ = makeString("~2%words: ~a~2%");

    static private final SubLString $str_alt37$rule___a__transformation___a_2_ = makeString("rule: ~a~%transformation: ~a~2%");

    static private final SubLString $str_alt38$_2_ = makeString("~2%");

    static private final SubLString $str_alt46$split_sentence____S__ = makeString("split-sentence = ~S~&");

    static private final SubLString $str_alt47$at_top_of_cdolist__current_entrie = makeString("at top of cdolist, current-entries = ~S~&");

    static private final SubLString $str_alt48$top_entry____S__ = makeString("top entry = ~S~&");

    static private final SubLString $str_alt49$template_item____S__ = makeString("template-item = ~S~&");

    static private final SubLString $str_alt50$RTP_Chart_Entry_is_empty___ = makeString("RTP Chart Entry is empty.~&");

    static private final SubLString $str_alt51$Equal_to_completed_word_list__ = makeString("Equal to completed word list~&");

    static private final SubLString $str_alt52$No_hits_for_template_item__S__ = makeString("No hits for template item ~S~&");

    static private final SubLString $str_alt53$current_entries____S__ = makeString("current-entries = ~S~&");

    static private final SubLString $str_alt54$_________COMPLETED_ENTRIES_______ = makeString("~%~%***  COMPLETED ENTRIES  ***~%");

    static private final SubLList $list_alt56 = list(makeSymbol("DENOT"), makeSymbol("WORDS-EATEN"));

    static private final SubLString $str_alt57$adding_some_subconstits_for__S__ = makeString("adding some subconstits for ~S~&");

    static private final SubLString $str_alt58$____split_out____S_____template_r = makeString("*** split-out = ~S***~&template-rest = ~S~&");

    static private final SubLString $str_alt59$____splits____S_____ = makeString("*** splits = ~S***~&");

    static private final SubLString $str_alt60$lyst__S__ = makeString("lyst=~S~&");

    static private final SubLString $str_alt61$used_words____S__ = makeString("used-words = ~S~&");

    static private final SubLString $str_alt62$length_of_used_words____S__ = makeString("length of used-words = ~S~&");

    static private final SubLString $str_alt63$just_ate__S_words__ = makeString("just ate ~S words~&");

    static private final SubLString $str_alt64$words_in_entry____S__ = makeString("words in entry = ~S~&");

    static private final SubLString $str_alt65$subconstit_eaten____S__ = makeString("subconstit eaten = ~S~&");

    static private final SubLString $str_alt66$subconstit_is__A_recursive__ = makeString("subconstit is ~A recursive~&");

    static private final SubLString $str_alt68$not_ = makeString("not ");

    static private final SubLString $str_alt69$pushing_a_new_subconstit___S__ = makeString("pushing a new subconstit: ~S~&");

    static private final SubLString $str_alt70$new_entry____A__ = makeString("new-entry = ~A~&");

    static private final SubLString $str_alt71$after_eating_subconstit__new_entr = makeString("after eating subconstit, new entry = ~S~&");

    static private final SubLString $str_alt72$failed_template____A__ = makeString("failed-template = ~A~&");

    static private final SubLString $str_alt73$new_entry__end_of_recursive_item_ = makeString("new entry (end of recursive-item?) = ~S~&");

    static private final SubLString $str_alt74$pushing_entry_at_end_of_recursive = makeString("pushing entry at end of recursive item~%");

    static private final SubLString $str_alt77$sent_invalid_args___S__S__to_MATC = makeString("sent invalid args (~S ~S) to MATCH-TEMPLATE-ITEM");

    static private final SubLString $str_alt78$template_remainder____S__stop_ite = makeString("template-remainder = ~S~&stop-item = ~S~& stop-index = ~S~&stop-index-template = ~S~&");

    static private final SubLString $str_alt79$stop_remainder____S__template_unu = makeString("stop-remainder = ~S~&template-unused=~S~&words=~S~&words-before-stop = ~S~&kleene-removed-lists = ~S~&");

    static private final SubLString $str_alt80$item____S__original_words____S__ = makeString("item = ~S~&original-words = ~S~&");

    static private final SubLString $str_alt81$single_const_lists____S__ = makeString("single-const-lists = ~S~&");

    static private final SubLString $str_alt82$lyst____S__result____S__ = makeString("lyst = ~S~&result = ~S~%");

    static private final SubLString $str_alt84$incomplete_states____S__ = makeString("incomplete-states = ~S~%");

    static private final SubLString $str_alt85$present_state____S__ = makeString("present-state = ~S~%");

    static private final SubLString $str_alt86$call_to_compute_matches_with_an_e = makeString("call to compute-matches with an empty match-list");

    static private final SubLString $str_alt93$x____S__ = makeString("x = ~S~%");

    static private final SubLString $str_alt94$intermed_words____S__first_first_ = makeString("intermed-words = ~S~%first-first = ~S~%");

    static private final SubLString $str_alt95$sent_an_unexpanded_item___S__to_f = makeString("sent an unexpanded item (~S) to find-rtp-matches");

    static private final SubLString $str_alt96$sent_invalid_item__S_to_find_rtp_ = makeString("sent invalid item ~S to find-rtp-matches");

    static private final SubLString $str_alt98$entered_remove_kleene_words_with_ = makeString("entered remove-kleene-words with no words~&");

    static private final SubLString $str_alt99$removed_list____S__ = makeString("removed-list = ~S~&");

    static private final SubLString $str_alt100$_word_list__S____template__S____f = makeString("<word-list ~S>~&<template ~S>~&<first-item ~S>~&");

    static private final SubLString $str_alt101$words_________S__ = makeString("words     =  ~S~&");

    static private final SubLString $str_alt102$sem___________S__ = makeString("sem       =  ~S~&");

    static private final SubLString $str_alt103$bindings______S__ = makeString("bindings  =  ~S~&");

    static private final SubLString $str_alt104$subconsts_____S__ = makeString("subconsts =  ~S~&");

    public static final SubLSymbol $kw112$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt113$RTP__sent_in_a_non_function_to_RE = makeString("RTP: sent in a non-function to REMOVE-OPTIONAL-STRINGS");

    static private final SubLString $str_alt120$word_list____S____words____S__ = makeString("word-list = ~S~&*-words = ~S~&");

    static private final SubLString $str_alt122$subconstit____S__ = makeString("subconstit = ~S~&");

    static private final SubLString $str_alt123$present_subconstit____S__ = makeString("present-subconstit = ~S~&");

    static private final SubLString $str_alt124$entry_list____S__ = makeString("entry-list = ~S~&");

    static private final SubLString $str_alt125$inside_template_category__ = makeString("inside template-category~&");

    static private final SubLString $str_alt126$int_result____S__ = makeString("int-result = ~S~&");

    static private final SubLString $str_alt128$entries____S__ = makeString("entries = ~S~%");

    static private final SubLString $str_alt129$push_sem_from__S__ = makeString("push sem from ~S~&");

    static private final SubLString $str_alt130$pushing__S__ = makeString("pushing ~S~&");
}

/**
 * Total time: 561 ms
 */
