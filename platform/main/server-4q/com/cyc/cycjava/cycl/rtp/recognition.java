package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.standard_tokenization;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
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


public final class recognition extends SubLTranslatedFile {
    public static final SubLFile me = new recognition();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.recognition";

    public static final String myFingerPrint = "4b3fbae1b227daac704309bc89d864d7e4fc742941deefe6dd388fd3b46b23af";

    // defparameter
    // Definitions
    // should the parser use cached functions?
    public static final SubLSymbol $rtp_use_caches$ = makeSymbol("*RTP-USE-CACHES*");

    // deflexical
    // should the parser return before trying to parse subconstituents?
    public static final SubLSymbol $return_early$ = makeSymbol("*RETURN-EARLY*");

    // deflexical
    /**
     * should the parser eat up all possible *'ed items, or also return parses where
     * those are not eaten?
     */
    public static final SubLSymbol $greedy_kleene$ = makeSymbol("*GREEDY-KLEENE*");

    // deflexical
    /**
     * should semantic tests be performed internally by the parser, or externally,
     * by another mechanism
     */
    public static final SubLSymbol $rtp_perform_semantic_tests$ = makeSymbol("*RTP-PERFORM-SEMANTIC-TESTS*");

    // defparameter
    /**
     * should the parser require that an entire string be matched for it to return
     * an answer?
     */
    public static final SubLSymbol $parse_entire_string$ = makeSymbol("*PARSE-ENTIRE-STRING*");

    // defconstant
    /**
     * the word list to be used in chart-entries when the words have been exhausted
     */
    public static final SubLSymbol $completed_words_list$ = makeSymbol("*COMPLETED-WORDS-LIST*");

    // defparameter
    public static final SubLSymbol $perform_template_component_join$ = makeSymbol("*PERFORM-TEMPLATE-COMPONENT-JOIN*");

    // defparameter
    public static final SubLSymbol $template_parse_includes_template_categories$ = makeSymbol("*TEMPLATE-PARSE-INCLUDES-TEMPLATE-CATEGORIES*");

    // defparameter
    private static final SubLSymbol $counted_template_set$ = makeSymbol("*COUNTED-TEMPLATE-SET*");

    // deflexical
    private static final SubLSymbol $rtp_display_filter_rules$ = makeSymbol("*RTP-DISPLAY-FILTER-RULES*");

    // defparameter
    private static final SubLSymbol $use_best_templates_first$ = makeSymbol("*USE-BEST-TEMPLATES-FIRST*");

    // defparameter
    private static final SubLSymbol $partial_orders_hash$ = makeSymbol("*PARTIAL-ORDERS-HASH*");





    public static final SubLList $list1 = list(makeKeyword("COMPLETE"));

    public static final SubLList $list2 = list(makeSymbol("LEVEL"), makeSymbol("&REST"), makeSymbol("OPTIONS"));



    public static final SubLSymbol $sym4$__ = makeSymbol(">=");

    public static final SubLSymbol $rtp_trace_level$ = makeSymbol("*RTP-TRACE-LEVEL*");

