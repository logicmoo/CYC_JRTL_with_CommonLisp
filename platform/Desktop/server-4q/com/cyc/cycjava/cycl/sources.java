package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sources extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sources";
    public static final String myFingerPrint = "2cebc32fa1525f16832dbc92a64c46bd63ea45ebf6f63b90b9f2bafcec39035c";
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 1545L)
    private static SubLSymbol $non_assertion_source_citation_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 4211L)
    private static SubLSymbol $inference_answer_sources_visited_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 8975L)
    private static SubLSymbol $cde_document_pattern$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 10038L)
    private static SubLSymbol $source_icon_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11991L)
    private static SubLSymbol $icon_relative_path_for_source_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 16200L)
    public static SubLSymbol $tkb_image_root_placeholder$;
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 17145L)
    private static SubLSymbol $source_unknown_publisher$;
    private static final SubLSymbol $sym0$POSSIBLE_SOURCE_ATTRIBUTION_ASSERTION_;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$INFERENCE_ANSWER_SOURCES_FROM_SIGNATURE;
    private static final SubLSymbol $sym3$INFERENCE_ANSWER_SOURCES;
    private static final SubLSymbol $kw4$SKSI;
    private static final SubLObject $const5$supportsInMtMayHaveGraphInformati;
    private static final SubLObject $const6$BaseKB;
    private static final SubLSymbol $sym7$_GRAPH;
    private static final SubLObject $const8$ist_Graph;
    private static final SubLSymbol $sym9$MT_SOURCES;
    private static final SubLSymbol $sym10$_SOURCE;
    private static final SubLObject $const11$mtSource;
    private static final SubLList $list12;
    private static final SubLObject $const13$InferencePSC;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$ASSERTION_SOURCES_VIA_INFERENCE;
    private static final SubLObject $const16$sourceOfAssertion_NonTrivial;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$STRINGP;
    private static final SubLSymbol $sym19$CDE_DOCUMENT_P;
    private static final SubLObject $const20$StringInDocumentFn;
    private static final SubLSymbol $sym21$ICON_PATH_FOR_SOURCE;
    private static final SubLString $str22$_;
    private static final SubLString $str23$Can_t_find_icon_image_file__S_for;
    private static final SubLSymbol $sym24$ADD_TINY_ICON;
    private static final SubLSymbol $sym25$REMOVE_TINY_ICON;
    private static final SubLSymbol $sym26$ICON_RELATIVE_PATH_FOR_SOURCE;
    private static final SubLSymbol $sym27$_ICON_RELATIVE_PATH_FOR_SOURCE_CACHING_STATE_;
    private static final SubLInteger $int28$500;
    private static final SubLObject $const29$issuerOfCW;
    private static final SubLObject $const30$tinyIconTermImagePathname;
    private static final SubLObject $const31$subWorks;
    private static final SubLObject $const32$editionOfPeriodicalByDate;
    private static final SubLObject $const33$publisher;
    private static final SubLString $str34$defaultTinyIconTermImagePathnameF;
    private static final SubLSymbol $kw35$GAF;
    private static final SubLSymbol $sym36$RELEVANT_MT_IS_GENL_MT;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$CLET;
    private static final SubLSymbol $sym39$_TKB_IMAGE_ROOT_PLACEHOLDER_;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$GET_TKB_IMAGE_ROOT;
    private static final SubLObject $const42$salientTermsImageRoot;
    private static final SubLSymbol $sym43$SOURCE_ICON_PATHS_FOR_ANSWER;
    private static final SubLString $str44$_unknown_provenance_;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLString $str48$_;
    private static final SubLString $str49$_of_unknown_provenance_;
    private static final SubLSymbol $sym50$SOURCE_CITATION_STRING;
    private static final SubLSymbol $kw51$ANY;
    private static final SubLObject $const52$HypertextMarkupLanguage;
    private static final SubLSymbol $sym53$_X;
    private static final SubLSymbol $sym54$_Y;
    private static final SubLSymbol $sym55$_CITATION;
    private static final SubLObject $const56$citationStringForStyleAndRenderin;
    private static final SubLSymbol $kw57$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw58$MAX_TIME;
    private static final SubLSymbol $kw59$MAX_NUMBER;
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 847L)
    public static SubLObject assertion_sourcedP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(assertion_sources_int(assertion, (SubLObject)sources.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 1024L)
    public static SubLObject assertion_sources(final SubLObject assertion) {
        return assertion_sources_int(assertion, (SubLObject)sources.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 1117L)
    public static SubLObject assertion_sources_int(final SubLObject assertion, final SubLObject booleanP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = hlmt_sources(hlmt.assertion_hlmt(assertion));
        SubLObject strengthenedP = (SubLObject)sources.NIL;
        if ((sources.NIL == v_sources || sources.NIL == booleanP) && sources.NIL != Sequences.find_if((SubLObject)sources.$sym0$POSSIBLE_SOURCE_ATTRIBUTION_ASSERTION_, assertion_utilities.all_meta_assertions(assertion), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject v_sources_$1 = assertion_sources_via_inference(assertion);
            final SubLObject strengthenedP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_sources = v_sources_$1;
            strengthenedP = strengthenedP_$2;
        }
        return Values.values(v_sources, strengthenedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 3614L)
    public static SubLObject possible_source_attribution_assertionP(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sources.NIL != assertions_high.gaf_assertionP(assertion) && sources.NIL == Sequences.find(assertions_high.gaf_arg0(assertion), sources.$non_assertion_source_citation_preds$.getGlobalValue(), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 3804L)
    public static SubLObject hlmt_sources(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return mt_sources(monad_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 3920L)
    public static SubLObject inference_answer_sources_from_signature(final SubLObject answer_signature) {
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(answer_signature);
        return inference_answer_sources(inference_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 4438L)
    public static SubLObject inference_answer_sources_internal(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = (SubLObject)sources.NIL;
        final SubLObject _prev_bind_0 = sources.$inference_answer_sources_visited_assertions$.currentBinding(thread);
        try {
            sources.$inference_answer_sources_visited_assertions$.bind((SubLObject)sources.NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                    SubLObject justification = (SubLObject)sources.NIL;
                    justification = cdolist_list_var.first();
                    while (sources.NIL != cdolist_list_var) {
                        v_sources = ConsesLow.append(v_sources, inference_answer_justification_sources_int(justification));
                        cdolist_list_var = cdolist_list_var.rest();
                        justification = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sources.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            sources.$inference_answer_sources_visited_assertions$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 4438L)
    public static SubLObject inference_answer_sources(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sources.NIL;
        if (sources.NIL == v_memoization_state) {
            return inference_answer_sources_internal(v_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sources.$sym3$INFERENCE_ANSWER_SOURCES, (SubLObject)sources.UNPROVIDED);
        if (sources.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sources.$sym3$INFERENCE_ANSWER_SOURCES, (SubLObject)sources.ONE_INTEGER, (SubLObject)sources.NIL, (SubLObject)sources.EQ, (SubLObject)sources.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sources.$sym3$INFERENCE_ANSWER_SOURCES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_answer, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_answer_sources_internal(v_answer)));
            memoization_state.caching_state_put(caching_state, v_answer, results, (SubLObject)sources.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 4868L)
    public static SubLObject inference_answer_justification_sources_int(final SubLObject justification) {
        SubLObject v_sources = (SubLObject)sources.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_supports(justification);
        SubLObject support = (SubLObject)sources.NIL;
        support = cdolist_list_var.first();
        while (sources.NIL != cdolist_list_var) {
            v_sources = ConsesLow.append(v_sources, support_sources_recursive_int(support));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 5179L)
    public static SubLObject support_sources_recursive_int(final SubLObject support) {
        SubLObject v_sources = (SubLObject)sources.NIL;
        if (sources.NIL != arguments.hl_support_with_module_p(support, (SubLObject)sources.$kw4$SKSI)) {
            v_sources = sksi_support_sources(support);
        }
        else {
            SubLObject cdolist_list_var = hl_supports.hl_justify_expanded(support);
            SubLObject assertion = (SubLObject)sources.NIL;
            assertion = cdolist_list_var.first();
            while (sources.NIL != cdolist_list_var) {
                if (sources.NIL != assertion_handles.assertion_p(assertion)) {
                    v_sources = ConsesLow.append(v_sources, assertion_sources_recursive_int(assertion));
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return list_utilities.fast_delete_duplicates(v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 5585L)
    public static SubLObject sksi_support_sources(final SubLObject support) {
        final SubLObject mt = arguments.hl_support_mt(support);
        SubLObject v_sources;
        final SubLObject mt_sources = v_sources = hlmt_sources(mt);
        if (sources.NIL != backward.removal_ask((SubLObject)ConsesLow.list(sources.$const5$supportsInMtMayHaveGraphInformati, mt), sources.$const6$BaseKB, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED)) {
            final SubLObject sentence = arguments.support_sentence(support);
            final SubLObject graph_sources = ask_utilities.query_variable((SubLObject)sources.$sym7$_GRAPH, (SubLObject)ConsesLow.list(sources.$const8$ist_Graph, (SubLObject)sources.$sym7$_GRAPH, sentence), mt, (SubLObject)sources.UNPROVIDED);
            v_sources = ConsesLow.append(graph_sources, v_sources);
        }
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 6013L)
    public static SubLObject assertion_sources_recursive_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sources.NIL != subl_promotions.memberP(assertion, sources.$inference_answer_sources_visited_assertions$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sources.EQ), (SubLObject)sources.UNPROVIDED)) {
            return (SubLObject)sources.NIL;
        }
        sources.$inference_answer_sources_visited_assertions$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, sources.$inference_answer_sources_visited_assertions$.getDynamicValue(thread)), thread);
        SubLObject v_sources = assertion_sources(assertion);
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = (SubLObject)sources.NIL;
        argument = cdolist_list_var.first();
        while (sources.NIL != cdolist_list_var) {
            if (sources.NIL != deduction_handles.deduction_p(argument)) {
                v_sources = ConsesLow.append(v_sources, deduction_sources_recursive_int(argument));
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 6869L)
    public static SubLObject deduction_sources_recursive_int(final SubLObject deduction) {
        SubLObject v_sources = (SubLObject)sources.NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = (SubLObject)sources.NIL;
        support = cdolist_list_var.first();
        while (sources.NIL != cdolist_list_var) {
            v_sources = ConsesLow.append(v_sources, support_sources_recursive_int(support));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 7133L)
    public static SubLObject assertion_corroborating_sources(final SubLObject assertion, final SubLObject query_mt) {
        final SubLObject v_hlmt = hlmt.assertion_hlmt(assertion);
        SubLObject v_sources = (SubLObject)sources.NIL;
        SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(uncanonicalizer.assertion_el_formula(assertion), query_mt);
        SubLObject other_assertion = (SubLObject)sources.NIL;
        other_assertion = cdolist_list_var.first();
        while (sources.NIL != cdolist_list_var) {
            if (!other_assertion.eql(assertion) && sources.NIL != hlmt.hlmt_times_equal_p(v_hlmt, hlmt.assertion_hlmt(other_assertion))) {
                SubLObject cdolist_list_var_$5 = assertion_sources(other_assertion);
                SubLObject other_source = (SubLObject)sources.NIL;
                other_source = cdolist_list_var_$5.first();
                while (sources.NIL != cdolist_list_var_$5) {
                    final SubLObject item_var = other_source;
                    if (sources.NIL == conses_high.member(item_var, v_sources, Symbols.symbol_function((SubLObject)sources.EQUAL), Symbols.symbol_function((SubLObject)sources.IDENTITY))) {
                        v_sources = (SubLObject)ConsesLow.cons(item_var, v_sources);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    other_source = cdolist_list_var_$5.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_assertion = cdolist_list_var.first();
        }
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 7650L)
    public static SubLObject mt_sources_internal(final SubLObject monad_mt) {
        SubLObject v_sources = (SubLObject)sources.NIL;
        if (sources.NIL != kb_indexing_datastructures.indexed_term_p(monad_mt)) {
            v_sources = ask_utilities.query_variable((SubLObject)sources.$sym10$_SOURCE, (SubLObject)ConsesLow.listS(sources.$const11$mtSource, monad_mt, (SubLObject)sources.$list12), sources.$const13$InferencePSC, (SubLObject)sources.$list14);
        }
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 7650L)
    public static SubLObject mt_sources(final SubLObject monad_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sources.NIL;
        if (sources.NIL == v_memoization_state) {
            return mt_sources_internal(monad_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sources.$sym9$MT_SOURCES, (SubLObject)sources.UNPROVIDED);
        if (sources.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sources.$sym9$MT_SOURCES, (SubLObject)sources.ONE_INTEGER, (SubLObject)sources.NIL, (SubLObject)sources.EQUAL, (SubLObject)sources.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sources.$sym9$MT_SOURCES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, monad_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(mt_sources_internal(monad_mt)));
            memoization_state.caching_state_put(caching_state, monad_mt, results, (SubLObject)sources.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 7983L)
    public static SubLObject assertion_sources_via_inference_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_sources = ask_utilities.query_variable((SubLObject)sources.$sym10$_SOURCE, (SubLObject)ConsesLow.list(sources.$const16$sourceOfAssertion_NonTrivial, (SubLObject)sources.$sym10$_SOURCE, assertion), sources.$const13$InferencePSC, (SubLObject)sources.$list17);
        thread.resetMultipleValues();
        final SubLObject v_sources = possibly_combine_assertion_sources(assertion, all_sources);
        final SubLObject strengthenedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(v_sources, strengthenedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 7983L)
    public static SubLObject assertion_sources_via_inference(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sources.NIL;
        if (sources.NIL == v_memoization_state) {
            return assertion_sources_via_inference_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sources.$sym15$ASSERTION_SOURCES_VIA_INFERENCE, (SubLObject)sources.UNPROVIDED);
        if (sources.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sources.$sym15$ASSERTION_SOURCES_VIA_INFERENCE, (SubLObject)sources.ONE_INTEGER, (SubLObject)sources.NIL, (SubLObject)sources.EQ, (SubLObject)sources.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sources.$sym15$ASSERTION_SOURCES_VIA_INFERENCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(assertion_sources_via_inference_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)sources.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 8426L)
    public static SubLObject possibly_combine_assertion_sources(final SubLObject assertion, final SubLObject all_sources) {
        SubLObject strengthenedP = (SubLObject)sources.NIL;
        SubLObject v_sources = (SubLObject)sources.NIL;
        if (sources.NIL != list_utilities.doubletonP(all_sources) && sources.NIL != Sequences.find_if((SubLObject)sources.$sym18$STRINGP, all_sources, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED) && sources.NIL != Sequences.find_if((SubLObject)sources.$sym19$CDE_DOCUMENT_P, all_sources, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED)) {
            final SubLObject combined = source_from_cde_document_and_string(all_sources);
            if (sources.NIL != combined) {
                v_sources = (SubLObject)ConsesLow.cons(combined, v_sources);
                strengthenedP = (SubLObject)sources.T;
            }
        }
        if (sources.NIL == v_sources) {
            v_sources = all_sources;
        }
        return Values.values(v_sources, strengthenedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 9036L)
    public static SubLObject cde_document_pattern() {
        if (sources.NIL != misc_utilities.uninitialized_p(sources.$cde_document_pattern$.getGlobalValue())) {}
        if (sources.NIL != misc_utilities.uninitialized_p(sources.$cde_document_pattern$.getGlobalValue())) {
            sources.$cde_document_pattern$.setGlobalValue((SubLObject)sources.NIL);
        }
        return sources.$cde_document_pattern$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 9374L)
    public static SubLObject cde_document_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sources.NIL != el_utilities.el_formula_p(v_object) && sources.NIL != formula_pattern_match.formula_matches_pattern(v_object, cde_document_pattern()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 9515L)
    public static SubLObject source_from_cde_document_and_string(final SubLObject v_sources) {
        SubLObject v_document = (SubLObject)sources.NIL;
        SubLObject string = (SubLObject)sources.NIL;
        SubLObject found_everythingP = (SubLObject)sources.NIL;
        if (sources.NIL == constant_handles.valid_constantP(sources.$const20$StringInDocumentFn, (SubLObject)sources.UNPROVIDED)) {
            return (SubLObject)sources.NIL;
        }
        if (sources.NIL == found_everythingP) {
            SubLObject csome_list_var = v_sources;
            SubLObject source = (SubLObject)sources.NIL;
            source = csome_list_var.first();
            while (sources.NIL == found_everythingP && sources.NIL != csome_list_var) {
                if (sources.NIL != cde_document_p(source)) {
                    v_document = source;
                }
                else if (source.isString()) {
                    string = source;
                }
                if (sources.NIL != v_document && sources.NIL != string) {
                    found_everythingP = (SubLObject)sources.T;
                }
                csome_list_var = csome_list_var.rest();
                source = csome_list_var.first();
            }
        }
        if (sources.NIL != found_everythingP) {
            return el_utilities.make_binary_formula(sources.$const20$StringInDocumentFn, v_document, string);
        }
        return (SubLObject)sources.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 10138L)
    public static SubLObject source_icon_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (sources.NIL != sources.$source_icon_domain_mt$.getDynamicValue(thread)) ? sources.$source_icon_domain_mt$.getDynamicValue(thread) : sources.$const13$InferencePSC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 10239L)
    public static SubLObject icon_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject path = icon_relative_path_for_source(source, mt);
        SubLObject provenance = thread.secondMultipleValue();
        SubLObject source_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (path.isString()) {
            final SubLObject root = get_tkb_image_root();
            path = (SubLObject)(root.isString() ? Sequences.cconcatenate(root, path) : sources.NIL);
            if (sources.NIL != string_utilities.starts_with(path, http_kernel.http_server_base_url((SubLObject)sources.UNPROVIDED))) {
                final SubLObject htdocs_path = Sequences.cconcatenate((SubLObject)sources.$str22$_, string_utilities.pre_remove(path, http_kernel.http_server_base_url((SubLObject)sources.UNPROVIDED), (SubLObject)sources.UNPROVIDED));
                if (sources.NIL == file_utilities.file_existsP(file_utilities.relative_filename(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), htdocs_path, (SubLObject)sources.UNPROVIDED))) {
                    Errors.warn((SubLObject)sources.$str23$Can_t_find_icon_image_file__S_for, htdocs_path, source);
                    path = (SubLObject)sources.NIL;
                    provenance = (SubLObject)sources.NIL;
                    source_type = (SubLObject)sources.NIL;
                }
            }
        }
        return Values.values(path, provenance, source_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11708L)
    public static SubLObject add_tiny_icon(final SubLObject argument, final SubLObject assertion) {
        clear_icon_relative_path_for_source();
        return (SubLObject)sources.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11848L)
    public static SubLObject remove_tiny_icon(final SubLObject argument, final SubLObject assertion) {
        clear_icon_relative_path_for_source();
        return (SubLObject)sources.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11991L)
    public static SubLObject clear_icon_relative_path_for_source() {
        final SubLObject cs = sources.$icon_relative_path_for_source_caching_state$.getGlobalValue();
        if (sources.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sources.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11991L)
    public static SubLObject remove_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args(sources.$icon_relative_path_for_source_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(source, mt), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11991L)
    public static SubLObject icon_relative_path_for_source_internal(SubLObject source, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject path = non_default_icon_relative_path_for_source(source, mt);
        final SubLObject provenance = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject source_type = (SubLObject)sources.NIL;
        if (!path.isString()) {
            thread.resetMultipleValues();
            final SubLObject path_$6 = default_icon_relative_path_for_source(source, mt);
            final SubLObject source_type_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            path = path_$6;
            source_type = source_type_$7;
        }
        return Values.values(path, provenance, source_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 11991L)
    public static SubLObject icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        SubLObject caching_state = sources.$icon_relative_path_for_source_caching_state$.getGlobalValue();
        if (sources.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sources.$sym26$ICON_RELATIVE_PATH_FOR_SOURCE, (SubLObject)sources.$sym27$_ICON_RELATIVE_PATH_FOR_SOURCE_CACHING_STATE_, (SubLObject)sources.NIL, (SubLObject)sources.EQUAL, (SubLObject)sources.TWO_INTEGER, (SubLObject)sources.$int28$500);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(source, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sources.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sources.NIL;
            collision = cdolist_list_var.first();
            while (sources.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (source.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sources.NIL != cached_args && sources.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(icon_relative_path_for_source_internal(source, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(source, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 12497L)
    public static SubLObject non_default_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = (SubLObject)sources.NIL;
        SubLObject provenance = (SubLObject)sources.NIL;
        if (sources.NIL != kb_indexing_datastructures.indexed_term_p(source)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject issuers = kb_mapping_utilities.pred_values(source, sources.$const29$issuerOfCW, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                SubLObject rest;
                SubLObject issuer;
                for (rest = (SubLObject)sources.NIL, rest = issuers; sources.NIL == path && sources.NIL != rest; rest = rest.rest()) {
                    issuer = (provenance = rest.first());
                    if (sources.NIL != kb_indexing_datastructures.indexed_term_p(issuer)) {
                        path = kb_mapping_utilities.fpred_value(issuer, sources.$const30$tinyIconTermImagePathname, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                    }
                }
                if (sources.NIL == path) {
                    final SubLObject superworks = kb_mapping_utilities.pred_values(source, sources.$const31$subWorks, (SubLObject)sources.TWO_INTEGER, (SubLObject)sources.ONE_INTEGER, (SubLObject)sources.UNPROVIDED);
                    SubLObject superwork;
                    for (rest = (SubLObject)sources.NIL, rest = superworks; sources.NIL == path && sources.NIL != rest; rest = rest.rest()) {
                        superwork = (provenance = rest.first());
                        if (sources.NIL != kb_indexing_datastructures.indexed_term_p(superwork)) {
                            path = kb_mapping_utilities.fpred_value(superwork, sources.$const30$tinyIconTermImagePathname, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                        }
                    }
                    if (sources.NIL == path) {
                        SubLObject periodicals;
                        SubLObject rest_$8;
                        SubLObject periodical;
                        for (rest = (SubLObject)sources.NIL, rest = superworks; sources.NIL == path && sources.NIL != rest; rest = rest.rest()) {
                            superwork = rest.first();
                            if (sources.NIL != kb_indexing_datastructures.indexed_term_p(superwork)) {
                                periodicals = kb_mapping_utilities.pred_values(superwork, sources.$const32$editionOfPeriodicalByDate, (SubLObject)sources.THREE_INTEGER, (SubLObject)sources.ONE_INTEGER, (SubLObject)sources.UNPROVIDED);
                                for (rest_$8 = (SubLObject)sources.NIL, rest_$8 = periodicals; sources.NIL == path && sources.NIL != rest_$8; rest_$8 = rest_$8.rest()) {
                                    periodical = (provenance = rest_$8.first());
                                    if (sources.NIL != kb_indexing_datastructures.indexed_term_p(periodical)) {
                                        path = kb_mapping_utilities.fpred_value(periodical, sources.$const30$tinyIconTermImagePathname, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                if (sources.NIL == path) {
                    final SubLObject publishers = kb_mapping_utilities.pred_values(source, sources.$const33$publisher, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                    SubLObject publisher;
                    for (rest = (SubLObject)sources.NIL, rest = publishers; sources.NIL == path && sources.NIL != rest; rest = rest.rest()) {
                        publisher = (provenance = rest.first());
                        if (sources.NIL != kb_indexing_datastructures.indexed_term_p(publisher)) {
                            path = kb_mapping_utilities.fpred_value(publisher, sources.$const30$tinyIconTermImagePathname, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(path, provenance);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 14350L)
    public static SubLObject default_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_icon_path_predicate = constants_high.find_constant((SubLObject)sources.$str34$defaultTinyIconTermImagePathnameF);
        if (sources.NIL == default_icon_path_predicate) {
            return Values.values((SubLObject)sources.NIL, (SubLObject)sources.NIL);
        }
        SubLObject path = (SubLObject)sources.NIL;
        SubLObject type = (SubLObject)sources.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = default_icon_path_predicate;
            if (sources.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)sources.NIL;
                final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sources.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sources.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sources.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sources.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sources.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sources.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)sources.NIL;
                    final SubLObject token_var = (SubLObject)sources.NIL;
                    while (sources.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sources.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)sources.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sources.$kw35$GAF, (SubLObject)sources.NIL, (SubLObject)sources.NIL);
                                SubLObject done_var_$12 = (SubLObject)sources.NIL;
                                final SubLObject token_var_$13 = (SubLObject)sources.NIL;
                                while (sources.NIL == done_var_$12) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$13.eql(gaf));
                                    if (sources.NIL != valid_$14) {
                                        final SubLObject this_type = assertions_high.gaf_arg1(gaf);
                                        if (sources.NIL != isa.isaP(source, this_type, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED) && (sources.NIL == type || sources.NIL != more_specific_typeP(this_type, type, (SubLObject)sources.UNPROVIDED))) {
                                            type = this_type;
                                            path = assertions_high.gaf_arg2(gaf);
                                        }
                                    }
                                    done_var_$12 = (SubLObject)SubLObjectFactory.makeBoolean(sources.NIL == valid_$14);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sources.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (sources.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sources.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$11, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (!path.isString()) {
            return Values.values((SubLObject)sources.NIL, (SubLObject)sources.NIL);
        }
        final SubLObject min_type = really_min_isa_among_specs_of(source, type, mt);
        return Values.values(path, min_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 15485L)
    public static SubLObject more_specific_typeP(final SubLObject spec_type, final SubLObject genl_type, SubLObject mt) {
        if (mt == sources.UNPROVIDED) {
            mt = (SubLObject)sources.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sources.NIL != genls.genlP(spec_type, genl_type, mt, (SubLObject)sources.UNPROVIDED) || (sources.NIL == genls.genlP(genl_type, spec_type, mt, (SubLObject)sources.UNPROVIDED) && sources.NIL != cardinality_estimates.generality_estimateG(genl_type, spec_type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 15849L)
    public static SubLObject really_min_isa_among_specs_of(final SubLObject ins, final SubLObject coll, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sources.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sources.$sym36$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject min_isas = isa.min_isa(ins, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            final SubLObject specs_among_min_isas = genls.all_specs_among(coll, min_isas, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            result = genls.min_col(specs_among_min_isas, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 16514L)
    public static SubLObject with_tkb_image_root_placeholder(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject placeholder = (SubLObject)sources.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sources.$list37);
        placeholder = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sources.$sym38$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sources.$sym39$_TKB_IMAGE_ROOT_PLACEHOLDER_, placeholder)), (SubLObject)sources.$list40, ConsesLow.append(body, (SubLObject)sources.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 16729L)
    public static SubLObject get_tkb_image_root() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (sources.NIL != sources.$tkb_image_root_placeholder$.getDynamicValue(thread)) ? sources.$tkb_image_root_placeholder$.getDynamicValue(thread) : get_tkb_image_root_no_placeholder();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 16854L)
    public static SubLObject get_tkb_image_root_no_placeholder() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)sources.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sources.$sym36$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(source_icon_domain_mt(), thread);
            results = kb_mapping_utilities.pred_refs(sources.$const42$salientTermsImageRoot, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (sources.NIL != list_utilities.empty_list_p(results)) {
            return (SubLObject)sources.NIL;
        }
        final SubLObject result = results.first();
        return http_kernel.get_absolute_url(result, (SubLObject)sources.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 17145L)
    public static SubLObject source_icon_paths_for_answer(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id) {
        return source_icon_paths_for_inference_answer(inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, inference_answer_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 17145L)
    public static SubLObject source_icon_paths_for_inference_answer(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = (SubLObject)((sources.NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) ? inference_datastructures_inference.inference_answer_inference(inference_answer) : sources.NIL);
        final SubLObject inference_mt = (SubLObject)((sources.NIL != inference_datastructures_inference.inference_p(inference)) ? pph_proof.pph_get_inference_mt(inference) : sources.NIL);
        SubLObject icon_paths_with_media_orgs = (SubLObject)sources.NIL;
        SubLObject icon_paths_with_tooltip_renderings = (SubLObject)sources.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var;
                final SubLObject v_sources = cdolist_list_var = inference_answer_sources(inference_answer);
                SubLObject source = (SubLObject)sources.NIL;
                source = cdolist_list_var.first();
                while (sources.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject icon_path = icon_path_for_source(source, inference_mt);
                    final SubLObject media_org = thread.secondMultipleValue();
                    final SubLObject source_type = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (sources.NIL != icon_path) {
                        icon_paths_with_media_orgs = list_utilities.alist_pushnew(icon_paths_with_media_orgs, icon_path, (SubLObject)ConsesLow.list(media_org, source, source_type), Symbols.symbol_function((SubLObject)sources.EQUAL), Symbols.symbol_function((SubLObject)sources.EQUAL));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    source = cdolist_list_var.first();
                }
                SubLObject cdolist_list_var2 = icon_paths_with_media_orgs;
                SubLObject cons = (SubLObject)sources.NIL;
                cons = cdolist_list_var2.first();
                while (sources.NIL != cdolist_list_var2) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject icon_path2 = (SubLObject)sources.NIL;
                    SubLObject source_data = (SubLObject)sources.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sources.$list45);
                    icon_path2 = current.first();
                    current = (source_data = current.rest());
                    SubLObject tooltip_renderings = (SubLObject)sources.NIL;
                    SubLObject cdolist_list_var_$16 = source_data;
                    SubLObject source_datum = (SubLObject)sources.NIL;
                    source_datum = cdolist_list_var_$16.first();
                    while (sources.NIL != cdolist_list_var_$16) {
                        SubLObject current_$18;
                        final SubLObject datum_$17 = current_$18 = source_datum;
                        SubLObject media_org2 = (SubLObject)sources.NIL;
                        SubLObject source2 = (SubLObject)sources.NIL;
                        SubLObject source_type2 = (SubLObject)sources.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)sources.$list46);
                        media_org2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)sources.$list46);
                        source2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)sources.$list46);
                        source_type2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        if (sources.NIL == current_$18) {
                            final SubLObject tooltip_rendering = tooltip_rendering_for_source(source2, media_org2, source_type2);
                            tooltip_renderings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(tooltip_rendering, source2), tooltip_renderings);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)sources.$list46);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        source_datum = cdolist_list_var_$16.first();
                    }
                    icon_paths_with_tooltip_renderings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(icon_path2, tooltip_renderings), icon_paths_with_tooltip_renderings);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    cons = cdolist_list_var2.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sources.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return icon_paths_with_tooltip_renderings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 17145L)
    public static SubLObject tooltip_rendering_for_source(SubLObject source, final SubLObject media_org, final SubLObject source_type) {
        SubLObject paraphrase = (SubLObject)sources.NIL;
        SubLObject v_term = source;
        if (sources.NIL != media_org) {
            paraphrase = pph_main.generate_phrase_for_java(media_org, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            v_term = media_org;
        }
        if (sources.NIL == paraphrase) {
            paraphrase = pph_main.generate_phrase_for_java(source, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            v_term = source;
        }
        if (sources.NIL == paraphrase && sources.NIL != cycl_grammar.cycl_denotational_term_p(source_type)) {
            final SubLObject source_type_pph = pph_main.generate_phrase(source_type, (SubLObject)sources.$list47, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            if (source_type_pph.isString()) {
                paraphrase = pph_main.generate_phrase_for_java(Sequences.cconcatenate((SubLObject)sources.$str48$_, new SubLObject[] { format_nil.format_nil_a_no_copy(source_type_pph), sources.$str49$_of_unknown_provenance_ }), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
                v_term = source_type;
            }
        }
        if (sources.NIL == paraphrase) {
            paraphrase = pph_main.generate_phrase_for_java(sources.$source_unknown_publisher$.getGlobalValue(), (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED, (SubLObject)sources.UNPROVIDED);
            v_term = (SubLObject)sources.NIL;
        }
        return (SubLObject)ConsesLow.list(paraphrase, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sources.lisp", position = 19931L)
    public static SubLObject source_citation_string(SubLObject source, SubLObject style, SubLObject markup_language) {
        if (style == sources.UNPROVIDED) {
            style = (SubLObject)sources.$kw51$ANY;
        }
        if (markup_language == sources.UNPROVIDED) {
            markup_language = sources.$const52$HypertextMarkupLanguage;
        }
        if (sources.$kw51$ANY == style) {
            style = (SubLObject)sources.$sym53$_X;
        }
        if (sources.$kw51$ANY == markup_language) {
            markup_language = (SubLObject)sources.$sym54$_Y;
        }
        final SubLObject citation_var = (SubLObject)sources.$sym55$_CITATION;
        final SubLObject citations = ask_utilities.query_variable(citation_var, el_utilities.make_quaternary_formula(sources.$const56$citationStringForStyleAndRenderin, source, style, markup_language, citation_var), sources.$const13$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)sources.$kw57$MAX_TRANSFORMATION_DEPTH, (SubLObject)sources.ZERO_INTEGER, (SubLObject)sources.$kw58$MAX_TIME, (SubLObject)sources.FIVE_INTEGER, (SubLObject)sources.$kw59$MAX_NUMBER, (SubLObject)sources.ONE_INTEGER));
        return (SubLObject)((sources.NIL != list_utilities.non_empty_list_p(citations)) ? citations.first() : sources.NIL);
    }
    
    public static SubLObject declare_sources_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sourcedP", "ASSERTION-SOURCED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sources", "ASSERTION-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sources_int", "ASSERTION-SOURCES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "possible_source_attribution_assertionP", "POSSIBLE-SOURCE-ATTRIBUTION-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "hlmt_sources", "HLMT-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "inference_answer_sources_from_signature", "INFERENCE-ANSWER-SOURCES-FROM-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "inference_answer_sources_internal", "INFERENCE-ANSWER-SOURCES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "inference_answer_sources", "INFERENCE-ANSWER-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "inference_answer_justification_sources_int", "INFERENCE-ANSWER-JUSTIFICATION-SOURCES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "support_sources_recursive_int", "SUPPORT-SOURCES-RECURSIVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "sksi_support_sources", "SKSI-SUPPORT-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sources_recursive_int", "ASSERTION-SOURCES-RECURSIVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "deduction_sources_recursive_int", "DEDUCTION-SOURCES-RECURSIVE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_corroborating_sources", "ASSERTION-CORROBORATING-SOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "mt_sources_internal", "MT-SOURCES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "mt_sources", "MT-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sources_via_inference_internal", "ASSERTION-SOURCES-VIA-INFERENCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "assertion_sources_via_inference", "ASSERTION-SOURCES-VIA-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "possibly_combine_assertion_sources", "POSSIBLY-COMBINE-ASSERTION-SOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "cde_document_pattern", "CDE-DOCUMENT-PATTERN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "cde_document_p", "CDE-DOCUMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "source_from_cde_document_and_string", "SOURCE-FROM-CDE-DOCUMENT-AND-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "source_icon_domain_mt", "SOURCE-ICON-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "icon_path_for_source", "ICON-PATH-FOR-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "add_tiny_icon", "ADD-TINY-ICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "remove_tiny_icon", "REMOVE-TINY-ICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "clear_icon_relative_path_for_source", "CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "remove_icon_relative_path_for_source", "REMOVE-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "icon_relative_path_for_source_internal", "ICON-RELATIVE-PATH-FOR-SOURCE-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "icon_relative_path_for_source", "ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "non_default_icon_relative_path_for_source", "NON-DEFAULT-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "default_icon_relative_path_for_source", "DEFAULT-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "more_specific_typeP", "MORE-SPECIFIC-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "really_min_isa_among_specs_of", "REALLY-MIN-ISA-AMONG-SPECS-OF", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sources", "with_tkb_image_root_placeholder", "WITH-TKB-IMAGE-ROOT-PLACEHOLDER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "get_tkb_image_root", "GET-TKB-IMAGE-ROOT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "get_tkb_image_root_no_placeholder", "GET-TKB-IMAGE-ROOT-NO-PLACEHOLDER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "source_icon_paths_for_answer", "SOURCE-ICON-PATHS-FOR-ANSWER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "source_icon_paths_for_inference_answer", "SOURCE-ICON-PATHS-FOR-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "tooltip_rendering_for_source", "TOOLTIP-RENDERING-FOR-SOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sources", "source_citation_string", "SOURCE-CITATION-STRING", 1, 2, false);
        return (SubLObject)sources.NIL;
    }
    
    public static SubLObject init_sources_file() {
        sources.$non_assertion_source_citation_preds$ = SubLFiles.deflexical("*NON-ASSERTION-SOURCE-CITATION-PREDS*", (SubLObject)sources.$list1);
        sources.$inference_answer_sources_visited_assertions$ = SubLFiles.defparameter("*INFERENCE-ANSWER-SOURCES-VISITED-ASSERTIONS*", (SubLObject)sources.NIL);
        sources.$cde_document_pattern$ = SubLFiles.deflexical("*CDE-DOCUMENT-PATTERN*", misc_utilities.uninitialized());
        sources.$source_icon_domain_mt$ = SubLFiles.defparameter("*SOURCE-ICON-DOMAIN-MT*", (SubLObject)sources.NIL);
        sources.$icon_relative_path_for_source_caching_state$ = SubLFiles.deflexical("*ICON-RELATIVE-PATH-FOR-SOURCE-CACHING-STATE*", (SubLObject)sources.NIL);
        sources.$tkb_image_root_placeholder$ = SubLFiles.defparameter("*TKB-IMAGE-ROOT-PLACEHOLDER*", (SubLObject)sources.NIL);
        sources.$source_unknown_publisher$ = SubLFiles.defconstant("*SOURCE-UNKNOWN-PUBLISHER*", (SubLObject)sources.$str44$_unknown_provenance_);
        return (SubLObject)sources.NIL;
    }
    
    public static SubLObject setup_sources_file() {
        access_macros.register_external_symbol((SubLObject)sources.$sym2$INFERENCE_ANSWER_SOURCES_FROM_SIGNATURE);
        memoization_state.note_memoized_function((SubLObject)sources.$sym3$INFERENCE_ANSWER_SOURCES);
        memoization_state.note_memoized_function((SubLObject)sources.$sym9$MT_SOURCES);
        memoization_state.note_memoized_function((SubLObject)sources.$sym15$ASSERTION_SOURCES_VIA_INFERENCE);
        access_macros.register_external_symbol((SubLObject)sources.$sym21$ICON_PATH_FOR_SOURCE);
        utilities_macros.register_kb_function((SubLObject)sources.$sym24$ADD_TINY_ICON);
        utilities_macros.register_kb_function((SubLObject)sources.$sym25$REMOVE_TINY_ICON);
        memoization_state.note_globally_cached_function((SubLObject)sources.$sym26$ICON_RELATIVE_PATH_FOR_SOURCE);
        access_macros.register_external_symbol((SubLObject)sources.$sym41$GET_TKB_IMAGE_ROOT);
        access_macros.register_external_symbol((SubLObject)sources.$sym43$SOURCE_ICON_PATHS_FOR_ANSWER);
        access_macros.register_external_symbol((SubLObject)sources.$sym50$SOURCE_CITATION_STRING);
        return (SubLObject)sources.NIL;
    }
    
    public void declareFunctions() {
        declare_sources_file();
    }
    
    public void initializeVariables() {
        init_sources_file();
    }
    
    public void runTopLevelForms() {
        setup_sources_file();
    }
    
    static {
        me = (SubLFile)new sources();
        sources.$non_assertion_source_citation_preds$ = null;
        sources.$inference_answer_sources_visited_assertions$ = null;
        sources.$cde_document_pattern$ = null;
        sources.$source_icon_domain_mt$ = null;
        sources.$icon_relative_path_for_source_caching_state$ = null;
        sources.$tkb_image_root_placeholder$ = null;
        sources.$source_unknown_publisher$ = null;
        $sym0$POSSIBLE_SOURCE_ATTRIBUTION_ASSERTION_ = SubLObjectFactory.makeSymbol("POSSIBLE-SOURCE-ATTRIBUTION-ASSERTION?");
        $list1 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("highlyRelevantAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonAbducibleRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardReificationRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("except")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abnormal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meetsPragmaticRequirement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertPriorToInCreationTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateAssertions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("creationTemplateAllowableRules")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNoteOKForInclusionInResearchCyc")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sharedNotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definitionalDisplayAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientAssertions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleAssertions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("toBeReviewedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mixedRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correctsMixedRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionWorkflowStatus")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("workaroundAssertionForBug")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Terse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("englishGloss")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politenessOfWS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formalityOfWS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strengthOfLexicalMapping")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nlPragmaticRequirement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rhetoricalDeviceOfPhrase")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reformulationPrecondition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForNPPOutputTersification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForQuantifierUnification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForVPPProcessing-NonStateVerbs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForQueryProcessing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForQuantifierMovement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForQuantifierProcessing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForSubcollectionProcessing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("useReformulationRuleForSimplification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tkbAptimaTieAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tkbAptimaTieAssertion-Prototype2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tkbAptimaTieAssertion-Prototype")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleTrivialForJustificationParaphrase")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleConclusionsTrivial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionUsedInProcessType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraint")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("domainSpecificDefaultForwardRule")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionEvaluated")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluee-Direct")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthInOrdering")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("usedInWPDemoInferencing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("chemicalLaw")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareAssertionParameterValueInSpecification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("omitFromIKB")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programActionTypeRules")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryPracticeRules")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryPracticeGAFs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deprecatedSalientDescriptorRuleAssertion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionDirectionForProjectBuilds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlRules")) });
        $sym2$INFERENCE_ANSWER_SOURCES_FROM_SIGNATURE = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-SOURCES-FROM-SIGNATURE");
        $sym3$INFERENCE_ANSWER_SOURCES = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-SOURCES");
        $kw4$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $const5$supportsInMtMayHaveGraphInformati = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("supportsInMtMayHaveGraphInformation"));
        $const6$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym7$_GRAPH = SubLObjectFactory.makeSymbol("?GRAPH");
        $const8$ist_Graph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Graph"));
        $sym9$MT_SOURCES = SubLObjectFactory.makeSymbol("MT-SOURCES");
        $sym10$_SOURCE = SubLObjectFactory.makeSymbol("?SOURCE");
        $const11$mtSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtSource"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SOURCE"));
        $const13$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)sources.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym15$ASSERTION_SOURCES_VIA_INFERENCE = SubLObjectFactory.makeSymbol("ASSERTION-SOURCES-VIA-INFERENCE");
        $const16$sourceOfAssertion_NonTrivial = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceOfAssertion-NonTrivial"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)sources.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym18$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym19$CDE_DOCUMENT_P = SubLObjectFactory.makeSymbol("CDE-DOCUMENT-P");
        $const20$StringInDocumentFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringInDocumentFn"));
        $sym21$ICON_PATH_FOR_SOURCE = SubLObjectFactory.makeSymbol("ICON-PATH-FOR-SOURCE");
        $str22$_ = SubLObjectFactory.makeString("/");
        $str23$Can_t_find_icon_image_file__S_for = SubLObjectFactory.makeString("Can't find icon image file ~S for ~S");
        $sym24$ADD_TINY_ICON = SubLObjectFactory.makeSymbol("ADD-TINY-ICON");
        $sym25$REMOVE_TINY_ICON = SubLObjectFactory.makeSymbol("REMOVE-TINY-ICON");
        $sym26$ICON_RELATIVE_PATH_FOR_SOURCE = SubLObjectFactory.makeSymbol("ICON-RELATIVE-PATH-FOR-SOURCE");
        $sym27$_ICON_RELATIVE_PATH_FOR_SOURCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ICON-RELATIVE-PATH-FOR-SOURCE-CACHING-STATE*");
        $int28$500 = SubLObjectFactory.makeInteger(500);
        $const29$issuerOfCW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("issuerOfCW"));
        $const30$tinyIconTermImagePathname = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tinyIconTermImagePathname"));
        $const31$subWorks = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subWorks"));
        $const32$editionOfPeriodicalByDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("editionOfPeriodicalByDate"));
        $const33$publisher = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("publisher"));
        $str34$defaultTinyIconTermImagePathnameF = SubLObjectFactory.makeString("defaultTinyIconTermImagePathnameForType");
        $kw35$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym36$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLACEHOLDER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym39$_TKB_IMAGE_ROOT_PLACEHOLDER_ = SubLObjectFactory.makeSymbol("*TKB-IMAGE-ROOT-PLACEHOLDER*");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("*TKB-IMAGE-ROOT-PLACEHOLDER*"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym41$GET_TKB_IMAGE_ROOT = SubLObjectFactory.makeSymbol("GET-TKB-IMAGE-ROOT");
        $const42$salientTermsImageRoot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientTermsImageRoot"));
        $sym43$SOURCE_ICON_PATHS_FOR_ANSWER = SubLObjectFactory.makeSymbol("SOURCE-ICON-PATHS-FOR-ANSWER");
        $str44$_unknown_provenance_ = SubLObjectFactory.makeString("(unknown provenance)");
        $list45 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ICON-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-DATA"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEDIA-ORG"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-TYPE"));
        $list47 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $str48$_ = SubLObjectFactory.makeString("(");
        $str49$_of_unknown_provenance_ = SubLObjectFactory.makeString(" of unknown provenance)");
        $sym50$SOURCE_CITATION_STRING = SubLObjectFactory.makeSymbol("SOURCE-CITATION-STRING");
        $kw51$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const52$HypertextMarkupLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertextMarkupLanguage"));
        $sym53$_X = SubLObjectFactory.makeSymbol("?X");
        $sym54$_Y = SubLObjectFactory.makeSymbol("?Y");
        $sym55$_CITATION = SubLObjectFactory.makeSymbol("?CITATION");
        $const56$citationStringForStyleAndRenderin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("citationStringForStyleAndRendering"));
        $kw57$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw58$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw59$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
    }
}

/*

	Total time: 473 ms
	
*/