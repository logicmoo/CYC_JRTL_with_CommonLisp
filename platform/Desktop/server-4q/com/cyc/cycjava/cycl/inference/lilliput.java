package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lilliput extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.lilliput";
    public static final String myFingerPrint = "a609d33d8885933696020b1df3f3fb070da5e9c6a59cb4467f81c3a75386757c";
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 875L)
    public static SubLSymbol $lilliput_master_query_collection$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 980L)
    public static SubLSymbol $lilliput_default_query_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1129L)
    public static SubLSymbol $lilliput_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1197L)
    public static SubLSymbol $lilliput_corpus_generation_query_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1359L)
    private static SubLSymbol $lilliput_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1438L)
    private static SubLSymbol $lilliput_experiment_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1542L)
    private static SubLSymbol $basic_lilliput_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1943L)
    private static SubLSymbol $standard_lilliput_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 2374L)
    private static SubLSymbol $lilliput_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 3233L)
    public static SubLSymbol $lilliput_outlier_timeout$;
    private static final SubLObject $const0$AKBBuilderQuery_InferenceTest;
    private static final SubLList $list1;
    private static final SubLObject $const2$TKBSourceSpindleCollectorMt;
    private static final SubLList $list3;
    private static final SubLString $str4$_cyc_projects_inference_lilliput_;
    private static final SubLString $str5$experiments_;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLInteger $int8$60;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw12$QUERY_SPEC_SET;
    private static final SubLSymbol $kw13$FILENAME;
    private static final SubLSymbol $kw14$COMMENT;
    private static final SubLSymbol $kw15$OVERRIDING_QUERY_PROPERTIES;
    private static final SubLSymbol $kw16$METRICS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$OUTLIER_TIMEOUT;
    private static final SubLSymbol $sym19$_LILLIPUT_OUTLIER_TIMEOUT_;
    private static final SubLSymbol $kw20$INCREMENTAL;
    private static final SubLSymbol $kw21$INCLUDE_RESULTS;
    private static final SubLSymbol $kw22$RANDOMIZE;
    private static final SubLSymbol $kw23$SKIP;
    private static final SubLSymbol $kw24$COUNT;
    private static final SubLSymbol $kw25$DIRECTORY;
    private static final SubLSymbol $sym26$FILENAME_VAR;
    private static final SubLSymbol $sym27$FULL_FILENAME;
    private static final SubLSymbol $sym28$CLET;
    private static final SubLSymbol $sym29$FWHEN;
    private static final SubLSymbol $sym30$LILLIPUT_EXPERIMENT_FULL_FILENAME;
    private static final SubLSymbol $sym31$RUN_KBQ_EXPERIMENT;
    private static final SubLObject $const32$LilliputQuery_OpenGood;
    private static final SubLObject $const33$LilliputQuery_OpenNoGood;
    private static final SubLObject $const34$LilliputQuery_ClosedGood;
    private static final SubLObject $const35$LilliputQuery_ClosedNoGood;
    private static final SubLString $str36$Lilliput_Training;
    private static final SubLString $str37$_0;
    private static final SubLSymbol $sym38$BOUND_SYMBOL_P;
    private static final SubLString $str39$____Basic_analysis____;
    private static final SubLString $str40$____Answerable____;
    private static final SubLString $str41$____Unanswerable____;
    private static final SubLString $str42$____Open_Good___;
    private static final SubLString $str43$____Open_No_Good___;
    private static final SubLString $str44$____Closed_Good___;
    private static final SubLString $str45$____Closed_No_Good___;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$PLOT_TITLE;
    private static final SubLString $str48$_;
    private static final SubLString $str49$_n;
    private static final SubLSymbol $kw50$XLABEL;
    private static final SubLString $str51$Sorted_Queries;
    private static final SubLSymbol $kw52$YLABEL;
    private static final SubLList $list53;
    private static final SubLString $str54$____Answerability_analysis____;
    private static final SubLString $str55$Total_____________s__s__s__;
    private static final SubLString $str56$Open_Good_________s__s__s__;
    private static final SubLString $str57$Open_No_Good______s__s__s__;
    private static final SubLString $str58$Closed_Good_______s__s__s__;
    private static final SubLString $str59$Closed_No_Good____s__s__s__;
    private static final SubLString $str60$____Mutually_Answerable____;
    private static final SubLString $str61$____Mutually_Answerable_Open_Good;
    private static final SubLString $str62$____Mutually_Answerable_Closed_Go;
    private static final SubLString $str63$____Open_Good____;
    private static final SubLString $str64$____Open_No_Good____;
    private static final SubLString $str65$____Closed_Good____;
    private static final SubLString $str66$____Closed_No_Good____;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$BOTH;
    private static final SubLString $str70$__;
    private static final SubLString $str71$_vs__;
    private static final SubLSymbol $kw72$BASELINE_KEY_LABEL;
    private static final SubLSymbol $kw73$EXPERIMENT_KEY_LABEL;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$KBQ_MEDIAN_QUERY_RUN;
    private static final SubLString $str76$;
    private static final SubLSymbol $kw77$ORIGIN;
    private static final SubLSymbol $kw78$QUERY_RUNS;
    private static final SubLString $str79$Cannot_handle_even_numbers_of_que;
    private static final SubLSymbol $sym80$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME;
    private static final SubLSymbol $kw81$ITEM;
    private static final SubLFloat $float82$0_5;
    private static final SubLString $str83$o;
    private static final SubLString $str84$_;
    private static final SubLString $str85$_;
    private static final SubLString $str86$x;
    private static final SubLSymbol $sym87$EL_VAR_;
    private static final SubLString $str88$could_not_find_any_valid_terms_fo;
    private static final SubLString $str89$got_an_unsorted_query__s;
    private static final SubLSymbol $sym90$CYCL_ATOMIC_SENTENCE_P;
    private static final SubLString $str91$Expected_only_one_arg_constraint_;
    private static final SubLObject $const92$correspondingDomainInArg;
    private static final SubLObject $const93$CollectionSubsetFn;
    private static final SubLList $list94;
    private static final SubLString $str95$unhandled___CollectionSubsetFn_do;
    private static final SubLString $str96$unexpected_domain_type__s;
    private static final SubLSymbol $sym97$_;
    private static final SubLSymbol $sym98$_;
    private static final SubLSymbol $sym99$SECOND;
    private static final SubLString $str100$_;
    private static final SubLObject $const101$isa;
    private static final SubLObject $const102$UniversalVocabularyMt;
    private static final SubLObject $const103$TestVocabularyMt;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$_COL;
    private static final SubLObject $const107$and;
    private static final SubLObject $const108$nearestIsa;
    private static final SubLList $list109;
    private static final SubLObject $const110$genls;
    private static final SubLObject $const111$leaveArgPlaceOpenInTestQueries;
    private static final SubLObject $const112$TKBConstant;
    private static final SubLObject $const113$BookkeepingMt;
    private static final SubLSymbol $sym114$NON_TKB_FORT_;
    private static final SubLString $str115$g__;
    private static final SubLString $str116$n__;
    private static final SubLString $str117$c;
    private static final SubLSymbol $sym118$_ASS;
    private static final SubLObject $const119$assertionSentence;
    private static final SubLObject $const120$softwareParameterValueInSpecifica;
    private static final SubLObject $const121$InferenceSentenceParameter;
    private static final SubLSymbol $sym122$_QUERY;
    private static final SubLSymbol $sym123$_TYPE;
    private static final SubLList $list124;
    private static final SubLList $list125;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 1843L)
    public static SubLObject basic_lilliput_query_metrics() {
        return conses_high.copy_list(lilliput.$basic_lilliput_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 2268L)
    public static SubLObject standard_lilliput_query_metrics() {
        return conses_high.copy_list(lilliput.$standard_lilliput_query_metrics$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 2974L)
    public static SubLObject all_lilliput_query_metrics() {
        return lilliput.$lilliput_query_metrics$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 3054L)
    public static SubLObject lilliput_experiment_full_filename(final SubLObject filename, SubLObject directory) {
        if (directory == lilliput.UNPROVIDED) {
            directory = lilliput.$lilliput_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 3450L)
    public static SubLObject run_lilliput_experiment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)lilliput.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)lilliput.NIL;
        SubLObject current_$1 = (SubLObject)lilliput.NIL;
        while (lilliput.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lilliput.$list9);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lilliput.$list9);
            if (lilliput.NIL == conses_high.member(current_$1, (SubLObject)lilliput.$list10, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED)) {
                bad = (SubLObject)lilliput.T;
            }
            if (current_$1 == lilliput.$kw11$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (lilliput.NIL != bad && lilliput.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lilliput.$list9);
        }
        final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw12$QUERY_SPEC_SET, current);
        final SubLObject query_spec_set = (SubLObject)((lilliput.NIL != query_spec_set_tail) ? conses_high.cadr(query_spec_set_tail) : lilliput.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw13$FILENAME, current);
        final SubLObject filename = (SubLObject)((lilliput.NIL != filename_tail) ? conses_high.cadr(filename_tail) : lilliput.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw14$COMMENT, current);
        final SubLObject comment = (SubLObject)((lilliput.NIL != comment_tail) ? conses_high.cadr(comment_tail) : lilliput.NIL);
        final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw15$OVERRIDING_QUERY_PROPERTIES, current);
        final SubLObject overriding_query_properties = (SubLObject)((lilliput.NIL != overriding_query_properties_tail) ? conses_high.cadr(overriding_query_properties_tail) : lilliput.NIL);
        final SubLObject metrics_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw16$METRICS, current);
        final SubLObject metrics = (SubLObject)((lilliput.NIL != metrics_tail) ? conses_high.cadr(metrics_tail) : lilliput.$list17);
        final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw18$OUTLIER_TIMEOUT, current);
        final SubLObject outlier_timeout = (SubLObject)((lilliput.NIL != outlier_timeout_tail) ? conses_high.cadr(outlier_timeout_tail) : lilliput.$sym19$_LILLIPUT_OUTLIER_TIMEOUT_);
        final SubLObject incremental_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw20$INCREMENTAL, current);
        final SubLObject incremental = (SubLObject)((lilliput.NIL != incremental_tail) ? conses_high.cadr(incremental_tail) : lilliput.T);
        final SubLObject include_results_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw21$INCLUDE_RESULTS, current);
        final SubLObject include_results = (SubLObject)((lilliput.NIL != include_results_tail) ? conses_high.cadr(include_results_tail) : lilliput.NIL);
        final SubLObject randomize_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw22$RANDOMIZE, current);
        final SubLObject randomize = (SubLObject)((lilliput.NIL != randomize_tail) ? conses_high.cadr(randomize_tail) : lilliput.NIL);
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw23$SKIP, current);
        final SubLObject skip = (SubLObject)((lilliput.NIL != skip_tail) ? conses_high.cadr(skip_tail) : lilliput.ZERO_INTEGER);
        final SubLObject count_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw24$COUNT, current);
        final SubLObject count = (SubLObject)((lilliput.NIL != count_tail) ? conses_high.cadr(count_tail) : lilliput.NIL);
        final SubLObject directory_tail = cdestructuring_bind.property_list_member((SubLObject)lilliput.$kw25$DIRECTORY, current);
        final SubLObject directory = (lilliput.NIL != directory_tail) ? conses_high.cadr(directory_tail) : lilliput.$lilliput_experiment_directory$.getGlobalValue();
        final SubLObject filename_var = (SubLObject)lilliput.$sym26$FILENAME_VAR;
        final SubLObject full_filename = (SubLObject)lilliput.$sym27$FULL_FILENAME;
        return (SubLObject)ConsesLow.list((SubLObject)lilliput.$sym28$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename), (SubLObject)ConsesLow.list(full_filename, (SubLObject)ConsesLow.list((SubLObject)lilliput.$sym29$FWHEN, filename_var, (SubLObject)ConsesLow.list((SubLObject)lilliput.$sym30$LILLIPUT_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), (SubLObject)ConsesLow.list(new SubLObject[] { lilliput.$sym31$RUN_KBQ_EXPERIMENT, lilliput.$kw12$QUERY_SPEC_SET, query_spec_set, lilliput.$kw13$FILENAME, full_filename, lilliput.$kw14$COMMENT, comment, lilliput.$kw15$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, lilliput.$kw16$METRICS, metrics, lilliput.$kw18$OUTLIER_TIMEOUT, outlier_timeout, lilliput.$kw20$INCREMENTAL, incremental, lilliput.$kw21$INCLUDE_RESULTS, include_results, lilliput.$kw22$RANDOMIZE, randomize, lilliput.$kw23$SKIP, skip, lilliput.$kw24$COUNT, count }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 4420L)
    public static SubLObject load_lilliput_experiment(final SubLObject filename) {
        final SubLObject full_filename = lilliput_experiment_full_filename(filename, (SubLObject)lilliput.UNPROVIDED);
        return kbq_query_run.kbq_load_query_set_run(full_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 4614L)
    public static SubLObject save_lilliput_experiment(final SubLObject experiment, final SubLObject filename) {
        final SubLObject full_filename = lilliput_experiment_full_filename(filename, (SubLObject)lilliput.UNPROVIDED);
        return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 4810L)
    public static SubLObject lilliput_open_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, lilliput.$const32$LilliputQuery_OpenGood, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5013L)
    public static SubLObject lilliput_open_no_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, lilliput.$const33$LilliputQuery_OpenNoGood, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5178L)
    public static SubLObject lilliput_closed_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, lilliput.$const34$LilliputQuery_ClosedGood, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5342L)
    public static SubLObject lilliput_closed_no_good_query_set_run(final SubLObject query_set_run) {
        return kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, lilliput.$const35$LilliputQuery_ClosedNoGood, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5511L)
    public static SubLObject lilliput_open_good_queryP(final SubLObject query) {
        return isa.isaP(query, lilliput.$const32$LilliputQuery_OpenGood, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5608L)
    public static SubLObject lilliput_open_no_good_queryP(final SubLObject query) {
        return isa.isaP(query, lilliput.$const33$LilliputQuery_OpenNoGood, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5710L)
    public static SubLObject lilliput_closed_good_queryP(final SubLObject query) {
        return isa.isaP(query, lilliput.$const34$LilliputQuery_ClosedGood, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5811L)
    public static SubLObject lilliput_closed_no_good_queryP(final SubLObject query) {
        return isa.isaP(query, lilliput.$const35$LilliputQuery_ClosedNoGood, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 5917L)
    public static SubLObject analyze_lilliput_experiment(final SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (corpus == lilliput.UNPROVIDED) {
            corpus = (SubLObject)lilliput.$str36$Lilliput_Training;
        }
        if (display == lilliput.UNPROVIDED) {
            display = (SubLObject)lilliput.$str37$_0;
        }
        if (stream == lilliput.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert lilliput.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        final SubLObject query_set_run = Symbols.symbol_value(experiment_denoting_symbol);
        final SubLObject name = Symbols.symbol_name(experiment_denoting_symbol);
        PrintLow.format(stream, (SubLObject)lilliput.$str39$____Basic_analysis____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str40$____Answerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str41$____Unanswerable____);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str42$____Open_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_open_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str43$____Open_No_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_open_no_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str44$____Closed_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_closed_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)lilliput.$str45$____Closed_No_Good___);
        list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(lilliput_closed_no_good_query_set_run(query_set_run), basic_lilliput_query_metrics()), (SubLObject)lilliput.UNPROVIDED);
        SubLObject cdolist_list_var = standard_lilliput_query_metrics();
        SubLObject metric = (SubLObject)lilliput.NIL;
        metric = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            lilliput_generate_sorted_property_display(query_set_run, name, metric, corpus, display);
            cdolist_list_var = cdolist_list_var.rest();
            metric = cdolist_list_var.first();
        }
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 7973L)
    public static SubLObject lilliput_generate_sorted_property_display(final SubLObject experiment, final SubLObject name, final SubLObject property, SubLObject corpus, SubLObject display) {
        if (corpus == lilliput.UNPROVIDED) {
            corpus = (SubLObject)lilliput.$str36$Lilliput_Training;
        }
        if (display == lilliput.UNPROVIDED) {
            display = (SubLObject)lilliput.$str37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_display(experiment, property, (SubLObject)lilliput.$list46, (SubLObject)ConsesLow.listS((SubLObject)lilliput.$kw47$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[] { lilliput.$str48$_, format_nil.format_nil_a_no_copy(name), lilliput.$str49$_n, format_nil.format_nil_a_no_copy(property) }), lilliput.$kw50$XLABEL, lilliput.$str51$Sorted_Queries, lilliput.$kw52$YLABEL, leviathan.ylabel_for_property(property), lilliput.$list53 }), display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 8583L)
    public static SubLObject analyze_lilliput_experiments(final SubLObject baseline_denoting_symbol, final SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == lilliput.UNPROVIDED) {
            display_graphsP = (SubLObject)lilliput.T;
        }
        if (metrics == lilliput.UNPROVIDED) {
            metrics = basic_lilliput_query_metrics();
        }
        if (corpus == lilliput.UNPROVIDED) {
            corpus = (SubLObject)lilliput.$str36$Lilliput_Training;
        }
        if (display == lilliput.UNPROVIDED) {
            display = (SubLObject)lilliput.$str37$_0;
        }
        if (stream == lilliput.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lilliput.NIL != special_variable_state.bound_symbol_p(baseline_denoting_symbol) : baseline_denoting_symbol;
        assert lilliput.NIL != special_variable_state.bound_symbol_p(experiment_denoting_symbol) : experiment_denoting_symbol;
        final SubLObject baseline = Symbols.symbol_value(baseline_denoting_symbol);
        final SubLObject baseline_name = Symbols.symbol_name(baseline_denoting_symbol);
        final SubLObject experiment = Symbols.symbol_value(experiment_denoting_symbol);
        final SubLObject experiment_name = Symbols.symbol_name(experiment_denoting_symbol);
        final SubLObject open_good_baseline = lilliput_open_good_query_set_run(baseline);
        final SubLObject open_good_experiment = lilliput_open_good_query_set_run(experiment);
        final SubLObject open_no_good_baseline = lilliput_open_no_good_query_set_run(baseline);
        final SubLObject open_no_good_experiment = lilliput_open_no_good_query_set_run(experiment);
        final SubLObject closed_good_baseline = lilliput_closed_good_query_set_run(baseline);
        final SubLObject closed_good_experiment = lilliput_closed_good_query_set_run(experiment);
        final SubLObject closed_no_good_baseline = lilliput_closed_no_good_query_set_run(baseline);
        final SubLObject closed_no_good_experiment = lilliput_closed_no_good_query_set_run(experiment);
        thread.resetMultipleValues();
        final SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs(baseline, experiment);
        final SubLObject mutual_experiment = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format(stream, (SubLObject)lilliput.$str54$____Answerability_analysis____);
        thread.resetMultipleValues();
        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
        SubLObject mutual = thread.secondMultipleValue();
        SubLObject only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str55$Total_____________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_good_baseline, open_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str56$Open_Good_________s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(open_no_good_baseline, open_no_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str57$Open_No_Good______s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_good_baseline, closed_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str58$Closed_Good_______s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        thread.resetMultipleValues();
        only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(closed_no_good_baseline, closed_no_good_experiment);
        mutual = thread.secondMultipleValue();
        only_2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str59$Closed_No_Good____s__s__s__, new SubLObject[] { only_1, mutual, only_2 });
        PrintLow.format(stream, (SubLObject)lilliput.$str39$____Basic_analysis____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str60$____Mutually_Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str61$____Mutually_Answerable_Open_Good);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(lilliput_open_good_query_set_run(mutual_baseline), lilliput_open_good_query_set_run(mutual_experiment), metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str62$____Mutually_Answerable_Closed_Go);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(lilliput_closed_good_query_set_run(mutual_baseline), lilliput_closed_good_query_set_run(mutual_experiment), metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str40$____Answerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str41$____Unanswerable____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str63$____Open_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_good_baseline, open_good_experiment, metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str64$____Open_No_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(open_no_good_baseline, open_no_good_experiment, metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str65$____Closed_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_good_baseline, closed_good_experiment, metrics));
        PrintLow.format(stream, (SubLObject)lilliput.$str66$____Closed_No_Good____);
        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(closed_no_good_baseline, closed_no_good_experiment, metrics));
        if (lilliput.NIL != display_graphsP) {
            SubLObject cdolist_list_var = (SubLObject)lilliput.$list68;
            SubLObject metric = (SubLObject)lilliput.NIL;
            metric = cdolist_list_var.first();
            while (lilliput.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$2 = (SubLObject)lilliput.$list67;
                SubLObject sort_by = (SubLObject)lilliput.NIL;
                sort_by = cdolist_list_var_$2.first();
                while (lilliput.NIL != cdolist_list_var_$2) {
                    lilliput_generate_sorted_property_comparison(baseline, experiment, baseline_name, experiment_name, metric, sort_by, corpus, display);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    sort_by = cdolist_list_var_$2.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                metric = cdolist_list_var.first();
            }
        }
        return (SubLObject)lilliput.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 13468L)
    public static SubLObject lilliput_generate_sorted_property_comparison(final SubLObject baseline, final SubLObject experiment, final SubLObject baseline_name, final SubLObject experiment_name, final SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == lilliput.UNPROVIDED) {
            sort_by = (SubLObject)lilliput.$kw69$BOTH;
        }
        if (corpus == lilliput.UNPROVIDED) {
            corpus = (SubLObject)lilliput.$str36$Lilliput_Training;
        }
        if (display == lilliput.UNPROVIDED) {
            display = (SubLObject)lilliput.$str37$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, (SubLObject)ConsesLow.listS((SubLObject)lilliput.$kw47$PLOT_TITLE, new SubLObject[] { Sequences.cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[] { lilliput.$str70$__, format_nil.format_nil_a_no_copy(baseline_name), lilliput.$str71$_vs__, format_nil.format_nil_a_no_copy(experiment_name), lilliput.$str49$_n, format_nil.format_nil_a_no_copy(property) }), lilliput.$kw50$XLABEL, lilliput.$str51$Sorted_Queries, lilliput.$kw52$YLABEL, leviathan.ylabel_for_property(property), lilliput.$kw72$BASELINE_KEY_LABEL, baseline_name, lilliput.$kw73$EXPERIMENT_KEY_LABEL, experiment_name, lilliput.$list74 }), sort_by, display);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 14059L)
    public static SubLObject kbq_hybridize_n_query_set_runs(final SubLObject query_set_runs, SubLObject compare_func, SubLObject comment, SubLObject tag) {
        if (compare_func == lilliput.UNPROVIDED) {
            compare_func = (SubLObject)lilliput.$sym75$KBQ_MEDIAN_QUERY_RUN;
        }
        if (comment == lilliput.UNPROVIDED) {
            comment = (SubLObject)lilliput.$str76$;
        }
        if (tag == lilliput.UNPROVIDED) {
            tag = (SubLObject)lilliput.$kw77$ORIGIN;
        }
        final SubLObject tagged_query_set_runs = arete.kbq_tag_query_set_runs(query_set_runs, tag);
        SubLObject hybrid_query_runs = (SubLObject)lilliput.NIL;
        SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(tagged_query_set_runs.first());
        SubLObject query = (SubLObject)lilliput.NIL;
        query = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            final SubLObject query_runs = kbq_query_run.kbq_lookup_query_runs(tagged_query_set_runs, query);
            final SubLObject best_query_run = Functions.funcall(compare_func, query_runs);
            hybrid_query_runs = (SubLObject)ConsesLow.cons(best_query_run, hybrid_query_runs);
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        SubLObject hybrid_query_set_run = conses_high.copy_list(tagged_query_set_runs.first());
        hybrid_query_runs = Sequences.nreverse(hybrid_query_runs);
        hybrid_query_set_run = conses_high.putf(hybrid_query_set_run, (SubLObject)lilliput.$kw78$QUERY_RUNS, hybrid_query_runs);
        hybrid_query_set_run = conses_high.putf(hybrid_query_set_run, (SubLObject)lilliput.$kw14$COMMENT, comment);
        return hybrid_query_set_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 15059L)
    public static SubLObject kbq_median_query_run(final SubLObject query_runs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lilliput.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && lilliput.NIL == Numbers.oddp(Sequences.length(query_runs))) {
            Errors.error((SubLObject)lilliput.$str79$Cannot_handle_even_numbers_of_que);
        }
        return number_utilities.median(query_runs, (SubLObject)lilliput.$sym80$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME, (SubLObject)lilliput.$kw81$ITEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 15259L)
    public static SubLObject generate_lilliput_corpus(final SubLObject n, final SubLObject trainingP, SubLObject start) {
        if (start == lilliput.UNPROVIDED) {
            start = (SubLObject)lilliput.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject open_good = lilliput_generate_query_sentences(n, (SubLObject)lilliput.UNPROVIDED);
        final SubLObject open_no_good = thread.secondMultipleValue();
        final SubLObject closed_good = thread.thirdMultipleValue();
        final SubLObject closed_no_good = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Numbers.add(new SubLObject[] { lilliput_reify_queries(open_good, lilliput.$const32$LilliputQuery_OpenGood, trainingP, start), lilliput_reify_queries(open_no_good, lilliput.$const33$LilliputQuery_OpenNoGood, trainingP, start), lilliput_reify_queries(closed_good, lilliput.$const34$LilliputQuery_ClosedGood, trainingP, start), lilliput_reify_queries(closed_no_good, lilliput.$const35$LilliputQuery_ClosedNoGood, trainingP, start) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 16244L)
    public static SubLObject lilliput_valid_terms_for_all_test_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lilliput.NIL;
        SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
        SubLObject query = (SubLObject)lilliput.NIL;
        query = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            SubLObject argnum;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject terms;
            for (argnum = (SubLObject)lilliput.NIL, argnum = (SubLObject)lilliput.ZERO_INTEGER; argnum.numL((SubLObject)lilliput.FOUR_INTEGER); argnum = Numbers.add(argnum, (SubLObject)lilliput.ONE_INTEGER)) {
                mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    terms = lilliput_valid_terms_for_query_argnum(query, argnum);
                    result = ConsesLow.nconc(terms, result);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 16649L)
    public static SubLObject lilliput_instantiate_all_queries_once() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lilliput.NIL;
        SubLObject cdolist_list_var = lilliput_caches.all_valid_lilliput_queries();
        SubLObject query = (SubLObject)lilliput.NIL;
        query = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject open_query = lilliput_partially_instantiate_query(query);
                result = (SubLObject)ConsesLow.cons(open_query, result);
                final SubLObject var;
                final SubLObject closed_query = var = lilliput_fully_instantiate_query(query);
                if (lilliput.NIL != var) {
                    result = (SubLObject)ConsesLow.cons(var, result);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 17068L)
    public static SubLObject lilliput_generate_query_sentences(final SubLObject n, SubLObject verboseP) {
        if (verboseP == lilliput.UNPROVIDED) {
            verboseP = (SubLObject)lilliput.T;
        }
        SubLObject open_good = (SubLObject)lilliput.NIL;
        SubLObject open_no_good = (SubLObject)lilliput.NIL;
        SubLObject closed_good = (SubLObject)lilliput.NIL;
        SubLObject closed_no_good = (SubLObject)lilliput.NIL;
        while (lilliput.NIL != list_utilities.lengthL(open_good, n, (SubLObject)lilliput.UNPROVIDED) || lilliput.NIL != list_utilities.lengthL(open_no_good, n, (SubLObject)lilliput.UNPROVIDED) || lilliput.NIL != list_utilities.lengthL(closed_good, n, (SubLObject)lilliput.UNPROVIDED) || lilliput.NIL != list_utilities.lengthL(closed_no_good, n, (SubLObject)lilliput.UNPROVIDED)) {
            final SubLObject sentence = (lilliput.NIL != number_utilities.true_with_probability((SubLObject)lilliput.$float82$0_5)) ? lilliput_partially_instantiate_random_query() : lilliput_fully_instantiate_random_query();
            if (lilliput.NIL != sentence) {
                final SubLObject openP = (SubLObject)SubLObjectFactory.makeBoolean(lilliput.NIL == el_utilities.closedP(sentence, (SubLObject)lilliput.UNPROVIDED));
                final SubLObject goodP = list_utilities.sublisp_boolean(lilliput_cyc_query(sentence));
                if (lilliput.NIL != openP) {
                    if (lilliput.NIL != goodP) {
                        if (lilliput.NIL != verboseP) {
                            PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str83$o);
                            streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
                        }
                        open_good = (SubLObject)ConsesLow.cons(sentence, open_good);
                    }
                    else {
                        if (lilliput.NIL != verboseP) {
                            PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str84$_);
                            streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
                        }
                        open_no_good = (SubLObject)ConsesLow.cons(sentence, open_no_good);
                    }
                }
                else if (lilliput.NIL != goodP) {
                    if (lilliput.NIL != verboseP) {
                        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str85$_);
                        streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
                    }
                    closed_good = (SubLObject)ConsesLow.cons(sentence, closed_good);
                }
                else {
                    if (lilliput.NIL != verboseP) {
                        PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str86$x);
                        streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
                    }
                    closed_no_good = (SubLObject)ConsesLow.cons(sentence, closed_no_good);
                }
            }
        }
        open_good = list_utilities.first_n(n, open_good);
        open_no_good = list_utilities.first_n(n, open_no_good);
        closed_good = list_utilities.first_n(n, closed_good);
        closed_no_good = list_utilities.first_n(n, closed_no_good);
        return Values.values(open_good, open_no_good, closed_good, closed_no_good);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 18421L)
    public static SubLObject lilliput_partially_instantiate_random_query() {
        return lilliput_partially_instantiate_query(lilliput_random_query());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 18559L)
    public static SubLObject lilliput_partially_instantiate_query(final SubLObject query) {
        final SubLObject instantiable_argnums = lilliput_instantiable_argnums(query);
        final SubLObject chosen_argnum = list_utilities.random_element(instantiable_argnums);
        return lilliput_wff_instantiate_query_argnums(query, (SubLObject)ConsesLow.list(chosen_argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 18828L)
    public static SubLObject lilliput_fully_instantiate_random_query() {
        return lilliput_fully_instantiate_query(lilliput_random_query());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 18958L)
    public static SubLObject lilliput_fully_instantiate_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject instantiable_argnums = lilliput_instantiable_argnums(query);
        final SubLObject some_arg_left_openP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (lilliput.NIL == some_arg_left_openP) {
            return lilliput_wff_instantiate_query_argnums(query, instantiable_argnums);
        }
        return (SubLObject)lilliput.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 19243L)
    public static SubLObject lilliput_instantiable_argnums(final SubLObject query) {
        SubLObject argnums = (SubLObject)lilliput.NIL;
        SubLObject some_arg_left_openP = (SubLObject)lilliput.NIL;
        final SubLObject sentence = kb_query.kbq_sentence(query);
        final SubLObject query_type = lilliput_query_type(query);
        SubLObject cdolist_list_var = cycl_utilities.variable_argnums(sentence, Symbols.symbol_function((SubLObject)lilliput.$sym87$EL_VAR_));
        SubLObject argnum = (SubLObject)lilliput.NIL;
        argnum = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            if (lilliput.NIL != lilliput_leave_arg_place_openP(query_type, argnum)) {
                some_arg_left_openP = (SubLObject)lilliput.T;
            }
            else {
                argnums = (SubLObject)ConsesLow.cons(argnum, argnums);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        }
        return Values.values(argnums, some_arg_left_openP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 19829L)
    public static SubLObject lilliput_wff_instantiate_query_argnums(final SubLObject query, final SubLObject argnums) {
        SubLObject sentence;
        for (sentence = (SubLObject)lilliput.NIL; lilliput.NIL == sentence || lilliput.NIL == wff.el_wffP(sentence, lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput.UNPROVIDED); sentence = lilliput_instantiate_query_argnums(query, argnums)) {}
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 20079L)
    public static SubLObject lilliput_instantiate_query_argnums(final SubLObject query, final SubLObject argnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = kb_query.kbq_sentence(query);
        SubLObject cdolist_list_var = argnums;
        SubLObject argnum = (SubLObject)lilliput.NIL;
        argnum = cdolist_list_var.first();
        while (lilliput.NIL != cdolist_list_var) {
            final SubLObject valid_terms = lilliput_valid_terms_for_query_argnum(query, argnum);
            if (lilliput.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && lilliput.NIL == valid_terms) {
                Errors.error((SubLObject)lilliput.$str88$could_not_find_any_valid_terms_fo, argnum, query);
            }
            final SubLObject chosen_term = num_index_weighted_instantiation(valid_terms);
            sentence = el_utilities.replace_formula_arg(argnum, chosen_term, sentence);
            cdolist_list_var = cdolist_list_var.rest();
            argnum = cdolist_list_var.first();
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 20694L)
    public static SubLObject lilliput_valid_terms_for_query_argnum(final SubLObject query, final SubLObject argnum) {
        final SubLObject query_type = lilliput_query_type(query);
        if (lilliput.NIL != list_utilities.member_eqP(query_type, lilliput.$lilliput_default_query_collections$.getGlobalValue())) {
            return lilliput_valid_terms_for_default_query(query, argnum);
        }
        if (query_type.eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
            return Errors.error((SubLObject)lilliput.$str89$got_an_unsorted_query__s, query);
        }
        return lilliput_valid_terms_for_argnum(query_type, argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 21137L)
    public static SubLObject lilliput_valid_terms_for_default_query(final SubLObject query, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = kb_query.kbq_sentence(query);
        assert lilliput.NIL != cycl_grammar.cycl_atomic_sentence_p(sentence) : sentence;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(sentence);
        final SubLObject arg_isas = genls.min_cols(kb_accessors.argn_isa(pred, argnum, lilliput.$lilliput_mt$.getGlobalValue()), lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput.UNPROVIDED);
        if (lilliput.NIL != arg_isas) {
            if (lilliput.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && lilliput.NIL == list_utilities.singletonP(arg_isas)) {
                Errors.error((SubLObject)lilliput.$str91$Expected_only_one_arg_constraint_, arg_isas);
            }
            final SubLObject col = arg_isas.first();
            return lilliput_caches.lilliput_all_instances(col);
        }
        return (SubLObject)lilliput.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 21623L)
    public static SubLObject lilliput_valid_terms_for_argnum(final SubLObject query_type, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lilliput.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject domain = kb_mapping_utilities.pred_arg_values(query_type, lilliput.$const92$correspondingDomainInArg, argnum, (SubLObject)lilliput.ONE_INTEGER, (SubLObject)lilliput.THREE_INTEGER, (SubLObject)lilliput.TWO_INTEGER, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED).first();
            if (lilliput.NIL != domain) {
                if (lilliput.NIL != nart_handles.nart_p(domain) && lilliput.$const93$CollectionSubsetFn.eql(cycl_utilities.nat_functor(domain))) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification.unify(cycl_utilities.nat_arg2(domain, (SubLObject)lilliput.UNPROVIDED), (SubLObject)lilliput.$list94, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
                    final SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (lilliput.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && lilliput.NIL == v_bindings) {
                        Errors.error((SubLObject)lilliput.$str95$unhandled___CollectionSubsetFn_do);
                    }
                    final SubLObject collection = cycl_utilities.nat_arg1(domain, (SubLObject)lilliput.UNPROVIDED);
                    result = conses_high.copy_list(lilliput_caches.lilliput_all_instances_if_tkb_fort(collection));
                }
                else if (lilliput.NIL != fort_types_interface.collection_p(domain)) {
                    result = conses_high.copy_list(lilliput_caches.lilliput_all_instances(domain));
                }
                else {
                    Errors.error((SubLObject)lilliput.$str96$unexpected_domain_type__s, domain);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 22493L)
    public static SubLObject num_index_weighted_instantiation(final SubLObject fort_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = num_index_weighted_vector(fort_list);
        final SubLObject max_weight = conses_high.second(Vectors.aref(vector, number_utilities.f_1_(Sequences.length(vector))));
        final SubLObject random_weight = random.random(max_weight);
        thread.resetMultipleValues();
        final SubLObject lower_bound = vector_utilities.binary_search_vector_range(random_weight, vector, Symbols.symbol_function((SubLObject)lilliput.$sym97$_), Symbols.symbol_function((SubLObject)lilliput.$sym98$_), Symbols.symbol_function((SubLObject)lilliput.$sym99$SECOND), (SubLObject)lilliput.UNPROVIDED);
        final SubLObject upper_bound = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject chosen_fort = Vectors.aref(vector, lower_bound).first();
        return chosen_fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 22962L)
    public static SubLObject num_index_weighted_vector(final SubLObject fort_list) {
        final SubLObject vector = Vectors.make_vector(Sequences.length(fort_list), (SubLObject)lilliput.UNPROVIDED);
        SubLObject count = (SubLObject)lilliput.ZERO_INTEGER;
        SubLObject list_var = (SubLObject)lilliput.NIL;
        SubLObject fort = (SubLObject)lilliput.NIL;
        SubLObject i = (SubLObject)lilliput.NIL;
        list_var = fort_list;
        fort = list_var.first();
        for (i = (SubLObject)lilliput.ZERO_INTEGER; lilliput.NIL != list_var; list_var = list_var.rest(), fort = list_var.first(), i = Numbers.add((SubLObject)lilliput.ONE_INTEGER, i)) {
            count = Numbers.add(count, kb_indexing.num_index(fort));
            Vectors.set_aref(vector, i, (SubLObject)ConsesLow.list(fort, count));
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 23244L)
    public static SubLObject lilliput_reify_queries(final SubLObject sentences, final SubLObject col, final SubLObject trainingP, final SubLObject start) {
        SubLObject count = (SubLObject)lilliput.ZERO_INTEGER;
        SubLObject list_var = (SubLObject)lilliput.NIL;
        SubLObject sentence = (SubLObject)lilliput.NIL;
        SubLObject i = (SubLObject)lilliput.NIL;
        list_var = sentences;
        sentence = list_var.first();
        for (i = (SubLObject)lilliput.ZERO_INTEGER; lilliput.NIL != list_var; list_var = list_var.rest(), sentence = list_var.first(), i = Numbers.add((SubLObject)lilliput.ONE_INTEGER, i)) {
            if (lilliput.NIL != lilliput_reify_query(sentence, col, trainingP, Numbers.add(start, i))) {
                count = Numbers.add(count, (SubLObject)lilliput.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 23592L)
    public static SubLObject lilliput_reify_query(final SubLObject sentence, final SubLObject col, final SubLObject trainingP, final SubLObject n) {
        final SubLObject const_name = Sequences.cconcatenate(constants_high.constant_name(col), new SubLObject[] { lilliput.$str100$_, string_utilities.str(n) });
        final SubLObject query_const = ke.ke_create_now(const_name, (SubLObject)lilliput.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(lilliput.NIL != ke.ke_assert_now((SubLObject)ConsesLow.list(lilliput.$const101$isa, query_const, col), lilliput.$const102$UniversalVocabularyMt, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED) && lilliput.NIL != ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(sentence, query_const), lilliput.$const103$TestVocabularyMt, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED) && lilliput.NIL != ((lilliput.NIL != trainingP) ? ke.ke_assert_now((SubLObject)ConsesLow.listS(lilliput.$const101$isa, query_const, (SubLObject)lilliput.$list104), lilliput.$const102$UniversalVocabularyMt, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED) : ke.ke_assert_now((SubLObject)ConsesLow.listS(lilliput.$const101$isa, query_const, (SubLObject)lilliput.$list105), lilliput.$const102$UniversalVocabularyMt, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 24302L)
    public static SubLObject lilliput_query_type(final SubLObject query) {
        return ask_utilities.query_variable((SubLObject)lilliput.$sym106$_COL, (SubLObject)ConsesLow.list(lilliput.$const107$and, (SubLObject)ConsesLow.listS(lilliput.$const108$nearestIsa, query, (SubLObject)lilliput.$list109), (SubLObject)ConsesLow.list(lilliput.$const110$genls, (SubLObject)lilliput.$sym106$_COL, lilliput.$lilliput_master_query_collection$.getGlobalValue())), lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 25394L)
    public static SubLObject lilliput_random_query() {
        return list_utilities.random_element(lilliput_caches.all_valid_lilliput_queries());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 25491L)
    public static SubLObject lilliput_leave_arg_place_openP(final SubLObject query_type, final SubLObject argnum) {
        return kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(lilliput.$const111$leaveArgPlaceOpenInTestQueries, query_type, argnum, lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 25666L)
    public static SubLObject tkb_fortP(final SubLObject v_object) {
        if (lilliput.NIL == forts.fort_p(v_object)) {
            return (SubLObject)lilliput.NIL;
        }
        if (lilliput.NIL != constant_handles.constant_p(v_object)) {
            return isa.quoted_isaP(v_object, lilliput.$const112$TKBConstant, lilliput.$const113$BookkeepingMt, (SubLObject)lilliput.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lilliput.NIL == list_utilities.tree_find_if((SubLObject)lilliput.$sym114$NON_TKB_FORT_, narts_high.nart_el_formula(v_object), (SubLObject)lilliput.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 25888L)
    public static SubLObject non_tkb_fortP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lilliput.NIL != forts.fort_p(v_object) && lilliput.NIL == tkb_fortP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 25992L)
    public static SubLObject lilliput_cyc_query(final SubLObject sentence) {
        return inference_kernel.new_cyc_query(sentence, lilliput.$lilliput_mt$.getGlobalValue(), lilliput.$lilliput_corpus_generation_query_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 26133L)
    public static SubLObject lilliput_generate_query_sentence_of_type(final SubLObject type) {
        SubLObject generate_goodP = (SubLObject)lilliput.NIL;
        SubLObject generate_openP = (SubLObject)lilliput.NIL;
        if (type.eql(lilliput.$const32$LilliputQuery_OpenGood)) {
            generate_openP = (SubLObject)lilliput.T;
            generate_goodP = (SubLObject)lilliput.T;
        }
        else if (type.eql(lilliput.$const33$LilliputQuery_OpenNoGood)) {
            generate_openP = (SubLObject)lilliput.T;
            generate_goodP = (SubLObject)lilliput.NIL;
        }
        else if (type.eql(lilliput.$const34$LilliputQuery_ClosedGood)) {
            generate_openP = (SubLObject)lilliput.NIL;
            generate_goodP = (SubLObject)lilliput.T;
        }
        else if (type.eql(lilliput.$const35$LilliputQuery_ClosedNoGood)) {
            generate_openP = (SubLObject)lilliput.NIL;
            generate_goodP = (SubLObject)lilliput.NIL;
        }
        return lilliput_generate_query_sentence_with_properties(generate_openP, generate_goodP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 26755L)
    public static SubLObject lilliput_generate_query_sentence_with_properties(final SubLObject generate_openP, final SubLObject generate_goodP) {
        SubLObject sentence = (SubLObject)lilliput.NIL;
        SubLObject goodP = (SubLObject)lilliput.NIL;
        while (lilliput.NIL == sentence || !generate_goodP.eql(goodP)) {
            if (lilliput.NIL != generate_openP) {
                sentence = lilliput_generate_open_sentence((SubLObject)lilliput.UNPROVIDED);
            }
            else {
                sentence = lilliput_generate_closed_sentence((SubLObject)lilliput.UNPROVIDED);
            }
            goodP = list_utilities.sublisp_boolean(lilliput_cyc_query(sentence));
            if (lilliput.NIL != goodP) {
                PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str115$g__);
                streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
            }
            else {
                PrintLow.format((SubLObject)lilliput.T, (SubLObject)lilliput.$str116$n__);
                streams_high.force_output((SubLObject)lilliput.UNPROVIDED);
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 27276L)
    public static SubLObject lilliput_generate_closed_sentence(SubLObject verboseP) {
        if (verboseP == lilliput.UNPROVIDED) {
            verboseP = (SubLObject)lilliput.T;
        }
        SubLObject sentence = (SubLObject)lilliput.NIL;
        SubLObject closedP = (SubLObject)lilliput.NIL;
        while (lilliput.NIL == sentence || lilliput.NIL == closedP) {
            sentence = lilliput_fully_instantiate_random_query();
            closedP = el_utilities.closedP(sentence, (SubLObject)lilliput.UNPROVIDED);
            if (lilliput.NIL != verboseP) {
                if (lilliput.NIL != closedP) {
                    format_nil.force_format((SubLObject)lilliput.T, (SubLObject)lilliput.$str117$c, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
                }
                else {
                    format_nil.force_format((SubLObject)lilliput.T, (SubLObject)lilliput.$str83$o, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
                }
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 27652L)
    public static SubLObject lilliput_generate_open_sentence(SubLObject verboseP) {
        if (verboseP == lilliput.UNPROVIDED) {
            verboseP = (SubLObject)lilliput.T;
        }
        SubLObject sentence = (SubLObject)lilliput.NIL;
        SubLObject closedP = (SubLObject)lilliput.NIL;
        while (lilliput.NIL == sentence || lilliput.NIL != closedP) {
            sentence = lilliput_partially_instantiate_random_query();
            closedP = el_utilities.closedP(sentence, (SubLObject)lilliput.UNPROVIDED);
            if (lilliput.NIL != verboseP) {
                if (lilliput.NIL != closedP) {
                    format_nil.force_format((SubLObject)lilliput.T, (SubLObject)lilliput.$str117$c, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
                }
                else {
                    format_nil.force_format((SubLObject)lilliput.T, (SubLObject)lilliput.$str83$o, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
                }
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput.lisp", position = 28023L)
    public static SubLObject correct_training_query(final SubLObject query) {
        final SubLObject sentence = ask_utilities.query_variable((SubLObject)lilliput.$sym118$_ASS, (SubLObject)ConsesLow.list(lilliput.$const119$assertionSentence, (SubLObject)lilliput.$sym118$_ASS, (SubLObject)ConsesLow.list(lilliput.$const120$softwareParameterValueInSpecifica, lilliput.$const121$InferenceSentenceParameter, (SubLObject)lilliput.$sym122$_QUERY, query)), lilliput.$const103$TestVocabularyMt, (SubLObject)lilliput.UNPROVIDED).first();
        final SubLObject query_type = ask_utilities.query_variable((SubLObject)lilliput.$sym123$_TYPE, (SubLObject)ConsesLow.listS(lilliput.$const107$and, (SubLObject)ConsesLow.listS(lilliput.$const108$nearestIsa, query, (SubLObject)lilliput.$list124), (SubLObject)lilliput.$list125), (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED).first();
        SubLObject correct_sentence = (SubLObject)lilliput.NIL;
        if (lilliput.NIL != sentence) {
            ke.ke_unassert_now(sentence, lilliput.$const103$TestVocabularyMt);
        }
        correct_sentence = lilliput_generate_query_sentence_of_type(query_type);
        ke.ke_assert_now(kb_query.kbq_assertible_query_spec_sentence(correct_sentence, query), lilliput.$const103$TestVocabularyMt, (SubLObject)lilliput.UNPROVIDED, (SubLObject)lilliput.UNPROVIDED);
        return (SubLObject)lilliput.NIL;
    }
    
    public static SubLObject declare_lilliput_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "basic_lilliput_query_metrics", "BASIC-LILLIPUT-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "standard_lilliput_query_metrics", "STANDARD-LILLIPUT-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "all_lilliput_query_metrics", "ALL-LILLIPUT-QUERY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_experiment_full_filename", "LILLIPUT-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.lilliput", "run_lilliput_experiment", "RUN-LILLIPUT-EXPERIMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "load_lilliput_experiment", "LOAD-LILLIPUT-EXPERIMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "save_lilliput_experiment", "SAVE-LILLIPUT-EXPERIMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_open_good_query_set_run", "LILLIPUT-OPEN-GOOD-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_open_no_good_query_set_run", "LILLIPUT-OPEN-NO-GOOD-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_closed_good_query_set_run", "LILLIPUT-CLOSED-GOOD-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_closed_no_good_query_set_run", "LILLIPUT-CLOSED-NO-GOOD-QUERY-SET-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_open_good_queryP", "LILLIPUT-OPEN-GOOD-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_open_no_good_queryP", "LILLIPUT-OPEN-NO-GOOD-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_closed_good_queryP", "LILLIPUT-CLOSED-GOOD-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_closed_no_good_queryP", "LILLIPUT-CLOSED-NO-GOOD-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "analyze_lilliput_experiment", "ANALYZE-LILLIPUT-EXPERIMENT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_sorted_property_display", "LILLIPUT-GENERATE-SORTED-PROPERTY-DISPLAY", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "analyze_lilliput_experiments", "ANALYZE-LILLIPUT-EXPERIMENTS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_sorted_property_comparison", "LILLIPUT-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "kbq_hybridize_n_query_set_runs", "KBQ-HYBRIDIZE-N-QUERY-SET-RUNS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "kbq_median_query_run", "KBQ-MEDIAN-QUERY-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "generate_lilliput_corpus", "GENERATE-LILLIPUT-CORPUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_valid_terms_for_all_test_queries", "LILLIPUT-VALID-TERMS-FOR-ALL-TEST-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_instantiate_all_queries_once", "LILLIPUT-INSTANTIATE-ALL-QUERIES-ONCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_query_sentences", "LILLIPUT-GENERATE-QUERY-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_partially_instantiate_random_query", "LILLIPUT-PARTIALLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_partially_instantiate_query", "LILLIPUT-PARTIALLY-INSTANTIATE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_fully_instantiate_random_query", "LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_fully_instantiate_query", "LILLIPUT-FULLY-INSTANTIATE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_instantiable_argnums", "LILLIPUT-INSTANTIABLE-ARGNUMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_wff_instantiate_query_argnums", "LILLIPUT-WFF-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_instantiate_query_argnums", "LILLIPUT-INSTANTIATE-QUERY-ARGNUMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_valid_terms_for_query_argnum", "LILLIPUT-VALID-TERMS-FOR-QUERY-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_valid_terms_for_default_query", "LILLIPUT-VALID-TERMS-FOR-DEFAULT-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_valid_terms_for_argnum", "LILLIPUT-VALID-TERMS-FOR-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "num_index_weighted_instantiation", "NUM-INDEX-WEIGHTED-INSTANTIATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "num_index_weighted_vector", "NUM-INDEX-WEIGHTED-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_reify_queries", "LILLIPUT-REIFY-QUERIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_reify_query", "LILLIPUT-REIFY-QUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_query_type", "LILLIPUT-QUERY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_random_query", "LILLIPUT-RANDOM-QUERY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_leave_arg_place_openP", "LILLIPUT-LEAVE-ARG-PLACE-OPEN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "tkb_fortP", "TKB-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "non_tkb_fortP", "NON-TKB-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_cyc_query", "LILLIPUT-CYC-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_query_sentence_of_type", "LILLIPUT-GENERATE-QUERY-SENTENCE-OF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_query_sentence_with_properties", "LILLIPUT-GENERATE-QUERY-SENTENCE-WITH-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_closed_sentence", "LILLIPUT-GENERATE-CLOSED-SENTENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "lilliput_generate_open_sentence", "LILLIPUT-GENERATE-OPEN-SENTENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput", "correct_training_query", "CORRECT-TRAINING-QUERY", 1, 0, false);
        return (SubLObject)lilliput.NIL;
    }
    
    public static SubLObject init_lilliput_file() {
        lilliput.$lilliput_master_query_collection$ = SubLFiles.deflexical("*LILLIPUT-MASTER-QUERY-COLLECTION*", lilliput.$const0$AKBBuilderQuery_InferenceTest);
        lilliput.$lilliput_default_query_collections$ = SubLFiles.deflexical("*LILLIPUT-DEFAULT-QUERY-COLLECTIONS*", (SubLObject)lilliput.$list1);
        lilliput.$lilliput_mt$ = SubLFiles.deflexical("*LILLIPUT-MT*", lilliput.$const2$TKBSourceSpindleCollectorMt);
        lilliput.$lilliput_corpus_generation_query_properties$ = SubLFiles.deflexical("*LILLIPUT-CORPUS-GENERATION-QUERY-PROPERTIES*", (SubLObject)lilliput.$list3);
        lilliput.$lilliput_directory$ = SubLFiles.deflexical("*LILLIPUT-DIRECTORY*", (SubLObject)lilliput.$str4$_cyc_projects_inference_lilliput_);
        lilliput.$lilliput_experiment_directory$ = SubLFiles.deflexical("*LILLIPUT-EXPERIMENT-DIRECTORY*", Sequences.cconcatenate(lilliput.$lilliput_directory$.getGlobalValue(), (SubLObject)lilliput.$str5$experiments_));
        lilliput.$basic_lilliput_query_metrics$ = SubLFiles.deflexical("*BASIC-LILLIPUT-QUERY-METRICS*", (SubLObject)lilliput.$list6);
        lilliput.$standard_lilliput_query_metrics$ = SubLFiles.deflexical("*STANDARD-LILLIPUT-QUERY-METRICS*", (SubLObject)lilliput.$list6);
        lilliput.$lilliput_query_metrics$ = SubLFiles.deflexical("*LILLIPUT-QUERY-METRICS*", (SubLObject)lilliput.$list7);
        lilliput.$lilliput_outlier_timeout$ = SubLFiles.deflexical("*LILLIPUT-OUTLIER-TIMEOUT*", (SubLObject)lilliput.$int8$60);
        return (SubLObject)lilliput.NIL;
    }
    
    public static SubLObject setup_lilliput_file() {
        return (SubLObject)lilliput.NIL;
    }
    
    public void declareFunctions() {
        declare_lilliput_file();
    }
    
    public void initializeVariables() {
        init_lilliput_file();
    }
    
    public void runTopLevelForms() {
        setup_lilliput_file();
    }
    
    static {
        me = (SubLFile)new lilliput();
        lilliput.$lilliput_master_query_collection$ = null;
        lilliput.$lilliput_default_query_collections$ = null;
        lilliput.$lilliput_mt$ = null;
        lilliput.$lilliput_corpus_generation_query_properties$ = null;
        lilliput.$lilliput_directory$ = null;
        lilliput.$lilliput_experiment_directory$ = null;
        lilliput.$basic_lilliput_query_metrics$ = null;
        lilliput.$standard_lilliput_query_metrics$ = null;
        lilliput.$lilliput_query_metrics$ = null;
        lilliput.$lilliput_outlier_timeout$ = null;
        $const0$AKBBuilderQuery_InferenceTest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest"));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest-Default")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AKBBuilderQuery-InferenceTest-LeaveOpenArg2")));
        $const2$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)lilliput.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)lilliput.NIL, (SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)lilliput.NIL, (SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)lilliput.NIL);
        $str4$_cyc_projects_inference_lilliput_ = SubLObjectFactory.makeString("/cyc/projects/inference/lilliput/");
        $str5$experiments_ = SubLObjectFactory.makeString("experiments/");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TIME-PER-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ANSWER-COUNT"), SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), SubLObjectFactory.makeKeyword("TOTAL-TIME"), SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"), SubLObjectFactory.makeKeyword("TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("COMPLETE-TIME-PER-ANSWER"), SubLObjectFactory.makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), SubLObjectFactory.makeKeyword("ANSWER-TIMES"), SubLObjectFactory.makeKeyword("TACTIC-COUNT"), SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT"), SubLObjectFactory.makeKeyword("EXECUTED-TACTIC-COUNT"), SubLObjectFactory.makeKeyword("DISCARDED-TACTIC-COUNT") });
        $int8$60 = SubLObjectFactory.makeInteger(60);
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("QUERY-SPEC-SET"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("OVERRIDING-QUERY-PROPERTIES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-LILLIPUT-QUERY-METRICS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTLIER-TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*LILLIPUT-OUTLIER-TIMEOUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCREMENTAL"), (SubLObject)lilliput.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDE-RESULTS"), (SubLObject)lilliput.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANDOMIZE"), (SubLObject)lilliput.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)lilliput.ZERO_INTEGER), SubLObjectFactory.makeSymbol("COUNT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("*LILLIPUT-EXPERIMENT-DIRECTORY*")) });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY-SPEC-SET"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("METRICS"), SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT"), SubLObjectFactory.makeKeyword("INCREMENTAL"), SubLObjectFactory.makeKeyword("INCLUDE-RESULTS"), SubLObjectFactory.makeKeyword("RANDOMIZE"), SubLObjectFactory.makeKeyword("SKIP"), SubLObjectFactory.makeKeyword("COUNT"), SubLObjectFactory.makeKeyword("DIRECTORY") });
        $kw11$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw12$QUERY_SPEC_SET = SubLObjectFactory.makeKeyword("QUERY-SPEC-SET");
        $kw13$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw14$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw15$OVERRIDING_QUERY_PROPERTIES = SubLObjectFactory.makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $kw16$METRICS = SubLObjectFactory.makeKeyword("METRICS");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-LILLIPUT-QUERY-METRICS"));
        $kw18$OUTLIER_TIMEOUT = SubLObjectFactory.makeKeyword("OUTLIER-TIMEOUT");
        $sym19$_LILLIPUT_OUTLIER_TIMEOUT_ = SubLObjectFactory.makeSymbol("*LILLIPUT-OUTLIER-TIMEOUT*");
        $kw20$INCREMENTAL = SubLObjectFactory.makeKeyword("INCREMENTAL");
        $kw21$INCLUDE_RESULTS = SubLObjectFactory.makeKeyword("INCLUDE-RESULTS");
        $kw22$RANDOMIZE = SubLObjectFactory.makeKeyword("RANDOMIZE");
        $kw23$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw24$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw25$DIRECTORY = SubLObjectFactory.makeKeyword("DIRECTORY");
        $sym26$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym27$FULL_FILENAME = SubLObjectFactory.makeUninternedSymbol("FULL-FILENAME");
        $sym28$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym29$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym30$LILLIPUT_EXPERIMENT_FULL_FILENAME = SubLObjectFactory.makeSymbol("LILLIPUT-EXPERIMENT-FULL-FILENAME");
        $sym31$RUN_KBQ_EXPERIMENT = SubLObjectFactory.makeSymbol("RUN-KBQ-EXPERIMENT");
        $const32$LilliputQuery_OpenGood = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-OpenGood"));
        $const33$LilliputQuery_OpenNoGood = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-OpenNoGood"));
        $const34$LilliputQuery_ClosedGood = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-ClosedGood"));
        $const35$LilliputQuery_ClosedNoGood = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-ClosedNoGood"));
        $str36$Lilliput_Training = SubLObjectFactory.makeString("Lilliput Training");
        $str37$_0 = SubLObjectFactory.makeString(":0");
        $sym38$BOUND_SYMBOL_P = SubLObjectFactory.makeSymbol("BOUND-SYMBOL-P");
        $str39$____Basic_analysis____ = SubLObjectFactory.makeString("~%~%Basic analysis: ~%");
        $str40$____Answerable____ = SubLObjectFactory.makeString("~%~%Answerable: ~%");
        $str41$____Unanswerable____ = SubLObjectFactory.makeString("~%~%Unanswerable: ~%");
        $str42$____Open_Good___ = SubLObjectFactory.makeString("~%~%Open Good ~%");
        $str43$____Open_No_Good___ = SubLObjectFactory.makeString("~%~%Open No Good ~%");
        $str44$____Closed_Good___ = SubLObjectFactory.makeString("~%~%Closed Good ~%");
        $str45$____Closed_No_Good___ = SubLObjectFactory.makeString("~%~%Closed No Good ~%");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LILLIPUT-OPEN-GOOD-QUERY?"), (SubLObject)SubLObjectFactory.makeSymbol("LILLIPUT-OPEN-NO-GOOD-QUERY?"), (SubLObject)SubLObjectFactory.makeSymbol("LILLIPUT-CLOSED-GOOD-QUERY?"), (SubLObject)SubLObjectFactory.makeSymbol("LILLIPUT-CLOSED-NO-GOOD-QUERY?"));
        $kw47$PLOT_TITLE = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $str48$_ = SubLObjectFactory.makeString(" ");
        $str49$_n = SubLObjectFactory.makeString("\\n");
        $kw50$XLABEL = SubLObjectFactory.makeKeyword("XLABEL");
        $str51$Sorted_Queries = SubLObjectFactory.makeString("Sorted Queries");
        $kw52$YLABEL = SubLObjectFactory.makeKeyword("YLABEL");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASSIFICATION-LABELS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Open Good"), (SubLObject)SubLObjectFactory.makeString("Open No Good"), (SubLObject)SubLObjectFactory.makeString("Closed Good"), (SubLObject)SubLObjectFactory.makeString("Closed No Good")), (SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)lilliput.ONE_INTEGER));
        $str54$____Answerability_analysis____ = SubLObjectFactory.makeString("~%~%Answerability analysis: ~%");
        $str55$Total_____________s__s__s__ = SubLObjectFactory.makeString("Total:           ~s ~s ~s~%");
        $str56$Open_Good_________s__s__s__ = SubLObjectFactory.makeString("Open Good:       ~s ~s ~s~%");
        $str57$Open_No_Good______s__s__s__ = SubLObjectFactory.makeString("Open No Good:    ~s ~s ~s~%");
        $str58$Closed_Good_______s__s__s__ = SubLObjectFactory.makeString("Closed Good:     ~s ~s ~s~%");
        $str59$Closed_No_Good____s__s__s__ = SubLObjectFactory.makeString("Closed No Good:  ~s ~s ~s~%");
        $str60$____Mutually_Answerable____ = SubLObjectFactory.makeString("~%~%Mutually Answerable: ~%");
        $str61$____Mutually_Answerable_Open_Good = SubLObjectFactory.makeString("~%~%Mutually Answerable Open Good: ~%");
        $str62$____Mutually_Answerable_Closed_Go = SubLObjectFactory.makeString("~%~%Mutually Answerable Closed Good: ~%");
        $str63$____Open_Good____ = SubLObjectFactory.makeString("~%~%Open Good: ~%");
        $str64$____Open_No_Good____ = SubLObjectFactory.makeString("~%~%Open No Good: ~%");
        $str65$____Closed_Good____ = SubLObjectFactory.makeString("~%~%Closed Good: ~%");
        $str66$____Closed_No_Good____ = SubLObjectFactory.makeString("~%~%Closed No Good: ~%");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASELINE"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWERABILITY-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $kw69$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $str70$__ = SubLObjectFactory.makeString(": ");
        $str71$_vs__ = SubLObjectFactory.makeString(" vs. ");
        $kw72$BASELINE_KEY_LABEL = SubLObjectFactory.makeKeyword("BASELINE-KEY-LABEL");
        $kw73$EXPERIMENT_KEY_LABEL = SubLObjectFactory.makeKeyword("EXPERIMENT-KEY-LABEL");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEY-LOCATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)lilliput.ONE_INTEGER));
        $sym75$KBQ_MEDIAN_QUERY_RUN = SubLObjectFactory.makeSymbol("KBQ-MEDIAN-QUERY-RUN");
        $str76$ = SubLObjectFactory.makeString("");
        $kw77$ORIGIN = SubLObjectFactory.makeKeyword("ORIGIN");
        $kw78$QUERY_RUNS = SubLObjectFactory.makeKeyword("QUERY-RUNS");
        $str79$Cannot_handle_even_numbers_of_que = SubLObjectFactory.makeString("Cannot handle even numbers of query runs");
        $sym80$KBQ_QUERY_RUN_COMPLETE_TOTAL_TIME = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-COMPLETE-TOTAL-TIME");
        $kw81$ITEM = SubLObjectFactory.makeKeyword("ITEM");
        $float82$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str83$o = SubLObjectFactory.makeString("o");
        $str84$_ = SubLObjectFactory.makeString(".");
        $str85$_ = SubLObjectFactory.makeString("+");
        $str86$x = SubLObjectFactory.makeString("x");
        $sym87$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $str88$could_not_find_any_valid_terms_fo = SubLObjectFactory.makeString("could not find any valid terms for argnum ~s of ~s");
        $str89$got_an_unsorted_query__s = SubLObjectFactory.makeString("got an unsorted query ~s");
        $sym90$CYCL_ATOMIC_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-SENTENCE-P");
        $str91$Expected_only_one_arg_constraint_ = SubLObjectFactory.makeString("Expected only one arg constraint, got ~s");
        $const92$correspondingDomainInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("correspondingDomainInArg"));
        $const93$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $list94 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ARGS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBConstant"))));
        $str95$unhandled___CollectionSubsetFn_do = SubLObjectFactory.makeString("unhandled #$CollectionSubsetFn domain specification");
        $str96$unexpected_domain_type__s = SubLObjectFactory.makeString("unexpected domain type ~s");
        $sym97$_ = SubLObjectFactory.makeSymbol("<");
        $sym98$_ = SubLObjectFactory.makeSymbol("=");
        $sym99$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str100$_ = SubLObjectFactory.makeString("-");
        $const101$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const102$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const103$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $list104 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Training")));
        $list105 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Blind")));
        $sym106$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const107$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const108$nearestIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $const110$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const111$leaveArgPlaceOpenInTestQueries = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("leaveArgPlaceOpenInTestQueries"));
        $const112$TKBConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBConstant"));
        $const113$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym114$NON_TKB_FORT_ = SubLObjectFactory.makeSymbol("NON-TKB-FORT?");
        $str115$g__ = SubLObjectFactory.makeString("g~%");
        $str116$n__ = SubLObjectFactory.makeString("n~%");
        $str117$c = SubLObjectFactory.makeString("c");
        $sym118$_ASS = SubLObjectFactory.makeSymbol("?ASS");
        $const119$assertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSentence"));
        $const120$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $const121$InferenceSentenceParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceSentenceParameter"));
        $sym122$_QUERY = SubLObjectFactory.makeSymbol("?QUERY");
        $sym123$_TYPE = SubLObjectFactory.makeSymbol("?TYPE");
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TYPE"));
        $list125 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LilliputQuery-Training"))));
    }
}

/*

	Total time: 421 ms
	
*/