    public static final SubLSymbol RTP_TRACER_OUTPUT = makeSymbol("RTP-TRACER-OUTPUT");





    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));

    private static final SubLObject $$Simply = reader_make_constant_shell(makeString("Simply"));

    private static final SubLObject $$joinTemplateComponents = reader_make_constant_shell(makeString("joinTemplateComponents"));



    public static final SubLSymbol FILTER_SEMANTIC_TESTS = makeSymbol("FILTER-SEMANTIC-TESTS");

    public static final SubLSymbol $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_ = makeSymbol("JOINABLE-TEMPLATE-COMPONENT-FORMULA?");

    public static final SubLSymbol TRANSFORM_JOINTEMPLATECOMPONENTS = makeSymbol("TRANSFORM-JOINTEMPLATECOMPONENTS");

    private static final SubLObject $$RewriteSequenceFn = reader_make_constant_shell(makeString("RewriteSequenceFn"));

    private static final SubLObject $$AssemblePhraseFn = reader_make_constant_shell(makeString("AssemblePhraseFn"));



    public static final SubLList $list19 = list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("NPTemplate")), reader_make_constant_shell(makeString("VPTemplate")));

    private static final SubLSymbol $S_NP_VP = makeKeyword("S-NP-VP");

    private static final SubLSymbol $SBAR_WHNP_S = makeKeyword("SBAR-WHNP-S");

    private static final SubLObject $$TheSentenceSubject = reader_make_constant_shell(makeString("TheSentenceSubject"));



    private static final SubLObject $$TheGappedTerm = reader_make_constant_shell(makeString("TheGappedTerm"));

    public static final SubLString $str25$results_of_first_pass____S__ = makeString("results of first pass:~&~S~&");

    public static final SubLString $str26$working_on_entry1___S__ = makeString("working on entry1: ~S~&");

    public static final SubLString $str27$fully_bound_entries____S__ = makeString("fully-bound entries = ~S~&");

    public static final SubLString $str28$unbound_entries____S__ = makeString("unbound-entries = ~S~&");

    public static final SubLString $str29$recurring_on___S__ = makeString("recurring on: ~S~&");





    public static final SubLString $str32$FILTER_RULES___S__ = makeString("FILTER-RULES: ~S~%");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol $sym34$_ = makeSymbol(">");

    public static final SubLSymbol GET_COUNTED_SETHASH_ENTRY_COUNT = makeSymbol("GET-COUNTED-SETHASH-ENTRY-COUNT");

    public static final SubLString $str36$_2_words___a_2_ = makeString("~2%words: ~a~2%");

    public static final SubLString $str37$rule___a__transformation___a_2_ = makeString("rule: ~a~%transformation: ~a~2%");

    public static final SubLString $str38$_2_ = makeString("~2%");



    public static final SubLSymbol TEMPLATE_RULE_ASSERTION = makeSymbol("TEMPLATE-RULE-ASSERTION");

    public static final SubLSymbol TEMPLATE_CAN_PRECEDE = makeSymbol("TEMPLATE-CAN-PRECEDE");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$templatePrecedes = reader_make_constant_shell(makeString("templatePrecedes"));

    public static final SubLString $str46$split_sentence____S__ = makeString("split-sentence = ~S~&");

    public static final SubLString $str47$at_top_of_cdolist__current_entrie = makeString("at top of cdolist, current-entries = ~S~&");

    public static final SubLString $str48$top_entry____S__ = makeString("top entry = ~S~&");

    public static final SubLString $str49$template_item____S__ = makeString("template-item = ~S~&");

    public static final SubLString $str50$RTP_Chart_Entry_is_empty___ = makeString("RTP Chart Entry is empty.~&");

    public static final SubLString $str51$Equal_to_completed_word_list__ = makeString("Equal to completed word list~&");

    public static final SubLString $str52$No_hits_for_template_item__S__ = makeString("No hits for template item ~S~&");

    public static final SubLString $str53$current_entries____S__ = makeString("current-entries = ~S~&");

    public static final SubLString $str54$_________COMPLETED_ENTRIES_______ = makeString("~%~%***  COMPLETED ENTRIES  ***~%");



    public static final SubLList $list56 = list(makeSymbol("DENOT"), makeSymbol("WORDS-EATEN"));

    public static final SubLString $str57$adding_some_subconstits_for__S__ = makeString("adding some subconstits for ~S~&");

    public static final SubLString $str58$____split_out____S_____template_r = makeString("*** split-out = ~S***~&template-rest = ~S~&");

    public static final SubLString $str59$____splits____S_____ = makeString("*** splits = ~S***~&");

    public static final SubLString $str60$lyst__S__ = makeString("lyst=~S~&");

    public static final SubLString $str61$used_words____S__ = makeString("used-words = ~S~&");

    public static final SubLString $str62$length_of_used_words____S__ = makeString("length of used-words = ~S~&");

    public static final SubLString $str63$just_ate__S_words__ = makeString("just ate ~S words~&");

    public static final SubLString $str64$words_in_entry____S__ = makeString("words in entry = ~S~&");

    public static final SubLString $str65$subconstit_eaten____S__ = makeString("subconstit eaten = ~S~&");

    public static final SubLString $str66$subconstit_is__A_recursive__ = makeString("subconstit is ~A recursive~&");

    public static final SubLString $str67$ = makeString("");

    public static final SubLString $$$not_ = makeString("not ");

    public static final SubLString $str69$pushing_a_new_subconstit___S__ = makeString("pushing a new subconstit: ~S~&");

    public static final SubLString $str70$new_entry____A__ = makeString("new-entry = ~A~&");

    public static final SubLString $str71$after_eating_subconstit__new_entr = makeString("after eating subconstit, new entry = ~S~&");

    public static final SubLString $str72$failed_template____A__ = makeString("failed-template = ~A~&");

    public static final SubLString $str73$new_entry__end_of_recursive_item_ = makeString("new entry (end of recursive-item?) = ~S~&");

    public static final SubLString $str74$pushing_entry_at_end_of_recursive = makeString("pushing entry at end of recursive item~%");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLString $str77$sent_invalid_args___S__S__to_MATC = makeString("sent invalid args (~S ~S) to MATCH-TEMPLATE-ITEM");

    public static final SubLString $str78$template_remainder____S__stop_ite = makeString("template-remainder = ~S~&stop-item = ~S~& stop-index = ~S~&stop-index-template = ~S~&");

    public static final SubLString $str79$stop_remainder____S__template_unu = makeString("stop-remainder = ~S~&template-unused=~S~&words=~S~&words-before-stop = ~S~&kleene-removed-lists = ~S~&");

    public static final SubLString $str80$item____S__original_words____S__ = makeString("item = ~S~&original-words = ~S~&");

    public static final SubLString $str81$single_const_lists____S__ = makeString("single-const-lists = ~S~&");

    public static final SubLString $str82$lyst____S__result____S__ = makeString("lyst = ~S~&result = ~S~%");

    public static final SubLSymbol EXPAND_WORD_ITEMS_IN_LIST = makeSymbol("EXPAND-WORD-ITEMS-IN-LIST");

    public static final SubLString $str84$incomplete_states____S__ = makeString("incomplete-states = ~S~%");

    public static final SubLString $str85$present_state____S__ = makeString("present-state = ~S~%");

    public static final SubLString $str86$call_to_compute_matches_with_an_e = makeString("call to compute-matches with an empty match-list");

    public static final SubLString $$$cond1 = makeString("cond1");

    public static final SubLString $$$cond2 = makeString("cond2");

    public static final SubLString $$$cond6 = makeString("cond6");

    public static final SubLString $$$cond3 = makeString("cond3");

    public static final SubLString $$$cond4 = makeString("cond4");

    public static final SubLString $$$cond5 = makeString("cond5");

    public static final SubLString $str93$x____S__ = makeString("x = ~S~%");

    public static final SubLString $str94$intermed_words____S__first_first_ = makeString("intermed-words = ~S~%first-first = ~S~%");

    public static final SubLString $str95$sent_an_unexpanded_item___S__to_f = makeString("sent an unexpanded item (~S) to find-rtp-matches");

    public static final SubLString $str96$sent_invalid_item__S_to_find_rtp_ = makeString("sent invalid item ~S to find-rtp-matches");



    public static final SubLString $str98$entered_remove_kleene_words_with_ = makeString("entered remove-kleene-words with no words~&");

    public static final SubLString $str99$removed_list____S__ = makeString("removed-list = ~S~&");

    public static final SubLString $str100$_word_list__S____template__S____f = makeString("<word-list ~S>~&<template ~S>~&<first-item ~S>~&");

    public static final SubLString $str101$words_________S__ = makeString("words     =  ~S~&");

    public static final SubLString $str102$sem___________S__ = makeString("sem       =  ~S~&");

    public static final SubLString $str103$bindings______S__ = makeString("bindings  =  ~S~&");

    public static final SubLString $str104$subconsts_____S__ = makeString("subconsts =  ~S~&");

    public static final SubLSymbol GET_STRINGS_OF_TYPE_CACHED = makeSymbol("GET-STRINGS-OF-TYPE-CACHED");



    public static final SubLSymbol EXPAND_WORD_ITEMS_IN_LIST_INT = makeSymbol("EXPAND-WORD-ITEMS-IN-LIST-INT");

    private static final SubLObject $$RequireOne = reader_make_constant_shell(makeString("RequireOne"));

    public static final SubLSymbol $expand_word_items_in_list_int_caching_state$ = makeSymbol("*EXPAND-WORD-ITEMS-IN-LIST-INT-CACHING-STATE*");

    private static final SubLInteger $int$2048 = makeInteger(2048);



    private static final SubLString $str112$RTP__sent_in_a_non_function_to_RE = makeString("RTP: sent in a non-function to REMOVE-OPTIONAL-STRINGS");

    private static final SubLObject $$RequireSome = reader_make_constant_shell(makeString("RequireSome"));

    private static final SubLObject $$OptionalSome = reader_make_constant_shell(makeString("OptionalSome"));

    private static final SubLObject $$OptionalOne = reader_make_constant_shell(makeString("OptionalOne"));

    private static final SubLObject $$WordSequence = reader_make_constant_shell(makeString("WordSequence"));





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

    public static SubLObject rtp_tracer_output(final SubLObject level, final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        apply(symbol_function(FORMAT), cons(T, format_control));
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject rtp_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        rtp_vars.$rtp_trace_level$.setDynamicValue(level, thread);
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject ensure_sem_parse_initialized() {
        clear_match_recursive_template_item();
        return NIL;
    }

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

    public static SubLObject reformulate_jointemplatecomponents(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_, TRANSFORM_JOINTEMPLATECOMPONENTS, UNPROVIDED);
    }

    public static SubLObject joinable_template_component_formulaP(final SubLObject cycl) {
        return makeBoolean((cycl.isList() && cycl.first().eql($$joinTemplateComponents)) && (!cycl.equal(transform_jointemplatecomponents(cycl))));
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

    public static SubLObject jointemplate_pattern_type(final SubLObject pattern) {
        SubLObject result = NIL;
        if (pattern.equal($list19)) {
            result = $S_NP_VP;
        } else {
            result = $SBAR_WHNP_S;
        }
        return result;
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

    public static SubLObject filter_semantic_tests(final SubLObject entry, SubLObject semantic_mt) {
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = rtp_vars.$rtp_semantic_mt$.getDynamicValue();
        }
        return entry;
    }

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

    public static SubLObject check_partial_ordering(final SubLObject l, final SubLObject mt) {
        return remove_mt_from_results(Sort.sort(add_mt_to_results(l, mt), symbol_function(TEMPLATE_CAN_PRECEDE), UNPROVIDED));
    }

    public static SubLObject remove_mt_from_results(final SubLObject l) {
        return Mapping.mapcar(symbol_function(CAR), l);
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

    public static SubLObject counted_sethash(final SubLObject key, final SubLObject table) {
        SubLObject value = gethash(key, table, ZERO_INTEGER);
        value = add(value, ONE_INTEGER);
        sethash(key, table, value);
        return key;
    }

    public static SubLObject get_counted_sethash_entry_count(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(key, $counted_template_set$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject template_item_from_rtp_entry(final SubLObject entry) {
        return nth(rtp_datastructures.rtp_chart_entry_template_index(entry), rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry)));
    }

    public static SubLObject eat_a_template_item(final SubLObject entry) {
        if (NIL != rtp_datastructures.rtp_chart_entry_template_index(entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, add(ONE_INTEGER, rtp_datastructures.rtp_chart_entry_template_index(entry)));
        }
        return rtp_datastructures.rtp_chart_entry_template_index(entry);
    }

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

    public static SubLObject filter_sem_tests(final SubLObject entries) {
        if ($rtp_perform_semantic_tests$.getGlobalValue() == $INTERNAL) {
            return entries;
        }
        return entries;
    }

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

    public static SubLObject clear_match_recursive_template_item() {
        return NIL;
    }

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

    public static SubLObject get_sem_test_for_var(final SubLObject var, final SubLObject rule) {
        final SubLObject result = get_sem_test_for_var_from_formula(var, rtp_datastructures.template_rule_sem_test(rule));
        return result;
    }

    public static SubLObject get_sem_test_for_var_from_formula(final SubLObject var, final SubLObject formula) {
        final SubLObject result = get_sem_test_for_var_from_formula_int(var, formula);
        if (NIL != list_utilities.lengthG(result, ONE_INTEGER, UNPROVIDED)) {
            return cons($$and, result);
        }
        return result;
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
    }

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
    }

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
    }

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
    }

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

    public static SubLObject process_perm_recursive(final SubLObject state) {
        final SubLObject this_item = rtp_perm_state_first_unused_template_item(state);
        push_to_end_rtp_matched_constit(state, make_unlocated_rtp_matched_constit(this_item));
        if (NIL != no_unused_template_itemsP(state)) {
            set_rtp_perm_state_unused_words(state, $completed_words_list$.getGlobalValue());
        }
        pop_rtp_perm_state_unused_template(state);
        return state;
    }

    public static SubLObject new_rtp_perm_state() {
        return make_vector(FOUR_INTEGER, UNPROVIDED);
    }

    public static SubLObject make_rtp_perm_state(final SubLObject words, final SubLObject template, final SubLObject matches, final SubLObject start) {
        final SubLObject result = new_rtp_perm_state();
        set_rtp_perm_state_unused_words(result, words);
        set_rtp_perm_state_unused_template(result, template);
        set_rtp_perm_state_matched(result, matches);
        set_rtp_perm_state_start_index(result, start);
        return result;
    }

    public static SubLObject rtp_perm_state_unused_words(final SubLObject state) {
        return aref(state, ZERO_INTEGER);
    }

    public static SubLObject set_rtp_perm_state_unused_words(final SubLObject state, final SubLObject words) {
        set_aref(state, ZERO_INTEGER, words);
        return state;
    }

    public static SubLObject pop_rtp_perm_state_unused_words(final SubLObject state) {
        set_rtp_perm_state_unused_words(state, rtp_perm_state_unused_words(state).rest());
        return state;
    }

    public static SubLObject rtp_perm_state_unused_template(final SubLObject state) {
        return aref(state, ONE_INTEGER);
    }

    public static SubLObject pop_rtp_perm_state_unused_template(final SubLObject state) {
        set_rtp_perm_state_unused_template(state, rtp_perm_state_unused_template(state).rest());
        return rtp_perm_state_unused_template(state);
    }

    public static SubLObject set_rtp_perm_state_unused_template(final SubLObject state, final SubLObject template) {
        set_aref(state, ONE_INTEGER, template);
        return state;
    }

    public static SubLObject rtp_perm_state_first_unused_template_item(final SubLObject state) {
        return aref(state, ONE_INTEGER).first();
    }

    public static SubLObject set_rtp_perm_state_matched(final SubLObject state, final SubLObject matched) {
        set_aref(state, TWO_INTEGER, matched);
        return state;
    }

    public static SubLObject rtp_perm_state_matched(final SubLObject state) {
        return aref(state, TWO_INTEGER);
    }

    public static SubLObject push_to_end_rtp_matched_constit(final SubLObject state, final SubLObject constit) {
        set_aref(state, TWO_INTEGER, list_utilities.snoc(constit, rtp_perm_state_matched(state)));
        return state;
    }

    public static SubLObject rtp_perm_state_start_index(final SubLObject state) {
        return aref(state, THREE_INTEGER);
    }

    public static SubLObject set_rtp_perm_state_start_index(final SubLObject state, final SubLObject index) {
        set_aref(state, THREE_INTEGER, index);
        return state;
    }

    public static SubLObject rtp_perm_state_completeP(final SubLObject state) {
        return makeBoolean(((NIL != no_unused_wordsP(state)) && (NIL != no_unused_template_itemsP(state))) || ((NIL != no_unused_template_itemsP(state)) && (NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(last(rtp_perm_state_matched(state), UNPROVIDED).first())))));
    }

    public static SubLObject no_unused_wordsP(final SubLObject state) {
        return makeBoolean(NIL == rtp_perm_state_unused_words(state));
    }

    public static SubLObject no_unused_template_itemsP(final SubLObject state) {
        return makeBoolean(NIL == rtp_perm_state_unused_template(state));
    }

    public static SubLObject make_unlocated_rtp_matched_constit(final SubLObject template) {
        return make_rtp_matched_constit($UNLOCATED, template, NIL, NIL);
    }

    public static SubLObject unlocated_rtp_matched_constitP(final SubLObject match) {
        return eq(rtp_matched_constit_words(match), $UNLOCATED);
    }

    public static SubLObject make_rtp_matched_constit(final SubLObject words, final SubLObject template, final SubLObject start, final SubLObject end) {
        final SubLObject result = make_vector(FOUR_INTEGER, UNPROVIDED);
        set_aref(result, ZERO_INTEGER, words);
        set_aref(result, ONE_INTEGER, template);
        set_aref(result, TWO_INTEGER, start);
        set_aref(result, THREE_INTEGER, end);
        return result;
    }

    public static SubLObject rtp_matched_constit_words(final SubLObject constit) {
        return aref(constit, ZERO_INTEGER);
    }

    public static SubLObject set_rtp_matched_constit_words(final SubLObject constit, final SubLObject words) {
        set_aref(constit, ZERO_INTEGER, words);
        return constit;
    }

    public static SubLObject rtp_matched_constit_template(final SubLObject constit) {
        return aref(constit, ONE_INTEGER);
    }

    public static SubLObject set_rtp_matched_constit_template(final SubLObject constit, final SubLObject template) {
        set_aref(constit, ONE_INTEGER, template);
        return constit;
    }

    public static SubLObject rtp_matched_constit_start(final SubLObject constit) {
        return aref(constit, TWO_INTEGER);
    }

    public static SubLObject set_rtp_matched_constit_start(final SubLObject constit, final SubLObject start) {
        set_aref(constit, TWO_INTEGER, start);
        return constit;
    }

    public static SubLObject rtp_matched_constit_end(final SubLObject constit) {
        return aref(constit, THREE_INTEGER);
    }

    public static SubLObject set_rtp_matched_constit_end(final SubLObject constit, final SubLObject end) {
        set_aref(constit, THREE_INTEGER, end);
        return constit;
    }

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
    }

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
    }

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
    }

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

    public static SubLObject completed_entryP(final SubLObject entry, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $parse_entire_string$.getDynamicValue(thread)) || depth.numG(ZERO_INTEGER)) {
            return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)) && rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()));
        }
        return makeBoolean(rtp_datastructures.rtp_chart_entry_words(entry).equal($completed_words_list$.getGlobalValue()) || length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)));
    }

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

    public static SubLObject tp_match_wordXpos(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpos_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
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

    public static SubLObject rtp_string_is_pos_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pos_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), GET_STRINGS_OF_TYPE_CACHED, UNPROVIDED);
    }

    public static SubLObject tp_match_wordXpred(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpred_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
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

    public static SubLObject rtp_string_is_pred_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pred_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject tp_match_tokenP(final SubLObject template_item, final SubLObject current_word) {
        return Strings.string_equal(template_item, current_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject tp_require_some(final SubLObject template_item, final SubLObject current_words) {
        if (NIL != subl_promotions.memberP(current_words.first(), expand_word_items_in_list(template_item).rest(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return tp_optional_words(template_item, current_words.rest());
        }
        return NIL;
    }

    public static SubLObject tp_match_token(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.denots_of_string(current_words.first(), NIL, $DENOT, T, NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject expand_word_items_in_list(final SubLObject template_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $rtp_use_caches$.getDynamicValue(thread)) {
            clear_expand_word_items_in_list_int();
        }
        return expand_word_items_in_list_int(template_item);
    }

    public static SubLObject clear_expand_word_items_in_list_int() {
        final SubLObject cs = $expand_word_items_in_list_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_expand_word_items_in_list_int(final SubLObject template_item) {
        return memoization_state.caching_state_remove_function_results_with_args($expand_word_items_in_list_int_caching_state$.getGlobalValue(), list(template_item), UNPROVIDED, UNPROVIDED);
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
    }

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
    }

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

    public static SubLObject remove_require_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == UNPROVIDED) {
            word_list_reversed = NIL;
        }
        return remove_one(template_item, word_list, word_list_reversed);
    }

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
    }

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
    }

    public static SubLObject fully_bound_entryP(final SubLObject entry) {
        return makeBoolean(length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).numE(rtp_datastructures.rtp_chart_entry_template_index(entry)) && (NIL == rtp_datastructures.rtp_chart_entry_subconstits(entry)));
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
    }

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

    public static SubLObject substitute_bindings(final SubLObject val, final SubLObject binding_var, final SubLObject sem) {
        if (sem.isList()) {
            return subst(val, binding_var, sem, UNPROVIDED, UNPROVIDED);
        }
        if (sem.equal(binding_var)) {
            return val;
        }
        return sem;
    }

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
    }

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
        declareMacro(me, "rtp_trace_out", "RTP-TRACE-OUT");
        declareFunction(me, "rtp_tracer_output", "RTP-TRACER-OUTPUT", 2, 0, false);
        declareFunction(me, "rtp_trace", "RTP-TRACE", 0, 1, false);
        declareFunction(me, "ensure_sem_parse_initialized", "ENSURE-SEM-PARSE-INITIALIZED", 0, 0, false);
        declareFunction(me, "template_parse", "TEMPLATE-PARSE", 2, 2, false);
        declareFunction(me, "categorizing_template_parse", "CATEGORIZING-TEMPLATE-PARSE", 2, 2, false);
        declareFunction(me, "reformulate_jointemplatecomponents", "REFORMULATE-JOINTEMPLATECOMPONENTS", 1, 0, false);
        declareFunction(me, "joinable_template_component_formulaP", "JOINABLE-TEMPLATE-COMPONENT-FORMULA?", 1, 0, false);
        declareFunction(me, "transform_rewrite_sequence", "TRANSFORM-REWRITE-SEQUENCE", 1, 0, false);
        declareFunction(me, "rewrite_assemble_phrase", "REWRITE-ASSEMBLE-PHRASE", 1, 0, false);
        declareFunction(me, "join_tcomponents_and_rewrite_sequence", "JOIN-TCOMPONENTS-AND-REWRITE-SEQUENCE", 3, 0, false);
        declareFunction(me, "jointemplate_pattern_type", "JOINTEMPLATE-PATTERN-TYPE", 1, 0, false);
        declareFunction(me, "transform_jointemplatecomponents", "TRANSFORM-JOINTEMPLATECOMPONENTS", 1, 0, false);
        declareFunction(me, "expressions_for_pattern_transform", "EXPRESSIONS-FOR-PATTERN-TRANSFORM", 2, 0, false);
        declareFunction(me, "rec_parse", "REC-PARSE", 6, 0, false);
        declareFunction(me, "rec_parse_int", "REC-PARSE-INT", 6, 0, false);
        declareFunction(me, "filter_semantic_tests", "FILTER-SEMANTIC-TESTS", 1, 1, false);
        declareFunction(me, "filter_rules", "FILTER-RULES", 3, 2, false);
        declareFunction(me, "templates_potentially_applicable_to_word_list", "TEMPLATES-POTENTIALLY-APPLICABLE-TO-WORD-LIST", 3, 0, false);
        declareFunction(me, "check_partial_ordering", "CHECK-PARTIAL-ORDERING", 2, 0, false);
        declareFunction(me, "remove_mt_from_results", "REMOVE-MT-FROM-RESULTS", 1, 0, false);
        declareFunction(me, "add_mt_to_results", "ADD-MT-TO-RESULTS", 2, 0, false);
        declareFunction(me, "template_can_precede", "TEMPLATE-CAN-PRECEDE", 2, 0, false);
        declareFunction(me, "initialize_partial_orders_hash", "INITIALIZE-PARTIAL-ORDERS-HASH", 0, 0, false);
        declareFunction(me, "counted_sethash", "COUNTED-SETHASH", 2, 0, false);
        declareFunction(me, "get_counted_sethash_entry_count", "GET-COUNTED-SETHASH-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "template_item_from_rtp_entry", "TEMPLATE-ITEM-FROM-RTP-ENTRY", 1, 0, false);
        declareFunction(me, "eat_a_template_item", "EAT-A-TEMPLATE-ITEM", 1, 0, false);
        declareFunction(me, "tp_match_template", "TP-MATCH-TEMPLATE", 5, 0, false);
        declareFunction(me, "filter_sem_tests", "FILTER-SEM-TESTS", 1, 0, false);
        declareFunction(me, "match_string_template_item", "MATCH-STRING-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "match_wu_template_item", "MATCH-WU-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "match_token_template_item", "MATCH-TOKEN-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "match_nl_agr_pred_template_item", "MATCH-NL-AGR-PRED-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "match_speech_part_template_item", "MATCH-SPEECH-PART-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "words_from_word_spans", "WORDS-FROM-WORD-SPANS", 1, 0, false);
        declareFunction(me, "match_optional_template_item", "MATCH-OPTIONAL-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "clear_match_recursive_template_item", "CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM", 0, 0, false);
        declareFunction(me, "match_recursive_template_item", "MATCH-RECURSIVE-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "get_sem_test_for_var", "GET-SEM-TEST-FOR-VAR", 2, 0, false);
        declareFunction(me, "get_sem_test_for_var_from_formula", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA", 2, 0, false);
        declareFunction(me, "get_sem_test_for_var_from_formula_int", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA-INT", 2, 0, false);
        declareFunction(me, "failed_subconst_item", "FAILED-SUBCONST-ITEM", 4, 0, false);
        declareFunction(me, "prefixes_before_item", "PREFIXES-BEFORE-ITEM", 4, 0, false);
        declareFunction(me, "match_template_item", "MATCH-TEMPLATE-ITEM", 2, 0, false);
        declareFunction(me, "find_stop_item", "FIND-STOP-ITEM", 1, 0, false);
        declareFunction(me, "tp_split", "TP-SPLIT", 5, 0, false);
        declareFunction(me, "rtp_compute_permutations", "RTP-COMPUTE-PERMUTATIONS", 3, 0, false);
        declareFunction(me, "rtp_compute_recursive_locations", "RTP-COMPUTE-RECURSIVE-LOCATIONS", 3, 0, false);
        declareFunction(me, "compute_matches", "COMPUTE-MATCHES", 5, 0, false);
        declareFunction(me, "valid_constits_p", "VALID-CONSTITS-P", 1, 1, false);
        declareFunction(me, "compute_matches_int", "COMPUTE-MATCHES-INT", 5, 0, false);
        declareFunction(me, "build_located_matches", "BUILD-LOCATED-MATCHES", 4, 0, false);
        declareFunction(me, "compute_constit_locations", "COMPUTE-CONSTIT-LOCATIONS", 3, 0, false);
        declareFunction(me, "process_perm_non_recursive", "PROCESS-PERM-NON-RECURSIVE", 2, 0, false);
        declareFunction(me, "find_rtp_matches", "FIND-RTP-MATCHES", 4, 0, false);
        declareFunction(me, "process_perm_recursive", "PROCESS-PERM-RECURSIVE", 1, 0, false);
        declareFunction(me, "new_rtp_perm_state", "NEW-RTP-PERM-STATE", 0, 0, false);
        declareFunction(me, "make_rtp_perm_state", "MAKE-RTP-PERM-STATE", 4, 0, false);
        declareFunction(me, "rtp_perm_state_unused_words", "RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        declareFunction(me, "set_rtp_perm_state_unused_words", "SET-RTP-PERM-STATE-UNUSED-WORDS", 2, 0, false);
        declareFunction(me, "pop_rtp_perm_state_unused_words", "POP-RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        declareFunction(me, "rtp_perm_state_unused_template", "RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        declareFunction(me, "pop_rtp_perm_state_unused_template", "POP-RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        declareFunction(me, "set_rtp_perm_state_unused_template", "SET-RTP-PERM-STATE-UNUSED-TEMPLATE", 2, 0, false);
        declareFunction(me, "rtp_perm_state_first_unused_template_item", "RTP-PERM-STATE-FIRST-UNUSED-TEMPLATE-ITEM", 1, 0, false);
        declareFunction(me, "set_rtp_perm_state_matched", "SET-RTP-PERM-STATE-MATCHED", 2, 0, false);
        declareFunction(me, "rtp_perm_state_matched", "RTP-PERM-STATE-MATCHED", 1, 0, false);
        declareFunction(me, "push_to_end_rtp_matched_constit", "PUSH-TO-END-RTP-MATCHED-CONSTIT", 2, 0, false);
        declareFunction(me, "rtp_perm_state_start_index", "RTP-PERM-STATE-START-INDEX", 1, 0, false);
        declareFunction(me, "set_rtp_perm_state_start_index", "SET-RTP-PERM-STATE-START-INDEX", 2, 0, false);
        declareFunction(me, "rtp_perm_state_completeP", "RTP-PERM-STATE-COMPLETE?", 1, 0, false);
        declareFunction(me, "no_unused_wordsP", "NO-UNUSED-WORDS?", 1, 0, false);
        declareFunction(me, "no_unused_template_itemsP", "NO-UNUSED-TEMPLATE-ITEMS?", 1, 0, false);
        declareFunction(me, "make_unlocated_rtp_matched_constit", "MAKE-UNLOCATED-RTP-MATCHED-CONSTIT", 1, 0, false);
        declareFunction(me, "unlocated_rtp_matched_constitP", "UNLOCATED-RTP-MATCHED-CONSTIT?", 1, 0, false);
        declareFunction(me, "make_rtp_matched_constit", "MAKE-RTP-MATCHED-CONSTIT", 4, 0, false);
        declareFunction(me, "rtp_matched_constit_words", "RTP-MATCHED-CONSTIT-WORDS", 1, 0, false);
        declareFunction(me, "set_rtp_matched_constit_words", "SET-RTP-MATCHED-CONSTIT-WORDS", 2, 0, false);
        declareFunction(me, "rtp_matched_constit_template", "RTP-MATCHED-CONSTIT-TEMPLATE", 1, 0, false);
        declareFunction(me, "set_rtp_matched_constit_template", "SET-RTP-MATCHED-CONSTIT-TEMPLATE", 2, 0, false);
        declareFunction(me, "rtp_matched_constit_start", "RTP-MATCHED-CONSTIT-START", 1, 0, false);
        declareFunction(me, "set_rtp_matched_constit_start", "SET-RTP-MATCHED-CONSTIT-START", 2, 0, false);
        declareFunction(me, "rtp_matched_constit_end", "RTP-MATCHED-CONSTIT-END", 1, 0, false);
        declareFunction(me, "set_rtp_matched_constit_end", "SET-RTP-MATCHED-CONSTIT-END", 2, 0, false);
        declareFunction(me, "reverse_and_add_template", "REVERSE-AND-ADD-TEMPLATE", 2, 0, false);
        declareFunction(me, "remove_kleene_words", "REMOVE-KLEENE-WORDS", 2, 0, false);
        declareFunction(me, "remove_kleene_words_int", "REMOVE-KLEENE-WORDS-INT", 1, 0, false);
        declareFunction(me, "completed_entries", "COMPLETED-ENTRIES", 2, 0, false);
        declareFunction(me, "completed_entryP", "COMPLETED-ENTRY?", 2, 0, false);
        declareFunction(me, "print_entries", "PRINT-ENTRIES", 1, 0, false);
        declareFunction(me, "tp_match_wordXpos", "TP-MATCH-WORD&POS", 2, 0, false);
        declareFunction(me, "tp_match_wordXpos_wXwords", "TP-MATCH-WORD&POS-W/WORDS", 2, 0, false);
        declareFunction(me, "rtp_string_is_pos_on_wuP", "RTP-STRING-IS-POS-ON-WU?", 3, 0, false);
        declareFunction(me, "tp_match_wordXpred", "TP-MATCH-WORD&PRED", 2, 0, false);
        declareFunction(me, "tp_match_wordXpred_wXwords", "TP-MATCH-WORD&PRED-W/WORDS", 2, 0, false);
        declareFunction(me, "rtp_string_is_pred_on_wuP", "RTP-STRING-IS-PRED-ON-WU?", 3, 0, false);
        declareFunction(me, "tp_match_tokenP", "TP-MATCH-TOKEN?", 2, 0, false);
        declareFunction(me, "tp_optional_words", "TP-OPTIONAL-WORDS", 2, 0, false);
        declareFunction(me, "tp_require_some", "TP-REQUIRE-SOME", 2, 0, false);
        declareFunction(me, "tp_match_token", "TP-MATCH-TOKEN", 2, 0, false);
        declareFunction(me, "tp_match_pos", "TP-MATCH-POS", 2, 0, false);
        declareFunction(me, "tp_match_pred", "TP-MATCH-PRED", 2, 0, false);
        declareFunction(me, "expand_word_items_in_list", "EXPAND-WORD-ITEMS-IN-LIST", 1, 0, false);
        declareFunction(me, "clear_expand_word_items_in_list_int", "CLEAR-EXPAND-WORD-ITEMS-IN-LIST-INT", 0, 0, false);
        declareFunction(me, "remove_expand_word_items_in_list_int", "REMOVE-EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        declareFunction(me, "expand_word_items_in_list_int_internal", "EXPAND-WORD-ITEMS-IN-LIST-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "expand_word_items_in_list_int", "EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        declareFunction(me, "remove_optional_strings", "REMOVE-OPTIONAL-STRINGS", 2, 1, false);
        declareFunction(me, "remove_X_words", "REMOVE-+-WORDS", 2, 1, false);
        declareFunction(me, "remove_a_group", "REMOVE-A-GROUP", 2, 1, false);
        declareFunction(me, "word_match", "WORD-MATCH", 2, 0, false);
        declareFunction(me, "remove_optional_one", "REMOVE-OPTIONAL-ONE", 2, 1, false);
        declareFunction(me, "remove_require_one", "REMOVE-REQUIRE-ONE", 2, 1, false);
        declareFunction(me, "remove_one", "REMOVE-ONE", 2, 1, false);
        declareFunction(me, "remove_optional_words", "REMOVE-OPTIONAL-WORDS", 2, 1, false);
        declareFunction(me, "fully_bound_entryP", "FULLY-BOUND-ENTRY?", 1, 0, false);
        declareFunction(me, "reset_all_recognizer_caches", "RESET-ALL-RECOGNIZER-CACHES", 0, 0, false);
        declareFunction(me, "parse_subconstit_list", "PARSE-SUBCONSTIT-LIST", 3, 0, false);
        declareFunction(me, "tp_bind_entry", "TP-BIND-ENTRY", 1, 0, false);
        declareFunction(me, "substitute_bindings", "SUBSTITUTE-BINDINGS", 3, 0, false);
        declareFunction(me, "sem_parse", "SEM-PARSE", 2, 2, false);
        declareFunction(me, "sem_parse_int", "SEM-PARSE-INT", 4, 3, false);
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

    
}

/**
 * Total time: 561 ms
 */
