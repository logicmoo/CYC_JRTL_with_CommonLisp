package com.cyc.cycjava.cycl.rtp;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.standard_tokenization;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class recognition extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rtp.recognition";
    public static final String myFingerPrint = "4b3fbae1b227daac704309bc89d864d7e4fc742941deefe6dd388fd3b46b23af";
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1048L)
    public static SubLSymbol $rtp_use_caches$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1125L)
    public static SubLSymbol $return_early$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1229L)
    public static SubLSymbol $greedy_kleene$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1368L)
    public static SubLSymbol $rtp_perform_semantic_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1529L)
    public static SubLSymbol $parse_entire_string$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1664L)
    public static SubLSymbol $completed_words_list$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2812L)
    public static SubLSymbol $perform_template_component_join$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2874L)
    public static SubLSymbol $template_parse_includes_template_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 13259L)
    private static SubLSymbol $counted_template_set$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 16948L)
    private static SubLSymbol $rtp_display_filter_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 17000L)
    private static SubLSymbol $use_best_templates_first$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 20654L)
    private static SubLSymbol $partial_orders_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78055L)
    private static SubLSymbol $expand_word_items_in_list_int_caching_state$;
    private static final SubLSymbol $kw0$EXTERNAL;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$PWHEN;
    private static final SubLSymbol $sym4$__;
    private static final SubLSymbol $sym5$_RTP_TRACE_LEVEL_;
    private static final SubLSymbol $sym6$RTP_TRACER_OUTPUT;
    private static final SubLSymbol $sym7$LIST;
    private static final SubLSymbol $sym8$FORMAT;
    private static final SubLObject $const9$STemplate;
    private static final SubLObject $const10$Simply;
    private static final SubLObject $const11$joinTemplateComponents;
    private static final SubLSymbol $sym12$NULL;
    private static final SubLSymbol $sym13$FILTER_SEMANTIC_TESTS;
    private static final SubLSymbol $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_;
    private static final SubLSymbol $sym15$TRANSFORM_JOINTEMPLATECOMPONENTS;
    private static final SubLObject $const16$RewriteSequenceFn;
    private static final SubLObject $const17$AssemblePhraseFn;
    private static final SubLSymbol $kw18$LEADING;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$S_NP_VP;
    private static final SubLSymbol $kw21$SBAR_WHNP_S;
    private static final SubLObject $const22$TheSentenceSubject;
    private static final SubLSymbol $kw23$TRAILING;
    private static final SubLObject $const24$TheGappedTerm;
    private static final SubLString $str25$results_of_first_pass____S__;
    private static final SubLString $str26$working_on_entry1___S__;
    private static final SubLString $str27$fully_bound_entries____S__;
    private static final SubLString $str28$unbound_entries____S__;
    private static final SubLString $str29$recurring_on___S__;
    private static final SubLSymbol $kw30$ALL;
    private static final SubLSymbol $kw31$GENERIC;
    private static final SubLString $str32$FILTER_RULES___S__;
    private static final SubLInteger $int33$30;
    private static final SubLSymbol $sym34$_;
    private static final SubLSymbol $sym35$GET_COUNTED_SETHASH_ENTRY_COUNT;
    private static final SubLString $str36$_2_words___a_2_;
    private static final SubLString $str37$rule___a__transformation___a_2_;
    private static final SubLString $str38$_2_;
    private static final SubLSymbol $sym39$VALID_ASSERTION;
    private static final SubLSymbol $sym40$TEMPLATE_RULE_ASSERTION;
    private static final SubLSymbol $sym41$TEMPLATE_CAN_PRECEDE;
    private static final SubLSymbol $sym42$CAR;
    private static final SubLSymbol $sym43$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const44$EverythingPSC;
    private static final SubLObject $const45$templatePrecedes;
    private static final SubLString $str46$split_sentence____S__;
    private static final SubLString $str47$at_top_of_cdolist__current_entrie;
    private static final SubLString $str48$top_entry____S__;
    private static final SubLString $str49$template_item____S__;
    private static final SubLString $str50$RTP_Chart_Entry_is_empty___;
    private static final SubLString $str51$Equal_to_completed_word_list__;
    private static final SubLString $str52$No_hits_for_template_item__S__;
    private static final SubLString $str53$current_entries____S__;
    private static final SubLString $str54$_________COMPLETED_ENTRIES_______;
    private static final SubLSymbol $kw55$INTERNAL;
    private static final SubLList $list56;
    private static final SubLString $str57$adding_some_subconstits_for__S__;
    private static final SubLString $str58$____split_out____S_____template_r;
    private static final SubLString $str59$____splits____S_____;
    private static final SubLString $str60$lyst__S__;
    private static final SubLString $str61$used_words____S__;
    private static final SubLString $str62$length_of_used_words____S__;
    private static final SubLString $str63$just_ate__S_words__;
    private static final SubLString $str64$words_in_entry____S__;
    private static final SubLString $str65$subconstit_eaten____S__;
    private static final SubLString $str66$subconstit_is__A_recursive__;
    private static final SubLString $str67$;
    private static final SubLString $str68$not_;
    private static final SubLString $str69$pushing_a_new_subconstit___S__;
    private static final SubLString $str70$new_entry____A__;
    private static final SubLString $str71$after_eating_subconstit__new_entr;
    private static final SubLString $str72$failed_template____A__;
    private static final SubLString $str73$new_entry__end_of_recursive_item_;
    private static final SubLString $str74$pushing_entry_at_end_of_recursive;
    private static final SubLObject $const75$and;
    private static final SubLFloat $float76$0_5;
    private static final SubLString $str77$sent_invalid_args___S__S__to_MATC;
    private static final SubLString $str78$template_remainder____S__stop_ite;
    private static final SubLString $str79$stop_remainder____S__template_unu;
    private static final SubLString $str80$item____S__original_words____S__;
    private static final SubLString $str81$single_const_lists____S__;
    private static final SubLString $str82$lyst____S__result____S__;
    private static final SubLSymbol $sym83$EXPAND_WORD_ITEMS_IN_LIST;
    private static final SubLString $str84$incomplete_states____S__;
    private static final SubLString $str85$present_state____S__;
    private static final SubLString $str86$call_to_compute_matches_with_an_e;
    private static final SubLString $str87$cond1;
    private static final SubLString $str88$cond2;
    private static final SubLString $str89$cond6;
    private static final SubLString $str90$cond3;
    private static final SubLString $str91$cond4;
    private static final SubLString $str92$cond5;
    private static final SubLString $str93$x____S__;
    private static final SubLString $str94$intermed_words____S__first_first_;
    private static final SubLString $str95$sent_an_unexpanded_item___S__to_f;
    private static final SubLString $str96$sent_invalid_item__S_to_find_rtp_;
    private static final SubLSymbol $kw97$UNLOCATED;
    private static final SubLString $str98$entered_remove_kleene_words_with_;
    private static final SubLString $str99$removed_list____S__;
    private static final SubLString $str100$_word_list__S____template__S____f;
    private static final SubLString $str101$words_________S__;
    private static final SubLString $str102$sem___________S__;
    private static final SubLString $str103$bindings______S__;
    private static final SubLString $str104$subconsts_____S__;
    private static final SubLSymbol $sym105$GET_STRINGS_OF_TYPE_CACHED;
    private static final SubLSymbol $kw106$DENOT;
    private static final SubLSymbol $sym107$EXPAND_WORD_ITEMS_IN_LIST_INT;
    private static final SubLObject $const108$RequireOne;
    private static final SubLSymbol $sym109$_EXPAND_WORD_ITEMS_IN_LIST_INT_CACHING_STATE_;
    private static final SubLInteger $int110$2048;
    private static final SubLInteger $int111$256;
    private static final SubLString $str112$RTP__sent_in_a_non_function_to_RE;
    private static final SubLObject $const113$RequireSome;
    private static final SubLObject $const114$OptionalSome;
    private static final SubLObject $const115$OptionalOne;
    private static final SubLObject $const116$WordSequence;
    private static final SubLSymbol $kw117$SEQUENCE;
    private static final SubLSymbol $kw118$COMPLETE;
    private static final SubLString $str119$word_list____S____words____S__;
    private static final SubLSymbol $kw120$RESET;
    private static final SubLString $str121$subconstit____S__;
    private static final SubLString $str122$present_subconstit____S__;
    private static final SubLString $str123$entry_list____S__;
    private static final SubLString $str124$inside_template_category__;
    private static final SubLString $str125$int_result____S__;
    private static final SubLString $str126$inside_the_T;
    private static final SubLString $str127$entries____S__;
    private static final SubLString $str128$push_sem_from__S__;
    private static final SubLString $str129$pushing__S__;
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 1793L)
    public static SubLObject rtp_trace_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)recognition.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)recognition.$list2);
        level = current.first();
        final SubLObject options;
        current = (options = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)recognition.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)recognition.$sym4$__, (SubLObject)recognition.$sym5$_RTP_TRACE_LEVEL_, level), (SubLObject)ConsesLow.list((SubLObject)recognition.$sym6$RTP_TRACER_OUTPUT, level, reader.bq_cons((SubLObject)recognition.$sym7$LIST, ConsesLow.append(options, (SubLObject)recognition.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2095L)
    public static SubLObject rtp_tracer_output(final SubLObject level, final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Functions.apply(Symbols.symbol_function((SubLObject)recognition.$sym8$FORMAT), (SubLObject)ConsesLow.cons((SubLObject)recognition.T, format_control));
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2430L)
    public static SubLObject rtp_trace(SubLObject level) {
        if (level == recognition.UNPROVIDED) {
            level = (SubLObject)recognition.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        rtp_vars.$rtp_trace_level$.setDynamicValue(level, thread);
        return rtp_vars.$rtp_trace_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2615L)
    public static SubLObject ensure_sem_parse_initialized() {
        clear_match_recursive_template_item();
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 2950L)
    public static SubLObject template_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == recognition.UNPROVIDED) {
            cat = recognition.$const9$STemplate;
        }
        if (complete_parses_only == recognition.UNPROVIDED) {
            complete_parses_only = (SubLObject)recognition.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_sem_parse_initialized();
        final SubLObject raw_tokenized_input = rkf_concept_harvester.rkf_ch_string_tokenize(sentence);
        final SubLObject tokenized_input = standard_tokenization.perform_dot_analysis(raw_tokenized_input);
        final SubLObject start = (SubLObject)recognition.ZERO_INTEGER;
        final SubLObject end = Sequences.length(tokenized_input);
        SubLObject span = (SubLObject)recognition.NIL;
        final SubLObject depth = (SubLObject)recognition.ZERO_INTEGER;
        SubLObject entries = (SubLObject)recognition.NIL;
        SubLObject parses = (SubLObject)recognition.NIL;
        entries = rec_parse(cat, tokenized_input, start, end, depth, mt);
        if (recognition.NIL != entries) {
            SubLObject cdolist_list_var = Sequences.delete_if((SubLObject)recognition.$sym12$NULL, Mapping.mapcar((SubLObject)recognition.$sym13$FILTER_SEMANTIC_TESTS, entries), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
            SubLObject entry = (SubLObject)recognition.NIL;
            entry = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                SubLObject result = rtp_datastructures.convert_rtp_entry_to_parse_result(entry);
                final SubLObject assertion = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (recognition.$const10$Simply.eql(cycl_utilities.formula_arg0(result))) {
                    result = conses_high.second(result);
                }
                if (recognition.NIL != recognition.$perform_template_component_join$.getDynamicValue(thread) && recognition.NIL != list_utilities.tree_find(recognition.$const11$joinTemplateComponents, result, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED)) {
                    result = reformulate_jointemplatecomponents(result);
                }
                if (recognition.NIL != recognition.$template_parse_includes_template_categories$.getDynamicValue(thread)) {
                    final SubLObject item_var = (SubLObject)ConsesLow.list(result, assertion);
                    if (recognition.NIL == conses_high.member(item_var, parses, Symbols.symbol_function((SubLObject)recognition.EQUALP), Symbols.symbol_function((SubLObject)recognition.IDENTITY))) {
                        parses = (SubLObject)ConsesLow.cons(item_var, parses);
                    }
                }
                else {
                    final SubLObject item_var = result;
                    if (recognition.NIL == conses_high.member(item_var, parses, Symbols.symbol_function((SubLObject)recognition.EQUALP), Symbols.symbol_function((SubLObject)recognition.IDENTITY))) {
                        parses = (SubLObject)ConsesLow.cons(item_var, parses);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
            SubLObject i;
            for (i = (SubLObject)recognition.NIL, i = (SubLObject)recognition.ZERO_INTEGER; i.numL(end); i = Numbers.add(i, (SubLObject)recognition.ONE_INTEGER)) {
                span = (SubLObject)ConsesLow.cons(i, span);
            }
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.nreverse(span), parses));
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 4382L)
    public static SubLObject categorizing_template_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == recognition.UNPROVIDED) {
            cat = recognition.$const9$STemplate;
        }
        if (complete_parses_only == recognition.UNPROVIDED) {
            complete_parses_only = (SubLObject)recognition.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)recognition.NIL;
        final SubLObject _prev_bind_0 = recognition.$template_parse_includes_template_categories$.currentBinding(thread);
        try {
            recognition.$template_parse_includes_template_categories$.bind((SubLObject)recognition.T, thread);
            result = template_parse(sentence, mt, cat, complete_parses_only);
        }
        finally {
            recognition.$template_parse_includes_template_categories$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 4776L)
    public static SubLObject reformulate_jointemplatecomponents(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, (SubLObject)recognition.$sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_, (SubLObject)recognition.$sym15$TRANSFORM_JOINTEMPLATECOMPONENTS, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 6003L)
    public static SubLObject joinable_template_component_formulaP(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cycl.isList() && cycl.first().eql(recognition.$const11$joinTemplateComponents) && !cycl.equal(transform_jointemplatecomponents(cycl)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 6208L)
    public static SubLObject transform_rewrite_sequence(final SubLObject formula) {
        SubLObject transformations = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = formula.rest();
        SubLObject assemble_phrase = (SubLObject)recognition.NIL;
        assemble_phrase = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject rewrite = rewrite_assemble_phrase(assemble_phrase);
            transformations = (SubLObject)ConsesLow.cons(rewrite, transformations);
            cdolist_list_var = cdolist_list_var.rest();
            assemble_phrase = cdolist_list_var.first();
        }
        transformations = Sequences.nreverse(transformations);
        transformations = (SubLObject)ConsesLow.cons(recognition.$const16$RewriteSequenceFn, transformations);
        return transformations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 6574L)
    public static SubLObject rewrite_assemble_phrase(final SubLObject assemble_phrase) {
        SubLObject strings = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = assemble_phrase.rest();
        SubLObject parse_result = (SubLObject)recognition.NIL;
        parse_result = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (parse_result.isString()) {
                strings = (SubLObject)ConsesLow.cons(parse_result, strings);
            }
            else if (recognition.NIL != parsing_utilities.result_of_parsing_formulaP(parse_result)) {
                strings = (SubLObject)ConsesLow.cons(parsing_utilities.result_of_parsing_words(parse_result), strings);
            }
            else if (parse_result.isList() && recognition.$const17$AssemblePhraseFn.eql(parse_result.first())) {
                final SubLObject subphrase = rewrite_assemble_phrase(parse_result);
                SubLObject cdolist_list_var_$1 = subphrase.rest();
                SubLObject string = (SubLObject)recognition.NIL;
                string = cdolist_list_var_$1.first();
                while (recognition.NIL != cdolist_list_var_$1) {
                    strings = (SubLObject)ConsesLow.cons(string, strings);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    string = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse_result = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.cons(recognition.$const17$AssemblePhraseFn, Sequences.nreverse(strings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 7370L)
    public static SubLObject join_tcomponents_and_rewrite_sequence(final SubLObject v_term, final SubLObject rewrite, final SubLObject order) {
        SubLObject transformations = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = rewrite.rest();
        SubLObject assemble_phrase = (SubLObject)recognition.NIL;
        assemble_phrase = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject refactored = (SubLObject)((order == recognition.$kw18$LEADING) ? ConsesLow.list(recognition.$const17$AssemblePhraseFn, v_term, assemble_phrase) : ConsesLow.list(recognition.$const17$AssemblePhraseFn, assemble_phrase, v_term));
            transformations = (SubLObject)ConsesLow.cons(refactored, transformations);
            cdolist_list_var = cdolist_list_var.rest();
            assemble_phrase = cdolist_list_var.first();
        }
        return transform_rewrite_sequence((SubLObject)ConsesLow.cons(recognition.$const16$RewriteSequenceFn, Sequences.nreverse(transformations)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 8067L)
    public static SubLObject jointemplate_pattern_type(final SubLObject pattern) {
        SubLObject result = (SubLObject)recognition.NIL;
        if (pattern.equal((SubLObject)recognition.$list19)) {
            result = (SubLObject)recognition.$kw20$S_NP_VP;
        }
        else {
            result = (SubLObject)recognition.$kw21$SBAR_WHNP_S;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 8522L)
    public static SubLObject transform_jointemplatecomponents(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = expression.first();
        final SubLObject pattern = conses_high.second(expression);
        final SubLObject formula = conses_high.third(expression);
        final SubLObject pattern_type = jointemplate_pattern_type(pattern);
        SubLObject result = (SubLObject)recognition.NIL;
        thread.resetMultipleValues();
        final SubLObject donor_formula = expressions_for_pattern_transform(pattern_type, formula);
        final SubLObject target_formula = thread.secondMultipleValue();
        final SubLObject recipient_formula = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (recognition.NIL != list_utilities.tree_find(recognition.$const22$TheSentenceSubject, recipient_formula, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED)) {
            if (donor_formula.isKeyword()) {
                result = (SubLObject)recognition.NIL;
            }
            if (recognition.NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula)) {
                final SubLObject span = parsing_utilities.result_of_parsing_span(donor_formula);
                final SubLObject offset = Numbers.add((SubLObject)recognition.ONE_INTEGER, conses_high.last(span, (SubLObject)recognition.UNPROVIDED).first());
                final SubLObject transformed_expression = iterative_template_parser.transform_nl_quant_forms(recipient_formula, offset);
                result = conses_high.subst(donor_formula, target_formula, transformed_expression, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
            }
            else {
                result = conses_high.subst(donor_formula, target_formula, recipient_formula, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
            }
        }
        else if (donor_formula.first().eql(recognition.$const16$RewriteSequenceFn) && recognition.NIL != parsing_utilities.result_of_parsing_formulaP(recipient_formula)) {
            result = join_tcomponents_and_rewrite_sequence(recipient_formula, donor_formula, (SubLObject)recognition.$kw23$TRAILING);
        }
        else if (recipient_formula.first().eql(recognition.$const16$RewriteSequenceFn) && recognition.NIL != parsing_utilities.result_of_parsing_formulaP(donor_formula)) {
            result = join_tcomponents_and_rewrite_sequence(donor_formula, recipient_formula, (SubLObject)recognition.$kw18$LEADING);
        }
        else {
            result = expression;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 10339L)
    public static SubLObject expressions_for_pattern_transform(final SubLObject pattern_type, final SubLObject formula) {
        SubLObject donor_formula = (SubLObject)recognition.NIL;
        SubLObject target_formula = (SubLObject)recognition.NIL;
        SubLObject recipient_formula = (SubLObject)recognition.NIL;
        if (pattern_type == recognition.$kw20$S_NP_VP) {
            donor_formula = ConsesLow.nth((SubLObject)recognition.ONE_INTEGER, formula);
            recipient_formula = ConsesLow.nth((SubLObject)recognition.TWO_INTEGER, formula);
            target_formula = recognition.$const22$TheSentenceSubject;
        }
        else {
            if (pattern_type != recognition.$kw21$SBAR_WHNP_S) {
                return (SubLObject)recognition.NIL;
            }
            donor_formula = ConsesLow.nth((SubLObject)recognition.ONE_INTEGER, formula);
            recipient_formula = ConsesLow.nth((SubLObject)recognition.TWO_INTEGER, formula);
            target_formula = recognition.$const24$TheGappedTerm;
        }
        return Values.values(donor_formula, target_formula, recipient_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 10907L)
    public static SubLObject rec_parse(final SubLObject cat, final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)recognition.NIL;
        final SubLObject _prev_bind_0 = rtp_vars.$rtp_syntactic_mt$.currentBinding(thread);
        try {
            rtp_vars.$rtp_syntactic_mt$.bind(mt, thread);
            result = rec_parse_int(cat, sentence, start, end, depth, mt);
        }
        finally {
            rtp_vars.$rtp_syntactic_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 11112L)
    public static SubLObject rec_parse_int(final SubLObject cat, final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = filter_rules(rtp_datastructures.$rtp_rules$.getGlobalValue(), sentence, mt, cat, (SubLObject)recognition.UNPROVIDED);
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject temp_result = (SubLObject)recognition.NIL;
        SubLObject fully_bound_entries = (SubLObject)recognition.NIL;
        SubLObject unbound_entries = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = rules;
        SubLObject rule = (SubLObject)recognition.NIL;
        rule = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (rtp_datastructures.rule_cat(rule).equal(cat)) {
                temp_result = tp_match_template(rule, sentence, start, end, depth);
            }
            else {
                temp_result = (SubLObject)recognition.NIL;
            }
            if (recognition.NIL != temp_result) {
                SubLObject cdolist_list_var_$2 = temp_result;
                SubLObject entry = (SubLObject)recognition.NIL;
                entry = cdolist_list_var_$2.first();
                while (recognition.NIL != cdolist_list_var_$2) {
                    result = (SubLObject)ConsesLow.cons(rtp_datastructures.copy_rtp_entry(entry), result);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    entry = cdolist_list_var_$2.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str25$results_of_first_pass____S__, result));
        }
        cdolist_list_var = result;
        SubLObject entry2 = (SubLObject)recognition.NIL;
        entry2 = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str26$working_on_entry1___S__, entry2));
            }
            if (recognition.NIL != fully_bound_entryP(entry2) && (rtp_datastructures.rtp_chart_entry_words(entry2).eql(recognition.$completed_words_list$.getGlobalValue()) || recognition.NIL == rtp_datastructures.rtp_chart_entry_words(entry2))) {
                fully_bound_entries = (SubLObject)ConsesLow.cons(entry2, fully_bound_entries);
            }
            else {
                unbound_entries = (SubLObject)ConsesLow.cons(entry2, unbound_entries);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry2 = cdolist_list_var.first();
        }
        if (recognition.NIL != recognition.$return_early$.getGlobalValue()) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str27$fully_bound_entries____S__, fully_bound_entries));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str28$unbound_entries____S__, unbound_entries));
            }
            return ConsesLow.nconc(fully_bound_entries, unbound_entries);
        }
        while (recognition.NIL != unbound_entries) {
            final SubLObject first_entry = unbound_entries.first();
            final SubLObject new_entries = parse_subconstit_list(first_entry, depth, mt);
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str29$recurring_on___S__, first_entry));
            }
            unbound_entries = unbound_entries.rest();
            SubLObject cdolist_list_var2 = new_entries;
            SubLObject new_entry = (SubLObject)recognition.NIL;
            new_entry = cdolist_list_var2.first();
            while (recognition.NIL != cdolist_list_var2) {
                if (recognition.NIL != fully_bound_entryP(new_entry)) {
                    fully_bound_entries = (SubLObject)ConsesLow.cons(new_entry, fully_bound_entries);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                new_entry = cdolist_list_var2.first();
            }
        }
        return fully_bound_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 13131L)
    public static SubLObject filter_semantic_tests(final SubLObject entry, SubLObject semantic_mt) {
        if (semantic_mt == recognition.UNPROVIDED) {
            semantic_mt = rtp_vars.$rtp_semantic_mt$.getDynamicValue();
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 17054L)
    public static SubLObject filter_rules(final SubLObject rule_list, final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject which) {
        if (cat == recognition.UNPROVIDED) {
            cat = (SubLObject)recognition.NIL;
        }
        if (which == recognition.UNPROVIDED) {
            which = (SubLObject)recognition.$kw30$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (which == recognition.$kw31$GENERIC) {
            final SubLObject generics = rtp_datastructures.get_generic_templates_for_category(mt, cat);
            if (recognition.NIL != recognition.$rtp_display_filter_rules$.getGlobalValue()) {
                PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str32$FILTER_RULES___S__, generics);
            }
            return generics;
        }
        SubLObject templates = Hashtables.make_hash_table((SubLObject)recognition.$int33$30, Symbols.symbol_function((SubLObject)recognition.EQ), (SubLObject)recognition.UNPROVIDED);
        SubLObject specifics = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        if (recognition.NIL != recognition.$use_best_templates_first$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = sentence;
            SubLObject word = (SubLObject)recognition.NIL;
            word = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3;
                final SubLObject tp_rules = cdolist_list_var_$3 = rtp_datastructures.get_best_templates_for_terminal(mt, cat, word);
                SubLObject tp_rule = (SubLObject)recognition.NIL;
                tp_rule = cdolist_list_var_$3.first();
                while (recognition.NIL != cdolist_list_var_$3) {
                    if (recognition.NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, sentence)) {
                        counted_sethash(tp_rule, templates);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    tp_rule = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        if (Hashtables.hash_table_count(templates).isZero()) {
            templates = templates_potentially_applicable_to_word_list(sentence, mt, cat);
        }
        SubLObject tp_rule2 = (SubLObject)recognition.NIL;
        SubLObject value = (SubLObject)recognition.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(templates);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                tp_rule2 = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                specifics = (SubLObject)ConsesLow.cons(tp_rule2, specifics);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject _prev_bind_0 = recognition.$counted_template_set$.currentBinding(thread);
        try {
            recognition.$counted_template_set$.bind(templates, thread);
            specifics = Sort.sort(specifics, Symbols.symbol_function((SubLObject)recognition.$sym34$_), Symbols.symbol_function((SubLObject)recognition.$sym35$GET_COUNTED_SETHASH_ENTRY_COUNT));
        }
        finally {
            recognition.$counted_template_set$.rebind(_prev_bind_0, thread);
        }
        if (which == recognition.$kw30$ALL) {
            result = ConsesLow.nconc(specifics, rtp_datastructures.get_generic_templates_for_category(mt, cat));
        }
        else {
            result = specifics;
        }
        if (recognition.NIL != recognition.$rtp_display_filter_rules$.getGlobalValue()) {
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str32$FILTER_RULES___S__, result);
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str36$_2_words___a_2_, sentence);
            SubLObject cdolist_list_var = result;
            SubLObject r = (SubLObject)recognition.NIL;
            r = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str37$rule___a__transformation___a_2_, rtp_datastructures.template_rule_template(r), rtp_datastructures.template_rule_transformation(r));
                cdolist_list_var = cdolist_list_var.rest();
                r = cdolist_list_var.first();
            }
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str38$_2_);
        }
        return check_partial_ordering(list_utilities.delete_if_not((SubLObject)recognition.$sym39$VALID_ASSERTION, result, (SubLObject)recognition.$sym40$TEMPLATE_RULE_ASSERTION, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 19124L)
    public static SubLObject templates_potentially_applicable_to_word_list(final SubLObject word_list, final SubLObject mt, final SubLObject cat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)recognition.EQUAL), (SubLObject)recognition.UNPROVIDED);
        final SubLObject template_hash = Hashtables.make_hash_table((SubLObject)recognition.FOUR_INTEGER, Symbols.symbol_function((SubLObject)recognition.EQ), (SubLObject)recognition.UNPROVIDED);
        SubLObject cdolist_list_var = word_list;
        SubLObject word = (SubLObject)recognition.NIL;
        word = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_increment(word_dict, word, (SubLObject)recognition.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(word_dict)); recognition.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            word = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject frequency = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = rtp_datastructures.get_templates_for_terminal(mt, cat, word);
            SubLObject tp_rule = (SubLObject)recognition.NIL;
            tp_rule = cdolist_list_var2.first();
            while (recognition.NIL != cdolist_list_var2) {
                final SubLObject already_matched = Hashtables.gethash_without_values(tp_rule, template_hash, (SubLObject)recognition.UNPROVIDED);
                if (recognition.NIL != already_matched) {
                    hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, (SubLObject)recognition.UNPROVIDED);
                }
                else if (recognition.NIL != rtp_datastructures.template_rule_constraints_matchP(tp_rule, word_list)) {
                    hash_table_utilities.cinc_hash(tp_rule, template_hash, frequency, (SubLObject)recognition.UNPROVIDED);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                tp_rule = cdolist_list_var2.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return template_hash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 19950L)
    public static SubLObject check_partial_ordering(final SubLObject l, final SubLObject mt) {
        return remove_mt_from_results(Sort.sort(add_mt_to_results(l, mt), Symbols.symbol_function((SubLObject)recognition.$sym41$TEMPLATE_CAN_PRECEDE), (SubLObject)recognition.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 20443L)
    public static SubLObject remove_mt_from_results(final SubLObject l) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)recognition.$sym42$CAR), l);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 20505L)
    public static SubLObject add_mt_to_results(final SubLObject results, final SubLObject mt) {
        SubLObject answers = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = results;
        SubLObject x = (SubLObject)recognition.NIL;
        x = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(x, mt), answers);
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return Sequences.nreverse(answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 20730L)
    public static SubLObject template_can_precede(final SubLObject a, final SubLObject b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.NIL == hash_table_utilities.hash_table_empty_p(recognition.$partial_orders_hash$.getDynamicValue(thread))) {
            final SubLObject mt = a.rest();
            final SubLObject x = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(a.first()));
            final SubLObject y = uncanonicalizer.assertion_el_formula(rtp_datastructures.template_rule_assertion(b.first()));
            return (SubLObject)SubLObjectFactory.makeBoolean(recognition.NIL == Hashtables.gethash((SubLObject)ConsesLow.list(mt, y, x), recognition.$partial_orders_hash$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED));
        }
        return (SubLObject)recognition.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 21055L)
    public static SubLObject initialize_partial_orders_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)recognition.$sym43$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(recognition.$const44$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject temp = cdolist_list_var = kb_mapping.gather_predicate_extent_index(recognition.$const45$templatePrecedes, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
            SubLObject current = (SubLObject)recognition.NIL;
            current = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                final SubLObject mt = assertions_high.assertion_mt(current);
                final SubLObject arg1 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, (SubLObject)recognition.ONE_INTEGER));
                final SubLObject arg2 = assertions_high.assertion_formula(assertions_high.gaf_arg(current, (SubLObject)recognition.TWO_INTEGER));
                Hashtables.sethash((SubLObject)ConsesLow.list(mt, arg1, arg2), recognition.$partial_orders_hash$.getDynamicValue(thread), (SubLObject)recognition.T);
                cdolist_list_var = cdolist_list_var.rest();
                current = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return recognition.$partial_orders_hash$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 21472L)
    public static SubLObject counted_sethash(final SubLObject key, final SubLObject table) {
        SubLObject value = Hashtables.gethash(key, table, (SubLObject)recognition.ZERO_INTEGER);
        value = Numbers.add(value, (SubLObject)recognition.ONE_INTEGER);
        Hashtables.sethash(key, table, value);
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 21761L)
    public static SubLObject get_counted_sethash_entry_count(final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(key, recognition.$counted_template_set$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 21863L)
    public static SubLObject template_item_from_rtp_entry(final SubLObject entry) {
        return ConsesLow.nth(rtp_datastructures.rtp_chart_entry_template_index(entry), rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 22330L)
    public static SubLObject eat_a_template_item(final SubLObject entry) {
        if (recognition.NIL != rtp_datastructures.rtp_chart_entry_template_index(entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_template_index(entry, Numbers.add((SubLObject)recognition.ONE_INTEGER, rtp_datastructures.rtp_chart_entry_template_index(entry)));
        }
        return rtp_datastructures.rtp_chart_entry_template_index(entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 22818L)
    public static SubLObject tp_match_template(final SubLObject rule, final SubLObject word_list, final SubLObject start, final SubLObject end, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str46$split_sentence____S__, word_list));
        }
        final SubLObject sem = narts_high.nart_expand(rtp_datastructures.rule_sem(rule));
        SubLObject current_entries;
        SubLObject new_current_entries = current_entries = (SubLObject)ConsesLow.list(rtp_datastructures.make_new_rtp_entry(word_list, start, end, sem, rule));
        SubLObject matched_entries = (SubLObject)recognition.NIL;
        while (recognition.NIL != current_entries) {
            new_current_entries = (SubLObject)recognition.NIL;
            SubLObject cdolist_list_var = current_entries;
            SubLObject current_entry = (SubLObject)recognition.NIL;
            current_entry = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str47$at_top_of_cdolist__current_entrie, current_entries));
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str48$top_entry____S__, current_entry));
                }
                final SubLObject template_item = template_item_from_rtp_entry(current_entry);
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str49$template_item____S__, template_item));
                }
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)recognition.$sym43$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(recognition.$const44$EverythingPSC, thread);
                    if (recognition.NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str50$RTP_Chart_Entry_is_empty___));
                        }
                    }
                    else if (recognition.NIL != rtp_type_checkers.optional_template_item(template_item)) {
                        new_current_entries = Sequences.cconcatenate(match_optional_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (rtp_datastructures.rtp_chart_entry_words(current_entry).eql(recognition.$completed_words_list$.getGlobalValue())) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str51$Equal_to_completed_word_list__));
                        }
                    }
                    else if (template_item.isString()) {
                        new_current_entries = Sequences.cconcatenate(match_string_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
                        new_current_entries = Sequences.cconcatenate(match_wu_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (recognition.NIL != rtp_type_checkers.rtp_token_itemP(template_item)) {
                        new_current_entries = Sequences.cconcatenate(match_token_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (recognition.NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
                        new_current_entries = Sequences.cconcatenate(match_nl_agr_pred_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (recognition.NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
                        new_current_entries = Sequences.cconcatenate(match_speech_part_template_item(template_item, current_entry), new_current_entries);
                    }
                    else if (recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                        if (recognition.NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
                            new_current_entries = Sequences.cconcatenate(new_current_entries, match_recursive_template_item(template_item, current_entry));
                        }
                    }
                    else if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str52$No_hits_for_template_item__S__, template_item));
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                current_entry = cdolist_list_var.first();
            }
            current_entries = (SubLObject)recognition.NIL;
            cdolist_list_var = new_current_entries;
            SubLObject entry = (SubLObject)recognition.NIL;
            entry = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                if (recognition.NIL != completed_entryP(entry, depth)) {
                    matched_entries = (SubLObject)ConsesLow.cons(entry, matched_entries);
                }
                else {
                    current_entries = (SubLObject)ConsesLow.cons(entry, current_entries);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str53$current_entries____S__, current_entries)));
            }
            new_current_entries = (SubLObject)recognition.NIL;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str54$_________COMPLETED_ENTRIES_______));
        }
        if (!rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numE((SubLObject)recognition.ZERO_INTEGER)) {
            print_entries(completed_entries(Sequences.cconcatenate(current_entries, new_current_entries), depth));
        }
        return filter_sem_tests(matched_entries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 27042L)
    public static SubLObject filter_sem_tests(final SubLObject entries) {
        if (recognition.$rtp_perform_semantic_tests$.getGlobalValue() == recognition.$kw55$INTERNAL) {
            return entries;
        }
        return entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 27416L)
    public static SubLObject match_string_template_item(final SubLObject template_item, final SubLObject current_entry) {
        if (recognition.NIL == tp_match_tokenP(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry).first())) {
            return (SubLObject)recognition.NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(current_entry), (SubLObject)recognition.ONE_INTEGER));
        eat_a_template_item(current_entry);
        if (recognition.NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, recognition.$completed_words_list$.getGlobalValue());
        }
        return (SubLObject)ConsesLow.list(current_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 28135L)
    public static SubLObject match_wu_template_item(final SubLObject template_item, final SubLObject current_entry) {
        if (recognition.NIL == tp_match_wordXpos(template_item, current_entry) && recognition.NIL == tp_match_wordXpred(template_item, current_entry)) {
            return (SubLObject)recognition.NIL;
        }
        rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
        rtp_datastructures._csetf_rtp_chart_entry_start(current_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(current_entry), (SubLObject)recognition.ONE_INTEGER));
        if (recognition.NIL != rtp_datastructures.rtp_chart_entry_template_index(current_entry)) {
            eat_a_template_item(current_entry);
        }
        if (recognition.NIL == rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            rtp_datastructures._csetf_rtp_chart_entry_words(current_entry, recognition.$completed_words_list$.getGlobalValue());
        }
        return (SubLObject)ConsesLow.list(current_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 29075L)
    public static SubLObject match_token_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_token(template_item.first(), rtp_datastructures.rtp_chart_entry_words(current_entry));
        final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
        SubLObject result = (SubLObject)recognition.NIL;
        if (recognition.NIL != new_bindings) {
            rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, (recognition.NIL == rtp_datastructures.rtp_chart_entry_words(current_entry).rest()) ? recognition.$completed_words_list$.getGlobalValue() : rtp_datastructures.rtp_chart_entry_words(current_entry).rest());
            rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(new_entry), (SubLObject)recognition.ONE_INTEGER));
            rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, (SubLObject)ConsesLow.cons(rtp_datastructures.rtp_make_binding(conses_high.second(template_item), new_bindings), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
            result = (SubLObject)ConsesLow.cons(new_entry, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 29836L)
    public static SubLObject match_nl_agr_pred_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_pred(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = new_bindings;
        SubLObject binding = (SubLObject)recognition.NIL;
        binding = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject denot = (SubLObject)recognition.NIL;
            SubLObject words_eaten = (SubLObject)recognition.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)recognition.$list56);
            denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)recognition.$list56);
            words_eaten = current.first();
            current = current.rest();
            if (recognition.NIL == current) {
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                final SubLObject leftover_words = conses_high.nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, (recognition.NIL != leftover_words) ? leftover_words : recognition.$completed_words_list$.getGlobalValue());
                rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, (SubLObject)ConsesLow.cons(rtp_datastructures.rtp_make_binding(conses_high.second(template_item), (SubLObject)ConsesLow.list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                result = (SubLObject)ConsesLow.cons(new_entry, result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)recognition.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 31088L)
    public static SubLObject match_speech_part_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        final SubLObject new_bindings = tp_match_pos(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = new_bindings;
        SubLObject binding = (SubLObject)recognition.NIL;
        binding = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject denot = (SubLObject)recognition.NIL;
            SubLObject words_eaten = (SubLObject)recognition.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)recognition.$list56);
            denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)recognition.$list56);
            words_eaten = current.first();
            current = current.rest();
            if (recognition.NIL == current) {
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(new_entry), words_eaten));
                final SubLObject leftover_words = conses_high.nthcdr(words_eaten, rtp_datastructures.rtp_chart_entry_words(current_entry));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, (recognition.NIL != leftover_words) ? leftover_words : recognition.$completed_words_list$.getGlobalValue());
                rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, (SubLObject)ConsesLow.cons(rtp_datastructures.rtp_make_binding(conses_high.second(template_item), (SubLObject)ConsesLow.list(denot)), rtp_datastructures.rtp_chart_entry_bindings(current_entry)));
                result = (SubLObject)ConsesLow.cons(new_entry, result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)recognition.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 32456L)
    public static SubLObject words_from_word_spans(final SubLObject items) {
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = (SubLObject)recognition.NIL;
        item = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(item.first(), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 33937L)
    public static SubLObject match_optional_template_item(final SubLObject template_item, final SubLObject current_entry) {
        eat_a_template_item(current_entry);
        if (recognition.NIL != rtp_datastructures.rtp_chart_entry_words(current_entry)) {
            final SubLObject current_words = rtp_datastructures.rtp_chart_entry_words(current_entry);
            final SubLObject current_start = rtp_datastructures.rtp_chart_entry_start(current_entry);
            final SubLObject current_end = rtp_datastructures.rtp_chart_entry_end(current_entry);
            final SubLObject new_words = words_from_word_spans(remove_optional_strings(template_item, (SubLObject)ConsesLow.list(current_words, current_start, current_end), (SubLObject)recognition.UNPROVIDED));
            final SubLObject existing_length = Sequences.length(current_words);
            SubLObject new_entries = (SubLObject)recognition.NIL;
            SubLObject cdolist_list_var = new_words;
            SubLObject word_list = (SubLObject)recognition.NIL;
            word_list = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, word_list);
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(current_entry), Numbers.subtract(existing_length, Sequences.length(word_list))));
                new_entries = (SubLObject)ConsesLow.cons(new_entry, new_entries);
                cdolist_list_var = cdolist_list_var.rest();
                word_list = cdolist_list_var.first();
            }
            return new_entries;
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 35215L)
    public static SubLObject clear_match_recursive_template_item() {
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 35292L)
    public static SubLObject match_recursive_template_item(final SubLObject template_item, SubLObject current_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str57$adding_some_subconstits_for__S__, template_item.first()));
        }
        final SubLObject split_out = tp_split(template_item, rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(current_entry)), conses_high.copy_list(rtp_datastructures.rtp_chart_entry_words(current_entry)), rtp_datastructures.rtp_chart_entry_start(current_entry), rtp_datastructures.rtp_chart_entry_end(current_entry));
        final SubLObject splits = conses_high.second(split_out);
        final SubLObject template_rest = split_out.first();
        SubLObject new_entries = (SubLObject)recognition.NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str58$____split_out____S_____template_r, split_out, template_rest));
        }
        current_entry = rtp_datastructures.set_rtp_entry_remaining_template(current_entry, template_rest);
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str59$____splits____S_____, splits));
        }
        SubLObject cdolist_list_var = splits;
        SubLObject lyst = (SubLObject)recognition.NIL;
        lyst = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject used_words = conses_high.second(lyst);
            final SubLObject subconsts = lyst.first();
            final SubLObject used_word_length = Sequences.length(used_words);
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str60$lyst__S__, lyst));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str61$used_words____S__, used_words));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str62$length_of_used_words____S__, used_word_length));
            }
            if (recognition.NIL != subconsts.first()) {
                final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(current_entry);
                SubLObject failed_template = (SubLObject)recognition.NIL;
                rtp_datastructures._csetf_rtp_chart_entry_start(new_entry, Numbers.add(rtp_datastructures.rtp_chart_entry_start(new_entry), used_word_length));
                rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, conses_high.nthcdr(used_word_length, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                SubLObject cdolist_list_var_$4 = subconsts;
                SubLObject subconst = (SubLObject)recognition.NIL;
                subconst = cdolist_list_var_$4.first();
                while (recognition.NIL != cdolist_list_var_$4) {
                    final SubLObject subconst_template_item = conses_high.second(subconst);
                    final SubLObject subconst_words = subconst.first();
                    final SubLObject subconst_start = conses_high.third(subconst);
                    final SubLObject subconst_end = conses_high.fourth(subconst);
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str63$just_ate__S_words__, used_word_length));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str64$words_in_entry____S__, rtp_datastructures.rtp_chart_entry_words(new_entry)));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str65$subconstit_eaten____S__, subconst));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str66$subconstit_is__A_recursive__, (SubLObject)((recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(conses_high.second(subconst))) ? recognition.$str67$ : recognition.$str68$not_)));
                    }
                    if (recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(subconst_template_item) || recognition.NIL != rtp_type_checkers.rtp_speech_part_itemP(subconst_template_item) || recognition.NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(subconst_template_item)) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str69$pushing_a_new_subconstit___S__, subconst_template_item));
                        }
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(new_entry, (SubLObject)ConsesLow.cons(rtp_datastructures.make_new_subconstit(subconst_template_item.first(), subconst_words, conses_high.second(subconst_template_item), subconst_start, subconst_end, get_sem_test_for_var(conses_high.second(subconst_template_item), rtp_datastructures.rtp_chart_entry_rule(current_entry))), rtp_datastructures.rtp_chart_entry_subconstits(new_entry)));
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str70$new_entry____A__, new_entry));
                        }
                    }
                    failed_template = failed_subconst_item(subconst_template_item, subconst_words, subconst_start, subconst_end);
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str71$after_eating_subconstit__new_entr, new_entry));
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str72$failed_template____A__, failed_template));
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    subconst = cdolist_list_var_$4.first();
                }
                if (recognition.NIL == rtp_datastructures.rtp_chart_entry_words(new_entry)) {
                    rtp_datastructures._csetf_rtp_chart_entry_words(new_entry, recognition.$completed_words_list$.getGlobalValue());
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str73$new_entry__end_of_recursive_item_, new_entry));
                }
                if (recognition.NIL == failed_template) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str74$pushing_entry_at_end_of_recursive));
                    }
                    new_entries = (SubLObject)ConsesLow.cons(new_entry, new_entries);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lyst = cdolist_list_var.first();
        }
        return new_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 39916L)
    public static SubLObject get_sem_test_for_var(final SubLObject var, final SubLObject rule) {
        final SubLObject result = get_sem_test_for_var_from_formula(var, rtp_datastructures.template_rule_sem_test(rule));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 40280L)
    public static SubLObject get_sem_test_for_var_from_formula(final SubLObject var, final SubLObject formula) {
        final SubLObject result = get_sem_test_for_var_from_formula_int(var, formula);
        if (recognition.NIL != list_utilities.lengthG(result, (SubLObject)recognition.ONE_INTEGER, (SubLObject)recognition.UNPROVIDED)) {
            return (SubLObject)ConsesLow.cons(recognition.$const75$and, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 40690L)
    public static SubLObject get_sem_test_for_var_from_formula_int(final SubLObject var, final SubLObject formula) {
        if (formula.isAtom()) {
            return (SubLObject)recognition.NIL;
        }
        if (recognition.NIL != rtp_datastructures.rtp_sem_testP(formula) && rtp_datastructures.rtp_sem_test_var(formula).eql(var)) {
            return (SubLObject)ConsesLow.list(rtp_datastructures.rtp_sem_test_constraint(formula));
        }
        if (recognition.NIL != rtp_datastructures.rtp_sem_testP(formula)) {
            return (SubLObject)recognition.NIL;
        }
        return Sequences.cconcatenate(get_sem_test_for_var_from_formula_int(var, formula.first()), get_sem_test_for_var_from_formula_int(var, formula.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 41131L)
    public static SubLObject failed_subconst_item(final SubLObject subconst_template_item, final SubLObject subconst_words, final SubLObject subconst_start, final SubLObject subconst_end) {
        if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(subconst_template_item)) {
            final SubLObject v_answer = match_wu_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED)).first();
            if (recognition.NIL == v_answer || !rtp_datastructures.rtp_chart_entry_words(v_answer).eql(recognition.$completed_words_list$.getGlobalValue())) {
                return (SubLObject)recognition.T;
            }
        }
        else {
            if (recognition.NIL == rtp_type_checkers.optional_template_item(subconst_template_item)) {
                return (SubLObject)recognition.NIL;
            }
            final SubLObject v_answer = match_optional_template_item(subconst_template_item, rtp_datastructures.make_new_rtp_entry(subconst_words, subconst_start, subconst_end, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED)).first();
            if (recognition.NIL == v_answer || !rtp_datastructures.rtp_chart_entry_words(v_answer).eql(recognition.$completed_words_list$.getGlobalValue())) {
                return (SubLObject)recognition.T;
            }
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 42907L)
    public static SubLObject prefixes_before_item(final SubLObject stop_item, final SubLObject words, final SubLObject start, final SubLObject end) {
        SubLObject word_list = Sequences.reverse(words);
        SubLObject result = (SubLObject)recognition.NIL;
        while (recognition.NIL != word_list) {
            if (recognition.NIL != match_template_item(stop_item, word_list)) {
                final SubLObject re_reversed_words = Sequences.reverse(word_list.rest());
                final SubLObject stop_index = Numbers.add(start, Sequences.length(re_reversed_words));
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(re_reversed_words, start, stop_index), result);
            }
            word_list = word_list.rest();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 43622L)
    public static SubLObject match_template_item(final SubLObject item, final SubLObject words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.NIL != rtp_type_checkers.rtp_rule_terminalP(item)) {
            return Functions.funcall(rtp_vars.$tp_equal$.getGlobalValue(), item, words.first());
        }
        if (recognition.NIL != rtp_type_checkers.rtp_speech_part_itemP(item)) {
            return lexicon_accessors.string_is_posP(words.first(), item.first(), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
        }
        if (recognition.NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item)) {
            SubLObject doneP = (SubLObject)recognition.NIL;
            if (recognition.NIL == doneP) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_string(words.first(), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
                SubLObject pos = (SubLObject)recognition.NIL;
                pos = csome_list_var.first();
                while (recognition.NIL == doneP && recognition.NIL != csome_list_var) {
                    if (recognition.NIL != lexicon_accessors.genl_pos_predP(pos, item.first(), (SubLObject)recognition.UNPROVIDED)) {
                        doneP = (SubLObject)recognition.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    pos = csome_list_var.first();
                }
            }
            return doneP;
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.$float76$0_5)) {
            rtp_tracer_output((SubLObject)recognition.$float76$0_5, (SubLObject)ConsesLow.list((SubLObject)recognition.$str77$sent_invalid_args___S__S__to_MATC, item, words));
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 44252L)
    public static SubLObject find_stop_item(final SubLObject template) {
        SubLObject stop_item = (SubLObject)recognition.NIL;
        if (recognition.NIL == stop_item) {
            SubLObject csome_list_var = template;
            SubLObject item = (SubLObject)recognition.NIL;
            item = csome_list_var.first();
            while (recognition.NIL == stop_item && recognition.NIL != csome_list_var) {
                if (recognition.NIL != rtp_type_checkers.rtp_rule_terminalP(item) || recognition.NIL != rtp_type_checkers.rtp_speech_part_itemP(item) || recognition.NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(item)) {
                    stop_item = item;
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        return stop_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 44725L)
    public static SubLObject tp_split(final SubLObject template_item, final SubLObject template, final SubLObject current_words, final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_remainder = conses_high.member(template_item, template, Symbols.symbol_function((SubLObject)recognition.EQUAL), (SubLObject)recognition.UNPROVIDED);
        final SubLObject stop_item = find_stop_item(template_remainder);
        final SubLObject stop_item_index_template_position = Sequences.position(stop_item, template_remainder, (SubLObject)recognition.EQUALP, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
        final SubLObject stop_item_index_template = (recognition.NIL != stop_item_index_template_position) ? stop_item_index_template_position : Sequences.length(template_remainder);
        final SubLObject stop_remainder_template = Sequences.subseq(template_remainder, (SubLObject)recognition.ZERO_INTEGER, stop_item_index_template);
        final SubLObject template_unused = Sequences.subseq(template_remainder, stop_item_index_template, (SubLObject)recognition.UNPROVIDED);
        final SubLObject word_lists_before_stop = (SubLObject)((recognition.NIL != stop_item) ? prefixes_before_item(stop_item, current_words, start, end) : ConsesLow.list((SubLObject)ConsesLow.list(current_words, start, end)));
        final SubLObject kleene_removed_lists = remove_kleene_words(word_lists_before_stop, stop_remainder_template);
        SubLObject result = (SubLObject)recognition.NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str78$template_remainder____S__stop_ite, template_remainder, stop_item, stop_item_index_template_position, stop_item_index_template));
        }
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str79$stop_remainder____S__template_unu, stop_remainder_template, template_unused, current_words, word_lists_before_stop, kleene_removed_lists));
        }
        streams_high.force_output((SubLObject)recognition.T);
        SubLObject cdolist_list_var = kleene_removed_lists;
        SubLObject item = (SubLObject)recognition.NIL;
        item = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (!item.first().equal(recognition.$completed_words_list$.getGlobalValue())) {
                final SubLObject left_over_words = item.first();
                final SubLObject template_$5 = conses_high.second(item);
                final SubLObject original_words = conses_high.third(item);
                final SubLObject start_index = conses_high.fourth(item);
                final SubLObject end_index = conses_high.fifth(item);
                final SubLObject single_const_lists = Sequences.nreverse(rtp_compute_permutations(left_over_words, template_$5, start_index));
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str80$item____S__original_words____S__, item, original_words)));
                }
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str81$single_const_lists____S__, single_const_lists)));
                }
                SubLObject cdolist_list_var_$6 = single_const_lists;
                SubLObject lyst = (SubLObject)recognition.NIL;
                lyst = cdolist_list_var_$6.first();
                while (recognition.NIL != cdolist_list_var_$6) {
                    if (conses_high.fourth(conses_high.last(lyst, (SubLObject)recognition.UNPROVIDED).first()).numE(end_index)) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lyst, original_words), result);
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str82$lyst____S__result____S__, lyst));
                        }
                    }
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    lyst = cdolist_list_var_$6.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(template_unused, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 48256L)
    public static SubLObject rtp_compute_permutations(final SubLObject words, final SubLObject template_items, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expanded_template = Mapping.mapcar(Symbols.symbol_function((SubLObject)recognition.$sym83$EXPAND_WORD_ITEMS_IN_LIST), template_items);
        SubLObject incomplete_states = (SubLObject)ConsesLow.list(make_rtp_perm_state(words, expanded_template, (SubLObject)recognition.NIL, offset));
        SubLObject complete_states = (SubLObject)recognition.NIL;
        SubLObject present_state = (SubLObject)recognition.NIL;
        SubLObject search_past_startP = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        while (recognition.NIL != incomplete_states) {
            present_state = incomplete_states.first();
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str84$incomplete_states____S__, incomplete_states)));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str85$present_state____S__, present_state)));
            }
            incomplete_states = incomplete_states.rest();
            if (recognition.NIL != rtp_perm_state_completeP(present_state)) {
                complete_states = (SubLObject)ConsesLow.cons(present_state, complete_states);
            }
            else if (recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_perm_state_first_unused_template_item(present_state))) {
                if (recognition.NIL != no_unused_template_itemsP(present_state)) {
                    complete_states = (SubLObject)ConsesLow.cons(process_perm_recursive(present_state), complete_states);
                }
                else {
                    incomplete_states = (SubLObject)ConsesLow.cons(process_perm_recursive(present_state), incomplete_states);
                }
                search_past_startP = (SubLObject)recognition.T;
            }
            else {
                final SubLObject new_states = process_perm_non_recursive(present_state, search_past_startP);
                search_past_startP = rtp_type_checkers.rtp_optional_template_itemP(rtp_perm_state_first_unused_template_item(present_state));
                SubLObject cdolist_list_var = new_states;
                SubLObject state = (SubLObject)recognition.NIL;
                state = cdolist_list_var.first();
                while (recognition.NIL != cdolist_list_var) {
                    if (recognition.NIL != no_unused_template_itemsP(state) && recognition.NIL != no_unused_wordsP(state)) {
                        complete_states = (SubLObject)ConsesLow.cons(state, complete_states);
                    }
                    else if (recognition.NIL == no_unused_template_itemsP(state)) {
                        incomplete_states = (SubLObject)ConsesLow.cons(state, incomplete_states);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    state = cdolist_list_var.first();
                }
            }
        }
        incomplete_states = complete_states;
        complete_states = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var2 = incomplete_states;
        SubLObject present_state_$7 = (SubLObject)recognition.NIL;
        present_state_$7 = cdolist_list_var2.first();
        while (recognition.NIL != cdolist_list_var2) {
            complete_states = Sequences.cconcatenate(complete_states, rtp_compute_recursive_locations(present_state_$7, words, offset));
            cdolist_list_var2 = cdolist_list_var2.rest();
            present_state_$7 = cdolist_list_var2.first();
        }
        SubLObject partial_parse = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = complete_states;
        SubLObject state = (SubLObject)recognition.NIL;
        state = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = rtp_perm_state_matched(state);
            SubLObject match = (SubLObject)recognition.NIL;
            match = cdolist_list_var_$8.first();
            while (recognition.NIL != cdolist_list_var_$8) {
                partial_parse = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rtp_matched_constit_words(match), rtp_matched_constit_template(match), rtp_matched_constit_start(match), rtp_matched_constit_end(match)), partial_parse);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                match = cdolist_list_var_$8.first();
            }
            result = (SubLObject)ConsesLow.cons(Sequences.nreverse(partial_parse), result);
            partial_parse = (SubLObject)recognition.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            state = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 50840L)
    public static SubLObject rtp_compute_recursive_locations(final SubLObject state, final SubLObject words, final SubLObject offset) {
        final SubLObject start_index = rtp_perm_state_start_index(state);
        final SubLObject located_matches = compute_matches(rtp_perm_state_matched(state), offset, (SubLObject)recognition.NIL, words, offset);
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = located_matches;
        SubLObject parse = (SubLObject)recognition.NIL;
        parse = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(make_rtp_perm_state(words, (SubLObject)recognition.NIL, parse, start_index), result);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 51487L)
    public static SubLObject compute_matches(final SubLObject match_list, final SubLObject start_index, final SubLObject unmatched, final SubLObject words, final SubLObject offset) {
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = compute_matches_int(match_list, start_index, unmatched, words, offset);
        SubLObject match = (SubLObject)recognition.NIL;
        match = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (recognition.NIL != valid_constits_p(match, (SubLObject)recognition.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(Sequences.reverse(match), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 51900L)
    public static SubLObject valid_constits_p(final SubLObject matches, SubLObject mt) {
        if (mt == recognition.UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = rtp_matched_constit_end(matches.first());
        SubLObject failedP = (SubLObject)recognition.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            if (recognition.NIL == failedP) {
                SubLObject csome_list_var = matches;
                SubLObject match = (SubLObject)recognition.NIL;
                match = csome_list_var.first();
                while (recognition.NIL == failedP && recognition.NIL != csome_list_var) {
                    if (!start.numE(rtp_matched_constit_end(match)) || recognition.NIL == rtp_constituent_weeders.tp_possible_constitP(rtp_matched_constit_template(match), rtp_matched_constit_words(match), (SubLObject)recognition.UNPROVIDED)) {
                        failedP = (SubLObject)recognition.T;
                    }
                    start = rtp_matched_constit_start(match);
                    csome_list_var = csome_list_var.rest();
                    match = csome_list_var.first();
                }
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (recognition.NIL != failedP) {
            return (SubLObject)recognition.NIL;
        }
        return (SubLObject)recognition.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 52463L)
    public static SubLObject compute_matches_int(final SubLObject match_list, final SubLObject start_index, SubLObject unmatched, final SubLObject words, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_match = match_list.first();
        final SubLObject other_matches = match_list.rest();
        SubLObject result = (SubLObject)recognition.NIL;
        if (recognition.NIL == first_match) {
            Errors.warn((SubLObject)recognition.$str86$call_to_compute_matches_with_an_e);
        }
        if (recognition.NIL == other_matches && recognition.NIL == unmatched && recognition.NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str87$cond1));
            }
            result = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(first_match));
        }
        else if (recognition.NIL == other_matches && recognition.NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str88$cond2));
            }
            SubLObject cdolist_list_var = compute_constit_locations(start_index, rtp_matched_constit_start(first_match), Sequences.length(unmatched));
            SubLObject parse = (SubLObject)recognition.NIL;
            parse = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                SubLObject temp_result = build_located_matches(parse, unmatched, words, offset);
                temp_result = (SubLObject)ConsesLow.cons(first_match, temp_result);
                result = (SubLObject)ConsesLow.cons(temp_result, result);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        else if (recognition.NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match)) && recognition.NIL == unmatched) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str89$cond6));
            }
            final SubLObject temp_result2 = (SubLObject)ConsesLow.list(first_match);
            SubLObject cdolist_list_var2 = compute_matches_int(other_matches, rtp_matched_constit_end(first_match), (SubLObject)recognition.NIL, words, offset);
            SubLObject rest_parse = (SubLObject)recognition.NIL;
            rest_parse = cdolist_list_var2.first();
            while (recognition.NIL != cdolist_list_var2) {
                result = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(rest_parse, temp_result2), result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                rest_parse = cdolist_list_var2.first();
            }
        }
        else if (recognition.NIL == rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str90$cond3));
            }
            SubLObject cdolist_list_var = compute_constit_locations(start_index, rtp_matched_constit_start(first_match), Sequences.length(unmatched));
            SubLObject parse = (SubLObject)recognition.NIL;
            parse = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                SubLObject temp_result = build_located_matches(parse, unmatched, words, offset);
                temp_result = (SubLObject)ConsesLow.cons(first_match, temp_result);
                SubLObject cdolist_list_var_$9 = compute_matches_int(other_matches, rtp_matched_constit_end(first_match), (SubLObject)recognition.NIL, words, offset);
                SubLObject rest_parse2 = (SubLObject)recognition.NIL;
                rest_parse2 = cdolist_list_var_$9.first();
                while (recognition.NIL != cdolist_list_var_$9) {
                    result = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(rest_parse2, temp_result), result);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    rest_parse2 = cdolist_list_var_$9.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
        }
        else if (recognition.NIL != other_matches && recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str91$cond4));
            }
            result = compute_matches_int(other_matches, start_index, list_utilities.snoc(first_match, unmatched), words, offset);
        }
        else if (recognition.NIL == other_matches && recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(first_match))) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str92$cond5));
            }
            unmatched = Sequences.cconcatenate(unmatched, (SubLObject)ConsesLow.list(first_match));
            SubLObject cdolist_list_var2;
            final SubLObject parses = cdolist_list_var2 = compute_constit_locations(start_index, Numbers.add(offset, Sequences.length(words)), Sequences.length(unmatched));
            SubLObject parse2 = (SubLObject)recognition.NIL;
            parse2 = cdolist_list_var2.first();
            while (recognition.NIL != cdolist_list_var2) {
                result = (SubLObject)ConsesLow.cons(build_located_matches(parse2, unmatched, words, offset), result);
                cdolist_list_var2 = cdolist_list_var2.rest();
                parse2 = cdolist_list_var2.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 55717L)
    public static SubLObject build_located_matches(final SubLObject parse, SubLObject unlocated, final SubLObject words, final SubLObject offset) {
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = parse;
        SubLObject constit = (SubLObject)recognition.NIL;
        constit = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(make_rtp_matched_constit(Sequences.subseq(words, Numbers.subtract(constit.first(), offset), Numbers.subtract(conses_high.second(constit), offset)), rtp_matched_constit_template(unlocated.first()), constit.first(), conses_high.second(constit)), result);
            unlocated = unlocated.rest();
            cdolist_list_var = cdolist_list_var.rest();
            constit = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 56519L)
    public static SubLObject compute_constit_locations(final SubLObject start, final SubLObject end, final SubLObject constit_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.ONE_INTEGER.numG(constit_count)) {
            return (SubLObject)recognition.NIL;
        }
        if (!end.numG(start)) {
            return (SubLObject)recognition.NIL;
        }
        SubLObject result = (SubLObject)recognition.NIL;
        if (constit_count.numE((SubLObject)recognition.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(start, end)));
        }
        SubLObject cdotimes_end_var;
        SubLObject x;
        SubLObject cdolist_list_var;
        SubLObject v_answer;
        for (cdotimes_end_var = Numbers.add((SubLObject)recognition.ONE_INTEGER, Numbers.subtract(end, start, constit_count)), x = (SubLObject)recognition.NIL, x = (SubLObject)recognition.ZERO_INTEGER; x.numL(cdotimes_end_var); x = Numbers.add(x, (SubLObject)recognition.ONE_INTEGER)) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str93$x____S__, x)));
            }
            cdolist_list_var = compute_constit_locations(Numbers.add(start, x, (SubLObject)recognition.ONE_INTEGER), end, Numbers.subtract(constit_count, (SubLObject)recognition.ONE_INTEGER));
            v_answer = (SubLObject)recognition.NIL;
            v_answer = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(start, Numbers.add(start, x, (SubLObject)recognition.ONE_INTEGER)), v_answer), result);
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 57418L)
    public static SubLObject process_perm_non_recursive(final SubLObject state, final SubLObject search_past_startP) {
        final SubLObject template_item = rtp_perm_state_first_unused_template_item(state);
        final SubLObject words = rtp_perm_state_unused_words(state);
        final SubLObject index = rtp_perm_state_start_index(state);
        final SubLObject found_matches = find_rtp_matches(template_item, words, index, search_past_startP);
        SubLObject new_match = (SubLObject)recognition.NIL;
        SubLObject iter_result = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = found_matches;
        SubLObject match = (SubLObject)recognition.NIL;
        match = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            new_match = make_rtp_matched_constit(Sequences.subseq(words, Numbers.subtract(match.first(), index), Numbers.subtract(conses_high.second(match), index)), template_item, match.first(), conses_high.second(match));
            iter_result = make_rtp_perm_state(Sequences.subseq(words, Numbers.subtract(conses_high.second(match), index), (SubLObject)recognition.UNPROVIDED), rtp_perm_state_unused_template(state).rest(), list_utilities.snoc(new_match, rtp_perm_state_matched(state)), conses_high.second(match));
            result = (SubLObject)ConsesLow.cons(iter_result, result);
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        }
        if (recognition.NIL == result && recognition.NIL != rtp_type_checkers.rtp_optional_template_itemP(template_item)) {
            return (SubLObject)ConsesLow.list(make_rtp_perm_state(words, rtp_perm_state_unused_template(state).rest(), rtp_perm_state_matched(state), rtp_perm_state_start_index(state)));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 59016L)
    public static SubLObject find_rtp_matches(final SubLObject template_item, final SubLObject words, final SubLObject index, final SubLObject search_past_startP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject intermed_words = words;
        SubLObject intermed_start = index;
        SubLObject result = (SubLObject)recognition.NIL;
        if (recognition.NIL != rtp_type_checkers.optional_template_item(template_item)) {
            while (recognition.NIL != intermed_words) {
                final SubLObject intermed_end = Numbers.add(intermed_start, Sequences.length(intermed_words));
                SubLObject cdolist_list_var;
                final SubLObject temp_result = cdolist_list_var = remove_optional_strings(template_item, (SubLObject)ConsesLow.list(intermed_words, intermed_start, intermed_end), (SubLObject)recognition.UNPROVIDED);
                SubLObject temp = (SubLObject)recognition.NIL;
                temp = cdolist_list_var.first();
                while (recognition.NIL != cdolist_list_var) {
                    if (!intermed_words.equalp(temp.first())) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str94$intermed_words____S__first_first_, intermed_words, temp.first())));
                        }
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(intermed_start, Numbers.add(intermed_start, Numbers.subtract(intermed_end, conses_high.third(temp)))), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    temp = cdolist_list_var.first();
                }
                if (recognition.NIL == search_past_startP) {
                    return result;
                }
                intermed_words = intermed_words.rest();
                intermed_start = Numbers.add(intermed_start, (SubLObject)recognition.ONE_INTEGER);
            }
        }
        else if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
            Errors.warn((SubLObject)recognition.$str95$sent_an_unexpanded_item___S__to_f, template_item);
            while (recognition.NIL != intermed_words) {
                if (recognition.NIL != tp_match_wordXpos_wXwords(template_item, intermed_words)) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(intermed_start, Numbers.add((SubLObject)recognition.ONE_INTEGER, intermed_start)), result);
                }
                if (recognition.NIL == search_past_startP) {
                    return result;
                }
                intermed_words = intermed_words.rest();
                intermed_start = Numbers.add(intermed_start, (SubLObject)recognition.ONE_INTEGER);
            }
        }
        else if (recognition.NIL != rtp_type_checkers.rtp_nl_agr_pred_itemP(template_item)) {
            while (recognition.NIL != intermed_words) {
                if (recognition.NIL != tp_match_pred(template_item, intermed_words.first())) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(intermed_start, Numbers.add((SubLObject)recognition.ONE_INTEGER, intermed_start)), result);
                }
                if (recognition.NIL == search_past_startP) {
                    return result;
                }
                intermed_words = intermed_words.rest();
                intermed_start = Numbers.add(intermed_start, (SubLObject)recognition.ONE_INTEGER);
            }
        }
        else if (recognition.NIL != rtp_type_checkers.rtp_speech_part_itemP(template_item)) {
            while (recognition.NIL != intermed_words) {
                if (recognition.NIL != tp_match_pos(template_item, intermed_words)) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(intermed_start, Numbers.add((SubLObject)recognition.ONE_INTEGER, intermed_start)), result);
                }
                if (recognition.NIL == search_past_startP) {
                    return result;
                }
                intermed_words = intermed_words.rest();
                intermed_start = Numbers.add(intermed_start, (SubLObject)recognition.ONE_INTEGER);
            }
        }
        else {
            Errors.warn((SubLObject)recognition.$str96$sent_invalid_item__S_to_find_rtp_, template_item);
            result = (SubLObject)recognition.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 61411L)
    public static SubLObject process_perm_recursive(final SubLObject state) {
        final SubLObject this_item = rtp_perm_state_first_unused_template_item(state);
        push_to_end_rtp_matched_constit(state, make_unlocated_rtp_matched_constit(this_item));
        if (recognition.NIL != no_unused_template_itemsP(state)) {
            set_rtp_perm_state_unused_words(state, recognition.$completed_words_list$.getGlobalValue());
        }
        pop_rtp_perm_state_unused_template(state);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 61816L)
    public static SubLObject new_rtp_perm_state() {
        return Vectors.make_vector((SubLObject)recognition.FOUR_INTEGER, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 61907L)
    public static SubLObject make_rtp_perm_state(final SubLObject words, final SubLObject template, final SubLObject matches, final SubLObject start) {
        final SubLObject result = new_rtp_perm_state();
        set_rtp_perm_state_unused_words(result, words);
        set_rtp_perm_state_unused_template(result, template);
        set_rtp_perm_state_matched(result, matches);
        set_rtp_perm_state_start_index(result, start);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 62474L)
    public static SubLObject rtp_perm_state_unused_words(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)recognition.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 62583L)
    public static SubLObject set_rtp_perm_state_unused_words(final SubLObject state, final SubLObject words) {
        Vectors.set_aref(state, (SubLObject)recognition.ZERO_INTEGER, words);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 62764L)
    public static SubLObject pop_rtp_perm_state_unused_words(final SubLObject state) {
        set_rtp_perm_state_unused_words(state, rtp_perm_state_unused_words(state).rest());
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 62953L)
    public static SubLObject rtp_perm_state_unused_template(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)recognition.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63065L)
    public static SubLObject pop_rtp_perm_state_unused_template(final SubLObject state) {
        set_rtp_perm_state_unused_template(state, rtp_perm_state_unused_template(state).rest());
        return rtp_perm_state_unused_template(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63297L)
    public static SubLObject set_rtp_perm_state_unused_template(final SubLObject state, final SubLObject template) {
        Vectors.set_aref(state, (SubLObject)recognition.ONE_INTEGER, template);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63501L)
    public static SubLObject rtp_perm_state_first_unused_template_item(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)recognition.ONE_INTEGER).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63632L)
    public static SubLObject set_rtp_perm_state_matched(final SubLObject state, final SubLObject matched) {
        Vectors.set_aref(state, (SubLObject)recognition.TWO_INTEGER, matched);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63822L)
    public static SubLObject rtp_perm_state_matched(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)recognition.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 63926L)
    public static SubLObject push_to_end_rtp_matched_constit(final SubLObject state, final SubLObject constit) {
        Vectors.set_aref(state, (SubLObject)recognition.TWO_INTEGER, list_utilities.snoc(constit, rtp_perm_state_matched(state)));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 64145L)
    public static SubLObject rtp_perm_state_start_index(final SubLObject state) {
        return Vectors.aref(state, (SubLObject)recognition.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 64253L)
    public static SubLObject set_rtp_perm_state_start_index(final SubLObject state, final SubLObject index) {
        Vectors.set_aref(state, (SubLObject)recognition.THREE_INTEGER, index);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 64417L)
    public static SubLObject rtp_perm_state_completeP(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean((recognition.NIL != no_unused_wordsP(state) && recognition.NIL != no_unused_template_itemsP(state)) || (recognition.NIL != no_unused_template_itemsP(state) && recognition.NIL != rtp_type_checkers.rtp_recursive_itemP(rtp_matched_constit_template(conses_high.last(rtp_perm_state_matched(state), (SubLObject)recognition.UNPROVIDED).first()))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 64767L)
    public static SubLObject no_unused_wordsP(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(recognition.NIL == rtp_perm_state_unused_words(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 64889L)
    public static SubLObject no_unused_template_itemsP(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(recognition.NIL == rtp_perm_state_unused_template(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 65027L)
    public static SubLObject make_unlocated_rtp_matched_constit(final SubLObject template) {
        return make_rtp_matched_constit((SubLObject)recognition.$kw97$UNLOCATED, template, (SubLObject)recognition.NIL, (SubLObject)recognition.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 65418L)
    public static SubLObject unlocated_rtp_matched_constitP(final SubLObject match) {
        return Equality.eq(rtp_matched_constit_words(match), (SubLObject)recognition.$kw97$UNLOCATED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 65590L)
    public static SubLObject make_rtp_matched_constit(final SubLObject words, final SubLObject template, final SubLObject start, final SubLObject end) {
        final SubLObject result = Vectors.make_vector((SubLObject)recognition.FOUR_INTEGER, (SubLObject)recognition.UNPROVIDED);
        Vectors.set_aref(result, (SubLObject)recognition.ZERO_INTEGER, words);
        Vectors.set_aref(result, (SubLObject)recognition.ONE_INTEGER, template);
        Vectors.set_aref(result, (SubLObject)recognition.TWO_INTEGER, start);
        Vectors.set_aref(result, (SubLObject)recognition.THREE_INTEGER, end);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66245L)
    public static SubLObject rtp_matched_constit_words(final SubLObject constit) {
        return Vectors.aref(constit, (SubLObject)recognition.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66368L)
    public static SubLObject set_rtp_matched_constit_words(final SubLObject constit, final SubLObject words) {
        Vectors.set_aref(constit, (SubLObject)recognition.ZERO_INTEGER, words);
        return constit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66559L)
    public static SubLObject rtp_matched_constit_template(final SubLObject constit) {
        return Vectors.aref(constit, (SubLObject)recognition.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66679L)
    public static SubLObject set_rtp_matched_constit_template(final SubLObject constit, final SubLObject template) {
        Vectors.set_aref(constit, (SubLObject)recognition.ONE_INTEGER, template);
        return constit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66877L)
    public static SubLObject rtp_matched_constit_start(final SubLObject constit) {
        return Vectors.aref(constit, (SubLObject)recognition.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 66994L)
    public static SubLObject set_rtp_matched_constit_start(final SubLObject constit, final SubLObject start) {
        Vectors.set_aref(constit, (SubLObject)recognition.TWO_INTEGER, start);
        return constit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 67168L)
    public static SubLObject rtp_matched_constit_end(final SubLObject constit) {
        return Vectors.aref(constit, (SubLObject)recognition.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 67283L)
    public static SubLObject set_rtp_matched_constit_end(final SubLObject constit, final SubLObject end) {
        Vectors.set_aref(constit, (SubLObject)recognition.THREE_INTEGER, end);
        return constit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 67449L)
    public static SubLObject reverse_and_add_template(final SubLObject string_lists, final SubLObject template) {
        final SubLObject rev_template = Sequences.reverse(template);
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = string_lists;
        SubLObject string_list = (SubLObject)recognition.NIL;
        string_list = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Sequences.reverse(string_list.first()), rev_template, string_list, conses_high.second(string_list), conses_high.third(string_list)), result);
            cdolist_list_var = cdolist_list_var.rest();
            string_list = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 68298L)
    public static SubLObject remove_kleene_words(final SubLObject original_word_lists, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.NIL == original_word_lists) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str98$entered_remove_kleene_words_with_));
            }
            return (SubLObject)recognition.NIL;
        }
        final SubLObject lists = reverse_and_add_template(original_word_lists, template);
        final SubLObject rev_lists = remove_kleene_words_int(lists);
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = rev_lists;
        SubLObject lyst = (SubLObject)recognition.NIL;
        lyst = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)recognition.NIL, (SubLObject)recognition.$str99$removed_list____S__, lyst)));
            }
            final SubLObject word_list = Sequences.reverse(lyst.first());
            final SubLObject template_$10 = Sequences.reverse(conses_high.second(lyst));
            final SubLObject original_words = conses_high.third(lyst).first();
            final SubLObject start_index = conses_high.fourth(lyst);
            final SubLObject end_index = conses_high.fifth(lyst);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(word_list, template_$10, original_words, start_index, end_index), result);
            cdolist_list_var = cdolist_list_var.rest();
            lyst = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 69768L)
    public static SubLObject remove_kleene_words_int(final SubLObject lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)recognition.NIL;
        if (lists.isList()) {
            SubLObject cdolist_list_var = lists;
            SubLObject five_tuple = (SubLObject)recognition.NIL;
            five_tuple = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                final SubLObject word_list = five_tuple.first();
                final SubLObject template = conses_high.second(five_tuple);
                final SubLObject original_words = conses_high.third(five_tuple);
                final SubLObject start_index = conses_high.fourth(five_tuple);
                final SubLObject end_index = conses_high.fifth(five_tuple);
                final SubLObject first_item = template.first();
                if (!word_list.equal(recognition.$completed_words_list$.getGlobalValue()) && recognition.NIL != word_list) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str100$_word_list__S____template__S____f, word_list, template, first_item));
                    }
                    if (recognition.NIL != rtp_type_checkers.optional_template_item(first_item)) {
                        final SubLObject word_lists = remove_optional_strings(first_item, (SubLObject)ConsesLow.list(word_list, start_index, end_index), (SubLObject)recognition.T);
                        final SubLObject temp_template = template.rest();
                        SubLObject temp_result = (SubLObject)recognition.NIL;
                        SubLObject cdolist_list_var_$11 = word_lists;
                        SubLObject removed_word_list = (SubLObject)recognition.NIL;
                        removed_word_list = cdolist_list_var_$11.first();
                        while (recognition.NIL != cdolist_list_var_$11) {
                            temp_result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removed_word_list.first(), temp_template, original_words, conses_high.second(removed_word_list), conses_high.third(removed_word_list)), temp_result);
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            removed_word_list = cdolist_list_var_$11.first();
                        }
                        result = Sequences.cconcatenate(result, remove_kleene_words_int(temp_result));
                    }
                    else {
                        result = (SubLObject)ConsesLow.cons(five_tuple, result);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                five_tuple = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 71649L)
    public static SubLObject completed_entries(final SubLObject entries, final SubLObject depth) {
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)recognition.NIL;
        entry = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (recognition.NIL != completed_entryP(entry, depth)) {
                result = (SubLObject)ConsesLow.cons(entry, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 72094L)
    public static SubLObject completed_entryP(final SubLObject entry, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.NIL != recognition.$parse_entire_string$.getDynamicValue(thread) || depth.numG((SubLObject)recognition.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)) && rtp_datastructures.rtp_chart_entry_words(entry).equal(recognition.$completed_words_list$.getGlobalValue()));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rtp_datastructures.rtp_chart_entry_words(entry).equal(recognition.$completed_words_list$.getGlobalValue()) || Sequences.length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).equal(rtp_datastructures.rtp_chart_entry_template_index(entry)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 72570L)
    public static SubLObject print_entries(final SubLObject entries) {
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)recognition.NIL;
        entry = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str101$words_________S__, rtp_datastructures.rtp_chart_entry_words(entry));
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str102$sem___________S__, rtp_datastructures.rtp_chart_entry_sem(entry));
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str103$bindings______S__, rtp_datastructures.rtp_chart_entry_bindings(entry));
            PrintLow.format((SubLObject)recognition.T, (SubLObject)recognition.$str104$subconsts_____S__, rtp_datastructures.rtp_chart_entry_subconstits(entry));
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)recognition.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 72970L)
    public static SubLObject tp_match_wordXpos(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpos_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 73329L)
    public static SubLObject tp_match_wordXpos_wXwords(final SubLObject template_item, final SubLObject words) {
        if (recognition.NIL == rtp_type_checkers.rtp_word_pos_itemP(template_item)) {
            return (SubLObject)recognition.NIL;
        }
        final SubLObject word = words.first();
        final SubLObject wu = template_item.first();
        final SubLObject pos = conses_high.second(template_item);
        return rtp_string_is_pos_on_wuP(word, wu, pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 73609L)
    public static SubLObject rtp_string_is_pos_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pos_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)recognition.$sym105$GET_STRINGS_OF_TYPE_CACHED, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 73756L)
    public static SubLObject tp_match_wordXpred(final SubLObject template_item, final SubLObject current_entry) {
        return tp_match_wordXpred_wXwords(template_item, rtp_datastructures.rtp_chart_entry_words(current_entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 74107L)
    public static SubLObject tp_match_wordXpred_wXwords(final SubLObject template_item, final SubLObject words) {
        if (recognition.NIL == rtp_type_checkers.rtp_word_pos_pred_itemP(template_item)) {
            return (SubLObject)recognition.NIL;
        }
        final SubLObject word = words.first();
        final SubLObject wu = template_item.first();
        final SubLObject pred = conses_high.second(template_item);
        return rtp_string_is_pred_on_wuP(word, wu, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 74396L)
    public static SubLObject rtp_string_is_pred_on_wuP(final SubLObject word, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.string_is_pred_on_wuP(word, wu, pos, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 74517L)
    public static SubLObject tp_match_tokenP(final SubLObject template_item, final SubLObject current_word) {
        return Strings.string_equal(template_item, current_word, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 74778L)
    public static SubLObject tp_optional_words(final SubLObject template_item, SubLObject current_words) {
        if (recognition.NIL == current_words) {
            return (SubLObject)ConsesLow.list(recognition.$completed_words_list$.getGlobalValue());
        }
        SubLObject result = (SubLObject)ConsesLow.list(current_words);
        final SubLObject kleene_words = expand_word_items_in_list(template_item).rest();
        while (current_words.isList() && current_words.first().isString() && recognition.NIL != conses_high.member(current_words.first(), kleene_words, rtp_vars.$tp_equal$.getGlobalValue(), (SubLObject)recognition.UNPROVIDED)) {
            current_words = current_words.rest();
            if (recognition.NIL == current_words) {
                result = (SubLObject)ConsesLow.cons(recognition.$completed_words_list$.getGlobalValue(), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(current_words, result);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 75586L)
    public static SubLObject tp_require_some(final SubLObject template_item, final SubLObject current_words) {
        if (recognition.NIL != subl_promotions.memberP(current_words.first(), expand_word_items_in_list(template_item).rest(), rtp_vars.$tp_equal$.getGlobalValue(), (SubLObject)recognition.UNPROVIDED)) {
            return tp_optional_words(template_item, current_words.rest());
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 76142L)
    public static SubLObject tp_match_token(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_accessors.denots_of_string(current_words.first(), (SubLObject)recognition.NIL, (SubLObject)recognition.$kw106$DENOT, (SubLObject)recognition.T, (SubLObject)recognition.NIL, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 76321L)
    public static SubLObject tp_match_pos(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cat = template_item.first();
        SubLObject denots = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject denot;
        for (cdotimes_end_var = Sequences.length(current_words), index = (SubLObject)recognition.NIL, index = (SubLObject)recognition.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)recognition.ONE_INTEGER)) {
            denots = (cdolist_list_var = lexicon_accessors.denots_of_stringXspeech_part(string_utilities.bunge(Sequences.subseq(current_words, (SubLObject)recognition.ZERO_INTEGER, Numbers.add((SubLObject)recognition.ONE_INTEGER, index)), (SubLObject)recognition.UNPROVIDED), cat, (SubLObject)recognition.NIL, (SubLObject)recognition.$kw106$DENOT, (SubLObject)recognition.T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED));
            denot = (SubLObject)recognition.NIL;
            denot = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(narts_high.nart_expand(denot), Numbers.add((SubLObject)recognition.ONE_INTEGER, index)), result);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 77034L)
    public static SubLObject tp_match_pred(final SubLObject template_item, final SubLObject current_words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = template_item.first();
        SubLObject denots = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject denot;
        for (cdotimes_end_var = Sequences.length(current_words), index = (SubLObject)recognition.NIL, index = (SubLObject)recognition.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)recognition.ONE_INTEGER)) {
            denots = (cdolist_list_var = lexicon_accessors.denots_of_stringXpred(string_utilities.bunge(Sequences.subseq(current_words, (SubLObject)recognition.ZERO_INTEGER, Numbers.add((SubLObject)recognition.ONE_INTEGER, index)), (SubLObject)recognition.UNPROVIDED), pred, (SubLObject)recognition.NIL, (SubLObject)recognition.$kw106$DENOT, (SubLObject)recognition.T, rtp_vars.$rtp_syntactic_mt$.getDynamicValue(thread), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED));
            denot = (SubLObject)recognition.NIL;
            denot = cdolist_list_var.first();
            while (recognition.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(narts_high.nart_expand(denot), Numbers.add((SubLObject)recognition.ONE_INTEGER, index)), result);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 77806L)
    public static SubLObject expand_word_items_in_list(final SubLObject template_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (recognition.NIL == recognition.$rtp_use_caches$.getDynamicValue(thread)) {
            clear_expand_word_items_in_list_int();
        }
        return expand_word_items_in_list_int(template_item);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78055L)
    public static SubLObject clear_expand_word_items_in_list_int() {
        final SubLObject cs = recognition.$expand_word_items_in_list_int_caching_state$.getGlobalValue();
        if (recognition.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78055L)
    public static SubLObject remove_expand_word_items_in_list_int(final SubLObject template_item) {
        return memoization_state.caching_state_remove_function_results_with_args(recognition.$expand_word_items_in_list_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(template_item), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78055L)
    public static SubLObject expand_word_items_in_list_int_internal(final SubLObject template_item) {
        if (!template_item.isList()) {
            return template_item;
        }
        if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(template_item)) {
            return (SubLObject)ConsesLow.cons(recognition.$const108$RequireOne, rtp_datastructures.compute_strings_of_type(template_item));
        }
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = template_item;
        SubLObject item = (SubLObject)recognition.NIL;
        item = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(item)) {
                result = Sequences.cconcatenate(rtp_datastructures.compute_strings_of_type(item), result);
            }
            else {
                result = (SubLObject)ConsesLow.cons(item, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78055L)
    public static SubLObject expand_word_items_in_list_int(final SubLObject template_item) {
        SubLObject caching_state = recognition.$expand_word_items_in_list_int_caching_state$.getGlobalValue();
        if (recognition.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)recognition.$sym107$EXPAND_WORD_ITEMS_IN_LIST_INT, (SubLObject)recognition.$sym109$_EXPAND_WORD_ITEMS_IN_LIST_INT_CACHING_STATE_, (SubLObject)recognition.$int110$2048, (SubLObject)recognition.EQUAL, (SubLObject)recognition.ONE_INTEGER, (SubLObject)recognition.$int111$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, template_item, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(expand_word_items_in_list_int_internal(template_item)));
            memoization_state.caching_state_put(caching_state, template_item, results, (SubLObject)recognition.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 78754L)
    public static SubLObject remove_optional_strings(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        final SubLObject optional_funct = rtp_type_checkers.optional_template_item(template_item);
        if (recognition.NIL == optional_funct) {
            Errors.error((SubLObject)recognition.$str112$RTP__sent_in_a_non_function_to_RE);
        }
        final SubLObject pcase_var = optional_funct;
        if (pcase_var.eql(recognition.$const113$RequireSome)) {
            return remove_X_words(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql(recognition.$const108$RequireOne)) {
            return remove_require_one(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql(recognition.$const114$OptionalSome)) {
            return remove_optional_words(template_item, word_list, word_list_reversed);
        }
        if (pcase_var.eql(recognition.$const115$OptionalOne)) {
            return remove_optional_one(template_item, word_list, word_list_reversed);
        }
        return (SubLObject)recognition.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 80096L)
    public static SubLObject remove_X_words(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        final SubLObject X_words = expand_word_items_in_list(template_item).rest();
        SubLObject result = (SubLObject)recognition.NIL;
        final SubLObject start_index = conses_high.second(word_list);
        SubLObject end_index = conses_high.third(word_list);
        for (SubLObject words = word_list.first(); recognition.NIL != words.first() && recognition.NIL != conses_high.member(words.first(), X_words, rtp_vars.$tp_equal$.getGlobalValue(), (SubLObject)recognition.UNPROVIDED); words = words.rest()) {
            end_index = Numbers.subtract(end_index, (SubLObject)recognition.ONE_INTEGER);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(words.rest(), start_index, end_index), result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 81408L)
    public static SubLObject remove_a_group(SubLObject group, SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        if (group.isList() && (group.first().eql(recognition.$const116$WordSequence) || group.first() == recognition.$kw117$SEQUENCE)) {
            group = group.rest();
        }
        final SubLObject temp_group = (recognition.NIL != word_list_reversed) ? (group.isList() ? Sequences.reverse(group) : group) : group;
        if (temp_group.isString()) {
            return word_match(temp_group, word_list);
        }
        if (recognition.NIL != rtp_type_checkers.rtp_word_itemP(temp_group)) {
            return word_match(temp_group, word_list);
        }
        SubLObject cdolist_list_var = temp_group;
        SubLObject word = (SubLObject)recognition.NIL;
        word = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject new_words = word_match(word, word_list);
            if (recognition.NIL == new_words) {
                return (SubLObject)recognition.NIL;
            }
            word_list = new_words;
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return word_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 82324L)
    public static SubLObject word_match(final SubLObject word_item, final SubLObject words) {
        if (recognition.NIL == words || ConsesLow.list((SubLObject)recognition.$kw118$COMPLETE).equal(words)) {
            return (SubLObject)recognition.NIL;
        }
        if (word_item.isString()) {
            if (recognition.NIL != Functions.funcall(rtp_vars.$tp_equal$.getGlobalValue(), word_item, words.first())) {
                return (recognition.NIL != words.rest()) ? words.rest() : recognition.$completed_words_list$.getGlobalValue();
            }
            return (SubLObject)recognition.NIL;
        }
        else {
            if (recognition.NIL == rtp_type_checkers.rtp_word_itemP(word_item)) {
                return (SubLObject)recognition.NIL;
            }
            if (recognition.NIL != rtp_string_is_pos_on_wuP(words.first(), rtp_datastructures.template_item_wu(word_item), rtp_datastructures.template_item_pos(word_item))) {
                return (recognition.NIL != words.rest()) ? words.rest() : recognition.$completed_words_list$.getGlobalValue();
            }
            return (SubLObject)recognition.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 83261L)
    public static SubLObject remove_optional_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        final SubLObject removed_list = remove_one(template_item, word_list, word_list_reversed);
        if (recognition.NIL != removed_list) {
            return removed_list;
        }
        return (SubLObject)ConsesLow.list(word_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 83507L)
    public static SubLObject remove_require_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        return remove_one(template_item, word_list, word_list_reversed);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 83665L)
    public static SubLObject remove_one(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        final SubLObject X_words = expand_word_items_in_list(template_item).rest();
        final SubLObject start_index = conses_high.second(word_list);
        final SubLObject words = word_list.first();
        SubLObject iter_result = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = X_words;
        SubLObject group = (SubLObject)recognition.NIL;
        group = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            iter_result = remove_a_group(group, words, word_list_reversed);
            if (recognition.NIL != iter_result) {
                if (iter_result.eql(recognition.$completed_words_list$.getGlobalValue())) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iter_result, start_index, start_index), result);
                }
                else {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(iter_result, start_index, Numbers.add(start_index, Sequences.length(iter_result))), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            group = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 85025L)
    public static SubLObject remove_optional_words(final SubLObject template_item, final SubLObject word_list, SubLObject word_list_reversed) {
        if (word_list_reversed == recognition.UNPROVIDED) {
            word_list_reversed = (SubLObject)recognition.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_optional_words = expand_word_items_in_list(template_item).rest();
        SubLObject result = (SubLObject)ConsesLow.list(word_list);
        SubLObject words = word_list.first();
        final SubLObject start_index = conses_high.second(word_list);
        SubLObject end_index = conses_high.third(word_list);
        final SubLObject optional_words = expand_word_items_in_list(original_optional_words);
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str119$word_list____S____words____S__, word_list, original_optional_words));
        }
        while (recognition.NIL != words && recognition.NIL != conses_high.member(words.first(), optional_words, rtp_vars.$tp_equal$.getGlobalValue(), (SubLObject)recognition.UNPROVIDED)) {
            end_index = Numbers.subtract(end_index, (SubLObject)recognition.ONE_INTEGER);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(words.rest(), start_index, end_index), result);
            words = words.rest();
        }
        return (SubLObject)((recognition.NIL != recognition.$greedy_kleene$.getGlobalValue()) ? ConsesLow.list(result.first()) : result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 86502L)
    public static SubLObject fully_bound_entryP(final SubLObject entry) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(rtp_datastructures.rule_template(rtp_datastructures.rtp_chart_entry_rule(entry))).numE(rtp_datastructures.rtp_chart_entry_template_index(entry)) && recognition.NIL == rtp_datastructures.rtp_chart_entry_subconstits(entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 86849L)
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
        return (SubLObject)recognition.$kw120$RESET;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 87257L)
    public static SubLObject parse_subconstit_list(final SubLObject entry, final SubLObject depth, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subconstits = rtp_datastructures.rtp_chart_entry_subconstits(entry);
        SubLObject entry_list = (SubLObject)ConsesLow.list(entry);
        SubLObject int_result = (SubLObject)recognition.NIL;
        SubLObject cdolist_list_var = subconstits;
        SubLObject subconstit = (SubLObject)recognition.NIL;
        subconstit = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str121$subconstit____S__, subconstit));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str122$present_subconstit____S__, subconstit));
            }
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str123$entry_list____S__, entry_list));
            }
            SubLObject cdolist_list_var_$12 = entry_list;
            SubLObject iter_entry = (SubLObject)recognition.NIL;
            iter_entry = cdolist_list_var_$12.first();
            while (recognition.NIL != cdolist_list_var_$12) {
                if (recognition.NIL != rtp_type_checkers.rtp_template_categoryP(rtp_datastructures.subconstit_cat(subconstit), (SubLObject)recognition.UNPROVIDED)) {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str124$inside_template_category__));
                    }
                    final SubLObject cat = rtp_datastructures.subconstit_cat(subconstit);
                    final SubLObject stryng = rtp_datastructures.subconstit_string(subconstit);
                    final SubLObject var = rtp_datastructures.subconstit_binding_var(subconstit);
                    final SubLObject start = rtp_datastructures.subconstit_start(subconstit);
                    final SubLObject end = rtp_datastructures.subconstit_end(subconstit);
                    final SubLObject sub_parses = sem_parse_int(stryng, start, end, mt, cat, Numbers.add(depth, (SubLObject)recognition.ONE_INTEGER), (SubLObject)recognition.UNPROVIDED);
                    SubLObject temp_entry = (SubLObject)recognition.NIL;
                    SubLObject cdolist_list_var_$13 = sub_parses;
                    SubLObject parse = (SubLObject)recognition.NIL;
                    parse = cdolist_list_var_$13.first();
                    while (recognition.NIL != cdolist_list_var_$13) {
                        temp_entry = rtp_datastructures.copy_rtp_entry(iter_entry);
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry).rest());
                        rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry, (SubLObject)ConsesLow.cons(rtp_datastructures.rtp_make_binding(var, parse), rtp_datastructures.rtp_chart_entry_bindings(temp_entry)));
                        int_result = (SubLObject)ConsesLow.cons(temp_entry, int_result);
                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                        parse = cdolist_list_var_$13.first();
                    }
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str125$int_result____S__, int_result));
                    }
                }
                else {
                    if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.ONE_INTEGER)) {
                        rtp_tracer_output((SubLObject)recognition.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str126$inside_the_T));
                    }
                    final SubLObject template = rtp_datastructures.make_rtp_rule(rtp_datastructures.subconstit_cat(subconstit), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(rtp_datastructures.subconstit_cat(subconstit), rtp_datastructures.subconstit_binding_var(subconstit))), rtp_datastructures.subconstit_binding_var(subconstit));
                    final SubLObject sub_parses2 = tp_match_template(template, rtp_datastructures.subconstit_string(subconstit), rtp_datastructures.subconstit_start(subconstit), rtp_datastructures.subconstit_end(subconstit), Numbers.add(depth, (SubLObject)recognition.ONE_INTEGER));
                    SubLObject temp_entry2 = (SubLObject)recognition.NIL;
                    SubLObject cdolist_list_var_$14 = sub_parses2;
                    SubLObject parse2 = (SubLObject)recognition.NIL;
                    parse2 = cdolist_list_var_$14.first();
                    while (recognition.NIL != cdolist_list_var_$14) {
                        temp_entry2 = rtp_datastructures.copy_rtp_entry(iter_entry);
                        rtp_datastructures._csetf_rtp_chart_entry_subconstits(temp_entry2, rtp_datastructures.rtp_chart_entry_subconstits(temp_entry2).rest());
                        SubLObject cdolist_list_var_$15 = rtp_datastructures.rtp_chart_entry_bindings(parse2);
                        SubLObject binding = (SubLObject)recognition.NIL;
                        binding = cdolist_list_var_$15.first();
                        while (recognition.NIL != cdolist_list_var_$15) {
                            rtp_datastructures._csetf_rtp_chart_entry_bindings(temp_entry2, (SubLObject)ConsesLow.cons(binding, rtp_datastructures.rtp_chart_entry_bindings(temp_entry2)));
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            binding = cdolist_list_var_$15.first();
                        }
                        int_result = (SubLObject)ConsesLow.cons(temp_entry2, int_result);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        parse2 = cdolist_list_var_$14.first();
                    }
                }
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                iter_entry = cdolist_list_var_$12.first();
            }
            entry_list = int_result;
            int_result = (SubLObject)recognition.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            subconstit = cdolist_list_var.first();
        }
        return entry_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 97640L)
    public static SubLObject tp_bind_entry(final SubLObject entry) {
        final SubLObject init_sem = rtp_datastructures.rtp_chart_entry_sem(entry);
        final SubLObject init_bindings = rtp_datastructures.rtp_chart_entry_bindings(entry);
        SubLObject results = (SubLObject)recognition.NIL;
        if (recognition.NIL == init_bindings) {
            return (SubLObject)ConsesLow.list(init_sem);
        }
        final SubLObject new_entry = rtp_datastructures.copy_rtp_entry(entry);
        final SubLObject binding = rtp_datastructures.rtp_chart_entry_bindings(new_entry).first();
        final SubLObject binding_var = rtp_datastructures.rtp_binding_var(binding);
        SubLObject binding_val = rtp_datastructures.rtp_binding_vals(binding);
        rtp_datastructures._csetf_rtp_chart_entry_bindings(new_entry, rtp_datastructures.rtp_chart_entry_bindings(new_entry).rest());
        if (binding_val.isAtom()) {
            binding_val = (SubLObject)ConsesLow.list(binding_val);
        }
        SubLObject cdolist_list_var = binding_val;
        SubLObject val = (SubLObject)recognition.NIL;
        val = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            final SubLObject bound_entry = rtp_datastructures.copy_rtp_entry(new_entry);
            rtp_datastructures._csetf_rtp_chart_entry_sem(bound_entry, substitute_bindings(val, binding_var, init_sem));
            results = ConsesLow.append(tp_bind_entry(bound_entry), results);
            cdolist_list_var = cdolist_list_var.rest();
            val = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 98716L)
    public static SubLObject substitute_bindings(final SubLObject val, final SubLObject binding_var, final SubLObject sem) {
        if (sem.isList()) {
            return conses_high.subst(val, binding_var, sem, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
        }
        if (sem.equal(binding_var)) {
            return val;
        }
        return sem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 99282L)
    public static SubLObject sem_parse(final SubLObject sentence, final SubLObject mt, SubLObject cat, SubLObject complete_parses_only) {
        if (cat == recognition.UNPROVIDED) {
            cat = recognition.$const9$STemplate;
        }
        if (complete_parses_only == recognition.UNPROVIDED) {
            complete_parses_only = (SubLObject)recognition.T;
        }
        ensure_sem_parse_initialized();
        final SubLObject tokenized_string = string_utilities.split_string(sentence, (SubLObject)recognition.UNPROVIDED);
        final SubLObject start = (SubLObject)recognition.ZERO_INTEGER;
        final SubLObject end = Sequences.length(tokenized_string);
        return Sequences.remove_duplicates(sem_parse_int(tokenized_string, start, end, mt, cat, (SubLObject)recognition.ZERO_INTEGER, complete_parses_only), Symbols.symbol_function((SubLObject)recognition.EQUALP), (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED, (SubLObject)recognition.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rtp/recognition.lisp", position = 100564L)
    public static SubLObject sem_parse_int(final SubLObject sentence, final SubLObject start, final SubLObject end, final SubLObject mt, SubLObject cat, SubLObject depth, SubLObject complete_parses_only) {
        if (cat == recognition.UNPROVIDED) {
            cat = recognition.$const9$STemplate;
        }
        if (depth == recognition.UNPROVIDED) {
            depth = (SubLObject)recognition.ZERO_INTEGER;
        }
        if (complete_parses_only == recognition.UNPROVIDED) {
            complete_parses_only = (SubLObject)recognition.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entries = rec_parse(cat, sentence, start, end, depth, mt);
        SubLObject sem = (SubLObject)recognition.NIL;
        SubLObject result = (SubLObject)recognition.NIL;
        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
            rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str127$entries____S__, entries));
        }
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)recognition.NIL;
        entry = cdolist_list_var.first();
        while (recognition.NIL != cdolist_list_var) {
            if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str128$push_sem_from__S__));
            }
            SubLObject cdolist_list_var_$16;
            sem = (cdolist_list_var_$16 = tp_bind_entry(entry));
            SubLObject sem_temp = (SubLObject)recognition.NIL;
            sem_temp = cdolist_list_var_$16.first();
            while (recognition.NIL != cdolist_list_var_$16) {
                if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE((SubLObject)recognition.TWO_INTEGER)) {
                    rtp_tracer_output((SubLObject)recognition.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)recognition.$str129$pushing__S__, sem));
                }
                result = (SubLObject)ConsesLow.cons(sem_temp, result);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                sem_temp = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return result;
    }
    
    public static SubLObject declare_recognition_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rtp.recognition", "rtp_trace_out", "RTP-TRACE-OUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_tracer_output", "RTP-TRACER-OUTPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_trace", "RTP-TRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "ensure_sem_parse_initialized", "ENSURE-SEM-PARSE-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "template_parse", "TEMPLATE-PARSE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "categorizing_template_parse", "CATEGORIZING-TEMPLATE-PARSE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "reformulate_jointemplatecomponents", "REFORMULATE-JOINTEMPLATECOMPONENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "joinable_template_component_formulaP", "JOINABLE-TEMPLATE-COMPONENT-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "transform_rewrite_sequence", "TRANSFORM-REWRITE-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rewrite_assemble_phrase", "REWRITE-ASSEMBLE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "join_tcomponents_and_rewrite_sequence", "JOIN-TCOMPONENTS-AND-REWRITE-SEQUENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "jointemplate_pattern_type", "JOINTEMPLATE-PATTERN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "transform_jointemplatecomponents", "TRANSFORM-JOINTEMPLATECOMPONENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "expressions_for_pattern_transform", "EXPRESSIONS-FOR-PATTERN-TRANSFORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rec_parse", "REC-PARSE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rec_parse_int", "REC-PARSE-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "filter_semantic_tests", "FILTER-SEMANTIC-TESTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "filter_rules", "FILTER-RULES", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "templates_potentially_applicable_to_word_list", "TEMPLATES-POTENTIALLY-APPLICABLE-TO-WORD-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "check_partial_ordering", "CHECK-PARTIAL-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_mt_from_results", "REMOVE-MT-FROM-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "add_mt_to_results", "ADD-MT-TO-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "template_can_precede", "TEMPLATE-CAN-PRECEDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "initialize_partial_orders_hash", "INITIALIZE-PARTIAL-ORDERS-HASH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "counted_sethash", "COUNTED-SETHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "get_counted_sethash_entry_count", "GET-COUNTED-SETHASH-ENTRY-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "template_item_from_rtp_entry", "TEMPLATE-ITEM-FROM-RTP-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "eat_a_template_item", "EAT-A-TEMPLATE-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_template", "TP-MATCH-TEMPLATE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "filter_sem_tests", "FILTER-SEM-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_string_template_item", "MATCH-STRING-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_wu_template_item", "MATCH-WU-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_token_template_item", "MATCH-TOKEN-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_nl_agr_pred_template_item", "MATCH-NL-AGR-PRED-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_speech_part_template_item", "MATCH-SPEECH-PART-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "words_from_word_spans", "WORDS-FROM-WORD-SPANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_optional_template_item", "MATCH-OPTIONAL-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "clear_match_recursive_template_item", "CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_recursive_template_item", "MATCH-RECURSIVE-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "get_sem_test_for_var", "GET-SEM-TEST-FOR-VAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "get_sem_test_for_var_from_formula", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "get_sem_test_for_var_from_formula_int", "GET-SEM-TEST-FOR-VAR-FROM-FORMULA-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "failed_subconst_item", "FAILED-SUBCONST-ITEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "prefixes_before_item", "PREFIXES-BEFORE-ITEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "match_template_item", "MATCH-TEMPLATE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "find_stop_item", "FIND-STOP-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_split", "TP-SPLIT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_compute_permutations", "RTP-COMPUTE-PERMUTATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_compute_recursive_locations", "RTP-COMPUTE-RECURSIVE-LOCATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "compute_matches", "COMPUTE-MATCHES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "valid_constits_p", "VALID-CONSTITS-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "compute_matches_int", "COMPUTE-MATCHES-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "build_located_matches", "BUILD-LOCATED-MATCHES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "compute_constit_locations", "COMPUTE-CONSTIT-LOCATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "process_perm_non_recursive", "PROCESS-PERM-NON-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "find_rtp_matches", "FIND-RTP-MATCHES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "process_perm_recursive", "PROCESS-PERM-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "new_rtp_perm_state", "NEW-RTP-PERM-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "make_rtp_perm_state", "MAKE-RTP-PERM-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_unused_words", "RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_perm_state_unused_words", "SET-RTP-PERM-STATE-UNUSED-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "pop_rtp_perm_state_unused_words", "POP-RTP-PERM-STATE-UNUSED-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_unused_template", "RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "pop_rtp_perm_state_unused_template", "POP-RTP-PERM-STATE-UNUSED-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_perm_state_unused_template", "SET-RTP-PERM-STATE-UNUSED-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_first_unused_template_item", "RTP-PERM-STATE-FIRST-UNUSED-TEMPLATE-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_perm_state_matched", "SET-RTP-PERM-STATE-MATCHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_matched", "RTP-PERM-STATE-MATCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "push_to_end_rtp_matched_constit", "PUSH-TO-END-RTP-MATCHED-CONSTIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_start_index", "RTP-PERM-STATE-START-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_perm_state_start_index", "SET-RTP-PERM-STATE-START-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_perm_state_completeP", "RTP-PERM-STATE-COMPLETE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "no_unused_wordsP", "NO-UNUSED-WORDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "no_unused_template_itemsP", "NO-UNUSED-TEMPLATE-ITEMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "make_unlocated_rtp_matched_constit", "MAKE-UNLOCATED-RTP-MATCHED-CONSTIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "unlocated_rtp_matched_constitP", "UNLOCATED-RTP-MATCHED-CONSTIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "make_rtp_matched_constit", "MAKE-RTP-MATCHED-CONSTIT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_matched_constit_words", "RTP-MATCHED-CONSTIT-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_matched_constit_words", "SET-RTP-MATCHED-CONSTIT-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_matched_constit_template", "RTP-MATCHED-CONSTIT-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_matched_constit_template", "SET-RTP-MATCHED-CONSTIT-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_matched_constit_start", "RTP-MATCHED-CONSTIT-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_matched_constit_start", "SET-RTP-MATCHED-CONSTIT-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_matched_constit_end", "RTP-MATCHED-CONSTIT-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "set_rtp_matched_constit_end", "SET-RTP-MATCHED-CONSTIT-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "reverse_and_add_template", "REVERSE-AND-ADD-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_kleene_words", "REMOVE-KLEENE-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_kleene_words_int", "REMOVE-KLEENE-WORDS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "completed_entries", "COMPLETED-ENTRIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "completed_entryP", "COMPLETED-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "print_entries", "PRINT-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_wordXpos", "TP-MATCH-WORD&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_wordXpos_wXwords", "TP-MATCH-WORD&POS-W/WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_string_is_pos_on_wuP", "RTP-STRING-IS-POS-ON-WU?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_wordXpred", "TP-MATCH-WORD&PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_wordXpred_wXwords", "TP-MATCH-WORD&PRED-W/WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "rtp_string_is_pred_on_wuP", "RTP-STRING-IS-PRED-ON-WU?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_tokenP", "TP-MATCH-TOKEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_optional_words", "TP-OPTIONAL-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_require_some", "TP-REQUIRE-SOME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_token", "TP-MATCH-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_pos", "TP-MATCH-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_match_pred", "TP-MATCH-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "expand_word_items_in_list", "EXPAND-WORD-ITEMS-IN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "clear_expand_word_items_in_list_int", "CLEAR-EXPAND-WORD-ITEMS-IN-LIST-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_expand_word_items_in_list_int", "REMOVE-EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "expand_word_items_in_list_int_internal", "EXPAND-WORD-ITEMS-IN-LIST-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "expand_word_items_in_list_int", "EXPAND-WORD-ITEMS-IN-LIST-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_optional_strings", "REMOVE-OPTIONAL-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_X_words", "REMOVE-+-WORDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_a_group", "REMOVE-A-GROUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "word_match", "WORD-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_optional_one", "REMOVE-OPTIONAL-ONE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_require_one", "REMOVE-REQUIRE-ONE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_one", "REMOVE-ONE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "remove_optional_words", "REMOVE-OPTIONAL-WORDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "fully_bound_entryP", "FULLY-BOUND-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "reset_all_recognizer_caches", "RESET-ALL-RECOGNIZER-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "parse_subconstit_list", "PARSE-SUBCONSTIT-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "tp_bind_entry", "TP-BIND-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "substitute_bindings", "SUBSTITUTE-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "sem_parse", "SEM-PARSE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rtp.recognition", "sem_parse_int", "SEM-PARSE-INT", 4, 3, false);
        return (SubLObject)recognition.NIL;
    }
    
    public static SubLObject init_recognition_file() {
        recognition.$rtp_use_caches$ = SubLFiles.defparameter("*RTP-USE-CACHES*", (SubLObject)recognition.T);
        recognition.$return_early$ = SubLFiles.deflexical("*RETURN-EARLY*", (SubLObject)recognition.T);
        recognition.$greedy_kleene$ = SubLFiles.deflexical("*GREEDY-KLEENE*", (SubLObject)recognition.T);
        recognition.$rtp_perform_semantic_tests$ = SubLFiles.deflexical("*RTP-PERFORM-SEMANTIC-TESTS*", (SubLObject)recognition.$kw0$EXTERNAL);
        recognition.$parse_entire_string$ = SubLFiles.defparameter("*PARSE-ENTIRE-STRING*", (SubLObject)recognition.T);
        recognition.$completed_words_list$ = SubLFiles.defconstant("*COMPLETED-WORDS-LIST*", (SubLObject)recognition.$list1);
        recognition.$perform_template_component_join$ = SubLFiles.defparameter("*PERFORM-TEMPLATE-COMPONENT-JOIN*", (SubLObject)recognition.T);
        recognition.$template_parse_includes_template_categories$ = SubLFiles.defparameter("*TEMPLATE-PARSE-INCLUDES-TEMPLATE-CATEGORIES*", (SubLObject)recognition.NIL);
        recognition.$counted_template_set$ = SubLFiles.defparameter("*COUNTED-TEMPLATE-SET*", (SubLObject)recognition.NIL);
        recognition.$rtp_display_filter_rules$ = SubLFiles.deflexical("*RTP-DISPLAY-FILTER-RULES*", (SubLObject)recognition.NIL);
        recognition.$use_best_templates_first$ = SubLFiles.defparameter("*USE-BEST-TEMPLATES-FIRST*", (SubLObject)recognition.NIL);
        recognition.$partial_orders_hash$ = SubLFiles.defparameter("*PARTIAL-ORDERS-HASH*", Hashtables.make_hash_table((SubLObject)recognition.TWENTY_INTEGER, Symbols.symbol_function((SubLObject)recognition.EQUAL), (SubLObject)recognition.UNPROVIDED));
        recognition.$expand_word_items_in_list_int_caching_state$ = SubLFiles.deflexical("*EXPAND-WORD-ITEMS-IN-LIST-INT-CACHING-STATE*", (SubLObject)recognition.NIL);
        return (SubLObject)recognition.NIL;
    }
    
    public static SubLObject setup_recognition_file() {
        memoization_state.note_globally_cached_function((SubLObject)recognition.$sym107$EXPAND_WORD_ITEMS_IN_LIST_INT);
        return (SubLObject)recognition.NIL;
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
        me = (SubLFile)new recognition();
        recognition.$rtp_use_caches$ = null;
        recognition.$return_early$ = null;
        recognition.$greedy_kleene$ = null;
        recognition.$rtp_perform_semantic_tests$ = null;
        recognition.$parse_entire_string$ = null;
        recognition.$completed_words_list$ = null;
        recognition.$perform_template_component_join$ = null;
        recognition.$template_parse_includes_template_categories$ = null;
        recognition.$counted_template_set$ = null;
        recognition.$rtp_display_filter_rules$ = null;
        recognition.$use_best_templates_first$ = null;
        recognition.$partial_orders_hash$ = null;
        recognition.$expand_word_items_in_list_int_caching_state$ = null;
        $kw0$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETE"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"));
        $sym3$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym4$__ = SubLObjectFactory.makeSymbol(">=");
        $sym5$_RTP_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*RTP-TRACE-LEVEL*");
        $sym6$RTP_TRACER_OUTPUT = SubLObjectFactory.makeSymbol("RTP-TRACER-OUTPUT");
        $sym7$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym8$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $const9$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $const10$Simply = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Simply"));
        $const11$joinTemplateComponents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("joinTemplateComponents"));
        $sym12$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym13$FILTER_SEMANTIC_TESTS = SubLObjectFactory.makeSymbol("FILTER-SEMANTIC-TESTS");
        $sym14$JOINABLE_TEMPLATE_COMPONENT_FORMULA_ = SubLObjectFactory.makeSymbol("JOINABLE-TEMPLATE-COMPONENT-FORMULA?");
        $sym15$TRANSFORM_JOINTEMPLATECOMPONENTS = SubLObjectFactory.makeSymbol("TRANSFORM-JOINTEMPLATECOMPONENTS");
        $const16$RewriteSequenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RewriteSequenceFn"));
        $const17$AssemblePhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssemblePhraseFn"));
        $kw18$LEADING = SubLObjectFactory.makeKeyword("LEADING");
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VPTemplate")));
        $kw20$S_NP_VP = SubLObjectFactory.makeKeyword("S-NP-VP");
        $kw21$SBAR_WHNP_S = SubLObjectFactory.makeKeyword("SBAR-WHNP-S");
        $const22$TheSentenceSubject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSentenceSubject"));
        $kw23$TRAILING = SubLObjectFactory.makeKeyword("TRAILING");
        $const24$TheGappedTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheGappedTerm"));
        $str25$results_of_first_pass____S__ = SubLObjectFactory.makeString("results of first pass:~&~S~&");
        $str26$working_on_entry1___S__ = SubLObjectFactory.makeString("working on entry1: ~S~&");
        $str27$fully_bound_entries____S__ = SubLObjectFactory.makeString("fully-bound entries = ~S~&");
        $str28$unbound_entries____S__ = SubLObjectFactory.makeString("unbound-entries = ~S~&");
        $str29$recurring_on___S__ = SubLObjectFactory.makeString("recurring on: ~S~&");
        $kw30$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw31$GENERIC = SubLObjectFactory.makeKeyword("GENERIC");
        $str32$FILTER_RULES___S__ = SubLObjectFactory.makeString("FILTER-RULES: ~S~%");
        $int33$30 = SubLObjectFactory.makeInteger(30);
        $sym34$_ = SubLObjectFactory.makeSymbol(">");
        $sym35$GET_COUNTED_SETHASH_ENTRY_COUNT = SubLObjectFactory.makeSymbol("GET-COUNTED-SETHASH-ENTRY-COUNT");
        $str36$_2_words___a_2_ = SubLObjectFactory.makeString("~2%words: ~a~2%");
        $str37$rule___a__transformation___a_2_ = SubLObjectFactory.makeString("rule: ~a~%transformation: ~a~2%");
        $str38$_2_ = SubLObjectFactory.makeString("~2%");
        $sym39$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $sym40$TEMPLATE_RULE_ASSERTION = SubLObjectFactory.makeSymbol("TEMPLATE-RULE-ASSERTION");
        $sym41$TEMPLATE_CAN_PRECEDE = SubLObjectFactory.makeSymbol("TEMPLATE-CAN-PRECEDE");
        $sym42$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym43$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const44$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const45$templatePrecedes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("templatePrecedes"));
        $str46$split_sentence____S__ = SubLObjectFactory.makeString("split-sentence = ~S~&");
        $str47$at_top_of_cdolist__current_entrie = SubLObjectFactory.makeString("at top of cdolist, current-entries = ~S~&");
        $str48$top_entry____S__ = SubLObjectFactory.makeString("top entry = ~S~&");
        $str49$template_item____S__ = SubLObjectFactory.makeString("template-item = ~S~&");
        $str50$RTP_Chart_Entry_is_empty___ = SubLObjectFactory.makeString("RTP Chart Entry is empty.~&");
        $str51$Equal_to_completed_word_list__ = SubLObjectFactory.makeString("Equal to completed word list~&");
        $str52$No_hits_for_template_item__S__ = SubLObjectFactory.makeString("No hits for template item ~S~&");
        $str53$current_entries____S__ = SubLObjectFactory.makeString("current-entries = ~S~&");
        $str54$_________COMPLETED_ENTRIES_______ = SubLObjectFactory.makeString("~%~%***  COMPLETED ENTRIES  ***~%");
        $kw55$INTERNAL = SubLObjectFactory.makeKeyword("INTERNAL");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS-EATEN"));
        $str57$adding_some_subconstits_for__S__ = SubLObjectFactory.makeString("adding some subconstits for ~S~&");
        $str58$____split_out____S_____template_r = SubLObjectFactory.makeString("*** split-out = ~S***~&template-rest = ~S~&");
        $str59$____splits____S_____ = SubLObjectFactory.makeString("*** splits = ~S***~&");
        $str60$lyst__S__ = SubLObjectFactory.makeString("lyst=~S~&");
        $str61$used_words____S__ = SubLObjectFactory.makeString("used-words = ~S~&");
        $str62$length_of_used_words____S__ = SubLObjectFactory.makeString("length of used-words = ~S~&");
        $str63$just_ate__S_words__ = SubLObjectFactory.makeString("just ate ~S words~&");
        $str64$words_in_entry____S__ = SubLObjectFactory.makeString("words in entry = ~S~&");
        $str65$subconstit_eaten____S__ = SubLObjectFactory.makeString("subconstit eaten = ~S~&");
        $str66$subconstit_is__A_recursive__ = SubLObjectFactory.makeString("subconstit is ~A recursive~&");
        $str67$ = SubLObjectFactory.makeString("");
        $str68$not_ = SubLObjectFactory.makeString("not ");
        $str69$pushing_a_new_subconstit___S__ = SubLObjectFactory.makeString("pushing a new subconstit: ~S~&");
        $str70$new_entry____A__ = SubLObjectFactory.makeString("new-entry = ~A~&");
        $str71$after_eating_subconstit__new_entr = SubLObjectFactory.makeString("after eating subconstit, new entry = ~S~&");
        $str72$failed_template____A__ = SubLObjectFactory.makeString("failed-template = ~A~&");
        $str73$new_entry__end_of_recursive_item_ = SubLObjectFactory.makeString("new entry (end of recursive-item?) = ~S~&");
        $str74$pushing_entry_at_end_of_recursive = SubLObjectFactory.makeString("pushing entry at end of recursive item~%");
        $const75$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $float76$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str77$sent_invalid_args___S__S__to_MATC = SubLObjectFactory.makeString("sent invalid args (~S ~S) to MATCH-TEMPLATE-ITEM");
        $str78$template_remainder____S__stop_ite = SubLObjectFactory.makeString("template-remainder = ~S~&stop-item = ~S~& stop-index = ~S~&stop-index-template = ~S~&");
        $str79$stop_remainder____S__template_unu = SubLObjectFactory.makeString("stop-remainder = ~S~&template-unused=~S~&words=~S~&words-before-stop = ~S~&kleene-removed-lists = ~S~&");
        $str80$item____S__original_words____S__ = SubLObjectFactory.makeString("item = ~S~&original-words = ~S~&");
        $str81$single_const_lists____S__ = SubLObjectFactory.makeString("single-const-lists = ~S~&");
        $str82$lyst____S__result____S__ = SubLObjectFactory.makeString("lyst = ~S~&result = ~S~%");
        $sym83$EXPAND_WORD_ITEMS_IN_LIST = SubLObjectFactory.makeSymbol("EXPAND-WORD-ITEMS-IN-LIST");
        $str84$incomplete_states____S__ = SubLObjectFactory.makeString("incomplete-states = ~S~%");
        $str85$present_state____S__ = SubLObjectFactory.makeString("present-state = ~S~%");
        $str86$call_to_compute_matches_with_an_e = SubLObjectFactory.makeString("call to compute-matches with an empty match-list");
        $str87$cond1 = SubLObjectFactory.makeString("cond1");
        $str88$cond2 = SubLObjectFactory.makeString("cond2");
        $str89$cond6 = SubLObjectFactory.makeString("cond6");
        $str90$cond3 = SubLObjectFactory.makeString("cond3");
        $str91$cond4 = SubLObjectFactory.makeString("cond4");
        $str92$cond5 = SubLObjectFactory.makeString("cond5");
        $str93$x____S__ = SubLObjectFactory.makeString("x = ~S~%");
        $str94$intermed_words____S__first_first_ = SubLObjectFactory.makeString("intermed-words = ~S~%first-first = ~S~%");
        $str95$sent_an_unexpanded_item___S__to_f = SubLObjectFactory.makeString("sent an unexpanded item (~S) to find-rtp-matches");
        $str96$sent_invalid_item__S_to_find_rtp_ = SubLObjectFactory.makeString("sent invalid item ~S to find-rtp-matches");
        $kw97$UNLOCATED = SubLObjectFactory.makeKeyword("UNLOCATED");
        $str98$entered_remove_kleene_words_with_ = SubLObjectFactory.makeString("entered remove-kleene-words with no words~&");
        $str99$removed_list____S__ = SubLObjectFactory.makeString("removed-list = ~S~&");
        $str100$_word_list__S____template__S____f = SubLObjectFactory.makeString("<word-list ~S>~&<template ~S>~&<first-item ~S>~&");
        $str101$words_________S__ = SubLObjectFactory.makeString("words     =  ~S~&");
        $str102$sem___________S__ = SubLObjectFactory.makeString("sem       =  ~S~&");
        $str103$bindings______S__ = SubLObjectFactory.makeString("bindings  =  ~S~&");
        $str104$subconsts_____S__ = SubLObjectFactory.makeString("subconsts =  ~S~&");
        $sym105$GET_STRINGS_OF_TYPE_CACHED = SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE-CACHED");
        $kw106$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym107$EXPAND_WORD_ITEMS_IN_LIST_INT = SubLObjectFactory.makeSymbol("EXPAND-WORD-ITEMS-IN-LIST-INT");
        $const108$RequireOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireOne"));
        $sym109$_EXPAND_WORD_ITEMS_IN_LIST_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*EXPAND-WORD-ITEMS-IN-LIST-INT-CACHING-STATE*");
        $int110$2048 = SubLObjectFactory.makeInteger(2048);
        $int111$256 = SubLObjectFactory.makeInteger(256);
        $str112$RTP__sent_in_a_non_function_to_RE = SubLObjectFactory.makeString("RTP: sent in a non-function to REMOVE-OPTIONAL-STRINGS");
        $const113$RequireSome = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RequireSome"));
        $const114$OptionalSome = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalSome"));
        $const115$OptionalOne = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OptionalOne"));
        $const116$WordSequence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordSequence"));
        $kw117$SEQUENCE = SubLObjectFactory.makeKeyword("SEQUENCE");
        $kw118$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $str119$word_list____S____words____S__ = SubLObjectFactory.makeString("word-list = ~S~&*-words = ~S~&");
        $kw120$RESET = SubLObjectFactory.makeKeyword("RESET");
        $str121$subconstit____S__ = SubLObjectFactory.makeString("subconstit = ~S~&");
        $str122$present_subconstit____S__ = SubLObjectFactory.makeString("present-subconstit = ~S~&");
        $str123$entry_list____S__ = SubLObjectFactory.makeString("entry-list = ~S~&");
        $str124$inside_template_category__ = SubLObjectFactory.makeString("inside template-category~&");
        $str125$int_result____S__ = SubLObjectFactory.makeString("int-result = ~S~&");
        $str126$inside_the_T = SubLObjectFactory.makeString("inside the T");
        $str127$entries____S__ = SubLObjectFactory.makeString("entries = ~S~%");
        $str128$push_sem_from__S__ = SubLObjectFactory.makeString("push sem from ~S~&");
        $str129$pushing__S__ = SubLObjectFactory.makeString("pushing ~S~&");
    }
}

/*

	Total time: 561 ms
	
*/