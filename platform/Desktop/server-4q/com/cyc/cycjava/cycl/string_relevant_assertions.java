package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class string_relevant_assertions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.string_relevant_assertions";
    public static final String myFingerPrint = "40c8677af896a29d6a3a8c98c4fabfc367bd91ec81e997383965df12a5fbd5e6";
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 891L)
    private static SubLSymbol $current_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 933L)
    public static SubLSymbol $sra_debugP$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 3079L)
    private static SubLSymbol $filter_non_thclP$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 3126L)
    private static SubLSymbol $filter_non_bio_scgP$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 3173L)
    private static SubLSymbol $overlap_index_check_count$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 7047L)
    private static SubLSymbol $word_overlap_score_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 7099L)
    private static SubLSymbol $assertion_source_score_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 12587L)
    private static SubLSymbol $bio_filter_coll$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 13052L)
    private static SubLSymbol $test_strings_file$;
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 13552L)
    private static SubLSymbol $start_on_test_string$;
    private static final SubLString $str0$__;
    private static final SubLSymbol $kw1$GETTING_DENOTS;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$REMOVING_SUBSUMED_DENOTS;
    private static final SubLSymbol $kw4$DILIGENT;
    private static final SubLSymbol $sym5$SPEC_IN_ANY_MT_;
    private static final SubLSymbol $kw6$FILTERING_DENOTS;
    private static final SubLSymbol $sym7$__;
    private static final SubLSymbol $sym8$LENGTH;
    private static final SubLInteger $int9$1048;
    private static final SubLObject $const10$InferencePSC;
    private static final SubLInteger $int11$100000;
    private static final SubLString $str12$__Term_sets___S__;
    private static final SubLString $str13$Doing_prompt_term_combos_of_lengt;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$DOING_PROMPT_TERM_COMBO;
    private static final SubLString $str16$Stopping_search_after__D_combos__;
    private static final SubLSymbol $sym17$GREATER_LENGTH_P;
    private static final SubLSymbol $sym18$_;
    private static final SubLSymbol $sym19$TERM_MEANINGINESS;
    private static final SubLString $str20$__S__;
    private static final SubLSymbol $sym21$SPECS_FOR_TERM;
    private static final SubLString $str22$Got__D_assertions_for__S;
    private static final SubLString $str23$Checked__D_combos_from__S__;
    private static final SubLSymbol $sym24$_EXIT;
    private static final SubLString $str25$Only__D_seconds_of_inference_time;
    private static final SubLSymbol $sym26$CAR;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$SCORING_ASSERTIONS;
    private static final SubLSymbol $kw29$PARAPHRASING;
    private static final SubLSymbol $kw30$NONE;
    private static final SubLSymbol $kw31$DECLARATIVE;
    private static final SubLSymbol $kw32$DEFAULT;
    private static final SubLSymbol $kw33$HTML;
    private static final SubLString $str34$Bad_NL__S___for__S;
    private static final SubLString $str35$Aborting_post_processing_of_relev;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLString $str38$__2F___A__;
    private static final SubLList $list39;
    private static final SubLString $str40$Best_score____2F;
    private static final SubLFloat $float41$0_8;
    private static final SubLString $str42$Truncate_5____S;
    private static final SubLFloat $float43$0_5;
    private static final SubLString $str44$Truncate_10____S;
    private static final SubLString $str45$Truncate_20____S;
    private static final SubLString $str46$__;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$ASSERTION_CYCL_OKAY_;
    private static final SubLInteger $int49$100;
    private static final SubLString $str50$Pruning_list_of__D_assertions_;
    private static final SubLSymbol $sym51$ASSERTED_ASSERTION_;
    private static final SubLSymbol $sym52$PUNCTUATION_P;
    private static final SubLSymbol $sym53$CLOSED_LEXICAL_CLASS_STRING_;
    private static final SubLSymbol $sym54$FIND_STEM_MEMOIZED;
    private static final SubLSymbol $sym55$_;
    private static final SubLSymbol $sym56$REVERSE;
    private static final SubLString $str57$Head___S__Length___S__M_of_last_t;
    private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const59$EverythingPSC;
    private static final SubLSymbol $sym60$DENOT_OKAY_FOR_SUGGESTED_QUERY_SEARCH_;
    private static final SubLSymbol $kw61$UNINITIALIZED;
    private static final SubLString $str62$Mx4ruVwdvXNVQ3_homoKKbOqsg;
    private static final SubLString $str63$Unable_to_initialize__A__;
    private static final SubLObject $const64$PhysicalPrinciple;
    private static final SubLString $str65$_home_ubuntu_test_strings_txt;
    private static final SubLSymbol $kw66$INPUT;
    private static final SubLString $str67$Unable_to_open__S;
    private static final SubLString $str68$;
    private static final SubLString $str69$Testing_;
    private static final SubLString $str70$_strings___;
    private static final SubLString $str71$cdolist;
    private static final SubLSymbol $sym72$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLInteger $int73$300;
    private static final SubLObject $const74$CytologicalProcessesRecommendedWF;
    private static final SubLString $str75$_tmp_test_results_test_run_;
    private static final SubLString $str76$_;
    private static final SubLString $str77$_cfasl;
    private static final SubLString $str78$____Prompt___A____in__A_;
    private static final SubLString $str79$__D___A__;
    private static final SubLString $str80$Caught_error_working_on__S_____S;
    private static final SubLString $str81$Timed_out_working_on__S;
    private static final SubLString $str82$String_Relevant_Assertions;
    private static final SubLString $str83$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str84$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw85$CB_CYC;
    private static final SubLSymbol $kw86$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw87$SHA1;
    private static final SubLString $str88$yui_skin_sam;
    private static final SubLString $str89$reloadFrameButton;
    private static final SubLString $str90$button;
    private static final SubLString $str91$reload;
    private static final SubLString $str92$Refresh_Frames;
    private static final SubLString $str93$post;
    private static final SubLString $str94$cb_handle_string_relevant_asserti;
    private static final SubLString $str95$Submit;
    private static final SubLString $str96$Question_;
    private static final SubLString $str97$prompt;
    private static final SubLInteger $int98$80;
    private static final SubLSymbol $sym99$CB_STRING_RELEVANT_ASSERTIONS;
    private static final SubLSymbol $kw100$HTML_HANDLER;
    private static final SubLString $str101$Relevant_Assertions_for_;
    private static final SubLInteger $int102$500000;
    private static final SubLString $str103$Sorry__no_results_for_;
    private static final SubLString $str104$_were_found_;
    private static final SubLSymbol $sym105$CB_HANDLE_STRING_RELEVANT_ASSERTIONS;
    private static final SubLString $str106$The_following__A__A_found__;
    private static final SubLString $str107$assertion;
    private static final SubLString $str108$_D_assertions;
    private static final SubLString $str109$was;
    private static final SubLString $str110$were;
    private static final SubLSymbol $kw111$CENTER;
    private static final SubLSymbol $kw112$TOP;
    private static final SubLSymbol $kw113$DARK_GRAY;
    private static final SubLString $str114$_;
    private static final SubLSymbol $kw115$LEFT;
    private static final SubLSymbol $kw116$MAIN;
    private static final SubLString $str117$cb_string_relevant_assertions;
    private static final SubLSymbol $kw118$STRING_RELEVANT_ASSERTIONS;
    private static final SubLSymbol $sym119$CB_LINK_STRING_RELEVANT_ASSERTIONS;
    private static final SubLString $str120$SRA;
    private static final SubLString $str121$Assertion_lookup_from_strings;
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 1026L)
    public static SubLObject sra_note(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == string_relevant_assertions.UNPROVIDED) {
            arg1 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg2 == string_relevant_assertions.UNPROVIDED) {
            arg2 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg3 == string_relevant_assertions.UNPROVIDED) {
            arg3 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg4 == string_relevant_assertions.UNPROVIDED) {
            arg4 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg5 == string_relevant_assertions.UNPROVIDED) {
            arg5 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg6 == string_relevant_assertions.UNPROVIDED) {
            arg6 = (SubLObject)string_relevant_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string_relevant_assertions.NIL != string_relevant_assertions.$sra_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)string_relevant_assertions.T, Sequences.cconcatenate((SubLObject)string_relevant_assertions.$str0$__, format_string), arg1, arg2, arg3, arg4, arg5, arg6, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 1229L)
    public static SubLObject sra_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == string_relevant_assertions.UNPROVIDED) {
            arg1 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg2 == string_relevant_assertions.UNPROVIDED) {
            arg2 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg3 == string_relevant_assertions.UNPROVIDED) {
            arg3 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg4 == string_relevant_assertions.UNPROVIDED) {
            arg4 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg5 == string_relevant_assertions.UNPROVIDED) {
            arg5 = (SubLObject)string_relevant_assertions.NIL;
        }
        if (arg6 == string_relevant_assertions.UNPROVIDED) {
            arg6 = (SubLObject)string_relevant_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string_relevant_assertions.NIL != string_relevant_assertions.$sra_debugP$.getDynamicValue(thread)) {
            Errors.warn(format_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5, arg6 });
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 1402L)
    public static SubLObject suggested_query_term_sets_for_string(final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string2denots = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED);
        string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)string_relevant_assertions.$kw1$GETTING_DENOTS, prompt_string), string_relevant_assertions.$current_stack$.getGlobalValue()));
        SubLObject cdolist_list_var = lexicon_accessors.denotation_mapper(prompt_string, (SubLObject)string_relevant_assertions.NIL, (SubLObject)string_relevant_assertions.$kw4$DILIGENT, (SubLObject)string_relevant_assertions.UNPROVIDED);
        SubLObject cons = (SubLObject)string_relevant_assertions.NIL;
        cons = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject string = (SubLObject)string_relevant_assertions.NIL;
            SubLObject denot = (SubLObject)string_relevant_assertions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list2);
            string = current.first();
            current = (denot = current.rest());
            if (string_relevant_assertions.NIL == lexicon_accessors.closed_lexical_class_stringP(string, (SubLObject)string_relevant_assertions.UNPROVIDED) && string_relevant_assertions.NIL != denot_okay_for_suggested_query_searchP(denot)) {
                dictionary_utilities.dictionary_push(string2denots, string, denot);
            }
            string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)string_relevant_assertions.$kw3$REMOVING_SUBSUMED_DENOTS, denot), string_relevant_assertions.$current_stack$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string2denots)); string_relevant_assertions.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject string2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject denots = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dictionary.dictionary_enter(string2denots, string2, list_utilities.remove_subsumed_items(denots, (SubLObject)string_relevant_assertions.$sym5$SPEC_IN_ANY_MT_, (SubLObject)string_relevant_assertions.UNPROVIDED));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        final SubLObject term_sets = Sequences.remove_duplicates(dictionary.dictionary_values(string2denots), Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        SubLObject filtered_term_sets = (SubLObject)string_relevant_assertions.NIL;
        SubLObject subsumed_terms = (SubLObject)string_relevant_assertions.NIL;
        string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)string_relevant_assertions.$kw6$FILTERING_DENOTS, term_sets), string_relevant_assertions.$current_stack$.getGlobalValue()));
        SubLObject cdolist_list_var2 = term_sets;
        SubLObject term_set = (SubLObject)string_relevant_assertions.NIL;
        term_set = cdolist_list_var2.first();
        while (string_relevant_assertions.NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$1 = term_set;
            SubLObject v_term = (SubLObject)string_relevant_assertions.NIL;
            v_term = cdolist_list_var_$1.first();
            while (string_relevant_assertions.NIL != cdolist_list_var_$1) {
                SubLObject cdolist_list_var_$2 = term_sets;
                SubLObject other_term_set = (SubLObject)string_relevant_assertions.NIL;
                other_term_set = cdolist_list_var_$2.first();
                while (string_relevant_assertions.NIL != cdolist_list_var_$2) {
                    if (!other_term_set.equal(term_set)) {
                        SubLObject cdolist_list_var_$3 = other_term_set;
                        SubLObject other_term = (SubLObject)string_relevant_assertions.NIL;
                        other_term = cdolist_list_var_$3.first();
                        while (string_relevant_assertions.NIL != cdolist_list_var_$3) {
                            if (!v_term.equal(other_term) && string_relevant_assertions.NIL != conses_high.member(v_term, specs_for_term(other_term, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED)) {
                                subsumed_terms = (SubLObject)ConsesLow.cons(v_term, subsumed_terms);
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
        term_set = (SubLObject)string_relevant_assertions.NIL;
        term_set = cdolist_list_var2.first();
        while (string_relevant_assertions.NIL != cdolist_list_var2) {
            SubLObject filtered_term_set = conses_high.copy_list(term_set);
            SubLObject cdolist_list_var_$4 = subsumed_terms;
            SubLObject v_term2 = (SubLObject)string_relevant_assertions.NIL;
            v_term2 = cdolist_list_var_$4.first();
            while (string_relevant_assertions.NIL != cdolist_list_var_$4) {
                filtered_term_set = Sequences.remove(v_term2, filtered_term_set, Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                v_term2 = cdolist_list_var_$4.first();
            }
            final SubLObject var = filtered_term_set;
            if (string_relevant_assertions.NIL != var) {
                filtered_term_sets = (SubLObject)ConsesLow.cons(var, filtered_term_sets);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            term_set = cdolist_list_var2.first();
        }
        return filtered_term_sets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 2852L)
    public static SubLObject remove_short_lists(final SubLObject lists, SubLObject min_size) {
        if (min_size == string_relevant_assertions.UNPROVIDED) {
            min_size = (SubLObject)string_relevant_assertions.TWO_INTEGER;
        }
        return Sequences.remove(number_utilities.f_1_(min_size), lists, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym7$__), Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym8$LENGTH), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 2971L)
    public static SubLObject spec_in_any_mtP_internal(final SubLObject c1, final SubLObject c2) {
        return genls.genl_in_any_mtP(c2, c1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 2971L)
    public static SubLObject spec_in_any_mtP(final SubLObject c1, final SubLObject c2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)string_relevant_assertions.NIL;
        if (string_relevant_assertions.NIL == v_memoization_state) {
            return spec_in_any_mtP_internal(c1, c2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)string_relevant_assertions.$sym5$SPEC_IN_ANY_MT_, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)string_relevant_assertions.$sym5$SPEC_IN_ANY_MT_, (SubLObject)string_relevant_assertions.TWO_INTEGER, (SubLObject)string_relevant_assertions.$int9$1048, (SubLObject)string_relevant_assertions.EQUAL, (SubLObject)string_relevant_assertions.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)string_relevant_assertions.$sym5$SPEC_IN_ANY_MT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(c1, c2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)string_relevant_assertions.NIL;
            collision = cdolist_list_var.first();
            while (string_relevant_assertions.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (c1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (string_relevant_assertions.NIL != cached_args && string_relevant_assertions.NIL == cached_args.rest() && c2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(spec_in_any_mtP_internal(c1, c2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(c1, c2));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 3226L)
    public static SubLObject assertions_for_prompt_string(final SubLObject prompt_string, SubLObject mt, SubLObject max_to_check) {
        if (mt == string_relevant_assertions.UNPROVIDED) {
            mt = string_relevant_assertions.$const10$InferencePSC;
        }
        if (max_to_check == string_relevant_assertions.UNPROVIDED) {
            max_to_check = (SubLObject)string_relevant_assertions.$int11$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt_term_sets = suggested_query_term_sets_for_string(prompt_string);
        SubLObject stopP = (SubLObject)string_relevant_assertions.NIL;
        SubLObject assertions = (SubLObject)string_relevant_assertions.NIL;
        sra_note((SubLObject)string_relevant_assertions.$str12$__Term_sets___S__, prompt_term_sets, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL == stopP) {
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
            for (end_var = (SubLObject)string_relevant_assertions.ONE_INTEGER, i = (SubLObject)string_relevant_assertions.NIL, i = Sequences.length(prompt_term_sets); string_relevant_assertions.NIL == stopP && !i.numLE(end_var); i = Numbers.add(i, (SubLObject)string_relevant_assertions.MINUS_ONE_INTEGER)) {
                sra_note((SubLObject)string_relevant_assertions.$str13$Doing_prompt_term_combos_of_lengt, i, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                if (string_relevant_assertions.NIL == stopP) {
                    csome_list_var = Sort.sort(remove_short_lists(list_utilities.powerset(prompt_term_sets), (SubLObject)string_relevant_assertions.UNPROVIDED), Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym17$GREATER_LENGTH_P), (SubLObject)string_relevant_assertions.UNPROVIDED);
                    prompt_term_set = (SubLObject)string_relevant_assertions.NIL;
                    prompt_term_set = csome_list_var.first();
                    while (string_relevant_assertions.NIL == stopP && string_relevant_assertions.NIL != csome_list_var) {
                        prompt_term_combos = remove_short_lists(list_utilities.cartesian_product(prompt_term_set, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), (SubLObject)string_relevant_assertions.UNPROVIDED);
                        scored_prompt_term_combos = score_prompt_term_combos(prompt_term_combos);
                        for (rest = (SubLObject)string_relevant_assertions.NIL, rest = scored_prompt_term_combos; string_relevant_assertions.NIL == stopP && string_relevant_assertions.NIL != rest; rest = rest.rest()) {
                            cons = rest.first();
                            datum = (current = cons);
                            prompt_term_combo = (SubLObject)string_relevant_assertions.NIL;
                            score = (SubLObject)string_relevant_assertions.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list14);
                            prompt_term_combo = current.first();
                            current = (score = current.rest());
                            string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)string_relevant_assertions.$kw15$DOING_PROMPT_TERM_COMBO, prompt_term_combo), string_relevant_assertions.$current_stack$.getGlobalValue()));
                            if (string_relevant_assertions.NIL != list_utilities.lengthE(prompt_term_combo, i, (SubLObject)string_relevant_assertions.UNPROVIDED)) {
                                assertions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(score, assertions_from_prompt_term_combo(prompt_term_combo, i, mt, max_to_check)), assertions);
                                if (string_relevant_assertions.NIL != almost_out_of_inference_timeP((SubLObject)string_relevant_assertions.UNPROVIDED)) {
                                    stopP = (SubLObject)string_relevant_assertions.T;
                                }
                                else if (string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread).numGE(max_to_check)) {
                                    stopP = (SubLObject)string_relevant_assertions.T;
                                }
                                if (string_relevant_assertions.NIL != stopP) {
                                    sra_note((SubLObject)string_relevant_assertions.$str16$Stopping_search_after__D_combos__, string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread), prompt_string, Sequences.length(assertions), assertions, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 4749L)
    public static SubLObject score_prompt_term_combos(final SubLObject prompt_term_combos) {
        SubLObject ans = (SubLObject)string_relevant_assertions.NIL;
        SubLObject cdolist_list_var = prompt_term_combos;
        SubLObject prompt_term_combo = (SubLObject)string_relevant_assertions.NIL;
        prompt_term_combo = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            final SubLObject score = prompt_term_combo_score(prompt_term_combo);
            ans = list_utilities.alist_enter(ans, prompt_term_combo, score, (SubLObject)string_relevant_assertions.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            prompt_term_combo = cdolist_list_var.first();
        }
        return list_utilities.sort_alist_by_values(ans, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 5110L)
    public static SubLObject prompt_term_combo_score(final SubLObject prompt_term_combo) {
        SubLObject score = (SubLObject)string_relevant_assertions.ZERO_INTEGER;
        SubLObject cdolist_list_var = prompt_term_combo;
        SubLObject v_term = (SubLObject)string_relevant_assertions.NIL;
        v_term = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            score = Numbers.add(score, specificity_estimate(v_term));
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 5295L)
    public static SubLObject specificity_estimate(final SubLObject v_term) {
        return Numbers.divide((SubLObject)string_relevant_assertions.ONE_INTEGER, Numbers.add((SubLObject)string_relevant_assertions.ONE_INTEGER, cardinality_estimates.generality_estimate(v_term)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 5418L)
    public static SubLObject term_meaninginess_internal(final SubLObject v_term) {
        return Numbers.multiply(specificity_estimate(v_term), kb_indexing.num_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 5418L)
    public static SubLObject term_meaninginess(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)string_relevant_assertions.NIL;
        if (string_relevant_assertions.NIL == v_memoization_state) {
            return term_meaninginess_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)string_relevant_assertions.$sym19$TERM_MEANINGINESS, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)string_relevant_assertions.$sym19$TERM_MEANINGINESS, (SubLObject)string_relevant_assertions.ONE_INTEGER, (SubLObject)string_relevant_assertions.$int9$1048, (SubLObject)string_relevant_assertions.EQUAL, (SubLObject)string_relevant_assertions.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)string_relevant_assertions.$sym19$TERM_MEANINGINESS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_meaninginess_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 5552L)
    public static SubLObject assertions_from_prompt_term_combo(final SubLObject prompt_term_combo, final SubLObject i, SubLObject mt, SubLObject max_to_check) {
        if (mt == string_relevant_assertions.UNPROVIDED) {
            mt = string_relevant_assertions.$const10$InferencePSC;
        }
        if (max_to_check == string_relevant_assertions.UNPROVIDED) {
            max_to_check = (SubLObject)string_relevant_assertions.$int11$100000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)string_relevant_assertions.NIL;
        final SubLObject _prev_bind_0 = string_relevant_assertions.$overlap_index_check_count$.currentBinding(thread);
        try {
            string_relevant_assertions.$overlap_index_check_count$.bind((SubLObject)string_relevant_assertions.ZERO_INTEGER, thread);
            sra_note((SubLObject)string_relevant_assertions.$str20$__S__, prompt_term_combo, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject specs_lists = prune_specs_lists(Sequences.remove((SubLObject)string_relevant_assertions.NIL, Mapping.mapcar((SubLObject)string_relevant_assertions.$sym21$SPECS_FOR_TERM, prompt_term_combo), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), Numbers.subtract(max_to_check, string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread)));
                SubLObject doneP = (SubLObject)string_relevant_assertions.NIL;
                final SubLObject response_term_combos = (SubLObject)((string_relevant_assertions.NIL != doneP) ? string_relevant_assertions.NIL : Sort.sort(remove_short_lists(list_utilities.cartesian_product(specs_lists, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), (SubLObject)string_relevant_assertions.UNPROVIDED), Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym17$GREATER_LENGTH_P), (SubLObject)string_relevant_assertions.UNPROVIDED));
                if (string_relevant_assertions.NIL == doneP) {
                    SubLObject csome_list_var = response_term_combos;
                    SubLObject combo = (SubLObject)string_relevant_assertions.NIL;
                    combo = csome_list_var.first();
                    while (string_relevant_assertions.NIL == doneP && string_relevant_assertions.NIL != csome_list_var) {
                        if (string_relevant_assertions.NIL != list_utilities.lengthE(combo, i, (SubLObject)string_relevant_assertions.UNPROVIDED)) {
                            final SubLObject items_var = prune_assertions(virtual_indexing.assertions_mentioning_terms(combo, (SubLObject)string_relevant_assertions.UNPROVIDED));
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = (SubLObject)string_relevant_assertions.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)string_relevant_assertions.NIL, v_iteration = (SubLObject)string_relevant_assertions.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)string_relevant_assertions.ONE_INTEGER)) {
                                    element_num = ((string_relevant_assertions.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)string_relevant_assertions.ONE_INTEGER) : v_iteration);
                                    item = Vectors.aref(vector_var, element_num);
                                    assertions = (SubLObject)ConsesLow.cons(item, assertions);
                                }
                            }
                            else {
                                SubLObject cdolist_list_var = items_var;
                                SubLObject item2 = (SubLObject)string_relevant_assertions.NIL;
                                item2 = cdolist_list_var.first();
                                while (string_relevant_assertions.NIL != cdolist_list_var) {
                                    assertions = (SubLObject)ConsesLow.cons(item2, assertions);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item2 = cdolist_list_var.first();
                                }
                            }
                            string_relevant_assertions.$overlap_index_check_count$.setDynamicValue(Numbers.add(string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread), (SubLObject)string_relevant_assertions.ONE_INTEGER), thread);
                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(string_relevant_assertions.NIL != almost_out_of_inference_timeP((SubLObject)string_relevant_assertions.UNPROVIDED) || string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread).numGE(max_to_check));
                        }
                        csome_list_var = csome_list_var.rest();
                        combo = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
            }
            if (string_relevant_assertions.NIL != assertions) {
                sra_note((SubLObject)string_relevant_assertions.$str22$Got__D_assertions_for__S, Sequences.length(assertions), prompt_term_combo, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            }
            sra_note((SubLObject)string_relevant_assertions.$str23$Checked__D_combos_from__S__, string_relevant_assertions.$overlap_index_check_count$.getDynamicValue(thread), prompt_term_combo, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            return assertions;
        }
        finally {
            string_relevant_assertions.$overlap_index_check_count$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 6673L)
    public static SubLObject almost_out_of_inference_timeP(SubLObject threshold) {
        if (threshold == string_relevant_assertions.UNPROVIDED) {
            threshold = (SubLObject)string_relevant_assertions.TEN_INTEGER;
        }
        final SubLObject seconds_remaining = inference_strategist.current_controlling_inference_time_remaining();
        final SubLObject almost_out_of_timeP = (SubLObject)SubLObjectFactory.makeBoolean(string_relevant_assertions.NIL != seconds_remaining && seconds_remaining.numL(threshold));
        if (string_relevant_assertions.NIL != almost_out_of_timeP) {
            sra_warn((SubLObject)string_relevant_assertions.$str25$Only__D_seconds_of_inference_time, seconds_remaining, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        return almost_out_of_timeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 7154L)
    public static SubLObject score_assertions_for_prompt_string(final SubLObject assertions_info, final SubLObject prompt_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject question_words = significant_words(prompt_string);
        final SubLObject assertion_nl_scores = dictionary.new_dictionary((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
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
        for (abortP = almost_out_of_inference_timeP((SubLObject)string_relevant_assertions.FIVE_INTEGER), rest = (SubLObject)string_relevant_assertions.NIL, rest = Sort.sort(assertions_info, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_), Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym26$CAR)); string_relevant_assertions.NIL == abortP && string_relevant_assertions.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            score = (SubLObject)string_relevant_assertions.NIL;
            assertions = (SubLObject)string_relevant_assertions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list27);
            score = current.first();
            current = (assertions = current.rest());
            string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)string_relevant_assertions.$kw28$SCORING_ASSERTIONS, assertions), string_relevant_assertions.$current_stack$.getGlobalValue()));
            list_var = (SubLObject)string_relevant_assertions.NIL;
            assertion = (SubLObject)string_relevant_assertions.NIL;
            i = (SubLObject)string_relevant_assertions.NIL;
            list_var = assertions;
            assertion = list_var.first();
            for (i = (SubLObject)string_relevant_assertions.ZERO_INTEGER; string_relevant_assertions.NIL != list_var; list_var = list_var.rest(), assertion = list_var.first(), i = Numbers.add((SubLObject)string_relevant_assertions.ONE_INTEGER, i)) {
                if (string_relevant_assertions.NIL == abortP) {
                    string_relevant_assertions.$current_stack$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)string_relevant_assertions.$kw29$PARAPHRASING, assertion, i, Sequences.length(assertions)), string_relevant_assertions.$current_stack$.getGlobalValue()));
                    _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    _prev_bind_2 = pph_vars.$constant_link_function$.currentBinding(thread);
                    _prev_bind_3 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(pph_macros.compute_new_pph_demerit_cutoff((SubLObject)string_relevant_assertions.ONE_INTEGER), thread);
                        pph_vars.$constant_link_function$.bind((SubLObject)string_relevant_assertions.$kw30$NONE, thread);
                        pph_vars.$pph_introduce_anaphorsP$.bind((SubLObject)string_relevant_assertions.NIL, thread);
                        assertion_nl = pph_main.generate_text_wXsentential_force(assertion, (SubLObject)string_relevant_assertions.$kw31$DECLARATIVE, (SubLObject)string_relevant_assertions.$kw32$DEFAULT, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)string_relevant_assertions.$kw33$HTML, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        assertion_words = (SubLObject)((string_relevant_assertions.NIL != assertion_nl) ? significant_words(assertion_nl) : string_relevant_assertions.NIL);
                        raw_word_overlap_score = Sequences.length(conses_high.intersection(question_words, assertion_words, Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED));
                        normalized_word_overlap_score = Numbers.divide(raw_word_overlap_score, Sequences.length(conses_high.union(question_words, assertion_words, Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED)));
                        total_score = Numbers.add(Numbers.multiply(normalized_word_overlap_score, string_relevant_assertions.$word_overlap_score_weight$.getGlobalValue()), Numbers.multiply(score, string_relevant_assertions.$assertion_source_score_weight$.getGlobalValue()));
                        if (string_relevant_assertions.NIL != assertion_nl_okayP(assertion_nl)) {
                            if (string_relevant_assertions.NIL != assertion_words) {
                                dictionary.dictionary_enter(assertion_nl_scores, (SubLObject)ConsesLow.cons(assertion, assertion_nl), total_score);
                            }
                        }
                        else {
                            sra_warn((SubLObject)string_relevant_assertions.$str34$Bad_NL__S___for__S, assertion_nl, assertion, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                    }
                    finally {
                        pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_3, thread);
                        pph_vars.$constant_link_function$.rebind(_prev_bind_2, thread);
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                    }
                    if (string_relevant_assertions.NIL != almost_out_of_inference_timeP((SubLObject)string_relevant_assertions.FIVE_INTEGER)) {
                        sra_warn((SubLObject)string_relevant_assertions.$str35$Aborting_post_processing_of_relev, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        abortP = (SubLObject)string_relevant_assertions.T;
                    }
                }
            }
        }
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_));
        SubLObject cons2 = (SubLObject)string_relevant_assertions.NIL;
        cons2 = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = cons2;
            SubLObject assertionXnl = (SubLObject)string_relevant_assertions.NIL;
            SubLObject score2 = (SubLObject)string_relevant_assertions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)string_relevant_assertions.$list36);
            assertionXnl = current2.first();
            current2 = (score2 = current2.rest());
            SubLObject current_$7;
            final SubLObject datum_$6 = current_$7 = assertionXnl;
            SubLObject assertion2 = (SubLObject)string_relevant_assertions.NIL;
            SubLObject nl = (SubLObject)string_relevant_assertions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)string_relevant_assertions.$list37);
            assertion2 = current_$7.first();
            current_$7 = (nl = current_$7.rest());
            sra_note((SubLObject)string_relevant_assertions.$str38$__2F___A__, score2, nl, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons2 = cdolist_list_var.first();
        }
        return truncate_tail(assertion_nl_scores);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 9206L)
    public static SubLObject truncate_tail(final SubLObject assertion_nl_scores) {
        SubLObject doomed_keys = (SubLObject)string_relevant_assertions.NIL;
        SubLObject best_score = (SubLObject)string_relevant_assertions.NIL;
        SubLObject good_count = (SubLObject)string_relevant_assertions.ZERO_INTEGER;
        SubLObject truncate_restP = (SubLObject)string_relevant_assertions.NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_));
        SubLObject cons = (SubLObject)string_relevant_assertions.NIL;
        cons = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)string_relevant_assertions.NIL;
            SubLObject score = (SubLObject)string_relevant_assertions.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list39);
            key = current.first();
            current = (score = current.rest());
            if (string_relevant_assertions.NIL != truncate_restP) {
                doomed_keys = (SubLObject)ConsesLow.cons(key, doomed_keys);
            }
            else if (good_count.isZero()) {
                best_score = score;
                good_count = Numbers.add(good_count, (SubLObject)string_relevant_assertions.ONE_INTEGER);
                sra_note((SubLObject)string_relevant_assertions.$str40$Best_score____2F, best_score, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            }
            else if (good_count.numGE((SubLObject)string_relevant_assertions.FIVE_INTEGER) && Numbers.divide(score, best_score).numLE((SubLObject)string_relevant_assertions.$float41$0_8)) {
                sra_note((SubLObject)string_relevant_assertions.$str42$Truncate_5____S, key, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                truncate_restP = (SubLObject)string_relevant_assertions.T;
                doomed_keys = (SubLObject)ConsesLow.cons(key, doomed_keys);
            }
            else if (good_count.numGE((SubLObject)string_relevant_assertions.TEN_INTEGER) && Numbers.divide(score, best_score).numLE((SubLObject)string_relevant_assertions.$float43$0_5)) {
                sra_note((SubLObject)string_relevant_assertions.$str44$Truncate_10____S, key, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                truncate_restP = (SubLObject)string_relevant_assertions.T;
                doomed_keys = (SubLObject)ConsesLow.cons(key, doomed_keys);
            }
            else if (good_count.numGE((SubLObject)string_relevant_assertions.TWENTY_INTEGER)) {
                sra_note((SubLObject)string_relevant_assertions.$str45$Truncate_20____S, key, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                truncate_restP = (SubLObject)string_relevant_assertions.T;
                doomed_keys = (SubLObject)ConsesLow.cons(key, doomed_keys);
            }
            else {
                good_count = Numbers.add(good_count, (SubLObject)string_relevant_assertions.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        cdolist_list_var = doomed_keys;
        SubLObject key2 = (SubLObject)string_relevant_assertions.NIL;
        key2 = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            dictionary.dictionary_remove(assertion_nl_scores, key2);
            cdolist_list_var = cdolist_list_var.rest();
            key2 = cdolist_list_var.first();
        }
        return assertion_nl_scores;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 10263L)
    public static SubLObject assertion_nl_okayP(final SubLObject assertion_nl) {
        if (!assertion_nl.isString()) {
            return (SubLObject)string_relevant_assertions.NIL;
        }
        if (string_relevant_assertions.NIL != string_utilities.substringP((SubLObject)string_relevant_assertions.$str46$__, assertion_nl, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED)) {
            return (SubLObject)string_relevant_assertions.NIL;
        }
        return (SubLObject)string_relevant_assertions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 10443L)
    public static SubLObject assertion_cycl_okayP(final SubLObject assertion) {
        if (string_relevant_assertions.NIL != cycl_utilities.expression_find_any((SubLObject)string_relevant_assertions.$list47, assertion, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED)) {
            return (SubLObject)string_relevant_assertions.NIL;
        }
        return (SubLObject)string_relevant_assertions.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 10640L)
    public static SubLObject prune_assertions(SubLObject assertions) {
        assertions = list_utilities.remove_if_not((SubLObject)string_relevant_assertions.$sym48$ASSERTION_CYCL_OKAY_, assertions, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL != list_utilities.lengthG(assertions, (SubLObject)string_relevant_assertions.$int49$100, (SubLObject)string_relevant_assertions.UNPROVIDED)) {
            sra_warn((SubLObject)string_relevant_assertions.$str50$Pruning_list_of__D_assertions_, Sequences.length(assertions), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            assertions = list_utilities.remove_if_not((SubLObject)string_relevant_assertions.$sym51$ASSERTED_ASSERTION_, assertions, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        return list_utilities.first_n((SubLObject)string_relevant_assertions.$int49$100, assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 10965L)
    public static SubLObject significant_words(final SubLObject string) {
        final SubLObject no_punct = Sequences.remove_if((SubLObject)string_relevant_assertions.$sym52$PUNCTUATION_P, string, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject downcased = Strings.string_downcase(no_punct, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject tokens = string_utilities.string_tokenize(downcased, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject non_closed = Sequences.remove_if((SubLObject)string_relevant_assertions.$sym53$CLOSED_LEXICAL_CLASS_STRING_, tokens, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject stemmed = Mapping.mapcar((SubLObject)string_relevant_assertions.$sym54$FIND_STEM_MEMOIZED, non_closed);
        return Sequences.delete_duplicates(stemmed, Symbols.symbol_function((SubLObject)string_relevant_assertions.EQUAL), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 11308L)
    public static SubLObject prune_specs_lists(final SubLObject specs_lists, final SubLObject max_to_check) {
        SubLObject cp_size = Functions.apply(Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym55$_), Mapping.mapcar(Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym8$LENGTH), specs_lists));
        if (cp_size.numLE(max_to_check)) {
            return specs_lists;
        }
        SubLObject new_specs_lists;
        for (new_specs_lists = Mapping.mapcar((SubLObject)string_relevant_assertions.$sym56$REVERSE, specs_lists); cp_size.numG(max_to_check); cp_size = Functions.apply(Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym55$_), Mapping.mapcar(Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym8$LENGTH), new_specs_lists))) {
            final SubLObject biggest = list_utilities.extremal(new_specs_lists, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym17$GREATER_LENGTH_P), (SubLObject)string_relevant_assertions.UNPROVIDED);
            final SubLObject i = Sequences.position(biggest, new_specs_lists, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            new_specs_lists = list_utilities.replace_nth(i, biggest.rest(), new_specs_lists);
        }
        SubLObject cdolist_list_var = new_specs_lists;
        SubLObject specs_list = (SubLObject)string_relevant_assertions.NIL;
        specs_list = cdolist_list_var.first();
        while (string_relevant_assertions.NIL != cdolist_list_var) {
            final SubLObject last_term = list_utilities.last_one(specs_list);
            sra_note((SubLObject)string_relevant_assertions.$str57$Head___S__Length___S__M_of_last_t, specs_list.first(), Sequences.length(specs_list), term_meaninginess(last_term), last_term, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            specs_list = cdolist_list_var.first();
        }
        return Mapping.mapcar((SubLObject)string_relevant_assertions.$sym56$REVERSE, new_specs_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 12132L)
    public static SubLObject specs_for_term_internal(final SubLObject v_term, SubLObject filter_non_bioP, SubLObject filter_non_thclP) {
        if (filter_non_bioP == string_relevant_assertions.UNPROVIDED) {
            filter_non_bioP = string_relevant_assertions.$filter_non_bio_scgP$.getDynamicValue();
        }
        if (filter_non_thclP == string_relevant_assertions.UNPROVIDED) {
            filter_non_thclP = string_relevant_assertions.$filter_non_thclP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = string_relevant_assertions.$filter_non_bio_scgP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = string_relevant_assertions.$filter_non_thclP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)string_relevant_assertions.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(string_relevant_assertions.$const59$EverythingPSC, thread);
            string_relevant_assertions.$filter_non_bio_scgP$.bind(filter_non_bioP, thread);
            string_relevant_assertions.$filter_non_thclP$.bind(filter_non_thclP, thread);
            return Sort.sort(list_utilities.remove_if_not((SubLObject)string_relevant_assertions.$sym60$DENOT_OKAY_FOR_SUGGESTED_QUERY_SEARCH_, conses_high.union(genls.all_specs(v_term, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), isa.all_instances(v_term, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_), (SubLObject)string_relevant_assertions.$sym19$TERM_MEANINGINESS);
        }
        finally {
            string_relevant_assertions.$filter_non_thclP$.rebind(_prev_bind_4, thread);
            string_relevant_assertions.$filter_non_bio_scgP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 12132L)
    public static SubLObject specs_for_term(final SubLObject v_term, SubLObject filter_non_bioP, SubLObject filter_non_thclP) {
        if (filter_non_bioP == string_relevant_assertions.UNPROVIDED) {
            filter_non_bioP = string_relevant_assertions.$filter_non_bio_scgP$.getDynamicValue();
        }
        if (filter_non_thclP == string_relevant_assertions.UNPROVIDED) {
            filter_non_thclP = string_relevant_assertions.$filter_non_thclP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)string_relevant_assertions.NIL;
        if (string_relevant_assertions.NIL == v_memoization_state) {
            return specs_for_term_internal(v_term, filter_non_bioP, filter_non_thclP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)string_relevant_assertions.$sym21$SPECS_FOR_TERM, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)string_relevant_assertions.$sym21$SPECS_FOR_TERM, (SubLObject)string_relevant_assertions.THREE_INTEGER, (SubLObject)string_relevant_assertions.$int9$1048, (SubLObject)string_relevant_assertions.EQUAL, (SubLObject)string_relevant_assertions.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)string_relevant_assertions.$sym21$SPECS_FOR_TERM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, filter_non_bioP, filter_non_thclP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)string_relevant_assertions.NIL;
            collision = cdolist_list_var.first();
            while (string_relevant_assertions.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (filter_non_bioP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (string_relevant_assertions.NIL != cached_args && string_relevant_assertions.NIL == cached_args.rest() && filter_non_thclP.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(specs_for_term_internal(v_term, filter_non_bioP, filter_non_thclP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, filter_non_bioP, filter_non_thclP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 12587L)
    public static SubLObject bio_filter_coll() {
        if (string_relevant_assertions.$bio_filter_coll$.getGlobalValue() == string_relevant_assertions.$kw61$UNINITIALIZED) {
            final SubLObject init_value = kb_utilities.find_object_by_compact_hl_external_id_string((SubLObject)string_relevant_assertions.$str62$Mx4ruVwdvXNVQ3_homoKKbOqsg);
            if (init_value == string_relevant_assertions.$kw61$UNINITIALIZED) {
                Errors.error((SubLObject)string_relevant_assertions.$str63$Unable_to_initialize__A__, string_relevant_assertions.$bio_filter_coll$.getGlobalValue());
            }
            string_relevant_assertions.$bio_filter_coll$.setGlobalValue(init_value);
        }
        return string_relevant_assertions.$bio_filter_coll$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 12704L)
    public static SubLObject denot_okay_for_suggested_query_searchP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((string_relevant_assertions.NIL == string_relevant_assertions.$filter_non_thclP$.getDynamicValue(thread) || string_relevant_assertions.NIL != thcl.thcl_fortP(v_term, (SubLObject)string_relevant_assertions.UNPROVIDED)) && (string_relevant_assertions.NIL == string_relevant_assertions.$filter_non_bio_scgP$.getDynamicValue(thread) || string_relevant_assertions.NIL != isa.isa_in_any_mtP(v_term, bio_filter_coll()) || string_relevant_assertions.NIL != isa.isa_in_any_mtP(v_term, string_relevant_assertions.$const64$PhysicalPrinciple) || (string_relevant_assertions.NIL != term.el_fort_p(v_term) && string_relevant_assertions.NIL != genls.genl_in_any_mtP(v_term, bio_filter_coll()))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 13126L)
    public static SubLObject get_test_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_strings = (SubLObject)string_relevant_assertions.NIL;
        final SubLObject file_var = string_relevant_assertions.$test_strings_file$.getGlobalValue();
        SubLObject stream = (SubLObject)string_relevant_assertions.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)string_relevant_assertions.NIL, thread);
                stream = compatibility.open_text(file_var, (SubLObject)string_relevant_assertions.$kw66$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)string_relevant_assertions.$str67$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$8 = stream_var;
                SubLObject line_number_var = (SubLObject)string_relevant_assertions.NIL;
                SubLObject line = (SubLObject)string_relevant_assertions.NIL;
                line_number_var = (SubLObject)string_relevant_assertions.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$8); string_relevant_assertions.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$8)) {
                    final SubLObject tokens = string_utilities.string_tokenize(line, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_tab), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    if (string_relevant_assertions.NIL != list_utilities.lengthE(tokens, (SubLObject)string_relevant_assertions.THREE_INTEGER, (SubLObject)string_relevant_assertions.UNPROVIDED) && string_relevant_assertions.NIL != string_utilities.digit_stringP(tokens.first()) && string_relevant_assertions.NIL != string_utilities.non_empty_string_p(conses_high.second(tokens))) {
                        test_strings = (SubLObject)ConsesLow.cons(conses_high.second(tokens), test_strings);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)string_relevant_assertions.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(test_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 13603L)
    public static SubLObject test_test_strings(SubLObject combo_cutoff, SubLObject output_suffix) {
        if (combo_cutoff == string_relevant_assertions.UNPROVIDED) {
            combo_cutoff = (SubLObject)string_relevant_assertions.$int11$100000;
        }
        if (output_suffix == string_relevant_assertions.UNPROVIDED) {
            output_suffix = (SubLObject)string_relevant_assertions.$str68$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_strings = get_test_strings();
        final SubLObject msg = Sequences.cconcatenate((SubLObject)string_relevant_assertions.$str69$Testing_, new SubLObject[] { format_nil.format_nil_d_no_copy(Sequences.length(test_strings)), string_relevant_assertions.$str70$_strings___ });
        SubLObject okay_to_proceedP = Types.sublisp_null(string_relevant_assertions.$start_on_test_string$.getDynamicValue(thread));
        final SubLObject list_var = test_strings;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((string_relevant_assertions.NIL != msg) ? msg : string_relevant_assertions.$str71$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)string_relevant_assertions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)string_relevant_assertions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)string_relevant_assertions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)string_relevant_assertions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject test_string = (SubLObject)string_relevant_assertions.NIL;
                test_string = csome_list_var.first();
                while (string_relevant_assertions.NIL != csome_list_var) {
                    if (string_relevant_assertions.$start_on_test_string$.getDynamicValue(thread).equal(test_string)) {
                        okay_to_proceedP = (SubLObject)string_relevant_assertions.T;
                    }
                    if (string_relevant_assertions.NIL != okay_to_proceedP) {
                        test_test_string(test_string, combo_cutoff, output_suffix);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)string_relevant_assertions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    test_string = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)string_relevant_assertions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 14106L)
    public static SubLObject test_test_string(final SubLObject test_string, SubLObject combo_cutoff, SubLObject output_suffix) {
        if (combo_cutoff == string_relevant_assertions.UNPROVIDED) {
            combo_cutoff = (SubLObject)string_relevant_assertions.$int11$100000;
        }
        if (output_suffix == string_relevant_assertions.UNPROVIDED) {
            output_suffix = (SubLObject)string_relevant_assertions.$str68$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = (SubLObject)string_relevant_assertions.NIL;
        SubLObject err_msg = (SubLObject)string_relevant_assertions.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)string_relevant_assertions.$sym72$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$within_with_timeout$.bind((SubLObject)string_relevant_assertions.T, thread);
                            SubLObject timer = (SubLObject)string_relevant_assertions.NIL;
                            try {
                                final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)string_relevant_assertions.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)string_relevant_assertions.$int73$300, tag);
                                    SubLObject time = (SubLObject)string_relevant_assertions.NIL;
                                    SubLObject assertion_nl_scores = (SubLObject)string_relevant_assertions.NIL;
                                    final SubLObject time_var = Time.get_internal_real_time();
                                    assertion_nl_scores = assertions_for_prompt_string(test_string, string_relevant_assertions.$const74$CytologicalProcessesRecommendedWF, combo_cutoff);
                                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    SubLObject filename;
                                    for (filename = Sequences.cconcatenate((SubLObject)string_relevant_assertions.$str75$_tmp_test_results_test_run_, new SubLObject[] { output_suffix, string_relevant_assertions.$str76$_, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), string_relevant_assertions.$str77$_cfasl }); string_relevant_assertions.NIL != file_utilities.file_existsP(filename); filename = Sequences.cconcatenate((SubLObject)string_relevant_assertions.$str75$_tmp_test_results_test_run_, new SubLObject[] { output_suffix, string_relevant_assertions.$str76$_, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), string_relevant_assertions.$str77$_cfasl })) {
                                        Threads.sleep((SubLObject)string_relevant_assertions.$float43$0_5);
                                    }
                                    cfasl_utilities.cfasl_save_externalized((SubLObject)ConsesLow.list(test_string, time, assertion_nl_scores), filename);
                                    SubLObject done_count = (SubLObject)string_relevant_assertions.ZERO_INTEGER;
                                    SubLObject doneP = (SubLObject)string_relevant_assertions.NIL;
                                    sra_note((SubLObject)string_relevant_assertions.$str78$____Prompt___A____in__A_, test_string, numeric_date_utilities.readable_elapsed_time_string(time, (SubLObject)string_relevant_assertions.ZERO_INTEGER), (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
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
                                    for (rest = (SubLObject)string_relevant_assertions.NIL, rest = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_)); string_relevant_assertions.NIL == doneP && string_relevant_assertions.NIL != rest; doneP = Numbers.numGE(done_count, (SubLObject)string_relevant_assertions.TEN_INTEGER), rest = rest.rest()) {
                                        cons = rest.first();
                                        datum = (current = cons);
                                        assertionXnl = (SubLObject)string_relevant_assertions.NIL;
                                        score = (SubLObject)string_relevant_assertions.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list36);
                                        assertionXnl = current.first();
                                        current = (score = current.rest());
                                        datum_$12 = (current_$13 = assertionXnl);
                                        assertion = (SubLObject)string_relevant_assertions.NIL;
                                        nl = (SubLObject)string_relevant_assertions.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)string_relevant_assertions.$list37);
                                        assertion = current_$13.first();
                                        current_$13 = (nl = current_$13.rest());
                                        sra_note((SubLObject)string_relevant_assertions.$str79$__D___A__, score, nl, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                                        done_count = Numbers.add(done_count, (SubLObject)string_relevant_assertions.ONE_INTEGER);
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)string_relevant_assertions.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    subl_macro_promotions.with_timeout_stop_timer(timer);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        }
                        finally {
                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)string_relevant_assertions.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            err_msg = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (string_relevant_assertions.NIL != err_msg) {
            sra_warn((SubLObject)string_relevant_assertions.$str80$Caught_error_working_on__S_____S, test_string, err_msg, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        if (string_relevant_assertions.NIL != timed_outP) {
            sra_warn((SubLObject)string_relevant_assertions.$str81$Timed_out_working_on__S, test_string, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 15567L)
    public static SubLObject cb_string_relevant_assertions(SubLObject args) {
        if (args == string_relevant_assertions.UNPROVIDED) {
            args = (SubLObject)string_relevant_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)string_relevant_assertions.$str82$String_Relevant_Assertions;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((string_relevant_assertions.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str83$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (string_relevant_assertions.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                html_utilities.html_markup((SubLObject)string_relevant_assertions.$str84$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == string_relevant_assertions.$kw61$UNINITIALIZED) ? ConsesLow.list(string_relevant_assertions.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)string_relevant_assertions.$kw85$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (string_relevant_assertions.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)string_relevant_assertions.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (string_relevant_assertions.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)string_relevant_assertions.$str88$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)string_relevant_assertions.$str89$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str90$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str91$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)string_relevant_assertions.$str92$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            if (string_relevant_assertions.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (string_relevant_assertions.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)string_relevant_assertions.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)string_relevant_assertions.$str93$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        if (string_relevant_assertions.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)string_relevant_assertions.$str94$cb_handle_string_relevant_asserti, (SubLObject)string_relevant_assertions.T, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)string_relevant_assertions.$str95$Submit, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)string_relevant_assertions.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)string_relevant_assertions.$str96$Question_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_script_utilities.html_clear_input_button((SubLObject)string_relevant_assertions.$str97$prompt, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)string_relevant_assertions.$str97$prompt, (SubLObject)string_relevant_assertions.$str68$, (SubLObject)string_relevant_assertions.$int98$80);
                            html_utilities.html_newline((SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$15, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 16409L)
    public static SubLObject cb_handle_string_relevant_assertions(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prompt = html_utilities.html_extract_input((SubLObject)string_relevant_assertions.$str97$prompt, args);
        final SubLObject title_var;
        final SubLObject title_string = title_var = Sequences.cconcatenate((SubLObject)string_relevant_assertions.$str101$Relevant_Assertions_for_, format_nil.format_nil_s_no_copy(prompt));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((string_relevant_assertions.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str83$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (string_relevant_assertions.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                html_utilities.html_markup((SubLObject)string_relevant_assertions.$str84$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == string_relevant_assertions.$kw61$UNINITIALIZED) ? ConsesLow.list(string_relevant_assertions.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)string_relevant_assertions.$kw85$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (string_relevant_assertions.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)string_relevant_assertions.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (string_relevant_assertions.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)string_relevant_assertions.$str88$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)string_relevant_assertions.$str89$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str90$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.$str91$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)string_relevant_assertions.$str92$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            if (string_relevant_assertions.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (string_relevant_assertions.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)string_relevant_assertions.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_newline((SubLObject)string_relevant_assertions.UNPROVIDED);
                            final SubLObject assertion_nl_scores = assertions_for_prompt_string(prompt, string_relevant_assertions.$const10$InferencePSC, (SubLObject)string_relevant_assertions.$int102$500000);
                            if (string_relevant_assertions.NIL != dictionary.dictionary_empty_p(assertion_nl_scores)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)string_relevant_assertions.TWO_INTEGER);
                                html_utilities.html_princ((SubLObject)string_relevant_assertions.$str103$Sorry__no_results_for_);
                                cb_utilities.cb_form(prompt, (SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)string_relevant_assertions.$str104$_were_found_);
                                html_utilities.html_newline((SubLObject)string_relevant_assertions.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            else {
                                html_print_relevant_assertion_list(assertion_nl_scores);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$20, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 17130L)
    public static SubLObject html_print_relevant_assertion_list(final SubLObject assertion_nl_scores) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_count = dictionary.dictionary_length(assertion_nl_scores);
        final SubLObject one_assertionP = Equality.eql(assertion_count, (SubLObject)string_relevant_assertions.ONE_INTEGER);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)string_relevant_assertions.$str106$The_following__A__A_found__, (SubLObject)((string_relevant_assertions.NIL != one_assertionP) ? string_relevant_assertions.$str107$assertion : PrintLow.format((SubLObject)string_relevant_assertions.NIL, (SubLObject)string_relevant_assertions.$str108$_D_assertions, assertion_count)), (SubLObject)((string_relevant_assertions.NIL != one_assertionP) ? string_relevant_assertions.$str109$was : string_relevant_assertions.$str110$were));
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
        html_utilities.html_markup((SubLObject)string_relevant_assertions.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                final SubLObject width = (SubLObject)string_relevant_assertions.THREE_INTEGER;
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                if (string_relevant_assertions.NIL != width) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(width);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                    html_utilities.html_hr((SubLObject)string_relevant_assertions.UNPROVIDED, (SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
            SubLObject color_toggle = (SubLObject)string_relevant_assertions.T;
            final SubLObject color1 = html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue();
            final SubLObject color2 = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
            SubLObject count = (SubLObject)string_relevant_assertions.ZERO_INTEGER;
            SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_nl_scores, Symbols.symbol_function((SubLObject)string_relevant_assertions.$sym18$_));
            SubLObject cons = (SubLObject)string_relevant_assertions.NIL;
            cons = cdolist_list_var.first();
            while (string_relevant_assertions.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject assertionXnl = (SubLObject)string_relevant_assertions.NIL;
                SubLObject score = (SubLObject)string_relevant_assertions.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)string_relevant_assertions.$list36);
                assertionXnl = current.first();
                current = (score = current.rest());
                final SubLObject bgcolor = (string_relevant_assertions.NIL != color_toggle) ? color1 : color2;
                SubLObject current_$28;
                final SubLObject datum_$27 = current_$28 = assertionXnl;
                SubLObject assertion = (SubLObject)string_relevant_assertions.NIL;
                SubLObject nl = (SubLObject)string_relevant_assertions.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$28, datum_$27, (SubLObject)string_relevant_assertions.$list37);
                assertion = current_$28.first();
                current_$28 = (nl = current_$28.rest());
                final SubLObject size_val = (SubLObject)string_relevant_assertions.FOUR_INTEGER;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (string_relevant_assertions.NIL != size_val) {
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(size_val);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (string_relevant_assertions.NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw111$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw112$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            final SubLObject color_val = (SubLObject)string_relevant_assertions.$kw113$DARK_GRAY;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (string_relevant_assertions.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                                html_utilities.html_princ(number_utilities.f_1X(count));
                                html_utilities.html_princ((SubLObject)string_relevant_assertions.$str114$_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw115$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw112$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_markup(nl);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (string_relevant_assertions.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw111$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw112$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw115$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)string_relevant_assertions.$kw112$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                        final SubLObject size_val2 = (SubLObject)string_relevant_assertions.TWO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (string_relevant_assertions.NIL != size_val2) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                            html_utilities.html_markup(size_val2);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
                            cb_utilities.cb_form(assertion, (SubLObject)string_relevant_assertions.ZERO_INTEGER, (SubLObject)string_relevant_assertions.T);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)string_relevant_assertions.UNPROVIDED);
                color_toggle = (SubLObject)SubLObjectFactory.makeBoolean(string_relevant_assertions.NIL == color_toggle);
                count = Numbers.add(count, (SubLObject)string_relevant_assertions.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/string-relevant-assertions.lisp", position = 18695L)
    public static SubLObject cb_link_string_relevant_assertions(SubLObject linktext) {
        if (linktext == string_relevant_assertions.UNPROVIDED) {
            linktext = (SubLObject)string_relevant_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string_relevant_assertions.NIL == linktext) {
            linktext = (SubLObject)string_relevant_assertions.$str82$String_Relevant_Assertions;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)string_relevant_assertions.$kw116$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)string_relevant_assertions.$str117$cb_string_relevant_assertions);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
        if (string_relevant_assertions.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)string_relevant_assertions.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)string_relevant_assertions.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)string_relevant_assertions.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    public static SubLObject declare_string_relevant_assertions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "sra_note", "SRA-NOTE", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "sra_warn", "SRA-WARN", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "suggested_query_term_sets_for_string", "SUGGESTED-QUERY-TERM-SETS-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "remove_short_lists", "REMOVE-SHORT-LISTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "spec_in_any_mtP_internal", "SPEC-IN-ANY-MT?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "spec_in_any_mtP", "SPEC-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "assertions_for_prompt_string", "ASSERTIONS-FOR-PROMPT-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "score_prompt_term_combos", "SCORE-PROMPT-TERM-COMBOS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "prompt_term_combo_score", "PROMPT-TERM-COMBO-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "specificity_estimate", "SPECIFICITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "term_meaninginess_internal", "TERM-MEANINGINESS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "term_meaninginess", "TERM-MEANINGINESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "assertions_from_prompt_term_combo", "ASSERTIONS-FROM-PROMPT-TERM-COMBO", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "almost_out_of_inference_timeP", "ALMOST-OUT-OF-INFERENCE-TIME?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "score_assertions_for_prompt_string", "SCORE-ASSERTIONS-FOR-PROMPT-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "truncate_tail", "TRUNCATE-TAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "assertion_nl_okayP", "ASSERTION-NL-OKAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "assertion_cycl_okayP", "ASSERTION-CYCL-OKAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "prune_assertions", "PRUNE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "significant_words", "SIGNIFICANT-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "prune_specs_lists", "PRUNE-SPECS-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "specs_for_term_internal", "SPECS-FOR-TERM-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "specs_for_term", "SPECS-FOR-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "bio_filter_coll", "BIO-FILTER-COLL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "denot_okay_for_suggested_query_searchP", "DENOT-OKAY-FOR-SUGGESTED-QUERY-SEARCH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "get_test_strings", "GET-TEST-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "test_test_strings", "TEST-TEST-STRINGS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "test_test_string", "TEST-TEST-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "cb_string_relevant_assertions", "CB-STRING-RELEVANT-ASSERTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "cb_handle_string_relevant_assertions", "CB-HANDLE-STRING-RELEVANT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "html_print_relevant_assertion_list", "HTML-PRINT-RELEVANT-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.string_relevant_assertions", "cb_link_string_relevant_assertions", "CB-LINK-STRING-RELEVANT-ASSERTIONS", 0, 1, false);
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    public static SubLObject init_string_relevant_assertions_file() {
        string_relevant_assertions.$current_stack$ = SubLFiles.deflexical("*CURRENT-STACK*", (SubLObject)string_relevant_assertions.NIL);
        string_relevant_assertions.$sra_debugP$ = SubLFiles.defparameter("*SRA-DEBUG?*", (SubLObject)string_relevant_assertions.NIL);
        string_relevant_assertions.$filter_non_thclP$ = SubLFiles.defparameter("*FILTER-NON-THCL?*", (SubLObject)string_relevant_assertions.NIL);
        string_relevant_assertions.$filter_non_bio_scgP$ = SubLFiles.defparameter("*FILTER-NON-BIO-SCG?*", (SubLObject)string_relevant_assertions.T);
        string_relevant_assertions.$overlap_index_check_count$ = SubLFiles.defparameter("*OVERLAP-INDEX-CHECK-COUNT*", (SubLObject)string_relevant_assertions.ZERO_INTEGER);
        string_relevant_assertions.$word_overlap_score_weight$ = SubLFiles.deflexical("*WORD-OVERLAP-SCORE-WEIGHT*", (SubLObject)string_relevant_assertions.ONE_INTEGER);
        string_relevant_assertions.$assertion_source_score_weight$ = SubLFiles.deflexical("*ASSERTION-SOURCE-SCORE-WEIGHT*", (SubLObject)string_relevant_assertions.ONE_INTEGER);
        string_relevant_assertions.$bio_filter_coll$ = SubLFiles.deflexical("*BIO-FILTER-COLL*", (SubLObject)string_relevant_assertions.$kw61$UNINITIALIZED);
        string_relevant_assertions.$test_strings_file$ = SubLFiles.deflexical("*TEST-STRINGS-FILE*", (SubLObject)string_relevant_assertions.$str65$_home_ubuntu_test_strings_txt);
        string_relevant_assertions.$start_on_test_string$ = SubLFiles.defparameter("*START-ON-TEST-STRING*", (SubLObject)string_relevant_assertions.NIL);
        return (SubLObject)string_relevant_assertions.NIL;
    }
    
    public static SubLObject setup_string_relevant_assertions_file() {
        memoization_state.note_memoized_function((SubLObject)string_relevant_assertions.$sym5$SPEC_IN_ANY_MT_);
        memoization_state.note_memoized_function((SubLObject)string_relevant_assertions.$sym19$TERM_MEANINGINESS);
        memoization_state.note_memoized_function((SubLObject)string_relevant_assertions.$sym21$SPECS_FOR_TERM);
        html_macros.note_cgi_handler_function((SubLObject)string_relevant_assertions.$sym99$CB_STRING_RELEVANT_ASSERTIONS, (SubLObject)string_relevant_assertions.$kw100$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)string_relevant_assertions.$sym105$CB_HANDLE_STRING_RELEVANT_ASSERTIONS, (SubLObject)string_relevant_assertions.$kw100$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)string_relevant_assertions.$kw118$STRING_RELEVANT_ASSERTIONS, (SubLObject)string_relevant_assertions.$sym119$CB_LINK_STRING_RELEVANT_ASSERTIONS, (SubLObject)string_relevant_assertions.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)string_relevant_assertions.$kw118$STRING_RELEVANT_ASSERTIONS, (SubLObject)string_relevant_assertions.$str82$String_Relevant_Assertions, (SubLObject)string_relevant_assertions.$str120$SRA, (SubLObject)string_relevant_assertions.$str121$Assertion_lookup_from_strings);
        return (SubLObject)string_relevant_assertions.NIL;
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
        me = (SubLFile)new string_relevant_assertions();
        string_relevant_assertions.$current_stack$ = null;
        string_relevant_assertions.$sra_debugP$ = null;
        string_relevant_assertions.$filter_non_thclP$ = null;
        string_relevant_assertions.$filter_non_bio_scgP$ = null;
        string_relevant_assertions.$overlap_index_check_count$ = null;
        string_relevant_assertions.$word_overlap_score_weight$ = null;
        string_relevant_assertions.$assertion_source_score_weight$ = null;
        string_relevant_assertions.$bio_filter_coll$ = null;
        string_relevant_assertions.$test_strings_file$ = null;
        string_relevant_assertions.$start_on_test_string$ = null;
        $str0$__ = SubLObjectFactory.makeString("~&");
        $kw1$GETTING_DENOTS = SubLObjectFactory.makeKeyword("GETTING-DENOTS");
        $list2 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"));
        $kw3$REMOVING_SUBSUMED_DENOTS = SubLObjectFactory.makeKeyword("REMOVING-SUBSUMED-DENOTS");
        $kw4$DILIGENT = SubLObjectFactory.makeKeyword("DILIGENT");
        $sym5$SPEC_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("SPEC-IN-ANY-MT?");
        $kw6$FILTERING_DENOTS = SubLObjectFactory.makeKeyword("FILTERING-DENOTS");
        $sym7$__ = SubLObjectFactory.makeSymbol(">=");
        $sym8$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $int9$1048 = SubLObjectFactory.makeInteger(1048);
        $const10$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $int11$100000 = SubLObjectFactory.makeInteger(100000);
        $str12$__Term_sets___S__ = SubLObjectFactory.makeString("~%Term sets: ~S~%");
        $str13$Doing_prompt_term_combos_of_lengt = SubLObjectFactory.makeString("Doing prompt-term combos of length ~D");
        $list14 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROMPT-TERM-COMBO"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"));
        $kw15$DOING_PROMPT_TERM_COMBO = SubLObjectFactory.makeKeyword("DOING-PROMPT-TERM-COMBO");
        $str16$Stopping_search_after__D_combos__ = SubLObjectFactory.makeString("Stopping search after ~D combos~% for ~S.~% Found ~D sets of assertions:~%~S");
        $sym17$GREATER_LENGTH_P = SubLObjectFactory.makeSymbol("GREATER-LENGTH-P");
        $sym18$_ = SubLObjectFactory.makeSymbol(">");
        $sym19$TERM_MEANINGINESS = SubLObjectFactory.makeSymbol("TERM-MEANINGINESS");
        $str20$__S__ = SubLObjectFactory.makeString(" ~S~%");
        $sym21$SPECS_FOR_TERM = SubLObjectFactory.makeSymbol("SPECS-FOR-TERM");
        $str22$Got__D_assertions_for__S = SubLObjectFactory.makeString("Got ~D assertions for ~S");
        $str23$Checked__D_combos_from__S__ = SubLObjectFactory.makeString("Checked ~D combos from ~S~%");
        $sym24$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str25$Only__D_seconds_of_inference_time = SubLObjectFactory.makeString("Only ~D seconds of inference time left!!");
        $sym26$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list27 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"));
        $kw28$SCORING_ASSERTIONS = SubLObjectFactory.makeKeyword("SCORING-ASSERTIONS");
        $kw29$PARAPHRASING = SubLObjectFactory.makeKeyword("PARAPHRASING");
        $kw30$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw31$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw32$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw33$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str34$Bad_NL__S___for__S = SubLObjectFactory.makeString("Bad NL ~S~% for ~S");
        $str35$Aborting_post_processing_of_relev = SubLObjectFactory.makeString("Aborting post-processing of relevant assertions due to inference time constraints.");
        $list36 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION.NL"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"));
        $list37 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("NL"));
        $str38$__2F___A__ = SubLObjectFactory.makeString("~,2F: ~A~%");
        $list39 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"));
        $str40$Best_score____2F = SubLObjectFactory.makeString("Best score: ~,2F");
        $float41$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $str42$Truncate_5____S = SubLObjectFactory.makeString("Truncate 5+: ~S");
        $float43$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str44$Truncate_10____S = SubLObjectFactory.makeString("Truncate 10+: ~S");
        $str45$Truncate_20____S = SubLObjectFactory.makeString("Truncate 20+: ~S");
        $str46$__ = SubLObjectFactory.makeString("#$");
        $list47 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceParameterValueInSpecification")));
        $sym48$ASSERTION_CYCL_OKAY_ = SubLObjectFactory.makeSymbol("ASSERTION-CYCL-OKAY?");
        $int49$100 = SubLObjectFactory.makeInteger(100);
        $str50$Pruning_list_of__D_assertions_ = SubLObjectFactory.makeString("Pruning list of ~D assertions.");
        $sym51$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $sym52$PUNCTUATION_P = SubLObjectFactory.makeSymbol("PUNCTUATION-P");
        $sym53$CLOSED_LEXICAL_CLASS_STRING_ = SubLObjectFactory.makeSymbol("CLOSED-LEXICAL-CLASS-STRING?");
        $sym54$FIND_STEM_MEMOIZED = SubLObjectFactory.makeSymbol("FIND-STEM-MEMOIZED");
        $sym55$_ = SubLObjectFactory.makeSymbol("*");
        $sym56$REVERSE = SubLObjectFactory.makeSymbol("REVERSE");
        $str57$Head___S__Length___S__M_of_last_t = SubLObjectFactory.makeString("Head: ~S. Length: ~S. M of last term: ~,2F (~S)~%");
        $sym58$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const59$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym60$DENOT_OKAY_FOR_SUGGESTED_QUERY_SEARCH_ = SubLObjectFactory.makeSymbol("DENOT-OKAY-FOR-SUGGESTED-QUERY-SEARCH?");
        $kw61$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str62$Mx4ruVwdvXNVQ3_homoKKbOqsg = SubLObjectFactory.makeString("Mx4ruVwdvXNVQ3-homoKKbOqsg");
        $str63$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $const64$PhysicalPrinciple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalPrinciple"));
        $str65$_home_ubuntu_test_strings_txt = SubLObjectFactory.makeString("/home/ubuntu/test-strings.txt");
        $kw66$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str67$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str68$ = SubLObjectFactory.makeString("");
        $str69$Testing_ = SubLObjectFactory.makeString("Testing ");
        $str70$_strings___ = SubLObjectFactory.makeString(" strings...");
        $str71$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym72$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $int73$300 = SubLObjectFactory.makeInteger(300);
        $const74$CytologicalProcessesRecommendedWF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CytologicalProcessesRecommendedWFFCheckingMt"));
        $str75$_tmp_test_results_test_run_ = SubLObjectFactory.makeString("/tmp/test-results/test-run-");
        $str76$_ = SubLObjectFactory.makeString("-");
        $str77$_cfasl = SubLObjectFactory.makeString(".cfasl");
        $str78$____Prompt___A____in__A_ = SubLObjectFactory.makeString("~%~%Prompt: ~A~% (in ~A)");
        $str79$__D___A__ = SubLObjectFactory.makeString(" ~D: ~A~%");
        $str80$Caught_error_working_on__S_____S = SubLObjectFactory.makeString("Caught error working on ~S:~% ~S");
        $str81$Timed_out_working_on__S = SubLObjectFactory.makeString("Timed out working on ~S");
        $str82$String_Relevant_Assertions = SubLObjectFactory.makeString("String-Relevant Assertions");
        $str83$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str84$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw85$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw86$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw87$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str88$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str89$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str90$button = SubLObjectFactory.makeString("button");
        $str91$reload = SubLObjectFactory.makeString("reload");
        $str92$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str93$post = SubLObjectFactory.makeString("post");
        $str94$cb_handle_string_relevant_asserti = SubLObjectFactory.makeString("cb-handle-string-relevant-assertions");
        $str95$Submit = SubLObjectFactory.makeString("Submit");
        $str96$Question_ = SubLObjectFactory.makeString("Question:");
        $str97$prompt = SubLObjectFactory.makeString("prompt");
        $int98$80 = SubLObjectFactory.makeInteger(80);
        $sym99$CB_STRING_RELEVANT_ASSERTIONS = SubLObjectFactory.makeSymbol("CB-STRING-RELEVANT-ASSERTIONS");
        $kw100$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str101$Relevant_Assertions_for_ = SubLObjectFactory.makeString("Relevant Assertions for ");
        $int102$500000 = SubLObjectFactory.makeInteger(500000);
        $str103$Sorry__no_results_for_ = SubLObjectFactory.makeString("Sorry, no results for ");
        $str104$_were_found_ = SubLObjectFactory.makeString(" were found.");
        $sym105$CB_HANDLE_STRING_RELEVANT_ASSERTIONS = SubLObjectFactory.makeSymbol("CB-HANDLE-STRING-RELEVANT-ASSERTIONS");
        $str106$The_following__A__A_found__ = SubLObjectFactory.makeString("The following ~A ~A found: ");
        $str107$assertion = SubLObjectFactory.makeString("assertion");
        $str108$_D_assertions = SubLObjectFactory.makeString("~D assertions");
        $str109$was = SubLObjectFactory.makeString("was");
        $str110$were = SubLObjectFactory.makeString("were");
        $kw111$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw112$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw113$DARK_GRAY = SubLObjectFactory.makeKeyword("DARK-GRAY");
        $str114$_ = SubLObjectFactory.makeString(".");
        $kw115$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw116$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str117$cb_string_relevant_assertions = SubLObjectFactory.makeString("cb-string-relevant-assertions");
        $kw118$STRING_RELEVANT_ASSERTIONS = SubLObjectFactory.makeKeyword("STRING-RELEVANT-ASSERTIONS");
        $sym119$CB_LINK_STRING_RELEVANT_ASSERTIONS = SubLObjectFactory.makeSymbol("CB-LINK-STRING-RELEVANT-ASSERTIONS");
        $str120$SRA = SubLObjectFactory.makeString("SRA");
        $str121$Assertion_lookup_from_strings = SubLObjectFactory.makeString("Assertion lookup from strings");
    }
}

/*

	Total time: 661 ms
	
*/