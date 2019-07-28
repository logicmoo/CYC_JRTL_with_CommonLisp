package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.string_relevant_assertions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.string_relevant_assertions.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class string_relevant_assertions extends SubLTranslatedFile {
    public static final SubLFile me = new string_relevant_assertions();

    public static final String myName = "com.cyc.cycjava.cycl.string_relevant_assertions";

    public static final String myFingerPrint = "40c8677af896a29d6a3a8c98c4fabfc367bd91ec81e997383965df12a5fbd5e6";

    // deflexical
    private static final SubLSymbol $current_stack$ = makeSymbol("*CURRENT-STACK*");

    // defparameter
    public static final SubLSymbol $sra_debugP$ = makeSymbol("*SRA-DEBUG?*");

    // defparameter
    private static final SubLSymbol $filter_non_thclP$ = makeSymbol("*FILTER-NON-THCL?*");

    // defparameter
    private static final SubLSymbol $filter_non_bio_scgP$ = makeSymbol("*FILTER-NON-BIO-SCG?*");

    // defparameter
    private static final SubLSymbol $overlap_index_check_count$ = makeSymbol("*OVERLAP-INDEX-CHECK-COUNT*");

    // deflexical
    private static final SubLSymbol $word_overlap_score_weight$ = makeSymbol("*WORD-OVERLAP-SCORE-WEIGHT*");

    // deflexical
    private static final SubLSymbol $assertion_source_score_weight$ = makeSymbol("*ASSERTION-SOURCE-SCORE-WEIGHT*");

    // deflexical
    private static final SubLSymbol $bio_filter_coll$ = makeSymbol("*BIO-FILTER-COLL*");

    // deflexical
    private static final SubLSymbol $test_strings_file$ = makeSymbol("*TEST-STRINGS-FILE*");

    // defparameter
    private static final SubLSymbol $start_on_test_string$ = makeSymbol("*START-ON-TEST-STRING*");

    private static final SubLString $str0$__ = makeString("~&");

    private static final SubLSymbol $GETTING_DENOTS = makeKeyword("GETTING-DENOTS");

    private static final SubLList $list2 = cons(makeSymbol("STRING"), makeSymbol("DENOT"));

    private static final SubLSymbol $REMOVING_SUBSUMED_DENOTS = makeKeyword("REMOVING-SUBSUMED-DENOTS");



    private static final SubLSymbol $sym5$SPEC_IN_ANY_MT_ = makeSymbol("SPEC-IN-ANY-MT?");

    private static final SubLSymbol $FILTERING_DENOTS = makeKeyword("FILTERING-DENOTS");

    private static final SubLSymbol $sym7$__ = makeSymbol(">=");



    private static final SubLInteger $int$1048 = makeInteger(1048);

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLString $str12$__Term_sets___S__ = makeString("~%Term sets: ~S~%");

    private static final SubLString $str13$Doing_prompt_term_combos_of_lengt = makeString("Doing prompt-term combos of length ~D");

    private static final SubLList $list14 = cons(makeSymbol("PROMPT-TERM-COMBO"), makeSymbol("SCORE"));

    private static final SubLSymbol $DOING_PROMPT_TERM_COMBO = makeKeyword("DOING-PROMPT-TERM-COMBO");

    private static final SubLString $str16$Stopping_search_after__D_combos__ = makeString("Stopping search after ~D combos~% for ~S.~% Found ~D sets of assertions:~%~S");

    private static final SubLSymbol GREATER_LENGTH_P = makeSymbol("GREATER-LENGTH-P");

    private static final SubLSymbol $sym18$_ = makeSymbol(">");

    private static final SubLSymbol TERM_MEANINGINESS = makeSymbol("TERM-MEANINGINESS");

    private static final SubLString $str20$__S__ = makeString(" ~S~%");

    private static final SubLSymbol SPECS_FOR_TERM = makeSymbol("SPECS-FOR-TERM");

    private static final SubLString $str22$Got__D_assertions_for__S = makeString("Got ~D assertions for ~S");

    private static final SubLString $str23$Checked__D_combos_from__S__ = makeString("Checked ~D combos from ~S~%");

    private static final SubLSymbol $sym24$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str25$Only__D_seconds_of_inference_time = makeString("Only ~D seconds of inference time left!!");



    private static final SubLList $list27 = cons(makeSymbol("SCORE"), makeSymbol("ASSERTIONS"));

    private static final SubLSymbol $SCORING_ASSERTIONS = makeKeyword("SCORING-ASSERTIONS");

    private static final SubLSymbol $PARAPHRASING = makeKeyword("PARAPHRASING");









    private static final SubLString $str34$Bad_NL__S___for__S = makeString("Bad NL ~S~% for ~S");

    private static final SubLString $str35$Aborting_post_processing_of_relev = makeString("Aborting post-processing of relevant assertions due to inference time constraints.");

    private static final SubLList $list36 = cons(makeSymbol("ASSERTION.NL"), makeSymbol("SCORE"));

    private static final SubLList $list37 = cons(makeSymbol("ASSERTION"), makeSymbol("NL"));

    private static final SubLString $str38$__2F___A__ = makeString("~,2F: ~A~%");

    private static final SubLList $list39 = cons(makeSymbol("KEY"), makeSymbol("SCORE"));

    private static final SubLString $str40$Best_score____2F = makeString("Best score: ~,2F");

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLString $str42$Truncate_5____S = makeString("Truncate 5+: ~S");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str44$Truncate_10____S = makeString("Truncate 10+: ~S");

    private static final SubLString $str45$Truncate_20____S = makeString("Truncate 20+: ~S");

    private static final SubLString $str46$__ = makeString("#$");

    private static final SubLList $list47 = list(reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("comment")), reader_make_constant_shell(makeString("sentenceParameterValueInSpecification")));

    private static final SubLSymbol $sym48$ASSERTION_CYCL_OKAY_ = makeSymbol("ASSERTION-CYCL-OKAY?");



    private static final SubLString $str50$Pruning_list_of__D_assertions_ = makeString("Pruning list of ~D assertions.");

    private static final SubLSymbol $sym51$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLSymbol PUNCTUATION_P = makeSymbol("PUNCTUATION-P");

    private static final SubLSymbol $sym53$CLOSED_LEXICAL_CLASS_STRING_ = makeSymbol("CLOSED-LEXICAL-CLASS-STRING?");

    private static final SubLSymbol FIND_STEM_MEMOIZED = makeSymbol("FIND-STEM-MEMOIZED");

    private static final SubLSymbol $sym55$_ = makeSymbol("*");



    private static final SubLString $str57$Head___S__Length___S__M_of_last_t = makeString("Head: ~S. Length: ~S. M of last term: ~,2F (~S)~%");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym60$DENOT_OKAY_FOR_SUGGESTED_QUERY_SEARCH_ = makeSymbol("DENOT-OKAY-FOR-SUGGESTED-QUERY-SEARCH?");



    private static final SubLString $str62$Mx4ruVwdvXNVQ3_homoKKbOqsg = makeString("Mx4ruVwdvXNVQ3-homoKKbOqsg");

    private static final SubLString $str63$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLObject $$PhysicalPrinciple = reader_make_constant_shell(makeString("PhysicalPrinciple"));

    private static final SubLString $str65$_home_ubuntu_test_strings_txt = makeString("/home/ubuntu/test-strings.txt");



    private static final SubLString $str67$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str68$ = makeString("");

    private static final SubLString $$$Testing_ = makeString("Testing ");

    private static final SubLString $str70$_strings___ = makeString(" strings...");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLObject $const74$CytologicalProcessesRecommendedWF = reader_make_constant_shell(makeString("CytologicalProcessesRecommendedWFFCheckingMt"));

    private static final SubLString $str75$_tmp_test_results_test_run_ = makeString("/tmp/test-results/test-run-");

    private static final SubLString $str76$_ = makeString("-");

    private static final SubLString $str77$_cfasl = makeString(".cfasl");

    private static final SubLString $str78$____Prompt___A____in__A_ = makeString("~%~%Prompt: ~A~% (in ~A)");

    private static final SubLString $str79$__D___A__ = makeString(" ~D: ~A~%");

    private static final SubLString $str80$Caught_error_working_on__S_____S = makeString("Caught error working on ~S:~% ~S");

    private static final SubLString $str81$Timed_out_working_on__S = makeString("Timed out working on ~S");

    private static final SubLString $str82$String_Relevant_Assertions = makeString("String-Relevant Assertions");

    private static final SubLString $str83$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str84$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str88$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str94$cb_handle_string_relevant_asserti = makeString("cb-handle-string-relevant-assertions");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str96$Question_ = makeString("Question:");

    private static final SubLString $$$prompt = makeString("prompt");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol CB_STRING_RELEVANT_ASSERTIONS = makeSymbol("CB-STRING-RELEVANT-ASSERTIONS");



    private static final SubLString $$$Relevant_Assertions_for_ = makeString("Relevant Assertions for ");

    private static final SubLInteger $int$500000 = makeInteger(500000);

    private static final SubLString $str103$Sorry__no_results_for_ = makeString("Sorry, no results for ");

    private static final SubLString $str104$_were_found_ = makeString(" were found.");

    private static final SubLSymbol CB_HANDLE_STRING_RELEVANT_ASSERTIONS = makeSymbol("CB-HANDLE-STRING-RELEVANT-ASSERTIONS");

    private static final SubLString $str106$The_following__A__A_found__ = makeString("The following ~A ~A found: ");

    private static final SubLString $$$assertion = makeString("assertion");

    private static final SubLString $str108$_D_assertions = makeString("~D assertions");

    private static final SubLString $$$was = makeString("was");

    private static final SubLString $$$were = makeString("were");







    private static final SubLString $str114$_ = makeString(".");





    private static final SubLString $str117$cb_string_relevant_assertions = makeString("cb-string-relevant-assertions");

    private static final SubLSymbol $STRING_RELEVANT_ASSERTIONS = makeKeyword("STRING-RELEVANT-ASSERTIONS");

    private static final SubLSymbol CB_LINK_STRING_RELEVANT_ASSERTIONS = makeSymbol("CB-LINK-STRING-RELEVANT-ASSERTIONS");

    private static final SubLString $$$SRA = makeString("SRA");

    private static final SubLString $$$Assertion_lookup_from_strings = makeString("Assertion lookup from strings");

    public static SubLObject sra_note(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sra_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, cconcatenate($str0$__, format_string), arg1, arg2, arg3, arg4, arg5, arg6, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sra_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sra_debugP$.getDynamicValue(thread)) {
            Errors.warn(format_string, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        return NIL;
    }

    public static SubLObject suggested_query_term_sets_for_string(final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string2denots = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        $current_stack$.setGlobalValue(cons(cons($GETTING_DENOTS, prompt_string), $current_stack$.getGlobalValue()));
        SubLObject cdolist_list_var = lexicon_accessors.denotation_mapper(prompt_string, NIL, $DILIGENT, UNPROVIDED);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject string = NIL;
            SubLObject denot = NIL;
            destructuring_bind_must_consp(current, datum, $list2);
            string = current.first();
            current = denot = current.rest();
            if ((NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)) && (NIL != denot_okay_for_suggested_query_searchP(denot))) {
                dictionary_utilities.dictionary_push(string2denots, string, denot);
            }
            $current_stack$.setGlobalValue(cons(cons($REMOVING_SUBSUMED_DENOTS, denot), $current_stack$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string2denots)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject string2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject denots = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(string2denots, string2, list_utilities.remove_subsumed_items(denots, $sym5$SPEC_IN_ANY_MT_, UNPROVIDED));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject term_sets = remove_duplicates(dictionary.dictionary_values(string2denots), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject filtered_term_sets = NIL;
        SubLObject subsumed_terms = NIL;
        $current_stack$.setGlobalValue(cons(cons($FILTERING_DENOTS, term_sets), $current_stack$.getGlobalValue()));
        SubLObject cdolist_list_var2 = term_sets;
        SubLObject term_set = NIL;
        term_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$1 = term_set;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject cdolist_list_var_$2 = term_sets;
                SubLObject other_term_set = NIL;
                other_term_set = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    if (!other_term_set.equal(term_set)) {
                        SubLObject cdolist_list_var_$3 = other_term_set;
                        SubLObject other_term = NIL;
                        other_term = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            if ((!v_term.equal(other_term)) && (NIL != member(v_term, specs_for_term(other_term, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED))) {
                                subsumed_terms = cons(v_term, subsumed_terms);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            other_term = cdolist_list_var_$3.first();
                        } 
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    other_term_set = cdolist_list_var_$2.first();
                } 
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                v_term = cdolist_list_var_$1.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            term_set = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = term_sets;
        term_set = NIL;
        term_set = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject filtered_term_set = copy_list(term_set);
            SubLObject cdolist_list_var_$4 = subsumed_terms;
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                filtered_term_set = remove(v_term2, filtered_term_set, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                v_term2 = cdolist_list_var_$4.first();
            } 
            final SubLObject var = filtered_term_set;
            if (NIL != var) {
                filtered_term_sets = cons(var, filtered_term_sets);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            term_set = cdolist_list_var2.first();
        } 
        return filtered_term_sets;
    }

    public static SubLObject remove_short_lists(final SubLObject lists, SubLObject min_size) {
        if (min_size == UNPROVIDED) {
            min_size = TWO_INTEGER;
        }
        return remove(number_utilities.f_1_(min_size), lists, symbol_function($sym7$__), symbol_function(LENGTH), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject spec_in_any_mtP_internal(final SubLObject c1, final SubLObject c2) {
        return genls.genl_in_any_mtP(c2, c1);
    }

    public static SubLObject spec_in_any_mtP(final SubLObject c1, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return spec_in_any_mtP_internal(c1, c2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym5$SPEC_IN_ANY_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym5$SPEC_IN_ANY_MT_, TWO_INTEGER, $int$1048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym5$SPEC_IN_ANY_MT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(c1, c2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (c1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && c2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(spec_in_any_mtP_internal(c1, c2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(c1, c2));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject assertions_for_prompt_string(final SubLObject prompt_string, SubLObject mt, SubLObject max_to_check) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (max_to_check == UNPROVIDED) {
            max_to_check = $int$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt_term_sets = suggested_query_term_sets_for_string(prompt_string);
        SubLObject stopP = NIL;
        SubLObject assertions = NIL;
        sra_note($str12$__Term_sets___S__, prompt_term_sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == stopP) {
            SubLObject end_var;
            SubLObject i;
            SubLObject csome_list_var;
            SubLObject prompt_term_set;
            SubLObject prompt_term_combos;
            SubLObject scored_prompt_term_combos;
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject prompt_term_combo;
            SubLObject score;
            for (end_var = ONE_INTEGER, i = NIL, i = length(prompt_term_sets); (NIL == stopP) && (!i.numLE(end_var)); i = add(i, MINUS_ONE_INTEGER)) {
                sra_note($str13$Doing_prompt_term_combos_of_lengt, i, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == stopP) {
                    csome_list_var = Sort.sort(remove_short_lists(list_utilities.powerset(prompt_term_sets), UNPROVIDED), symbol_function(GREATER_LENGTH_P), UNPROVIDED);
                    prompt_term_set = NIL;
                    prompt_term_set = csome_list_var.first();
                    while ((NIL == stopP) && (NIL != csome_list_var)) {
                        prompt_term_combos = remove_short_lists(list_utilities.cartesian_product(prompt_term_set, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                        scored_prompt_term_combos = score_prompt_term_combos(prompt_term_combos);
                        for (rest = NIL, rest = scored_prompt_term_combos; (NIL == stopP) && (NIL != rest); rest = rest.rest()) {
                            cons = rest.first();
                            datum = current = cons;
                            prompt_term_combo = NIL;
                            score = NIL;
                            destructuring_bind_must_consp(current, datum, $list14);
                            prompt_term_combo = current.first();
                            current = score = current.rest();
                            $current_stack$.setGlobalValue(cons(cons($DOING_PROMPT_TERM_COMBO, prompt_term_combo), $current_stack$.getGlobalValue()));
                            if (NIL != list_utilities.lengthE(prompt_term_combo, i, UNPROVIDED)) {
                                assertions = cons(cons(score, assertions_from_prompt_term_combo(prompt_term_combo, i, mt, max_to_check)), assertions);
                                if (NIL != almost_out_of_inference_timeP(UNPROVIDED)) {
                                    stopP = T;
                                } else
                                    if ($overlap_index_check_count$.getDynamicValue(thread).numGE(max_to_check)) {
                                        stopP = T;
                                    }

                                if (NIL != stopP) {
                                    sra_note($str16$Stopping_search_after__D_combos__, $overlap_index_check_count$.getDynamicValue(thread), prompt_string, length(assertions), assertions, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        prompt_term_set = csome_list_var.first();
                    } 
                }
            }
        }
        return score_assertions_for_prompt_string(assertions, prompt_string);
    }

    public static SubLObject score_prompt_term_combos(final SubLObject prompt_term_combos) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = prompt_term_combos;
        SubLObject prompt_term_combo = NIL;
        prompt_term_combo = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = prompt_term_combo_score(prompt_term_combo);
            ans = list_utilities.alist_enter(ans, prompt_term_combo, score, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            prompt_term_combo = cdolist_list_var.first();
        } 
        return list_utilities.sort_alist_by_values(ans, symbol_function($sym18$_));
    }

    public static SubLObject prompt_term_combo_score(final SubLObject prompt_term_combo) {
        SubLObject score = ZERO_INTEGER;
        SubLObject cdolist_list_var = prompt_term_combo;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            score = add(score, specificity_estimate(v_term));
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return score;
    }

    public static SubLObject specificity_estimate(final SubLObject v_term) {
        return divide(ONE_INTEGER, add(ONE_INTEGER, cardinality_estimates.generality_estimate(v_term)));
    }

    public static SubLObject term_meaninginess_internal(final SubLObject v_term) {
        return multiply(specificity_estimate(v_term), kb_indexing.num_index(v_term));
    }

    public static SubLObject term_meaninginess(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return term_meaninginess_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TERM_MEANINGINESS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TERM_MEANINGINESS, ONE_INTEGER, $int$1048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TERM_MEANINGINESS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(term_meaninginess_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject assertions_from_prompt_term_combo(final SubLObject prompt_term_combo, final SubLObject i, SubLObject mt, SubLObject max_to_check) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (max_to_check == UNPROVIDED) {
            max_to_check = $int$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = $overlap_index_check_count$.currentBinding(thread);
        try {
            $overlap_index_check_count$.bind(ZERO_INTEGER, thread);
            sra_note($str20$__S__, prompt_term_combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject specs_lists = prune_specs_lists(remove(NIL, Mapping.mapcar(SPECS_FOR_TERM, prompt_term_combo), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), subtract(max_to_check, $overlap_index_check_count$.getDynamicValue(thread)));
                SubLObject doneP = NIL;
                final SubLObject response_term_combos = (NIL != doneP) ? NIL : Sort.sort(remove_short_lists(list_utilities.cartesian_product(specs_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED), symbol_function(GREATER_LENGTH_P), UNPROVIDED);
                if (NIL == doneP) {
                    SubLObject csome_list_var = response_term_combos;
                    SubLObject combo = NIL;
                    combo = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL != list_utilities.lengthE(combo, i, UNPROVIDED)) {
                            final SubLObject items_var = prune_assertions(virtual_indexing.assertions_mentioning_terms(combo, UNPROVIDED));
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    item = aref(vector_var, element_num);
                                    assertions = cons(item, assertions);
                                }
                            } else {
                                SubLObject cdolist_list_var = items_var;
                                SubLObject item2 = NIL;
                                item2 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    assertions = cons(item2, assertions);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item2 = cdolist_list_var.first();
                                } 
                            }
                            $overlap_index_check_count$.setDynamicValue(add($overlap_index_check_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                            doneP = makeBoolean((NIL != almost_out_of_inference_timeP(UNPROVIDED)) || $overlap_index_check_count$.getDynamicValue(thread).numGE(max_to_check));
                        }
                        csome_list_var = csome_list_var.rest();
                        combo = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
            }
            if (NIL != assertions) {
                sra_note($str22$Got__D_assertions_for__S, length(assertions), prompt_term_combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            sra_note($str23$Checked__D_combos_from__S__, $overlap_index_check_count$.getDynamicValue(thread), prompt_term_combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return assertions;
        } finally {
            $overlap_index_check_count$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject almost_out_of_inference_timeP(SubLObject threshold) {
        if (threshold == UNPROVIDED) {
            threshold = TEN_INTEGER;
        }
        final SubLObject seconds_remaining = inference_strategist.current_controlling_inference_time_remaining();
        final SubLObject almost_out_of_timeP = makeBoolean((NIL != seconds_remaining) && seconds_remaining.numL(threshold));
        if (NIL != almost_out_of_timeP) {
            sra_warn($str25$Only__D_seconds_of_inference_time, seconds_remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return almost_out_of_timeP;
    }

    public static SubLObject score_assertions_for_prompt_string(final SubLObject assertions_info, final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject question_words = significant_words(prompt_string);
        final SubLObject assertion_nl_scores = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject abortP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject score;
        SubLObject assertions;
        SubLObject list_var;
        SubLObject assertion;
        SubLObject i;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_3;
        SubLObject assertion_nl;
        SubLObject assertion_words;
        SubLObject raw_word_overlap_score;
        SubLObject normalized_word_overlap_score;
        SubLObject total_score;
        for (abortP = almost_out_of_inference_timeP(FIVE_INTEGER), rest = NIL, rest = Sort.sort(assertions_info, symbol_function($sym18$_), symbol_function(CAR)); (NIL == abortP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            score = NIL;
            assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list27);
            score = current.first();
            current = assertions = current.rest();
            $current_stack$.setGlobalValue(cons(cons($SCORING_ASSERTIONS, assertions), $current_stack$.getGlobalValue()));
            list_var = NIL;
            assertion = NIL;
            i = NIL;
            list_var = assertions;
            assertion = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , assertion = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL == abortP) {
                    $current_stack$.setGlobalValue(cons(list($PARAPHRASING, assertion, i, length(assertions)), $current_stack$.getGlobalValue()));
                    _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    _prev_bind_2 = pph_vars.$constant_link_function$.currentBinding(thread);
                    _prev_bind_3 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff(ONE_INTEGER), thread);
                        pph_vars.$constant_link_function$.bind($NONE, thread);
                        pph_vars.$pph_introduce_anaphorsP$.bind(NIL, thread);
                        assertion_nl = pph_main.generate_text_wXsentential_force(assertion, $DECLARATIVE, $DEFAULT, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), $HTML, UNPROVIDED);
                        assertion_words = (NIL != assertion_nl) ? significant_words(assertion_nl) : NIL;
                        raw_word_overlap_score = length(intersection(question_words, assertion_words, symbol_function(EQUAL), UNPROVIDED));
                        normalized_word_overlap_score = divide(raw_word_overlap_score, length(union(question_words, assertion_words, symbol_function(EQUAL), UNPROVIDED)));
                        total_score = add(multiply(normalized_word_overlap_score, $word_overlap_score_weight$.getGlobalValue()), multiply(score, $assertion_source_score_weight$.getGlobalValue()));
                        if (NIL != assertion_nl_okayP(assertion_nl)) {
                            if (NIL != assertion_words) {
                                dictionary.dictionary_enter(assertion_nl_scores, cons(assertion, assertion_nl), total_score);
                            }
                        } else {
                            sra_warn($str34$Bad_NL__S___for__S, assertion_nl, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_3, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                    }
                    if (NIL != almost_out_of_inference_timeP(FIVE_INTEGER)) {
                        sra_warn($str35$Aborting_post_processing_of_relev, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        abortP = T;
                    }
                }
            }
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, symbol_function($sym18$_));
        SubLObject cons2 = NIL;
        cons2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = cons2;
            SubLObject assertionXnl = NIL;
            SubLObject score2 = NIL;
            destructuring_bind_must_consp(current2, datum2, $list36);
            assertionXnl = current2.first();
            current2 = score2 = current2.rest();
            SubLObject current_$7;
            final SubLObject datum_$6 = current_$7 = assertionXnl;
            SubLObject assertion2 = NIL;
            SubLObject nl = NIL;
            destructuring_bind_must_consp(current_$7, datum_$6, $list37);
            assertion2 = current_$7.first();
            current_$7 = nl = current_$7.rest();
            sra_note($str38$__2F___A__, score2, nl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons2 = cdolist_list_var.first();
        } 
        return truncate_tail(assertion_nl_scores);
    }

    public static SubLObject truncate_tail(final SubLObject assertion_nl_scores) {
        SubLObject doomed_keys = NIL;
        SubLObject best_score = NIL;
        SubLObject good_count = ZERO_INTEGER;
        SubLObject truncate_restP = NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, symbol_function($sym18$_));
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject score = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            key = current.first();
            current = score = current.rest();
            if (NIL != truncate_restP) {
                doomed_keys = cons(key, doomed_keys);
            } else
                if (good_count.isZero()) {
                    best_score = score;
                    good_count = add(good_count, ONE_INTEGER);
                    sra_note($str40$Best_score____2F, best_score, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (good_count.numGE(FIVE_INTEGER) && divide(score, best_score).numLE($float$0_8)) {
                        sra_note($str42$Truncate_5____S, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        truncate_restP = T;
                        doomed_keys = cons(key, doomed_keys);
                    } else
                        if (good_count.numGE(TEN_INTEGER) && divide(score, best_score).numLE($float$0_5)) {
                            sra_note($str44$Truncate_10____S, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            truncate_restP = T;
                            doomed_keys = cons(key, doomed_keys);
                        } else
                            if (good_count.numGE(TWENTY_INTEGER)) {
                                sra_note($str45$Truncate_20____S, key, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                truncate_restP = T;
                                doomed_keys = cons(key, doomed_keys);
                            } else {
                                good_count = add(good_count, ONE_INTEGER);
                            }




            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        cdolist_list_var = doomed_keys;
        SubLObject key2 = NIL;
        key2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_remove(assertion_nl_scores, key2);
            cdolist_list_var = cdolist_list_var.rest();
            key2 = cdolist_list_var.first();
        } 
        return assertion_nl_scores;
    }

    public static SubLObject assertion_nl_okayP(final SubLObject assertion_nl) {
        if (!assertion_nl.isString()) {
            return NIL;
        }
        if (NIL != string_utilities.substringP($str46$__, assertion_nl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject assertion_cycl_okayP(final SubLObject assertion) {
        if (NIL != cycl_utilities.expression_find_any($list47, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject prune_assertions(SubLObject assertions) {
        assertions = list_utilities.remove_if_not($sym48$ASSERTION_CYCL_OKAY_, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.lengthG(assertions, $int$100, UNPROVIDED)) {
            sra_warn($str50$Pruning_list_of__D_assertions_, length(assertions), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            assertions = list_utilities.remove_if_not($sym51$ASSERTED_ASSERTION_, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return list_utilities.first_n($int$100, assertions);
    }

    public static SubLObject significant_words(final SubLObject string) {
        final SubLObject no_punct = remove_if(PUNCTUATION_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject downcased = Strings.string_downcase(no_punct, UNPROVIDED, UNPROVIDED);
        final SubLObject tokens = string_utilities.string_tokenize(downcased, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject non_closed = remove_if($sym53$CLOSED_LEXICAL_CLASS_STRING_, tokens, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject stemmed = Mapping.mapcar(FIND_STEM_MEMOIZED, non_closed);
        return delete_duplicates(stemmed, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject prune_specs_lists(final SubLObject specs_lists, final SubLObject max_to_check) {
        SubLObject cp_size = apply(symbol_function($sym55$_), Mapping.mapcar(symbol_function(LENGTH), specs_lists));
        if (cp_size.numLE(max_to_check)) {
            return specs_lists;
        }
        SubLObject new_specs_lists;
        for (new_specs_lists = Mapping.mapcar(REVERSE, specs_lists); cp_size.numG(max_to_check); cp_size = apply(symbol_function($sym55$_), Mapping.mapcar(symbol_function(LENGTH), new_specs_lists))) {
            final SubLObject biggest = list_utilities.extremal(new_specs_lists, symbol_function(GREATER_LENGTH_P), UNPROVIDED);
            final SubLObject i = position(biggest, new_specs_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            new_specs_lists = list_utilities.replace_nth(i, biggest.rest(), new_specs_lists);
        }
        SubLObject cdolist_list_var = new_specs_lists;
        SubLObject specs_list = NIL;
        specs_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject last_term = list_utilities.last_one(specs_list);
            sra_note($str57$Head___S__Length___S__M_of_last_t, specs_list.first(), length(specs_list), term_meaninginess(last_term), last_term, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            specs_list = cdolist_list_var.first();
        } 
        return Mapping.mapcar(REVERSE, new_specs_lists);
    }

    public static SubLObject specs_for_term_internal(final SubLObject v_term, SubLObject filter_non_bioP, SubLObject filter_non_thclP) {
        if (filter_non_bioP == UNPROVIDED) {
            filter_non_bioP = $filter_non_bio_scgP$.getDynamicValue();
        }
        if (filter_non_thclP == UNPROVIDED) {
            filter_non_thclP = $filter_non_thclP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $filter_non_bio_scgP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $filter_non_thclP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $filter_non_bio_scgP$.bind(filter_non_bioP, thread);
            $filter_non_thclP$.bind(filter_non_thclP, thread);
            return Sort.sort(list_utilities.remove_if_not($sym60$DENOT_OKAY_FOR_SUGGESTED_QUERY_SEARCH_, union(genls.all_specs(v_term, UNPROVIDED, UNPROVIDED), isa.all_instances(v_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym18$_), TERM_MEANINGINESS);
        } finally {
            $filter_non_thclP$.rebind(_prev_bind_4, thread);
            $filter_non_bio_scgP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject specs_for_term(final SubLObject v_term, SubLObject filter_non_bioP, SubLObject filter_non_thclP) {
        if (filter_non_bioP == UNPROVIDED) {
            filter_non_bioP = $filter_non_bio_scgP$.getDynamicValue();
        }
        if (filter_non_thclP == UNPROVIDED) {
            filter_non_thclP = $filter_non_thclP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return specs_for_term_internal(v_term, filter_non_bioP, filter_non_thclP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SPECS_FOR_TERM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SPECS_FOR_TERM, THREE_INTEGER, $int$1048, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SPECS_FOR_TERM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, filter_non_bioP, filter_non_thclP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (filter_non_bioP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && filter_non_thclP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(specs_for_term_internal(v_term, filter_non_bioP, filter_non_thclP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, filter_non_bioP, filter_non_thclP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject bio_filter_coll() {
        if ($bio_filter_coll$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = kb_utilities.find_object_by_compact_hl_external_id_string($str62$Mx4ruVwdvXNVQ3_homoKKbOqsg);
            if (init_value == $UNINITIALIZED) {
                Errors.error($str63$Unable_to_initialize__A__, $bio_filter_coll$.getGlobalValue());
            }
            $bio_filter_coll$.setGlobalValue(init_value);
        }
        return $bio_filter_coll$.getGlobalValue();
    }

    public static SubLObject denot_okay_for_suggested_query_searchP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $filter_non_thclP$.getDynamicValue(thread)) || (NIL != thcl.thcl_fortP(v_term, UNPROVIDED))) && ((((NIL == $filter_non_bio_scgP$.getDynamicValue(thread)) || (NIL != isa.isa_in_any_mtP(v_term, bio_filter_coll()))) || (NIL != isa.isa_in_any_mtP(v_term, $$PhysicalPrinciple))) || ((NIL != term.el_fort_p(v_term)) && (NIL != genls.genl_in_any_mtP(v_term, bio_filter_coll())))));
    }

    public static SubLObject get_test_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_strings = NIL;
        final SubLObject file_var = $test_strings_file$.getGlobalValue();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_var, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str67$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$8 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$8); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$8)) {
                    final SubLObject tokens = string_utilities.string_tokenize(line, list(CHAR_tab), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (((NIL != list_utilities.lengthE(tokens, THREE_INTEGER, UNPROVIDED)) && (NIL != string_utilities.digit_stringP(tokens.first()))) && (NIL != string_utilities.non_empty_string_p(second(tokens)))) {
                        test_strings = cons(second(tokens), test_strings);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nreverse(test_strings);
    }

    public static SubLObject test_test_strings(SubLObject combo_cutoff, SubLObject output_suffix) {
        if (combo_cutoff == UNPROVIDED) {
            combo_cutoff = $int$100000;
        }
        if (output_suffix == UNPROVIDED) {
            output_suffix = $str68$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_strings = get_test_strings();
        final SubLObject msg = cconcatenate($$$Testing_, new SubLObject[]{ format_nil.format_nil_d_no_copy(length(test_strings)), $str70$_strings___ });
        SubLObject okay_to_proceedP = sublisp_null($start_on_test_string$.getDynamicValue(thread));
        final SubLObject list_var = test_strings;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_string = NIL;
                test_string = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if ($start_on_test_string$.getDynamicValue(thread).equal(test_string)) {
                        okay_to_proceedP = T;
                    }
                    if (NIL != okay_to_proceedP) {
                        test_test_string(test_string, combo_cutoff, output_suffix);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_string = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject test_test_string(final SubLObject test_string, SubLObject combo_cutoff, SubLObject output_suffix) {
        if (combo_cutoff == UNPROVIDED) {
            combo_cutoff = $int$100000;
        }
        if (output_suffix == UNPROVIDED) {
            output_suffix = $str68$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = NIL;
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject tag = with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0_$10 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            SubLObject timer = NIL;
                            try {
                                final SubLObject _prev_bind_0_$11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = with_timeout_start_timer($int$300, tag);
                                    SubLObject time = NIL;
                                    SubLObject assertion_nl_scores = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    assertion_nl_scores = assertions_for_prompt_string(test_string, $const74$CytologicalProcessesRecommendedWF, combo_cutoff);
                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    SubLObject filename;
                                    for (filename = cconcatenate($str75$_tmp_test_results_test_run_, new SubLObject[]{ output_suffix, $str76$_, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), $str77$_cfasl }); NIL != file_utilities.file_existsP(filename); filename = cconcatenate($str75$_tmp_test_results_test_run_, new SubLObject[]{ output_suffix, $str76$_, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), $str77$_cfasl })) {
                                        sleep($float$0_5);
                                    }
                                    cfasl_utilities.cfasl_save_externalized(list(test_string, time, assertion_nl_scores), filename);
                                    SubLObject done_count = ZERO_INTEGER;
                                    SubLObject doneP = NIL;
                                    sra_note($str78$____Prompt___A____in__A_, test_string, numeric_date_utilities.readable_elapsed_time_string(time, ZERO_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject rest;
                                    SubLObject cons;
                                    SubLObject current;
                                    SubLObject datum;
                                    SubLObject assertionXnl;
                                    SubLObject score;
                                    SubLObject current_$13;
                                    SubLObject datum_$12;
                                    SubLObject assertion;
                                    SubLObject nl;
                                    for (rest = NIL, rest = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, symbol_function($sym18$_)); (NIL == doneP) && (NIL != rest); doneP = numGE(done_count, TEN_INTEGER) , rest = rest.rest()) {
                                        cons = rest.first();
                                        datum = current = cons;
                                        assertionXnl = NIL;
                                        score = NIL;
                                        destructuring_bind_must_consp(current, datum, $list36);
                                        assertionXnl = current.first();
                                        current = score = current.rest();
                                        datum_$12 = current_$13 = assertionXnl;
                                        assertion = NIL;
                                        nl = NIL;
                                        destructuring_bind_must_consp(current_$13, datum_$12, $list37);
                                        assertion = current_$13.first();
                                        current_$13 = nl = current_$13.rest();
                                        sra_note($str79$__D___A__, score, nl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        done_count = add(done_count, ONE_INTEGER);
                                    }
                                } finally {
                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    with_timeout_stop_timer(timer);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                    } finally {
                        thread.throwStack.pop();
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            err_msg = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            sra_warn($str80$Caught_error_working_on__S_____S, test_string, err_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != timed_outP) {
            sra_warn($str81$Timed_out_working_on__S, test_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_string_relevant_assertions(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str82$String_Relevant_Assertions;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str83$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str84$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str88$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str94$cb_handle_string_relevant_asserti, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str96$Question_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$prompt, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$prompt, $str68$, $int$80);
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$15, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_string_relevant_assertions(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt = html_extract_input($$$prompt, args);
        final SubLObject title_var;
        final SubLObject title_string = title_var = cconcatenate($$$Relevant_Assertions_for_, format_nil.format_nil_s_no_copy(prompt));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str83$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str84$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str88$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_newline(UNPROVIDED);
                            final SubLObject assertion_nl_scores = assertions_for_prompt_string(prompt, $$InferencePSC, $int$500000);
                            if (NIL != dictionary.dictionary_empty_p(assertion_nl_scores)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_princ($str103$Sorry__no_results_for_);
                                cb_form(prompt, UNPROVIDED, UNPROVIDED);
                                html_princ($str104$_were_found_);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                html_print_relevant_assertion_list(assertion_nl_scores);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$20, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject html_print_relevant_assertion_list(final SubLObject assertion_nl_scores) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_count = dictionary.dictionary_length(assertion_nl_scores);
        final SubLObject one_assertionP = eql(assertion_count, ONE_INTEGER);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str106$The_following__A__A_found__, NIL != one_assertionP ? $$$assertion : format(NIL, $str108$_D_assertions, assertion_count), NIL != one_assertionP ? $$$was : $$$were);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                final SubLObject width = THREE_INTEGER;
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                if (NIL != width) {
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(width);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject color_toggle = T;
            final SubLObject color1 = html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue();
            final SubLObject color2 = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, symbol_function($sym18$_));
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject assertionXnl = NIL;
                SubLObject score = NIL;
                destructuring_bind_must_consp(current, datum, $list36);
                assertionXnl = current.first();
                current = score = current.rest();
                final SubLObject bgcolor = (NIL != color_toggle) ? color1 : color2;
                SubLObject current_$28;
                final SubLObject datum_$27 = current_$28 = assertionXnl;
                SubLObject assertion = NIL;
                SubLObject nl = NIL;
                destructuring_bind_must_consp(current_$28, datum_$27, $list37);
                assertion = current_$28.first();
                current_$28 = nl = current_$28.rest();
                final SubLObject size_val = FOUR_INTEGER;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != size_val) {
                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(size_val);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject color_val = $DARK_GRAY;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(number_utilities.f_1X(count));
                                html_princ($str114$_);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_markup(nl);
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject size_val2 = TWO_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != size_val2) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(size_val2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_form(assertion, ZERO_INTEGER, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                color_toggle = makeBoolean(NIL == color_toggle);
                count = add(count, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_link_string_relevant_assertions(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str82$String_Relevant_Assertions;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str117$cb_string_relevant_assertions);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_string_relevant_assertions_file() {
        declareFunction(me, "sra_note", "SRA-NOTE", 1, 6, false);
        declareFunction(me, "sra_warn", "SRA-WARN", 1, 6, false);
        declareFunction(me, "suggested_query_term_sets_for_string", "SUGGESTED-QUERY-TERM-SETS-FOR-STRING", 1, 0, false);
        declareFunction(me, "remove_short_lists", "REMOVE-SHORT-LISTS", 1, 1, false);
        declareFunction(me, "spec_in_any_mtP_internal", "SPEC-IN-ANY-MT?-INTERNAL", 2, 0, false);
        declareFunction(me, "spec_in_any_mtP", "SPEC-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "assertions_for_prompt_string", "ASSERTIONS-FOR-PROMPT-STRING", 1, 2, false);
        declareFunction(me, "score_prompt_term_combos", "SCORE-PROMPT-TERM-COMBOS", 1, 0, false);
        declareFunction(me, "prompt_term_combo_score", "PROMPT-TERM-COMBO-SCORE", 1, 0, false);
        declareFunction(me, "specificity_estimate", "SPECIFICITY-ESTIMATE", 1, 0, false);
        declareFunction(me, "term_meaninginess_internal", "TERM-MEANINGINESS-INTERNAL", 1, 0, false);
        declareFunction(me, "term_meaninginess", "TERM-MEANINGINESS", 1, 0, false);
        declareFunction(me, "assertions_from_prompt_term_combo", "ASSERTIONS-FROM-PROMPT-TERM-COMBO", 2, 2, false);
        declareFunction(me, "almost_out_of_inference_timeP", "ALMOST-OUT-OF-INFERENCE-TIME?", 0, 1, false);
        declareFunction(me, "score_assertions_for_prompt_string", "SCORE-ASSERTIONS-FOR-PROMPT-STRING", 2, 0, false);
        declareFunction(me, "truncate_tail", "TRUNCATE-TAIL", 1, 0, false);
        declareFunction(me, "assertion_nl_okayP", "ASSERTION-NL-OKAY?", 1, 0, false);
        declareFunction(me, "assertion_cycl_okayP", "ASSERTION-CYCL-OKAY?", 1, 0, false);
        declareFunction(me, "prune_assertions", "PRUNE-ASSERTIONS", 1, 0, false);
        declareFunction(me, "significant_words", "SIGNIFICANT-WORDS", 1, 0, false);
        declareFunction(me, "prune_specs_lists", "PRUNE-SPECS-LISTS", 2, 0, false);
        declareFunction(me, "specs_for_term_internal", "SPECS-FOR-TERM-INTERNAL", 1, 2, false);
        declareFunction(me, "specs_for_term", "SPECS-FOR-TERM", 1, 2, false);
        declareFunction(me, "bio_filter_coll", "BIO-FILTER-COLL", 0, 0, false);
        declareFunction(me, "denot_okay_for_suggested_query_searchP", "DENOT-OKAY-FOR-SUGGESTED-QUERY-SEARCH?", 1, 0, false);
        declareFunction(me, "get_test_strings", "GET-TEST-STRINGS", 0, 0, false);
        declareFunction(me, "test_test_strings", "TEST-TEST-STRINGS", 0, 2, false);
        declareFunction(me, "test_test_string", "TEST-TEST-STRING", 1, 2, false);
        declareFunction(me, "cb_string_relevant_assertions", "CB-STRING-RELEVANT-ASSERTIONS", 0, 1, false);
        declareFunction(me, "cb_handle_string_relevant_assertions", "CB-HANDLE-STRING-RELEVANT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "html_print_relevant_assertion_list", "HTML-PRINT-RELEVANT-ASSERTION-LIST", 1, 0, false);
        declareFunction(me, "cb_link_string_relevant_assertions", "CB-LINK-STRING-RELEVANT-ASSERTIONS", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_string_relevant_assertions_file() {
        deflexical("*CURRENT-STACK*", NIL);
        defparameter("*SRA-DEBUG?*", NIL);
        defparameter("*FILTER-NON-THCL?*", NIL);
        defparameter("*FILTER-NON-BIO-SCG?*", T);
        defparameter("*OVERLAP-INDEX-CHECK-COUNT*", ZERO_INTEGER);
        deflexical("*WORD-OVERLAP-SCORE-WEIGHT*", ONE_INTEGER);
        deflexical("*ASSERTION-SOURCE-SCORE-WEIGHT*", ONE_INTEGER);
        deflexical("*BIO-FILTER-COLL*", $UNINITIALIZED);
        deflexical("*TEST-STRINGS-FILE*", $str65$_home_ubuntu_test_strings_txt);
        defparameter("*START-ON-TEST-STRING*", NIL);
        return NIL;
    }

    public static SubLObject setup_string_relevant_assertions_file() {
        memoization_state.note_memoized_function($sym5$SPEC_IN_ANY_MT_);
        memoization_state.note_memoized_function(TERM_MEANINGINESS);
        memoization_state.note_memoized_function(SPECS_FOR_TERM);
        html_macros.note_cgi_handler_function(CB_STRING_RELEVANT_ASSERTIONS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_STRING_RELEVANT_ASSERTIONS, $HTML_HANDLER);
        setup_cb_link_method($STRING_RELEVANT_ASSERTIONS, CB_LINK_STRING_RELEVANT_ASSERTIONS, ONE_INTEGER);
        declare_cb_tool($STRING_RELEVANT_ASSERTIONS, $str82$String_Relevant_Assertions, $$$SRA, $$$Assertion_lookup_from_strings);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_string_relevant_assertions_file();
    }

    @Override
    public void initializeVariables() {
        init_string_relevant_assertions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_string_relevant_assertions_file();
    }

    static {





































































































































    }
}

/**
 * Total time: 661 ms
 */
